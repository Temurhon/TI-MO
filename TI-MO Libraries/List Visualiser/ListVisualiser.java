public class ListVisualiser {

    SLList vlist;

    public ListVisualiser(SLList l) { 
    		vlist =l;//i am implementing the method to visualisation linked list object

}
     
    
    public void visualise(){

    		//SLList temp = visualist;

    	//	String c = "/]";
    		
    		//if(l.first == l.first){
    		//System.out.println("[*|");
    		//System.out.println(" |");
    		//System.out.println(" "+l.first);
    		//System.out
    		//}

        SLList temp = vlist;//this will go to the next object in SLLIST.
        SLList temp1 = vlist;


        


        String[] t = new String[7];
        //i am making new string array called t and using the indexes to define each part of the character e.g "[".
        t[1] = "";
        t[3] = "";
        t[5] ="";
        t[6] = "";
        t[2] = "";
        t[4] = "";


        while(temp != SLList.NIL){//this will keep on looping until gets to the end of the SLLIST.
         //   System.out.println(temp.first);
            //System.out.println("["+temp.first+"|*]");
            


		            
     
            
           // temp1 = temp1.rest;
            

//System.out.println("*]->[*|");

          if(temp.rest == SLList.NIL){//when it reaches the end of the list then it'll prinout the string below.
          	t[1] += "[*|/]";
          }else{//or else it'll keep on printing the string below in order to make up the rest of the SLList.
          	 t[1] += "[*|*]";
          	 
          }

          	t[2] += " |   ";//this is a visual representation of the arrow that will show what each number represents ina list.
          	t[3] += " " + temp.first + "  ";//this is the amount of space will be needed with the temporary array list which holds the numbers from SLList.

            temp = temp.rest;//It'll keep on repeating the arrow many times until it reaches the NIl.
            
            temp1 = temp1.rest;//It'll keep on repeating the loop until it prints out all the numbers in a SLList.

        }

      
        
        	
        



System.out.println(t[1]);
System.out.println(t[2]);
System.out.println(t[3]);
       
    

 

    }


}




