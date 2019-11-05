package com.example.empresa_cliente;

public class Cliente {
    int codCliente;
    String nombre, apellidos;
    boolean VIP;

    public Cliente(int codCliente, String nombre, String apellidos, boolean VIP) {
        this.codCliente = codCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.VIP = VIP;
    }

    boolean isVIP() {
        return VIP;
    }

    @Override
    public String toString() {
        return apellidos + ", " + nombre;
    }
}
