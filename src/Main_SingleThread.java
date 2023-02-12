
import java.util.Scanner;

public class Main_SingleThread{
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int menu1, menu2, menu3;
        int hotdogCount = 0, hamburgersCount = 0, chickenCount = 0, friesCount = 0, drinkCount = 0;

        Robot_SingleThread task1, task2, task3, task4, task5;

        System.out.println("Cheoun-sun");
        System.out.println("==========");
        System.out.println("1. Order");
        System.out.println("2. Exit");

        menu1 = s.nextInt();

        if(menu1 == 1){
            do{
                System.out.println("Choose the menu");
                System.out.println("---------------");
                System.out.println("1. Package A: Hotdog + French Fries + Drink");
                System.out.println("2. Package B: Hamburger + French Fries + Drink");
                System.out.println("3. Package C: Fried Chicken + French Fries + Drink");
    
                menu2 = s.nextInt();
                
                switch (menu2) {
                    case 1:
                        hotdogCount++;
                        friesCount++;
                        drinkCount++;
                    break;
                
                    case 2:
                        hamburgersCount++;
                        friesCount++;
                        drinkCount++;
                        break;
    
                    case 3:
                        chickenCount++;
                        friesCount++;
                        drinkCount++;
                        break;
                }
    
                System.out.println("Is there anything else?");
                System.out.println("1. Yes");
                System.out.println("2. No");
    
                menu3 = s.nextInt();
            }while(menu3 != 2);

                task1 = new Robot_SingleThread();
                task1.setMenu("Hotdog");
                task1.setQty(hotdogCount);

                task2 = new Robot_SingleThread();
                task2.setMenu("Hamburgers");
                task2.setQty(hamburgersCount);
                
                task3 = new Robot_SingleThread();
                task3.setMenu("Fried Chicken");
                task3.setQty(chickenCount);
                
                task4 = new Robot_SingleThread();
                task4.setMenu("French Fries");
                task4.setQty(friesCount);
                
                task5 = new Robot_SingleThread();
                task5.setMenu("Drink");
                task5.setQty(drinkCount);

                long start = System.currentTimeMillis();
        
                task1.start();
                task2.start();
                task3.start();
                task4.start();
                task5.start();

                long end = System.currentTimeMillis();

                System.out.println("Process Time: " + (end-start)/1000F + " seconds");
                System.out.println("All orders ready, hope you enjoy the food!");
        }else System.out.println("System off");
        s.close();
    }
}