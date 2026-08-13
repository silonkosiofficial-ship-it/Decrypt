package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class X extends R3.a {
    public static final android.os.Parcelable.Creator<p184s3.X> CREATOR = new p184s3.C7142w0();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f54150C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f54151D;

    public X(java.lang.String str, java.lang.String str2) {
        this.f54150C = str;
        this.f54151D = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        java.lang.String str = this.f54150C;
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 1, str, false);
        R3.c.q(parcel, 2, this.f54151D, false);
        R3.c.b(parcel, iA);
    }
}
