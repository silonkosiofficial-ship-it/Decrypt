package p184s3;

/* JADX INFO: renamed from: s3.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7080b0 extends com.google.android.gms.internal.ads.AbstractC2264Db implements p184s3.InterfaceC7083c0 {
    C7080b0(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // p184s3.InterfaceC7083c0
    public final void J5(p184s3.I1 i6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, i6);
        L0(2, parcelQ0);
    }

    @Override // p184s3.InterfaceC7083c0
    public final void O0(p184s3.I1 i6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, i6);
        L0(1, parcelQ0);
    }
}
