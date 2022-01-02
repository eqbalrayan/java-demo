import java.util.*;
class Test{

   static boolean isEven(int num){
        if((num & 1 )%10==0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String args[]){

      try( Scanner sc = new Scanner(System.in)
      ){

        System.out.println("Enter A Number ");

        int num =sc.nextInt();
        String number = Test.isEven(num) ? "Even Number" : "Odd Number";

        System.out.println(number);

      }catch(Exception e){

        System.out.println(e);

      }
       

        

       
        


    }
}