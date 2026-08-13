package I7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.concurrent.ConcurrentMap f5325a = new j$.util.concurrent.ConcurrentHashMap();

    public static final T7.k a(java.lang.Class cls) {
        p247y7.AbstractC7350t.f(cls, "<this>");
        java.lang.ClassLoader classLoaderF = U7.d.f(cls);
        I7.N n6 = new I7.N(classLoaderF);
        java.util.concurrent.ConcurrentMap concurrentMap = f5325a;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) concurrentMap.get(n6);
        if (weakReference != null) {
            T7.k kVar = (T7.k) weakReference.get();
            if (kVar != null) {
                return kVar;
            }
            concurrentMap.remove(n6, weakReference);
        }
        T7.k kVarA = T7.k.f13306c.a(classLoaderF);
        while (true) {
            try {
                java.util.concurrent.ConcurrentMap concurrentMap2 = f5325a;
                java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) concurrentMap2.putIfAbsent(n6, new java.lang.ref.WeakReference(kVarA));
                if (weakReference2 == null) {
                    n6.a(null);
                    return kVarA;
                }
                T7.k kVar2 = (T7.k) weakReference2.get();
                if (kVar2 != null) {
                    n6.a(null);
                    return kVar2;
                }
                concurrentMap2.remove(n6, weakReference2);
            } catch (java.lang.Throwable th) {
                n6.a(null);
                throw th;
            }
        }
    }
}
