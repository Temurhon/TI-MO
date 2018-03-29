package BoyerMoore;

import static sun.swing.MenuItemLayoutHelper.max;

public class BoyerMoore {
    String[] P = {"A","A","A","A","A"};
    String[] T = {"C","C","D","F","G","G","T","A","A","A","A","A",};

    int size1 = T.length;

    int[] TABLE = new int[size1];




    public int BoyerMoore(String Table[], String Paren[]){

        int n = Table.length;
        int m = Paren.length;
        int s = 0;


        while (s <= n - m){

            int j = m - 1;

                while (j >= 0 && P[j] == T[s+j]){
                    j = j - 1;
                }
            if (j == -1){
                    return s;
            }
            else{
                s = s + max(1,j - new computeBadCharacter(1 - T));
        }
        }
        return 0;
    }


}
