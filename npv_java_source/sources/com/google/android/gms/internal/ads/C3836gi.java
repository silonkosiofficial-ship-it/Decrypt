package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3836gi extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC3946hi {
    C3836gi(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3946hi
    public final void G(java.lang.String str) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        L0(1, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3946hi
    public final void d() {
        L0(2, q0());
    }
}
