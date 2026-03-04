class Worker extends Thread{
int id,N;
public Worker(int i,int N){
    this.id=i;
    this.N=N;
}
public void run(){
    doWork();
}
private void doWork(){
    for(int ctr=1;ctr<=N;ctr++){
        System.out.println("W_id="+id+" ctr="+ctr);
    }
}
}