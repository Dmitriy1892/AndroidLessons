package com.startandroidlessons.p0691parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public class MyObject implements Parcelable {

    final static String LOG_TAG = "myLogs";

    public String s;
    public int i;

    protected MyObject(String _s, int _i) {
        Log.d(LOG_TAG, "MyObject(String _s, int _i)");
        s = _s;
        i = _i;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        Log.d(LOG_TAG, "writeToParsel");
        parcel.writeString(s);
        parcel.writeInt(i);
    }

    public static final Creator<MyObject> CREATOR = new Creator<MyObject>() {
        @Override
        public MyObject createFromParcel(Parcel in) {
            Log.d(LOG_TAG, "createFromParcel");
            return new MyObject(in);
        }

        @Override
        public MyObject[] newArray(int size) {
            return new MyObject[size];
        }
    };

    private MyObject(Parcel parcel) {
        Log.d(LOG_TAG, "MyOdject(Parcel parcel)");
        s = parcel.readString();
        i = parcel.readInt();
    }
}
