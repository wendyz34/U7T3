import java.util.ArrayList;

public class Delimiters {
    /**
     * The open and close delimiters
     **/
    private String openDel;
    private String closeDel;

    /**
     * Constructs a Delimiters object where open is the open delimiter and close is the
     * close delimiter.
     * Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    /**
     * Returns an ArrayList of delimiters from the array tokens, as described in part (a).
     */
    public ArrayList<String> getDelimitersList(String[] tokens) {
        /* to be implemented in part (a) */
        ArrayList<String> delimiters = new ArrayList<String>();
        for (String d : tokens) {
            if (d.equals(openDel) || d.equals(closeDel)) {
                delimiters.add(d);
            }
        }
        return delimiters;
    }

    /**
     * Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     * Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters) {
        /* to be implemented in part (b) */
        if (delimiters.size()%2==1){
            return false;
        }
        int open =0;
        int close=0;
        for(String s:delimiters){
            if (s.equals(open)){
                open++;
            }
            if (s.equals(close)){
                close++;
            }
        }
        return close==open;


    }
}



