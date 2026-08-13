package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class L0 extends com.google.android.gms.internal.ads.AbstractC2264Db implements p184s3.N0 {
    L0(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // p184s3.N0
    public final void C2(p184s3.e2 e2Var) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, e2Var);
        L0(1, parcelQ0);
    }

    @Override // p184s3.N0
    public final boolean e() {
        android.os.Parcel parcelY0 = y0(2, q0());
        boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcelY0);
        parcelY0.recycle();
        return zG;
    }
}
