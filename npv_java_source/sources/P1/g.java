package P1;

/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.datastore.preferences.protobuf.AbstractC2062w implements androidx.datastore.preferences.protobuf.P {
    private static final P1.g DEFAULT_INSTANCE;
    private static volatile androidx.datastore.preferences.protobuf.X PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private androidx.datastore.preferences.protobuf.AbstractC2064y.b strings_ = androidx.datastore.preferences.protobuf.AbstractC2062w.s();

    public static final class a extends androidx.datastore.preferences.protobuf.AbstractC2062w.a implements androidx.datastore.preferences.protobuf.P {
        private a() {
            super(P1.g.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(P1.e eVar) {
            this();
        }

        public P1.g.a u(java.lang.Iterable iterable) {
            n();
            ((P1.g) this.f22224D).P(iterable);
            return this;
        }
    }

    static {
        P1.g gVar = new P1.g();
        DEFAULT_INSTANCE = gVar;
        androidx.datastore.preferences.protobuf.AbstractC2062w.K(P1.g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(java.lang.Iterable iterable) {
        Q();
        androidx.datastore.preferences.protobuf.AbstractC2041a.e(iterable, this.strings_);
    }

    private void Q() {
        androidx.datastore.preferences.protobuf.AbstractC2064y.b bVar = this.strings_;
        if (bVar.I()) {
            return;
        }
        this.strings_ = androidx.datastore.preferences.protobuf.AbstractC2062w.E(bVar);
    }

    public static P1.g S() {
        return DEFAULT_INSTANCE;
    }

    public static P1.g.a U() {
        return (P1.g.a) DEFAULT_INSTANCE.o();
    }

    public java.util.List T() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2062w
    protected final java.lang.Object r(androidx.datastore.preferences.protobuf.AbstractC2062w.d dVar, java.lang.Object obj, java.lang.Object obj2) {
        P1.e eVar = null;
        switch (P1.e.f8283a[dVar.ordinal()]) {
            case 1:
                return new P1.g();
            case 2:
                return new P1.g.a(eVar);
            case 3:
                return androidx.datastore.preferences.protobuf.AbstractC2062w.G(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new java.lang.Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.datastore.preferences.protobuf.X bVar = PARSER;
                if (bVar == null) {
                    synchronized (P1.g.class) {
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
