package com.roahacha.gogame;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    final int port = 12543;

    public static void main(String[] args) {

    }

    private Server() {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server started at socket " + port);
            // TODO: Make more

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
