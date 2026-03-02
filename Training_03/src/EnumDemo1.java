public class EnumDemo1 {
	enum coffee{
		SMALL(45),MEDIUM(60),LARGE(90);
		private int price;
		
		private coffee(int price) {
			this.price = price;
		}
		
		public int gotprice() {
			return price;
		}
	};
	
	public static void main(String[] args) {
		coffee c = coffee.MEDIUM;
		System.out.println(c  + " Coffee price Rs." +c.gotprice());
	}
}
