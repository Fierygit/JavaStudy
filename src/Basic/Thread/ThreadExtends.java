package Basic.Thread;

class ThreadDemo extends Thread {
	private Thread t;
	private String name;

	public ThreadDemo(String name) {
		this.name = name;
		System.out.println(name + "creating!!!");

	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(name + " " + 
		i);
			if(i == 100) {
				try {
					t.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		println("fff");
		System.out.println("sleep 中文");
		try {
			t.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void println(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
	}

	public void start() {
		System.out.println("Starting " + name);
		if (t == null) {
			t = new Thread(this, name);
			t.start();
		}
	}

	public static void main(String[] args) {
		ThreadDemo  t1 = new ThreadDemo("firefly");
		t1.start();
		ThreadDemo  t2 = new ThreadDemo("five");
		t2.start();

	}


}

