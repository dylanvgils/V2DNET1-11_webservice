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
    public class StoreProduct : Product
    {
        [DataMember]
        public int Stock { get; set; }

        public StoreProduct(string name, int stock, double price) : base(name, price)
        {
            Stock = stock;
        }

        public bool LowerStock(int quantity)
        {
            if (Stock < quantity) return false;
            Stock -= quantity;
            return true;
        }
    }
}
