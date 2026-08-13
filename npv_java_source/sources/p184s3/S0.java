package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class S0 extends com.google.android.gms.internal.ads.AbstractC2264Db implements p184s3.U0 {
    S0(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // p184s3.U0
    public final android.os.Bundle d() {
        android.os.Parcel parcelY0 = y0(5, q0());
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcelY0, android.os.Bundle.CREATOR);
        parcelY0.recycle();
        return bundle;
    }

    @Override // p184s3.U0
    public final p184s3.g2 e() {
        android.os.Parcel parcelY0 = y0(4, q0());
        p184s3.g2 g2Var = (p184s3.g2) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcelY0, p184s3.g2.CREATOR);
        parcelY0.recycle();
        return g2Var;
    }

    @Override // p184s3.U0
    public final java.lang.String g() {
        android.os.Parcel parcelY0 = y0(6, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }

    @Override // p184s3.U0
    public final java.lang.String h() {
        android.os.Parcel parcelY0 = y0(2, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }

    @Override // p184s3.U0
    public final java.lang.String i() {
        android.os.Parcel parcelY0 = y0(1, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }

    @Override // p184s3.U0
    public final java.util.List j() {
        android.os.Parcel parcelY0 = y0(3, q0());
        java.util.ArrayList arrayListCreateTypedArrayList = parcelY0.createTypedArrayList(p184s3.g2.CREATOR);
        parcelY0.recycle();
        return arrayListCreateTypedArrayList;
    }
}
