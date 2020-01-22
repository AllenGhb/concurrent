package service.test;

import service.Service;

public class SemaphoreThreadC extends Thread {

    private Service service;

    public SemaphoreThreadC(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
