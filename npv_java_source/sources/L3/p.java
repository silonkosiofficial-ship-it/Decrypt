package L3;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static L3.p f6208d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final L3.c f6209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    com.google.android.gms.auth.api.signin.GoogleSignInAccount f6210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.google.android.gms.auth.api.signin.GoogleSignInOptions f6211c;

    private p(android.content.Context context) {
        L3.c cVarB = L3.c.b(context);
        this.f6209a = cVarB;
        this.f6210b = cVarB.c();
        this.f6211c = cVarB.d();
    }

    public static synchronized L3.p a(android.content.Context context) {
        return d(context.getApplicationContext());
    }

    private static synchronized L3.p d(android.content.Context context) {
        L3.p pVar = f6208d;
        if (pVar != null) {
            return pVar;
        }
        L3.p pVar2 = new L3.p(context);
        f6208d = pVar2;
        return pVar2;
    }

    public final synchronized void b() {
        this.f6209a.a();
        this.f6210b = null;
        this.f6211c = null;
    }

    public final synchronized void c(com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        this.f6209a.f(googleSignInAccount, googleSignInOptions);
        this.f6210b = googleSignInAccount;
        this.f6211c = googleSignInOptions;
    }
}
