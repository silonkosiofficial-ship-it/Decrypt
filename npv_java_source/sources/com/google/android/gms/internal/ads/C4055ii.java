package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4055ii extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC4274ki {
    C4055ii(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final java.util.List A() {
        android.os.Parcel parcelY0 = y0(3, q0());
        java.util.ArrayList arrayListB = com.google.android.gms.internal.ads.AbstractC2338Fb.b(parcelY0);
        parcelY0.recycle();
        return arrayListB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final void P2(android.os.Bundle bundle) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, bundle);
        L0(33, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final double d() {
        android.os.Parcel parcelY0 = y0(8, q0());
        double d6 = parcelY0.readDouble();
        parcelY0.recycle();
        return d6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final p184s3.Y0 g() {
        android.os.Parcel parcelY0 = y0(11, q0());
        p184s3.Y0 y0O6 = p184s3.X0.o6(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return y0O6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final com.google.android.gms.internal.ads.InterfaceC3944hh h() {
        com.google.android.gms.internal.ads.InterfaceC3944hh c3724fh;
        android.os.Parcel parcelY0 = y0(14, q0());
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            c3724fh = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            c3724fh = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC3944hh ? (com.google.android.gms.internal.ads.InterfaceC3944hh) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C3724fh(strongBinder);
        }
        parcelY0.recycle();
        return c3724fh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final p184s3.U0 i() {
        android.os.Parcel parcelY0 = y0(31, q0());
        p184s3.U0 u0O6 = p184s3.T0.o6(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return u0O6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final com.google.android.gms.internal.ads.InterfaceC4712oh k() {
        com.google.android.gms.internal.ads.InterfaceC4712oh c4492mh;
        android.os.Parcel parcelY0 = y0(5, q0());
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            c4492mh = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            c4492mh = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC4712oh ? (com.google.android.gms.internal.ads.InterfaceC4712oh) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C4492mh(strongBinder);
        }
        parcelY0.recycle();
        return c4492mh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final X3.a l() {
        android.os.Parcel parcelY0 = y0(19, q0());
        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return aVarY0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final X3.a m() {
        android.os.Parcel parcelY0 = y0(18, q0());
        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return aVarY0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final java.lang.String n() {
        android.os.Parcel parcelY0 = y0(7, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final java.lang.String p() {
        android.os.Parcel parcelY0 = y0(4, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final java.lang.String q() {
        android.os.Parcel parcelY0 = y0(6, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final java.lang.String s() {
        android.os.Parcel parcelY0 = y0(2, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final java.lang.String u() {
        android.os.Parcel parcelY0 = y0(10, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final java.util.List v() {
        android.os.Parcel parcelY0 = y0(23, q0());
        java.util.ArrayList arrayListB = com.google.android.gms.internal.ads.AbstractC2338Fb.b(parcelY0);
        parcelY0.recycle();
        return arrayListB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4274ki
    public final java.lang.String w() {
        android.os.Parcel parcelY0 = y0(9, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }
}
