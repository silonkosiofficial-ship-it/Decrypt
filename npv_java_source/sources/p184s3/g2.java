package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class g2 extends R3.a {
    public static final android.os.Parcelable.Creator<p184s3.g2> CREATOR = new p184s3.h2();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f54252C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f54253D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public p184s3.W0 f54254E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final android.os.Bundle f54255F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final java.lang.String f54256G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final java.lang.String f54257H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final java.lang.String f54258I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final java.lang.String f54259J;

    public g2(java.lang.String str, long j6, p184s3.W0 w6, android.os.Bundle bundle, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f54252C = str;
        this.f54253D = j6;
        this.f54254E = w6;
        this.f54255F = bundle;
        this.f54256G = str2;
        this.f54257H = str3;
        this.f54258I = str4;
        this.f54259J = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        java.lang.String str = this.f54252C;
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 1, str, false);
        R3.c.n(parcel, 2, this.f54253D);
        R3.c.p(parcel, 3, this.f54254E, i6, false);
        R3.c.e(parcel, 4, this.f54255F, false);
        R3.c.q(parcel, 5, this.f54256G, false);
        R3.c.q(parcel, 6, this.f54257H, false);
        R3.c.q(parcel, 7, this.f54258I, false);
        R3.c.q(parcel, 8, this.f54259J, false);
        R3.c.b(parcel, iA);
    }
}
