package com.google.android.gms.auth.api.signin;

/* JADX INFO: loaded from: classes.dex */
public class b extends O3.e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final com.google.android.gms.auth.api.signin.f f24829k = new com.google.android.gms.auth.api.signin.f(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static int f24830l = 1;

    b(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        super(context, I3.a.f5004b, googleSignInOptions, new O3.e.a.C0195a().b(new P3.C1445a()).a());
    }

    private final synchronized int t() {
        int i6;
        try {
            i6 = f24830l;
            if (i6 == 1) {
                android.content.Context contextJ = j();
                N3.C1394g c1394gM = N3.C1394g.m();
                int iH = c1394gM.h(contextJ, 12451000);
                if (iH == 0) {
                    i6 = 4;
                    f24830l = 4;
                } else if (c1394gM.b(contextJ, iH, null) != null || com.google.android.gms.dynamite.DynamiteModule.a(contextJ, "com.google.android.gms.auth.api.fallback") == 0) {
                    i6 = 2;
                    f24830l = 2;
                } else {
                    i6 = 3;
                    f24830l = 3;
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return i6;
    }

    public p115l4.AbstractC6931l r() {
        return Q3.AbstractC1476o.b(L3.o.a(c(), j(), t() == 3));
    }

    public p115l4.AbstractC6931l s() {
        return Q3.AbstractC1476o.b(L3.o.b(c(), j(), t() == 3));
    }
}
