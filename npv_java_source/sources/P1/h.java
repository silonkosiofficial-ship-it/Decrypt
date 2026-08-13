package P1;

/* JADX INFO: loaded from: classes.dex */
public final class h extends androidx.datastore.preferences.protobuf.AbstractC2062w implements androidx.datastore.preferences.protobuf.P {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final P1.h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile androidx.datastore.preferences.protobuf.X PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private java.lang.Object value_;

    public static final class a extends androidx.datastore.preferences.protobuf.AbstractC2062w.a implements androidx.datastore.preferences.protobuf.P {
        private a() {
            super(P1.h.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(P1.e eVar) {
            this();
        }

        public P1.h.a A(java.lang.String str) {
            n();
            ((P1.h) this.f22224D).o0(str);
            return this;
        }

        public P1.h.a B(P1.g.a aVar) {
            n();
            ((P1.h) this.f22224D).p0((P1.g) aVar.k());
            return this;
        }

        public P1.h.a u(boolean z6) {
            n();
            ((P1.h) this.f22224D).i0(z6);
            return this;
        }

        public P1.h.a v(androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047g) {
            n();
            ((P1.h) this.f22224D).j0(abstractC2047g);
            return this;
        }

        public P1.h.a w(double d6) {
            n();
            ((P1.h) this.f22224D).k0(d6);
            return this;
        }

        public P1.h.a x(float f6) {
            n();
            ((P1.h) this.f22224D).l0(f6);
            return this;
        }

        public P1.h.a y(int i6) {
            n();
            ((P1.h) this.f22224D).m0(i6);
            return this;
        }

        public P1.h.a z(long j6) {
            n();
            ((P1.h) this.f22224D).n0(j6);
            return this;
        }
    }

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);


        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f8295C;

        b(int i6) {
            this.f8295C = i6;
        }

        public static P1.h.b g(int i6) {
            switch (i6) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                case 8:
                    return BYTES;
                default:
                    return null;
            }
        }
    }

    static {
        P1.h hVar = new P1.h();
        DEFAULT_INSTANCE = hVar;
        androidx.datastore.preferences.protobuf.AbstractC2062w.K(P1.h.class, hVar);
    }

    private h() {
    }

    public static P1.h Z() {
        return DEFAULT_INSTANCE;
    }

    public static P1.h.a h0() {
        return (P1.h.a) DEFAULT_INSTANCE.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(boolean z6) {
        this.valueCase_ = 1;
        this.value_ = java.lang.Boolean.valueOf(z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047g) {
        abstractC2047g.getClass();
        this.valueCase_ = 8;
        this.value_ = abstractC2047g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(double d6) {
        this.valueCase_ = 7;
        this.value_ = java.lang.Double.valueOf(d6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(float f6) {
        this.valueCase_ = 2;
        this.value_ = java.lang.Float.valueOf(f6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(int i6) {
        this.valueCase_ = 3;
        this.value_ = java.lang.Integer.valueOf(i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(long j6) {
        this.valueCase_ = 4;
        this.value_ = java.lang.Long.valueOf(j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(java.lang.String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(P1.g gVar) {
        gVar.getClass();
        this.value_ = gVar;
        this.valueCase_ = 6;
    }

    public boolean X() {
        if (this.valueCase_ == 1) {
            return ((java.lang.Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public androidx.datastore.preferences.protobuf.AbstractC2047g Y() {
        return this.valueCase_ == 8 ? (androidx.datastore.preferences.protobuf.AbstractC2047g) this.value_ : androidx.datastore.preferences.protobuf.AbstractC2047g.f21988D;
    }

    public double a0() {
        if (this.valueCase_ == 7) {
            return ((java.lang.Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float b0() {
        if (this.valueCase_ == 2) {
            return ((java.lang.Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int c0() {
        if (this.valueCase_ == 3) {
            return ((java.lang.Integer) this.value_).intValue();
        }
        return 0;
    }

    public long d0() {
        if (this.valueCase_ == 4) {
            return ((java.lang.Long) this.value_).longValue();
        }
        return 0L;
    }

    public java.lang.String e0() {
        return this.valueCase_ == 5 ? (java.lang.String) this.value_ : "";
    }

    public P1.g f0() {
        return this.valueCase_ == 6 ? (P1.g) this.value_ : P1.g.S();
    }

    public P1.h.b g0() {
        return P1.h.b.g(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2062w
    protected final java.lang.Object r(androidx.datastore.preferences.protobuf.AbstractC2062w.d dVar, java.lang.Object obj, java.lang.Object obj2) {
        P1.e eVar = null;
        switch (P1.e.f8283a[dVar.ordinal()]) {
            case 1:
                return new P1.h();
            case 2:
                return new P1.h.a(eVar);
            case 3:
                return androidx.datastore.preferences.protobuf.AbstractC2062w.G(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001်\u0000\u0002ဴ\u0000\u0003့\u0000\u0004ဵ\u0000\u0005ျ\u0000\u0006ြ\u0000\u0007ဳ\u0000\bွ\u0000", new java.lang.Object[]{"value_", "valueCase_", "bitField0_", P1.g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.datastore.preferences.protobuf.X bVar = PARSER;
                if (bVar == null) {
                    synchronized (P1.h.class) {
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
