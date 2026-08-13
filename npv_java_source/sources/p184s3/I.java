package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class I extends com.google.android.gms.internal.ads.AbstractC2264Db implements p184s3.K {
    I(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // p184s3.K
    public final void c() {
        L0(1, q0());
    }

    @Override // p184s3.K
    public final void x0(p184s3.W0 w6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, w6);
        L0(2, parcelQ0);
    }
}
