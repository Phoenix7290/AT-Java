package org.example.AT.Exercise05;

public class Exercise {
    public static void main(String[] args) {
        String response = "Content-Type: text/html" +
                "\n" +
                "\n <html>" +
                "\n <head><title>Saudação CGI</title></head>" +
                "\n <body>" +
                "\n <h1>Olá, Terráqueos!</h1>" +
                "\n </body>" +
                "\n </html>";

        System.out.println(response);
    }
}
