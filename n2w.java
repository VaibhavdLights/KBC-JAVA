import java.util.*;
class n2w
{
    String d,d2;
    void convert(int n,String a)
    {
        String[] units = { "", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", 
        " Eleven", " Twelve", " Thirteen"," Fourteen", " Fifteen", " Sixteen", " Seventeen" ," Eighteen", " Nineteen" };
        String[] tens = { "", "", " Twenty"," Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety" };
        if(n>19)
        {
            d=tens[n/10];
            d2=units[n%10];
            System.out.print(d+" "+d2);
        }
        else
        {
            System.out.print(units[n]);
        }
        if(n>0)
        {
            System.out.print(a);
        }
    }
    void main()
    {
        int n2,i;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("\n\nEnter a number between 0 and 99 OR any negative number to exit.");
            n2=sc.nextInt();
            if(n2>=0 && n2<=999)
            {
                if(n2==0)
                {
                    System.out.println("Number in words : \t Zero");
                }
                else
                {
                    System.out.print("Number in words : \t");
                    convert((n2/100)%10," Hundred");
                    convert((n2%100),"");
                }
            }
            else
            if(n2<0)
            {
                System.out.println("Exiting...");
            }
            else
            {
                System.out.println("out of range.");
            }
        }while(n2>=0);
    }
}