package p194t3;

/* JADX INFO: loaded from: classes.dex */
public final class a extends R3.a {
    public static final android.os.Parcelable.Creator<p194t3.a> CREATOR = new p194t3.b();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f54617C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f54618D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.lang.String f54619E;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f54617C = str;
        this.f54618D = str2;
        this.f54619E = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        java.lang.String str = this.f54617C;
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 1, str, false);
        R3.c.q(parcel, 2, this.f54618D, false);
        R3.c.q(parcel, 3, this.f54619E, false);
        R3.c.b(parcel, iA);
    }
}
