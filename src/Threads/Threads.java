package Threads;

public class Threads implements Runnable {
    String name;

    public Threads(String name) {
        this.name = name;
    }

    @Override
    public void run() {

            try{
                for (int index = 0; index < name.length(); index++) {
                    System.out.println(name.charAt(index));
                }
            Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        
    }
}
