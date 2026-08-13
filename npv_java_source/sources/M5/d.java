package M5;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile M5.d f7031b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Set f7032a = new java.util.HashSet();

    d() {
    }

    public static M5.d a() {
        M5.d dVar = f7031b;
        if (dVar == null) {
            synchronized (M5.d.class) {
                try {
                    dVar = f7031b;
                    if (dVar == null) {
                        dVar = new M5.d();
                        f7031b = dVar;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return dVar;
    }

    java.util.Set b() {
        java.util.Set setUnmodifiableSet;
        synchronized (this.f7032a) {
            setUnmodifiableSet = j$.util.DesugarCollections.unmodifiableSet(this.f7032a);
        }
        return setUnmodifiableSet;
    }
}
