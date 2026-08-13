package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class W extends com.google.android.gms.internal.ads.AbstractC2264Db implements android.os.IInterface {
    W(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final android.os.IBinder d2(X3.a aVar, p184s3.c2 c2Var, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl, int i6, int i10) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, c2Var);
        parcelQ0.writeString(str);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2945Vl);
        parcelQ0.writeInt(244410000);
        parcelQ0.writeInt(i10);
        android.os.Parcel parcelY0 = y0(2, parcelQ0);
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        parcelY0.recycle();
        return strongBinder;
    }
}
