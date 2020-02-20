package com.damilolaakinterinwa.android.civilserviceregulation;



import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/**
 * The backing data object for an {@link com.thoughtbot.expandablerecyclerview.models.ExpandableGroup}
 */
public class MyExpandableGroup<T extends Parcelable> implements Parcelable {
    private String title;
    private List<T> items;
    private String articlenumber;

    public MyExpandableGroup(String title, List<T> items,String articlenumber) {
        this.title = title;
        this.items = items;
        this.articlenumber = articlenumber;
    }

    public String getTitle() {
        return title;
    }

    public String getArticlenumber() {
        return articlenumber;
    }

    public List<T> getItems() {
        return items;
    }

    public int getItemCount() {
        return items == null ? 0 : items.size();
    }

    @Override
    public String toString() {
        return "ExpandableGroup{" +
                "title='" + title + '\'' +
                ", items=" + items +
                '}';
    }

    protected MyExpandableGroup(Parcel in) {
        title = in.readString();
        articlenumber = in.readString();
        byte hasItems = in.readByte();
        int size = in.readInt();
        if (hasItems == 0x01) {
            items = new ArrayList<T>(size);
            Class<?> type = (Class<?>) in.readSerializable();
            in.readList(items, type.getClassLoader());
        } else {
            items = null;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        if (items == null) {
            dest.writeByte((byte) (0x00));
            dest.writeInt(0);
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(items.size());
            final Class<?> objectsType = items.get(0).getClass();
            dest.writeSerializable(objectsType);
            dest.writeList(items);
        }
    }

    @SuppressWarnings("unused")
    public static final Creator<MyExpandableGroup> CREATOR =
            new Creator<MyExpandableGroup>() {
                @Override
                public MyExpandableGroup createFromParcel(Parcel in) {
                    return new MyExpandableGroup(in);
                }

                @Override
                public MyExpandableGroup[] newArray(int size) {
                    return new MyExpandableGroup[size];
                }
            };
}
