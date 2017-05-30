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
using StoreServiceWpfClient.StoreServiceHost;

namespace StoreServiceWpfClient
{
    /// <summary>
    /// Interaction logic for Register.xaml
    /// </summary>
    ///
    public partial class Register : Window
    {
        StoreServiceClient storeservice = new StoreServiceClient();

        public Register()
        {
            InitializeComponent();
        }

        private void registreer_button_Click(object sender, RoutedEventArgs e)
        {
            if (username_textbox.Text.ToString() == "")
            {
                MessageBox.Show("Je hebt geen gebruikersnaam ingevoerd.");
                return;
            }

            String wachtwoord = "";
            if ((wachtwoord = storeservice.Register(username_textbox.Text)) != null)
            {
                
                MessageBox.Show("Het toegewezen wachtwoord: " + wachtwoord);

                MainWindow subWindow = new MainWindow();
                subWindow.Show();
                this.Close();
            } else
            {
                MessageBox.Show("De gebruikersnaam is al in gebruikt");
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
