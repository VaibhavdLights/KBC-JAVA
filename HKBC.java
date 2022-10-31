import java.util.*;
class HKBC
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        QKBC ob = new QKBC();
        RKBC r = new RKBC();
        IKBC i = new IKBC();
        r.main();
        i.main();
        int score=50,money =1024;
        int k=1;
        int j,l,j1,j2;
        char ans,ans1,ans2;
        for(j2=11,k=1;j2<=15;j2++,k++)
        {
            l=r.store[k];
            System.out.print("Question No."+j2+". ");
            ob.hard(l);
            System.out.print("Statics : ");
            System.out.print("\t\tScore : "+score+" pts");
            if(k==1)
            {
                System.out.print("\t\tMoney Won : $1024");
            }
            else
            {
                System.out.print("\t\tMoney Won : $"+money);
            }
            money = money*2;
            if(j2!=15)
            System.out.println("\t\tPlaying For : $"+money);
            System.out.println("Enter Answer : ");
            if(j2==15)
            System.out.print("\n");
            ans = sc.next(".").charAt(0);
            ans1 = new Character(Character.toLowerCase(ans));
            ans2 = new Character(Character.toUpperCase(ans));
            if((""+ob.a[l]).equals(""+ans)||(""+ob.a[l]).equals(""+ans1)||(""+ob.a[l]).equals(""+ans2))
            {
                if(j2!=15){
                    if(ans%3==0)
                    {
                        System.out.println("Correct !!!\n");
                    }
                    else if(ans%3==1)
                    {
                        System.out.println("Superb !!!\n");
                    }
                    else
                    {
                        System.out.println("Awesome !!!\n");
                    }
                }
                else
                    System.out.println("\n\t\t\t\t\t\t****CONGRATULATION****");
                score += 5;
            }
            else
            {
                if(ans%3==0)
                {
                    System.out.println("Wrong Answer !!!\nCorrect Answer is "+ob.a[l]);
                }
                else if(ans%3==1)
                {
                    System.out.println("Hard Luck !!!\nCorrect Answer is "+ob.a[l]);
                }
                else
                {
                    System.out.println("Very Bad !!!\nCorrect Answer is "+ob.a[l]);
                }
                System.exit(0);
            }
        }
    }
}