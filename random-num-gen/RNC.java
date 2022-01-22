import java.util.*;
public class RNC
{ 
   public static Scanner kb=new Scanner(System.in);
   public static Random r = new Random();
   public static int [] arr = new int [100];
   public static int CONSTANT = 100;
   
  public static void main(String[]args)
  {      
      DisplayMenu();
  }
  
  public static int GenerateRandomValue(int min, int max){
      int a = 0;
      int num1 = 0;
       int num2 = 0;
    if(((min == 0) & (max == 0))){  
      System.out.println("Enter minimum value");
         num1 =kb.nextInt();
   
      System.out.println("Enter maximum value");
         num2 =kb.nextInt();
         
         min = num1;
         max = num2;
    }                
          if(min > max){
            System.out.println("Min value should be lower than max value!!!");
          }
          else{
               a = (r.nextInt(max - min) +min);           
          }
        
      return a;
  }
  
  public static void DisplayMenu(){
   System.out.println("########################################################");
   System.out.println("#\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t #");System.out.println("#\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t #");
   System.out.println("#\t\t\tRandom Number Calculator & Generator\t\t\t #");System.out.println("#\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t #");
   System.out.println("#\t\t\tBy: Dolph Wandie |\tGithub:@Skaramba\t\t\t #");System.out.println("#\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t #");
   System.out.println("########################################################");
   System.out.println();
   System.out.println();
   
   System.out.println("1. Generate and display one random number");
   System.out.println("2. Generate 100 random numbers between 1-10 and store in array");
   System.out.println("3. Determine the average value of the 100 random numbers");
   System.out.println("4. Determine the minimum value of the 100 random numbers");
   System.out.println("5. Display graph");
   System.out.println("6. Exit");
      
      System.out.println("Enter option value above");
         int op =kb.nextInt();

      if(op == 1){
         
         int rn = GenerateRandomValue(0, 0);
            System.out.println(rn);
         Ask();
      } 
      else if(op == 2){
         // int arr [] = new int[100];
         Generate100RandomValues (arr, CONSTANT);
      }
      else if(op == 3){
         // int arr [] = new int[100];
        float res = ArrayAverage(arr, CONSTANT);
         System.out.println(res);
            Ask();
      }
      else if(op == 4){
         int m = ArrayMin ( arr, CONSTANT);
            System.out.println(m);
               Ask();
      }
      else if(op == 5){
         DisplayGraph (arr, CONSTANT);
               }
      else if(op == 6){
         EndProgram();
      }
      else{
         System.err.println("Invalid Option. \n\n Choose again\n");
         DisplayMenu();
      }
      
  }
  
  static void Ask(){
         System.out.println("\nContinue...\t Y/N");
         kb.nextLine();
         String c = kb.nextLine();
         if(c.charAt(0) == 'Y' || c.charAt(0) == 'y'){
            DisplayMenu();
         }
         else{
            EndProgram();
         }
   }
       
   static void EndProgram(){
      System.out.println("\nThank You for using the random number calculator.");
            System.exit(0);
   }

  
  public static void Generate100RandomValues ( int array [ ], int size ){
      int i = 0;
     do{      
      int rn = GenerateRandomValue(1, 10);
      array[i] = rn;
      arr[i] = array[i];
         i++;
     }
     while(i < size);
     System.out.println("\nHundred random values were generated and stored");
     Ask();
  }
  
  public static float ArrayAverage ( int array [ ], int size){
   float av = 0;
   int sum = 0;
   for(int i = 0; i< size; i++){
      sum = sum + array[i];
   }
   av = sum/size;
   
      return av;
  }
  
  public static int ArrayMin ( int array [ ], int size){
   int min = 0;
   for(int i = 0; i < size; i++)
   {  
      for(int n = 0; n < size; n++)
      { 
         if(array[i]<array[n])
         { 
               int temp;
            temp=array[i];
            array[i]=array[n];
            array[n]=temp;
         }
      }
    }

      min = array[0];
   
   return min;
  }
  
  public static void DisplayGraph ( int array [ ], int size){

       int [] count = new int [10];
   for(int i = 0; i < 10; i++)
   {  
         int temp = 0;
      for(int n = 0; n < size; n++)
      { 
         if(array[i] == array[n])
         { 
            temp++;
         }
      }  
         count[i] = temp;
    }
           System.out.println("Frequency of each number between 1 and 10");
    System.out.println("------------------------------------------------------");

    for(int x = 0; x < count.length; x++){
         System.out.print((x+1) +" \t\t |");
      for(int y = 0; y < count[x]; y++){
         System.out.print("*");
      }
         System.out.println();
    }
      System.out.println("------------------------------------------------------");
      Ask();
  }
 }