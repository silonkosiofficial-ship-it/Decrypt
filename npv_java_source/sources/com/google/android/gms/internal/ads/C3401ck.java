package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3401ck extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC3620ek {
    C3401ck(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3620ek
    public final void e() {
        L0(2, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3620ek
    public final void o(java.lang.String str) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        L0(3, parcelQ0);
    }
}
