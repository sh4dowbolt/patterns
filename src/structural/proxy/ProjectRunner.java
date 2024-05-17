package structural.proxy;

public class ProjectRunner {

    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/users/sh4dowbolt");
        project.run();
    }
}
