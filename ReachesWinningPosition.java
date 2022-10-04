import java.util.Scanner;
 class ReachesWinningPosition {
	public static void main(String[] args) {
		int dicevalue;
		Scanner scanner=new Scanner(System.in);
		dicevalue=scanner.nextInt(7);
		int count=0;
		int position=0;
		String option[]= {"noplay","ladder","snake"};
		while(position<=100) {
			String s[]=[option];
			if(s=="noplay")
				position=position;
			else if(s=="ladder")
			{
				position=position+dicevalue;
				if(position>100)
					position=position-dicevalue;
			}
			else
			{
				position=position-dicevalue;
				if(position<0)
					position=0;
			}
			System.out.println("position after dice roll:"+position);
		}
		count++;
		System.out.println(count);
	}

}
