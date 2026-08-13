package p004a3;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p077h7.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f17035c = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile p077h7.a f17036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile java.lang.Object f17037b = f17035c;

    private a(p077h7.a aVar) {
        this.f17036a = aVar;
    }

    public static p077h7.a a(p077h7.a aVar) {
        p004a3.d.b(aVar);
        return aVar instanceof p004a3.a ? aVar : new p004a3.a(aVar);
    }

    private static java.lang.Object b(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == f17035c || obj == obj2) {
            return obj2;
        }
        throw new java.lang.IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p077h7.a
    public java.lang.Object get() {
        java.lang.Object obj = this.f17037b;
        java.lang.Object obj2 = f17035c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f17037b;
                    if (obj == obj2) {
                        obj = this.f17036a.get();
                        this.f17037b = b(this.f17037b, obj);
                        this.f17036a = null;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
