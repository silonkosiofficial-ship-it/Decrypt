package K4;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements K4.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f6122c = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile K4.m f6123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile java.lang.Object f6124b = f6122c;

    private i(K4.m mVar) {
        this.f6123a = mVar;
    }

    public static K4.m b(K4.m mVar) {
        return mVar instanceof K4.i ? mVar : new K4.i(mVar);
    }

    @Override // K4.m
    public final java.lang.Object a() {
        java.lang.Object objA = this.f6124b;
        java.lang.Object obj = f6122c;
        if (objA == obj) {
            synchronized (this) {
                try {
                    objA = this.f6124b;
                    if (objA == obj) {
                        objA = this.f6123a.a();
                        java.lang.Object obj2 = this.f6124b;
                        if (obj2 != obj && obj2 != objA) {
                            throw new java.lang.IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                        }
                        this.f6124b = objA;
                        this.f6123a = null;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return objA;
    }
}
