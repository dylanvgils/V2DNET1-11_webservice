using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ServiceModel;
using StoreServiceLibrary;

namespace StoreServiceHost
{
    class Program
    {
        static void Main(string[] args)
        {
            using (ServiceHost host = new ServiceHost(typeof(StoreService)))
            {
                host.Open();
                Console.WriteLine("Service draait");
                Console.ReadKey();
            }
        }
    }
}
