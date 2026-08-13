package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4948qp extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC5167sp {
    C4948qp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5167sp
    public final int d() {
        android.os.Parcel parcelY0 = y0(2, q0());
        int i6 = parcelY0.readInt();
        parcelY0.recycle();
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5167sp
    public final java.lang.String e() {
        android.os.Parcel parcelY0 = y0(1, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }
}
