package I7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class F {

    public static class a extends I7.F.b implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final p237x7.a f5326D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private volatile java.lang.ref.SoftReference f5327E;

        public a(java.lang.Object obj, p237x7.a aVar) {
            if (aVar == null) {
                g(0);
            }
            this.f5327E = null;
            this.f5326D = aVar;
            if (obj != null) {
                this.f5327E = new java.lang.ref.SoftReference(a(obj));
            }
        }

        private static /* synthetic */ void g(int i6) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // I7.F.b, p237x7.a
        public java.lang.Object b() {
            java.lang.Object obj;
            java.lang.ref.SoftReference softReference = this.f5327E;
            if (softReference != null && (obj = softReference.get()) != null) {
                return f(obj);
            }
            java.lang.Object objB = this.f5326D.b();
            this.f5327E = new java.lang.ref.SoftReference(a(objB));
            return objB;
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private static final java.lang.Object f5328C = new I7.F.b.a();

        static class a {
            a() {
            }
        }

        protected java.lang.Object a(java.lang.Object obj) {
            return obj == null ? f5328C : obj;
        }

        public abstract java.lang.Object b();

        public final java.lang.Object e(java.lang.Object obj, java.lang.Object obj2) {
            return b();
        }

        protected java.lang.Object f(java.lang.Object obj) {
            if (obj == f5328C) {
                return null;
            }
            return obj;
        }
    }

    private static /* synthetic */ void a(int i6) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public static I7.F.a b(java.lang.Object obj, p237x7.a aVar) {
        if (aVar == null) {
            a(0);
        }
        return new I7.F.a(obj, aVar);
    }

    public static I7.F.a c(p237x7.a aVar) {
        if (aVar == null) {
            a(1);
        }
        return b(null, aVar);
    }
}
