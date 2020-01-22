package service.test;

import service.Service;

public class SemaphoreThreadA extends Thread {

    private Service service;

    public SemaphoreThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
