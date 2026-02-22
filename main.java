import java.util.Scanner;

public  class main{
    static double balance = 1000 ; //example value
    public static void main(String[] args){
        
        System.out.println("BANK PROJECT");
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do{
            System.out.println("Choose one of the options \n 1.Show Balance \n 2.Transfer \n 3.Deposite \n 4.Exit ");
            option = scanner.nextInt();
            switch (option) {
            case 1 : {
                show();
                continue;
            }
            case 2 : {
                System.out.print("How much: ");
                double value = scanner.nextDouble();
                transfer(value);
                continue;
            }
            case 3 : {
                System.out.print("How much: ");
                double value = scanner.nextDouble();
                deposite(value);
                continue;
            }
            case 4 : break;
        }
        } while(option != 4);
        

    }

    static void show(){
        System.out.println(balance);
    }
    static void deposite(double value){
        balance += value;
        System.out.println(balance);
 
    }
    static void transfer(double value){
        balance -= value;
        System.out.println(balance);
    }
}