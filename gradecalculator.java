import java.util.Scanner;

class gradecalculator{
    static int avg;
    public static void main(String args[]){
        int n;
        int i;
        int marks[] = new int[10];
        int total=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number of subjects");
            n = sc.nextInt();

            for ( i=1; i<=n; i++)
            {
                System.out.print("enter the marks of "+i+ " subject :");
                marks[i] = sc.nextInt();
                total= total +marks[i];
            }
        }
        
        // System.out.println("enter student name");
        // String name=sc.next();
        // System.out.println("enter student usn:");
        // String usn= sc.next();

        System.out.println(" -------------------------------");
        System.out.println("| Total marks | Avarage | Grade |");
        System.out.println(" -------------------------------");
        System.out.print("|     ");
        System.out.print(total);
        System.out.print("     |    ");
        System.out.print(average(total,n));
        System.out.print("   |   ");
        System.out.print(grade(avg));
        System.out.println("  |");
        System.out.println("--------------------------------");



    }
    
    // function to calculate the average
    static int average(int a, int n){
        
        avg= a/n;
        return avg;
    }

    // funtion to assign the grade
    static String grade(int x){
        if(x>=90)
        return "A";
        else if(x>=80)
        return "B";
        else if(x>=70)
        return "C";
        else if(x>=60)
        return "D";
        else 
        return "F";
    }

}