package Part2_structedJava.ex2.탑다운예제;
public class Program {
	public static void main(String[] args) {		
		int menu;
		int[][] lottos = null;
		boolean running = true;
		
		while(running) {
			menu = inputMenu();			
			switch(menu) {
			case 1:
				lottos = genLottosAuto();
				break;
			case 2:
				lottos = genLottosManual();
				break;
			case 3:
				printLottos(lottos);
				break;
			case 4:
				running = false;
				break;
			default:				
			}			
		}		
	}

	private static void printLottos(int[][] lottos) {
		// TODO Auto-generated method stub
		
	}

	private static int[][] genLottosManual() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int[][] genLottosAuto() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int inputMenu() {
		
		return 0;
	}
}
