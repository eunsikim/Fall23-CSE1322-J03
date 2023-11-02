import java.lang.Thread;
import java.util.Random;

public class ExampleB {
	public static void main(String[] args) {
		TrafficLight light = new TrafficLight();
		
		Thread trafficLightThread = new Thread(light);
		trafficLightThread.start();

		Thread carThread = new Thread(new car(light));
		carThread.start();
	}
}

class TrafficLight implements Runnable {
	private boolean green = false;

	public synchronized boolean isGreen(){
		return green;
	}

	public void run() {
		while (true) {
			if (green) {
				System.out.println("Traffic light is green");
				try {
					Thread.sleep(5000); // green light for 5 seconds
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				green = false;
			} 
			else {
				System.out.println("Traffic light is red");
				try {
					Thread.sleep(2000); // red light for 2 seconds
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				green = true;
			}
		}
	}
}

class car implements Runnable{
	private final TrafficLight light;

	public car(TrafficLight light){
		this.light = light;
	}

	Random random = new Random();

	public void run(){
		try{
			while(true){
				if(light.isGreen()){
					System.out.println("Car: Moving\n");
				}
				else{
					System.out.println("Car: Stopped\n");
				}


				Thread.sleep(random.nextInt(500) + 300);
			}
		}
		catch (InterruptedException e){

		}

	}
}

 