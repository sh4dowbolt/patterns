package structural.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaToDatabase();

        dataBase.insert();
        dataBase.remove();
        dataBase.select();
        dataBase.update();
    }
}
