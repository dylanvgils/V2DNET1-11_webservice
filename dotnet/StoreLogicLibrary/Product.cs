using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace StoreLogicLibrary
{
    [DataContract]
    public abstract class Product
    {
        [DataMember]
        public string Name { get; set; }

        [DataMember]
        public double Price { get; set; }

        public Product(string name, double price)
        {
            Name = name;
            Price = price;
        }
    }
}
