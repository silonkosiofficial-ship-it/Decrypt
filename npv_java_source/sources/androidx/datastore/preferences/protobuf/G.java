package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class G implements androidx.datastore.preferences.protobuf.f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.datastore.preferences.protobuf.N f21930b = new androidx.datastore.preferences.protobuf.G.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.datastore.preferences.protobuf.N f21931a;

    class a implements androidx.datastore.preferences.protobuf.N {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public androidx.datastore.preferences.protobuf.M a(java.lang.Class cls) {
            throw new java.lang.IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public boolean b(java.lang.Class cls) {
            return false;
        }
    }

    private static class b implements androidx.datastore.preferences.protobuf.N {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.datastore.preferences.protobuf.N[] f21932a;

        b(androidx.datastore.preferences.protobuf.N... nArr) {
            this.f21932a = nArr;
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public androidx.datastore.preferences.protobuf.M a(java.lang.Class cls) {
            for (androidx.datastore.preferences.protobuf.N n6 : this.f21932a) {
                if (n6.b(cls)) {
                    return n6.a(cls);
                }
            }
            throw new java.lang.UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public boolean b(java.lang.Class cls) {
            for (androidx.datastore.preferences.protobuf.N n6 : this.f21932a) {
                if (n6.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public G() {
        this(b());
    }

    private G(androidx.datastore.preferences.protobuf.N n6) {
        this.f21931a = (androidx.datastore.preferences.protobuf.N) androidx.datastore.preferences.protobuf.AbstractC2064y.b(n6, "messageInfoFactory");
    }

    private static androidx.datastore.preferences.protobuf.N b() {
        return new androidx.datastore.preferences.protobuf.G.b(androidx.datastore.preferences.protobuf.C2061v.c(), c());
    }

    private static androidx.datastore.preferences.protobuf.N c() {
        try {
            return (androidx.datastore.preferences.protobuf.N) java.lang.Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (java.lang.Exception unused) {
            return f21930b;
        }
    }

    private static boolean d(androidx.datastore.preferences.protobuf.M m6) {
        return m6.c() == androidx.datastore.preferences.protobuf.Z.PROTO2;
    }

    private static androidx.datastore.preferences.protobuf.e0 e(java.lang.Class cls, androidx.datastore.preferences.protobuf.M m6) {
        if (androidx.datastore.preferences.protobuf.AbstractC2062w.class.isAssignableFrom(cls)) {
            return d(m6) ? androidx.datastore.preferences.protobuf.S.Q(cls, m6, androidx.datastore.preferences.protobuf.W.b(), androidx.datastore.preferences.protobuf.E.b(), androidx.datastore.preferences.protobuf.g0.L(), androidx.datastore.preferences.protobuf.r.b(), androidx.datastore.preferences.protobuf.L.b()) : androidx.datastore.preferences.protobuf.S.Q(cls, m6, androidx.datastore.preferences.protobuf.W.b(), androidx.datastore.preferences.protobuf.E.b(), androidx.datastore.preferences.protobuf.g0.L(), null, androidx.datastore.preferences.protobuf.L.b());
        }
        return d(m6) ? androidx.datastore.preferences.protobuf.S.Q(cls, m6, androidx.datastore.preferences.protobuf.W.a(), androidx.datastore.preferences.protobuf.E.a(), androidx.datastore.preferences.protobuf.g0.G(), androidx.datastore.preferences.protobuf.r.a(), androidx.datastore.preferences.protobuf.L.a()) : androidx.datastore.preferences.protobuf.S.Q(cls, m6, androidx.datastore.preferences.protobuf.W.a(), androidx.datastore.preferences.protobuf.E.a(), androidx.datastore.preferences.protobuf.g0.H(), null, androidx.datastore.preferences.protobuf.L.a());
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public androidx.datastore.preferences.protobuf.e0 a(java.lang.Class cls) {
        androidx.datastore.preferences.protobuf.l0 l0VarG;
        androidx.datastore.preferences.protobuf.AbstractC2056p abstractC2056pA;
        androidx.datastore.preferences.protobuf.g0.I(cls);
        androidx.datastore.preferences.protobuf.M mA = this.f21931a.a(cls);
        if (!mA.a()) {
            return e(cls, mA);
        }
        if (androidx.datastore.preferences.protobuf.AbstractC2062w.class.isAssignableFrom(cls)) {
            l0VarG = androidx.datastore.preferences.protobuf.g0.L();
            abstractC2056pA = androidx.datastore.preferences.protobuf.r.b();
        } else {
            l0VarG = androidx.datastore.preferences.protobuf.g0.G();
            abstractC2056pA = androidx.datastore.preferences.protobuf.r.a();
        }
        return androidx.datastore.preferences.protobuf.T.l(l0VarG, abstractC2056pA, mA.b());
    }
}
