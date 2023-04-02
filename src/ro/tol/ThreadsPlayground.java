package ro.tol;

public class ThreadsPlayground {


	public static void main(String[] args) {
		Runnable task2 = () -> {
			System.out.println("Task #2 is running");
		};
		Thread t = new Thread(task2);
		t.start();
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				{
					System.out.println("Task #3 is running");
				}
			};
		}
		);

		Thread t3 = new Thread(()-> {
					System.out.println("Task #4 is running");
		}
		);
		t2.start();
		t3.start();
	}
};
