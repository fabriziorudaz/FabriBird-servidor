package com.maximo.flappybird.network;

import java.net.InetAddress;

public class PlayerConnection {

    public InetAddress address;   // IP del jugador
    public int port;                // Puerto del cliente

    public boolean alive = true;  // esta vivo?
    public int y = 300;             // posicion en y
    public int score = 0;           //puntuacion


    public String color;            // "BLUE" o "RED" (para diferenciarlos)


    public PlayerConnection(InetAddress address, int port, String color) {
        this.address = address;
        this.port = port;
        this.color = color;
    }
}
