package p214v3;

/* JADX INFO: loaded from: classes.dex */
public final class D extends R3.a {
    public static final android.os.Parcelable.Creator<p214v3.D> CREATOR = new p214v3.E();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f55824C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f55825D;

    D(java.lang.String str, int i6) {
        this.f55824C = str == null ? "" : str;
        this.f55825D = i6;
    }

    public static p214v3.D f(java.lang.Throwable th) {
        p184s3.W0 w0A = com.google.android.gms.internal.ads.P70.a(th);
        return new p214v3.D(com.google.android.gms.internal.ads.AbstractC2829Sg0.d(th.getMessage()) ? w0A.f54146D : th.getMessage(), w0A.f54145C);
    }

    public final p214v3.C e() {
        return new p214v3.C(this.f55824C, this.f55825D);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        java.lang.String str = this.f55824C;
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 1, str, false);
        R3.c.k(parcel, 2, this.f55825D);
        R3.c.b(parcel, iA);
    }
}
