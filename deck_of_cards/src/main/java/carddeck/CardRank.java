/**
*  
* CardRank - This Enum type will define the rank of a card
* @author Benedict Mendscole
* 
*/

package carddeck;

public enum CardRank{

   //predefined cardRank constants and their values
   TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6),SEVEN(7),EIGHT(8),NINE(9),TEN(10),JACK(11),QUEEN(12),KING(13),ACE(14);
   
   //field
   private int cardValue;                     //will hold card value
   
   
   /**
   *
   * construcor of CardRank
   * @param cardValue - will hold passed in value of cardRank
   *
   */
   private CardRank (int cardValue){
   
      //initialize field
      this.cardValue = cardValue;   
   }
   
   /**
   * getCardValue() 
   * @return -cardValue of cardRank
   *
   */
   public int getCardValue(){
   
      return this.cardValue;
   }
}