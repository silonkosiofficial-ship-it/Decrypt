package p184s3;

/* JADX INFO: renamed from: s3.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7133t0 extends com.google.android.gms.internal.ads.AbstractC2264Db implements p184s3.InterfaceC7139v0 {
    C7133t0(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // p184s3.InterfaceC7139v0
    public final void B5(p184s3.K1 k6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, k6);
        L0(14, parcelQ0);
    }

    @Override // p184s3.InterfaceC7139v0
    public final void P4(java.lang.String str, X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(null);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        L0(6, parcelQ0);
    }

    @Override // p184s3.InterfaceC7139v0
    public final void R0(java.lang.String str) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        L0(18, parcelQ0);
    }

    @Override // p184s3.InterfaceC7139v0
    public final void Y0(com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2945Vl);
        L0(11, parcelQ0);
    }

    @Override // p184s3.InterfaceC7139v0
    public final java.util.List i() {
        android.os.Parcel parcelY0 = y0(13, q0());
        java.util.ArrayList arrayListCreateTypedArrayList = parcelY0.createTypedArrayList(com.google.android.gms.internal.ads.C3182ak.CREATOR);
        parcelY0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p184s3.InterfaceC7139v0
    public final void k() {
        L0(1, q0());
    }

    @Override // p184s3.InterfaceC7139v0
    public final void y2(com.google.android.gms.internal.ads.InterfaceC3950hk interfaceC3950hk) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC3950hk);
        L0(12, parcelQ0);
    }
}
