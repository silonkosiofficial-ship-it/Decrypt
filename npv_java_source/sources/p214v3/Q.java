package p214v3;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.google.android.gms.internal.ads.C3557e7 f55859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.Object f55860b = new java.lang.Object();

    /* JADX WARN: Code duplicated, block: B:16:0x0036 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:17:0x003b, B:16:0x0036, B:18:0x003d), top: B:22:0x0010 }] */
    public Q(android.content.Context context) {
        com.google.android.gms.internal.ads.C3557e7 c3557e7A;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f55860b) {
            try {
                if (f55859a == null) {
                    com.google.android.gms.internal.ads.AbstractC2161Af.a(context);
                    if (V3.e.a()) {
                        c3557e7A = com.google.android.gms.internal.ads.J7.a(context, null);
                    } else {
                        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25726w4)).booleanValue()) {
                            c3557e7A = p214v3.A.b(context);
                        } else {
                            c3557e7A = com.google.android.gms.internal.ads.J7.a(context, null);
                        }
                    }
                    f55859a = c3557e7A;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final P4.d a(java.lang.String str) {
        com.google.android.gms.internal.ads.C4512mr c4512mr = new com.google.android.gms.internal.ads.C4512mr();
        f55859a.a(new p214v3.O(str, null, c4512mr));
        return c4512mr;
    }

    public final P4.d b(int i6, java.lang.String str, java.util.Map map, byte[] bArr) {
        p214v3.M m6 = new p214v3.M(null);
        p214v3.K k6 = new p214v3.K(this, str, m6);
        p224w3.m mVar = new p224w3.m(null);
        p214v3.L l6 = new p214v3.L(this, i6, str, m6, k6, bArr, map, mVar);
        if (p224w3.m.k()) {
            try {
                mVar.d(str, "GET", l6.u(), l6.G());
            } catch (com.google.android.gms.internal.ads.L6 e6) {
                p224w3.p.g(e6.getMessage());
            }
        }
        f55859a.a(l6);
        return m6;
    }
}
