package p184s3;

/* JADX INFO: renamed from: s3.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7145x0 extends com.google.android.gms.internal.ads.AbstractC2264Db implements android.os.IInterface {
    C7145x0(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    public final android.os.IBinder d2(X3.a aVar, int i6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        parcelQ0.writeInt(244410000);
        android.os.Parcel parcelY0 = y0(1, parcelQ0);
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        parcelY0.recycle();
        return strongBinder;
    }
}
