package service.test;

import service.Service;

public class SemaphoreThreadB extends Thread {

    private Service service;

    public SemaphoreThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
