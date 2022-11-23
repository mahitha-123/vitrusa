using System;
class Demo
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Enter Array a Elements");
        int n = Convert.ToInt32(Console.ReadLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = Convert.ToInt32(Console.ReadLine());
        }
        Console.WriteLine("Enter Array b Elements");
        int m = Convert.ToInt32(Console.ReadLine());
        int[] b = new int[m];
        for (int i = 0; i < m; i++)
        {
            b[i] = Convert.ToInt32(Console.ReadLine());
        }
        int[] c = new int[n + m];
        int[] d = new int[n + m];
        c = a.Concat(b).ToArray();
        Array.Sort(c);
        int j = 0;
        for (int i=0;i<c.Length-1;i++)
        {
            if (c[i] !=c[i+1])
            {
                d[j++] = c[i];
            }
        }
        d[j++] = c[c.Length-1];
        Console.WriteLine("The elements are: ");
        for(int i=0;i<j;i++)
        {
            Console.Write(d[i]+" ");
        }
        

    }
}