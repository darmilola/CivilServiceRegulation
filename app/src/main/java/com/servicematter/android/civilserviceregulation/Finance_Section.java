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








        Finance_Section section96 = new Finance_Section("","cat7","");
        Finance_Section section97 = new Finance_Section("","cat7","");
        Finance_Section section98 = new Finance_Section("","cat7","");
        Finance_Section section99 = new Finance_Section("","cat7","");
        Finance_Section section100 = new Finance_Section("","cat7","");
        Finance_Section section101 = new Finance_Section("","cat7","");
        Finance_Section section102 = new Finance_Section("","cat7","");
        Finance_Section section103 = new Finance_Section("","cat7","");
        Finance_Section section104 = new Finance_Section("","cat7","");
        Finance_Section section105 = new Finance_Section("","cat7","");
        Finance_Section section106 = new Finance_Section("","cat7","");
        Finance_Section section107 = new Finance_Section("","cat7","");
        Finance_Section section108 = new Finance_Section("","cat7","");
        Finance_Section section109 = new Finance_Section("","cat7","");
        Finance_Section section110 = new Finance_Section("","cat7","");
        Finance_Section section111 = new Finance_Section("","cat7","");
        Finance_Section section112 = new Finance_Section("","cat7","");
        Finance_Section section113 = new Finance_Section("","cat7","");

        Finance_Section[] sections = new Finance_Section[]{
                section1,section2,section6,section7,section10,section11,section12,section13,section14,section15,section16,section18,section19,section20,section21,section22,section23,section24,section25,section26,section27,section28,


                section29,section30,section31,section32,section33,section34,section35,section36,section37,section38,section39,section40,section41,section42,section43,section44,section45,section46,section47,section48,section49,section50,
                section51,section52,section53,section54,section55,section56,section57,section58,section59,section60,section61,
                section62,section63,section64,section65,section66,section67,section68,section69,section70,section71,


                section72,section73,section74,section75,section76,section77,section78,section79,section80,section81,
                section82,section83,section84,section85,section86,section87,section88,section89,section90,section91,
                section92,section93,section94,section95,section96,section97,section98,section99,section100,section101,
                section102,section103,section104,section105,section106,section107,section108,section109,section110,section111,section112,section113

        };

        return sections;
    }

    }
