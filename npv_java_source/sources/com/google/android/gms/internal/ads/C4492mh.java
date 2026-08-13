package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4492mh extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC4712oh {
    C4492mh(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4712oh
    public final double b() {
        android.os.Parcel parcelY0 = y0(3, q0());
        double d6 = parcelY0.readDouble();
        parcelY0.recycle();
        return d6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4712oh
    public final int c() {
        android.os.Parcel parcelY0 = y0(5, q0());
        int i6 = parcelY0.readInt();
        parcelY0.recycle();
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4712oh
    public final android.net.Uri d() {
        android.os.Parcel parcelY0 = y0(2, q0());
        android.net.Uri uri = (android.net.Uri) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcelY0, android.net.Uri.CREATOR);
        parcelY0.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4712oh
    public final X3.a e() {
        android.os.Parcel parcelY0 = y0(1, q0());
        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return aVarY0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4712oh
    public final int f() {
        android.os.Parcel parcelY0 = y0(4, q0());
        int i6 = parcelY0.readInt();
        parcelY0.recycle();
        return i6;
    }
}
