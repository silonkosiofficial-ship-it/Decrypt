package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3724fh extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC3944hh {
    C3724fh(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3944hh
    public final java.util.List g() {
        android.os.Parcel parcelY0 = y0(3, q0());
        java.util.ArrayList arrayListB = com.google.android.gms.internal.ads.AbstractC2338Fb.b(parcelY0);
        parcelY0.recycle();
        return arrayListB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3944hh
    public final java.lang.String i() {
        android.os.Parcel parcelY0 = y0(2, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }
}
