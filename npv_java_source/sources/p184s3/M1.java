package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class M1 extends R3.a {
    public static final android.os.Parcelable.Creator<p184s3.M1> CREATOR = new p184s3.N1();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f54136C;

    M1(java.lang.String str) {
        this.f54136C = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        java.lang.String str = this.f54136C;
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 15, str, false);
        R3.c.b(parcel, iA);
    }
}
