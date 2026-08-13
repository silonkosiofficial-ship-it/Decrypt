package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class T extends com.google.android.gms.internal.ads.AbstractC2264Db implements p184s3.V {
    T(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // p184s3.V
    public final void C() {
        L0(2, q0());
    }

    @Override // p184s3.V
    public final void F1(p184s3.InterfaceC7122p0 interfaceC7122p0) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC7122p0);
        L0(45, parcelQ0);
    }

    @Override // p184s3.V
    public final void I5(com.google.android.gms.internal.ads.InterfaceC2525Kc interfaceC2525Kc) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2525Kc);
        L0(40, parcelQ0);
    }

    @Override // p184s3.V
    public final void J() {
        L0(5, q0());
    }

    @Override // p184s3.V
    public final boolean K3(p184s3.X1 x6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, x6);
        android.os.Parcel parcelY0 = y0(4, parcelQ0);
        boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcelY0);
        parcelY0.recycle();
        return zG;
    }

    @Override // p184s3.V
    public final void T1(p184s3.c2 c2Var) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, c2Var);
        L0(13, parcelQ0);
    }

    @Override // p184s3.V
    public final void V0(p184s3.i2 i2Var) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, i2Var);
        L0(39, parcelQ0);
    }

    @Override // p184s3.V
    public final void V5(p184s3.E e6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, e6);
        L0(20, parcelQ0);
    }

    @Override // p184s3.V
    public final void Y() {
        L0(6, q0());
    }

    @Override // p184s3.V
    public final void Y4(boolean z6) {
        android.os.Parcel parcelQ0 = q0();
        int i6 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
        parcelQ0.writeInt(z6 ? 1 : 0);
        L0(34, parcelQ0);
    }

    @Override // p184s3.V
    public final void e6(boolean z6) {
        android.os.Parcel parcelQ0 = q0();
        int i6 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
        parcelQ0.writeInt(z6 ? 1 : 0);
        L0(22, parcelQ0);
    }

    @Override // p184s3.V
    public final p184s3.c2 i() {
        android.os.Parcel parcelY0 = y0(12, q0());
        p184s3.c2 c2Var = (p184s3.c2) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcelY0, p184s3.c2.CREATOR);
        parcelY0.recycle();
        return c2Var;
    }

    @Override // p184s3.V
    public final void i2(p184s3.InterfaceC7101i0 interfaceC7101i0) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC7101i0);
        L0(8, parcelQ0);
    }

    @Override // p184s3.V
    public final void j4(p184s3.Q1 q6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, q6);
        L0(29, parcelQ0);
    }

    @Override // p184s3.V
    public final p184s3.U0 k() {
        p184s3.U0 s6;
        android.os.Parcel parcelY0 = y0(41, q0());
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            s6 = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            s6 = iInterfaceQueryLocalInterface instanceof p184s3.U0 ? (p184s3.U0) iInterfaceQueryLocalInterface : new p184s3.S0(strongBinder);
        }
        parcelY0.recycle();
        return s6;
    }

    @Override // p184s3.V
    public final p184s3.Y0 l() {
        p184s3.Y0 v6;
        android.os.Parcel parcelY0 = y0(26, q0());
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            v6 = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            v6 = iInterfaceQueryLocalInterface instanceof p184s3.Y0 ? (p184s3.Y0) iInterfaceQueryLocalInterface : new p184s3.V0(strongBinder);
        }
        parcelY0.recycle();
        return v6;
    }

    @Override // p184s3.V
    public final void l1(p184s3.N0 n6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, n6);
        L0(42, parcelQ0);
    }

    @Override // p184s3.V
    public final void m6(X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        L0(44, parcelQ0);
    }

    @Override // p184s3.V
    public final X3.a n() {
        android.os.Parcel parcelY0 = y0(1, q0());
        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return aVarY0;
    }

    @Override // p184s3.V
    public final void o3(p184s3.X1 x6, p184s3.K k6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, x6);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, k6);
        L0(43, parcelQ0);
    }

    @Override // p184s3.V
    public final java.lang.String t() {
        android.os.Parcel parcelY0 = y0(31, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }

    @Override // p184s3.V
    public final void u3(p184s3.H h6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, h6);
        L0(7, parcelQ0);
    }
}
