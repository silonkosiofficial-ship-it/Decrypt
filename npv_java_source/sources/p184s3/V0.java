package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class V0 extends com.google.android.gms.internal.ads.AbstractC2264Db implements p184s3.Y0 {
    V0(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // p184s3.Y0
    public final void b4(p184s3.InterfaceC7081b1 interfaceC7081b1) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC7081b1);
        L0(8, parcelQ0);
    }

    @Override // p184s3.Y0
    public final float d() {
        throw null;
    }

    @Override // p184s3.Y0
    public final float e() {
        throw null;
    }

    @Override // p184s3.Y0
    public final p184s3.InterfaceC7081b1 h() {
        p184s3.InterfaceC7081b1 z6;
        android.os.Parcel parcelY0 = y0(11, q0());
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            z6 = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            z6 = iInterfaceQueryLocalInterface instanceof p184s3.InterfaceC7081b1 ? (p184s3.InterfaceC7081b1) iInterfaceQueryLocalInterface : new p184s3.Z0(strongBinder);
        }
        parcelY0.recycle();
        return z6;
    }

    @Override // p184s3.Y0
    public final float i() {
        throw null;
    }
}
