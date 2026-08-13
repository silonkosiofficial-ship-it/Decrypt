package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3730fk extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC3950hk {
    C3730fk(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3950hk
    public final void L4(java.util.List list) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeTypedList(list);
        L0(1, parcelQ0);
    }
}
