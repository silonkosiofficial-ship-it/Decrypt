package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2545Kn extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC2618Mn {
    C2545Kn(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void A() {
        L0(7, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void C() {
        L0(9, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void N2(int i6, java.lang.String[] strArr, int[] iArr) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeInt(i6);
        parcelQ0.writeStringArray(strArr);
        parcelQ0.writeIntArray(iArr);
        L0(15, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final boolean T() {
        android.os.Parcel parcelY0 = y0(11, q0());
        boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcelY0);
        parcelY0.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void W3(android.os.Bundle bundle) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, bundle);
        L0(1, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void b0(X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        L0(13, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void h() {
        L0(10, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void j2(int i6, int i10, android.content.Intent intent) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeInt(i6);
        parcelQ0.writeInt(i10);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, intent);
        L0(12, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void m() {
        L0(8, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void p() {
        L0(5, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void s() {
        L0(2, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void t() {
        L0(4, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void v() {
        L0(14, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void w() {
        L0(3, q0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2618Mn
    public final void z0(android.os.Bundle bundle) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, bundle);
        android.os.Parcel parcelY0 = y0(6, parcelQ0);
        if (parcelY0.readInt() != 0) {
            bundle.readFromParcel(parcelY0);
        }
        parcelY0.recycle();
    }
}
