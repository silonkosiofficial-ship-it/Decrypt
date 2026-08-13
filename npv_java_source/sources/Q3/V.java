package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class V extends p045e4.a implements Q3.X {
    V(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // Q3.X
    public final N3.E F5(N3.C c6) {
        android.os.Parcel parcelY0 = y0();
        p045e4.c.c(parcelY0, c6);
        android.os.Parcel parcelQ0 = q0(6, parcelY0);
        N3.E e6 = (N3.E) p045e4.c.a(parcelQ0, N3.E.CREATOR);
        parcelQ0.recycle();
        return e6;
    }

    @Override // Q3.X
    public final N3.E P3(N3.C c6) {
        android.os.Parcel parcelY0 = y0();
        p045e4.c.c(parcelY0, c6);
        android.os.Parcel parcelQ0 = q0(8, parcelY0);
        N3.E e6 = (N3.E) p045e4.c.a(parcelQ0, N3.E.CREATOR);
        parcelQ0.recycle();
        return e6;
    }

    @Override // Q3.X
    public final boolean h() {
        android.os.Parcel parcelQ0 = q0(7, y0());
        boolean zE = p045e4.c.e(parcelQ0);
        parcelQ0.recycle();
        return zE;
    }

    @Override // Q3.X
    public final boolean z3(N3.G g6, X3.a aVar) {
        android.os.Parcel parcelY0 = y0();
        p045e4.c.c(parcelY0, g6);
        p045e4.c.d(parcelY0, aVar);
        android.os.Parcel parcelQ0 = q0(5, parcelY0);
        boolean zE = p045e4.c.e(parcelQ0);
        parcelQ0.recycle();
        return zE;
    }
}
