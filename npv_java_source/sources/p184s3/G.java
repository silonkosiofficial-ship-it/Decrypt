package p184s3;

/* JADX INFO: loaded from: classes.dex */
public abstract class G extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p184s3.H {
    public G() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        switch (i6) {
            case 1:
                f();
                break;
            case 2:
                int i11 = parcel.readInt();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                F(i11);
                break;
            case 3:
                break;
            case 4:
                h();
                break;
            case 5:
                j();
                break;
            case 6:
                c();
                break;
            case 7:
                i();
                break;
            case 8:
                p184s3.W0 w6 = (p184s3.W0) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.W0.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                x(w6);
                break;
            case 9:
                k();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
