using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;
using StoreLogicLibrary;

namespace StoreServiceWpfClient
{
    /// <summary>
    /// Interaction logic for LoggedIn.xaml
    /// </summary>
    public partial class LoggedIn : Window
    {
        public LoggedIn()
        {
            InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            Orders SubWindow = new Orders();
            SubWindow.username_label.Content = username_label.Content.ToString();
            SubWindow.saldo_label.Content = "€" + StoreLogicService.GetBalance(username_label.Content.ToString());
            foreach(StorageLogicLibrary.CustomerProduct p in StoreLogicService.GetAllOrders(username_label.Content.ToString()))
            {
                SubWindow.orders_listbox.Items.Add(p.Name + " | Aantal: " + p.Quantity + " | Gekocht voor: " + p.Price);
            }

            SubWindow.Show();
            this.Close();
        }
    }
}
