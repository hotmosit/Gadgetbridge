package nodomain.freeyourgadget.gadgetbridge.activities;

public class option {
    private final static int MUTABILITY = 0;
    private final static int ONE_SECOND = 1;
    private final static int FIVE_SECOND = 2;
    private final static int NONE_MUTABILITY = 3;

    private static int cases=ONE_SECOND;
    private static int time= 4800;
    private static String url="https://ljy897.cafe24.com/UserRegister9.php";


    static public int getCase(){
        return cases;
    }
    static public int getTime(){
        return time;
    }
    static public String getUrl(){
        return url;
    }
}
