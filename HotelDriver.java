class HotelDriver {
	public static void main(String[] args) {
		hotelManage h = new hotelManage();
		for (;;) {
			System.out.println("1.Select Hotel   2.Order Food    3.Bill     4.Exit");
			switch (h.sc.nextInt()) {
				case 1:
					h.selectFood();
					break;
				case 2:
					h.orderFood();
					break;
				case 3:
					h.bill();
					break;
				case 4:
					System.exit(1);
					break;
			}
		}
	}
}
