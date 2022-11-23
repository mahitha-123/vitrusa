
using System;
namespace binary
{
    class search
    {
        public static void Main(string[] arg)
        {
            Console.WriteLine("Enter array size");
            int n=Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter Elements");
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=Convert.ToInt32(Console.ReadLine());
            }
            Console.WriteLine("Enter key to search");
            int num=Convert.ToInt32(Console.ReadLine());
            Array.Sort(a);
            int m=n/2;
            if(num==a[m])
            {
                Console.WriteLine(num+"found at"+m+"index");
            }
            else if(num>a[m])
            {
                for(int i=m;i<n;i++)
                {
                    if(a[i]==num)
                    {
                        Console.WriteLine(num+"found at"+m+"index");
                    }
                }
            }
            else if(num>a[m]){
                for(int i=0;i<m;i++)
                {
                   if(a[i]==num)
                    {
                        Console.WriteLine(num+"found at"+m+"index");
                    } 
                }

            }
            else{
                Console.WriteLine("Not found");
            }

        
        }
    }
}