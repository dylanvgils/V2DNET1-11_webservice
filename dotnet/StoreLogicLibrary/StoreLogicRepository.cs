﻿using StoreLogicLibtary;
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
        public static List<Product> Products;

        public static Boolean AddCustomer(Customer c)
        {
            if (c != null)
            {
                Customers.Add(c);
                return true;
            }

            return false;
        }

        public static Boolean BuyProduct(Product p)
        {
            foreach (Product product in Products)
            {
                if (product.Name.Equals(p.Name))
                {
                    product.BuyProduct(p);
                    return true;
                }
            }

            return false;
        }
    }
}