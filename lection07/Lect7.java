package by.itacademy.course.lec07;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/*
Практика Павел Макей
*/

class HomeWorkLect07 { //not public because of different packages on different PC :(
    String testMainString = new String("This is // a test /* string /**");
    String orderText = new String("We have to calculate recurring words because these words have to be calculated because We have 123");
    String[] stringsToBeCut = new String[]{"//","/*","/**"};
    String regExpPattern = "(\\d{1,3})";
    String replacement = "XXX";
    char[] vowelChars = "eyuioa".toCharArray();

    public static void main(String[] args) {
        HomeWorkLect07 homeWorkLect07 = new HomeWorkLect07();
        homeWorkLect07.run();
    }

    public void run(){


        // 1.
        System.out.println("Invert string \"" + testMainString + "\"" );
        System.out.println("Inverted string \"" + reverseString(testMainString)+ "\"");
        // 2.
        System.out.println("==================================");
        System.out.println("Calculate vowels in string \"" + testMainString + "\"");
        System.out.println(sumVowels(testMainString,vowelChars));
        //3.
        System.out.println("==================================");
        System.out.println("Get statistic of words in text \"" + orderText + "\"");
        System.out.println(getStatisticOfWords(orderText));
        //4. 10:05 to 10:55 (from 60 min)
        System.out.println("==================================");
        System.out.println("Remove all comments (//, /**, /*) from text \"" + testMainString + "\"");
        System.out.println(removeComments(testMainString,stringsToBeCut));
        //5. 11:00 to 11:25 from(60 min) by Ctrl+V
        System.out.println("==================================");
        System.out.println("sort words alphabetically \"" + orderText + "\"");
        System.out.println(Arrays.toString(sortWords(orderText)));
        //6. 14:30 to 16:45 (from 120 mim)
        System.out.println("==================================");
        System.out.println("Check with regexp is valid an e-mail which entered throw the console");
        System.out.println("Entered e-mail is" + isValidEmail());
        //7.
        System.out.println("==================================");
        System.out.println("Check with regexp is valid an ip which entered throw the console");
        System.out.println("Entered e-mail is" + isValidIp());
        //8.
        System.out.println("==================================");
        System.out.println("Replace substring in text which matches an regular expression \"" + orderText + "\"");
        System.out.println("Cut text \"" + cutSubStringByRegexp(orderText, regExpPattern, replacement));


    }

    private String cutSubStringByRegexp(String text, String regExpPattern, String replacement) {
        return text.replaceAll(regExpPattern, replacement);
    }

    private boolean isValidIp() {
        boolean isValid = false;
        String[] strings = null;
        String stringFromUser = getLineFromConsole("IP");
        Pattern pattern = Pattern.compile("(\\d{1,3})(\\.{1})(\\d{1,3})(\\.{1})(\\d{1,3})(\\.{1})(\\d{1,3})$");
        Matcher matcher = pattern.matcher(stringFromUser);
        if (matcher.matches()){
            strings = stringFromUser.split("\\.");
            isValid=true;
            for(String str: strings){
                if(Integer.parseInt(str) >255){
                    isValid = false;
                }
            }
        }
        return isValid;
    }

    private boolean isValidEmail() {

        String string = getLineFromConsole("e-mail");
        Pattern pattern1 = Pattern.compile("(^[^.])((\\w{1,64})|(\\w{1,64})([.?])(\\w{1,64}))(@)(\\w{1,63})([.]{1,1})(((([a-z]|[A-Z]){1,63})([.])(([a-z]|[A-Z]){2,4})))");
        Pattern pattern2 = Pattern.compile("(^[^.])((\\w{1,64})|(\\w{1,64})([.?])(\\w{1,64}))(@)(\\w{1,63})([.]{1,1})(([a-z]|[A-Z]){2,4})");
        Matcher matcher1 = pattern1.matcher(string);
        Matcher matcher2 = pattern2.matcher(string);
        return (matcher1.matches()||matcher2.matches());


    }

    private String getLineFromConsole(String text) {
        System.out.println("Please enter an  "+ text + " into the console");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

    private String[] sortWords(String stringToSort) {
        String[] strings = stringToSort.split(" ");
        Arrays.sort(strings);

        return strings;
    }

    private String removeComments(String testMainString, String[] stringsForCutting) {

        String cutString = new String(testMainString);
        //sorting by length words max to min allows remove mistake of removing (/** + /* = *)
        List<String> strings = Arrays.asList(stringsForCutting);
        strings.sort((s1, s2) -> Math.abs(s2.length()) - Math.abs(s1.length()));

        for(String toCut:strings) {
            cutString = cutString.replace(toCut, "");
        }
        return cutString;


    }

    private ArrayList<String> getStatisticOfWords(String testString) {
        String[] masWords = testString.split(" ");
        HashSet unicWords = new HashSet();
        ArrayList<String> returnString = new ArrayList<>();
        int counter;

        unicWords.addAll(Arrays.asList(masWords));
        for(Object unicWord : unicWords){
            counter = 0;
            for(String word:masWords){
                if(word.equals((String)unicWord )){
                    counter++;
                }
            }
            returnString.add(unicWord + " " + counter);
        }

        return returnString;
    }

    private int sumVowels(String tString,char[] vowels) {
        char[] stringChars = tString.toLowerCase().toCharArray();
        int sum = 0;
        for(char strChar:stringChars){
            for (char vowelChar:vowels){
                if (strChar == vowelChar){sum++;}
            }
        }
        return sum;
    }


    private String reverseString(String tString) {
        //simple variant
//        StringBuilder reversedString = new StringBuilder(tString);
//        return reversedString.reverse().toString();

        //other variant
        char[] chars = new char[tString.length()];
        for(int i = 0, j =tString.length()-1; i<tString.length();i++,j--){
            chars[i] = tString.charAt(j);
        }
        return (new String(chars));

    }

}
