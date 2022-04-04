package patterns.wtiinfo.designs.strategy;

public class WalkMovement implements Movement {

	@Override
	public void move(int distance) {
		int initialDistance = 0;
		
		while(initialDistance < distance) {
			initialDistance++;
			
			try {
				Thread.sleep(300);
				
				if(initialDistance % 20 == 0) {
					Thread.sleep(400);
					System.out.println("Parada para descanso");
				}
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Distância percorrida: " + initialDistance + " metros");
		}
	}

}
