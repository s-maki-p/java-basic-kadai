package kadai_015;

public class Car_Chapter15 {

	private int gear = 1;   //1速から5速のギアを表す
	private int speed = 10; //ギアチェンジ後の速度を表す
	
	public void  gearChange( int afterGear ) {
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		gear = afterGear;
	}
	
	public void run() {
		
		if( gear >= 2 && gear < 6 ) {
			System.out.println("速度は時速" + speed * gear + "kmです");
		} else {
			System.out.println("速度は時速10kmです");
		}
	}
}
