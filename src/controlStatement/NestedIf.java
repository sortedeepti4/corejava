package controlStatement;

public class NestedIf {
	public static void main(String[] args) {
		int Hindi = 40;
		int marathi = 60;
		int maths = 32;
		int science = 26;
		int socialscience = 66;
		int english = 67;
		if (Hindi > 35) {
			if (marathi > 35) {
				if (maths > 35) {
					if (science > 35) {
						if (socialscience > 35) {
							if (english > 35) {
								System.out.println("pass");

							} else {
								System.out.println("faild in english");
							}
						} else {
							System.out.println("faild in socialscience");
						}
					} else {
						System.out.println("faild in science");
					}
				} else {
					System.out.println("faild in maths");
				}
			} else {
				System.out.println("faild in marathi");
			}

		} else {
			System.out.println("faild in Hindi");

		}

	}

}
