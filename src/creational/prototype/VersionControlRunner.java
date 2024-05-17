package creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1,
                "SuperProject", "SourceCode sourceCode " +
                "= new SourceCode();");
        System.out.println(master);

        Project masterClone = master.copy();
        System.out.println(masterClone);
        //////////////////
        ProjectFactory factory= new ProjectFactory(master);
        Project newProject= factory.cloneProject();

        VersionControlRunner versionControlRunner=new VersionControlRunner();

    }
}
