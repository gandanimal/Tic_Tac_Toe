package example.grpc.client;

import java.util.Scanner;
import example.grpc.Grpc;
import example.grpc.TTTServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Game {
	private static TTTServiceGrpc.TTTServiceBlockingStub stub;
	Scanner keyboardSc;
	int winner = 0;
	int player = 1;

	public Game() {
		keyboardSc = new Scanner(System.in);
	}

	public int readPlay() {
		int play;
		do {
			System.out.printf(
					"\nPlayer %d, please enter the number of the square "
							+ "where you want to place your %c (or 0 to refresh the board): \n",
					player, (player == 1) ? 'X' : 'O');
			play = keyboardSc.nextInt();
		} while (play > 10 || play < 0);
		return play;
	}

	public void playGame() {
		int play = 0;
		boolean playAccepted;

		do {
			player = ++player % 2;
			do {
				System.out.println(stub.currentBoard(Grpc.currentBoardRequest.getDefaultInstance()).getDefaultInstanceForType());
				play = readPlay();


				if (play != 0) {
					if(play == 10) {
						playAccepted = true;
						Grpc.playRequest request = Grpc.playRequest.newBuilder().setRow(4).setColumn(4).setPlayer(player).build();
					}
					else{
					Grpc.playRequest request = Grpc.playRequest.newBuilder().setRow(--play/3).setColumn(play % 3).setPlayer(player).build();
					playAccepted = stub.play(request).getPlay();
					}
					if (!playAccepted)
						System.out.println("Invalid play! Try again.");
				} else
					playAccepted = false;
			} while (!playAccepted);
			if(play == 10){
				winner = 3;
			}
			else{
				winner = stub.checkWinner(Grpc.checkWinnerRequest.getDefaultInstance()).getCheckWinner();
			}

		} while (winner == -1);
	}

	public void congratulate() {
		if(winner == 3){
			System.out.printf("\nRestarting|n");
			Game g = new Game();
			g.playGame();
			g.congratulate();
		}
		if (winner == 2)
			System.out.printf("\nHow boring, it is a draw\n");
		else
			System.out.printf("\nCongratulations, player %d, YOU ARE THE WINNER!\n", winner);
	}

	public static void main(String[] args) {
		
		final ManagedChannel channel = ManagedChannelBuilder.forTarget("127.0.0.1:8080").usePlaintext().build();
		stub = TTTServiceGrpc.newBlockingStub(channel);
		Game g = new Game();
		g.playGame();
		g.congratulate();
		
		channel.shutdown();
	}
}
