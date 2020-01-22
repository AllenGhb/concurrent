package service.test;

import service.Service;

public class Test {

    public static void main(String[] args) {
        Service service = new Service();
        SemaphoreThreadA threadA = new SemaphoreThreadA(service);
        threadA.setName("A");
        SemaphoreThreadB threadB = new SemaphoreThreadB(service);
        threadB.setName("B");
        SemaphoreThreadC threadC = new SemaphoreThreadC(service);
        threadC.setName("C");
        threadA.start();
        threadC.start();
        threadB.start();
    }

}
