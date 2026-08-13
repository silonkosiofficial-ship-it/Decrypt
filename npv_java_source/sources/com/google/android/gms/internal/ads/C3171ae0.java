package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ae0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3171ae0 extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC3390ce0 {
    C3171ae0(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3390ce0
    public final void B0(int[] iArr) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeIntArray(null);
        L0(4, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3390ce0
    public final void D(int i6) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeInt(i6);
        L0(7, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3390ce0
    public final void K(int i6) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeInt(i6);
        L0(6, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3390ce0
    public final void V4(X3.a aVar, java.lang.String str, java.lang.String str2) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        parcelQ0.writeString(str);
        parcelQ0.writeString(null);
        L0(8, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3390ce0
    public final void e() {
        L0(3, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3390ce0
    public final void o0(byte[] bArr) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeByteArray(bArr);
        L0(5, parcelQ0);
    }
}
