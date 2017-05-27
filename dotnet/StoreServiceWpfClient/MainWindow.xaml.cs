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
using System.Windows.Navigation;
using System.Windows.Shapes;
using StoreLogicLibrary;
using StoreServiceWpfClient;

namespace WpfApp1
{
    /// <summary>
    /// Interaction logic for LogInScreen.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
                InitializeComponent();
        }
        
        private void login_button_Click(object sender, RoutedEventArgs e)
        {
            if (StoreLogicService.VerifyLogin(
                gebruikersnaam_textbox.Text,
                wachtwoord_textbox.Text)) {
                LoggedIn subWindow = new LoggedIn();
                subWindow.username_label.Content = gebruikersnaam_textbox.Text;
                subWindow.Show();
                this.Close();
            }
            else
            {
                // Fout wachtwoord
                MessageBox.Show("Deze gebruikersnaam wachtwoord combinatie bestaat niet.");
            }
        }

        private void register_button_Click(object sender, RoutedEventArgs e)
        {
            Register subWindow = new Register();
            subWindow.Show();
            this.Close();
        }

    }
}
