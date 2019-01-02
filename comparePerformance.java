public class Palindrome {

    private static boolean isPalindromeFirst(String str) {
        int strLength = str.length();
        for (int i = 0; i < strLength; i++) {
            if (str.charAt(i) != str.charAt(strLength - 1 - i)) {
                return false;
            } else if (i == strLength / 2) {
                return true;
            }
        }
        return true;
    }

    private static boolean isPalindromeSecond(String str) {
        String compareStr = "";
        for(int i=str.length()-1; i>=0; i--){
            char temp = str.charAt(i);
            compareStr+=temp;
        }
        return (str==compareStr);
    }

    public static void main(String [ ] args) {
        SimpleDateFormat sdfDate = new SimpleDateFormat ("HH:mm:ss.SSS");

        Date dNow = new Date( );
        String startFirst=sdfDate.format(dNow);
        System.out.println("start First : " + startFirst);

        isPalindromeSecond("KAZAK");

        Date date = new Date( );
        String finisFirst=sdfDate.format(date);
        System.out.println("finish First : " + finisFirst);

        Date a = new Date( );
        String startSecond=sdfDate.format(a);
        System.out.println("start Second : " + startSecond);

        isPalindromeFirst("KAZAK");

        Date b = new Date( );
        String finishSecond=sdfDate.format(b);
        System.out.println("finish Second : " + finishSecond);

    }
}
