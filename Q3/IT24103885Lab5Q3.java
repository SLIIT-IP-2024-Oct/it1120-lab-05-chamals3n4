import java.util.Scanner;

public class IT24103885Lab5Q3 {

    //discount percentages
    public static final int discountOne = 10;
    public static final int discountTwo = 20;
    public static final int ROOMPERDAY = 48000;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int startDate,endDate,reservedDate,discountRate;
        double total;

        System.out.println("enter start date(1-31) : ");
        startDate = scanner.nextInt();
        System.out.println("enter end date(1-31) : ");
        endDate = scanner.nextInt();
        
        if(startDate<1 || startDate>31 || endDate<1 || endDate>31){
            System.out.println("Days must between 1 and 31");
            return;
        }
        if(startDate>endDate){
            System.out.println("Sart date must less thn End date");
            return;
        }

        reservedDate = endDate-startDate;
        if(reservedDate<3)
            discountRate = 0;
        else if(reservedDate>=3 || reservedDate<5)
            discountRate=discountOne;
        else
            discountRate=discountTwo;

        //total calculation
        total = (ROOMPERDAY * reservedDate) - ((ROOMPERDAY * reservedDate * discountRate) / 100);
        System.out.println("room charge per day : " + ROOMPERDAY);
        System.out.println("number of days reserved : " + reservedDate);
        System.out.println("total amount to be paid : " + total);

    } 
}
