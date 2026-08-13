package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class O0 extends com.google.android.gms.internal.ads.AbstractC2264Db implements p184s3.Q0 {
    O0(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // p184s3.Q0
    public final void s5(java.lang.String str, X3.a aVar, X3.a aVar2) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar2);
        L0(1, parcelQ0);
    }
}
