using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;
using StoreLogicLibrary;

namespace StorageLogicLibrary
{
    [DataContract]
    public class CustomerProduct : Product
    {
        [DataMember]
        public int Quantity { set; get; }

        public CustomerProduct(string name, int quantity, double price) : base(name, price)
        {
            Quantity = quantity;
        }
    }
}
