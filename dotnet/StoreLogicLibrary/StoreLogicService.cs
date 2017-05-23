using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using StorageLogicLibrary;

namespace StorageLogicLibrary
{
    public static class StoreLogicService
    {

        public static Boolean VerifyLogin(String username, String password)
        {

            foreach (Customer c in StoreLogicRepository.Customers)
            {
                if (c.VerifyLogin(username, password))
                {
                    return true;
                }
            }

            return false;
        }

        public static Boolean RegisterCustomer(Customer c)
        {
            if(StoreLogicRepository.AddCustomer(c))
            {
                return true;
            }

            return false;
        }

        public static Boolean BuyProduct(Product p)
        {
            if (StoreLogicRepository.BuyProduct(p))
            {
                return true;
            }

            return false;
        }
    }
}
