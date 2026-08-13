package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.im, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4063im extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC4282km {
    C4063im(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final java.lang.String A() {
        android.os.Parcel parcelY0 = y0(9, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final void C() {
        L0(19, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final void D5(X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        L0(22, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final void P1(X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        L0(20, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final boolean Y() {
        android.os.Parcel parcelY0 = y0(17, q0());
        boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcelY0);
        parcelY0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final double d() {
        android.os.Parcel parcelY0 = y0(8, q0());
        double d6 = parcelY0.readDouble();
        parcelY0.recycle();
        return d6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final float e() {
        android.os.Parcel parcelY0 = y0(23, q0());
        float f6 = parcelY0.readFloat();
        parcelY0.recycle();
        return f6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final float g() {
        android.os.Parcel parcelY0 = y0(24, q0());
        float f6 = parcelY0.readFloat();
        parcelY0.recycle();
        return f6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final android.os.Bundle h() {
        android.os.Parcel parcelY0 = y0(16, q0());
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcelY0, android.os.Bundle.CREATOR);
        parcelY0.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final boolean h0() {
        android.os.Parcel parcelY0 = y0(18, q0());
        boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcelY0);
        parcelY0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final float i() {
        android.os.Parcel parcelY0 = y0(25, q0());
        float f6 = parcelY0.readFloat();
        parcelY0.recycle();
        return f6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final p184s3.Y0 j() {
        android.os.Parcel parcelY0 = y0(11, q0());
        p184s3.Y0 y0O6 = p184s3.X0.o6(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return y0O6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final com.google.android.gms.internal.ads.InterfaceC3944hh k() {
        android.os.Parcel parcelY0 = y0(12, q0());
        com.google.android.gms.internal.ads.InterfaceC3944hh interfaceC3944hhO6 = com.google.android.gms.internal.ads.AbstractBinderC3834gh.o6(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return interfaceC3944hhO6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final com.google.android.gms.internal.ads.InterfaceC4712oh l() {
        android.os.Parcel parcelY0 = y0(5, q0());
        com.google.android.gms.internal.ads.InterfaceC4712oh interfaceC4712ohO6 = com.google.android.gms.internal.ads.AbstractBinderC4602nh.o6(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return interfaceC4712ohO6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final X3.a m() {
        android.os.Parcel parcelY0 = y0(13, q0());
        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return aVarY0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final X3.a n() {
        android.os.Parcel parcelY0 = y0(14, q0());
        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return aVarY0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final X3.a p() {
        android.os.Parcel parcelY0 = y0(15, q0());
        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return aVarY0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final void p3(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar2);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar3);
        L0(21, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final java.lang.String q() {
        android.os.Parcel parcelY0 = y0(7, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final java.lang.String s() {
        android.os.Parcel parcelY0 = y0(4, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final java.lang.String t() {
        android.os.Parcel parcelY0 = y0(6, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final java.lang.String u() {
        android.os.Parcel parcelY0 = y0(2, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final java.util.List v() {
        android.os.Parcel parcelY0 = y0(3, q0());
        java.util.ArrayList arrayListB = com.google.android.gms.internal.ads.AbstractC2338Fb.b(parcelY0);
        parcelY0.recycle();
        return arrayListB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282km
    public final java.lang.String w() {
        android.os.Parcel parcelY0 = y0(10, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }
}
