import java.util.*;

import controller.Controller;
import model.Toy;
import java.io.FileWriter;

public class program {
    public static void main(String[] args) {
        Controller controller = new Controller();

        Integer toyPeriodicity1 = 10;
        Integer toyPeriodicity2 = 70;
        Integer toyPeriodicity3 = 20;

        Integer amountOfToy1 = 2;
        Integer amountOfToy2 = 3;
        Integer amountOfToy3 = 5;

        PriorityQueue<Toy> pq = new PriorityQueue<Toy>();

        for (int i = 0; i < amountOfToy1; i++) {
            Random r = new Random();
            pq.add(controller.createToy(1, "Barbie", 100 - (r.nextInt(toyPeriodicity1) + 1)));
        }

        for (int i = 0; i < amountOfToy2; i++) {
            Random r = new Random();
            pq.add(controller.createToy(2, "OptimusPrime", 100 - (r.nextInt(toyPeriodicity2) + 1)));
        }

        for (int i = 0; i < amountOfToy3; i++) {
            Random r = new Random();
            pq.add(controller.createToy(3, "AngryBird", 100 - (r.nextInt(toyPeriodicity3) + 1)));
        }

        System.out.println("List of all toys: " + pq);

        lottery(pq);

    }

    static void lottery(PriorityQueue<Toy> pq) {
        ArrayList<Toy> prizeList = new ArrayList<>();
        while (pq.size() > 0) {
            Toy currentPrize = pq.peek();
            prizeList.add(currentPrize);
            System.out.println("Your prize is " + pq.poll());
            
        } 
        System.out.println("Vending machine is empty, try tommorow");

        
        try (FileWriter writer = new FileWriter("prizeList.txt")) {
            for (Toy toy: prizeList) {
                writer.append(toy.toString());
                writer.append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
