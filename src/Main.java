import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {

        double amount = 0.0;
        double sum = 0.0;
        int count = 1;

        List list = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        int menu = 0;
        System.out.println("Book Store");
        System.out.println();
        System.out.println("1. Buy book");
        System.out.println("2. Receipt");
        System.out.println("3. Receive Payment");
        System.out.println("4. Exit");

        boolean quit = false;
        do {
            if (count > 5){
                System.out.println("You cannot buy more than 5 books at a time");
            }
            System.out.print("Please enter you choisce:");

            menu = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            switch (menu){
                case 1:
                    count ++;
                    System.out.println("Book Title:");
                    String booktitle = scanner.nextLine();
                    System.out.println("Author:");
                    String auth = scanner.nextLine();
                    System.out.println("ISBN:");
                    int no = scanner.nextInt();
                    System.out.println("Price:");
                    double p = scanner.nextDouble();
                    System.out.println("Discount:");
                    double dis = scanner.nextDouble();
                    double total = p - (dis * p)/100;
                    list.add(new Books(booktitle,auth,no,p,dis,total));
                    break;
                case 2:
                    System.out.println("Title Author ISBN Price Discount Total");
                    for (Iterator it = list.iterator();
                         it.hasNext();) {
                        Books s = (Books) it.next();
                        System.out.println(s.getTitle() + " " + s.getAuthor() + " " +
                                s.getIsbm() + " " + s.getPrice() +
                                " " + s.getDiscount() + " " + s.getTotal());
                        sum += s.getTotal();
                    }
                    System.out.println("Total=" + sum);
                    break;
                case 3:
                    System.out.println("Customer Pays:");
                    amount = scanner.nextDouble();
                    double balance = amount - sum;
                    System.out.println("Balance is:" + balance);
                    quit = true;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid Entry!");
            }

            } while (!quit);


    }
}