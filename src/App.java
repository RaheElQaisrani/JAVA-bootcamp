//importing java.itil so we may be able to take user input from terminal
import java.util.*; 

public class App {
    
    }
    /**
     * printCurrentJava
     */
    //Q1 printing current version of JAVA in terminal
    class printCurrentJava {
    public static void main(String[] args) {
        System.out.println("this is the java version this machine is running "+Runtime.version());
    }    
    }
    /**
     * looping
     */
    //Q2 looping through a value to print its first 10 multiples
     class looping {
        public static void main(String[] args) throws Exception {
        int num = -10;

        for (int i = 1; i <=10; i++) {
            System.out.println(num*i);
        }
        }
        
    }
    /**
     * InnerApp
     */
    //Q3 writing a function to add 2 number 
    class SumofTwo {
        public static void main(String[] args) {
            //using Scanner from util to take user input from scanner
            Scanner sc =new Scanner(System.in);
            System.out.println("enter the first number");
            //taking a value from user
            int a =sc.nextInt();
            System.out.println("enter the second number");
            int b = sc.nextInt();
            //closing the scanner to remove leak warning
            sc.close();
            //calling the function and passing it the values given by user
           int result=add(a,b);
           System.out.println(result);
        }
        //defing a method that takes 2 int and returns there sum
       static int add(int a,int b) {
            return a+b;
         }
            
    }
    /**
     * InnerApp
     */
    //QC1 making a Weather Adiser that takes temperature and rain input to give recomadation 
     class WeatherAdviser {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //initlizing valiables so we may change there value based on user's response
            int Temp;
            Boolean rain=null;
            //using while true which will run infinitly until the break condition meets
            while (true) {
                 System.out.println("Please enter the current temperature in Celsius:");
                 //checking if the entered value is interger if it is let it = to temp and break
                 if(sc.hasNextInt()){
                    Temp = sc.nextInt();
                    break;
                 }
                 //if its not int run the else and keep the loop running
                 else{
                    System.out.println("please enter a valid Number");
                    //discarding the input that was not integer
                    sc.next();
                 }
            } 
            //cleaning the sc so the it doesnt create problem from out next sc value
            sc.nextLine();
            //until yes or no are selected rain will be equal to null and the loop will keep asking users to enter the right input
                       while ( rain==null){
                System.out.println("is it raining");
                //using lower case function so all possible yes or No will be accepted as the input
                String r =sc.nextLine().toLowerCase();
        //The == operator checks whether two string references point to the exact same object in memory, 
        //so we are use .equals method as == was creating problem for us 
          if (r.equals("yes")){
            rain =true;
          }
          else if (r.equals("no" )){
            rain =false;
          }
          else {
            System.out.println("Please answer with Yes or No");
          }
        }
        sc.close();
            //calling the weather function and passing it Temp and rain values
            weather(Temp,rain);
            //taking the weather's return value and making it equal to result
            String result =weather(Temp,rain);
            System.out.println(result);
            
        }
        static String weather(int a, boolean b) {
            //initilizing strings for rainAdvive and TempAdvice 
            String rainAdvice;
            String tempAdvice;
            if (b==true) {
                //if raining it will give this adive
              rainAdvice= " Please take an umbrella with you";
            }
            else{
                //if not true let rainAdvice be an empty string
               rainAdvice="";
            }
            //taking Temperature advice and comparing it give the approprate reply 
            if (a>30) {
                tempAdvice="wear light clothing";
                
            }
            else if (a>=20 || a==30) {
                tempAdvice= "wear a regular outfit";
            }
            else if (a>=10 || a==20) {
                tempAdvice= "wear a jacket.";
            }
            //if its no of the above it will definitly be bellow 10 hence not saying it expelicitly
            else  {
                tempAdvice="wear a very heavy jecket";
            }
            
            
           //returning the combined advice of tempeature and rain advice in the along with recomandation text

            return "Recommendation:"+ tempAdvice+rainAdvice;
        }
    
        
    }
    

