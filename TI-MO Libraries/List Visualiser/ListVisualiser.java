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

      
        
        	
        

  //     System.out.println("/]");



System.out.println(t[1]);
System.out.println(t[2]);
System.out.println(t[3]);
       
    

        // System.out.println(t[5]);
        // System.out.println(t[3]);

       // System.out.println("/]");

    }

//     		 while(l != SLList.NIL){
    		 	
    		 	
    		
//     		if(l.rest.first == SLList.NIL){
//     			System.out.println("["+l.rest.first+"|/]");
    			
//     		}

// if(l.rest == SLList.NIL){
//     			System.out.println("["+l.rest.first+"|/]");
//     			}
    		
    

    // 		if(temp == null){
    // 			temp = temp.rest();
  		// }
    		//System.out.println(temp);
     			
    		
    		
    

}






/*

2.1 Implementing a class to visualise a list
You have (in labs 04-06) already implemented a singly-linked list class in terms of SLList objects. For this
part of the lab, you must implement a method to visualise a linked list object.

Specifically, you must implement a ListVisualiser class, with:
• a constructor accepting a single SLList reference – prototype ListVisualiser(SLList) (Java) /ListVisualiser(SLList *) (C++); and
• a public method visualise() (Java) / visualise() (C++).

The visualise() method should display the list given in the constructor using the box-and-pointer
notation you should be familiar with from lecture slides. You may use any reasonable ASCII text-based
representation, for example representing the list [1,11,23] as

1
[*|*]->[*|*]->[*|/]
 |      |      |
 1      11     23

or at your own risk you can implement a more advanced visualisation, for example using Unicode boxdrawing
characters or a graphical library.
You may find it helpful to test your visualiser using your own SLList implementation and my provided
test file, using make test. You may also wish to consider other cases, and extend my provided test file to
cover those.

*/ 



