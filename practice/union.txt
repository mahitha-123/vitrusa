using System;
namespace array{
    class union
    {
        static void Main(string[] arg)
        {
            int m=Convert.ToInt32(Console.ReadLine());
            int[] a=new int[m];
            for(int i=0;i<m;i++)
            {
                a[i]=Convert.ToInt32(Console.ReadLine());
            }
            int n=Convert.ToInt32(Console.ReadLine());
            int[] b=new int[n];
            for(int i=0;i<n;i++)
            {
                b[i]=Convert.ToInt32(Console.ReadLine());
            }
            int k=m+n;
            int[] c=new int[k];
            for(int i=0;i<k-n;i++)
            {
                c[i]=a[i];
            }
            for(int i=k-n;i<n;i++)
            {
                c[i]=b[i];
            }
            Array.Sort(c);
            Console.WriteLine(c[0]);
            for(int i=1;i<k;i++)
            {
                if(c[i]!=c[i-1])
                Console.WriteLine(c[i]);
            }

        }
    }
}