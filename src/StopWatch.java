

public class StopWatch {
    private long startTime = 0;
    private long endTime = 0;



    public StopWatch() {
    }

    public void start() {
        this.startTime = System.nanoTime();
    }
     public  void end() {
         this.endTime =  System.nanoTime();
     }

    public long getStartTime() {
        return this.startTime;
    }
    public long getEndTime() {
        return  this.endTime;
    }

    public long getElapsedTime(){
        return  this.endTime - this.startTime;
    }
}
