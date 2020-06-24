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
        Finance_Section section3 = new Finance_Section("Scope and Force of Ondo State of Nigeria Financial Regulations","cat1","Nothing in these Financial Regulations can over-rule or impair any obligation laid on any person neither by any Ordinance, Act or Law nor in particular the responsibilities of the Auditor-General and the Accountant-General under the Public Administration Law, Cap. 122 of the Laws of Ondo State of Nigeria, 2006");
        Finance_Section section4 = new Finance_Section("Scope and Force of Ondo State of Nigeria Financial Regulations","cat1","Ondo State of Nigeria Financial Regulations do not apply to Local Governments.  The Financial Regulations for Local Governments are embodied in a separate publication entitled ‘Government Financial Memoranda’.");
        Finance_Section section5 = new Finance_Section("Scope and Force of Ondo State of Nigeria Financial Regulations","cat1",".      Where there is any conflict between any regulations or circular previously issued and these Financial Regulations, the latter will prevail.  Except in regard to purely transitory matters, circulars amending these Regulations will be incorporated as soon as possible in formal amendment slip or by the reissue of revised Chapters or pages (vide Regulations 01007 (c).");
        Finance_Section section6 = new Finance_Section("Issue and Responsibility","cat1","It is mandatory for officers on GL. 08 and above to procure Financial Regulations and other regulatory books; and acquaint themselves with their contents. However, office copies are to be provided to enable officers have access to them.");
        Finance_Section section7 = new Finance_Section("Each Financial Regulation has been given a number containing five digits of which the first two indicate the chapter and the last three the number of the individual Financial Regulation within the chapter e.g. Financial Regulation Number 14011 is the eleventh Financial Regulation in Chapter 14.  This arrangement provides for the inclusion of the number of Regulations up to nine hundred and ninety-nine in any one chapter.","cat1","Method of including amendments Responsibility for amendments");
        Finance_Section section8 = new Finance_Section("(a) The Financial Regulations should be amended in the normal administrative methods when necessary.(b) Within the time frame of ten years, all amendments and circulars should be consolidated into an updated document.\n","cat1","Method of including amendments Responsibility for amendments\n");
        Finance_Section section10 = new Finance_Section("Definition Financial Authorities","cat1","Financial authorities in Ondo State remain the legal instruments that sanction and guide all public officers in carrying out specific government financial transactions. Such transaction (financial) may include the receipt, custody of accounting for government revenue and earnings; the disbursement of funds including development funds; safekeeping and utilisation of the assets of the government; and the procurement are dealt with here under.");
        Finance_Section section11 = new Finance_Section("Charge of the treasury and (ministry of finance) and Accountant General of the State","cat1","The Public Administration Law, Cap. 122 of the Laws of Ondo State of Nigeria, 2006 has assigned to the Accountant-General the responsibility for all financial business of the State government. Warrants issued by the treasury (ministry of finance) from time to time authorizing the Accountant-General of the State to disburse funds as appropriated by the State House of Assembly (SHoA) are instrument through which the exercises control over the utilisation of public money. This entails that, no made shall be made except on the authority of the warrant duly signed and issued by the treasury (ministry of finance).");
        Finance_Section section12 = new Finance_Section("Financial regulations ","cat1","01012. The state treasury (ministry of finance) and the office of the Accountant-General of the State shall from time to time issue specific financial regulations which shall be in accordance with existing laws and policies of the State government. Such regulations shall generally apply to all the State Public Service including ministries, departments and agencies of government.");
        Finance_Section section13 = new Finance_Section("General Rule 1","cat1","Rule 101.1 \n" +
                "The Financial Rules are established by the Accountant General of the State in accordance with the provisions of the Financial Regulations. They shall govern all the financial management activities of Ondo State. The Accountant General of the State hereby delegates authority and assigns responsibility for the implementation of the Financial Regulations and Rules to all Accounting Directors and Officers across Ministries, Departments and Agencies (MDAs) of Government in the State. In the application of the Financial Regulations and Rules, officers shall be guided by the principles of effective and efficient financial management and the exercise of economy. \n");
        Finance_Section section14 = new Finance_Section("General Rule 2","cat1","Rule 101.2\n" +
                "All employees of the State (permanent, temporary including contractors) are obliged to comply with the Financial Regulations and Rules and with Office Instructions issued in connection with those Regulations and Rules. Any employee who contravenes the Financial Regulations and Rules or corresponding Office Instructions may be held personally accountable and financially liable for his or her actions.\n");







        Finance_Section section15 = new Finance_Section("","cat1","");
        Finance_Section section16 = new Finance_Section("","cat1","");

        Finance_Section[] sections = new Finance_Section[]{
                section1,section2,section3,section4,section5,section6,section7,section8,section10,section11,section12,section13,section14
        };

        return sections;
    }

    }
