package p019b9;

/* JADX INFO: renamed from: b9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2119f {
    public static final void a(p127m7.i iVar, java.lang.Throwable th) {
        java.util.Iterator it = p019b9.AbstractC2118e.a().iterator();
        while (it.hasNext()) {
            try {
                ((W8.K) it.next()).z0(iVar, th);
            } catch (java.lang.Throwable th2) {
                p019b9.AbstractC2118e.b(W8.L.b(th, th2));
            }
        }
        try {
            p087i7.AbstractC6661g.a(th, new p019b9.C2120g(iVar));
        } catch (java.lang.Throwable unused) {
        }
        p019b9.AbstractC2118e.b(th);
    }
}
