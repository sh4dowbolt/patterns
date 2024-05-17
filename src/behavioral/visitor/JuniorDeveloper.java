package behavioral.visitor;

public class JuniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("writing poor class");
    }

    @Override
    public void create(Database database) {
        System.out.println("drop database");
    }

    @Override
    public void create(Test test) {
        System.out.println("creating not reliable test");
    }
}
