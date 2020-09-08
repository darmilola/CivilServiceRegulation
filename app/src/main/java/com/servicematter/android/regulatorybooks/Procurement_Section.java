package com.servicematter.android.regulatorybooks;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "Procurement_Section")
public class Procurement_Section implements Parcelable {
    @NonNull
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "category")
    private String category;

    @ColumnInfo(name = "rules")
    private String rules;

    protected Procurement_Section(Parcel in) {
        id = in.readInt();
        title = in.readString();
        category = in.readString();
        rules = in.readString();
    }

    public Procurement_Section(String title, String category, String rules) {
        this.title = title;
        this.category = category;
        this.rules = rules;
    }

    public String getTitle() {
        return title;
    }

    public String getRules() {
        return rules;
    }

    public String getCategory() {
        return category;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public static final Creator<Procurement_Section> CREATOR = new Creator<Procurement_Section>() {
        @Override
        public Procurement_Section createFromParcel(Parcel in) {
            return new Procurement_Section(in);
        }

        @Override
        public Procurement_Section[] newArray(int size) {
            return new Procurement_Section[size];
        }
    };



    public static Procurement_Section[] populateSection() {
        //List<Section> sectionList = new ArrayList<>();
        Procurement_Section section1 = new Procurement_Section("Establishment of the state Board on public Procurement","cat1","1.\t(1)  \tThere is hereby established the State Board on Public Procurement\t       Establishment\n" +
                "\t\t(in this Law referred to as “the Board”)of the State\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\tBoard on \n" +
                "(2)\tThe Board shall consist of:\t\t\t\t\tPublic \n" +
                "                                                                                                                                                                                        Procurement \n" +
                "(a)\tthe Governor of Ondo State or his appointee as Chairman;and its \n" +
                "(b)\tthe Commissioner in charge of  Budget and Planning;\t\tmembership\n" +
                "(c)\tthe Attorney-General and Commissioner for Justice; \n" +
                "(d)\tthe Secretary to the State Government; \n" +
                "(e)\tthe Head of Service; \n" +
                "(f)\tCommissioner in charge of Finance;                         \n" +
                "(g)\tOne Chairman of Local Government representing  Chairmen of 18 Local Governments;  (h)\tSeven part-time members comprising one member each representing:  \n" +
                "(i)\tChartered Institute of Purchasing and Supplies (CIPS), \n" +
                "(ii)\tA certified construction-related body, Ondo State Chapter \n" +
                "(iii)\tNigerian Bar Association (NBA), Ondo State Chapter \n" +
                "(iv)\tPharmaceutical Society of Nigeria (PSN), Ondo State Chapter \n" +
                "(v)\tA certified accounting body, Ondo State Chapter \n" +
                "(vi)\tAll tertiary institutions in Ondo State and (vii) Recognized Civil Society Organization \n" +
                "\n" +
                "(i)\tThe Director- General of the Bureau who shall be the Chief Executive  Officer (CEO) and Vice Chairman of the Board, and shall preside in the absence of the Chairman.  \n" +
                "(j)\tThe Bureau shall have a Secretary. Such officer shall not be less than        GL.15 and above.\n" +
                "\n" +
                "(3)\tNotwithstanding the provisions of Sub-Section (2), the Board may co-opt    \tany person to attend its meeting but the person so co-opted shall not   have a casting vote or be counted towards quorum. \n" +
                "\n" +
                "(4)\tThe part-time Members of the Board shall be appointed by the Governor in    consultation with the relevant professional bodies and shall have a tenure of 3  years each. \n" +
                "\n" +
                "(5)\tSubject to subsection (2) of this Section, A member of the Board under                                            subsection (2) of this section being: \n" +
                "\n" +
                "(a)\tthe holder of an elective office under the Constitution of Nigeria,   shall hold office for the period he remains so elected and no more; and \n" +
                "\n" +
                "(b)\tthe Director-General of the Bureau, shall hold office on such terms  and conditions as may be specified in this Law and in his letter of appointment.  \n" +
                "\n" +
                "2.\tThe Board shall:\n" +
                "\n" +
                "(a)\tconsider, approve and amend the monetary and prior review thresholds          Functions   for the application of the provisions of this Law by procuring entities;            of the \n" +
                "                                                                                                            Board \n" +
                "(b)\tconsider and approve policies on public procurement;  \n" +
                "\n" +
                "(c)\tapprove the appointment of the Directors of the Bureau;  \n" +
                "\n" +
                "(d)\treceive and consider, for approval, the audited accounts of the Bureau of Public Procurement;  \n" +
                "\n" +
                "(e)\tapprove changes in the procurement process to adapt to improvements  in e-Procurement modern technology when necessary; and  \n" +
                "\n" +
                "(f)\tgive such other directives and perform such other functions necessary                                       to achieve its objectives as may be stated in other parts of this Law, the Ondo State Public Finance Management Law, the Fiscal Responsibility Law and the Financial Regulations.  \n" +
                "\n");
        Procurement_Section section2 = new Procurement_Section("The Establishment of the State Bureau of public procurement ","cat2","There is hereby established an agency to be known as the State Bureau of                  The \n" +
                "  Public Procurement (in this Law referred to as “the Bureau”)                                   Establishmentof the State Bureau of \n" +
                "\t(2)\tThe Bureau:                                                                              \t\n" +
                "Public Procurement (a)\tshall be a body corporate with perpetual succession and a common  seal;  \n" +
                "\n" +
                "(b)\tmay sue and be sued in its corporate name; and  \n" +
                "\n" +
                "(c)\tmay acquire, hold or dispose of any property, movable  or immovable for the purpose of carrying out any of its functions under this Law\n");
        Procurement_Section section3 = new Procurement_Section("Objectives of the Bureau","cat2","(a)\tthe harmonization of existing government policies and practices                   on public procurement and ensuring probity, accountability and   transparency in the procurement process;  \n" +
                "\n" +
                "(b)\tthe establishment of pricing standards and benchmarks;  \n" +
                "\n" +
                "(c)\tensuring the application of fair, competitive, transparent, value-for-   money standards and practices for the procurement and disposal of   public assets  and services; and  \n" +
                "\n" +
                "(d)\tthe attainment of transparency, competitiveness, cost effectiveness and professionalism in the public sector procurement system.  \n" +
                "\n" +
                "(e)\tensure compliance with and speedy delivery of procurements conditions and standards.  \n" +
                "\n" +
                "5.\tThe Bureau shall:                                Functions of                  the Bureau\n" +
                "(a)\tformulate the general policies and guideline relating to public                         \t   sector   procurement for the approval of the Board;   \n" +
                "\t\n" +
                "(b)\tpublicize and explain the provisions of this Law;  \t\n" +
                "\n" +
                "(c)\tsubject to the thresholds as may be set by the Board, certify  \n" +
                "\t\tState procurement prior to the award of contract;  \n" +
                "\n" +
                "(d)\tsupervise the implementation of established procurement policies;  \n" +
                "\n" +
                "(e)\tmonitor the prices of tendered items and keep a State database of standard prices;  \n" +
                "\n" +
                "(f)\tpublish the details of major contracts in the procurement journal;   \n" +
                "\n" +
                "(g)\tpublish paper and electronic editions of the procurement journal  and maintain an archival system for the procurement journal;      \n" +
                "\n" +
                "(h)\tmaintain a State database of the particulars and classification and categorization of contractor and service providers;   \n" +
                "\n" +
                "(i)\tcollate and maintain in an archival system State procurement plans and information;  \n" +
                "\n" +
                "(j)\tundertake procurement research and surveys;  \n" +
                "\n" +
                "(k)\torganize training and development programmes for procurement officers and other professionals;  \t\n" +
                "\n" +
                "(l)\tperiodically review the socio-economic effect of the policies on procurement and advise the Board accordingly;  \n" +
                "\n" +
                "(m)\tprepare and update standard bidding and contract documents;  \n" +
                "\n" +
                "(n)\tprevent fraudulent and unfair procurement and where necessary apply administrative sanctions;  \n" +
                "\n" +
                "(o)\treview the procurement and award of contract procedures of  every entity to which this Law applies;  \n" +
                "\n" +
                "(p)\tperform procurement audits and submit such report to the House of  Assembly bi-annually;  \n" +
                "\n" +
                "(q)\tintroduce, develop, update and maintain related database and  technology;  \n" +
                "\n" +
                "(r)\tprovide bench mark prices for direct public procurement, local                                                  purchases and for agency involved in Force Account (Direct Labour) activities;  \n" +
                "\n" +
                "(s)\testablish a single internet  portal that shall, subject to Section 16 (10) of this Law serve as a primary and definitive source of all information on Government procurement containing and displaying all public sector procurement information at all times; and  \n" +
                "\n" +
                "(t)\tco-ordinate relevant training programmes to build institutional capacity.\n");
        Procurement_Section section4 = new Procurement_Section("Powers of the bureau","cat2","(a)\tenforce the monetary and prior review thresholds set by the Board                     \tfor the application of the provisions of this Law by the procuring                      entities;  \n" +
                "\n" +
                "(b)\tsubject to paragraph (a) of this subsection, issue certificate of “No  \n" +
                "Objection for Contract Award” within the prior review threshold for all procurements within the purview of this Law;   \n" +
                "\n" +
                "(c)\tfrom time to time stipulate to all procuring entities, the procedures and      \tdocumentation pre-requisite for the issuance of Certificate of “No     Objection” under this Law;  \n" +
                "\n" +
                "(d)\twhere a reason exist:  \n" +
                "\n" +
                "(i)\tcause to be inspected or reviewed any procurement transaction   \t\tto ensure compliance with the provisions of this Law;  \n" +
                "\n" +
                "(ii)\treview and determine whether any procuring entity has violated any provision of this Law;  \n" +
                "\n" +
                "(e)\tdebar any supplier, contractor or service provider that contravenes any provision of this Law and regulations made pursuant to this Law;  \n" +
                "\n" +
                "(f)\tmaintain a State database of contractors and service providers and to the exclusion of all procuring entities, prescribe classifications and categorizations for the companies on the register such that in the case of  service providers in the procurement of civil works they are \n" +
                "regulated by  the Federal Government Boards/Councils of \n" +
                "professions approved by the                                   \n" +
                "National Building Code, namely, ARCON, CORBON, COREN,                                           \n" +
                "ESVARBON, QSRBN, SURCON AND TOPREC;  \n" +
                "\n" +
                "(g)\tmaintain a list of firms and persons that have been debarred from participating in public procurement activity and publish them in the procurement journal;  \n" +
                "\n" +
                "(h)\tcall for such information, documents, records and reports in respect of any aspect of any procurement proceeding where a breach, wrong- doing, default, mismanagement and or collusion has been alleged, reported or proved against a procuring entity or service provider;   \n" +
                "\n" +
                "(i)\trecommend to Civil Service Commission for disciplinary action                                              where found appropriate and in respect of political appointees                                                recommend to the Governor for appropriate action;.  \n" +
                "\n" +
                "(j)\tcall for the production of books of accounts, plans, documents and examine persons or parties in connection with any procurement  proceeding;  \n" +
                "\n" +
                "(k)\tact upon complaints in accordance with the procedure set out in  \n" +
                "this Law which include referring service providers or civil works   \n" +
                "consultants to the appropriate regulatory bodies for disciplinary                                                actions;  \n" +
                "\n" +
                "(l)\tdo such  other things as are necessary for the efficient performance of its functions under this Law.  \n" +
                "\n" +
                "(2)\tThe Bureau shall serve as the secretariat for the Board.        \n" +
                "\n" +
                "(3)\tThe Bureau shall, subject to the approval of the Board have power to:  \n" +
                "\n" +
                "(a)\tenter into partnership with any company, firm or person which in its opinion will facilitate the discharge of its functions;    \n" +
                "\n" +
                "(b)\tliaise with relevant bodies or institutions, national and international   \t\tfor effective performance of its functions under this Law.\n");
        Procurement_Section section5 = new Procurement_Section("Director-General and staffs of the bureau","cat2","7.\t(1)  \tThere shall be for the Bureau, a Director-General who shall be appointed         Director-General\t\tby the Governor, on the recommendation of the Board after competitive          and staff of \tselection.                                                                                                               the Bureau. \n" +
                "\n" +
                "\t(2)\tThe Director-General shall be:  \n" +
                "\n" +
                "(a)\tThe Director General shall be the Chief Executive Officer (CEO)  of the Bureau;  \n" +
                "\n" +
                "(b)\tresponsible for the execution of the policy and day to day   administration of the affairs of the Bureau;  and  \n" +
                "\n" +
                "(c)\tThe Director General shall possess the relevant and adequate  \n" +
                "professional qualification and shall have not less than ten (10) years  \n" +
                "and above post qualification experience in the Public or Private Sector  of the economy.  \n" +
                "\n" +
                "(3)\tThe Director-General shall hold office:  \n" +
                "\n" +
                "(a)\tfor a term of four (4) years in the first instance and may be  reappointed for a further term of four (4) year and no more; and  \n" +
                "\n" +
                "(b)\ton such terms and conditions as may be specified in his letter of appointment.  \n" +
                "\n" +
                "(4)\tWithout prejudice to the provisions of this Law, the Director-General of the Bureau may be removed from office at the instance of the Governor on the basis of gross misconduct or financial impropriety, fraud and incompetence proven by the Board.  \n" +
                "\n");
        Procurement_Section section6 = new Procurement_Section("Principal officers of the bureau","cat2","8.\t(1)  \tThe Board shall appoint the principal officers for the Bureau after    \t\tPrincipal officers\n" +
                "\tcompetitive selection process, subject to the provision of the Public Service  \tof the Bureau\n" +
                "Rules competitive selection process.                                                                                 \n" +
                "\n" +
                "(2)\tThe principal officers appointed under Sub-Section 8 (1) shall each     \thave the requisite qualification and experience required for the effective     \tperformance of the functions of their respective departments and the     \tBureau as specified under this Law.  \n" +
                "\n" +
                "(3)\tThe Board shall have power to modify the operational structure of    the Bureau as may be necessary to enhance the Bureau’s duties and    \t  functions under this Law.  \n" +
                "\n" +
                "9.\t(1)  \tThe Board may appoint such officers and other employees as may        Other staff of\tfrom time to time deem necessary for the purposes of the Bureau.                       the Bureau \n" +
                "\n" +
                "(2)\tSubject to the Pension Reform Law, the terms and conditions of     Service (including remuneration, allowances, benefits and pensions)    \t  of officers and employees of the Bureau shall be as determined by    \tthe Board.  \n" +
                "\n" +
                "(3)\tWithout prejudice to the generality of subsection (1), the Board shall     \thave power to appoint either on transfer or on secondment from the       \tcivil service of the State, such number of employees as may be required \n" +
                "\t\n" +
                "\t\t\tto assist the Bureau in the discharge of any of its functions under this    \t  Law and persons so employed shall be remunerated (including allowances)  as the Board may consider appropriate.  \n" +
                "\n");
        Procurement_Section section7 = new Procurement_Section("Staff regulations","cat2","10.\t(1)  \tThe Board may, subject to the provisions of this Law and within six                    Staff \t\tmonths of the inauguration, make regulations relating generally to the                  regulations \n" +
                "\t  conditions of service of the employees of the Bureau and without prejudice to the foregoing  such regulations may provide for:  \n" +
                "\n" +
                "(a)\tthe appointment, promotion and disciplinary control (including dismissal) of employees of the Bureau; and  \n" +
                "\n" +
                "(b)\tappeals by such employees against dismissal or other disciplinary measures.  \n" +
                "\n" +
                "(2)\tUntil such regulations are made, any instrument relating to the conditions    of service of officers in the civil service of the State shall be applicable.\n");
        Procurement_Section section8 = new Procurement_Section("Pension Provisions","cat2","11.\tEmployees of the Bureau shall be entitled to pensions and other retirement benefits           Pension \n" +
                "\t\tas prescribed under the Pension Law.\n");
        Procurement_Section section9 = new Procurement_Section("Funds of bureau","cat2","12.\t(1)  \tThe Bureau shall establish and maintain a fund, to be approved by the                   Funds of\n" +
                "\t\t\tBoard into which shall be paid and credited:   \t\t\tthe Bureau \n" +
                "\n" +
                "(a)\tthe sums appropriated by the House of Assembly for the running of the Bureau monthly or quarterly from the First Line Charge on  Revenue of the State;   \n" +
                "\n" +
                "(b)\tall subvention, fees and charges for services rendered or publications made by the Bureau; and  \n" +
                "\n" +
                "(c)\tall other funds or assets which may from time to time accrue to the  Bureau.  \n" +
                "\n" +
                "(2)\tThe Bureau shall charge its fund to meet all its expenditure.  \n" +
                "\n" +
                "(3)\tThe Board may, in consultation with the Accountant General of the State make regulations for the Bureau:  \n" +
                "\n" +
                "(a)\tspecifying the manner in which assets or the fund of the Bureau are to be held and regulating the making of payment into and out of the  fund; and  \n" +
                "\n" +
                "(b)\trequiring the keeping of proper accounts and records for the purposes of the fund in such form as may be specified in the rules.   \n" +
                "\n" +
                "\t(4)\tThe Bureau may from time to time apply the proceeds of the fund for:  \n" +
                "\n" +
                "(a)\tthe cost of administration of the Bureau;  \n" +
                "\n" +
                "(b)\tthe payments of salaries, fees and other remuneration of  employees  of the Bureau or experts or professionals appointed by the Bureau;\n" +
                "\n" +
                "(c)\tthe maintenance of any property acquired by or vested in the Bureau;  \n" +
                "\n" +
                "(d)\tany matter connected with all or any of the functions of the   \n" +
                "                      Bureau under this Law; and  \n" +
                "\n" +
                "(e)\tany expenditure connected with all or any of the functions of the   Bureau under this Law.\n");
        Procurement_Section section10 = new Procurement_Section("Financial year budgeting and annual report","cat2","13.\t(1)      The financial year of the Bureau shall be the same as that of the State                    \t\t            Government.                \n" +
                "(2)\tNot later than 6 months before the end of the financial year, the Bureau     \tshall submit to the Board an estimate of its expenditure and projected     \tincome during the next succeeding year.  \n" +
                "\n" +
                "(3)\tThe Bureau shall keep proper accounts and records of its receipts,     payments, assets and liabilities and shall in respect of each financial   \t  year prepare a statement of account in such form as the Board may    \t  direct.  \n" +
                "\n" +
                "(5)\tThe Bureau shall within 6 months after the end of the financial year to                                                 which the accounts relate cause the accounts to be audited by the Auditor-                                       General of the State.         \n" +
                "\n" +
                "(6)\tThe Bureau shall at the end of each financial year, prepare and submit to the Board a report in such form as shall accurately capture all the  activities of the Bureau  during the preceding year and shall include in the  report a copy of the audited accounts of the Bureau for that year.  \n" +
                "\n" +
                "14.\t(1)  \tSubject to the provisions of this Law, no suit shall be commenced against             Legal \t\tthe Bureau before the expiration of thirty (30) days after a written notice               proceedings \n" +
                "  of an intention to commence the suit shall have been served upon the    Bureau by \n" +
                "the intending claimant or his agent; and the notice shall    explicitly state:  \n" +
                "\n" +
                "(a)\tthe cause of action;  \n" +
                "\n" +
                "(b)\tthe particulars of the claim;   \n" +
                "\n" +
                "(c)\tthe name and address of legal practitioner of the intending claimant; and  \n" +
                "\n" +
                "(d)\tthe relief being sought.  \n" +
                "\n" +
                "(2)\tThe Director-General of the Bureau, its officers, employees or agents shall  not personally be subject to any action, claim or demand by or liable to any person in respect of anything done or omitted to be done in exercise of any functions or power conferred by this Law upon the Bureau, its Director- General, officers or agents.  \n" +
                "\n" +
                "(3)\tThe Director-General or member of the Bureau or any officer or employees  of the Bureau shall be indemnified out of the assets of the Bureau against any liability incurred by him in defending any proceeding whether civil or criminal,   \tif the proceeding is brought against him in his capacity as a Director-General,  member, officer or other employee of the Bureau.  \n" +
                "\n" +
                "(4)\tA notice, summons or other documents required or authorized to be served  upon the Bureau under the provisions of this Law or any other Law or enactment may be served by delivering it to the Director-General or by sending it by registered post and addressed to the Director-General at the principal office of the Bureau.  \n" +
                "\n");
            Procurement_Section section12 = new Procurement_Section("SCOPE OF APPLICATION","cat3","15.  (1)  \tSubject to the provisions of subsections (2) (3) and (4) of this section,                        Scope of  the provisions of this Law shall apply to all procurement of goods, works                 application\n" +
                    "and services carried out by the State, Local Government Boards and all other procurement entities in the State.                             \n" +
                    "\n" +
                    "\t\t(2)  \tThe provisions of this Law shall not apply to the procurement of special  \n" +
                    "\t\t\tgoods, works and services involving security unless the Governor’s  \n" +
                    "  approval has been first sought and obtained that the provisions shall                                                       specifically apply.  \n");
        Procurement_Section section13 = new Procurement_Section("Fundamental Principles of procurement","cat4","(1)  \tSubject to any exemption allowed by this Law public procurement shall be               \n" +
                "\t                    \n" +
                "conducted:                                                                                                                     \n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "(a)\tsubject to the prior review thresholds as may from time to time be       \t\tset by the Bureau pursuant to paragraphs (a) and \n" +
                "(b)\tof Section 6(1);  \n" +
                "\t\t\t\n" +
                "(b)\tbased only on procurement plans supported by prior budgetary  \n" +
                "\t\t\t\tAppropriations and no procurement proceedings shall be formalized   \n" +
                "until the procuring entity has ensured that funds are available to meet  the obligations and subject to the threshold in the regulations made by   \n" +
                "\t\t\t\tthe Bureau, has obtained a “Certificate of No Objection to Contract  \n" +
                "Award” from the Bureau;  \n" +
                "\n" +
                "(c)\tby open competitive bidding;  \n" +
                "\n" +
                "(d)\tin a manner which is transparent, timely, equitable for ensuring accountability and conformity with this Law and regulations deriving therefrom;  \n" +
                "\n" +
                "(e)\twith the aim of achieving value for money and fitness for purpose;  \n" +
                "\n" +
                "(f)\tin a manner which promotes competition, economy and efficiency; and  \n" +
                "\n" +
                "(g)\tin accordance with the procedures and timeline laid down in this Law and as may be specified by the Bureau from time to time.  \n" +
                "\n" +
                "(2)\tWhere the Bureau has set prior review thresholds in the procurement    regulations, no funds shall be disbursed from the Treasury or Revenue    Account or any bank account of any procuring entity for any procurement    falling above the set thresholds unless the cheque, payments or other form    of request for payments is accompanied by a “Certificate of No Objection    to an Award of Contract” duly issued by the Bureau.  \n" +
                "\n" +
                "(3)\tFor all cases where the Bureau shall set a prior review threshold, the             Bureau shall prescribe by regulation and guidelines the conditions  precedent to the award of Certificate of “No Objection” under this Law.  \n" +
                "\n" +
                "(4)\tSubject to the prior review thresholds as may be set by the Bureau, any    procurement purported to be awarded without a “Certificate of No             Objection to Contract Award” duly issued by the Bureau shall be set aside and declared null and void by the Board.  \n" +
                "\n" +
                "(5)\tA supplier, contractor or service provider may be a natural or a legal   \n" +
                "person. Any supplier, contractor or service provider acting in partner-                                                       ship are jointly and severally liable for all obligations and/or responsi-                                         bilities for non-performance or improper performance of any contract                                                   awarded pursuant to this Law.  \n" +
                "\n" +
                "(6)\tAll bidders, in addition to requirements contained, in any solicitation    documents shall:  \n" +
                "\n" +
                "(a)\tpossess the necessary:  \n" +
                "\n" +
                "(i)\tprofessional and technical qualifications to carry out  particular procurements;  \n" +
                "\n" +
                "(ii)\tfinancial capability;  \n" +
                "\n" +
                "(iii)\tequipment and other relevant infrastructure;  \n" +
                "\n" +
                "(iv)\tshall have adequate personnel to perform the obligations of  \tthe procurement contracts.   \n" +
                "\n" +
                "(b)\tpossess the legal capacity to enter into the procurement contract;  \n" +
                "\n" +
                "(c)\tnot be in receivership or the subject of any form of insolvency or       \tbankruptcy proceedings or the subject of any form of winding up      petition or proceedings;  \n" +
                "\n" +
                "(d)\thave fulfilled all its obligations to pay taxes, pensions and social    security contributions;  \n" +
                "\n" +
                "(e)\tnot have any director who has been convicted in any country for any criminal  offence relating to fraud or financial impropriety or criminal misrepresentation  or falsification of facts relating to any  matter;  \n" +
                "\n" +
                "(f)\tNo person who has been engaged in preparing for any procurement or  part of the proceedings thereof may either bid for the procurement in question or any part thereof either as main contractor or sub-contractor nor may he cooperate in any manner with the bidders in the course of preparing their tenders.  \n" +
                "\n" +
                "(7)\tThe procuring entity may require a bidder to provide documentary evidence   \n" +
                " or other information it considers necessary as proof that the bidder is qualified                                              in accordance with this Law and the solicitation documents and for this purpose   any such requirements shall apply equally to all bidders.  \n" +
                "\n" +
                "(8)\tWhenever it is established by a procuring entity or the Bureau that any or a  combination of the situations set out exist, a bidder may have its bid or tender    excluded from any particular procurement proceeding if:  \n" +
                "\n" +
                "(a)\tthere is verifiable evidence that any supplier, contractor or consultant has given or promised a gift of money or any tangible item, or has  promised, offered or given employment or any other benefits, item or service that can be qualified in monetary items to a current or former employee of a procuring entity or the Bureau in an attempt to influence any action or decision making of any procurement activity;  \n" +
                "\n" +
                "(b)\ta supplier, contractor or consultant during the last three years prior to the commencement of the procurement proceedings in issue, failed to perform or to provide due care in performance of any public procurement;  \n" +
                "\n" +
                "(c)\tthe bidder is in receivership or is the subject of any type of insolvency       \tproceedings or if being a private company under the Companies and    \t\tAllied Matters Act, is controlled by a person or persons who are subject    \t\tto any bankruptcy proceedings or who have been declared bankrupt and    \t\tor have made any compromises with their creditors within two calendar    \t  years prior to the initiation of the procurement proceeding;  \n" +
                "\n" +
                "(d)\tthe bidder is in arrears regarding payment of due taxes, charges pensions   or social  insurance contributions unless such bidders have obtained a    lawful permit with respect to allowance, deference of such outstanding   payments or payment thereof in installments;  \n" +
                "\n" +
                "(e)\tthe bidder has been validly sentenced for a crime committed in connection  with a procurement proceeding or any other crime committed to gain financial profit;  \n" +
                "\n" +
                "(f)\tthe bidder has in its management or is in any portion owned by any person that has been validly sentenced for a crime committed  to gain financial  profit; and  \n" +
                "\n" +
                "(g)\tthe bidder fails to submit a statement regarding its dominating or subsidiary relationships with respect to other parties to the proceedings and persons acting  on behalf of the procuring entity participating in same proceeding or whom remains in subordinate relationship with other participants to the proceedings.  \n" +
                "\n" +
                "(9)\tIn such cases the procuring entity shall inform the Bureau and person referred    to in subsection (8) (a)-(g) in writing that the bid or tender in question has been    excluded and the grounds for the exclusion and to keep a record of same in the    file pertaining to the public procurement proceeding in question.  \n" +
                "\n" +
                "(10)\tAll communications and documents issued by procuring entities and the              Bureau shall be in English language.  \n" +
                "\n" +
                "(11)\tAll communications regarding any matter deriving from this Law or  proceedings of public procurement shall be in writing or such other from  as may be stipulated by the Bureau.  \n" +
                "\n" +
                "(12)\tEvery procurement entity shall maintain both file and electronic records                                        (where such facilities are available) of all procurement proceedings made   within each financial year and the procurement records shall be maintained  for a period of ten (10) years from the date of the award.  \n" +
                "\n" +
                "(13)\tCopies of all procurement records shall be transmitted to the Bureau not                                            later than 3 months after the end of the financial year and shall show:  \n" +
                "\n" +
                "(a)\tinformation identifying the procuring entity and the contractors;  \n" +
                "\n" +
                "(b)\tthe date of the contract award;  \n" +
                "\n" +
                "(c)\tthe value of the contract; and  \n" +
                "\n" +
                "(d)\tthe detailed records of the procurement proceedings.  \n" +
                "\n" +
                "(14)\tAll procurement records shall be open to inspection by the public at the     cost of copying and certifying the documents plus an administrative     \tcharge as may be prescribed from time to time by the Bureau.  \n" +
                "\n" +
                "(15)\tThe criteria stipulated as the basis upon which suppliers or contractor would    be evaluated shall  not be changed in the course of any procurement proceeding.  \n" +
                "\n" +
                "(16)\tThe burden of proving fulfillment to the requirements for participation in any     procurement proceedings shall lie on the supplier or contractor.  \n" +
                "\n" +
                "(17)\tExcept for good reason and as approved by the Board a contract shall be                                       awarded to the lowest evaluated responsive bid from the bidders substantially                          responsive to the bid solicitation.  \n" +
                "\n" +
                "(18)\tNotwithstanding subsection (17) of this section, the Bureau may refuse to  \n" +
                "issue a Certificate of “No Objection” to Contract Award on the grounds that                                         the  price is excessive.  \n" +
                "\n" +
                "(19)\tPursuant to subsection (18) of this section, the Bureau may direct either that                                      the procurement proceedings be entirely cancelled or that the procuring entity                             conduct a re-tender.  \n" +
                "\n" +
                "(20)\tThe accounting officer of a procuring entity and any officer to whom responsi-                                 bility is delegated are responsible and accountable for any actions taken or                                       omitted to be taken either in compliance with or in contravention of this Law.  \n" +
                "\n" +
                "(21)\tThe accounting officer or a procuring entity has the responsibility to ensure                                       \n" +
                "that the provisions of this Law and the regulations laid down by the Bureau are complied with, and concurrent approval by any Tenders Board shall not absolve  the accounting officer from accountability for anything done in contravention of this Law or the regulations; except he can prove that he advised the Tenders Board against the breach of this Law in writing before such approval was granted.   \n" +
                "\n" +
                "(22)\tProcurement and disposal decisions of a procuring entity shall be taken in strict     \t\tadherence to the provisions of this Law and any regulations as may from time to        \ttime be laid down by the Bureau.  \n" +
                "\n" +
                "(23)\tPersons who have been engaged in preparing for a procurement or part of the    \t\tproceedings thereof may neither bid for the procurement in question or any part    \t\tthereof either as main contractor or sub-contractor nor may they cooperate in any    \t\tmanner with bidders in the course of preparing their tenders.  \n" +
                "\n" +
                "(24)\tA procuring entity shall not request or stipulate that a bidder should engage a     \t\tparticular subcontractor as a requirement for participating in any procurement   \t\t\tproceedings.  \n" +
                "\n" +
                "(25)\tAll procurement contracts shall contain provisions for arbitration proceedings                                   as the primary forms of dispute resolution.  \n" +
                "\n" +
                "(26)\tThe values in procurement documents shall be stated in Nigerian currency and  where stated in a foreign currency shall be converted to Nigerian currency using  the exchange rate of the Central Bank of Nigeria valid on the day of opening a  tender or bid.  \n" +
                "\n" +
                "(27)\tAll procurement contracts shall contain warranties for durability of goods, exercise      \tof requisite skills in service provision and use of genuine materials and inputs in    \t\texecution.   \n" +
                "\n" +
                "(28)\tAll procurement contracts shall contain provisions for engagement of local labour    and personnel, where the skill required is available within the State.  \n");
        Procurement_Section section14 = new Procurement_Section("Aproving Authority","cat5","17.\tSubject to the monetary and prior review thresholds for procurements in this Law  \t                 Approving as may from time to time be determined by the Board, the following shall be the  \tauthority approving authority for the conduct of public procurement:  \n" +
                "\n" +
                "\t(a)\tin the case of:  \n" +
                "\n" +
                "(i)\ta government agency, parastatal, or corporation, a Parastatals’ Tender  \n" +
                "         Board;   \n" +
                "\n" +
                "(ii)\ta ministry or extra-ministerial entity; the  Ministerial Tenders Board; and  \n" +
                "\n" +
                "(iii)\ta local government; the Local Government Tenders Board. \n");
        Procurement_Section section15 = new Procurement_Section("Procurement Planning","cat5","18.\tSubject to regulations as may from time to time be made by the Bureau under        Procurement the direction of the Board, a procuring entity shall plan its procurement by: planning \n" +
                "\t\t\n" +
                "(a)\tpreparing the needs assessment and evaluation;  \n" +
                "\n" +
                "(b)\tidentifying the goods, works or services required;  \n" +
                "\n" +
                "(c)\tcarrying appropriate market and statistical surveys and on that basis prepare   analysis of the cost implications of the proposed procurement;  \n" +
                "\n" +
                "(d)\taggregating its requirements whenever possible, both within the procuring  entity and between procuring entities, to obtain economy of scale and reduce procurement cost;  \n" +
                "\n" +
                "(e)\tintegrating its procurement expenditure into its yearly budget;  \n" +
                "\n" +
                "(f)\tprescribing any method for effecting the procurement subject to the necessary  approval under this Law: and  \n" +
                "\n" +
                "(g)\tensuring that the procurement entity functions stipulated in this section shall be  carried out by the Procurement Planning Committee.\n");
        Procurement_Section section16 = new Procurement_Section("Procurement Implementation","cat5","19.\tSubject to regulations as may from time to time be made by the Bureau under direction       Procurement of the Board, a procuring entity shall, in implementing its procurement plans:                   implementation\n" +
                "\n" +
                "(a)\tadvertise and solicit for bids in adherence to this Law and guidelines as may be  issued by the Bureau from time to time;  \n" +
                "\n" +
                "(b)\tinvite two credible persons as observers in every procurement process, one  person each representing a recognized:  \n" +
                "\n" +
                "(i)\tprivate sector professional organization whose expertise is relevant to the  particular goods or service being procured, and  \n" +
                "\n" +
                "(ii)\tnon-governmental organization working in transparency, accountability  and anti-corruption areas, the observers and shall not intervene in the  procurement process but shall have to submit their observation report to  any relevant agency or body including their own organizations or  association;  \n" +
                "\n" +
                "(c)\treceive, evaluate and make a selection of the bids received in adherence to  this Law and guidelines as may be issued by the Bureau from time to time;  \n" +
                "\n" +
                "(d)\tobtain approval of the approving authority before making an award;  \n" +
                "\n" +
                "(e)\tdebrief the bid losers on request;  \n" +
                "\n" +
                "(f)\tresolve complaints and disputes if any;  \n" +
                "\n" +
                "(g)\tobtain and confirm the validity of any performance guarantee;  \n" +
                "\n" +
                "(h)\tobtain a “Certificate of  “No Objection to Contract Award” from the Bureau within the prior review threshold as stipulated in Section 6 (a) of this Law;      \n" +
                "(i)\texecute all Contract Agreements; and  \n" +
                "\n" +
                "(j)\tannounce and publicize the award in the format stipulated by this Law and guidelines as may be issued by the Bureau from time to time.  \n" +
                "\n");
        Procurement_Section section17 = new Procurement_Section("Accounting Officer","cat5","20.\t(1)   The Accounting Officer of a procuring entity shall be the person charged with line  Accounting supervision of the conduct of all procurement processes; in the case of  ministries,             officer \n" +
                "the Permanent Secretary and in the case of extra-ministerial departments and  corporations, the Director-General or officer of co-ordinate responsibility.  \n" +
                "\n" +
                "(2)\tThe accounting officer of every procuring entity shall have overall responsibility   for the planning of organization of tenders, evaluation of tenders and execution of all procurements and in particular shall be responsible for:  \n" +
                "\n" +
                "(a)\tensuring compliance with the provisions of this Law by his entity and liable  in person for the breach or contravention of this Law or any regulation made                                               hereunder whether or not the act, \n" +
                "omission  or was carried out by him personally   \n" +
                "or any of his subordinates and it shall not be material that he had delegated any function, duty or power to any person or group of persons except it can be proven  that the written instructions or recommendations of the accounting officer, which were in agreement with the provisions of this Law were disregarded by the other parties;  \n" +
                "\n" +
                "(b)\tconstituting the Procurement Committee and its decisions;  \n" +
                "\n" +
                "(c)\tensuring that adequate appropriation is provided specifically for the procurement in the State budget;  \n" +
                "\n" +
                "(d)\tintegrating his entity’s procurement expenditure into its yearly budget;  \n" +
                "\n" +
                "(e)\tensuring that no reduction of values or splitting of procurements is carried out such as to evade the use of the appropriate procurement method;  \n" +
                "\n" +
                "(f)\tconstituting the ad-hoc Bid Opening Committee and ad-hoc Bid Evaluation  Committee comprising career officers only;  \n" +
                "\n" +
                "(g)liaising with the Bureau to ensure the implementation of its regulations.  \n");
        Procurement_Section section18 = new Procurement_Section("Procurement Planning Committee","cat5","21.\t(1)  For each financial year each procuring entity shall establish a Procurement   Procurement                       Planning Committee.        Planning \n" +
                "\t\t\t\t\t\t\t\t\t\t\t\tCommittee  \t\n" +
                "(2)\tThe Procurement Planning Committee shall consist of::  \n" +
                "\t\n" +
                "(a)\tthe accounting officer of the procuring entity or his representative   who shall  be the chairman of  the Committee;  \n" +
                "\n" +
                "(b)\ta representative of:  \n" +
                "\n" +
                "(i)\tthe procurement unit of the procuring entity who shall be the  \n" +
                "                     Secretary;  \n" +
                "\n" +
                "(ii)\tthe unit directly in requirement of the procurement;  \n" +
                "\n" +
                "(iii)\tthe financial unit of the procuring entity;  \n" +
                "\n" +
                "(iv)\tthe planning, research and statistics unit of the procuring entity;  \n" +
                "\n" +
                "(v)\ttechnical personnel of the procuring entity with expertise in the subject matter for each particular procurement, and  \n" +
                "\n" +
                "(vi)\ta representative of the legal unit of the procurement entity or legal   officer from the Ministry of Justice where the procurement entity  has no legal unit.  \t\n" +
                "\n");
        Procurement_Section section19 = new Procurement_Section("Tenders Board","cat5","22.\t(1)   There is hereby established by this Law in each procuring entity a tenders   \tTenders board (in \n" +
                "this Law referred to as “the Tenders Board”).  board \n" +
                "\n" +
                "(2)\tSubject to the approval of the Board, the Bureau shall, from time to time prescribe guidelines for the membership of the Tenders Board.  \n" +
                "\n" +
                "(3)\tThe Tenders Board shall be responsible for the award of procurements of goods, works and services within the threshold set in the regulations.  \n" +
                "\n" +
                "(4)\tIn all cases where there is a need for pre-qualification, the Chairman of the   Tenders Board shall constitute an ad-hoc technical evaluation sub-committee  of the Tenders Board charged with the responsibility for the evaluation of bids  which shall be made up of professional staff of the procuring entity, such other  coopted members and the  Secretary of the Tenders Board who shall  also be the Chairman of the Evaluation Sub-committee.  \n" +
                "\n" +
                "(5)\tThe decision of the Tenders Board shall be communicated to the Commissioner/          Chairman/Chief Executive in charge of implementation.\n");
        Procurement_Section section20 = new Procurement_Section("Prequalification of Bidders","cat5","(1) Where a procuring entity has made a decision with respect to the minimum                    \n" +
                "qualifications of suppliers, contractors or service providers by requesting                       \n" +
                "interested persons to submit applications to pre-qualify, it shall set out precise  criteria upon which it seeks to give consideration to the applications and in  reaching a decision as to which supplier, contractor or service provider qualifies, shall apply only the criteria set out in the prequalification documents and no more.  \n" +
                "\n" +
                "(2)\tProcuring entities shall supply a set of prequalification documents to each supplier, contractor or consultant that request them, and the price that a  procuring entity may charge for the prequalification documents shall  reflect only the cost of printing and provision to suppliers or contractors and consultants.  \n" +
                "\n" +
                "(3)\tThe prequalification document shall include::  \n" +
                "\n" +
                "(a)\tinstructions to prepare and submit prequalification application;  \n" +
                "\n" +
                "(b)\ta summary of the main terms and conditions required for the procurement contract to be entered into as a result of the procurement proceeding;  \n" +
                "\n" +
                "(c)\tany documentary evidence  or other information that must be submitted by  suppliers, contractors or consultants to demonstrate their qualifications;            \n" +
                "\n" +
                "(d)\tthe manner and place for the submission of applications to pre-qualify and the deadline for the submission expressed as a specific date and time which allows sufficient time for suppliers, contractors or consultants to  prepare and submit their applications, taking into account the reasonable  need of the procuring entity and  \n" +
                "(e)\tany other requirement that may be established by the procuring entity in conformity with this Law and procurement regulations relating to the  preparation and submission of applications to pre-qualify and to the  prequalification proceedings.  \n" +
                "\n" +
                "(4)\tThe procurement entity shall respond to any request by a supplier, contractor or  consultant for clarification of the prequalification documents if the request is made at least ten days before the deadline for the submission of applications to pre-qualify.   \n" +
                "\n" +
                "(5)\tThe response by the procuring entity shall be given within a reasonable time and in  any event within a period of at most seven working days so as to enable the supplier,  contractor or consultant to make a timely submission of its application to pre-qualify.  \n" +
                "\n" +
                "(6)\tThe response to any request that might reasonably be expected to be of interest  to other suppliers, contractors or consultants shall, without identifying the source of the request, be communicated to other suppliers or contractors or consultants  \n" +
                "\t\tprovided with the prequalification documents by the procuring entity.  \n" +
                "\n" +
                "(7)\tA procuring entity shall promptly notify each supplier, contractor or consultant which submitted an application to pre-qualify of whether or not it has been prequalified and shall make available to any member of the general public upon  request, the names of the suppliers, contractors or consultants who have been pre-qualified.    \n" +
                "\n" +
                "(8)\tSuppliers, contractors or consultants who have been pre-qualified may  participate further in the procurement proceedings.  \n" +
                "\n" +
                "(9)\tThe procuring entity shall upon request communicate to suppliers, contractors or consultants who have not been pre-qualified, the grounds for disqualification.  \n" +
                "\n" +
                "(10)\tThe procuring entity may require a supplier, contractor or service provider who has been pre-qualified  to demonstrate its qualification again in accordance with the same  criteria used to pre-qualified, the supplier, contractor or consultants.  \n" +
                "\n" +
                "(11)\tThe procuring entity shall promptly notify each supplier, contractor or service provider requested to demonstrate its qualifications again whether or not the  supplier, contractor or consultant has done so to the satisfaction of the procuring entity.  \n" +
                "\n" +
                "(12)\tThe procuring entity shall disqualify any supplier, contractor or service provider who fails to demonstrate its qualification again if requested to do so\n");
        Procurement_Section section21 = new Procurement_Section("Open Competitive Bidding","cat6","24.\t(1) Except as provided by this Law, all procurement of goods, works and services  by all procuring entities shall be conducted by open competitive bidding or other  competitive   .                 \n" +
                "bidding methods as approved by the Board.       bidding \n" +
                "\t.  \n" +
                "(2)Any reference to open competitive bidding in this Law means the process by   \twhich a procuring entity, based on previously defined criteria, effects public  procurements by offering to every interested bidder, equal simultaneous   \tinformation and opportunity to offer the goods, works and services needed.  (3)The winning bid shall be that which is the lowest evaluated responsive bid which has been responsive to the bid with regards to work specifications and  standards.  \n" +
                "\n" +
                "(4)The Governor may give approval in cases of established urgency and/or for  good reasons authorize the procuring entity or department to purchase goods  or procure special service directly but with benchmark prices established by  the Board in case of purchase of goods.\n");
        Procurement_Section section22 = new Procurement_Section("Invitations to Bid","cat6","25.\t(1)    Invitations to bid may be either by way of National Competitive Bidding or           Invitations \t  International Competitive Bidding and the Bureau shall from time to time set                    to bid.  \n" +
                "\t\tthe monetary thresholds for which procurements shall fall under either system.  \n" +
                "\n" +
                "(2)Every invitation to an open competitive bid shall:  \n" +
                "\n" +
                "(i)\tin the case of goods, works and services under International   \n" +
                "Competitive Bidding,  be advertised in at least two national news-                                                       papers and one relevant internationally recognized publication, any          official websites of the procuring entity and the Bureau as well as the procurement journal not less than six weeks before the deadline for  submission of the bids for the goods, works and services.  \n" +
                "\n" +
                "(ii)\tin the case of goods and works valued under National Competitive Bidding, be advertised on the notice board of the procuring entity, any  official websites of the procuring entity, at least  one national newspapers, one (1)  local newspapers and in the procurement journal not less than six weeks before the deadline for submission of the bids for the goods, works and services.  \n");
        Procurement_Section section23 = new Procurement_Section("Bid Security","cat6","26.\t(1)  Subject to the monetary and prior review thresholds as may from time to time                     Bid \tbe set by the Bureau all procurements valued in excess of the sums prescribed                     security \n" +
                "\tby the Bureau shall require a bid security in an amount not more than 2% of the    bid price by way of a bank guarantee issued by a reputable bank acceptable to  the procuring entity;  \n" +
                "\n" +
                "(2)\tThe Bureau shall from time to time specify the principal terms and conditions of the required bid security in the tender documents.  \n" +
                "\n" +
                "(3)\tWhen the procuring entity requires suppliers or contractors submitting  tenders to provide a bid security the requirement shall apply to each    \tsupplier or contractor.  \n" +
                "\n");
        Procurement_Section section24 = new Procurement_Section("Submission of Bids","cat6","27.\t(1)      All bids in response to an invitation to open competitive bidding shall             Submission    be submitted in writing and in addition to any other format stipulated in                            of  bids. \n" +
                "the tender documents, signed by an official authorized to bind the bidder   to a contract and placed in a sealed envelope.  \n" +
                "\n" +
                "(2)\tAll submitted bids shall be deposited in a secured tamper-proof bid-box.  \n" +
                "\n" +
                "(3)\tAll bids submitted shall be in English language.  \n" +
                "\n" +
                "(4)\tThe procuring entity shall issue a receipt showing the date and time the bid was delivered.  \n" +
                "\n" +
                "(5)\tAny bid received after the deadline for the submission of bids shall not be  opened and must be returned to the supplier or contractor which submitted it.  \n" +
                "\n" +
                "(6)\tNo communication shall take place between procuring entities and any  supplier or contractor after the publication of a bid solicitation other than as    \tprovided in the Law.  \n");

        Procurement_Section section25 = new Procurement_Section("Rejection of Bids","cat6","28.\tA procuring entity may:                            \n" +
                "\n" +
                "(a)\treject all bids at any time prior to the acceptance of a bid, without incurring                  Rejection thereby any liability to the bidders; andof  bids. \n" +
                "\n" +
                "(b)\tcancel the procurement proceedings in the public interest, without incurring  any liability to the bidders.\n");
        Procurement_Section section26 = new Procurement_Section("Validity period of withdrawal ","cat6","1)   The period of validity for a bid shall be the period specified in the tender documents.             \n" +
                "of \n" +
                "(2)A procuring entity may request suppliers or contractors to extend the period of                       modification validity for an additional specified period of time.                                                                     and     \t\n" +
                "                                                                                withdrawal    (3)A supplier or contractor may refuse the request for the extension of bid, in which of tenders. case the effectiveness of its bid will terminate upon the expiration of the   unextended period of effectiveness.  \n" +
                "\n" +
                "(4)\tA supplier or contractor may modify or withdraw its bid prior to the deadline for the submission of bids.  \n" +
                "\n" +
                "(5)\tThe modification or notice of withdrawal is effective if it is received by the procurement entity before the deadline for the submission of tenders.\n");
        Procurement_Section section27 = new Procurement_Section("Bid Openings","cat6","30.\tAll bids shall be submitted before the deadline or date specified in the tender                                  Bid  documents or any extension of the deadline for submission and the procuring                                 openings entity shall:  \n" +
                "\n" +
                "(a)\tpermit attendees to examine the envelopes in which the bids have been submitted to ascertain that the bids have not been tampered with;  \n" +
                "\n" +
                "(b)\tcause all the bids to be opened in public, in the presence of the bidders                                                    or  their representatives and any interested member of the public;  \n" +
                "\n" +
                "(c)\tensure that the bid opening takes place immediately following the deadline stipulated for the submission of bids or any extension thereof;  \n" +
                "\n" +
                "(d)\tensure that a register is taken of the names and addresses of all those  present at the bid opening and the organizations they represent which is   \trecorded by the secretary of the tenders board; and  \n" +
                "\n" +
                "(e)\tcall-over to the hearing of all present, the name and address of each bidder,  \n" +
                "the total amount of each bid, the bid currency and shall ensure that details                                                              are recorded by the secretary of the Tenders Board or his delegate in   \n" +
                "the minutes of the bid opening.  \n" +
                "\n");
        Procurement_Section section28 = new Procurement_Section("Examination of Bids","cat6","31.\t(1)   All bids shall be first examined to determine if they:                                                           Examinationof bids. \n" +
                "(a)\tmeet the minimum eligibility requirements stipulated in the bidding     documents;  \n" +
                "\n" +
                "(b)\thave been duly signed;  \n" +
                "\n" +
                "(c)\tare substantially responsive to the bidding documents: and  \n" +
                "\n" +
                "(d)\tare generally in order.  \n" +
                "\n" +
                "(2)\tA procuring entity may ask a supplier or a contractor for clarification of its bid  submission in order to assist in the examination, evaluation and comparison of bids.  \n" +
                "\n" +
                "(3)\tThe following shall not be sought, offered or permitted:  \n" +
                "\n" +
                "(a)\tchanges in prices;  \n" +
                "\n" +
                "(b)\tchanges of substance in bid; and  \n" +
                "\n" +
                "(c)\tchanges to make an unresponsive bid responsive.  \n" +
                "\n" +
                "(4)\tNotwithstanding sub-Section (3) the procuring entity may correct purely  arithmetical errors that are discovered during the examination  of tenders.  \n" +
                "\n" +
                "(5)\tThe procuring entity shall give prompt notice of the correction to the supplier or       Contractor that submitted the tender.  \n" +
                "\n" +
                "(6)\tA major deviation shall result in a rejection of bid while a minor deviation shall be subject to clarification.  \n" +
                "\n" +
                "(7)\tThe following shall be considered as major deviations:  \n" +
                "\n" +
                "\t         (a)  with respect to clauses in an offer:  \n" +
                "\n" +
                "(i)\tunacceptable sub-contracting;  \n" +
                "\n" +
                "(ii)\tunacceptable time schedule if time is of essence;  \n" +
                "\n" +
                "(iii)\tunacceptable alternative design, and  \n" +
                "\n" +
                "(iv)\tunacceptable price adjustment;  \n" +
                "\n" +
                "\t(b)  with respect to the status of the bidder:  \n" +
                "\n" +
                "(i)\tthe fact that he is ineligible or not pre-qualified, and  \n" +
                "\n" +
                "(ii)\tthe fact that he is uninvited;  \n" +
                "\n" +
                "(c)\twith respect to bid documents in an unsigned bid;  \n" +
                "\n" +
                "(d)\twith respect to time, date and location for submission:  \n" +
                "\n" +
                "(i)\tany bid received after the date and time for submission  stipulated in the solicitation document;  \n" +
                "\n" +
                "(ii)\tany bid submitted at the wrong location.  \n" +
                "\n" +
                "(8)\tIn cases of major deviations, bids shall not be considered any further and,  where unopened, shall be returned as such to the bidder.        \n" +
                "\n" +
                "(9)\tIn all cases of rejection, a letter stipulating the reasons for rejection shall be sent, and the bidder shall not be permitted to amend his bid to become compliant.  \n" +
                "\n" +
                "(10)\tSubject to any provision to the contrary, the following shall be considered as minor deviations:  \n" +
                "\n" +
                "(a)\tthe use of codes;  \n" +
                "\n" +
                "(b)\tthe difference in standards;  \n" +
                "\n" +
                "(c)\tthe difference in materials;  \n" +
                "\n" +
                "(d)\talternative design;    \n" +
                "\n" +
                "(e)\talternative workmanship;  \n" +
                "\n" +
                "(f)\tmodified liquidated damages;  \n" +
                "\n" +
                "(g)\tomission in minor items;  \n" +
                "\n" +
                "(h)\tdiscovery of arithmetical errors;  \n" +
                "\n" +
                "(i)\tsub-contracting that is unclear and questionable;  \n" +
                "\n" +
                "(j)\tdifferent methods of construction;  \n" +
                "\n" +
                "(k)\tdifference in  final delivery date;  \n" +
                "(l)\tdifference in delivery schedule;  \n" +
                "(m)\tcompletion period where these are not of essence ;  \n" +
                "(n)\tnon-compliance with some technical local regulation;  \n" +
                "(o)\tpayment terms ; and   \n" +
                "(p)\tany other condition that has little impact on the bid.  \n" +
                "(11)\tIn cases not mentioned above and where there exists a doubt as to whether a particular condition in a bid is a major or a minor deviation, the following rules shall apply:   \n" +
                "\n" +
                "(a)\twhere the impact on the costs is major, it shall be regarded as a major  deviation; and   \n" +
                "\n" +
                "(b)\twhere the impact on the costs is minor, it shall be regarded as a minor deviation.  \n" +
                "\n" +
                "(12)\tIn cases of minor deviations, written clarification may be obtained from the supplier or contractor and, where applicable, an offer made for the correction   of the minor deviation.     \n" +
                "\n" +
                "(13)\tWhere a supplier or contractor does not accept the correction of a minor  deviation, his bid shall be rejected.  \n" +
                "\n" +
                "(14)\tAt the stage of evaluation and comparison, all minor deviations shall be                                                         quantified in monetary terms.  \n" +
                "\n" +
                "(15)\tFor the rejection of a bid, a written notice shall be given promptly to the supplier.  \n" +
                "\n");
        Procurement_Section section29 = new Procurement_Section("Bid Evaluation","cat6","1)      For the evaluation and comparison of bids that have been adjudged as valuation                    Bid valid for the purposes of evaluation, no other method or criteria shall be  used                     evaluation except those stipulated in the solicitation documents.  \n" +
                "\n" +
                "(2)\tThe objective of bid evaluation shall be to determine and select the lowest                                                     evaluated responsive bid from bidders that have responded to the solicitation.  \n" +
                "\n" +
                "(3)\tIn the course of its determination of the lowest evaluated responsive bid                                                        by the bidders that have responded to the bid solicitation, the  Technical Sub-                                                Committee of  the Tenders  Board shall, in particular, undertake the following                                               processes as applicable:  \n" +
                "\n" +
                "(a)\tchecking  of deviations;  \n" +
                "\n" +
                "(b)\tchecking of omissions with quantification of same;    \n" +
                "\n" +
                "(c)\tapplication  of discounts, as applicable;  \n" +
                "\n" +
                "(d)\tclarification with bidders of questionable minor deviations;  \n" +
                "\n" +
                "(e)\tquantification in monetary terms of  such questionable deviation;  \n" +
                "\n" +
                "(f)\tconversion to common currency;  \n" +
                "\n" +
                "(g)\tcalculation and tabulation of bid amount with domestic preference  where applicable;  \n" +
                "\n" +
                "(h)\tdetermination of the lowest calculated prices in order of rank; postqualification of bidders, where applicable;  \n" +
                "\n" +
                "(i)\tlisting of rejection of bids, where applicable;  \n" +
                "\n" +
                "(j)\tdecision  of  rejection  of all bids where justifiable;  \n" +
                "\n" +
                "(k)\trecommendation for award; and  \n" +
                "\n" +
                "(l)\twriting up of the  bid evaluation report.  \n" +
                "\n" +
                "(4)\tAll relevant factors, in addition to price, that will be considered for the  purposes of bid evaluation and the manner in which such factors will be  applied shall be stipulated in the solicitation documents. \n" +
                "\n" +
                "(5)\tSuch factors shall be calculated in monetary terms as stipulated in the             Solicitation documents and shall include:  \n" +
                "\n" +
                "(a)\tfor goods, among  others, costs of transportation and insurance, payment schedule, delivery time, operating costs, efficiency compatibility of  the  equipment, availability of services and spare parts, related training , safety, environmental benefits  or loses by damages;    \n" +
                "\n" +
                "(b)\tfor works, in addition to factors stipulated in Section 34(1) of  this Law, and subject to section 34(2) of this  Law, if time is a critical factor, the value of  early completion ; and  \n" +
                "\n" +
                "(c)\tthe value of early completion under Section 35(2) of this Law shall not be taken into account unless, in conformity with criteria preset in the bidding  documents, these conditions  of contract provide for commensurate                                                      penalties in case of late delivery.  \n" +
                "\n" +
                "(6)\tWhere bid prices are expressed in two or more currencies, the prices of all bids shall  be converted to Nigerian currency, according to the rate and date of rate specified in the solicitation documents.  \n" +
                "\n" +
                "(7)\tIf suppliers were pre-qualified, verification of the information provided in  the submission for prequalification shall be confirmed at the time of award of  contract and award may be denied  to a bidder who no longer has the capability or resources to successfully perform the contract  \n" +
                "\n" +
                "(8)\tAfter opening of bids, information relating to the examination, clarification                                               and evaluation of bids and recommendations concerning award shall not be   \n" +
                "disclosed to bidders or to persons not officially concerned with the evaluation                                                        process  until the  successful bidder is notified of the award.  \n");
        Procurement_Section section30 = new Procurement_Section("Acceptance of Bids","cat6","33.\t(1)      The successful bid in terms of goods and work shall be that submitted by the                    Acceptance            lowest cost bidder from the bidders responsive as to the bid solicitation.                                     of bids\n" +
                "\n" +
                "(2)\tNotwithstanding subsection (1) the selected bidders need not be the lowest cost bidder provided the procuring entity can show good grounds to that effect.  \n" +
                "\n" +
                "(3)\tNotice of the acceptance of the bid shall immediately be given to the successful  \n" +
                "bidder.\n");
        Procurement_Section section31 = new Procurement_Section("Domestic Preference","cat6","34\t.  (1)    A procuring entity may grant a margin of preference in the evaluation of tenders,Domestic when comparing tenders from domestic bidders with those  from foreign  bidders             preference  or when comparing tenders from domestic suppliers offering goods manufactured locally with those offering goods manufactured abroad.  \n" +
                "\n" +
                "(2)\tWhere a procuring entity intends to allow domestic preferences, the Bidding  documents shall clearly indicate any preference to be granted to domestic  suppliers and contractors and the information required to establish the eligibility  of a  bid for such preference.  \n" +
                "\n" +
                "(3)\tMargins of preference shall apply only to tenders under international competitive bidding.  \n" +
                "\n" +
                "(4)\tThe Bureau shall by regulation from time to time set limits and the formulae for the computation of margins of preference and determine the contents of goods  manufactured locally. \n");
        Procurement_Section section32 = new Procurement_Section("Fee Mobilizations","cat6","35\t.   (1)    In addition to any other regulations as may be prescribed by the Bureau a mobili-                 Mobilization zation fee of not more than 30% may be  paid to a supplier or  contractor supported               fee by the following:       \n" +
                "\n" +
                "(a)\tin the case of National Competitive Bidding – an unconditional  bank  guarantee or insurance bond or institution acceptable to the procuring entity; and    \n" +
                "\n" +
                "(b)\tin the case of  International Competitive Bidding – an unconditional bank guarantee insured by a banking institution acceptable to the procuring entity once a mobilization fee has been paid to any supplier or contractor, no further  payment shall be made to the supplier or contractor without an interim performance certificate issued in accordance with the contract agreement\n");
        Procurement_Section section33 = new Procurement_Section("Contract Performance","cat6","36.\tThe provision of Contract Performance Guarantee shall be a condition where any                   Contract                      mobilization fee is to be paid.  Provided however it shall not be less than 10% of the contractPerformancevalue in an case or an amount equivalent to the mobilization fee requestedby the supplierGuarantee\n" +
                "or contractor, whichever is higher.\n");
        Procurement_Section section34 = new Procurement_Section("Interested of Delay Payment","cat6","37.\t(1)     Payment for the procurement of goods, works, and services shall be settled                           Interest of\n" +
                "promptly and diligently.      \t\t\t\t\t\tdelayed payments \n" +
                "(2)\tAny  payment due for more than sixty days from the date of the Submission of the  invoice, valuation certificate or confirmation on authentication by the Ministry;            Extra-Ministerial Office, government Agency, parastatal or corporation shall be  deemed a delayed payment.  \n" +
                "\n" +
                "(3)\tAll delayed payments shall attract interest at the rate specified in the contract document.  \n" +
                "\n" +
                "(4)\tAll contracts shall include terms, specifying the interest for late payment of  more than sixty days.   \n");
        Procurement_Section section35 = new Procurement_Section("Recorded Procurement Proceedings","cat6","38   (1)    Every procuring entity shall maintain record of the comprehensive procurement                   Recorded proceedings.                                                               \t\t\tprocurement \n" +
                "proceedings \n" +
                "(2)\tThe record referred to in this Section (1) shall, on request, be made available to:  \n" +
                "\n" +
                "(a)\tany person after a tender, proposal, offer or quotation has \n" +
                "been   \n" +
                "accepted or after procurement proceedings have been terminated   without resulting in a procurement contract; and   \n" +
                "\n" +
                "(b)\tsuppliers, contractors or consultants that submitted tenders, proposals, offer or quotations, or applied for prequalification, after a tender proposal, offer or quotation has been accepted or procurement proceeding have been terminated without resulting in a procurement contract.  \n" +
                "\n" +
                "(3)\tA disclosure of procurement proceeding records, prior to award of contract may be ordered by a Court, if its disclosure would not:  \n" +
                "\n" +
                "(a)\tbe contrary to law;  \n" +
                "\n" +
                "(b)\timpede law enforcement; or   \n" +
                "\n" +
                "(c)\tprejudice legitimate commercial interests  of  the parties.  \n" +
                "\n" +
                "(4)\tThe procuring entity shall not be liable to suppliers, contractors or service providers for damages owing solely to failure to maintain a record of the procurement  proceeding in accordance with this Section.  \n" +
                "\n" +
                "(5)\tThe records and documents maintained by procuring entities on procurement shall  be made available for inspection by the Bureau, an investigator appointed by the  Bureau  and the Auditor-General upon request, and where donor funds have been  used for the procurement, donor officials shall also have access upon request to  procurement files for the purpose of audit and review.  \n");
        Procurement_Section section36 = new Procurement_Section("Two Stage Tendering","cat7",".(1)   Notwithstanding the provisions of this Law, the Bureau may issue                                      Two stage \n" +
                "                ‘Certificate of No. Objection’ upon conditions hereinafter prescribed;                                  tendering \n" +
                "\n" +
                "\t(2)\tA procuring entity shall engage in procurement by two stage tendering:  \n" +
                "\n" +
                "(a)\twhere it is not feasible for the procuring entity to formulate detailed specifications for the goods or works or, in the case of  services, to  identify their characteristics and where it seeks  tenders, proposals or  offers on various means of meeting its needs in order to obtain the   \n" +
                "\tmost satisfactory solution to its procurement needs;    \n" +
                "\n" +
                "(b)\twhere the character of the goods or works are subject to rapid  technological advances; where the procuring entity seeks to enter into a contract  for research, experiment, study or development,  \n" +
                "except where the contract includes the production of goods in sufficient quantities to establish their commercial viability  or to  \n" +
                "recover research and development costs, where the procuring entity  \n" +
                "applies this  Law to procurement concerned with State security and determines that the selected method is the most appropriate method  of procurement; or  \n" +
                "\n" +
                "(c)\twhere the tender proceedings have been utilized but were not successful  or the tenders were rejected by the procuring entity under an open compe- titive bid procedure and the procuring entity considers that engaging in   new tendering proceedings will not result in a procurement contract.  \n" +
                "\n" +
                "(3)\tThe provisions of this Law as regards the process for open competitive bidding   shall apply to two-stage tendering proceedings except to the extent that those   \n" +
                "provisions vary from this Section.  \n" +
                "\n" +
                "(4)\tThe invitation documents:  \n" +
                "\n" +
                "(a)\tshall call upon suppliers or contractors to submit, in the first stage of twostage tendering proceedings, initial tenders which contain their proposals without a tender price; and  \n" +
                "\n" +
                "(b)\tmay solicit proposals that relate to technical, quality or other  characteristics of  the goods, works or services as well as contractual  terms and conditions of supply and may stipulate the professional  competence and technical qualifications of the suppliers or  contractors.   \n" +
                "\n" +
                "(5)\tThe procuring entity may, in the first stage, engage in negotiations with any supplier or contractor whose tender has not been rejected under an open  competitive bidding procedure with respect to any aspect of its tender.  \n" +
                "\n" +
                "(6)\tIn the second stage of the two-tender proceedings the procuring entity:  \n" +
                "\n" +
                "(a)\tshall invite suppliers or contractors whose tenders have not been  rejected to submit final tenders with prices on a single set of  specifications;  \n" +
                "\n" +
                "(b)\tmay,  in formulating the specifications, delete or modify any aspect of the technical or quality characteristics of the goods, works or   \n" +
                "services to be procured together with any criterion originally set out in these \n" +
                "documents, evaluate and compare tenders and ascertain the  successful tender;  \n" +
                "\n" +
                "(c)\tmay add new characteristics or criteria that conform with this Law;  \n" +
                "\n" +
                "(d)\tshall communicate to suppliers or contractors in the invitation to  submit firm tenders without any deletion, modification or addition;  and  \n" +
                "\n" +
                "(e)\tmay permit a supplier or contractor who does not wish to submit   a final tender to withdraw from the tendering proceedings.  \n" +
                "\n" +
                "(7)\tThe final tenders shall be evaluated and compared in order to ascertain     the successful  tenders as defined in an open competitive bid.   \n" +
                "\n");
        Procurement_Section section37 = new Procurement_Section("Restricted Tendering","cat7","40.\t(1)    Subject to rules issued by the Bureau, a procuring entity may for reasons                         Restricted  of economy and efficiency, engage in procurement by means of restricted                       tendering tendering if:                                  \n" +
                "\n" +
                "(a)\tthe goods, works or service are available only from a limited number   of suppliers or contractors;  \n" +
                "\n" +
                "(b)\tthe time and cost required to examine and evaluate large number of tenders is disproportionate to the value of the goods, works or services  to be procured; or  \n" +
                "\n" +
                "(c)\tthe procedure is used as an exception rather than norm.  \n" +
                "\n" +
                "Provided that the Governor shall have the power to give approval for selective                                                   tendering pending when the rules referred to in section 40 (1) are issued.  \n" +
                "\n" +
                "(2)\tWhere a procuring entity engages in restricted tendering on the basis that:  \n" +
                "\n" +
                "(a)\tthe goods, works and services are available only from a limited   number  of suppliers or contractors, it shall invite tenders from all  suppliers and contractors who can provide the goods, works or  services; and  \n" +
                "\n" +
                "(b)\tthe time and cost required to examine and evaluate a large number of  tenders is disproportionate to the value of the goods, works or services, it shall select in a non-discriminatory manner of the number  of suppliers   or contractors to ensure effective competition.  \n" +
                "\n" +
                "(3)\tFor the purposes of subsection (2), the procuring entity shall cause a notice of  the selected tendering proceedings to be published in the procurement journal.  \n" +
                "\n" +
                "(4)\tThe provisions of this Law regarding the open competitive bidding procedure  shall apply to the selective tendering proceedings, except to the extent that those provisions are varied by this Section\n");
        Procurement_Section section38 = new Procurement_Section("Request Quotations","cat7","41.\t(1)     A procuring entity may carry out direct procurement by requesting for                              Request for            quotations from suppliers or contractors where the value of the goods or works                quotations              to be procured does not exceed a sum that shall be set in the procurement                                                   regulation.  \n" +
                "\n" +
                "(2)\tGenerally, quotations shall be obtained from at least three (3) unrelated                                                      contractors or suppliers.  \n" +
                "\n" +
                "(3)\tEach contractor or supplier from whom a quotation is requested shall:  \n" +
                "\n" +
                "(a)\tbe informed whether any factor other than the charges for the goods, works  or services themselves, such as any applicable transportation and insurance  charges, customs duties and taxes are to be included in the price; and   \n" +
                "\n" +
                "(b)\tgive only one quotation and shall not be allowed to change or vary the quotation.  \n" +
                "\n" +
                "(4)\tNo negotiation shall take place between a procuring entity and a contractor or supplier with respect to a quotation.  \n" +
                "\n" +
                "(5)\tThe procurement shall be awarded to the qualified contractor or supplier that  gives the lowest priced responsive quotation.  \n" +
                "\n" +
                "(6)\twhere the total value of the procurement is not more than a sum that  shall be set in the regulation, the procurement entity may not obtain the Bureau’s approval.\n");
        Procurement_Section section39 = new Procurement_Section("Direct procurement ","cat7","42.\t(1)     A procuring entity may carry out any direct procurement where:   \n" +
                "(a)\tgoods, works or services are only available from a particular supplier or contractor or if a particular supplier or contractor has exclusive rights in  respect of the goods, works or services, and no reasonable alternative or  substitute exits; or  \n" +
                "\n" +
                "(b)\ta procuring entity which has procured goods, equipment, technology or services from a supplier or contractor, determines that;  \n" +
                "\n" +
                "(i)\tadditional supplies need to be procured from that supplier or contractor because of standardization,  \n" +
                "\n" +
                "(ii)\tthere is a need for compatibility with existing goods, equipment, technology or services, taking into account the effectiveness of the  original procurement in meeting the needs of the procurement entity;  \n" +
                "\n" +
                "(iii)\tthe limited size of the proposed procurement in relation to the original procurement provides justification.  \n" +
                "\n" +
                "(iv)\tthe reasonableness of the price and the unsuitability of  alternatives to the goods or services in question merits the decision.  \n" +
                "\n" +
                "(c)\tthe procuring entity seeks to enter into a contract with the supplier or  contractor for research, experiment, study or development, except  where the contract includes the production of goods in quantities to  establish commercial  viability or recover research and  development  \n" +
                "costs; or                                                                                                                                                        \n" +
                "(d)\tthe procuring entity applies this Law for procurement that concerns \n" +
                "            State security, and determines that single-source procurement is the most  appropriate methods of procurement.  \n" +
                "\n" +
                "(e)\ta procurement entity may also engage in force account to procure minor  works, goods and equipment in line with prior review thresholds set by the  Board and receipts of benchmarks and a ‘No Objection’ from the Bureau.  \n" +
                "\n" +
                "(2)\tThe procuring entity:  \n" +
                "\n" +
                "(a)\tmay procure the goods, works or services by inviting a proposal  or price quotation from a single supplier or contractor;  \n" +
                "\n" +
                "(b)\tshall include in the record of procurement proceedings a statement  of the grounds for its decision and the circumstance in justification  of single source procurement\n");
        Procurement_Section section40 = new Procurement_Section("Procurement Emergency","cat7","1)     A procuring entity may for the purpose of this Law, carry out an emergency                       \n" +
                "Emergency procurement where:                                                                                                        procurement \n" +
                "\n" +
                "(a)\tthe State is either seriously threatened by or actually confronted with a disaster, catastrophe, insurrection or act of  God:    \n" +
                "\n" +
                "(b)\tthe  condition or quality of goods, equipment, building or public owned capital goods may seriously deteriorate unless action is urgently and necessarily taken to maintain them  in their actual values or  usefulness; or  \n" +
                "\n" +
                "(c)\ta public project may be seriously delayed for want of an item of a minor value.  \n" +
                "\n" +
                "(d)\tthere is an urgent need for the goods, works or services and engaging in    tender proceedings or any other method of procurement is impractical due  to unforeseeable circumstances giving rise to the urgency which is not the result of dilatory conduct on the part of the procuring entity:  \n" +
                "\n" +
                "(e)\towing to a catastrophic event, there is an urgent need for the goods, works or services, making it impractical to use other methods of procurement because of the time involved in using those methods;  \n" +
                "\n" +
                "(2)\tIn an emergency situation, a procuring entity may engage in direct contracting  of goods, works and services.  \n" +
                "\n" +
                "(3)\tAll procurements made under emergencies shall be handled with expedition                                                   but along principles of accountability, due consideration being given to the                                                     gravity of each emergency.  \n" +
                "\n" +
                "(4)\tImmediately after the cessation of the situation warranting any emergency  procurement, the procuring entity shall file a detailed report thereof with the    Bureau which shall verify same and if appropriate issue a Certificate of   \n" +
                "‘No Objection;  \n");
        Procurement_Section section41 = new Procurement_Section("Expression Of Interest To Provide","cat8","44.\tWhere a procuring entity wishes to procure services for its needs, which are precise                 Expressions \n" +
                "and ascertainable:                                                                                                                          of interesttoprovide services                               \n" +
                "(a)\tit shall solicit for expressions of interest or applications to pre-qualify  to                 for ascertained              provide the services by publishing a notice to that effect in at least one (1)                needs \n" +
                "national newspaper, one (1) local newspaper and the procurement journal;  \n" +
                "\n" +
                "(b)\twhere the value of the services to be procured is less than one million  naira, or with the approval of the Bureau, of such a low value that only  \n" +
                "local consultants would be interested, the procuring entity may without                                                                   placing any notice request at least three (3) and not more than ten (10)  consultants or service providers to make proposals for the provision  of the services in a format stipulating;  \n" +
                "\n" +
                "(i)\ta statement of qualifications of the consultant to provide the service;  \n" +
                "\n" +
                "(ii)\ta statement of understanding of the procuring entity’s needs;   \n" +
                "\n" +
                "(iii)\tthe methodology for providing the service;   \n" +
                "\n" +
                "(iv)\tthe time frame for providing the service; and.  \n" +
                "\n" +
                "(v)\tthe cost or fee for the service.  \n");
        Procurement_Section section42 = new Procurement_Section("Request for proposals","cat8","A procuring entity wishing to procure services for its needs may do so by                      Request for requesting for proposals when it intends to enter into a contract for  the                         proposals to purpose of research, experiment,  study or development, except where the                    provide services contract includes the production of goods  in quantities sufficient to establish               for unascertained their commercial viability or to recover research and development  cost.                       needs.\n" +
                "\n" +
                "(2)\tThe procuring entity shall procure the services of consultants by soliciting for expressions of interest by publishing a notice to that effect in one nation-  \n" +
                "al newspaper, one (1) local newspaper and the procurement journal.  \n" +
                "\n" +
                "(3)\tA procuring entity may make direct requests to a limited number of   consultants, requesting proposals for the provision of a service if:   \n" +
                "\n" +
                "(a)\tthe services are only available from no more than three (3) consultants;  \n" +
                "\n" +
                "(b)\tthe time and  cost required to examine and evaluate a large number of proposals would be disproportionate to the value of the services  to the performed, provided that it invites enough consultants to ensure transparent competition; or  \n" +
                "\n" +
                "(c)\tit is in the interest of State’s security or similar reason ofconfidentiality.   \n");
        Procurement_Section section43 = new Procurement_Section("Content of request for proposals","cat8","46.\t(1)     Request for proposals shall include:    \t\tContent ofrequest \n" +
                "(a)\tthe name and address of the procurement entity;                                                                for proposals. \n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "(b)\ta requirement that the proposals are to be prepared in the English  language;                        \n" +
                "\n" +
                "(c)\tthe manner, place and deadline for the submission of proposals;  \n" +
                "(d)\ta statement to the effect that the procuring entity reserves the right to reject  proposals;   \n" +
                "\n" +
                "(e)\tthe criteria and procedures for the evaluation of the qualification of   \n" +
                "the consultants; \n" +
                "(f)\tthe requirements on documentary evidence or other information that  shall be submitted by consultants to demonstrate their qualifications;  \n" +
                "\n" +
                "(g)\tthe nature and required characteristics of the services to be procured including the location where the services are to be provided and the  time when the services are  to be provided  ;  \n" +
                "\n" +
                "(h)\twhether the procuring entity is seeking proposals on various possible ways of meeting its needs;  \n" +
                "(i)\ta requirement that the proposal price is to be expressed in Nigeria  currency;  \n" +
                "\n" +
                "(j)\tthe manner in which the proposal price is to be expressed, including a statement on whether the price covers elements apart from the cost of services, such as reimbursement  for transportation, lodging, insurance, use of equipment, duties or taxes ;  \n" +
                "\n" +
                "(k)\twhether the procedure to ascertain the successful proposal shall be based on  the lowest cost or quality and  or a combination of the lowest cost,   \n" +
                "quality and criteria other that cost but stipulated in the request for proposals; and       \n" +
                "(l)\ta short list to be made of only national consultants for consulting assignment,  contract within a set threshold in the procurement regulation provided that national consultants possess such requisite skills  \n" +
                "\n" +
                "(2)\tThe procuring entity shall provide the same information to every consultant    \trequested to submit proposals.  \n");


        Procurement_Section section44 = new Procurement_Section("Clarifications and modification of requests","cat8","47.\t(1)   The Consultant shall be allowed to request for clarification on the request from the               \n" +
                "Clarification procuring entity and such request may be made within a reasonable time to beand  specified.   \t\t\t\t\t\t\tmodification\t\t\t\t\t\t\t\t\tof requests.  \n" +
                "(2)\tA procuring entity may, whether on its initiative or as a result of request for                 the clarification by a consultant, modify the request for proposals by issuing   an addendum at any time prior to the deadline for submission of proposals.  \n" +
                "\n" +
                "(3)\tThe addendum shall be communicated promptly before the deadline for the submission of proposals to the short listed consultants to whom the procuring  entity has provided the request for proposals and shall be binding on those  consultants.  \n" +
                "\n" +
                "(4)\tIf the procuring entity convenes a meeting of consultants, it shall prepare minutes of the meeting containing the issues submitted at the meeting for clarification of the    request for  proposal  and its responses to those issues without identifying the sources of the requests for clarifications.  \n" +
                "\n" +
                "(5)\tThe minutes shall be provided promptly before the deadlines for the submission   of proposals to the consultants participating in the selection proceedings to enable      them take the minutes into account in their proposals.  \n" +
                "\n");
        Procurement_Section section45 = new Procurement_Section("Submission of Proposals","cat8","48.\t(1)   The procuring entity shall allow sufficient time for the preparation and submission                  Submissionof the requested proposals but shall in no case give less proposals than  thirty (30)                   ofproposals. days between the issue of the notice or request and the deadline for submission.     \n" +
                "\n" +
                "(2)\tThe technical and financial proposals shall be submitted simultaneously but in separate envelopes.  \n" +
                "\n" +
                "(3)\tA proposal received after the deadline for submission of proposals, shall be returned  to the sender unopened.     \n" +
                "\n" +
                "(4).   Immediately after the deadline for submission of proposals, the technical proposals  shall be opened for evaluation whilst the financial proposals shall remain sealed and kept in a secure bid-box until they are opened publicly.  \n" +
                "\n" +
                "(5)    The technical evaluation committee shall not have access to or insight to the financial proposals until the evaluations including any Tender Boards review are concluded\n");
        Procurement_Section section46 = new Procurement_Section("Criteria of Evaluation of Proposals","cat8","49.\t(1)   The procuring entity shall establish criteria to evaluate the proposals and prescribe                Criteria \n" +
                "for \n" +
                "the relative weight to be accorded to each criterion and the manner in which                          evaluation  they are to be applied in the evaluation of :                                                                               proposals\n" +
                "(a)\tthe qualification, experience reliability, professional and managerial competence  of the consultant or service provider and of the personnel to be involved in  providing the services ;  \t\n" +
                "\n" +
                "(b)\tthe effectiveness of the proposal submitted by the consultant or service provider  in meeting  the needs of the procuring entity ;  \n" +
                "\n" +
                "(c)\tthe proposal price, including any ancillary or related cost;  \n" +
                "\n" +
                "(d)\tthe effect that the acceptance of the proposal will have on the balance payments  position of the Government, the extent of participation by local personnel, the economic development potential offered by the proposal, including domestic investment or other business activity, the encouragement of employment, the transfer of technology, the development of managerial, scientific and operational skills and the counter trade arrangements offered by consultant or service providers ;  and  \n" +
                "\n" +
                "(e)\tState’s security considerations.  \n" +
                "\n" +
                "(2)\tA procuring entity may accord a margin of preference for local consultants or service providers, which shall be calculated in accordance with the regulations   \n" +
                "and guidelines as issued from time to time by the Bureau and shall be reflected                                                         in the record of the procurement proceedings.  \t\n" +
                "\n" +
                "50.\t(1)    The procuring entity shall include in the record of procurement a statement of  the grounds and circumstances on which it relied to select a successful bidder.  \n" +
                "\n" +
                "(2)\tNothing in this Section shall prevent the procuring entity from resorting to the use  of any impartial panel of experts to make the selection.  \n");
        Procurement_Section section47 = new Procurement_Section("Procedure of selection of proposals where price is a factor","cat8","51.\t(1)    Where the procuring entity elects to choose the successful proposal based on                  Proceduretechnical  and price factors, it shall establish a weight with respect to qualityfor selection and technical price factors of the proposals in accordance with the criteria other             proposal than price as might have been set out in the request for proposals and rate each              where price proposal in accordance with  such criteria and the relative weight and manner                is a factor.\n" +
                "of application of the criteria as stipulated in the request for proposals.                \n" +
                "\n" +
                "(2)\tThe procuring entity shall compare the price of those proposals that have attained a rating or above the threshold ;   \n" +
                "(3)\tThe procuring entity shall notify the consultants whose proposals did not meet the  minimum qualifying  mark or were non responsive to the invitation for proposals and terms of reference after the evaluation of quality is completed within a period of  fourteen (14) working days after the decision has been taken by the procurement entity;  \n" +
                "\n" +
                "(4)\tThe name of the qualifying consultants, the quality scores for the technical  component of the proposal shall be read aloud and recorded  alongside the price  proposed by each consultant or service provider when the financial proposals are opened.  \n" +
                "\n" +
                "(5)\tThe procuring entity shall prepare the minutes of public opening of financial proposals which shall be part of the evaluation report and shall retain this record.  \n" +
                "\n" +
                "(6)\tThe successful proposals shall be:  \n" +
                "\n" +
                "(a)\tthe proposals with the best combined evaluation in terms of the criteria  established under subsection (1) from prices in the case of  quality and                                                 cost-based selection;  \n" +
                "\n" +
                "(b)\tthe  responsive proposals with the lowest price in the case of least-cost selection; or  \n" +
                "\n" +
                "(c)\tthe responsive highest ranked technical proposal within the budget.  \n" +
                "\n" +
                "(7)\tThe consultants with the winning proposal shall be invited for negotiations, which shall focus mainly on the technical proposals.  \n" +
                "\n" +
                "(8)\tThe proposed unit rates for staff-months and reimbursable shall not be  negotiated unless there are exceptional reasons.  \n");
        Procurement_Section section48 = new Procurement_Section("Selection of proposals where price is not a factor","cat8","52.\t(1)    Where the procuring entity elects to make a quality-based selection based                        Selection\n" +
                "on consultant’s qualifications or single-source selection, it shall engage in                       procedure         negotiations with consultants in accordance with this Section.                                          where price                      is not a factor.     \n" +
                "(2)\tThe procurement entity shall:  \n" +
                "\n" +
                "(a)\testablish a weight with respect to quality and price of the  proposals;  \n" +
                "\n" +
                "(b)\tinvite for negotiations of the price of its proposal, the Consultant that   has attained the best rating in accordance with subsection (1);  \n" +
                "\n" +
                "(c)\tinform the Consultants that attained ratings above the weight that may be considered for negotiations if the negotiations with the consultant with the  best rating do not result in a procurement contract ; and  \n" +
                "\n" +
                "(d)\tinform the Consultant with the best rating, that it is terminating the negotiations if it becomes apparent to the procuring entity that the negotiations with that    Consultant invited under subsection (b), will not result in a procurement contract.  \n" +
                "\n" +
                "(3)\tThe procuring entity shall, if negotiations with the consultant with the best rating fails, invite the Consultant that obtained the second best rating, and if the negotiations with that Consultant do not result in a procurement contract, the procuring entity shall invite the other suppliers or contractors for negotiations on the basis of their rating until it arrives at a contract or rejects the remaining proposals.  \n" +
                "\n" +
                "(4)\tThe procuring entity shall treat proposals and any negotiations on selection procedure as confidential and avoid the disclosure of their contents to competing consultants.  \n" +
                "\n");
        Procurement_Section section49 = new Procurement_Section("Bureau to recommend investigations","cat9","53.\t(1)   The Bureau may review and recommend for investigation by any relevant authority          Bureau to any matter related to the conduct of procurement proceedings by a  procuring                    recommend entity, or the conclusion or operation of a procurement  contract if it considers that           investigation a criminal investigation is necessary or desirable to prevent or detect a contravention  of this Law.  \n" +
                "\n" +
                "(2)\tThe relevant authority may in the course of investigation:  \n" +
                "\n" +
                "(a)\trequire an officer, employee or agent of the procuring entity or bidder, \n" +
                "supplier, contractor, or consultant to produce any books, records, accounts                                            or  documents;  \n" +
                "\n" +
                "(b)\tsearch premises for any books, records, accounts or documents;  \n" +
                "\n" +
                "(c)\texamine and make extracts from and copies of books, records, accounts or documents of any procuring entity, bidder, supplier, contractor or consultant ;  \n" +
                "\n" +
                "(d)\tremove books, records, accounts or documents of the procuring entity, bidder, supplier, contractor or consultant for as long as may be necessary to examine  them or make extracts from or copies of them but the investigator shall give  a detailed receipts for the books, records, accounts or documents removed ;  \n" +
                "\n" +
                "(e)\trequire an officer, employee or agent of the procurement entity or bidder,   supplier, or contractor or consultant;  \n" +
                "\n" +
                "(i)\tto explain an entry in the books, records, accounts or documents;  \n" +
                "\n" +
                "(ii)\tto provide the investigator with information concerning the management    or activities of the procurement entity or bidders as may be reasonably  required;  \n" +
                "\n" +
                "(f)\texplain an entry in the books, records, accounts or documents ; and  \n" +
                "\n" +
                "(g)\tprovide the investigation with information concerning the management or activities of the procurement entity or bidders as may be reasonably required.  \n" +
                "\n" +
                "(3)\tThe Bureau may, pursuant to the advice of the procuring entity, results of its review   of a procurement or report of investigation by a relevant government agency issue a  variation order requiring a contractor at his own expense to repair, replace, or to do  anything in his or her contract left undone or found to have been carried out with   \n" +
                "inferior or defective materials or with less skill and expertise than required by the  contract of award.    \n" +
                "\n" +
                "(4)\tThe Bureau shall, if satisfied that there has been a contravention of this Law or any regulations in relation to procurement proceeding or procurement contracts, take action to rectify the contravention which action include :  \n" +
                "\n" +
                "(a)\tnullification of the procurement proceedings;  \n" +
                "\n" +
                "(b)\tcancellation of the procurement contract;  \n" +
                "\n" +
                "(c)\tratification  of anything done in relation to the proceeding; or  \n" +
                "\n" +
                "(d)\ta declaration consistent with the Ondo State Contract Management Manual  or any relevant provisions of this Law.  \n" +
                "\n" +
                "(5)\tOn completion of the investigation, the relevant authority shall if an offence is  disclosed, take all necessary steps to commence prosecution and inform the     Bureau and the procurement entity accordingly, but where no offence is disclosed,  the file shall be closed and the Bureau and procuring entity shall be duly informed.  \n");
        Procurement_Section section50 = new Procurement_Section("Administrative Review","cat9","54.\t(1)    A bidder may seek administrative review for any omission or breach by aAdministrativeprocuring or disposing entity under the provisions of this Act, or any regulations  review.  or guidelines made under this Act or the provisions of bidding documents.   \n" +
                "\n" +
                "(2)\tA complaint by a bidder against a procuring or disposing entity shall first be  submitted in writing to the accounting officer:  \n" +
                "\n" +
                "(a)\twithin fifteen working days from the date the bidder first became aware  of the circumstances giving rise to the complaint  or should have become aware of the circumstances, whichever is  earlier;  \n" +
                "\n" +
                "(b)\ton reviewing a complaint, the accounting  officer  shall make a decision in writing within  fifteen (15) working days from receipt of complaint  indicating the corrective measures to be taken if any, including the suspension  of the proceedings where he deems it necessary and giving reasons for his  decision; or  \n" +
                "\n" +
                "(c)\twhere the accounting officer does not make a decision within the period  specified in subsection (2) (b); or  \n" +
                "(d)\tIf the  bidder is not satisfied with the decision of the accounting officer, the  \n" +
                "bidder may make a complaint to the Bureau within ten (10) working days  from the date of communication of the decision of the accounting officer.  \n" +
                "\n" +
                "(3)\tUpon receipt of a complaint, the Bureau shall promptly:  \n" +
                "\n" +
                "(a)\tgive notice of the complaint to the respective procuring or disposing entity  and  suspend any further action by the procuring or disposing entity until  the Bureau has settled the matter:  \n" +
                "\n" +
                "(b)\tunless it dismisses the complaint:  \n" +
                "\n" +
                "(i)\tprohibit a procuring or disposing entity from taking any further action;  \n" +
                "\n" +
                "(ii)\tnullify in whole or in part an unlawful act or decision made by the  procuringor disposing entity ;  \n" +
                "\n" +
                "(iii)\tdeclare the rules or principles that govern the subject matter of the  complaint; and  \n" +
                "\n" +
                "(iv)\trevise an improper decision by the procuring or disposing entity or substitute its own decision for  such a decision.  \n" +
                "\n" +
                "(5)\tBefore taking any decision on a complaint, the Bureau shall notify all interested bidders of the complaint and may take into account representations from the  bidders and from the respective procuring or disposing entity.  \n" +
                "\n" +
                "(6)\tThe Bureau shall make its decision within twenty-one working days after receiving  the complaint, stating the reasons for its decisions and remedies granted, if any. \n" +
                "\n" +
                "(7)\tWhere the Bureau fails to render its decision within the stipulated time, or the bidder is not satisfied with decision of the Bureau, the bidder may appeal to the High Court within thirty (30) days after the receipt of the decision of the Bureau, or expiration of the time stipulated for the Bureau to deliver a decision.  \n");
        Procurement_Section section51 = new Procurement_Section("Disposal of Public Property","cat10","55.\t(1)   For the purposes of this Law, every procuring entity shall also be disposing entity.               Disposal      \n" +
                "of public\n" +
                "(2)\tThe open competitive bidding shall be the primary source of receiving offers for the              property    purchase of any public property offered for sale.  \n" +
                "\n" +
                "(3)\tThe Bureau shall, with the approval of the Board:  \n" +
                "\n" +
                "(a)\tdetermine, in line with the Ondo State Inventory, Material, Goods and Equipment          Management Manual, the applicable policies and practices in relation to the disposal of public property;  \n" +
                "\n" +
                "(b)\tissue guidelines detailing operational principle and organizational modalities to be adopted by all procuring entities in the disposal of public property:  and   \n" +
                "\n" +
                "(c)\tissue standardized document, monitor implementation, enforce compliance and set reporting standards that shall be used by all procuring entities involved in  the disposal of public property.  \n" +
                "\n" +
                "(4)\tFor the purpose of this Law, public property is defined as resources in the form of tangible and non-tangible assets (ranging from serviceable to the unserviceable):  \n" +
                "\n" +
                "(a)\tcreated through public expenditure;                                                                                                      \n" +
                "(b)\tacquired as a gift or through deeds ;  \n" +
                "(c)\tacquired in respect of intellectual or proprietary rights :  \n" +
                "(d)\tacquired on financial instruments (including shares, stocks, bonds etc; and (e)acquired by goodwill and any other gifts of the State Government.  \n" +
                "(5)\tThe means of the disposal of public assets shall include:  \n" +
                "\n" +
                "(a)\tsale and rental:  \n" +
                "(b)\tlease and hire purchase;  \n" +
                "(c)\tlicenses and tenancies;  \n" +
                "(d)\tfranchise and auction;  \n" +
                "(e)\ttransfers from one government department to another with or without financial adjustments; and  \n" +
                "(f)\toffer to the public at an authorized variation.  \n");
        Procurement_Section section52 = new Procurement_Section("Planning of Disposals","cat10","56.\t(1)    Before slating any public property for disposal, the accounting officer (whether                 Planning of acting in his own authority or at the direction of any superior  or other  authority)               disposals              in charge of any public property set for disposal shall  authorize the preparation  of a valuation report for such property by an  independent Evaluator, or such  professional with the appropriate competence to carry out the valuation in line  Ondo State Inventory, Material, Goods and Equipment Management Manual.  \n" +
                "\n" +
                "(2)\tThe disposal of assets whether or not listed in the Assets register for a procuring entity shall be planned and integrated into the income and expenditure budget projection of the procuring entity.  \n" +
                "\n" +
                "(3)\tThe disposal of assets referred to in subsection (2) shall be timed to take place  when the most advantageous returns can be obtained for the assets in order to maximize revenue accruing to the Government.  \n" +
                "\n" +
                "(4)\tAll procuring entities shall distribute responsibilities for the disposal of public property between the procurement unit and the Tenders Board.  \n" +
                "\n");
        Procurement_Section section53 = new Procurement_Section("Code of Conducts for public Procurement","cat11","The Bureau shall, with the approval of the Board, stipulate a Code of Conduct for                 Code of all public officers, suppliers, contractors and service providers with regards to their   conduct forstandards of conduct acceptable in matters involving the procurement and disposal                  public public assets.    \tProcurement   \n" +
                "\n" +
                "(2)\tThe conduct of all persons involved with public procurement, whether as official of  the Bureau, a procuring entity, supplier, contractor or service provider shall at all times be governed by principles of honesty, accountability, transparency, fairness and equity.   \n" +
                "\n" +
                "(3)\tAll officers of the Bureau, members of Tenders Boards and other persons that may  come to act regarding the conduct of public procurements shall  subscribe to an oath as approved by Board.  \n" +
                "\n" +
                "(4)\tWhere a transaction involves the disposal of assets; principles of honesty,                                            accountability, transparency, fairness and equity shall continue to apply to the                                            same extent as where it involves procurement.  \n" +
                "\n" +
                "(5)\tThese principles shall apply at all times, particularly when:  \n" +
                "\n" +
                "(a)\tmaking requisition for or planning of procurement;  \n" +
                "\n" +
                "(b)\tpreparing solicitation documents;  \n" +
                "\n" +
                "(c)\treceiving offers in response to any form of solicitation towards a  procurement or disposal;  \n" +
                "\n" +
                "(d)\tevaluating and comparing offers confidentially and in complete neutrality; protecting the interest of all parties without fear or favour;  and  \n" +
                "\n" +
                "(e)\tobviating all situations likely to render an officer vulnerable to   embarrassment or undue influence.  \n" +
                "\n" +
                "               (6)   All public officers shall handle public procurement and disposal of assets by:  \n" +
                "(a)\tensuring adequate time for preparing offers;  \n" +
                "(b)\tcomplying with this Law and all derivative regulations;  and  \n" +
                "(c)\treceiving strict confidentiality until completion of a contract.  \n" +
                "(7)\tAll public officers involved in public procurement and disposal of assets shall maintain  the highest standards of ethics in their relationship with persons real or corporate who seek Government commerce whether as a bidder, supplier, contactor or  service provider by developing transparent, honest and professional relationships with  such persons.  \n" +
                "\n" +
                "(8)\tEvery public officer involved directly or indirectly in matters of public procurement and disposal of assets shall:  \n" +
                "\n" +
                "(a)\tdivest himself of any interest or relationships which are actually or  potentially inimical or detrimental to the best interest of Government and the underlining  principles of this Law; and  \n" +
                "(b)\tnot engage or participate in any commercial transaction involving the State                     Government, its ministries, extra-ministerial departments, corporations where  his capacity as public officer is likely  to confer any unfair advantage –  pecuniary or otherwise on him or any person directly related to him.  \n" +
                "\n" +
                "(9)\tAny person engaged in the public procurement and disposal of assets who has   \n" +
                "assumed, or is about to assume, a financial or other business outside business relationship that might involve a conflict of interest, must immediately declare to the authorities any actual or potential interest.  \n" +
                "\n" +
                "(10)\tSuch a declaration shall be given such consideration at the relevant level \n" +
                "as is                                                                necessary so that, where it is seen that remedial action is taken, a conflict of interest                                                     is present.  \n" +
                "\n" +
                "(11)\tA conflict of interest exists where a person:  \n" +
                "\n" +
                "(a)\tpossesses an interest outside his official duties that materially encroaches on the time or attention which should otherwise be devoted to  the affairs of Government;  \n" +
                "\n" +
                "(b)\tpossesses a direct or indirect interest in or relationship with a bidder, supplier, contractor or service provider that is inherently unethical or that may be implied or, constructed to be, or make possible personal gain due to the  person’s ability to influence dealings;   \n" +
                "\n" +
                "(c)\tentertains relationships which are unethical, rendering his attitude partial toward   business with the outsider for personal reasons or otherwise inhibit the impartiality of the person’s business judgement;  \n" +
                "\n" +
                "(d)\tplaces by acts or omissions the procuring entity he represents or the \n" +
                "Government  in an equivocal, embarrassing or ethically  questionable position;  \n" +
                "\n" +
                "(e)\tentertains  relationships compromising the reputation or integrity  of the procuring  entity he represents or the Government;  \n" +
                "\n" +
                "(f)\treceives benefits by taking personal advantage of an opportunity that properly  belongs to the procuring entity he represents or the Government;  \n" +
                "\n" +
                "(g)\tcreates a source of personal revenue or advantage by using public property which  comes  into his hands either in course of his work or otherwise: and  \n" +
                "\n" +
                "(h)\tdiscloses confidential information being either the property of his procuring entity,  the Government or to be a supplier, contractor or service provider to unauthorized  persons.  \n" +
                "\n" +
                "        (13)    A person involved in the disposal of assets, shall not either by a third party or by himself   be interested in any manner in buying directly or indirectly these assets and shall not have or obtain any type of advantage or  revenue from the disposal  for a period  of three (3) years after the disposal.   \n" +
                "\n");
        Procurement_Section section54 = new Procurement_Section("Offences","cat12","Any natural person not being a public officer who contravenes any provision of                      Offences\n" +
                "of this Law commit an offence and is liable on conviction to a term of imprisonment             relating to\n" +
                "for five (5) years fine and restitution.   \t\t\t\t\tpublic procurement \n" +
                "(2)\tAny offence in contravention of this Law shall be tried by the State High Court.  \n" +
                "\n" +
                "(3)\tProsecution of offences under this Law shall be instituted in the name of the State        \n" +
                "Government by the Attorney-General of the State or such other officer of the      Ministry of Justice as he may authorize so to do, and in addition, without prejudice to the Constitution of the Federal Republic of Nigeria 1999.  \n" +
                "\n" +
                "(4)\tThe following shall also constitute offences under this Law:  \n" +
                "\n" +
                "(a)\tentering or attempting to enter into a collusive agreement, whether \n" +
                "enforceable                                  or not, with a supplier, contractor or consultant where the prices quoted in their  respective tenders,  proposals or quotations are or would be higher than  would have been the case has there not been collusion between the persons  concerned;  \n" +
                "\n" +
                "(b)\tconduct or attempting to conduct procurement fraud by means of fraudulent  and corrupt acts,  promises, threat or other action  unlawful influence, undue interest, favour, agreement, bribery or corruption;  \n" +
                "\n" +
                "(c)\tdirectly, indirectly or attempting to influence in any manner the procurement  process to obtain an unfair advantage in the award of a procurement  contract;  \n" +
                "\n" +
                "(d)\tsplitting of tenders to enable the evasion of monetary thresholds set;  \n" +
                "\n" +
                "(e)\tbid-rigging;  \n" +
                "\n" +
                "(f)\taltering any procurement document with intent to influence the outcomes of a tender proceeding;  \n" +
                "\n" +
                "(g)\tuttering or using fake documents or encouraging their use; and    \n" +
                "\n" +
                "(h)\twillful refusal to allow the Bureau or its officers to have  access to any  procurement records.  \n" +
                "\n" +
                "(5)\tAny person who while carrying out his duties as an officer of the Bureau, or any procuring entity who contravenes any  provision of this Law commits an offence  and is liable on conviction to a cumulative punishment of:  \n" +
                "\n" +
                "(a)\ta term of imprisonment of  five (5) years fine and restitution;   \n" +
                "\n" +
                "(b)\tsummary dismissal from Government service.  \n" +
                "\n" +
                "(6)\tAny legal person that contravenes any provision of this Law commits an offence  and is liable on conviction  to a cumulative penalty of:  \n" +
                "\n" +
                "(a)debarment from all public procurements for a period not less than five (5)   years and restitution.  \n" +
                "\n" +
                "(7)\tWhere any legal person shall be convicted pursuant to subsection (4) every officer   who is responsible for the act that constitutes an offence is equally liable \n" +
                "for the offence and on conviction shall be sentenced to a term of imprisonment of not more than five years or a fine in addition to restitution.  \n" +
                "\n" +
                "(8)\tAn alteration pursuant to subsection  4 (f) shall include:  \n" +
                "\n" +
                "(a)\tinsertion of documents such as bid security tax clearance certificate which  were not submitted at bid opening;  and   \n" +
                "\n" +
                "(b)\trequest for clarification  in a manner not permitted under this  Law.  \n" +
                "\n" +
                "(9)\tCollusion shall be presumed from a set of Laws from which it can be assumed  that there was an understanding,  implicit, formal or informal, overt or cover   under which each person involved reasonably expected that the other would adopt  a particular course of action which would interfere with the faithful and proper  application of the provision of  this Laws.  \n" +
                "\t\n" +
                "(10)\tBid-rigging pursuant to subsection 4 (e) means an agreement between persons whereby:  \n" +
                "\n" +
                "(a)\toffers  submitted have been pre-arranged  between them; or  \n" +
                "\n" +
                "(b)\ttheir conduct has had the effect of directly or indirectly restricting free and open competition, distorting the competitiveness of the procurement process and  leading to and escalation or increase in cost or loss of value to State treasury.  \n" +
                "\t\n");
        Procurement_Section section55 = new Procurement_Section("MISCELLANEOUS","cat13","(1) The fixing of the seal of the Bureau shall be authenticated by the signature of the          \n" +
                "Miscellaneous Chairman, the Director-General or of any other person authorized generally                         or specially to act for that purpose by the Board  \n" +
                "\n" +
                "(2)\tAny contract or instrument which, if made or executed by a person not being a body corporate would not be required to be under seal may be made or executed  \n" +
                "on behalf of the Bureau by the Director-General or any person generally or  specially authorized to act for that purpose by the Board.  \n" +
                "\n" +
                "(3)\tAny document purporting to be a document duly executed under the seal of the          Bureau shall be received in evidence and shall, unless and the contrary is proved, be presumed to be so executed.  \n" +
                "\n" +
                "(4)\tThe validity of any proceedings of Board or of a committee thereof shall not be adversely affected by any vacancy in the membership of the Board or       Committee or by reason that a person not entitled to do so took part in the proceedings of the Board or Committee.    \n" +
                "\n" +
                "60  In this law:               Interpretation \n" +
                "       “Accounting officer” means the person charged with the conduct of all  procurement processes:  \n" +
                "\n" +
                "       “Approving authority” means the person charged with overall responsibility for  the functioning of a Ministry, extra-ministerial department  corporation or parastatal;    \n" +
                "\n" +
                "“Assets” includes tangible and intangible things, which have been or may be sold or procured for consideration:  \n" +
                "\n" +
                "       “Bid security” means a form of security assuring the bidder shall not withdraw a bid within the period specified for acceptance and shall execute a written  contract within the time specified in  the bid;  \n" +
                "\n" +
                "        “Debar” means the placing of a firm company or natural person on a list of  person ineligible to participate in any procurement proceedings under this Law;  \n" +
                "\n" +
                "“Force Account (Direct Labour)” in this Law shall mean and include implementation  of minor works, goods and equipment procurement.   \n" +
                "\n" +
                "      “Certificate of No Objection” means the document evidencing and authenticating  that due process and the letters of this Law have been followed in the conduct  of a procurement proceeding and allowing for the procuring entity  to enter into contract or effect payments to contractors or suppliers from the Treasury:   \n" +
                "\n" +
                "       “Contract” means an agreement entered in writing;  \n" +
                "\n" +
                "        “Contract Management Manual” means the central and standard document that guides  the period and execution of all contracts procured by procuring entities in Ondo State;  \n" +
                "\n" +
                "      “Contractor or Supplier” means any potential party to a procurement contract with the procuring entity and includes any corporation, partnership, individual sole proprietor, joint stock company, joint venture or  any other legal entity  through which business is conducted;  \n" +
                "\n" +
                "“Excessive Price” means a monetary value proposed by a bidder for any  procurement which is in thee estimation of the Bureau unreasonable and  injudicious after consideration of the actual value of the  item in question  plus imputations  of cost  and profit;  \n" +
                "\n" +
                "      “Goods” means objects of every kind and description including raw materials, products and equipment and objects in solid, liquid or gaseous form and electricity as well as services incidental to the supply of the goods;   \n" +
                "\n" +
                "     “Interim Performance Certificates” means evidence that a contractor or supplier has performed its obligations  under a procurement contract up to a level stipulated by the contractor but not meaning completion;  \n" +
                "\n" +
                "    “International Competitive Bidding “means the solicitation of bids from both  domestic and foreign contractors and suppliers;  \n" +
                "\n" +
                "       “Inventory, Material, Goods and Equipment Management Manual” means the  central and standard document that will guide the use, storage and disposal of all procured goods and equipment of the State Government in all procuring  entities;    “Lowest evaluated responsive bid” is the lowest price bid amongst the bids  that meet all the technical requirements  and standards as in the tender  document;  \n" +
                "\n" +
                "    “Margin of Preference” means the extra up on price allowed any domestic  contractor or supplier bidding under International Competitive Bidding  without being otherwise disadvantageous to the bid in terms of price;  \n" +
                "\n" +
                "“Minor Failure” means a monetary value, which is not in excess of the  monetary thresholds set  for any approving authority by the Bureau;    “Monetary Threshold” means the value limit in Naira set by the Bureau  outside of which an approving may not award  a procurement contract;  \n" +
                "\n" +
                "   “National Competitive Bidding” means the solicitation of bids from domestic       Contractor and suppliers registered or incorporated to carry on business  under Nigeria Law;   \n" +
                "\n" +
                "  “Negotiation” means discussions to determine the terms and conditions of  a contract or procurement;  \n" +
                "\n" +
                "  “Open Competitive Bidding” means the offer of prices by individuals or firms  competing for a contract, privilege or right to supply specified goods, works,  construction or services;   \n" +
                "\n" +
                "  “Procurement” means acquisition;  \n" +
                "\n" +
                "  “Procurement Proceedings” means the initiation of the process of effecting  procurement up to award of a procurement contract;  \n" +
                "\n" +
                "  “Procuring entity” means any public body engaged in procurement and includes  a \n" +
                "Ministry Extra-Ministerial office, Government agency, parastatal and  corporation;   \n" +
                "\n" +
                "  “Public Procurement” means the acquisition by any means of goods, works or  services by the Government;  \n" +
                "\n" +
                "“Relevant authority” includes Economic and Financial Crimes Commission and    Independent Corrupt Practices Commission;  \n" +
                "\n" +
                "“Services” means the rendering by a contractor or supplier of his time and effort  and includes any object of procurement other than goods, works or construction;  \n" +
                "\n" +
                " “Solicitations Documents” means offers, proposals or quotations;  \n" +
                "\n" +
                "“Special Purpose Goods” means any objects of armaments ammunition mechanical  electrical equipment or other thing as may be determined by the President needed  by the Armed Force as well as the services incidental to the supply of the objects;  \n" +
                "\n" +
                " “Responsiveness” means evaluation, compliance, satisfying the procurement agency                                      of competence and ability of the Contractor;  \n" +
                "\n" +
                " “Substantially Responsive” means the response to bid solicitations which virtually  answers  to the needs of a  procuring entity as stipulated in the bid solicitation  documents;    \n" +
                "\n" +
                "“Suppliers” means a real or legal person that provides supply of goods, contracting  of works or consultants;  \n" +
                "\n" +
                "“Threshold” refers only to the approving and not the actual process of award;  “Validity Period” means the period during which a bidder agrees not to increase   the cost of  its bid or to remove  any components of the bid;  \n" +
                "\n" +
                "“Works” means all works associated with the construction, reconstruction, demolition,  repair or renovation of a building, structure or works, such as site preparation, excavation, erection, building , installation of equipment or materials, decoration and finishing, as   well as services incidental to construction such as drilling mapping, satellite photo-                                        graphy, seismic investigation and similar services provided pursuant to the procurement                                  of contract, where the value of those services does not  exceed that of the construction                                    itself;    \n" +
                "“Restitution” means refund of the amount involved.  \n");


        Procurement_Section[] sections = new Procurement_Section[]{
           section1,section2,section3,section4,section5,section6,section7,section8,section9,section10,section12,section13,section14,section15,section16,section17,section18,section19,section20,


                section21,section22,section23,section24,section25,section26,section27,section28,section29,section30,section31,section32,section33,section34,section35,section36,section37,section38,section39,section40,
                section41,section42,section43,section44,section45,section46,section47,section48,section49,section50,section51,section52,section53,section54,section55

        };

        return sections;
    }


}
