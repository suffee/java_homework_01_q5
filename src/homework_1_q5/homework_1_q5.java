package homework_1_q5;

public class homework_1_q5 {

	public static void main(String[] args){
		
		
		String unchangeString="I hate hate you";
		String love="love";
		/**原本的字串*/
				
		String changeString=unchangeString.replaceFirst("hate", love);
		/**將第一個hate換成love*/
		
		
				
		System.out.println(unchangeString);
		System.out.println(changeString);
		/**印出字串*/
		
		
	

	}

}
