using StoreLogicLibrary;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using StorageLogicLibrary;

namespace StoreLogicLibrary
{
    static class StoreLogicRepository
    {

        public static List<Customer> Customers = new List<Customer>() { new Customer("dylan") };
        public static List<StoreProduct> Products = new List<StoreProduct>() { new StoreProduct("Classic Oreo", 15, .99), new StoreProduct("Vanilla Oreo", 5, 1.05)};

        public static Customer GetCustomer(string username)
        {
            return Customers.FirstOrDefault(c => c.Username.Equals(username));
        }

        public static StoreProduct GetProduct(string productNaam)
        {
            return Products.FirstOrDefault(p => p.Name.Equals(productNaam));
        }

        public static bool AddCustomer(Customer c)
        {
            if (c == null) return false;
            Customers.Add(c);
            return true;
        }

        public static IEnumerable<StoreProduct> GetProducts()
        {
            return Products;
        }
    }
}
