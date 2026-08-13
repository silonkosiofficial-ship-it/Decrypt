package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2375Gb extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC2449Ib {
    C2375Gb(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2449Ib
    public final void B0(int[] iArr) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeIntArray(null);
        L0(4, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2449Ib
    public final void D(int i6) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeInt(i6);
        L0(7, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2449Ib
    public final void K(int i6) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeInt(0);
        L0(6, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2449Ib
    public final void a5(X3.a aVar, java.lang.String str) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        parcelQ0.writeString("GMA_SDK");
        L0(2, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2449Ib
    public final void e() {
        L0(3, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2449Ib
    public final void o0(byte[] bArr) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeByteArray(bArr);
        L0(5, parcelQ0);
    }
}
