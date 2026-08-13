package L3;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final T3.a f6207a = new T3.a("GoogleSignInCommon", new java.lang.String[0]);

    public static O3.g a(O3.f fVar, android.content.Context context, boolean z6) {
        f6207a.a("Revoking access", new java.lang.Object[0]);
        java.lang.String strE = L3.c.b(context).e();
        c(context);
        return z6 ? L3.f.a(strE) : fVar.a(new L3.m(fVar));
    }

    public static O3.g b(O3.f fVar, android.content.Context context, boolean z6) {
        f6207a.a("Signing out", new java.lang.Object[0]);
        c(context);
        return z6 ? O3.h.b(com.google.android.gms.common.api.Status.f24845H, fVar) : fVar.a(new L3.k(fVar));
    }

    private static void c(android.content.Context context) {
        L3.p.a(context).b();
        java.util.Iterator it = O3.f.b().iterator();
        while (it.hasNext()) {
            ((O3.f) it.next()).e();
        }
        com.google.android.gms.common.api.internal.C2148c.a();
    }
}
