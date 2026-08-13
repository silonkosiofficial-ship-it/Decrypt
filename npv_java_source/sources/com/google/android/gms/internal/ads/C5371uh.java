package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5371uh extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC5591wh {
    C5371uh(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5591wh
    public final android.os.IBinder i4(X3.a aVar, X3.a aVar2, X3.a aVar3, int i6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar2);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar3);
        parcelQ0.writeInt(244410000);
        android.os.Parcel parcelY0 = y0(1, parcelQ0);
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        parcelY0.recycle();
        return strongBinder;
    }
}
