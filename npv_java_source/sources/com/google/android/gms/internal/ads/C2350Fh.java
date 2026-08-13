package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2350Fh extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC2424Hh {
    C2350Fh(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2424Hh
    public final boolean C0(X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        android.os.Parcel parcelY0 = y0(10, parcelQ0);
        boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcelY0);
        parcelY0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2424Hh
    public final X3.a g() {
        android.os.Parcel parcelY0 = y0(9, q0());
        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return aVarY0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2424Hh
    public final boolean g0(X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        android.os.Parcel parcelY0 = y0(17, parcelQ0);
        boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcelY0);
        parcelY0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2424Hh
    public final java.lang.String h() {
        android.os.Parcel parcelY0 = y0(4, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }
}
