import java.lang.reflect.Array;
import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] token) {
        ArrayList temp = new ArrayList();
        for(int i = 0; i < token.length; i++) {
            if(token[i].equals(openDel) || token[i].equals(closeDel)) {
                temp.add(token[i]);
            }
        }
        return temp;
    }

    public boolean isBalanced(ArrayList delimiters) {
        int temp = 0;
        for(int i = 0; i < delimiters.size();i++) {
            if(delimiters.get(i).equals(openDel)) temp++;
            else if(delimiters.get(i).equals(closeDel)) temp--;

            if (temp < 0) return false;
        }
        return temp == 0;
    }

    public String getCloseDel() {
        return closeDel;
    }
    public String getOpenDel() {
        return openDel;
    }
}
