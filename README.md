# Interprocess-Communication
Operating System Group Project 1

Question 1:
During the Sockets lecture, specific port numbers were identified as well-known ports that offer standard services. For example, port 17 is referred to as the quote-of-the-day service, where a server responds with a quote for that day when a client connects to it. The task is to modify the date server shown in Figure 1 to deliver a quote of the day instead of the current date. The quotes must be ASCII characters that are printable and contain less than 512 characters, although multiple lines are permitted. Since well-known ports are reserved and unavailable, the server should listen to port 6017. The date client can be utilized to read the quotes sent by the server.


Question 2:
An echo server is a server that repeats whatever it receives from a client. For example, if the client sends the server the string "Hello there! I am the client," the server will respond with "Hello there! I am the server." To create an echo server, you may use the Java networking API. The server will wait for a client connection using the accept() method. Upon receiving a client connection, the server will loop and follow these steps:

Read the data from the socket into a buffer.

Send the contents of the buffer back to the client.

The server will only exit the loop when it has determined that the client has closed the connection.
