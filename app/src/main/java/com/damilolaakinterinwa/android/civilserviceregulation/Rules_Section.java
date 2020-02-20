package com.damilolaakinterinwa.android.civilserviceregulation;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "Rules_Section")
public class Rules_Section implements Parcelable {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "category")
    private String category;

    @ColumnInfo(name = "rules")
    private String rules;

    public Rules_Section(String title,String category,String rules){
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

    protected Rules_Section(Parcel in) {
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

    public static final Creator<Rules_Section> CREATOR = new Creator<Rules_Section>() {
        @Override
        public Rules_Section createFromParcel(Parcel in) {
            return new Rules_Section(in);
        }

        @Override
        public Rules_Section[] newArray(int size) {
            return new Rules_Section[size];
        }
    };

    public static Rules_Section[] populate_rule(){

        Rules_Section section1 = new Rules_Section("Application","cat1","01001 – These Civil Service Rules apply to all staff except where they conflict with specific terms approved by the State Government and written into contract of employment or letters of appointment.  In so far as the holders of the offices of:\n" +
                "-\tThe Governor of Ondo State of Nigeria;\n" +
                "-\tChief Judge and the Judges of Ondo State High Court;\n" +
                "-\tChairman and Members of the State Civil Service Commission;\n" +
                "-\tChairman and Members of the Judicial Service Commission;\n" +
                "-\tSecretary to the State Government;\n" +
                "-\tState Commissioners;\n" +
                "-\tPermanent Secretary;\n" +
                "-\tAccountant-General of the State;\n" +
                "-\tChairman, State Board of Internal Revenue;\n" +
                "-\tThe Auditor-General for the State.\n" +
                "and any other similar organs that derived their appointments from the Constitutions of the Federal Republic of Nigeria are concerned, these rules only apply to theextent that they are not inconsistent with the provision of the Constitution of the Federal Republic of Nigeria in so far as their Conditions of Service and any otherLaws applicable to these officers are concerned.\n");


        Rules_Section section2 = new Rules_Section("Special definition","cat1","01002 – The special meanings with which various words and terms are used for\t the purpose of particular chapters and sections in these Civil Service Rules are quoted at the beginning of such chapters or sections.");

        Rules_Section section3 = new Rules_Section("General definition","cat1","01003 – Except where otherwise indicated by the context or the special definitions for particular chapters the following words and terms are used with the following meanings wherever they occur in these Civil Service Rules.\n" +
                "\tBasic Salary includes any contract addition given to contract officers but excludes, for all staff, other form of allowances.\n" +
                "\tBranch is an arm of a Division\n" +
                "\tCRS means the Civil Service Rules\n" +
                "\tFR means the Financial Regulation\n" +
                "A Child of a Nigerian Officer means a child who being 18 years of age and below:\n" +
                "(i)\tis the officer’s biological offspring or\n" +
                "(ii)\tthe officer’s step child being the biological offspring of a spouse of the \n" +
                "officer or \n" +
                "(iii)\tA child adopted by the officer in accordance with any statutory provision.\n" +
                "\tA child is not normally dependent on a woman officer unless the father of the child is dead or she is divorced from him and has been awarded legal custody of the child without a maintenance order or she is a single parent.\n" +
                "\tClassified document means correspondence which has been graded Restricted, \n" +
                "Confidential, Secret or Top Secret.\n" +
                "\tDepartment means a component of a Ministry/Extra-Ministerial Department.\n" +
                "\tDirectors are staff who have relevant University degrees or professional equivalents, and they have also attended relevant Senior Management training or  have acquired same through considerableexposure togeneral management duties by virtue of their previous appointments.\n" +
                "Division means an arm of a Department\n" +
                "Establish Post means a post provided for under the Personal Emolu-\n" +
                "ments sub-heads of the Estimates.\n" +
                "Family incudes husband, one wife and a maximum of six children.\n" +
                "Gazette means Ondo State of Nigeria Official Gazette\n" +
                "Head of Department means the Permanent Secretary of Ministry/Depart-\n" +
                "ment or Head of Extra-Ministerial Department.\n" +
                "\tJunior Posts are posts graded on salary Grade Level 06 and below in \n" +
                "Ministries/Departments.\n" +
                "Ministry includes Extra-Ministerial Departments. \n" +
                "\tMonthly- rated means employment on monthly rates of pay.\n" +
                "\tPlace of Birth means the place where an officer was born.\n" +
                "\tMarried woman means a woman who is married under either the marriage\n" +
                "Act, Islamic Law, Customary Law, and a woman separated from her husband.\n" +
                "Nigerian Officer means officer who is a Nigerian as defined in section 25-31\n" +
                "of the Constitution of the Federal Republic of Nigeria. 1999.\n" +
                "Officer when used without qualification means staff in an established post,\n" +
                "either on pensionable, non-pensionable or contract terms.\n" +
                "Officer Cadre are staff who have received University degrees or profes-\n" +
                "sionalequivalents,or serving officers who have been so appointed.\n" +
                "Expatriate Officer means an officer who is not of Nigerian origin.\n" +
                "Public Service is service which ranks as such for the purpose of the Pen-\n" +
                "sions Act, 1979.\n" +
                "Section is a Unit of a branch.\n" +
                "Senior Posts are posts grade on Salary GL 07 and above and other posts\n" +
                "attracting fixed salaries of equivalent salary Grade Levels in the Ministry/Depart-\n" +
                "ment.\n" +
                "Temporary Staffmeans an officer employed temporarily in an established\n" +
                "post on non-pensionable terms.\n" +
                "Trainee means a person appointed to a training post in any grade, it includes \n" +
                "a pupil.\n" +
                "Unestablished Post means one provided for in open or one line-vote (e.g.\n" +
                "“Temporary Clerical Assistant” etc).\n" +
                "Wife (of an officer) means a woman married to him under the Marriage Act,\n" +
                "Customary Law or Islamic Law.\n");


        Rules_Section section4 = new Rules_Section("Application of the Civil Service Rule to Woman","cat1","01004 -\tNothing in these Civil Service Rules shall be construed as limiting\n" +
                "\tthe powers of the State Government to amend or revoke any of its \n" +
                "              provisions at any time.\n" +
                "\n" +
                "\t01005 – Notwithstanding that throughout the Civil Service Rules the terms\n" +
                "\t      “officer’, “employee’ and “staff” are referred to in the masculine gender,\n" +
                "\t       the provisions of the Rule apply equally to woman officers and\n" +
                "\temployees.\t\n");

        Rules_Section section5 = new Rules_Section("(General)Authorities for Appointment","cat2","02101 -The State Civil Service Commission shall appoint and recruit staff\n" +
                "into Grade Level 07 and above in strict adherence to the Principle of State\t\n" +
                "Character.\t\t\t\t\t\t\t\t\t\n" +
                "     Ministries/Extra-Ministerial Departments shall make appointments to Grade\t\n" +
                " Level 01-06 under the delegated authority of the Civil Service Commission.  the\n" +
                "Local Junior Staff Committee in each Ministry/Department shall recruit into\n" +
                "GL 01-06 the indigenes of the State who possess the prescribed qualifications.\n" +
                "     Such recruitments shall also reflect the geographical spread within the State.\n");


        Rules_Section section6 = new Rules_Section("(General)Authority for Promotion","cat2","     02102 – There shall exist in each Ministry/Extra-Ministerial Department, a\t      Staff Promotion Committee as follows.\t\t\t\t\t\t\t\n" +
                "(a)\tJunior Staff Committee:\n" +
                "In each Ministry/Extra-Ministerial Department, the Junior Staff \n" +
                "Committee shall consist of not less than 5 senior officers, not below Grade \n" +
                "Level 12 and shall be chaired by the Director of Finance and Administration.\n" +
                "(b)\tSenior Staff Committee:\n" +
                "In each Ministry/Extra-Ministerial Department, the Senior Staff \n" +
                "Committee shall comprise 9 members not below Grade Level 14, and a repre-\n" +
                "sentative of the Civil Service Commission and the Office of Establishments as observers and shall be chaired by the Permanent Secretary.  The Committee shall determine Personnel matters at GL 07 and above.\n" +
                "(c)\tSenior Management Committee:\n" +
                "The Committee shall be made up of:\n" +
                "(i)\tThe Head of Service, as Chairman;\n" +
                "(ii)\tThe Permanent Secretary, Establishments;\n" +
                "(iii)\tThe Permanent Secretary Justice;\n" +
                "(iv)\tThe Permanent Secretary Civil Service Commission; and\n" +
                "(v)\tTwo other Permanent Secretaries including the most Senior\n" +
                "Permanent Secretary.\n" +
                "     The Committee shall make recommendations to the Civil service Commis-\n" +
                "sion on promotion of Staff to Grade Level 13 and above.\n");

          Rules_Section section7 = new Rules_Section("Incremental date(General)","cat2","02103 – Except as otherwise provided, an officer’s incremental date shall be \n" +
                  "the first day of the month in which he takes up the appointment or is promoted\n" +
                  "thereto.\n" +
                  "\n" +
                  "02104 – (a)\tExcept where otherwise provided, seniority shall be determined  \n" +
                  "by thedate of assumption of duty.  Where two or more persons \n" +
                  "\tselected from outside the service in a letter bearing the same date  \n" +
                  "\tassume duty on the same day, seniority inter-se shall be determined\n" +
                  "\t\tby their age.  Where, however, the above conditions are the same,\n" +
                  "\t\tseniority shall be determined by the alphabetical order of their\n" +
                  "                          surnames only.  In the case of contract officers, by the date of the \n" +
                  "                          agreement.  Seniority in any Department shall be determined by the\n" +
                  "                          date of an officer’s appointment to the particular cadre or grade in\n" +
                  "                          which he is serving.\n");
          Rules_Section section8 = new Rules_Section("(General)Inter Cadre Inter Service Transfer: Effect on Seniority","cat2","(b) (i)  If an officer seeks transfer from his cadre to another cadre at\n" +
                  "\t\t   his own request, the seniority of the officer shall be determined\n" +
                  "\t\t   by the effective date of his assumption of duty in the new cadre.\n" +
                  "\t         (ii)   If the transfer is at the request of the government or a particular\n" +
                  "\t\t   agency desiring the officer’s services, the officer’s seniority \n" +
                  "\t                shall be determined by the date the officer attained his \n" +
                  "\t\t   substantive grade before transferring to the new cadre or\n" +
                  "\t                service.\n");

          Rules_Section section9 = new Rules_Section("(General)Seniority on absorption from other Public Service\n","cat2","(c)    If an officer is to be absorbed into the Civil Service from another \n" +
                  "\t\tPublic Service, he should be given the same post with officers of\n" +
                  "cognatequalifications and experience in the Public Civil Service.\n" +
                  " His seniorityshall be determined by the effective date of his\n" +
                  " assumption of duty in the new post.\n");

          Rules_Section section10 = new Rules_Section("(General)Unpaid staff prohibited Personnel Records \n","cat2","02105 – The employment of unpaid staff is prohibited." +
                  "\n" +
                  "     02106 – (a)\tHead of Ministries/Extra-Ministerial Departments will keep\n" +
                  " up-to-date records of each officer under their control. \n" +
                  "      Staff Records Form (Gen.60) shall be used and one copy must be sent to the                  Central Records Unit, Office of Establishments and Training, within one month of the appointment.\n" +
                  "\t      (b) \tAll candidates for employment must support their applications \n" +
                  "\t\twith their birth certificates or if these are unobtainable, submit\n" +
                  "\t\tstatutory declaration of age.\n" +
                  "\t    (c)\tOfficers who can give the year but not the actual date of birth will\t\tbe considered for all purposes to have been born on 31st December\n" +
                  "\t\tof the year of their birth.  Similarly, if the month of birth can be\n" +
                  "\t\tgiven but not the actual date, the last date of the month will be taken\n" +
                  " as the date of birth.\n" +
                  "\t    (d)\tOfficers will be held to be bound by their present recorded age and\n" +
                  "\t\tno application for change can be considered. \n");

          Rules_Section section11 = new Rules_Section("(General)Notification of changeof status","cat2","02107 – Staff who gets married or divorced shall notify his Head of Depart-\n" +
                  "ment immediately so that such change of status is recorded in the officer’s\n" +
                  "records.\n");

          Rules_Section section12 = new Rules_Section("(Recruitment)Meaning","cat2","    02201 – “Recruitment” means the filling of vacancies by the appointment of \t\n" +
                  "persons not already in the Civil Service of the State but it excludes the transfer of\t\n" +
                  "officers from other Public Service in the Federation to the State Civil Service.");

          Rules_Section section13 = new Rules_Section("(Recruitment)Type of appointments","cat2","2202 – Direct appointments to the State Civil Service may be made in any of the following categories:\t\t\t\t\t\t\n" +
                  "(a)    as trainees or pupils;\n" +
                  "(b)\t  on probation in a pensionable post;\n" +
                  "(c)\ton non-pensionable post or against a pensionable post for a specified period;\n" +
                  "(d)\t  on month-to-month terms to a non-pensionable post or against a\n" +
                  "         pensionable post; and\n" +
                  "(e)\ton temporary basis other than (c) and (d).\n");

          Rules_Section section14 = new Rules_Section("(Recruitment)Trainee\tor pupil","cat2","02203 –     (a)\tWhen a candidate for employment requires additional\t\t\t\tprofessional experience before he can be regarded as fully\t\t\tqualified for appointment to a specific post, he may be\n" +
                  "\t\tappointed as a trainee or pupil for normal service of one or\n" +
                  "\t\ttwo years in the post.  This period may, however, be varied in \n" +
                  "special circumstances. On completion of the “trainee period”\n" +
                  "the pupil may be appointed to the full grade on probation and \n" +
                  "will not be eligible for confirmation in the service until he has\n" +
                  "fulfilled the conditions laid down in rule 02302 where applicable.\n");
          Rules_Section section15 = new Rules_Section("(Recruitment)Probation","cat2","(b)\tA confirmed officer who is advanced to the training grade for \t\t\tthe purpose of acquiring the necessary experience to qualify\n" +
                  "\t\thim for substantive promotion to a senior post will be treated\n" +
                  "as if he had been seconded thereto and the period of such\n" +
                  "\t\tsecondment will not normally exceed the period laid down for\n" +
                  "\t\tthe training except with the approval of Office of \n" +
                  "Establishment and Training.\n" +
                  "\n" +
                  "     02204 – Except where the State Civil Service Commission decides otherwise,\n" +
                  "all first appointments to the pensionable establishment in post other than trainee\n" +
                  "posts (see Rule 02203) will be on probation. An officer confirmed in a Lower \n" +
                  "Pensionable post will not however be regarded as on probation in a higher post \n" +
                  "to which he is promoted nor will an officer seconded or transferred as a confirmed \n" +
                  "officer from pensionable service elsewhere.\n");

          Rules_Section section16 = new Rules_Section("(Recruitment)Eligibility for appointment ","cat2","02205 – To be eligible for appointment to the State Civil Service, an applicant must:\t\t\t\t\t\t\t\t\t\t\n" +
                  "(a)\tbe 15 years and above;\n" +
                  "(b)\tpossess such minimum qualification as are specified from time to\n" +
                  "time, for the post desired;\n(c) be certified by a Government Medical Officer as sound in health\n" +
                  "and medically fit for Government service; and\n" +
                  "(d)\tpossess a testimonial of good conduct from his last employer or if \n" +
                  "not previously employed, from the last school or college he\n" +
                  "attended.\n");
          Rules_Section section17 = new Rules_Section("Prior approval in certain employment cases.(Recruitment)","cat2","\n" +
                  "     02206 – (1)  Every applicant for employment by government must state:\n" +
                  "\t\t(a)\twhether he has been convicted of a criminal office;\n" +
                  "\t\t   (b)\tall employment he had been engaged in; and\n" +
                  "\t\t              (i)  if he had left any employment, why he did so; or\n" +
                  "\t\t              (ii) if he is still in any obligation to remain in it; and\n" +
                  "                                       (iii) whether he is free from pecuniary embarrassment.\n" +
                  "\n" +
                  "       (2)\tNo candidate shall be appointed to any post in the Civil Service without the prior approval of the Civil Service Commission if,\n" +
                  "                      (a)   he had been convicted of a criminal offence; or\n" +
                  "                      (b)   he had previously been employed in Government Service and \n" +
                  "                             been dismissed or called upon to resign, retire therefrom, or \n" +
                  "                             terminated on grounds of misconduct.\n" +
                  "\n" +
                  "     02207 – (a)  (i)  Senior Posts – All applicants for senior posts on GL 07 and \n" +
                  "\t\t       above are required by the Civil Service Commission to\n" +
                  "                                 complete a form as a result of which their antecedents are \n" +
                  "                                 carefully scrutinised before any interview for appointment.\n" +
                  "\t\t(ii) All direct appointments to posts on Grade Level 12 and \n" +
                  "above must be by open advertisement or as may be\n" +
                  " directed by theCivil Service Commission.\t\n" +
                  "(b)\tJunior Posts – It is the duty of the Head of Department to\n" +
                  "inquire carefully into the antecedents of all candidates they\n" +
                  "consider for appointment to a junior post and to ensure that\n" +
                  "every candidate they select is eligible under Rule 02205 for\n" +
                  "appointment.  The following procedure shall be followed for\n" +
                  "completing the appointment of a candidate selected, after\n" +
                  "such an enquiry as prima facie eligible and suitable:\n" +
                  "(i)\tA candidate should be required to complete a letter of application.  Any false statement made therein will be \n" +
                  "regarded as sufficient ground for disqualification for \n" +
                  "employment, or if such falsehood is detected after \n" +
                  "engagement for termination of employment.\n" +
                  "\n" +
                  "                                      (ii)   If in the light of the information so supplied the candidate\n" +
                  "is still considered eligible and suitable he should be made\n" +
                  "an offer of an appointment on Form No. Gen. 69 (for\n" +
                  "pensionable appointments) or form No. Gen. 69A for\n" +
                  "non-pensionable and temporary appointments) and\n" +
                  "provided with a blank Form No. Gen. 75 on which to \n" +
                  "signify his acceptance of the offer etc.\n(iii) If the candidate accepts the offer by returning within the\n" +
                  "specified time limit, Form No. Gen. 75 completed in EVERY       PARTICULAR case he should be issued with a letter of\n" +
                  "appointment on Form No.69C, copiesof which shouldbe \n" +
                  "endorsed to the Office of Establishments, the Accountant-\n" +
                  "General, and the Auditor-General of the State.\n" +
                  "             (iv) In the case of appointment to the pensionable establishment,\n" +
                  " Form No. Gen. 60 should accompany thecopy of Form No. 69C\n" +
                  "sent to Office of Establishments.\n");

          Rules_Section section18 = new Rules_Section("Personal Particulars(Recruitment)\n","cat2","     02208 – Immediately he assumed duty, a new Officer or employee shall be required to enter his personal particulars on Form General 60 (Staff Records Form) a copy of which shall be attached to the appropriate documents forwarded to the Officeof Establishments indicated in Rule 02207 (b) (iv).");

          Rules_Section section19 = new Rules_Section("Oath of Secrecy.(Recruitment)\n","cat2","     02209 – It is the duty of every Head of Department to ensure that all officers complete the form (Security Form 1) of the oath of secrecy at the time they accept their offer of appointment, or in the case of senior officers, which one month of their assumption of duty and that the oath so signed is carefully preserved.");

          Rules_Section section20 = new Rules_Section("Recruitment of temporary staff(Recruitment)","cat2","02210 – Heads of Ministries/ Extra-Ministerial Departments are authorised to engage without formality, temporary staff for specific projects.");


          Rules_Section section21 = new Rules_Section("Period of probation(RULES FOR APPOINTMENTS ON PROBATION.)","cat2","     02301 – Officers on probation will be required to serve for two years before being confirmed in the service.  This period may, however, be reduced to not less than six months by deduction of any previous period of Public Service rendered satisfactorily in posts of cognate status involving similar duties.\n" +
                  "     The period of probation shall not exceed two years unless an extension is approved by the Civil Service Commission in the case of Senior Officers and the Head of Department in the case of Junior Staff. Extension of probation may result in the incremental penalty referred to in Rule 05205.\n");
          Rules_Section section22 = new Rules_Section("Compulsory Examinations(RULES FOR APPOINTMENTS ON PROBATION)","cat2","     02302 – Within his probationary period, an officer is required to pass the prescribed examination appropriate to his appointment:\n" +
                  "\n" +
                  "(a)\tFor officers holding senior posts, the prescribed examinations are those described in Chapter 7 of these rules and such other examinations as may be specified in individual offer of appointment.\n" +
                  "(b)\tFor the Clerical Grade Officers, the prescribedexamination is the promotion/confirmation examination held twice a year.\n" +
                  "(c)\tThe examination for Technical Grades are those prescribed in the scheme of service applicable to the particular post.\n");

          Rules_Section section23 = new Rules_Section("Confirmation or termination at the end of  probationary period(RULES FOR APPOINTMENTS ON PROBATION.)","cat2","     02303 – To be eligible for confirmation in the permanent establishment, an officer appointed on probation is required to pass the prescribed examination, if any, during his probationary period to the satisfaction of the authority empowered to appoint him. The officer will, unless his probationary appointment is terminated or extended, be confirmed in his appointment. The names of the officers so confirmed shall be submitted on a monthly basis to the Civil Service Commission for Gazette\n" +
                  "Publication.\n");

          Rules_Section section24 = new Rules_Section("(RULES FOR APPOINTMENT ON CONTRACT)Definition","cat2","     02401 – A contract appointment is a temporary   appointment (which does \n" +
                  "not provide for the payment of a pension) made by the Civil Service Commission and Ministry/Extra-MinisterialDepartments for a specific period as opposed to appointment on pensionable terms, month-to-month appointment and temporary employment.  The appointment must be recorded in a formal document of agreement.\n");

          Rules_Section section25 = new Rules_Section("Condition of service(RULES FOR APPOINTMENT ON CONTRACT)","cat2","     02402 – (a) The conditions of service of a contract officer are those provided for in his contract and the privileges, emoluments or allowances described in these Rules do not apply to him unless it is specifically so stated in the contract itself.  Any question of the interpretation of a contract affecting his conditions of service should be referred to Office of Establishments.");

          Rules_Section section26 = new Rules_Section("Appointment","cat2","               (b) Non-Nigerians married to Nigerians who are professionally, academically or technically qualified are eligible for contract terms of employment in respect of posts graded on salary GL 08 and above.  In respect of other posts graded on GL 07 and below they are eligible for appointment on month-to-month terms only.  Where they are not eligible for Nigerian Citizenship, their contract shall be reviewed every two years and they shall be considered for promotion along with their colleagues as appropriate as long as they stay married to Nigerians.\n" +
                  "\n" +
                  "             (c) A Nigerian who is aged 45 and above and a re-engaged pensioner shall be appointed on contract.\n");

          Rules_Section section27 = new Rules_Section("Duration of Appointment(RULES FOR APPOINTMENT ON CONTRACT)","cat2","02403 – The duration of a contract appointment is limited to the period specified in the contract itself and any further employment of the officer concerned must be made subject of a new contract.");


          Rules_Section section28 = new Rules_Section("Termination during currency of contract.(RULES FOR APPOINTMENT ON CONTRACT)","cat2","     02404 – (a) By the Government – An appointment on contract may be terminated by the Government at any time in accordance with the terms specified in the contract itself.  A recommendation to the Civil Service Commission for the termination of the appointment of a contract officer shall be accompanied by a full statement of the consideration which has prompted it. On the receipt of the recommendation, the Civil Service Commission in all circumstances, shall decide whether the appointment of a contract officer shall be terminated or renewed.\n" +
                  "                 (b)  By the Officer – The termination of the contract by the officer himself is subject to the terms of his contract and any question concerning the waiving of any of the penalties under a contract or agreement shall be referred to the Office of Establishments.\n");


          Rules_Section section29 = new Rules_Section("Re-engagement (responsibility of the contract  officer)(RULES FOR APPOINTMENT ON CONTRACT)","cat2","     02405 – An officer serving on contract, who desires re-engagement, shall so inform the Government in writing through his Head of Department not less than four months before his leave is due.  In the absence of such notification, it may be assumed that an officer serving on contract does not desire re-engagement.");

          Rules_Section section30 = new Rules_Section("Re-engagement (responsibility of the \n" +
                  "Head of Department)(RULES FOR APPOINTMENT ON CONTRACT)\n","cat2","    02406 – On receipt of such notification expressing an officer’s wish to be \n" +
                  "re-engaged, the Head of Department shall act as follows:\n" +
                  "\n" +
                  "(a)\tInform the officer that arrangements will be made to ofRfer him re-engagement during the course of his leave, and the details of the terms proposed.  The Head of Department shall ensure that his request for the preparation of the officer’s Leave Certificate (see Rule 15313) includes a statement that re-engagement is required on agreed terms;\n" +
                  "(b)\tEnsure that the original and counterpart of the re-engagement contract are duly signed on behalf of the Government.  In this case, the Head of Department shall obtain the officer’s witnessed signature to both copies, deliver the counterpart to the officer, and send the copy to the Civil Service Commission;\n" +
                  "(c)\tInform the officer that he will not be re-engaged.  The Head of Department must so inform him without delay.\n");

          Rules_Section section31 = new Rules_Section("Earlier notification of non-re-engagement.(RULES FOR APPOINTMENT ON CONTRACT)","cat2","02407 – As soon as it is clear to the Head of Department that he will be unable, for whatever reasons, to consider the re-engagement of an officer serving on contract, he will inform the officer that he will not be re-engaged.");

          Rules_Section section32 = new Rules_Section("Continuity of Service (RULES FOR APPOINTMENT ON CONTRACT) ","cat2","     020408 – Provided that re-engagement is completed by the signature of a new contract before the end of vacation leave granted under an expiring contract, service under the new contract will be treated as continuous with service under the former contract.");

          Rules_Section section33 = new Rules_Section("Deferred leave (RULES FOR APPOINTMENT ON CONTRACT) ","cat2","02409 – If a re-engaged contract officer is required to return to duty under his new contract before the expiration of his leave due under his former contract the leave foregone will be treated as deferred leave to be enjoyed under the conditions of the new contract.");

          Rules_Section section34 = new Rules_Section("Period awaiting return passage.(RULES FOR APPOINTMENT ON CONTRACT)","cat2","02410 – where service under the new contract is continuous with service under a former contract, leave in accordance with Rule 15308 during the period which an expatriate contract officer is awaiting the first available passage back to Nigeria will be treated as leave granted under a former contract.");

          Rules_Section section35 = new Rules_Section("Incremental date (RULES FOR APPOINTMENT ON CONTRACT)","cat2","02411 – When an officer on contract is re-engaged in his former office without a break in service and on the same scale of salary, he will retain the incremental date enjoyed under his former contract.  In other cases of re-engagement without break of service, the incremental date of a re-engaged contract officer will be fixed in accordance with such rules as may be applicable in the circumstance, on the basis that the commencing date of the new contract is, for a Nigerian officer, the date on which he resumes duty thereunder, or for expatriate officer, the date he embarks on returning to Nigeria to resume duty thereunder.");

          Rules_Section section36 = new Rules_Section("Promotion","cat2","024012 – Reference should be made to Rule 02707");

          Rules_Section section37 = new Rules_Section("Short-term appointments(RULES FOR SHORT-TERM APPOINTMENT)","cat2","02501 – Appointment of officers on month-to-month and other short-term appointment in the service are governed by the conditions set out in the letters offering the appointments as well as such Rules as may apply to each staff.  Heads of Departments are authorised to terminate these appointments in accordance with such terms.");

          Rules_Section section38 = new Rules_Section("Vacation part-time, or\n" +
                  "Temporary appointments. (RULES FOR SHORT-TERM APPOINTMENT)\n","cat2","      02501 – Recruitment into vacation, part-time or temporary position not exceeding 3 months shall be decentralized.  Returns of all vacation, part-time and temporary appointments made shall be sent to the Civil Service Commission monthly.  Such returns, shall show the name, date of birth, date of appointment, grade, qualification, State of origin of employee and up-to-date intra State distribution of existing staff in that grade in the Ministry/Extra-Ministerial Department.");
          Rules_Section section39 = new Rules_Section("Definition and procedure(TRANSFERS AND SECONDMENTS)","cat2","\n" +
                  "Vacation part-time, or\n" +
                  "Temporary appointments.\n" +
                  "Definition and procedure.\toffering the appointments as well as such Rules as may apply to each staff.  Heads of Departments are authorised to terminate these appointments in accordance with such terms.\n" +
                  "\n" +
                  "      02501 – Recruitment into vacation, part-time or temporary position not exceeding 3 months shall be decentralized.  Returns of all vacation, part-time and temporary appointments made shall be sent to the Civil Service Commission monthly.  Such returns, shall show the name, date of birth, date of appointment, grade, qualification, State of origin of employee and up-to-date intra State distribution of existing staff in that grade in the Ministry/Extra-Ministerial Department.\n" +
                  "\n" +
                  "SECTION 6 – TRANSFERS AND SECONDMENTS\n" +
                  "\n" +
                  "     02601 – Transfer is the permanent release of an officer from one service to another service or from one cadre to another within the same service.\n" +
                  "-\t SECONDMENT means the temporary release of an officer to the service of another Government or body for a specified period.\n" +
                  "(a)\tApplication forms from outside a Ministry for transfer to posts in any Department of the Ministry shall be routed through the recognized official channel to the Civil Service Commission.  No officer may be considered for transfer-on-promotion or otherwise to any Ministry/Extra-Ministerial department except to an advertised post.\n" +
                  "(b)\tApplications for transfer of service must be made to the Commission in accordance with the advertised posts, supported by the following documents:\n" +
                  "(i)\tEvidence of qualifications \n" +
                  "(ii)\tSatisfactory APER for 2 years immediately preceding the date of the application.\n" +
                  "(iii)\tOfficer’s Record of Service showing clearly, the career progression of the applicant.\n" +
                  "(iv)\tRecommendation from the applicant’s employer, including a statement that the officer will be released if the application is successful.\n" +
                  "(c)\tAn officer may only be considered for transfer if he has been confirmed and his qualification, experience and career progression are:\n" +
                  "(i)\tcomparable to those of officers already in the grade to which he seeks transfer;\n" +
                  "(ii)\tsuperior to those of officers in the grade just below that to which he seeks to be transferred.\n" +
                  "(d)\tWhere the number of vacancies is limited, extra care must be taken to ensure that the contemplated transfer would in no way jeopardise the prospects of officers already in the service.\n" +
                  "(e)\tIn considering inter-service transfer, the Ministry must be satisfied that there are vacancies not only in the relevant grade, but also in the applicant’s discipline/sociality.\n" +
                  "\n (f)\tOnce an officer on transfer-appointment has agreed to accept an offer of a position, and the position is lower than that for which he initially applied, he should not, after assumption of duty, petition for upgrading or review on account of comparison with his erstwhile colleagues.\n" +
                  "(g)\tSecondment:\n" +
                  "(i) Secondment of officers to the service of other bodies such as \n" +
                  "     Statutory Corporations shall be as determined by the Civil\n" +
                  "Service Commission.\n" +
                  "(ii) Secondment of an officer to the service of another Government\n" +
                  " or Approved Body:\n" +
                  "(a)\tAt his own requests shall be for a maximum period of three years;\n" +
                  "(b)\tIn the Public interest, shall be for a maximum period of five years.\n" +
                  "                   (iii) During the period of secondment, the officer will be required to elect to be permanently released to the service to which he has been seconded or revert to his former post.  He will be entitled to notional increment during the period of his secondment and may be granted notional promotion in order to preserve his seniority.\n");

          Rules_Section section40 = new Rules_Section("Inter-departmental transfers (TRANSFERS AND SECONDMENTS)","cat2","02602 – (a) Senior posts-Transfer from one post to another or from one\n" +
                  "cadre to another within the Civil Service shall be as laid down in the Civil Service Regulations.  An officer must have served for at least 6 months in his original Department/Extra-Ministerial Department before seeking transfer to another Ministry/Extra-Ministerial Department.Applications for transfer shall be processed as in Rule 02601.\n" +
                  "            (b) Junior post – Transfer from one junior post to another within the Civil Service may be arranged, with the consent of the officers being considered for transfer, at the mutual discretion of their Heads of Departments.\n" +
                  "\n");

          Rules_Section section41 = new Rules_Section("From non-pensionable to pensionable posts(TRANSFERS AND SECONDMENTS)","cat2","02603 – (a) Transfer from non-pensionable to pensionable appointments require the approval of the authority empowered to appoint at the level con-cerned.\n" +
                  "                    (b) An officer who is permitted to transfer from non-pensionable to a pensionable appointment must clearly understand that his appointment after such transfer, may be subject to a period of probation and that in such circumstances, should he fail to secure confirmation in the pensionable establishment, he will have no claim to revert to his former non-pensionable appointment.\n" +
                  "\n" +
                  "(c)  In case of a transfer from an unestablished post to an established post, the salary of the transferee shall not be lower than what he was receiving as a non-pensionable employee, provided that his salary had been correctly determined.\n" +
                  "\n" +
                  "                (d)    An application for transfer to pensionable appointment from an officer who was aged 45 and above at the time he obtained his non-pensionable appointment will not normally be entertained.\n");

          Rules_Section section42 = new Rules_Section("Medical Examination(TRANSFERS AND SECONDMENTS)","cat2","02604 – At all levels, serving non-pensionable candidates for pensionable appointment must under-go a medical examination to be conducted by a Government Medical Officer, if their non-pensionable appointment was not preceded by such an examination.  If the Government Medical Officer does not certify them to be in sound health and medically fit for employment in the pensionable establishment, their transfer will not be effected.");

          Rules_Section section43 = new Rules_Section("Promotion to the Standard Clerical Grade(TRANSFERS AND SECONDMENTS)","cat2","02605 – To be eligible for promotion to the Standard Clerical Grade, an officer must have:\n" +
                  "(a)\tobtained the minimum educational qualification for direct appointment to the Standard Clerical Grade, or\n" +
                  "(b)\tpassed the combined Confirmation/Promotion Test at Promotion Level.\n");
          Rules_Section section44 = new Rules_Section("Salary to Transfer(TRANSFERS AND SECONDMENTS)","cat2","02606 – The salary and incremental date at which a Clerical Assistant enters the salary grade level of posts graded in the Standard Clerical Grade on transfer shall not be less than the incremental step on his old grade.");

          Rules_Section section45 = new Rules_Section("Medical Examination(PROMOTIONS)","cat2","02701 – Before an officer holding a non-pensionable post, or in receipt of monthly rates of pay, may be promoted to a pensionable office, he must be examined by a Government Medical Officer and certified by him to be in sound health and fit for employment in the pensionable establishment, if his non-pensionable appointment was not preceded by such an examination.");

          Rules_Section section46 = new Rules_Section("Eligibility(PROMOTIONS)","cat2","02702 – (a) Ministries/Extra-Ministerial Departments shall have power to promote and approve advancements for all staff on GL 01-06.\n" +
                  "                     (b)  In making recommendation to the Commission in the case of officers on GL 07 and above, each Ministry/Extra-Ministerial Department shall prepare at the end of every year a comprehensive staff list showing the order of seniority of all the staff in each grade in each cadre.  Seniority shall be based on the provisions of the existing rules.\n" +
                  "                       (c) All officers who fall within the field of selection for any promotion exercise shall be considered except those who are under disciplinary action.  The minimum number of years that an officer must spend ina post before being considered eligible to come within the field of selection for promotion shall be as follows:\n" +
                  "\n" +
                  " GL of Staff                         Number of Years in Post\n" +
                  "                     01-06                                 Minimum of two (2) years\n" +
                  "                     07-14                                 Minimum of three (3) years\n" +
                  "                     15-17                                 Minimum of four (4) years.\n");



          Rules_Section section47 = new Rules_Section("Procedure(PROMOTIONS)","cat2","02703 – (a) All Staff Promotion Committees shall take into account the Annual Performance Evaluation Report (APER) of each officer for the last 3 years.  Each APER shall be summarized and the equivalent marks shall be confirmed or vetted by the moderating officers and shall be shown on the APER form.           (b)  Staff on GL 07 and above who are being considered for promotion must appear before the appropriate Senior Staff Committee for promotion interview.In the case of officers entering into the Senior Management Grade at GL 13, Government should provide training facilities. There shall also be interview for promotion from GL 06 to 07.  However, where the GL 06 post is a training post, then advancement from GL 06 to 07 shall be based on APER score only.\n" +
                  "        (c)  The criteria for promotion shall be:\n" +
                  "                        (i)          Performance (as assessed under APER);\n" +
                  "                         (ii)        Interview Result;\n" +
                  "(iii)\tAdditional Qualification/Examinationarising from further training; and\n" +
                  "(iv)\tSeniority\n" +
                  "(v)\tWhere additional qualification/examination is not an applicable criterion, then the weight assigned to performance shall be increased by 15, similarly, in cases where interview is not applicable the weight for performance shall be increased by 30.\n");

          Rules_Section section48 = new Rules_Section("Notional Promotion(PROMOTIONS)","cat2","     02704 – (a) Officers on leave of absence, secondment, approved study leave, or special assignment, who fall within the promotion field of selection shall be granted notional promotion if they are considered to be worthy of promotion.\n" +
                  "\n" +
                  "     (b) When an officer is granted notional promotion, he will not be entitled to the salary of the higher post until he actually assumes duty in the post but the effective date of notional promotion shall be used in determining the point at which the officer enters the new salary grade level, his future incremental date and seniority in the grade.\n");

          Rules_Section section49 = new Rules_Section("Effective Date of promotion(PROMOTIONS)","cat2","02705 –  (a) The effective date of promotion shall be as determined by the Civil Service Commission.  Every Ministry/Extra-Ministerial Department shall conduct promotion exercise at least once in a year.  The exercise shall be completed before the 31st of December of each year.\n" +
                  "                      (b) In recommending officers for promotion to the Civil Service Commission, each Ministry/Extra Ministerial Department shall forward all briefs used at such meetings and the minutes thereof in respect of posts graded GL 07 and above.\n");

          Rules_Section section50 = new Rules_Section("Promotion during probationary period(PROMOTIONS)","cat2","     02706 – (a) An officer who passed the compulsory examination for confirmation in the service shall be eligible for promotion, notwithstanding the fact that he has not completed the probationary period specified in the Rule 02301.\n" +
                  "\n" +
                  "                (b)  An officer who is promoted before passing the compulsory examination is however, still required to satisfy the conditions for confirmation (see rules 02302 and 02303).\n");

          Rules_Section section51 = new Rules_Section("Promotion of Contract officer","cat2","02707 – A contract officer will only be considered for promotion when there is no suitable pensionable officer available or where he possesses an exceptional qualification and suitable experience. The promotion of a contract officer to a higher post during the currency of his contract shall be embodied in a supplementary agreement.");

          Rules_Section section52 = new Rules_Section("Termination of appointment during probationary(LEAVING THE SERVICE)","cat2","     02801 – If within his probationary period, it is established to the satisfaction of the appointing authority that an officer is not qualified for efficient service, his appointment may be terminated without any further compensation other than free transport to the place from where he was engaged.  However, such free transport will be granted only if his conduct has been satisfactory.  Provided that the termination is not due to misconduct on the officer’s part, it will be effected by means of a month’ notice.  Where the officer is eligible for vacation leave in respect of his service date, such leave may be granted together with his normal vacation leave transport grant in lieu of the free transport mentioned above.  Suchleave, in fact, shall be so arranged as to take place within the period of notice and, if possible, to expire on the same day as the notice.  The position   regarding the refund of the cost of any training given the officer is governed by the bond relating to such training.");


          Rules_Section section53 = new Rules_Section("Relinquishment of appointment by officer during probationary period(LEAVING THE SERVICE)","cat2","     02802 – If an officer relinquishes his appointment within the period of his probationary service, he may be required to refund any expenditure by Government in transporting him, his family, domestic servants and baggage to or from the place or places at which he has been employed and he will not be eligible for any facilities from Government towards transport from the station at which he is then serving.  The position regarding the refund of the cost of any training given the officer is governed by the bond relating to such training.");

          Rules_Section section54 = new Rules_Section("Termination during probation.(LEAVING THE SERVICE)","cat2","     02803 – The appointment of an officer on probation who fails to secure confirmation in the pensionable establishment at the expiration of his probationary period, including such extension thereof as prescribed under Rule 02301, may be terminated in the manner specified in Rule 02801.");

          Rules_Section section55 = new Rules_Section("Resignation during probation(LEAVING THE SERVICE) ","cat2","     02804 (a) An officer who resigns during probation will be liable to:\n" +
                  "(i) forfeit all claims to vacation leave; any vacation leave or passage\n" +
                  "privileges granted will be ex-gratia;\n" +
                  "(ii)  refund to the Government in full, any sum of money which he may\n" +
                  " be owing to Government or which, under the provisionsof other\n" +
                  "                 Rules or Agreements entered into with Government, is refundable\n" +
                  "                 to Government, for his not discharging the obligations set out in\n" +
                  "                such Agreements, provided that any of such refunds may be waived\n" +
                  "                at the discretion of the government.\n" +
                  "    (b) By virtue of the provisions of section 14 of the Pensions Act, Cap. 346, all previous pensionable service is forfeited on resignation and cannot be taken into account for pension purposes if the officer is subsequently re-employed except where, under certain circumstances, such a break in service has been condoned by office of Establishments.\n");

          Rules_Section section56 = new Rules_Section("Leaving the Service during a leave year(LEAVING THE SERVICE)","cat2","     02805 – An officer who leaves the service other than by dismissal will be eligible for proportionate leave.  If he has enjoyed more days during the leave year than he is entitled to, he will be required to refund salary at the rate at which it was paid for the number of working days leave enjoyed in excess.  The days in respect of which salary is refunded shall be treated as leave without pay for pension purposes.  This provision will be waived in the case of an officer who died in the Service.");

          Rules_Section section57 = new Rules_Section("Grant of Ex-gratia(LEAVING THE SERVICE)","cat2","     02806 – Ex-gratia leave under Rule 02804 may be granted to an officer who resigns his appointment only if he has served a minimum period of six months during the leave year.  Any debts due to Government from an officer who resigned his appointment after having enjoyed his leave before completing the minimum period specified under this Rule will be treated in accordance with Rule 15205 (b).");

          Rules_Section section58 = new Rules_Section("Pensions and Gratuity authority.(LEAVING THE SERVICE)","cat2","     02807 – (a) The grant of pensions and gratuities to holders of pensionable posts in the State Civil Service is governed by the Pensions Act, Cap. 346");

          Rules_Section section59 = new Rules_Section("Compulsory Retirement age(LEAVING THE SERVICE)","cat2","         (b) The compulsory retirement age for all grades in the Civil Service shall be 60 years.  Three months before attaining age of 60, an officer shall give notice of retirement from the service.  At all events, an officer, in whatever grad, shall be deemed to have retired from the service with effect from the date he attained the age of 60 years.");

          Rules_Section section60 = new Rules_Section("Functions of the Civil Service Commission","cat2","      02901 – The functions of the Civil Service Commission shall be as provided for in the Constitution of the Federal Republic of Nigeria, 1979 and contained in the Ondo State Civil Service Commission Regulation, 1999.");

          Rules_Section section61 = new Rules_Section("Commission.(General)","cat3","     03101 - Married woman means a woman who is married either under the Marriage Act, Islamic Law or Customary Law, and also a woman separated from her husband.\n" +
                  "\n" +
                  "     03102 – Nigerian woman, includes an expatriate woman who has formally acquired Nigerian citizenship.\n");

          Rules_Section section62 = new Rules_Section("EMPLOYMENT OF WOMEN","cat3","      03201 – (a) Nigerian women, married or not, shall be admitted to the Permanent Establishment in those grades of the State Civil Service which they are qualifiedon equal terms with men.\n" +
                  "(b) Non-Nigerian women whether married to Nigerian, or not who are professionally, academically, or technically qualified are eligible for contract terms of appointment in post graded in salary grade levels 08 and above.  The expression “contract terms” is deemed to include payment of contract addition and terminal gratuity.\n" +
                  "(c)  Non-Nigeria women who are neither professionally, academically nor technically qualified shall be eligible for appointment into posts graded below salary grade level 08 on month-to-month basis only.\n" +
                  "\n" +
                  "(d) Non-Nigerian women married to Nigerians who are eligible for appointment under CSR. 03201 (b) and \n" +
                  "\n" +
                  "(e) above shall be eligible for vacation leave as Nigerian women, without passage privileges.\n" +
                  "\n");
          Rules_Section section63 = new Rules_Section("Interpretation Maternity(RULES RELATING TO PREGNANCY )","cat3","     03301 – (a) A woman officer who became pregnant shall proceed on 12 weeks maternity leave with full pay to be taken at a stretch, counting from the date of the officer commences the maternity leave.  A medical certificate showing the prospective date of confinement must be presented not less than three months before that day.  No woman shall be permitted to resume duty until she has exhausted her twelve weeks maternity leave.\n" +
                  "\n" +
                  "           (b) Annual leave for that year shall be regarded as part of the maternity leave. Where the annual leave has already been enjoyed before the grant of maternity leave, that part of maternity leave equivalent to annual leave already taken shall be without pay.\n");


          Rules_Section section64 = new Rules_Section("Postponement of disciplinary proceeding.(RULES RELATING TO PREGNANCY )","cat3","     03302 – Any disciplinary proceedings against a woman officer which might otherwise have been taken during the period of maternity leave shall be postponed until her maternity leave has expired.  Such postponement, however shall not in any way prejudice the proceedings against her");

          Rules_Section section65 = new Rules_Section("Performance of duties.(RULES RELATING TO PREGNANCY )","cat3","03303 – No woman officer shall be required to resign her appointment or retire by reason of pregnancy alone, but if her condition interferes with the efficient performance of her current duties, she may be assigned to more congenial duties.");

          Rules_Section section66 = new Rules_Section("Time off for nursing(RULES RELATING TO PREGNANCY )","cat3","     03304 – Any woman officer who is nursing a child shall be granted an hour of duty every day.  This facility shall be granted up to a maximum period of six months from the date of confinement.");

          Rules_Section section67 = new Rules_Section("Basis for disciplinary procedure.(DISCIPLINARY PROCEDURE)","cat4","     04101 – (a) General disciplinary procedure is laid down in the Civil Service Commission Regulations, the relevant part of which should be read with this Chapter.\n" +
                  "(c)\tDisciplinary proceedings in accordance with the Civil Service Commission Regulations are initiated because of an officer’s misconduct or general inefficiency.\n");

          Rules_Section section68 = new Rules_Section("Misconduct (DISCIPLINARY PROCEDURE)","cat4","      04102 – Misconduct consists of a willful act or omission which prejudices the proper administration of the department of Government in which an officer is employed, or prejudices the order and discipline of the Civil Service or which brings the service into disrepute, including the following among others:\n" +
                  "(i)\tConviction on a criminal offence (other than minor traffic or sanitary offence or the like; cases of doubt should be referred to the Civil Service Commission for guidance).\n" +
                  "(ii)\tDebtthrough imprudenceor other reprehensiblecause(Rule 04201)(b).\n" +
                  "(iii)\tAbsence without leave (Rule 04201).\n" +
                  "(iv)\tEngaging in political activities contrary to Rule 04211.\n" +
                  "(v)\tEngaging in business contrary to Rule 04212.\n" +
                  "(vi)\tDisobedience of a lawful order (such as refusal to proceed on transfer or accept posting).\n" +
                  "(vii)\tDisclosure of official information, Rule 04205.\n");
          Rules_Section section69 = new Rules_Section("Effect of disciplinary action on conditions of service(DISCIPLINARY PROCEDURE)","cat4","     04104 – An officer who is dismissed will not be granted leaveand is not entitled to transport facilities.  For the purpose of earning gratuity and pension, termination of appointment for misconduct, shall be treated as retirement.");

          Rules_Section section70 = new Rules_Section("Effective date of dismissal.(DISCIPLINARY PROCEDURE)","cat4","04105 – No notice or salary in lieu is given and dismissal takes effect from the date on which the officer concerned is officially notified that he has been dismissed.  Where he seeks to evade this official notification, the effective date may be either:\n" +
                  "\n" +
                  "\t(i) the date upon which he is served with the notification, even though he may refuse to acknowledge receipt, or  (iv)\tthe date upon which notification is delivered by messenger to this recorded address, even though the officer concerned does not himself acknowledge receipt of such delivery, or \n" +
                  "(v)\tIf the notification is posted to his last known or normal address, it may be considered as having been received according to the definition of “service by post” as provided in the Interpretation Law of the Laws of Ondo State, 1978.\n\n");

          Rules_Section section71 = new Rules_Section("Date  of termination for inefficiency (DISCIPLINARY PROCEDURE)","cat4","     04106 – Notice or salary in lieu should be given in all cases of termination for general inefficiency.  The period of notice should be one calendar month, unless any other period is appropriate in the light of a particular officer’s terms of service; it should include any leave to which the officer may be entitledor be included in it if his due leave is longer than the period of notice.");

          Rules_Section section72 = new Rules_Section("Conduct prejudicial to State Security(DISCIPLINARY PROCEDURE)","cat4","04107 – Where it is considered that the conduction of an officer is prejudicial to the security of the State and where a committee comprising of members from the Cabinet Office, the Ministry of Justice and Office of the Establishments are satisfied that the officer has committed a misconduct involving the security of the State, disciplinary action as may be deemed fit shall be taken against the officer by the Civil Service Commission.");

          Rules_Section section73 = new Rules_Section("Adequate opportunity for defence.(DISCIPLINARY PROCEDURE)","cat4","04108 – The officer shall be entitled to know the whole case made against him and shall be afforded an adequate opportunity of making his defence.  In exceptional cases, the officer, at the discretion of the committee may be permitted to be represented by a Solicitor or Counsel, provided that where the officer is permitted to be represented by counsel, the government shall similarly be represented by a counsel. ");

          Rules_Section section74 = new Rules_Section("Cross examination of witnesses and access to documentary evidence.(DISCIPLINARY PROCEDURE)","cat4","     04109 – If witness(es) is/are called to give evidence, the officer shall be entitled to be present and to put questions to the witness(es) and not documentary evidence shall be used against him unless he has previously been supplied with a copy thereof or given access thereto.");

          Rules_Section section75 = new Rules_Section("Drawing attention to short comings.(DISCIPLINARY PROCEDURE)","cat4","04110 – It is the duty of every superior officer, as soon as he observes any fault or shortcoming in an officer or employee subordinate to him, which may adversely affect his prospects of promotion or of passing a salary bar or of obtaining an increment, whether or not it is considered to be within his power to correct it, to bring it to the officer’s or employer’s notice and to record that this had been done.  It may, in certain cases, be suitable to bring the matter to his notice orally and to follow it up with a written confirmation, in which case the written communication should be couched in sympathetic language and with the objective of enabling and encouraging the recipient to overcome his shortcomings.");

          Rules_Section section76 = new Rules_Section("Formal warnings.(DISCIPLINARY PROCEDURE)","cat4","04111 – As soon as a superior officer becomes dissatisfied with the work or behaviour of any officer or employee subordinate to him, it is his duty, so to inform the officer or employee, in writing, giving details of the unsatisfactory work or behaviour, and to call upon him to submit within a specified time such written representations as he may wish to make to exculpate himself from disciplinary action.  After considering such written representations as the officer or employee may make within the specified time, the superior officer will decide whether: (a)\tthe officer or employee has exculpated himself, in which case he will be so informed, and no further action is necessary, or\n" +
                  "(b)\tthe officer or employee has not exculpated himself, but no immediate punishment is warranted, in which case the superior officer will issue a suitable formal written warning and require the officer or employee acknowledge its receipt in writing, or\n" +
                  "(c)\tthe officer or employee has not exculpated himself and deserves one punishment, in which case the superior office will report the matter to the appropriateto report to the appropriate Head of Department that a Government Servant has become a judgement debtor or had acknowledged any debt in writing, as the case may be, wherever it shall come to the knowledge of any of them.\n" +
                  "(d)\tWhen the fact that a Government Servant has become a judgement \n" +
                  "debtor, or a party to accommodation bills or promissory notes, if brought to the notice of his Head of Department, the latter should call upon him to submit a statutory declaration in the prescribed form disclosing all his liabilities.\n" +
                  "(f)  Otherwise, a Head of Department should take such action as may appear to him to be necessary when a Government Servant becomes financially embarrassed, and if he considers it undesirable that the Government Servant should be retained in the Public Service, should initiate the appropriate disciplinary proceedings.\n officer, if he is not himself the appropriate officer, with a view to taking disciplinary action in accordance with the Civil Service Commission Regulations.  if he is himself the appropriate officer, he will consider suitable action accordingly.  In large headquarters offices, it may be appropriate for many superior officers not to take the above action personally, but to request an officer in charge of personnel matters in the department to act for them, assisting him, of course in the consideration aspects within their own knowledge or field or activity.\n");
          Rules_Section section77 = new Rules_Section("Reporting misconduct (DISCIPLINARY PROCEDURE)","cat4","04112 – It is the duty of a superior officer to whose notice the misconduct (see Rule 04102) of an officer or employee subordinate to him is brought, to report it to the appropriate officer together, if necessary, with his recommendation as to interdiction.  The appropriate officer’s action on receiving the report is governed by the Civil Service Commission Regulations.");

          Rules_Section section78 = new Rules_Section("Absence without leave (MISCELLANEOUS DISCIPLINARY RULES)","cat4","     04201– (a) Any Government Servant who absents himself from duty with-out leave renders himself liable to be dismissed from the service and the onus will rest on him to show that the circumstances do not justify the imposition of the full penalty.\n" +
                  "      (b) An officer will not receive salary in respect of any period during which he is absent from duty without leave.\n");
          Rules_Section section79 = new Rules_Section("Financial embarrassment (MISCELLANEOUS DISCIPLINARY RULES)","cat4","     04202 – (a) The efficiency of a Government Servant must be regarded as gravely impaired and the value of his service seriously diminished if, from any cause whatever he becomes financially embarrassed.\n" +
                  "       (b) If such embarrassment is caused by imprudence or other reprehensiblecause, the Government Servant concerned will be liable to immediate dismissal and the onus will rest on him to show that the circumstances do not justify the imposition of the full penalty.\n" +
                  "     (c)  Except in such cases as the Treasury with the concurrence of the Civil Service Commission, may from time to time prescribe, a Government Servant will be liable to similar consequences if he becomes a party to accommodation bills or promissory notes whether for his own purposes or for another person, and whether resulting in pecuniary embarrassment or not.\n" +
                  "     (d)  It shall be the duty of the Registrars of the High Courts, as well as of Magistrates, Commissioners of Stamp Duties and the Registrar of Bills of Sale, to report to the appropriate Head of Department that a Government Servant has become a judgement debtor or had acknowledged any debt in writing, as the case may be, wherever it shall come to the knowledge of any of them.\n" +
                  "(d)\tWhen the fact that a Government Servant has become a judgement \n" +
                  "debtor, or a party to accommodation bills or promissory notes, if brought to the notice of his Head of Department, the latter should call upon him to submit a statutory declaration in the prescribed form disclosing all his liabilities.\n" +
                  "(f)  Otherwise, a Head of Department should take such action as may appear to him to be necessary when a Government Servant becomes financially embarrassed, and if he considers it undesirable that the Government Servant should be retained in the Public Service, should initiate the appropriate disciplinary proceedings.\n \n");

          Rules_Section section80 = new Rules_Section("Money lending(MISCELLANEOUS DISCIPLINARY RULES)","cat4","     04203 – No Government Servant shall make any loan at interest to any subordinate Government Servant or shall act as an intermediary between any Government servant and a moneylender or shall take any part in collecting debts on behalf of a moneylender.");

          Rules_Section section81 = new Rules_Section("Paid employment during leave(MISCELLANEOUS DISCIPLINARY RULES)","cat4","04204 – No officer or employee may accept a regular paid employment while on leave without previously obtaining the express sanction of the Office of Establishment.");

          Rules_Section section82 = new Rules_Section("Disclosure of official information(MISCELLANEOUS DISCIPLINARY RULES)","cat4","     04205 – Every Government Servant is subject to the Official Secrets Act.\n" +
                  "1962.\n");

          Rules_Section section83 = new Rules_Section("Copying of official  documents.(MISCELLANEOUS DISCIPLINARY RULES)","cat4","04206 – Every servant is prohibited from abstracting or copying official minutes papers, records or other documents except in accordance with official routine or with the special permission of Government, obtained from or through the Head of the Department concerned with the subject matter.");

          Rules_Section section84 = new Rules_Section("Access to personal confidential records.(MISCELLANEOUS DISCIPLINARY RULES)","cat4","04207 – Under no circumstances shall Government Servants have access to confidential or secret records relating personally to themselves.");

          Rules_Section section85 = new Rules_Section("Public records(MISCELLANEOUS DISCIPLINARY RULES)","cat4","     04208 – No Government Servant may, on leaving Nigeria, take with him any public record without the written permission of the appropriate Head of Depart-ment or, if he is himself a head of Department, of the Head of Service.");

          Rules_Section section86 = new Rules_Section("Historical documents(MISCELLANEOUS DISCIPLINARY RULES)","cat4","04209 – Historical manuscripts, or other documents of Public interest, which may be discovered by any Government Servant may not be removed from Nigeria.  Their existence must be reported to Government through the Head of Department concerned with their subject matter in order that, when feasible, steps may be taken for their examination and preservation");

          Rules_Section section87 = new Rules_Section("Publications and public utterances(MISCELLANEOUS DISCIPLINARY RULES)","cat4","04210 – Except in pursuance of his official duties, no officer, employee or member of the temporary staff shall, without the express permission of the Head of Service, whether on duty or leave of absence:\n" +
                  "(a)\tact as the editor of any newspaper, magazine or periodical or take part directly or indirectly in the management thereof;\n" +
                  "(b)\tcontribute to, whether anonymously or otherwise, or publishR in any manner, anythingwhich may reasonably be regarded as of a political or administrative nature;\n (c)\tspeak in public or broadcast on any matter which may reasonably be regarded as of a political or administration nature; and\n" +
                  "(d)\tallow himself to be interviewed or express any opinion for publication on any question of an administrative or political nature or on matters affecting the administration, defence or military resources of Nigeria or any State therein.\n" +
                  "     Nothing in this Rule shall be deemed to prevent a Government Servant from publishing in his own name, by writing, speech or broadcast, matter relating to a subject other than one which can be regarded as of a political or administrative nature, providedthat in so publishing any matter compiled with Government sanction from official records, he gives prominence to a disclaimer of government responsibility for its accuracy.\n");

          Rules_Section section88 = new Rules_Section("Political activities(MISCELLANEOUS DISCIPLINARY RULES)","cat4","     04211 – No officer, employee or member of the temporary staff shall, whether on duty or leave of absence:\n" +
                  "(a)\thold any office, paid or unpaid, permanent or temporary, in any political organization;\n" +
                  "(b)\toffer himself or nominate anyone else as a candidate at any election, or at any stage thereof, of a member of a State or the Federal Legislature or of any Local Government Council;\n" +
                  "(c)\tengage in canvassing in support of political candidates.\n" +
                  "     Nothing in this Rule shall be deemed to prevent a Government Servant from voting at any election.\n");

          Rules_Section section89 = new Rules_Section("Declaration of Assets on first appointment.(MISCELLANEOUS DISCIPLINARY RULES)","cat4","04212 – Upon first appointment, whether or not his whole time is at the disposal of Government, an officer shall unless an exception is made by the Office of Establishments in the case, furnish to the appropriate officer, for inclusion in his personal file particulars of:\n" +
                  " (i) all immovable property in Nigeria and all shares or interest in\n" +
                  "suchproperty;\n" +
                  "(ii) all mortgages over immovable property in Nigeria;\n" +
                  "(iii) all shares in companies carrying on business in Nigeria;\n" +
                  "(iv) all financial interests in commercial or business undertakings,\n" +
                  "                         or in Firms carrying on any description of professional work,\n" +
                  "                         in Nigeria-owned or held at the time of such first appointment\n" +
                  "                         by such officer.\n" +
                  "     (a)   Every such officer who is a male shall, if he is married at the time of the aforesaid appointment, furnish simultaneously with such particulars or if he marries after such, similar particulars of immovable property, mortgages, shares etc. owned or held by his wife.  Every such officer shall furnish similar particulars of immovable property, mortgages, shares etc. owned or held by his children or those of his wife by a previous marriage, under eighteen years of age.\n" +
                  "\n" +
                  "     04213 – (a) All Government Servants are free to invest in stock issued by or on behalf of any Government in Nigeria without restriction.\n" +
                  "     (b)  An officer may only hold or acquire immovable property in Nigeria and  shares or interests in such property, mortgages over immovable property in Nigeria, shares in companies carrying on business in Nigeria, and financial interests in commercial or business undertakings, or in firms carrying on any description of professional works, in Nigeria to the extent the law permits the officer concerned and provided the following conditions are observed:\n" +
                  "(i)\tan officer shall not, directly or indirectly hold or acquire such property or interest which might bring his private affairs into real or apparent conflict with his public duty or in any way influence him in the discharge of those duties\n" +
                  "(ii) all acquisitions in the terms of this paragraph (b) of this Rule by\n" +
                  "       or on behalf of officers, or their wives, or their children under \n" +
                  "       eighteen years of age, must be reported immediately to the \n" +
                  "       appropriate officer.  This condition applies to acquisitions by or\n" +
                  "       on behalf of a woman officer but not to those by or on behalf of \n" +
                  "       her husband who is not himself a Government Servant. \n" +
                  "(iii) if in the opinion of the appropriate officer, any holding or\n" +
                  "       acquisition by or on behalf of an officer is improper, he may order\n" +
                  "       that the officer shall divest himself of interest to such extent as the\n" +
                  "       appropriate officer thinks fit.  A holding or acquisition is improper\n" +
                  "       if it might bring an officer’s private interests into real or apparent\n" +
                  "       conflict with his public duty or in any way influence him in the\n" +
                  "       discharge of his duties.  An officer may appeal to the Head of the\n" +
                  "       Service against an order under this sub-paragraph by an \n" +
                  "       appropriate officer.\n" +
                  "(iv) In any case, where an officer has reason to foresee any real or\n" +
                  "       apparent conflict between his public duty and private interests \n" +
                  "       caused by the fact that he, or his wife, or a child of his wife under\n" +
                  "       eighteen years of age, holds or proposes to acquire property or\n" +
                  "       interest in the terms of this paragraph, he shall report all the facts\n" +
                  "       of the case to the appropriate officer (a member of a centrally-deployed      \tCadre should make his report through the Head of Department to \twhich he is posted, if other than that, immediatelyunder the \tappropriate Officer) and stay all action by him in that case until the \tnecessary order (e.g. that some other officer shalldealwith the case) is \treceived from the appropriate officer.\n" +
                  "\t(c)correspondence regarding the matters referred to in Civil Service Rule \t04212 and this Rule or copies of such correspondence, should, on \t\tcompletion, be filed in the officer’s personal confidential file in office \tof the appropriate officer.\n\n");

          Rules_Section section90 = new Rules_Section("Mineral discoveries(MISCELLANEOUS DISCIPLINARY RULES)","cat4","04214 – It is the duty of all officers and employees to report to Government, any discovery of what they consider to be valuable minerals. All officers and employees are prohibited, under pain of dismissal, from deriving any benefit or taking any payment from any syndicate, company or individual, as a reward for giving such information.  Upon the report by an officer or employee of such discovery, it is within the discretion of the Government of the Federation to make the report public or to withhold it.");


          Rules_Section section91 = new Rules_Section("Maintenance of accounting records.(MISCELLANEOUS DISCIPLINARY RULES)","cat4","     04215 – Medical Officers and Dental Officers, although not required to pay remuneration from private practice into the Treasury Cash Office, must maintain such accounting records as in the opinion of the Board of Internal Revenue are adequate for income tax purposes.");

          Rules_Section section92 = new Rules_Section("Sales of Personal property.(MISCELLANEOUS DISCIPLINARY RULES)","cat4","     04216 – Except with the prior approval of his Head of Department (or, in the case of a Head of Department, the Head of Service), no officer may sell his own or another officer’s private property to Government, a Local Government body or a chief, nor may he purchase any private property for Government, a local authority or chief, or furnish supplies to them on payment, without a like approval.");

          Rules_Section section93 = new Rules_Section("Seeking influence of Members of Parliament etc forbidden(MISCELLANEOUS DISCIPLINARY RULES)","cat4","     04217 – The influence of Member of Parliament of any Legislature in Nigeria or of other persons outside the official arrangements for ensuring the due consideration for the claims of staff or candidates must not be sought in matters connected with discipline or with a view to obtaining consideration for appointment, transfer, or promotion.");

          Rules_Section section94 = new Rules_Section("Libel and slander action(MISCELLANEOUS DISCIPLINARY RULES)","cat4","04218 – No step may be taken by any officer or employee, without the consent of the Head of the Service, to institute legal proceedings of libel or slander.");

          Rules_Section section95 = new Rules_Section("Subscriptions and valuable presents(MISCELLANEOUS DISCIPLINARY RULES) ","cat4","\n" +
                  "     04219 – (a) The collection of subscriptions from subordinate officers and employees to defray the cost of testimonials and presentations to superior officers should be optional\n" +
                  "\n" +
                  "      (b)  Officers in the Ondo State Civil Service are prohibited from receiving valuable presents (other than the ordinary gifts of personal friends), whether in the shape of money, goods, free passages or other personal benefits, and from giving such presents.  This paragraph applies not only to the officers themselves but also to their families.  Officers will be held responsible for the observance by members of their families.  It does not apply to cases of remuneration for special services rendered and paid for with the consent of the Government.  It may be relaxed on the occasion of an officer’s retirement from the public service, but only if the special permission of the Head of Service, or in the case of the head of Service, the Governor, had been previously obtained.\n" +
                  "\n" +
                  "     (c) Valuable presents fromrulers, chiefs and other persons which cannot be refused without givingoffence shall be handed over to the Government\n");

          Rules_Section section96 = new Rules_Section("Unofficial testimonials about government officials.(MISCELLANEOUS DISCIPLINARY RULES)","cat4","     O4220 – Superior Officers are prohibited from issuing to their subordinates personal letters or recommendation regarding their official service; provided that a superior officer may answer a confidential enquiry from the prospective employer of a subordinate by whom he had been named as a personal referee, or give his confidential opinion  of an officer or employee, if requested, in connection with the award of a scholarship, or in connection with the officer’s or employee’s admission to an academic institution or cause of study.");

          Rules_Section section97 = new Rules_Section("Unofficial testimonials (MISCELLANEOUS DISCIPLINARY RULES)","cat4","04221 – In order to prevent the irregular use by non-officials of letters of recommendation or certificates of character, officers are prohibited from giving such letters or certificates (whether on official stationery or otherwise), except to domestic servants.");

          Rules_Section section98 = new Rules_Section("Discharging duties.(MISCELLANEOUS DISCIPLINARY RULES)","cat4","04222– Every Government Servant is required to discharge the usual duties of the office to which he is appointed, and ant other duties which the Government considers appropriate having regards to the appointment held by him and which it may call upon him to perform.");

          Rules_Section section99 = new Rules_Section("Statements on appointment(MISCELLANEOUS DISCIPLINARY RULES)","cat4","04223 – Concealment of any of the facts an applicant for Government employment is required by Rule 02106 to state, or any false statement in that regard, or in an application for employment, will be regarded as sufficient grounds for non-employment, or for subsequent termination of appointment without    notice if such falsehood is detected after engagement.");


          Rules_Section section100 = new Rules_Section("Payment of Salary(SALARIES)","cat5","05101 – Financial Regulations contain guidance on the payment of salaries and wages.");

          Rules_Section section101 = new Rules_Section("Salary on appointment(SALARIES)","cat5","05102 – on first appointment, salary shall be paid as from the date of assumption of duty.");

          Rules_Section section102 = new Rules_Section("Salary on transfer from other Government.(SALARIES)","cat5","05103 – On transfer from another Government to the Civil Service, an officer will be eligible for the salary attaching to his new office with effect from the day he leaves his former office, provided he proceeds direct to assume duty in his new office.");

          Rules_Section section103 = new Rules_Section("Salary on promotion within incremental steps(SALARIES) ","cat5","     05104 – An officer promoted from one grade to another shall enter the promotion salary grade level at a point that is not less than the next incremental step in his old scale.\n" +
                  "(a)\tIf the officer is promoted to a salary scale that does not overlap his \n" +
                  "old salary scale, he will be placed on the minimum point of his new\n" +
                  "scale.\n" +
                  " (b)   An officer who is promoted to a grade to which direct recruitment  \n" +
                  "         also takes place may not be paid substantively more than he would \n" +
                  "have been paid if he had entered the grade direct on the date on \n" +
                  "which he entered his old grade, and had served in it continuously \n" +
                  "until the date of his promotion on the scale in force at that date.  If \n" +
                  "the sum of his old salary and the promotion increase is more than \n" +
                  "his hypothetical salary, he will receive that sum, without increments\n" +
                  " until the date on which he would have received a higher salary if he \n" +
                  "          had entered the grade as above, and that date will become his \n" +
                  "          incremental date.\n" +
                  "(c)     The salary of an officer promoted on his incremental date will be \n" +
                  "          calculated as if he and received an increment on his old scale on the \n" +
                  "          date of his promotion.\n" +
                  "     05105 –    When an officer receives in addition to the salary of his office, an allowance granted to himself personally and not permanently attached to his office, he may when absent on half-pay leave receive half of such personal allowance, the rest being left undrawn and lapsing to the Treasury\n");

          Rules_Section section104 = new Rules_Section("Increments not as of right(INCREMENT RULES)","cat5","     05201 – An officer on an incremental scale shall normally be granted an increment unless he is on interdiction or has a disciplinary action pending against him.");

          Rules_Section section105 = new Rules_Section("Incremental date(INCREMENT RULES)","cat5","     05202 – The incremental date of an officer appointed or promoted to a post in the State Civil Service shall be the anniversary of the date of the promotion/ appointment advanced to the first day of the month concerned.");


          Rules_Section section106 = new Rules_Section("Incremental date(DIFERRING AND WITH-HOLDING OF INCREMENTS)","cat5","05203 – The grant of an increment may be deferred or with-held in accordance with the provisions of Chapter 4.  In deciding which penalty to impose or recommend, a Head of Department will take into account the gravity of the shortcoming and the quality of the officer’s or employee’s previous service, bearing in mind that to with-hold and increment is a more serious penalty that to defer it.");

          Rules_Section section107 = new Rules_Section("Grounds  for withholding Or deferring increments.(DIFERRING AND WITH-HOLDING OF INCREMENTS)","cat5","     05204 – An officer’s increment is deferred when the decision as to whether or not it should be granted in postponed for a specific period.  The period must be fixed at the time increment is deferred and most not be less than three months or more than six months if less than six months in the first instance, it may, if necessary, be increased to six months by additional specific deferment.  If a deferred increment is eventually granted it does not become effect until the day following the expiration of the specific period of deferment, but the recipient retains his original incremental date for subsequent increments.  If a deferred increment is not granted at or before the expiration of six months from the date it was originally due, it must be with-held.  For example, if an officer who is due to proceed from N6,168.00 to N6,384.00 per annum on 01/02/97 had his increment deferred for three months, his salary should remain at N6,168.00 until 30/04/97 (i.e. for three months).  Not later than 30/04/97 his Head of Department must decide whether or not to grant the deferred increment.  If he grants it, the officer draws salary at N6,384.00 for the period 01/05/97 to 31/01/98 for consideration of his next increment to N6,600.00.");

          Rules_Section section108 = new Rules_Section("Deferred Increment.(DIFERRING AND WITH-HOLDING OF INCREMENTS)","cat5","\n" +
                  "     05205 – an officer’s increment is with-held when it is decided not to grant it and he shall cease to be eligible therefore until his next incremental date.  The with-holding of an increment thus results in the salary of the officer in question remaining for the rest of the incremental service, i.e one increment behind what it would have been had the increment not been with-held, unless the Civil Service Commission exercises its authority to review the decision.\n" +
                  "\n" +
                  "   05206 – An increment deferred or with-held may not be restored with retrospective effect in consequence of improved service during a later increment- earning period\n");


          Rules_Section section109 = new Rules_Section("Withheld increment.(ADVANCEMENT/CONFIRMATION TESTS – CLERICAL GRADE OFFICERS, TECHNICIANS AND MESSENGERS)","cat7","        07101 – The tests will be held at six monthly intervals.  Details of the subject to be taken are as follows:\n" +
                  "A – I Clerical Officers – GL 04\n" +
                  "         (with WASC, SSCE OR GCE O/L who have spent at least one year in the service\n" +
                  "(i)\t English Language\n" +
                  "(ii)   General Paper\n" +
                  "(iii)   Civil Service Rules\n" +
                  "(iv)    Financial Regulations\n" +
                  "(v)      Office Procedure or Special Paper\n" +
                  "II        Clerical Assistants – GL 03\n" +
                  "           (with WASC/S.75 Failed or Certificates or those who have passed the \n" +
                  "Sub-Clerical/Sub-Technicians, Examination and have spent at least two years on \n" +
                  "the post.)\n" +
                  "(i)\t   English Language\n" +
                  "(ii)    General Paper\n" +
                  "(iii)   Civil Service Rules\n" +
                  "(iv)    Financial Regulations\n" +
                  "(v)     Office Procedure or Special Paper\n" +
                  "(vi)    Elementary Maths\n" +
                  "Sub-Clerical/Sub-Technicians, GL 02 (Messengers/Store man Cadres) with First School Leaving Certificates who have spent at least three years in the Service).\n" +
                  "(i)\t   English Language\n" +
                  "(ii)    General Paper\n" +
                  "(iii)   Office Routine or Special Papers\n" +
                  "(iv)    Elementary Arithmetic.\n" +
                  "B – The pass marks are as follows:\n" +
                  "\n" +
                  "I     Clerical Officers                             \n" +
                  "Confirmation Level                                50% Average with at least\n" +
                  "                                                                50% score in English and 40% \n" +
                  "                                                                score in each of the other \n" +
                  "                                                                subjects\n" +
                  "\n               Promotion                     65% Average with at least\n" +
                  "50% score in English and 40%\n" +
                  "each of the other subjects.\n" +
                  "\n" +
                  "             Accelerated                  75% Average with at least\n" +
                  "50% score in English and \n" +
                  " 40% each of the other subjects.\n" +
                  "\n" +
                  "             II   Clerical Assistant/  60% Average withat least\n" +
                  "     Promotion50% score in English and 40%\n" +
                  "each of the other subjects.\n" +
                  "\n" +
                  "           III   Sub-Clerical/            60% Average with at least\n" +
                  "                  Sub-Technicians      50% score om English and 40%\n" +
                  "                   Grades (Messenger/      score in each of the other \n" +
                  "Store man) Promotion   subjects.\n" +
                  "\n" +
                  "         C        Accelerated level, i.e. 70% Officers who pass the examination at this\n" +
                  "Level should, subject to satisfactory work and conduct be confirmed and advanced to grade level 05 after two years’ service.  Thereafter, they should, be selected for training as Assistant Executive Officer provided vacancies are available.  All Clerical Assistants on GL 03 who have served for not less than two years in the grade shall take the test and score a minimum of 50% pass mark to be deemed eligible for promotion to Clerical Officer.\n");
          Rules_Section section110 = new Rules_Section("Clerical Assistants Officers who are required to pass.(COMPULSORY EXAMINATION FOR ADMINSTRATIVE  OFFICER CADRE)","cat7","     07201 – All categories of officers entering the Civil Service as from GL. 08 without prejudice to their qualifications on appointment shall pass the confirmation examination relevant to their schemes of service.  It shall be made mandatory that officers shall be exposed during their orientation courses to CSR, FR and Law.\n" +
                  "\n" +
                  "     07202 – Administrative Officers who possess legal qualifications obtained from any Nigerian University or have been called to the Nigerian Bar may be exempted, at the discretion of the Government, from taking Group A of the examination.\n" +
                  "\n" +
                  "     07203 – the following are the prescribed examinations for Administrative Officers:\n" +
                  "\n" +
                  "GROUP A         -       Law Examinations (Papers 1 and 2)\n" +
                  "Paper 1              -       Law Examination – Principles of Common Law (Note:\n" +
                  "                                  The book recommended for study in preparation for\n" +
                  "                                  This paper is Wilshere’s Principle of Common Law)\n" +
                  "Paper 2          -     Legislation – This paper covers the main provisions \n" +
                  "of the following Legislation:\n(a)  The Constitution of the Federal Republic of Nigeria 1999;\n" +
                  "       (b)  The Interpretation Act;\n" +
                  "                    (c)  The following Laws of Ondo State of Nigeria.\n" +
                  "                                    (i)    Native Lands Acquisition Law, 1978, Cap. 19;\n" +
                  "                                    (ii)   The Education Law, 1978 Cap. 36;\n" +
                  "                                   (iii)   The Local Government Boundary Settlement \n" +
                  "                                             Law, Cap. 19;\n" +
                  "                                    (iv)   The Chiefs Law, Cap. 20;\n" +
                  "                                     (v)   The Customary Courts Law, 1978, Cap. 33;\n" +
                  "                                    (vi)   The Illiterates Protection Law, 1978, Cap. 48;\n" +
                  "                                    vii)   Income Tax Law;\n" +
                  "                                  (viii)  Riots and Damages Law, 1978, Cap. 110;\n" +
                  "                                    (ix)  The Public Order Law, 1978, Cap. 63;\n" +
                  "                                   (x)  The Local Government Law, Cap. 63;\n" +
                  "(xi) The Public Health Law,1978, Cap. 102;\n" +
                  " (xii)Enforcement Law, 1978, Cap 56;\n" +
                  "(xiii) The Finance (Establishments and Control of\n" +
                  "Funds) Law;\n" +
                  "                       (xiv) The Commissions of Inquiry Law, 1978, Cap. 25;\n" +
                  "(xv) Pensions Act Cap. 346, Law of the Federal\n" +
                  "           Republic of Nigeria.\n" +
                  " GROUP B – Papers 3, 4 and 5 (Official Publications)\n" +
                  "   Paper 3  - Civil Service Commission Regulation\n" +
                  "    Paper 4  -  Civil Service Rules\n" +
                  "        Paper 5  -  Financial Administration – including\n" +
                  "       Financial Regulations – This paper covers the following subjects:\n" +
                  "                                   (a)   Allocation of Revenue under the Constitution;\n" +
                  "(b)   The Public Administration Law, Parts I-VII and IX;\n" +
                  "  (c)   Preparation and use of Annual Estimates of Revenue and Expenditure;\n" +
                  "    (d)   Control of Public Expenditure:\n" +
                  "   (i)    The Role of the Legislature in Financial Control;\n" +
                  "(ii)   The role of Treasury in Financial Control;\n" +
                  "(iii)  Departmental Control of Expenditure;\n" +
                  "(e)  The Accounting System, seen from administrative\n" +
                  "view point;\n" +
                  "                                      (f)  Losses of Funds and Boards of Survey.\n");
          Rules_Section section111 = new Rules_Section("Officers who Are required to pass(COMPULSORY EXAMINATION FOR THE \n" +
                  "EXECUTIVE OFFICER CADRE\n)","cat7","07301  - Unless specially exempted by the Government, Officers of the Ex- ecutive  Officer Cadre are required to pass the examinations prescribed in Rule \\n\" +\n" +
                  "                  \"07302 within two years of the date of taking up their appointment in the state Civil Service:\\n (a)\\tOfficers appointed direct on first appointment as Executive Officer.\\n\" +\n" +
                  "                  \"(b)\tExecutive Officers transferred from other Public Services who at the date of transfer are under the age of forty years and have not satisfied the conditions for confirmation;\\n\" +\n" +
                  "                  \"(c)\tExecutive Officers promoted from junior posts.\\n");

          Rules_Section section112 = new Rules_Section("Syllabuses of Examination.(COMPULSORY EXAMINATION FOR THE \\n\" +\n" +
                  "                  \"EXECUTIVE OFFICER CADRE\n)","cat7","07302–The following are the prescribed examinations for Executive Officers\n" +
                  "              (i)   Civil Service Rules\n" +
                  "              (ii)   Financial Regulations\n" +
                  "               (iii)  Civil Service Commission Regulations.\n");

          Rules_Section section113 = new Rules_Section("Text books allowed.(EXAMINATION RULE)","cat7","     07401 – The object of the examination specified in this chapter is to test the candidates’ ability to apply the rules and principles contained in the books, Law, Acts etc. which form the subjects of the examinations.  Accordingly, candidates will be allowed to refer during the examinations to the relevant books Acts, etc. in question but not books of model answers or prepared questions.");

          Rules_Section section114 = new Rules_Section("Examination Board.(EXAMINATION RULE)","cat7","     07402 – there shall be an Examination Board appointed consisting of repre- sentatives of the Office of Establishments, Civil Service Commission, and Ministries of Justice, Finance and Education which shall be responsible for the general policy and conduct of the examinations. The Ministry of Education shall be the Secretariat of the Board.");

          Rules_Section section115 = new Rules_Section("Failure to pass Examinations.(EXAMINATION RULE)","cat7","07403 – an officer who fails to pass, within three years, the examination specified in this chapter as compulsory for him, is liable to have his probationary appointment terminated, or his confirmation deferred whichever is appropriate to the circumstances and he shall not be considered for promotion and further increments.");

          Rules_Section section116 = new Rules_Section("Fees payable(EXAMINATION FEES)","cat7"," 07501 – Fees payable to examiners for setting and marking of papers shall be determined by the Examination Board from time to time, subject to the ap-proval of the State Executive Council.");

          Rules_Section section117 = new Rules_Section("Definitions(GENERAL)","cat10","10101 -  “Hospital” means a Government Hospital including University Teaching Hospitals, or hospitals run by a Government Agency.\n" +
                  "“Medical Officer” means a Government Medical Officer or a Medical Officer in a Hospital run by a Government Agency.\n" +
                  "\n" +
                  "     “Private Practitioner” means any other Registered Medical or Dental Practitioner registered by the Medical Council of Nigeria or its equivalent in the country of origin of the Practitioner.\n");

          Rules_Section section118 = new Rules_Section("Medical Documents to be treated as confidential(GENERAL)","cat10","     10102 – the medical certificate, reports of medical boards, dental treatment records, reports of private practitioners and confidential heal reports mentioned in this Chapter will be treated as strictly confidential.  No copies of these reports except those mentioned in this Chapter will be furnished, except that this rule will not preclude the keeping of an officer’s health record in the Ministry of Health or the transfer of such record to the corresponding office when an officer is transferred to the service of another Government. ");

          Rules_Section section119 = new Rules_Section("Medical examination on appointment.(GENERAL)","cat10","10103  - Every person selected for appointment either in a temporary or in a permanent capacity shall be required to present himself for examination to a Government Medical Practitioner (or one so approved by Government) with a view to its being ascertained whether he is physically fit for service.  Unless otherwise provided in the offer of appointment, the fee for such examination shall be paid by the Government.  If the candidate is not finally passed as medically and physically fit for service, his appointment shall be terminated.");

          Rules_Section section120 = new Rules_Section("Special medical tests. (GENERAL)","cat10","10104 – (a)  The Head of Department may at any time (and shall, if the officer so requests)  call upon an officer to present himself for examination to an approved or Government Medical Practitioner, or to a duly constituted medical board, with a view to its being ascertained whether the officer is physical capable of performing the duties of his appointment or of any appointment to which it may be proposed to transfer him.\n" +
                  "\n" +
                  "                 (b)  An officer on leave of absence may be required or at his own request, may be appointed by the Government or its accredited representative, to present himself for examination to an approved Medical Practitioner, with a view to obtaining a report as to the officer’s physical fitness to return to his duties or to take up a fresh appointment.\n" +
                  "In the case of examinations under proceeding Rule:\n" +
                  "(a)\tany fee in respect of the examinations shall, in the absence of any \n" +
                  "special requisitions or arrangement to the contrary, be paid by the Government;\n" +
                  "\n" +
                  "(b)\t the person or persons appointed to conduct the examination shall have \n" +
                  "discretion to call a specialist into consultation and any fee due to the specialist for assistance in rendering a report to the government shall be paid from public funds;\n" +
                  "\n" +
                  "(c)\t the report of the examinations shall be furnished to the Government and \n" +
                  "may be communicated to the officer concerned at the discretion of the Medical Officer;\n" +
                  "\n" +
                  "(d)\t the officer shall, however, be informed at the earliest possible date of \n" +
                  "the decision reached upon his case by the Government after consideration of the report, and if the officer is dis-satisfied with that decision, he shall be at liberty to make representations to this effect, in which event the Government shall decide at its discretion whether any further medical evidence shall be called for.\n" +
                  "\n" +
                  "     10106 – An officer may be granted leave by his Head of Department for the purpose of visiting a medical specialist/dentist, but only if it is certified by the local Government Medical Officer that he is unable to deal with the case himself and that it will definitely affect the health of the officer if consultation is postponed.\n" +
                  "\n" +
                  "     An officer granted leaver in such circumstances will be treated for the purpose of free transport facilities (but not for travelling allowance) as travelling on duty.  If no medical certificate is given, it will be open to an officer to apply for casual leave under Rule 15108.\n");

          Rules_Section section121 = new Rules_Section("Specialist dentist.(FACILITIES FOR MEDICAL TREATMENT)","cat10","10201 – All categories of Staff of Government, their spouses, dependent children and domestic servants are entitled to free medical facilities subject to the over-riding principles of the Hospital Fees Laws as amended.");

          Rules_Section section122 = new Rules_Section("Government facilities in Nigeria.(FACILITIES FOR MEDICAL TREATMENT)","cat10","      10202 – An officer who prefers to be treated by a private practitioner instead of availing himself of Government medical facilities must himself bear all expenses incurred through such treatment.");

          Rules_Section section123 = new Rules_Section("Patient to bear expenses.(FACILITIES FOR MEDICAL TREATMENT)","cat10","     10203-  When owing to the state of his health, an officer or a member of his family is compelled in the absence of a Medical Officer, to avail himself of the services of a private medical practitioner, he will be responsible in the first instance for the fees payable.  If, however, the circumstances are recognized by the Director of Medical Services and Training, as requiring such service, he may advise the Commissioner for Health to approve a refund to the officer at such rates as he, the Director of Medical Services and Training, considers fair and reasonable.");

          Rules_Section section124 = new Rules_Section("Refundable in special cases.(FACILITIES FOR MEDICAL TREATMENT)","cat10","     10204 – When an officer or a member of his family gets a prescription from a Medical Officer in a Government hospital/clinic but is unable to obtain the drugs from the Government hospital, he shall, on application of the Director of  Medical Service and Training be reimbursed the cost of purchasing the drugs on production of receipt issued to that effect.");

          Rules_Section section125 = new Rules_Section("Officers embarked as invalids(FACILITIES FOR MEDICAL TREATMENT)","cat10","10205 – If an officer is embarked by Government or its accredited repre- sentative in a sea-going vessel or aircraft as an invalid and placed in the charge of the surgeon the latter’s fees for Medical attendance on the officer during the journey shall be paid by the Government.");

          Rules_Section section126 = new Rules_Section("Officer falling seriously ill on journey to or from Nigeria(FACILITIES FOR MEDICAL TREATMENT)","cat10","     10206 – Government shall refund medical expenses incurred by officers and their families during journeys duly authorized by the Government in cases of serious illness occurringen-route and provided that the illness is not attributable to the officer’s or his family’s negligence.  Claims for petty bills incurred on board ships will not, however, be entertained.");

           Rules_Section section127 = new Rules_Section("Medical expenses during overseas leave.(FACILITIES FOR MEDICAL TREATMENT)","cat10","     10207 – the Ondo State Ministry of health may authorize a refund of medical expenses (including charges for maintenance) incurred by an officer while overseas on leave or on duty provided:\n" +
                   "(a)\t The illness was not due to the officer’s own negligence;\n" +
                   "(b)\tThe illness was attributable to conditions in, or the climate of the overseas country;\n" +
                   "(c)\tThe officer showed diligence, expedition and economy in seeking and obtaining medical attention.\n");

           Rules_Section section128 = new Rules_Section("Procedure for medical check-up Treatment abroad.(FACILITIES FOR MEDICAL TREATMENT)","cat10","10208 – Officers seeking approval for medical check-up/treatment abroad shall submit their applications through the Permanent Secretary/Head of Department to the Ministry of Health through the Director of Medical Services and Training who shall counter-sign the certificate of recommendation issued by the local consultant which shall be attached to the application.\n" +
                   "\n" +
                   "     10209 – If as a result of medical check-up locally, it is recommended that a further medical consultation and/or treatment should be under-taken/given broad’s permission to do so, may be granted by the Governor, and the following procedure shall apply:\n" +
                   "\n" +
                   "(i)\tall applications for medical check-up abroad supported by Medical \n" +
                   "reports from reputable Consultants in the public Hospitals should\n" +
                   "       be screened and endorsed by the Ministry of Health.  In other\n" +
                   "       words, medical check-up abroad should no longer be undertaken by\n" +
                   "        officers just because they happened to have gone abroad on some \n" +
                   "        official assignment;\n" +
                   "(ii)   Permission must be sought and obtained before undertaking a trip\n" +
                   "        for medical treatment abroad at Government expense.\n" +
                   "(iii)  The Governor’s approval for medical check-up/treatment abroad\n" +
                   "        shall be conveyed to the officers in writing by the Permanent\n" +
                   "        Secretary; Ministry of Health, copied to the Ministry of Finance; \n" +
                   "and\n" +
                   "(iv)  Officers who have obtained approval should collect their estacodes \n" +
                   "        from the Ministries before their departure \n");

           Rules_Section section130 = new Rules_Section("Payment for bill for medical check-up treatment abroad.(FACILITIES FOR MEDICAL TREATMENT)","cat10","10210 – (i)  where a spouse has become eligible to have a medical check- up/treatment abroad he or she cannot be accompanied by his wife or her husband at Government expense.\n" +
                   "     (ii) However, permission may be granted a spouse to accompany his wife or her husband at Government expense where the ailing officer is considered to be in life or death condition, in consequence of which immediate medical treatment or hospitalization abroad is recommended.\n" +
                   "     (iii)  where a spouse who is not a public officer accompanies his/her child on an approved medical treatment abroad, the spouse shall enjoy the normal estacode allowance of either of the spouse who is a public officer.\n" +
                   "\n" +
                   "     (iv) In such  case, the commitment of the Government shall be limited to the provisions of return air passage for two of them together with the payment of estacode allowance in respect of only one spouse, is being  assumed that if the patient is hospitalized his or her spouse will remain in an hotel, or that if the officer remains as an out-patient, the two of them will utilize the same hotel accommodation, provided a prior approval for the journey had been obtained from the competent authority.\n" +
                   "     (v)  Hospital bills in respect of medical check-up/treatment abroad shall be forwarded to the Ministry of Health for settlement.  Where such bills are settled by Nigerian Missions abroad in the first place, bilateral arrangement for reimbursement shall be made between the Ministries of External Affairs and Health.\n");


           Rules_Section section131 = new Rules_Section("General(FACILITIES FOR DENTAL TREATMENT)","cat10","10301 – The dental treatment provided free by Government Dental Surgeons to officers, and their families and the scales of charges for other dental treatment provided by Government Dental Surgeons are specified in the current Hospital Fees Regulations and amendments thereto.");

           Rules_Section section132 = new Rules_Section("Patients bears expenses.(FACILITIES FOR DENTAL TREATMENT)","cat10","10302 – An officer who prefers to be treated by a private practitioner instead of availing himself of the services of a Government Dental Surgeon must himself bear all expenses incurred through such treatment.");

           Rules_Section section133 = new Rules_Section("Expenses in special cases: refundable.(FACILITIES FOR DENTAL TREATMENT)","cat10","10303 – This Rule refers only to types of dental treatment for which no charge will be made if provided by a Government Dental Surgeon.  When an officer is compelled, (because the services of a Government Dental Surgeon are not available) to avail himself of the services of a private dental practitioner in order to obtain urgent treatment prescribed by a Medical Officer, the Officer shall be reimbursed of the expense so incurred.");

           Rules_Section section134 = new Rules_Section("Types of Medical Certificates(ABSENCE FROM DUTY ON ACCOUNT OF ILLNESS)","cat10","     10401 – The following types of Medical Certificateare use in connection with the sickness of officers:\n" +
                   "(a)\t Excuse Duty Certificate, Combined Medical Form No. Med.166\n" +
                   "(b)\tLight Duty Certificate, Combined Medical Form No. Med.167\n" +
                   "(c) medical and Duty Certificate, Combined Medical Form No Med.\n" +
                   "168\n" +
                   "     (d)  Certificate issued by hospitals run by Government Agencies.\n" +
                   "\n" +
                   "     10402 – An officer seeking one of these certificates should do so either:\n" +
                   "(a)\tby presenting himself to the appropriate Medical Officer for examination – in which case he will, unless admitted to hospital as inpatient, by given by the Medical Officer who examines him which –ever certificate the latter considers appropriate, or\n" +
                   "(b)\tby forwarding to the Senior Administrative Medical Officer at his station, a detailed report on his illness by the private medical practitioner who is attending to him, and arranging for the collection from such Medical Officer of whichever certificate the latter decides to issue in the light of the private practitioner’s report (see rule 10415)\n");

           Rules_Section section135 = new Rules_Section("Duty to notify address(ABSENCE FROM DUTY ON ACCOUNT OF ILLNESS)\n","cat10","10403 – Every officer or employee is responsible for keeping his Department informed in writing of the address at which it will be possible to find him or ascertain his whereabouts in event of his being prevented by illness from attending duty.");

           Rules_Section section136 = new Rules_Section("Duty to report when ill(ABSENCE FROM DUTY ON ACCOUNT OF ILLNESS)","cat10","     10404 – (a)  An officer not being on leave of absence or an in-patient in a Government Hospital who is prevented by illness from performing his duties at his place of work, must either report the fact immediately to his Department or, within 24 hours cause to be delivered to his Department, an excuse-duty certificate, signed by the appropriate Medical Officer, of whose service the officer/employee had availed himself.\n" +
                   "(b) on reporting ill to his department, an officer will either:\n" +
                   "\n" +
                   "  (i)  receive instructions to seek medical advice forthwith,\n" +
                   "                    in which case he must cause one or other of the\n" +
                   "                    medical certificates listed in Rule 10401, to be issued\n" +
                   "                    and subsequently delivered to his Department within\n" +
                   "24 hours.\n" +
                   "(ii) be authorised by a responsible officer to absent himself from\n" +
                   " duty without a medical certificate for a specified period; in a\n" +
                   "placewhere a Medical Officer is available,such specified\n" +
                   " period will not exceed two days; in a place where no Medical\n" +
                   " Officer is available, the specified period will be at the discretion\n" +
                   " of the responsible officer.\n" +
                   "     (c) unless absence from duty through illness is covered either by admission to a Government hospital, by Department authority as explained or an excuse duty certificate, it will be treated as absence without leave.\n");



           Rules_Section section137 = new Rules_Section("Duty to seek and comply with medical advice.(ABSENCE FROM DUTY ON ACCOUNT OF ILLNESS)","cat10","10405 - An officer stationed at a place where a Medical Officer is available must, when so instructed by his “Department or when he has been prevented by illness for two days from performing his duties at his place of work (whichever event occurs first); seek medical advice.  An officer may seek such advice either from the Medical Officer or if he prefers, from a private medical practitioner in the neighbourhood.In either case, he must comply with the advice given.  An officer Stationed at a place where no Medical Officer is available must, when so instructed by his Department, comply with any official arrangements made to provide him with medical advice and must comply with the advice so obtained.  An officer who has failed to comply with this Rule will render himself liable to be treated as having been absent without leave.");

           Rules_Section section138 = new Rules_Section("Duty to attend medical Boards and comply with recommendation.(ABSENCE FROM DUTY ON ACCOUNT OF ILLNESS)","cat10","10406 – if for any reason it is decided that an officer should be examined by a Medical Board, he must present himself for examination at the place and time instructed and must afterwards comply with the recommendations of the Board, which will superede any Medical Officer’s or Private practitioner’s opinion.  An officer who has failed to comply with this Rule will render himself liable to be treated as having been absent without leave.");

           Rules_Section section139 = new Rules_Section("Assigning responsibility(ABSENCE FROM DUTY ON ACCOUNT OF ILLNESS)","cat10","10407 – Head of Departments will assign the responsibilities described in Rule 10408 to 10412 as appropriate.");

           Rules_Section section140 = new Rules_Section("Recording of addresses.(ABSENCE FROM DUTY ON ACCOUNT OF ILLNESS)","cat10","10408 – Each Department must maintain an up-to-date record of the residential addresses of its officers.");

           Rules_Section section141 = new Rules_Section("Enquiries about  absence(ABSENCE FROM DUTY ON ACCOUNT OF ILLNESS)","cat10","     10409 – If an officer’s absence from duty is not explained by him within 24 hours, enquiry should be made at his recorded address to ascertain the cause of absence");

           Rules_Section section142 = new Rules_Section("Reporting the illness of staff.(ABSENCE FROM DUTY ON ACCOUNT OF ILLNESS)","cat10","1410 – Whenever an officer becomes so ill that he is physically unable to present himself for medical examination, the circumstances of his whereabouts should be reported by his Department to the nearest Medical Officers.");


           Rules_Section section143 = new Rules_Section("Instructions to staff reporting sick.(ABSENCE FROM DUTY ON ACCOUNT OF ILLNESS)","cat10","     10411 – When an officer reports that he is prevented by illness from performing his duties, he shall (unless Rule 10410 applies) be instructed or authorised as explained in Rule10404 (b) and be provided with a note requesting the Medical Officerto examine and treat him.");

           Rules_Section section144 = new Rules_Section("Appointment of medical Board.(ABSENCE FROM DUTY ON ACCOUNT OF ILLNESS)","cat10","10412 – When it is desirable to appoint a Medical Board, it is the responsibility of the Head of Department to initiate action in that regard.");


           Rules_Section section145 = new Rules_Section("When patient attends in person(ABSENCE FROM DUTY ON ACCOUNT OF ILLNESS)","cat10"," 10413 – When an officer presents himself to a Medical Officer for examination, the latter will examine and treat him and if need be, give him either of the certificates listed in Rule 10401 as the Medical Officer considers appropriate or, if he admits him to hospital as an in-patient, inform him Department.");

           Rules_Section section146 = new Rules_Section("When Department reports patient unable to attend.(ABSENCE FROM DUTY ON ACCOUNT OF ILLNESS)","cat10","10414 – when a Department reports to a Medical Officer that an officer of the Department is so ill that his physical unable to present himself for medical examination, the Medical Officer will, as appropriate, either arrange for the officer to be brought to hospital for examination and treatment or visit the officer to examine and treat him.\n" +
                   "     If the examination results in the officer being admitted to Government Hospital as an in-patient, the Medical Officer will so inform the officer’s Department, otherwise he will give the officer whichever of the certificates listed in Rule 10401 he considers appropriate.\n");

           Rules_Section section147 = new Rules_Section("When patient sends private practitioner’s report(ABSENCE FROM DUTY ON ACCOUNT OF ILLNESS)","cat10","10415 – When an officer forwards to a Medical Officer a report on his illness by the private practitioner attending to him the Medical officer will, after such Consultation with the private practitioner as he may deem necessary, issue whichever of the certificates listed in Rule 10401 he considers appropriate in the light of the private medical practitioner’s report.  The period of excuse duty or light duty entered on the first certificate he issues will not exceed three days unless the Government Medical Officer has himself examined the patient, in which case the period may be for up to seven days.  Each period of extensionthereto shall not exceed seven days and not more than a total of 42 days’ sick leavemay be allowed on such certificates.  If the officer is still not fit for duty         after 42days’ sick leave, he shall be examined bya Medical Board.This shall also\n" +
                   "apply to an officer admitted to a private hospital on the instruction of a Government Medical Officer, but it shall not apply when an officer is admitted to a Government hospital unless the period exceeds three months where a Medical Board would have to be held.\n");
           Rules_Section section148 = new Rules_Section("Report to Departments.(ABSENCE FROM DUTY ON ACCOUNT OF ILLNESS)","cat10","10416 – On any of the occasions listed in this Rule, the Medical Officer will report the circumstances to the officer’s Department:\n" +
                   "\n" +
                   "(a)\t When an officer is admitted to and when he is discharged from a Government hospital;\n" +
                   "(b)\tWhen an officer refuses to carry out or in the opinion of the Medical Officer is neglecting to carry out, the Medical advice he has been given;\n" +
                   "(c)\tWhen in the opinion of the Medical Officer, an officer is pretending    to be ill.\n");

           Rules_Section section149 = new Rules_Section("Sick leave rule(ABSENCE FROM DUTY ON ACCOUNT OF ILLNESS)","cat10","     10417 – An officer not being on leave of absence who is absent from duty            on the grounds of ill-health will, provided such absence is covered by proper authority, be regarded as being absent on sick leave.\n" +
                   "\n" +
                   "     10418 – (a) The maximum aggregate sick leave which can be allowed an officer, who is not hospitalized, during any period of twelve months shall be six weeks. Where such officer has been absent from duty on the ground of ill-          health for an aggregate period in excess of six weeks within 12 calendar months,   the officer should be made to appear before a Medical Board with a view to its being ascertained whether he should beinvalided from the service.  Any period of absence on the ground of ill-health in excess of the prescribed aggregateperiod will be without pay and will not be reckoned for purpose of increment or pension, unless the illness results from or is in the course of the performance of his official duties.\n" +
                   "\n" +
                   "     (b) An officer who is incapacitated as a result of injury sustained in the course of his official duties shall be entitled to draw his full salary until he is declared fit to return to duty or permanently invalided.\n" +
                   "\n" +
                   "    10419 – An officer who is recommended by a Medical Board to be permanently invalided will forthwith commence vacation leave prior to leaving the service.\n" +
                   "\n" +
                   "     10420 – Sick leave for a period up to three months in the first instance may be allowed on the certificates of a Government Medical Officer to an officer who           is hospitalized.  If at the end of that   period, the    officer is     still hospitalized, his\n Head of Department must make an arrangement for him to be examined by a Medical Board with a view to its being ascertained whether he should be invalided from the service or allowed further paid sick leave.");
           Rules_Section section150 = new Rules_Section("Responsibility: General(CURTAILMENT OF TOURS OF EXPATRIATE OFFICERS ON GROUNDS OF ILL-HEALTH)","cat10","     10501 – It is the duty of Heads of Departments and Medical Officers to take steps to ensure that no expatriate officer is retained in Nigeria when his state of health renders sit desirable for him to go on leave.  The in no way limits the clear                  dutyof  every individual officer to report to a Medical Officer when he considers that his health is becoming impaired and to carry out any recommendation or instructions made or given to him by a Medical Officer in order to mitigate such impairment.  No expatriate officer will serve a tour of over eighteen months with- out a special medical certificate stating that he is fit to extend his tour.");

        Rules_Section section151 = new Rules_Section("Special leave on health ground before completion of tour.(CURTAILMENT OF TOURS OF EXPATRIATE OFFICERS ON GROUNDS OF ILL-HEALTH)","cat10","10502 – After an expatriate officer has completed twelve months of his tour, a certificate from a Medical Officer giving in full the reasons for his opinion that         the state of officer’s health renders it desirable for him to go on leave, will be sufficient to justify the officer’s head of Department authorizing him to proceed on vacation leave without completing his full tour.");

        Rules_Section section152 = new Rules_Section("Authority for invaliding.(CURTAILMENT OF TOURS OF EXPATRIATE OFFICERS ON GROUNDS OF ILL-HEALTH)","cat10"," 10503 – At any stage of his tour, an expatriate officer may be invalided by the Government on the recommendation of a Medical Board composed normally             of the superintending Medical Officer as Chairman and one or two Medical       Officers as members.");


        Rules_Section section153 = new Rules_Section("Procedure by medcial Board.(CURTAILMENT OF TOURS OF EXPATRIATE OFFICERS ON GROUNDS OF ILL-HEALTH)","cat10","10504 – When a Medical Board recommends that an Expatriate officer should be invalided, the Board will:\n" +
                "\n" +
                "(a)\tforward to the Permanent Secretary, Ministry of health, for the     attention of the Director of Medical Services and Training its                                            records of   proceedings   and recommendations in triplicate       on                              Combined Medical Form No. 26 together with full clinical notes in duplicate;\n" +
                "(b)\timmediately inform the local Head of the officer’s Department of its decision to recommend invaliding and of the passage arrangement             it recommends; and the senior local officer will immediately inform      his Head of Department;\n" +
                "(c)\tcopy the information under (b) to the Medical Officer attending                 to the Officer;\n" +
                "(d)\tat its discretion, the Board will inform the officer concerned.\n");

        Rules_Section section154 = new Rules_Section("Procedure by Head of Department(CURTAILMENT OF TOURS OF EXPATRIATE OFFICERS ON GROUNDS OF ILL-HEALTH)","cat10","10505 – On learning that it has been decided by a Medical Board to recommend the invaliding of one of his expatriate officers, the Head of Department or his local representative will:\n" +
                "\n" +
                "(a)\tOn the advice of the Medical Officer attending the invalid, in collaboration with the Office of Establishments, arrange the      necessary passage and the preparation of leave papers by the by the Office of Establishments, that will instruct the officer as to the   date  and   the    route by which he should travel.  In emergency cases, the request for passages and leave papers should be made by telegram and \n" +
                "confirmed by the appropriate written forms;\n" +
                "\n" +
                "(b)\tForward, in triplicate, to the Medical Officer last in attendance on the invalided officer, Combined Medical Form No. 25 (Confidential Heal Report) with answers to the first three questions thereon duly inserted and signed.\n");

        Rules_Section section155 = new Rules_Section("Procedure by medical officer.(CURTAILMENT OF TOURS OF EXPATRIATE OFFICERS ON GROUNDS OF ILL-HEALTH)","cat10","    10506 – On learning from a Medical Board that it has been decided to recommend the invaliding of an expatriate officer he is attending, a Medical Officer will:\n" +
                "(a)\tProvide the invalided officer’s Department with such advice and assistance as may be necessary in connection with passage arrangements; \n" +
                "(b)\tObtain three signed copies of Combined Medical Form No. 25 from the officer’s Head of Department and forward them to the Ministry of Health after completing the first page on all three copies.\n");

        Rules_Section section156 = new Rules_Section("Procedure by the Ministry of Health(CURTAILMENT OF TOURS OF EXPATRIATE OFFICERS ON GROUNDS OF ILL-HEALTH)","cat10","     10507 – On receiving the proceedings of Medical Board recommending that an expatriate officer be invalided, the Ministry of health shall:\n" +
                "\n" +
                "(a)\tsend one copy of the Board’s proceedings to the Office of Establishments;\n" +
                "(b)\tsend one copy of the Boards proceedings together with the copy of clinical notes to the Embassy/High Commission of the Officer’s Country of origin in Nigeria;\n" +
                "(c)\tfile the triplicate copy of the Board’s proceedings and the duplicate of the clinical notes;\n" +
                "(d)\tobtain from the medical officer last in attendance on the invalided officer, the three completed copies of the first page of the Combine Medial Form No. 25 referred to in Rules 10505 and 10506, file a copy and send the other two to the Office of Establishments for onward transmission as may be necessary;\n" +
                "(e)\tadvise Office of establishments of the appropriate decisions to be taken in cases of permanent invalidity, whether the decision of the Board should be approvedor the officer could be temporarily invalided for further medical treatment and return to duty.\n");
        Rules_Section section157 = new Rules_Section("Further Action(CURTAILMENT OF TOURS OF EXPATRIATE OFFICERS ON GROUNDS OF ILL-HEALTH)","cat10","10508 – Cases of temporary invaliding will be referred to an appropriate Consultant-Physician for further advice as to the Officer’s further usefulness to the State Government.  Cases of permanent invalidity recommended by a Medical Board and supported by the Ministry of Health will be regarded as final and, appropriate invaliding action will be taken by Government.");

        Rules_Section section158 = new Rules_Section("Application and definition(HEALTH RULES FOR EXPATRIATE OFFICERS DURING ABSENCE FROM NIGERIA)","cat10","10601 – In this section, the word “officers” means an expatriate officer pro- ceeding on vacation leave.");

        Rules_Section section159 = new Rules_Section("Effect of rules on salary(HEALTH RULES FOR EXPATRIATE OFFICERS DURING ABSENCE FROM NIGERIA)","cat10","10602 – Unless the rules in this section are complied with, an officer will not be entitled to pay during any extension of his absence from Nigeria which may be necessitated by ill-health \n" +
                "     10603 – Not earlier than seven days before leaving his station to depart from Nigeria, every officer is required to present himself to the appropriate Medical Officer for medical examination.\n");

        Rules_Section section160 = new Rules_Section("Issue of Medical advice form.(HEALTH RULES FOR EXPATRIATE OFFICERS DURING ABSENCE FROM NIGERIA)","cat10","10604 – On presenting himself for examination in accordance with Rule     10603, an officer will receive from the Medical Officer a form of advice (Combined Medical Form No. 24) regarding the care of his health during his absence from Nigeria.");

        Rules_Section section161 = new Rules_Section("Compliance with(HEALTH RULES FOR EXPATRIATE OFFICERS DURING ABSENCE FROM NIGERIA)","cat10","10605 – Every officer is required to comply with the Medical Officer’s advice contained in his Combined Medical Form No. 24 and may be required to show that he is doing so.\n" +
                "\n" +
                "     10606 – An officer may, during his absence from Nigeria, be required by the State Government or its accredited representative to produce his Combined Medical Form 24.  If he is unable to do so, he will either be sent to a Consultant- Physician and required to pay the latter’s fee or be directed to furnish a medical certificate at his own expense.  No refund of any of these costs will be entertained, unless the officer can officer an acceptable explanation for his inability to produce his Combined Medical Form No. 24.\n");

        Rules_Section section162 = new Rules_Section("Reporting illness during absence(HEALTH RULES FOR EXPATRIATE OFFICERS DURING ABSENCE FROM NIGERIA)","cat10","10607 – If an officer falls ill and so requires medical attention during his absence from Nigeria, and remains ill for a week, he must report the fact to the nearest Nigerian Mission abroad or, where applicable, to such other office as may be specified for this purpose in his leave papers; and he should at the same time, forward a certificate from his medical attendant stating the nature of the illness and its probable duration.  In return, he will receive instruction as to any further action he could take.");

        Rules_Section section163 = new Rules_Section("Medical examination during absence.(HEALTH RULES FOR EXPATRIATE OFFICERS DURING ABSENCE FROM NIGERIA)","cat10","10608 – if the Medical Officer who examines an officer before the latter’s departure from Nigeria recommends that he should be examined by a Physician during his absence from Nigeria, this information should be transmitted to the Nigerian Mission in the country which will advise him accordingly.  Similarly, an officer may, after reporting to the Nigerian Mission in accordance with Rule 10607, receive instructions to present himself for examination by a Physician.  Every officer is required to comply with such instructions and to carry out such advice as he may be given by the Physician.");

        Rules_Section section164 = new Rules_Section("Duty of Officers to consult  dentist(HEALTH RULES FOR EXPATRIATE OFFICERS DURING ABSENCE FROM NIGERIA)","cat10","10609 – Every officer may consult a Dental Surgeon and secure all neces-     sary dental treatment.  In cases where dental treatment required after an expatriate officer’s return to duty is held to be directly attributable to neglect of this rule, Government reserves the right to refuse the grant of leave with pay and transport facilities for obtaining such treatment, and the refund under Rule 10304, of any expenses incurred in obtaining it.");

        Rules_Section section165 = new Rules_Section("Application(INJURIES)","cat10"," 10701 – This section does not apply to any person who is a workman to whom the provisions of the Workman’s Compensation Act apply.");

        Rules_Section section166 = new Rules_Section("Action by injured Officer.(INJURIES)","cat10","     10702 – When an officer sustains an injury as a result of an accident en-  countered in the course of performing his duty, he must immediately inform the nearest Medical Officer unless he is unable, by reason of his injury to do so.");

        Rules_Section section167 = new Rules_Section("Action by Medical Officer.(INJURIES)","cat10","10703 – When a Medical Officer receives information of injury to an officer whether the information is received from the injured person or from any other source, he shall as soon as possible report details of the injury to the appropriate Department or the latter’s local representative.");

        Rules_Section section168 = new Rules_Section("Action by Head of Department.(INJURIES)","cat10","     10704 – When the Head of Department or his local representative is in- formed by a Medical Officer or any other person, of an injury sustained by an officer as a result of an accident in the course of his duty, which might lead to a claim for a special award under the Pensions Act or otherwise, he shall call for a report by a medical Officer, if no such report has already been received.  On receipt of the Medical Report, the local Representative of the Department shall enquire into the circumstances of the accident and if satisfied that the injury was not incurred in the actual discharge of duty, he shall so report to the Office of Establishments sending a copy of his report to the Head of the injured person’s Department.  If, however, after his enquiry the local Representative has any doubt on these points, he shall as soon as possible, convene a Board to consider the matter and report its findings on the following questions:\n" +
                "(a)\tdid the accident occur in the discharge of duty?\n" +
                "(b)\twas the accident due to any fault of the injured person?\n" +
                "(c)\twas the accident specifically attributable to the nature of the duty being discharged?\n" +
                "The Board’s Report shall be forwarded by the local Representative together with his report thereon to the Civil Service Commission through the Head of Depart-ment concerned.  In the case of fatal injury, the local representative shall convene a Board in the same way unless the information provided by the Coroner’s inquest is clearly sufficient for the purpose of deciding whether a special award should be made.\n");
        Rules_Section section169 = new Rules_Section("Repatriation of the corpse of an officer who died abroad(DEATHS: REPATRIATION OF CORPSES)","cat10","     10801 - (a) The Government shall repatriate, at the request of the deceased’s family, the corpse of an officer who died abroad while on official duty, tour or course of instruction, or the corpse of the wife of the officer who was duly authorized to accompany him on the duty tour or course of instruction. Govern- ment’s responsibility shall be limited to the following:\n" +
                "                     (i)      preservation of the body (embalmment);\n" +
                "                     (ii)    purchase of a decent and reasonably-priced Coffin or Casket \n" +
                "(including inner zinc as stipulated by Airline Regulations);\n" +
                "                     (iii)    transportation of the corpse to the officer’s home town; and (iv)  bearing the cost of the publication of the deceased’s obituary\n" +
                "                             (in consultation with the deceased’s family if need be).\n\n");

        Rules_Section section170 = new Rules_Section("Transportation of Corpse of an Officer who died locally.(DEATHS: REPATRIATION OF CORPSES)","cat10","10802 – Where an officer died in Nigeria while in the service of the Govern- ment, Government’s responsibility shall be limited to those provided in CSR 10801 (a) (i) – (iv) above");

        Rules_Section section171 = new Rules_Section("Application","cat11","11001 – This Chapter applies to expatriate officers only.");

        Rules_Section section172 = new Rules_Section("Privilege of bringing wife and children to Nigeria\n","cat11","11002 – Every officer, irrespective of grade has the privilege of bringing his wife and children to Nigeria.When an officer intends to exercise this privilege, he should inform his Head of Department of the date on which his wife and children are expected to arrive.");

        Rules_Section section173 = new Rules_Section("Condition of bringing wife or children to Nigeria","cat11","11003 – It shall be a condition on which an Officer exercises the privilege described in Rule 11002 that he shall not be entitled to any preferential treatment in the matter of posting, housing and allocation of duties by virtue of the fact that his wife and children are with him.\n" +
                "\n" +
                "11004 – The passage privileges for which an officer is eligible in respect of his wife and children are specified in Section 2 of Chapter 16.  The booking arrangements for free passage are explained in Rules 16201 and 16203.\n");

        Rules_Section section174 = new Rules_Section("Provision of camp equipment(EQUIPMENT)","cat12","12101 – Where necessary, officers are required to provide themselves with necessary camp equipment.  Heads of Departments should when advertising to fill vacancies in senior posts, indicate whether or not it will be necessary for the officers appointed to provide themselves with camp equipment.");

        Rules_Section section175 = new Rules_Section("Compensation form public fund.(COMPENSATION FOR LOSS OF PRIVATE PROPERTY)","cat12","     12201 – (a) Officers will not, in general, be entitled to compensation from public funds for loss of property in circumstances arising out of their service, and their attention is drawn to the possibility of insuring their property against many types of loss or damage.  Cases of loss arising through special circumstances will be considered on their own merit, but even if compensation is approved ex-gratia by the government, it will as a rule, be given in respect of articles actually or conventionally necessary at the place of the loss when it occurred, and the amount of the grant will cover the current values of such articles. Claims for compensation may be withheld altogether if the loss or damage was due to negligence for which the officer was responsible or which could reasonably have been covered by insurance.  Where an officer on duty eventually found himself in an extra-ordinary situation such as burning of properties while on duty (which can be certified on honour by the Police and the Fire Authorities), the officer shall be compensated as follows:\n" +
                "\n" +
                "(i)\ttotal destruction of property to attract 100% of the officer’s annual\n" +
                " salary;\n" +
                "             (ii)   partial destruction of property to attract not less than 31/2% of the\n" +
                "                     officer’s annual salary.\n" +
                "\n" +
                "     The claims above must be certified by the Director of Fire Services and the Police.  Every effort should be made to resettle the officer through an alternative accommodation or grant him special advance of not less than six (6)months salary repayable over a period not less than twenty-four months.  In case of any fraudulent practices or collusion by the officer and the certifying officer, a serious disciplinary action should be brought against them under the relevant rules, on\n" +
                "gross misconduct.\n" +
                "\n" +
                "     (b) If it is necessary to insure Government furniture as well as personal effects of an officer occupying government rented building, it will be necessary for such officer to pay into revenue his share of the insurance premium paid on his behalf during the period of his occupation of such building that he may have his share of claims from the Insurance Company in the event of any loss or damage to his property in such building.\n");

        Rules_Section section176 = new Rules_Section("Loss encountered during Civil Disturbances.(COMPENSATION FOR LOSS OF PRIVATE PROPERTY)","cat12","12202 – (a) If the motor vehicle of an officer, whilst being used for official duties, is damaged as a result of Civil disturbance, government shall accept responsibility for such damage.  For purpose of this rule “official duties” shall be deemed to include journeys between house and office.\n" +
                "\n" +
                "           (b) If an officer’s private vehicle while being used for official duties is damaged beyond repairs as a result of accident the government shall accept responsibility to the extent of the difference between the indemnity covered by the insurance and the outstanding loan.\n");

        Rules_Section section177 = new Rules_Section("Automatic Insurance at Government expense.(PASSENGER INSURANCE)","cat12","     12301 – The following persons when travelling by air, land or sea at govern- ment expense will be eligible for free automatic insurance cover as follows:\n" +
                "\n" +
                "TravellerCapital Benefit\n" +
                "Officer .    .     .     .   N600,000\n" +
                "             Spouse of Officer .N500,000\n" +
                "             Child of Officer    .N400,000\n" +
                "             Non-Official .       .   N400,000\n" +
                "              NYSC    .      .      .   N400,000\n");

        Rules_Section section178 = new Rules_Section("Responsibility for Insurance.(PASSENGER INSURANCE)","cat12","     12302 – An air passenger flying to and from any destination inside or outside Nigeria flying by the normal route, on the authority of a Government Warrant, free insurance cover for the capital benefits, prescribed in the Rule 12301, will be automatic and will not require the completion of any facilities by the air passenger.  If the air passenger wishes to arrange excess of the capital benefits provided by Government, he must do so privately at his own expense.");

        Rules_Section section179 = new Rules_Section("Stop-over facilities(PASSENGER INSURANCE)","cat12"," 12303 – The free cover referred to in Rule 12302 above is provided for the period of flight time including stop-over.");

        Rules_Section section180 = new Rules_Section("Marine Insurance on motor vehicle.(PASSENGER INSURANCE)","cat12","12304 – An officer who is obliged for a purpose connected with his duties, to transport his motor vehicle by sea between Nigerian ports is eligible to be refunded the cost of insuring the vehicle against marine risks during the journeys.");

        Rules_Section section181 = new Rules_Section("Application(PACKING OF PERSONAL EFFECTS)","cat12","    12401 – The following four Rules apply to expatriate officers who retire or are invalided or Nigerian officers transferred to duties outside Nigeria and who have not been able to make their own arrangements for the forwarding of their personal effects.");

        Rules_Section section182 = new Rules_Section("Shipment of baggage left behind.(PACKING OF PERSONAL EFFECTS)","cat12","12402 – If an officer applies to his Head of Department and provides him with the information, etc., specified in this Rule, Government will, subject to the conditions specified in Rule 12403, pack and mark for shipment the baggage he has left in Nigeria and arrange for its shipment by the Government Coastal Agent who will be authorised to issue whatever ocean freight warrant the officer may be eligible for in respect of the baggage in question. The following information is required:\n" +
                "(a)\tthe full address to be marked on the baggage, officer’s contact address to which correspondence regarding the baggage should        be forwarded;\n" +
                "(b)\tthe name and address of his authorised clearing agent at the port    of entry of such baggage to whom relevant documents and keys should be sent should the officer not desire to effect his own clearance;\n" +
                "(c)\tdetails of the baggage to be prepared for shipment.  These details should be as full as possible, they must make specific mention of any fire-arms, ammunition and other dangerous items included in the baggage and should if possible, be accompanied by packing       list showing the contents of each package and their appropriate           value;\n" +
                "(d)\tthe keys of any locked packages which the officer wishes repacked before shipment;\n" +
                "(e)\tthe whereabouts of the baggage;\n" +
                "(f)\tthe statement of the part of the journey for which he wishes the baggage to be insured and the value he wishes insured; and\n" +
                "(g)\tany deposits require by the Government Coastal Agent (see Rule 12405).\n" +
                "     12403 – It shall be conditions on which an officer avails himself of these\n" +
                " facilities that he accepts responsibility for:\n" +
                "              (a)  paying for any transport within and outside Nigeria in excess of the\n" +
                "transport provided free under the Civil Service Rules:\n" +
                "              (b) paying the cost of any labour and materials used, at the discretion of\n" +
                "government, in packing or re-packing the baggage ready for\n" +
                "shipment;\n" +
                "               (c) arranging for and paying the cost of any insurance he desires;\n" +
                "               (d) paying the cost of any other necessary charges incurred by\n" +
                " Government;\n" +
                "               (e) any loss or damage to the baggage during packing, storage and transit;\t       and\n" +
                "                (f) obtaining and forwarding to his Head of Department any necessary\n" +
                "export permit.\n");

        Rules_Section section183 = new Rules_Section("Responsibility of the Officer(PACKING OF PERSONAL EFFECTS)","cat12","     12404 – To minimize the risk of loss or damage and to facilitate the handling of baggage, officers are advised, in their own interest, to list all their personal effects, baggage by baggage, prior to proceeding on leave and to pack them in such a way that they could be shipped as they stand.");

        Rules_Section section184 = new Rules_Section("Procedure by Head of Department(PACKING OF PERSONAL EFFECTS)","cat12","12405 – On receiving an officer’s application to have his baggage prepared \n" +
                "for shipment, the Head of Department shall:\n" +
                "\n" +
                "   (a)      complete the necessary “Application for shipment of unaccom- \n" +
                "panied Baggage” Form Gen. 52 and forward it to the Government \n" +
                "              Coastal Agent;\n" +
                "\n" +
                "(b)ensure that baggage is marked in large letters with the name of the\n" +
                "                     officer and consigned to the Government Coastal Agent at the\n" +
                "                     Lagos Terminus (Iddo) if sent by rail.  The number of the Waybill\n" +
                "                    and date of dispatch should be telegraphed to “COASTAL AGENT,\n" +
                "                    at Apapa” and the Waybill forwarded to the Coastal Agent at Apapa by \t      the quickest means. If baggage is sent by road it should be delivered to    \t      the Baggage Officer of the Government Coastal Agency at Apapa.\n" +
                "\n" +
                "(c)\tobtain and forward to the Coastal Agent a statement showing the\n" +
                "number and type of package.  Insurance will be arranged by the Coastal\n" +
                "Agent, if desired by the officer, in which case he should state the value\n" +
                " for which cover is required;\n" +
                "\n" +
                "(d)\tforward to the Government Coastal Agent by registered post keys for opening of cases if required by Customs;\n" +
                "\n" +
                "(e)\tobtain from the officer concerned, the name and address of a clearing agent nominated by him which should be communicated to the Government Coastal Agent for the onward dispatch of shipping documents and keys. If so requested, the Government Coastal Agent is required to appoint such an agent at the port of destination;\n" +
                "\n" +
                "(f)\tadvise the Coastal Agent the extent to which the personal effects of retired officers and their transport are covered by Government Warrant.  The balance of freight will be recoverable from the officer before the loads are shipped;\n" +
                "\n" +
                "(g)\tany officer having baggage in excess of his normal entitlement should contact the Government Coastal Agent on the appropriate deposit to make;\n" +
                "\n" +
                "(h)\tas the Government Coastal Agent is to be contacted at the Lagos Port Complex (Apapa), so also could officers outside Lagos wishing to send their baggage, contact the officer-in-charge Government Coastal Agency at Port-Harcourt, Calabar, Warri and Sapele or any other Port.\n");


        Rules_Section section185 = new Rules_Section("Routing of  petitions.(General)","cat13","     13101 – Every officer who has any representations of a public or private nature to make to the Government should address them to:\n" +
                "\n" +
                "(a)\tThe Permanent Secretary, Civil Service Commission, in respect of matters relating to appointments (including acting appointments), promotion, transfer and discipline; or\n" +
                "(b)\tThe Permanent Secretary, Office of Establishments on matters relating to other conditions of service, e.g. leave, passages, allowances, pensions, gratuities; or \n" +
                "(c)\tany other recognized channel of communication, which shall however, be routed through the Head Department of the petitioner.\n");
        Rules_Section section186 = new Rules_Section("Definition(General)","cat13","13102 – An officer in the State Civil Service, may address the Head of Government, in which case he must transmit such communication, unsealed and in triplicate to any of the channels mentioned in the preceding Rule requesting that the petition be forwarded in due course to the Head of Government.  Every letter, petition or other document which may be received by the Head of Government other than through the proper channel will be returned to the writer.");

        Rules_Section section187 = new Rules_Section("Definition(PETITION RULE)","cat13","13201 - For the purpose of this section, a “petition” is a formal appeal to ultimate authority, that is, to the Head of Government for special consideration of a matter affecting an officer personally.  It must be distinguished from a letter of representation addressed to an appropriate senior officer of Government in the normal way.");

        Rules_Section section188 = new Rules_Section("Application(PETITION RULE)","cat13","13202 - Petitions by an officer (or by an ex-officer on matter relating to his conditions of employment as an officer or his condition as a pensioner of Government) must be submitted in accordance with the rules set out in this sections.");

        Rules_Section section189 = new Rules_Section("Outside influence.(PETITION RULE)","cat13","  13203 - An officer must not attempt to bring political or other outside            influence to support his individual claims as a Civil Servant.  If he is dissatisfied, his proper cause is to make representations to his immediate superior officer or Head of Department.  If his representations are not successful, it is open to him to submit a formal petition to the appropriate authority under Rule 13101.");

        Rules_Section section190 = new Rules_Section("Routing of petitions.(PETITION RULE)","cat13","13204 – A petition must be submitted through the proper departmental channels, namely through petitioner’simmediate superior officer and the Head of Department will forward the petition with his comments and recommenda-        tions   to   the   Chairman,  State   Civil Service Commission, in accordance with Administrative instructions in force at the time.  It is in the petitioner’s interest that the abovementioned rule concerning the routing of petitions should be strictly observed in order that petitions will be duly verified and reported on before it reaches the final destination.");

        Rules_Section section191 = new Rules_Section("Signature and submission of petitions.(PETITION RULE)","cat13","13205 – A petition addressed to any of the channels mentioned in the preceding Rule must be signed and submitted in duplicate.  An advance copy may be sent direct to the appropriate authority. In either case, one copy will be retained by the Head of Department.");

        Rules_Section section192 = new Rules_Section("Petitions on behalf of an illiterate (PETITION RULE)","cat13","     13206 - A petition must bear the signature or independently attested mark, and the address of the petitioner. When written by a person other than the petitioner, the signature and address of the writer must be included. ");

        Rules_Section section193 = new Rules_Section("Disqualifications(PETITION RULE) ","cat13","13208 – A petition which:\n" +
                "(i)\tdoes not comply with Rule 13206;\n" +
                "(ii)  deals with a case in which legal remedies are still open;\n" +
                "(iii) is illegible or meaningless;\n" +
                "(iv) is anonymous;\n" +
                "(v) merely repeats the substance of a previous petition without,\n" +
                "      introducing new relevant matter;\n" +
                "(vi) is worded in abusive, uncivil or indecent language, WILL NOT\n" +
                "       BE ENTERTAINED.\n");
        Rules_Section section194 = new Rules_Section("Conclusion of petition.(PETITION RULE)","cat13","     13209 – A petition should conclude by stating clearly the nature of the redress sought.  A petition which exceeds two pages of foolscap in length, must also include a summary of the reason adduced in support to the redress sought");

        Rules_Section section195 = new Rules_Section("Delay to be explained.(PETITION RULE)","cat13","13210 – when a petition is submitted more than six months after the decision complained of has been given, the petitioner should explain the reason for the delay.  Failure to give an adequate explanation will materially weaken the petitioner’s case.");


        Rules_Section section196 = new Rules_Section("Certain postings necessitate occupation of specific quarter.Otherwise no compulsion(GENERAL)","cat14","14101 – If an officer’s duties necessitate his being available at any hour of the day or night, he may be required to live in specified Government quarters in the vicinity of his place of work.\n" +
                "\n" +
                "14102 – Except as provided in the preceding Rule, no officer shall be com- pelled to occupy Government quarters if he prefers to make other arrangements for his accommodation.\n");

        Rules_Section section197 = new Rules_Section("Payment of rent(General)","cat14","14103 – it shall be a condition on which an officer is provided with Govern- ment quarters that he pays rent by deduction from salary in accordance with the rent rules specified in Rule 14206.");

        Rules_Section section198 = new Rules_Section("Sub-letting prohibited.(General)","cat14","14104 – It shall be a condition on which an officer is provided with Government quarters that he does not sublet any part thereof or use the quarters to take in a lodger or paying guest.  An officer who fails to comply with this Rule is guilty of gross misconduct. ");

        Rules_Section section199 = new Rules_Section("Care of Quarters.(General)","cat14","14105 – An officer provided with Government quarters is responsible for maintaining in good order, all articles of Government furniture included therein, and for the cleanliness of the quarters including the compound and domestic servants’ quarters, which he must inspect from time to time.");

        Rules_Section section200 = new Rules_Section("Alterations to structure and fixture prohibited.(General)  ","cat14","14106 – An officer provided with Government quarters is prohibited from altering the structure or fixtures.  If any alteration is desired, application must be made to the appropriate Ministry responsible for the quarters, which will arrange for the alteration if approved.  The officer to whom the quarters have been allocated will be held responsible for any contravention of this rule.");

        Rules_Section section201 = new Rules_Section("Removal of furniture prohibited.(General)","cat14","14107 – Government furniture in Government quarters belongs to the quarters to which it has been issued and no articles of furniture may be inter-changed between quarters (or between quarters and offices) without the prior sanction of the officer controlling the quarters.");

        Rules_Section section202 = new Rules_Section("Notice of vacation(General) ","cat14","14108 – An officer provided with government quarters must give at least forty-eight hours’ notice to the officer controlling the quarters of his intention to vacate the premises.");

        Rules_Section section203 = new Rules_Section("Taking over and handing over(General)","cat14","     14109 – Government quarters must be taken over from and handed over to the authorised representative of the office controlling the quarters.  An incoming occupant must acknowledge receipt of the quarters and all articles of Govern- ment furniture therein by signing the furniture inventory and key register; an outgoing occupant must hand over the keys of the quarters he is vacating to the authorised representative of the Ministry controlling the quarters and remains responsible for the quarters and all articles of Government furniture therein until he obtains the signature of such authorised representative to the furniture in- ventory and key register in acknowledgement of their surrender.");

        Rules_Section section204 = new Rules_Section("Responsibility for deficiencies and damage.(General)","cat14","     14110 – Unless an officer, at the time he takes over Government quarters, indemnifies himself by reporting any deficiency or damage to the officer control- ling the quarters, it will be assumed that he received the quarters and all articles of furniture belonging thereto in good condition, and he will be liable for the cost of making good any deficiency, damage or neglect discovered at the time he hands over the quarters.");

        Rules_Section section205 = new Rules_Section("Responsibility for payment of electricity and water charges.(General)","cat14","14111 –   Unless exempted by special conditions of service an officer pro-    vided with Government quarters, is required to pay all electricity and water charges raised there-on in respect of the period during which he retains the use there-of.  Accounts for these charges must be settled promptly.");

        Rules_Section section206 = new Rules_Section("Responsibility for notifying Electricity and Water Authority(General) ","cat14","     14112 – On taking over Government quarters, an officer must immediately notify the fact to the authority (or authorities) locally responsible for making electricity and water charges.  At least forty-eight hours before surrendering the quarters, he must notify the same authority (or authorities) of his intention to surrender them, otherwise he will be responsible for any charges accruing up to such time as the meters are read.  An officer about to occupy quarters from which water and electricity supply has been disconnected, should give at least 24 hours notice of his wish that they be reconnected.");

        Rules_Section section207 = new Rules_Section("Vacation of Quarters on resignation, transfer or retirement.(General)","cat14","14113 – (a) No officer shall continue to occupy Government quarters after the date of which his resignation takes effect, or beyond 3 months from the date on which he starts his pre-retirement leave or from the date he finally leaves the service for any other cause.\n" +
                "\n" +
                "(b)\tAn officer may not continue to occupy quarters in one station beyond the date when he takes up occupation of quarters in another station, except with permission in writing by his Head of Department.  In the event of the officer’s death, his spouse shall not continue to occupy the quarters beyond six monthsafter his death except with the permission of the Head of Department in writing.\n" +
                "(c)\tIf occupation of quarters continues beyond the period specified in this Rule, the occupants shall be ejected. \n");
        Rules_Section section208 = new Rules_Section("Definition.(OFFICERS HOLDING SENIOR POSTS)","cat14","14201 – In this section the term “officer” means an officer holding a senior post.");

        Rules_Section section209 = new Rules_Section("Retention of Government quarters during leave normally prohibited to expatriate officers.(OFFICERS HOLDING SENIOR POSTS)","cat14","14202 – An expatriate officer is only eligible to retain the use of Government quarters during vacation leave, if he is expected to resume duty at the same station.");

        Rules_Section section210 = new Rules_Section("Rent not payable in certain cases.(OFFICERS HOLDING SENIOR POSTS)","cat14","     14203 – No rent is payable by an officer if the sole accommodation with which he is provided by Government is:\n" +
                "(a)\tquarters in a vessel;\n" +
                "(b)\ta railway coach or compartment; \n" +
                "(c)\ta tent;\n" +
                "(d)\ta temporary shelter or building not intended for permanent occupation such as a “bush” house or hut erected in connection with a special and temporary duty;\n" +
                "(e)\ta canoe; and\n" +
                "(f)\ta caravan.\n");

        Rules_Section section211 = new Rules_Section("Sharing of Quarters.(OFFICERS HOLDING SENIOR POSTS)","cat14","14204 – An officer staying with another officer in Government quarters in his own station shall be deemed to be provided with Government quarters but without prejudice to his entitlement to separate quarters when available.");

        Rules_Section section212 = new Rules_Section("Quarters in Government Guest House.(OFFICERS HOLDING SENIOR POSTS)","cat14","14205 – Except for the first three days and the last three days of each period of posting to a station and officer who occupies a Government Guest House in his own station shall deemed to be provided with Government quarters until such a time as other quarters are available.");

        Rules_Section section213 = new Rules_Section("Rates of rents.(OFFICERS HOLDING SENIOR POSTS)","cat14"," 14206 – Officers provided with furnished Government quarter other than those specified in Rule 14204 are required to pay rent at the rate that shall be determined by the appropriate authority from time to time.");

        Rules_Section section214 = new Rules_Section("Full rent to be deducted from salary in the first instance.(OFFICERS HOLDING SENIOR POSTS)","cat14","14207 – Except  in respect of periods when by virtue of Rule 14203, no rent is payable (in which case the circumstance must be explained and certified by or on behalf of the officer’s Head of Department in the remarks column of the officer’s monthly salaryvoucher, and no rent deduction will be made therefrom) full rent shall, in the first instance be deducted from the total of an officer’s monthly salary, from the date he first occupied Government quarters to the date immediately preceding that on which he officially hands over his quarters both dates inclusive.  The responsibility for claiming any rebate allowance under the following three rules of the rent so deducted will then rest with the officer himself.  \n" +
                "Rebate claims duly supported with the appropriate certificates should be made on monthly basis.\n");

        Rules_Section section215 = new Rules_Section("Rent rebate of 50 per cent(OFFICERS HOLDING SENIOR POSTS)","cat14","\n" +
                "     14208 – An officer shall be entitled to a rebate of 50 per cent of the rent paid under Rule 14206 in respect of any period during which the sole accommodation with which he is provided by the Government consists of: \n" +
                "(a)\tquarters shared with another officer, or with other officers with the prior permission of the officer responsible for allocating quarters in the station in which they are situated;\n" +
                "(b)\tquarters whether temporary, semi-permanent or permanent, which do not provide at least two living rooms for the exclusive use of the officer (for this purpose a bedroom is classed as a living room) or \n" +
                "(c)\tunfurnished quarters, whether temporary, semi-permanent or permanent; or\n (d)\ttemporary quarters with or without furniture.");

        Rules_Section section216 = new Rules_Section("Rent rebate of 75 per cent.(OFFICERS HOLDING SENIOR POSTS)","cat14","14209 – (a) An officer shall be entitled to a rebate of 75 percent of the rent paid under Rule 14206 in respect of any period during which the sole accommodation with which he is provided by Government consists of quarters of a type specified in Rule 14208 (b) (c) or (d) shared with another officer.\n" +
                "\n" +
                "     (b) Claims for rent rebates under this Rule and Rule 14208 can only be made after they have been vetted by the State Ministry of Works and Housing.\n");
        Rules_Section section217 = new Rules_Section("100% Rent Refund(OFFICERS HOLDING SENIOR POSTS)","cat14",".      14210 – An officer is entitled to 100% refund of rent for any period during which he is not occupying Government quarters.  An officer is regarded as occupying Government quarters until he has officially handed over his quarters.");

        Rules_Section section218 = new Rules_Section("Entitlement to Government quarters(OFFICERS HOLDING SENIOR POSTS) ","cat14","     14211 – (a) All officers are entitled to Government quarters.  However, preference shall be given to an officer appointed to duties which require him to be on call duty night and day.\n" +
                "             (b) An officer shall be entitled to a rent supplement inlieu of Government accommodation at the rate stated in Government Circular from time to time.\n" +
                "             (c) Where husband and wife are not in occupation of Government quarters, they shall be entitled to rent supplement.  However, where one of the spouses is in occupation of Government quarters, the other spouse shall have entitled to rent supplement.\n" +
                "            (d)   Where husband and wife work and live in separate and distant towns due to exigency of the service and both are entitled to Government quarters, each of them shall be allowed to live in quarters, if available.\n" +
                "\n" +
                "          (e)   Where husband and wife live in the same town but are legally separated by order of a Court of Law, the woman officer shall, in her own right, be eligible for the allocation of Government quarters, if available.\n");

        Rules_Section section219 = new Rules_Section("When quarters cannot be allocated, a refund of hotel expenses may be granted. (OFFICERS HOLDING SENIOR POSTS)","cat14","14212 – When an officer, who would normally be allocated quarters is re-        quired to stay in an hotel or catering guest house until quarters can be found for him, he may be granted a refund of the bill for the board and lodging only of himself, a wife and six children subject to a maximum of 50% of the officer’s monthly salary.  Nigerian officers shall be allowed to stay in hotel at Government expense for a period not exceeding 90 days.");

        Rules_Section section220 = new Rules_Section("Refund of hotel expenses on arrival from or departure on vacation leave(OFFICERS HOLDING SENIOR POSTS)","cat14","14213 -  If an officer stays in an hotel or government guest house in his station during the first three nights on assuming or resuming duty from vacation leave or the last three nights prior to departure on vacation leave, he may be granted a refund of the hotel bills for the board and lodging only for himself, wife and children (if accompanying him at Government expense) subject to a maximum of 50% of the officer’s salary for the number of days.");

        Rules_Section section221 = new Rules_Section("Allowance in lieu of hotel accommodation.(OFFICERS HOLDING SENIOR POSTS)","cat14","14214 – Owing to inadequacy of Government quarters, a Nigerian officer newly recruited from abroad will be eligible for the payment of an allowance at the prevailing rate applicable to his grade in lieu of hotel accommodation.  Any officer who already enjoyed hotel accommodation at government expense shall not qualify for this allowance.");


        Rules_Section section222 = new Rules_Section("Applicable(OFFICERS HOLDING JUNIOR POSTS) ","cat14","14301 – In this section the term “officer” does not include an officer holding a senior post.");

        Rules_Section section223 = new Rules_Section("Retention of Government quarters during vacation leave.(OFFICERS HOLDING JUNIOR POSTS) ","cat14","14302 – A junior officer is entitled to retain the use of Government quarters during his vacation leave unless he is expected to resume duty at a different station and the officer is then expected to vacate his quarters within one month of startinghis leave.");

        Rules_Section section224 = new Rules_Section("Privilege for compulsory occupation.(OFFICERS HOLDING JUNIOR POSTS)   ","cat14","14303 – No rent is payable by an officer, who, by virtue of Rule 14101 is required to occupy specific Government quarters.");

        Rules_Section section225 = new Rules_Section("Period when rent is  payable(OFFICERS HOLDING JUNIOR POSTS)","cat14","     14304 – Except as provided in the preceding Rules, rent at the appropriate rate specified in the followingRule is payable from the date on which an officer takes over Government quarters to the date immediately preceding that on which he officially hands over his quarters to the authorised representative of the officer controlling the quarters – both dates inclusive.\n" +
                "\n" +
                "     14305 – An officer provided with quarters by the Government for which rent is payable shall pay the rent as may be determined by the appropriate authority from time to time.\n");

        Rules_Section section226 = new Rules_Section("Definitions(DEFINITIONS AND GENERAL)","cat15","Definitions\t     15101 – In this Chapter the following terms are used with the following meanings:\n" +
                "Authorised Leave: “Authorised Leave” is the vacation leave actually granted on any particular occasion, together with any authorised extension thereof.\n" +
                "\n" +
                "     Declared destination: “Declared Destination” of an officer and his wife, when granted passage privileges, is the place, within the country in respect of which the passage privileges are granted which is declared by the officer to be the place to which he will proceed on his disembarkation in that country.\n" +
                "\n" +
                "     Deferred Leave: “Deferred Leave” is vacation leave which an officer is permitted to carry forward to an occasion subsequent to that immediately following the year or tour in respect of which it was due.\n" +
                "\n" +
                "     Earned Leave: “Earned Leave” is the vacation leave due in respect of the period of duty immediately preceding the occasion on which it is enjoyed.\n" +
                "\n" +
                "End of Tour – (a) The tour of an officer granted Nigerian leave ends on the day he relinquishes duty to proceed on leave.\n" +
                "\n" +
                "     (b) The tour of an expatriate officer ends on the day immediately preceding that on which the ocean-going vessel or airliner by which he travels from Nigeria departs from the port or airport at which he joins it, or if he travels overland on the day immediately preceding that on which he leaves his approved point of departure.\n" +
                "Leave: unless otherwise stated in a particular context, means leave with full salary.\n" +
                "\n" +
                "Leave-Earning Service: “Leave-Earning Service” in a tour and any other period of duty which the Government may approve to leave earning service.\n" +
                "Local Leave: “Local Leave” is vacation leave with leave transport grant limited to journeys to and from a place within Nigeria.\n" +
                "Overseas Leave: “Overseas Leave” is vacation leave enjoyed overseas with passage privileges.\n" +
                "Tour: “Tour” is the period of service between the date of assumption or \n" +
                "resumption of duty and the end of tour as defined above, both dates inclusive.\n" +
                "Vacation Leave: “Vacation Leave” is leave with full salary following a tour at the rate quoted in Rule 15204.\n" +
                "Leave Year: “Leave Year” is the period between 1st January and the 31st December, of the same year\n\n");

        Rules_Section section227 = new Rules_Section("Annual vacation leave is compulsory(DEFINITIONS AND GENERAL)","cat15","     15102 – (a) Annual vacation leave is compulsory.  No officer shall be required or allowed to take working leave, whereby the officer reports for duty during his approved leave period.  All officers must therefore take and exhaust their vacation leave within the calendar year in which such leave is due.  Where it is not possible for the officer to exhaust his leave within that year, provided that he commences his leave before the 31st December of that year, he shall be allowed to exhaust his leave entitlement before the 1st February of the following calendar year.\n" +
                "\n" +
                "     (b) Any vacation leave not exhausted in accordance with Rule 15102 (a) above shall be deemed forfeited.\n" +
                "     (c) Any leave granted but not exhausted before 1976 or any deferred leave which stands to an officer’s credit at that date is frozen till the officer is due to retire, when he will take the frozen leave provided he leaves the service in pensionable circumstances subject to the provision of Rule 15114.\n");
        Rules_Section section228 = new Rules_Section("Effect of Dismissal on Vacation Leave(DEFINITIONS AND GENERAL)","cat15","15103 – An officer who is dismissed shall not be granted vacation leave.");

        Rules_Section section229 = new Rules_Section("Leave Roster (DEFINITIONS AND GENERAL)","cat15","15104 – In order to maintain adequate level of manpower and to ensure that all officers are granted the amount of leave for which they will be eligible during the leave year at the time most convenient to the service, Headsof Departments are required to prepare and maintain leave rosters in respect of annual vacation leave for all officers in their Departments.");

        Rules_Section section230 = new Rules_Section("Leave of Heads Departments(DEFINITIONS AND GENERAL)","cat15","15105 – Heads of Departments shall notify the Head of Service and obtain his approval of the date on which they propose to go on leave.");

        Rules_Section section231 = new Rules_Section("Notification of leave without pay.(DEFINITIONS AND GENERAL)","cat15","     15106 – When an officer is granted leave without pay, his Head of Depart-     ment will report the act to the Auditor-General and the Accountant-General of the State, where appropriate, quoting the name, rank and station of the officer and full details of the officer and the leave granted.");

        Rules_Section section232 = new Rules_Section("Leave for temporary staff.(DEFINITIONS AND GENERAL)","cat15","15107 – Temporary staff (excluding month-to-month employee) may be granted vacation leave, leave to visit a dentist, leave to take examination, casual leave, and leave to take part in sporting contest, and sick leave within the relevant Rules.");

        Rules_Section section233 = new Rules_Section("Extension of leave counts against deferred leave.(DEFINITIONS AND GENERAL)","cat15","15108 – Any extension of leave granted under the following Rules shall be deducted from any vacation, annual or deferred leave due to the officer at the time the extension is granted.");

        Rules_Section section234 = new Rules_Section("Special leave for course of study.(DEFINITIONS AND GENERAL)","cat15"," 15109 – An officer may be granted special leave with or without pay by the Government for the purpose of undertaking a course of study which is considered likely to materially enhance his value to Government.  Such leave shall be subject to such conditions as may be specified at the time it is granted.  Leave granted under this Rule shall be treated, for the purpose of calculating retiring benefits as having been granted on the ground of public policy and the ");

        Rules_Section section235 = new Rules_Section("Duty during leave.(DEFINITIONS AND GENERAL)","cat15","15110 – If an officer is required, in the course of his vacation leave, to undertake any duty, such period of duty shall not be reckoned against the officer’s leave entitlement.");

        Rules_Section section236 = new Rules_Section("Special Course of Instruction.(DEFINITIONS AND GENERAL)","cat15","15111 – An officer attending a course of instruction to which special conditions apply, will be granted such extension of leave as is allowed by the conditions in question.");

        Rules_Section section237 = new Rules_Section("Extension of leave on public policy.(DEFINITIONS AND GENERAL)","cat15","     15112 – Extensions of leave may be granted by the State Government or its accredited representative on the ground of public policy.  Unless otherwise directed such extension will be on full salary.");

        Rules_Section section238 = new Rules_Section("Compulsory leave with full pay.(DEFINITIONS AND GENERAL)","cat15","15113 – Subject to approval by the Head of Department, an officer may be placed on compulsory leave with full pay, if it is desirable to do so in the public        interest or on the grounds of public policy e.g.\n" +
                "(j)\twhere there is need to establish as to whether or not an officer has committed an offence or misconduct;\n" +
                "(ii) where as result of a re-organisation in a Ministry/Department, an  \n" +
                "      officer ceases to perform the duties and functions of his office.\n");

        Rules_Section section239 = new Rules_Section("Extension of annual leave for urgent private affairs.(DEFINITIONS AND GENERAL)","cat15","     15114 – An officer on vacation leave may, in exceptional circumstances be granted an extension of leave on the grounds of urgent private affairs on full salary up to the expiration of all his deferred leave and thereafter without salary.");

        Rules_Section section240 = new Rules_Section("Extension of Annual leave(DEFINITIONS AND GENERAL)","cat15","     15115 – An officer on vacation leave who wishes to apply for an extension thereof should address his application, if within Nigeria, to his Head of Depart- ment and if outside Nigeria, to the nearest Nigerian Mission.");

        Rules_Section section241 = new Rules_Section("Place of leave(DEFINITIONS AND GENERAL)","cat15","15116 – An officer spending his leave outside Nigeria must, before his passage from Nigeria is booked, inform his Head of Department in writing of his intended destination");

        Rules_Section section242 = new Rules_Section("Leave for cultural and Sporting events.(DEFINITIONS AND GENERAL)","cat15","     15117 – An officer may be granted leave by his Head of Department for the purpose of taking part in any recognised Cultural/sporting events and such leave shall be determined as follows:\n" +
                " (a)   number of days required for the actual activity; \n" +
                "   (b)  number of days required for travelling to and from the place\n" +
                "    arranged for the events;\n" +
                "   (c)  any number of days in excess of (a) and (b) above-mentioned,\n" +
                "which are certified as necessary by the appr4opriate Cultural/\n" +
                "SportingCouncil, shall be allowed.  An officer granted leave under\n" +
                "this Rule will not be eligible for transport at Governmentexpense.\n");
        Rules_Section section243 = new Rules_Section("Casual leave.(DEFINITIONS AND GENERAL)","cat15","15118 – An officer may be granted, at the discretion of the Head of Department, permission to absent himself from duty for a few days, (not more than 7 days in any calendar year) without loss of salary provided that if he is permitted to leave his station on such casual leave, it shall be at his own expense.  The casual leave shall be deductible from the officer’snext annual leave, if he had already exhausted his annualleave for the year.");

        Rules_Section section244 = new Rules_Section("On retirement invalidation.(LEAVE RULES FOR PENSIONABLE OFFICERS)","cat15","     15201 – An officer who retires in circumstances in which he is eligible for retirement benefits before he has completed the full leave year shall be granted a proportion of his vacation leave prior to retirement and will be eligible for transportation allowance under Rule 17203 (c).");

        Rules_Section section245 = new Rules_Section("On permanents(LEAVE RULES FOR PENSIONABLE OFFICERS)","cat15","     15202 – When a Medical Board recommends that an officer should be permanently invalided he will forthwith commence vacation leave prior to leaving the service.  The amount of leave granted will be either:\n" +
                "(a)\tHis deferred leave, if any, plus the proportion of his annual leave calculated in accordance with Rule 15204 or\n" +
                "(b)\tTwo months, whichever is the greater.  It will commence on the day on which the Medical Board recommends permanent invalidation and retirement will take effect from its expiration.\n");

        Rules_Section section246 = new Rules_Section("Leave to attend important Trade Union Conference Business/Course Negotiating Council.(LEAVE RULES FOR PENSIONABLE OFFICERS)","cat15","15203 – An officer who is a member of Negotiating Council or an officer of a Staff Association recognized by Government may be granted special leave with pay and if necessary an extension of such leave for the purpose of attending Negotiating Council or Staff Association meeting or to attend important trade union course/conference/business.  In a case where a Government Servant attends Negotiating Council meeting, he will be granted free transport facilities as if he is travelling on duty.  Returns for such permissions shall be rendered to the Permanent Secretary, Office of Establishments.\n" + "\n");

        Rules_Section section247 = new Rules_Section("Rates of vacation leave.(LEAVE RULES FOR PENSIONABLE OFFICERS)","cat15","     15204 – An officer may be granted vacation leave which may be taken by instalments (provided that the leave transport grant shall be granted only once during a leave year) at any time within the leave year, subject to the exigencies of service, at the following rates: -\n" +
                "Officers on GL 08 and above 30 working days;\n" +
                "                   Officers on GL 04 – 07     21 working days;\n" +
                "                   Officers on GL 01 – 03     14 working days.\n");

        Rules_Section section248 = new Rules_Section("Pro-rata leave calculation.(LEAVE RULES FOR PENSIONABLE OFFICERS)","cat15","15205  - (a)  Proportionate leave under CSR 15202 and 15203 will be reckoned at the appropriate rate shown in the ready reckoner at the end of this Chapter in respect of each completed month’s service.  No period of service less than one month shall be reckoned for proportionate leave.\n" +
                "\n" +
                "     (b)  In any case where it is established that an officer has enjoyed more than the proportionate leave for which he is eligible, the cost of the excess leave will be deducted from any benefit accruing to him or recovered directly from him as a debt due to Government. \n" +
                "     (c) Annual leave entitlement will be at the rate applicable to the officer’s substantive grade on the date he proceeds on leave.\n");

        Rules_Section section249 = new Rules_Section("Action by the Officer(LEAVE RULES FOR PENSIONABLE OFFICERS)","cat15","     15206 – It is the responsibility of every officer to indicate to his Head of Department during the month of January of each year the date when, subject to the exigencies of the service, he would wish to take his annual leave during the leave year.  If the suggested date is not confirmed by 1st April, the affected officer may apply to his Head of Department for the confirmation or alteration of his suggested date of vacation leave.");

        Rules_Section section250 = new Rules_Section("New entrants.(LEAVE RULES FOR PENSIONABLE OFFICERS)","cat15","     15207 – An offer who joins the State Civil Service during the year and who has not served for a minimum period of six months will not normally be granted vacation leave but his pro-rata leave will be carried over to the following year.  If, however, under exceptional circumstances, such officer is allowed to proceed on leave, he shall not be entitled to leave transport grant.");

        Rules_Section section251 = new Rules_Section("Recall before expiration of leave(LEAVE RULES FOR PENSIONABLE OFFICERS)","cat15","15208 – An officer may be required by his Head of Department to return to duty before the expiration of his authorised leave.  Any portion of his leave so curtailed shall be taken at a later date.");

        Rules_Section section252 = new Rules_Section("Leave transport Grant(LEAVE RULES FOR PENSIONABLE OFFICERS)","cat15","15209 – (a) Leave transport grant shall be paid to an officer irrespective of sex or marital status when proceeding on annual leave.  The rate shall be 10% of the annual basic salary of the officer, or as may be fixed from time to time.\n" +
                "              (b) Leave Transport Grant shall be payable at the rate applicable to an officer’s substantive basic salary on the date the leave was approved.\n");

        Rules_Section section253 = new Rules_Section("Vacation leave abroad.(LEAVE RULES FOR PENSIONABLE OFFICERS)","cat15","15210 – An officer will not be entitled to the free use of government transport for the conveyance of himself, his family or his baggage while proceeding on or returning from leave.\n" +
                "\n" +
                "     15211 – An officer who desires to spend his vacation leave abroad at his own expense shall inform and obtain the approval of the Head of Service before proceeding on leave.  In case of the Head of Department, the Governor’s consent shall be obtained.\n");

        Rules_Section section254 = new Rules_Section("OverstayiRng leave.(LEAVE RULES FOR PENSIONABLE OFFICERS)","cat15","     15212 – An officer who, without an acceptable excuse, fails to resume duty after a vacation leave will be regarded as absent without leave (see Rule 04401 (iii)) and without pay.  The period of absence may not be set-off against any future leave, save with Government permission, against any deferred leave already standing to the officer’s credit.");

        Rules_Section section255 = new Rules_Section("Normal tour.(LEAVE RULES FOR EXPATRIATE OFFICERS)","cat15","     15301 – The length of a normal tour of service shall be eighteen months minimum or as Government may decide from time to time.");

        Rules_Section section256 = new Rules_Section("Leave in Nigeria.(LEAVE RULES FOR EXPATRIATE OFFICERS)","cat15","     15302 – An expatriate officer less than 50 years of age who wishes tospend his leave in Nigeria shall be eligible for seven days local leave per tour without leave grant.");

        Rules_Section section257 = new Rules_Section("Compassionate grant of vacation leave.(LEAVE RULES FOR EXPATRIATE OFFICERS)","cat15","15303 – An officer may, at the discretion of the Government, be granted vacation leave other than in accordance with Rule 15304:\n" +
                "(a)\ton medical grounds;\n" +
                "(b)\ton the ground of urgent private affairs;\n" +
                "(c)\ton the ground of public policy;\n" +
                "(d)\tprior to retirement at his own request before completing his normal length of tour\n");
        Rules_Section section258 = new Rules_Section("Rate of vacation leave.(LEAVE RULES FOR EXPATRIATE OFFICERS)","cat15","15304 – Expatriate officers will be entitled to 45 working days vacation leave for every completed eighteen months and 30 working days for every completed twelve months tour.  All eligible expatriate officers will be entitled to minimum travelling time of 2 days and maximum of four days depending on the distance.");

        Rules_Section section259 = new Rules_Section("Full earned leave to be  authorised(LEAVE RULES FOR EXPATRIATE OFFICERS)","cat15","15305 – On each occasion on which an officer is granted vacation leave,    the leave actually authorised will be the whole of his earned leave, together with all his deferred leave.  In the event of an exceptional circumstance making it impossible to authorise the whole of an officer’s earned leave, the balance not so authorised will be treated as deferred leave to be enjoyed at the next leave immediately following the determent.  Such circumstance should be explained to the satisfaction of the Office of Establishments which will normally not give its consent to the deferment of an officer’s leave, unless the exigencies of the service warrant such a step.");

        Rules_Section section260 = new Rules_Section("Curtailment of leave.(LEAVE RULES FOR EXPATRIATE OFFICERS)","cat15","     15306 – An officer may, with the consent of the Civil Service Commission (which will only be given in very exceptional circumstance) be required to return to duty before the expiration of his authorised leave. In that case the difference between his authorised leave, and the leave actually enjoyed will be treated as deferred leave and carried forward to be enjoyed at the next leave immediately following the deferment, otherwise will be forfeited.");

        Rules_Section section261 = new Rules_Section("Curtailment at officers request.(LEAVE RULES FOR EXPATRIATE OFFICERS)","cat15","15207 - When an officer is permitted at this own request to return to duty  before the expiration of his authorised leave, the authorised leave forgone will be forfeited.");

        Rules_Section section262 = new Rules_Section("Return from leave by normal Route(LEAVE RULES FOR EXPATRIATE OFFICERS)","cat15","     15308 – An officer granted leave abroad who returns to Nigeria therefrom      by the normal sea or air route is required to return by the first available passage booked for him by the nearest Nigerian Mission after the expiration of his authorised leave. The period of waiting for such passage after expiration of authorised leave will be deducted from the deferred leave, if any, due to the officer, provided that the delay is not due to the officer having failed to request the nearest Nigerian Mission at the proper time to book his passage.  Such leave will be treated as leave on salary at whatever rate (i.e.full, half or none) the   officer was receiving salary on the last day of his authorised leave.");

        Rules_Section section263 = new Rules_Section("Otherwise Normal route (LEAVE RULES FOR EXPATRIATE OFFICERS)","cat15","     15309 – An officer to whom the preceding Rule does not apply is required       to resume duty after vacation leave on the day following the expiration of his authorised leave.");

        Rules_Section section264 = new Rules_Section("Over staying leave(LEAVE RULES FOR EXPATRIATE OFFICERS)","cat15","     15310 – When an officer due to return to duty has failed to do so, his Head of Department will call the attention of the Civil Service Commission to the fact, in order that enquiries as to the officer’s whereabouts may be made.  An officer who without any acceptable excuse fails to resume duty after vacation leave as required by Rule 15308 and 15309 will be regarded as absent without leave (see Rule 04201 (a) and without pay).  The period of absence may not be set off against any deferred leave already standing to the officer’s credit.\n" +
                "\n" +
                "     15311 – On resuming duty after vacation leave, an officer will start a new tour.\n");

        Rules_Section section265 = new Rules_Section("Officers to apply for leave.(LEAVE RULES FOR EXPATRIATE OFFICERS)","cat15","  15311 – On resuming duty after vacation leave, an officer will start a new tour.\n" +
                "\n" +
                "     15312 - An officer other than a Head of Department is required, three     months before the expiration of his normal tour, to apply to his Head of Depart- ment for instructions as to the date of his departure on leave.  The date on which an officer should leave his post to proceed onleave and the route by which he should travel to join the vessel or aircraft by which his passage has been booked will be decided by his Head of Department who will instruct him accordingly.  In no circumstances may an officer leave his post or hand over his duties in orderto proceed on leave, without proper authority.\n");


        Rules_Section section266 = new Rules_Section("Leave  Certificate.(LEAVE RULES FOR EXPATRIATE OFFICERS)","cat15","15313 – Leave certificate for an expatriate officer will be prepared by the Permanent Secretary, Office of Establishments on the authority of a request from the Head of Department of the expatriate officer.");

        Rules_Section section267 = new Rules_Section("Resumption of duty Certificate.(LEAVE RULES FOR EXPATRIATE OFFICERS)","cat15","     15314 – On return from vacation leave, every officer, whether Nigerian or expatriate, shall complete and submit a Resumption of Duty Certificate to his Head of Department.  The certificate in respect of the expatriate officers shall be endorsed to the Permanent Secretary, Office of Establishments.");

        Rules_Section section268 = new Rules_Section("Period allowed compulsory examination(LEAVE TO TAKE EXAMINATION)","cat15","15401 – The period of leave allowed for the purpose of taking examination               will be limited to the shortest period which will allow the officer to reach the appointed place, sit for the examination and return to his station.\n" +
                "\n" +
                " 15402 – An officer may be allowed special leave on full pay with free transport facilities, to take an examination which he is required by the conditions of his appointment to pass.\n" +
                "\n" +
                " 15403 – Subject to the limits specified in Rule 15401, an officer may be allowed special leave on full pay to take an examination, the passing of which is not a condition of his current appointment, provided that his Head of Depart-                     ment certifies:\n" +
                "(a)\tthat he is industrious, and efficient in the performance of his duties;\n" +
                "(b)\tthat his general value to the Department justifies the concession; and\n" +
                "(c)\tthat the passing of the examination is likely to enhance his value to the service.\n" +
                "\n" +
                "Subject always to the limit specified in Rule 15501, leave on full pay in excess may be granted under this Rule on condition that the period in excess shall be deducted from the officer’s subsequent vacation leave.\n" +
                "\n" +
                "15404 – Without the certification required under CSR 15403 an officer may be allowed leave on full pay to take examination the passing of which is not a condition of his current appointment provided that the whole period is deducted from his subsequent vacation leave.  He will not also be entitled to transport at         Government expense.\n");

        Rules_Section section269 = new Rules_Section("Definition(DEFINITIONS AND GENERAL)","cat16","16101 – In this Chapter, the following terms are used with the following \tmeanings:\n" +
                "\n" +
                "             Free Passage – A “free passage” is:\n" +
                "(a)\tA firstclass passage; or\n" +
                "(b)\tAir passage at;\n" +
                "(i) First class for officers on salary GL 16 and above;\n" +
                "(ii) Tourist class for officers on salary GL 15 and below; between\n" +
                "      Nigeria and some other countries provided at the expense of \n" +
                "      Government.\n" +
                " Free Transport – “free transport” is transport within Nigeria (including \n" +
                "              coastal transport) provided at the expense of Government.\n" +
                "Normal Air Route – A “normal air route”: is the direct air route between \n" +
                "              Nigeria and the approved destination of the officer.\n" +
                "Normal Sea Route- A “normal sea route” is the direct sea route    \t  between Nigeria and the approved destination of the officer.\n" +
                "PassagePrivileges- “passage privileges” ARE THE FREE\n" +
                "               PASSAGE PRIVILEGES OUTSIDE Nigerian set out in this Chapter.\n");

        Rules_Section section270 = new Rules_Section("Resignation(DEFINITIONS AND GENERAL)","cat16","               PASSAGE PRIVILEGES OUTSIDE Nigerian set out in this Chapter.\n" +
                "     16102 – Officers who resign forfeit all claims to passages and any passage \tprivileges granted to such officers will be ex-gratia\n");

        Rules_Section section271 = new Rules_Section("Dismissal(DEFINITIONS AND GENERAL)","cat16","16103 – An officer who is dismissed will not be entitled to free passages.");

        Rules_Section section272 = new Rules_Section("Booking of Passages to or from Nigeria.(EXPATRIATE OFFICERS)","cat16","16201 – All free passages for expatriate officers and their families to and         from Nigeria shall be booked through the nearest Nigerian Mission abroad or the various Ministries/Departments.  All free passages shall be by normal sea or air route.");

        Rules_Section section273 = new Rules_Section("Vacation leave.(EXPATRIATE OFFICERS)","cat16","16202 – An expatriate officer will be provided by Government with free passages for himself by the normal sea or air route on every occasion on which he is granted vacation leave subject to the provision of CSR 16205 – 16207.");

        Rules_Section section274 = new Rules_Section("Passage: wife of officer(EXPATRIATE OFFICERS)","cat16","16203 (a) A free passage by the normal sea or air route will be provided by Government for the wife of an expatriate officer, who accompanies him to, or joins him in Nigeria, with the permission of the Government, once in each direction in respect of each tour (see Chapter 11)\n     (b) Where an officer has claimed under the following Rules less than the cost of two rebated adult passages fromhis country of domicile, he will be permitted reimbursement up to the limit of the amount thus unclaimed, of the actual cost of further passages from and to Nigeria for wife for the purpose of visiting the officer’s children in his country of domicile or approved destination provided that such reimbursement may not be claimed in respect of a homeward journey  undertaken within six weeks after a voyage to Nigeria on a free passage granted to her as the wife of an officer or in respect of an outward journey undertaken within six weeks before her husband’s return to his country of domicile or approved destination, on vacation leave.");

        Rules_Section section275 = new Rules_Section("Passage: children of officer(EXPATRIATE OFFICERS)","cat16","16204 – An expatriate officer who brings his children to Nigeria will be reimbursed by Government the cost of their passage to and from Nigeria by normal sea or air route on the following conditions:\n" +
                "\n" +
                "(a)\tNo such officer shall be eligible during any one tour to be reimbursed a sum in excess of the amount actually spent by him on children’s passage up to a maximum of the cost of two adult fares by sea or air, whichever is utilized, from his recognized country of domicile, to Nigeria, and from Nigeria to his recognized country of domicile;\n" +
                "\n" +
                "(b)\tReimbursement shall be made only in respect of a child who is under the age of eighteen years on the date of embarkation.\n");

        Rules_Section section276 = new Rules_Section("Rail fare(EXPATRIATE OFFICERS)","cat16","16205 – An officer or his wife provided with a free passage under Rules 16202 and 16203 (a) will be provided with the cheapest rail fare (including where necessary, saloon class fare by regular inter-island steamer service) between the officer’s declared destination and the port or airport of embarkation or disembarkation and, provided such declared destination is situated at a distance of more than 80 kilometers from the nearest or most convenient rail-head, with the cost of the cheapest form of transport between such rail-head and the declared destination.  Alternatively:\n" +
                "\n" +
                "(a)\tIf the officer or his wife proceeds to or returns from the declared destination by air, he or she will be granted the amount that the journey would have cost if the rail route had been used;\n" +
                "(b)\tIf the officer or his wife proceeds to or returns fromthe declared destination other than by rail or air, he or she will be granted the cost of the rail fare plus, subject to the above provision, the full cost of the normal transport between rail-head and the declared destination;\n" +
                "(c)\tIf the wife proceeds to or returns from a place other than the declared destination, she will be granted the full cost of the rail fare between the port or airport and the declared destination;\n" +
                "(d)\tIf the officer returns from a place other than the declared destination, he will be granted full cost of the rail fare between the declared destination and the port or airport of embarkation\n");

        Rules_Section section277 = new Rules_Section("Leave on urgent private affairs.(EXPATRIATE OFFICERS)","cat16","16206 – (a) An expatriate officer may be granted leave with free passages on grounds of urgent private affairs before completing a tour of twelve months where such leave is necessitated by serious illness of an officer’s immediate relative i.e. wife, or child of a married officer or parents of an unmarried officer.\n" +
                "\n" +
                "      (b) An expatriate officer granted leave on grounds of urgent private affairs under CSR 16206 (a) shall utilize his free passage privileges which he would have used while proceeding on vacation leave.\n");
        Rules_Section section278 = new Rules_Section("Retiring before completing final tour.(EXPATRIATE OFFICERS)","cat16","16207 – An officer who is retiring at his own request without completing a final tour of twelve months will be provided with homeward passage privileges as though he had been granted vacation leave on the grounds of urgent private affairs.");

        Rules_Section section279 = new Rules_Section("Extra Baggage on Retirement.(EXPATRIATE OFFICERS)","cat16","16208 – (a) On retirement or on leaving Nigeria finally on the expiration of his contract which will not be renewed, an expatriate officer may be provided with free ocean cargo freight to his home country for the transportation of baggage up to 12 cubic metres or ten shipping tons at the discretion of the shipping company concerned, subject to a maximum of 2,440 kilograms in weight inclusive of whatever ticket tariff baggage allowance and/or fixed baggage may be included in the normal passage privileges which an officer may enjoy on that occasion.\n" +
                "\n" +
                "     (b) In the alternative, if he decides to air-lift his baggage, he may be paid in cash what it would have cost the Government to ship the same baggage by sea.\n");

        Rules_Section section280 = new Rules_Section("Repatriation of Corpse of an Expatriate officer who died in Nigeria(EXPATRIATE OFFICERS)","cat16","16209 – At the request of the deceased’s family, the Government shall repatriate the corpse of an officer who died in Nigeria while in employment of the Government.  Government’s responsibility shall be limited to the following:\n" +
                "\n" +
                "(a)\tPreparation of the body (embalmment);\n" +
                "(b)\tPurchase of reasonably-priced coffin or casket (including inner lining or wooden coffin as stipulated by Airline Regulations);\n" +
                "(c)\tTransportation of the corpse to the officer’s home country; and\n" +
                "(d)\tFree passages for the spouse and children if in Nigeria at the time of the officer’s death provided the advantage of this privilege is taken within six months thereof.\n");

        Rules_Section section281 = new Rules_Section("Personal Effects(EXPATRIATE OFFICERS)","cat16","16210 – The Administrators of the estate of a deceased expatriate officer may be granted the following assistance towards the transportation of his personal effects to his home country:\n" +
                "\n" +
                "     An ocean freight warrant for the transportation of baggageup to 12 cubic metres or ten shipping tons at the discretion of the shipping company concerned subject to the maximum of 2,440 kilograms in weight.\n");

        Rules_Section section282 = new Rules_Section("Definition(DEFINITION AND GENERAL)","cat17","17101 – Cheaper Point:  The term “Cheaper Point” means a place which may be substituted for an officer’s Nigerian home place as the starting point or destination of a journey at Government expense, on condition that such substi- tution results in the transport facilities actually provided in respect of the journey  involving neither greater cash disbursement by Government nor more excessive use of Government transport services than would be involved by providing similar facilities from or to the officer’s Nigerian home place. ");

        Rules_Section section283 = new Rules_Section("Economy in the use of Transport.(DEFINITION AND GENERAL)","cat17","17102 - The necessity for any journey at Government expense should befully established before the use of Transport at Government expense is authorised.");

        Rules_Section section284 = new Rules_Section("Authority for use of Transport(DEFINITION AND GENERAL)","cat17","     17103 – Authority for the use of transport facilities at Government expense shall be given by the Head of Department or his authorized representative in accordance with provisions of Financial Regulations.");

        Rules_Section section285 = new Rules_Section("Must be specific and not exceed approved scales.(DEFINITION AND GENERAL)","cat17","17104 – The free transport facility authorised must not exceed that for which provision is made in these Civil Service Rules.  If an officer wishes to avail himself of transport facilities in excess of those provided by the Civil Service Rules, or facilities not provided by the Rules, he must pay for each facility     himself in advance.  The authorising officer is responsible for ensuring that the free transport facilities authorised therein, not only do not exceed the maximum allowed by these Rules, but also do not exceed those actually required for the journey in question.  In particular, when the facilities include free fare for children, the age of each child concerned must be ascertained and specified.");

        Rules_Section section286 = new Rules_Section("FreeTransport facilities not transferable.(DEFINITION AND GENERAL)","cat17","     17105 – An officer who utilises any part of the free transport facilities provided under these Civil Service Rules for a purpose other than that for which it is authorised or who, having received a cash payment in advance to defray the cost of such facilities, fails to refund on demand any part thereof not used to defray the cost of the specific facility for which he received it or who claims payment in arrears in respect of any such facility he has not utilised for the purpose claimed, is guilty of gross misconduct.");

        Rules_Section section287 = new Rules_Section("Transport of orderlies or personal attendant.(DEFINITION AND GENERAL) ","cat17","17106 – No officer may travel at Government expense in the capacity of orderly or personal attendant to another officer unless the employment of an orderly has been authorised by the Office of Establishment.");

        Rules_Section section288 = new Rules_Section("Canoe Transport(DEFINITION AND GENERAL)","cat17","17107 – Canoe Transport at Government expense may only be used when no cheaper or quicker means of transport is available.");

        Rules_Section section289 = new Rules_Section("Air Transport(DEFINITION AND GENERAL)","cat17","17108 – Journeys at Government expense by air must be made by aircraft             of the Nigeria Airways Company Limited except when no aircraft of the Company is available for such journey.");

        Rules_Section section290 = new Rules_Section("General(FREE TRANSPORT FACILITIES AVAILABLE)","cat17","17201 – The free transport facilities, subject to the principles laid down in Rule 17102, in respect of journeys in Nigeria (including coastal journeys between Nigerian Ports) for which officers (including temporary staff) are eligible are set out in Section 2 and 3 of this Chapter, in which:\n" +
                "\n" +
                "(a)\tThe family passenger fare allowance is for one wife and children;\n" +
                "(b)\tThe baggage allowance is additional to the tariff baggage allowance of a passenger ticket holder;\n" +
                "(c)\tThe baggage allowance for a wife, child or servant only, applies when the wife, child or servant actually travels.\n" +
                "\n");

        Rules_Section section291 = new Rules_Section("Duty Journeys (FREE TRANSPORT FACILITIES AVAILABLE)","cat17","17202 – For the purpose of the transport facilities specified in Rule17204,         the following types of journeys will be regarded as on duty:\n" +
                "\n" +
                "(a)\tall journeys undertaken in the course of an officer’s duty on specific instructions from the Head of Department or his local representative;\n" +
                "(b)\tjourneys to obtain dental treatment;\n" +
                "(c)\tjourneys to consult a medical officer i.e. journeys to and from the nearest Government Medical Officer when an Officer is stationed or on leave at a place without medical facilities and his local Head of Department or the local administrative officer (whichever is appropriate) certifies that in his opinion, the officer should consult a doctor;\n" +
                "(d)\tjourneys to obtain hospital treatment; i.e. journeys to and from hospital when a Government Medical Officer certifies that it is necessary for an officer to leave his station and proceed to the hospital in question for medical treatment;\n" +
                "(e)\tjourneys undertaken by wives and children of officers to obtain dental or hospital treatment and to consult a dental or a medical officer as in (b), (c) and (d) above.\n" +
                "(f)\thealth trips i.e. journeys by an officer recommended by a Medical Board to leave his station for a change of scene or climate to and    from a place served by Government vessel or the railways, free transport facilities being restricted to travel by Government vessel      or railways except between the officer’s station and the nearest      point thereto served by Government vessel or railways.\n");

        Rules_Section section292 = new Rules_Section("Journeys to new station and proceeding on retirement.(FREE TRANSPORT FACILITIES AVAILABLE)","cat17","17203 – For the purpose of these Rules, journeys to new stations will be     \tdeemed to include:\n" +
                "(a)\tJourneys undertaken when assuming duty on first appointment (i.e. journeys to station from place of engagement or Nigerian             home place);\n(a)\tJourneys undertaken when proceeding on transfer (i.e. journeys from old station to new station).  (See Rule 17205);\n" +
                "(b)\tJourneys undertaken when proceeding on retirement                        (in circumstances which render the officer eligible for retirement benefits) or for the purpose of repatriating the family, domestic servant and personal effects of deceased officers i.e. journeys          from station to place of original engagement (if so desired) or cheaper point (see definitions) Nigerian home place, Nigeria des- tination on final leave or exit point from Nigeria, whichever is appropriate, provided such concession is utilised within six months of the date of retirement or of the death of the officer;\n" +
                "(c)\tJourneys by an officer granted leave under the provision of CSR 15402 and 15403 to and from the nearest centre at which the examination is held.\n");

        Rules_Section section293 = new Rules_Section("An allowance in lieu of official Transport.(FREE TRANSPORT FACILITIES AVAILABLE)","cat17","     17204 - For journeys specified in CSR17203 (a)-(c) an allowance of 10% of annual basic salary of an officer shall be paid, subject to a minimum of N500.00 if official transport is not provided.");

        Rules_Section section294 = new Rules_Section("Change of Station(FREE TRANSPORT FACILITIES AVAILABLE)","cat17","17205 – An officer proceeding on leave from one station and resuming in another shall be eligible for transport allowance specified in CSR 17204.");

        Rules_Section section295 = new Rules_Section("Free transport facilities by training(FREE TRANSPORT FACILITIES AVAILABLE)","cat17","17206 – For journeys by train, railway warrants for the officer, and wife and children for the following class of travel will be issued.\n" +
                "\n" +
                "                            Grade Level                               Class\n" +
                "                 Officers on GL. 06 and above              First\n" +
                "                 Officers on GL 03 – 05                        Second\n" +
                "                 Officers on GL 01 – 02                        Third  \n");

        Rules_Section section296 = new Rules_Section("Transport of motorauto- cycle  for repairs.(FREE TRANSPORT FACILITIES AVAILABLE)","cat17","17207 – An officer, serving at a station where adequate motor repair facili- ties are not available, when a motor vehicle is necessary for the proper perform-ance of the duties of his office, may be allowed, on the authority of his Head of Department, free transport for his motor vehicle or part thereof to and from the nearest place where such facilities exist, for the purpose of effecting necessary repairs. Normally, this Rule will not apply to motor vehicles requiring ordinary maintenance or servicing, but an exception may be made at the discretion of the Head of Department in cases where it is necessary for vehicle to receive essential large scale servicing (for example, in the case of a new vehicle after the first 1,000 kilometres).");

        Rules_Section section297 = new Rules_Section("Train Journeys(MISCELLANEOUS RULES REGARDING FREE TRANSPORT FACILITIES)","cat17","     17301 – Subject to the exigencies of the railways service, the following officers will be provided with reserved firs-class, two berths compartments when travelling by train.  Each journey must be covered by warrants made out for two first-class fares whether or not the officer travelling is accompanied by his spouse: (i)  Members of the Advisory Council on the Prerogative of Mercy; \n" +
                "           (ii)  Chairman, members of Commissions established by Ondo State\n" +
                "Government;\n" +
                "           (iii) Officers holding posts grade in GL 13 and above.\n" +
                "     When so accommodated, officers will not be entitled to additional passenger tickets for their spouses.  For other Officers entitled to firs-class accommodation, their spouses and facilities, when travelling by train such special reserved first class accommodation as is suitable and available will be provided.  In special circumstances, e.g. when an officer is being invalided, such special accommodation on the train as may be required and is available will be provided.\n");

        Rules_Section section298 = new Rules_Section("Baggage(MISCELLANEOUS RULES REGARDING FREE TRANSPORT FACILITIES)","cat17","     17302 – Notwithstanding that an officer may be eligible for free transport of more than 500 kilograms of baggage, he may not ordinarily take more than 500 kilograms, of baggage by passenger train, any excess over 500 kilograms must ordinarily be railed by goods train.  As an exemption to this rule, an officer may be authorised to take his full baggage allowance by passenger train provided his Head of Department is satisfied that by his doing so, he will avoid unnecessary delay in reaching his station.  Such authority must be included in the relevant railway warrant and will be subject, in respect of journeys by ‘limited’ train, to prior agreement with the Station-master at the place where the train is boarded that the full allowance can be accepted.");

        Rules_Section section299 = new Rules_Section("Extra Equipment.(MISCELLANEOUS RULES REGARDING FREE TRANSPORT FACILITIES)","cat17","     17303 – When an officer requires to take with him loads which are neces-       sary for the efficient performance of his duties (e.g. Officer equipment, survey instruments, tents, etc.), he may at the discretion of his Head of Department, be issued with extra baggage allowance included in his passenger ticket.");

        Rules_Section section300 = new Rules_Section("Official documents etc. by air(MISCELLANEOUS RULES REGARDING FREE TRANSPORT FACILITIES)","cat17","\n" +
                "     17304 – When it is necessary for the efficient performance of his duties, an officer travelling on duty by air may take with him at Government expense official documents, papers and office necessities up to a maximum of 20 kilograms in addition to the tariff baggage allowance included in his passenger ticket.\n");

        Rules_Section section301 = new Rules_Section("Use of Government transport from house to railway station etc.(MISCELLANEOUS RULES REGARDING FREE TRANSPORT FACILITIES)","cat17","17305 – When proceeding on transfer, an officer may be provided with free Government transport in his station between his house and the railway station or motor park and vice versa, on his arrival at his new station. Where Government transport cannot be provided, the officer may be reimbursed at rates approved by the appropriate authorities.");


        Rules_Section section302 = new Rules_Section("Definition(GENERAL)","cat18","18101 – Duty visit – A ‘Duty Visit’ means an official tour outside Nigeria which includes a tour:\n" +
                "(a)\tto undertake special duty abroad;\n" +
                "(b)\tto discharge official duty during vacation leave abroad;\n" +
                "(c)\tto undertake course of instruction abroad including attachment to an organization for a short period; and\n" +
                "(d)\tto undertake medicalcheck-up/treatment abroad at Government expense.\n");

        Rules_Section section303 = new Rules_Section("Appropriate(GENERAL)","cat18","     In such an event, the officer shall be eligible for appropriate estacode allowance specified in CSR. 18201.");

        Rules_Section section304 = new Rules_Section("Obtaining approval(GENERAL)","cat18","     18102 – Before an officer on leave outside Nigeria undertakes official visit prior approval of the Government shall be obtained,the application for permission shall specify:\n" +
                "(a)\tdetails of the visit or course proposed;\n" +
                "(b)\twhy the visit, duty or course is considered desirable in the public interest;\n" +
                "(c)\tthe appropriate dates on which it is proposed the officer should arrive in and depart from the country in which duty or courses is to be undertaken;\n" +
                "(d)\tthe officer’s address during the duty or course;\n" +
                "(e)\tthe probable duration of the duty or course;\n" +
                "(f)\tthe total estimated cost including all travelling expenses, subsistence allowances and fees (if any).\n");

        Rules_Section section305 = new Rules_Section("Briefing of officers.(GENERAL)","cat18","     18103 – An officer required to undertake duties or a course of instruction outside Nigeria shall be furnished with detailed instructions by his Head of Department regarding such duties or course and be informed in advance and in writing of all allowances and travelling facilities or which he will be eligible at Government expense in connection therewith.");

        Rules_Section section306 = new Rules_Section("Effect of Special duty visit on leave(GENERAL)","cat18","18104 – Where an officer is required during his vacation leave to undertake any duty, the period of duty will be leave-earning and not leave-consuming.  A period of duty outside Nigeria during an officer’s tour will be regarded as part of his tour.");

        Rules_Section section307 = new Rules_Section("Course of instruction.(GENERAL)","cat18","18105 – The normal effects on the amount of leave due to an officer on his attending a course of instruction during his vacation leave are specified in Rule 15112.The leave-earning periods in respect of courses of instruction will be calculated according to the Ready Reckoner on leave computation in Chapter 15.");

        Rules_Section section308 = new Rules_Section("Class of rail fare(GENERAL)","cat18","18106 – When provision is made in this Chapter of the Civil Service Rules for reimbursement to officers of actual expenditure on rail fares, the reimbursable fare shall be:\n" +
                "\n" +
                "                 Officers on GL 13 and above   - First Class\n" +
                "                 Other Officers                         -  2nd Class\n");

        Rules_Section section309 = new Rules_Section("Rate of estacode allowance and other privileges.(DUTY VISIT OUTSIDE NIGERIA)","cat18","18201 – In respect of official visit outside Nigeria, prior application must be made and approval obtained through the appropriate channels.  The application shall conform with the stipulations in CSR 18102 (a) – (f).\n" +
                "\n" +
                "(a)\tPassages:  Ocean or air passage for himself only; but where the duration of an officer’s duties is not less than 9 months, his wife may accompany him at Government expense.\n" +
                "(b)\tTransport: Reimbursement of actual expenditure on transport essential to the business of the visit.\n" +
                "(c)\tDuty Allowance Abroad: Estacode shall be paid to officers at the following rates per night:\n" +
                "     (i) State Commissioner, Secretary to the Government etc.\n" +
                "US$400 per night;\n" +
                "     (ii)  Permanent Secretary, Accountant-General, Auditor-\n" +
                "           Government and Chief Registrar of the \n" +
                "                        High Court               -    US $360 per night\n" +
                "     (iii) Officers on GL 16                -    US $340 per night\n" +
                "     (iv) Officers on GL 14 and 15    -    US $305 per night\n" +
                "       (v) Officers on GL 10 - 13        -    US $245 per night\n" +
                "      (vi) Officers on GL 07 - 09        -    US $205 per night\n" +
                "     (vii) Officers on GL 01 - 06        -    US $165 per night\n" +
                "(d)\tWhere the officer is a guest to Government or Institution and the host government or institution contributes in cash towards the cost of accommodation and other living expenses, an amount less than estacode rate, the officer will be entitled to have his allowance topped up or his ticket up-graded.\n" +
                "\n" +
                "(e)\tWhere the officers listed in CSR 18201 (c) (i) are compelled by circumstances to seek expensive hotel accommodation which cannot be met from the approved estacode rates, they will select to have their hotel expenses covering board, lodging and laundry paid by the Government and claim incidental allowance of 25% of the estacode rate appropriate to their grades.\n" +
                "\n" +
                "(f)\tUnder no circumstances shall an officer be allowed to draw full estacode allowance and at the same time have his hotel expenses met by the Government.\n (g) The purpose of subsistence or incidental allowance is to enable an\n" +
                "officer who is a guest of Government or Institution to meet such \n" +
                "incidental expenses as laundry, tips and cost of internal\n" +
                "                    transportation. \n");

        Rules_Section section310 = new Rules_Section("Away from normal place of residence.(DUTY VISIT OUTSIDE NIGERIA)","cat18","     18202 – An officer who, with prior approval of Government, discharges official duties during vacation leave outside Nigeria and who is obliged to take accommodation way from his normal place of residence or home, will be treated as proceeding on such a destination on duty visit and will be eligible for duty allowance abroad as indicted in Rule 18201, as long as no accommodation is provided at Government expense at such a destination.");

        Rules_Section section311 = new Rules_Section("Indigenous officers.(DUTY VISIT OUTSIDE NIGERIA)","cat18","     18203 – A Nigerian officer for whom accommodation is provided who, with the prior approval of Government, discharges official duties during his vacation leave outside Nigeria is eligible for a refund of daily travelling expenses neces- sarily incurred in the discharge of such duties in addition to his normal estacode.");

        Rules_Section section312 = new Rules_Section("Expatriate officers.(DUTY VISIT OUTSIDE NIGERIA)","cat18","     18204 – An expatriate officer who, with prior approval of Government discharges official duties during his vacation leave outside Nigeria, but who is not obliged to take accommodation away from home is eligible for a refund ofdaily travelling expenses necessarily incurred in the discharge of such duties.");

        Rules_Section section313 = new Rules_Section("Condition(COURSE OF INSTRUCTION OUTSIDE NIGERIA)","cat18","18301 – An officer who is permitted to attend a course of instruction is     eligible for the benefits set out in this section provided that he has signed an agreement to refund Government all expenses connected therewith if he:\n" +
                "\n" +
                "(a)\tdoes not obtain a certificate of satisfactory attendance at the course; or\n" +
                "(b)\tdoes not return to the Civil Service, or \n" +
                "(c)\tundertakes any other course or instruction without the specific approval of the Government;\n" +
                "(d)\tresigns from the Civil Service within a period of three years of his completing such a course.\n");

        Rules_Section section314 = new Rules_Section("Passages(COURSE OF INSTRUCTION OUTSIDE NIGERIA)","cat18","     18302 – A Senior Officer sent abroad on a course of instruction will be eligible for free ocean or air passage for himself only; but where the duration of the course of instruction is not less than 9 months, his spouse may accompany him at government expense.");

        Rules_Section section315 = new Rules_Section("Estacode allowance(COURSE OF INSTRUCTION OUTSIDE NIGERIA)","cat18","18303 – (a) An officer on course of instruction shall be entitled to full estacode allowance for the first 28 days and thereafter 30% of the appropriate rate for the rest of the duration of the course.\n" +
                "(b)\t(i)  Where the donor providing the training as a form of technical assistance to Nigeria also provides free board and lodging, the officer concerned shall be entitled to 30% of his appropriate estacode for the whole duration of his course – in other words no full estacode allowance for the first 28 days is payable.\n)  Where    the    donor    providing    the training provides free lodging\n" +
                "alone, the   officer   concerned shall    be    entitled to 50%   of   his\n" +
                "appropriate    estacode    throughout   the   duration of his course to\n" +
                "                         meet board and incidental expenses (full estacode for 1st day not \n" +
                "                         payable).\n" +
                "               (iii)  Where the donor provides free lodging plus cash allowance, the officer\n" +
                "will be entitled to the cash difference between the cash payment bythe\n" +
                " donor government and the 30% of his estacode entitlement.  (No full\n" +
                "                         estacode for the 1st 28 days).\n" +
                "                (iv)   However, where the donor merely gives the officer cash towards\n" +
                "the cost of board and lodging and other incidentals, the officer\n" +
                "                          will not have his estacode allowance topped up.\n");

        Rules_Section section316 = new Rules_Section("Employment during training courses abroad.(COURSE OF INSTRUCTION OUTSIDE NIGERIA)","cat18","     18304 – An officer, undergoing training course abroad, who received a salary from an employer in that country will not be eligible for any salary or allowance from the State Government except as may be specifically approved by the Office of Establishments.");

        Rules_Section section317 = new Rules_Section("Procedure for externally assisted courses.(COURSE OF INSTRUCTION OUTSIDE NIGERIA)","cat18","18305 – Where training facilities under a foreign government’s technical assistance scheme is required, all application forms for the nomination of candidates will be forwarded to the Office of Establishments which, on approval of the nomination for a particular course will, complete the application forms and forward them with a copy to the State Ministry of Finance.");

        Rules_Section section318 = new Rules_Section("Salaries etc. under technical assistance scheme(COURSE OF INSTRUCTION OUTSIDE NIGERIA)","cat18","     18306 – Officers attending courses of Instruction under technical assistance scheme will continue to receive their salaries and all other conditions of service will be decided in accordance with the existing arrangements between the donor government and Ondo State Government (see CSR 18305).");

        Rules_Section section319 = new Rules_Section("Course of instruction at officer’s request: Conditions (COURSE OF INSTRUCTION OUTSIDE NIGERIA)","cat18","18307 – Where an officer is permitted on the recommendation of his Head of Department to take a course of instruction at the officer’s request, special cond-        tions may be imposed.  These conditions will be decided by the Office of Establishments and may include the grant of leave without pay and the withdrawal of all or any of the allowances or other privileges proscribed in this Chapter.  In such cases, it is the responsibility of the Head of Department to inform the officer in writing, before his departure, of the conditions which have been decided. ");

        Rules_Section section320 = new Rules_Section("Courses with special conditions(COURSE OF INSTRUCTION OUTSIDE NIGERIA)","cat18","    18308 – Special rates of allowances, etc. are prescribed from time to time for certain courses of instruction, and they apply to all officers attending the courses in question.");

        Rules_Section section321 = new Rules_Section("Definition.(LOCAL COURSE OF INSTRUCTION)","cat18","18401 – Local Course of Instruction is a course which an officer undertakes locally (in Nigeria, but outside his duty station).");

        Rules_Section section322 = new Rules_Section("Local courses allowance.(LOCAL COURSE OF INSTRUCTION)","cat18","\n" +
                "     18402 – (a) An officer sent on a local course where board and lodging are provided shall be entitled to the following monthly rate of allowances:   (i) Allowance per day for the first 28 days:\n" +
                "Officers on GL 01-07                    -               N90.00\n" +
                "                      Officers on GL 08-13                    -              N120.00\n" +
                "                      Officers on GL 14-15                    -              N150.00\n" +
                "                      Officers on GL 16 and above       -             N200.00\n" +
                "\n" +
                "              (ii)  A flat monthly rate of allowance for the period after the \n" +
                "first 28 days shall be payable:\n" +
                "                      Officers on GL 03 and blow         -              N200.00\n" +
                "                      Officers on GL 04-06                    -              N300.00\n" +
                "                       Officers on GL 07-10                    -             N450.00\n" +
                "                      Officers on GL 11-13                   -               N600.00\n" +
                "                      Officers on GL 14 and above       -               N700.00\n" +
                "              (iii) Allowance at the rate stipulated in (i) of this Rule shall be \tpayable in respect of the last uncompleted month.\n" +
                "\n" +
                " (b) Where board and lodging are not provided, the officer shall be entitled to the existing rate of Travelling Allowance as specified in Rule 22105.\n" +
                "\n" +
                "         (c) Where either boarding or lodging is provided the officer shall be entitled to 50% of the allowance specified in Rule 22105.\n" +
                "\n\n");

        Rules_Section section323 = new Rules_Section("Eligibility(UNIFORM ALLOWANCE)","cat19","19101 – Uniform Allowance shall be paid to all uniformed officers at the rates fixed by the Government from time to time.");

        Rules_Section section324 = new Rules_Section("When Payable(CAMP EQUIPMENT ALLOWANCE)","cat19","19201 – The payment of this allowance to any grade of officers is not automatic.  It is only payable to an individual field officer when he is actually required to tour under bush conditions and on a certificate personally signed by the Head of Department concerned to the effect that the officer is definitely required to use and maintain camp equipment.");

        Rules_Section section325 = new Rules_Section("Rate of Allowance(CAMP EQUIPMENT ALLOWANCE)","cat19","     19202 – Camp equipment allowance at the rate of N500.00 is payable to an officer who qualifies under Rule 19201, provided that an officer shall not receive the allowance more than once in two years.");

        Rules_Section section326 = new Rules_Section("When payable(DISTURBANCE ALLOWANCE)","cat19","19301 – Disturbance Allowance is granted in compensation for out of pocket expenses not covered by other regulations, but which are incurred by officers in the course of transfer from one station to another at the instance of Government.  For the purpose of this allowance “transfer” means the following:\n" +
                "                        (i) transfer from one station to another during a tour of service;\n" +
                "                       (ii)  transfer from one station to another on return from leave;\n" +
                "                      (iii)  transfer or secondment from the service of another\n" +
                "Government in the Federation;\n" +
                "                       (iv)   evacuation, on the instructions of the appropriate housing\n" +
                "authority, from a Government quarter, of an officer allocated the quarter onother than a purely temporary basis, for the reason that the quarter is required for another officer; provided that the officer thus forced to leave quarter is obliged thereby to move outside the residential area concerned.  Any claim made under this sub-paragraph should be supported by a certificate from the appropriate housing authority to the effect that the move in respect of which a claim is made constitutes a move from one residential area to another at the instruction of the housing authority.\n");

        Rules_Section section327 = new Rules_Section("When not payable(DISTURBANCE ALLOWANCE)","cat19","     19302 – (a) change of quarters within a residential area;\n" +
                "     (b) temporary postings which do not make it necessary for the officer to vacate his quarters or residence in the station to which he will be returning; \n" +
                "     (c) when an officer is on duty away from his permanent headquarters or station in circumstances under which he is eligible for travelling allowance;\n" +
                "     (d)  transfer at an officer’s own request;\n" +
                "     (e)  when proceeding on leave;\n" +
                "     (f)  transfer to or from another Public Service at an officer’s own request;\n" +
                "    (g)   posting within the same duty station.\n" +
                "\n" +
                "     19303 - Disturbance Allowance shall be paid at a rate not less than 5% of an officer’s annual basic salary.\n");

        Rules_Section section328 = new Rules_Section("To whom Payable(OCCUPATIONAL HAZARD ALLOWANCE)","cat19","     19401 - Occupational hazard allowance shall be paid to an officer who is exposed to extra-occupational risks and hazards that were not taken into consideration in determining the basic annual salary of the officer.");

        Rules_Section section329 = new Rules_Section("Eligible Officers and Rates(OCCUPATIONAL HAZARD ALLOWANCE)","cat19","19402 – The following officers are eligible for occupational hazard allowance at the rates fixed by the government from time to time:\n" +
                "(i)    Nurses, attendants, card issuers, orderlies and auxiliary workers\n" +
                "in psychiatric hospitals, sanatoria, leprosaria and otherinfectious\n" +
                "  diseases hospitals/clinics;\n" +
                "(ii)   Medical Laboratory Technologists and their supporting staff like\n" +
                "Technicians, Assistants and Attendants, workers handling live viruses\n" +
                "in theYellow Fever Vaccine Laboratory, Small Pox Vaccine\n" +
                "Laboratory, Anti-Rabies Vaccine Laboratory and workers who look\n" +
                "after the monkey colony in the Yellow Fever Vaccine Laboratory;\n" +
                "               (iii)   Radiographers and X-ray Technicians in |Tuberculosis Centres and in\n" +
                "                          Hospitals and Health Centres with X-ray equipment;\n" +
                "                (iv)    All staff involved in the fumigation of ships; Port Health\n" +
                "                          Attendants/Assistants, Inspectors and Superintendents;\n" +
                "    (v)   All operation staff, whether Senior or junior who are exposed to the\n" +
                "hazard of firefighting.  Where a Fireman/Driver carries out the dual\n" +
                " duties of fighting fire on getting there, he shall be eligible for a \n" +
                "consolidated allowance of 150% of the approved rate;\n" +
                "                  (vi)  Mortuary Attendants, Laboratory Assistants and Attendants;\n" +
                "                  (vii) Health Staff in Epidemiological Units; Malaria/Vector Central Unit\n" +
                " and Isolation Wards and Zoo Attendants.\n");
        Rules_Section section330 = new Rules_Section("Eligible Officers and rates(TEACHING ALLOWANCE)","cat19","     19501 – The following officers are eligible for teaching allowance at the rate fixed by government from time to time: (a) (i)   Part-time Lecturers/Instructors in post-primary institutions;\n" +
                "(ii)  Part-time Lecturers/Instructors in post-secondary institutions\n" +
                "(members of staff)\n" +
                "(iii) Part-time Lecturers/Instructors in post-secondary institutions \n" +
                "(Outsiders)\n" +
                "                (b)  Officers in the Professional, Administrative, Executive, Techno-\n" +
                "logical and Allied Cadres whose normal duties do not involve \n" +
                "teaching, but who are posted for full-time teaching in departmental\n" +
                " training institutions and other recognised institutions;\n" +
                "                  (c) A House Master/Mistress in educational institutions;\n" +
                "                 (d)  Science and Mathematics teachers in educational institutions;\n" +
                "                 (e)  Laboratory Assistants/Attendants in educational institutions, who \n" +
                "in addition to their normal duties are required to work with the \n" +
                "evening class section of the institutions.\n");

        Rules_Section section331 = new Rules_Section("Definitions(CALL DUTY AND SHIFT DUTY ALLOWANCE)","cat19","19601 – Call Duty: A ‘Call Duty” period is the apprehended time which includes both the look-out period and the period in which the officer is effectively engaged while on call.  It does not cover the extended period of the working day, during which the officer effectively occupied with work which cannot be terminated.\n" +
                "\n" +
                "\tShift Duty: “Shift Duty” is service carried out on a continuous relay basis, which involves officers taking their turns on duty in conformity with the institution’s duty roaster.\n");

        Rules_Section section332 = new Rules_Section("Eligibility(CALL DUTY AND SHIFT DUTY ALLOWANCE)","cat19","     19602 – (a) (i) Any medical doctor whose name is on official call duty roster of his institution, shall be eligible for call duty allowance.\n" +
                "\n" +
                "     (ii)  All categories of nurses for whom call duty allowance has been approved whose names are on the official call duty roster of the institution, shall be eligible for call duty allowance.\n" +
                "     (b)    All para-medical staff who work on shift duty basis, whose names are on the official shift duty roster for their cadre in the institution, shall be eligible for shift duty allowance.\n" +
                "     Provided that no officer who enjoys call duty allowance shall at the same time receive shift duty allowance and vice-versa.\n");

        Rules_Section section333 = new Rules_Section("Rates(CALL DUTY AND SHIFT DUTY ALLOWANCE)","cat19","19603 – The rates of the allowances shall be as fixed by Government from time to time.");

        Rules_Section section334 = new Rules_Section("Call and Shift duty allowances taxable(CALL DUTY AND SHIFT DUTY ALLOWANCE)","cat19","19604 – Call Duty and Shift Duty allowance are taxable.");

        Rules_Section section335 = new Rules_Section("Definition(ACTING APPOINTMENTS)","cat20","20101 – Acting appointment is a gazetted appointment to carry out the duties and responsibilities of a higher office or position than the officer’s substantive grade for a short period.");

        Rules_Section section336 = new Rules_Section("When made(ACTING APPOINTMENTS)","cat20","     20102 – When it is necessary that a particular duty post not lower than salary GL 05 should be filled at a time when no officer of corresponding substantive rank is available for posting thereto, the authority empowered to appoint to the post, may formally appoint some other officer, by notice in the gazette, to act in the duty post and assume either fully or in part the duties and responsibilities thereof.");
        Rules_Section section337 = new Rules_Section("Not made unless necessary(ACTING APPOINTMENTS)","cat20","20103 – The mere fact that the substantive holder of a duty post will be absent therefrom for a short period (e.g. on casual leave or on the sick list) does not in itself justify an acting appointment. There may, however, be circumstances (such as compliance with statutory provisions) which necessitate the making of an acting appointment for a relatively brief period.  The decision whether an acting appointment is necessary or desirable, in any particular case will rest with the appointing authority.\n" +
                " Note: - Reference should be made to the Civil Service Commission Regulations ");
        Rules_Section section338 = new Rules_Section("Not a form of trial Promotion/ Gazetting of acting appointment.(ACTING APPOINTMENTS)","cat20","for guidance on the procedure for recommending an acting appointment.\n" +
                "\n" +
                "     20104 – Acting appointments are not intended as a means of testing the suitability of officers for promotion; they will normally be made only in order to fill posts that are temporarily vacant, and their duration should be limited accordingly.\n");

        Rules_Section section339 = new Rules_Section("Date of commencement.(ACTING APPOINTMENTS)","cat20","20105 – Approved acting appointment will be gazetted by the Civil Service Commission.\n" +
                "     20106 – The date on which an acting appointment commences, will be indicated in the gazette notice authorising the appointment.  Normally, the gazetted date of commencement will be that on which the acting officer takes over the duties and responsibilities of the post, except that if he takes over from the substantive holder, the gazetted date of commencement will not be earlier than that on which the latter, after handing over: -\n" +
                "(a)\tleaves the station or the post;\n" +
                "(b)\ttakes over substantively or himself commences to act in another post in the same station;\n" +
                "(c)\tcommences vacation leave in the same station, whichever is applicable according to circumstances.\n");
        Rules_Section section340 = new Rules_Section("Date of cessation (ACTING APPOINTMENTS)","cat20","     20107- The date on which an acting appointment ceases will be indicated                in the gazette notice reverting the officer’s appointment. Normally, the gazetted date of cessation will be that on which the acting officer relinquishes the duties and responsibilities of the post, except that if he hands over to the substantive holder, the gazetted date of cessation will not normally be later than the date on which the latter, before taking over:\n" +
                "(a)\tarrives in the station;\n" +
                "(b)\tceases to hold substantively or to act in another post in the same station;\n" +
                "(c)\tceases vacation leave in the same station whichever is applicable according to circumstances.\n" +
                "      Ministries shall be required to notify the Civil Service Commission immediately officers revert from acting appointments.\n");

        Rules_Section section341 = new Rules_Section("Effect of annual, casual or special leave.(ACTING APPOINTMENTS)","cat20","20108 –An acting officer will not be regarded as relinquishing the duties responsibilities of his acting appointment by proceeding on casual or special leave, provided that it is not necessary during such leave to appoint another officer to act in the duty post in question.");

        Rules_Section section342 = new Rules_Section("When payable(ACTING ALLOWANCE)","cat20","20201 – An officer duly gazetted as acting is eligible for acting allowance at the appropriate rate specified in Rule 20202 (i) – (iii), whichever is applicable, from the gazetted date of commencement of his acing appointment to the date immediately preceding the gazetted date of termination thereof (both dates inclusive).  No allowances will be paid if the period of acting appointment does not extend beyond 14 days.");
        Rules_Section section343 = new Rules_Section("Rates of Acting Allowance.(ACTING ALLOWANCE)","cat20"," 20202 – (i) When an officer has been appointed to act in a grade immedi-ately higher than his own, he will be regarded as adequately performing the full duties of the higher post and shall be entitled to full acting allowance.\n" +
                "\n" +
                "      (ii)  An officer appointed to act in a higher post shall be entitled to draw an acting allowance in full, representing the difference between his substantive salary and that point on the scale attached to the higher post which gives him a salary increase that is at least equal to the incremental step in his old scale.\n" +
                "\n" +
                "      (iii)  When an officer has been requested to act in a post one or more grades above his substantive rank, the maximum amount of his acting allowance, which he may receive, will be calculated as the difference between the salary of his substantive appointment and a point on the scale attached to the post immediately to his own which give him a salary increase that is, at least, equal to the incremental rate in the salary scale attached to his substantive grade.\n");
        Rules_Section section344 = new Rules_Section("Effect of Acting Appointment on Allowances(ACTING ALLOWANCE)","cat20","     20203 – Where an officer is made to act in a post higher than his substantive post he shall be entitled to all the privileges attached to that post.");
        Rules_Section section345 = new Rules_Section("Officers receiving personal allowances(ACTING ALLOWANCE)","cat20","20204 – If an officer is in receipt of a personal allowance in addition to the normal emoluments of his substantive office, such personal allowance will be treated as part of his substantive basic salary for the purpose of calculating acting allowance in accordance with Rule 20202.");



        Rules_Section section346 = new Rules_Section("Rate of Transport Allowance.(TRANSPORT ALLOWANCE)","cat21","     21101 – The following officers are entitled to transport allowance per month as follows:\n" +
                "               Officers on GL 14 and above         -       N580.58 per month\n" +
                "               Officer of GL 10 to 13                     -N463.32 per month\n" +
                "               Officer of GL 07 to 09           -N403.28 per month\n" +
                "               Officer of GL 01to 06                       -     N228.80per month\n");
        Rules_Section section347 = new Rules_Section("Kilometer allowance.(KILOMETER ALLOWANCE)","cat21","21201 – An officer who uses his private vehicle for official journey within and outside his duty station shall be paid kilometer allowance at the rate specified in the Rules below.");
        Rules_Section section348 = new Rules_Section("Kilometer allowance when not payable(KILOMETER ALLOWANCE)","cat21","21202 – Kilometer allowance shall not be drawn in respect of journey for which the officer utilises a transport at Government expense.  It shall also not be drawn in respect of journeys between an officer’s quarters and his normal place of work, in his private car.");
        Rules_Section section349 = new Rules_Section("Kilometer allowance payable on extra-ordinary journeys.(KILOMETER ALLOWANCE)","cat21","21203 – With the approval of the Head of Department, kilometer allowance may be granted to an officer in respect of any extraordinary journey between his quarter/residence and his normal place of work; if he is required by a superior officer to return to his place of work outside the normal working hours.");
        Rules_Section section350 = new Rules_Section("Bicycle(KILOMETER ALLOWANCE)","cat21","21204 – A junior officer who owns a bicycle and uses it on official journey shall be paid a kilometer allowance at the rate of 30k per kilometer.");
        Rules_Section section351 = new Rules_Section("Motor-cycle(KILOMETER ALLOWANCE)","cat21","21205 – An officer who owns a motor-cycle and uses it for official journey shall be entitled to allowance of 30k per kilometer for local runs and journeys outside his station.");
        Rules_Section section352 = new Rules_Section("Motor Vehicle(KILOMETER ALLOWANCE)","cat21","21206   – An officer who owns and maintain a motor vehicle and uses it for official journeys shall be paid kilometer allowance at the rate N1.00 per kilometer for local runs as well as journeys outside his station.");
        Rules_Section section353 = new Rules_Section("Approval to draw occasional kilometer allowance(KILOMETER ALLOWANCE)","cat21","     21207 – An officer who possesses a motor vehicle but is not eligible to be granted a motor vehicle advance may:\n" +
                "                (i)   with the prior approval of his Head of Department, in respect of\n" +
                "                       each journey draw occasional kilometer allowance for specific\n" +
                "                       journeys made on official duty in his own vehicle at the rate of\n" +
                "N1.00 per kilometer\n" +
                "\n" +
                "                (ii)  with the approval of his Head of Department, draw occasional \n" +
                "                     kilometer allowance in respect of any extraordinary journey between his quarters/residence and his normal place of work if he is required\n" +
                "                   by a superior officer to return to his place of work outside the normal\n" +
                "                   working hours at the rate of N1.00 per kilometer. \n \n");
        Rules_Section section354 = new Rules_Section("Limited to official runnings(KILOMETER ALLOWANCE)","cat21","21208 – Kilometer allowance may only be drawn in respect of distance travelled on official duty");
        Rules_Section section355 = new Rules_Section("House to office journeys excluded (KILOMETER ALLOWANCE)","cat21","21209 – Kilometer allowance may not be drawn in respect of journeys between an officer’s quarters/residence and his normal place of work, save as provided in Rules 21203 and 21207 (ii)");
        Rules_Section section356 = new Rules_Section("Claims for kilometer allowance (KILOMETER ALLOWANCE)","cat21","21210 – Claims for payment of kilometer allowance are required to be sub- mitted monthly.  Payment vouchers for kilometer allowance shall be supported by certificates that no other allowance has been or will be paid in respect of that month.  Claims not submitted within two months will be disallowed unless there is valid reason for the delay.");


        Rules_Section section357 = new Rules_Section("Not an emolument(LOCAL TRAVELLING ALLOWANCE)","cat22","22101 – Travelling Allowance is granted to enable officers to travel on official occasions in reasonable comfort and to compensate them for actual wear and tear of their personal effects.  The allowance is in no sense an emolument or an addition to an officer’s salary and if it is shown to the satisfaction of the Government that an officer has endangered his health by failing to provide himself with adequate camp equipment, food etc. he will be liable to be placed on half or no pay during any consequent illness.");
        Rules_Section section358 = new Rules_Section("General(LOCAL TRAVELLING ALLOWANCE)","cat22","     22102 – Subject to the exceptions specified in Rule 22103, an officer is                     eligible for travelling allowance for the period in Nigeria necessarily spent:\n" +
                "(a)\tin reaching his station on assuming or resuming duty from abroad; \n" +
                "(b)\tin travelling to and awaiting a passage at the place where his tour ends when proceeding on vacation leave abroad;\n" +
                "(c)\tin traveling to his new station on transfer;\n" +
                "(d)\ton duty away from his station; including any extension of such         period (apart from days in hospital) necessitated by his own           illness, provided the illness was not due to any fault or negligence    on his part.\n");

        Rules_Section section359 = new Rules_Section("Exceptions(LOCAL TRAVELLING ALLOWANCE)","cat22","\n" +
                "     22103 – Any portion of the periods listed in Rule 22102 to which any of the following circumstances apply fail to qualify the traveller for travelling allowances:\n" +
                "\n" +
                "(a)\twhen he is in hospital;\n" +
                "(b)\twhen he is detained in any place by the sickness of his wife;\n" +
                "(c)\twhen his subsistence is included in the transport facilities provided at Government expenses;\n" +
                "(d)\twhen he draws a refund of hotel expenses under Rule 22106\n" +
                "(e)\twhen he accompanies the Head of Government as a member of the latter’s personal staff (this exception does not apply to motor drivers and messengers)\n" +
                "(f)\twhen he is abroad the vessel to which he is permanently posted as an officer or employee of the Inland Waterways Department.\n" +
                "\n");
        Rules_Section section360 = new Rules_Section("“Personal” salary rights do not increase rate of travelling allowance.(LOCAL TRAVELLING ALLOWANCE)","cat22","     22104 – Personal conversions of salary or any additions to salary not involving promotion from one grade to another, which brings an officer’s salary into a higher category (as quoted in the first column of Rule 22105) than that applicable to his colleagues in the same grade do not make him eligible to receive travelling allowance at a rate higher than that for which his colleagues on normal salaries in the same grade are eligible.");

        Rules_Section section361 = new Rules_Section("Rate of Travelling allowance.(LOCAL TRAVELLING ALLOWANCE)","cat22","22105 – For the purpose of travelling allowance, in lieu of hotel bills for each night, five categories are recognised as follows:\n" +
                "\n" +
                "        Category 1        -      Abuja\n" +
                "        Category 2        -      Lagos\n" +
                "        Category 3        -       Port-Harcourt, Calabar, Kaduna, Bauchi, Jos, Ibadan\n" +
                "         Category 4       -       Other State Capitals\n" +
                "         Category 5      -       Other Cities and Towns\n");
        Rules_Section section362 = new Rules_Section("Refund of Hotel Bill.(LOCAL TRAVELLING ALLOWANCE)","cat22","22106 – If during any of the periods specified in CSR 22102, an officer is obliged to stay in a hotel, he shall be granted a refund of the hotel bill for the board and lodging of himself and his wife, (if accompanying him at Government expense).  Junior Officers shall similarly be lodged in a reasonably-priced hotel.  If the wife of an officer holding a senior post is obliged to stay in a hotel when traveling in Nigeria at Government expense or joining her husband from abroad or preceding him on vacation leave abroad, a similar refund may be granted. ");

        Rules_Section section363 = new Rules_Section("Submission of claims.(LOCAL TRAVELLING ALLOWANCE)","cat22","22107 – Claims for travelling allowance shall be submitted at the end of each month. Claims not submitted within two months will not be considered unless there is valid reason (such as serious illness) for the delay.");
        Rules_Section section364 = new Rules_Section("HARD-LYING ALLOWANCE","cat22","\n" +
                "      22201 – When in the opinion of the Head of Department, an officer eligible for travelling allowance under Rule 22102 undertakes touring sufficiently arduous to justify the payment of hard-lying allowance, authority may be sought by the Head of Department for such payment as a supplement to travelling allowance, at a half rate of the travelling allowance applicable under Rule 22105.  Hard-lying allowance will not be payable except to officers compelled by touring in exceptionally arduousconditions to live under caves or in temporary improvised structures in places where no other accommodation is available.\n");

        Rules_Section section365 = new Rules_Section("Appointment(AWARDS COMMITTEE) ","cat23","     23101 – There shall be constituted for the purpose of the rules in this Chapter an Award Committee which shall consist of a Judicial or Legal Officer appointed by the Head of Government as Chairman and such other persons as the Head of Government may from time to time appoint by notice in the gazette.");
        Rules_Section section366 = new Rules_Section("Function (AWARDS COMMITTEE)","cat23","23102 – The function of the Award Committee shall be to make investigations and recommendations in connection with Rule 23301 and 23303");
        Rules_Section section367 = new Rules_Section("Procedure (AWARDS COMMITTEE)","cat23","     23103 – The Awards Committee may make rules for regulating their proceedings, but no such rules shall come into force until they shall have been approved by the Head of Government.  An officer shall be entitled to appear personally before an Awards Committee or be represented in such manner as the Awards Committee may approve.  All conclusions of the Awards Committee shall be embodied in recommendations which shall be forwarded to the Head of Government. ");
        Rules_Section section368 = new Rules_Section("Provisional protection of inventions(AWARDS COMMITTEE) ","cat23","     23104 – An officer who has made an invention must immediately report it under secret cover to Government through his Head of Department.  He may, at his own expense, and shall at the expense of Government, if so required, lodge an application for provisional protection with the Registrar of Patents and Designs.  When so lodging any such application, the officer shall simultaneously send a copy thereof to the Head of Government through his Head of Department.  The Head of Government shall decide as expeditiously as possible whether the inventions shall be regarded as secret, and his decision shall be communicated forthwith to the officer’s Head of Department for the information of the officer.");


        Rules_Section section369 = new Rules_Section("Government’s decision on controlling rights.(CONTROLLING RIGHTS IN PATENTS)","cat23","23201 – As soon as practicable, the Head of Government shall decide whether the officer shall or shall not be allowed controlling rights in the patent and his decision shall be communicated to the officer’s Head of Department for the information of the officer.  Where an invention is in all respects alien to the employment of the officer, he shall normally be granted the full rights in such invention.  Pending the decision of the Head of Government as to the controlling rights, all rights in the inventions shall be deemed to belong to and be held in trust for the Government.");
        Rules_Section section370 = new Rules_Section("Controlling right by officer: (CONTROLLING RIGHTS IN PATENTS)","cat23","     23202 – If the Head of Government decides that the officer shall be allowed controlling rights in the patent, the following provisions shall apply:\n" +
                "\n" +
                "(a)\t The officer shall, subject to the provisions of Rule 23104, be responsible for all expenditure in taking out the patents;\n" +
                "(b)\tThe Head of Government may attach to his decision such conditions as he may think fit; in particular, he may reserve to Government a right of user of the invention free of royalty and/or may reserve to the Government right to share of any commercial proceeds;\n" +
                "(c)\tThe officer may, whether any rights are reserved under sub-paragraph (b) or not, apply to the Awards Committee, through his Head of Department, for an award in respect of his invention.\n");
        Rules_Section section371 = new Rules_Section("Controlling rights by officer, when not allowed: (CONTROLLING RIGHTS IN PATENTS)","cat23","23203 – If the Head of Government decides that the officer shall not be allowed controlling rights in the patents, the following provisions shall apply:\n" +
                "\n" +
                "(a)\tThe officer shall assign all his rights in the invention to Government;\n" +
                "(b)\tThe Government shall be responsible for all expenditure in taking out the patent;\n" +
                "(c)\tThe officer shall have a right to share in the commercial proceeds of his inventions;\n" +
                "(d)\tThe officer may apply to the Awards Committee through his Head of Department for an award in respect of his invention.\n");


        Rules_Section section372 = new Rules_Section("Determination.(AWARDS AND SHARES OF COMMERCIAL PROCEEDS)","cat23","     23301 – The question whether an award shall be made, the amount thereof, and the amount of the share of commercial proceeds to be reserved to the Government under Rule 23202 (b) shall be determined by the Head of Government after investigation by the Awards Committee in fixing the amount of any award or share of commercial proceeds:\n" +
                "\n" +
                "(a)\tany reasonable expenses to which the officer may have been put in connection with his invention shall be taken into account;\n" +
                "(b)\tthe reservation of a right of user free of royalty to the State Government shall not be taken into account, but if and when such right shall be exercised by the Government, a material change shall, for the purpose of Rule 23302, be deemed to have taken place.\n");
        Rules_Section section373 = new Rules_Section("Modification (AWARDS AND SHARES OF COMMERCIAL PROCEEDS)","cat23","     23302 – In the event of a material change taking place in the circumstances which existed at the time when an award or allocation of commercial proceeds was made, the original decision under Rule 23301 may be modified by the Head   of Government, after further investigation by the Awards Committee; provided that, in any such modification of the original decisions, the amount of an award which has been paid shall not be reduced.  Where the Inventor considers an award by the Head of Government unacceptable, he may apply to the court to determine whether or not such an award is a fair remuneration under the Patents and Designs Act.\n" +
                "\n" +
                "     23303 – Nothing in this Chapter shall affect the duties and liabilities of any officer under the provisions of the Official; Secrets Act, 1962 – as subsequently amended.\n");


        Rules_Section section374 = new Rules_Section("Definition (REWARD FOR OUTSTANDING WORK)","cat23","23401 – Reward in this section refers to departmental award of gifts or certificates to deserving officers.");
        Rules_Section section375 = new Rules_Section("Basis of Award (REWARD FOR OUTSTANDING WORK)","cat23","23402 – The recipient of an award must have been considered as the best on the basis of outstanding performance of duties and exemplary conduct during the years.");
        Rules_Section section376 = new Rules_Section("Frequency of Awards.(REWARD FOR OUTSTANDING WORK)","cat23","23403 – Each Ministry or Department may make such award to deserving officers annually.");
        Rules_Section section377 = new Rules_Section("Nature of Awards (REWARD FOR OUTSTANDING WORK)","cat23","     23404 – The award may be in the form of certificates, medals, gifts of cash or kind.");
        Rules_Section section378 = new Rules_Section("Procedure for selections. (REWARD FOR OUTSTANDING WORK)","cat23","23405 – The Head of Department may be assisted by a committee in selecting deserving officers from nominations made by Heads of Divisions or Sections.");
        Rules_Section section379 = new Rules_Section("Unique acts. (REWARD FOR OUTSTANDING WORK)","cat23","23306 – Any officer who, in the course of his official duties, carries out a unique act or, in perilous circumstances, secures the safety of human life or property may also be considered for an award as the occasion warrants.");
        Rules_Section section380 = new Rules_Section("Long Service award. (REWARD FOR OUTSTANDING WORK)","cat23","23307 – An officer who has served continuously for 15, 25, 35 years with good record of service shall be eligible for a long service award in kind, commensurate with his length of service.");


        Rules_Section section381 = new Rules_Section("Normal working week","cat24","24101 – The normal working time per week for the purpose of computing overtime payment under this Chapter shall consist of 5 days of 8 hours a day, from 8.00 a.m. to 4.00 p.m.");
        Rules_Section section382 = new Rules_Section("Payment of Overtime.","cat24","24102 – Overtime fees shall be paid to an officer who works over and above the normal working day.");
        Rules_Section section383 = new Rules_Section("Exceptions.","cat24","24103 – Officers in the following categories do not qualify for the payment of overtimes:\n" +
                "(i)  Officers on GL 08 and above; other than those who, by the nature\n" +
                "of   their work, are regarded as qualified for overtime payment;\n" +
                "(ii) Fire Fighting Service.\n" +
                "(iii) Officers whose special terms of employment require attendance for \n" +
                "       work or duty at any time and for any period that the exigencies of the\n" +
                "service may demand and whose conditions of employment were \n" +
                "taken into consideration when their emoluments werefixed;\n" +
                "(iv) Officers whose work does not admit of supervision and whose hours \n" +
                "       of work or attendance are not prescribed or schedule e.g.   \n" +
                "Pharmacists, Hospital Orderlies, Ambulance Drivers and Ferry Men;\n" +
                "(v)    Medical and Dental Surgeons and other medical personnel who are \n" +
                "         currently entitled to call-duty or shift duty allowance;\n" +
                "                   (vi)  Officers or employees whose operational requirements, activities\n" +
                "                          and services, are regulated on a relay or shift basis.     \n");
        Rules_Section section384 = new Rules_Section("Method of Computing overtime","cat24","     24104 – (a) Overtime will be calculated in half hours and to nearest half hours.  Example – A man works 15 minutes overtime; that period is disregarded for the purpose of overtime payment.    \n" +
                "(b) Overtime will be computed in respect of each day and there will be no aggregation of periods disregarded under section(a) of this Rule.  Payment will be made monthly.\n");
        Rules_Section section385 = new Rules_Section("Authority for working overtime ","cat24","24105 – Only overtime work duly authorised by the responsible officer shall qualify for payment.");
        Rules_Section section386 = new Rules_Section("Rate of payment of overtime","cat24","  24106 – Payment for overtime on normal working days will be at the rate of time-and-a-quarter.");
        Rules_Section section387 = new Rules_Section("Work-Free days","cat24","24107 – For the purpose of the Chapter a “work free day” means that day in each period of seven days which is regarded as work-free, e.g. public holidays and for large number of officers, Saturday and Sunday are the normal work-free days but this is not always so, hence the need for a generic term. ");
        Rules_Section section388 = new Rules_Section("Payment for time worked","cat24","24108 – For time worked on work-free days, double time hourly rate will be paid, subject to a minimum payment for four hours in respect of each day");
        Rules_Section section389 = new Rules_Section("Payment for time worked on Public Holidays.","cat24","     24109 – Established staff will receive payment for actual time worked up to eight hours at the scheduled double time hourly rate subject to a minimum payment as for four hours. Time worked in excess of eight hours will be paid at the scheduled time-and-a-half rate");
        Rules_Section section390 = new Rules_Section("Fees paid by the public for overtime services rendered by officers.","cat24","24110 – Fees paid by the public for overtime services rendered by officers are credited to Government revenue.  The officers in question will receive payment for overtime in accordance with the provisions of this Chapter.");
        Rules_Section section391 = new Rules_Section("Effect of overtime on acting appointment.","cat24","24111 – Where an officer eligible for overtime payments is gazetted as acting in a post which attracts overtime payments, he will be paid for overtime, on his full acting salary.");
        Rules_Section section392 = new Rules_Section("Limitation of total monthly overtime","cat24","24112 – No officer qualified for overtime payments shall work overtime in excess of 45 hours in any one month, unless this is authorised in special circumstances by the Head of Department in connection with an emergency i.e. an unexpected situation in which work arises which must be done immediately and cannot be done without exceptionally long hours of overtime.");
        Rules_Section section393 = new Rules_Section("Shift duty allowance","cat24","24113 – Where it is deemed necessary to maintain a shift duty system officers involved in the scheme shall be eligible for 12% of their basic salary for shift duty respectively.");
        Rules_Section section394 = new Rules_Section("Free overtime service in public interest.","cat24","24114 – The obligation to work after normal working house as may be necessary, in the interest of the PublicService shall continue to be in force, even though overtime payments are not in issue.");



        Rules_Section[] sections = new Rules_Section[]{
                section1,section2,section3,section4,section5,section6,section7,section8,section9,section10,
                section11,section12,section13,section14,section15,section16,section17,section18,section19,section20,
                section21,section22,section23,section24,section25,section26,section27,section28,section29,section30,
                section31,section32,section33,section34,section35,section36,section37,section38,section39,section40,section41,
                  section42,section43,section44,section45,section46,section47,section48,section49,section50,section51,
                  section52,section53,section54,section55,section56,section57,section58,section59,section60,
                  section61,section62,section63,section64,section65,section66,section67,section68,section69,section70,section71,
                  section72,section73,section74,section75,section76,section77,section78,section79,section80,
                  section81,section82,section83,section84,section85,section86,section87,section88,section89,section90,section91,
                  section92,section93,section94,section95,section96,section97,section98,section99,section100,






                section101,section102,section103,section104,section105,section106,section107,section108,section109,section110,
                section111,section112,section113,section114,section115,section116,section117,section118,section119,section120,
                section121,section122,section123,section124,section125,section126,section127,section128,section130,
                section131,section132,section133,section134,section135,section136,section137,section138,section139,section140,section141,
                section142,section143,section144,section145,section146,section147,section148,section149,section150,section151,
                section152,section153,section154,section155,section156,section157,section158,section159,section160,
                section161,section162,section163,section164,section165,section166,section167,section168,section169,section170,section171,
                section172,section173,section174,section175,section176,section177,section178,section179,section180,
                section181,section182,section183,section184,section185,section186,section187,section188,section189,section190,section191,
                section192,section193,section194,section195,section196,section197,section198,section199,section200,




                section201,section202,section203,section204,section205,section206,section207,section208,section209,section210,
                section211,section212,section213,section214,section215,section216,section217,section218,section219,section220,
                section221,section222,section223,section224,section225,section226,section227,section228,section229,section230,
                section231,section232,section233,section234,section235,section236,section237,section238,section239,section240,section241,
                section242,section243,section244,section245,section246,section247,section248,section249,section250,section251,
                section252,section253,section254,section255,section256,section257,section258,section259,section260,
                section261,section262,section263,section264,section265,section266,section267,section268,section269,section270,section271,
                section272,section273,section274,section275,section276,section277,section278,section279,section280,
                section281,section282,section283,section284,section285,section286,section287,section288,section289,section290,section291,
                section292,section293,section294,section295,section296,section297,section298,section299,section300,


                section301,section302,section303,section304,section305,section306,section307,section308,section309,section310,
                section311,section312,section313,section314,section315,section316,section317,section318,section319,section320,
                section321,section322,section323,section324,section325,section326,section327,section328,section329,section330,
                section331,section332,section333,section334,section335,section336,section337,section338,section339,section340,section341,
                section342,section343,section344,section345,section346,section347,section348,section349,section350,section351,
                section352,section353,section354,section355,section356,section357,section358,section359,section360,
                section361,section362,section363,section364,section365,section366,section367,section368,section369,section370,section371,
                section372,section373,section374,section375,section376,section377,section378,section379,section380,
                section381,section382,section383,section384,section385,section386,section387,section388,section389,section390,section391,
                section392,section393,section394




          };

        return sections;
    }


}
