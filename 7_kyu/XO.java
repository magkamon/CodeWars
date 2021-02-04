public class XO {
    public static void main(String[] args) {
        System.out.println(getXO("xxxOOO"));
        System.out.println(getXO("kkkkkkk"));
        System.out.println(getXO("XXooo"));

    }

    public static boolean getXO (String str) {
     int countX = 0;
     int countO = 0;
     String strIgnoreCase = str.toLowerCase();
        for (int i = 0; i < strIgnoreCase.length(); i++){
            if(strIgnoreCase.charAt(i) == 'x'){
             countX++;
            }
            if(strIgnoreCase.charAt(i) == 'o'){
             countO++;
            }
         }
     return countO == countX;
    }
}
