public class Triangle1OfStars {// this is the main class
    public static void main(String args []){
        int i; //i've managed to create two variable that have nothing inside it just yet
        int j;
        for(i=1; i<=6; i++) { //this for loop will determine how many lines it will generate when executed
            for ( j = 1; j<= i; j++ )//this for loop will determine the amount of times it will print the line
                System.out.print( "*" ); // this will determine what the for loop will print out
            System.out.println();
        } // end for loop
        for(i=6; i>=1; i--) { //this will determine the amount of lines it will remove each line
            for (j = 1; j<= i; j++ )//this will determine on how much it'll  take off every for loop
                System.out.print(j);
            System.out.println();
        }
    }
}
