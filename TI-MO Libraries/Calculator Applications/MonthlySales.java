public class MonthlySales {

    public static void main(String args[]) {
        double [] monthlySales= {50000.0 , 40000.1, 55000.0 ,30000.0, //these are the list of the monthly sales
                250000.2, 600000.2, 450000.0, 36000.0 ,28000.0, 15000.1, 700000.2,
                15000.0};
        double totalSales = 0, largestMonth = monthlySales[0], smallestMonth = monthlySales[0];

        for(int i =0; i < monthlySales.length; i++) {//this loops the amount of the list length
            totalSales = totalSales + monthlySales[i]; //adds up all the index inside the array
            if(largestMonth < monthlySales[i]) {
                largestMonth = monthlySales[i];
            }
            else if(monthlySales[i] < smallestMonth) {//the smallest month will be determined by looping until it gets the smallest value in the list
                smallestMonth = monthlySales[i];
            }

            double average = totalSales / monthlySales.length; // the average is determined by the total sales half by the monthly sales.

        }
        double average = totalSales / monthlySales.length;
        System.out.println("The total of the sales is " + totalSales);//these are the print out functions that print the output of the variables.
        System.out.println("The largest number of the sales is " + largestMonth);
        System.out.println("The smallest number of the sales is " + smallestMonth);
        System.out.println("The average number of the sales is " + average);


    }

}
