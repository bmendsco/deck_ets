

package carddeck;

/**
* this class will run sample outputs the deck object
*
*/
public class SampleRun{

   public static void main(String []args){
      
      //shuffle and display deck
      Deck a = new Deck();
      a.shuffle();
      System.out.println(a.toString());
      
      //will deal half of deck a
      for(int i = 0;i<26;i++){
         Card temp = a.dealOneCard();
      }
      
     //display remaining deck a
      System.out.println(a.toString());
     
   }

}