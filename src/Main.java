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


    Scanner scanner = new Scanner(System.in);



        System.out.println("ko tu vēlies darīt? C = create, R = read, U = update, D = delete");

        String usr_choice = scanner.nextLine();

        switch (usr_choice){
            case "C":
                System.out.print("Ievadi todo: ");
                String usr_todo = scanner.nextLine();
                main.create(usr_todo);
                System.out.println("Tika izveidots jauns Todo!");
                break;
            case "R":
                main.read();
                break;
            case "U":
                System.out.print("Ko tu vēlies mainīt, norādi index?");
                int todo_index = scanner.nextInt();
                System.out.print("Ievadi jauno todo: ");
                String todo_new = scanner.nextLine();
                main.update(todo_index, todo_new);
                System.out.println("Todo tika izmainīts");
                break;
            case "D":
                System.out.print("Ko tu vēlies dzēst?");
                int which_one = scanner.nextInt();
                main.delete(which_one);
                System.out.println("Todo tika izdzēsts.");
                break;
        }










    }
}
