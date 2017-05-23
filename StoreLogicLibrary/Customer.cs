using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StoreLogicLibtary
{
    public class Customer
    {
        public string Username { get; set; }
        public double Balance { get; private set; } = 100.00;
        private string _password;

        public Customer(string username)
        {
            Username = username;
            _password = generatePassword();
        }

        private string generatePassword()
        {
            char[] charArray = Username.ToCharArray();
            Array.Reverse(charArray);
            return new string(charArray);
        }

        public bool VerifyLogin(string username, string password)
        {
            return Username.Equals(username) && _password.Equals(password);
        }

        public bool UpdateBalance(double price)
        {
            if (Balance < price) return false;
            Balance -= price;
            return true;
        }
    }
}
