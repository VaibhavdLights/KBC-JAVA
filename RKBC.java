import java.util.Random;
class RKBC
{
    int store[]=new int[6];
    void main()
    {
        Random r = new Random();
        int i = 1,d,x=0;
        while(i<=5)
        {
            x = r.nextInt(10);
            mid :
            for(d=1;d<store.length;d++)
            {
                if(store[d]==x)
                {
                    x = r.nextInt();
                    continue mid;
                }
            }
            if(x<11&&x>0)
            {
                store[i]=x;
                i++;
            }
        }             
    }
}