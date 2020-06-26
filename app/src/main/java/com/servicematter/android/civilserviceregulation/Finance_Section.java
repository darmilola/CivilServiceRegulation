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


        Finance_Section section188 = new Finance_Section("","cat12","");
        Finance_Section section189 = new Finance_Section("","cat12","");
        Finance_Section section190 = new Finance_Section("","cat12","");
        Finance_Section section191 = new Finance_Section("","cat12","");
        Finance_Section section192 = new Finance_Section("","cat12","");
        Finance_Section section193 = new Finance_Section("","cat12","");
        Finance_Section section194 = new Finance_Section("","cat12","");
        Finance_Section section195 = new Finance_Section("","cat12","");
        Finance_Section section196 = new Finance_Section("","cat12","");
        Finance_Section section197 = new Finance_Section("","cat12","");
        Finance_Section section198 = new Finance_Section("","cat12","");
        Finance_Section section199 = new Finance_Section("","cat12","");
        Finance_Section section200 = new Finance_Section("","cat12","");
        Finance_Section section201 = new Finance_Section("","cat12","");
        Finance_Section section202 = new Finance_Section("","cat12","");
        Finance_Section section203 = new Finance_Section("","cat12","");
        Finance_Section section204 = new Finance_Section("","cat12","");
        Finance_Section section205 = new Finance_Section("","cat12","");
        Finance_Section section206 = new Finance_Section("","cat12","");
        Finance_Section section207 = new Finance_Section("","cat12","");
        Finance_Section section208 = new Finance_Section("","cat12","");
        Finance_Section section209 = new Finance_Section("","cat12","");
        Finance_Section section210 = new Finance_Section("","cat12","");
        Finance_Section section211 = new Finance_Section("","cat12","");
        Finance_Section section212 = new Finance_Section("","cat12","");
        Finance_Section section213 = new Finance_Section("","cat12","");
        Finance_Section section214 = new Finance_Section("","cat12","");
        Finance_Section section215 = new Finance_Section("","cat12","");
        Finance_Section section216 = new Finance_Section("","cat12","");
        Finance_Section section217 = new Finance_Section("","cat12","");
        Finance_Section section218 = new Finance_Section("","cat12","");
        Finance_Section section219 = new Finance_Section("","cat12","");
        Finance_Section section220 = new Finance_Section("","cat12","");




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
                section185,section186,section187


        };

        return sections;
    }

    }
