package creational.abstractFactory.website;

import creational.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("manual tester tests website");
    }
}
