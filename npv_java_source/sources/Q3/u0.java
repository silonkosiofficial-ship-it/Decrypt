package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends p045e4.a implements Q3.S {
    u0(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // Q3.S
    public final int c() {
        android.os.Parcel parcelQ0 = q0(2, y0());
        int i6 = parcelQ0.readInt();
        parcelQ0.recycle();
        return i6;
    }

    @Override // Q3.S
    public final X3.a f() {
        android.os.Parcel parcelQ0 = q0(1, y0());
        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcelQ0.readStrongBinder());
        parcelQ0.recycle();
        return aVarY0;
    }
}
