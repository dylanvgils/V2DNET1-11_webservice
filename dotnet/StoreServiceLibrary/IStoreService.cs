using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using StorageLogicLibrary;
using StoreLogicLibrary;

namespace StoreServiceLibrary
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "IStoreService" in both code and config file together.
    [ServiceContract]
    public interface IStoreService
    {
        [OperationContract]
        // Alle functies van de service
        bool CheckLogin(String username, String password);

        [OperationContract]
        string Register(String username);

        [OperationContract]
        IEnumerable<StoreProduct> GetProducts();

        [OperationContract]
        bool BuyProduct(string username, string productName, int quantity);

        [OperationContract]
        IEnumerable<CustomerProduct> GetAllOrders(string username);

        [OperationContract]
        double GetBalance(string username);
    }
}
