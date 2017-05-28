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
using WpfApp1;
using StoreLogicLibrary;

namespace StoreServiceWpfClient
{
    /// <summary>
    /// Interaction logic for BuyProduct.xaml
    /// </summary>
    public partial class BuyProduct : Window
    {
        public BuyProduct()
        {
            InitializeComponent();
        }

        private void refresh_button_Click(object sender, RoutedEventArgs e)
        {
            RefreshProducts();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            LoggedIn SubWindow = new LoggedIn();
            SubWindow.username_label.Content = username_label.Content.ToString();
            SubWindow.Show();
            this.Close();
        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {
            MainWindow SubWindow = new MainWindow();
            SubWindow.Show();
            this.Close();

        }

        private void kopen_button_Click(object sender, RoutedEventArgs e)
        {
            String Product = "";
            int quantity = 100000;
            try
            {
                var ProductZin = product_listbox.SelectedItem.ToString().Split();
                Product = ProductZin[0] + ' ' + ProductZin[1];
            }
            catch (Exception) {
                MessageBox.Show("Fout: Heb je wel een product geselecteerd?");
                return;
            }

            try
            {
                quantity = Int32.Parse(hoeveelheid_textbox.Text);
            }
            catch (Exception)
            {
                MessageBox.Show("Fout: Heb je wel alleen een cijfer ingevoerd bij het te kopen aantal?");
                return;
            }

            if (StoreLogicService.BuyProduct(username_label.Content.ToString(), Product, quantity))
            {
                RefreshProducts();
                MessageBox.Show("Je hebt " + Product + " succesvol gekocht!");
               
            } else
            {
                MessageBox.Show("Helaas, dit product is uitverkocht of je hebt onvoldoende saldo meer!");
                return;
            }

    }

        public void RefreshProducts()
        {
            product_listbox.Items.Clear();

            foreach (StorageLogicLibrary.StoreProduct p in StoreLogicService.GetProducts())
            {
                product_listbox.Items.Add(p.Name + " kost " + p.Price + " en er zijn er nog " + p.Stock + " aanwezig");
            }
        }
    }
}
