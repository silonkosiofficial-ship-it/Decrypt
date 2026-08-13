package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5377uk extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC5597wk {
    C5377uk(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5597wk
    public final void F(int i6) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeInt(i6);
        L0(2, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5597wk
    public final void r1(com.google.android.gms.internal.ads.InterfaceC4938qk interfaceC4938qk) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC4938qk);
        L0(1, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5597wk
    public final void x(p184s3.W0 w6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, w6);
        L0(3, parcelQ0);
    }
}
