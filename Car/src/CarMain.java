
public class CarMain {
    public static void main(String[] args) throws Exception {
       
    	CarSystem tivoli = new CarSystem();
    	
    	tivoli.carNumIn();
    	Thread.sleep(1000);
    	tivoli.BreakDwon();
    	Thread.sleep(1000);
    	tivoli.Start();
    	tivoli.Accelerator();
    	tivoli.BreakDwon();
    	tivoli.blink();
        //속성 5개 이상
        //메서드 5개 이상
        // 원하는거 만들어오기
    	
    }
}