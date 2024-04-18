import java.util.Scanner;

public class safeinput {

    public static String getRegExString(Scanner pipe, String prompt, String regEx){

        String userInput = "";

        while(true){
            System.out.println(prompt);
            userInput = pipe.nextLine();
            if(userInput.matches(regEx)){

                return userInput;

            }
            else{
                System.out.println("Incorrect Input");
            }

        }


    }


    public static boolean getYN(Scanner pipe, String prompt){
        boolean retYN = false;
        String YN = "";
       while(true){
            System.out.println(prompt);
            YN = pipe.next();
            if(YN.equalsIgnoreCase("Y")){
                return retYN = true;

            } else if (YN.equalsIgnoreCase("N")) {
                return retYN = false;

            }else{
                System.out.println("incorrect input try again");
            }
        }


    }

    public static int getInt(Scanner pipe, String prompt){
        int retInt = 0;
        String trash = "";
        while(true){
            System.out.println(prompt);
            if(pipe.hasNextInt()){
                retInt = pipe.nextInt();
                System.out.println();
                return retInt;
            }else{
                trash = pipe.nextLine();
                System.out.println("incorrect type try again");
            }
        }


    }

    public static int getIntRange(Scanner pipe, String prompt,  int low, int high){
        int retInt = 0;

        String trash = "";
        while(true){
            System.out.println(prompt);
            if(pipe.hasNextInt()){
                retInt = pipe.nextInt();
                if(retInt >= low && retInt <= high){
                    System.out.println();
                    return retInt;
                }
            }else{
                trash = pipe.nextLine();
                System.out.println("incorrect type try again");
            }
        }


    }

    public static double getDoubleRange(Scanner pipe, String prompt,  double low, double high){
        double retInt = 0;

        String trash = "";
        while(true){
            System.out.println(prompt);
            if(pipe.hasNextDouble()){
                retInt = pipe.nextDouble();
                if(retInt >= low && retInt <= high){
                    System.out.println();
                    return retInt;
                }
            }else{
                trash = pipe.nextLine();
                System.out.println("incorrect type try again");
            }
        }


    }

    public static double getdouble(Scanner pipe, String prompt){
        double retdouble = 0;
        String trash = "";
        while(true){
            System.out.println(prompt);
            if(pipe.hasNextDouble()){
                retdouble = pipe.nextDouble();
                System.out.println();
                return retdouble;
            }else{
                trash = pipe.nextLine();
                System.out.println("incorrect type try again");
            }
        }


    }

    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }





    public static void prettyHeader(String msg){

        int totalspaces = 60 - 6 - msg.length();
        int leftSpace;
        int rightSpace;

        if(totalspaces % 2 ==0){
            leftSpace = rightSpace = totalspaces / 2;
        }
        else{
            rightSpace = totalspaces / 2;
            leftSpace = rightSpace +1;
        }
        //print top border
        for(int i = 0; i <= 61; i ++){
            System.out.print("*");
        }
        System.out.println();
        //first 3 *
        System.out.print("***");
        //left 3
        for(int i =0; i <=leftSpace; i ++){
            System.out.print(" ");
        }
        //print message
        System.out.print(msg);
        //print the right side
        for(int i =0; i <=rightSpace; i ++){
            System.out.print(" ");
        }
        System.out.print("***");
        System.out.println();
        //bottem
        for(int i = 0; i <= 61; i ++){
            System.out.print("*");
        }
        return;
    }


}
