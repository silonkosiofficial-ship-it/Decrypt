package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class O extends com.google.android.gms.internal.ads.AbstractC2264Db implements p184s3.Q {
    O(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // p184s3.Q
    public final void A4(p184s3.H h6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, h6);
        L0(2, parcelQ0);
    }

    @Override // p184s3.Q
    public final void U4(com.google.android.gms.internal.ads.C3505dh c3505dh) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, c3505dh);
        L0(6, parcelQ0);
    }

    @Override // p184s3.Q
    public final void U5(com.google.android.gms.internal.ads.InterfaceC3397ci interfaceC3397ci) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC3397ci);
        L0(10, parcelQ0);
    }

    @Override // p184s3.Q
    public final p184s3.N d() {
        p184s3.N l6;
        android.os.Parcel parcelY0 = y0(1, q0());
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            l6 = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            l6 = iInterfaceQueryLocalInterface instanceof p184s3.N ? (p184s3.N) iInterfaceQueryLocalInterface : new p184s3.L(strongBinder);
        }
        parcelY0.recycle();
        return l6;
    }

    @Override // p184s3.Q
    public final void l3(java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2938Vh interfaceC2938Vh, com.google.android.gms.internal.ads.InterfaceC2830Sh interfaceC2830Sh) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2938Vh);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2830Sh);
        L0(5, parcelQ0);
    }
}
