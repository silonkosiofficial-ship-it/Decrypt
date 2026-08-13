package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2249Cn extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC2323En {
    C2249Cn(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2323En
    public final void M0(android.content.Intent intent) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, intent);
        L0(1, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2323En
    public final void g() {
        L0(3, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2323En
    public final void g5(X3.a aVar, p194t3.a aVar2) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, aVar2);
        L0(6, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2323En
    public final void i6(java.lang.String[] strArr, int[] iArr, X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeStringArray(strArr);
        parcelQ0.writeIntArray(iArr);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        L0(5, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2323En
    public final void j0(X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        L0(4, parcelQ0);
    }
}
