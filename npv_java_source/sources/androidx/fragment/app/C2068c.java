package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C2068c implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.C2068c> CREATOR = new androidx.fragment.app.C2068c.a();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final java.util.List f22398C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final java.util.List f22399D;

    /* JADX INFO: renamed from: androidx.fragment.app.c$a */
    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public androidx.fragment.app.C2068c createFromParcel(android.os.Parcel parcel) {
            return new androidx.fragment.app.C2068c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public androidx.fragment.app.C2068c[] newArray(int i6) {
            return new androidx.fragment.app.C2068c[i6];
        }
    }

    C2068c(android.os.Parcel parcel) {
        this.f22398C = parcel.createStringArrayList();
        this.f22399D = parcel.createTypedArrayList(androidx.fragment.app.C2067b.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeStringList(this.f22398C);
        parcel.writeTypedList(this.f22399D);
    }
}
