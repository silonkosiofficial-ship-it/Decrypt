package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2340Fc extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC2414Hc {
    C2340Fc(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2414Hc
    public final void M3(X3.a aVar, com.google.android.gms.internal.ads.InterfaceC2672Oc interfaceC2672Oc) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2672Oc);
        L0(4, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2414Hc
    public final p184s3.U0 e() {
        android.os.Parcel parcelY0 = y0(5, q0());
        p184s3.U0 u0O6 = p184s3.T0.o6(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return u0O6;
    }
}
