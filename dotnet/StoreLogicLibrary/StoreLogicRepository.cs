using StoreLogicLibtary;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StorageLogicLibrary
{
    static class StoreLogicRepository
    {

        public static List<Customer> Customers;

        public static Boolean AddCustomer(Customer c)
        {
            if (c != null)
            {
                Customers.Add(c);
                return true;
            }

            return false;
        }
    }
}
