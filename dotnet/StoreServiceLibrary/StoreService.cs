using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using StorageLogicLibrary;
using StoreLogicLibrary;

namespace StoreServiceLibrary
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "StoreService" in both code and config file together.
    public class StoreService : IStoreService
    {
        public string Register(string username)
        {
            Customer cust = new Customer(username);

            if (StoreLogicService.RegisterCustomer(cust))
            {
                return cust.Password;
            }

            return "Error";
        }

        public bool CheckLogin(String username, String password)
        {
            return StoreLogicService.VerifyLogin(username, password);
        }

        public IEnumerable<StoreProduct> GetProducts()
        {
            return StoreLogicService.GetProducts();
        }

        public bool BuyProduct(string username, string productName, int quantity)
        {
            return StoreLogicService.BuyProduct(username, productName, quantity);
        }

        public IEnumerable<CustomerProduct> GetAllOrders(string username)
        {
            return StoreLogicService.GetAllOrders(username);
        }

        public double GetBalance(string username)
        {
            return StoreLogicService.GetBalance(username);
        }
    }
}
