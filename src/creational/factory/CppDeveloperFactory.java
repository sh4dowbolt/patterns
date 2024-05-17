package creational.factory;

public class CppDeveloperFactory implements  DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDevelopper();
    }
}
