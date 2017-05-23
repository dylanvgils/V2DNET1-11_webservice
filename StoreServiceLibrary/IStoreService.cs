using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace StoreServiceLibrary
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "IStoreService" in both code and config file together.
    [ServiceContract]
    public interface IStoreService
    {
        [OperationContract]
        // Alle functies van de service
        Boolean CheckLogin(String username, String password);
        String Register(String username);

       
    }
}
