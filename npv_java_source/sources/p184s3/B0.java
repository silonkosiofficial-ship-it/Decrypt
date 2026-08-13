package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class B0 extends com.google.android.gms.internal.ads.AbstractC2264Db implements p184s3.D0 {
    B0(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // p184s3.D0
    public final java.lang.String d() {
        android.os.Parcel parcelY0 = y0(1, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }

    @Override // p184s3.D0
    public final java.lang.String e() {
        android.os.Parcel parcelY0 = y0(2, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }
}
