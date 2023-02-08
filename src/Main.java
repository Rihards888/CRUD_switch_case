import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    ArrayList<String> todos = new ArrayList<>();

    //crud

    //create metode
    public void create(String todo) {
        todos.add(todo);
    }

    //read metode
    public void read(){
        for (String todo : todos){
            System.out.println(todos);
        }
    }

    //updait

    public void update (int index, String newTodo){
        todos.set(index, newTodo);
    }

//delete
    public void delete(int index){
        todos.remove(index);
    }


    public static void main(String[] args) {

    Main main = new Main();

    main.create("kaķis");
    main.create("suns");
    main.create("ffff");

    main.update(0, "jenots");

//    main.delete(0);

    main.read();








    }
}