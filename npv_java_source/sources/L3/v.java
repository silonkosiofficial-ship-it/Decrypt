package L3;

/* JADX INFO: loaded from: classes.dex */
public final class v extends L3.q {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f6212C;

    public v(android.content.Context context) {
        this.f6212C = context;
    }

    private final void y0() {
        if (V3.s.a(this.f6212C, android.os.Binder.getCallingUid())) {
            return;
        }
        throw new java.lang.SecurityException("Calling UID " + android.os.Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // L3.r
    public final void I1() {
        y0();
        L3.c cVarB = L3.c.b(this.f6212C);
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccountC = cVarB.c();
        com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptionsD = com.google.android.gms.auth.api.signin.GoogleSignInOptions.f24798N;
        if (googleSignInAccountC != null) {
            googleSignInOptionsD = cVarB.d();
        }
        com.google.android.gms.auth.api.signin.b bVarA = com.google.android.gms.auth.api.signin.a.a(this.f6212C, googleSignInOptionsD);
        if (googleSignInAccountC != null) {
            bVarA.r();
        } else {
            bVarA.s();
        }
    }

    @Override // L3.r
    public final void g1() {
        y0();
        L3.p.a(this.f6212C).b();
    }
}
