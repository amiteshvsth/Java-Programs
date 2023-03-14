package OTP;

public class OTP2 {
    // declaring a of return type String
    // which on calling provides the otp
    public static String generateOTP() {
        // int randomPin declared to store the otp
        // since we using Math.random() hence we have to type cast it int
        // because Math.random() returns decimal value
        int randomPin = (int) (Math.random() * 9000) + 1000;
        String otp = String.valueOf(randomPin);
        return otp; // returning value of otp
    }

    public static void main(String args[]) {
        String otpSting = generateOTP();
        System.out.println("OTP : " + otpSting);
    }
}
