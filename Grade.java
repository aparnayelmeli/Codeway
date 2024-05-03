import java.util.*;
public class Grade {
  public static void main(String[] args) {
    int size,total=0;
        float avg;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter number of Subject:");
       size = scanner.nextInt();
       int marks[]= new int[size];
       for(int i=0;i<size;i++)
       {
          System.out.print("Enter marks of Subject "+(i+1)+" ");
          marks[i]=scanner.nextInt();
       }
       for(int i=0;i<size;i++)
       {
          total+=marks[i];
       }
       System.out.println("Total marks:"+total); 
       avg=total/size;
       System.out.println("Average grade is: "+avg+"%");
       if (avg>=85|| avg<=100) 
         {
             System.out.println("Grade O");
         }
        else if(avg>=75||avg<85)
        {
            System.out.println("Grade A");
        }
        else if(avg>=60||avg<75)
        {
          System.out.println("Grade B");
        }else if(avg>=40||avg<60)
        {
          System.out.println("Grade C");
        }
        else
        {
          System.out.println("Fail");
        }
       scanner.close();
  }  
}
