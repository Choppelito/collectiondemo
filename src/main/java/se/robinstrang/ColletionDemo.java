package se.robinstrang;

import java.util.ArrayList;

public class ColletionDemo {
    public void Run(){

        ArrayList<Integer> players = new ArrayList();

        String [] players3 = new String[5];
        //var players = new ArrayList<String>()
        ArrayList<String> players2 = new ArrayList();

        while (true){
            System.out.println("1. Skapa ny spelare");
            System.out.println("2. Lista alla");
            System.out.println("3. Ta bort");
            System.out.println("4. Exit");
            int sel = Integer.parseInt.(System.console().readLine());

            if (sel == 4){

            }
        }

        int [] talen = {123,456,789,100};
        int largest = talen[0];

        for (int tal: talen){
            if (tal > largest){
                largest = tal;
            }
        }
        System.out.println("Största är: " + largest);

        String mening = "hej hopp sss";

        String [] children2 = {"Marvin","Charlie","Hoppsan"};

        String [] children = new String [3];
        children[0]="Marvin";
        children[1]="Charlie";
        children[2]="Hoppsan";

        for(String oneChild : children){
            System.out.println(oneChild);
        }

        for (int index=0;index<children.length;index++){
            System.out.println(children[index]);    
        }
        //
        System.out.println(children[0]);
        System.out.println(children[1]);
        System.out.println(children[2]);
    }
}
