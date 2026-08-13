package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3405cm extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC3624em {
    C3405cm(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3624em
    public final X3.a d() {
        android.os.Parcel parcelY0 = y0(1, q0());
        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return aVarY0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3624em
    public final boolean e() {
        android.os.Parcel parcelY0 = y0(2, q0());
        boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcelY0);
        parcelY0.recycle();
        return zG;
    }
}
