package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3091Zn extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC3300bo {
    C3091Zn(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3300bo
    public final void E1(java.util.List list) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeTypedList(list);
        L0(1, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3300bo
    public final void o(java.lang.String str) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        L0(2, parcelQ0);
    }
}
