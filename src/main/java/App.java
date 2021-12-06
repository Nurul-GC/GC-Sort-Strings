import classes.sortstrings;

public class App {
    public static void main(String[] args){
        var Names = new String[]{
                "Nurul", "Yassin",
                "Wakil", "Khalil"
        };
        sortstrings.sort(Names);
        for (final String name : Names){
            System.out.println(name);
        }
    }
}
