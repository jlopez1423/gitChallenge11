//Uber Bot challenge
//Codewars
public class Challenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] fares = {0.2, 0.5, 1.0, 1.4, 0.6};
		String total = fancyRide(20, fares);
		System.out.print(total);
	}

	//Need to create a new function
	static String fancyRide(int l, double[] fares){
		//declare some variables
		double myMoney = 20.00;
		double dist = (double) l;//must cast
		int max = 0;
		String[] availRides = {"UberX", "UberXL", "UberPlus", "UberBlack", "UberSUV"};
		double[] prices = new double[5];
		
		//Get the cost of travel
		for(int i = 0; i < fares.length; i++){
			prices[i] = dist*fares[i];
		}
		
		//now let's find what is the largest but below our budget
		for(int j = 0; j < prices.length; j++){
			for(int k = 0; k < prices.length; k++){
				if(prices[j] >= prices[k] && prices[j] <= myMoney && prices[j] >= prices[max]){
					max = j;
				}
			}
		}
		return availRides[max];
	}
	
}
