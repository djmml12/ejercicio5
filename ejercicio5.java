
import java.util.Scanner;
public class ejercicio5{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("ingresar la cantidad de edades ");
        int ages = s.nextInt();
        int counter = 0;
        int male = 0;
        int female = 0;
        while (counter < ages){
            s.nextLine();
            System.out.print("ingresar el sexo ");
            String gender = s.nextLine();
            System.out.print("ingresar la edad ");
            int age = s.nextInt();
            if (gender.equals("H") && age <18){
                male++;
            }else if(gender.equals("M") && (age>=18)){
                female++;
            }
            counter++;

        }
        System.out.println(" cantidad de hombres menores de edad "+male);
                System.out.print("Number of female of legal age: "+female);
    }
}