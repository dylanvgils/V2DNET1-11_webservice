using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StorageLogicLibrary
{
    class Product
    {
        private string Name { get; set; }
        private int Stock { get; set; }
        private double Price { get; set; }

        public Product(string name, int stock, double price)
        {
            Name = name;
            Stock = stock;
            Price = price;
        }
    }
}
