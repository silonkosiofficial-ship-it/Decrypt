package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2391Gj extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC2465Ij {
    C2391Gj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2465Ij
    public final void y(java.lang.String str) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        L0(1, parcelQ0);
    }
}
