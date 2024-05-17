package behavioral.iterator;

public class JavaDeveloperRunner {

    public static void main(String[] args) {

        String [] skills = {"java", "spring", "hibernate", "maven"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Vitaly", skills);

        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Developer: "+javaDeveloper.getName());

        while(iterator.hasNext()) {
            System.out.print(iterator.next().toString()+" ");
        }


    }
}
