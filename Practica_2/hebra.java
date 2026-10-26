public class hebra extends Thread{
    static long n = 0;
    int option;
    public hebra(int option){
        this.option = option;
    }
    public void run(){
        switch(option){
            case 1:
                for(long i=0; i<10000000000000000; i++)
                    n++;
                break;
            case 2:
                for(long i=0; i<10000000000000000; i++)
                    n--;
                break;
        }
    }   

}
