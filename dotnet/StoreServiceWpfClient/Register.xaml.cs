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
    /// Interaction logic for Register.xaml
    /// </summary>
    public partial class Register : Window
    {
        public Register()
        {
            InitializeComponent();
        }

        private void registreer_button_Click(object sender, RoutedEventArgs e)
        {
            if (StoreLogicService.RegisterCustomer(new Customer(username_textbox.Text)))
            {
                char[] charArray = username_textbox.Text.ToCharArray();
                Array.Reverse(charArray);

                MessageBox.Show("Het toegewezen wachtwoord: " + new string(charArray));

                MainWindow subWindow = new MainWindow();
                subWindow.Show();
                this.Close();
            }

        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            MainWindow subWindow = new MainWindow();
            subWindow.Show();
            this.Close();
        }
    }
}
