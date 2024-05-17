package creational.factory;

public class program {
    public static void main(String[] args) {

        DeveloperFactory developerFactory=  createDevelopertBySpecialty("java");
        Developer developer= developerFactory.createDeveloper();
        developer.writeCode();


    }

    static DeveloperFactory createDevelopertBySpecialty(String specialty) {
        if(specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if(specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        }
        else {
            throw new RuntimeException(specialty+" is unknown");
        }
    }
}
