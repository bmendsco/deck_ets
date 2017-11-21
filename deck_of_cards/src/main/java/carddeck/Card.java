/**
*  
* Card - This class will define the card object
* @author Benedict Mendscole
* 
*/

package carddeck;

public class Card{

   //fields
   private CardRank rank;                   //will hold rank of card
   private CardSuit suit;                   //will hold suit of cards

/**
* Card() contstrucotr
* @param rank -rank of card
* @param suit -suit of card
*/
   public Card (CardRank rank, CardSuit suit){
   
      //initialize fields
      setCardRank(rank);
      setCardSuit(suit);
   }
   
 /**
 * getCardRank() -will return rank of card
 *
 */
   public CardRank getCardRank(){
   
      return this.rank;
   }
 
 /**
 * getCardSuit() -will return suit of card
 *
 */
   public CardSuit getCardSuit(){
   
      return this.suit;
   }
   
   /**
   * 
   * setCardRank -will set rank of card
   *
   */
   public void setCardRank(CardRank rank){
   
     //validate parameter
      if(rank ==null){
         throw new IllegalArgumentException("Invalid input rank: " + rank);
      }
      this.rank = rank;
   }
   
   /**
   * 
   * setCardSuit - will set suit of card
   *
   */
   public void setCardSuit(CardSuit suit){
   
    //validate parameter
      if(suit ==null){
         throw new IllegalArgumentException("Invalid input suit: " + suit);
      }
      this.suit = suit;
   }
   
   /**
   * toString() will return a string representation of the card
   * @return retStr - card string representation
   *
   */
   public String toString(){
   
      //declared variables
      String retStr;
      
      //initialize variables
      retStr = "";
      
      retStr = this.rank  + " of " + this.suit;
      
      return retStr; 
     
   }
 
}//end class