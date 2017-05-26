using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using RecruitmentAppClient.RecAppServiceRef;

namespace RecruitmentAppClient
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void searchButton_Click(object sender, EventArgs e)
        {
            ApplicationsManagerClient am = new ApplicationsManagerClient();

            int method = searchMethodComboBox.SelectedIndex;
            string s = searchTextBox.Text;

            application[] applications = null;

            switch (method)
            {
                case 0:
                    applications = am.searchByApplicant(s);
                    break;
                case 1:
                    applications = am.searchByOffer(s);
                    break;
                case 2:
                    applications = am.searchByRecruiter(s);
                    break;
                case 3:
                    applications = am.searchByStatus(s);
                    break;
            }
            resultsDataGridView.DataSource = applications;
        }

        private void addApplicationButton_Click(object sender, EventArgs e)
        {
            // random for id
            Random r = new Random();

            // create applicant object
            applicant _applicant = new applicant();
            _applicant.name = applicantNameTextBox.Text;
            _applicant.phone = applicantPhoneTextBox.Text;
            _applicant.email = applicantEmailTextBox.Text;

            // create jobOffer object
            jobOffer job = new jobOffer();
            job.contact_email = "career@company.com";
            job.contact_phone = "892-481-142";
            job.min_salarySpecified = true;
            job.max_salarySpecified = true;

            int jobChoice = jobOfferComboBox.SelectedIndex;
            Console.WriteLine(jobChoice);
            switch (jobChoice)
            {
                case 0:
                    job.title = "C++ Deweloper";
                    job.min_salary = 8000.0;
                    job.max_salary = 12000.0;
                    job.description = "Wymagana znajomość systemów wbudowanych i optymalizacji oprogramowania.";
                    job.contract_type = "Umowa o pracę";
                    break;
                case 1:
                    job.title = "Python Deweloper";
                    job.min_salary = 6800.0;
                    job.max_salary = 9500.0;
                    job.description = "Wymagana znajomość frameworku Django";
                    job.contract_type = "Umowa o pracę";
                    break;
                case 2:
                    job.title = "Java Deweloper";
                    job.min_salary = 7000.0;
                    job.max_salary = 10000.0;
                    job.description = "Wymagana znajomość Spring Framework";
                    job.contract_type = "B2B";
                    break;
                case 3:
                    job.title = "ICT";
                    job.min_salary = 3000.0;
                    job.max_salary = 4500.0;
                    job.description = "Konfiguracja sieci, serwerów Linux i Windows";
                    job.contract_type = "Umowa o pracę";
                    break;
                case 4:
                    job.title = "Technical Specialist";
                    job.min_salary = 4000.0;
                    job.max_salary = 6500.0;
                    job.description = "Wymagana komunikatywność i znajomość języka niemieckiego.";
                    job.contract_type = "B2B";
                    break;
                case 5:
                    job.title = "Tester Automatyczny";
                    job.min_salary = 5000.0;
                    job.max_salary = 8000.0;
                    job.description = "Wymagana wiedza w zakresie programowania w języku python.";
                    job.contract_type = "Umowa o pracę";
                    break;
                case 6:
                    job.title = "Tester Manualny";
                    job.min_salary = 3500.0;
                    job.max_salary = 5000.0;
                    job.description = "Testy manualne";
                    job.contract_type = "B2B";
                    break;
            }

            // create application object
            application a = new application();
            a.id = r.Next().ToString();
            a.applicant = _applicant;
            a.jobOffer = job;
            a.recruiter = recruiterComboBox.SelectedItem.ToString();
            a.status = statusComboBox.SelectedItem.ToString();
            a.data_processing_agreementSpecified = true;
            a.data_processing_agreement = dataProcessingAgreementCheckbox.Checked;
            a.date = dateTimePicker.Value.Date.ToString("dd/MM/yyyy").Replace('-', '/');
            Console.WriteLine(dateTimePicker.Value.Date.ToString("dd/MM/yyyy"));
            a.notes = notesRichTextBox.Text;

            ApplicationsManagerClient am = new ApplicationsManagerClient();
            am.addApplication(a);
        }
    }
}
