package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3844gm extends com.google.android.gms.internal.ads.AbstractC2264Db implements android.os.IInterface {
    C3844gm(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final void P1(X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        L0(16, parcelQ0);
    }

    public final com.google.android.gms.internal.ads.InterfaceC3944hh T2() {
        android.os.Parcel parcelY0 = y0(19, q0());
        com.google.android.gms.internal.ads.InterfaceC3944hh interfaceC3944hhO6 = com.google.android.gms.internal.ads.AbstractBinderC3834gh.o6(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return interfaceC3944hhO6;
    }

    public final double d() {
        android.os.Parcel parcelY0 = y0(7, q0());
        double d6 = parcelY0.readDouble();
        parcelY0.recycle();
        return d6;
    }

    public final p184s3.Y0 d2() {
        android.os.Parcel parcelY0 = y0(17, q0());
        p184s3.Y0 y0O6 = p184s3.X0.o6(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return y0O6;
    }

    public final android.os.Bundle e() {
        android.os.Parcel parcelY0 = y0(15, q0());
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcelY0, android.os.Bundle.CREATOR);
        parcelY0.recycle();
        return bundle;
    }

    public final com.google.android.gms.internal.ads.InterfaceC4712oh f3() {
        android.os.Parcel parcelY0 = y0(5, q0());
        com.google.android.gms.internal.ads.InterfaceC4712oh interfaceC4712ohO6 = com.google.android.gms.internal.ads.AbstractBinderC4602nh.o6(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return interfaceC4712ohO6;
    }

    public final X3.a l() {
        android.os.Parcel parcelY0 = y0(21, q0());
        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return aVarY0;
    }

    public final java.lang.String m() {
        android.os.Parcel parcelY0 = y0(4, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }

    public final java.lang.String n() {
        android.os.Parcel parcelY0 = y0(6, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }

    public final X3.a n6() {
        android.os.Parcel parcelY0 = y0(20, q0());
        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return aVarY0;
    }

    public final java.util.List o6() {
        android.os.Parcel parcelY0 = y0(3, q0());
        java.util.ArrayList arrayListB = com.google.android.gms.internal.ads.AbstractC2338Fb.b(parcelY0);
        parcelY0.recycle();
        return arrayListB;
    }

    public final java.lang.String p() {
        android.os.Parcel parcelY0 = y0(2, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }

    public final X3.a p4() {
        android.os.Parcel parcelY0 = y0(18, q0());
        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return aVarY0;
    }

    public final void p6(X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        L0(11, parcelQ0);
    }

    public final java.lang.String q() {
        android.os.Parcel parcelY0 = y0(9, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }

    public final void q6(X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        L0(12, parcelQ0);
    }

    public final void r6(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar2);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar3);
        L0(22, parcelQ0);
    }

    public final java.lang.String s() {
        android.os.Parcel parcelY0 = y0(8, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }

    public final boolean s6() {
        android.os.Parcel parcelY0 = y0(14, q0());
        boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcelY0);
        parcelY0.recycle();
        return zG;
    }

    public final boolean t6() {
        android.os.Parcel parcelY0 = y0(13, q0());
        boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcelY0);
        parcelY0.recycle();
        return zG;
    }

    public final void w() {
        L0(10, q0());
    }
}
