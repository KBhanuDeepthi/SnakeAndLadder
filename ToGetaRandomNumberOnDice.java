class ToGetaRandomNumberOnDice {
	public static void main(String[] args) {
		final int START_POSITION=0;
		if(START_POSITION==0)
			System.out.println("Game Started");
		int dicenumber=(int)Math.floor(Math.random()*6+1);
		System.out.println("dicenumber="+dicenumber);
	}


}
