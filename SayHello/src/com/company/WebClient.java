package com.company;

import java.io.IOException;
import java.net.Socket;

public class WebClient {

    public static void main(String[] args) throws IOException {
        Socket client = new Socket("0.0.0.0",80);
        System.out.println("Client connected - " + client.isConnected());
    }
}
