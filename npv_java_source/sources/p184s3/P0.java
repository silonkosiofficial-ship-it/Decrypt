package p184s3;

/* JADX INFO: loaded from: classes.dex */
public abstract class P0 extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p184s3.Q0 {
    public P0() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 != 1) {
            return false;
        }
        java.lang.String string = parcel.readString();
        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
        X3.a aVarY1 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
        com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
        s5(string, aVarY0, aVarY1);
        parcel2.writeNoException();
        return true;
    }
}
