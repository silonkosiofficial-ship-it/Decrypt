package p184s3;

/* JADX INFO: loaded from: classes.dex */
public abstract class G0 extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p184s3.H0 {
    public G0() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 != 1) {
            return false;
        }
        p184s3.W0 w6 = (p184s3.W0) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.W0.CREATOR);
        com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
        V1(w6);
        parcel2.writeNoException();
        return true;
    }
}
