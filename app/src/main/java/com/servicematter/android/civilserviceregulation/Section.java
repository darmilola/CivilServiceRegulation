package com.servicematter.android.civilserviceregulation;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Section")
public class Section implements Parcelable {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "category")
    private String category;

    @ColumnInfo(name = "regulation")
    private String Regulation;

    public Section(String title,String category,String Regulation){
        this.title = title;
        this.category = category;
        this.Regulation = Regulation;
    }


    protected Section(Parcel in) {
        title = in.readString();
        category = in.readString();
        Regulation = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(category);
        dest.writeString(Regulation);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Section> CREATOR = new Creator<Section>() {
        @Override
        public Section createFromParcel(Parcel in) {
            return new Section(in);
        }

        @Override
        public Section[] newArray(int size) {
            return new Section[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRegulation() {
        return Regulation;
    }

    public void setRegulation(String regulation) {
        Regulation = regulation;
    }

    public static Section[] populateSection(){
        //List<Section> sectionList = new ArrayList<>();

        Section section1 = new Section("Short Title","cat1","1.\tThese Regulations may be cited as the Civil Service Commission Regulations, 1999.");


        Section section2 = new Section("Application of the Regulations","cat1","2. These Regulations shall apply in relation to offices in the Civil Service of\tthe State only to the extent that Section 208 (2) of the Constitution applies in relation to those offices:\n" +
                "\n" +
                "Provided that these Regulations shall not apply with respect to the dismissal\tof, or the exercise of disciplinary control over any public officer who is a member\t\tof a Fire Brigade established by the Government of the State under the Fire\t\tService Law, 1978 Cap.39 or any other Law amending or replacing the Law.\n");

        Section section3 = new Section("Definition","cat1","3.\tIn these Regulations, unless the context otherwise requires -\n" +
                "“the administrative cadre” means; all grades of officers appointed into the Administrative Officer Cadre.\n" +
                "“appointing authority” means the authority in whom power to appoint persons to hold or\n" +
                "act in offices in the civil service of the State (including power to make appointments on\n" +
                "promotion and transfer and to confirm appointment) is for the time being vested by\n" +
                "provisions of the Constitution or by delegation of the said power in accordance with\n" +
                "those provisions;\n" +
                "“basic salary” means salary together with, in the case of a contract officer, contract addition,\n" +
                "but excluding inducement addition and any other addition to salary;\n" +
                "“category 1” means public offices or, if the context so requires, the holders of public offices\n" +
                "graded in Level 11 and above;\n" +
                "\n" +
                "“category 2” means public offices or, if the context so requires, the holders of public offices\n" +
                "graded in Level 07 to Level 10, both Levels inclusive;\n" +
                "“category 3” means public offices or, if the context so requires, the holders of public offices\n" +
                "graded in Level 03 to Level 06, both levels inclusive;\n" +
                "“category 4” means public offices or, if the context so requires, the holders of\n" +
                " \n" +
                "Short Title\n" +
                "\n" +
                "Application of the Regulations\n" +
                "\n" +
                "Definition\n" +
                " \n" +
                "public offices\n" +
                "graded in Level 01 and Level 02, both Levels inclusive;\n" +
                "“centrally- deployed cadre” means the Administrative Cadre, the General Executive Cadre,\n" +
                "the Secretarial Cadre, and Accountant Cadre; “chairman” means the Chairman of the Commission;\n" +
                "\n" +
                "\n" +
                "“civil service rules” means the, Civil Service Rules made or having effect as if made under Section 38 of the Public Administration Law;\n" +
                "“accountant cadre” means all grades of officers appointed into the cadre; “commission” means the Civil Service Commission for the State established\n" +
                "under the Constitution;\n" +
                "“commissioner” means a member of the Commission, and, where the context so admits, includes the Chairman;\n" +
                "“the constitution” means the Constitution of the Federal Republic of Nigeria 1999; “contract”” and “contract officer” means respectively an agreement for appointment,\n" +
                "and a public officer appointed by such an agreement, which does not provide for payment of a pension, to an established office for a specified number of months\n" +
                "or\n" +
                "years, or (in the case of an overseas officer) for one or more tours, and includes\n" +
                "a\n" +
                "pensioner re- engaged on such terms;\n" +
                "“criminal offence” means for the purpose of these Regulations offence under the criminal code such as fraud, dishonesty, moral turpitude etc.;\n" +
                "“department” means the unit of the Civil Service of the State under supervision of a Head\n" +
                "of Department, whether the unit is known as a Ministry, a Department or an office, or by\n" +
                "any other name, and for the purpose of these Regulations includes a centrally- deployed\n" +
                "cadre where the context so requires;\n" +
                "“disciplinary authority” means the authority in whom power to dismiss and exercise\n" +
                "disciplinary control over a public officer is for the time being vested by the Constitution\n" +
                "or by any delegation of the said power in accordance with those provisions; “division” means a Division of a Department;\n" +
                "“enactment” includes any Law, Act, Decree or Edict in force in the State and also any\n" +
                "Regulations, rules, Orders or any other form of subsidiary legislation whatsoever made\n" +
                "or having effect as if made under any such Law, Act, Decree or Edict; “established office” means any public office for which provision is made with reference\n" +
                "to its title in a personal emoluments sub- head of the Estimates of the State; “the general executive cadre” means all grades of officers in the Executive Officer Cadre\n" +
                " \n" +
                "in Accounts,\tAudit, Tax and General Duties. “head of department” means:\n" +
                "(a)\tin relation to the office of Permanent Secretary and to any public office or\n" +
                "public officer in the Administrative Cadre – the Head of the Service;\n" +
                "(b)\tin relation to any public office or public officer in the Accountant Cadre- the Permanent Secretary, Ministry of Finance;\n" +
                "(c)\tin relation to any public office or public officer in the General Executive Cadre or the Secretarial Cadre – Permanent Secretary, Office of Establishments;\n" +
                " \n" +
                "\n" +
                "Secretary\n" +
                " \n" +
                "(d)\tin relation to any other public officer or public office, the Permanent\n" +
                "\n" +
                "or other public officer who exercises supervision over the Department in which\n" +
                "such public office is included or such public officer as is first mentioned\n" +
                " \n" +
                "is\n" +
                "employed;\n" +
                "“head of the service” means the officer holding the post of Head of Service; “inquiry” means a disciplinary inquiry conducted under Regulation 56;\n" +
                "“investigation” means and examination of a matter by a public officer holding powers of inquiry which need not follow the procedure for an inquiry as laid down in Regulation 56;\n" +
                "“Nigerian” means a person who is a citizen of Nigeria by virtue of the provisions of the Constitution of the Federation or a person who becomes a citizen of Nigeria by virtue of the provisions of any enactment in pursuance of those provisions;\n" +
                "“non- pensionable office” includes a pensionable office held by a person appointed on contract or temporary appointment;\n" +
                "“official document” means any file, record or other document prepared by, or which comes into the custody or possession of any public officer in the course of his duties as such officer;\n" +
                "“other civil service” has the same meaning as in the Pensions Act, as applied to officers in the Civil Service of the State by Pensions Act, or as in any other Law in force in the State amending or replacing the said Act;\n" +
                "“overseas officer” has the same meaning as in the Civil Service Rules;\n" +
                "“the pensionable establishment” means those public offices in the permanent establishment which have been declared to be pensionable offices;\n" +
                "“pensionable office” has the same meaning as in the Pensions Act, as applied to officers in the Civil Service of the State by the Pensions Act, or as in any other Law in force in the State amending or replacing the said Act;\n" +
                "“performance evaluation report”, includes a progress report, an annual Performance Evaluation Report, a special performance evaluation report however, entitled, a supplementary Performance Evaluation Report however entitled, and any endorsement of or alteration or addition to a performance evaluation report;\n" +
                "“the permanent establishments” means those public offices for which provisions are made with reference to their titles in a personal emoluments such- head of the Estimates of the State, but excluding any such office shown as being temporary in the said Estimate;\n" +
                "“public office” means any office of emolument in the civil service of the State; “public officer” means any person holding, or acting in, any public office; “public officer holding powers of inquiry” means any public officer upon whom\n" +
                "powers are conferred by Regulation 54 hold inquiry under these Regulations; “the civil service of the State” means the service of the State in a Civil capacity in\n" +
                "respect of the Government of the State;\n" +
                "\n" +
                "\n" +
                "Cap. 100\n" +
                " \n" +
                "“the state” means the Ondo State;\n" +
                "“reporting officer” includes every public officer writing a Performance Evaluation Report on a public officer;\n" +
                "“the secretarial cadre” means all grades of officers appointed into the Secretarial and Official Reporter Cadre;\n" +
                "“the secretary” means the Permanent Secretary to the Commission; “temporary appointment” means an appointment in Category 1, 2, 3, or 4 on\tnon- pensionable terms for a period not exceeding one month  at  a time but\twhich may be continued by the appointing authority without formal renewal\n" +
                "from month to month, or as may be appropriate in the case of an appointment for a shorter period than one month, until terminated; “tour” has the same meaning as in Civil Service Rule 15301;\n" +
                "“the treasury board” means the Treasury Board established by Section 4 of the\n" +
                "Public Administration Law.\n ");

        Section section4 = new Section("Permanent Secretary and Signification of Acts, Document\n" +
                "e.t.c. of the Commission\n","cat2","4.\t(1) There shall be a Permanent Secretary to the Commission who, in addition to his function as prescribed in these Regulations, shall have such other\n" +
                "functions of an administrative nature as may from time to time be assigned to be\n" +
                "assigned to him by the Commission or the Chairman.\n" +
                "\n" +
                "(2) Where under the Constitution or these Regulations, any function or\tpower is conferred upon the Commission, any exercise  of such function or\tpower by the Commission, may be signified under the hand of the Permanent Secretary.\n");
        Section section5 = new Section("Presiding at meetings.","cat2","5.\tEvery meeting of the Commission, the Chairman if present, shall preside\tbut in his absence, the Commissioners present shall appoint one of its members\tto preside.");

        Section section6 = new Section("Record of meetings.","cat2","A record shall be kept of the Commissioners present and of the\tbusiness transacted at every meeting of the Commission.\n" +
                "\n" +
                "(2)\tAny Commissioner who is present at a meeting when a decision is\tmade shall be entitled to dissent from the decision and to have his dissent and\n" +
                "his reasons therefore set out in the record of the meeting.\n");

        Section section7 = new Section("Decision without meeting","cat2","7.\t(1) Subject to paragraphs (2) and (3) of this Regulation, a decision may, without a meeting having been  held,  be  made  by  the Commission by circulation of the relevant papers among the Commissioners  present  in\tNigeria at the time and the expression of their views in writing and in such case the decision shall   be the view of the majority of Commissioners.\n" +
                "\n" +
                "(2)\tIf any Commissioner requires that a decision on a matter being dealt with by circulation of the relevant papers shall be deferred until the matter shall be considered at a meeting of the Commission, no decision shall be made on that matter except at a meeting of the  Commission.\n" +
                " \n" +
                "(3)\tWhere a Commissioner dissents from a view recorded by a majority\tof the Commissioners on papers circulated for a decision, he shall record the\treasons for his dissent    and the  decision   shall   not   be   implemented   until that Commissioner has withdrawn his dissent  or  until  the Commissioner\t\thas confirmed the decision at a meeting.\n");




        Section section8 = new Section("Public officers  to attend before Commissi on","cat3","8.\tThe Commission may require any public officer to attend and give evidence before it concerning any matter in respect for which powers are vested in it and to produce any official document relating to any such matter: Provided that any official document which is the property of the Executive Council of the State or of any Committee of that Council shall be so produced only with the permission of the Secretary to the State Government.");
        Section section9 = new Section("Material to be made available to Commission","cat3","9.\tAny public officer who submits any matter for the consideration of the Commission shall ensure that all relevant documents are made available to the Commission");
        Section section10 = new Section("Failure\tto comply with request\tby the commission, a breach of discipline","cat3","10.\tAny public officer who without reasonable excuse fails to appear before the Commission when requested to do so, or who fails to comply with any request lawfully and properly made by the Commission, shall be guilty of a breach of discipline for which breach, disciplinary proceedings may be instituted against him.");


        Section section11 = new Section("Powers delegated to Public Officers.\n" +
                "Schedule\n","cat4","(1)The Commission hereby delegates to the public officers specified\tin the first column of the Schedule to these Regulations, the powers\t\t\tspecified opposite thereto respectively  in  the  second column of the said\tSchedule subject  to  the  general  conditions  specified  in  paragraph   (2)   of this regulation, and, where applicable, to the special conditions specified\t\tin the third column of that Schedule.\n" +
                "\n" +
                "(2) The powers delegated as afore- mentioned shall be exercised in accordance with these Regulations and with such other general or special directions as the Commission may give from time to time, and such delegation shall be without prejudice to the exercise by the Commission of the said powers.\n");


        Section section12 = new Section("Supervision of schemes of recruitment.","cat5","12.\tThe Commission may exercise supervision over and approve all other\tmethods of appointment including the appointment and procedure of any committee that may be constituted for the selection ");

         Section section13 = new Section("Recruitment","cat5","13.\tWhere a vacancy is to be filled according to the results of an examination in conformity with any scheme of recruitment approved by the Commission, the procedure for notifying the Commission of, and for filling, the vacancy shall be\n" +
                 "as set out in that scheme and not as set out in Regulations 17, 19 or 20, except to\n" +
                 "such extent as the schemes otherwise provides.\n" +
                 "\n");

         Section section15 = new Section("Advertisement of\t\tvacancies and precedent to claims  of s\te\trving officers","cat5","14.\t(1) Where an appointing authority does not intend to fill a vacancy by the consideration only of persons already in the civil service of the State or by\n" +
                 "the results of examination prescribed under a scheme of recruitment approved\n" +
                 "by the Commission, the public shall unless it is otherwise prescribed in  these\n" +
                 "Regulations or the Commission otherwise directs, be informed by advertisement,\n" +
                 "of the existence of such vacancy in time to enable candidates to make their applications in accordance with that advertisement.\n" +
                 "(2) Every appointing authority shall accord to the claims of meritorious Public Officer to fill vacancies, precedence over any comparable claims of persons not already in the Civil Service of the State unless the Commission otherwise directs at any particular case.\n");
         Section section16 = new Section("Commission of Selection Committees\n" +
                 "and interviewing\n" +
                 "by commission\n","cat5","15.\tThe Commission may constitute Selection Committees to interview candidates either generally or in relation to a particular vacancy, and not- with-\t\tstanding\tthe procedure set out in any regulation, may in its discretion,  summon any of the candidates for any vacancy for interview  by the Commission.");
         Section section17 = new Section("Departmental Selection and Promotion Committees","cat5","16.\tUnless the Commission otherwise approves, a Head of Department shall constitute, either generally or in relations to a particular vacancy, a Departmental Selection Committee or Departmental Selection Committees to\n" +
                 "advise him before he makes, to the Commission, a recommendation under Regulation 17 that any public officer be promoted within or transferred or seconded within or to his Department and may constitute, either generally or in relation to a particular vacancy, a Departmental Selection Committee or Departmental Selection Committees to advise him before he makes an appointment to a public office in category 3 or 4. When a Departmental Selection Committee considers a promotion, it may be referred to as a Departmental Promotion Committee.\n");

         Section section18 = new Section("Procedure for filling a category 1 or\n" +
                 "2 vacancy\n","cat5","17.\tSubject to the provisions of Regulation 13, the following provisions shall apply to the filling of a vacancy in a public office in category 1 or 2.\n" +
                 "(a)\tAs soon as it is known that a vacancy will occur or has occurred in a public office, the Head of Department shall communicate to the Commission  in writing  his  proposals  regarding  the filling of   the vacancy. Such proposals shall include his views as to the methods to be employed in filling the vacancy (which shall take into account the provisions of any relevant Scheme of Service approved by the Treasury Board) and whether or not the vacancy should be advertised and, if so, the means of advertisement which he recommends if other than publication in the Gazette of the various Governments of the Federation of Nigeria. Where necessary, he shall submit with his proposals and advertisement or a request for recruitment overseas as\n" +
                 "\n" +
                 "\n" +
                 "the circumstances may require and subject to sub- paragraph (ii) of paragraph (f) of this regulation, where he proposes the recruitment of a non- Nigerian, regard being had in either case to the terms of the appropriate Scheme of Service, or where in relation to a particular vacancy there is no such scheme or a departure from the requirements of one is proposed, to the terms in which such approval as he shall have sought from the Permanent Secretary, Office of Establishments in respect of the qualifications, salary, and other requirement for the filling of such vacancy, has been given. Where he proposes that the vacancy should be filled by promotion within his Department or by transfer or secondment within or to his Department, his recommendation to that effect in accordance with these Regulations in respect of a named person, may be included in this proposals or made separately. He shall send to the Permanent Secretary, Office of Establishments a copy of any such proposals, together with any advertisement or request for recruitment overseas which he is required by sub- paragraph (ii) of paragraph (f) of this regulation to submit through the Permanent Secretary, Office of Establishments unless the proposals contain a recommendation that a named person should be promoted, transferred or seconded to fill the vacancy, in which case, he shall inform the Permanent Secretary, Office of Establishments, only of the general nature of his proposals but not also of such recommendation as aforesaid. The Permanent Secretary, Office of Establishment shall tender to the Commission on the filling of the vacancy advice which shall include his opinion as to the probable availability of eligible candidates where he does not propose, or concur in a\n" +
                 " \n" +
                 "proposal, that the vacancy should be filled by promotion or transfer:\n" +
                 "provided that nothing in this paragraph shall prevent the Permanent Secretary, Office of Establishments from tendering advice to the Commission on the filling of vacancies generally, but such advice shall not include advice that a particular officer should be promoted.\n" +
                 "(b)\tWhere the Commission approves or requires that a vacancy shall be Advertised, the Head of Department shall, unless he has previously done so, when submitting his proposals for the filling of the vacancy, submit an advertisement to the Commission, subject to sub- paragraph (ii) of paragraph (f) of this regulation where he proposes the recruitment of a non- Nigerian, and having regard, in any case, to the terms of the appropriate Scheme of Service, or where in relation to a particular vacancy, there is no such Scheme or a departure from the requirement of one is proposed, to the terms in which such approval as he shall have sought from the Permanent Secretary, Office of Establishments in respect of the qualifications, salary, and other requirements for the filling of such vacancy, has been given.\n" +
                 "\n" +
                 "(c)\tThe Commission shall arrange for the publication of any advertisement submitted in accordance with paragraph (a), (b) or\n" +
                 "(f)\tof this regulation with such amendment as it thinks fit after such consultation with the\n" +
                 "\n" +
                 "\n" +
                 "Office of Establishments or the Head of Department as may be appropriate.\n" +
                 "(d)\tThe Commission may, if it thinks fit, notify a vacancy to any other Civil Service Commission in Nigeria, whether the vacancy is\n" +
                 "advertised\n" +
                 "or not.\n" +
                 "(e)\tUnless the Commission otherwise directs, where a vacancy is advertised, and in any other case, if the Commission so directs, a list of candidates recommended for consideration from amongst the persons applying for the vacancy, to be known as the “Short List”, shall be prepared and submitted to the Commission jointly by the Head of Department or a public officer directed by him to represent him, another public officer of his Department selected by him, and a public officer directed by the Permanent Secretary, Office of Establishments to represent him, who shall all meet on the Commission’s premises for the purpose of preparing the short list with the assistance of a member of the Commission’s staff; the expression “persons applying for the vacancy” as used above\n" +
                 " \n" +
                 "including not only a person applying in answer to an advertisement but also, at the discretion of the Commission, a person applying for appointment to the type of vacancy concerned before the publication of an advertisement relating to it and a person applying generally for appointment who is eligible for the vacancy and in respect of whom the Permanent Secretary, Office of Establishments has advised the Commission that that person should be considered for the type of vacancy concerned. To the short list prepared as aforesaid, the Head of Department or his representative shall add either the name of any person in respect of whom the Head of Department has made or intends to make a recommendation for promotions, transfer or secondment, or a notification or intention to make such a recommendation, and any such recommendation shall be made separately and in accordance with these Regulations. Where the Head of Department does not wish to make any such addition to the short list, he or his representative shall record that fact upon the list: Provided that this paragraph shall not apply to the preparation by a Selection Committee outside Nigeria of any list of candidates for interview.\n" +
                 "\n" +
                 "(f)\t(i) If no public officer is eligible for a vacancy and if, whether as a result of action in accordance with the preceding paragraphs of this regulation or otherwise, the Permanent Secretary, Office of Establishments is satisfied that no eligible Nigerian is available to fill a vacancy, he shall so inform the Commission and the Head of Department concerned.\n" +
                 "\n" +
                 "(ii)\tThe Head of Department may, upon being so informed by the Permanent Secretary, Office of Establishments submit to the Commission through the Permanent Secretary, Office of Establishments either an advertisement for publication in Nigeria indicating that non-\n" +
                 " \n" +
                 "Nigerian may be considered, or, if he considers that eligible candidates\n" +
                 "are unlikely to be obtained by so advertising in Nigeria, a request for\n" +
                 "the recruitment of a non- Nigerian  overseas  in  such  form  as the\n" +
                 "Commission\tmay\tprescribe\teither\tgenerally\tor in relation to a\n" +
                 "particular vacancy and may tender advice as to the sources from which\n" +
                 "and the manner\tin\twhich\teligible\tcandidates\tmay\tbe obtained.\n" +
                 "(iii)\tWhen forwarding such advertisement or request for recruitment\n" +
                 "overseas  to\tthe  Commission,  the\tPermanent Secretary, Office of\n" +
                 "Establishments shall furnish to the Commission a certificate signed\n" +
                 "by him to the effect that there is no eligible Nigerian available for the\n" +
                 "vacancy, which certificate shall, if the vacancy is in a public office\n" +
                 "reserved for Nigerians by the Government of the State, cite the decision\n" +
                 "of\tthe\tExecutive\tCouncil\tfor\tthe\tState\tpermitting\tthe appointment of a\n" +
                 "non- Nigerian. If a vacancy has not been advertised, but the Commission\n" +
                 "informs the Permanent Secretary, Office of Establishments that\n" +
                 "the\n" +
                 "appointment of a non- Nigerian is being considered, the\n" +
                 " \n" +
                 "Permanent\n" +
                 "Secretary, Office of Establishments shall either furnish a certificate as\n" +
                 "aforesaid or inform the Commission that he is unwilling to do so and\n" +
                 "shall give his reasons therefore. No such certificate shall be valid until it\n" +
                 "shall have been counter- signed by the Chairman.\n" +
                 "(g)\t(i) A copy of any recommendation, and of  any  request  made in\n" +
                 "pursuance of sub- paragraph (ii) of paragraph (f) of this regulation,\n" +
                 "and  of  any  short  list  prepared\tin\taccordance\twith paragraph (e)\n" +
                 "of this regulation, relating to a vacancy in a public office of Head of\n" +
                 "Department, Head of Division, or officer coordinating a group of\n" +
                 "Divisions, which is not included in the Administrative Cadre\n" +
                 " \n" +
                 "Appointing authorities to\tensure that candidates for categories 3\n" +
                 "or\t4\n" +
                 "vacancies are eligible\n" +
                 "\n" +
                 "Procedure for  filling a category 3 vacancy\n" +
                 " \n" +
                 "shall be\n" +
                 "sent to the Head of Service by the Permanent Secretary\n" +
                 "before it can\n" +
                 "be finally approved by the Commission.\n" +
                 "(ii)\tThe Commission shall notify the Head of Service of any proposal\n" +
                 "to fill any such vacancy which is not included in a recommendation or in such request or in such short list.\n");

         Section section19 = new Section("Appointing authorities to\tensure that candidates for categories 3\n" +
                 "or\t4\n" +
                 "vacancies are eligible\n","cat5","18.\tA Head of Department shall ensure that any person whom he appoints\n" +
                 "to a public office in category 3 or 4 is eligible for such appointment\n");
          Section section20 = new Section("Procedure for  filling a category 3 vacancy","cat5","19.\t(1) Subject to the provisions of Regulation 13, where a Head of Department decides, after taking into account the provisions of any relevant\n" +
                  "Scheme of Service approved by the Treasury Board, that a vacancy in a public office in category 3 shall be filled otherwise than by the consideration only of persons already in the civil service of the State, he shall endeavour to obtain candidates for consideration through a Government Employment Exchange, but if he considers that suitable candidates for the vacancy cannot be so obtained, the provisions of Regulations 14 shall apply.\n" +
                  "(2) The procedure for filling a vacancy in category 3 by promotion, transfer or secondment shall be at the discretion of the Head of Department: Provided that-\n" +
                  "\n" +
                  "\n" +
                  "\n" +
                  "\n" +
                  "\n" +
                  "(a)(i) he shall ensure in the case of promotion that he accords to the claims of any meritorious office in his Department, precedence over any\n" +
                  "comparable\n" +
                  "claims of other public officers;\n" +
                  "(ii)\tin the case of transfer or secondment, no public officer in his\n" +
                  "Department is superseded without what appears to the Head of Department\n" +
                  "to be sufficient reason; and\n" +
                  "\n" +
                  "(b)\tany officer who is aggrieved by the decision of the Head of Department\n" +
                  "can appeal to the Commission in accordance with the procedure laid\n" +
                  "down\n" +
                  "in Regulation 62.\n");

          Section section21 = new Section("Procedure for filling a category 4 vacancy\n","cat5","20.\tA vacancy in a public office in category 4 needs not be advertised, but where a appointing authority decides that such a vacancy shall be filled otherwise than by the consideration only of persons already in the civil service of the State, shall wherever possible obtain candidates for consideration through\ta Government Employment Exchange.");

          Section section22 = new Section("Criteria for promotion and for acting appointment with a view ","cat5","21.\t(1) The claims of a public officer to promotion shall be considered only on the basis of his qualification for the public office to which his promotion is being considered, his experience, and his merit as shown by the manner in which he has performed and is performing his duties, and the standard which he is considered by the appointing authority to be likely to attain in the performance of such duties as may be allotted to him in the future.\n" +
                  "\n" +
                  "(2) Where it is considered necessary that a public officer should be tried\n" +
                  "in a higher post in the first instance for some period with a view specifically to his\n the\n" +
                  " \n" +
                  "eventual promotion thereto if he proves suitable,\tthe   Commission on\n" +
                  "\n" +
                  "recommendation of the Head of Department or of its own notion may\n" +
                  " \n" +
                  "appoint him\n" +
                  "to act in such higher post. Recommendations for decisions to make such\n" +
                  " \n" +
                  " \n" +
                  "acting\n" +
                  "appointments shall, in addition to complying with the procedure\n" +
                  " \n" +
                  "prescribed in\n" +
                  "Regulation 31 for acting appointments, be as carefully considered and made as if\n" +
                  "they were for a promotion and such appointments shall not last longer than six\n" +
                  "months.\n");

          Section section23 = new Section("Applications by officer for promotion.","cat5","22.\tA public officer shall not apply for promotion unless:\n" +
                  "(a)\the has acquired, since his appointment (including appointment or promotion or transfer) to the public office which he currently holds, qualifications which render him eligible for promotion, or\n" +
                  "(b)\tthe advertisement of a vacant public office, invites application from public officers in his circumstances.\n");

          Section section24 = new Section("Recommendation and selection\n" +
                  "for promotion\n","cat5","23.\t(1)\tWhen recommending a promotion, a Head of Department shall:\n" +
                  "(a)\tgive his reasons for selecting the public officer recommended;\n" +
                  "(b)\tstate whether the officer recommended is the most\n" +
                  " \n" +
                  "\n" +
                  "on the basis of records on the public officers in the Department eligible to be considered for the promotion and where he is not, give detailed reasons as to why the Head of Department recommends him in preference to each of such other officers in the Department as would be superseded;\n" +
                  " \n" +
                  "(c)\trecommend an effective date for the promotion, giving reasons for his recommendation;\n" +
                  "(d)\tif his recommendation in respect of the selection of the officer or an effective date for the promotion is at variance with the advice of the Departmental Selection Committee, give his reasons for the variation;\n" +
                  "(e)\tif the officer recommended holds a non- pensionable office, draw the Commission’s attention to that fact.\n" +
                  "(2)\tWhen making a promotion, an   appointing authority, not\tbeing the Commission, shall:\n" +
                  "(a)\tensure that there are sufficient reasons for promotion the officer selected;\n" +
                  "(b)\thave regard to the fact whether the officer selected is the most outstanding, on the basis of merit, of the public officers in the Department eligible to be considered for promotion, and where\n" +
                  " \n" +
                  "he in\n" +
                  "\n" +
                  "date\n" +
                  " \n" +
                  "is not, ensure that there are sufficient reasons for selecting him preference to each of such other officers in the Department;\n" +
                  "(c )\tdetermine an effective date for the promotion;\n" +
                  "(d)\tif his selection of the officer or determination of an effective\n" +
                  "\n" +
                  "for the promotion is at variance with the advice of a\n" +
                  " \n" +
                  "Departmental\n" +
                  "Selection Committee, record his reasons for the variation.\n");
         Section section25 = new Section("Promotion\tin centrally- deployed cadres recommended by\tHeads\tof other Departments.","cat5","24.\tAny recommendation for a promotion to or within a centrally- deployed cadre which a Head of Department who is not the Head of Department for that cadre wishes to make, shall be made to the Head of Department of that cadre, who shall act on such recommendation as he deems fit, and where necessary, makes such recommendation thereon as he thinks fit to the Commission in accordance with these Regulations.");

         Section section26 = new Section("Appointments on transfer or secondment\n","","25.\tWhere a Head of Department recommends to the Commission that a vacancy in his Department in category 1 or 2 should be filled by transfer or secondment, he shall:\n" +
                 "(a)\t\tstate whether the transfer or secondment would result in the supersession of any eligible public officer in his Department and where it would do so, give detailed reasons as to why he\n" +
                 " \n" +
                 "recommends\n" +
                 "such transfer or secondment in supersession of each of such\n" +
                 "officer\n" +
                 "in the Department as would be superseded;\n" +
                 "(b)\twhere the recommended transfer or secondment is of an officer in the public service of the State, forward the views of the officer's\n" +
                 "Head\n" +
                 "of Department, or arrange for these views to be submitted direct to\n" +
                 "the\n" +
                 "Commission and inform the Commission that he has done so. If\n" +
                 "the shall\n" +
                 "Commission.\n" +
                 " \n" +
                 "\n" +
                 "officer has not applied for transfer or secondment, his own views similarly,\tbe\tobtained\tand\treported\tor\tforwarded\tto\tthe\n");

         Section section27 = new Section("Applications for transfer or secondment within the public service of the State to posts in\n" +
                 "categories\t1\n" +
                 "and 2\n","cat5","26.\t(1)\tA public officer applying  for  transfer or secondment within  the public service of the State, shall address his application, if the post to which he wishes to transfer or be seconded is in categories 1 and 2 to the head of the Department to or within which he wishes to transfer or be seconded, in either case through the usual departmental channels and, if he wishes to transfer or be\n" +
                 " \n" +
                 "secondment\n" +
                 "Transfers\tand secondments within the public service of the State to posts in category 3\n" +
                 "\n" +
                 " \n" +
                 "seconded to another Department, through the Head of his Department and shall state in his application, his reasons for wanting the transfer or secondment and his qualifications for the public office to which he wishes to transfer or be seconded.\n" +
                 "\n" +
                 "(2)\tIf the application is for a public office in categories 1 and 2 in another Department, the Head of the applicant’s Department shall send a copy of the application, and of his views thereon, to the Head of the Department to which the applicant wishes to transfer or be seconded and shall inform the Commission that he has done so, when sending the originals of the application to the Commission.\n" +
                 "(3)\tThe Head of the Department to or within which the applicant wishes to transfer or seconded shall make such  recommendation  as he thinks fit to the Commission in accordance with these Regulations.\n" +
                 "(4)\tA copy of any application for transfer or secondment from a Head of Department, Head of Division, or officer coordinating a group of Divisions, and of any recommendation in respect of such application shall be sent by its writer to the Head of the Service, through the usual departmental channels where the writer is not a Head of Department.\n");

          Section section28 = new Section("Transfers\tand secondments within the public service of the State to posts in category 3","cat5","27.\tTransfers or secondments to public officers in category 3 within Department or from one Department in the public service of the State to another may be arranged, on the application of, or with the consent of the public officers concerned, at the discretion of the Heads of the Departments concerned, subject to the proviso to paragraph (2) of regulation 19.");
          Section section29 = new Section("Releases on transfer or secondment outside the public service of the State","cat5","28.\t(1) A public officer applying for transfer or secondment to an office outside the public service of the State shall address his application through the usual departmental channels, his Head of Department, the Head of Service and the Commission. The Head of Department shall act in accordance with such procedure as the Commission may prescribe in respect of the type of application for transfer or secondment concerned and, if such procedure requires him to forward the application to the Commission, he shall, at the same time as he forwards it to the Commission, through the Head of the Service, if the time as remaining before any relevant closing date for application allows, or subsequently if it does not, state whether he recommends that the applicant should be permitted to transfer or not. If the applicant is himself a Head of Department, he shall address his application to the Commission through the Head of the Service. The Head of the Service shall in each case inform the Commission at the same time as he forwards it to the Commission, if the time remaining before any relevant closing date for applications allows, or subsequently if it does not, whether he recommends that the officer should be permitted to transfer or be seconded or not.\n" +
                  "\n" +
                  "(2)\tIf a public officer is offered transfer or secondment to an office\n" +
                  " \n" +
                  "outside\tthe civil service of the State without his having applied for such transfer or\tsecondment, the Head of the Service and the Head of his  Department  shall  make the recommendations which would have been made under paragraph\n" +
                  "(1)\tof this\n" +
                  " \n" +
                  "regulation, had the officer applied for such transfer or  secondment,  and the officer’s own views on such transfer or secondment, shall be obtained and reported or forwarded to the Commission.\n");

          Section section30 = new Section("Applications for transfer or secondment to the\tpublic service of the State.","cat5","29.\t(1) Correspondence regarding the transfer or secondment to the civil service of the State  of holders of pensionable  offices outside  that  civil service shall be conducted through the Commission, unless the Commission otherwise permits, and if a Head of Department  receives such correspondence, including applications direct, he shall inform the Commission about the same.\n" +
                  "(2)\tIf a Head of Department is asked by the Commission to state his views regarding such a transfer or secondment he shall:\n" +
                  "(a)\tIf he recommends an appointment on such transfer or secondment to a\n" +
                  "public office in category 1 or 2, comply with paragraph (a) of Regulation\n" +
                  "25; or\n" +
                  "(b)\tbefore stating that he is prepared to make an appointment on such transfer or secondment to a public office in category 3,  take into account the proviso to paragraph (2) of Regulation 19.\n");


          Section section31 = new Section("When\tan acting appointment  or a temporary appointment may\tbe" +
                  "recommended.\n","cat5","30.\t(1) Where a Head of Department considers it necessary that the duties or part of the duties of a vacant public office to which is attached a salary grading not lower than Level 05 should be discharged before the vacancy can be filled in accordance with Regulation 17 or 19, or where it is necessary that a particular duty post should in accordance with Civil Service Rules 20102 and 20103 continue to be filled at a time when no officer of corresponding substantive rank is available for posting thereto, he may make a recommendation to the Commission, in accordance with Regulation 31, that a public officer should act in the office.\n" +
                  "\n" +
                  "(2)\tWhere a Head of Department considers it necessary that the duties of a vacant public office in the permanent establishment should be discharged before the vacancy can be filled in accordance with Regulation\n" +
                  "17 or 19, and an acting appointment either is not permissible under paragraph (1) of this Regulation, or is in his opinion not in the interest of  the civil service, he may recommend to the Commission or himself make (as may be appropriate to the category of the vacant office), a temporary appointment of an eligible person until such time as an appointment can  be made in accordance with Regulation 17 or 19, or the Head of Department thinks fit to recommend an acting appointment, or the Commission may direct in any case, Regulation 14, and paragraphs (a) or\n" +
                  "(e)\tof Regulation 17, or Regulation 19, as may be appropriate, shall not apply to such temporary appointment, or to an appointment to a public office in categories 1, 2,  3 or 4 which is temporary because the office is  not part of the permanent establishment; Provided that Regulation 14, and Regulation 17 or 19, as may be appropriate, shall apply to the appointment on probation or on contract of the holder of a temporary appointment.\n");

          Section section32 = new Section("Acting appointments: procedure","cat5","In any recommendation he makes for an acting\n" +
                  " \n" +
                  "Applications for transfer or secondment to the\tpublic service of the State.\n" +
                  "\n" +
                  "When\tan acting appointment  or a temporary appointment may\tbe\n" +
                  "recommended.\n" +
                  " \n" +
                  "appointment, a Head of Department shall:\n" +
                  "\n" +
                  "(a)\tstate the date on which he recommends that the appointment shall\n" +
                  "begin, taking into account the provisions of Civil Service Rules\n" +
                  "20106,\n" +
                  " \n" +
                  "state, if possible at the same time as he makes the recommendation and if not as soon as possible thereafter, when he expects that if will end, taking into account the provisions of Civil Service Rules 20107;\n" +
                  "\n" +
                  "(b)\tstate the extent to which the public officer recommended for the appointment will undertake the full duties and responsibilities of\n" +
                  " \n" +
                  "the the\n" +
                  "that\n" +
                  " \n" +
                  "\n" +
                  "office in which he is to act, and recommend the percentage of\n" +
                  "\n" +
                  "acting allowance provided for in Civil Service Rules for which he considers the officer should be eligible;\n" +
                  "\n" +
                  "(c)\twhere the proposed acting appointment is in an office which is not filled\n" +
                  "substantively, and where, whether this is so or not, it is intended\n" +
                  "\n" +
                  "the  appointment  shall  be  for  the  purpose  of  testing  the\n" +
                  " \n" +
                  "suitability of\n" +
                  "the\tofficer\tconcerned\tfor\tpromotion, comply with paragraph (2) of\n" +
                  "Regulation 21 in respect of such acting appointment;\n" +
                  "\n" +
                  "(d)\tif   the   office in  which\tan  acting\tappointment\tis recommended is\n" +
                  "reserved for Nigerians by the Government of the State and the\n" +
                  " \n" +
                  "public the\n" +
                  " \n" +
                  "officer recommended for the appointment is not a Nigerian, cite appointment of a non- Nigerian;\n" +
                  " \n" +
                  "\n" +
                  "\n" +
                  "his\n" +
                  " \n" +
                  "(e)\tmention any objection to his recommendation made by a Head of\n" +
                  "Division or officer co- ordination a\tgroup\tof\tDivisions\tin\n" +
                  "\n" +
                  "Department if he has been specifically asked to do so by such\n" +
                  " \n" +
                  "Head or\n" +
                  "officer.\n" +
                  "(2)\tA copy of any recommendation relating to a public office of Head of Department, Head of Division, or officer coordinating a group of Divisions,\twhich is not included in the Administrative Cadre shall be sent to the Head of\tthe Service by the Permanent Secretary before any final decision is taken thereon by the Commission.\n" +
                  "(3)\tA copy of any recommendation in pursuance of sub- paragraph\n" +
                  "(b) of paragraph (1) of this regulation that a public officer holding an appointment on probation should receive more than 25 per cent of the acting allowance provided for in Civil Service Rules shall be sent to the Permanent Secretary, Office of Establishments by the Head of Department making the recommendation.\n" +
                  "\n" +
                  "(4)\tAs soon as the holder of an acting appointment ceases to hold\n" +
                  " \n" +
                  "it, the\tHead of Department shall report the fact to the Commission.\n");


          Section section33 = new Section("Selection for training leading\tto promotion","cat5","32.\tThe approval of the Commission shall be obtained before a public officer is accorded training which will enable him to obtain qualifications or experience rendering him eligible for promotion. Application for such approval shall:\n" +
                  "(a)\tgive reasons for recommending the selection of the officer;\n" +
                  "(b)\tstate whether he is the most meritorious and suitable of the public officers qualified for the training and where he is not, give detailed reasons as to why his selection has been recommended in preference to each of such other officers in the Department as are senior to him;\n" +
                  "(c)\tindicate how soon a vacancy in the public office for which the training\n" +
                  "may make him eligible is likely to occur and whether other officers are or are likely to be eligible, and if so, give\n" +
                  "details in\trespect of such officers and as to when they are likely to be eligible.\n");
          Section section34 = new Section("Notification by contract  officer of wishes regarding re- engagement","cat5","33.\tA contact officer shall give notice to his Head of Department at the time and in the manner laid down in his agreement as to whether he wants further employment in the civil service and, if the terms on which he is serving do not provided for such notification, he shall give such notice to his Head of Department in writing six months before the expiry of his contract, or if he is an overseas officer, six months before he will be due to leave Nigeria at the end of his residential service under his contract.");

          Section section35 = new Section("Recommendations\n" +
                  "regarding re\n" +
                  "- engagement of contract officers\tin categories 1\n" +
                  "and 2\n","cat5","34.\t(1) On receipt of a notification from a contract officer in category 1 or 2 that he wishes to be re- engaged, a Head of Department shall, subject to paragraphs (2) and (3) of this regulation, make a recommendation to the\tCommission as to the officer’s re- engagement.\n" +
                  "(2)\tIf the contract officer is a re- engaged pensioner or an overseas officer,\n" +
                  "Notification by contract  officer of wishes regarding re- engagement\n" +
                  "\n" +
                  " \n" +
                  "the Head of Department shall send his recommendation to the Commission through the Permanent Secretary, Office of Establishments who shall state his\t\tviews in respect of it when forwarding it to the Commission and if he\t\trecommends re- engagement, shall specify the duration of the re- engagement recommended and if the officer is an overseas officer, shall attach a certificate\tsigned by him to the effect that there is no eligible Nigerian available for the\tpublic office concerned; such certificate shall not be valid until it shall have been countersigned by the Chairman. If an overseas contract officer is a Head of Division, the recommendation shall cite the decision of the Executive Council\n" +
                  "for the State permitting the appointment of a non- Nigerian.\n" +
                  "(3)\tIf the contract officer is a Head of Division or officer co- ordinating a group of Divisions, the Permanent Secretary shall send a copy of the recommendation to the Head of Service.\n");

          Section section36 = new Section("Procedure for recommending retirement of confirmed pensionable officer who has served for not less than ten years","cat6","35.\tIf it appears to a Head of Department that there is reason, arising out\t\tof the officer’s conduct or efficiency, why a public officer who has been confirmed in a pensionable office and has served for not less\tthan\tten\tyears\tshould\tbe called upon to retire, the Head of Department shall:\n" +
                  "\n" +
                  "(a)\t\tif the officer is in  category  1  or  2 make a recommendation, giving his reasons, to the Commission, and if the Commission, after having\treceived the recommendation, authorises him to call upon the officer\tto submit representations regarding his proposed compulsory\t\tretirement, the Head of Department shall do so and upon receiving any such representations or if the officer does not avail himself of the opportunity to submit representations before  a  date specified by the\n" +
                  "\n" +
                  "Head of Department (which date shall allow a reasonable interval for the purpose), he shall report the fact to the Commission; or\n" +
                  "(b)\tIf the officer is not in category 1 or 2, afford him an opportunity of submitting representations regarding his proposed compulsory retirement and if the officer does not avail himself of the\n" +
                  "opportunity\n" +
                  "before a date specified by the Head of Department (which date\n" +
                  " \n" +
                  " \n" +
                  "shall the that\n" +
                  " \n" +
                  "\n" +
                  "allow a reasonable interval for the purpose) or if it still appears to Head of Department, after considering any such representations,\n" +
                  "the officer should be called upon to retire, he shall make a recommendation to the Commission, attaching any\n" +
                  " \n" + "representations\n" +
                  "which shall include his observations upon any representations\n" +
                  "made by the officer\n");


          Section section37 = new Section("Procedure for termination of appointment in abolition of a number of offices","cat6","36.\tIf a public office in the permanent establishment which is one of a number of similar public offices is abolished but one or more such officers remain, the Head of Department shall make a recommendation to the Commission, giving his reasons, as to which substantive holder of such office shall have his appointment terminated.");

          Section section38 = new Section("Procedure for recommending Premature withdrawal or termination of pensionable officer who has served for less than ten years.","cat6","If it appears to the Head of Department that there is reason arising out of the officer’s conduct or efficiency, why a public officer who has served\t\tfor less than ten years should withdraw from the Service or that his appointment\t\tbe terminated, the Head of Department shall call on the officer to submit representations as to why he should not be asked to withdraw, or have his\t\tappointment terminated and upon receiving  any  such  representations  shall  transmit them with his observation upon them to the Commission, or if the officer does not avail himself of the opportunity to submit representations before\ta date specified by the Head of Department (which date shall allow a reasonable\t\tinterval for the purpose), he shall report the fact to the Commission");

          Section section39 = new Section("Premature termination\tof contract officer’s appointment and\n" +
                  "termination\tof temporary appointment\n","cat6","38.\tWhere a contract officer is serving under an agreement which provides\t\tfor the termination of his appointment before the expiration of the term of engagement stipulated in the agreement, and the officer’s Head of Department is of opinion that the appointment should be so terminated or where a\t\tHead of Department is of opinion that the appointment of the holder of a temporary appointment should be terminated,  and where in either case Regulation   36 does   not apply, he shall, if the officer is category 1, or 2, make a recommendation to\tthe Commission, or if the officer is in category 3 or 4, terminate the appointment\tin accordance with the agreement or in the case of a temporary appointment, in accordance with the terms upon which the appointment was made.");


          Section section40 = new Section("Commission may\tinitiate" +
                  "retire-ment, withdrawal\tor premature termination\tof appointment","cat6","39.\tIn any case in which it appears to the Commission to be desirable that\t\ta pensionable public officer should retire, withdraw or that the appointment of\ta contract officer should be terminated before the expiration of the term of\t\tengagement stipulated in the officer’s agreement or that the appointment of any  officer should be terminated, the Commission may, notwithstanding the provisions of Regulations 35,36, 37 or 38, direct the Head of Department to take\tsuch proceedings as are appropriate in accordance with any of those regulations.\n" +
                  " \n" +
                  "or itself initiate proceedings in that behalf in such manner as it shall think fit.\n" +
                  "\n");

          Section section41 = new Section("Procedure for concluding probationary service and acting appointment with a view to promotion.","cat6","40.\t(1) where a public officer holds an appointment on probation and the Head of Department at any time during the period of probation is of opinion that\tthe officer’s appointment should be terminated, the Head of Department shall, subject to paragraph (3) of this regulation, make a recommendation to the Commission accordingly, if the officer  is   in   category    1    or    2,    or    terminate    the appointment of the officer is in category 3.\n" +
                  "\n" +
                  "(2)\tWhere a public officer holds an appointment on probation, and no action as provided in paragraph (1) of this regulation, has been taken earlier,  the Head of Department shall,  six months  before the expiration   of the period of probation, consider whether the officer should on such expiration be confirmed\tin a pensionable office, or whether a further period of probationary service is necessary to determine whether the officer should be confirmed or not, or whether his appointment should be terminated and shall:\n" +
                  "(a)\tIf the officer is in category 1 or 2 make a recommendation to the\n" +
                  "Commission, subject to paragraph (3) of this regulation, not later\n" +
                  "than two months before the officer’s probationary period is due to expire; or\n" +
                  "(b)\tIf the officer is in category 3, subject to paragraph (3) of this regulation, make such decision on the expiration of the officer’s probationary period as may be consistent with the extent to which the officer has satisfied the conditions for confirmation: Provided  that  nothing  in this paragraph shall preclude a Head of Department from informing the Commission, at any time after  he  has made a recommendation under sub- paragraph (a) of this paragraph that an officer should be  confirmed, but before the officer has been confirmed, that he has had occasion to vary his recommendation or decision,  or from making, subject to paragraph (3) of this regulation, a different recommendation.\n" +
                  "\n" +
                  "(3)\tWhere the Head of Department proposes to recommend to the Commission or to decide, as may be appropriate to the category of the officer concerned, that the appointment on probation of that officer should not be confirmed but should be terminated, the Head of Department shall inform the officer of his intention and shall afford him an opportunity of submitting representations, if any, before making his decision, or transmit such representations with his observations to the Commission, accordingly as is appropriate, or if, in any case where the Head of Department proposes to make recommendations to the Commission as aforesaid, the officer does not avail himself of the opportunity to submit\n" +
                  " \n" +
                  "\n" +
                  "Procedure for concluding probationary service and acting appointment with a view to promotion.\n" +
                  " \n" +
                  "representations before a date specified by the Head of Department (which date shall allow a reasonable interval for the purpose) he shall report the fact to the Commission.\n" +
                  "\n" +
                  "(4)\t(a) Where in accordance with paragraph (2) of Regulation 21, a public officer has been appointed to act in a higher post with a view specifically to his\teventual promotion thereto, if he proves suitable, the Head of Department may recommend to the Commission at any time within six months of the effective date\tof such acting appointment that the acting appointment should be made\n" +
                  "\n" +
                  "Commission  may initiate proceedings\n" +
                  "\n" +
                  "Misconduct to be dealt with as soon possible\tafter\n" +
                  "occurrence\tand procedure in cases  not provided for\n" +
                  "by regulations\n" +
                  " \n" +
                  "\n" +
                  "substantive or that the officer should revert to his substantive appointment. Where no such recommendation has been made earlier, the Head of Department shall, not later that one month before the end of the said six months, recommend to the Commission that the officer’s acting appointment should be made substantive, or that the officer should revert to his substantive appointment.\n" +
                  "\n" +
                  "(b) If the Commission authorises the Head of Department to call upon the officer to submit representations regarding his proposed reversion, the Head of Department shall do so and upon receiving any such representation, shall submit\n" +
                  "them with his observations to the Commission, or if the officer does not avail himself of the opportunity to submit representations before a date specified by\tthe Head of Department (which date shall allow a reasonable interval for the purpose), he shall report the fact to the Commission.\n");

          Section section42 = new Section("Commission  may initiate proceedings","cat6","41.\tIn any case which comes to the attention of the Commission, if the Commission is of the opinion that disciplinary proceedings should be instituted against a public officer, the Commission may notwithstanding any other\tprovisions of these Regulations, direct the Head of Department to initiate such proceedings in accordance with these  Regulation  or  itself  initiate  proceedings  in that behalf in such manner as it thinks fit. Provided that where a public\tofficer has since the time of commission of the alleged act of misconduct come under the control of more than one Head of Department, the Commission may direct either of the Heads of Department to initiate the proceedings as may be convenient.");
          Section section43 = new Section("Misconduct to be dealt with as soon possible\tafter\n" +
                  "occurrence\tand procedure in cases  not provided for " +
                  "by regulations","cat7","\n" +
                  "42.\t(1) Any misconduct by a public officer shall be dealt with under these Regulations as soon as possible after the time of its occurrence.\n" +
                  "\n" +
                  "(2)  Any case of misconduct for which an appropriate procedure is   not provided by these Regulations shall be reported to the\n" +
                  "Procedure where grounds for criminal prosecution may exist.\n" +
                  " \n" +
                  "Commission, and the Commission may issue instructions as to how  the case shall be dealt with and the case shall be dealt with accordingly.\n");

          Section section44 = new Section("No disciplinary action against a female officer on Maternity leave","cat7","43.\tAny disciplinary proceedings against a female public officer which\twould otherwise have been taken during the period of her maternity leave\tshall be postponed until her maternity leave and any further sick leave that may\tbe granted to her, has expired.");

          Section section45 = new Section("Procedure where grounds for criminal prosecution may exist","cat7","44.\tIf it appears while the institution of disciplinary proceeding is being contemplated, or in the course of an inquiry or investigation, that a criminal offence may have been committed by a public officer the institution or Continuation of disciplinary proceedings shall not be postponed and the Head\tof Department shall, unless the Police have taken or are about to take action, report the matter to the Police for such action as they may consider necessary\tand endorse the report to the Director of Public Prosecutions in the Ministry of Justice for his information. However, for the purpose of disciplinary proceedings, the Head of Department shall prepare a statement of the grounds upon which\n" +
                  " \n" +
                  "disciplinary proceedings are to be instituted against a public officer under appropriate Regulations.\n");

          Section section46 = new Section("Duties of Interdicted or suspended officer","cat7","48. A public officer who is under interdiction or suspension shall not leave the State without the permission of the disciplinary authority which interdicted or suspended him, and shall keep his Department informed of the address at officer\twhich instructions to him can be delivered. If he fails to comply with instructions\n" +
                  "delivered at such address within twenty- four hours of such delivery, he shall\n" +
                  "be\n" +
                  "regarded as being absent from duty without leave. Where and officer under interdiction or suspension has received permission from the disciplinary authority which interdicted or suspended him to leave the State, any condition imposed by that disciplinary authority in respect of his so leaving, shall be complied with by him and failure to do so may be dealt with as misconduct for which disciplinary proceedings may be instituted under these Regulations.\n");

          Section section47 = new Section("Salary during interdiction or suspension","cat7","49 (1) A public officer who is under interdiction shall, subject to the provisions of Regulation 51, receive 50 per cent of his salary\n" +
                  "(2) A public officer who is under suspension shall not, subject to the\n" +
                  "provisions of Regulation 51 receive any salary during the period of suspension. (3) If the disciplinary proceedings against such an officer under suspension result otherwise than in his dismissal the whole of the salary withheld from him shall be restored to him when the final decision as to that result is made.\n");


          Section section48 = new Section("Disciplinary action after acquittal or discharge on a criminal charge.\n" +
                  " \n","cat7","50.\tA public officer acquitted on a criminal charge for an office (being\t\ta criminal offence as defined for the purpose of these Regulations) or given a discharge, whether amounting to an acquittal or not, in any court of law may be dismissed or otherwise punished, in accordance with the appropriate provisions\tof these Regulations, on any other charge arising out of his conduct in the\tmatter which, the Head of Department may consider as not raising substantially the same issues as those on which the public officer has been acquitted\n" +
                  " \n" +
                  " \n" +
                  "or given\ta discharge. The Head of Department may refer the matter to the Solicitor- General for advice and in that event any disciplinary charge to be preferred against him shall be prepared by the Solicitor- General. Where however the Solicitor- General is of the opinion that the disciplinary charge will raise substantially the same issues as those on which the public officer has been acquitted or given a discharge as aforesaid, the Head of Department may still recommend the institution or continuance of (or, in the of a public officer in category 3 or 4,institute or continue) disciplinary proceedings against the public officer, and the Head of Department and any other disciplinary authority dealing with the case of the officer shall have regard to such circumstances as whether, the acquittal or discharge on the criminal charge apart, his conduct in the matter has been in any respect blame- worthy; having regard to the interest of the officer concerned vis- a- vis the interest of the Department where he is employed in particular and the overall interest of the civil service as a whole.\n");

          Section section50 = new Section("Disciplinary action after conviction","cat7","51.\tA public officer adjudged by a court of law to be guilty of a criminal\toffence (being a criminal offence as defined for the purpose of these Regulations) shall not receive any emoluments from the date of such judgement, pending the decision of the disciplinary authority.\n" +
                  "\n" +
                  "52.\t(1) If a public officer in category 1 or 2 is convicted of a criminal offence (being a criminal offence as defined for the purpose of these Regulations) the Head of Department shall make a recommendation to the Commission as to\n" +
                  "whether the officer should be dismissed or subjected to some lesser penalty on account of his conviction for the offence of which he has been adjudged guilty,\t\tand shall submit with his recommendation a copy of the charge or charges and\tof the judgement (and the proceedings of the court, if they are available at the\ttime he makes his recommendation and, if they are not, and if the Commission asks to see them when they become available) and the Commission may inflict\tsuch punishment upon the officer as may seem proper to the Commission without the procedure in Regulation 56, 58 or 60 being followed.\n" +
                  "\n" +
                  "(2) If a public officer in category 3 or 4, is convicted of such a criminal\toffence as aforesaid, the disciplinary authority may inflict such punishment\tupon the officer as may seem proper to it without following the procedure prescribed in Regulations 56, 59 or 60.\n");




          Section section51 = new Section("Absence without leave or reasonable cause","cat7","Without prejudice to the power to institute disciplinary proceedings in respect of any absence from duty without leave or reasonable cause, where a public officer is absent from duty without leave or reasonable cause, the disciplinary authority may dismiss him without following the\n" +
                  " \n" +
                  "\n" +
                  "Punishments\n" +
                  " \n" +
                  "procedure proscribed in Regulation 56 or 59.\n" +
                  "\n" +
                  "(2)\tA public officer shall be considered and treated for all purposes as having been dismissed form the civil service by the very fact, and from the very date, of his having committed any of the following acts or omissions:\n" +
                  "(a)\tabsenting himself from duty without leave or reasonable cause and in circumstances evincing an intention on his part, no longer to continue in the civil service;\n" +
                  "(b)\tresigning or purporting to resign his appointment without having first given due notice, and serving for the period of the notice, of\n" +
                  "such resignation or else paying in lieu thereof in accordance with the provisions\n" +
                  "applicable in the civil service in that behalf.\n" +
                  "Provided that if the public officer concerned can later satisfy the disciplinary\n" +
                  "authority that the circumstances of his having committed any of the acts or  omissions afore- mentioned do not justify this dismissal from the  civil service, the disciplinary authority may, without prejudice to the power to institute disciplinary proceedings in respect of such acts or omissions and with a view to a lesser punishment than dismissal being imposed, revoke the dismissal.\n");

          Section section52 = new Section("Officers who hold powers of inquiry","cat7","54.\t(1) The public officers holding or acting in any of the following public offices shall hold powers of inquiry under these Regulations:\n" +
                  "(a)\tpublic offices graded in Level 08 and above;\n" +
                  "(b)\tsuch other public office as may be specified by the Commission\n" +
                  "in any particular case.\n" +
                  "\n" +
                  "(2) For the avoidance of doubt, it is hereby declared that the powers of inquiry provided for in paragraph (1) of this regulation shall not include any power to reach final decision or award punishment or notify findings to any other person than the disciplinary authority or the Head of Department of an officer whose conduct is the subject of the inquiry.\n");


          Section section53 = new Section("Punishments","cat7","55.\tThe following are the punishments which may be ordered under and in accordance with this Part of these Regulations:\n" +
                  "(a)\tdismissal;\n" +
                  "(b)\tremoval on ground of inefficiency;\n" +
                  "(c)\tdischarge on grounds of general unsuitability for further\n" +
                  "employment in the case of a person holding a non- established and non- pensionable office;\n" +
                  "(d)\treduction in rank;\n" +
                  "(e)\treduction in salary;\n" +
                  "(f)\twithholding of salary where the circumstances do not justify dismissal or other punishment;\n" +
                  "(g)\twithholding of increment;\n" +
                  "(h)\tloss of pay for corresponding days of absence from duty without authority;\n" +
                  "\n" +
                  "(i)\tsurcharge;\n" +
                  "(j)\treprimand; and\n" +
                  "(k)\twritten warning.\n" +
                  "Provided that nothing in this regulations shall be construed as limited or\n" +
                  "otherwise affecting any powers of the Commission in relation to the withholding,  reduction or suspension of benefits to which section 210   of the Constitution applies, or any powers to call upon an  officer  to retire or withdraw in pursuance of Regulation 35, 37, or 39 or any powers to terminate a contract officer’s appointment prematurely or to terminate the appointment of the holder of a temporary appointment in pursuance of Regulation 38 or 39, or any powers to terminate or extend a probationary appointment, or to order that any officer acting in  a higher post with a view to his eventual promotion thereto, if he proves unsuitable should revert to his substantive appointment,  in pursuance  of Regulation 40 or any powers to withhold increments, without proceedings under Regulation 58 or 59, in pursuance of Regulation 61\n");

          Section section54 = new Section("Procedure for dismissal of officers in categories 1\n" +
                  "and 2\n","cat7","56.\tWherever a Head of Department considers it necessary to institute disciplinary proceedings against a public officer in category 1 or 2 and he is of\n" +
                  "the opinion that the misconduct alleged against the officer is such as would, if proved, justify the officer’s dismissal from the civil service, the following shall apply:\n" +
                  "(1)\tIf the officer is in category 1 or 2:\n" +
                  "(a)\tThe Head of Department shall prepare and forward to the officer a brief statement of the facts on which the allegation against him is based and shall call on him to state in writing before a day to be specified (which date shall allow a reasonable interval for the purpose) any grounds upon which he relies to exculpate himself.\n" +
                  "\n" +
                  "(b)\tThe Head of Department shall, immediately after the specified\n" +
                  "day forward to the Commission, with his comments or recommendations any such statement as the officer may have\n" +
                  "furnished or report to the Commission, the fact that the accused\n" +
                  "officer has failed to furnish an exculpatory statement.\n" +
                  "\n" +
                  "(c)\tAfter receiving the report or statement together with the comments and recommendations referred to in sub- paragraph (b) of this paragraph, the Commission may:\n" +
                  "(i)\tdecide the issue depending on the clarity of the facts disclosed;\n" +
                  "(ii)\tseek further clarifications of any doubtful points\n" +
                  " \n" +
                  "\n" +
                  "\n" +
                  "\n" +
                  "\n" +
                  "\n" +
                  "\n" +
                  "\n" +
                  "\n" +
                  "\n" +
                  "\n" +
                  "\n" +
                  "\n" +
                  "\n" +
                  "\n" +
                  "\n" +
                  "\n" +
                  "\n" +
                  "\n" +
                  "\n" +
                  "Procedure for dismissal of officers in categories 1\n" +
                  "and 2\n" +
                  " \n" +
                  "or call on the officer to submit fresh representation through his Head of Department who shall add his own comments and recommendations as to the punishment, if any to be awarded;\n" +
                  "(iii)\tappoint a Committee comprising such persons as it shall\n" +
                  "specify, being not less than three in number, to hold an\n" +
                  "inquiry into the matter;\n" +
                  "\n" +
                  "Provided that the Head of Department or any other officer of the Department\n" +
                  "of the officer concerned shall not be a member of the Committee;\n" +
                  "\n" +
                  "(d)\tIn the event of a Committee being appointed as stated in sub-\n" +
                  "paragraph (c) of this paragraph-\n" +
                  "(i)\tthe Committee shall inform the accused officer that on a specified day the charge made against him will be investigated by them and that he will be allowed or, if the Committee shall so determine, will be required, to appear before them to defend himself;\n" +
                  "(ii)\tif witnesses are examined by the Committee, the accused officer shall be given an opportunity of being present and of putting questions on his own behalf to such witnesses, he\tmay also call witnesses in his own defence and such witnesses may be examined by the Committee;\n" +
                  "(iii)\tthe Committee may in its discretion permit the Head of Department to be represented by a public officer or a legal practitioner, provided that where the Committee permits that Head of Department to be represented by a legal practitioner or a public officer holding the qualifications of a legal practitioner, it shall permit the accused officer to be represented by a legal practitioner if he so wishes;\n" +
                  "(iv)\tif, during the course of the inquiry, new allegations are made,\n" +
                  "the Committee shall inform the Commission and, if the Commission thinks fit to proceed against the accused officer upon such new allegations, the same procedure shall be followed by the Head of Department in dealing with the fresh allegations as was adopted in the original statement;\n" +
                  "(v)\tthe Committee, having inquired into the matter, shall forward its report thereon to the Commission, accompanied by the record of the charges, the evidence led, the defence and other proceedings\n" +
                  " \n" +
                  "relevant to the inquiry, and its findings on the charges, through the Head of Department, who shall add his recommendation as to the punishments, if any;\n" +
                  "(vi)\tthe Commission, after consideration of the report of the Committee, may, if it is of the opinion that the report should\tbe amplified in any way or that further investigation is desirable, refer the matter back to the Committee for further\n" +
                  "investigation and report, or may itself hear evidence by summoning the parties or witnesses involved before the Commission, or examine any documentary evidence;\n" +
                  "(vii)\tthe Commission’s decision on each allegation made against the accused officer (but not the reasons for the decision) shall be communicated to him.\n" +
                  "\n" +
                  "(2)\tIf the officer is in category 3\n" +
                  "\n" +
                  "(a)\tThe Head of Department shall, forward to the officer, a brief statement\n" +
                  "of the facts on which the allegation against him is based, and shall call\ton him to state in writing before a day to be specified (which date shall\n" +
                  "\n" +
                  "\n" +
                  "\n" +
                  "\n" +
                  "allow a reasonable interval for the purpose) any\n" +
                  "grounds\tupon which he relies to exculpate himself;\n" +
                  "\n" +
                  "(b)\tIf the officer does not avail himself of the opportunity to exculpate himself or if the Head of Department does not consider that the officer has exculpated himself, the Head of Department shall:\n" +
                  "(i)\tdecide the issue; or\n" +
                  "(ii)\tappoint a public officer specified by or under paragraph (1)\n" +
                  "of Regulation 54 as holding powers of inquiry to hold an inquiry into the charge.\n" +
                  "(c)\tAt an inquiry under this regulation, the accused officer shall be permitted to be present and shall be allowed to cross- examine any witness testifying against him, to make a statement and to call witnesses in his defence and to have access to all documentary evidence available against him;\n" +
                  "(d)\tThe officer holding the inquiry may in his discretion permit the Head of Department to be represented by a public officer of a legal practitioner provided that where the officer permits the Head of Department to be represented by a legal practitioner or\n" +
                  " \n" +
                  "a public officer holding the qualifications of a legal practitioner, he shall permit the accused officer to be represented by a legal practitioner.\n" +
                  "\n" +
                  "(e)\tIf after considering the report of an inquiry held under this regulation, the Head of Department thinks that punishment should be inflicted on the accused officer, he shall inflict the punishment and report the matter to the Commission.\n" +
                  "\n" +
                  "(f)\tThe Head of Department’s decision on each allegation made against the accused officer (but not the reasons for the decision) shall be communicated to the officer.\n");


          Section section55 = new Section("Documentary\n" +
                  "evidence and supplying of\n" +
                  "copies of evidence\n","cat7","57.\t(1) No documentary evidence shall be used at or for the purpose of an inquiry under Regulation 56 without the accused officer having first had a reasonable time before hand, and opportunity to receive a copy thereof, for which copy no charge shall be made, or an opportunity of access there- to.\n" +
                  "(2) After an inquiry has been closed, the accused officer may be given a copy of the record of the evidence led (including, where reasonable copies of documents tendered in evidence or the relevant parts thereof, but not including any part of the report on or the proceedings of the inquiry other than the record of the evidence led) on payment of such amount as the Commission may specify, regard being held to the labour and cost of producing such document.\n");

          Section section56 = new Section("Procedure for lesser punishment than dismissal of officer in categories 1,\n" +
                  "2 and 3.\n","cat7","58.\tWhenever a Head of Department considers it necessary to institute disciplinary proceedings against a public officer in category 1, 2, 3 and is of the opinion that the misconduct alleged against the officer is not such as would,\tif proved, justify the officer’s dismissal from the civil service, the following\t\tshall apply:\n" +
                  "(1)\tIf the officer is in category 1 or 2-\n" +
                  "(a)\tThe Head of Department shall report the case together with a Documentary\n" +
                  "evidence and supplying of\n" +
                  "copies of evidence.\n" +
                  " \n" +
                  "\n" +
                  "Procedure for lesser punishment than dismissal of officer in categories 1,\n" +
                  "2 and 3.\n" +
                  "\n" +
                  "\n" +
                  "Category 1 or\n" +
                  "2\n" +
                  "\n" +
                  "\n" +
                  "statement of his opinion and the reasons for it to the Commission\n" +
                  "(b)\tIf the Commission agrees with the opinion of the Head of Department, the Commission may:\n" +
                  "(i)\tdecide the issue;\n" +
                  "(ii)\tdirect the Head of Department to cause an investigation to\tbe made into the matter by a public officer holding powers of inquiry in such manner as it shall think fit; or\n" +
                  "(iii)\tif it considers the circumstances to have been sufficiently established by other proceedings under these Regulations or otherwise, direct the Head of Department  to  call the officer\tto submit representations as to why he should not be punished;\n" +
                  "\n" +
                  "Provided that in each case the accused officer shall be entitled to know the whole case against him and shall have an adequate opportunity of making his defence.\n" +
                  "(c)\tThe Head of Department shall forward to the Commission, the report\n" +
                  "of any such investigation and any representations submitted by\n" +
                  " \n" +
                  "the\n" +
                  "\n" +
                  "dismissal,\n" +
                  " \n" +
                  "\n" +
                  "accused officer, together with the Head of Department’s recommendations as to the punishment, if any, other than\n" +
                  "\n" +
                  "which he considers should be inflicted upon the accused officer.\n" +
                  " \n" +
                  "(d)\tThe Commission’s decision on each allegation made against the accused officer (but not the reasons for the decision) shall be communicated to him.\n" +
                  "(2)\tIf the officer is in category 3:\n" +
                  "(a)\tThe Head of Department shall:\n" +
                  "(i)\tcause an investigation to be made into the matter b y a public\n" +
                  "officer specified by or under paragraph (1) of Regulation 54\n" +
                  "as holding powers of inquiry, in such manner as the\n" +
                  " \n" +
                  "Procedure for dismissal or lesser punishment of officer in category 4\n" +
                  " \n" +
                  "Head of\n" +
                  "Department thinks fit; or\n" +
                  "(ii)\tif he considers the circumstances to have been sufficiently\testablished by proceedings other than proceedings under these\n" +
                  "Regulations or otherwise, call upon the officer to submit representations as to why he should not be punished;\n" +
                  "Provided that in either event the accused officer shall be entitled to know the whole case against him and shall have an adequate\n" +
                  "opportunity of\tmaking his defence.\n" +
                  "(b)\tIf, after considering the report of any such investigation and any representations submitted by the accused officer, the Head of Department is of the opinion that the allegation is proved, he shall\n" +
                  "decide the case and inflict punishment, if any, other than dismissal\n" +
                  "upon the accused officer.\n");


          Section section57 = new Section("Procedure for dismissal or lesser punishment of officer in category 4","cat7","Where the misconduct alleged against a public officer in category 4 is such as would, if proved, justify his dismissal from the civil service or his being otherwise punished, the Head of Department shall inform the officer concerned of the grounds upon which it is proposed to dismiss or otherwise\n" +
                  " \n" +
                  "punish\thim\tand\tshall\tgive\thim\tan\topportunity\tto\tsubmit representations as to\n" +
                  "why he should not be dismissed or otherwise punished.\n" +
                  "(2) If the officer does not avail himself of the opportunity to submit\n" +
                  "representations as aforesaid, or if the Head Department or other disciplinary\n" +
                  "authority is not satisfied with the representations submitted by the officer, the\n" +
                  "Head of Department or other disciplinary authority may dismiss or otherwise\n" +
                  "punish him as is considered appropriate having regard to the circumstances of\n" +
                  "his case.\n");

          Section section58 = new Section("Procedure for removal for inefficiency categories 1, 2 and\n" +
                  "3.\n","cat7","60.\t(1) Before recommending to the Commission that a public officer in\n" +
                  "category 1 or 2 should be removed from the civil service or otherwise dealt with on grounds of inefficiency, and before removing from the civil service or otherwise dealing with a public officer in category 3 on such ground, a Head of Department shall prepare a statement as to the officer’s general standard of efficiency and shall afford him an opportunity of considering the statement and showing cause why he should not be removed from the civil service or otherwise dealt with on grounds of inefficiency.\n" +
                  "Provided that nothing in this paragraph shall prevent the Commission or a Head of Department from ordering, or a Head of Department from recommending, in each case as may be appropriate to the category of the officer concerned, the removal from the civil service, on grounds of inefficiency, of a public officer who has been confirmed in a pensionable office where the Commission or the Head of Department, as the case may be, is of the opinion, upon the completion of proceedings instituted for the dismissal of the officer that the officer does not deserve to be dismissed but that the proceedings disclose grounds for removing him on account of inefficiency, in which event, it shall not be necessary to comply with the main provisions of this paragraph.\n" +
                  "(2)\tBefore discharging a public officer in category 4 (subject to any terms as to notice applying to his appointment) on grounds of general unsuitability for further employment, a disciplinary authority shall warn him of his failings and give him an opportunity to improve or to offer as explanation as to his failure to perform his duties in a satisfactory manner.\n" +
                  "\n" +
                  "61.\tIf a Head of Department is of the opinion that there are grounds upon\n" +
                  "which the grant of an annual increment to a public officer should be withheld,\n" +
                  "the Head of Department:\n" +
                  "(a)\tif the officer is in category 1 or 2, shall report the case  with his\n" +
                  " \n" +
                  "recommendation to the Commission; or\n" +
                  "(b)\tif the officer is in category 3 r 4, may withhold the increment as he shall think fit.\n");

          Section section59 = new Section("Withholding of increments Appeals to the Commission","cat7","(1) where powers have ben delegated in Regulation 11 to a public\tofficer, any person aggrieved by any decision taken in pursuance of such delegation may appeal to the Commission against any such decision, but no appeal shall normally be entertained in any case unless the application setting out the grounds of appeal is received by the Commission within six weeks of the date upon which such decisions was notified or, became known to the officer, but the Commission may entertain an appeal out of time if in its opinion the circumstances warrant that course.\n" +
                  "(2)\tOnly one such appeal shall normally be entertained, but a second appeal\twithin one year of the date upon which the decision appealed against was\t\tnotified or became known to the officer may be entertained if the Commission is satisfied that the second appeal discloses new and material facts which might\t\thave affected the former decision, and if adequate reasons are given as to the\t\tnon- disclosure of such facts before or by the date of the former decision.\n" +
                  "\n" +
                  "(3)\tA copy of any application setting out the grounds of an appeal submitted to the Commission shall be given by the appealing officer to the Head\tof Department and, if the decision appealed against was taken by a disciplinary\t\tauthority in the Department other than the Head of Department, to that authority  also, and comments upon the application shall be furnished to the Commission\t\tby the Head of Department and, if applicable, by such other disciplinary authority\t\tthrough the Head of Department.\n" +
                  "\n" +
                  "(4)\tWhen communicating his decision in pursuance of any delegation of\t\tpowers as is referred to in paragraph (1) of this regulation to an accused officer,\ta disciplinary authority shall inform him that an appeal may be made to the\tCommission within six weeks thereafter, but any\n" +
                  " \n" +
                  "failure to communicate such\tfact shall not invalidate any such decision.\n");

          Section section60 = new Section("When petitions be addressed to\n" +
                  "the Commission\n","cat8","63.\t(1) A public officer or a person who was formerly a public officer may,\tsubject to the other paragraph of this regulation, petition the Commission on a\tmatter concerning the exercise of a power vested in the Commission by the Constitution.\n" +
                  "Routing of and comments on the Commission.\n" +
                  " \n" +
                  "(2)\tNo petition shall be submitted on any matter in respect of which provision\tis made in Regulation 62 for an appeal.\n" +
                  "\n" +
                  "(3)\tBefore petitioning the Commission, a public officer or a person who\t\twas formerly a public officer shall make representations to his Head of\t\tDepartment (in the case of  a  public  officer  through  the  usual  departmental  channels) and a public officer, or a person who was formerly a public officer shall\tpetition the Commission, only if he fails to obtain satisfaction as a result of\t\tsuch representations, which failure he shall record in his petition.\n");



          Section section61 = new Section("Commission may require reports to be rendered","cat9","68.\tThe Commission may require Performance Evaluation Reports to be rendered on public officers and submission and custody of such reports shall comply with the provisions of these Regulations and any instructions in that behalf that may be issued by or with the approval of the Commission.");

          Section section62 = new Section("Performance Evaluation Reports","cat9","Performance Evaluation Reports shall be rendered to the Commission by Heads of Departments on every public officer in category 1 or 2 and to Heads of Departments by such public officers as they may prescribe on every public officer in category 3, who is:\n" +
                  "(a)\ton probation;\n" +
                  "(b)\ton contract and has served for less than two years;\n" +
                  "(c)\ta re- engaged pensioner on contract;\n" +
                  "(d)\tappointed to act in a higher post with a view specifically to his eventual promotion thereto if he proves suitable.\n" +
                  "(2)\tPerformance Evaluation Reports shall be rendered on officers in category 1 or 2 in such forms as the Commission may prescribe and on other officers as the Head of Department may prescribe subject to any instructions given by the Commission in that regard. Any such report in which a recommendation is made that an officer appointed to act in a higher post with a view specifically to his eventual promotion thereto if he proves suitable should be promoted, shall include as full an\n" +
                  " \n" +
                  "assessment as possible of his achievements and future potentiality. Any final report required by paragraph (3) of this regulation shall include a definite recommendation, as to the officer’s confirmation, further engagement, or promotion.\n" +
                  "\n" +
                  "(3)\tHeads of Departments may prescribe the times at which Performance Evaluation Report on public officers in category 4 shall be submitted. A separate Performance Evaluation Report shall be rendered on public officer in category 1, 2 or 3 to whom sub- paragraphs (a) to (c) of paragraph (1) of this regulation apply, not later than six weeks after the end of the period to which it relates, in respect of each of his first three periods of six months’ service (which shall be construed as service which is part of a tour in the case of an overseas officer, but otherwise as service including leave), and a final report shall be rendered not later than two months before the officer’s probationary period or second year of re- engagement is due to expire or not later than four months before his second year of contract service or (in the case of an overseas contract officer, serving the second of two tours of not less than fifteen months each) second tour of contract service, is due to expire, and a separate Performance Evaluation Report shall be rendered on a public officer to whom sub- paragraph (d) of paragraph (1) of this regulation applies at the same time as any recommendation is made to the Commission in pursuance of sub- paragraph (a) of paragraph (4) of Regulation 40.\n" +
                  "\n" +
                  "Provided that:\n" +
                  "(i)\twhere an officer’s probationary period has been reduced to less than two years or where a contract officer is appointed for a shorter period than two years, or, in the case of an overseas contract\n" +
                  " \n" +
                  "\n" +
                  "fifteen\n" +
                  " \n" +
                  "officer, is serving for a shorter period that two tours of\n" +
                  "\n" +
                  "months each,  the number of reports to be rendered  on\n" +
                  " \n" +
                  "periods\n" +
                  "of six months service shall be correspondingly reduced\n" +
                  "and\n" +
                  "references to a final report shall be rendered not later\n" +
                  "than two\n" +
                  "months before a probationary period or four months before a\n" +
                  "period of contract service is to expire;\n" +
                  "(ii)\twhere an officer’s probationary period has been extended\n" +
                  "beyond two years, a separate report, to be known as an Additional Performance Evaluation Report, shall be\n" +
                  "rendered,\n" +
                  "not later than six weeks after the end of the period to which it\n" +
                  "relates, on each period of six months’ service under\n" +
                  "such\n" +
                  "extension;\n" +
                  "on every\n" +
                  " \n" +
                  "(iii)\twhere an overseas officer is due to go on leave during his\n" +
                  "probationary period, or at the end of a tour, other than the last, of a contract providing for more than one tour of service, and an adverse opinion has been formed of his suitability for confirmation or for a further tour as a Special Evaluation Report shall be rendered not later than two months before he is due to go on leave, but no delay in the submission of such a Special Evaluation Report shall affect any decision by the appointing authority.\n");


          Section section63 = new Section("Annual Performance Evaluation Reports","cat9","70.\t(1)Annual Performance Evaluation Reports shall be rendered\n" +
                  " \n" +
                  "public officer who:\n" +
                  "(a)\tholds a public office;\n" +
                  "(b)\tis not an officer in respect of whom paragraph  (1)  of Regulation 69\n" +
                  "requires a Performance Evaluation Report to be rendered or an officer holding a temporary appointment. Provided that it shall not be necessary to render an Annual Performance Evaluation Report in respect of an office on whom a Performance Evaluation Report has been rendered less than four months before the end of the period for which an Annual Performance Evaluation Report would have been required.\n" +
                  "\n" +
                  "(2)\tAnnual Performance Evaluation Report on a public officer in category\n" +
                  "1 or 2 shall be rendered to the Commission by Heads of Departments, and in such form as the Commission may prescribe, and such reports on other\n" +
                  "\n" +
                  "Annual Performance Evaluation Reports\n" +
                  " \n" +
                  "public officers shall be rendered to Heads of Departments by such public officers and in such form as they prescribe subject to any instructions that may be given by the Commission in that regard.\n" +
                  "(3)\tThe procedure for the rendering of Annual Performance Evaluation\n" +
                  "Reports on public officers not in category 1 or 2 shall be at the discretion of Heads of Departments, and on officers in category 1 or 2 shall be as follows:\n" +
                  "(a)\tAn Annual Performance Evaluation Reports shall be rendered in respect\n" +
                  "of each period of twelve months ending on 31st December, or subject to the proviso to paragraph (1) of this regulation, any part of that period during  which\tan officer has held a public office in respect of which paragraphs (1) and (2) of\tthis regulation require that an Annual Performance Evaluation Report shall be\trendered on him to the Commission.\n" +
                  "\n" +
                  "(b)\tIn the first week of January each year, or earlier if he will then be\n" +
                  "on leave or if his Head of Department requires him to take earlier action, every public officer in category 1 or 2 on whom an Annual Performance Evaluation Report is required by this regulation shall complete, sign and date the part he is required to complete of the prescribed number of copies of prescribed form and, if he is a Head of Department, shall deliver the copies to the Head of Service or, if he is not, shall deliver them to the public officer to whom he is immediately responsible. A public officer required by Regulation 72 to write a report may require other public officers to provide written material for a report on the officer on whom the report is required and may, subject to these Regulations, prescribe the procedure for the submission to him of such material and of the copies of the report completed as required by Regulation 72, shall be delivered to the Commission not later than the 31st March following the period in respect of which the report is rendered.\n");

          Section section64 = new Section("Special and Supplementary Reports.","cat9","71.\tSpecial Performance Evaluation Reports and Supplementary Performance Evaluation Reports shall be rendered on any  public officer at any time at the request of the Commission or of a Head of Department with the approval of the Commission and shall have such titles and be in such forms as the Commission, may prescribe.");

          Section section65 = new Section("By\twhom reports to commission to be written.","cat9","72.\tPerformance Evaluation Reports rendered to the Commission shall be\twritten by the immediate supervisor of the officer reported upon.");

          Section section66 = new Section("Substantive officers\tto write\treports, and effect of postings.","cat9","73.\t(1) Performance Evaluation Reports shall be written by the substantive holders of the public office which these Regulations, or a Head of Department where these Regulations, permit, charge with responsibility for writing such reports.\n" +
                  "By\twhom reports to commission to be written.\n" +
                  "\n" +
                  "\n" +
                  "Substantive officers\tto write\treports, and effect of postings.\n" +
                  " \n" +
                  "Provided that an officer gazetted as acting for such substantive holder during his absence may write a Performance Evaluation Report, and an officer gazetted as acting as a Head of Division during the absence of the substantive holder of the post may write any Performance Evaluation Report, if the substantive holder has, with the prior approval of the Head of Department, authorised him to write Performance Evaluation Reports generally during the absence of the substantive holder.\n" +
                  "\n" +
                  "(2)\tWhere the substantive holder of a public office charged with responsibility for writing a Performance Evaluation Report knows that he will be temporally absent from such office at the time a report is due to be written he shall, unless the proviso to paragraph (1) of this regulation applies, write the report and submit it as these Regulations may require before he leaves his public office.\n" +
                  "\n" +
                  "(3)\tWhere on posting to a public office the substantive holder of which is charged with responsibility for writing is charged with responsibility for writing a Performance Evaluation Report would result in an officer assuming responsibility within the last one- third of the period to which the report is to relate for writing a report on another officer of whom he has had no official knowledge immediately prior to his own posting, the officer vacating the office shall write the report\n" +
                  " \n" +
                  "before he leaves and shall deliver it to the officer who succeeds him, and the latter officer shall submit the report when it becomes due with such signed alterations, if any, as he shall think fit.\n" +
                  "\n" +
                  "(4)\tWhere the posting of a public officer would result in another public      officer assuming,  after the beginning of the period to which  the  report is to\t\trelate, responsibility for writing a report upon such officer as is first mentioned, and neither paragraph (2) nor paragraph (3) of these Regulations applies, any\tother public officer under who the officer to be reported on served for one- third or more of the period, and who would have been responsible for writing  the report, had the officer to be reported on continued to serve under him, shall at\tthe request of the officer assuming responsibility, provide that officer with written material or a report on the officer to be reported on (in which case the fact that such comments have been taken into account shall be recorded in the report) or shall, if so requested by the Head of Department, write report.\n" +
                  "(5)\tWhere it is impossible to comply with paragraph (1) or (2) of this regulation, and where the Head of Service or a Head of Department considers that compliance with paragraph (3) or (4) of this regulation would be inappropriate, the Head of Service or the Head of Department may be appropriate shall make what appears to him to be the most suitable arrangement possible for the writing of a report and the circumstances shall be explained in the report.\n");


          Section section67 = new Section("Reports on offices on training course","cat9","74.\tWhere a public officer has during a period or part of a period in respect of which a Performance Evaluation Report is to be rendered, been absent from\this Department for the purpose of training, the Head of Department shall obtain such reports from the authorities in charge of such training as will facilitate  the  writing of a Performance Evaluation Report in compliance as nearly as possible with these Regulations.");

          Section section68 = new Section("Reports on seconded officer","cat9","Where a public officer is seconded to another department in the\tcivil service, the Head of the Department to which he is seconded shall render reports on him through the Head of Department from which he is seconded if\the is in category 1 or 2 and if he is in any other category, the Head of Department to which he is seconded shall arrange for such reports to be rendered and shall forward them to the Head of the Department from which the officer is seconded.\n" +
                  "\n" +
                  "(2)\tWhere a public officer is seconded outside the civil service of the organization established, or having effect as if established, by the Legislature of the State, the Head of Department from which he was seconded\n" +
                  "shall obtain reports on him from such organization and take such action on them\n" +
                  "as these Regulations require to be taken on reports on an officer in the category\n" +
                  " \n" +
                  " \n" +
                  "to which the officer belongs.\n" +
                  "\n" +
                  "(3)\tWhere a public officer is seconded to another civil service, the Commission shall obtain reports on him from the appropriate authority in such\n" +
                  "other civil service.\n" +
                  "\n" +
                  "(4)\tWhere a person is seconded to the civil service of the State, the Head\tof Department shall render such reports on him as the Commission may require.\n");

          Section section69 = new Section("Reports to be dated\tand signed.","cat9","Every  Performance  Evaluation  Report  (including  any endorsement of\tor alteration in or addition to a report) shall be dated and shall be signed in full by the reporting officer, who shall append his rank or acting rank below his signature.");


          Section section70 = new Section("Custody and transmission of Reports and\n" +
                  "retention of copies\n","cat9","A public officer who is writing, has written, or has  custody of\t\ta Performance Evaluation Report, or to whom a report is delivered, or into whom a report is delivered, or into whose possession a report comes in any  manner  whatsoever, shall ensure that it is seen or retained only by the authority to which it   is rendered in accordance with these Regulations, or by a public officer authorised by such authority, or by a public officer authorised by a  Head of Department\t\tacting in accordance with paragraph (3) of this regulation,  to see or retain  it as\tthe case may be.\n" +
                  "(2)\tA public officer sending a Performance Evaluation Report to the Commission or to another public officer shall cover, address and transmit it in\tsuch manner as shall ensure that it is not seen by any person who has not\tbeen authorised to see it by the Commission or by the officer to whom it is addressed.\n" +
                  "\n" +
                  "(3)\tNo copy of a Performance Evaluation Report shall be retained by a reporting officer.\n" +
                  "Provided that a Head of Department may retain one copy of any report rendered to the Commission on an officer of his Department on condition that he arranges for the custody under his personal supervision of such reports in such manner as shall ensure compliance with paragraph (1) of this regulation.\n");


          Section section71 = new Section("Communication of\tReports\tto officers.","cat9","78.\tThe Performance Evaluation Report on a public officer’s work or conduct shall be signed by him to indicate that he has seen it.");

          Section section72 = new Section("Official testimonials.\n","cat9","79.\tHeads of Departments may, subject to the Commission’s approval of\tthe terms of any testimonial relating to an officer in categories 1, 2, or 3, issue\tofficial testimonials to prospective employers of public officers or  former  public  officers  at the request of such prospective employers but shall issue to a public officer or a former public officer himself only the Certificate of Service for which Regulation 80 provides");

          Section section73 = new Section("Certificate of Service","cat9","80.\tA contract officer shall, and any other public officer in categories 1, 2,\tor 3 shall if he so requests, and a public officer in category 4 with long and meritorious service may if he so requests and if the Head of Department thinks\tfit, be furnished with a Certificate of Service on the prescribed form on leaving\tthe civil service.");


          Section section74 = new Section("Matters initiated and instructions issued before the commencem ent of these Regulations OD.S.L.N. 4 of\n" +
                  "1976\n","cat10","82.\tWhen, in respect of any matter to which these Regulations relate, action\t\t\twas initiated before the commencement of these Regulations under the provisions\t\t\tof the Civil Service Commission Regulations, 1976, such further  action  as  may  be required under the provisions of these Regulations shall be taken as if the action\ttaken before the commencement of these Regulations had been take under and\t\t\tin accordance with the provisions  of  these Regulations, and  written  instructions issued by the Commission relating to any matter for which provision may be\t\tmade under these Regulations and operative at the date of publication of these\tRegulations shall, in so far as they are not inconsistent with the Constitution or these Regulations, have effect as if issued under these Regulations and may be amended or revoked accordingly.");


         Section section75 = new Section("Revocation of OD. S.L.N. 4 of 1976.\n","cat10","83.\tThe Civil Service Commission Regulations, 1976, is hereby revoked.");

          Section[] sections = new Section[]{
                  section1,section2,section3,section4,section5,section6,section7,section8,section9,section10,
                  section11,section12,section13,section15,section16,section17,section18,section19,section20,
                  section21,section22,section23,section24,section25,section26,section27,section28,section29,section30,
                  section31,section32,section33,section34,section35,section36,section37,section38,section39,section40,
                  section41,section42,section43,section44,section45,section46,section47,section48,section50,
                  section51,section52,section53,section54,section55,section56,section57,section58,section59,section60,
                  section61,section62,section63,section64,section65,section66,section67,section68,section69,section70,
                  section71,section72,section73,section74,section75

          };

        return sections;

    }
}
