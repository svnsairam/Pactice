class Demo{
    public static void main(String[] args) throws InterruptedException {
        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");
        String s6 = "Cat"+1;
        String s7 = "Cat"+1;
        StringBuilder s8 = new StringBuilder("Cat");
        String s9 = new String("Cat");
        System.out.println("s1 == s2 :"+(s1==s2));
        System.out.println("s1 == s3 :"+(s1==s3));
        System.out.println("s1 == s6 :"+(s1==s6));
        System.out.println("s6== s7 :"+(s6==s7));
        System.out.println("s1== s8 :"+(s1==s8.toString()));
        System.out.println("s8== s8.append :"+(s8==s8.append("str")));
        System.out.println("s1== s1.concat :"+(s1==s1.concat("str")));
        System.out.println("s3== s3.concat :"+(s3==s3.concat("str")));
        System.out.println("s3== s9 :"+(s3==s9));
        
        String s4 = new String("Dog");
        String s5 = s4.intern();
        System.out.println("s4 == s5 :"+(s4==s5));

        ProcessingThread pt = new ProcessingThread();
        Thread t1 = new Thread(pt, "t1");
        t1.start();
        Thread t2 = new Thread(pt, "t2");
        t2.start();
        //wait for threads to finish processing
        t1.join();
        t2.join();
        System.out.println("Processing count="+pt.getCount());
        
    }
}

class ProcessingThread implements Runnable{
    private int count;
    
    @Override
    public void run() {
        for(int i=1; i < 5; i++){
            processSomething(i);
        	count++;
        }
    }

    public int getCount() {
        return this.count;
    }

    private void processSomething(int i) {
        // processing some job
        try {
            Thread.sleep(i*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}