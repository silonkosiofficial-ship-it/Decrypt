package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2981Wl extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC3053Yl {
    C2981Wl(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void A0(boolean z6) {
        android.os.Parcel parcelQ0 = q0();
        int i6 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
        parcelQ0.writeInt(z6 ? 1 : 0);
        L0(25, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void G3(X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        L0(37, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void G4(X3.a aVar, com.google.android.gms.internal.ads.InterfaceC3620ek interfaceC3620ek, java.util.List list) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC3620ek);
        parcelQ0.writeTypedList(list);
        L0(31, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void H() {
        L0(4, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final com.google.android.gms.internal.ads.C3844gm I() {
        com.google.android.gms.internal.ads.C3844gm c3844gm;
        android.os.Parcel parcelY0 = y0(15, q0());
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            c3844gm = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            c3844gm = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.C3844gm ? (com.google.android.gms.internal.ads.C3844gm) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C3844gm(strongBinder);
        }
        parcelY0.recycle();
        return c3844gm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void L1(X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        L0(21, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void L3(X3.a aVar, p184s3.c2 c2Var, p184s3.X1 x6, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, c2Var);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, x6);
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC3296bm);
        L0(6, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final boolean M() {
        android.os.Parcel parcelY0 = y0(13, q0());
        boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcelY0);
        parcelY0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void N() {
        L0(9, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void P() {
        L0(12, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final boolean R() {
        android.os.Parcel parcelY0 = y0(22, q0());
        boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcelY0);
        parcelY0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void S0(p184s3.X1 x6, java.lang.String str) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, x6);
        parcelQ0.writeString(str);
        L0(11, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void T4(X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        L0(39, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void V2(X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        L0(30, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void a2(X3.a aVar, com.google.android.gms.internal.ads.InterfaceC4618np interfaceC4618np, java.util.List list) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC4618np);
        parcelQ0.writeStringList(list);
        L0(23, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void b1(X3.a aVar, p184s3.X1 x6, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, x6);
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC3296bm);
        L0(7, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void c3(X3.a aVar, p184s3.X1 x6, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, x6);
        parcelQ0.writeString(str);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC3296bm);
        L0(32, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final com.google.android.gms.internal.ads.C3954hm d0() {
        com.google.android.gms.internal.ads.C3954hm c3954hm;
        android.os.Parcel parcelY0 = y0(16, q0());
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            c3954hm = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            c3954hm = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.C3954hm ? (com.google.android.gms.internal.ads.C3954hm) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C3954hm(strongBinder);
        }
        parcelY0.recycle();
        return c3954hm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final p184s3.Y0 g() {
        android.os.Parcel parcelY0 = y0(26, q0());
        p184s3.Y0 y0O6 = p184s3.X0.o6(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return y0O6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void h2(X3.a aVar, p184s3.X1 x6, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm, com.google.android.gms.internal.ads.C3505dh c3505dh, java.util.List list) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, x6);
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC3296bm);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, c3505dh);
        parcelQ0.writeStringList(list);
        L0(14, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final com.google.android.gms.internal.ads.InterfaceC3624em j() {
        com.google.android.gms.internal.ads.InterfaceC3624em c3405cm;
        android.os.Parcel parcelY0 = y0(36, q0());
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            c3405cm = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            c3405cm = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC3624em ? (com.google.android.gms.internal.ads.InterfaceC3624em) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C3405cm(strongBinder);
        }
        parcelY0.recycle();
        return c3405cm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final com.google.android.gms.internal.ads.InterfaceC4282km k() {
        com.google.android.gms.internal.ads.InterfaceC4282km c4063im;
        android.os.Parcel parcelY0 = y0(27, q0());
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            c4063im = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            c4063im = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC4282km ? (com.google.android.gms.internal.ads.InterfaceC4282km) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C4063im(strongBinder);
        }
        parcelY0.recycle();
        return c4063im;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final com.google.android.gms.internal.ads.C3956hn l() {
        android.os.Parcel parcelY0 = y0(33, q0());
        com.google.android.gms.internal.ads.C3956hn c3956hn = (com.google.android.gms.internal.ads.C3956hn) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcelY0, com.google.android.gms.internal.ads.C3956hn.CREATOR);
        parcelY0.recycle();
        return c3956hn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void l4(X3.a aVar, p184s3.c2 c2Var, p184s3.X1 x6, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, c2Var);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, x6);
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC3296bm);
        L0(35, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final com.google.android.gms.internal.ads.C3956hn m() {
        android.os.Parcel parcelY0 = y0(34, q0());
        com.google.android.gms.internal.ads.C3956hn c3956hn = (com.google.android.gms.internal.ads.C3956hn) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcelY0, com.google.android.gms.internal.ads.C3956hn.CREATOR);
        parcelY0.recycle();
        return c3956hn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final X3.a n() {
        android.os.Parcel parcelY0 = y0(2, q0());
        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return aVarY0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void p() {
        L0(5, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void r0() {
        L0(8, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void r3(X3.a aVar, p184s3.X1 x6, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC4618np interfaceC4618np, java.lang.String str2) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, x6);
        parcelQ0.writeString(null);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC4618np);
        parcelQ0.writeString(str2);
        L0(10, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void w4(X3.a aVar, p184s3.X1 x6, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, x6);
        parcelQ0.writeString(str);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC3296bm);
        L0(38, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053Yl
    public final void z4(X3.a aVar, p184s3.X1 x6, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, x6);
        parcelQ0.writeString(str);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC3296bm);
        L0(28, parcelQ0);
    }
}
