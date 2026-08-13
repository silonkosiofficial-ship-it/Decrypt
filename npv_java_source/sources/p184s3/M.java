package p184s3;

/* JADX INFO: loaded from: classes.dex */
public abstract class M extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p184s3.N {
    public M() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        java.lang.String strD;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    boolean zH = h();
                    parcel2.writeNoException();
                    int i11 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
                    parcel2.writeInt(zH ? 1 : 0);
                } else if (i6 == 4) {
                    strD = e();
                } else {
                    if (i6 != 5) {
                        return false;
                    }
                    p184s3.X1 x6 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                    int i12 = parcel.readInt();
                    com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                    J2(x6, i12);
                }
                return true;
            }
            strD = d();
            parcel2.writeNoException();
            parcel2.writeString(strD);
            return true;
        }
        p184s3.X1 x10 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
        com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
        H5(x10);
        parcel2.writeNoException();
        return true;
    }
}
