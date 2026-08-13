package androidx.versionedparcelable;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"À"})
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = new androidx.versionedparcelable.ParcelImpl.a();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final F2.a f23786C;

    static class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public androidx.versionedparcelable.ParcelImpl createFromParcel(android.os.Parcel parcel) {
            return new androidx.versionedparcelable.ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public androidx.versionedparcelable.ParcelImpl[] newArray(int i6) {
            return new androidx.versionedparcelable.ParcelImpl[i6];
        }
    }

    protected ParcelImpl(android.os.Parcel parcel) {
        this.f23786C = new androidx.versionedparcelable.b(parcel).u();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        new androidx.versionedparcelable.b(parcel).L(this.f23786C);
    }
}
