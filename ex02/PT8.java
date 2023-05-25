package ex02;


public class PT8 {
    public static void main(String[] args) {
        
        byte status = 0b01101110;
        System.out.println("문열림 상태 =" + ((status & 0b0000100)!=0));
    } 
    
}
