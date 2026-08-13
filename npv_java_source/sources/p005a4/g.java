package p005a4;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends p005a4.a implements android.os.IInterface {
    g(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void L0(H3.d dVar, p005a4.f fVar) {
        android.os.Parcel parcelQ0 = q0();
        p005a4.c.b(parcelQ0, dVar);
        p005a4.c.c(parcelQ0, fVar);
        y0(1, parcelQ0);
    }
}
