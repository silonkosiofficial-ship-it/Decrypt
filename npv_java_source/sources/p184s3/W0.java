package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class W0 extends R3.a {
    public static final android.os.Parcelable.Creator<p184s3.W0> CREATOR = new p184s3.C7128r1();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f54145C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f54146D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.lang.String f54147E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public p184s3.W0 f54148F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public android.os.IBinder f54149G;

    public W0(int i6, java.lang.String str, java.lang.String str2, p184s3.W0 w6, android.os.IBinder iBinder) {
        this.f54145C = i6;
        this.f54146D = str;
        this.f54147E = str2;
        this.f54148F = w6;
        this.f54149G = iBinder;
    }

    public final p104k3.C6885b e() {
        p104k3.C6885b c6885b;
        p184s3.W0 w6 = this.f54148F;
        if (w6 == null) {
            c6885b = null;
        } else {
            java.lang.String str = w6.f54147E;
            c6885b = new p104k3.C6885b(w6.f54145C, w6.f54146D, str);
        }
        return new p104k3.C6885b(this.f54145C, this.f54146D, this.f54147E, c6885b);
    }

    public final p104k3.m f() {
        p104k3.C6885b c6885b;
        p184s3.W0 w6 = this.f54148F;
        p184s3.U0 s6 = null;
        if (w6 == null) {
            c6885b = null;
        } else {
            c6885b = new p104k3.C6885b(w6.f54145C, w6.f54146D, w6.f54147E);
        }
        int i6 = this.f54145C;
        java.lang.String str = this.f54146D;
        java.lang.String str2 = this.f54147E;
        android.os.IBinder iBinder = this.f54149G;
        if (iBinder != null) {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            s6 = iInterfaceQueryLocalInterface instanceof p184s3.U0 ? (p184s3.U0) iInterfaceQueryLocalInterface : new p184s3.S0(iBinder);
        }
        return new p104k3.m(i6, str, str2, c6885b, p104k3.u.d(s6));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int i10 = this.f54145C;
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, i10);
        R3.c.q(parcel, 2, this.f54146D, false);
        R3.c.q(parcel, 3, this.f54147E, false);
        R3.c.p(parcel, 4, this.f54148F, i6, false);
        R3.c.j(parcel, 5, this.f54149G, false);
        R3.c.b(parcel, iA);
    }
}
