import java.util.Scanner;

public class IT24103885Lab5Q2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of members : ");
        int noOfMembers;
        noOfMembers = scanner.nextInt();

        if(noOfMembers<0){
            System.out.println("inut must be number 0 or geater");
            return;
        }

        String prize;
        switch(noOfMembers){
            case 0:
                prize = "no prize";
                break;
            case 1:
                prize = "pen";
                break;
            case 2:
                prize = "umbrella";
                break;
            case 3:
                prize = "bag";
                break;
            case 4:
                prize = "travelling chair";
                break;
            default:
                prize = "headphone";
                break;
                
        }
        if(noOfMembers==0)
            System.out.println(prize);
        else
            System.out.println("prize is : "+prize);
    }
}

