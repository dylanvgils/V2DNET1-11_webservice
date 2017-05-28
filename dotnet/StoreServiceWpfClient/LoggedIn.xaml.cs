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
using WpfApp1;

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

            // Username en saldo zetten
            SubWindow.username_label.Content = username_label.Content.ToString();
            SubWindow.saldo_label.Content = "€" + StoreLogicService.GetBalance(username_label.Content.ToString());

            // Alle gekochte producten ophalen en zetten
            foreach (StorageLogicLibrary.CustomerProduct p in 
                StoreLogicService.GetAllOrders(username_label.Content.ToString()))
            {
                SubWindow.orders_listbox.Items.Add(p.Name + " | Aantal: " + p.Quantity + " | Gekocht voor: " + p.Price);
            }

            SubWindow.Show();
            this.Close();
        }

        private void buy_product_button_Click(object sender, RoutedEventArgs e)
        {
            BuyProduct SubWindow = new BuyProduct();
            SubWindow.username_label.Content = username_label.Content.ToString();

            foreach (StorageLogicLibrary.StoreProduct p in StoreLogicService.GetProducts())
            {

                SubWindow.product_listbox.Items.Add(p.Name + " kost " + p.Price + " en er zijn er nog " + p.Stock + " aanwezig");
            }

            SubWindow.Show();
            this.Close();

        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {
            MainWindow SubWindow = new MainWindow();
            SubWindow.Show();
            this.Close();
        }
    }
}
