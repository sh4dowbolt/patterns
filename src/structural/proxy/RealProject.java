package structural.proxy;

public class RealProject implements  Project{

    public String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("loading project from "+url+".....");
    }
    @Override
    public void run() {

    }
}
