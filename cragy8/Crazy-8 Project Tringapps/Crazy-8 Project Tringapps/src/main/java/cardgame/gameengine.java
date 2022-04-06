
package cardgame;
import java.util.*;
import java.util.ArrayList;
public class gameengine {
	/*Card lastcard; 
	public gameengine() {
		this.lastcard=lastcard;
	}
	*/
	
	 public static void main(String[] args) {
	  
		 List<Card> cardDeck = Card.getDeck();
		 Collections.shuffle(cardDeck) ;
		 List<Card> playerone = new ArrayList<>(); 
		 List<Card> opposite  = new ArrayList<>(); 
		for(int i=0;i<=13;i++)
		{
		    if(i%2==0) 
			{
				 playerone.add(cardDeck.get(0));
			}
			else 
			{
			     opposite.add(cardDeck.get(0));
			}
			cardDeck.remove(0);
		 }
		System.out.println(cardDeck.size());
		for(int a=0;a<=6;a++) 
		{
			 System.out.println(playerone.get(a).getSuit()+" "+playerone.get(a).getRank());
		}
		System.out.println();
		for(int a=0;a<=6;a++) 
		{
			 System.out.println(opposite.get(a).getSuit()+" "+opposite.get(a).getRank());
		}
		System.out.println();
		Card lastcard=cardDeck.get(0);  
		cardDeck.remove(0); 
		System.out.println(lastcard.getSuit()+" "+lastcard.getRank());
		System.out.println();
		for(int m=1;m<=14;m++) {
			if(m%2!=0) {
		   for(int l=0;l<opposite.size();l++) {
			if(opposite.get(l).getSuit().equals(lastcard.getSuit())||opposite.get(l).getRank().equals(lastcard.getRank())) {
				lastcard=opposite.get(l);
				System.out.println(lastcard.getSuit()+" "+lastcard .getRank());
				opposite.remove(l);
				break;
			    
			}
		  }
		}else {
			for(int j=0;j<playerone.size();j++) {
				if(playerone.get(j).getSuit().equals(lastcard.getSuit())||playerone.get(j).getRank().equals(lastcard.getRank())) {
					lastcard=playerone.get(j);
					System.out.println(lastcard.getSuit()+" "+lastcard .getRank());
					playerone.remove(j);
                     break;
				}
			}
		   }
		}
	}	 
}
	