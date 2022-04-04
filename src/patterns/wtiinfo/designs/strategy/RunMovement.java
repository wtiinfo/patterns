package patterns.wtiinfo.designs.strategy;

public class RunMovement implements Movement {

	@Override
	public void move(int distance) {
		int initialDistance = 0;
		
		while(initialDistance < distance) {
			initialDistance++;
			
			try {
				Thread.sleep(150);	
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Distância percorrida: " + initialDistance + " metros");
		}
	}

}
