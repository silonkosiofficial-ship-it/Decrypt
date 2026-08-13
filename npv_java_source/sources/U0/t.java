package U0;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.WeakHashMap f14448a = new java.util.WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.WeakHashMap f14449b = new java.util.WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.WeakHashMap f14450c = new java.util.WeakHashMap();

    public final android.text.style.ClickableSpan a(M0.C1332d.c cVar) {
        java.util.WeakHashMap weakHashMap = this.f14450c;
        java.lang.Object jVar = weakHashMap.get(cVar);
        if (jVar == null) {
            jVar = new U0.j((M0.AbstractC1336h) cVar.e());
            weakHashMap.put(cVar, jVar);
        }
        return (android.text.style.ClickableSpan) jVar;
    }

    public final android.text.style.URLSpan b(M0.C1332d.c cVar) {
        java.util.WeakHashMap weakHashMap = this.f14449b;
        java.lang.Object uRLSpan = weakHashMap.get(cVar);
        if (uRLSpan == null) {
            uRLSpan = new android.text.style.URLSpan(((M0.AbstractC1336h.b) cVar.e()).c());
            weakHashMap.put(cVar, uRLSpan);
        }
        return (android.text.style.URLSpan) uRLSpan;
    }

    public final android.text.style.URLSpan c(M0.T t6) {
        java.util.WeakHashMap weakHashMap = this.f14448a;
        java.lang.Object uRLSpan = weakHashMap.get(t6);
        if (uRLSpan == null) {
            uRLSpan = new android.text.style.URLSpan(t6.a());
            weakHashMap.put(t6, uRLSpan);
        }
        return (android.text.style.URLSpan) uRLSpan;
    }
}
