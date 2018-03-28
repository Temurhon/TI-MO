public class MergeSort {

    void merge(int a[], int left, int middle, int right){
        //SIZES OF TWO ARRAYS BEING MERGED TOGETHER.

        int size1 = middle + left + 1;
        int size2 = right - middle;



        //CREATION OF TEMPORARY ARRAYS
        int LEFTA[] = new int [size1];
        int RIGHTA[] = new int [size2];






        //COPYING DATA INTO TEMPORARY ARRAYS
        for (int i = 0; i < size1; i++){
            LEFTA[i] = a[left + i];
        }
        for (int t = 0; t < size2; t++){
            RIGHTA[t] = a[middle + 1 + t];
        }




        //MERGING TEMP ARRAYS

        //INITIALISING BOTH FIRST size1 AND size2 SUB-ARRAYS TO 0
        int i = 0, j = 0;

        //INITIALISING L TO left INDEX
        int l = left;

        while (i < size1 && j < size2){

            if (LEFTA[i] <= RIGHTA[j]){
                a[l] = LEFTA[i];
                i++;
            }
            else {

                a[l] = RIGHTA[j];
                j++;
            }

            l++;

        }

        //COPY THE REMAINING PARTS OF LEFTA[] THE ARRAY TO a
        while (i < size1){

            a[l] = LEFTA[i];
            i++;
            l++;

        }

        //COPY THE REMAINING PARTS OF RIGHTA[] THE ARRAY TO a
        while (j < size2){

            a[l] = RIGHTA[j];
            j++;
            l++;

        }




    }

    //MAIN METHOD FUNCTION THAT SORTS THE a WITH THE HELP OF merge() METHOD AT THE TOP
    void sort(int a[], int left, int right){

        if (left < right){

            //FINDING THE MIDDLE POINT BY HALVING THE TOTAL NUMBER OF THE ARRAY (a)
            int middle = (left + right) / 2;

            //SORTING THE FIRST AND THE SECOND HALVES
            sort(a, left, middle);
            sort(a, middle + 1, right);

            //MERGING THE SORTED HALVES
            merge(a, left, middle, right);

        }

    }



    //TO PRINT FUNCTION THAT WILL PRINT OUT THE ARRAY OF THE SIZE a
    static void printA(int sortedArray[]){

        int num = sortedArray.length;
        //FOR LOOP THE AMOUNT OF INDEXES IN THE ARRAY
        for (int i = 0; i < num; ++i){
                System.out.println(sortedArray[i] + " ");
            System.out.println();
        }


    }

    //MAIN FUNCTION FOR THIS TO RUN ON INTELEJ
    public static void main(String[] args) {

        int array[] = {32, 33, 45, 66};

        System.out.println("Array before it is sorted and merged:");
        printA(array);

        MergeSort sor = new MergeSort();
        sor.sort(array, 0 , array.length -1);

        System.out.println("\n Sorted and Merged Array");


    }


}
