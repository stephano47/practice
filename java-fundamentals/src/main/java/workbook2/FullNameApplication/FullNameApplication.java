package workbook2.FullNameApplication;
import java.util.*;
public class FullNameApplication {
    public static void main(String []args){
        String FirstName = PromptForString("First Name: ");

        String MiddleName = PromptForString("Middle Name: ");
        String LastName = PromptForString("Last Name: ");
        String Suffix = PromptForString("Suffix ");

        String FullName;

        FullName = FirstName + MiddleName + LastName + Suffix;
        if(MiddleName.isBlank()){
            if(Suffix.isBlank()){
                FullName = FirstName + " " + LastName;
            }
            else{
                FullName = FirstName + " " + LastName + ", " + Suffix;
            }
        }
        else{
            if(Suffix.isBlank()){
                FullName = FirstName + " " + MiddleName + " " + LastName;
            }
            else
            {
                FullName = FirstName + " " + MiddleName + " " + LastName + ", " + Suffix;
            }
        }

        System.out.println("Hello " + FullName);
    }
    public static String PromptForString(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();


    }
}
