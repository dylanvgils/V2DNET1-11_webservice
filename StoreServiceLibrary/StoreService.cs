using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using StoreLogicLibtary;

namespace StoreServiceLibrary
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "StoreService" in both code and config file together.
    public class StoreService : IStoreService
    {
        public String Register(string username)
        {
            Customer c1 = new Customer(username);

            if (c1 != null)
            {
                var reversedWords = string.Join(" ",
                username.Split(' ')
                    .Select(x => new String(x.Reverse().ToArray())));

                return reversedWords;
            }

            return "Error";
        }

        public Boolean CheckLogin(String username, String password)
        {
            // Roep aan Customers.CheckLogin
            return true;
        }
    }
}
