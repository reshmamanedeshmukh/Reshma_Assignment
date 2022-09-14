package com.yash.eightex;



 class  ThreadFunctions {
    private  int counter = 0;
    private boolean command =  false;

    public  void changeNumber(boolean command){
        this.command = command;
         
            if(command){
                counter++;
            }else{
                counter--;
            }
        
    }

    public int getCounter(){
        return this.counter;
    }
}
public class MultithreadingDemo {
	public static void main(String args[]) {
		

	    final ThreadFunctions o =  new ThreadFunctions();

	    new Thread(new Runnable() {
	        @Override
	        public void run() {
	            while(o.getCounter() < 10){
	                o.changeNumber(true);
	                System.out.println("Thread: " + Thread.currentThread().getId() + " counter: "+o.getCounter());
	            }
	        }
	    }).start();

	    new Thread(new Runnable() {
	        @Override
	        public void run() {
	            while(o.getCounter() > 0){
	                o.changeNumber(false);
	                System.out.println("Thread: " + Thread.currentThread().getId() + " counter: "+ o.getCounter());
	            }
	        }
	    }).start();
	    }
	}
