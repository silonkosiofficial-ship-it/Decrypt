package Z3;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Z3.a implements Z3.f {
    d(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // Z3.f
    public final java.lang.String c() {
        android.os.Parcel parcelY0 = y0(1, q0());
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }

    @Override // Z3.f
    public final boolean f() {
        android.os.Parcel parcelY0 = y0(6, q0());
        boolean zB = Z3.c.b(parcelY0);
        parcelY0.recycle();
        return zB;
    }

    @Override // Z3.f
    public final boolean y1(boolean z6) {
        android.os.Parcel parcelQ0 = q0();
        Z3.c.a(parcelQ0, true);
        android.os.Parcel parcelY0 = y0(2, parcelQ0);
        boolean zB = Z3.c.b(parcelY0);
        parcelY0.recycle();
        return zB;
    }
}
