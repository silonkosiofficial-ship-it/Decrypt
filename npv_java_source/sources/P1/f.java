package P1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends androidx.datastore.preferences.protobuf.AbstractC2062w implements androidx.datastore.preferences.protobuf.P {
    private static final P1.f DEFAULT_INSTANCE;
    private static volatile androidx.datastore.preferences.protobuf.X PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private androidx.datastore.preferences.protobuf.I preferences_ = androidx.datastore.preferences.protobuf.I.d();

    public static final class a extends androidx.datastore.preferences.protobuf.AbstractC2062w.a implements androidx.datastore.preferences.protobuf.P {
        private a() {
            super(P1.f.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(P1.e eVar) {
            this();
        }

        public P1.f.a u(java.lang.String str, P1.h hVar) {
            str.getClass();
            hVar.getClass();
            n();
            ((P1.f) this.f22224D).P().put(str, hVar);
            return this;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final androidx.datastore.preferences.protobuf.H f8284a = androidx.datastore.preferences.protobuf.H.d(androidx.datastore.preferences.protobuf.r0.b.f22122M, "", androidx.datastore.preferences.protobuf.r0.b.f22124O, P1.h.Z());
    }

    static {
        P1.f fVar = new P1.f();
        DEFAULT_INSTANCE = fVar;
        androidx.datastore.preferences.protobuf.AbstractC2062w.K(P1.f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Map P() {
        return S();
    }

    private androidx.datastore.preferences.protobuf.I S() {
        if (!this.preferences_.k()) {
            this.preferences_ = this.preferences_.p();
        }
        return this.preferences_;
    }

    private androidx.datastore.preferences.protobuf.I T() {
        return this.preferences_;
    }

    public static P1.f.a U() {
        return (P1.f.a) DEFAULT_INSTANCE.o();
    }

    public static P1.f V(java.io.InputStream inputStream) {
        return (P1.f) androidx.datastore.preferences.protobuf.AbstractC2062w.I(DEFAULT_INSTANCE, inputStream);
    }

    public java.util.Map Q() {
        return j$.util.DesugarCollections.unmodifiableMap(T());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2062w
    protected final java.lang.Object r(androidx.datastore.preferences.protobuf.AbstractC2062w.d dVar, java.lang.Object obj, java.lang.Object obj2) {
        P1.e eVar = null;
        switch (P1.e.f8283a[dVar.ordinal()]) {
            case 1:
                return new P1.f();
            case 2:
                return new P1.f.a(eVar);
            case 3:
                return androidx.datastore.preferences.protobuf.AbstractC2062w.G(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"preferences_", P1.f.b.f8284a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.datastore.preferences.protobuf.X bVar = PARSER;
                if (bVar == null) {
                    synchronized (P1.f.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new androidx.datastore.preferences.protobuf.AbstractC2062w.b(DEFAULT_INSTANCE);
                                PARSER = bVar;
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }
}
