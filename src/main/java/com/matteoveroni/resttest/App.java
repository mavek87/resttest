package com.matteoveroni.resttest;

import io.javalin.Javalin;

public class App {
    public static void main(String[] args) {
        new App().start(args);
    }

    private void start(String... args) {
        Javalin app = Javalin.create().start(7000);
        app.get("/", ctx -> ctx.result("Hello World from server " + args[0]));
    }
}
