using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;
using StorageLogicLibrary;

namespace StoreLogicLibrary
{
    [DataContract]
    public class Customer
    {
        [DataMember]
        public string Username { get; set; }

        [DataMember]
        public double Balance { get; private set; } = 10.00;

        [DataMember]
        public string Password { get; set; }

        [DataMember]
        public List<CustomerProduct> Orders { get; set; } = new List<CustomerProduct>();

        public Customer(string username)
        {
            Username = username;
            Password = generatePassword();
        }

        private string generatePassword()
        {
            char[] charArray = Username.ToCharArray();
            Array.Reverse(charArray);
            return new string(charArray);
        }

        public bool VerifyLogin(string username, string password)
        {
            return Username.Equals(username) && Password.Equals(password);
        }

        public bool UpdateBalance(double price)
        {
            if (Balance < price) return false;
            Balance -= price;
            return true;
        }

        public void AddOrder(CustomerProduct p)
        {
            foreach (var o in Orders)
            {
                if (!p.Name.Equals(o.Name)) continue;
                o.Quantity += p.Quantity;
                return;
            }

            Orders.Add(p);
        }
    }
}
