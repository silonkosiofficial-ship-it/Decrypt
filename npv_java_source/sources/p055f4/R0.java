package p055f4;

/* JADX INFO: loaded from: classes3.dex */
public final class R0 implements p055f4.V0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f45075c = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile p055f4.V0 f45076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile java.lang.Object f45077b = f45075c;

    private R0(p055f4.V0 v6) {
        this.f45076a = v6;
    }

    public static p055f4.V0 b(p055f4.V0 v6) {
        return v6 instanceof p055f4.R0 ? v6 : new p055f4.R0(v6);
    }

    @Override // p055f4.W0
    public final java.lang.Object a() {
        java.lang.Object objA = this.f45077b;
        java.lang.Object obj = f45075c;
        if (objA == obj) {
            synchronized (this) {
                try {
                    objA = this.f45077b;
                    if (objA == obj) {
                        objA = this.f45076a.a();
                        java.lang.Object obj2 = this.f45077b;
                        if (obj2 != obj && obj2 != objA) {
                            throw new java.lang.IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                        }
                        this.f45077b = objA;
                        this.f45076a = null;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return objA;
    }
}
