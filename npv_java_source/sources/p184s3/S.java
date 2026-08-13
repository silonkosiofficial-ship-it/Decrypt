package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class S extends com.google.android.gms.internal.ads.AbstractC2264Db implements android.os.IInterface {
    S(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public final android.os.IBinder d2(X3.a aVar, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl, int i6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        parcelQ0.writeString(str);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2945Vl);
        parcelQ0.writeInt(244410000);
        android.os.Parcel parcelY0 = y0(1, parcelQ0);
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        parcelY0.recycle();
        return strongBinder;
    }
}
