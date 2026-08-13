package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2451Ic extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC2525Kc {
    C2451Ic(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2525Kc
    public final void B(int i6) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeInt(i6);
        L0(2, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2525Kc
    public final void B3(p184s3.W0 w6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, w6);
        L0(3, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2525Kc
    public final void Q0(com.google.android.gms.internal.ads.InterfaceC2414Hc interfaceC2414Hc) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2414Hc);
        L0(1, parcelQ0);
    }
}
