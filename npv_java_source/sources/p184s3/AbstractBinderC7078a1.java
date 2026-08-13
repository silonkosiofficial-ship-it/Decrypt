package p184s3;

/* JADX INFO: renamed from: s3.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC7078a1 extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p184s3.InterfaceC7081b1 {
    public AbstractBinderC7078a1() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 == 1) {
            h();
        } else if (i6 == 2) {
            g();
        } else if (i6 == 3) {
            i();
        } else if (i6 == 4) {
            d();
        } else {
            if (i6 != 5) {
                return false;
            }
            boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcel);
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            F0(zG);
        }
        parcel2.writeNoException();
        return true;
    }
}
