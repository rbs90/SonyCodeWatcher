import java.net.MalformedURLException;
import java.util.Timer;

/**
 * Created with IntelliJ IDEA.
 * User: rbs
 * Date: 20.08.12
 * Time: 14:43
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) throws MalformedURLException {
        SonySiteWatcher watcher = new SonySiteWatcher("https://plus.google.com/u/0/113540013167694689284/posts");

        Timer timer = new Timer();
        timer.schedule(watcher, 0, Integer.parseInt(args[0]) * 1000);
    }
}
