package stringmanipulation;

public class StringManipulation {

    private StringBuilder evenCharString = new StringBuilder();

    public String everyEvenCharacter(String s) {

        char[] chars =s.toCharArray();
        for ( int i=0; i<chars.length; i++) {
            if ( i%2 == 0) {
                evenCharString.append(chars[i]);
            }
        }
        String result = evenCharString.toString();
        return result;
    }
}

