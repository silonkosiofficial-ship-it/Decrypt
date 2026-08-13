package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class Z0 extends com.google.android.gms.internal.ads.AbstractC2264Db implements p184s3.InterfaceC7081b1 {
    Z0(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // p184s3.InterfaceC7081b1
    public final void F0(boolean z6) {
        android.os.Parcel parcelQ0 = q0();
        int i6 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
        parcelQ0.writeInt(z6 ? 1 : 0);
        L0(5, parcelQ0);
    }

    @Override // p184s3.InterfaceC7081b1
    public final void d() {
        L0(4, q0());
    }

    @Override // p184s3.InterfaceC7081b1
    public final void g() {
        L0(2, q0());
    }

    @Override // p184s3.InterfaceC7081b1
    public final void h() {
        L0(1, q0());
    }

    @Override // p184s3.InterfaceC7081b1
    public final void i() {
        L0(3, q0());
    }
}
