package search;

public class NaiveSearch {
    public static void main(String[] args) {
        String strData = "data structure";
        char[] data = strData.toCharArray();
        String strPat = "e";
        char[] pat = strPat.toCharArray();

        boolean result = naiveSearch(data,pat);

        System.out.println("result: " + result);
    }

    public static boolean naiveSearch(char[] T, char[] P) {
        int patternLength = P.length;
        int dataLength = T.length;
        int j = 0;
        System.out.println("Start naiveSearch");
        for(int s = 0; s <= (dataLength - patternLength); s++){
            System.out.println("Round: " + s + " " + String.valueOf(dataLength - patternLength));
            j = 0;
            while (j < patternLength){
                if(T[s + j] == P[j]){
                    System.out.println( "Data char: " + T[s+j] + " Pattern char: "  +P[j] + " Round: " + s + " Pattern Round : " + j);

                    ++j;

                    if(j == patternLength){

                        return true;

                    }else  {
                        System.out.println("data: " + T[s+j] + " = " + P[j] + " " + j);
                    }

                }else {
                    System.out.println( "Not Found " + "Round: " + s);
                    break;
                }
            }
        }

       return false;
    }
}
