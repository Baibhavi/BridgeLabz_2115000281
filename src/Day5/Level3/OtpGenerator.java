package Day5.Level3;

public class OtpGenerator {
    public static void main(String[] args) {
        int[] otpArray = new int[10];
        int index = 0;
        System.out.println("OTPs are :");
        for(int i = 0; i < 10; i++){
            int otp = otpGenerator();
            if(otpUniqueness(otp, otpArray) == false){
                System.out.println("Not Unique");
            }
            else {
                otpArray[index++] = otp;
                System.out.println(otp);
            }
        }
    }
    public static int otpGenerator(){
        int otp = (int) (Math.random() * 99999) + 100000;
        return otp;
    }
    public static boolean otpUniqueness(int otp, int[] otpArray){
        for(int i : otpArray){
            if(i == otp){
                return false;
            }
        }
        return true;
    }
}
