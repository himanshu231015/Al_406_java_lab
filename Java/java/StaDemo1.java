class StaDemo1{
		static int x = 3000;
		static {
			x = x*10;
		}
		public static void main(String args[]){
			x = x+9000;
			System.out.print(x);
		}

	
}