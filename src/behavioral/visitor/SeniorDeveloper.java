package behavioral.visitor;

public class SeniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("rewriging juniors class");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fixing db");
    }

    @Override
    public void create(Test test) {
        System.out.println("creating reliable test");
    }
}
