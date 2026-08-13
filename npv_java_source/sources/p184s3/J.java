package p184s3;

/* JADX INFO: loaded from: classes.dex */
public abstract class J extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p184s3.K {
    public J() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 == 1) {
            c();
        } else {
            if (i6 != 2) {
                return false;
            }
            p184s3.W0 w6 = (p184s3.W0) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.W0.CREATOR);
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            x0(w6);
        }
        parcel2.writeNoException();
        return true;
    }
}
