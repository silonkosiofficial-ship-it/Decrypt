package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
final class p implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.p> CREATOR = new androidx.fragment.app.p.a();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    java.util.ArrayList f22636C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    java.util.ArrayList f22637D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    androidx.fragment.app.C2067b[] f22638E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    int f22639F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    java.lang.String f22640G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    java.util.ArrayList f22641H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    java.util.ArrayList f22642I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    java.util.ArrayList f22643J;

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public androidx.fragment.app.p createFromParcel(android.os.Parcel parcel) {
            return new androidx.fragment.app.p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public androidx.fragment.app.p[] newArray(int i6) {
            return new androidx.fragment.app.p[i6];
        }
    }

    public p() {
        this.f22640G = null;
        this.f22641H = new java.util.ArrayList();
        this.f22642I = new java.util.ArrayList();
    }

    public p(android.os.Parcel parcel) {
        this.f22640G = null;
        this.f22641H = new java.util.ArrayList();
        this.f22642I = new java.util.ArrayList();
        this.f22636C = parcel.createStringArrayList();
        this.f22637D = parcel.createStringArrayList();
        this.f22638E = (androidx.fragment.app.C2067b[]) parcel.createTypedArray(androidx.fragment.app.C2067b.CREATOR);
        this.f22639F = parcel.readInt();
        this.f22640G = parcel.readString();
        this.f22641H = parcel.createStringArrayList();
        this.f22642I = parcel.createTypedArrayList(androidx.fragment.app.C2068c.CREATOR);
        this.f22643J = parcel.createTypedArrayList(androidx.fragment.app.n.k.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeStringList(this.f22636C);
        parcel.writeStringList(this.f22637D);
        parcel.writeTypedArray(this.f22638E, i6);
        parcel.writeInt(this.f22639F);
        parcel.writeString(this.f22640G);
        parcel.writeStringList(this.f22641H);
        parcel.writeTypedList(this.f22642I);
        parcel.writeTypedList(this.f22643J);
    }
}
