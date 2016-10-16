package model;

/**
 * Created by lost on 16.10.2016.
 */
public class Session implements Runnable {
    User user;

    public Session() {
    }

    public Session(User user) {
        this.user = user;
    }

    @Override
    public void run() {
    }

    public void pause() {
    }

    public void close() {
    }
}
