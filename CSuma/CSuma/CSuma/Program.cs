using System;

namespace CSuma
{
    class MainClass
    {
        public static void Main(string[] args)
        {
                Console.WriteLine("-------Integer--------");
                int num1 = Convert.ToInt16(Console.ReadLine());
                int num2 = Convert.ToInt16(Console.ReadLine());
                Console.WriteLine(num1 + num2);
                Console.WriteLine("-------Decimal--------");
                decimal num3 = decimal.Parse(Console.ReadLine());
                decimal num4 = decimal.Parse(Console.ReadLine());
                Console.WriteLine(num3 + num4);
        }
        
    }
}
    

