import java.util.concurrent.ThreadLocalRandom;
import java.util.*;
class RunForYourLife implements Runnable
{
    private Thread threadName;
    private String name;

    RunForYourLife (String name)
    {
        this.name = name;
        System.out.println(name+" ready");
    }

    public void run()
    {
        System.out.println(getName()+" go" );
        try
        {
            for(int i = 0; i < 20; i++)
            {
                // Let the thread sleep for a while.
                Thread.sleep(LetsGo.getRandom(getName(),i));
                int check = i+1;
                System.out.println(getName()+" has passed checkpoint "+ check);
            }
        }
        catch (Exception e)
        {
            System.out.println(getName()+" was interupted");
        }
        System.out.println(getName()+" has finished");
    }

    public void start ()
    {
        System.out.println(getName()+" set" );
        if (threadName == null) {
            threadName = new Thread (this, getName());
            threadName.start ();
        }
    }

    public String getName()
    {
        return name;
    }
}

public class LetsGo
{
    private static int[] delay = new int[3];
    private static int[][] finale = new int[3][20];
    private static int checkpoint;

    public static void main(String args[])
    {
        Random();
        RunForYourLife Lionel = new RunForYourLife( "Lionel");
        Lionel.start();

        RunForYourLife Andreas = new RunForYourLife( "Andreas");
        Andreas.start();

        RunForYourLife Messi = new RunForYourLife( "Messi");
        Messi.start();
    }

    public static void Random()
    {
        for (checkpoint = 0; checkpoint < 20; checkpoint++)
        {
            for (int x=0; x<3; x++)
            {
                delay[x]=ThreadLocalRandom.current().nextInt(100, 500);
            }
            Arrays.sort(delay);

            for (int x=0;x<3;x++)
            {
                finale[x][checkpoint]=delay[x];

            }
            checkpoint++;
        }

    }

    public static int getRandom(String name, int id)
    {
        if(name=="Messi")
        {
            return finale[0][id];
        }
        else if(name=="Lionel")
        {
            return finale[2][id];
        }
        else return finale[1][id];
    }
}