package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2361Fo extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC2435Ho {
    C2361Fo(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2435Ho
    public final void C3(p214v3.D d6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, d6);
        L0(2, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2435Ho
    public final void C5(android.os.ParcelFileDescriptor parcelFileDescriptor, com.google.android.gms.internal.ads.C2730Po c2730Po) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, parcelFileDescriptor);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, c2730Po);
        L0(3, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2435Ho
    public final void H3(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, parcelFileDescriptor);
        L0(1, parcelQ0);
    }
}
