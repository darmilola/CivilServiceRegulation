package com.servicematter.android.civilserviceregulation;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "Finance_Section")
public class Finance_Section implements Parcelable {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "category")
    private String category;

    @ColumnInfo(name = "rules")
    private String rules;

    public Finance_Section(String title,String category,String rules){
        this.title = title;
        this.category = category;
        this.rules = rules;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getRules() {
        return rules;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    protected Finance_Section(Parcel in) {
        id = in.readInt();
        title = in.readString();
        category = in.readString();
        rules = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(title);
        dest.writeString(category);
        dest.writeString(rules);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<Finance_Section> CREATOR = new Parcelable.Creator<Finance_Section>() {
        @Override
        public Finance_Section createFromParcel(Parcel in) {
            return new Finance_Section(in);
        }

        @Override
        public Finance_Section[] newArray(int size) {
            return new Finance_Section[size];
        }
    };

    public static Finance_Section[] populate_finance_rule(){

        Finance_Section section1 = new Finance_Section("Authority","cat1","These Financial Regulations are made and issued by the Treasury Board of Ondo State of Nigeria in exercise of the powers vested in the Treasury Board by Section 7(1) of the Public Administration Law, Cap.122 of the Laws of Ondo State of Nigeria, 2006.");
        Finance_Section section2 = new Finance_Section("Scope and Force of Ondo State of Nigeria Financial Regulations","cat1","Ondo State of Nigeria Financial Regulations are issued to make provision for regulating the management of the financial business of the government and apply to the control and use of public money and stores as defined in Section 2(1) of the Public Administration Law, Cap. 122 of the Laws of Ondo State of Nigeria, 2006 by members of Ondo State Public Service.  They are also intended to regulate Federal funds and stores in so far as they fall to be handled by members of the State Public Service.");
        Finance_Section section6 = new Finance_Section("Issue and Responsibility","cat1","01002.     Ondo State of Nigeria Financial Regulations are issued to make provision for regulating the management of the financial business of the government and apply to the control and use of public money and stores as defined in Section 2(1) of the Public Administration Law, Cap. 122 of the Laws of Ondo State of Nigeria, 2006 by members of Ondo State Public Service.  They are also intended to regulate Federal funds and stores in so far as they fall to be handled by members of the State Public Service.\n" +
                "\n" +
                "01003.      Nothing in these Financial Regulations can over-rule or impair any obligation laid on any person neither by any Ordinance, Act or Law nor in particular the responsibilities of the Auditor-General and the Accountant-General under the Public Administration Law, Cap. 122 of the Laws of Ondo State of Nigeria, 2006.\n" +
                "\n" +
                "01004.      Ondo State of Nigeria Financial Regulations do not apply to Local Governments.  The Financial Regulations for Local Governments are embodied in a separate publication entitled ‘Government Financial Memoranda’.\n" +
                "\n" +
                "01005.      Where there is any conflict between any regulations or circular previously issued and these Financial Regulations, the latter will prevail.  Except in regard to purely transitory matters, circulars amending these Regulations will be incorporated as soon as possible in formal amendment slip or by the reissue of revised Chapters or pages (vide Regulations 01007 (c).\n");
        Finance_Section section7 = new Finance_Section("Method of including amendments Responsibility for amendments","cat1","01007.      Each Financial Regulation has been given a number containing five digits of which the first two indicate the chapter and the last three the number of the individual Financial Regulation within the chapter e.g. Financial Regulation Number 14011 is the eleventh Financial Regulation in Chapter 14.  This arrangement provides for the inclusion of the number of Regulations up to nine hundred and ninety-nine in any one chapter.\n" +
                "\n" +
                "01008. (a) The Financial Regulations should be amended in the normal administrative methods when necessary.\n" +
                "             (b) Within the time frame of ten years, all amendments and circulars should be consolidated into an updated document.\n");
        Finance_Section section10 = new Finance_Section("Definition Financial Authorities","cat1","Financial authorities in Ondo State remain the legal instruments that sanction and guide all public officers in carrying out specific government financial transactions. Such transaction (financial) may include the receipt, custody of accounting for government revenue and earnings; the disbursement of funds including development funds; safekeeping and utilisation of the assets of the government; and the procurement are dealt with here under.");
        Finance_Section section11 = new Finance_Section("Charge of the treasury and (ministry of finance) and Accountant General of the State","cat1","The Public Administration Law, Cap. 122 of the Laws of Ondo State of Nigeria, 2006 has assigned to the Accountant-General the responsibility for all financial business of the State government. Warrants issued by the treasury (ministry of finance) from time to time authorizing the Accountant-General of the State to disburse funds as appropriated by the State House of Assembly (SHoA) are instrument through which the exercises control over the utilisation of public money. This entails that, no made shall be made except on the authority of the warrant duly signed and issued by the treasury (ministry of finance).");
        Finance_Section section12 = new Finance_Section("Financial regulations ","cat1","01012. The state treasury (ministry of finance) and the office of the Accountant-General of the State shall from time to time issue specific financial regulations which shall be in accordance with existing laws and policies of the State government. Such regulations shall generally apply to all the State Public Service including ministries, departments and agencies of government.");
        Finance_Section section13 = new Finance_Section("General Rule 1","cat1","Rule 101.1 \n" +
                "The Financial Rules are established by the Accountant General of the State in accordance with the provisions of the Financial Regulations. They shall govern all the financial management activities of Ondo State. The Accountant General of the State hereby delegates authority and assigns responsibility for the implementation of the Financial Regulations and Rules to all Accounting Directors and Officers across Ministries, Departments and Agencies (MDAs) of Government in the State. In the application of the Financial Regulations and Rules, officers shall be guided by the principles of effective and efficient financial management and the exercise of economy. \n");
        Finance_Section section14 = new Finance_Section("General Rule 2","cat1","Rule 101.2\n" +
                "All employees of the State (permanent, temporary including contractors) are obliged to comply with the Financial Regulations and Rules and with Office Instructions issued in connection with those Regulations and Rules. Any employee who contravenes the Financial Regulations and Rules or corresponding Office Instructions may be held personally accountable and financially liable for his or her actions.\n");







        Finance_Section section15 = new Finance_Section("Responsibility of Accountant-General","cat2",".  (i)   The Accountant-General of Ondo State is the Head of the State Government Accounting Services and the Treasury. He has the responsibility for providing adequate accounting systems and controls in the Ministries, Departments and Agencies of Government.\n" +
                " \n" +
                "              (ii)  The Accountant-General of Ondo State shall inter alia: \n" +
                "\n" +
                "(a)\tserve as the Chief Accounting Officer of receipts and payments of the government of the State;\n" +
                "\n" +
                "(b)\tsupervise the accounts of Ministries, Departments and Agencies of Government;\n" +
                "\n" +
                "(c)\tcollate, prepare and publish statutory financial statements of the State Government and other statements of accounts required by the Commissioner for Finance;\n" +
                "\n" +
                "(d)\tmaintain and operate the accounts of the Consolidated Revenue Fund, Capital Expenditure and Development Fund of the State Government;\n" +
                "\n" +
                "(e)\testablish and supervise Treasury Cash Offices in the Local Government Areas in the State;\n" +
                "\n" +
                "(f)\tconduct routine and in-depth inspection of the books of accounts of State Ministries, Departments and Agencies to ensure compliance with rules, regulations and policy decisions of the State Government;\n" +
                "\n" +
                "(g)\tapprove and ensure compliance with accounting codes, internal audit guides and stock verification manuals of the State Ministries, Departments and Agencies;\n" +
                "\n" +
                "(h)\tinvestigate cases of frauds, assets and store items and other financial malpractices in the Ministries, Departments and Agencies;\n" +
                "\n" +
                "(i)\tprovide financial guidelines through the issuance of treasury circulars,  to ensure strict compliance with existing control systems for the collection, custody and disbursement of public funds and stores;\n" +
                "\n" +
                "(j)\tsupervise and control the computerization of the accounting system in the Ministries, Departments and Agencies to ensure uniformity;\n" +
                "\n" +
                "(k)\torganize training of accounts and internal audit personnel in all State Ministries, Departments and Agencies\n");


        Finance_Section section16 = new Finance_Section("Auditor-General:Responsibility","cat2","(i)     The Officer responsible under the Constitution of the Federal Republic of Nigeria,  for the audit and report on the public accounts of the State, including all persons and bodies established by law and entrusted with collection, receipt, custody, issue or payment of Ondo State monies or with the receipt, custody, sale, transfer or delivery of any securities, store or other property of the government of the State is the Auditor-General for the State, hereinafter referred to as Auditor-General. The Auditor-General shall examine and ascertain in such manner as he may deem fit the accounts relating to public funds and property and shall ascertain whether in his opinion;\n" +
                "\n" +
                "              (a)     the accounts have been properly kept;\n" +
                "\n" +
                "              (b)  all public monies have been fully accounted for, and rules and procedures applied are\n" +
                "                      sufficient to ensure an effective check on the assessment, collection and proper allocation of revenue;\n" +
                "\n" +
                "              (c)   monies have been expended for the purposes for which they were appropriated and the\n" +
                "                       expenditure  has been made as authorized; and \n" +
                "\n" +
                "               (d)   essential records are maintained and the rules and procedures applied are sufficient to\n" +
                "                        safe-guard and control the management of public property and funds\n" +
                "\n" +
                "               (ii)   The Auditor-General shall carry out the following statutory functions:\n" +
                "\n" +
                "               (a)   Financial Audit in accordance with extant laws, in order to determine whether government\n" +
                "                        accounts  have been satisfactorily and faithfully kept;\n" +
                "               \n" +
                "               (b)   Financial Control Audit to ensure that the laid down procedures have been observed in\n" +
                "                        tendering, contracts and storekeeping with a view to preventing waste, pilferage and\n" +
                "                        extravagance.\n" +
                "\n" +
                "             (iii)   The scope of work of the Auditor-General of Ondo State includes:\n" +
                "               \n" +
                "              (a)    audit of the books, accounts and records of the State Ministries, Departments and\n" +
                "                       Agencies; \n" +
                "\n" +
                "              (b)   vetting, commenting on and certifying audited accounts of all parastatals and State public\n" +
                "                        institutions   in accordance with the Constitution of the Federation; \n" +
                "                   \n" +
                "             (c )   audit of the Accountant-General’s Annual Financial Statement;\n" +
                "\n" +
                "             (d)   deliberation, verification and reporting on reported cases of loss of funds, stores, plants and\n" +
                "                      equipment   as stipulated in Chapter 16 of the Financial Regulations;\n" +
                "               \n" +
                "              \n" +
                "             (e)    pre and post auditing of the payment of pensions and gratuities of the retired state officials\n" +
                "\n" +
                "             (f)    periodic checks of Accounts and Records of all Government Statutory Corporations, and\n" +
                "                      other Public Institutions,  including all persons and bodies established by Law of the State  House of Assembly;\n" +
                "             \n" +
                "             (g)   revenue audit of all government institutions\n" +
                "  \n");
        Finance_Section section18 = new Finance_Section("Free Access to Books, Accounts and Information","cat2"," By virtue of the responsibilities and functions of the Accountant-General and the Auditor-General or their Representatives they shall, at all reasonable times, have free access to   books of accounts, files, safes, security documents and other records and information relating to the                          accounts of all Ministries, Departments and Agencies. They shall also be entitled to request                          and receive from members of the Public Service such information, reports and explanation as they  may deem necessary for proper performance of their functions.");
        Finance_Section section19 = new Finance_Section("Accounting Officer: Definition and Responsibility","cat2","(i)  The term ‘Accounting Officer’ means the Permanent Secretary of a Ministry or Head of Department and Agency and other arms of government; who is in full control of, and is responsible for human, material and financial resources which are critical inputs in the management of an organization.\n" +
                "\n" +
                "             (ii) The Accounting Officer shall:\n" +
                "\n" +
                "              (a)  be responsible for safeguarding of public funds and the regularity and propriety of\n" +
                "                     expenditure under his  control;\n" +
                "              \n" +
                "              (b)  observe and comply fully with the checks and balances spelt out in the existing Financial\n" +
                "                     Regulations which govern receipts and disbursement of public funds and other assets\n" +
                "                     entrusted to his care and shall  be liable for any breach thereof and;\n" +
                "             \n" +
                "             (c )  note that his accountability does not cease by virtue of his leaving office and that he may be\n" +
                "                     called upon   at any time to account for his tenure as Accounting Officer;\n" +
                "             \n" +
                "            (iii)  The functions of the Accounting Officer shall include:\n" +
                "           \n" +
                "              (a)   ensuring that proper budgetary and accounting systems are established and maintained to\n" +
                "                      enhance  internal control, accountability and transparency;\n" +
                "                    \n" +
                "              (b)  ensuring that the essential management control tools are put in place to minimize waste\n" +
                "                     and fraud;\n" +
                "                 \n" +
                "              (c) rendering monthly and other financial accounting returns and transcripts to the\n" +
                "                    Accountant-General  of the State as required by the Financial Regulations;\n" +
                "\n" +
                "              (d)  ensuring the safety and proper maintenance of all government assets under his care;\n" +
                "            \n" +
                "            \n" +
                "              (e) ensuring personal appearance before the Public Accounts Committee to answer audit \n" +
                "                     queries to  Ministries, Departments and Agencies;\n" +
                "           \n" +
                "               (f)    ensuring accurate collection and accounting for all public moneys received and expended;\n" +
                "             \n" +
                "              (g)    ensuring prudence in the expenditure of public funds;\n" +
                "              \n" +
                "              (h)   ensuring that proper assessments, fees, rates  and charges are made where necessary;\n" +
                "             \n" +
                "               (i)  ensuring that internal guides, rules, regulations, procedures are adequately provided for\n" +
                "                      security and  effective check on the assessment, collection and accounting for revenue;\n" +
                "               \n" +
                "               (j)    ensuring that all losses of revenues are promptly reported and investigated;\n" +
                "               \n" +
                "               (k)  ensuring that all revenue collected are compared with the budgeted estimates with a view\n" +
                "                       to highlighting  the variances, positive or otherwise and reasons for them; and \n" +
                "               \n" +
                "                (l)  ensuring that any revenue collected are remitted to the appropriate authorities promptly.\n");

        Finance_Section section20 = new Finance_Section("Responsibilities of Political Heads","cat2","The Political Head of a Ministry shall be the Commissioner while that of Non-Ministerial Departments and Agencies shall be the Chairman or as defined in the extant laws that govern their operations.");
        Finance_Section section21 = new Finance_Section("Directives by Political Heads","cat2","               (v) Any directive to the Accounting Officer by a Political Head having financial implications on the Ministries, Agencies or parastatals shall be in writing.\n" +
                "\n" +
                "              (vi) Should the implementation of a directive from a Political Head result in an unauthorized expenditure, and/or contravene rules and regulations, the Accounting Officer shall be held responsible for such unauthorized expenditure unless he has given a written advice. If the advice of the Accounting officer thereon is rejected by the Political Head, the Accounting Officer shall make a written report to the Head of Service in which case he shall not be held responsible.\n");

        Finance_Section section22 = new Finance_Section("Control Over Ministries, Departments and Agencies ","cat2","             (vii)  It shall be the responsibility of the Political Head to supervise and control the activities of his Ministries, Departments and Agencies.\n" +
                "            \n" +
                "           (viii) Pursuant to sub-section (v) above, the Political Head shall exercise the responsibilities for supervision and control of the activities of his Ministries, Departments and Agencies as follow:\n" +
                "                  \n" +
                "                (a)  endorsing the annual budget proposals of his Ministries, Departments and Agencies to the\n" +
                "                        Budget  Office;\n" +
                "                \n" +
                "                (b)  ensuring compliance with the political programmes of Government as they relate to his\n" +
                "                       Ministries,  Departments and Agencies;\n" +
                "               \n" +
                "                (c ) ensuring compliance with  extant rules and regulations and policies of the executive arm of  government\n");
        Finance_Section section23 = new Finance_Section("Accounts Officer","cat2"," The term ‘Accounts Officer’ means an officer who is entrusted with the receipt, custody and disbursement of public money and who is required to keep one of the recognized cash books together with such other books of accounts as may be prescribed by the Accountant-General of Ondo State for transactions which are subsequently embodied in the final accounts rendered by the Accountant-General.");
        Finance_Section section24 = new Finance_Section("Treasury  Cash Officer","cat2","(ii)\tthe term ‘Treasury Cash Officer’ means an officer in charge of Treasury Cash Office in the State who is entrusted with the receipts, custody and disbursement of public money and who is required to keep one of the recognized cash books, the transactions which are subsequently embodied in the accounts rendered by the Accountant-General of the State.\n" +
                "\n" +
                "       (b)  For the avoidance of doubt, all Treasury Cash Officers are Accounts Officers, but a Head of Accounts need not be a Treasury Cash Officer and this distinction must be read into these Regulations.\n" +
                "\n" +
                "02005.   A  ‘Revenue Collector’ means an officer, other than an Accounts Officer, who is entrusted with an official receipt or license book for the regular collection of some particular form of revenue and who is required to keep a cash book (see specimen Revenue Collector’s Cash Book rulings in Appendix 2)\n");
        Finance_Section section25 = new Finance_Section("Imprest-holder","cat2","The term ‘Imprest-holder means an officer other than an Accounts Officer who is entrusted with the disbursement of Public money, vouchers for which cannot be presented immediately to an Accounts Officer and who is required to keep a cash book.");
        Finance_Section section26 = new Finance_Section("Officer Controlling Expenditure","cat2","An officer controlling expenditure is an officer to whom the control of a sub-head, or specified amount of a sub-head, has been delegated by the appropriate Accounting Officer.");
        Finance_Section section27 = new Finance_Section("Self-accounting unit","cat2","Where a Ministry or Department has been constituted a self-accounting unit, the Accounting Officer as defined in Regulation 02003 is charged, in relation to that unit, with the installation and maintenance  of a proper system of accounts in accordance with Regulation 03001.");
        Finance_Section section28 = new Finance_Section("General duties of officer","cat2","Any Accounting Officer, Officer Controlling Expenditure, Treasury Cash Officer, Accounts Officer, Imprest-holder, Revenue Collector or other officer having monetary or financial responsibilities directly connected with or arising from, his official duties, must in so far as the following requirements may be applicable to his particular duties:\n" +
                "\n" +
                "(a)\tsee that the proper system of account as prescribed by or under the authority of the Commissioner for Finance, Ministry of Finance is established and maintained;\n" +
                "\n" +
                "(b)\texercise supervision over the receipt of public revenue and ensure its punctual collection;\n" +
                "\n" +
                "(c)\tpromptly bring to account, under the proper Heads and Sub-Heads of the Estimates or other approved classifications, all monies, whether revenue or other receipts, accounted for by him;\n" +
                "\n" +
                "(d)\tsee that proper provision is made for the safe-keeping of public monies, securities, receipts, licences and valuable documents;\n" +
                "(e)\t exercise supervision over all officers under his authority entrusted with the receipt and \n" +
                "                    expenditure  of  public money, and take precaution, by the maintenance of efficient checks, \n" +
                "                    against the occurrence of   fraud, embezzlement or carelessness;     \n" +
                "\n" +
                "(f)   supervise the expenditure of the Government; take care that no payment is made which is\n" +
                "        not covered by  proper authority, expressed or referred to on the voucher relating to it; and,\n" +
                "        in the case of any apparent extravagance or of any apparent defect in the provision for a\n" +
                "        charge owing to the exhausting or absence of a vote, call attention to the matter in writing\n" +
                "        to the appropriate officer;\n" +
                "           \n" +
                "(g)  promptly charge in his accounts under the proper heads and sub-heads all disbursements\n" +
                "        whether expenditure or other payments;\n" +
                "\n" +
                "\n" +
                "(h)  check all cash in his charge and verify the amounts with the balances  shown in\n" +
                "        the cash book at least once a week;\n" +
                "\n" +
                "(i)   promptly bring to account as a receipt any cash found in excess of the balances\n" +
                "        shown in the cash book;\n" +
                "<\n" +
                "\n" +
                "(j)  promptly make good any minor deficiency not caused by theft or fraud in the cash for  which he is responsible and report in writing details of any such deficiency to the appropriate officer.  Any other deficiency should be reported in accordance with Chapter 16 of these Regulations;\n" +
                "\n" +
                "(k)  promptly prepare such financial statements as are required by Law or by the Accountant-\n" +
                "        General;\n" +
                "           \n" +
                "(l)  see that the authorized maximum cash balance that may be held at one time is not exceeded\n" +
                "       without the approval of the Ministry of Finance;\n" +
                "\n" +
                "(m) report any apparent defect in the procedure of revenue collecting, or any apparent waste, or extravagance in expenditure, which comes to his notice in the course of his accounting duties;\n" +
                "\n" +
                "          (n)  produce when required by the Accountant-General or his deputies, or by the Auditor-General\n" +
                "                  or his deputies, all cash, stamps, securities and Account books, records, or vouchers in his\n" +
                "                  charge;\n" +
                "\n" +
                "           (o) within twenty-one days, reply to formal queries or any other enquiries addressed to him by the Accountant-General or by the Auditor-general of the State giving fully the particulars or information required. Disciplinary action will be taken  against defaulting officers as prescribed by the relevant Civil Service Commission Regulations. In this connection, it is essential that an officer of sufficient seniority is assigned the duty of ensuring that all formal queries received are replied to in accordance with Regulation.\n" +
                "\n");


        Finance_Section section29 = new Finance_Section("Pecuniary and personal responsibilities of officer","cat2","All such officers are personally and pecuniary responsible for the due performance of all financial duties of their Ministries, Departments or Agencies for the proper collection and custody of all public money receivable by them, and for any inaccuracies in the accounts rendered by them or under their authority.  The responsibility of the Auditor-General for checking and reporting any short-comings, in connection with public accounts or finance does not absolve any officer mentioned in Regulation 02009 from his responsibility for complying or securing compliance with regulations within the scope of his own authority.");
        Finance_Section section30 = new Finance_Section("Delegation of duties","cat2","No officer will be relieved of any portion of his responsibility should he delegate to his subordinates the performance of duties which he should have performed himself.   An officer who, acting in accordance with Financial Regulations or other express authority, delegates functions which were assigned in the first place to himself is not thereby relieved of responsibility for showing that he has done everything possible to carry out the function assigned to him in the best way possible.");
        Finance_Section section31 = new Finance_Section("Surprise inspection of accounts","cat2",".The Accountant-General will from time to time cause surprise inspections to be made of accounts of any of the officers referred to in Regulation 02009.  He will report to the Commissioner, Ministry of Finance, any material irregularity connected with the public accounts which may have been brought to his notice. Accounting Officers will likewise cause surprise checks to be made of the accounts of their subordinates.");
        Finance_Section section32 = new Finance_Section("Use of Court Cash Book to be confined to Court Transactions Advice on accounting matters","cat2","Where an Accounts Officer or a Revenue Collector is required by reason of his judicial duties to keep a Court Cash Book, that book must be restricted to the records of the transactions of court;\n" +
                "\n" +
                "02014.  (a)   Accounting Officers should refer to the Ministry of Finance, any matter affecting the accounts of their Ministries or Departments which is not provided for in these regulations.  Any departure from these Regulations will only be permitted with the concurrence of the Ministry of Finance;\n" +
                "\n" +
                "          (b)    All references to accounting routine in Departmental codes or Instructions must receive the prior approval of the Accountant-General.\n");
        Finance_Section section33 = new Finance_Section("Definition","cat3","A Self-Accounting Ministry, Department or Agency is one in which the responsibility for the maintenance of the detailed record of expenditure and revenue and the below-the-line payments and receipts  of Ministry, Department or Agency is delegated to the Accounting Officer and where the Accounting Officer is required to account to the Accountant-General not in detail but in total Head form at monthly intervals, and also to account to him at the close of each financial year in the manner prescribed by the Accountant-General.");
        Finance_Section section34 = new Finance_Section("Approval for Control of Accounting Records","cat3","The approval of the Commissioner for Finance is required before a Ministry, Department or Agency may become self-accounting, and normally this permission will be given only when a fully constituted Internal Audit is operating within the Ministry, Department or Agency concerned (see chapter 29)\n" +
                "\n" +
                "     03003. The Accounting Officer and the Accountant-General in consultation will ensure that the accounts of the Ministry, Department or Agency are placed under the direct control of a suitably competent Accountant.\n");
        Finance_Section section35 = new Finance_Section("Books of Account.","cat3",".   The officer in-charge of accounts shall maintain among others, the following records:\n" +
                "(a)\tPayments Register\n" +
                "(b)\tReceipts Register\n" +
                "(c)\tVoucher/Claims register\n" +
                "(d)\tMain Ledger\n" +
                "(e)\tSubsidiary Ledger\n" +
                "(f)\tPersonal Emoluments Cards\n" +
                "(g)\tRegister of Adjustment Vouchers\n" +
                "(h)\tDepartmental  Vote Expenditure Account\n" +
                "(i)\tCheque Register\n" +
                "(j)\tOther Supporting Accounts and Registers as required by Financial Regulations and additional records which may be necessary to meet the specific requirements of the Ministry, Department or Agency.\n");
        Finance_Section section36 = new Finance_Section("Accountant in charge duties of Retention of document","cat3","\n" +
                "     03005.   The officer in charge of the accounts shall ensure among others, that;\n" +
                "(a)\tAccounts Officers under his control submit their monthly accounts within the prescribed time limit (Financial Regulation 05010).\n" +
                "\n" +
                "(b)\tThe Accounts Officers’ accounts are submitted to him in accordance with the general provisions of Chapter 4.\n" +
                "\n" +
                "(c)\tThe accounts received from Accounts Officers are examined in full detail against the  supporting documents.\n" +
                "(d)\tAll charges to a vote or account for which the Accounting Officer is responsible are authorized and are fully supported by original documents and payees’ receipts.\n" +
                "\n" +
                "(e)\tAn abstract record is maintained to record the monthly and the cumulative yearly total of each sub-head of expenditure over the authorized limit.\n" +
                "                  \n" +
                "(f)\tA consolidated monthly account is forwarded to the Accountant-General within the prescribed time limit.\n" +
                "                     \n" +
                "(g)           Monthly Accounts are produced to the Accounting Officer to show the cumulative\n" +
                "                 yearly total expenditure and revenue of each sub-head under the control of the\n" +
                "                Accounting Officer and unauthorized excess of expenditure under a sub-head as\n" +
                "                above, or under a warrant received from the   Ministry of Finance.\n" +
                "\n" +
                "(h)          There is an adequate system of control over the collection of those revenues which are\n" +
                "                placed under  the responsibility of  the Accounting Officer.\n" +
                "                 \n" +
                "                   (i)            Detailed accounting instructions are issued to   officers to embrace the general\n" +
                "                                    provisions of Financial Regulations and any specific directions from the Ministry of\n" +
                "                                    Finance or the Accountant-General.\n" +
                "\n" +
                "       03006.    The officer in-charge of accounts will ensure that the following documents in original\n" +
                " are retained under adequate security arrangements;\n" +
                "\n" +
                "(a)\tCash Books of all Accounts Officers under his control (see Financial regulations 05003 and 05010)\n" +
                "\n" +
                "(b)\tVouchers for receipts and payments for which the Accounting Officer is responsible.\n" +
                "\n" +
                "(c)\tOther Accounting records required by Financial Regulations and other additional accounting records where appropriate,\n");
        Finance_Section section37 = new Finance_Section("Transaction on behalf of others","cat3","The original documents supporting transactions undertaken on behalf of another Ministry, Department or Agency will be forwarded by the Officer in-charge of accounts to the Accounting Officer of the other Ministry, etc, concerned or the Accountant-General as the case may be, as soon as possible after the close of the month under review.  The originals of the documents and duplicates thereof will be forwarded under a covering schedule (in duplicate).  The schedule will show:\n" +
                " \n" +
                "(i)     Date and amount of each transaction;\n" +
                "(ii)    Voucher reference\n" +
                "(iii)    Classification\n" +
                "                    (iv)   Total of sub-head or account, and the  distribution of schedule with the attachments\n" +
                "                              will be   forwarded direct to the Accounting Officer concerned.\n");

        Finance_Section section38 = new Finance_Section("Receipt of documents","cat3","The self-accounting  Ministry, Department or Agency receiving a schedule of transactions under Financial Regulation 03007 will link the schedule against the relative account total appearing in the account-current, receivable from the Accountant-General, and will then proceed to incorporate the transactions in accordance with Financial Regulation 03010.");
        Finance_Section section39 = new Finance_Section("Payment General","cat3","All Ministries, Departments or Agencies in the State will normally make all payments, through the Head of Accounts.");
        Finance_Section section40 = new Finance_Section("Settlement between Ministries by T.V. /P.R.","cat3","Subject  to the general approval of the Accountant-General, certain revenue and cash receipt, including deductions from personal emoluments, e.g. Income Tax, (P.A.Y.E), Co-operative Thrift and Credit/Loan Society, Rents on quarters will be passed from the collecting officer to the receiving authority by Payment Requests/Transfer Vouchers and to be supported by relevant schedule of deductions where applicable.");
        Finance_Section section41 = new Finance_Section("Payment Register","cat4","Each Accounting Officer is required to keep such books of account as set in Financial Regulation 03004.");
        Finance_Section section42 = new Finance_Section("Receipts Register","cat4","The Payment Request Register (Form A/Cs. Gen.5) shall record all payment requests and ‘debit’ transfer vouchers drawn by the Accounting Officer against his Drawing Account\n" +
                "with the Accountant-General and other payments charged directly to the Drawing Account by the Accountant-General as advised by him in his monthly transcript (see Financial Regulation 05016).  As far as other payments are concerned the date of entry will be the date of receipt in the Ministry, Department  or Agency of the advice from the Accountant-General except at the end of the Financial year when the accounts will be kept open until all outstanding advice are received.\n" +
                "\n" +
                "   04003.   (a)   The receipts register shall record all Receivable Orders and ‘Credit’ Transfer Vouchers issued by the Accounting Officer in favour of his Drawing Account and in addition, all credits received from other authorities allocated to the Drawing Account by the Accountant-General.\n" +
                "\n" +
                "                (b)    As far as the other credits are concerned, the date of entry will be the date of receipt in the department or Ministry of the advice from the Accountant-General, except at the end of the Financial year when the accounts will be kept open until all outstanding advice are received. \n" +
                "\n");
        Finance_Section section43 = new Finance_Section("Register of Adjustment Vouchers.","cat4","04004.   The Register of Adjustment Vouchers shall record all internal departmental adjustments.");
        Finance_Section section44 = new Finance_Section("Claims Register","cat4","The claims Register shall record all claims received for payment and the numbers, dates and amounts of the relative payment requests subsequently issued.  The Claims Register should be scrutinized from time to time by a senior officer.  The Register is a memorandum register designed to ensure that all claims received are subsequently paid.");
        Finance_Section section45 = new Finance_Section("Main Ledger","cat4","The Main Ledger shall contain the following accounts.\n" +
                "          Grant                                      ………………….                             for each Head\n" +
                "          Release                                   ………………….                             for each Head\n" +
                "          Requisitions                         …………………..                            for each Head\n" +
                "          Head Expenditure…  .        …………………..                            for each Head\n" +
                "          Accountant-General.\n" +
                "          Payments\n" +
                "\n" +
                "When necessary the Main Ledger shall also contain the following accounts which must be cleared before 31st December in any year; (where for any reason, this proves impossible, Accounting officers should arrange with the Accountant-General for temporary clearance to the Advance or Deposit Funds)-\n" +
                "         ‘Imprest’ .  .   .  as required\n" +
                "         ‘Suspense’……  as required to carry amounts improperly  debited or credited to the drawing account    \n" +
                "                                    by the Accountant-General,  pending adjustment.\n" +
                "\n" +
                "          ‘Advances’      as required in very special circumstances  for emergency work carried out for\n" +
                "                                    Local Governments, in cases of  Expenditure against Accountant-General’s \n" +
                "                                    deposits pending re-imbursement, and in cases of Agency work under N5000\n" +
                "                                    in value.\n" +
                "\n" +
                "         ‘Credits to \n" +
                "         Un-Allocated Stores”    ‘ as required to carry credits arising from issues of unallocated Stores.\n" +
                "                                                      This Account is only required by Ministry of  Works and Housing\n");
        Finance_Section section46 = new Finance_Section("Subsidiary Ledger","cat4","The subsidiary ledger shall contain accounts for each sub-head/sub-programme of expenditure in respect of which the Accounting Officer is required to render an appropriation\n" +
                " account.  It shall also contain individual accounts for all below-the-line transactions and other extraneous account such as those listed in Financial Regulation 04006 which have been debited or credited to the Drawing Account.\n");
        Finance_Section section47 = new Finance_Section("Sub-Allocation Accounts","cat4"," Subsidiary Sub-head/sub-programme Allocation Accounts shall be kept for each allocation by Release  Warrants.  At the top of each account shall be shown the amount of such Release Warrant issued.");
        Finance_Section section48 = new Finance_Section("Personal Emoluments Cards","cat4","Personal Emoluments Cards (Form A/Cs. Gen.20) shall be kept for every officer whose salary is charged to a Personal Emoluments sub-head of expenditure.  They will also be used to indicate outstanding balances of personal advance accounts.  Balance must be agreed with the Accountant-General at periods not exceeding three months.");
        Finance_Section section49 = new Finance_Section("Departmental Main Accounts Posting","cat4"," As soon as possible after the close of each month, the Accountant-General shall forward to Accounting Officers a Transcript (Form A/Cs. Gen.14 listing encashed payment  requests, debit and credit transfer vouchers and receiving orders which have been classified to the Drawing Account of the respective Ministry.  Included in the transcript will be several documents (both debits and credits) which have been charged or credited direct to a Department’s Drawing Account by the Accountant-General. \n" +
                "\n" +
                "    These transactions will be posted by the Department in the month of account in which they are received, and not in the month the transaction is reflected in the Accountant-General’s transcript. At the end of the financial year, however, Departmental accounts must be kept open to include such transactions within the financial year.\n" +
                "\n" +
                "            (b)    The procedure to be followed upon receipt of the Accountant-General’s Transcript\n" +
                "                      (Form A/Cs. Gen.14), is as follows;\n" +
                "            1.    Compare all documents listed on the Transcript with  the documents sent by the\n" +
                "                  Accountant-General to ensure that those purported to be sent have in fact been received.\n" +
                "\n" +
                "            2.     Post the total in the Accountant-General’s   Transcript into the Payments Account and\n" +
                "                     the   Accountant-General’s Account.  \n" +
                "\n" +
                "            3.     Complete and sign Form A/Cs. Gen.8A and return  this  immediately to the Accountant-\n" +
                "                    General.\n" +
                "              \n" +
                "           4.    Tick off the Payment Requests and Receivable   Orders and Debit and Credit Transfer\n" +
                "                     Vouchers in the columns provided in the Payment Register and Receipts Register.\n" +
                "                     Markings should be made by means of a rubber stamp showing the month of  payment\n" +
                "                     or receipt.\n" +
                "               \n" +
                "             5.    Post to the Head Expenditure and sub-head Expenditure Accounts and the appropriate\n" +
                "                   Register, the details of the documents previously   unknown to the Ministry (as defined\n" +
                "                   in (a) above), which have been charged or credited, direct to a  department’s Drawing \n" +
                "                   Account by the Accountant- General.\n" +
                "            \n" +
                "             6.     The Payments and Receipts Register should now   be examined for Outstanding\n" +
                "                      Payment Requests, etc.  All such Requests’ Vouchers which are  overdue, that were\n" +
                "                      issued before the current month of account, should be extracted and listed, so that\n" +
                "                     their eventual payment or cancellation   can be kept under close view.\n" +
                "\n" +
                "             7.      All Payment Requests which have not been  encashed within one month of the end of \n" +
                "                      the  financial year will be cancelled and the relevant votes will be credited.\n" +
                "N. .B.  Great care must be taken in marking off the documents stated in Regulation 04010 (b) (6) above, as any errors will reflect in the reconciliation statement required to be produced in accordance with Financial Regulation 04010 (J) below \n" +
                "\n" +
                "(c)   Department which have Outstation Paying Units should with the exception of the month of December, arrange for these units to close their months’ accounts in time for Form A/Cs. Gen.4 and the relevant supporting documents to reach Ministry Headquarters by the last day of the month.\n" +
                "\n" +
                "(d)   Transactions occurring between the date of closing each month by outstation units and the last day of each calendar month will form part of the transactions included by these units on Form A/Cs. Gen.4 submitted for the next month.  In the event of any Payment Request issued by outstations during this period being encashed by the Accountant-General during its actual month of issue, such Payment Request must be included in the analysis referred to in (J) below;\n" +
                "\n" +
                "         (e)     Shortly after the close of each month, the Officer-in-charge of Accounts should\n" +
                "                   produce and submit to his Accounting Officer, a monthly Returns of Expenditure in a form   prescribed by the Accountant-General.  The return will be the carbon  backing proof sheet of Form A/Cs. Gen. 41 used in the posting of the sub-head Expenditure Summary Cards (form A/Cs. Gen. 42.)\n" +
                "\n" +
                "(f)     The proof sheet (or Monthly Expenditure Statement) will show, inter alia, the vote            balance brought forward; the total expenditure to date; the expenditure for the current month and current vote balance.  Provision is made for manual entries to show outstanding known liabilities.\n" +
                "\n" +
                "        (g)   In the case of some of the large Ministries, it may be necessary for Accounting Officers to require details of allocation balances against individual spending officers.  This will necessitate an amendment to the system detailed in (e) and (f) above, and must have the prior consent and approval of the Accountant-General.\n" +
                "\n" +
                "(h)   All Monthly Returns of Expenditure must be endorsed with a note to the effect that the expenditure does not include or reflect any extraneous payments and receipts for that month.\n" +
                "\n" +
                "(i)   The balance on the Payment Account shall be analysed at the end of each month.  This analysis shall be submitted to the Accountant-General and the Auditor-General.  Outstanding items in respect of the current month need only be totalled but outstanding items from previous months must be shown in detail.\n" +
                "\n" +
                "(j)     A trial balance of the main ledger accounts, excluding the Personal Advances Account, shall be submitted each month to the Accountant-General and the Auditor-General.\n" +
                "\n" +
                "       (k)   In large Ministries, it may be more expedient to vary the procedure as outlined in (b) (4) and (5) above.  Such variations must, however, have the concurrence of the Accountant-General.      \n");


        Finance_Section section50 = new Finance_Section("Accounts Officers to maintain Cash Book","cat5","05001.   The Treasury Department of the Ministry of Finance has its Headquarters in Akure.  Treasury Cash Offices are established in all Local Government Areas in the State and other places as may be so designated.\n" +
                "\n" +
                "  05002.    The functions of the Accountant-General is as defined in Financial Regulation 02001.\n" +
                "\n" +
                "   05003.    An  Account Officer at a Sub-Treasury or Cash Office of a self-accounting Department  is required to keep a Treasury Cash Book No. 153 or 153A (See Appendix 1) or a Cash Book in such form as may be approved by the Accountant-General in consultation with the Auditor-General, together with such other books of account as may be prescribed by the Accountant-General or the Accounting Officer of the self-accounting Department with the approval of the Accountant-General.\n");
        Finance_Section section51 = new Finance_Section("Numbering of Vouchers and prompt entry in cash book","cat5","An Accounts Officer shall enter promptly in the Cash Book all sums of money received by him or paid by him as a public officer, for whatever service, and every entry shall be supported by a receipt or payment voucher on the prescribed form containing full particulars of the transactions. Vouchers, both receipts and payments should be printed and pre-numbered in triplicate and recorded serially each month in the order in which the amounts are received or paid, and shall be entered in the cash book accordingly. Other accounting  forms may be numbered in accordance with instructions issued by the Accountant-General.");
        Finance_Section section52 = new Finance_Section("Cash specification.","cat5","The cash book shall be ruled off and balanced daily by the cashier who shall enter the cash specification of the balance in hand in the cash book.  The Accounts Officer shall check the cash against the specification and initial the cash book. Bank Cheques held as cash at the close of business shall be paid to the bank or otherwise cleared on the next business day");
        Finance_Section section53 = new Finance_Section("Submission to Accounts Officer","cat5","Revenue expenditure and below-the-line vouchers will be submitted to Accounts Officers in duplicate, except as may be otherwise directed from time to time by the Accountant-General.  The word ‘Revenue and Expenditure’ refer to receipts and payments.  The term ‘below-the-line’ refers to all other receipts and payments.");
        Finance_Section section54 = new Finance_Section("Balance Statement","cat5","The cash book shall be signed at the end of each month by the Accounts Officer whose signature will be taken as certifying the correctness of the entries and balance.  The cash book will be supported by a balance statement as follows: \n" +
                "                                                                                                                                           N  :  K                                  \n" +
                " Opening balance (i.e. the closing balance of the previous month)  \n" +
                " Add total receipts for month.    .     .    .     .    .     .    .    .\n" +
                " Deduct total payment for month  .    ..     .    .     .      .    .\n" +
                " Closing Balance  .   .    ………………………………….\n");
        Finance_Section section55 = new Finance_Section("Bank Re-conciliation","cat5","Where a bank account is maintained, a bank reconciliation statement and bank certificate of balance at the last business day of the month will be attached to the cash book. Bank reconciliation statement shall be prepared as follows, in individual item being specified to explain any variation from the balance shown in the cash book.\n" +
                "\n" +
                "                                                                                                                                      N   :    K\n" +
                "\n" +
                "  Cash book balance as at (date)\n" +
                "          Add cheques issued but unpresented to bank\n" +
                "          Add credits in Bank Statement and not in cash book\n" +
                "          Deduct debits in bank  Statement and not in cash Book\n" +
                "          Deduct uncredited lodgements \n" +
                "         \n");
        Finance_Section section56 = new Finance_Section("Prompt Clearance of items outstanding in Bank Reconciliation.","cat5","Head of Accounts shall ensure that all outstanding items in the bank reconciliation statement are cleared expeditiously (see also Chapter 11).");
        Finance_Section section57 = new Finance_Section("Submission of monthly accounts","cat5","05010.    Account Officers shall submit their accounts by the sixth day of the following month or within such other period as may be instructed by the Accountant-General or the Accounting Officer in the case of a self-accounting Department.  These accounts will consist of the original Cash Book Folios with the original and all copies of supporting vouchers, and such other statements or documents as the Accountant-General may direct. Copies of vouchers will not be retained by Treasury Cash Officer whose records of transactions will be confined to entries in their duplicate Cash Book Folios.\n" +
                "\n" +
                "   05011.   (a)   Vouchers and other accounting documents should be presented to Treasury Cash Officers by Accounts Officers charged with accounting duties in the following manner:\n" +
                "\n" +
                "             Ondo State Transactions:\n" +
                "\n" +
                "             Receipt made/paid by means of a Receivable Order\n" +
                "\n" +
                "             Receipt made by means of receipt Voucher\n" +
                "\n" +
                "             Payments made by means of a Payment Request\n" +
                " \n" +
                "             Payments made by means of a Payment Voucher\n" +
                "\n" +
                "             Other Government Transactions:\n" +
                "             Receipts and Payments\n");
        Finance_Section section58 = new Finance_Section("Examination, acceptance in Account.","cat5",")     Transfer Voucher:    With the exception of those transfers relating to administrative charges on advances, transfer vouchers must be forwarded by Head of Accounts direct to the Accountant-General.  Original and three copies of Transfer Vouchers for administrative charges should be presented to the Treasury Cash Officer when the voucher for the payment of the advance is presented.");
        Finance_Section section59 = new Finance_Section("Monthly Schedule of receipt and payments.","cat5",".     When Treasury Cash Officers’ accounts are received by the Accountant-General, any receipts, payments or transfers insufficiently supported by vouchers or forms shall be disallowed.  Accounts so disallowed shall be charged as a personal advance against the Treasury Cash Officer responsible.");
        Finance_Section section60 = new Finance_Section("Abstract:","cat5","All receipts and payments will be scheduled by the Accountant-General and a monthly schedule of receipts and payments prepared.");
        Finance_Section section61 = new Finance_Section("Monthly Abstract of expenditure.","cat5","An abstract shall be maintained by the Accountant-General to support revenue into, and expenditure out of the Consolidated Revenue Fund and the Capital Expenditure and Development Fund.  Revenue shall be shown by monthly totals for each sub-head and expenditure by the monthly transfers to drawing Accounts.");
        Finance_Section section62 = new Finance_Section("Monthly Statement to Accounting officer","cat5","The Accountant-General shall maintain a monthly abstract of expenditure by the Sub-head in respect of any Head which transactions do not pass through Drawing Account.");
        Finance_Section section63 = new Finance_Section("Adjustments and transfer vouchers","cat5","(a)   As soon as the monthly accounts have been balanced, the Accountant-General will forward to Accounting Officers a detailed statement of the receipts and payments relating to the Drawing Accounts under their control, supported by original vouchers.  He shall also forward similar statements in regard to Accounts other than the Drawing Account which may be maintained by the Accounting Officers.\n" +
                "\n" +
                "         (b)     Accounting Officers shall accept such statements, and after careful scrutiny and checking against their Departmental records, rectify, by means of a Transfer Voucher, any error that may have occurred in the scheduling or classification of the transactions as between one Drawing Account and another.\n");
        Finance_Section section64 = new Finance_Section("Principal Journal and General Ledger","cat5","Adjustments between Funds and Drawing Account and between different drawing accounts shall be effected by means of transfer vouchers which will be processed in accordance with Chapter.10.  Adjustment between Heads or Sub-Heads with the same drawing Account or within the same Fund, if the expenditure is not incurred through a Drawing Account, may be adjusted by an adjustment voucher only, if the adjustment is made in the same financial year as the original accounting entry.");
        Finance_Section section65 = new Finance_Section("Fluctuation in values of securities","cat5",".   The Accountant-General shall maintain a Principal Journal to which the totals of all Ledger Accounts in the monthly schedules of receipts and payments, and the Cash Balances, shall be posted and balanced.  The General Ledger shall be posted monthly from the Principal Journal.  It shall contain the receipt and payment accounts for all the public funds scheduled in the Public Administration Law and such other accounts as the Ministry of Finance shall approve.  A trial balance of the General Ledger shall be made as soon as each month’s account has been posted, and a summary of the accounts, under their principal divisions, but excluding the balance of the amount of Funded Debt and Sinking Fund, shall be published in the Ondo State of Nigeria Gazette.  This summary shall form the statement of the General Assets and Liabilities of the Government.  The Accountant-General shall also publish such other statements as the Ministry of Finance may direct.");

        Finance_Section section66 = new Finance_Section("Statement of accounts of other Government.","cat5",".   At the close of each financial year, each of the securities held on account of the government shall be valued at the current middle market price in Nigerian Stock Exchange on the last working day of the year and the value assigned to each security in the accounts shall be adjusted so as to correspond with these prices.  Any appreciation or depreciation arising from the revaluation, and any profits or losses received from the sale or redemption of such securities, shall be credited or debited to the appropriate fund as provided by the Public Administration Law, Cap. 122, Laws of Ondo State, 2006.");
        Finance_Section section67 = new Finance_Section("Vouchers Substitutes","cat5","(a).  Reimbursement of payment requests paid by the Accountant-General of the Federation/Ondo State will be made by cheque to the Central Bank, based upon actual payments made by the Federal Government during the preceding one month.\n" +
                "\n" +
                "        (b)   Settlements between the Ondo State and other Governments, Corporations, Statutory authorities and similar organizations for services performed on each other’s behalf shall be made by a monthly cheque based upon the transactions actually carried out during the preceding month.\n" +
                "\n" +
                "       (c)     Settlements of the current accounts as maintained between the Accountants-General of the  Federation, and the Ondo State shall, subject to any future changes which must have the concurrence of both Accountants-General, be made by means of a monthly estimate, compiled during the course of any one month for the period to the last day of that month.  Such estimates shall take into consideration remittances, revenue allocations and transactions conducted by either Government on behalf of the other.  Settlement where necessary, shall be effected in the manner and place requested by the creditor Government\n");
        Finance_Section section68 = new Finance_Section("Register of outstanding vouchers","cat5",".  (a)   In the event of all vouchers not being available to accompany the account, a list of outstanding vouchers shall be forwarded (Treasury Form 34) and substitute vouchers (in duplicate) inserted.  Voucher substitutes shall show month and year of account and also contain: \n" +
                "\n" +
                "(i)\tClassification\n" +
                "(ii)\tAmount to be debited\n" +
                "(iii)\tPay Office number\n" +
                "(iv)\tSufficient details to permit identification of the transaction.\n" +
                "\n" +
                "        (b)       A consolidated list of outstanding vouchers in respect of accounts for previous months will also be forwarded with the monthly account.\n");
        Finance_Section section69 = new Finance_Section("Accounts  on self-accounting unit","cat5",".   A register of Outstanding Payment Requests (AG.001) will be kept by each Accounts Officer and marked off as payment requests are received.  Such payment requests when received by the Head of Accounts will be forwarded to support the account at the first opportunity.  The disbursement of public moneys is not properly accounted for until it has been supported by the appropriated payment request. It is the Head of Account’s personal responsibility to obtain acquaintance for the payments out of Public Funds and this responsibility exists until he has obtained the paid payment requests (or unpaid payment requests and cash) (see Regulation 09021).  Should a Head of Accounts be unable to obtain the return of an outstanding payment request, he shall take action as laid down in Regulation 09026.  The procedure for dealing with lost payment voucher is detailed in Regulation 09027.\n" +
                "\n" +
                "    05023.   The Head of Account of a self-accounting Department will bring to account in his main and subsidiary ledgers all transactions conducted by his Accounts Officers and will submit the consolidated account of the Department to the Accountant-General.        \n");





        Finance_Section section70 = new Finance_Section("Accountings procedure for revenue collection","cat6","The individual officers concerned with the collection of particular items of revenue are specified in and Appendix to each year’s published Estimates. Where such an officer is not already an Accounting Officer, he shall be primarily responsible to the Accounting Officer of his Ministry, Department or Agency.  Accounting Officers shall draw up a code of instructions of the procedure to be followed in their organizations to ensure the prompt and correct collection of revenue due.  Each code shall be subject to approval by the Accountant-General after consultation with the Board of Internal Revenue and the Auditor-General and shall thereafter have effect as though it were part of these Financial Regulations.  Where the approval code is at variance with these regulations the code shall prevail.");
        Finance_Section section71 = new Finance_Section("Issue of receipts in acknowledgement by officers in receipt of public money.","cat6","(i) Save where other-wise expressly provided every Account Officer /Treasury Cash Officer or Revenue Collector shall give an e-receipt upon the prescribed form for each sum paid to him.  Every copy of an e-receipt shall bear the stamp of the office of issue.  In no circumstances may temporary unofficial or privately printed receipt be given.");
        Finance_Section section72 = new Finance_Section("Signing of receipt prayer","cat6","(ii) Where a carbon copy of receipt books are used, the payer shall duly sign the space provided for the purpose. Where the payer is unable to sign  his name, he shall be asked by the sub Accounting Officer or revenue collector to make his mark or thumb print, and as such, that mark or thumb print will be witnessed by a third party person/party who will also enter his name, occupation and full residential address. ");
        Finance_Section section73 = new Finance_Section("Details of Transaction to be shown in receipt.","cat6","Printed receipts or licence forms shall contain spaces for the insertion of details in manuscript and the appropriate detail shall be inserted in each space.  The space provided for details of the amount paid shall have inserted in it, such information concerning, quantities or rates, or the relevant invoice, issue vouchers or other documents as shall enable the classification and computation of the amount to be verified.  The particulars of cheques, money and postal orders shall be shown on the receipt or counter-foil.  Licences shall be brought to account directly in cash-books and no covering receipt is required.");
        Finance_Section section74 = new Finance_Section("Notification to the public.","cat6","There shall be exhibited, conspicuously, in every office where public money is received, notices printed in English and in such other language or languages as are most likely to be understood in that locality, to the effect that a numbered official receipt should be obtained for every sum of money paid to the government.");
        Finance_Section section75 = new Finance_Section("General Receipt Book (Treasury 6)","cat6","(a)   Except where receipt or licence books are specially printed for particular purposes, or e-receipt used, General Receipts (Treasury Book 6) shall be used by all Accounts  Officers/Treasury Cash Officers.  These books, each, contain fifty sets of original, duplicate and triplicate receipts.   \n" +
                "\n" +
                "       (b) The original receipts shall be completed in indelible ink and carbonized triplicate booklet shall be used to make the duplicates and triplicates.  The originals shall be handed or delivered to the payers by the officer who issues the receipts.  The duplicate receipts supported by completed. Treasury Forms 15 or 15A shall be used as Cash Book Vouchers and the triplicate receipts shall be retained in the book.\n" +
                "\n" +
                "      (c)     The above regulations for the preparation and disposal of original, duplicate and triplicate copies of receipts shall be applied also to special receipt books or licence books, which are printed and arranged in the same manner as General Receipts Books.\n");
        Finance_Section section76 = new Finance_Section("Counterfoil to be initiated","cat6","Where fixed fee licences or tickets of the counterfoil type are used, the counterfoil of each licence or ticket issued shall be initialed by the issuing officer");
        Finance_Section section77 = new Finance_Section("Revenue Collectors’ receipt","cat6",".  (a)  Except where receipt or license books are specially printed for a particular purpose, e-receipt shall be issued for all payments, Revenue collectors’ Receipts (Treasury Book 6A) shall be used by all Revenue Collectors. These books each contain fifty set of original, duplicate and triplicate receipts\n" +
                " \n" +
                "                (b)  The original receipt shall be completed indelible in ink and carbonized duplicate booklet shall be used to make the duplicates and where applicable triplicates, The original shall be handed or delivered to the payers by the officer who issued the receipts.\n");
        Finance_Section section78 = new Finance_Section("Revenue collectors’ Duties","cat6",".  (a)  Every revenue Collector shall keep a cash book in which all receipts shall be entered without delay in strict serial number order on the day of receipt, and in which all payments to the Accounts Officer/Treasury Cash Officer or the prescribed officer shall be promptly recorded. Such payment shall be made at least once a week unless an alternative specific period is approved by the Accountant-General. The payment shall be supported by a Revenue Collectors’ paying-in form (Treasury 15A) and the duplicate receipts which shall be included by the Accounts Officer/Treasury Cash Officer in his monthly accounts. The Revenue Collectors shall insert in the paying-in form in the Head and Sub-Head to which the collections are to be credited, but the receiving cashier shall in each case verify, so far as he is able, that Head and Sub-Head are correct.\n" +
                "\n" +
                "                 (b)  Where a document itself constitutes a receipt (e.g. vehicle license is used as evidence of receipt) a register showing full particulars shall be maintained by the revenue collecting officer and each entry therein checked and initialed by the responsible supervising officer who shall satisfy himself that all such revenue has been collected and brought to account in the cash book.\n");
        Finance_Section section79 = new Finance_Section("Head of Accounts Duties","cat6","The Heads of Accounts are responsible for calling upon Revenue Collectors to pay in their collections and produce their cash books for examination and thereafter for reporting any failure to do so, to the Accounting Officer.");
        Finance_Section section80 = new Finance_Section("Head of Accounts examination","cat6",".  (a)   When a Revenue Collector produces his cash book for examination to a Head of Accounts/Treasury Cash Officer, the triplicates or counterfoils of  his receipts books shall be checked with the receipt entries in his cash book, and the payment entries with the Treasury/receipts pasted in his cash book.\n" +
                "\n" +
                "       (b)    The Revenue Collector’s cash book must be ruled off and balanced, and cash or its equivalent must be produced in support of any collection not paid in previously.  Examining officers shall stamp, initial and date in ink the last receipt or counterfoil examined by them in cash receipt book after they are satisfied that all monies received have been correctly accounted for.  Measures must be taken at each examination to ensure that no book issued to a Revenue Collector is cancelled for fraudulent purpose; and, as far as possible, all books on issue to a Revenue Collector should be produced for inspection on each occasion.  Any books not produced at one inspection must be seen at the next, or called for immediately if fraud is suspected.\n" +
                "\n" +
                "      (c)     Examining Officers shall also impose any additional checks which circumstances may require.\n");
        Finance_Section section81 = new Finance_Section("Charts of Revenue Collectors","cat6","06011.  The Head of Accounts/Revenue Collector shall maintain up-to-date in his office, a chart listing the individual Revenue Collector under his control. (see specimen chart in Appendix 3)");
        Finance_Section section82 = new Finance_Section("Alterations","cat6","Whenever an incorrect entry has been made on a receipt or licence, the receipt or licence shall be cancelled and a new form completed.  The cancelled forms, including the original, shall be retained in the receipt or  licence book.");
        Finance_Section section83 = new Finance_Section("Departmental Control","cat6","It is the duty of the Accounting Officer responsible for the collection of revenue or other monies due to Government, to ensure that all collections for which he is responsible are correctly and promptly brought to account, whether such collections are payable directly to him, or to an  Accounts Officer/ Treasury Cash Officer or through any other channel. None of the checks which are required by these regulations to be carried out by   Account Officer/ Treasury Cash Officer relieves the Accounting Officer of the ultimate responsibility of verifying that all collections are brought to accounts. In addition to any other checks which an Accounting Officer may consider necessary, Revenue Collectors’ cash books and cash balances shall be checked at irregular intervals and cash book shall be promptly reconciled with Revenue Register or other records in use for the control of collections. Head of Accounts will notify the appropriate\n" +
                "Accounts officer/Treasury Cash Officer and the Auditor-General of the establishment of any revenue collecting office. \n");
        Finance_Section section84 = new Finance_Section("Receipts by officers not in possession of official receipt books","cat6","If any officer who is neither a Revenue Collector nor an Account Officer/Treasury Cash Officer comes into possession of monies in the course of his official duties, he shall lodge them without delay with an Accounts Officer/Treasury Cash Officer who will issue an official receipt.  The lodgement will be supported by a paying-in-form (Treasury Form 15).  When accepting such lodgement, the Accounts Officer/Treasury Cash Officer shall ascertain whether the officer is likely to come into possession of further monies in the course of his duties, and if so, shall arrange for the officer to be supplied with an official receipt book.");
        Finance_Section section85 = new Finance_Section("Collection to be paid to banks","cat6","Subject to Regulation 11014 and unless the Accounting Officer or Head of Accounts/Treasury Cash Officer shall expressly authorize otherwise, at all stations where there is a bank in which the Government account is kept, collections shall be paid in to the Government account at the bank, the relevant bank credit slip supported by completed Treasury Forms 15 or 15A in duplicate being tendered to the Accounts Officer/Treasury Cash Officer in lieu of cash at the earliest moment (see Regulation 11009).");
        Finance_Section section86 = new Finance_Section("Revenue Collection by Accounts officers","cat6"," Accounts Officers/Revenue Collectors or other officers who function as Revenue Collectors will bring their collections to account direct into their cash books, the receipt being acknowledged on General Receipt (Treasury Form 6) or the appropriate receipt or Licence form.\n" +
                "\n" +
                "    (b)    This Regulation is not intended to prevent a division of work in a particular office.  Any officer other than the Accounts Officer/Revenue Collector may, for instance, be supplied with a Revenue Collector’s Receipt Book (Treasury Form 6A) and made responsible for the collection of specified revenue.  Such officer shall be subject to all regulations relating to the conduct of Revenue Collectors.\n");
        Finance_Section section87 = new Finance_Section("Cash Surplus","cat6","Any unexplained surplus cash will be promptly brought to account as a receipt, placed on deposit, and reported to the Accountant-General or, in the case of self-accounting unit, to the Accounting Officer.  Subject to the specific approval of the Accountant-General or the Accounting Officer, as the case may be, such surplus may be withdrawn from deposit to make good a subsequent deficiency, provided that the deficiency is directly attributable to the correction of the error which caused the apparent surplus.   The Accountant-General shall instruct that amounts not so withdrawn from deposit are transferred to Revenue.");
        Finance_Section section88 = new Finance_Section("Deduction from revenue : prohibited","cat6","No deduction shall be made from any revenue collection or other receipts to adjust a previous over credit.  The gross amount received must on all occasions be accounted for in full.");
        Finance_Section section89 = new Finance_Section("Arrears of revenue Annual returns","cat6","(a)    Accounts Officers who are responsible for the collection of revenue shall furnish, annually, a return of Arrears of Revenue due at the 31st December  in each year which remains uncollected by the following 31st January.  The return which shall be submitted by the 31st January, shall be prepared in triplicate, on the prescribed form (Treasury 44); one copy being sent to the Accountant-General, one to the Auditor-General, and the third retained for record purposes.  In case there is no outstanding revenue, a NIL return should be furnished.  The Accountant-General shall list in his Annual ");
        Finance_Section section90 = new Finance_Section("Arrears of revenue: Authority for write off","cat6","(b)     It is emphasized that it is the responsibility of Accounting Officers to follow up outstanding items of revenue and to take all necessary steps to ensure collection or, where collection is clearly impracticable, to apply to the Commissioner for Finance for authority for a write-off, explaining the circumstance.");
        Finance_Section section91 = new Finance_Section("Arrears of income tax: annual returns.","cat6","The Chairman, Board of Internal Revenue shall furnish, in lieu of the Arrears of Revenue Return at the 31st December, a return of all assessments raised up to that date and still outstanding at the 30th June each year.  Such return shall include all assessments in the following categories.\n" +
                "\n" +
                "(a)\tunder objection\n" +
                "(b)\tUnder appeal;\n" +
                "(c)\tUnpaid\n");
        Finance_Section section92 = new Finance_Section("Arrears of income tax: annual returns.","cat6","The return to be rendered by the Chairman, Board of Internal Revenue under Regulation 06020 shall be accompanied by a return showing, in respect of all assessments outstanding at the 31st December, the value:\n" +
                "\n" +
                "(a)\tCollected \n" +
                "(b)\tDischarge on objection or appeal,\n" +
                "       (c )    Written off as irrecoverable under the prescribed authority during the six months to the 30th June.\n");
        Finance_Section section93 = new Finance_Section("All arrears to be reported","cat6","(a)   Arrears of Revenue returns must include all arrears for which the Accounting Officer is responsible and not merely the arrears in the headquarter. Heads of Sections/Departments should be notified of any amounts owing by departmental officers.\n" +
                "\n" +
                "        (b)    Officers responsible for returns of Arrears of Revenue should not overlook the possibility of fraud in cases where there is a considerable increase in the arrears without adequate explanation.  Steps should be taken to test this possibility by the issue of bills through sources than the normal channels.\n" +
                "\n" +
                "        (c)     Arrears of Revenue returns must include all arrears still outstanding from previous years.\n");
        Finance_Section section94 = new Finance_Section("Arrears of Revenue: authority for abandonment.","cat6","(a)   In the case of irrecoverable arrears of revenue, except where other authority is by law established, the authority of the Commissioner for Finance, is required for any abandonment of claims.\n" +
                "\n" +
                "     (b)     In the case of minor arrears of revenue not involving any important principle or negligence on the part of an Accounts Officer/Treasury Cash Officer/Revenue Collector, where the non-collection is due to local circumstances, the Ministry of Finance shall, from time to time furnish to the Auditor-General, a list of cases in which it has been decided to abandon or remit such arrears, with the reason for so doing entered against each case.  Unless the Auditor-General sees cause to challenge the decision in any case, this list shall be accepted as a valid discharge for the Accounting Officer in respect of the non-collection of any amount specified therein.\n" +
                "\n");
        Finance_Section section95 = new Finance_Section("Loss of revenue through negligence.","cat6","If at any time the public revenue sustains a loss by reason of the neglect or fault of any officer, he will be liable to be surcharged with the amount.");








        Finance_Section section96 = new Finance_Section("Annual Estimates","cat7","(a)    Government’s proposals for expenditure are embodied in the Annual Estimates, divided into Heads, each of which is sub-divided into Sub-heads and items.  The division of the expenditure into Heads corresponds to the manner to which funds are to be appropriated by the Appropriation Law, which authorises the expenditure of specified sums for the purpose of each of the Heads of Expenditure.  The purposes of the breakdown of the Estimates into sub-heads and items is to make further information available to the Legislature and ensure firmer control by Government, of expenditure out of the funds voted by the Legislature.\n" +
                "\n" +
                "      (b)    No expenditure may be incurred by any officer on any service, whether or not included in the Estimates, until he has received an authority to do so in accordance with one of the regulations in this Chapter.  Any officer controlling a vote, or part of a vote, allocated to him who incurs expenditure without such authority does so on his sole responsibility and will consequently be held pecuniarily responsible for his actions.\n" +
                "\n" +
                "    07002.  There are two types of expenditure (Recurrent) paid from the Consolidated Revenue Fund.\n");
        Finance_Section section97 = new Finance_Section("Statutory Expenditure and appropriated Expenditure","cat7","     (a)   Statutory Expenditure, which is expenditure charged on the Fund by the Constitution of the Federal Republic of Nigeria (e.g. salaries and allowances of the Chief Judge and Judges of the High Court); and Auditor-General, etc.\n" +
                "\n" +
                "    (b)    Appropriated Expenditure, which is authorized by an Appropriation or Supplementary Appropriation Law authorizing the expenditure in a given year only as contained in the approved Estimates.\n");
        Finance_Section section98 = new Finance_Section("Warrants","cat7","Recurrent Expenditure is paid from the Consolidated Revenue Fund and no such expenditure may be incurred except on the authority of a warrant duly signed by the Commissioner for Finance and without such a warrant the Accountant-General shall not accept in his accounts any charge upon the Consolidated Revenue Fund. The authority of the Commissioner for Finance shall be conveyed in one of the following forms of warrant:\n" +
                "\n" +
                "        (1)     The Annual General Warrant of Recurrent Expenditure\n" +
                "        (2)      A  Provisional General Warrant\n" +
                "        (3)      A Supplementary General warrant of Recurrent Expenditure.\n" +
                "        (4)      A Reserved Expenditure Warrant\n" +
                "        (5)      A Contingencies warrant\n" +
                "        (6)      A Supplementary (Statutory Expenditure Warrant).\n");
        Finance_Section section99 = new Finance_Section("Annual General Warrant.","cat7","Annual General Warrant authorizes the Accountant-General to issue funds to pay for the emoluments and other services provided in the Annual Estimates, and authorizes the officer controlling the expenditure votes to incur expenditure on these purposes.  But the Commissioner for Finance may exclude from the Annual General warrant any item of expenditure over which it is desired to exercise special control, (see Financial regulation 07007).  The original copy of the annual General warrant is addressed to the Accountant-General and a signed copy shall be forwarded to the Auditor-General.   A notification that the warrant has been signed shall also be published in the State Official Gazette.");
        Finance_Section section100 = new Finance_Section("Provisional","cat7","A Provisional General Warrant, which shall be issued if the Appropriation Law has not come into operation at the beginning of financial year provides (for a period of four months, or until the Appropriation Law comes into operation, whichever is the shorter)  for the continuance of the services of the Government at a level not exceeding the level of those services prevailing in the previous financial year.   Any monies so expended shall not exceed the sum specified in the Estimates presented for approval and shall be set off against the respective amounts provided in the Appropriation Law upon its coming into operation.  The original copy of a Provisional General Warrant is addressed to the accountant-General and a singed copy shall be forwarded to the Auditor-General.  A notification that the warrant has been singed shall also be published in the State Official Gazette.");
        Finance_Section section101 = new Finance_Section("Supplementary General Warrant","cat7","A Supplementary General Warrant authorizes the Accountant-General to issue funds to pay for the additional Personal Emoluments and other services which may have been approved in Supplementary Estimates, and for which additional funds have been appropriated by the State executive Council and passed by the Legislature.   \n" +
                "\n" +
                "              The Commissioner for Finance shall exclude from the Accountant-General Warrant the item of expenditure over which it is desired to exercise some control (see Financial Regulations 07007).  The original copy of s Supplementary General Warrant is addressed to the Accountant-General and a signed copy shall be forwarded to the Auditor-General.  A notification that the Warrant has been signed shall also be published in the State Official Gazette.\n");
        Finance_Section section102 = new Finance_Section("Reserved Expenditure Warrant","cat7",".A Reserved Expenditure Warrant authorizes the release of provision included in the approved Annual or Supplementary Estimates, but excluded from the Annual General Warrant or from a Supplementary General Warrant.  The original copy of a Reserved Expenditure Warrant is addressed to the Accountant-General and a signed copy shall be forwarded to the Auditor-General.  The Ministry of Finance will also notify the officers controlling the relevant votes to the release of provision authorized.");
        Finance_Section section103 = new Finance_Section("Payments from (Contingencies) Warrant.","cat7",".   A Contingencies Warrant may be issued in very exceptional cases, where an application for additional provision reveals such a degree of urgency that the issue of funds cannot without serious injury to the public interest be postponed until a Supplementary Appropriation Law can be passed.  Such authority shall be conveyed by the issuance of a Contingencies Fund Warrant to the Accountant-General authorizing him to transfer the necessary funds from the Contingencies Funds to the Consolidated Revenue Fund, and the issuance of a Contingencies Warrant, authorizing expenditure from the Head and Sub-heads concerned. The original copies shall be forwarded to the Auditor-General.  The Ministry of Finance will also notify the officers controlling the relevant votes of the additional expenditure authorized. \n" +
                "\n" +
                "    07009.    In no circumstances will expenditure incurred under this Contingencies Fund procedure be charged, or the relevant vouchers classified to the Contingencies Fund directly, Expenditure authorized under this procedure is subject to the covering approval of the State Executive Council at its next meeting and must for this purpose be included in a Supplementary General warrant which shall be the authority for the Accountant-General to transfer the sum appropriated to the Contingencies Fund.\n");
        Finance_Section section104 = new Finance_Section("Variation in Establishments","cat7","Any variation in the Establishments or rates of allowance authorized for the Civil Service in the Annual or in Supplementary Estimates, must receive the approval of the Office of Establishments and notify the Auditor-General.");
        Finance_Section section105 = new Finance_Section("Supplementary (Statutory Expenditure Warrant).","cat7",".   A Supplementary (Statutory Expenditure) Warrant authorizes, where necessary, additional expenditure over and above that included in the General Warrants or in a Supplementary General Warrant, from votes which are chargeable against the consolidated revenue fund by virtue of the constitution of the Federal Republic of Nigeria or by legislation other than the Appropriation Laws (e.g Statutory Pensions). The original copy of a Supplementary (Statutory Expenditure) Warrant is addressed to the Accountant-General and a signed copy shall be forwarded to the Auditor-General.  The Ministry of Finance shall also notify the officers controlling the relevant votes of the additional expenditure authorized.");
        Finance_Section section106 = new Finance_Section("Authorized Expenditure not to be exceeded","cat7",".     The authority conveyed to the Accountant-General and to officers controlling votes, by Recurrent Expenditure Warrants is Limited to the amounts provided under each sub-head in the approved Estimates and Supplementary Estimates. No Expenditure on any sub-head of the Recurrent Estimates in excess of the provision in the Approved estimates or Supplementary Estimates may be authorized by any officer controlling a votes, without approval of the Ministry of Finance. Such approval will be sought by means of an application for supplementary provision.");
        Finance_Section section107 = new Finance_Section("No revotes of Recurrent Expenditure","cat7","If provision is required to complete payment for an item for which provision was made in the previous year’s Estimates, and which cannot be contained within the current year’s Estimates, an application for Supplementary Provision must be made. An unspent balance on a Recurrent Expenditure vote cannot be revoted.");
        Finance_Section section108 = new Finance_Section("Application Supplementary for provision","cat7","Subject to any special instructions which may from time to time be issued, applications for Supplementary Provision should be submitted to the Commissioner for Finance on General Form A/Cs Gen.108, with a copy to the Auditor-General and, where questions of establishments, gradings or personnel (including all non-established labour) are involved, a copy must be sent to the Office of Establishments.  The Commissioner for Finance shall decide, after consultation where appropriate with the Office of Establishments, whether an application is justified and the provision of additional funds is in public interest.  He shall also decide whether the provision should be included in the Supplementary Estimates to be submitted at the next meeting of the State Executive Council, or the funds provided immediately by means of a Contingencies Warrant.");
        Finance_Section section109 = new Finance_Section("Capital Expenditure from Capital Expenditure and Development Fund.","cat7",".    Capital Expenditure is paid from the Capital Expenditure and Development Fund, and no such expenditure may be incurred except on the authority of a warrant duly signed by the Commissioner for Finance and without such a warrant the Accountant-General shall not accept in his accounts any charge upon the Development Fund.  The authority of the Commissioner for Finance may be conveyed in one of the following forms of warrant.\n" +
                "a.\tThe Development Fund General Warrant\n" +
                "b.\tA Provisional Development Fund General Warrant\n" +
                "c.\tA Development Fund Supplementary General Warrant\n" +
                "d.\tA Development Fund Reserve Expenditure Warrant.\n" +
                "e.\tA Development Fund (Special) Warrant\n");
        Finance_Section section110 = new Finance_Section("Development Fund General Warrant.","cat7","The Development Fund General Warrant authorizes the Accountant-General to issue funds for expenditure on capital projects, as contained in the Annual Estimates, and authorizes the officer controlling the expenditure votes to incur expenditure on these projects.  Such authority will be conveyed after the Capital Expenditure Estimates have received approval by resolution of the State Executive Council.  The Commissioner for Finance may exclude from the Development Fund General Warrant any item of expenditure over which it is desired to exercise special control.  The original copy of the Development Fund General Warrant is addressed to the Accountant-General and a signed copy shall be forwarded to the Auditor-General.  A notification that the warrant has been signed shall be published in the State Official Gazette");
        Finance_Section section111 = new Finance_Section("Capital Development","cat7",".   If the Legislature has not passed the necessary resolution at the beginning of any financial year the Commissioner for Finance may, by Capital Development Fund");
        Finance_Section section112 = new Finance_Section("Fund Provisional Reliase.","cat7","Provisional Release Warrant (Form ODS.7), authorise the issue from the Fund of sums necessary to finance such capital works and items as Executive Council may approve for a period of four months or until the expenditure has been authorized by resolution of the Legislature, whichever is the shorter.  No sum, however, may be issued in respect of any sub-head as it appears in the latest Approved Capital Estimates or Supplementary Capital Estimates approved by the Legislature for the previous financial year – i.e. new works and items at any time in excess of 25% of the project cost.");
        Finance_Section section113 = new Finance_Section("Release Development Fund Supplementary General Warrant","cat7","A Development  Fund Supplementary General Warrant authorizes the Accountant-General to issue funds, and the officers controlling the votes concerned to incur expenditure, on project as sanctioned by the Executive Council in resolutions approving Supplementary Capital Estimates.  The Commissioner for Finance may exclude from the Development Fund Supplementary General Warrant any item of expenditure included in Supplementary Capital Estimates over which it is desired to exercise special control.  The original copy of a Development Fund Supplementary General Warrant is addressed to the Accountant-General and a signed copy shall be forwarded to the Auditor-General.  A notification that the warrant has been signed shall also be published in the State Official Gazette.");
        Finance_Section section114 = new Finance_Section("Development Fund Expenditure Warrant.","cat7","A Development Fund Reserved Expenditure Warrant authorizes the release of provision included in the Approved Annual or Supplementary Capital Estimates, but excluded from the Development Fund General Warrant or from a Development Fund Supplementary General Warrant.  The Original copy of a Development Fund Reserved Expenditure Warrant is addressed to the Accountant-General and a signed copy shall be forwarded to the Auditor-General.  The Ministry of Finance shall also notify the officers controlling the relevant votes of the release of the provision authorized");
        Finance_Section section115 = new Finance_Section("Revote not to exceed balance in Development Fund","cat7","A revote or bringing forward of expenditure must not exceed the balance in the Development Fund remaining after all other expenditure authorized for the year has been provided for.  Expenditure authorized by a Development Fund Supplementary Warrant is required to be reported to the State Executive Council at its next meeting");
        Finance_Section section116 = new Finance_Section("Special Project urgently required.","cat7",".  Financial Regulation 07008 which deals with payments from the Contingencies Fund also applies to cases when capital expenditure not already provided in the Estimates already approved by the Legislature has to be incurred or when additional provision on existing projects is urgently required. \n" +
                "\n" +
                "  07022. Expenditure brought forward must not exceed the remaining balance in the Development fund after necessary provision had been made for all other expenditure authorized for the year. Reporting to the State House of Assembly of every expenditure authorized by the Development Fund Supplementary Warrant is a compulsory requirement");




        Finance_Section section117 = new Finance_Section("Officers Controlling Expenditure.","cat8","All disbursements of Public money shall be made by the Accountant-General on the authority of the appropriate Warrant issued to him and by Accounting officers charged by the Public Administration Law  Cap 122 Laws of Ondo State, 2006, and entrusted with the expenditure of public money falling within the head of expenditure of their Ministry, Department or Agency.  The officers charged with the control of votes will be specified in the Annual Estimates.  The ultimate responsibility to the State Executive Council of the control of votes rests with the Accounting Officer at all times.  Any officer, however, making, allowing or directing any disbursement without proper authority may be held personally responsible for the amount and any officer whose duties require him to render accounts may similarly be held responsible for any inaccuracies in these accounts.");
        Finance_Section section118 = new Finance_Section("Departmental Vote Book.","cat8","It is the duty of every officer controlling a vote to watch the expenditure of his Ministry, Department or Agency, with reference to the amounts provided in the Estimates and he will keep a Vote Book posted up to date in such forms as will clearly show in respect of each sub-head:\n" +
                "\n" +
                "     (1)    In the space provided at the top of the Vote Book form:\n" +
                "(a)\tThe amount sanctioned in the Estimates;\n" +
                "(b)\tThe amount of any additional provision by Supplementary or other Warrants quoting the warrant number;\n" +
                "(c)\tAny reduction of the provision by virement to another sub-head or item quoting the warrant number and such reduction should be shown in red ink or font.\n" +
                "\n" +
                "(2)\tIn the columns provided in the body of the Vote Book:\n" +
                " (a)   Expenditure incurred.\n" +
                " (b)   Any further known liabilities under the Sub-head for the   \n" +
                "         Year.\n" +
                "(d)\tThe balance available.\n" +
                "\n" +
                "           It is the duty of the officer controlling the vote, or such officer acting under his instructions, to investigate fully, without delay, any payments or charges appearing in the schedule submitted by the Accountant-General which do not appear in the Vote Book, with a particular view to the detection of fraudulent payment.\n");
        Finance_Section section119 = new Finance_Section("Entries in Vote Book","cat8","The gross amount, i.e. the actual charge to the vote, of every expenditure voucher shall be entered in the Vote Book.  Similarly all liabilities and commitments shall be entered as soon as they are known or incurred, e.g. indents and requisitions for stores, etc.  Adjustments should be made when actual costs are known.  Sub-heads affected by Supplementary or other Warrants should be adjusted in the Vote Book by addition to, or deduction from the amount hitherto shown as the case may be.");
        Finance_Section section120 = new Finance_Section("Delegation of Responsibility for Expenditure Control","cat8","An Accounting Officer, at his discretion, may delegate the day-to-day expenditure to a subordinate officer by the direct delegation of the whole vote by formal letter or written instruction (see Regulation 08001).  The delegated officer shall then keep the Vote Book in the manner described in Regulation 08002.  A delegated officer may not sub-delegate responsibility for a vote, wholly or partly, without the knowledge and approval of the officer controlling the vote.");
        Finance_Section section121 = new Finance_Section("Departmental Warrants","cat8",".    When it is necessary for an Accounting Officer to authorise other officers to incur expenditure and sing vouchers on his behalf, he will do so by means of a Departmental Warrant (Treasury Form 24) addressed to the officers concerned with copies to the Head of Accounts/Treasury Cash Officer, at the paying station or office.  The officer controlling the vote shall enter the amount of the Warrant in his Vote Book as a commitment.  The officer to whom the Warrant has been issued shall also keep a Vote Book and submit to the officer controlling the vote at the end of every month; a return of expenditure, liabilities incurred and the balance available, together with copies of the vouchers.  The expenditure so incurred shall be reconciled by the officer controlling the vote in accordance with Regulation 08003.");
        Finance_Section section122 = new Finance_Section("Vouchers to be stamped ‘Entered in Vote Book’","cat8",".   At the time of entry in the Vote Book whether as a payment or a liability, all vouchers, indents, etc. should be stamped ‘Entered in Vote Book’ and initialed by the officer responsible for maintaining the Vote Book.  Officers empowered to incur expenditure must ensure by adding their initials against the relative entry that the requisite Vote Book entries are made before the payments are authorized by their signatures to the payment vouchers.");
        Finance_Section section123 = new Finance_Section("Notification of Expenditure to Departments","cat8","The procedure for notification of expenditure to Departments is contained in Financial regulation 04010.");
        Finance_Section section124 = new Finance_Section("Suspicion of fraud.","cat8","In any case where a serious irregularity in a voucher is established or suspected, the vote controlling officer will immediately investigate and report the circumstance, inform the police if fraud is suspected, and take such other action as is necessary to remedy the error or to prevent recurrence.  Where a loss of public funds is revealed, action will be taken in accordance with Chapter 16.  In the event of any unauthorized payment being made in consequence of an incorrect certificate or entry on voucher the certifying officer or the Head of Accounts/Treasury Cash Officer as provided under Financial Regulation 08018 shall be held responsible and the amount may be surcharged against him.");
        Finance_Section section125 = new Finance_Section("Responsibility for signing certificates on vouchers.","cat8","The signature of the officer controlling a vote, or an officer signing for him, certifies to the accuracy of every detail on the voucher.  He shall, therefore, be held responsible that the services specified have been duly performed, that the prices charged are either according to contracts or approved scales, or fair and reasonable according to current local rates, that authority has been obtained as quoted, that the computations and castings have been verified and are arithmetically correct and that the vouchers are those entitled to received payments, and that stores purchased have been duly taken on charge or correctly issued for immediate consumption if they are expendable.");
        Finance_Section section126 = new Finance_Section("Officers authorized to sign vouchers and specimen signatures.","cat8","Officers authorized to sign Payment Vouchers shall be of the rank of Accountant I/Senior Executive Officer (Accounts) or above.  Specimen signatures together with a list of relevant votes chargeable, shall be furnished by Accounting Officers to the Accountant-General and the appropriate Paying Office.");
        Finance_Section section127 = new Finance_Section("Contracts Payments for Authorities Lapse of.\n","cat8","When supplies are furnished or work done under agreement or contract, there shall be attached to the voucher a certificate that the payment are in accordance with terms of the contract or agreement, that as regards supplies, the articles have been received and, in the case of work, that it has been properly done.  In the case of a payment on account, no money shall be claimed than the cost of the work certified to have been performed.  When a deduction is made from the amount payable on a contract in respect of a statutory deductions, the net sum only shall be paid, while the gross shall be charged to the vote\n" +
                ".\n" +
                "08012.   The authority for expenditure conveyed by any of the Warrants contained in Chapter 7 lapses at the end of the financial year to which it relates and any unspent balance required for the completion of a service must be provided for in the Estimates of the year in which the sum will actually be expended, or in case of Capital Expenditure be revoted in accordance with the rules of the Capital Expenditure and Development Fund. Where funds are released but unexpended on an ongoing project, the financial position on it at end of the year should be reflected in the annual accounts.\n");
        Finance_Section section128 = new Finance_Section("Date of charge in accounts governed by date of payment.","cat8","The date of payment governs the date of the record of the charge in the accounts, except as otherwise specifically authorized by the Accountant-General.  In no circumstances may payments be made before they are due for the purpose of utilizing an anticipated saving on a sub-head, nor may the unexpended portion of setting it in reserved to meet impending payments, or be carried to a deposit or suspense account.  On the other hand, expenditure properly chargeable to the account of a given year must, as far as possible be met within the year and must not be deferred or placed in suspense for the purpose of avoiding an excess on the amount provided in the Estimates.  Unallocated stores may not be drawn for use before they are required in order to utilize provision in the Estimates which would otherwise lapse at the end of the financial year.\n" +
                "\n");
        Finance_Section section129 = new Finance_Section("Economy.","cat8","The State Government requires all officers responsible for expenditure to exercise due economy.  Money must not be spent merely because it has been voted and abnormal expenditure at the end of the Financial Year for purposes of spending unexpended balances is strictly prohibited.");
        Finance_Section section130 = new Finance_Section("Classification of expenditure.","cat8","Expenditure shall be classified strictly in accordance with the Estimates, and votes must be applied only to the purpose for which the money is provided.  Expenditure incorrectly charged to a vote shall be disallowed by the Accountant-General.");
        Finance_Section section131 = new Finance_Section("Expenditure; Apportionment of.","cat8","Officers controlling votes and officers acting under their instructions should arrange as far as is practicable to spread expenditure evenly over the year.  When expenditure of exceptionally heavy amounts is anticipated, the Accountant-General should be informed in advance to enable funds to be made available to meet the payment (See Regulation 08005) Whenever possible a portion of each vote should be set aside at the beginning of each year to meet unforeseen contingencies.  This safeguard notwithstanding, officers responsible shall  review the balances in their vote periodically throughout the year and whenever it becomes apparent that commitment shall exceed the amount provided, immediate steps shall be taken to obtain Additional provision.  Officers controlling votes are solely responsible for unauthorized expenditure in excess of the sum allocated.");
        Finance_Section section132 = new Finance_Section("Expenditure incurred where no provision of requisition exists.","cat8","In any exceptional case where it is manifestly in the public interest that expenditure should be immediately incurred, and time does not permit of authority being obtained in the usual way, an officer may on his own reasonability, incur the expenditure; but he shall at once forward an application for additional provision provided with a covering memorandum explaining the reasons which induced him to depart from the ordinary course.   In such case he shall be held personally liable for the expenditure in the event of the payment not being finally approved; and any items which may appear unnecessary or extravagant shall be disallowed and surcharged against him.");
        Finance_Section section133 = new Finance_Section("Responsibilities of Officers in charge of accounts.","cat8","Before making any payment, officers in charge of accounts shall satisfy themselves, so far as they are in position to do so, that;\n" +
                "(i)\tthe payment will not cause an excess on the amount provided in the Estimates as included in the Release Warrant or on the Sub-head to which it is chargeable;\n" +
                "(ii)\tthe expenditure has been authorized by Warrant;\n" +
                "(iii)\tthe information furnished on the vouchers is correct in all particulars and  that the certificate duly signed by the proper officer,\n" +
                "(iv)\tall proper deductions from salaries or pensions or pensions on account of contributions, repayments of advance, remittance or other liabilities have been duly made;\n" +
                "(v)\tAll statutory deductions are made in respect of contract payments.\n");
        Finance_Section section134 = new Finance_Section("Alterations in classification expenditure and instruments","cat8","The classification of a voucher shall not be changed arbitrarily by a Checking Officer or Accounts Officer/Treasury Cash Officer.  Alteration to the classification of a voucher shall only be effected by the signing officer who shall amend his Vote Book accordingly. All instruments of commitments, indents, lops, job order and signed contracts should be entered correctly into the Vote Book as liabilities with the contract stamped. \n" +
                "\n");
        Finance_Section section135 = new Finance_Section("Settlement within Financial Year.","cat8","Officer controlling votes are responsible for ensuring that, as far as possible, payments for service rendered are settled within the Financial Year in which they were rendered.  When necessary reminders should be sent to private parties to forward their claims without delay.  Failure to do this shall not prejudice the private party but the officer who has neglected to press for claims shall be held responsible.  Officers controlling votes must impress this necessity upon their subordinate officers, where the validity of a claim is beyond doubt, payment before the end of the year should not be held over because of imperfections in the voucher which can be corrected after payment.");
















        Finance_Section section136 = new Finance_Section("Payment Requests:use of Vouchers for payment.\n","cat9"," Except in regard to payments against certain votes and funds under the entire control of the Treasury e.g. (pensions, gratuities, advances, deposit, certain payments charged against the State Government) all payments shall be made by Payment Request.\n" +
                "\n" +
                "    09002.     All payment entries in the accounts must be vouched for on one of the prescribed forms.  Vouchers shall be made out in favour of the person(s) to whom the money is actually due.\n");
        Finance_Section section137 = new Finance_Section("Separate Vouchers for separate sub-heads.","cat9","Separate vouchers shall be used for separate sub-heads.  Separate vouchers shall also be used for the payment of different services, particularly in cases where each service and payment has been authorized  separately.");
        Finance_Section section138 = new Finance_Section("Particulars on Vouchers.","cat9",".  (1)   All vouchers shall contain full particulars of each service, such as dates, numbers, quantities, distances and rates, so as to enable them to be checked without reference to any other document, and shall invariably be supported by relevant documents such as Local Purchase Orders, Invoices, Special Letter of Authority, Time Sheets, etc.  Where such documents cannot be conveniently attached e.g. bulky files, a clear reference to the supporting document or information shall be stated on the voucher.\n" +
                "\n" +
                "(2)     The following particulars, as may be applicable, must be given on vouchers;\n" +
                "         (a)    Reference to contracts and details of any previous payment(s) under a contract;\n" +
                "        \n" +
                "         (b)    Reference to the numbers, dates and stations of deposits  \n" +
                "                   vouchers in case of payments;\n" +
                "         \n" +
                "          (c)    Reference to special authorities (e.g. for advances or\n" +
                "                  any unusual payments);\n" +
                "\n" +
                "          (d)    Reference to the appropriate Release Warrant;\n" +
                " \n" +
                "          (e)     The appropriate authority for expenditure as under.\n" +
                "\n" +
                "(i)\tThe Development Fund General Warrant\n" +
                "(ii)\tA Provisional  Development Fund General warrant\n" +
                "(iii)\tA Development Fund Supplementary General Warrant\n" +
                "(iv)\tA Development Fund Reserve Expenditure Warrant\n" +
                "(v)\tA Development Fund (Special) Warrant");
        Finance_Section section139 = new Finance_Section("Preparations of Payment Vouchers.\n","cat9","The following rules will be strictly observed in the preparation of Payment Vouchers.\n" +
                "\n" +
                "(a)\tVouchers shall be made out either in ink or indelible pencil or shall be typewritten.  All copies must be legible.  The totals of all vouchers shall be written in ink in words as well as in figures.\n" +
                "\n" +
                "(b)\tNo erasures of any kind whether in typescript or manuscript shall be allowed.\n" +
                "\n" +
                "(c)\tA single thick horizontal line shall be drawn immediately before and immediately after the Naira(N) figure. Where it appears in words,  Spaces shall not be allowed.  Where the Naira (N) figures is nil the word ‘nil’ shall be entered in the appropriate space.\n");
        Finance_Section section140 = new Finance_Section("Vouchers signing of\n" +
                "Certificates: Signing of\n" +
                "\n" +
                "Vouchers Duplicate etc copies.\n","cat9","The originals only of payment vouchers shall be signed in full in ink or indelible pencil by the certifying officer and the payee.  Copies shall be initialed or stamped.  Any name stamp used for copy vouchers must be strictly safeguarded by the officer concerned. \n" +
                "\n" +
                "    09007.   Each certificate on a payment voucher shall be signed separately. Signature shall not be written across one or more certificates.\n" +
                "\n" +
                "   09008. Duplicate and triplicate, etc. copies shall be clearly marked ‘Duplicate’ ‘Triplicate,’ ect.  Copies shall not be accepted as payment vouchers.\n");
        Finance_Section section141 = new Finance_Section("Vouchers: Alterations in. Vouchers: duties Accounts Officer/Treasury Cash Officer\n","cat9",".    An Accounts Officer/Treasury Cash Officer may not make payment against a voucher unless:\n" +
                "\n" +
                "        (a)     The voucher is certified for payment by the officer     \n" +
                "                   who is authorized to do so.\n" +
                "\n" +
                "       (b)      The voucher is stamped checked and passed for         \n" +
                "                   Payment at………………………..only, and is duly \n" +
                "                                  (name of station)\n" +
                "                  signed to that effect by the checking officer in the \n" +
                "                  appropriate place on the voucher.\n" +
                "\n" +
                "         (c)    Less than three months has elapsed since the voucher \n" +
                "                   was  signed.\n" +
                " \n" +
                "(d)\tThe voucher (other than a checked and passed voucher received under registered cover as provided for in Regulation 09011) is accompanied by a schedule in the following form: \n");
        Finance_Section section142 = new Finance_Section("Payments identification of payees.","cat9","Payment shall be made only to the persons named in the vouchers or their properly authorized representatives.  Paying officers must satisfy themselves that the person claiming the  payment is the person authorize to receive the amount and it is the duty of the Ministry, Department or Agency authorizing payment to furnish proof of identity if required.  This can be done by a member of the Ministry, Department or Agency attesting payment of the Treasury or Cash Office.  Vouchers must be receipted in the presence of the paying officer by the payee or his properly authorized representative at the time payment is actually made, and the amount in the receipt completed in words.");
        Finance_Section section143 = new Finance_Section("Payments when witness necessary","cat9","When a payee is illiterate, his mark must be witnessed by a literate official other than the paying officer.  A description of the witness should be given e.g. rank, title, etc.  on the voucher.  When necessary a witnessed sub-receipt bearing the names and marks of the payees shall be attached to the voucher.  Receipts in vernacular characters should like-wise be certified and witnessed.");
        Finance_Section section144 = new Finance_Section("Payments to Legal representatives.","cat9","When payments are made to legal representatives, authorities such as powers of attorney, letters of administration, etc. must be presented to the Accounts Officer/Treasury Cash Officer for inspection and a certificate that they have been seen appended to the voucher.   If possible, the authority itself should be attached to the voucher.  The only exception to this rule is that provided for by Section 59 of the Administrator-General’s Law, Vol. 1 Cap 5, Laws of Ondo State of Nigeria, 2006 whereby the Accountant-General has authority to make payment to the legal personal representative of a deceased person when the amount of the estate does not exceed twenty thousand Naira.  See Chapter 21- Estates of Deceased Officer.");
        Finance_Section section145 = new Finance_Section("Payments to Firms.","cat9","Payment to Firms may be made by the Accounts Officer/Treasury Cash Officer, on receipt of a letter authorizing payment to the representative names, whose certified passport photograph together with his specimen signature must have been deposited with the Accounts Officer/Treasury Cash Officer.  Where printed receipts are issued by Firms, such receipts shall be affixed to the voucher.  Payments to\n" +
                "Firms, where bank account is kept, shall be made only by cheques crossed ‘not negotiable’, ‘Account Payee only’, in favour of the Firm.\n");
        Finance_Section section146 = new Finance_Section("Payment to Local Governments","cat9",".   Every payment to a Local Government must be supported by the official receipt of the Local Government concerned.\n" +
                "\n" +
                "   09016.    When it is impracticable to obtain receipts for petty disbursements, a certificate to the effect must be given on the face of the voucher by the paying officer.\n");
        Finance_Section section147 = new Finance_Section("Certificate of  Honour","cat9","A Payment voucher payable to, or receipted by any Government officer in his official capacity must be supported by an official receipt issued by him to ensure that the amount paid shall be properly brought to account.");
        Finance_Section section148 = new Finance_Section("Payments officially received. Stamp duty when necessary.\n","cat9","\t(e)      The serial number of the schedule referred to in (d)  above and the departmental number of the payment vouchers concerned follow immediately from the numbers on the last schedule previously received from that Departmental Office of issue.\n" +
                "\n" +
                "  (f)     The voucher is stamped, entered in the Vote Book and signed by officer responsible for keeping the Vote Book.  See Financial Regulation 08006.\n" +
                "\n" +
                "   09011.   Payment shall be made only to the persons named in the vouchers or their properly authorized representatives.  Paying officers must satisfy themselves that the person claiming the  payment is the person authorize to receive the amount and it is the duty of the Ministry, Department or Agency authorizing payment to furnish proof of identity if required.  This can be done by a member of the Ministry, Department or Agency attesting payment of the Treasury or Cash Office.  Vouchers must be receipted in the presence of the paying officer by the payee or his properly authorized representative at the time payment is actually made, and the amount in the receipt completed in words.\n" +
                "\n" +
                "   09012.    When a payee is illiterate, his mark must be witnessed by a literate official other than the paying officer.  A description of the witness should be given e.g. rank, title, etc.  on the voucher.  When necessary a witnessed sub-receipt bearing the names and marks of the payees shall be attached to the voucher.  Receipts in vernacular characters should like-wise be certified and witnessed.\n" +
                "\n" +
                "   09013.   When payments are made to legal representatives, authorities such as powers of attorney, letters of administration, etc. must be presented to the Accounts Officer/Treasury Cash Officer for inspection and a certificate that they have been seen appended to the voucher.   If possible, the authority itself should be attached to the voucher.  The only exception to this rule is that provided for by Section 59 of the Administrator-General’s Law, Vol. 1 Cap 5, Laws of Ondo State of Nigeria, 2006 whereby the Accountant-General has authority to make payment to the legal personal representative of a deceased person when the amount of the estate does not exceed twenty thousand Naira.  See Chapter 21- Estates of Deceased Officer.\n" +
                "\n" +
                "     09014.    Payment to Firms may be made by the Accounts Officer/Treasury Cash Officer, on receipt of a letter authorizing payment to the representative names, whose certified passport photograph together with his specimen signature must have been deposited with the Accounts Officer/Treasury Cash Officer.  Where printed receipts are issued by Firms, such receipts shall be affixed to the voucher.  Payments to\n" +
                "Firms, where bank account is kept, shall be made only by cheques crossed ‘not negotiable’, ‘Account Payee only’, in favour of the Firm.\n" +
                "\n" +
                "   09015.   Every payment to a Local Government must be supported by the official receipt of the Local Government concerned.\n" +
                "\n" +
                "   09016.    When it is impracticable to obtain receipts for petty disbursements, a certificate to the effect must be given on the face of the voucher by the paying officer.\n" +
                "\n" +
                "   09017.   A Payment voucher payable to, or receipted by any Government officer in his official capacity must be supported by an official receipt issued by him to ensure that the amount paid shall be properly brought to account.\n" +
                "\n" +
                "   09018.   Receipts given on payment vouchers are liable to Stamp Duty in accordance with the Stamp Duties Act, Cap. S.8, Laws of Federal Republic of Nigeria, 2004.  the following tables show briefly the nature and amount of the payments which are:\n" +
                "\n" +
                "(i)\tliable and (ii)  exempt from Stamp Duty. \n" +
                "\n" +
                "The table is not comprehensive and in doubtful cases references should be made to the Law.  It should be noted that a receipt given without being stamped may only be stamped after execution under penalty.\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Payments identification of payees.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Payments when witness necessary\n" +
                "\n" +
                "\n" +
                "\n" +
                "Payments to Legal representatives.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Payments to Firms.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Payment to Local Governments\n" +
                "\n" +
                "\n" +
                "\n" +
                "Certificate of  Honour\n" +
                "\n" +
                "Payments officially received.\n" +
                "Stamp duty when  necessary.\n" +
                "\n" +
                " \n" +
                "(i)    LIABLE TO N50.00 STAMP DUTY:\n" +
                "\n" +
                "                Nature Of Payment\n" +
                "\n" +
                "\n" +
                "1.\tReceipts given for goods or services rendered.\n" +
                "\n" +
                "2.\tAdvances to purchase motor vehicles.\n" +
                "\n" +
                "3.\tRefunds of amounts deposited in the Treasury unless the receipts \n" +
                "            For such payments are exempted under Table (ii).\n" +
                "\n" +
                "4.\tFees drawn by officials outside their normal salaries, e.g. Language Examiners, etc.\n" +
                "\n" +
                "5. \tGratuities for passing Language examinations.\n" +
                "\n" +
                "6.\tComposite vouchers for payment of several separate amounts. \n" +
                "\n" +
                "\n" +
                "(ii)\tEXEMPT FROM STAMP DUTY:\n" +
                "NATURE OF PAYMENT\n" +
                "\n" +
                "1.\tPayment for goods supplied or services rendered.\n" +
                "\n" +
                "2.\tAdvances of salary.\n" +
                "\n" +
                "3.\tSalaries, duty pay, seniority pay.\n" +
                "\n" +
                "4.\tWages\n" +
                "\n" +
                "5.\tLeave Bonus, Disturbance, traveling and Transport Allowances.\n" +
                "\n" +
                "6.\tRefund of out-of-pocket expenses incurred and paid by officers in the course of their duties.\n" +
                "\n" +
                "7.\tPensions, Gratuities, Compassionate Allowances\n" +
                "\n" +
                "\n" +
                "Condition under which duty is due\n" +
                "\n" +
                "If the amount is N5,000.00 or over, a N50.00 stamp is required in respect of each signature acknowledging an amount liable to Stamp Duty (where \n" +
                "the arrangement of voucher makes such action possible amounts payable to the same person may be bracketed together and be receipted by one signature)\n" +
                "\n" +
                "Conditions under which no duty is payable\n" +
                "\n" +
                "\n" +
                "If the amount is under, N5,000.00.\n" +
                "\n" +
                "\n" +
                "Exempts under all conditions\n" +
                "\n" +
                "Exempts under all conditions \n" +
                "\n" +
                "Exempts under all conditions \n" +
                "\n" +
                "Exempts under all conditions \n" +
                "\n" +
                "\n" +
                "\n" +
                "Exempts under all conditions \n" +
                "\n" +
                ",\n" +
                "\n" +
                "Exempts under all conditions \n" +
                "\n" +
                "\n" +
                "\n" +
                "8.\tRepayments of prisoner’s property and sums deposited in the treasury under the provisions of the Minerals Ordinance\n" +
                "\n" +
                "9.\tRefunds of over payment to Government.\n" +
                "\n" +
                "10.\tCustoms duties draw back\n" +
                "\n" +
                "11.\tCustoms duties refunded upon certificates of over-entry or upon re-importation certificate.\n" +
                "\n" +
                "12.\tReceipts given by officers on behalf of Government, in their official capacity.\n" +
                "\n" +
                "13.\tImprests.\n" +
                "\n" +
                "14.\tAdvances (other than advances of salary) where the officer receives no personal benefit there from.\n" +
                "\n" +
                "15.\tReceipt given by accused person for money taken from him on arrest.\n" +
                "\n" +
                "16.\tDuplicate receipt required by Government.\n" +
                "\n" +
                "17.\tComposite vouchers for payment of several separate amounts. \n");



        Finance_Section section149 = new Finance_Section("Payments by cheque","cat9","Where banking facilities are available, all payments to the public of N5,000.00 or more must be made by cheque crossed ‘Account Payee only’ Accounts Officers/Treasury Cash Officers are permitted to use their discretion in case of emergency.");
        Finance_Section section150 = new Finance_Section("‘PAID’ Stamps","cat9","Immediately after payment has been made, the paying officer shall stamp the original voucher and all copies, all invoices, warrants or other supporting documents ‘PAID’ and insert the relevant Payment Request numbers.");
        Finance_Section section151 = new Finance_Section("Vouchers:  Receipt of.","cat9","   09021.    Vouchers and Payment Requests should not be receipted before payment is actually made.\n" +
                "      When Payment Requests are presented by a Public Officer to an Accounts Officer/Treasury Cash Officer for the purpose of obtaining cash to make the payments (e.g. salaries) elsewhere the Payment Requests  shall  be numbered, stamped ‘PAID’ and entered in the Accounts Officer/Treasury Cash Officer’s cash book.\n" +
                "      When vouchers are presented by a Government Officer to an Accounts Officer/Treasury Cash Officer for the purpose of obtaining cash by means of a Payment Request, the vouchers shall be submitted in duplicate.  The originals shall be returned to the officer concerned for receipt and the duplicates shall support entries in the accounts until the originals are received back duly receipted by the payee.\n");


        Finance_Section section152 = new Finance_Section("Payment to be effected within seven days","cat9",".   Vouchers withdrawn against cheque/cash order forms must be returned to the Cash Office within seven days.  If payment cannot be effected within that period the cash shall be paid into the Cash Office along with the unreceipted payment voucher.  A Treasury Receipt will be issued for the amount of cash returned and the cheque/cash order form released.  Particulars of the Treasury Receipt shall be endorsed on the unreceipted voucher as evidence that the amount has been refunded.");
        Finance_Section section153 = new Finance_Section("Deductions on payment vouchers","cat9","Advances recovered, or any other sums recoverable or due to be deducted from a payment, must be inserted on the Payment Voucher.  The net amount only shall be paid, and the deductions accounted for by a Transfer Voucher debiting the vote to which the net payment has been charged and crediting the account to which the deduction relates.");
        Finance_Section section154 = new Finance_Section("Inter-State Payments.","cat9",".   All instructions for payment to the other States of the Federation must emanate from the Headquarters of the Department concerned.  The Accounting Officer shall submit to the Accountant-General correctly and fully completed Payment Vouchers (duty supported with Receipt Vouchers if necessary) under cover of Accounts Gen. 55 – Departmental schedule of Payment Vouchers.  At the same time as a Payment Voucher is forwarded to the Accountant-General as above, the payee must be notified by means of Accounts Gen. 56 – Outstation Payment Vouchers Advice, duly singed by the same officer authorizing the Payment Voucher.\n" +
                "\n" +
                "     At the end of each month, the Accountant-General of the receiving State shall send the Payment Voucher(s) to the Treasury, Akure which shall arrange reimbursement direct.  The Payment Vouchers shall then be incorporated into the Departmental Drawing Account in the Treasury and forwarded to the Accounting Officer duly listed on Accounts Gen. 14 – Transcript.\n" +
                "\n" +
                "     Accounts Gens.55 and 56 prescribed earlier are obtainable on request from the Accountant-General.  Both forms are security documents and must be taken on charge in the Departmental Stock Register and kept under lock and key by the holder. \n");
        Finance_Section section155 = new Finance_Section("Officers drawing cash.","cat9","Officers authorized to draw cash/cheques should not normally be below the rank of Accountant II/ Higher Executive Officer (Accounts).");
        Finance_Section section156 = new Finance_Section("Outstanding Vouchers return to paying officers","cat9","If a voucher is outstanding the following steps will be taken to secure its return:\n" +
                "\n" +
                "(a)\tNot later than seven days after payment, the paying Accounts Officer/Treasury Cash Officer shall apply in writing to the departmental Officer responsible, requesting the immediate return of the receipted voucher or the unreceipted voucher and equivalent cash as the case may be.\n" +
                "\n" +
                "(b)\tNot later than seven days after issue of the first written application, the paying Head of Accounts/Treasury Cash Officer shall again apply in writing to the Departmental Officer for the return to the outstanding voucher, with a copy to the Accounting Officer concerned.\n" +
                "\n" +
                "(c)\tIf the voucher is still outstanding seven days after the issue of the second written application, the paying Head of Accounts/Treasury Cash Officer shall notify the Accounting Officer who shall immediately inform the Ministry of Finance.  The Departmental Officer who withdrew the voucher may be held responsible for the amount of the outstanding voucher.\n" +
                "\n");
        Finance_Section section157 = new Finance_Section("Loss of Payment Request\n" +
                "Voucher.\n","cat9",".    If a payment request voucher is reported lost, prompt investigation shall be made. It must be established immediately whether payment has been made or whether the cash drawn is still in hand.  If a loss or fraud had occurred, action shall be taken in accordance with Chapter 16.  Where the Accounting Officer is satisfied that no loss or fraud has taken place he shall submit a report on the circumstances of the loss of the voucher to the Accountant-General.  The report shall be accompanied by a copy of the voucher with the following certificate thereon singed by the authorizing officer:\n" +
                "\n" +
                "    “I am the officer,\n" +
                "     *   (a)      who signed the original voucher\n" +
                "     *  (b)      now controlling the Vote and I certify that to the best of my knowledge and belief this is a true copy of  the original voucher and that no fraud has been perpetrated”. The Accountant-General shall consider the circumstances of the case and on behalf of the Commissioner for Finance rule whether the copy voucher is admissible to support the accounts.\n" +
                "----------------------------\n" +
                "     *    Whichever is inapplicable to be deleted\n" +
                "     \n");








        Finance_Section section158 = new Finance_Section("Nature of transactions to be effected by adjustment.","cat10","In the course of Government Accounting practice, many transactions can be effected more conveniently and expeditiously by a transfer from one account to another by means of a Transfer or Adjustment Voucher, e.g. payments or inter-departmental services, transfer of deposits or other accrued funds to revenue, correction of accounting errors and the ultimate allocation of Unallocated Stores.");
        Finance_Section section159 = new Finance_Section("Transfer Vouchers.","cat10","Transfer Vouchers (Form A/C. Gen 34 and 34A are documents used to effect charge adjustments when two or more Drawing accounts are involved, and are raised when it is necessary.\n" +
                "\n" +
                "(a)\tTo correct a mistake on the scheduling of redeemed Payment Requests (e.g. schedule by the Main Accounts Unit of the Treasury Department to a wrong Ministry/Department).\n" +
                "\n" +
                "(b)\tTo raise a charge against another Ministry in respect of re-chargeable works and services.  Transfer Vouchers  shall be raised by the creditor department except in the following cases:\n" +
                "\n" +
                "(1)\tSalary Payments\n" +
                "(2)\tIssue of imprests for re-chargeable works and services;\n" +
                "(3)\tCorrection of scheduling errors affecting revenue.\n");
        Finance_Section section160 = new Finance_Section("Transfer Vouchers:  Numbers of copies","cat10","Transfer Vouchers shall be prepared in quadruplicate and the necessary entries made in the Receipt Register.  Three copies of the transfer Voucher shall be sent to the debtor department for acceptance by that department and, after signature of the debit portion of the voucher, the debtor department shall make the necessary entries in the Payment Register.  Two copies of the Transfer Vouchers shall then be returned to the creditor department for onward transmission to the Accountant-General who shall arrange to debit and credit as appropriate, the Drawing Accounts of the departments concerned.  Details of such Transfer Vouchers shall be included on the Transcripts (form A/Cs.Gen 14) along with all other debits and credits covering charges, Payment Requests, etc.  Where Transfer Vouchers affect other State Governments within the Federation, such vouchers, when passed to the Accountant-General  must be submitted with sufficient copies to allow two copies for each of the State Governments affected.  This arrangement shall also apply to Transfer Vouchers affecting all accounts, the subsidiary records of which are maintained by the Accountant-General.");
        Finance_Section section161 = new Finance_Section("Inter-departmental transfer","cat10",".   Adjustments are effected by means of journal entries which enable transfers to be made from one account to another without actual receipt or payment of cash. Inter-departmental transfers within the Ondo State shall invariably be effected by Transfer Vouchers and not by Payment Requests.");
        Finance_Section section162 = new Finance_Section("Adjustment Voucher.","cat10","Adjustment Vouchers (A/Cs. Gen.38) are used for adjustments between Heads and Sub-heads controlled from a single Drawing Account and shall be prepared in duplicate.");
        Finance_Section section163 = new Finance_Section("Signature of transfer and adjustment vouchers.","cat10",".    Transfer and Adjustment Vouchers shall be signed by the officers who are empowered to sign Payment Vouchers. Types of adjustment vouchers shall include the following: \n" +
                "(a)\tAdjustment Voucher (Treasury Form 23): This is designed to adjust inter-ministerial transactions and used by Ministries, extra-ministerial offices and other arms of government.  To use this, adjustment shall be submitted on TF23 in quadruplicate or as otherwise directed but two copies of the voucher must be fully signed.  Note that the ministry, extra-ministerial office or other arms of government which is receiving the adjustment voucher shall stamp and return one of the fully signed vouchers as evidence of acceptance or rejection as the case may be.    \n" +
                "(b)\tSupplementary Journal Voucher (SJV): This shall be used in the office of the Accountant General of the State for all adjustments and transfers that are made before the “below the line statement” is extracted. \n" +
                "(c)\tPrincipal Journal Voucher (PJV):  This shall be used in the office of the Accountant General of the State and prepared for the following reasons:\n" +
                "i.\tTo correct misclassification of accounts detected by the main accounts;\n" +
                "ii.\tTo adjust the account for instance when funds, rightfully belonging to one MDA has been wrongly credited to another;\n" +
                "iii.\tTo effect month-end transfer of accounts from “Above the-line Account to Below the line Accounts; and \n" +
                "iv.\tTo effect quarterly/annual transfers.\n");
        Finance_Section section164 = new Finance_Section("Information on vouchers.","cat10",".   Adjustment Vouchers must clearly indicate the reason for the transfer, and must make full reference to the original debit or credit being adjusted, i.e. name of Sub-Treasury or Cash Office, voucher number and month of account and particulars of Treasury or Audit Query if applicable.  A cross reference to the adjustment voucher shall be endorsed upon the voucher on which the debit or credit first originated.");
        Finance_Section section165 = new Finance_Section("Vouchers to be recorded in vote book.","cat10","Where adjustments affect expenditure sub-heads, the amount either of debit or credit must be entered in the vote book, as prescribed in Financial Regulation 08006 and the vouchers ‘stamped accordingly before signature by the officer responsible for the vote.  After inclusion in the account, Accountant-General’s numbered copies of the vouchers shall be returned to the officers controlling the votes with the monthly advice schedules.");
        Finance_Section section166 = new Finance_Section("Material Expense Statements.","cat10","Adjustments in which Unallocated Stores and Workshops Accounts are credited must be embodied in the relative Material Expense Statement (M.E.S).  Vouchers supporting adjustments between votes which are not to be included in the M.E.S. must bear the signature of the engineer or officer actually in charge of the vote.");
        Finance_Section section167 = new Finance_Section("Adjustment Vouchers between other State Governments","cat10","Adjustment vouchers (Treasury Form 23) are used for adjustments (or transfer) between other State Governments of the Federation.");
        Finance_Section section168 = new Finance_Section("Adjustments arising from Reconciliation","cat10","Vouchers in respect of adjustments arising from reconciliation should, wherever possible, accompany the Reconciliation Statements.");









        Finance_Section section169 = new Finance_Section("Authority for opening Bank Account.","cat11",".    (a)   No official Bank account may be opened unless authorized by the Accountant-General.  Each approved account shall be maintained under an official designation. The Accountant-General may limit the cash holding in the commercial Banks after consultation with the Ministry or Department concerned.\n");
        Finance_Section section170 = new Finance_Section("Cheques","cat11","(b)    Every cheque leaf shall bear the correct account number at the top.\n" +
                "\n" +
                "(c)\tThe designation of the account shall be stamped at the bottom of the cheque below the space provided for signatories to the account.\n");
        Finance_Section section171 = new Finance_Section("Tellers","cat11","(d)\tThe title of the account to be credited shall be well written (preferably impressed with a rubber stamp).  Abbreviations shall not be used so as to prevent ambiguity.\n" +
                "\n" +
                "(e)\tThe correct account number shall be at the top of the Teller or Pay-or-Slip.\n");
        Finance_Section section172 = new Finance_Section("Authorised Signatories and specimen signatures.","cat11",".   The Accountant-General or Accounting Officers shall provide banks with certified specimen signatures of the officers authorized to sign cheques drawn on official accounts and shall advise any subsequent changes in signatories.  Notifications to the bank of any changes in respect of officers authorized to sign cheques on an account must be signed by one of the current signatories to the account and counter-signed personally by the Accounting Officer, and in the case of a Non-Ministerial Department, by the Head of Department. Delegation of this authority shall not be allowed.\n" +
                "\n" +
                "        Where accounts are maintained at the Central Bank the special form provided for change of signatory shall be used.  In other cases notification shall be made by letter.   Prompt notification should be given when an officer’s authority to sign is cancelled.  A copy of every notification concerning a change in authorized signatures shall be sent to the Accountant-General.  All notifications shall be forwarded under confidential cover and shall be accompanied by certified specimen signatures of the new signatory or signatories.\n");
        Finance_Section section173 = new Finance_Section("Signing of Cheques.","cat11",".   (i)  Signatories to an official bank account shall be categorized into A & B, with the officers operating the accounts in category A, while the officers in category B shall be the counter-signatories. No signatory shall be below the Rank of Accountant I or designated officer of equivalent rank. On no account should a cheque/bank mandate be signed by signatories belonging to one category.\n" +
                "\n" +
                "(ii)  On no account should cheques be issued for full payment of services not yet performed, or for goods not yet fully supplied.\n");
        Finance_Section section174 = new Finance_Section("Right of access to bank account: Accountant-General, Auditor-General.\n","cat11","   11004.   The Accountant-General and the Auditor-General or their representatives have the right or access to records of all official bank accounts and are entitled to any information they may require in connection with such accounts.");
        Finance_Section section175 = new Finance_Section("Overdraft","cat11","No Government bank account shall be overdrawn or any temporary advance obtained from a bank. In the event of an account being overdrawn without authority, the officer responsible shall be made to refund any bank charges incurred thereon.\n" +
                "\n" +
                "   11006.  Idle funds in the accounts of the Ministries, Departments/Agencies may be invested in short term deposits but with prior approval of the Accountant-General.\n");
        Finance_Section section176 = new Finance_Section("Public and Private Accounts to be kept separate.","cat11","Private money will in no circumstances be paid into an Official Bank Account, nor public money be paid into a Private Bank Account.\n" +
                "\n" +
                "\n" +
                "   11008.   Where a bank account is kept, the operating officer should keep only sufficient cash to meet petty payments and all payments of N10,000 or more should be made by cheque.\n");
        Finance_Section section177 = new Finance_Section("Payments to bank.","cat11","11009.   Officers operating official bank accounts must ensure that all sums paid into their official bank accounts are brought to account in their cash books promptly, and within the month of payments to the bank.  \n" +
                "\n" +
                "i.     When an officer makes a payment into an official bank account which he operates, he shall prepare a bank paying-in-slip (bank teller) in duplicate. Both original and duplicate shall show a full analysis of the amount paid in as to notes, coins and cheques, and shall detail the serial numbers of individual cheques. No alterations, other than those made by the bank, may be made on a bank paying-in-slip. When payment has been made to the bank the officer operating the account will examine the duplicate paying-in-slip to see that it bears an acknowledgement of receipt by the bank, that there are no alterations other than those made by the bank, and that any such alterations are properly accounted for. The duplicate slip will be carefully retained for audit purposes.\n" +
                "\n" +
                "    (ii)    When an officer makes a payment into an official bank account which he himself does not operate he shall prepare the bank paying-in-slip in triplicate.  Each of the three copies will show a full analysis and the individual numbers of cheques, etc. as in the preceding sub-paragraph, and should contain no alterations. When payment has been made to the bank, both duplicate and triplicate copies shall be examined as above and the duplicate slip shall be forwarded without delay to the officer who operates the account.  The triplicate slip shall be carefully retained for audit purposes.\n");
        Finance_Section section178 = new Finance_Section("Reconciliation of bank account with cash book.","cat11","11010.   All officers authorized to keep bank accounts must compare weekly and at the close of each month, the entries as appearing in the bank statements with those in their cash books and effect clearance of outstanding items (see Financial Regulation 05009). At the end of each month, a certificate of the bank balance, signed by the manager of the bank shall be submitted with the officer’s monthly statement of account, accompanied by a reconciliation statement (see Financial Regulation 05008).");
        Finance_Section section179 = new Finance_Section("Cheque Summary Register","cat11","\n" +
                "   11011.   In larger offices it may be found convenient to maintain a Cheque Summary Register in addition to cash book.  All debits and credits to the bank accounts shall be recorded in the Cheque Summary Register, preferably by an officer other than the cashier.  The balance as shown in the Cheque Summary Register shall be agreed daily with the bank balance as shown in the cash book and a certificate to this effect appended in the Register by the Head of Accounts.\n" +
                "\n");
        Finance_Section section180 = new Finance_Section("Cheques: Supply of","cat11","   11012.   Every order on a bank for a supply of official cheques must be signed by the officer authorized to keep the account.\n" +
                "\n" +
                "   11013.   Cheques received should be made payable to Ondo State Government.  A cheque may be accepted however, if made payable to the official designation of a Government account.  If not already done, all cheques should be crossed ‘Not Negotiable’, Account Payee only’ immediately on receipt.  Account Officers and Revenue Collectors shall accept only certified Bank cheques and ensure before acceptance that:\n" +
                "\n" +
                "(a)\tThe cheque  is correctly dated (i.e. not-out-of-date or post-dated)\n" +
                "(b)\tThe amounts in words and figures agree;\n" +
                "(c)\tThe drawer’s signature is appended.\n" +
                "(d)\tThe cheque is not torn or mutilated\n" +
                "(e)\tAlterations of any kind are covered by the full signature of the drawer.  If drawn on a branch of a bank situated in a town other than that at which the cheque is to be paid in, cheque must bear the endorsement ‘Commission to Drawer’s Account’, with the full signature of the drawer added thereto.  Cheques not complying with any of the above conditions shall not be accepted.\n");
        Finance_Section section181 = new Finance_Section("Lodgement of Cheque received","cat11",".   Cheques received shall be paid to the Bank accounts not later than the next business day after receipt.\n");
        Finance_Section section182 = new Finance_Section("Cheques of non-officials","cat11",".   In no circumstance shall personal cheques be exchanged for cash from any government funds.\n" +
                "\n" +
                "11016.   In no circumstances will cheques be cashed for persons who are not in the service of the Government of Ondo State or firms without the prior approval of the Accountant-General. All  payments for contracts shall be made only in the corporate name of the company.\n");
        Finance_Section section183 = new Finance_Section("Unathorised commission","cat11","Officers incurring unauthorized commission charges on cheques shall be liable to surcharge of the amount involved.  All heads of Accounts shall ensure that monthly statements of accounts are obtained to confirm that no commission on turn over (COT) is charged.");
        Finance_Section section184 = new Finance_Section("Care of cheque books","cat11",".   All unused cheque books must be kept in the strong-room or safe under the control of the officer who keeps the bank account.  Cheque books in use must be locked in a safe each evening and whenever the office is unoccupied.  The counterfoils of all cheque books must be preserved for reference, and exhausted cheque books must be kept in the strong-room or safe for three years or until audited whichever is later, when they may be destroyed.  Officers authorized to keep bank accounts are responsible for ensuring that no cheque is extracted from a cheque book for fraudulent purposes.");
        Finance_Section section185 = new Finance_Section("Spoiled cheques","cat11","When a cheque is spoiled, it must be cancelled and affixed to the counterfoil and retained in the cheque book.");
        Finance_Section section186 = new Finance_Section("Bank paying in slips.","cat11","When money is paid to the bank, the bank paying-in-slip (bank teller) and the duplicate (and triplicate where used) must be analysed as to (i) cheques, (ii) notes,\n" +
                "(iii) coins.  The duplicate must be examined to see that it  bears an acknowledgement of receipt by the Bank and that the analysis has neither been altered, nor added to, nor substituted after the lodgement.\n" +
                "11021.   All monies including cheques, and all remittances must be entered in a register ");
        Finance_Section section187 = new Finance_Section("Money and remittance register","cat11","showing the date of receipt, and, if accompanied by correspondence, by a reference to the letter and file.  Where the officer entering the register is not responsible for issuing receipts he must obtain a signature in the register from the officer to whom he hands the money.  A reference must be given in the register to the number of the receipt on which the money has been brought to account and, if paid to a bank, to the date on which paid to the bank, or if remitted to another station for collection of a reference to the Remittance Voucher.  The officer entering the register must not be responsible for issuing receipts but must obtain a signature in the register from the officer to whom he hands over the money.");


        Finance_Section section188 = new Finance_Section("Use of Banks","cat12","At stations where there is a branch of the bank patronized by Government, the fullest possible use should be made of banking facilities and all cash surplus to daily requirements should be banked immediately.");
        Finance_Section section189 = new Finance_Section("Strongroom and reserve Safes.","cat12",".  In all offices where cash or receipt and licence books beyond immediate requirements are maintained, there must be a strong room or one or more reserve cash safes for the custody of such cash and stocks, secured if possible by not less than two locks, the key to one being held by the cashier and the key of the other by a senior official.  Where existing safes have only one lock, steps should be taken to provide for a second key holder either by having locking bars fitted or the safe exchanged for one with double locks.");
        Finance_Section section190 = new Finance_Section("Safe custody of working balance etc.","cat12",".   In all offices having cash transactions a safe must be provided for the safe custody or the daily working balance of cash, receipt and licence books during office hour.  Such safes should be built in to the wall of the building or otherwise securely attached to the structure of the building.");
        Finance_Section section191 = new Finance_Section("Safe custody of Revenue Collectors, etc. cash.","cat12","In cases where cash collected by revenue collectors or cash to be disbursed in payment of wages, etc. has to be transported from one place to another, the officer responsible for the cash must be provided with an approved cash tank or box and at least one police escort.");
        Finance_Section section192 = new Finance_Section("Security of strongrooms.","cat12",".  Strong-rooms should be examined periodically to ensure that no vents or openings exist through which any of the contents could be extracted either by hand or by other means.  Currency notes should be kept in boxes with lids and not loosely on shelves.");
        Finance_Section section193 = new Finance_Section("Responsibility for custody of public money.","cat12",".  It is the duty of Accounting Officers to ensure that their departmental officers, who are required to hold public money are provided with proper safe custody facilities.");
        Finance_Section section194 = new Finance_Section("Safes, etc. to be obtained from the Accountant-General.\n","cat12","All safes, strong-room doors and cash tanks or boxes must be obtained from the Accountant-General, who will register them and cause a registered number to be placed in a prominent position on each.");
        Finance_Section section195 = new Finance_Section("Keys of cash tanks","cat12"," Accounting Officers shall issue instructions governing the security of keys of departmental cash tanks and boxes.");
        Finance_Section section196 = new Finance_Section("Duplicate keys of strong-rooms and safes: safe custody of","cat12","Duplicate, and triplicate (if issued), keys of each Government strong room and safe and steel specie box must be enclosed in a separate sealed envelope with the description and details marked on the outside, and sent under confidential cover, for safe custody as follows:\n" +
                "(a)\tThe duplicate and triplicate key of the Accountant-General’s strong-room shall be retained by the Permanent Secretary, Ministry of Finance.\n" +
                "(b)\tDuplicate and triplicate keys of all other strong-rooms and safes and of cash/stamps boxes shall be retained by the Accountant-General.\n (c)\tDuplicate and triplicate keys of saves in which duplicates and triplicates keys of other safes are kept, shall if the safe containing the keys is located in an office other than that of the Accountant-General be kept by the Accountant-General. If the safe containing the keys is located in the Accountant-General’s Office, then the duplicate and triplicate keys shall be lodged with the Permanent secretary, Ministry of Finance.\n" +
                "\n" +
                "       The envelopes containing duplicate or triplicate keys shall, if possible, be sealed in the presence of the officer with whom they are to be deposited, and signed by the depositing and receiving officers.  The latter shall also give a formal receipt which shall be carefully preserved by the depositing officer.  Particulars on sealed envelopes in which duplicate keys are enclosed should be given as follows:  \n" +
                "     Ministry of Agriculture and Rural Development Duplicate key of safe at Igbokoda Milner’s 212 Fire Resisting Safe. \n" +
                "     Registered No. 2557\n" +
                "     Date ………………………………\n" +
                "     Signed …………………………..  Rank ………………………..\n" +
                "\n" +
                "     12010.   Where a safe is contained in a strong-room, one officer should not hold the keys of both the strong-room and safe.\n" +
                "\n" +
                "    12011.   The holders of original keys of safe, strong room, cash tank, etc. must verify the whereabouts of the duplicate keys and, if non-existent or untraceable, they must report to their Ministry or Department and request that the locks be altered and new keys provided.\n");
        Finance_Section section197 = new Finance_Section("Custody of Original keys.","cat12","Officers holding the keys of strong-rooms, safes, cash tanks or cash boxes are personally responsible for their safe custody and collectively responsible for the contents.  Except when officially handed over to another officer, keys must not leave their personal possession (see Regulation 12027).  This precaution is not only to prevent their being stolen but also to safeguard them from being copied or duplicated.");
        Finance_Section section198 = new Finance_Section("Lost Keys.","cat12","The loss of any strong-room, safe, cash tank or cash box key must be reported immediately to the Accountant-General, giving  a full explanation of the loss, with a copy to the officer holding the duplicate key and a copy to the head of the key holder’s department. The other key holders, if any, must be informed immediately, and a tape should at once be sealed across the door of the safe, the time of doing so being carefully noted.  If the safe contains cash, securities, receipts or licence books,  a police guard must be placed over the safe or strong-room until it has been opened and the contents removed.  The duplicate keys shall be obtained only to open the safe for the verification and removal of the contents.  The safe may not thereafter be used until the lock has been altered and new keys provided.");
        Finance_Section section199 = new Finance_Section("Responsibility of officer who losses key. Keys, locks, suspected interference with.","cat12","The officer who loses a key of a Government safe, etc.  is to be called upon to meet the cost of altering the lock and the provision of new keys,\n" +
                "\n" +
                "   12015.   In the event of a key holder having any suspicion that the keys or locks of a strong-room or safe in his charge has been interfered with, he must remove the contents to another safe, report the circumstances as directed in Regulation 12013, and ask that immediate steps be taken to have the locks altered and new keys provided.  Other key holders, if any, must be notified immediately.\n");
        Finance_Section section200 = new Finance_Section("Keys–locally made.","cat12","12016.   Alternations to locks of safes and the provision of new keys must, if undertaken locally, be made by the Ministry of Works under security conditions.");
        Finance_Section section201 = new Finance_Section("Departmental records of safes and keys.","cat12","Accounting Officers are required to keep a register of the Government safes, etc. and keys thereof in the charge of their departmental officers containing a full description of each safe and its key(s).");
        Finance_Section section202 = new Finance_Section("Annual returns of safes, etc.","cat12","Annual returns, in duplicate of all Government strong-rooms and safes shall be rendered on the 31st December by all Ministries and Departments to the Accountant-General who will have all particulars checked with his records and his register amended where necessary.  These returns shall give full particulars of the safes, etc. and the disposition of duplicate keys if not held by the Accountant-General.");
        Finance_Section section203 = new Finance_Section("Safes-transfers of.","cat12","Any transfers of safes between stations, or from one department to another, must be notified at once to the Accountant-General. The duplicate key holders must likewise be informed to enable them to forward their keys under confidential cover to another officer for safe custody if necessary.");
        Finance_Section section204 = new Finance_Section("Duplicate key holders to be informed of changes in locks, etc.\n" +
                "Key holders to be present while strong-room or safe is open.\n","cat12","Whenever locks are changed and new keys made and new duplicates deposited, or a safe has been condemned and destroyed, departments should notify the officer who holds the obsolete duplicates of the fact so that old key may be destroyed.\n" +
                "\n" +
                "   12021.   No strong-room or safe may be opened by a person other than the authorized key holder, who must be present while the strong-room or safe is opened.  Where there are two or more key holders, all must remain present.\n");
        Finance_Section section205 = new Finance_Section("Private money, etc not to be kept in an official safe.","cat12",".  Officers are prohibited from keeping private money or effects in an official safe, etc.  Any private money found in an official safe, is liable to be credited to Revenue.");
        Finance_Section section206 = new Finance_Section("Security of cash overnight.","cat12"," Heads of Accounts are personally responsible for ensuring that the balance of cash in the hands of the cashier is locked in a strong-room or safe at the close of business, daily.  Where a strong-room or reserved cash safe is provided, on no account should cash be kept overnight in the cashier’s safe.");
        Finance_Section section207 = new Finance_Section("Safes- register of contents","cat12",".   Registers shall be kept in each strong-room or reserved cash safe of all cash,  receipts or licence books and other articles deposited, the cash register must show separately the denominations and amounts of all coins and notes.  Bags of coins and bundles of notes must be properly labeled and denominations kept separate.  All entries must be signed by the authorized key holders and, in the case of documents or other articles deposited for safe custody, a receipt shall be given to the depositor (see Regulation 12029).");
        Finance_Section section208 = new Finance_Section("Verification of contents or safes, etc","cat12",".   Heads of Accounts shall check the contents of the strong-room or reserve cash safe at least once a month against the register and report any discrepancy.  The register shall be signed by the key holders on each occasion (see Regulation 05005 re-daily check of cash)");
        Finance_Section section209 = new Finance_Section("Custody of bonds and agreements.","cat12","It is generally desirable that Bonds and Agreements, particularly those which safeguard the financial interests of Government, should be kept in a strong-room or safe.");
        Finance_Section section210 = new Finance_Section("Temporary transfer of key to be recorded in key register.","cat12","When an officer holding a key of a strong-room or reserve cash safe is temporarily absent, the key in his charge may, if necessary, be handed to the officer next in rank, against signature in the departmental key register but in no case may all the keys be held by one officer (see Regulation 12028)");
        Finance_Section section211 = new Finance_Section("Certificates on handling and taking over","cat12","In all cases where one key holder hands over to another, temporarily or permanently the contents of the strong-room or safe shall be checked and certificates inserted in the register if kept, or if not, in the cash book, and signed by both officers.  Any discrepancies must be reported to the Accountant-General.");
        Finance_Section section212 = new Finance_Section("Delivery of articles held in safe custody.","cat12","Documents or other articles deposited for safe custody shall only be delivered on the demand of the depositing officer and on the production of the receipt issued when the deposit was made.  The documents, etc, shall be acknowledged by the receiver on the back of the receipt which shall then be posted into the register.");
        Finance_Section section213 = new Finance_Section("Security Documents  received by post.","cat12",".   Every office at which security documents of value are received through the post must be provided with a padlocked Post Office Mail Bag in which all letters from the post office shall be delivered.  The key of the padlock shall be kept by the officer in charge of the office and the bag shall be opened in his presence.");
        Finance_Section section214 = new Finance_Section("Registered letters registers.","cat12","The officer to whom the responsibility for the opening of mail has been delegated shall keep a register of all inward and outward registered letters, giving details of the contents of the letters.  Unregistered letters containing articles of value shall also be entered in the register.  All entries must be signed by the officer-in-charge.  In the case of outward registered letters, the Post Office receipts shall be filed and numbered consecutively and a reference inserted in the register.");
        Finance_Section section215 = new Finance_Section("Safe custody of security documents","cat12","The greatest care must be exercised at all times in the care and safe custody of security documents and an officer having in his charge any of the under-mentioned documents must ensure that they are locked overnight in a safe, strong-room or fireproof security cabinet, according to their importance, and that adequate measures are taken to safeguard them during the day:\n" +
                "\n" +
                "UNUSED OR PARTLY USED FORMS, ETC IN THE FOLLOWING CATEGORIES:\n" +
                "\n" +
                "      All Receipt and Licence Books and Fixed Fee Tickets.\n" +
                "      Entertainment Tax Tickets\n" +
                "      Cheque Books and Drafts\n" +
                "      Payment Request Booklets\n" +
                "      Local Purchase Order Books\n" +
                "      Stores Requisition Books\n" +
                "      Legal Documents, etc including Contracts\n" +
                "      Bonds and Agreements\n" +
                "      Insurance Policies\n" +
                "      Share certificates, Debentures and similar securities\n" +
                "      Documents submitted for assessment and/or payment of \n" +
                "      stamp  duty.\n" +
                "\n");
        Finance_Section section216 = new Finance_Section("Safe custody of security books","cat12",".   Adequate precautions must be taken to protect against access by unauthorized persons and against damage by fire, the following security books.\n" +
                "      Cash Books (including Revenue Collector’s Cash Books)\n" +
                "      Principal and other Journals\n" +
                "      Principal and Subsidiary Ledgers\n" +
                "      Abstracts of Revenues and Expenditure\n" +
                "      Loans Registers \n" +
                "      Investment Registers\n" +
                "      Records of Advances and Deposits\n" +
                "      Paper Money Register and Registered Letter Registers\n" +
                "      Registers of Safe and Keys\n" +
                "      Stores Ledger and Stock Books\n" +
                "      Asset Register\n" +
                "      Personal Emoluments Index and Record Sheets\n" +
                "      Pension Registers\n" +
                "      Used Receipt and Licence Books.\n" +
                "\n" +
                "An officer having in his charge any of the above mentioned security documents and books must ensure that they are locked in a safe strong room or security container overnight and that adequate measures are taken to safeguard them during the day.  Where it is impossible to put them in one or the other overnight, the best possible alternative msut be devised. \n");
        Finance_Section section217 = new Finance_Section("Retention of Security documents and books after use.","cat12","Security books and documents and other accounting records shall be retained for the following periods after use (i.e. in the case of books or registers, from the date of the last entry made therein):\n" +
                "\n" +
                "       (a)   Permanently:\n" +
                "       (i)      Warrants issued by the Commissioner for Finance,\n" +
                "(ii)\t Cash Books (other than Revenue Collectors’ Cash Books).  \n" +
                "\n" +
                " Principal and other Journals\n" +
                "                Principal and Subsidiary Ledgers\n" +
                "                Personal Emoluments records (Index) Sheets.\n" +
                "                Pension Registers\n" +
                "                Loans Register.\n" +
                "                Register of Safes and Keys.\n" +
                "                Asset Registers\n" +
                "(b)\tFor seven years:\n" +
                "Abstracts of Revenue and Expenditure\n" +
                "Revenue Collector’s Cash Books,\n" +
                "Original and Duplicate Receipt Vouchers and Abstracts,\n" +
                "Investment Registers,\n" +
                "Paper Money Registers,\n" +
                "Stores Ledgers and Stock Books.\n" +
                "\n" +
                "(c)\tFor five years:\n" +
                "Duplicates and other copies of vouchers\n" +
                "\n" +
                "(d)\tFor three years  \n" +
                "Cheque Book Stubs:  Until after the audit by Auditor-General\n" +
                "\n" +
                "\n" +
                "\n" +
                " Officers having in their custody any of the documents specified above may destroy them at the end of the prescribed periods provided they have been audited by the Auditor-General.\n" +
                "\n");
        Finance_Section section218 = new Finance_Section("Delivery of articles held in safe","cat12","Documents or other articles deposited for safe custody shall only be delivered on the written demand of the depositing officer or other authorized person and on the production of the receipt issued when the deposit was made.  The documents, etc, shall be acknowledged by the receiver on the back of the receipt which shall be filled in the register.");




        Finance_Section section219 = new Finance_Section("General controls","cat13","Except as provided below, the Accountant-General is responsible for the control of all receipt and licence books, etc, used in accounting for the receipt of Government money.");
        Finance_Section section220 = new Finance_Section("Departmental control","cat13","Accounting Officers are responsible for the registration and control of special receipt, licence, etc, books applicable to their departments. Before any kind of departmental revenue books is put into use, Treasury approval must be obtained.  The Accountant-General and Accounting Officers, who are responsible for the control of these departmental revenue books, shall maintain Stock Registers in compliance with the laid down rules in this chapter.");
        Finance_Section section221 = new Finance_Section("Requisition to Government Printer.","cat13","Only Accounting Officers and the Accountant-General are authorized to make requisition to the Government Printer for supplies of new books which must be printed in the forms prescribed by law, or by the Ministry of Finance or by these Regulations.  All counterfoils shall bear printed consecutive Treasury Numbers in separate series for each type of class of book.");
        Finance_Section section222 = new Finance_Section("Indents on Accountant-General","cat13","Requisitions for receipt, etc, books other than the special departmental books referred to in Regulation 13002 shall be submitted quarterly to the Accountant-General by Heads of Account who shall include in their requisitions the requirements of Revenue Collectors who account to them.");
        Finance_Section section223 = new Finance_Section("Issues by Accountant-General and Head of Accounts","cat13","(1)    Issues by the Accountant-General shall be made to Heads of Accounts only.  All issues shall be recorded in the Stock Registers.\n" +
                "\n" +
                "   (2)   The Heads of Accounts shall record their supplies in the Stock Register and issue for use as required by themselves and the Revenue Collectors who account to them.  All issues shall similarly be recorded in the Stock Register.\n" +
                "\n" +
                "(3)\tAll issues shall be made in consecutive order.\n");
        Finance_Section section224 = new Finance_Section("Receipt Book Issue Notes","cat13","(1)   Issue Notes of Receipt Books shall be numbered consecutively and made out in four copies for distribution as follows:\n (a)\tOriginal and duplicate copies to the officer to whom the issues are made.  The duplicate copy shall be receipted and returned to the office of issue where it shall be securely attached to the forth copy.\n" +
                "   \n" +
                "(b)\tThird copies to the Auditor-General.\n" +
                "\n" +
                "(c)\tFourth copies shall remain in the book at the office of issue. \n All issuing officers must ensure that the duly receipted duplicate copies of issue notes are returned without delay.");
        Finance_Section section225 = new Finance_Section("Special Departmental Receipts.  Issue of:","cat13","Heads of Departments who are responsible for the control of special receipt, etc books are required to notify issues to the Auditor-General and to the Treasury cash Office responsible for checking the Revenue Collector’s Cash Books.  An additional copy of the issue note shall have to be prepared in these cases.");
        Finance_Section section226 = new Finance_Section("Responsibility, for checking all issues.","cat13",".   Every issue of receipt and licence books must be checked with the supporting Receipt Book Issue Note as soon as it is received and each book examined for defects in numbering, printing etc.  any discrepancy in the quantity or the numbering of the books supplied shall be reported immediately to the supplying officer with a copy to the Accountant-General and the Auditor-General.  The receiving officer shall be held responsible for any errors discovered after the duplicate copy of the Receipt Book Issue Note has been receipted and returned to the supplying officer.");
        Finance_Section section227 = new Finance_Section("Taking on charge and safe custody by users.","cat13",".   All receipt books, etc.  Issued from main stocks for use must be recorded in a Receipt Book Register in the prescribed form by the receiving officer.  He shall be responsible for ensuring that the books are locked in a safe or strong-room at the close of business and adequate measures are taken to safeguard them during the day.  Cashier or clerks to whom issues are made for daily use shall be responsible for them during the day, but the responsible officer must ensure that they are locked up daily at the close of business.  Similarly, cashier or clerks shall be responsible for the custody of such receipt and licence books as it may be necessary to leave with them for the performance of routine business during any temporary absence of the responsible officer.  It shall, however,   be the duty of the latter on his return to examine the books, satisfy himself that there has been no loss or misuse and make a test check of the receipts and licences issued with the entries in the Cash Books.");
        Finance_Section section228 = new Finance_Section("Transfer of receipt and licence books","cat13","Receipt and licence books shall not be transferred between Heads of Accounts without the consent of the Accountant-General, except in Special cases of emergency when the circumstances shall be reported to the Accountant-General.");
        Finance_Section section229 = new Finance_Section("No transfers between Revenue Collectors.","cat13","Except when one Revenue Collector is officially relieved by another, no used or unused receipt or licence books may be passed, transferred or lent by one Revenue Collector to another.  (See Regulation 12028  re-handing over certificates.)");
        Finance_Section section230 = new Finance_Section("Receipts not to be altered.","cat13","All revenue receipts, etc. shall be issued to payers in strict serial order and they shall not be altered in anyway, nor cut nor divided.");
        Finance_Section section231 = new Finance_Section("Spoiled receipt and licence forms","cat13","When a receipt or licence form is spoilt or damaged it shall be cancelled and all copies endorsed in ink or indelible pencil ‘Cancelled’. The original, duplicate and triplicate copies of the cancelled receipt or licence should be retained in the receipt book for audit to support the R.V to the Treasury Cash Officer or Head of Accounts, while the triplicate shall be retained in the receipt book for audit.");
        Finance_Section section232 = new Finance_Section("Disposal of original of receipts and licence forms.","cat13"," The original receipt or licence form shall be handed or delivered to the payee.");
        Finance_Section section233 = new Finance_Section("Disposal of duplicate copies of receipt and licence forms.","cat13","The duplicate of all receipts and licences (excluding, fixed fee licences and tickets of the counterfoil type) issued by Heads of Accounts and by Revenue Collectors shall be sent with the monthly account to the Accountant-General or Accounting Officer.  (see Regulation 06008).");
        Finance_Section section234 = new Finance_Section("Disposal of triplicate copies of receipt and licence","cat13","Audited used receipt or licence books printed in triplicate may be destroyed one year after the date of the audit inspection unless advice that a particular book should be retained has been received from the Accountant-General, Accounting Officer, Auditor-General or the Commissioner of Police.");
        Finance_Section section235 = new Finance_Section("Fixed fee receipts and licences.","cat13","In the case of receipt and licence forms which bear a printed value, the receipt voucher on which the revenue is brought to account in the Accounts Officer’s cash book must give reference to the opening and closing serial numbers of the receipts and licences issued.");
        Finance_Section section236 = new Finance_Section("Monthly for returns","cat13","Every Officer having in his charge revenue receipt, etc books shall render with his monthly accounts a certified return showing in respect of each type of receipt or licence in stock and in use:\n" +
                "\n" +
                "(a)\tSerial numbers of unused receipts on hand at commencement of the month.\n" +
                "(b)\tSerial numbers of stock received during the month.\n" +
                "(c)\tSerial numbers of issues during the month.\n" +
                "(d)\tSerial numbers of unused receipts on hand at end of the month.\n" +
                "          Collectors of Revenue including holders of special departmental receipts or licences, shall render their returns monthly to the Head of Accounts, who shall forward them with his accounts after checking.  Holders of special departmental receipts shall send a copy of each monthly returns to the office of issue.  For the purpose of the returns submitted by Revenue Collectors as required by this Regulation, the term at the end of the month is made to the Head of Accounts.\n");
        Finance_Section section237 = new Finance_Section("Monthly returns to continue though no receipt or licenses issued.","cat13","In cases where an Accounts Officer or Revenue Collector does not issue any receipts or licences during a month, he shall nevertheless submit monthly returns as prescribed by Regulation 13018, so long as he holds a receipt or licence book.");
        Finance_Section section238 = new Finance_Section("Surplus receipt and licence books and forms.","cat13","Unused surplus Receipt and Licence Books should be returned to the office of issue and the Accountant-General (or Accounting Officer as the case may be) and the Auditor-General be informed.  (see Regulation 13006)");
        Finance_Section section239 = new Finance_Section("Certified true copies.","cat13","If an issued receipt form is lost and application is made for the issue of a duplicate, the Accountant-General (or Accounting Officer concerned) may issue a certified true copy.  Under no circumstances may a printed receipt form be used, nor may a copy of the licence be issued unless the Law makes specific provision therefore.");
        Finance_Section section240 = new Finance_Section("Missing receipt and licence books","cat13","Every officer responsible for the safe custody of receipt and licence forms must investigate any loss immediately and report the particulars to the officer who supplied him.  The officer to whom the loss is reported shall ensure that the investigation is brought to conclusion, and shall render a report to the Accountant-General (with a copy to the Auditor-General) so that, if necessary, particulars of the missing forms can be published in the Gazette.   No lost book or counterfoil may be written off without the specific authority of the Accountant-General which when received, should be noted in the register or the book as the case may be.  The Auditor-General must be notified of any approved write-off.");
        Finance_Section section241 = new Finance_Section("Handing over certificates","cat13","When one officer hands over to another, certificates signed by both officers are required in respect of all receipt or licence books or forms on charge.  The certificates should be supported by detailed lists showing the quantity and serial numbers of each type of book, and the officer taking over should sign below the last entries in the Stock Register.");
        Finance_Section section242 = new Finance_Section("Destruction of exhausted counterfoil receipts, etc","cat13","Audited fixed fee licence and ticket counterfoil may be destroyed at the expiration of seven years from the date of issue of the last receipt therein.");
        Finance_Section section243 = new Finance_Section("Destruction of obsolete unused receipts, etc.","cat13","Accounting Officers may authorize the destruction of obsolete unused receipts and licences, etc. which must be destroyed in the presence of three senior officers of whom two must be from other departments.  Destruction may only be effected by total burning.  The unused receipts must first be carefully examined to ensure that they are complete as to originals and all copies and that they are in fact unused.  The unused receipts actually destroyed must be carefully listed on a destruction certificate signed by all three officers and a copy shall be forwarded to the Auditor-General.  The main Stock Registers must also show details of all books so destroyed.  The destruction of any obsolete receipt books, etc containing used forms is also governed by the requirements of Regulations 13016.\n" +
                "\n");
        Finance_Section section245 = new Finance_Section("Auditor-General to be notified","cat13","Prior notice of intention to destroy unused receipts must be given to the Auditor-General so as to enable an Audit Officer to attend and witness the destruction if the Auditor-General so desires");








        Finance_Section section246 = new Finance_Section("Definition.","cat14","The term ‘Imprests’ is applicable to all sums advanced to officer of the government to meet expenditure under the current estimates, for which vouchers cannot be presented immediately to the Accountant-General or Head of Accounts for payment.");
        Finance_Section section247 = new Finance_Section("Imprest:  application and authority for.","cat14",".  (a)    Imprests are issued by Accounting Officers from Departmental drawing accounts under the authority of the Release Warrant.  Application for imprests shall be directed to Accounting Officer stating the amount and the purpose for which it is requested.\n" +
                "\n" +
                "14003.   Imprests are of two classes, namely:\n" +
                "\n" +
                "(a)\tSpecial imprests is granted for a particular purposes, which must be accounted for in full within the period allowed or when the service is completed.\n" +
                "\n" +
                "(b)\tStanding imprests, which may be replenished from time to time during the financial year by submission of paid vouchers to the Accounting Officer for reimbursement?\n");
        Finance_Section section248 = new Finance_Section("Procedure for payment from imprests.","cat14",")   Every imprest holder shall keep a detailed record of disbursement and shall record therein all receipts and payments.  This procedure applies also to imprests for dispatching of mails.  \n" +
                "\n" +
                "(b   All imprest payments shall be supported by such documents in one of the prescribed forms which shall be correctly raised and certified, and duly receipted when payment is made\n" +
                "\n" +
                "(c)\tDisbursement shall be classified to the Heads and Sub-heads of the approved Estimates. \n" +
                "\n" +
                "(d)\tEntries shall be made in the cash  book on the day they occur and shall show full particulars of each receipt or payment.\n" +
                "\n" +
                "        (e)         The cash book shall be regularly balanced and ruled off, and the cash on hand regularly checked by a Senior Officer, who shall certify the cash book \n" +
                "                       accordingly.  Accounting Officers shall issue instructions concerning the\n" +
                "                       frequency, having due regard to the size of the imprest and the number of\n" +
                "                       payments made.\n" +
                "\n" +
                "(f)        The cash in bank as shown by the cash book shall be regularly reconciled with\n" +
                "             the bank statement, and the Reconciliation Statements duly certified by a\n" +
                "             senior officer.\n" +
                "\n" +
                "(g)   A record shall be kept of vouchers which have been submitted for reimbursement, and reimbursement monies shall be brought to account immediately they are received.\n" +
                "\n" +
                "(h)      Imprest cash shall be kept separate from other monies at all times.\n" +
                "\n" +
                "(i)      The provision of Regulation 12003 as appropriate shall apply with regard to the custody of imprest cash.\n" +
                "\n" +
                "(j)     The duty of maintaining the imprest cash and cash book may not be delegated to an officer on a salary scale lower than grade level 07, the delegated officer must also be conversant with the book keeping procedure for posting and balancing the cash book.\n" +
                "\n" +
                "(k)  On no account shall personal advance be sued in disguise of special Imprest, in the procurement of stores which is governed by the provisions of this Regulations \n");
        Finance_Section section249 = new Finance_Section("Imprest holders responsibilities of","cat14","Imprest holders must duly observe all regulations regarding the control of expenditure and the disbursement of public money and are responsible for the correctness of vouchers signed by them (see Regulation 08009).  They are also responsible for ensuring the early submission of paid vouchers for reimbursement.  The imprest may be used only for the purpose for which it is issued.  Imprest holders may not use for imprest purposes other public moneys which may come into their possession.  Such moneys must be kept separate and be accounted for in full. The imprest holder is responsible for the safe custody of the money in his care.");
        Finance_Section section250 = new Finance_Section("Replenishment of imprest","cat14",".   To obtain reimbursement of amounts paid from an imprest, the holder shall submit the properly completed and receipted payment vouchers for the amount expended to the Head of Accounts who issued the imprest.  The vouchers shall be classified direct to the expenditure heads concerned and not to ‘Imprests’.  The replenishment must not exceed the amount of the expenditure vouchers submitted.  Replenishment of amount paid from imprest shall be effected at least once a month.");
        Finance_Section section251 = new Finance_Section("Retirement of imprest.","cat14","(a)    All standing imprests must be retired on or before the 31st Decembers of the financial year in which they are issued.  Special imprests shall be retired within the period allowed or immediately the reasons for which they were granted cease to exist, whichever is the earlier.  Retirement shall be effected by the production of vouchers and or cash for the full amount of the imprest.\n" +
                "\n" +
                "     (b)   Officers retiring imprests at the end of the financial year should apply in good time for the issue of any new imprest required for the ensuing year.\n");
        Finance_Section section252 = new Finance_Section("Imprest accounted for after end of financial year.","cat14","Head of Accounts and Imprest Holders are required to see that all imprests are retired in accordance with Regulation 14008.  Suitable arrangement should be made to ensure that all vouchers submitted for reimbursement are passed before the end of the financial year.");
        Finance_Section section253 = new Finance_Section("Inspection of imprest accounts","cat14","The accounts of Imprest Holders are subject to inspection by the Internal Auditor, the Accountant-General and the Auditor-General.");












        Finance_Section section254 = new Finance_Section("Annual Board of Survey.","cat15","Board of Survey,  to be held before the commencement of business on the first day of the new financial year, shall be appointed by the Permanent Secretary, Ministry of Finance to examine the cash, and bank balances held by the Accountant-General and Head of Accounts/Treasury Cash Officers at headquarters and out-stations.");
        Finance_Section section255 = new Finance_Section("Surprise Board of Survey.","cat15","Surprise Quarterly Boards shall be appointed by the Permanent Secretary, Ministry of Finance to hold surveys of the cash, bank balances etc, in the custody of the Accountant-General and Head of Accounts/Treasury Cash Officers.  The appointment of Surprise Boards must be kept secret.");
        Finance_Section section256 = new Finance_Section("Surprise Cash Surveys.","cat15","Accounting Officers shall arrange for surprise cash surveys on all officers under their control, having custody of public money. These surveys should not be less frequent than once a quarter.  The appointment of all surprise surveys shall be kept secret.");
        Finance_Section section257 = new Finance_Section("By who appointed","cat15","Boards shall be appointed by the Accounting Officer concerned.  In the case of Boards appointed outside Akure, the proceedings of the board should be sent by the President directly to the Accounting Officers concerned.  The appointment of Quarterly Boards of Survey must be kept secret.");
        Finance_Section section258 = new Finance_Section("Constitution of Boards.","cat15","A Board should consist, where possible, of three officers (including the president).  The President should be as senior as possible and hold a post in grade level 10, or higher; the other members should not be lower than grade level 08.  The officer in charge of the cash, etc. should be present when the Survey is being held but may not serve on the Board.  At offices where it is not possible to assemble a Board satisfying the above conditions, a board of one officer only may be appointed.  An explanation of why a full Board could not be appointed should appear on the Board of Survey’ report.");
        Finance_Section section259 = new Finance_Section("Members to report to officer Convening","cat15","Officers appointed to a Board of Survey must report immediately to the convening authority if they are unable to serve.");
        Finance_Section section260 = new Finance_Section("Suspension of Business","cat15","No Cash transaction may take place between the close of business at the end of the financial year and the meeting of the Annual Board.  On other occasions cash transaction must cease until the Board has completed the survey.  Should the verification of cash, etc, last more than one day, the unverified portion must remain under the joint control of the Board and the officer-in-charge of the cash until completed.");
        Finance_Section section261 = new Finance_Section("Duties of Boards and Surveying officers","cat15","Boards of Survey and Surveying Officers are required to check the cash book registers by casting the entries for the month actual cash etc.  The balances brought forward at the beginning of the month must also be checked by reference to the cash book of the previous month.  The cash-book folio and the stamp registers shall be certified accordingly.  If a bank account is kept, a certificate of the balance must be obtained from the Bank by the president of the Board or surveying officers and reconciled with the bank balance shown in the cash book.  A test check of entries in the cash book against vouchers should be made.");
        Finance_Section section262 = new Finance_Section("Counting of Cash.","cat15","All currency notes must be counted in detail including sealed packages of notes from the Bank.");
        Finance_Section section263 = new Finance_Section("Certification of Cash Book","cat15","The cash balance shall be certified by the Board on both the original and duplicate copies of the cash book.");
        Finance_Section section264 = new Finance_Section("Surplus or shortage","cat15","Any surplus disclosed as a result of a Board of Survey or by a surveying officer must be brought to account in the Cash book as a Credit to revenue Head: Miscellaneous, Sub-Head:  Sundries. Any shortage must be made good by the officer responsible or charged to an advance account for investigation.  A serious shortage must be reported immediately to the Accountant-General with a copy to the Auditor-General in accordance with Chapter 16 of these Regulations.");
        Finance_Section section265 = new Finance_Section("Return of proceedings","cat15","On completion of a survey, a report shall be rendered in triplicate on Treasury Form 42, the certificate being signed by all members of the Board. One copy shall be forwarded, by the president or surveying officer, not later than two weeks after the date of survey, to the Accountant-General who shall transmit one copy to the Auditor-General, and the third copy to the Accounting officer concerned.");
        Finance_Section section266 = new Finance_Section("Surprise inspections","cat15","Accounting officers must issue instructions for systematic inspection at irregular intervals of the cash held by their subordinates.  A record of such inspections must be kept.");
        Finance_Section section267 = new Finance_Section("Officers of Audit Department and Boards of Survey.","cat15","An officer of the Audit Department may not serve on a board of survey except on express instruction of the Auditor-General or after his permission has been obtained by the convening officer.");









        Finance_Section section268 = new Finance_Section("Shortages in cash.","cat16",".   In all cases of shortages in cash, whether such losses arise from fraud, theft or irregular payments, the following procedure shall be complied with in the following sequence.");
        Finance_Section section269 = new Finance_Section("(a) Officer in charge of the cash in which shortage is found.\n" +
                "\n" +
                "(b) The Most senior Officer of the Ministry,\n" +
                "Department/\n" +
                "Agency in the Station.\n","cat16","Shall report to his Head of Department immediately:\n" +
                "\n" +
                "\n" +
                "\n" +
                "(i)\tReport to the Police immediately if there is the slightest possibility of fraud being involved.\n" +
                "(N.B. – Officers in doubt should err on the side of suspicion, as failure to do so often hampers Police operations).\n" +
                "\n" +
                "(ii)\tForward particulars (including a statement as to whether the matter has or has not been reported to the police) to the Head of Department concerned and to the Accountant-General and Auditor-General.  A more explanatory letter is to follow immediately.\n" +
                "\n" +
                "(iii)\tInitiate and complete five copies of part 1 of form 146 and forward them to the Head of Department concerned.\n");
        Finance_Section section270 = new Finance_Section("(c)  Accounting Officer.","cat16","(i)\tAs soon as the general circumstances of the loss are known, an interim report should be forwarded immediately to the Accountant-General with copies to the Permanent Secretary, Ministry of Finance and the Auditor-General.  He should also investigate fully, the whole incident and situation and convene a Board of Enquiry if he considers it necessary.\n" +
                "\n" +
                "(ii)\tComplete parts 2 and 3 of the Treasury Form 146 referred to at (b) (iii)   above and send copies to the Permanent Secretary, Ministry of Finance, the Auditor-General, the Accountant-General, and the Secretary, Civil Service Commission, within thirty days of the receipt of Treasury 146.\n" +
                "\n");
        Finance_Section section271 = new Finance_Section("(d) Secretary, Civil Service Commission.","cat16","(i)\tAdvise the Accountant-General, if he disagrees with recommendation not to convene a Board of Enquiry or with the terms of reference of the Board.\n" +
                "\n" +
                "(ii)\t   Place the recommendations of the Accountant- General and finding of the Board of Enquiry before the Commission for consideration and decision.\n");
        Finance_Section section272 = new Finance_Section("(e) Accountant-General.","cat16","(i)\tEnsure that the correct procedure has been followed by the Department concerned, e.g. submission of Treasury Form 146, Board of Enquiry/Police report as may be necessary to guarantee that full information is available.\n" +
                "\n" +
                "(ii)\tExamine all evidence and reports available and call for further investigation locally if necessary.\n" +
                "(iii)\tRequest the Permanent Board of Enquiry to convene a Board if he has a good reason to disagree with a decision not to call for one.\n");
        Finance_Section section273 = new Finance_Section("(f)  Permanent Secretary, Ministry of Finance.","cat16","(iv)\tSend to the Permanent Secretary, Ministry of Finance, a report and make comprehensive recommendations.");
        Finance_Section section274 = new Finance_Section("(g)  Accounting Officer.","cat16","(i)\tNotify the Accounting Officer, the Auditor-General and the Accountant-General, of the decision of the appropriate authority. The comments of the Auditor-General should be obtained before a final decision is taken.\n" +
                "\n" +
                "        Implement decision of the appropriate authority.\n");
        Finance_Section section275 = new Finance_Section("(h)All Officers concerned.","cat16","     Prompt action at all stages is essential.  It must be borne in mind that in the event of a loss that might have been prevented through prompt action on an earlier loss, the officer(s) responsible for undue delay in taking action regarding the earlier loss may be held responsible in whole or in part for the later loss.");
        Finance_Section section276 = new Finance_Section("Board of Enquiry","cat16",".   (a)   Any Board of Enquiry should include an accounts officer.  The Board of Enquiry convened to investigate a loss shall meet at times and places most suitable for efficient investigation but, where action by the Police is also being taken, the final deliberations and recommendation of the Board shall be deferred until the completion of Police action  and shall include consideration of any relative Police reports and/or Court proceedings.  The holding of the Board should not be deferred owing to the fact that criminal proceedings are pending in connection with the loss.  Although it would not be possible for the Board to examine any person against whom a criminal charge has been preferred, it is important that the Accountant-General should be placed in possession of all the facts relating to the circumstances of the loss with the least possible delay in order that any weakness in the accounting system which investigation of the loss may reveal, may be corrected immediately.  The Board should therefore, direct its enquiries towards discovering such weakness, and submit its report even though they are not able to include a recommendation as to the fixing of responsibility for the loss.\n" +
                "\n" +
                "(b)     Where it is impracticable to record evidence verbatim, it shall be summarized by the Board in such a manner as to facilitate examination and deductions.  The Board’s report should include:\n" +
                "   \n" +
                "(i)\tAn opinion as to whether the system or personal operation thereof was at fault, and suggestions as to any remedy which may appear to be practicable in view of local conditions.\n" +
                "\n" +
                "(ii)\tA recommendation as to fixing of responsibility for the loss in whole or in part; and\n" +
                "\n" +
                "(iii)\tThe degree of apportionment, if it is considered that there is collective responsibility.\n" +
                "\n" +
                "(c)     Five copies of the proceedings and report of the Board shall be sent to the Accounting Officer who shall attach his comments and forward copies to the Permanent Secretary, Ministry of Finance, the Auditor-General and the Accountant-General.\n");
        Finance_Section section277 = new Finance_Section("Civil Action after Conviction.","cat16","Where criminal proceedings are instituted, leading to a conviction, the Accounting Officer should immediately investigate the prospects of recovery by means of a Civil action from the assets of the convicted person or persons, and the result of such investigation should be communicated to the Permanent Secretary, Ministry of Finance, Auditor-General and the Accountant-General.");
        Finance_Section section278 = new Finance_Section("Deficiencies found by Board","cat16","Details of any deficiency disclosed as the result of a Board of Survey on cash shall be included in the report of such Board, together with a statement that the Board has satisfied itself that the officer immediately in charge of the cash has duly taken the initial action required by Financial Regulations.");
        Finance_Section section279 = new Finance_Section("Officer interdicted:  emoluments of.","cat16","When an officer has been interdicted from duty such proportion of his emoluments as the Civil Service Commission allows him to receive shall not be impounded or subjected to any reduction or abatement in respect of any claim which Government may have against him in connection with the reason for his interdiction.");
        Finance_Section section280 = new Finance_Section("Emoluments to cease after criminal conviction","cat16","The proportion of emoluments allowed to be received during a period of interdiction shall cease as from the date of criminal conviction.");
        Finance_Section section281 = new Finance_Section("Losses where no fraud or theft is involved.  Accounting Officer’s personal power to surcharge.  Accounting Officer to inform Civil Service Commission, Auditor-General and Accountant-General when power of surcharge is use","cat16","(a)    Where a cash loss has occurred without fraud or theft being involved, Accounting Officers are personally empowered to surcharge the officer or officers responsible up to the full amount of the loss, provided the officer’s salary is not above level 06 but officers on level 07 and above should be referred to the Civil Service Commission.  Accounting Officers are personally responsible for ensuring that any surcharges they authorise are duly recovered.  Where  a loss is treated under this Regulation, the Accounting Officer must immediately send a brief report of the circumstances including the value of the loss and the name(s) of the officer(s) he has surcharged, together with the amounts of the surcharge in each case, to the Secretary,\n" +
                "Civil Service Commission, Auditor-General and the Accountant-General.  On receipt of this report and after consideration and acceptance of it write-off approval, if still required, shall be conveyed to the Accounting Officer by the Accountant- General.\n" +
                "\n" +
                "   (b)    A shortage treated under this Regulation shall be charged as a personal advance against the officer responsible for the cash, pending a decision.\n");
        Finance_Section section282 = new Finance_Section("Recoveries and surcharges.","cat16","A surcharge is not a disciplinary measure and it can be made at any time whether or not disciplinary proceedings are being taken in respect of the circumstances leading to the surcharge. A surcharge can be justified whenever there is a degree of culpability, even though the same degree of culpability would not support the disciplinary charge for negligence or in-efficiency.  A degree of negligence which though proved does not in fact contribute to a loss or to its non-detection cannot support a surcharge in respect of that loss.  For a surcharge to be made there should be some degree of negligence or culpability on the part of the officer concerned which contributed to the loss positively or negatively.\n" +
                "\n" +
                "16008.  Recoveries made or surcharges imposed shall be credited to the Ministry/Department suffering the loss.\n");
        Finance_Section section283 = new Finance_Section("Doubtful cases.","cat16","In cases of doubt or where losses do not clearly fall into the above categories each case shall be decided on its merits.");
        Finance_Section section284 = new Finance_Section("Account to be charged.","cat16","On the discovery of a loss of funds, the amount of the loss shall normally be charged to a Non-Personal Advance Account of the Ministry or Unit concerned pending the investigation of the loss.");
        Finance_Section section285 = new Finance_Section("Accounting entries.","cat16","The type of the accounting entry required to charge a loss to the Advance Account shall depend upon the nature of the loss and the date of the original transactions when payments are involved, thus:\n" +
                "\n" +
                "Types of Loss                                                      Accounting Entry Required\n" +
                "\n" +
                "a.    Loss of Cash                                               Charge the loss to the advance\n" +
                "                                                                            account under the authority of \n" +
                "                                                                           a payment voucher.\n" +
                "\n" +
                "b.    Fraudulent or over-payments                 Transfer the amount by raising\n" +
                "       made and discovered within                    adjustment voucher debiting\n" +
                "       the same financial year.                            Advances accounts, and crediting\n" +
                "                                                                            the account originally debited.\n" +
                "\n" +
                "d.     Fraudulent payments made                   Transfer the amount by adjustment \n" +
                "       in a previous financial year                     voucher, debiting advances account   \n" +
                "       charged against the  Consolidated            and crediting Revenue Miscellaneous\n" +
                "      Revenue Fund, or the Development        Head “Sundries” Sub-head of the \n" +
                "      Fund.                                                           current years Estimate.\n" +
                "\n" +
                "e.    Unrecovered over-payment,                    No adjustment is necessary, but the \n" +
                "       not involving fraud, made in a                 abandonment of the recovery must \n" +
                "       previous financial year charged              of the recovery must be registered \n" +
                "       against the Consolidated Revenue          by the Accountant-General as a loss.\n" +
                "      Fund or the Development Fund.\n" +
                "\n" +
                "f.     Abandonment of the recovery               No adjustment is necessary, but the \n" +
                "       of a Bicycle Advance issued                    abandonment of the recovery must \n" +
                "       Initially from Recurrent                           be Registered by the Accountant-\n" +
                "       From Recurrent Expenditure.                 General as a loss.\n" +
                "\n" +
                "g.     Abandonment of the recovery                 On availability of funds from Ministry\n" +
                "       of an amount of advance charged         of Finance, transfer the amount by\n" +
                "       initially on advances account.                 Adjustment Voucher, debiting Loss\n" +
                "                                                                          of funds and crediting Advances \n" +
                "                                                                          Accounts.\n" +
                "                                                                      \n" +
                "h.   Abandonment of the recovery of          No adjustment is necessary but \n" +
                "                                                                                          abandonment of the Accountant-\n" +
                "                                                                                          General as a loss.\n");
        Finance_Section section286 = new Finance_Section("Officers to initiate\n" +
                "Accounting\n" +
                " entries.\n","cat16","The Head of Accounts/Treasury Cash Officer or the Officer Controlling Expenditure concerned in a loss shall initiate the accounting entries required under Financial Regulation 16011 and shall ensure that an additional copy of the accounting document is forwarded to the Accountant-General attached to the report on the loss on Treasury Form 146. If the adjustment for a loss originates within a Ministry the adjustment shall be passed through the accounts.");
        Finance_Section section287 = new Finance_Section("Recovery of the loss.","cat16","The recovery of the amount of a loss, whether in part or the whole by physical recovery or by repayment, shall be credited to the Non-personal Advance Account initially, charged under Financial Regulation 16010, but be credited directly to the miscellaneous Head of the Current Estimates, Sub-Head ‘Sundries’.");
        Finance_Section section288 = new Finance_Section("Surcharge Classification of.","cat16","The receipt of a surcharge, whether in whole, or by installment, shall be credited to the Miscellaneous Revenue Head of the Current Estimates, sub-head ‘Sundries’");
        Finance_Section section289 = new Finance_Section("Loss written-off , Classification of.","cat16","Losses when written-off shall be charged to the loss of funds sub-head of the current head of Expenditure of the Ministry, Department or Agency.");
        Finance_Section section290 = new Finance_Section("Application for funds to cover losses.","cat16","When funds under the loss of funds sub-head of Expenditure are insufficient to meet the amount of a loss to be written-off, the Accounting Officer concerned must apply for additional funds, by application for a supplementary provision under Financial Regulation 07014.");
        Finance_Section section291 = new Finance_Section("Convening of Board of Enquiry.","cat16","The Accountant-General shall order the Secretary, Permanent Board of Enquiry to convene a Board of Enquiry at the request of the Accounting Officer or Secretary, Civil Service Commission, or when he, the Accountant-General deems it necessary for one to be convened. The Board of enquiry shall investigate the circumstances of the loss of funds (excluding losses dealt with in financial Regulation 16007). The Secretary in convening the Board shall incorporate in the convening order any special terms of reference for the Board as may be required by the Accountant-General.");
        Finance_Section section292 = new Finance_Section("Convening Notice: Distribution of.","cat16",".   The officer convening a Board of Enquiry shall forward a copy of the convening order with full terms of reference to:\n" +
                "\n" +
                "    (a)    Accounting Officer,\n" +
                "    (b)    Accountant-General of the State\n" +
                "    (c)    Auditor-General of the State\n" +
                "    (d)    Secretary, Civil Service Commission.\n");


        Finance_Section section293 = new Finance_Section("Justification for Deposit.","cat17","Deposits should not be accepted unless thoroughly justified.  In particular, monies may not be received from members of the public merely for safe custody and should normally be accepted by Government officers only in the course of their official duties. Unclaimed salaries, wages, pensions, or other payments may not be placed on deposit.  Except with the approval of the Accountant-General, a deposit account may not be used as a means of transferring payments or remitting money.  Revenue may not be placed on deposit.  Officers are forbidden to place on deposit any unexpended balance of any vote for the purpose of meeting impending payments.");
        Finance_Section section294 = new Finance_Section("Deposit Register.","cat17","A Deposit Register shall be maintained by all officers receiving deposits, and in it particulars of all deposits made or withdraw shall be recorded under the name of the depositor.  Deposits and withdrawals shall be posted daily from the cash book.");
        Finance_Section section295 = new Finance_Section("Reconciliation with the Treasury.","cat17","Detailed accounts of deposit shall be maintained by Accounting Officers and the balances in those accounts shall be reconciled at quarterly intervals with the control accounts kept by the Accountant-General.  Where Deposit Registers are kept at outstations of a Department it shall be the responsibility of the Accounting Officer to ensure that these registers agree with his records.");
        Finance_Section section296 = new Finance_Section("Miscellaneous Deposits.","cat17","Minor or temporary deposits should be recorded in a general Station Deposit account.  It is important that sufficient details of each deposit should be given to ensure recognition of withdrawals.");
        Finance_Section section297 = new Finance_Section("Receivable Orders.","cat17",".   Receipt Vouchers relating to deposits should clearly indicate:\n" +
                "\n" +
                "         (1)   the person(s) on whose behalf the deposit is made;\n" +
                "         (2)   the nature of the transaction; and\n" +
                "         (3)   the necessity for placing the sum on deposit.\n");
        Finance_Section section298 = new Finance_Section("Withdrawals from Deposit.","cat17","Withdrawals from deposit should be supported, whenever possible by the receipt issued when the money was placed on deposit.  When the withdrawal is for the whole amount of the deposit, the receipt shall be marked ‘REPAID’ and attached to the withdrawal voucher.  In the case of partial withdrawals the receipt, if available, should be endorsed with the amount withdrawn, the number, month and station of the withdrawal voucher.  In all cases the receipt voucher number, month and station of account should be shown on withdrawal vouchers.  Before signing withdrawal vouchers, Heads of Accounts must satisfy themselves that the money is actually on deposit.  The vouchers must be receipted by the payee.");
        Finance_Section section299 = new Finance_Section("Repayment of Deposits of other Stations.","cat17","A deposit shall not be repaid at a station other than at which it was received except on a payment voucher endorsed by the Head of Accounts at the receiving station ‘Checked and Passed for payment at…………………………….only’ ");
        Finance_Section section300 = new Finance_Section("Deposits of over two years ","cat17","The voucher shall be sent to the Accounts Officer at the payment station and not to the payee");
        Finance_Section section301 = new Finance_Section("Deposits of over two years standing.\n" +
                "Deposit of five years standing and over.\n","cat17","Moneys which have been on deposit for over two years may not be repaid without prior reference to the Accountant-General.");
        Finance_Section section302 = new Finance_Section("Deposits of Forest Royalties.","cat17","Deposits which have remained unclaimed for five years or more should be reported to the Accountant-General by the officer responsible for the deposit Account.  If at any time the Accountant-General considers that a deposit is unlikely to be reclaimed, he may transfer it to revenue.  This action should be taken only when a deposit has not been reclaimed after five years.  Sufficient detail should be furnished to enable a decision to be taken as to whether a deposit or deposits should be transferred to revenue.  On receipt of notification of transfer to revenue, the officer responsible for the deposit or deposits and the Accounts Officer concerned shall record the transactions in their deposit ledgers.");
        Finance_Section section303 = new Finance_Section("Moneys not to be deposited.","cat17","Receipt vouchers relating to Forest Royalties should quote the number and date of the licence or timber permit to which they relate.");
        Finance_Section section304 = new Finance_Section("Special Instructions to be approved by the Accountant-General.","cat17","Salaries, wages, and sums due to merchants, etc, may not be placed on deposit at one station for payment at another.");
        Finance_Section section305 = new Finance_Section("Annual Balances.","cat17","\n" +
                "  17012.  Accounting Officers shall draw up a code of instructions for the operation of deposit accounts peculiar to their Ministry/Departments.  These instructions shall be subject to approval by the Accountant-General in consultation with the Auditor-General.\n" +
                "\n" +
                " 17013.   Deposit Registers must be balanced and ruled off at the end of each financial year and all outstanding balances bought down in detail.  All entries must be adequately cross referenced.\n");










        Finance_Section section306 = new Finance_Section("Personal Advances;  authority for","cat18","Personal advances (i.e. advances of cash to individual officers in the employment of the State Government) may only be granted on the authority of these Regulations, of Civil Service Rules or, in special circumstances, the specific authority of the Commissioner for Finance.");
        Finance_Section section307 = new Finance_Section("Non-personal Advance:  authority to be given by.","cat18","Advances of a non-personal character shall be authorized by the Commissioner for Finance except advances created under the authority of Financial Regulation 16010.  Applications for non-personal advances must state the reason for the account, the method of clearance and the person to be held responsible for clearing the advance.");
        Finance_Section section309 = new Finance_Section("Particulars to be given on payment vouchers.","cat18","Vouchers relating to advances must indicate:\n" +
                "(a)\t  The account number and the person or the   name of the account chargeable.\n" +
                "\n" +
                "                (b)    The nature of the advance.\n" +
                " \n" +
                "                (c)    The terms of recovery\n" +
                "     \n" +
                "                (d)     The authority for the advance.\n");
        Finance_Section section310 = new Finance_Section("Advances record for advances charge “below-the-line”.","cat18","The Accounting Officer of a Ministry/Department/Agency shall ensure that an indexed Advance Account Record for advances ‘below-the-line’ is maintained to record therein each advance issued and all the recoveries made.  Transactions must be posted punctually and the sum total outstanding at the end of each month must be reconciled with the Accountant-General’s Control Account.  Officers responsible for the advance accounts record must examine such record each month and are also responsible for bringing to the notice of the Accounting Officer any items which are overdue for settlement.");
        Finance_Section section311 = new Finance_Section("Accounting Officers:  Responsibility of.","cat18","Accounting Officers are responsible for ensuring the prompt repayment by instalments or otherwise, of all advance made by them.");
        Finance_Section section312 = new Finance_Section("Salary Advances.","cat18","An advance not exceeding one month’s salary may, with the sanction of the Accounting Officer be made to an officer who, on first appointment or on proceeding on transfer, has to bear wholly or, partly the cost of his own or his family’s transport. All such advances must be paid in six equal and consecutive monthly instalments starting from the month in which full pay is next earned.");
        Finance_Section section313 = new Finance_Section("Advance to Officer:  Rent of accommodation for.","cat18","An officer proceeding on transfer to a new station, or an officer on first appointment who is not living in Government residential quarters may receive an advance of not more than two month’s salary on production of proof that he has or had to pay rent in advance for accommodation.  Such an advance shall not be granted on the expiration of twelve months from the effective date of the transfer or the first appointment.");
        Finance_Section section314 = new Finance_Section("Second Advance not permitted except after clearance of first advance","cat18","Except in the case of an officer subsequently qualifying for a second advance under Financial Regulation 18007 having previously been granted an advance under Financial Regulation 18006, a second advance of salary may not be drawn until any previous advance of salary has been fully repaid.");
        Finance_Section section315 = new Finance_Section("Salary Advances:  Classification of","cat18"," Advances of salary and recoveries thereof must be classified to an advance account in the officer’s name, and not in any circumstances to a personal emoluments vote.");
        Finance_Section section316 = new Finance_Section("Conditions of granting the advance:  motor vehicle.","cat18","Officers may be recommended to the Accountant-General for advances to purchase motor cars only if they are eligible under the rules which may be prescribed from time to time.  Where an advance is granted, the officer shall be required to enter into an agreement with Accountant-General for its repayment.");
        Finance_Section section317 = new Finance_Section("Officers’ financial  circumstances.","cat18"," An officer may not be considered for an advance when the cost of maintaining a motor-vehicle and repaying the instalments are liable to cause him financial embarrassment.  Full account shall be taken of an applicant’s emoluments and deductions from there including any outstanding loans.\n" +
                "\n" +
                "     Advances other than advances of salary may be granted to officers for the purposes and subject to the conditions indicated in the Chapter, provided that the total of an officer’s monthly repayments of such advances does not exceed one-third of his gross monthly salary. \n");
        Finance_Section section318 = new Finance_Section("Officers eligible for vehicle Advances","cat18","(a)   All officers on salary grade levels 07 and above are eligible for motor vehicle advance.\n" +
                "\n" +
                "      (b)   All officers on salary Grade levels 03 to 06 are eligible for motor cycle advance.\n");
        Finance_Section section319 = new Finance_Section("No new advance until previous advance paid.","cat18",".   No officers shall be eligible for an advance until the previous advance has been fully repaid.");
        Finance_Section section320 = new Finance_Section("Maximum advance.","cat18","The amount of vehicle advance shall be as determined by the State Government from time to time.");
        Finance_Section section321 = new Finance_Section("Application procedure.","cat18","Officers seeking motor vehicle advance shall complete application Form ODS. 15 in five copies and submit to the Accounting Officer of their Ministry/Department for consideration.\n" +
                "\n" +
                "     (ii)    When an advance has been recommended, it shall be passed to the Ministry of Finance for approval after completion of Part III of Form. ODS. 15 by the Accountant-General.  Four copies of the same form shall be passed to the Ministry/Department for preparation of payment voucher.  The payment Voucher shall then be forwarded to the Treasury Cash Office for payment.\n" +
                "\n" +
                "   (iii)    An officer to whom an advance is granted for the purchase of a motor vehicle shall be required to enter into an agreement with the Accountant-General on Agreement Form A/Cs. Gen.27.\n" +
                "\n");
        Finance_Section section322 = new Finance_Section("Insurance for Motor Vehicles.","cat18","An officer to whom an advance is given to purchase a motor vehicle shall be required to insure the vehicle comprehensively with an Insurance Company on the approved Government List during the period of repayment of the advance.  The amount for which the vehicle is insured must not be less than the aggregate amount of the principal or the balance of the principal and interest thereon for the ensuing twelve months.  Head of Ministries/Departments shall verify annually that such comprehensive insurance has been taken out.  For this purpose, Ministries/Departments are required to maintain a Motor Vehicle Advance Insurance Register.");
        Finance_Section section323 = new Finance_Section("Repayment of advance.","cat18","The interest payable on an advance granted to an officer shall be calculated as in the Treasury Interest Table.\n" +
                "\n" +
                "  18018.    The advance together with interest, which shall be at the rate approved by the appropriate authority shall be repaid by equal monthly instalments calculated to cover both principal and interest, and deducted from the officer’s salary commencing with the salary of the month following that in which the advance is granted.  Repayment shall not exceed a maximum period of five years.\n");
        Finance_Section section324 = new Finance_Section("Calculation of interest.","cat18","The interest payable on an advance granted to an officer, shall be calculated as in the Treasury Interest Table.");
        Finance_Section section325 = new Finance_Section("Reduced Interest Calculation of.","cat18","An officer to whom an advance has been granted may at any time during the continuance of the original agreement, elect to refund the advance in full.  In such a case, the outstanding interest payable on the advance shall be recalculated in accordance with the Treasury Interest Table.  The total amount payable by the officer shall then be the outstanding principal of the advance plus the reduced interest.");
        Finance_Section section326 = new Finance_Section("Settlement of advance on transfer to other State Civil Service.","cat18","When an officer is transferred to the Civil Service of another State, arrangements shall be made to transfer the outstanding balance of his advance to such a State for recovery.");
        Finance_Section section327 = new Finance_Section("Settlement of advance on transfer to Statutory Corporation, etc.","cat18","When an officer with an outstanding advance transfers to a Statutory Corporation or quasi-Government Establishment, the Statutory Corporation and Ministry/Department shall be required to take over the liability, balance of principal and accrued interest.  When all attempts to recover such an outstanding loan fail, immediate action shall be taken to repossess the vehicle and to sell it, if necessary.");
        Finance_Section section328 = new Finance_Section("Recovery of Advance on termination or on resignation of appointment","cat18","If an officer resigns his appointment or leaves the service by termination of appointment or dismissal without liquidating his advance, unless the officer enters into an acceptable agreement for the liquidation of the outstanding balance, the Accounting Officer or any officer duly authorized by him shall seize and sell the motor vehicle purchased with the advance and any monies realized from the sales shall be applied towards payment of the outstanding balance of the advance together with the interest thereon.");
        Finance_Section section329 = new Finance_Section("Recovery of advance on retirement.","cat18","The outstanding balance of an advance is recoverable in full from the last salary and gratuity of an officer who leaves the service on retirement. Where these retiring benefits are insufficient to cover the outstanding balance of the advance, action shall be taken to repossess the vehicle and to sell it, if necessary.");
        Finance_Section section330 = new Finance_Section("Estate of Deceased Officer.","cat18","The outstanding balance of an advance is recoverable in full from the estate of a deceased officer.");


        Finance_Section section331 = new Finance_Section("Proceeds after sale of repossessed vehicles.","cat18"," (a)    Where the proceeds of the sale resulting in circumstances outlined in Financial Regulation 18023 to 18025 are less than the outstanding balance of an advance together with interest thereon the shortfall shall be recovered from the estate of the officer. \n" +
                "\n" +
                "   (b)    Where the proceeds of the sale as stipulated in (a) above are more than the outstanding balance of an advance together with interest thereon, the difference shall be paid to the officer or his estate after deduction of the administrative expenses incurred.\n");
        Finance_Section section332 = new Finance_Section("Advances Ledger cards.","cat18","Separate ledger cards must be maintained in  respect of individual advance issued.  The ledger cards must be posted and balanced each month.  A control account showing total payments and total refunds for each month must also be maintained.  The control account balances shall be reconciled monthly with the individual ledger balances.");
        Finance_Section section333 = new Finance_Section("Proper account and of records to be kept.","cat18","Proper accounts and records shall be kept in respect of all advances issued and repayments thereof.");
        Finance_Section section334 = new Finance_Section("Correspondence Courses: advance for.","cat18","Advances for Corresponding courses may be authorized by an Accounting Officer subject to the following conditions:\n" +
                "\n" +
                "(a)\tThat the ability and efficiency of the officer warrants his taking the course;\n" +
                "(b)\tThat the subjects are related to his work;\n" +
                "(c)\tThat the study is likely to increase his efficiency;\n" +
                "(d)\tThat the course is with a reputable College or Establishment;\n" +
                "(e)\tThat the officer will be required to produce receipts to show that the whole advance has been used for the purpose intended;\n" +
                "(f)\tThat the officer understands that successful completion of the course will not by itself constitute grounds for advancements;\n" +
                "(g)\tThat the officer will enter into an agreement (Treasury Form 51) for repayment and if the officer has less than two year’s service he will produce an acceptable surety who will enter into a bound for the amount advanced;\n" +
                "(h)\tThat the advance shall be granted interest free; and \n" +
                "(i)\tThat the advance does not include an element for postage, stationery, examination or other fees, etc.\n");
        Finance_Section section335 = new Finance_Section("Outstanding balance  reco- verable from salary of officer\n" +
                "Leaving service.\n" +
                "Deceased Officers: When balance of advance is not recoverable in full. \n","cat18"," The outstanding balance of any advance is recoverable in full from the last payment of salary of an officer who leaves the service on retirement, resignation, termination of appointment, or dismissal.\n" +
                "\n" +
                "     18031.  The outstanding balance of an advance of salary shall not be recovered from the estate of a deceased officer who received no gratuity from government funds.  Government accepts liability for the irrecoverable balance in these circumstances\n");
        Finance_Section section336 = new Finance_Section("Officers on Transfer; details of outstanding advances to be advised.","cat18","In the event of an officer being transferred to another Ministry or paying station before an advance is recovered, the amount of the advance and recoveries up to the date of transfer must be stated on the copy of the officer’s Last Pay Certificate forwarded to the new Ministry or paying station (see Financial Regulation 19015).  The Head of Account of the station at which the officer will in future draw his pay shall note the outstanding balance of the advance in his advances Ledger (or Last Pay Certificate), as the case may be and effect recoveries accordingly.");
        Finance_Section section337 = new Finance_Section("Officer responsible for making repayment.","cat18","The lack of any advice regarding repayment of any installments of an advance does not absolve an officer from repaying an advance in accordance with the terms of the Regulations.  Any installments missed for this reason shall be recoverable in full on receipt of these documents.");
        Finance_Section section338 = new Finance_Section("Accounting Officers responsible for recovery","cat18","It is the responsibility of the Accounting Officer to ensure that the whole of any advance is fully recovered by the due dates.");







        Finance_Section section339 = new Finance_Section("Authority for salary payment","cat19","(i)   When an officer is first appointed, the authority for payment of his salary to commence and the rate of salary to be paid shall be a notification from the Secretary, Civil Service Commission, to the Head of Department of the officer’s Ministry or Department copied to the Accountant-General and the Auditor-General, except that, where powers of appointment have been delegated by the Civil Service Commission to a Head of Department, the authority is a notification from the Head of Department to the Accountant-General, copied to the Auditor-General.\n" +
                "  \n" +
                "    (ii)  The authority for any change in salary resulting from an officer’s promotion or transfer is a notification as in (i) above.\n" +
                "\n" +
                "    (iii)  The authority for increments of salary is contained in the offer of appointment made to and accepted by an officer, subject to any subsequent duly authorized notification. \n");
        Finance_Section section340 = new Finance_Section("Payment through a bank","cat19","(i)  All officers shall have their salaries and allowances paid through a bank of their choice.\n" +
                "\n" +
                "    (ii)   An officer serving at a station where there are no banking facilities may have his salary, etc. paid to the nearest bank in the State.\n");
        Finance_Section section341 = new Finance_Section("Calculation method of","cat19","Salaries and allowances which are based on an annual rate shall be paid by monthly instalments of one-twelfth of the annual rate.  On retirement or termination of appointment, payment for part of a month shall be calculated according on pro-rata basis.");
        Finance_Section section342 = new Finance_Section("Not to be paid in advance.","cat19",".  Salaries, allowances and pensions must not be paid in advance of the due date, except as provided for in Chapter 18.");
        Finance_Section section343 = new Finance_Section("Accounting  Officer Responsibility to keep records.","cat19","The Accounting Officer must ensure that Personal Emolument Records are maintained on the prescribed forms to ensure that payments are made when they are due, that over-payments are not made and that all the required deductions are made at the correct time.");
        Finance_Section section344 = new Finance_Section("Advice to withhold pay.","cat19"," (i)    The Officer controlling expenditure must be informed at the earliest possible moment of any contingency likely to affect an officer’s salary (such as death, interdiction, suspension or liability to dismissal etc) in order that instructions to with-hold pay may be issued without delay.");
        Finance_Section section345 = new Finance_Section("Failure to pass information on withholding of payment: Offence","cat19","(ii)    An Officer who first receives information about the resignation, determination, dismissal, death, withdrawal or retirement of another officer shall pass the information promptly, by submitting a copy of such letter/notice to the Accounts Department for the salary of the officer to be stopped.  The original letter/notice of such information shall be endorsed to the effect that a copy has been sent to the Accounts Department.");
        Finance_Section section346 = new Finance_Section("Payment of salary during interdiction.","cat19","The Officer  who first received the information and failed to pass a copy of it promptly to the Head of Accounts and any other officer who defaults or contributes in any way whatsoever in communicating a decision to withhold payment of salary shall be liable to surcharge and discipline for negligence and dereliction of duty.\n" +
                "\n" +
                "     19007.   When an officer has been interdicted, he is not entitled to full salary except with the approval of the Civil Service Commission. If no instructions have been received as to the rate of salary to be paid, Heads of Departments should apply to the Civil Service Commission for instructions.\n");
        Finance_Section section347 = new Finance_Section("Increments: notice of.","cat19","The Auditor-General does not need to be advised to the grant of a normal increment, but he must be advised when an increment is with-held or deferred and subsequently restored.");
        Finance_Section section348 = new Finance_Section("Cessation or termination, etc.","cat19","On dismissal from the Service or on termination of appointment or on resignation, the salary of an officer shall be payable up to and including the day prior to that on which the dismissal, termination, or resignation becomes effective.");
        Finance_Section section349 = new Finance_Section("With-holding of","cat19",".  Any balance of salary or other moneys due to an officer who has been convicted of misappropriation of Government funds or theft of Government property, or who has been dismissed and is indebted to government, may not be paid without the authority of the Accountant-General.");


        Finance_Section section350 = new Finance_Section("Delay in payment  unclaimed salaries etc.","cat19"," Any undue delay in the application for payment of a pension or salary, or any other regular recurrent payment must be investigated by the Head of Accounts and when appropriate, the circumstances must be reported to the officer controlling expenditure and to the Accounting Officer.");
        Finance_Section section351 = new Finance_Section("Unclaimed salaries etc","cat19"," (i)  Unclaimed salaries, allowances and pensions shall be repaid to the Treasury within seven days from the date of the withdrawal of the cash and shall normally be classified as an expenditure credit to the vote originally debited.  All repayments made in accordance with this paragraph must be effected before the end of the financial year in which the salaries, allowances or pensions were drawn.  The Accounts Officer shall issue a Treasury Receipt for each individual in-payment.  A subsequent out-payment of an amount paid into the Treasury shall be debited to the appropriate current-vote, of charge under the supporting cover of a payment voucher Treasury form 1 with the cancelled Treasury Receipt attached.\n" +
                "\n" +
                "   (ii)   Any unclaimed amounts at the end of the financial year repaid in the following financial year shall be credited to revenue.\n");
        Finance_Section section352 = new Finance_Section("Leave salary: when paid to a bank.","cat19","The payment of a leave salary of an officer when the salary is normally paid to a bank shall continue to be paid to the bank of the officer’s choice at his duty station or at the station where the payroll is prepared.\n" +
                " \n");
        Finance_Section section353 = new Finance_Section("Transfer of officers","cat19","When an officer is transferred from one Ministry, Department or Agency to another, the authority for the payment of the salary and the continuance of the deductions there from, shall be conveyed to the new pay station on the prescribed Treasury Form 13 (Last Pay Certificate) enclosing a certified true copy of the personal emoluments record (see Financial Regulation 19006 and 19018) and both the letter and the record must show the date which the last payment of salary has been made.  The record must show full details of the deductions which have been made and which must continue to be made.  With the employment of a system other than the standard system, which does not require the personal emoluments card, the dispatching office must complete, by hand, a standard personal emoluments records for issue to the new office (see Financial Regulation 19018 (a) (b) and (c).");
        Finance_Section section354 = new Finance_Section("Accounting procedure for deductions from emoluments.","cat19","The gross amount of the emoluments must be charged against the relative personal emoluments sub-head of the Current Estimates.  The paying officer (i.e. the Accounts Officer), shall enter the total of each type of amount of the emoluments as a payment.");
        Finance_Section section355 = new Finance_Section("Procedure Approval by Accountant-General.","cat19","The procedure and method to be employed by the Ministries, Departments or Agencies for the recording and the calculation of personal emoluments must be approved by the Accountant-General.");

        Finance_Section section356 = new Finance_Section("Standard system.","cat19"," The standard payroll system to be employed in all offices, unless otherwise provided shall be as laid down or prescribed by the Ministry of Finance.");
        Finance_Section section357 = new Finance_Section("Personal Emoluments Record:  form of","cat19",".   The officer controlling expenditure shall ensure that the standard Personal Emoluments Card (A/Cs, Gen.20) shows:\n" +
                "\n" +
                "(a)\t In the top section of the front of the card, inter alia:\n" +
                "Standard rate of pay of the officer\n" +
                "Incremental date,\n" +
                "              Standard allowances,\n" +
                "              Salary and advances issued, \n" +
                "              Standard deductions to be recovered from the emoluments\n" +
                "              Income tax P.A.Y.E. Free Pay Allowances.\n" +
                "\n" +
                "(b)     In the lower section of the front of the entries in the monthly \n" +
                "    Payroll, to show, inter alia:\n");


        Finance_Section section358 = new Finance_Section("Custody of Personal Emoluments Records.","cat19","Aggregate gross emoluments, including separately taxable\n" +
                "              allowances,\n" +
                "              Income Tax P.A.Y.E. assessments,\n" +
                "              Standard deductions from emoluments,\n" +
                "              Net Emoluments payable.\n");
        Finance_Section section359 = new Finance_Section("Variation control Record of Personal Emoluments.","cat19","On the reverse side of the card inter alia:\n" +
                "  Record of taxable allowance due.\n" +
                "  Record of Gazette notices of promotion, acting appointments or \n" +
                "  other notification of a material variation in the emoluments of\n" +
                "   the officer. \n" +
                "       \n" +
                "\n" +
                " 19019.  The officer controlling expenditure shall ensure that the Personal Emoluments cards are kept under strict security arrangements, and that when they are not in use they are lodged in a fire-resistant cabinet, safe, or strong-room (see Financial Regulation 12034 of period of \n" +
                "retention).   \n" +
                "\n" +
                "19020.   The officer controlling expenditure shall ensure that a Variation Control Record on A/Cs. Gen. 25 is maintained to show each variation in the month under review, of emoluments, taxable allowances, and the standard deductions from emoluments for each officer.  The sum total of these variations shall be added to or subtracted from the relative total of the previous month, and from this shall be calculated the totals of emoluments, taxable allowances, gross taxable emoluments, and each type of standard deduction, for the current month.  The officer controlling expenditure shall ensure that:\n" +
                "\n" +
                "       (a)   The total of the various columns of the payroll for the month\n" +
                "               agree with the respective pre-determined totals of the\n" +
                "               Variations Control;\n" +
                " \n" +
                "       (b)   the officer directly in charge of the variation control is an officer not normally\n" +
                "                below the rank of an Accountant I or Senior Executive Officer (Accounts) and must not   be the officer directly in charge of the preparation of   the payroll.\n");
        Finance_Section section360 = new Finance_Section("Submission of Payroll to the Paying officer.","cat19","The monthly payroll shall be submitted to the paying officer (as follows).\n" +
                "\n" +
                "(a)\t         Salary List, (A/Cs, Gen. 21/21A) in original to contain    \n" +
                "\n" +
                "details of  the salary computation, duly grouped    \n" +
                "         according to separate  pay point or separate bank  \n" +
                "         branch involved.\n" +
                "\n" +
                "(b)\t  Salary List Summary, (A/Cs, Gen. 26) in duplicate to summarise  to totals of the various columns of the separate payrolls and to  provide the covering certificate of the officers employed in the   preparation and internal check of the payrolls, and also to  constitute the authorisation of the officer controlling the  expenditure for the payment.\n" +
                "\n" +
                "(c)\t  Variation Control of Emolument and Deduction (A/Cs, Gen.25) for each deduction sub-heal of account, in duplicate to show the total of the appropriate deduction on the Salary List Summary and to show when required by the Accountant-General, the full detail of the deduction made from the emoluments of each officer.\n" +
                "\n" +
                "(d)\t  Bank Payment Advice Slip, in original, together with Treasury Form 133 in original.\n" +
                "\n" +
                "(e)\t  Payment Vouchers, Treasury Form 1, in duplicate, to support the payment to the appropriate receiving authority of the deductions from payrolls, together with supporting copies of A/Cs, Gen. 25.\n");
        Finance_Section section361 = new Finance_Section("Classification of deduction","cat19","The classification of the deductions on the Variation Control of Emoluments and Deductions shall depend upon the type and nature of the deduction, as follows:\n" +
                "\n" +
                "(a)\t  Deductions from emoluments which are on-paid to a receiving authority (e.g Income Tax P.A.Y.E., Co-operative Thrift and Credit Society Deductions).  The classification of the deduction shall be as an expenditure credit to the vote charged with the relative gross emoluments.\n" +
                "\n" +
                "(b)\tThe classification of deductions from emoluments which are NOT on-paid e.g. Rent, Staff Housing Fund repayments, etc.  shall be according to the relative sub-head of Revenue or the below-the-line account concerned\n");
        Finance_Section section362 = new Finance_Section("Deductions on-payment of, to the  Receiving Authority.","cat19","The on-payments of the deductions made under Financial Regulation 19022 (a) shall be made to the receiving authority at the same time as the payment of the net emoluments, and the payment to the authority shall be made with a payment voucher Treasury Form 1 in support (see Financial Regulation 19021 (e).  The payments shall be classified according to Financial Regulation 19022 (a) and the officer controlling expenditure shall ensure that a separate section of the relative personal emoluments votes’ book is maintained to record the details of the on-payments, the details of the totals of the deductions, and to show the link between the relative entries.\n" +
                "\n");
        Finance_Section section363 = new Finance_Section("Internal Check","cat19","Officers controlling expenditure shall ensure that a complete and detailed internal check (not to be confused with an Internal Audit) is executed on each payroll before payment, and that the officers employed on the internal check are officers other than those who have been currently employed on the preparation of the payroll.  The voucher certificate on the Salary List Summary A/Cs. Gen. 26, under the title of ‘Checked by’ shall be signed by the officer directly in charge of the internal check.");
        Finance_Section section364 = new Finance_Section("Duties of officers to ensure that correct payments are made.","cat19",".   (I)   It is the duty of an officer authorising or making any payment to ensure that it is made in accordance with any general or particular instructions issued by the appropriate authority, and that the payment is actually due when made.\n" +
                "\n" +
                "   (ii)    It is the duty of an officer to ascertain so far as he is able, that no amount is paid to him which exceeds his entitlement.  In any case where an officer has reason to believe or suspect that an over-payment has been made to him, he must report the fact immediately to his superior officer.\n" +
                " \n" +
                " (iii)   It is the duty of an officer who has any reason for believing or suspecting that any over-payment has been made to a subordinate officer to investigate the matter at once.\n");
        Finance_Section section366 = new Finance_Section("Doubts concerning rates of payment.","cat19","Where there is doubt concerning the correctness of any rate of salary or allowance and payment cannot be deferred until a ruling is obtained, the lowest applicable rate should be authorized pending receipt of a decision.  Even if the officer making actual payments considers that there are in fact grounds for payments at a rate which has been queried, payments must be made at the lowest rate until a definite ruling has been given.\n" +
                "  \n");
        Finance_Section section367 = new Finance_Section("Adjustment of rates of payment.","cat19","Where a rate of salary or allowance has been found to be incorrect, immediate steps must be taken to notify the officer who arranges actual payments and the rate must be corrected before any further payment is made.");
        Finance_Section section368 = new Finance_Section("Report to the Accounting Officer of Ministry/Department","cat19","All cases of apparent over-payment to an officer must be reported forthwith to\n" +
                " the Accounting Officer.  This report must show:\n" +
                "    (a). Full details, including the nature, amount and method of   calculation of the over-payment;\n" +
                "    (b) .   the circumstances in which it occurred, in so far as these can be ascertained;\n" +
                "   (c)     the date the error was discovered and by whom;\n" +
                "   (d)     the date from which the correct rate has been paid;\n" +
                "   (e)     the name and rank of the officer who authorized the over-payment, and of any other officer whose actions contributed to the error, if these facts can be determined; and\n" +
                "(f)\trecommendations regarding the recovery of the over-payment.  It is important that this report should be submitted without delay.\n");
        Finance_Section section369 = new Finance_Section("Recovery of overpayments","cat19","(i)   On receipt of a report as in Financial Regulation 19028, the Accounting Officer shall normally call on the officer who has received the overpayment to refund the amount in full forthwith.  The Accounting Officer may, however, authorize recovery by instalments, in cases where he considers that to call on the officer to refund in a single payment would cause undue hardship or financial embarrassment.  In all cases the Accounting Officer should report his decision to the Accountant-General and the Auditor-General.\n" +
                "   (ii)   If the Accounting Officer considers that:\n" +
                "(a)\t  the over-payment was made as a result of a      mistake of law;  or\n" +
                "(b)\tPayment was made in accordance with the contract entered into by Government with an officer on contract terms of service; or\n" +
                "(c)\tIn all circumstances of the case, the payee had reasonable grounds for believing that he had been correctly paid; or\n" +
                "(d) Owing to the length of time since the over-payment commenced, or to the\n" +
                " amount, undue hardship or financial embarrassment would be caused to the officer concerned; he shall refer the matter to the Permanent Secretary, Ministry of Finance with a report as in Financial Regulation 19028. \n" +
                "\n" +
                "In a case confirmed as falling under (a), (b) or (c) above, the Permanent Secretary, Ministry of Finance shall authorize that the over-payment should be waived.  In cases falling under (d) above the Accounting Officer  should include in his report to the Permanent Secretary, Ministry  of Finance a recommendation as to whether the over-payment should be waived in part or in whole.\n");
        Finance_Section section370 = new Finance_Section("Fault in system.","cat19","On receipt of a report submitted to him in accordance with Financial Regulation 19028, the Accounting Officer shall consider whether the over-payment arose from any fault in the system of authorizing or making payments in his Ministry/Department and, if, so, he shall take action to rectify the fault.");
        Finance_Section section371 = new Finance_Section("Disciplinary action.","cat19","An Accounting Officer should, in all cases of over-payment, irrespective of whether recovery is effected or not, consider whether the circumstances disclosed any disregard of instructions or neglect of duty on the part of any officer, of sufficient gravity to warrant disciplinary action being instituted. If the Accounting Officer decides that disciplinary action including recovering of the whole, or part of the over-payment where appropriate, should be taken, and only an officer/officers within his own Department is/are concerned, he shall initiate proceedings in accordance with the provisions of the Civil Service Commission Regulations.");
        Finance_Section section372 = new Finance_Section("Liability for continued over-payment.","cat19","On receipt of a report submitted to him in accordance with Financial Regulation 19028, an Accounting Officer shall consider whether any officer has, by act of omission, caused the overpayment to continue after it ought to have been rectified, and may recommend to the Permanent Secretary, Ministry of Finance that the officer responsible should be called upon to make good to Government the whole or a part of the resultant loss to public funds.");
        Finance_Section section373 = new Finance_Section("Report to be submitted to the Treasury","cat19","In any case of an overpayment, where:\n" +
                "\n" +
                "(a)\trecovery is being made in full from the  payee; and\n" +
                "(b)\tno fault which might give ground for disciplinary action against any officer has been disclosed; and\n" +
                "(c)\tno avoidable delay has occurred in rectifying the overpayment; and \n" +
                "(d)\tno fault in the system has been disclosed; the Accounting Officer need not submit a report to the Permanent Secretary, Ministry of Finance but shall inform the  Accountant General and the Auditor-General of the action taken by him.  \n");
        Finance_Section section374 = new Finance_Section("Contents of report.","cat19",".  (a)  Any report submitted by an Accounting Officer in accordance with Financial Regulation 19028 should contain full particulars of the over-payment including:\n" +
                "(i)\t  the nature and amount of the over-payment, and how it is calculated;\n" +
                "(ii)\t the circumstances in which it occurred, in so far as these can be ascertained;\n" +
                "(iii)\tthe date the error was discovered and by whom;\n" +
                "(iv)\tthe date from which the correct rate has been paid;\n" +
                "(v)\tthe name and rank of any officer or officers whose actions appear to have resulted in the overpayments being made, and what disciplinary action is being initiated by the Accounting Officer against any such officer in his own Ministry or Department;\n" +
                "(vi)\ta statement of the action taken under Financial regulation 19031.\n" +
                "(b)    The report should also contain the Accounting Officer’s recommendations concerning:\n" +
                " (i)    the amount of the recovery, if any to be made from the payee and, if full recovery is not recommended, the reasons for so recommending; and \n" +
                "(ii)  the recovery, if any, to be made from any officer considered to be liable under Financial Regulation 19032.  If some particulars are not obtainable, it is important that an interim report should be submitted. Without delay.\n");
        Finance_Section section375 = new Finance_Section("Accounting procedure for recoveries","cat19","The accounting procedure for the recovery of overpayments is set out in Financial Regulations, Chapter 23.");





        Finance_Section section376 = new Finance_Section("Nature of Certificate","cat20","A Last Pay Certificate is the only authority for the payment of an officer’s salary when he is posted or transferred to another station or Department.  The Certificate shall contain full particulars of the officer’s name, rank, personal emoluments, Sub-head number, Department, Salary and allowances and the date up to which he has been paid.  The Certificate shall also give full details of the recoveries and deductions to be made from his salary at the new paying station.");
        Finance_Section section377 = new Finance_Section("Disposal of Last Pay Certificate","cat20",".  When an officer is  posted or transferred to another station or Department, the following must be done:\n" +
                "(a)\t   Original to be handed to officer himself\n" +
                "(b)\t   Duplicate to be sent by the Head of Accounts of the old    paying station to the Head of Accounts of the new station.\n" +
                "(c)\t    Triplicate to be retained at the old paying station.\n");
        Finance_Section section378 = new Finance_Section("Use of Original Last Pay Certificate","cat20","At the new paying station the officer himself shall hand the original Certificate to the officer responsible for the preparation of his salary and allowance vouchers who shall attach it to the officer’s first personal emoluments payment voucher sent to the new paying Accounts Officer.  It is the duty of the new paying Head of Accounts to ensure that the original Certificate is attached to the first salary voucher paid by him, and that it agrees in detail with the duplicate copy received from the former Head of Accounts who countersigned the original. If the duplicate copy has not been received, the new paying Head of Accounts shall defer payment until he has received it, or obtained the authority of the Accountant-General to pay.");
        Finance_Section section379 = new Finance_Section("Cessation of Salary locally","cat20","After the Head of Accounts has been notified of the last date up to which an officer shall draw his salary locally, no further salary may be paid by that Head of Accounts under any circumstances without references to the Accountant-General. If a Last Pay Certificate is cancelled, no further payment of salary shall be made to the officer concerned without the sanction of the Accountant-General.");
        Finance_Section section380 = new Finance_Section("Liability of officers signing Last pay Certificate","cat20","Officers signing last pay certificates may be held responsible if any loss of Government funds is occasioned by incorrect information on a Last Pay Certificate signed and authorized by them.");




        Finance_Section section381 = new Finance_Section("Regulations.","cat21","When an officer dies in Ondo State, the Medical Officer last in attendance on him shall immediately notify the deceased’s Department through the issuance of Death Certificate.  The Accounting Officer of the deceased’s Ministry, Department/Agency shall in turn pass the same information to the Permanent Secretary, for Establishments, the Administrator-General, the Accountant-General and the Auditor-General.");
        Finance_Section section382 = new Finance_Section("Procedure.","cat21","The Office of Establishments shall then compute and take steps to pay any gratuity due to the officer’s legal personal representative on receipt of Form ODS Estab. 12 (or if appropriate, Form ODS. Estab. 12.A) from the appropriate officer.");
        Finance_Section section383 = new Finance_Section("Accounts.","cat21","The Administrator-General is required to keep a Cash Book, Treasury Receipt Books, and a Ledger, to be used solely in connection with the estate administered.  A separate account should be opened, in the ledger for each estate, with appropriate references to his cash book entries and to his receipt number against each item therein.");
        Finance_Section section384 = new Finance_Section("Bank Account.","cat21","(a)  The Administrator-General is required to keep a Cash Book, Treasury Receipt Books, and a Ledger, to be used solely in connection with the estate administered.  A separate account should be opened, in the ledger for each estate, with appropriate references to his cash book entries and to his receipt numbers against each item therein.\n" +
                "   (b)   This bank account must be reconciled with his cash book every month in accordance with Financial Regulations 11010, and every month the total of the balance due to the several estates as recorded in the ledger should be compared with the bank statement and any differences accounted for by reconciliation.\n");
        Finance_Section section385 = new Finance_Section("Procedure on completion of Administration of Estate.","cat21","The Administrator-General, upon completion of the administration of an estate, is required to submit a sworn report of his proceedings and the estate accounts, supported by vouchers to the Chief Registrar, High Court, Akure.");
        Finance_Section section386 = new Finance_Section("Procedure after receiving discharge from the High Court.","cat21","The Administrator-General, after receiving his discharge from the High Court, is required to forward a copy each of the proceedings, accounts and orders to the Permanent Secretary for Establishments and the Auditor-General.");
        Finance_Section section387 = new Finance_Section("Deposit of Estate with Accountant-General.","cat21",".  The balance due to the estate of deceased officer must be deposited with the Accountant-General and it is payable only to the legal personal representative of the deceased.");
        Finance_Section section388 = new Finance_Section("Duties of Heads of Departments Payment of. \n","cat21","Accounting Officers are responsible for rendering to the Administrator-General completed vouchers in respect of all sums due from Government to the estate of the deceased officers of their Departments, such as salaries and allowances.  At the same time they should inform both the Accountant-General and the Administrator-General of any amounts due from the estate to Government, such as Widows and Orphans Pensions Scheme contributions, light dues, hospital bills and funeral expenses.");
        Finance_Section section389 = new Finance_Section("Salaries and pensions to Estate.","cat21","Personal emoluments and pensions are payable up to and inclusive of the date of death of Government official or pensioners.");
        Finance_Section section390 = new Finance_Section("Advances Recoverable Funeral Expenses.","cat21"," Advances outstanding against deceased officers are recoverable in full (see Financial Regulation 18026).\n" +
                "\n" +
                " 21011.  The funeral expenses of deceased officers must be borne by their respective Ministry, Department/Agency as provided in the Civil Service Rules.\n");
        Finance_Section section391 = new Finance_Section("Estate of Officials.","cat21","When estates of deceased officers are administered by the Administrator-General, the proceeds of administration may be deposited with the Accountant-General, and if the balance is to be remitted to a relative or to a legal personal representative outside the Federation of Nigeria, the Accountant-General should be asked to make the remittance through the accounts of the Government of the country/territory concerned.\n");
        Finance_Section section392 = new Finance_Section("Estate of Officials subject to the jurisdiction of customary Court.","cat21","Where an officer dies intestate and was subject to the jurisdiction of a Customary Court, it shall be lawful for the Customary Court to administer his estate, provided the gross capital value does not exceed N100,000.00 and to distribute among his relatives the balance in the estate in such order and proportion as may seem desirable, regard being had to the law and custom of community of the deceased.");
        Finance_Section section393 = new Finance_Section("Ex-gratia Gratuity.","cat21","Where an officer or employee of the Government dies before an exgratia gratuity awarded to him is paid, the amount should be paid through the Accounting Officer of the Department concerned for the benefit of the bonafide dependant of the deceased officer or employee.");
        Finance_Section section394 = new Finance_Section("Payments of Estate of Nigerian Officials: General.","cat21","Except as provided for in Regulation 21012 to 21014, no sum due to the legal personal representative of a deceased officer shall be paid without a certificate written on the payment voucher and signed by the paying officer to the effect that a letter of Administration or probate of will has actually been shown to him.");
        Finance_Section section395 = new Finance_Section("Vouchers.","cat21","All moneys due to estates of deceased officers intended to be paid to the Administrator-General should be paid directly into the Administrator-General’s bank account and the Administrator-General informed accordingly.");








        Finance_Section section396 = new Finance_Section("Definition.","cat22","For the purpose of this Chapter, a seconded Officer is a Government Officer who is seconded for duty with any other Government of the Federation (Federal or State), or a Local Government, or Statutory Corporation or any other non-Government body.");
        Finance_Section section397 = new Finance_Section("Reimbursement Charge.","cat22","A body to which a public officer is seconded for duty shall pay to the Government a reimbursement charge to cover the cost of the officer’s salary and of his other expenses to Government.  Reimbursement Charges are made at the following rates: \n" +
                "\n" +
                "        Officers’ Pensionable                            Percentage of the officer’s\n" +
                "        Emoluments                                         Pensionable emoluments\n" +
                "        \n" +
                "(a)\t  Officers holding posts\n" +
                "  Graded Level 7-Grade Level 16………………………….148 per cent\n" +
                "\n" +
                "(b)\t   Other  Officers………………………………………………….135 per cent\n");
        Finance_Section section398 = new Finance_Section("Responsibility for submitting claim for reimbursement.","cat22","The responsibility for submitting claims for re-imbursement rests upon the Accounting Officer of the Department from which the officer is seconded.");
        Finance_Section section399 = new Finance_Section("Payments of salary and allowances to seconded officer.","cat22","In the absence of any specific arrangement to the contrary, which must be approved by the Permanent Secretary, Ministry of Finance, a seconded officer’s salary, Inducement Addition, Leave Basic Allowance, and Pension remain a liability of Government and should be paid through the officer’s Departmental drawing account and charged to the Departmental vote in the normal way.");
        Finance_Section section400 = new Finance_Section("Procedure to be followed by Head of Department when an office is seconded.","cat22","When an officer has been seconded, the Accounting Officer of his Department shall proceed as follows:\n" +
                "\n" +
                "(a)\t  Notify the Accountant-General of the date of the beginning and in due course, the termination of the secondment;\n" +
                "(b)\tEnsure that Salary, Inducement Addition, and Leave Basic Allowance are paid through the Departmental Drawing Account in the normal way.\n" +
                "(c)\tEnsure that allowances such as transport allowance, hotel accommodation, refunds, etc. not covered by the re-imbursement charges, are paid by the borrowing authority;\n" +
                "(d)\tAt the end of each quarter during the period of secondment, forward to the borrowing authority an account of the re-imbursement charges payable (forwarding a copy to the Accountant-General), with a request for  payment to be made direct to the seconding Department.  Upon receipt of a settlement cheque, the Accounting Officer shall;\n" +
                "(i)\tPay the amount into the Akure Treasury Cash Office under cover of Receipt Voucher classified to:  Revenue Head:  Re-imbursements Sub-head:  Re-imbursement in respect of officers seconded to Non-Governmental Departments and other governments; and \n" +
                "(ii)\tNotify the Accountant-General, in writing that this has been effected;\n" +
                " (e)   Submit a quarterly return (31st March, 30th June, 30th September and 31st December) to the Accountant-General showing the names of officers, seconded and the recoveries effected in each case.\n");








        Finance_Section section401 = new Finance_Section("Classes of refund of revenue and authorization","cat23",". (i)   Refund of revenue falls into three classes:\n" +
                "(a)\t  Those in respect of revenue correctly collected, in accordance with the Laws, and subsequently reclaimed under conditions prescribed by the Laws;\n" +
                "(b)\tThose which result from erroneous collection;\n" +
                "(c)\tAll other cases- except those which concern the courts.\n" +
                "(ii)   Refunds under (a) require authorization by the officer prescribed by the Laws or any officer to whom his powers have been delegated.  Refunds under (b) shall be authorized by the Accountant-General where a Treasury Receipt has been issued for the original collection, and by the Accounting Officer where the collection has been accounted for on Transfer Voucher.  Those under (c) require authorization by the Permanent secretary, Ministry of Finance.\n");
        Finance_Section section402 = new Finance_Section("Allocation of refunds of revenue.","cat23","Refunds in respect of revenue collected in the same financial year shall be debited to the revenue sub-head to which the receipt was originally classified. Refunds in respect of revenue collected in previous years shall be dealt with as follows:\n" +
                "\n" +
                "(a)\t  Where a ‘Refunds General’ Sub-head exists within a Head of Expenditure of a fund into which the revenue was initially received, refunds shall be charged thereto.\n" +
                "(b)\t Refunds made from funds having no’ Refunds-General’ sub-head of expenditure but for which expenditure there-from is subject to the passing of an Annual Appropriation Law, shall be debited to a specific expenditure sub- head for each refund.\n" +
                "(c)\tRefunds made from funds/other than those mentioned in (a) and (b) above, shall be treated in accordance with the rules of the funds.\n" +
                "(d)\tIncome Tax, Sales Tax, Import, Export Excise Duties and over-collections of Administration charges on Loans shall be charged as ‘Revenue Refunded’\n");
        Finance_Section section403 = new Finance_Section("Overpayment recovered allocation of.","cat23","(i)   when an over-payment of expenditure charged to a Head in the Recurrent Estimates of Expenditure is recovered in the same financial year as that in which it was incurred, it shall be credited to the expenditure Head and Sub-head to which it was originally debited.  When the recovery is in respect of expenditure incurred in previous financial year, it shall be credited to Revenue Head Miscellaneous: Sub-Head: Overpayment Refunded.\n" +
                "\n" +
                "   (ii)   When an overpayment of expenditure charged to a Head of the Capital Estimates of Expenditure is recovered in the same financial year as that in which it was incurred, it shall be credited to the expenditure Head and Sub-head to which it was originally debited.  When the recovery is in respect of expenditure incurred in a previous financial year, it shall be credited to Revenue Head-Capital Expenditure and Development Fund Receipts:  sub-head-Overpayments refunded.\n" +
                "   (iii)   In all other cases, such as expenditure which is re-imbursed by any other government or agency the recovery shall be credited to the Head and sub-head concerned irrespective of the financial year in which the overpayment was made.\n");
        Finance_Section section404 = new Finance_Section("Overpayment: Recovery of.\n","cat23","Payment vouchers queried after payment for an overpayment should have this fact clearly endorsed thereon in red ink.  The number, date and station of the Receivable Order or Receipt Voucher (not Treasury Receipt) on which the recovery has been effected, and the amount recovered, should also be shown thereon.  In all cases of recoveries of overpayments or refunds of revenue, the relative voucher should clearly indicate the number and date of the original voucher concerned.");
        Finance_Section section405 = new Finance_Section("Overpayments charged as Advances.","cat23","(i)  When unauthorized payments, overpayments and excess transport or other charges have been debited to a personal advance account of the officers concerned, steps should be taken by the Accounting Officer to recover the amounts and to clear the advance immediately.\n" +
                "    (ii)   The practice of charging overpayments as advances against the certifying officers should be adopted only when prompt recovery is impossible.\n");






        Finance_Section section406 = new Finance_Section("Insurable interests.","cat24","Property in which Government has an insurable interests may be classified as follows:\n" +
                "(a)\t  Private property, in which Government is temporarily interested; e.g. a motor car bought or a house erected from advance funds;\n" +
                "(b)\tGovernment property, in which private persons are temporarily interested; e.g. a public building leased;\n" +
                "(c)\tGovernment property remaining in Government possession and used solely on public service.\n");
        Finance_Section section407 = new Finance_Section("Property insurable ","cat24",".   In cases falling under (a) the property must be insured during the continuance of the advance or loan agreement. Accordingly :\n" +
                "\n" +
                "(i)\t  An officer to whom an advance is given for the purchases of a motor vehicle shall be required to enter into an agreement with the Accountant-General for its repayment and to insure the vehicle until the advance is repaid under a comprehensive policy for sum equal to the original cost of the vehicle, or for a sum not less than the unpaid balance of the loan together with any administration charge or interest outstanding thereon, whichever is the less.\n" +
                "(ii)\t   A house built with a loan from the Government Staff Housing Fund shall be insured with an approved company for not less than the full amount of the outstanding advance, as required by the Government Staff Housing Regulations.  The insurance policy shall be drawn in favour of the Accountant-General and be maintained during the period of the repayment of the advance.  The premium shall be paid in advance by the recipient of the advance.\n" +
                "24003.  In cases falling under Financial Regulation 24001 (b), the property must be insured at the expense of the person making use of it.  Accordingly, when government buildings or equipment are leased for private occupation or use, they must be insured by the leasee and provisions for such insurance should be made in the lease or agreement.\n" +
                "\n" +
                "24004.  In cases falling under Financial Regulation 24001 (c), the property must not be insured, except stores in transit from and to countries outside the Federation of Nigeria.\n");
        Finance_Section section408 = new Finance_Section("Marine Insurance of Stores.","cat24","All goods ordered from overseas sources must be insured by the Ordering Department.");




        Finance_Section section409 = new Finance_Section("Design, Purpose and Scope of Estimates","cat25","The Annual Estimates, and the corresponding Appropriation Law, limit and arrange the expenditure of the government for the fiscal year to which they relate.  It follows, therefore, that the greatest care and attention to detail must be observed in their preparation and submission.  The purpose of this Chapter is to lay down rules and procedure for their preparation and submission.\n" +
                "\n" +
                "25002.  The Annual Estimates are designed to show clearly the form of and the amount of money to be spent on each individual service, estimate and define the scope of each service, and prescribe the authorized establishment.  They are intended to cover all foreseeable expenditure, but to make no provision for contingencies. At present there are two types of Budgets – zero and incremental budgeting. Zero budgeting [Programme Performance Budgeting System (PPBS)] is a budgeting process based on the evaluation of the sectors and their expenditure need and assumes that the sectors under consideration require a new budget outlays in the medium term based on the identified programmes that suits into the overall state policy and the development targets in that sector.  Incremental budgeting on the other hand allocates budgets to sectors as a function of the previous budgetary allocation hence an increment based on the last budget estimate of the sectors. \n");
        Finance_Section section410 = new Finance_Section("Medium Terms Sector Strategies (MTSS) and Medium Term Expenditure Framework (MTEF) as requirements for budgeting\n" +
                "\n","cat25",".  Ondo state is to follow the zero budgeting practice where budgeting is in line with identified programmes that suits into the overall state policy and the development target of that sector. The budget of the state should be drawn from the approved Medium Term Sectors Strategies (MTSS) and the Medium Term Expenditure Framework (MTEF). The process of preparing the MTSS and the MTEF should be highly participatory with different stakeholders in the state including Civil Society Organisations (CSOs) involved. The process and fact of consultations required by law should be documented in the annex of the MTEF while it should contain the sectoral envelopes which will show government’s priorities and the reasons informing those priorities in the revenue and expenditure frameworks. ");
        Finance_Section section411 = new Finance_Section("Duty of complying with time-table and Financial Procedure","cat25","The preparation of the Annual Estimates is an involved process which has to be undertaken within strict time limits and proper analysis of the macroeconomic conditions.  It throws a very heavy burden both upon the Ministry of Economic Planning and Budget as well as the Ministry of Finance. It is therefore essential; in order to lighten that burden as far as possible, that the state budget calendar should be circulated at the beginning of the year indicating the time for every meeting and submissions which must be rigidly observed and that the procedure contained in this Chapter should be faithfully followed.");


        Finance_Section section412 = new Finance_Section("Ministry of Economic Planning and Budget Call Circular.","cat25","In July, each year, the Ministry of Economic Planning and Budget issues a circular letter giving the time-table for the submission of Advance Proposals and Draft Estimates based on the approved MTSS. Accounting Officers are expected to issue departmental instructions, in anticipation of the Call Circular, so as to put themselves in a position to comply with the time-table and to ensure that they have ample opportunity of carefully examining the proposals put forward by Heads of Departments.  Following the Ministry of Finance Call Circular Letter, the Office of Establishments issue another Call Circular Letter for Advance Proposals in respect of changes in authorized Establishments.");
        Finance_Section section413 = new Finance_Section("Definitions","cat25","The following terms used in this Chapter carry the meanings assigned to them as follows: \n" +
                "\n" +
                "       Accounting Officer              Head of Ministry/non-Ministerial\n" +
                "                                                         Department/Agency \n" +
                "\n" +
                "      Advance  Proposal               A proposal for inclusion in the \n" +
                "                                                         Draft Estimates of provision for\n" +
                "                                                         a change in any establishment\n" +
                "                                                         or salary scale; or involving \n" +
                "                                                         expenditure substantially greater\n" +
                "                                                         than that provided for an existing \n" +
                "                                                         service in the current estimates or \n" +
                "                                                         for any new Government activity.\n" +
                "\n" +
                "Current year                                 The financial year to which the \n" +
                "                                                          Latest printed Approved Estimates\n" +
                "                                                          apply.\n" +
                "     \n" +
                "     Vote                                             A sub-head or an item of the \n" +
                "                                                          Expenditure Estimates in line with the approved programme \n" +
                "\n" +
                "     Year of Estimates              The financial year in respect of which Estimate are being prepared.\n");
        Finance_Section section414 = new Finance_Section("Time- Table.","cat25","Subject to variations which shall be announced in the Ministry of Economic Planning and Budget Call Circular Letter (Vide Regulation 25005), the following time-table for the submission of Advance Proposals and Draft Estimates must be strictly adhered to. Every effort should be made to submit the Advance Proposals and Draft Estimates before the dates indicated.\n" +
                "(a)\t To the Office of Establishments. Proposal involving numerical changes in authorized Establishments and those involving issues of policy for which approval has been obtained……………..31st July.\n" +
                "(b)\tTo the Ministry of Economic Planning and Budget\n" +
                "(i)\t       Advance Proposals of Recurrent Expenditure for the year of Estimates, including proposals under (a) above………15th August.\n" +
                "(ii)\t       Draft Estimates of Revenue, for the year of Estimates (including revised Estimates of revenue for current year) …..15th September. \n" +
                "(iii)\tAdvance Proposals for Capital Expenditure for the year of Estimates ………..1st October.\n" +
                "(iv)\tDraft Estimates of Recurrent and Capital Expenditure for the year ………1st November.\n" +
                "(v)\t      PPBS Estimates …………1st November.\n" +
                "(vi)\tRevised Estimates of Recurrent and Capital Expenditure for the current year…………..15th November.\n" +
                "      Delay in submission of Advance Proposals may result in the rejection of an expenditure proposal because sufficient time for its proper consideration is not given.\n");
        Finance_Section section415 = new Finance_Section("Responsibility for submitting Estimates.\n" +
                "Numbering of Proposals.\n","cat25","The responsibility for submitting Estimates under the respective Heads and Sub-heads of Revenues rests with officers shown in Appendix ‘A’ of the current year Estimates.  Estimates of Revenue should be submitted on Form Est.7. A separate Estimates Form must be submitted in respect of each head of Revenue by each submitting officer.");
        Finance_Section section416 = new Finance_Section("Expenditure Advance proposals.","cat25","The appropriate printed forms must be used for Personal Emoluments and other Charges Proposals, and particular care should be taken to ensure that proposals are numbered serially throughout, the first proposal under Other Charges carrying the next serial number after the last proposal under Personal Emoluments.  Two copies of the Schedules are required in the Ministry of Economic Planning and Budget.");
        Finance_Section section417 = new Finance_Section("Expenditure Advance Proposal.\n","cat25","The numbering of proposals in the PPBS Budget should follow the standard classification of the Budget into Programmes and Sub-Programmes, Projects and Sub-Projects.");
        Finance_Section section418 = new Finance_Section("Establishment Advance Proposal\n","cat25","The procedure for Advance proposals shall be as follows: with the exception or significant changes which should; in any case, have been referred in advance to the Executive Council, or the Treasury Board for decision, all advance proposals submitted by Department for inclusion in the Estimates shall be settled with the Ministry of Economic Planning and Budget at official level.  Submitting Ministry, Department/Agency shall later be informed of the details of the decisions reached and these details will provide a basis upon which their draft estimates will be prepared.  Any proposal which has not been previously agreed with the Ministry of Economic Planning and Budget shall be deleted, if included in the draft estimates. In the event of agreement not being reached at official level, departments will have an opportunity of stating their case when individual Heads of Draft Expenditure Estimates are considered by the Treasury Board.  \n" +
                "\n" +
                "25012.  All Establishment Proposals should be referred in writing to the Permanent Secretary for Establishments Matters not later than 31st July for clearance before Advance Proposals for Expenditure are submitted.  Such proposals may include new proposals for simple increases or decreases in the numbers of existing approved posts. They must also include any proposals involving issues of policy (e.g. the regrading of posts, the creation of new posts, or changes in title, cadre structure or the existing principle governing the disposition of the holders of a post) for which clearance has previously been obtained but must not include any other proposals involving such issues, in respect of which a clearance has not been previously obtained.  The reference number of the correspondence indicating the support of the Ministry of Finance and/or Office of Establishments for the inclusion of a proposal must be quoted.  Where there are changes in the establishment sanctioned in the current year, such changes should be reflected in the estimates proposals with a brief reference in every case to the relevant Treasury Board Conclusion or letter from the Ministry of Finance.\n" +
                "\n" +
                "25013.   Where Advance Proposals involve issues of policy, the approval of Executive Council or the Treasury Board must be obtained before they are submitted.  This means that prior to the usual time for the preparation of annual Estimates; departments must formulate their ideas on proposals involving issues of policy or significant changes in the provision in the current estimates.\n" +
                "    The submission of additional proposals after the Ministry of Finance has dealt with Advance Proposals, or the introduction of amendments after draft Estimates have been forwarded to the Ministry of Economic Planning and Budget must be avoided.\n" +
                "\n" +
                "25014.   The schedule of Advance Proposals should cover every sub-head and item.  If any provision is required in the year of Estimates under a sub-head or item of expenditure created by Supplementary Estimates during the current year, the sub-head or item must be covered in Advance Proposals.  In submitting their proposals, Accounting Officers should endeavour to leave no communication gap between their Ministry and either the Office of Establishments or both. Where a vote is made up of more than one component element, as in the case of the Transport and Travelling Expenses Vote, proposals for such a vote must be supported by detailed calculations showing the Ministry’s requirements in respect of each component element.  To support their cases, Ministries and Departments should rely more on facts and figures and generally verifiable data than on abstract and subjective statements.  Where the prior approval of the Executive Council or the Treasury Board has been obtained, the reference number of the conclusion should, however, be quoted.\n" +
                "\n" +
                "      25015.   To enable the Ministry of Economic Planning and Budget and Ministry of Finance to make a fair assessment of the overall increase or decrease in estimated recurrent expenditure in the year of Estimates, compared with the current year, a summary in respect of each head should be submitted to that Ministry with schedules of Advance Proposal in the following form:\n" +
                "\n" +
                "\n" +
                "SUMMARY\n" +
                "\n" +
                "(1)\t  Total Revised Estimates (whole Head)  for the current\n" +
                "   Year for Personal Emoluments and Other Charges  =……………..\n" +
                "\n" +
                "(2)\t   Add additional expenditure in the year of the estimates \n" +
                "   In respect of normal increments in salaries of staff    =…………..\n" +
                " \n" +
                "(3)\t   Add/Deduct total net increase/decrease as set out\n" +
                "   in the schedule of Advance Proposals,  Proposed \n" +
                "   total Estimates (whole head) for year of Estimates.  =   …………..\n" +
                "      Increase/Decrease compared with the current year.             …………..\n" +
                "\n" +
                "  25016.   In compiling Draft Estimates of Expenditure, particular attention should be paid to the following points:\n" +
                "(i)\t      Draft Estimates of Expenditure must be submitted in duplicate on Form Est. 5 or 6 as appropriate.\n" +
                "(ii)\t    There should be double spacing between each line;\n" +
                "(iii)\t     The description in the section headed ‘Details of Expenditure’ must be modelled exactly upon that shown in the Current Estimates;\n" +
                "(iv)\t      No abbreviations whatsoever should be used except for salary gradings; \n" +
                "(v)\t      All increases and decreases should as far as possible be explained by the use of signs listed below;\n" +
                "\n" +
                "\n" +
                "\n" +
                "SIGNS AND THEIR SIGNIFICATIONS\n" +
                "(REVENUE AND EXPENDITRE ESTIMATES)\n" +
                "           * -   Pensionable officer(s)\n" +
                "a  -  Increments\n" +
                "b -  New holder(s)\n" +
                "c  -  Previously over-estimated\n" +
                "d –  Previously under-estimated\n" +
                "e –  Token figure\n" +
                "f -    See Memorandum\n" +
                "g –   Increased output-production-consumption\n" +
                "h –   Reduced output-production-consumption\n" +
                "I –   Increase Demand\n" +
                "              J-     Reduced Demand\n" +
                "             k-    Increase Activities\n" +
                "          I -   Decreased Activities\n" +
                "         m-   Increased staff eligible\n" +
                "          n-   Reduced staff eligible\n" +
                "          o-   Post(s) abolished\n" +
                "          P-  Change of title\n" +
                "          q-   Incidence of leave\n" +
                "          r -  Rise in prices\n" +
                "          s-   Approved –created-increased-by Supplementary Estimates\n" +
                "\n" +
                "          t-    Revised rates\n" +
                "          u-   See footnote\n" +
                "          v-   Revote\n" +
                "         w-   Regrading\n" +
                "          x-   Part year provision\n" +
                "          y-    Holder(s) on contract terms\n" +
                "       (Z)-    Statutory Expenditure\n" +
                "       (R)-     Reserved-Expenditure which may not be incurred unless and until authority has been given         by the Ministry of Finance.\n" +
                "\n" +
                "(vi)     Carefully worded footnotes should be provided (on a separate sheet for the whole Head) where variations cannot be adequately explained by the use of the signs.  Care should be taken to see that the sequence of footnotes corresponds with the order of the sub-heads or items to which the notes refer and that the footnote signs (other than ‘u’)run in the following order.\n" +
                "(vii)         A note explaining the necessity for a new sub-head (or item) of significance or a major change in the Estimates should be submitted (in duplicate) for insertion in the Memorandum on the Estimates.  The note should be drafted in a form suitable for incorporation without further editing.\n" +
                "(viii)       Supporting details should be provided in respect of all the votes which are of composited nature e.g. office and general;\n" +
                "(ix)      The column for actual expenditure in the year immediately preceding the current year should be completed by the officer submitting Draft Estimates.  The figures in the column should be reconciled with the Appropriate Accounts before submission.\n" +
                "(Note:   In respect of a Personal Emoluments Sub-head the total for the entire sub-head only should be shown)\n" +
                "(x)      Financial provision for vacant posts must be calculated on the basis of the needs which can reasonably be foreseen, having regard to recruitment prospects; the appropriate sign x must be used to indicate cases where provision has been made for only part of the year.  In addition, officers responsible for submitting Draft Estimates should indicate the extent of savings which they consider will probably accrue as a result of delayed recruitment and staff turnover.  Explanation should be given for any reduction in the figure shown in the Current Estimates in this respect.\n" +
                "(xi)      ‘Vanishing’ Items and sub-heads, i.e. those appearing in the Current Estimates for which no provision is required in the year of the Estimates, should appear, after the numbered items or sub-heads as the case may be.  They should be underlined to indicate that they are to be printed in italics.  \n" +
                "   (xii) ‘Approved Estimate’ column of the draft Estimates should repeat exactly the figures in the Current year main Estimates.  No account should be taken of changes arising from Supplementary Estimates.\n" +
                "       25017.  Draft Estimates should be accompanied by one copy of the staff nominal roll. This should be submitted on form EST.1. Where inducement Addition and/or Contract Addition is applicable to an item on the nominal roll, the estimate for this should be shown in brackets for the figure for salary in the penultimate column.\n" +
                "\n" +
                "25018.   Attention is drawn to the necessity for exercising the greatest care in the preparation of revised Estimates of Expenditure for the current year.  In order that the most accurate estimates of the out-turn for the year may be arrived at, submitting officers are required to ensure that the revised Estimates are the closest possible forecasts of actual expenditure in the current year.\n" +
                "\n" +
                "25019.  Revised Estimates should be calculated sub-head by sub-head, but a summary only is required to be submitted in the following form:\n" +
                "\n");



        Finance_Section section419 = new Finance_Section("EXPENDITURE: CAPITAL BUDGET","cat25","Any Expenditure which is of a non-recurrent nature should be provided for in the Capital Estimates, under one of the following Heads;\n" +
                "(i)\tAgriculture \n" +
                "(ii)\tLivestock and Veterinary                    Agricultural \n" +
                "(iii)\tForestry                                              development\n" +
                "(iv)\tFisheries\n" +
                "(v)\tIndustry\n" +
                "(vi)\tPower\n" +
                "(vii)\tCommerce and Finance\n" +
                "(viii)\tTransportation\n" +
                "(ix)\tEducation\n" +
                "(x)\tHealth and Medical Service\n" +
                "(xi)\tInformation Services\n" +
                "(xii)\tSocial Development and Sports\n" +
                "(xiii)\tWater Supply\n" +
                "(xiv)\tSewerage, Drainage and Refuse Disposal\n" +
                "(xv)\tHousing\n" +
                "(xvi)\tTown and Country Planning\n" +
                "(xvii)\tCo-operative and Community Development\n" +
                "(xviii)\tGeneral Administration\n" +
                "\n" +
                "     25021.   Advance Proposals are necessary in respect of all provisions required in the year of Estimates.  Projects which are already in progress and for which provision will be required in the year of Estimates must be included in Advance Proposals. Projects which are expected to have been completed by the end of the current year should not be shown in Advance Proposals.\n");
        Finance_Section section420 = new Finance_Section("Draft Estimate","cat25",".   Attention is drawn to the following points;\n" +
                "\n" +
                "         (i)  Advance Proposals for the Capital Budget should be submitted in four copies to the            Ministry of Economic Planning and Budget. That Ministry will certify that a particular project in the Development plan and that the provision sought is commensurate with plan and that the provision sought is commensurate with plan allocation.  The Ministry of Economic Planning and Budget will also examine the proposals and arrange to submit them to the Treasury Board for a decision on which projects should be included in the Draft Estimates.\n" +
                "\n" +
                "(ii)           Advance Proposals under each Head must be serially numbered and supported by full explanatory notes which can be considered without reference to any other correspondence.\n" +
                "\n" +
                "(iii)       Separate submissions are required for Advanced Proposals under Heads of Other Non-Recurrent Expenditure.\n" +
                "\n" +
                "(iv)        The procedure outlined for Recurrent Budget Advance Proposals in Regulation 25011 also applies to Capital Budget Advance Proposals.\n");
        Finance_Section section421 = new Finance_Section("Revised Estimates of Capital Expenditure for the Current year.","cat25",".  Advance Proposals in respect of all Capital Projects not under PPBS should be submitted on the Capital Programme Advance Proposals Form.  In the case of proposals for building projects which are intended to be executed by the Ministry of Works and Housing, the  originating Department will furnish the Ministry with the copy of the completed form\n" +
                "\n" +
                "25024.   In compiling draft Capital Budget Estimates, attention should also be paid to Regulation 25016.  The figures shown in the column for actual expenditure prior to the current year must reflect actual expenditures incurred to the nearest Naira and must be reconciled with the Appropriation Accounts.  Variation in the estimated total cost of a project for which approval has not previously been obtained will not be reflected in the Draft Estimates.\n" +
                "\n" +
                " 25025.   Similar considerations apply to revised Estimates of Capital Expenditure as to those for recurrent expenditure, and the closest possible forecast should be made of the expenditure likely to be incurred during the current year under each capital expenditure sub-head.\n" +
                "\n" +
                "\n" +
                "25026.  Revised Estimates of capital expenditure (by Heads) should be submitted in the following form:\n");


        Finance_Section section422 = new Finance_Section("Necessity for Supplementary Expenditure must be justified.","cat25",".  The necessity for supplementary provision (including changes in authorized establishment) should normally arise only where.\n" +
                "\n" +
                "(a)\tthe contingency for which it is required could not have been foreseen at the time of the preparation of the current Estimates; and\n" +
                "(b)\tsuch provision is required on the grounds of urgent public interest.  Application for additional provision to augment an existing vote in the current estimates will not be entertained unless the need for such augmentation can be clearly shown.  Efforts must be made  to keep, as far as possible, within the limits of the original estimates under individual sub-heads so as to reduce to the minimum any divergence, overall, between the budget estimates and the actual expenditure.\n");
        Finance_Section section423 = new Finance_Section("Authority for Supplementary expenditure.","cat25","Expenditure that has not been provided for in the annual estimates cannot be incurred without the prior approval of the Executive Council/the Legislature, except where the Commissioner of Finance is satisfied that it is appropriate in anticipation of the approval of the Executive Council/Legislature   and therefore authorizes an advance from the contingencies fund in accordance with Section 26 of the Public Administration Law.");
        Finance_Section section424 = new Finance_Section("Supplementary expenditure involving change of policy.","cat25","Prior reference to the Executive Council or the Treasury Board is required where a new expenditure proposal involves any amendment of approved policy or the institution of a new policy.  Where no change in policy is involved; the Commissioner, Ministry of Economic Planning and Budget may, at his discretion and having regard to the magnitude of additional provision sought, direct that the proposal be referred either to the Executive Council or the Treasury Board before its acceptance for inclusion in Supplementary Estimates to be presented to the Legislature.");
        Finance_Section section425 = new Finance_Section("Supplementary Capital Expenditure.","cat25","Requests for provision in respect of projects which had not previously featured in the Capital estimates or for the upward revision of the estimated total cost of an existing project must be accompanied by a certificate signed personally by the Accounting Officer, in the following terms: \n" +
                "\n" +
                "    *(a)    the project was envisaged in the Development Plan and the estimated total cost is within the allocations in the Plan;\n" +
                "\n" +
                "   *(b)    the Revised Estimated Total Cost is within the allocations in the Plan.\n" +
                "\n" +
                "   *(c)   the Estimated Total Cost/the increase in the Revised Estimated Total Cost is covered by Plan saving under…………….(name project), the Estimated Total Cost of which is hereby reduced by N……. \n" +
                "\n" +
                "A copy of any such application should be forwarded by the Ministry, Department/Agency concerned to the Permanent Secretary, Ministry of Finance.\n");
        Finance_Section section426 = new Finance_Section("Excess Expenditure.","cat25","When an expenditure in excess of the total amount approved under any vote has occurred(i.e. when covering approval is being sought for an authorized excess either in the current or the previous financial year) a full explanation must be given why the system of control failed to operate satisfactorily, together with recommendations regarding the pecuniary liability if any, of any officers and details of steps, taken to prevent a recurrence.");
        Finance_Section section427 = new Finance_Section("Revotes.","cat25",".  Only the provision in respect of items of Capital Expenditure can be revoted in the strict sense of the word.  A revote of unexpended provision form a previous financial year is ordinarily required:\n" +
                "(a)\t   When goods are provided for and actually ordered in one year but are not delivered and paid for until the subsequent year.\n" +
                "(b)\tWhen capital works are provided for and commenced in one year but are uncompleted at the end of that year;\n" +
                "N.B.  Suitable records should be kept to ensure that expenditure in any one year under any sub-head/item of Capital Expenditure does not exceed either the voted provision for the year or the unspent balance of the approved total estimated cost of the project, whichever is less. All applications for revotes must reach the Ministry of Finance before the end of the first quarter of the financial year.\n");
        Finance_Section section428 = new Finance_Section("Supplementary Expenditure:  Application form","cat25","In completing Application Form ODS. Gen.108 particular attention should be paid to the following points:\n" +
                "\n" +
                "(i)\t     Section E and F - Expenditure foreseen but not yet incurred or formally committed should be shown under F, and not E.\n" +
                "(ii)\t     Applications for supplementary provision which is not offset by equivalent saving will normally, if accepted by the Ministry of Finance merely be noted for inclusion in the next Supplementary Estimates.\n" +
                "        Where it is desired that the additional provision should be authorized in anticipation of the approval of the Legislature, the application should be signed personally by the Accounting Officer and should include a recommendation as follows:\n" +
                "   \n" +
                "  “I recommend that the Commissioner of Finance should be asked to exercise his powers under Section 26 of the Public Administration Law, and certify that this is most urgent, unforeseen, expenditure which cannot, without serious injury to the public interest, be postponed until adequate provision can be made by the Legislature’,\n" +
                "\n" +
                "(iii)    Applications for supplementary provision under Capital Expenditure Heads of the Estimates should provide a financial summary in each case as follows:\n");








        Finance_Section section429 = new Finance_Section("Definition of Court Accounts.","cat26","Court Accounts shall include all accounts kept in the High Court and Magistrates’ Courts.");
        Finance_Section section430 = new Finance_Section("Officers responsible for Court Accounts.","cat26",". (1)  The general responsibility for Court Accounts shall rest      upon the Chief Registrar of the High Court as the administrative head of the State Judiciary.\n" +
                "\n" +
                "(2)\tSubject to the general control of the Chief Registrar, responsibility for Court Accounts in each Judicial Division and in each Magisterial District shall rest upon the Registrar of each Division or District as the case may be.\n");
        Finance_Section section431 = new Finance_Section("Authorities for Court fees and fines and payment into and out of Court.","cat26","The authorities for the imposition of Court Fees and Fines and for payments into and out of Court are as follows:\n" +
                "\n" +
                "High Court Law, (Cap.62) Laws of Ondo State of Nigeria, 2006; High Court (Civil Procedure) Rules; Ondo State Cap 62 Laws of Ondo State 2006; Criminal Code (Cap 30); Criminal Procedure Laws (Cap. 31) Laws of Ondo State of Nigeria, 1978; Sheriff, Civil Process  Act, Cap. S.36, Laws of Federal Republic of Nigeria, 1978; Judgment (Enforcement) Rules; Magistrates’ Courts Law, Laws of Ondo State of Nigeria, 1978; Criminal Sheriffs and Workmen’s Compensation Act, Laws of the Federation of Nigeria, 1990; Workmen’s Compensation (Rules of Court) Rules; Children and Young Persons Law (Cap.21) Laws of Ondo State of Nigeria, 1978.\n");
        Finance_Section section432 = new Finance_Section("Cash Book.","cat26",". A Cash Book in the form applicable to Court transactions shall be kept by all Registrars and all receipts and payments shall be entered therein at the time of the transaction. All entries on the receipt side of the cash book shall be supported by the duplicates of the Revenue Collectors Receipt Books (Treasury Form 6A). All entries on the payment side shall be supported by Court Payment Vouchers or Treasury Receipt (Treasury Form 6).");
        Finance_Section section433 = new Finance_Section("Cash in Hand.","cat26",". The cash in hand shall be checked daily with the cash book which shall be balanced and ruled off at least once a week and on the last day of each month. Every officer concerned shall pay into the nearest Treasury Cash Office at least once a week and on the last working day of each month all moneys for the time being remaining in his hands.");
        Finance_Section section434 = new Finance_Section("Money paid to Treasury Cash Officer","cat26"," Upon payment of moneys to the Treasury Cash Office, Registrars shall produce their books, receipt books and Court Payment Vouchers for examination ");
        Finance_Section section435 = new Finance_Section("Checking of books by Registrar","cat26","Registrars shall check the cash in the hands of the cashiers of their Court at least weekly with the Cash Book, Treasury Receipt Books, Court Payment Vouchers, Bank Paying-in Books, Court Process Books, Criminal Record Books, etc. in the current use.");
        Finance_Section section436 = new Finance_Section("Convictions Register","cat26","Each Registrar shall maintain a register of all convictions which include the payment of a fine and shall record therein the Court Cash file number, the name of the convicted person, the amount of the fine and the prison sentence (if any) in lieu of payment thereof. The collection of fines shall at all times be kept in view and, when a sentence of imprisonment is served instead, the Registrar shall obtain proof from the Prison Authorities and shall record in the register accordingly. When a fine is paid, the number of the receipt issued shall be entered in the Register and in the Court Record Book where the order of sentence of fine was recorded. When checking Court Cash Books, Registrars shall also scrutinize the Convictions Register and shall enquire into any case in which a fine has not been paid without the prison sentence being served in lieu thereof.");
        Finance_Section section437 = new Finance_Section("Receipt.","cat26","Registrars shall give a receipt (Treasury Form 6A) for all fees/fines payments into Court or other moneys received by virtue of their office.");
        Finance_Section section438 = new Finance_Section("Revenue","cat26","All fees and fines, collected by the Court shall be paid to the Treasury and credited to revenue.");
        Finance_Section section439 = new Finance_Section("Bailiffs’ fees.","cat26","Bailiffs’ fees, service, mileage and execution fees, are Court fees within the meaning of Financial Regulation 26011 and must be paid into revenue.");
        Finance_Section section440 = new Finance_Section("Deposits.","cat26","(1) All moneys other than fees and fines collected by the Court and not paid out within forty-eight hours of the  time of receipt to the persons entitled to them shall be placed on deposit with the exception of those funds which may be dealt with in accordance with Financial Regulation 26017.\n" +
                "\n" +
                "     (2) Moneys placed on deposit with the Treasury in accordance with these Regulations shall be credited to one of the Court Deposit Accounts as directed by the Accountant-General. It is important that the details in the body of the Receipt Voucher shall include the name of the Court to which the deposit belongs and any Court receiving a deposit in respect of a suit belonging to another Court should at once advise that Court of the details of the Treasury Receipt Voucher.\n" +
                "\n" +
                "     26014.  Registrars shall obtain from the Treasury a receipt for all moneys paid in by them. Treasury receipts for Revenue shall be retained by the Registrar in support of his accounts.\n");
        Finance_Section section441 = new Finance_Section("Money Paid into Court","cat26",".  Treasury receipts for moneys placed on deposit with the Treasury shall be produced to the Treasury when it is desired to withdraw any sum of money from the deposit. The receipts should be kept in a guard book, and every care should be exercised to ensure their safe custody.");
        Finance_Section section442 = new Finance_Section("Money paid into court and deposited in the Treasury for the benefit of judgement creditor","cat26",".  Money paid into Court by an Order of the Court or of a Judge shall not be paid out except in pursuance of an order of the Court or of a Judge. Treasury payment vouchers for the withdrawal of such money from deposit shall be supported by a certified copy of the order of the Court or of a Judge, in addition to being supported by the relevant Treasury Receipt.");
        Finance_Section section443 = new Finance_Section("Payment out of court","cat26","Money paid into court and deposited with the Treasury but payable to a judgement creditor on account of a writ of execution may be withdrawn from the Treasury upon the authority of the Registrar. The relevant Treasury Receipt shall be attached to the Payment Voucher in respect of which the deposit is withdrawn.");
        Finance_Section section444 = new Finance_Section("Details required on counterfoils receipts","cat26",".  Payment vouchers shall be made payable to the Registrar of the relevant Court, and the Registrar shall give a receipt for the sum withdrawn and shall bring the amount to account as a receipt in his cash book. This receipt shall be attached to the payment voucher in addition to the Treasury receipt referred to in Financial Regulations 26015 and 26016.\n" +
                "\n" +
                "     26019.  (1)  When money is paid out of Court to any party, the Registrar shall forthwith enter the payment in his cash book and he shall require the party to complete the receipt portion of the Court payment voucher and he shall certify the accuracy of all details including signature entered on the Court payment voucher which shall be retained in support of his accounts.\n" +
                "\n" +
                "     (2)  The following particulars should be shown on receipts and Counterfoils for fees payable in Judicial proceedings:\n" +
                "\n" +
                "(a)\t Fees in civil cases……………….. The amount              involved, where the fee depends thereon, the nature of Petition, claim or writ in all other cases.\n" +
                "\n" +
                "(b)\t  Hearing Fees. …………………….The reasons for charging an additional fee and the original  fee paid for the summons.\n" +
                "   \n" +
                "(c)\tSubpoenas ………………………… Number of case and names of witness.\n" +
                "\n" +
                "(d)\tProbate and Administration…………The value of the property and the services rendered.\n" +
                "\n" +
                "(e)\tDivorce and Matrimonial Cases……..The petition or citation.\n" +
                "\n" +
                "(f)\tCriminal Matters……………………The summons or warrant issued.\n" +
                "\n" +
                "(g)\tExecution Fees……………………… The service rendered, the number of days, the goods remained in possession of the bailiff and the cost of keeping the goods safe.\n" +
                "\n" +
                "(h)\tTransport Fees……………………….The number of kilometers embraced.\n" +
                "\n" +
                "(i)\tSearching Archives ………………….The period.\n" +
                "\n" +
                "(j)\tFor drawing Bill of Costs…………….The number of words.\n" +
                "\n" +
                "(k)\tFor taking Costs……………………  The amount of the bill.\n" +
                "\n" +
                "(l)\tFor copying documents………………The number of words and whether the copy is certified.    \n" +
                "\n" +
                "(m)\tOther copying documents ……………The nature of the services\n");
        Finance_Section section445 = new Finance_Section("Payments at other stations.","cat26","(i)  When Court money is placed on deposit with the Treasury at one station and is required to be withdrawn and paid to a Court at another station, the remittance shall be effected by the transmission of a checked and passed Treasury Payment Voucher (Treasury Form 1) which can be presented for payment at the distant station. Such payment vouchers shall be classified as chargeable to the Court Deposit Account for the Court which is making the remittance, that is, to the Account to which the amount was credited when originally placed on deposit.\n" +
                "     (ii)  Court fees and fines shall on no account be remitted in this manner. They must be credited to Revenue in the first instance as provided in Financial Regulation 26011.\n");
        Finance_Section section446 = new Finance_Section("Court deposit ledgers.","cat26","(1)  All Courts shall keep Deposits Ledgers in which shall be entered all sums deposited with or withdrawn from the Treasury. Reference to Treasury Voucher numbers and to the corresponding entries in the Judicial cash books should be shown against each transaction recorded in these ledgers.     \n" +
                "\n" +
                "     (2)  For the purpose of reconciliation, each Court shall send to the Treasury concerned immediately after the 31st December and the 30th June of each year, a list of credit balances in the deposit ledgers as at the close of business on those two dates together with details of relevant receipt vouchers.\n" +
                "\n");
        Finance_Section section447 = new Finance_Section("Trust funds estates.","cat26","(1)  Trust funds, estates of minors and other estates which officers of the Court may be directed by the Court to administer shall be dealt with separately from the Treasury Court accounts.\n" +
                "\n" +
                "     (2)  Officers administering such funds shall keep a cash book, ledger and Treasury receipt books relating to these transactions alone, and those books shall be subject to Treasury and Audit examination. Funds so held may be deposited with a bank and need not be paid to the Treasury\n");



        Finance_Section section448 = new Finance_Section("Custody of books.","cat26","(1)  The Chief Registrar shall keep a Stock Register and a Distribution Register of all the Receipt Books and Process Court Books for the Custody and distribution of which he is responsible.\n" +
                "\n" +
                "     (2)  All Registrars shall keep a receipt book register in which should be entered a record of all Receipt and Process Books issued to them.\n" +
                "\n" +
                "     (3) Receipt Books shall be locked up and the key shall be kept by the Registrar. Any officer to whom books are issued for daily use shall be responsible for them during that time but the books shall be locked up by the Registrar at the close of the day’s work.\n");
        Finance_Section section449 = new Finance_Section("Definition of Sheriffs.","cat26","The term sheriff, herein, includes the Duties Sheriff and all Assistant Sheriffs. (see Section 2 of the Sheriffs and Civil Process Act Cap. S.6 Laws of Federal Republic of Nigeria 2004).");
        Finance_Section section450 = new Finance_Section("Cash Book.","cat26","(1)  A Cash Book shall be kept by all sheriffs, into which shall be entered all receipts and payments at the time of their transactions. The cash book shall be kept in the Sheriff’s Office and not by the Bailiff.\n" +
                "\n" +
                "     (2)  The cash in hand shall be checked daily and compared with the cash book which shall be balanced and ruled off at least once a week and also on the last day of each month.\n");
        Finance_Section section451 = new Finance_Section("Bank Account.","cat26","(1)  If the sheriff has a bank account, he must observe the rules enumerated in Chapter 11 of these Regulations and he must keep a ledger in which he shall record transactions relating to the collecting of money by bailiffs by installments.\n" +
                "\n" +
                "     (2)  An account in the ledger shall be opened for each suit, in which shall be recorded all collections credited to the bank account and the ultimate deposit in the Treasury of the total amount realized in respect of each suit. The balance appearing in the ledger must be reconciled with the balance in the Sheriff’s bank account every three months.\n");
        Finance_Section section452 = new Finance_Section("Bailiff’s receipt books. Bailiff’s Return of writ\n","cat26",".  Every bailiff must be provided with two receipt books by the sheriff from which he must give a receipt for any sum of money collected by virtue of his office.\n" +
                "\n" +
                "     26028.  All moneys collected by bailiffs shall be paid to the sheriff who shall give a receipt (Treasury Form 6) for the sum of money so received.\n" +
                "\n" +
                "     26029.  (1)  At the close of every month, each bailiff shall make a full return to the sheriff on all writs in his possession and of all sums of money collected by him during the month.\n" +
                "\n" +
                "     (2)  The Sheriff shall after due examination and comparison with the counterfoils of the bailiff’s register retain the bailiff’s return in support of his account. He shall certify thereon that the returns have been examined in accordance with the law\n");
        Finance_Section section453 = new Finance_Section("Sheriff’s payment into court.","cat26","Sheriff’s payments into Court must be effected by deposit at the Treasury in favour of the Court Registrar. The Sheriff shall give the relevant Treasury receipt to the Registrar who shall issue a Court receipt for a like amount in exchange. The Sheriff shall quote the number of the court receipt in his cash book against the entry of the payment into the Treasury. The Registrar shall enter on the receipt side of his cash book the amount represented by the Court receipt issued to the sheriff and on the payment side, he shall enter a similar amount as having been paid into the Treasury quoting the number of the Treasury receipt given him by the sheriff. When the deposit is withdrawn from the Treasury by the Registrar the amount shall be brought to account on the receipt side of the cash book, and when payment is made by him to the suitor to whom it is due, it shall be entered on the payment side of the cash book and reference made to the court payment voucher on which the suitor signs for the money");
        Finance_Section section454 = new Finance_Section("Account of sale.","cat26","When paying money to the Court, Sheriffs shall submit an account of any sale effected. This amount, which must be signed by the Sheriff, should accompany the writ of execution or be endorsed on the back thereof. The account must also show details of all deductions for the amount realized to facilitate audit. The writ shall be retained by the Court for filing in the respective suit jacket.");
        Finance_Section section455 = new Finance_Section("Payments made by Sheriffs.","cat26","Sheriffs must obtain receipt for payments made other than to the Treasury. Details of such payments must be entered in the Sheriff’s cash book.");
        Finance_Section section456 = new Finance_Section("Stations served by bank.","cat26","At stations where there is a branch of bank in which Government account is kept, payment of money to the Treasury through the bank shall be in accordance with the conditions laid down under Financial Regulation 06018.\n" +
                "\n" +
                "     26035.  Sheriffs shall pay all moneys received to the Treasury at least twice a week and where payment is made into a Treasury Cash Office, they shall like all other Revenue Collectors, produce their cash and receipt books for the examination of the Treasury Cash Officer. (see Financial Regulations 06010 and 06011).\n");
        Finance_Section section457 = new Finance_Section("Payments at or for other stations","cat26","Money payable by sheriffs to the Court at another station must be paid to the Treasury to the credit of the appropriate deposit account in accordance with paragraph (2) of Financial Regulation 26013. The deposit receipt may then be transmitted to the Registrar of the court concerned. Fees payable at other stations shall be paid by voucher in the ordinary way.\n" +
                "\n");
        Finance_Section section458 = new Finance_Section("Payment to judgment creditor after","cat26","On no account shall any money realized on any execution writ or warrant be paid by the sheriff or by a bailiff direct to the judgement creditor or to his lawyer or agent. Payment shall be made in accordance with Financial Regulation 26017.");
        Finance_Section section459 = new Finance_Section("Transport and other allowances to public subpoena as state witness.","cat26","The cost of the transport and other allowances to a public officer subpoenaed as a State Witness shall be paid by the Judicial Department. Where warrants are necessary, the officer will, if possible, obtain them from the Court concerned. If it is not possible to obtain a warrant from the court in advance, the officer shall obtain one from his own Department and notify the Court of the particulars of it. All vouchers in respect of allowances must be submitted to the Court concerned for acceptance and signature.");


        Finance_Section section460 = new Finance_Section("Scales of transport: cheapest method and route to be used.","cat27","The circumstances in which a public officer is eligible for transport at Government expenses, and the scale of such transport are prescribed in the Civil Service Rules. Where alternative transport service are available, the cheapest must be used if satisfactory.  A Department’s vehicle (or vehicles from the Government Transport Pool if available) should be used for the transport of officers on transfer, etc. and of Government stores where the use of such transport, taking all factors into account, is the most economical method available.");
        Finance_Section section461 = new Finance_Section("Cash payments when warrants not used.","cat27","When an officer is eligible for transport at Government expense, otherwise than in his own car or by Government vehicle, and no transport allowance can be used, he may receive a cash payment for his transport expenses.");
        Finance_Section section462 = new Finance_Section("Transport expenses of Government Officers Allocation of.","cat27",".  An officer travelling on duty, otherwise than in his own car or by Government vehicle,  may receive a cash payment in respect of his transport expenses under the following conditions:\n" +
                "\n" +
                "(a)\t He will be paid an amount which represents the cost of passenger fares and transport of baggage within the limits prescribed by Public Service Manual at the time the journey is made. Payment may be made to the officer when the officer’s family proceeds or follows him, in accordance with the Civil Service Rules.\n" +
                "\n" +
                "(b)\tPayment may be made before the journey is undertaken and in the case of a return journey payment may be made for both the journey away from and back to his station before he leaves his station. Similarly in the case of an officer who is due to be transferred to a new station after the expiry of his leave, and who shall not be returning to his old station, payment may be made for both journeys before the commencement of the first journey.  Before approving the payment to the travelling officer, the authorizing officer shall obtain an application signed by the travelling officer.\n" +
                "\n");
        Finance_Section section463 = new Finance_Section("Transport expenses of State Witnesses outside Ondo State.","cat27","The Transport and Travelling Expenses’ sub-head of a Ministry or Department is intended to meet the cost of transport and travelling expenses of the officers whose salaries are charged to the Personal Emoluments Vote of that Ministry or Department, irrespective of the nature of the duties actually carried out by the officers when they performed the journey except that:\n" +
                "\n" +
                "(a)\tOfficers travelling in connection with elections are to charge their expenses to the sub-head provided for election expenses.\n" +
                "\n" +
                "(b)\tOfficers travelling in connection with Committees and Commissions appointed by the Government are to charge their expenses to the sub-head ‘Committees and Commissions’ of the Miscellaneous Head, unless a special sub-head is opened for the expenses of a particular committee or commission.\n" +
                "\n" +
                "     27005.     Seconded officers shall be regarded as officers of the Department to which they are seconded, for the purpose of the payment of transport expenses.\n" +
                "\n" +
                "\n" +
                "     27006.  Persons residing in Ondo State of Nigeria who are subpoenaed as State witnesses to attend a Court in another State shall be given the necessary travelling allowance by the Registrar of the Court nearest to their place of residence. The cost of such journeys shall be charged to the appropriate Heads and sub-heads, of the Judicial Department in the State in which their evidence is to be given. The Chief Registrar shall notify each Registrar at the commencement of each financial year of the appropriate Head and sub-head numbers of other States.\n");



        Finance_Section section464 = new Finance_Section("Responsibility for Vehicles","cat28","The Accounting Officer shall be responsible for ensuring that there is effective control in the use of Government vehicles. For that purpose, he shall ensure that the following records are maintained:\n" +
                "\n" +
                "(a)\t Vehicle Control Register,\n" +
                "(b)\tRequisition/Approval for journey,\n" +
                "(c)\tVehicle Log Book/Work Ticket (Gen. 59),\n" +
                "(d)\tVehicle Maintenance Register,\n" +
                "(e)\tTransport Diaries.\n");
        Finance_Section section465 = new Finance_Section("When official transport should be used.","cat28",".  Official transport is to be used on all occasions to facilitate Government business. Official transport shall not be used for private journey except:\n" +
                "\n" +
                "(i)\twhen the officer is on salary Grade Level 16 and above or a Head of Department; \n" +
                "(ii)\tfor house to office running;\n" +
                "(iii)\tfor collection of such officers’ children to and from school.\n" +
                "\n" +
                "     28003.  (a)  Private cars and other vehicles may not be hired for the purpose of conducting normal government business.\n" +
                "\n" +
                "(b)\t  In such circumstances warranting the hiring of private vehicles, the Accounting Officer of the Ministry, Department or Agency shall give approval.\n" +
                "\n" +
                "(c)\tThe limitation above shall not apply to contracts for the transportation of goods in the public interest, provided such contracts are dealt with in accordance with approved tender procedures.\n");
        Finance_Section section466 = new Finance_Section("Responsibilities of  officers in charge of Government motor vehicles.\n","cat28","An Accounting Officer shall appoint such officers as may be necessary to be in charge of the motor vehicles of his Department, and only these officers may authorize the use of a Government motor vehicle. Officers in-charge of Government motor vehicles are responsible for the immediate control of all vehicle under their charge, and for ensuring that the provisions of these Regulations are adhered to.");
        Finance_Section section467 = new Finance_Section("Marking of Government motor vehicles","cat28",".  Every Government motor vehicle must be identified by a Department number, preceded by the code letters of the Ministry, Department/Agency painted on or stamped into the structure. Normally these identification labels of Ondo State Government shall be engraved on the body of the vehicle");
        Finance_Section section468 = new Finance_Section("Speedometers to be in working order","cat28","An officer in charge of motor vehicles shall ensure that the speedometers of all motor vehicles under his charge are in working order at all times. In the event of a speedometer being temporarily out of order, distance covered must be estimated for the purpose of entry in the Transport Diary.");
        Finance_Section section469 = new Finance_Section("Driving of official vehicles","cat28","Government vehicles must be driven by official drivers and not by officers travelling therein. Exceptionally, provided that he holds a current Nigeria driving licence valid for the class of vehicle in question, an officer may drive in the following circumstances only:\n" +
                "\n" +
                "(a)\t In an emergency (which must be reported to the officer in–charge of transport immediately on conclusion of the journey) when an official driver is incapacitated or not available.\n" +
                "\n" +
                "(b)\tOn a long journey (exceeding 400 kilometers in one day), provided that specified authorization has been given in writing by the Accounting Officer;\n" +
                "\n" +
                "(c)\tWhen a duly authorized officer is conducting an essential mechanical test or road test.  Civil Servants who fail to adhere to the above provisions shall be sanctioned by suspension for two weeks without pay.\n");
        Finance_Section section470 = new Finance_Section("Transport Diaries.","cat28","A Transport Diary shall be kept by the driver of each Government motor vehicle, in which the purpose of every journey must be clearly indicated. The speedometer reading shall be recorded in the distance column of the diary at the end of each day’s running, and the distance covered on each separate journey shown in the same column. Entries in the transport diary shall be made at the completion of each journey, and the completed entry initialed personally by the officer making the journey, or, if goods only are carried, by the officer authorizing the journey. All petrol and lubricating oil purchased for or issued to a vehicle shall be recorded in the transport diary of the vehicle, the source and date of supply and reference to the relative voucher being given. The monthly totals of distance covered and consumption of petrol, oil and lubricants are to be carried over to the Motor Vehicle Maintenance Log-Book for that vehicle.");
        Finance_Section section471 = new Finance_Section("Transport Orders.","cat28",".  Transport Order shall be issued by the officer-in-charge of transport in respect of every journey to be undertaken by an official vehicle. Transport Orders shall be filed by vehicle control officers and preserved for audit inspection.");
        Finance_Section section472 = new Finance_Section("Transport Orders maintenance log book","cat28",".  A Motor Vehicle Maintenance Log Book shall be kept for every Government motor vehicle, in which shall be recorded monthly summaries of distance covered, run of petrol and lubricating oil  purchased for or issued to the vehicle (see Financial Regulation 28008), and particulars of all maintenance and repairs. Instructions for the Log Book are contained therein.");
        Finance_Section section473 = new Finance_Section("Use of official vehicles on duty, etc.","cat28","An officer requiring a motor vehicle, for official purposes or in which he is entitled to free transport facilities as specified in Civil Service Rules, may use an official vehicle without payment for such purposes only, under such conditions as may be laid down by his Accounting Officer.");
        Finance_Section section474 = new Finance_Section("Use of Official Vehicle on duty etc. by officer in receipt of motor basic allowance","cat28",".  An officer in receipt of transport allowance shall not be permitted to use an official vehicle for his own movements.");
        Finance_Section section475 = new Finance_Section("General Procedure.","cat28","In addition to any action which may be required to be taken in accordance with the provisions of the Road Traffic Law Cap. 136 of the Laws of Ondo State, 2006, the procedure prescribed in this Chapter must be observed when an accident involving a Government vehicle occurs.");
        Finance_Section section476 = new Finance_Section("Driver: Action by","cat28","The driver, or the person in-charge of the vehicle, must immediately report the accident to his Head of Unit or Department. At the scene of the accident he shall supply only to a police officer, or to the owner of the property to which injury has been caused, details of:\n" +
                "\n" +
                "(a)\t his name and  address;\n" +
                "(b)\tThe name and address of the owner of the vehicle;\n" +
                "(c)\tThe identification mark of his vehicle.\n" +
                "\n" +
                "     He shall in no way admit liability to any member of the public, or make any statement other than those above, to the Police, or to the owner of the property.\n");
        Finance_Section section477 = new Finance_Section("Head of Unit or Department Action by","cat28","The Head of Unit or Department shall take immediate steps to obtain statements of what took place from the driver, the passengers and any witnesses whose names and addresses are known.");
        Finance_Section section478 = new Finance_Section("Inspection by Mechanical Engineer.","cat28","The Head of Unit or Department shall request the Permanent Secretary, Ministry of Works to send an officer to inspect the damage to the Government vehicle or property (in this connection inspection of non-Government property should not be carried out except in circumstances as described in Financial Regulation 28020, since an unsolicited inspection might be held to amount to an admission of liability)");
        Finance_Section section479 = new Finance_Section("Accounting Officer: Authorized to deal with.","cat28","The representative of the Permanent Secretary, Ministry of Works should be a person whose evidence in the event of a dispute would carry weight with the Court. He should take his own notes at the time of inspection, from which he can refresh his memory if, sometime later, he should be called upon to give evidence. He should take care to observe anything which may help to show how the accident occurred. In some cases, for example, the part of the vehicle which came into contact with the other vehicle or object shall indicate the angle of impact. He should, whenever possible, test the efficiency of the steering and the brakes.");
        Finance_Section section480 = new Finance_Section("Claim against Government","cat28","If a claim for compensation for damage or injury out of an accident is received, the Head of Unit or Department shall give, initially, only a formal acknowledgement of the receipt of the claim.");
        Finance_Section section481 = new Finance_Section("Inspection following receipt of a claim against Government","cat28","On receipt of a claim under Financial Regulation 28018 and provided the consent of the owner of the vehicle or property or his representative, has been obtained, the Head of Unit or Department shall request the Permanent Secretary, Ministry of Works to send a competent person to inspect the damage to a vehicle or property in respect of which the claim is made. The same points for guidance included in Financial Regulation 28017 should be borne in mind during this inspection.");
        Finance_Section section482 = new Finance_Section("Police action information.","cat28","In those cases which are brought to the notice of the Nigeria Police, in accordance with the Road Traffic Laws Cap. 136 of the Laws of Ondo State, 2006, the Head of Unit or Section shall obtain from the Local Police Authorities a Police Report, together with a statement as to whether any person is being prosecuted as a result of the accident. The Police authorities shall also be requested to give the result of such prosecution where available");
        Finance_Section section483 = new Finance_Section("Head of Unit or Department: Report by","cat28","The Head of Unit or Department shall forward in duplicate to his Accounting Officer, a report on the circumstances of the accident. The report, which must contain full details of how the accident occurred; shall include, among others, the following:\n" +
                "\n" +
                "(a)\t Details of any claim which has been received for damage or for injury arising from the accident.\n" +
                "(b)\tThe original of any such claim.\n" +
                "(c)\tFor the purposes of assessing the legal position, an opinion whether or not the Government driver was acting in the course of his employment, and if it is considered that he was not, then full particulars must be given. (As a general rule a driver on an authorized journey is presumed to be acting in the curse of his employment, even if he makes an unauthorized detour, or drive at a speed in a manner which the superior officer has forbidden).\n" +
                "(d)\tDetails of the damage to Government vehicles and property, including the cost of repairs, and details of any evidence tending to show how the accident occurred.\n" +
                "(e)\tDetails of the damage or injury in respect of which any claim has been made.\n" +
                "(f)\tCopies of any reports provided by the Police.  \n" +
                "(g)\tCopies of the statement of the driver.\n" +
                "(h)\tA sketch plan of the scene of the accident, if this is likely to assist in the assessment of the case.\n" +
                "(i)\tAn opinion of the degree of negligence of each of the parties involved\n");
        Finance_Section section484 = new Finance_Section("Circumstance that may warrants the convening of Board of Enquiry.","cat28","The Accounting Officer must decide whether the circumstances of the accident disclosed by the report of the Head of Unit or Section warrant the convening of a Board of Enquiry, and, if they do, he shall apply for such a Board under the provisions of Chapter 16 of Financial Regulations on the subject of Boards of Enquiry on losses.");
        Finance_Section section485 = new Finance_Section("Accounting Officer: Authorized to deal with","cat28"," The Accounting Officer may dispose of an accident report, and order the repair of the Government vehicle when:\n" +
                "\n" +
                "(a)\t A civil claim against government, has not been received, or is not likely to be received.\n" +
                "(b)\tThe Accounting Officer is of the opinion that Government should not institute a civil claim against any person.\n" +
                "(c)\tThe disciplinary action against any officer involved is within the discretion of the Accounting Officer.\n" +
                "(d)\tSufficient funds are available to meet the cost of repair to the government vehicle and/or the government property.\n");


        Finance_Section section486 = new Finance_Section("Accounting Officers to report to Ministry of Finance.","cat28","The Accounting Officer shall submit a report to the Permanent Secretary, Ministry of Finance on the circumstances of those accidents where:\n" +
                "\n" +
                "(a)\t A civil claim against Government has been received or is likely to be received, or\n" +
                "(b)\tWhere in the opinion of the Accounting Officer, government should institute a claim against any person, and/or\n" +
                "(c)\tWhere there are allegations of negligence causing the accident which may involve disciplinary action against an officer over whom powers of discipline have not been delegated\n");
        Finance_Section section487 = new Finance_Section("Report of Accounting Officer: Form of.","cat28",".  The report to be submitted under Financial Regulation 28024 must contain among others, details of:\n" +
                "\n" +
                "(a)\t The opinion of the Accounting Officer as to the degree of negligence of each of the parties involved in the accident.\n" +
                "(b)\tA recommendation as to disciplinary action, including surcharge, which should be taken against any officer over whom powers of discipline have not been delegated to the Accounting Officer.\n" +
                "(c)\tThe disciplinary action, including surcharges, and cessation of “No Accident” bonus which has been taken, or is proposed to be taken in cases where there is delegation of this disciplinary power. (see Financial Regulation 28026 if criminal prosecution is involved).\n" +
                "(d)\tDetails of instances of any unauthorized use of Government Vehicles which may have been disclosed as a result of the accident, together with recommendation to prevent a re-occurrence.\n" +
                "\n" +
                "Attached to the report must be:\n" +
                "(e)\tA copy of the report with the attachments from the Head of Unit or Section, as required by Financial Regulation 28021.\n" +
                "(f)\tThe report of the Board of Enquiry, where applicable\n");
        Finance_Section section488 = new Finance_Section("Disciplinary action may be taken before conclusion of criminal prosecution","cat28","If a criminal prosecution is pending against a Government employee arising from an accident involving a Government vehicle, the departmental disciplinary action may be taken simultaneously along with the criminal prosecution in accordance with the Civil Service Commission Regulations.");
        Finance_Section section489 = new Finance_Section("Permanent Secretary, Ministry of Finance: Action by.","cat28","On receipt of the report of the Accounting Officer, the Permanent Secretary, Ministry of Finance shall be responsible for all subsequent actions on civil claims and he shall seek from the legal officer the advice as to whether Government should institute a claim against any person, or admit any claim which may be made against Government in respect of the damage or injury caused by the accident.");
        Finance_Section section490 = new Finance_Section("Civil Service Commission: Action by.","cat28","The Permanent Secretary, Ministry of Finance shall refer the papers to the Secretary of the Civil Service Commission in those cases where a charge of negligence against an officer is not within the competence of the delegated powers of the Accounting Officer.");
        Finance_Section section491 = new Finance_Section("Write off of the vehicle.","cat28","If, as a result of the accident, the Government vehicle is considered to be beyond economic repair, the Accounting Officer shall, on the conclusion of the criminal prosecution if any, apply for a Board of Survey on the vehicle under the provisions of Chapter 15 of Financial Regulations on the subject of Boards of Survey on Stores. Copies of the Accident Report shall be made available to the Board.");
        Finance_Section section492 = new Finance_Section("Quarterly Return","cat28",".  Accounting Officers shall forward at quarterly intervals to the Permanent Secretary, Ministry of Finance with a copy to the Auditor-General, a return of all accidents to Government Motor Vehicles under their charge, to show:\n" +
                "\n" +
                "(a)\t Date of accident.\n" +
                "(b)\tDetails of vehicle involved.\n" +
                "(c)\tEstimate of the cost of repairs to the Government vehicle or property.\n" +
                "(d)\tBrief details of accidents dealt with under Financial Regulation 28023 and details of disciplinary action taken.\n" +
                "(e)\tBrief details of accidents dealt with under Financial Regulation 28024 and cross-references to the reports submitted under Financial Regulation 28025.\n" +
                "\n" +
                "     28031.  (i)  Government vehicles should not be used on Saturdays and Sundays except on strictly official duties.\n" +
                "\n" +
                "      (ii)  The use of Government vehicles beyond two  hours after the close of work should be restricted to official business.\n" +
                "\n" +
                "(iii)\t Officer on GL. 16 and above are empowered to stop any Government vehicle suspected to be on non-official business for explanation and the onus of proof of authority for use shall lie on the driver of the motor vehicle.\n");





        Finance_Section section493 = new Finance_Section("Policy.","cat29","The Accounting Officer of a Ministry, Department or Agency will ensure that, an Internal Audit Unit is established to provide a complete and continuous audit of the accounts and records of revenue, expenditure, plant, allocated and un-allocated stores where applicable. The existence of an Internal Audit Unit shall not divest any member of the Ministry, Department or Agency of the individual responsibilities placed upon him, neither shall it obviate the necessity for normal department checks.");
        Finance_Section section494 = new Finance_Section("Internal Audit Appointment of.","cat29","The Accountant-General shall ensure that a suitably competent accountant or auditor is placed directly in charge of the Internal Audit Unit in every Ministry and Non-Ministerial Department.");
        Finance_Section section495 = new Finance_Section("Duties of Internal Auditor.","cat29",".  The Internal Auditor in charge shall be directly responsible to the Accounting Officer for a detailed audit of the accounts and records, and for the examination of the systems and procedures in force. Initially, he shall submit to the Accounting Officer for the attention of the Accountant-General a detailed programme of audit and, thereafter, he shall report quarterly to the Accountant-General, Auditor General, and the Accounting Officer on the progress of the Audit. He shall also issue special reports, if necessary when, in his opinion, the attention of the Accounting Officer and the Head of Accounts ought to be drawn to an irregularity in the accounting records, or to an apparent weakness in the accounting procedure, or to any apparent in-attention to the reports of the Auditor-General or to earlier internal audit reports issued by him. In those Ministries where a system of a stores stock verification is available, he shall assume the control of the stock verification staff and direct their programme of inspection (see Financial Regulation 29006).");
        Finance_Section section496 = new Finance_Section("Programme.","cat29","The Internal Auditor-in-charge shall ensure that the programme of Audit  extend to cover all the records of the Ministry, Department or Agency, in order to satisfy himself that:\n" +
                "\n" +
                "(a)\t the safeguards for the prevention or the prompt detection of fraud and loss of cash or stores or plant are adequate. Normal safeguards include the observance of Government and Departmental regulation and instructions, and existence of internal checks.\n" +
                "(b)\tthe system for the control of the collection of revenue is adequate, and that all monies received have been promptly brought to account, to the correct head and sub-head.\n" +
                "(c)\tthe system for the control of expenditure is adequate and that all payments made are properly authorized and correct, they are paid to the right person, from the correct head and sub-head, and made, for the purpose for which they were authorized.\n" +
                "(d)\tthe system of the control of the issue and consumption of stores is adequate, all issues are properly authorized and correct, issues are made to the right person and are used for the purpose for which they are authorized.\n" +
                "(e)\tthere are adequate means for the verification by him of all cash, stores and plant held. Records in respect of the purchase of vehicles and their maintenance running costs, log-books and disposal must also be checked.\n" +
                "(f)\tthe accounting records are accurate.\n" +
                "(g)\tpre-payment and post-payment checks of payment vouchers are in force.\n" +
                "(h)\tad-hoc investigations are carried out when necessary.\n" +
                "(i)\tthe records in Financial Regulation 28001 are also checked.\n");

        Finance_Section section497 = new Finance_Section("Progress Register","cat29","The Internal Auditor-in-charge shall maintain under his personal control, a register to record the progress of the audit. The register shall normally be in columnar form of not less than thirteen columns, to record the specific task to be undertaken in the course of the internal audit duties and the officer in charge of each task shall initial in the appropriate extension column against each task to indicate the completion of the specific task for each month. The inspection of Head-quarters accounts or Treasury Cash Offices shall normally be on a continuous basis throughout the year, whilst inspection of separate units might be on a periodical basis.");
        Finance_Section section498 = new Finance_Section("Audit Guides","cat29","The Internal Auditor-in-charge shall draw up detailed internal audit guides for the use of the examination staff, setting out concisely the nature and extent of the checks to be applied to each account or record. The guide shall be comprehensive and shall be an amplification of the Audit Programme, and it will explain the general nature of the account, the relationship to the function of the Ministry, Department/Agency and contain references to the basis in Law, any relevant account instructions issued by the Accountant-General, or other instructions issued by the Government.");
        Finance_Section section499 = new Finance_Section("Restriction in the duties of Internal Audit Staff","cat29","(i)  The staff of the Internal Audit Unit may not be employed within the Ministry, Department or Agency, on accounting duties or on the internal check  of accounting records. Further, an officer shall be precluded from taking up the duties of internal audit staff if he has previously been engaged on accounting or internal check duties within the Ministry, Department, or Agency over the period to be covered by the Internal Audit.");
        Finance_Section section500 = new Finance_Section("Report of Internal Auditor","cat29","(ii) Under no circumstances shall members of Internal Auditor Staff attend or participate in replying Auditor-General’s queries sent to Ministries, Departments or Agencies.\n" +
                "\n" +
                "     29008.  The Internal Auditor-in-charge shall render a quarterly and annual reports to Accounting Officer with copies to the Auditor-General and the Accountant-General to certify to what degree he is satisfied with the safeguards against fraud, with the controls of the receipts and of payments, with the controls on the issues and consumption of stores, with the verification of cash and stores held, and with the accuracy of the accounting records.\n" +
                "\n" +
                "  29009.  The Head of Internal Audit in all MDAs and other arms of government shall ensure that 100% pre-payment audit of all checked and passed vouchers is carried out and the vouchers forwarded under security schedule direct to the appropriate central pay office for payment. Checked and passed vouchers received in the Internal Audit Unit must be promptly dealt with and, under no circumstance, shall a voucher be held in that unit for more than forty-eight (48) hours.\n");








        Finance_Section section501 = new Finance_Section("Authority for writing off.","cat30","The writing off of losses and shortages of public money and stores requires the authority of the Treasury Board or the Commissioner, Ministry of Finance or an officer to whom the Commissioner has delegated powers of write-off, but in all cases in which substantial amounts or questions of principle are involved, prior reference shall be made to the Governor-in-Council.");
        Finance_Section section502 = new Finance_Section("Write-off of public money etc. the Commissioner.","cat30","(i)  The Commissioner for Finance retains the power to write-off losses of public money and stores as follows:\n" +
                "\n" +
                "(a)\t Cash and stores where no question of fraud or negligence is involved; up to N50,000.00 in each individual case.\n" +
                "(b)\tCash where fraud or negligence is involved; up to N20,000.00 in each individual case.\n" +
                "(c)\tAllocated or unallocated stores where fraud or negligence is involved; stores which the original value did not exceed N2,000.00.\n");
        Finance_Section section503 = new Finance_Section("Delegation of powers by Commissioner.","cat30",")  Losses in excess of the amounts stated shall be referred for approval of write-off to the Treasury Board.\n" +
                "\n" +
                "     30003.  The Commissioner, Ministry of Finance has delegated powers of write-off as follows:\n" +
                "\n" +
                "(j)\t Permanent Secretary, Ministry of Finance:\n" +
                "(a)\t As in Financial Instruction 30002 (i) (a) and (b) provided, in the case of stores, the original value did not exceed N20,000.00, where fraud or negligence is involved.\n" +
                "(b)\tAllocated or Unallocated Stores condemned as unserviceable by a Board of Survey, where there is no question of fraud or negligence.\n" +
                "     (ii)          Accounting Officers:\n" +
                "(a)\t Losses of Stores where there is no question of fraud or negligence up to N20,000.00, provided the original value did not exceed this amount.\n" +
                "(b)\tStores condemned as unserviceable by a board of survey and where there is no question of fraud or negligence up to N20,000.00, provided the original value did not exceed that amount.\n");
        Finance_Section section504 = new Finance_Section("Write-offs charging to vote.","cat30","Where a write-off has been approved and an accounting entry is necessary, the loss shall be charged to Head-Miscellaneous, Sub-head: Loss of Government Funds and Stores. Write-off of Stores or Funds may not be charged to the vote unless the value in the first instance has been charged to an advance account.");






        Finance_Section section505 = new Finance_Section("Treasury Forms.","cat31","Accounting forms for general use bear Treasury numbers and are issued under the authority of the Accountant-General. Special Departmental accounting forms may not be used without the authority of the Accountant-General.");
        Finance_Section section506 = new Finance_Section("Account Books: Pages to be numbered.","cat31","The pages of all account books must be numbered; if the numbers are not printed they must be inserted in non-washable ink or with a ball-point pen before the book is brought into use.");
        Finance_Section section507 = new Finance_Section("Books of Account: How to be written.","cat31","All books of account must be written in non-washable ink with the exception of those kept on the carbon duplicate system which should be written with a ball-point pen or indelible pencil.");
        Finance_Section section508 = new Finance_Section("Blue Pencil: restriction in the use of.","cat31","Except in the case of authorized public officers and officers in Drawing Offices, where they  may be required for the preparation of maps and plans, the use of Blue pencils by officers other than the members of the Audit Department is strictly forbidden.");
        Finance_Section section509 = new Finance_Section("Correction of erroneous entries.","cat31","In no circumstances may erasures be made or figures altered in any account book or on any voucher. If, an alteration is necessary, the erroneous entry should be neatly ruled through and the correct figure inserted. All alterations must be initialed by the responsible officer. In the case of vouchers, this shall be the officer who certified the voucher");
        Finance_Section section510 = new Finance_Section("Rent Registers.","cat31","A register of all Government quarters for which the occupancy pay rent (officers to whom Section 3 of Chapter 14 of the Civil Service Rules applies), must be kept by the Treasury Cash Officer at every station where there are Government quarter. The register shall be posted from salary vouchers on which the rent is deducted.");
        Finance_Section section511 = new Finance_Section("Rent of Government Quarters.","cat31","Officers in charge of salary payrolls shall ensure that the appropriate rent is deducted from the salary of an officer who occupies a Government quarter. On a change of occupancy, rent shall be chargeable to the outgoing officer up to and including the day prior to the hand-over, and against the incoming officer from and including the day of the take-over.");




        Finance_Section section512 = new Finance_Section("Pension, Gratuity and retirement benefits. Governing Authorities.","cat32","The circumstances in which a pensionable officer may be entitled to retiring benefits under the Defined Benefits Scheme are set out in the Pensions Act Cap.346 of the Laws of the Federal Republic of Nigeria, 1990. While those under contributory Pension Scheme are set out in Contributory Pension Act of 2004. The award of gratuity to a contract officer is determined by the provisions in the officer’s contract.");
        Finance_Section section513 = new Finance_Section("Preliminary Information","cat32","Under the Defined Benefit Scheme, as soon as it is known that an officer is due for retirement or indicates an intention to retire, the Accounting Officer or Head of a non-Ministerial Department shall request the Officer concerned to complete form No. ODSTAB 12. The officer should state his address after retirement and where he wants payment of his pension and gratuity to be made to him. ");
        Finance_Section section514 = new Finance_Section("Submission of Documents.","cat32","The following documents in respect of the retiring officer should be forwarded to the Secretary, Ondo State Pension Board not later than three months before the effective  date of retirement.\n" +
                "\n" +
                "(a)\tFour copies of the Pension Form (ODSTAB 12) duly completed;\n" +
                "(b)\tFour copies of the Statement of Aggregate Pensionable Emoluments in respect of the Officer;\n" +
                "(c)\tThe personal file of the Officer containing all leave particulars and an up-to-date Record of Service.\n");
        Finance_Section section515 = new Finance_Section("Completion of Documents.","cat32","The following points must be borne in mind in connection with the completion of pensions documents:\n" +
                "\n" +
                "(a)\t Pension Form (ODSTAB 12)\n" +
                "  (i)  the officer must have been confirmed.\n" +
                "\n" +
                "  (ii)  Leave without pay, leave on half pay, or service paid from an open vote must be shown in the appropriate columns;\n" +
                "\n" +
                "(iii) The dates of commencement of pensionable service, termination or retirement leave and commencement of pension must be established with certainty and be accurately stated.\n" +
                "(b)\t Statement of Aggregate Pensionable Emoluments should agree with the Record of Service in the Pension Form. Acting and other non-pensionable allowances should not be included.\n" +
                "\n");
        Finance_Section section516 = new Finance_Section("Notification to revenue collecting Departments.","cat32","The Accounting Officer must notify all Departments which may have claims on an officer of an impending retirement, resignation, non-renewal of contract agreement or termination of appointment. In addition, notification should be sent to the appropriate offices of all Departments which collect revenue or which may have occasion to charge for services performed for the retiring officer.");
        Finance_Section section517 = new Finance_Section("Action by the Secretary, State Pension Board","cat32",".  The Secretary, State Pension Board shall complete Part V of the Pension Form. \n" +
                "\n" +
                "     \n" +
                "\n" +
                "     32007.  The Secretary, State Pension Board, having satisfied himself that all documents have been correctly completed, shall:\n" +
                "\n" +
                "(a)\tcalculate the retiring benefits due to the officer;\n" +
                "(b)\tforward the documents to the Auditor-General.\n");
        Finance_Section section518 = new Finance_Section("Action by the Auditor-General","cat32","Having satisfied himself on the correctness of the calculation, the Auditor-General shall certify the retiring benefits and return the papers to the Secretary, State Pension Board.\n" +
                "\n" +
                "     32009.  The Secretary, State Pension Board shall retain one set of the pension papers and return the other three sets to the Accountant-General together with formal approval of the retirement benefits.\n");
        Finance_Section section519 = new Finance_Section("Action by the Accountant-General.","cat32",".  The State Pension Board in collaboration with the office of the Accountant-General shall arrange the payment of any pension and gratuity that may be due.");
        Finance_Section section520 = new Finance_Section("Recoveries from gratuity","cat32","The State Pension Board shall ensure that any debts due to Government are deducted from the gratuity. To this effect, the Payment Voucher must be made out in full for the gratuity payable. Details of the deductions shall be stated in the body of the voucher and Receipt Vouchers attached to the amount recovered");
        Finance_Section section521 = new Finance_Section("Final Action by State Pension Board","cat32","The State Pension Board shall ensure that all indebtedness to Government are recovered in full. It shall send two sets of the pension papers to the Accounting Officer of the affected Ministry, Department/Agency for their concurrence");
        Finance_Section section522 = new Finance_Section("Action by the Accounting Officer and the Secretary, State Pension Board","cat32","The Accounting Officer, State Pension Board and the Accountant-General shall take the same action as regards the officer’s service within Ondo State of Nigeria as for officers whose services are wholly in Ondo State");
        Finance_Section section523 = new Finance_Section("Action by the Secretary, State Pension Board","cat32","The Secretary, State Pension Board shall calculate the retiring benefits. He shall check and certify the statement of aggregate Pensionable Emoluments and pass all the documents to the Auditor-General.");

        Finance_Section section525 = new Finance_Section("Action by the Auditor-General","cat32","The Auditor-General shall certify the statement of Aggregate Pensionable Emoluments and return all the forms to the Accounting Officer of the Pensions Board, check and pass for payment appropriately.");
        Finance_Section section526 = new Finance_Section("Take off of the Scheme","cat32","Contributory Pension Scheme came into effect in Nigeria with enactment by the National Assembly of the Pension Reform Act, 2004, of 25th June, 2004. The Act repeals the Pensions Act 102 of 1979 hitherto in force.");
        Finance_Section section527 = new Finance_Section("Responsibility of the State Government under the Scheme","cat32","Under the Scheme, the State Government, as the ‘Employer’ shall contribute a minimum of 7.5% of Public Officers’ monthly emoluments towards the retirement benefits of its employees.");
        Finance_Section section528 = new Finance_Section("Responsibility of each employee under the scheme.","cat32"," Each employee shall pay a maximum of 7.5% of his/her total monthly emolument towards his retirement benefit to any of the accredited Pension Fund Administrators in the State.");
        Finance_Section section529 = new Finance_Section("State Government Contribution of 5% of the monthly Wage Bill of the (RBBRF)","cat32","The State Government is required to set aside 5% of the monthly wage bill payable to employees in the Public Service to fund the Retirement Benefit Bond Redemption Fund (RBBRF) for the past services of its employees under the old Defined Benefit Scheme.");
        Finance_Section section530 = new Finance_Section("State Government to continue to service payment of old pension and Gratuity.","cat32","The State Government shall continue to make budgetary provision for the payment of Pension and Gratuity to existing pensioners and those exempted under the Scheme in accordance with relevant and applicable computation under the scheme.");
        Finance_Section section531 = new Finance_Section("Those exempted from the scheme.","cat32","Those exempted from the Contributory Pension Scheme include those on consolidated salary and any employee who at the commencement of the Scheme is entitled to retirement benefit under any Pension Scheme but has three or less years to retire.");






        Finance_Section section532 = new Finance_Section("Stores Definition.","cat33","Stores include all movable property purchased from public funds or otherwise acquired by Government.");
        Finance_Section section533 = new Finance_Section("Classes of Stores.","cat33","For accounting purposes, stores are of two classes, namely Allocated Stores and Unallocated Stores. They are further divided into three categories, which  after issue, are dealt with according to the nature of the article, defined as follows:\n" +
                "\n" +
                "(j)\tNon-expendable stores e.g. plant and machinery,   motor vehicles, typewriters, scales, furniture, etc.\n" +
                "\n" +
                "(ii)  Expendable stores, e.g. shovels, machetes, paint brushes\n" +
                "(iii) Consumable stores, e.g. paint, soap, foodstuffs, stationery, etc.\n");
        Finance_Section section534 = new Finance_Section("Allocated Stores.","cat33","Allocated stores are stores, the cost of which is chargeable direct to, and remains a charge to, the sub-head of expenditure in which funds for their purchase are provided in the Estimates. These stores are taken on numerical charge and may be placed in an Allocated Stores or put into immediate use. They may be either purchased direct or obtained from the Unallocated Stores Stock.");
        Finance_Section section535 = new Finance_Section("Unallocated Stores.","cat33","Unallocated Stores are those purchased for general stock rather than for a particular work or service, for which the final vote of charge cannot be stated at the time of purchase. Their cost is debited to an Unallocated Stores sub-head in the Expenditure Estimates. They are held on charge by both value and unit and when issued for use are charged to the appropriate sub-head of expenditure as an Allocated Store, and the corresponding credit is posted to the Unallocated Stores sub-head.");
        Finance_Section section536 = new Finance_Section("Stores according to classifications.","cat33","Allocated and Unallocated Stores, should preferably be stored in separate premises. Where this is not possible, separate areas should be maintained within the store.");
        Finance_Section section537 = new Finance_Section("Establishment of Store.","cat33","All Accounting Officers procuring stores up to the value of N10,000.00 and above annually must establish and maintain a proper store.");
        Finance_Section section538 = new Finance_Section("Stores not to be kept by temporary employee.","cat33","Under no circumstance must a store, whether minor in value or otherwise, be kept by a temporary employee.");
        Finance_Section section539 = new Finance_Section("Store Officers to be trained.","cat33","All Officers keeping the various stores must be given adequate training in store-keeping in accordance with the laid down procedures in these Financial Regulations on stores.");







        Finance_Section section540 = new Finance_Section("Stores Ledger: Responsibility for maintenance","cat34","Every officer charged with responsibility as defined in Financial Regulations 35003 shall ensure that proper stores ledgers are maintained to record all receipts and issues from stores.");
        Finance_Section section541 = new Finance_Section("Stores Ledger: Method of use","cat34","A separate ledger shall be maintained for each item of stores. As far as possible, records of articles of the same group shall be kept in one ledger, and items should be arranged in alphabetical order. The unit of quantity shall be shown and articles shall be taken on charge in that unit. Separate folios shall be assigned to the various articles in stock and the description shall, in every case, agree with that of the tally card kept in the store. All stores ledgers must be clearly indexed.");
        Finance_Section section542 = new Finance_Section("Stores Ledgers: Control of pages.","cat34","(i)  All folios bound ledger shall be numbered consecutively. Sheets for loose-leaf binders should be controlled by register and issued against signature. The control register shall be maintained by a senior officer other than the Store-keeper, who shall be responsible either for ensuring that the loose-leaf sheets are properly and serially numbered on receipt from the printer, or for seeing that such sheets are numbered in his office, immediately on receipt, with a numbering stamp which he shall keep personally under lock and key. He shall also be responsible for issuing new sheets as required and recording in the control register the stores ledger folio number given to each on coming into use. Keys to loose-leaf ledgers and locking devices or card cabinets shall be kept personally by this officer.\n" +
                "\n" +
                "     (ii) Each sheet in use shall be given the same folio number on both sides and when a replacement sheet of any one item is inserted for one that is exhausted, the same folio number as the original shall be given, followed by the serial number in brackets e.g. 5(I) etc. Completed sheets when withdrawn from a loose-leaf ledger in current use shall be filed in numerical order in a separate binder.\n");
        Finance_Section section543 = new Finance_Section("Ledger Cards","cat34","In place of a bound or loose-leaf ledger, a system of controlled cards may be used. Control of cards should follow the procedure of loose-leaf sheets as shown in Financial Regulation 34003.\n" +
                "\n" +
                "     34005.  A new ledger shall not be opened until the old one is exhausted.\n");
        Finance_Section section544 = new Finance_Section("Stores Ledger: Replacement","cat34","The stores ledger or cards maintained in accordance with Financial Regulations 34002 and 34004 shall contain a complete record of the receipt and issue of all articles of Government property and stores, including livestock and bulk supply of petrol, but excluding consumable stores purchased for immediate use in accordance with Financial Regulation 37002 (ii). The ledgers shall be posted daily and every entry must be supported by a voucher, the number of which shall be recorded, against the entry (see Financial Regulation 37001). In the case of Unallocated Stores, the ledgers and vouchers shall record both quantity and value.");
        Finance_Section section545 = new Finance_Section("Unserviceable and obsolete Stores.","cat34","Unserviceable and obsolete stores shall be posted in a separate ledger.");
        Finance_Section section546 = new Finance_Section("Stores Ledger: Balance","cat34","Stores Ledgers shall be balanced at the end of each month and also when a Board of Survey is held or a stock verification takes place. Allocated stores shall be balanced when one officer hands over to another. Where a separate column for the purpose is provided in the stores ledger, the running balances shall be inserted after each transaction.");
        Finance_Section section547 = new Finance_Section("Stores Ledger: Carrying forward balances.","cat34","When the last line but one on any folio of a ledger has been entered, the receipts and issues shall be totaled and carried forward to a new folio. The completed folio and the new one shall be cross-referenced (see Financial Regulation 34003). When ledger cards are in use, and totals are carried forward, both cards shall be similarly cross-referenced.");
        Finance_Section section548 = new Finance_Section("Stores Ledger: End of Financial year","cat34",".  At the end of the financial year, a red line must be drawn immediately below the last entry on each page of the ledger, and totals obtained");
        Finance_Section section549 = new Finance_Section("Receipt and issues","cat34","Receipt and issue vouchers shall be numbered consecutively for each financial year and shall be filed in numerical order.");
        Finance_Section section550 = new Finance_Section("Receipt and issue cancellation","cat34",".  Should a receipt or issue voucher be cancelled, all copies except the last, which should remain in the book, shall be filed with the series to which they belong. Cancelled vouchers shall be clearly marked as such, and initialed by the responsible officer.");
        Finance_Section section551 = new Finance_Section("Conversion and Adjustment Vouchers.","cat34","Conversion and adjustment vouchers of any description shall be in separate series, consecutively numbered for each financial year, and filed in numerical order.");
        Finance_Section section552 = new Finance_Section("Stores Vouchers.","cat34","The number of the store ledger folio to which each item has been posted shall be recorded on all receipt, issue, or other vouchers. To prevent unauthorized additions on vouchers, a diagonal line shall be drawn immediately below the last entry and initialed by the officer raising the voucher");
        Finance_Section section553 = new Finance_Section("Bin/Tally Cards General.","cat34",".  A separate tally card must be kept for each item in the store to correspond with item recorded in the stores ledger. The relevant ledger folio shall be quoted on the bin/tally card. Tally cards must be kept in the bin with the article to which they refer, except that where this is impracticable, they may be kept in suitable cabinets or drawers, provided they are immediately available for entering and checking. All receipts and issues shall be recorded on the tally cards, which shall be posted from the vouchers immediately the stores are physically received or issued.");
        Finance_Section section554 = new Finance_Section("Tally Cards: Pre-posting prohibited","cat34","Posting of the tally card prior to receipt or issue is not permitted nor may entries be delayed until a full consignment is received or issued.");
        Finance_Section section555 = new Finance_Section("Tally Cards Entries","cat34","Entries on tally cards must be made in ink or indelible pencil and shall be initialed by the store-keeper. Cards must not be ruled off and the balance of stock on hand must be shown in the proper column. If circumstances permit, the tally card should be entered by an officer other than the officer responsible for posting stores ledgers.");
        Finance_Section section556 = new Finance_Section("Registers.","cat34","Registers should be kept to record the following:\n" +
                "\n" +
                "(i)\t All Short-landed, missing and damaged articles (claims Register, see Financial      Regulation 33006).\n" +
                "(ii)\t  Issue of Allocated Stores on loan and their return (see Financial Regulation 32003. \n" +
                "(iii)\t  All issue vouchers, showing the number, nature, requisitioning officer and date of acceptance, and return of the issue voucher signed by the consignee.\n" +
                "\n" +
                "     34019.  In addition to stores ledgers, inventories of non-expendable stores in use, such as office furniture, camp equipment, tools, machinery, etc. shall be maintained by each officer to whom such property has been issued. A duplicate copy of the inventory should be kept elsewhere in safe custody.\n");
        Finance_Section section557 = new Finance_Section("Erasures","cat34","Erasures may not be made in any stores ledger, receipt or issue voucher, or other stores accounting documents. Corrections must be made by striking out the erroneous entry in red ink and inserting the correct entry. Corrections in ledgers shall be initialed by the responsible officer. Corrections on issue vouchers shall be signed in full by both the officer who authorized the issue as well as the recipient of the stores. The recipient of the stores may not make any corrections on the issue voucher");
        Finance_Section section558 = new Finance_Section("Stores Documents Security.","cat34","All stores ledgers must be kept in safe custody as provided for in Financial Regulation");
        Finance_Section section559 = new Finance_Section("Specimen Forms.","cat34","Specimen forms of ledgers and vouchers are given in the Appendix. Ministries, Departments/Agencies whose stores require specialized documents may design such forms but are required to submit them to the Accountant-General and the Auditor-General for approval.\n" +
                "\n" +
                "     34023.  Accounting Officers are responsible for formulating a Store Code for the guidance of their officers dealing with stores. Such code or other accounting instruction must conform with the main principles laid down in Financial Regulations and must have the prior approval of the Commissioner for Finance. Although the principles in these stores instructions shall apply irrespective of whether a special sectional/departmental Stores Code has been issued, but if there is a conflict of detail, the Code shall prevail.\n");
        Finance_Section section560 = new Finance_Section("Unallocated Stores.","cat34","Further regulations concerning unallocated stores shall be found in Chapters 35 and 37.");


        Finance_Section section561 = new Finance_Section("Responsibility: General","cat35","Every Government officer is personally and pecuniarily responsible for government property under his control and/or in his custody.");
        Finance_Section section562 = new Finance_Section("Responsibility: Head of Department","cat35","Every Head of Department acting under his Accounting Officer, is responsible for the general supervision and control of stores and stores accounts of his section or department and for the due performance by his staff of their duties.");
        Finance_Section section563 = new Finance_Section("Responsibility: Branch Officer","cat35","Every officer in –charge of a branch, section, or station is responsible for the general supervision and control of the stores and stores accounts of his branch, section or station, and for the due performance by his staff of their duties.");
        Finance_Section section564 = new Finance_Section("Responsibility: Store-keepers.","cat35","The Store-keeper, or Officer in-charge of a store or section of a store who shall in each case be specifically nominated in writing is personally responsible for:\n" +
                "\n" +
                "(a)\t checking, handling and storage of stores received;\n" +
                "(b)\tcare of stores, including proper stacking and storage according to the nature of the stores with due observation of safety precautions;\n" +
                "(c)\tissue of stores supported by authorizing vouchers and ensuring such issues are checked and properly packed;\n" +
                "(d)\tprogression of stores issues so that items of old stock are issued before new stock (first in, first out);\n" +
                "(e)\tmaintenance of stocks within the prescribed maximum and minimum limits (economic order quantity);\n" +
                "(f)\tavoidance of waster of stores and irregular issues;\n" +
                "(g)\tperiodical verification of stock balances with tally cards and ledger balances, and for reporting any discrepancies revealed, including damaged or deteriorated stores, excess stores, or obsolete stores.\n");
        Finance_Section section565 = new Finance_Section("Responsibility of Store-keepers: Security and Maintenance of Stores","cat35",".  (i)  The Store-keeper, or Officer in-charge of a store, or section of a store, is personally responsible for:\n" +
                "\n" +
                "(a)\t the existence and observation of security regulations, which should include prevention of unauthorized access;\n" +
                "\n" +
                "(b)\tfrequent inspection of the store-room giving special attention to the prevention of illegal entry;\n" +
                "\n" +
                "(c)\tensuring that the store-room is clean and properly ventilated;\n" +
                "\n" +
                "(d)\treporting when the store-room is not in good condition.\n" +
                "\n" +
                "     (ii)  The Store-keeper, or Officer in-charge of a store, or section of a store, is required to be present when the storerooms are opened. He must also visit the storerooms daily. He is solely responsible for the keys and no delegation of the duties of locking up is permitted, except in the special circumstances which may require more than one officer to be specifically authorized, or when more than one lock is in use for security, all such officers being responsible in equal degree. In such circumstances, special instructions are required, which must be approved after consultation with the Auditor-General.\n");
        Finance_Section section566 = new Finance_Section("Inspections.","cat35","All stores are subject to the following inspections:\n" +
                "(a)\t Accounting Officers are responsible for appointing officers to inspect all stores within their divisions, whether at headquarters or elsewhere. These inspections should be carried out at least twice yearly at irregular intervals, and reports submitted:\n" +
                "(b)\tChief Stores Officers are responsible for appointing officers to inspect all unallocated stores under their control at least twice yearly at irregular intervals, and to submit reports:\n" +
                "(c)\tWhere Stock Verifiers are employed, they shall be responsible to the Internal Auditor (or the Accounting Officer where no Internal Audit section exists), for checking every item of stock at least once a year. Stock verifiers shall report all discrepancies and the existence of damaged or deteriorated stores and stores in excess of requirements (see Chapter 44):\n" +
                "(d)\tBoards of Survey, held annually or at such other times as may be necessary (see Chapter 44).\n");
        Finance_Section section567 = new Finance_Section("Inspections Reports.","cat35","(i) Reports of inspections arranged in conformity with Financial Regulations 35006 (a) and (b) shall provide the result of the following checks:\n" +
                "\n" +
                "(a)\t a test verification of the additions and subtractions in the store ledger and a test comparison of the ledger entries with receipt and issue voucher;\n" +
                "(b)\ta test comparison of the ledger balances with the actual stock and tally cards;\n" +
                "(c)\tan examination of the condition of the stock and manner of storage;\n" +
                "(d)\ta scrutiny of the books and registers in use, which should be up-to-date and the relevant vouchers properly filed;\n" +
                "(e)\tan examination of security measures, to include comment when stores or excess stores are held, together with any necessary recommendations.\n" +
                "     (ii)  Reports of Stock Verifiers and Boards of Survey shall be submitted in accordance with Financial Regulation 35006.\n");
        Finance_Section section568 = new Finance_Section("Plants and Tools.","cat35","Officers to whom plant and tools have been issued for current use, shall make periodical checks to ensure that no shortages exist. Any discrepancy should be reported to the Head of Sections/Departments");
        Finance_Section section569 = new Finance_Section("Fire Precautions.","cat35","All stores premises must have adequate fire fighting appliances provided, and maintained in a serviceable condition.");
        Finance_Section section570 = new Finance_Section("Loan from unallocated stores.","cat35","(ii)  Articles may be issued on loan from an Allocated Stores, but prior written approval must be obtained from the responsible officer.\n" +
                "\n" +
                "     35011.  Adequate number of watchmen should be employed whenever the stores are of sufficient importance and/or value.\n");
        Finance_Section section571 = new Finance_Section("Security.","cat35","35012. Store-keeper, or Officer in-charge of a store, or section of a store, in consultation where necessary with the Head of Internal Audit, shall be responsible for ensuring that secure arrangements are made for the safe custody of plant, equipment and any other property under their control");







        Finance_Section section572 = new Finance_Section("Derivation of  Stores.","cat36","Stores may be obtained in Nigeria by local purchase or by orders from overseas suppliers. All Ministries/Departments of the Government are required to purchase stores from Nigerian industries or firms in preference to placing orders for imported goods.");
        Finance_Section section573 = new Finance_Section("Local Purchase of Stores: Classification.","cat36","Stores which may be purchased in Nigeria are classified as follows:\n" +
                "(a)\t goods produced or manufactured in Nigeria (see Financial Regulation 36004).\n" +
                "(b)\tOther imported goods.\n");
        Finance_Section section574 = new Finance_Section("Local Purchase of Stores: Limitation.","cat36","Stores purchased in Nigeria, cost of which exceeds N50,000 must be obtained by contract after public tender, except as otherwise specifically authorized by the Commissioner for Finance. Circumvention of this Regulation must not be attempted by breaking a single order exceeding this limit into several orders for lesser amounts.");
        Finance_Section section575 = new Finance_Section("Local Purchase of Stores: Reputable Manufacturers","cat36","Goods referred to in Financial Regulation 36002 (a), the cost of which does not exceed N250,000 must be purchased from reputable manufacturers or their accredited agents. When goods are obtained through an agent, the purchasing officer shall satisfy himself that the goods are of authentic local origin.");
        Finance_Section section576 = new Finance_Section("Local Purchase of Stores: Authorizing Officer.","cat36","All local purchases of, or orders for stores must be authorized by the officer controlling expenditure, and the Local Purchase Order or indent must be signed by him and countersigned by the Head of Accounts of the Ministry, Department/Agency concerned. \n" +
                "\n" +
                "( i ) The Head of Accounts in each Ministry, Department/Agency should be responsible for keeping the Local Purchase Orders as he is the officer who would normally have the fullest knowledge of the position with regard to availability of funds.\n" +
                "\n" +
                "(ii)  Provided all the documents relating to the ordering of particular goods etc. are in order and certified to be so by the Internal Auditor, the supplier’s claims should be settled as soon as possible\n");
        Finance_Section section577 = new Finance_Section("Local Purchase of Stores: Preparation of Local Purchase Order.","cat36","(i)  Local Purchase Orders shall be prepared in four copies. The quantities shall be entered in words and figure, and the order shall be ruled off after the last item. The original and duplicate of the order shall be submitted to the supplier who shall return the original with the invoice or bill. When payment is made the original of the order together with the invoice or bill shall be attached to the payment voucher.\n" +
                "\n" +
                "     (ii)  The triplicate copy shall be sent to the Store-keeper if the goods are to be taken on charge. The fourth copy will be retained in the book.\n" +
                "\n" +
                "     (iii) Any alteration to the wordings on a Local Purchase Order must be signed by the officer authorizing the Order.   \n" +
                "\n");
        Finance_Section section578 = new Finance_Section("Local Purchase of Stores: Loss of Local Purchase Order.","cat36","(i)  If the original and/ or duplicate of a Local Purchase Order is lost before delivery of the goods and this fact has been brought to the knowledge of the issuing officer by the supplier. The issuing officer shall cancel the Local Purchase Order and immediately inform the supplier of cancellation. The triplicate copy of the order must be recovered from the store-keeper, replaced in the Order Book, and the triplicate and fourth copy suitably endorsed. A fresh Local Purchase Order may then be issued. A report should be made to the Head of Department and to the Accountant-General who shall arrange for a notice of loss to be published in the State’s Official Gazette. A copy of such a notice shall be forwarded to the Auditor-General.  \n" +
                "\n" +
                "     (ii) If a Local Purchase Order is lost after the goods have been delivered, the supplier may obtain payment after signing on the payment voucher, a form of indemnity protecting Government in the event of any other payment for the same delivery.\n");
        Finance_Section section579 = new Finance_Section("Local Purchase Order: Books to be treated as Security Document.","cat36","All unused and partly used Local Purchase Order books shall be kept under lock and key and suitable precautions shall be taken at all times to prevent them from getting into unauthorized hands.");
        Finance_Section section580 = new Finance_Section("Local Purchase of Stores: Tenders","cat36","Tenders invited in accordance with Financial Regulation 36003 shall be considered by Tenders Board (see Financial Regulation 42002). In the case of goods classed under Financial Regulation 36002 (a) if the conditions pertaining to quality and price are satisfied, and quantities can be supplied in full by the required delivery date, the Board shall recommend the award of the contract to the successful tenderer.");
        Finance_Section section581 = new Finance_Section("Order for Store: Preparation of indent","cat36","Orders for stores to be obtained through Overseas Agents shall be submitted to the Accountant-General in five copies. When the order has been approved and dispatched to Oversea Agents, the Accountant-General shall enter the number allocated to the order and return it to the ordering officer. Ministries which have been specifically authorized by the Accountant-General to submit orders direct to the Overseas Agents shall forward a copy to the Accountant-General except when such Ministries operate an approved Oversea Agents sub-account.");
        Finance_Section section582 = new Finance_Section("Order for Stores: References for Preparation. ","cat36","Officers preparing orders shall be guided by Financial Regulation 37007");
        Finance_Section section583 = new Finance_Section("Order for Stores: Accounting for charges.","cat36","(i)  The cost of marine insurance, Overseas Agents Commission and Inspection Charges and other associated fees shall be met from a vote for the purpose controlled by the Ministry of Finance or as otherwise provided.\n" +
                "     \n" +
                "     (ii) All associated cost and relevant taxes and fees shall be debited to the vote to which the indent is to be charged.\n");
        Finance_Section section584 = new Finance_Section("Order for Stores: General","cat36","In order that the cost of orders may be met within the financial year for which provision is made, the orders should be submitted as soon as practicable after the Estimates have been approved.");






        Finance_Section section585 = new Finance_Section("Payment voucher for Stores: Certificates","cat37","(i) On all payment vouchers for the purchase of stores, except as provided in sub-paragraph (ii) of this Regulation, the Store-keeper must certify that the stores have been received and taken on charge in the stores ledger and shall quote the stores receipt voucher number (see also Financial Regulation 34014).\n" +
                "\n" +
                "     (ii) Expendable and consumable stores obtained in small quantities for immediate use (i.e. not for stock) e.g. uniforms, soap, brooms, dusters, etc. should not be taken on charge in ledgers, but a certificate should be inserted in the payment voucher as follows: “Required for immediate use and not taken on Ledger Charge”\n");
        Finance_Section section586 = new Finance_Section("Invoice Control Register","cat37","The Accounts Section of every Ministry or Department/Agency shall maintain an Invoice Control Register to ensure that all imported Allocated Stores paid for, are duly taken on charge. This register shall provide columns for entries to show:\n" +
                "\n" +
                "(a)\tIndent No. and date (To be entered when indent is prepared).\n" +
                "(b)\tInvoice No. and date.\n" +
                "(c)\tValue of stores on invoice.\n" +
                "(d)\tImport Payment Voucher, date, number.\n" +
                "(e)\tDate invoiced stores taken on charge.\n" +
                "(f)\tStores Receipt Voucher Number.\n" +
                "\n" +
                "     The Register shall be examined periodically by a senior officer specifically designated to verify that the stores paid for have in fact been received.\n");
        Finance_Section section587 = new Finance_Section("Transfer of Stores.","cat37","When it is desired to transfer stores from one store to another, a Stores Transfer Requisition (Stores Form 12) shall be raised by the requisitioning stores in duplicate, the original of which shall be forwarded to the issuing store. The stores transferred shall be accompanied by a stores issued voucher (Stores Form 4) in duplicate, one copy of which shall be receipted and returned. The second copy shall serve as a receipt voucher and be numbered and filed");
        Finance_Section section588 = new Finance_Section("Receipt of imported Stores.","cat37","The Clearing Agent import stores through the post on behalf of a consignee, who should arrange for collection at the post office. Duty payable on such stores shall be paid by the consignee at the time of collection, and the duty is chargeable to the sub-head of expenditure provided for the purchase of the stores. Indents on the Overseas Agents concerned for stores to be sent by post should show the full postal address of the indentor and any reference to the Clearing Agent should be avoided.");
        Finance_Section section589 = new Finance_Section("Receipt of Local Stores.","cat37",". Stores received by rail, air, road, sea or by local purchase shall be checked against the consignment note and/or relative invoice and their correctness established as in Financial Regulations 37005 and 37009. Discrepancy and Breakage Reports shall be prepared for goods damaged or short delivered and claims for settlement made direct with relevant transporting agency.");
        Finance_Section section590 = new Finance_Section("Checking Stores: General","cat37","(i) All receipts into a store shall be checked against the relative document by the Store-keeper and another officer, except where the establishment of a sub-store provides for only one officer.\n" +
                "\n" +
                "     (ii)  Certain fragile stores which are specially packed to avoid damage in transit need not be opened for checking provided they are easily identifiable and are likely to be transferred elsewhere. Where however, the external packing shows signs of damage or pilferage, the contents must be checked.\n");










        Finance_Section section591 = new Finance_Section("Requisitions for Stores: Preparation.","cat38",". (i) Issues shall be made only on the authority of a numbered Stores Requisition, a numbered combined Requisition/Issue Voucher, or a Stores Transfer Requisition. In cases of issue of stock from unallocated stores, the Requisition, etc. must be signed by the officer authorized to incur expenditure, who must ensure that funds are available.\n" +
                "\n" +
                "     (ii) Requisitions shall be prepared in duplicate, the original of which should be sent to the stores issuing department. Quantities shall be written in both words and figures and each type of article required shall be given an item number. To prevent unauthorized additions, a line shall be drawn immediately below the last entry. The Requisition Forms shall be clearly marked original and duplicate.\n" +
                "\n" +
                "     (iii) When a combined Requisition/Issue Voucher is issued, three copies shall be sent to the stores issuing department and the original shall become the issue voucher. After issue of the stores, the original and one copy of the voucher should be sent to the Requisition Officer, who shall sign and return the original to the issuing officer, as acknowledgement.\n");
        Finance_Section section592 = new Finance_Section("Requisitions for Stores: Acceptance for issue","cat38","(i) A requisition shall not be accepted and passed to the store-keeper until it has been examined by the responsible officer, to ensure that it is signed by the authorized requisitioning officer, the correct rate of charge is quoted, the quantity required is not excessive, and the voucher is otherwise correct. Accounting Officers should furnish specimen signatures of authorized requisitioning officers to the stores issuing department.\n" +
                "\n" +
                "     (ii) Separate stores requisitions should be prepared for items of stores in different vocabulary groups. Stores issuing departments should furnish requisitioning officers with a stores vocabulary whenever necessary.\n" +
                "\n" +
                "     38003.  All issue of stores shall be supported by a Stores Issue Voucher in the prescribed form which shall be prepared in ink or indelible writing devices. Each line on the voucher must be utilized until the requisition is completely entered and there should not be any blank spaces between items. All amounts shall appear in words as well as in figures except where alternative safeguards against fraudulent additions have been specifically approved in accordance with Financial Regulation 34023. The voucher shall then be ruled-off and initialed. The issuing officer shall sign each voucher.\n");
        Finance_Section section593 = new Finance_Section("Stores Issue Voucher: Allocated Stores distribution.","cat38","Allocated Stores Issue Vouchers shall be prepared in triplicate, the original and duplicate of which shall be forwarded to the requisitioning officer who shall acknowledge receipt of stores by signing and returning the original to the issuing officer for filing. The duplicate shall be retained by the requisitioning officer as the Stores Receipt Voucher. Stores required for immediate use must be so endorsed on the original and duplicate copies by the requisitioning officer. ");
        Finance_Section section594 = new Finance_Section("Stores Issue Voucher: Unallocated Stores distribution.","cat38","Unallocated Stores Issue Vouchers shall be raised and distributed in accordance with the approved code or accounting instruction as stipulated in Financial Regulation 34023. The number of copies required must include, in addition to those enumerated in Financial Regulation 38004 an accounts copy, and a copy to support the Monthly Summary of Receipts and Issues.");
        Finance_Section section595 = new Finance_Section("Stores Issue Vouchers: Classification of Copies","cat38","All copies of Store Issue Vouchers must be clearly marked “Original” “Duplicate”, etc.");
        Finance_Section section596 = new Finance_Section("Issue of Stores Procedure.","cat38","(i) After a Stores Requisition has been accepted in accordance with Financial Regulations 38002 (i) and (ii), and the availability of the stores ascertained, the Stores Issue Voucher shall be prepared and sent to the store-keeper. The issuing storekeeper shall post his tally card at the actual time of issue of the stores, pre- or late posting is strictly forbidden.\n" +
                "\n" +
                "     (ii) Stores may only be issued by or in the presence of an authorized Issuing Officer.\n" +
                "\n" +
                "     (iii) Whenever the establishment of a store permits, the issuing storekeeper should not have access to the main store ledger or normally be aware of the ledger balances, except on handing over. (see Financial Regulation 41001). He may be informed, however, of specific balances if required for checking purposes.\n");
        Finance_Section section597 = new Finance_Section("Issue of Stores: Conversion Vouchers","cat38","Stores and materials issued within the same store for conversion or manufacture shall be supported by a conversion voucher in duplicate. The original copy shall serve as an issue voucher when the materials are issued from store and as a receipt voucher for the article after manufacture, when it is returned to store and brought on charge. Both receipt and issued sides of the voucher shall show the quantities and values where necessary.");
        Finance_Section section598 = new Finance_Section("Issue of stores: Write- off of condemned Stores.","cat38","(i) The Issue entry of stores condemned by a Board of Survey after approval has been given to write them off charge, shall be supported by a Store Issue Voucher quoting the authority.\n" +
                "\n" +
                "     (ii) Proceeds of sale of condemned stores shall be credited to Revenue Head: Earnings and Sales by Governments, Sub-head: Sales of Stores: General.\n");
        Finance_Section section599 = new Finance_Section("Issue of Stores: On Payment.","cat38","(i) Stores may be issued on payment only when the Accounting Officer is satisfied that such sales are in the public interest. Stores which are marked or stamped as government property may not be sold except when specifically authorized by the Commissioner of Finance.\n" +
                "\n" +
                "     (ii) The purchaser shall be required to pay, in addition to the gross cost (Allocated store) or current issue price (unallocated store), a percentage (10%) store charge. Any alteration in these charges must be approved by the Commissioner for Finance who shall inform the Auditor-General. Proceeds realized from these charges shall be credited to the appropriate sub-head under the Revenue Head: Earnings and Sales by Government Departments.\n" +
                "\n" +
                "     (iii) The purchaser should supply transport from the store of issue, but where this is not possible, the cost of transport from store to destination shall be paid by the purchaser.\n" +
                "\n" +
                "(iv)\tStores-on-payment issue shall be made by Stores Issue Voucher, but such stores shall not be released until the purchaser presents to the issuing officer, a Treasury Receipt for payment of the stores and all additional costs, including store and transport charges. The Treasury number shall be entered on the Store Issue Voucher.\n" +
                "\n" +
                "(v)\tIn exceptional cases, where credit facilities have been authorized by the Head of Section/Department to approved purchases, the Store Issue Voucher shall bear reference to the authority. Under no circumstance must credit facilities be made available to individuals or non-governmental bodies.\n");
        Finance_Section section600 = new Finance_Section("Issue of Stores: General.","cat38","Where permission is granted to use books for issue, instead of Stores Issue Vouchers, e.g. issue of petrol from pumps, the quantity or number of each item issued shall be entered in words and the recipient shall sign in full opposite the entry at the time he receives the stores.\n" +
                "\n" +
                "     38012. Regulations for each cash sales of manufactured articles from Workshops are given in Chapter 43.\n");




        Finance_Section section601 = new Finance_Section("Unused Stores: expendable or consumable.","cat39","Expendable or consumable stores which have been issued but not used shall be returned to store and taken on charge in the stores cost book at the current issue price. The vote for the work shall be credited by adjustment and the unallocated stores vote correspondingly debited.\n" +
                "\n" +
                "     39002. (i) Non-expendable stores which have been issued for, and charged to, a work vote, but not used, and if not required immediately on other works, shall be returned to the nearest allocated store and taken on numerical charge. The issue value will be credited by adjustment to the works vote with a corresponding debit to the appropriate vote for tools, plant or other non-expendable allocated store.\n" +
                "\n" +
                "     (ii) It is not necessary to return non-expendable stores to stock, if they are required immediately for other works. Financial adjustment should be made between the works votes concerned.\n");
        Finance_Section section602 = new Finance_Section("Completed Works:  Tools in use and recovered stores.","cat39","(i) Immediately after completion of works, officers in-charge shall ensure that all tools in use are returned to the nearest allocated stores. The receiving officer shall take the stores on numerical charge in a special ledger, and store separately. The entries in the ledger shall be supported by a stores issue voucher (Store Form 4) signed by the officer in-charge of works, who shall also record the returned stores in the Completion Report.\n" +
                "\n" +
                "     (ii) An exception to paragraph (i) above may be permitted in the case of large plant, which need not necessarily be returned to store on completion of the work, provided the location of such plant is shown in the Plant Register (see Financial Regulations 45010 and 45011).\n");
        Finance_Section section603 = new Finance_Section("Recovered Stores.","cat39","Recovered stores shall be treated in a similar manner to tools in use (see Financial Regulation 39003).");
        Finance_Section section604 = new Finance_Section("Unserviceable Used Parts.","cat39","Unserviceable used parts removed from plant and vehicles for replacement in the normal course of repair and overhaul shall be returned to a separate section of the store and a record made for submission to a Board of Survey, which should be held at frequent intervals.");
        Finance_Section section605 = new Finance_Section("Serviceable Used parts.","cat39","Serviceable parts becoming available on the dismantling of plants or vehicles, may only be removed after Board of Survey’s recommendations have been approved, and must be taken on charge in a special ledger.");









        Finance_Section section606 = new Finance_Section("Hospital Clothing and Bedding.","cat40","40001. Hospital clothing and bedding which have become unserviceable through fair wear and tear may be written off charge on the authority of a certificate signed by the officer-in-charge of the Hospital as follows:\n" +
                "\n" +
                "  “I hereby certify that I have personally inspected the under mentioned articles in ………………………………  Hospital which have become unserviceable through fair wear and tear and have been destroyed by………………..…………………………\n" +
                "                                                    ( method of destruction)\n");
        Finance_Section section607 = new Finance_Section("Purchase of Stationery.","cat40","     40002. (a) The regulations governing the acquisition of stores in Chapter 36 shall apply as a whole to the purchases of  all stationery. Where practicable, Ministries, Departments/Agencies may obtain stationery through the Government Printer.\n" +
                "      (b) Accounting Officers shall delegate to responsible officers, the duties of the safe custody, receipt and issue of stationery. The accounting records at each store shall include:\n" +
                "          (i)  Where main stocks are held for supply to branch offices, a stores ledger (Store Form 1) which shall show, for each category, the receipt into stock, issues to branch offices and the balance remaining in stock.\n" +
                "\n" +
                "          (ii)  For all branch offices where stocks are held, a Stationery Store Ledger (Store Form 20) which shall show, for each category, the receipt from the main stores, the issue to the various offices and the balance in stock.\n" +
                "\n" +
                "          (iii) Stores Receipt Vouchers or Receipted Issue Vouchers.\n" +
                "\n" +
                "          (iv) Daily Issue Book to record the detailed issues to offices.\n" +
                "\n" +
                "     (c)  All stocks of stationery shall be kept under lock and key and in charge of a responsible officer, who shall ensure that the ledger balances are checked periodically against physical stocks.\n");
        Finance_Section section608 = new Finance_Section("Issue of Stores Forms.","cat40","Stores forms in general use bear Store numbers and are issued under the authority of the Accountant-General. Stores Forms for special use may not be used without the authority of the Accountant-General, (see Appendix 9 for list of Store Forms).");













        Finance_Section section609 = new Finance_Section("General Procedure.","cat41","When an officer hands over custody of stores to another officer, he and the in-coming officer shall verify that the physical stocks and balances in the ledger and tally cards agree. If no discrepancies are found, both officers shall sign a certificate in duplicate to that effect on Stores Form 10, one copy of which shall be forwarded to the Accounting Officer of the Ministry, Department/Agency, and the other copy filed by the officer-in-charge. When due to the number of items, it is impracticable to check all stores, test check of a reasonable percentage of items in each group or class of stores must be made. Where test checks have of necessity, been made, the certificate shall be suitably endorsed");
        Finance_Section section610 = new Finance_Section("Discrepancies","cat41","Any excess and deficiencies and the values there of shall be listed, and signed by the out-going officer as an acknowledgement. The in-coming officer shall report the discrepancies to his senior officer, who shall obtain an explanation from the out-going officer. Receipt vouchers shall be prepared for excesses which shall be taken on charge in the usual manner. The officer-in-charge shall forward a report to his Head of Ministry, Department/Agency, who shall refer it with recommendations to the Board of Enquiry/ for decision with regard to deficiencies.");
        Finance_Section section611 = new Finance_Section("Absence of out-going Officer.","cat41","(i) If circumstances are such that the out-going officer is unable to be present at the time of hand-over, a Stock Verifier or Board of Survey shall be appointed to check and hand over stores.\n" +
                "\n" +
                "     (ii)  The in-coming officer shall be present throughout the check by the Store Verifier or Board of Survey and shall take over when completed. Stores Form 11 shall be prepared in duplicate, with a list of any discrepancies, and signed as the handing-over certificate. The Stock Verifier or Board of Survey shall distribute the certificate as stated in Financial Regulation 41001.\n");
        Finance_Section section612 = new Finance_Section("Responsibility for deficiencies","cat41","The out-going officer shall be responsible for all deficiencies reported at the time of handing-over and the in-coming officer shall be responsible for deficiencies not so reported but subsequently discovered. Where only a percentage check has been made and deficiencies in the items not checked are discovered subsequent to the completion of the handing over, all officers concerned shall be called upon for explanation.");
        Finance_Section section613 = new Finance_Section("Valuable and Attractive Store Register.","cat41","Senior Stores Officers responsible for supervision of stores shall ensure that a “Valuable and Attractive Stores Register” is maintained for items qualifying for this description. In every case of handing over, these items shall be subject to a hundred percent check and the certificate endorsed accordingly.\n" +
                "\n 41006.  The Handing-over of furniture in Government quarters is dealt with in the Civil Service Rules.\n");








        Finance_Section section614 = new Finance_Section("Services and works: to be put out to public tender.","cat42","(i) All the local purchase of stores are set out in Chapter 36 and subject to those conditions, all local purchase of stores costing over N250,000 and all works and services costing over N50,000 must be obtained by contract after public tender.\n" +
                "\n" +
                "     (ii)  Local Purchase of stores costing up to N250,000 and for works and services costing up to N50,000 may be arranged, subject to the approval of the responsible Commissioner, by Heads of Departments after obtaining quotations from all suitable sources. Contracts shall not be arranged piecemeal in order to keep within the limits authorized under these Regulations.\n" +
                "\n" +
                "     42002. Contracts for works, services and stores shall be considered and awarded by the following Tenders boards within limit determined by government from time to time for each category indicated:\n" +
                "\n" +
                "             Categories                                                             Value of Contracts Categories                                             Considered and awarded\n" +
                "\n" +
                "(a)\t State Tenders Board/State Executive Council …......Above N20, 000,000.00\n" +
                "(b)\tState Tenders Board/Governor.…………………………..Not exceeding N20,000,000.00\n" +
                "(c)\t Ministerial Tenders Board ……………………………………Not exceeding N1,000,000.00\n" +
                "(d)\tDepartmental/Corporations Tenders Board……………Not exceeding N750,000.00 \n" +
                "(e)\tHeads of Departments/Chief Executive……………………Not exceeding N250,000.00\n");
        Finance_Section section615 = new Finance_Section("Tenders Board: Composition of","cat42","STATE TENDERS BOARD\n" +
                "\n" +
                "42003. The State Tenders Board, whose composition shall be determined from time to time, shall be under the Chairmanship of the Deputy Governor or Secretary to the State Government.\n" +
                "\n" +
                "MINISTERIAL TENDERS BOARD\n" +
                "\n" +
                "42004. In addition to its Departmental/Corporations Tenders Board, provided for in Regulation 42005 below, in each of the following Ministries and Corporations has been empowered to establish a Ministerial Tenders Board. The Ministerial Tenders Board shall be presided over by the State Commissioner of the Ministry concerned. Other members of the Board shall include the Permanent Secretary, Heads of Department, and senior representatives of the Ministry of Finance and of the Ministry of Works and Housing.\n");
        Finance_Section section616 = new Finance_Section("Notices inviting tenders:","cat42","DEPARTMENTAL/CORPORATIONS TENDER BOARD\n" +
                "\n" +
                "     42005. The Ministerial, Departmental/Agency Tenders Board will be composed of the Permanent Secretary/Chief Executive who will be Chairman, and the Heads of Department of the Ministry/Agency.\n" +
                "\n" +
                "     42006. All notices inviting the submission of tenders shall be published in Ondo State of Nigeria Official Gazette, some newspapers (one local and one National), and Ondo State Government Official Website. There is no objection to copies of tender notices being published elsewhere (e.g. on a notice board in the Ministry, Department/Agency).\n" +
                "\n" +
                "     42007. Notices inviting the submission of tenders shall contain the following information:\n" +
                "\n" +
                "(i)\tThe name of the Ministry, Department/Agency  inviting the tender;\n" +
                "\n" +
                "(ii)\tA nature of the work,/service/goods required;\n" +
                "\n" +
                "(iii)\tA specification of the work/service/goods required, or a statement indicating when and where the specifications may be seen or obtained;\n" +
                "\n" +
                "(iv)\tThe designation and address of the officer to whom tenders are to be posted or delivered;\n" +
                "\n" +
                "(v)\tThe manner in which tenders are to be sealed and marked;\n" +
                "\n" +
                "(vi)\tThe place where, and the times between which, tenders may be delivered or deposited;\n" +
                "\n" +
                "(vii)\tThe closing time and date for the acceptance of tenders;\n" +
                "\n" +
                "(viii)\tA statement that the Board considering the tenders will not be bound to accept the lowest or any tender.\n" +
                "\n" +
                "(ix)\tAny other conditions that may be stipulated by the client Ministry, Department/Agency.\n" +
                "\n" +
                "     42008. The time allowed between the date which advertisement is placed and the closing date for the submission of tender shall not exceed twenty-one days except the nature of contract dictates otherwise.\n" +
                "\n" +
                "     42009. All officers are forbidden to accept tenders after the advertised closing time for the acceptance of tenders, no matter what reason for late submission may be offered by the persons wishing to submit late tenders.\n" +
                "\n" +
                "     42010. The provision of Regulation 42009 applies to tenders received through the mail after the hour advertised as closing time for the acceptance of tenders. In the event of a tender being received in the mail after the advertised closing time, the officer receiving the tender shall take actions as follows:\n");
        Finance_Section section617 = new Finance_Section("Period of Submission of Tender","cat42",")   If the envelope containing the tender bears the name and address of the person tendering the tender should be returned unopened to the sender by registered mail with a letter stating the time and date of receipt, and explaining that the tender cannot be accepted because of late arrival;\n" +
                "\n" +
                "     (ii)  If the tender does not bear the name and address of the sender, it should be retained unopened and submitted to the Board for directions as to disposal when the Board meets to consider the tenders received.\n");
        Finance_Section section618 = new Finance_Section("The time and date of receipt of late tenders should be recorded on the envelope.","cat42",". It may happen that a contractor will request, before the advertised closing time, an extension of time for the submission of a tender. Officers are forbidden to grant any extension of time for the submission of tender, no matter what reason is advanced in support of the request. If no contractor submits a tender in time, a fresh notice must be published.\n" +
                "\n" +
                "     42012. Tenders other than those submitted for the consideration of the State Tenders Board shall be retained in a security container, unopened, until such time as they are submitted to the Board concerned for consideration. They shall then be opened by the Chairman in the presence of the Board.\n");



        Finance_Section section619 = new Finance_Section("Extension of tender closing time on a tenderer’s request: prohibited.","cat42","Tenders submitted for the consideration of the State Tenders Board shall be opened, as soon as practicable after the advertised closing time, by a Tenders Opening Committee composed of appropriate officials chosen by the Secretary to the State Government, the Ministry of Finance and representatives of the Ministries, Departments/Agencies inviting the tender.");
        Finance_Section section620 = new Finance_Section("Security keeping of tender documents","cat42",". It is the duty of the members of the Tenders Opening Committee to:\n" +
                "\n" +
                "(a)\topen, at the appointed time. All tenders received on or before the advertised closing time;\n" +
                "\n" +
                "(b)\tcheck all the tenders received within time;\n" +
                "\n" +
                "(c)\tprepare a list showing, in respect of each such tender:\n" +
                "(i)\tthe name of the tenderer,\n" +
                "(ii)\tthe documents supporting the tender.\n");
        Finance_Section section621 = new Finance_Section("Duties of  Tenders opening Committee","cat42","The original of this list will be retained by the Secretary, State Tenders Board, the duplicate copy, together with the originals of the tenders and supporting documents, will be taken by the representatives of the Ministry/Department/Agency inviting the tenders so that the Department may scrutinize their tenders and prepare a brief upon them for the consideration of the State Tenders Board.\n" +
                "\n" +
                "(d)\t sign both copies of the list referred to in (c) and mark it with the date and time.\n");
        Finance_Section section622 = new Finance_Section("State Tender Board Meeting","cat42","A meeting of the State Tenders Board can be convened at the instance of the Chairman of the Board within a short notice.");
        Finance_Section section623 = new Finance_Section("Classification of contracts and Contractors","cat42","For the purpose of Civil Engineering, Building, Electrical and Supplies Contracts, contractors are classified into five categories (A-E) with values and fees payable as fixed from time to time by the government:\n" +
                "\n" +
                "                                                               Cost of Form and\n" +
                "No.  Category     Amount of Contract   Registration Fees          Renewal Fees\n" +
                "\n" +
                "                                  N             N                     \n" +
                "1.            A          50,000 – 250,000                 -                                           -\n" +
                "2.            B        250,001 -  500,000                -                                           -\n" +
                "3.            C        500,001 – 1,500,000             -                                           -\n" +
                "4.            D     1,500,001 – 3,000,000            -                                            -\n" +
                "5.            E     3,000,001 – and above            -                                           -      \n" +
                "\n" +
                "CONDITIONS FOR REGISTRATION – GENERAL\n" +
                "\n" +
                "CATEGORIES ‘A’ – ‘B’ \n" +
                "\n" +
                "     (i)   Payment of appropriate fees (non-refundable).\n" +
                "     (ii)  Tax Clearance for the past 3 years.\n" +
                "     (iii) Development Levy receipt for 3 years. \n" +
                "    (iv)  Certificate of Registration\n" +
                "    (v)   Business Premises\n" +
                "    (vi)  Two Passport Photographs\n");
        Finance_Section section624 = new Finance_Section("Eligibility of Contractors to Tender","cat42","CATEGORIES ‘C’ – ‘E’\n" +
                "(i)\t  Tax Clearance for the past 3 years\n" +
                "(ii)\tDevelopment Levy receipt for 3 years\n" +
                "(iii)\tPhotostat copy of the Credential of the Company Staff\n" +
                "(iv)\tCertificate of works already successfully executed and the contract award letter along with letter or certificate of completion\n" +
                "(v)\tSupporting document of on-going contracts\n" +
                "(vi)\tCertificate of Incorporation\n" +
                "(vii)\tBank letter of accreditation\n" +
                "(viii)\tDetails of plant and equipment to be certified by a registered professional\n" +
                "(ix)\tTwo passport photographs\n" +
                "(x)\tCompany profile\n");
        Finance_Section section625 = new Finance_Section("Negotiation Contracts.","cat42","Note:     The rates, conditions and requirements may be subject to review from time to time.\n" +
                "\n" +
                "     42017. Only those contractors whose names appear in the Register maintained by the Works Registration Board (Ministry of Works and Housing) are eligible to tender for Government contracts in the categories indicated in Regulation 42016. A contractor is classified in a category according to his financial and technical capacity after due verification by the Board.\n" +
                "\n" +
                "     42018. Any person or firm tendering for contract of N1,000,000 and below in value is required to deposit with the Board of Internal Revenue Office a non-refundable sum of N5,000.00 and when the contract is above N1,000,000.00 the tender fee shall be N10,000.00. On production to the responsible office of the department concerned of a receipt for this amount, he is given relevant contract documents and drawings. The payment is required as an evidence of serious intention\n");
        Finance_Section section626 = new Finance_Section("Auditor-General to be informed of all contractors.","cat42",". (a) In exceptional circumstances when a project is required to be undertaken as a matter of extreme urgency or when the work which is required is of a very specialized nature, the relevant Ministry, Department or Agency may, with the prior permission of the Chairman, State Tenders Board, negotiate a contract with the contractors who, is in its opinion, have the ability to carry out the work effectively. The terms of this contract are then to be submitted to the State Tenders’ Board for consideration. If the terms of the contract are approved by the State Tenders Board, the award is then to be made to the contractors concerned.");
        Finance_Section section627 = new Finance_Section("Sales of Government Property.","cat42","     (b)  It must be emphasized that this procedure is only to be followed in exceptional cases such as those calling for specialized skills which can be furnished only by a few contractors, and that normally all contracts are advertised in the Ondo State of Nigeria Official Gazette and tenders invited.\n" +
                "\n" +
                "     42020. All contracts must be completed in writing and must be in a form approved by the Solicitor-General. No payment may be made in respect of an alleged oral contract.\n" +
                "\n" +
                "     42021. The substance of all contracts must be communicated in writing to the Auditor-General, and whenever practicable (i.e. in all cases other than contracts requiring extensive documentation), a copy of the contract itself must be sent to him.\n" +
                "\n" +
                "\n" +
                "     42022. When Government property is offered for sale by public Tender, the same procedure as for works, etc. will be followed.\n" +
                "\n" +
                "     42023. (i) Departmental/Corporations Tenders Board records shall be made available from time to time to the Accounting Officer.\n" +
                "\n" +
                "     (ii) Minutes of all Tenders Board meetings as well as a list of contracts awarded by all Boards must be forwarded, from time to time, together with all necessary details and/or supporting papers to the Office of the Governor for his information and record and also to the Auditor-General.\n" +
                "\n" +
                "     (iii) The records in (ii) above shall be kept for a period of five years from the date of completion of the contract.\n");
        Finance_Section section628 = new Finance_Section("Minor Losses: Write-Off of.","cat42",". A loss of stores, plant, equipment, etc, may be written off under the personal authority of the Accounting Officer, provided that:\n" +
                "(a)\tTheir original cost or the estimated value, whichever is applicable, of a unit of each item does not exceed N10,000.00 and the sum total of the value of the item does not exceed N50,000.00.\n" +
                "(b)\tThere is no apparent weakness in the system of control.\n" +
                "(c)\tThere is no evidence of fraud or theft.\n" +
                "(d)\tWhere negligence is involved, the disciplinary action against the officer(s) found negligent is within the delegated powers of the Accounting Officer.\n");
        Finance_Section section629 = new Finance_Section("Procedure Action by officer in charge of stores.","cat42",". In the event of heavy loss of stores, the officer in charge in which the loss occurs, will:\n" +
                "\n" +
                "(a)\treport immediately to the Head of Department or Unit in writing without any delay.\n" +
                "\n" +
                "(b)\treport to the nearest Police Station if there is any possibility of fraud or theft.\n" +
                "\n" +
                "(c)\tinitiate action on Treasury Form 146, (see Appendix No. 7) complete Part 1 and forward the form in five copies to his Head of Department or Unit, without delay.\n" +
                "\n" +
                "(d)\tensure that, if a weakness in the system of control or in security is revealed, immediate measures are taken to prevent a recurrence of the loss.\n");



        Finance_Section section630 = new Finance_Section("Minor Losses: Write-Off of.","cat43","A loss of stores, plant, equipment, etc, may be written off under the personal authority of the Accounting Officer, provided that:\n" +
                "(a)\tTheir original cost or the estimated value, whichever is applicable, of a unit of each item does not exceed N10,000.00 and the sum total of the value of the item does not exceed N50,000.00.\n" +
                "(b)\tThere is no apparent weakness in the system of control.\n" +
                "(c)\tThere is no evidence of fraud or theft.\n" +
                "(d)\tWhere negligence is involved, the disciplinary action against the officer(s) found negligent is within the delegated powers of the Accounting Officer.\n");
        Finance_Section section631 = new Finance_Section("Procedure Action by officer in charge of stores.","cat43","In the event of heavy loss of stores, the officer in charge in which the loss occurs, will:\n" +
                "\n" +
                "(a)\treport immediately to the Head of Department or Unit in writing without any delay.\n" +
                "\n" +
                "(b)\treport to the nearest Police Station if there is any possibility of fraud or theft.\n" +
                "\n" +
                "(c)\tinitiate action on Treasury Form 146, (see Appendix No. 7) complete Part 1 and forward the form in five copies to his Head of Department or Unit, without delay.\n" +
                "\n" +
                "(d)\tensure that, if a weakness in the system of control or in security is revealed, immediate measures are taken to prevent a recurrence of the loss.\n");
        Finance_Section section632 = new Finance_Section("Action by Head of Department or Unit.","cat43","On being informed of the loss, the Head of Department or Unit will:\n" +
                "(a)\tforward immediately, by letter, brief details of the loss to his Accounting Officer.\n" +
                "(b)\tinvestigate the whole incident at the earliest possible time, complete Parts II and III of Treasury Form 146, and forward the forms in four copies to his Accounting Officer. If the investigations are liable to be protracted – submit the reports on Treasury Form 146 as soon as possible, and follow up with interim and final reports in letter form.\n" +
                "(c)\trecommend to his Accounting Officer, the convening of a Board of Enquiry, if he considers the circumstances warrant such an investigation (see Financial Regulation 43004).\n" +
                "(d)\tensure that, if a weakness in the system of control, or inadequate security is revealed, measures have been taken to prevent a recurrence of the loss.\n" +
                "(e)\tobtain copies of the Police report and/or Court Proceedings where appropriate, and forward four copies to his Accounting Officer.\n");
        Finance_Section section633 = new Finance_Section("Board of Enquiry: when to Convene","cat43","In considering whether a Board of Enquiry should be held, consideration should be given to the following:\n" +
                "(a)\tif fraud is involved;\n" +
                "(b)\tif the loss exceeds the amounts specified in Financial Regulation 43001 (a);\n" +
                "(c)\tif several officers are involved;\n" +
                "(d)\tif there is any doubt as to the degree of responsibility for the loss;\n" +
                "(e)\tif the loss occurred over a period of time.\n");
        Finance_Section section634 = new Finance_Section("Action by the Accounting Officer.","cat43",". On receipt of the reports of the loss, the Accounting Officer will:\n" +
                "(a)\tif the loss is minor one and falls under the categories of Financial Regulation 43001, examine the reports, take the appropriate disciplinary action, complete Part IV of the Treasury Form 146, and forward one copy of the form to the Head of Department or the appropriate accounting section, and send one copy of the form each to the Accountant-General, Ministry of Finance and to the Auditor-General. \n" +
                "\n" +
                "(b)\tIf the loss does not fall under Financial Regulation 43001, he will:\n" +
                "\n" +
                "(i)  If the loss is a substantial one, send immediately brief details of the loss by letter each to the Accountant-General, Ministry of Finance and to the Auditor-General.\n" +
                "\n" +
                "(ii) Request the convening of a Board of Enquiry if he considers the circumstances of the loss warrant such an investigation, (see Chapter 16 for procedure for convening of a Board of Enquiry, and Financial Regulation 43004 for examples when a Board must be convened).\n" +
                "\n" +
                "(iii) Request the interdiction from duty of the officer if he considers the circumstances of the loss warrant such disciplinary action.\n" +
                "\n" +
                "(iv)\tExamine the full circumstances of the loss and forward to the Accountant-General, Auditor-General, and Permanent Secretary, Civil Service Commission, by letter, together with the report on Treasury Form 146, and where appropriate, the supporting documents, including Police Reports and copy of court proceedings, his comments on the loss and, where appropriate, his recommendations for surcharge. Such comments and recommendation shall be distributed within three months.\n" +
                "     \n" +
                "     Note: If the investigations are likely to be protracted, or where the findings of the Board of Enquiry may not immediately be available, the forwarding of the reports on Treasury Form 146 must not be delayed, and in such circumstances, the Accounting Officer should forward the sets of reports to the addresses, immediately, with his initial comments, giving inter alia, details of the cause of delay. He should then follow up the case with interim and final reports in letter form to the above addresses to include any final recommendation for surcharge and any further Police Report or copy of Court Proceedings received by him.\n" +
                "\n" +
                "(v) Ensure that, if a weakness in the system of control or inadequate security is revealed, precautions have been taken to prevent a recurrence of the loss.\n" +
                "\n" +
                "(vi) Examine the findings of the Board of Enquiry when convened, and make a final report on the loss in his comments on the findings of the Board of Enquiry, and his recommendations for surcharge, where appropriate and then distribute the report to the officers as at (iv) above.\n" +
                "\n" +
                "(vii) Take all practicable measures to recover the loss and, if it seems likely that a civil action through the Court would be successful in recovering part or the whole of the loss, forward all supporting evidence to the Accounting-General with a request for presentation of the case to the Ministry of Justice. \n");
        Finance_Section section635 = new Finance_Section("Action by Accountant-General","cat43","On receipt of the report of the loss, the Accountant-General will:\n" +
                "\n" +
                "(a)\tEnsure that his nominee is a member of the Board of Enquiry.\n" +
                "(b)\tEnsure that the full procedure has been followed by the Ministry concerned.\n" +
                "(c)\tRequest the President, Permanent Board of Enquiry to convene a meeting, if necessary.\n" +
                "(d)\tRequest the President, Permanent Board of Enquiry to include any specific item in the terms of reference of the Board.\n" +
                "(e)\tEnsure that, if a weakness in the system of control or inadequate security is revealed, adequate measures have been taken to prevent a recurrence of the loss.\n" +
                "(f)\tEnsure that every practicable measure has been taken for recovery of the loss; and\n" +
                "(g)\tRecommend to the Permanent Secretary, Civil Service Commission, where appropriate, a surcharge against any officer involved in the loss, within 30 days.\n");
        Finance_Section section636 = new Finance_Section("Additional Procedures.","cat43","The provisions of Financial Regulations 16003 to 16010 inclusive relating to procedures for Secretary, Civil Service Commission, and losses involving State Officers, and the division of losses between the various Government Official(s), will apply as a whole to the loss of stores.");
        Finance_Section section637 = new Finance_Section("Loss of Stores: Power of Write-off.","cat43","The authority for the write-off of losses of stores is the prerogative of the Commissioner of Finance. A limited degree of this power of write-off is delegated to Accounting Officers under Financial Regulation 43001.");
        Finance_Section section638 = new Finance_Section("Write-off unserviceable store, etc.","cat43","Unserviceable stores, plants and equipment may be written off and disposed of under the personal authority of the Accounting Officer, provided that:\n" +
                "\n" +
                "(a)\tThe original cost or estimated value, whichever is applicable, does not exceed N20,000.00 in the case of general store, or N150,000.00 in the case of plants, motor vehicles and equipment, in any financial year.\n" +
                "(b)\tThe plants, motor vehicles or equipment have been surveyed and condemned by an independent Board of Survey. (see Financial Regulations 44002 and 44003 for procedure for the convening of a Board of survey).\n" +
                "(c)\tIf negligence of an officer is involved the disciplinary action (with or without surcharge) against the officer(s) found negligent is within the delegated powers of the Accounting Officers.\n" +
                "(d)\tThe Accounting Officer is of the option after taking advice from the appropriate technical officer, that the unserviceable articles are beyond economic repair. (see also Financial Regulations 43010 for disposal of expendable tools, and 43011 for disposal of machine parts).\n");
        Finance_Section section639 = new Finance_Section("Expendable Tools: Write-Off of.","cat43","Expendable tools, (see Financial Regulations 33002 and 45007) which become unserviceable through fair wear and tear may be written off charge of the Expendable. Tools Ledger on the authority of the Officer in charge of the Workshop or Unit, provided that he is on salary level 12 and above. (see Financial Regulation 45008 for the form of destruction certificate).");
        Finance_Section section640 = new Finance_Section("Used parts of plant or vehicles: Write-off of.","cat43","Used parts of plant and vehicles which have become unserviceable by fair wear and tear may be written off on the authority of the Accounting Officer, who will, in his discretion, authorize disposal by destruction or by sale by public auction or public tender. The vouchers covering the issue of replacement parts will be countersigned by a mechanical engineer.");
        Finance_Section section641 = new Finance_Section("Procedure: action by officer in charge.","cat43","It is the duty of the officer directly in charge of a store to segregate unserviceable articles and to report to his Head of Unit or Department on the circumstances leading to the stores being rendered unserviceable.");
        Finance_Section section642 = new Finance_Section("Procedure Head of Department or Unit","cat43","(a) It is the discretion of the Head of Department or Unit to decide whether the quantity of stores considered to be unserviceable is sufficient to justify the convening of a Special Board of Survey (see Chapter 44) or whether the articles should be held for inspection by the next periodical survey to be held under the provisions of Financial Regulation 44001. There must be no delay however, in the application for a Board of Survey for articles which have a residual value and which are liable to deteriorate rapidly, such as motor vehicle or items of furnishing, etc.\n" +
                "\n" +
                "     (b) The Head of Department or Unit will submit to the President of the Board of Survey, Treasury Form 147 (see Appendix 12) in five copies, together with Store Form 9 in five copies, duly completed with the details of the stores to be inspected. A separate set of forms must be submitted for those articles of store which fail to be dealt with under the provisions of Financial Regulation 43009.\n");
        Finance_Section section643 = new Finance_Section("Report by Board of Survey","cat43","The President of the Board of Survey will complete Part II of Treasury Form 147 and the certificate on the Store Form 9, then forward the reports in four copies through the President, Board of Enquiry, to the Accounting Officer.");
        Finance_Section section644 = new Finance_Section("Procedure Accounting Officer","cat43","On receipt of the reports on Treasury Form 147, the Accounting Officer will:\n" +
                "\n" +
                "(a)\tIf the unserviceable articles fall within the provisions of Financial Regulation 43009 examine the reports, take the appropriate disciplinary action, complete Part III of the Treasury Form 147 and forward one set to the Head of Department with his instructions for disposal of the unserviceable articles, one set to the Accountant-General, Ministry of Finance and one set to the Auditor-General.\n" +
                "(b)\tIf the unserviceable articles do not fall within the provisions of Financial Regulation 43009 examine the reports, complete Part IV and V of Treasury Form 147 and add his recommendations and distribute two sets of the forms to the Accountant-General, Ministry of Finance and one copy to the Auditor-General.\n");
        Finance_Section section645 = new Finance_Section("Procedure: Accountant General.","cat43","On receipt of the report on Treasury Form 147, the Accountant-General shall, if negligence is involved, forward one set of the forms to the Secretary, Civil Service Commission. The authority for the write-off and disposal of the stores shall be conveyed to the Accounting Officer by a completed Store Form 9 under cover of letter, a copy of which will be forwarded to the Auditor-General");
        Finance_Section section646 = new Finance_Section("Destruction of unserviceable Stores.","cat43","Unserviceable stores authorized to be destroyed must be mutilated as to render the articles unusable for their original purpose. The certificate of destruction, signed by at least two officers who witnessed the destruction, must be completed to include details of the quantities destroyed and the method of destruction used. The certificate shall be attached to the copy of the relative Treasury Form 147 in the possession of the Accounting Officer.");
        Finance_Section section647 = new Finance_Section("Disposal by Sale.","cat43","Accounting Officers shall make arrangements with the Ministry of Works and Housing or other Ministry or Department in which a full stores organization is available, for sale of the unserviceable and condemned stores by a licensed public auctioneer, or, where appropriate by public tender in accordance with Financial Regulation 42022.");
        Finance_Section section648 = new Finance_Section("Proceeds of sale by Public Auction or Public Tender","cat43","The officer in charge of the public auction or public tender will pay the net proceeds of the auction after the reduction of the auctioneer’s commission, or, alternatively the full proceeds of the tender, to the nearest Treasury Cash Office for classification to the appropriate Sub-head of the Miscellaneous Revenue Head, and he will inform the Accounting Office concerned of the details of the proceeds of sale and quote there reference and date of the relevant Treasury Receipt. The Accounting Officer will inform the Accountant-General, and the Auditor-General of the reference number, date and amount of the Treasury Receipt for the proceeds of the sales of articles disposed of under the authority of this Chapter.");
        Finance_Section section649 = new Finance_Section("Power of write-off of Unserviceable Stores, etc","cat43",". The authority for the write-off of stores, plant and equipment when condemned as unserviceable is the prerogative of the Commissioner for Finance. A limited degree of the power of write-off is delegated to Accounting Officers under Financial Regulations 43009 and 43010.");
        Finance_Section section650 = new Finance_Section("Constitution of Ministerial/Departmental Board of Survey.","cat43",". (i) Each Ministry, Department/Agency will set up a board of Survey for the boarding and disposal of its unserviceable stores, vehicles, plants and equipment, etc.\n" +
                "\n" +
                "     (ii) a Ministerial/Department Board of Survey shall consist of at least three members.\n" +
                "\n" +
                "(a)\tThe President who must be an officer not below salary Grade Level 15;\n" +
                "(b)\tThe Head of the accounts or his nominee;\n" +
                "(c)\tAny other Senior Officer.\n" +
                "\n" +
                "     (iii) The Transport Officer, Storekeeper(s) or other stores officials of the Ministry/Department shall not serve on the Board.\n");
        Finance_Section section651 = new Finance_Section("Estimated value of Stores, etc. Guidelines.","cat43","(i) For the purpose of arriving at the estimated value(s) of stores, motor vehicles, plants and equipment, the following guidelines are provided:\n" +
                "\n" +
                "(a)\tfor motor vehicle with engine capacity of 2000 c.c and below:\n" +
                "Under 1 year old, 20 per cent reduction on original cost.\n" +
                "Between 1 and 2 years old, 40 per cent reduction or original cost.\n" +
                "Between 2 and 3 years old, 60 per cent reduction on original cost.\n" +
                "Between 3 and 4 years old, 80 per cent reduction on original cost.\n" +
                "Between 4 and 5 years old, 90 per cent reduction on original cost.\n" +
                "5 years old and above, nominal value of not less that 5% of the original cost.\n" +
                "\n" +
                "(b)\tFor motor vehicle with engine capacity of over 2000 c.c.\n" +
                "Between 1 and 2 years old, 50 per cent reduction on original cost.\n" +
                "Between 2 and 3 years old, 65 per cent reduction on original cost.\n" +
                "Between 3 and 4 years old, 75 per cent reduction on original cost.\n" +
                "Between 4 and 5 years old, 85 per cent reduction on original cost.\n" +
                "Between 5 and 6 years old, 90 per cent reduction on original cost.\n" +
                "6 years and above – nominal value of not less than 5% of the original cost.\n" +
                "Construction vehicles over 7 tons can be depreciated by this method.\n" +
                "\n" +
                "(c)\tFor Plants and Equipment:\n" +
                "An Engineer’s estimated Value of the asset at the time of the write-off or disposal shall be obtained.\n" +
                "\n" +
                "(d)\tFor general stores, the estimated value shall be furnished by a Stock Verifier.\n" +
                "\n" +
                "     (ii) Before arriving at estimated final value of motor-vehicles Board of Survey should be properly constituted to ensure that there will always be a technically qualified member who will give competent advice to the Board on the valuation of the vehicles.\n");
        Finance_Section section652 = new Finance_Section("Memorandum record","cat43",". On the discovery of a loss of stores, a memorandum note in red ink will be made of the details of the deficiency in the relative Stores Ledger Account and Tally Card.");
        Finance_Section section653 = new Finance_Section("Application of Financial Regulations Chapter 16 on lost Stores and unserviceable Stores.","cat43",". The provisions of Financial Regulations 16011 and 16015 will apply as a whole to the write-off of stores lost and stores rendered unserviceable.\n" +
                "\n" +
                "    \n" +
                "\n" +
                "\n" +
                "      43025.  On receipt of the authority for the write-off of allocated stores an issue voucher will be raised to support the write-off entry to be made in the relative Stores Ledger Account and Tally Card, and the voucher entry in the ledger will be dully initialed by the officer in-charge of the store. A reference to the write-off authority will be written against the entry and included in the detail of the issue voucher.\n");
        Finance_Section section654 = new Finance_Section("Write-Off: Unallocated Stores.","cat43","The procedure for the write-off of Unallocated Stores shall be in accordance with Financial Regulation 43001.");






        Finance_Section section655 = new Finance_Section("Inspection of Stores at least once annually.","cat44","Government Stores shall be regularly inspected and reported upon by a Board of Survey or Stock Verifier, at least once a year. The Accounting Officer shall ensure that systematic inspections are made at irregular intervals and not at fixed or pre-determined dates. If the services of Stock Verifier are not available, the Accounting Officer shall apply for the appointment of a Board of Survey as stipulated in Financial Regulation 43021 (i).");
        Finance_Section section656 = new Finance_Section("Closure of Store during a Survey. Procedure: Programme of Inspection.\n","cat44","The Store shall be closed while a Board of Survey is being conducted and no issue shall be made without the sanction of the President; for issues thus sanctioned, the President shall countersign the stores issue vouchers.\n" +
                "\n" +
                "     44003. A Board of Survey shall be required to inspect a minimum of forty per cent of the stock categories but if a serious discrepancy is found or suspected, then a 100 per cent inspection must be made. Items selected for inspection must include all categories of stock, but especially those in general demand, of high value, or of the nature of attractive stores. A Stock Verifier shall be required to arrange a programme of inspection to cover the whole store at least once annually.\n");
        Finance_Section section657 = new Finance_Section("Procedure: Method of inspection.","cat44","44004. At the end of every stores inspection, the Store-keeper or Stores Officer shall sign the Survey sheets with or without comments and the following procedure shall be observed, in addition to any special check required, by the Board of Survey or the Stock Verifier:\n" +
                "\n" +
                "(a)\tInstruct the Store-keeper to make the accounting entries in the Stores ledger for all receipts and issues of stores up to the point of the closure of the Store.\n" +
                "(b)\tMake a physical count of the stock of each category inspected, examine each item for serviceability, and compare the physical stock count against the Tally Card balance and the Stock balance as shown on the relative Stores Ledger Account.\n" +
                "(c)\tSeek the explanation of the Officer in charge of the store for any deficiency and ensure that details of the deficiency are entered on the Stores Form 8.\n" +
                "(d)\tSeek the explanation of the Officer-in-charge of the store for items found unserviceable and ensure that details of the unserviceability and recommendations for disposal are entered on the Stores Form 9.\n" +
                "(e)\tExamine the receipt and issue vouchers prepared since the date of the last inspection and test check that they are properly recorded in the Stores Ledger.\n" +
                "(f)\tExamine the records of payments made for stores acquired since the last inspection and test check that purchases of stores have been properly taken on charge in the relative Stores Ledger account.\n" +
                "(g)\tInstruct the Store-keeper to prepare receipt vouchers to bring on charge on the Tally Card and in the Stores Ledger account any excess of stock found on inspection.\n" +
                "(h)\tInitial the entries in the Stores Ledger, and the relative Tally Card, or the taking on charge of the excesses.\n" +
                "(i)\tInitial the memorandum notes to be made, in red ink, in the Stores Ledger account and the relative Tally Card of the details of any deficiencies.\n" +
                "(j)\tComplete Store Forms 8 and 9 with recommendation as to the disposal of dormant and unserviceable stores (see Financial Regulation 44005 for distribution of the forms).\n");
        Finance_Section section658 = new Finance_Section("Report of the Board or Stock Verifier.","cat44","The President of the Board (or Stock Verifier) shall submit a report in four copies, together with Store Forms 8 and 9, also in four copies, to the Accounting Officer. The report shall contain, among others, the following:\n" +
                "\n" +
                "(a)\tA reference to the lists of items found deficient, obsolete, unserviceable or surplus to requirements.\n" +
                "(b)\tAn opinion as to the responsibility of the Store-keeper and/or Officer-in-charge of the store for the general state of the store and, in particular to the deficiencies, and to the obsolete and unserviceable items.\n" +
                "(c)\tAn opinion as to the adequacy and condition of the stores accommodation, security arrangements, and fire fighting appliances.\n" +
                "\n");
        Finance_Section section659 = new Finance_Section("Action on the report","cat44","The reports of the Board or Stock Verifier involving a loss of stores, or the unserviceability of stores shall be dealt with in accordance with the provisions of Chapter 43.");







        Finance_Section section660 = new Finance_Section("General","cat45","The provisions of Chapter 33 to 41 concern the accounting for, security of, and the receipt and issue of stores, before issue, whilst the provisions of this Chapter concern the control of certain classes of stores after issue.");
        Finance_Section section661 = new Finance_Section("Tools: Non -expendable: Definition of.","cat45","The provisions of this Section will apply to all hand tools and tools for machines, excepting those which cannot be considered to have a specific life assigned to them e.g. back saw blades, files, etc.");
        Finance_Section section662 = new Finance_Section("Tools Ledger: Non-expendable.","cat45","The receipt of non-expendable tools from Main Store or from direct purchase or from transfer, and their return to Main Store shall be recorded in a separate non-Expendable Tools Ledger to be maintained by the officer in-charge of the Workshop or Unit. The officer in-charge shall also maintain subsidiary or inventory records to show the issue and return of tools to and from individuals. The supervising officers will make periodical checks to ensure that the correct numbers of tools are on hand and that they are in good serviceable condition.");
        Finance_Section section663 = new Finance_Section("Write-off. Non-Expendable Tools: Unserviceable.","cat45","Non-expendable Tools which have become unserviceable will remain on charge in the Tools Ledger pending examination by a Board of Survey and authority for disposal and write-off to be given under the provisions of Chapter 43.");
        Finance_Section section664 = new Finance_Section("Write-off non-expendable Tools lost.","cat45","Non-expendable tools which have been lost will remain on ledger charge in the Tools Ledger and will be the liability of the officer in-charge, pending the examination of the loss under the provisions of Chapter 43.");
        Finance_Section section665 = new Finance_Section("Tools Ledger.","cat45","The receipt of expendable tools (i.e. those which are not considered to have specific life assigned to them) will be recorded in a separate Expendable Tools Ledger to be maintained by the officer in-charge of the Workshop or Unit.");
        Finance_Section section666 = new Finance_Section("Write-off. Unserviceable tools.","cat45","Expendable tools which have become unserviceable through fair wear and tear may be written-off charge in the Expendable Tools Ledger without an examination by a Board of Survey (see Financial Regulation 43010).");
        Finance_Section section667 = new Finance_Section("Replacement of.","cat45","When replacement of expendable tools destroyed is required, the original of the destruction certificate in the following form shall be forwarded to the issuing store in support of the demand:\n" +
                "\n" +
                "     ‘Certify that I have personally inspected the undermentioned expendable tools issued to me which have become unserviceable through fair wear and tear and have been destroyed by (quote method of destruction)\n");



        Finance_Section section668 = new Finance_Section("Definition. Plant","cat45","The term plant includes both fixed and movable items, such as machines, engines, boilers, etc.");
        Finance_Section section669 = new Finance_Section("Registration of. ","cat45","Every item of plant will be numbered in a series to be recorded in register form at the headquarters of a Ministry/Department concerned at the time of acquisition and issue of the plant. The appropriate series and number will be painted or stamped on the equipment.");
        Finance_Section section670 = new Finance_Section("Plant Ledger.","cat45","The receipt of plant will be recorded in a Plant Ledger to be maintained by the officer in-charge of the Workshop or Unit, and for fixed plant, the record must show the location of the plant in use.");
        Finance_Section section671 = new Finance_Section("Inventory of accessories.","cat45",". Inventory on Stores Form 15 will be maintained by the officer in-charge of plant to record the accessories, spares and tools carried with plant equipment.");
        Finance_Section section672 = new Finance_Section("Log Book.","cat45","Officers in-charge of plant will maintain a plant log book for each item of equipment to record the plant history of repairs, overhauls, spare parts consumed, details of periodical maintenance, servicing and details of the fuel and oil consumption.");
        Finance_Section section673 = new Finance_Section("Write-off","cat45","Plant which has become unserviceable or lost will remain on charge in the plant Ledger pending examination by a Board of Survey or Board of Enquiry and the authority for disposal and write-off is given under the provisions of Chapter 43.");
        Finance_Section section674 = new Finance_Section("Source of Supply  FURNITURE AND EQUIPMENT ISSUED TO OFFICES AND HOUSES","cat45","Furniture and equipment for Government residential quarters and public buildings will normally be obtained from the Ministry of Works and Housing. However, Ministries and non-Ministerial Departments may, on their own, furnish and equip their offices.");
        Finance_Section section675 = new Finance_Section("Furniture Ledger","cat45","The receipt from Stores or direct purchase and equipment for an office or other Government building and returns to Store will, be recorded in a Furniture Ledger to be maintained by the officer in-charge of the building.");
        Finance_Section section676 = new Finance_Section("Master Inventory Record.","cat45","The distribution of furniture and equipment within a building will be recorded in a Master Inventory Record to be maintained by the Office Manager or officer in-charge to show the location of the furniture and equipment and he will ensure that the total of each type so distributed agrees with the balance on the relative Furniture Ledger folio.");
        Finance_Section section677 = new Finance_Section("Furniture Inventory Board","cat45","The officer in-charge of the building will ensure that a Furniture Inventory Board (Store Form 15), is displayed in each room or office to record the distribution of furniture and equipment to each room or group of rooms. He will make periodical checks, at least once quarterly, to ensure that the correct numbers of furniture and equipment are in its original place and that they are in good serviceable condition. He will ensure that all items found surplus are immediately taken on inventory and master inventory charge.");
        Finance_Section section678 = new Finance_Section("Master Inventor of Furniture  issued to quarters","cat45","The officer in-charge of Government quarters in an area will maintain in Master Inventory Record to show the location of all Government furniture on issue to quarters, etc, and will issue a Furniture Inventory Board (Stores Form 15) to record the furniture and equipment on issue to each quarter. Inventories will be checked in full detail on a change of occupant.");
        Finance_Section section679 = new Finance_Section("Registration of equipment","cat45","Every typewriter, electrical or gas cooker, refrigerator, water heater, fan, etc. will be numbered in a series to be recorded in register form by the Officer in-charge of the store of issue. The appropriate series and number will be painted or stamped on the equipment.");



        Finance_Section section680 = new Finance_Section("Purpose of.","cat46","The purpose of an Unallocated Store is to acquire stores of a standard design and in constant demand, and to hold minimum stocks thereof to facilitate their immediate availability when required for a project or service, and to allow the vote of the relative project or service to be charged with the value of the stores when issued.");
        Finance_Section section681 = new Finance_Section("Maximum holding","cat46","The maximum limit of the value of the stores which may be held in stock at any one time shall be determined by each MDA based on need.");
        Finance_Section section682 = new Finance_Section("Application of Financial Regulations.","cat46","The provisions of Chapters 33 to 43 concerning Requisitions, Security, Issue, Return, Handing Over, Acquisition and Losses will apply the same way to Unallocated Stores.");
        Finance_Section section683 = new Finance_Section("Vote to be charged","cat46","The cost of stores purchased to replenish standard stocks, and stores imported and handled by an Unallocated Stores organization for a specific work or service, will normally be charged initially to the Unallocated Stores sub-head of the current Estimates, under the item of ‘Purchases of Stores’.");
        Finance_Section section684 = new Finance_Section("Local Purchases for specific project or service.","cat46","\n" +
                "     46005. The cost of stores purchased locally for specific projects or service will normally be charged direct to the relative vote of the project or service.\n");
        Finance_Section section685 = new Finance_Section("Cost of Stores","cat46","The cost of unallocated stores for accounting purposes will be:\n" +
                "\n" +
                "(a)\tFor imported store – the invoice price (fob), ocean freight, inspection fees, marine insurance and customs duty.\n" +
                "(b)\tFor stores purchased locally – the full purchase price, less discount, if any.\n");
        Finance_Section section686 = new Finance_Section("Fixed price method.","cat46",". When stores are received each category will be separately taken on charge in quantity and value. The value at which stores will be taken on charge will be ascertained by the officer in-charge of the Stores by determining a unit price for each category approximate to the average of the value of the items in stock and the known or estimated price of the stores to be taken on charge. This unit price will remain as a fixed or catalogue price until a variation of the cost of a replacement purchase demands a revision of the rate.");
        Finance_Section section687 = new Finance_Section("Last Known price method","cat46",". As an alternative system to the fixed price method, and when approved specifically by the Ministry of Finance, the articles may be taken on charge at the last known price when details of the full landed costs are not immediately available.");
        Finance_Section section688 = new Finance_Section("Minimum Record ","cat46","The Head of Account of the Ministry, Department or Agency will ensure that the following records are maintained as a minimum:\n" +
                "(a)\tPurchase Journal (or Stores Cost Book),\n" +
                "(b)\tIssue Journal (or Stores Issue Summary),\n" +
                "(c)\tStores Ledger, to include an account for each category of store, and a separate account for:\n" +
                "(i)   Shortfalls and Excesses (or Price Adjustments),\n" +
                "(ii)   Claims,\n");
        Finance_Section section689 = new Finance_Section("Purchase Journal","cat46","The Purchase Journal (or Store Cost Book) will be the prime entry record for the taking on charge of the stores received and will normally be a manually-written record in columnar form conveniently divided to facilitate:\n" +
                "(a)\tThe reconciliation between the prime entries for stores received with the accounting entries in the Abstract.\n" +
                "(b)\tThe reconciliation between the prime entries for the costs of stores received with the values taken on charge at the fixed or predetermined rate.\n" +
                "(c)\tThe reconciliation and agreement of the total posting and balances remaining on the various stores accounts.\n" +
                "(d)\tThe periodical computation of the total of the differences between the actual costs and the fixed prices.\n" +
                "(e)\tThe recording of the values for goods imported when short-landed or damaged and the subject of a claim on the carrier or supplier.\n" +
                "(f)\tThe recording of the revaluations of stocks on hand upon the change of a fixed price.\n");
        Finance_Section section690 = new Finance_Section("Journal or Stores Issues Summary.","cat46",". The Issue Journal or Stores Issues Summary will provide a summary and a monthly total of the values of issues of stores computed at the prevailing fixed price. Copies of the Stores Issues Summary, in triplicate, together with supporting copy stores issue vouchers, when required, will be forwarded monthly in the form of Materials Expenses Statement to the Head of Account of the Ministry controlling the Stores by a date to be prescribed by the Accounting Officer. The Head of Account will incorporate into the Abstract Record the total of the issues to the credit of the unallocated stores sub-head of Expenditure item “Issues of Stores,” and charge the value of the issues to the relative votes of the project of service for which the stores were drawn, (see Financial Regulation 03007).");
        Finance_Section section691 = new Finance_Section("Shortfalls and Excesses Account.","cat46","The Shortfalls and Excesses Account (or Price Adjustment Account) will be utilized only for the following purposes:\n" +
                "\n" +
                "(a)\tTo accommodate the differences between the actual costs and the fixed prices of issues.\n" +
                "(b)\tTo accommodate the value of stores found surplus.\n" +
                "(c)\tTo accommodate the value of minor discrepancies of stores and goods short-landed or damaged when written-off store ledger charge by Accounting Officer under the authority of Financial Regulations 43001 and 43005 (a).\n" +
                "(d)\tTo accommodate the value of unserviceable stores written-off store ledger charge by the authority of the Accounting Officer under the provisions of Financial Regulation 43009.\n" +
                "(e)\tTo accommodate the increase or decrease in the valuation of stocks on a change of fixed price.\n");
        Finance_Section section692 = new Finance_Section("Clearance of excess balances on the Shortfalls and on Excesses Account.","cat46","A credit balance remaining at the end of a financial year on the Shortfalls and Excesses or Price Adjustment Account will be abandoned, and no accounting entry will be passed through the Abstract. If the account runs into a debit balance near to the end of the financial year, or earlier, if the debit is excessive, the officer in-charge of the store shall fully investigate the cause and, if appropriate, make the necessary amendments to the fixed prices.");
        Finance_Section section693 = new Finance_Section("Store Charges","cat46",". Store Charges will be raised only when stores are issued on repayment to another Government, Corporation or in exceptional circumstances on repayment to a Government Official or to the Public. The element of store charge will be shown as an addition to the issue of fixed price, and will be classified direct to the appropriate Head of Revenue.");
        Finance_Section section694 = new Finance_Section("Claims for short landings or good damaged","cat46","The value of imported stores received in a damaged condition from, or short-landed by, the carrier, will be recorded in the Purchase Journal (or Stores Cost Book) and taken on charge in the appropriate Claims section. Details of the loss will be entered in a Claims Register and the claim against the carrier or supplier will be passed to the Government Agent by the officer in-charge of the stores. The claim must be made immediately and within the prescribed time limit. The receipt of a settlement of a claim will be recorded in the Purchase Journal and the appropriate record will be made in the Claims Register. The Stores Charges Account will reflect the periodical totals of the value of the claims made, settled or written-off and the balance of the values of claims outstanding, (see end of Chapter for pro-forma for annual statement).");
        Finance_Section section695 = new Finance_Section("Claim: when not to be made","cat46",". A claim will not normally be made when the value of the short landed or damaged store does not exceed N10,000.00");

        Finance_Section section696 = new Finance_Section("Claim: Write off.","cat46","Unsettled claims will be abandoned and written-off in accordance with the provisions of Chapter 43. A claim abandoned under the authority of the Accounting Officer, (Financial Regulation 43005 (b) (1), may be charged against the Shortfalls and Excesses Account (or Price Adjustment Account) if the balance on the account is sufficient to absorb the loss. In all other instances the losses will be transferred, when funds are made available, to the separate sub-head of Expenditure ‘Unallocated Stores Deficiencies’, by a transfer adjustment as an expenditure credit to the item of ‘Purchases’.");
        Finance_Section section697 = new Finance_Section("Annual balance statements","cat46","As soon as possible after the end of a financial year, or not later than a date to be prescribed by the Accountant-General an Annual Balance Statement and Reconciliation Accounts (see end of Chapter for pro-forma), will be prepared to be signed by the Head of Account and submitted by the Accounting Officer to the Accountant-General and the Auditor-General.");
        Finance_Section section698 = new Finance_Section("Stock Verification","cat46","The provisions of Chapter 44 concerning Boards of Survey and Inspections of Stores, and Financial Regulations 30003 and 35006 concerning the responsibility of Stock Verifiers and Internal Auditors, will apply.");
        Finance_Section section699 = new Finance_Section("Losses of Stores and unserviceable Stores.","cat46","The provisions of Chapter 43, concerning losses of Stores will apply.");


        Finance_Section section700 = new Finance_Section("General consideration","cat47","This chapter should guide State government contracts subject to the enactment of a Public Procurement Law (PPL). The chapter is a further strengthening of Chapters 36 and 42 and the provisions of the most current Ondo State Budget Implementation Guide. Government contracts are made in accordance with the ordinary law of contract through offer by one party and acceptance by the other. The main distinction between government contract and commercial undertaking is that, while an outside body can freely choose the suppliers to deal with, an MDA is accountable for disbursement of public funds and obliged to consider all qualified firms claims.");
        Finance_Section section701 = new Finance_Section("BIG: As a guide ","cat47","The state Public Procurement Law (PPL) when enacted shall provide further detailed requirements and guidelines for procurement contract in respect of commodities (goods and services) across MDAs. This chapter therefore should be read alongside Chapters 36 and 42 as well as the most current Ondo State Budget Implementation Guide (BIG).");
        Finance_Section section702 = new Finance_Section("Scope","cat47","This rule applies to all procurements made by all Ministries, Departments and Agencies (MDAs) of government that derive at least 35% of their operational funds through the State Appropriation Law.  \n" +
                "\n" +
                "47004. Pursuant to sub-section above (47003), all procurement plans must be supported by prior budgeted appropriation as proof of availability of funds. In other words payments that are not provided for in the annual estimates shall not be accepted. \n");
        Finance_Section section703 = new Finance_Section("Eligibility proof","cat47","All bidders in a contract must show proof of eligibility for the award of the contract by proving that: \n" +
                "a.\tThey possess the necessary technical qualifications;\n" +
                "b.\tThey possess the machinery, equipment and manpower for the job;\n" +
                "c.\tThey have the legal capacity to enter into the contract i.e. they are neither under a receivership nor insolvent;\n" +
                "d.\tThey are not tax evaders and avoiders; and \n" +
                "e.\tNone of their director(s) have been convicted in respect of any offence/crime involving frau or financial misappropriation of record falsification.\n");
        Finance_Section section704 = new Finance_Section("Bids disqualification and filing ","cat47","Any bidder who breach the provisions of section 47005 above or whose bids do not meet the tenders requirements shall be automatically disqualified and their bids withdrawn.  Notice of disqualified bids shall be conveyed to the Due process office with reasons given while all procurement proceeding made in a fiscal year shall be properly recorded in files and electronic records for at least ten (10) years.");
        Finance_Section section705 = new Finance_Section("Early stage consultation conditions ","cat47","Accounting officers shall inform the Ministry of Finance and the office of the Accountant General of the State as early as possible in the negotiation of contract under any of the following conditions:\n" +
                "a.\tWhere the price or consideration is to be denominated in a currency other than the Naira;\n" +
                "b.\tWhere a foreign currency exchange guarantee is involved; and\n" +
                "c.\tWhere the provisions are to specify a substantial programme of deferred payments extending beyond the end of the fiscal year in which the contract is to be executed.\n");
        Finance_Section section706 = new Finance_Section("Goods, works and services procurement ","cat47","The following provisions and guidelines apply strictly to procurement of goods, works and services which fall within the monetary thresholds prescribed in 42002.");
        Finance_Section section707 = new Finance_Section("Open Competitive Bidding ","cat47",". Except in special cases where other methods of procurements are inevitable, all procurement of goods, works and services shall be by way of Open Competitive Bidding (OCB) by which is meant that all contractors/suppliers shall be subjected to the same level playing field or equal chance of being chosen. The format for submission and all pre-determined criteria for evaluation including the deadline shall not vary from one contract/supplier to another but rather be the same. The lowest responsive bid shall be the winning bid. \n" +
                "\n" +
                "47010. All bids shall be in writing and in the format stipulated in the bid documents and shall be signed by an official who is authorized to bind the bidder to contract.\n");
        Finance_Section section708 = new Finance_Section("Tender consideration","cat47","No contract work involving construction shall be considered by Tender Board unless:\n" +
                "a.\tThe land has been acquired, and the topographical map(s) including soil text or Environmental Impact Assessment (EIA) done except where it is certified by an Architect that it is not necessary and approved by the appropriate authority. Documents relating to the survey maps, EIA, or certificate of exemption by an Architect should form part of contract documents to be presented to the Tenders Board. \n" +
                "b.\tThe design of the building, road, etc relating to (a) above is broken into:\n" +
                "i.\tArchitectural Design\n" +
                "ii.\tStructural Design \n" +
                "iii.\tElectrical Design \n" +
                "iv.\tMechanical design \n" +
                "v.\tBills of Quantities \n" +
                "c.\tTechnical details of the project shall be made available to the Board for proper costing. \n" +
                "\n" +
                "47012. (i) Subject to any regulations that may be prescribed from time to time, a procuring entity (an MDA) may grant a mobilization fee which shall not exceed fifteen per cent (15%) of the contract price. Such payment shall be supported by in case of Open competitive Bidding a guarantee issued by a reputable Bank or Insurance company. \n" +
                "\n" +
                "(ii) No further payments shall be made to a contractor/supplier who has been paid mobilization fee except on the strength of an interim performance certificate or report issued in accordance with the agreement of the contract. \n");
        Finance_Section section709 = new Finance_Section("Interest on delayed payment","cat47","Payment for the procurement of goods, works or services shall be settled promptly and diligently. Any payment due for more than sixty (60) days from the date of submission of invoice, valuation certificate or confirmation or authentication by an MDA, shall be deemed to be a delayed payment and shall hence attract interest at the rate specified in the contract agreement.");
        Finance_Section section710 = new Finance_Section("Special bidding methods distinguished","cat47","Apart from open competitive bidding process treated under part II of this chapter, there are provisions for other procurement methods and the conditions for their usage. These conditions serve as in-built controls to safe guard against breaches and abuses. They include :\n" +
                "1.\tTwo-Stage Bidding \n" +
                "2.\tRestrictive Bidding \n" +
                "3.\tDirect Procurement \n" +
                "4.\tEmergency procurement \n" +
                "5.\tRequest for Quotations \n");
        Finance_Section section711 = new Finance_Section("Two-Stage General principles to apply","cat47","Two-Stage Bidding: In this process, the contractor shall be appointed on the basis of a first stage tender which determines the level of overhead and profit for each contractor. The contractor then works with the project team during the second stage to develop the designs and establish detailed costings for separate project work elements. This method shall be used in the following circumstances:\n" +
                "i.\tWhere the formulation of ‘detailed specifications’ for the good or works is not possible or where the characteristics of the services requires multi-faceted means to gain satisfaction.\n" +
                "ii.\tWhere the character of the goods or works are subject to rapid technological advances\n" +
                "iii.\twhere the procuring entity seeks to enter into a contract for research, experiment, study or development costs\n" +
                "iv.\tWhere the procurement is concerned with state security \n" +
                "v.\tWhere initial tender process was not successful and a new process would produce similar result. \n");
        Finance_Section section712 = new Finance_Section("Restrictive Tendering conditions ","cat47","Restricted Bidding: This method shall be used where the goods or services are of a specialized nature or can only be supplied by a limited number of firms or enterprises. Here the security implications of the procurement are taken into consideration. The firms are identified through a confidential due diligence research by a competent agency such as the user or systems branch. This method shall be used with a Terms of Reference (ToR) that will specify exactly what supply or service is required. Other conditions include:\n" +
                "o\tGoods, works and services are available from only a limited number of qualified suppliers or contractors.\n" +
                "o\tTime and cost for evaluating tenders lopsided to the value of the goods, works or services to be procured.\n" +
                "\n");
        Finance_Section section713 = new Finance_Section("Direct procurement requirements","cat47","Direct Procurement: The procedure for procurement under the direct procurement method shall be through an invitation by the procurement entity to a contractor/supplier to submit a proposal or price quotation. This shall be used in the following circumstances:\n" +
                "i.\tIf a particular supplier has an exclusive right or where an alternative does not exist.\n" +
                "ii.\tExtreme urgency (which is not the fault of the procuring agency)\n" +
                "iii.\tSituation of urgency arising as a result of catastrophe and it will be impracticable to use any other methods of procurement.\n" +
                "iv.\tProcuring entity (MDA) may decide to procure goods, equipment, technology or services procured from a particular supplier or contractor because of the following: \n" +
                "\uF0A7\tNeed to maintain standards and a particular size\n" +
                "\uF0A7\tNeed to maintain compatibility with existing goods\n" +
                "\uF0A7\tMaintaining price reasonability\n" +
                "\uF0A7\tProcurement involves research, experiment, study or development\n" +
                "\uF0A7\tProcurement involving state security\n" +
                "\n");
        Finance_Section section714 = new Finance_Section("Emergency procurement procedure","cat47",".  Emergency Procurement: Emergency procedures can be used by a procuring entity (an MDA) to engage in direct procurement of goods, works and services in the following circumstances:\n" +
                "o\tState/public emergency involving disaster, war, or natural disaster like flooding, etc; \n" +
                "o\tDeterioration of the condition and quality of public goods; and \n" +
                "o\tLikely delay of a public project due to the absence of an item of minor value.\n" +
                "\n" +
                "47019.  Emergency procurement shall also be used when there is an existing threat to public health, welfare and safety. In emergency procurement, supplies and equipment are purchased to cover emergency situations in a specific setting. Emergency procurement must be approved by respected authorities and demonstrate a need for such procurement supplies and equipment. Emergency procurement is not applicable to agencies if needed materials are available statewide. Emergency procurement shall follow the following steps: \n" +
                "o\tRequests: The first step in emergency procurement is to make a request for approval of emergency equipment. Requests are generally submitted through email to appropriate authorities. After request, availability of funds is made known.\n" +
                "o\tBids: Once an agency submits a request and determines available funds, the agency solicits bids over the phone to one or more suppliers. During bidding the agency conveys to suppliers or contractor certain supply needs and quantity of such supplies.\n" +
                "o\tQuotes: Suppliers inform agency of quotes and relate information to the agency; the agency in turn submits quotes to the appropriate authorities for overall approval. If practical, authorities approve quotes when in agreement with supplier.\n" +
                "o\tPurchase Order: After submission of quotes and approval, the agency places an order for emergency procurement with the lowest bidder. An emergency purchase order is completed and the emergency procurement approval request form is attached to the purchase for submission and delivery.\n");
        Finance_Section section715 = new Finance_Section("Request for quotations and conditions","cat47","Request for Quotations: This is to be deployed where the value of the goods or works to be procured does not exceed a lower sum that is set in the procurement regulation and in the case of Ondo state when the goods, works or services is less than N250,000.00 (Two Hundred and Fifty Thousand Naira) only. Quotations shall be obtained from at least 3 unrelated contractors or suppliers. Procuring entity shall inform the contractor or supplier of factors that should be included in the price. Each bidder shall give only one quotation and shall not be allowed to change or vary the quotation or enter into any negotiation with the procuring entity. The successful contractor or supplier shall be the one that gives the lowest priced responsive quotation. \n" +
                "\n" +
                "Quotations will normally be requested from several firms or organizations and shall be submitted in writing. After the submission a procuring entity (MDA) shall: \n" +
                "a)\tprepare a list of qualified persons selected from the list maintained under Regulation and from its own knowledge of the market;\u2028\n" +
                "b)\tsubmit the list prepared under (a) to the tender committee for approval; and ensure a fair and equal rotation amongst the persons on the list kept under paragraph (a) in respect to giving the requests for quotations.\n");
        Finance_Section section716 = new Finance_Section("Consulting needs nature ","cat47","The procurement of consultancy services by any Ministry, Department and Agency   (MDA) of government in Ondo state may either be for ascertained or unascertained needs.");
        Finance_Section section717 = new Finance_Section("Services  for ascertained needs ","cat47",". (i) An MDA shall call for Expression of Interest (EoI) or applications for pre-qualification from consultants where their so required services have been fully ascertained.\n" +
                "\n" +
                "(ii) Pursuant to sub-section (i) above, a notice shall be published in at least two (2) national newspapers and the notice boards of the state secretariat. \n" +
                "\n" +
                "(iii) The proposal requested for under sub-section (i) above shall include:\n" +
                "a)\ta statement of qualifications of the Consultant to provide the required service(s);\n" +
                "b)\ta statement of understanding of the procuring entity’s needs;\n" +
                "c)\tthe methodology for providing the service(s); and \n" +
                "d)\tthe fee or cost for providing the service(s). \n");
        Finance_Section section718 = new Finance_Section("Services for unascertained needs. Proposal requests ","cat47","Where an MDA intends to enter into a contract to procure service(s) for the purpose of research, experiment, study or development, it shall be done by requesting for proposals, except in a situation where the said contract will include goods and services production in enough quantities that is sufficient to establish commercial viability that can recover the cost of research and development.");
        Finance_Section section719 = new Finance_Section("Direct programme unascertained","cat47","An MDA shall make direct request for a limited number of consultants requesting proposals for the provision of service(s) under the following conditions:\n" +
                "i.\tthe service(s) are only available from not more than three (3) consultants;\n" +
                "ii.\twhere there are more than three (3) consultants the cost and time required to evaluate large number of proposals would be uneven  to the value of services to be delivered, provided it invites enough consultants to ensure transparent competition; and \n" +
                "iii.\twhen it is in the interest of the state security or some other reasons of confidentiality. \n");
        Finance_Section section720 = new Finance_Section("Proposal confidentiality","cat47","An MDA shall treat proposals and any negotiation or selection procedure as confidential and avoid the disclosure of their contents to competing consultants.");





        Finance_Section[] sections = new Finance_Section[]{
                section1,section2,section6,section7,section10,section11,section12,section13,section14,section15,section16,section18,section19,section20,section21,section22,section23,section24,section25,section26,section27,section28,


                section29,section30,section31,section32,section33,section34,section35,section36,section37,section38,section39,section40,section41,section42,section43,section44,section45,section46,section47,section48,section49,section50,
                section51,section52,section53,section54,section55,section56,section57,section58,section59,section60,section61,
                section62,section63,section64,section65,section66,section67,section68,section69,section70,section71,


                section72,section73,section74,section75,section76,section77,section78,section79,section80,section81,
                section82,section83,section84,section85,section86,section87,section88,section89,section90,section91,
                section92,section93,section94,section95,section96,section97,section98,section99,section100,section101,
                section102,section103,section104,section105,section106,section107,section108,section109,section110,section111,section112,section113,section114,section115,section116,

                section117,section118,section119,section120,section121,section122,section123,section124,section125,section126,
                section127,section128,section129,section130,section131,section132,section133,section134,


                section135,section136,section137,section138,section139,section140,section141,section142,section143,section144,
                section145,section146,section147,section148,section149,section150,section151,section152,section153,section154,section155,section156,section157,



                section158,section159,section160,section161,section162,section163,section164,section165,section166,section167,
                section168,section169,section170,section171,section172,section173,section174,section175,
                section176,section177,section178,section179,section180,section181,section182,section182,section183,section184,
                section185,section186,section187,




                section188,section189,section190,section191,section192,section193,section194,section195,section196,section197,
                section198,section199,section200,section201,section202,section203,section204,section205,


                section206,section207,section208,section209,section210,section211,section212,section213,section214,section215,
                section216,section217,section218,section219,section220,section221,
                section222,section223,section224,section225,section226,section227,section228,section229,section230,section231,


                section232,section233,section234,section235,section236,section237,section238,section239,section240,section241,
                section242,section243,section245,section246,section247,
                section248,section249,section250,section251,section252,section253,section254,section255,section256,section257,


                section258,section259,section260,section261,section262,section263,
                section264,section265,section266,section267,section268,section269,section270,section271,section272,section273,


                section274,section275,section276,section277,section278,section279,section280,section281,section282,section283,
                section284,section285,section286,section287,section288,
                section289,section290,section291,section292,section293,section294,section295,section296,section297,section298,section299,section300,



                section301,section302,section303,section304,section305,


                section306,section307,section309,section310,section311,section312,section313,section314,section315,
                section316,section317,section318,section319,section320,section321,
                section322,section323,section324,section325,section326,section327,section328,section329,section330,section331,


                section332,section333,section334,section335,section336,section337,section338,section339,section340,section341,
                section342,section343,section344,section345,section346,section347,
                section348,section349,section350,section351,section352,section353,section354,section355,section356,section357,


                section358,section359,section360,section361,section362,section363,
                section364,section366,section367,section368,section369,section370,section371,section372,section373,


                section374,section375,section376,section377,section378,section379,section380,








                section381,section382,section383,
                section384,section385,section386,section387,section388,
                section389,section390,section391,section392,section393,section394,section395,section396,section397,section398,section399,section400,



                section401,section402,section403,section404,section405,


                section406,section407,section408,section409,section410,section411,section412,section413,section414,section415,
                section416,section417,section418,section419,section420,section421,
                section422,section423,section424,section425,section426,section427,section428,section429,section430,section431,


                section432,section433,section434,section435,section436,section437,section438,section439,section440,section441,
                section442,section443,section444,section445,section446,section447,
                section448,section449,section450,section451,section452,section453,section454,section455,section456,section457,


                section458,section459,section460,section461,section462,section463,





                section464,section465,section466,section467,section468,section469,section470,section471,section472,section473,


                section474,section475,section476,section477,section478,section479,section480,








                section481,section482,section483,
                section484,section485,section486,section487,section488,
                section489,section490,section491,section492,section493,section494,section495,section496,section497,section498,section499,section500,



                section501,section502,section503,section504,section505,


                section506,section507,section508,section509,section510,section511,section512,section513,section514,section515,
                section516,section517,section518,section519,section520,section521,
                section522,section523,section525,section526,section527,section528,section529,section530,section531,


                section532,section533,section534,section535,section536,section537,section538,section539,section540,section541,
                section542,section543,section544,section545,section546,section547,
                section548,section549,section550,section551,section552,section553,section554,section555,section556,section557,


                section558,section559,section560,section561,section562,section563,


                section564,section565,section566,section567,section568,section569,section570,section571,section572,section573,


                section574,section575,section576,section577,section578,section579,section580,








                section581,section582,section583,
                section584,section585,section586,section587,section588,
                section589,section590,section591,section592,section593,section594,section595,section596,section597,section598,section599,section600,



                section601,section602,section603,section604,section605,


                section606,section607,section608,section609,section610,section611,section612,section613,section614,section615,
                section616,section617,section618,section619,section620,section621,
                section622,section623,section624,section625,section626,section627,section628,section629,section630,section631,


                section632,section633,section634,section635,section636,section637,section638,section639,section640,section641,
                section642,section643,section644,section645,section646,section647,
                section648,section649,section650,section651,section652,section653,section654,section655,section656,section657,


                section658,section659,section660,section661,section662,section663,




                section664,section665,section666,section667,section668,section669,section670,section671,section672,section673,


                section674,section675,section676,section677,section678,section679,section680,








                section681,section682,section683,
                section684,section685,section686,section687,section688,
                section689,section690,section691,section692,section693,section694,section695,section696,section697,section698,section699,section700,



                section701,section702,section703,section704,section705,


                section706,section707,section708,section709,section710,section711,section712,section713,section714,section715,
                section716,section717,section718,section719,section720

        };




        return sections;
    }

    }
