package p105k4;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends p035d4.a implements android.os.IInterface {
    g(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void c2(p105k4.j jVar, p105k4.f fVar) {
        android.os.Parcel parcelQ0 = q0();
        p035d4.c.c(parcelQ0, jVar);
        p035d4.c.d(parcelQ0, fVar);
        y0(12, parcelQ0);
    }
}
