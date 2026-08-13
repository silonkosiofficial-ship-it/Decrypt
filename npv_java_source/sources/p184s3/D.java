package p184s3;

/* JADX INFO: loaded from: classes.dex */
public abstract class D extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p184s3.E {
    public D() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 != 1) {
            return false;
        }
        b();
        parcel2.writeNoException();
        return true;
    }
}
