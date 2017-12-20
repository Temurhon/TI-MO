public class Tax {
    public static void main(String args[]) {

        double income, fivePer, tenPer, TwenPer, tax; //these are the variables that allow me to use it and store it for for loops and if statements.

        income = 40000;//this is the input that can be changed to see the different output



        if (income <= 15000) {//if the input is smaller or equal to 15'000, then print out 0 tax
            tax = 0;
            System.out.println(tax);
        } else if (income > 15000 && income <= 30000) {//if the income is bigger or equal than 15'000, and it is smaller or equal to 30'000 then print out the five percent of the input
            tax = 0.05 * 15000;
            System.out.println(tax);
        } else if (income > 30000 && income <= 50000) {//if the income is bigger or equal than 30'000 and it is smaller or equal to 30'000 then print out the ten percent of the input
           // fivePer = 0.05 * 15000;
            tenPer = 0.10 * 30000;
            tax = tenPer;
            System.out.println(tax);
        } else {//this is the default that will output when the user is entering out of the if statement values
            //fivePer = 0.05 * 15000;
            TwenPer = 0.20 * income;
            //tenPer = 0.10 * 30000;
            tax = TwenPer;
            System.out.println(tax);
        }

    }
}
