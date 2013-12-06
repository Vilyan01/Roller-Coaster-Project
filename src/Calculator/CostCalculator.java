package Calculator;

public class CostCalculator {
	
	double totalHeight;
	double totalCost;
	
	public CostCalculator() {
		totalHeight = 0;
	}
	
	public double calculateHeight(int x) {
		double turd = 0;
		
		if(x < 120) {
			turd =  -0.0001736111*(x*x*x) + 0.03125*(x*x);
		}
		else if(x < 160) {
			turd = 0.0025625*(x*x*x) - 1.07625*(x*x) + 147.6*x - 6492;
		}
		else if(x < 240) {
			turd = -0.0000625*(x*x*x) + 0.0375*(x*x) - 7.2*x + 516;
		}
		else if(x < 290) {
			turd = 0.000943999*(x*x*x) - 0.75048*(x*x) +197.1072*x - 17043.936;
		}
		else if(x < 350) {
			turd = -0.0003518518518*(x*x*x) + 0.33777*(x*x) - 107.138889*x + 11270.48148;
		}
		else if(x < 500) {
			turd = 0.000037333333*(x*x*x) - 0.0476*(x*x) + 19.6*x - 2566.66667;
		}
		else {
			
		}
		
		return turd;
	}
	
	public void calculateTotalHeight(int increment, int max) {
		int x = 0;
		double height = 0;
		
		while(x <= max) {
			height = calculateHeight(x);
			System.out.println("f("+x+") = " +height);
			totalHeight += height;
			x = x + increment;
		}
		System.out.println("Your total height is: " + totalHeight);
	}
	
	public void calculateCost() {
		totalCost = totalHeight * totalHeight;
		System.out.println("Your total cost is: " + totalCost);
	}
	
	public static void main(String[] args) {
		CostCalculator cc = new CostCalculator();
		cc.calculateTotalHeight(25, 500);
		cc.calculateCost();
	}
}
