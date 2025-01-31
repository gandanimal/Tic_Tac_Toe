# Tic Tac Toe

This is a Java implementation of the Tic Tac Toe game using Java RMI.

It is composed of three modules:

 - [interface](interface/) - defines the remove interface of the game's server
 - [server](server/) - implementation of the game's service
 - [client](client/) - client that remotely invokes the service

See the README.md for each module.
Start by looking at the interface, then go to server, and finally go to the client.

----

[SD Faculty](mailto:leic-sod@disciplinas.tecnico.ulisboa.pt)


RESUMO FUNCIONALIDADE

A funcionalidade pedida foi totalmente implementada.
A interface deve executar com o seguinte comando:
mvn install
O servidor deve executar com o seguinte comando:
mvn install exec:java
O cliente deve executar com o seguinte comando:
mvn compile exec:java