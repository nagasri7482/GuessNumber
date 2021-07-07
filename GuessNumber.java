import java.util.Scanner;
import java.util.Random;

class GuessNumber{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        do{
            int user = userNumber();
            int cpu = cpuNumber();

            boolean flag = checker(user,cpu);
            if(flag == true){
                System.out.print("You Won :)");                            
            }
            else{
                System.out.println("You lost :(");   
            } 
            s = userChoice();
        }while(s.equalsIgnoreCase("a"));    
                         
    }

    public static int userNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between (1-100):");
        int u = sc.nextInt();
        if(u>=1 && u<=100){            
            return u;        
        }
        else{
            u = userNumber();
            return u;
        }
    }

    public static int cpuNumber(){
        Random rand = new Random();
        int r = rand.nextInt(100);
        System.out.println(r);
        return r;
    }

    public static boolean checker(int u,int r){        
        if(u == r){
           return true;            
        }
        else{
            return false;
        }       
    }

    static String userChoice(){
        Scanner sc =new Scanner(System.in);
        System.out.println("\nDo you Want to:\na)Play again\t b)Exit game");
        System.out.println("Choose either a or b->");
        String choice = sc.next();

        if(choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("b")){
            return choice;
        }
        else{
            return "";
        }
    }
}