package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class R0 extends com.google.android.gms.internal.ads.AbstractC2264Db implements android.os.IInterface {
    R0(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final p184s3.Q0 d2(X3.a aVar, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl, int i6) {
        p184s3.Q0 o6;
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2945Vl);
        parcelQ0.writeInt(244410000);
        android.os.Parcel parcelY0 = y0(1, parcelQ0);
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            o6 = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            o6 = iInterfaceQueryLocalInterface instanceof p184s3.Q0 ? (p184s3.Q0) iInterfaceQueryLocalInterface : new p184s3.O0(strongBinder);
        }
        parcelY0.recycle();
        return o6;
    }
}
