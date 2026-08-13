package ba;

/* JADX INFO: loaded from: classes2.dex */
public enum a {
    ZERO,
    ONE,
    TWO,
    FEW,
    MANY,
    OTHER;


    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final /* synthetic */ p157p7.a f24400K = p157p7.b.a(e());

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final ba.a.C0465a f24392C = new ba.a.C0465a(null);

    /* JADX INFO: renamed from: ba.a$a, reason: collision with other inner class name */
    public static final class C0465a {
        private C0465a() {
        }

        public /* synthetic */ C0465a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final ba.a a(java.lang.String str) {
            java.lang.Object next;
            p247y7.AbstractC7350t.f(str, "name");
            java.util.Iterator<E> it = ba.a.g().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (S8.r.K(((ba.a) next).name(), str, true)) {
                    return (ba.a) next;
                }
            }
            next = null;
            return (ba.a) next;
        }
    }

    public static p157p7.a g() {
        return f24400K;
    }
}
