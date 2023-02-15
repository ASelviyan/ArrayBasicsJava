//DEFINITIONS
//#1: Arrays
    //Arrays is a collection of other data types. Data types like strings, numbers, booleans and so on
public class ArrayDemo {
    //IMPORTANT: when we're passing arguments into a main method, the only data we can work with for public static main method is an array of strings. EVERYTHING WILL BE TRANSLATED INTO STRINGS
    //You can see that the main method actually uses an array in its parameter
    //the parameter states that it has a String array that is named args
    public static void main(String[] args){
        //To declare an array(#1), define the variable type with square brackets
        //ANATOMY OF ARRAY
            //first comes the data type. this data type will tell the array what kind of variables it will be storing.
            //the next but is the name of the array. for this example its myNum
            //To insert values to it, you can place the values in a comma-separated list, inside curly braces
        int[] myNum = {10, 20, 30, 40};
        String[] names = {"Tom", "Taylor", "Diana", "Marina"};
        System.out.println(args[0]);
    }
}
