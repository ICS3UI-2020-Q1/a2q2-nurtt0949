import java.util.Scanner;

/**
 *This program shows the greater number
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a Scanner for user input
   Scanner input = new Scanner(System.in);

  //ask user to chose an integer
  System.out.println("Enter an integer");

  //get integer from user
  int integer1 = input.nextInt();
  
   //ask user to chose another integer
  System.out.println("Enter another integer");

  //get integer from user
  int integer2 = input.nextInt();

  //calculate the greater number
  if(integer1 > integer2){
  
  //tell the user the greater number
  System.out.println("The greater number is " + integer1);

 } else if (integer2 > integer1){ 

  //tell user the greater number
  System.out.println("The greater number is " + integer2);

 }
  //if user chose the same number
  if(integer1 == integer2){

  //tell them that both numbers are equall
  System.out.println("There is no bigger number");
  
  
  

  


   
  

  
  
  } 
  }
}
