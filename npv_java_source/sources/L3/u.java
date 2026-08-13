package L3;

/* JADX INFO: loaded from: classes.dex */
public final class u extends p025c4.a implements android.os.IInterface {
    u(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void L0(L3.t tVar, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        android.os.Parcel parcelQ0 = q0();
        p025c4.d.d(parcelQ0, tVar);
        p025c4.d.c(parcelQ0, googleSignInOptions);
        y0(103, parcelQ0);
    }

    public final void c2(L3.t tVar, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        android.os.Parcel parcelQ0 = q0();
        p025c4.d.d(parcelQ0, tVar);
        p025c4.d.c(parcelQ0, googleSignInOptions);
        y0(102, parcelQ0);
    }
}
