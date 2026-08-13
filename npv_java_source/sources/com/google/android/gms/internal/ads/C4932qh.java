package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4932qh extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC5261th {
    C4932qh(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5261th
    public final void B1(X3.a aVar, int i6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        parcelQ0.writeInt(i6);
        L0(5, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5261th
    public final void Q1(java.lang.String str, X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        L0(1, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5261th
    public final void e4(X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        L0(6, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5261th
    public final void h1(com.google.android.gms.internal.ads.InterfaceC4382lh interfaceC4382lh) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC4382lh);
        L0(8, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5261th
    public final void h5(X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        L0(3, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5261th
    public final void s0(X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        L0(7, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5261th
    public final void v4(X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        L0(9, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5261th
    public final X3.a y(java.lang.String str) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        android.os.Parcel parcelY0 = y0(2, parcelQ0);
        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return aVarY0;
    }
}
