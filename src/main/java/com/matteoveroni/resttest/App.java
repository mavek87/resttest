package com.matteoveroni.resttest;

import io.javalin.Javalin;
import java.util.UUID;

/**
 * Simple REST webapp
 */
public class App {
    public static void main(String[] args) {
        new App().start();
    }
3
    private void start() {
        UUID serverId = UUID.randomUUID();
        Javalin app = Javalin.create().start(7000);
        app.get("/", ctx -> ctx.result("Hello World from server " + serverId));
    }
}
