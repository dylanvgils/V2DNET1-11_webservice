using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using StorageLogicLibrary;
using StoreLogicLibrary;

namespace StoreLogicLibrary
{
    public static class StoreLogicService
    {

        public static bool VerifyLogin(string username, string password)
        {
            return StoreLogicRepository.Customers.Any(c => c.VerifyLogin(username, password));
        }

        public static bool RegisterCustomer(Customer c)
        {
            return StoreLogicRepository.GetCustomer(c.Username) == null && StoreLogicRepository.AddCustomer(c);
        }

        public static bool BuyProduct(string username, string productNaam, int quantity)
        {
            try
            {
                var p = StoreLogicRepository.GetProduct(productNaam);
                var c = StoreLogicRepository.GetCustomer(username);

                if (!c.UpdateBalance(p.Price * quantity) || !p.LowerStock(quantity)) return false;
                c.AddOrder(new CustomerProduct(p.Name, quantity, p.Price));
                return true;
            }
            catch (NullReferenceException)
            {
                return false;
            }
        }

        public static IEnumerable<StoreProduct> GetProducts()
        {
            return StoreLogicRepository.GetProducts().Where(p => p.Stock > 0);
        }

        public static IEnumerable<CustomerProduct> GetAllOrders(string username)
        {
            try
            {
                var c = StoreLogicRepository.GetCustomer(username);
                return c.Orders;
            }
            catch (NullReferenceException)
            {
                return null;
            }
        }

        public static double GetBalance(string username)
        {
            try
            {
                var c = StoreLogicRepository.GetCustomer(username);
                return c.Balance;
            }
            catch (NullReferenceException)
            {
                return -1;
            }
        }
    }
}
