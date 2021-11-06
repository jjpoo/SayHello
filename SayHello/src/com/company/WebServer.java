package com.company;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(80);
        System.out.println("server has started on host: " + serverSocket.getInetAddress().getHostName() + " " + "port: " + serverSocket.getLocalPort() );
        Socket client = serverSocket.accept();
        System.out.println("Client connected to the port: " + client.getLocalPort());
    }
}
