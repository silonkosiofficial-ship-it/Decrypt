package p184s3;

/* JADX INFO: renamed from: s3.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC7119o0 extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p184s3.InterfaceC7122p0 {
    public AbstractBinderC7119o0() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 == 1) {
            p184s3.W0 w6 = (p184s3.W0) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.W0.CREATOR);
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            n0(w6);
        } else if (i6 == 2) {
            e();
        } else if (i6 == 3) {
            c();
        } else if (i6 == 4) {
            d();
        } else {
            if (i6 != 5) {
                return false;
            }
            b();
        }
        parcel2.writeNoException();
        return true;
    }
}
