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

namespace WpfApp1
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            if (StoreLogicService.VerifyLogin(
                gebruikersnaam_textbox.Text,
                wachtwoord_textbox.Text))
            {

            } else
            {
                // Fout wachtwoord
                MessageBox.Show("Deze gebruikersnaam wachtwoord combinatie bestaat niet.");
            }
        }

        private void gebruikersnaam_textbox_TextChanged(object sender, TextChangedEventArgs e)
        {

        }
    }
}
