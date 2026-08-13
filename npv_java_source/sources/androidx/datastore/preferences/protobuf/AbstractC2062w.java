package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2062w extends androidx.datastore.preferences.protobuf.AbstractC2041a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static java.util.Map<java.lang.Object, androidx.datastore.preferences.protobuf.AbstractC2062w> defaultInstanceMap = new j$.util.concurrent.ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected androidx.datastore.preferences.protobuf.m0 unknownFields = androidx.datastore.preferences.protobuf.m0.c();

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w$a */
    public static abstract class a extends androidx.datastore.preferences.protobuf.AbstractC2041a.AbstractC0418a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final androidx.datastore.preferences.protobuf.AbstractC2062w f22223C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        protected androidx.datastore.preferences.protobuf.AbstractC2062w f22224D;

        protected a(androidx.datastore.preferences.protobuf.AbstractC2062w abstractC2062w) {
            this.f22223C = abstractC2062w;
            if (abstractC2062w.B()) {
                throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
            }
            this.f22224D = t();
        }

        private static void r(java.lang.Object obj, java.lang.Object obj2) {
            androidx.datastore.preferences.protobuf.a0.a().d(obj).a(obj, obj2);
        }

        private androidx.datastore.preferences.protobuf.AbstractC2062w t() {
            return this.f22223C.H();
        }

        public final androidx.datastore.preferences.protobuf.AbstractC2062w k() {
            androidx.datastore.preferences.protobuf.AbstractC2062w abstractC2062wR = R();
            if (abstractC2062wR.z()) {
                return abstractC2062wR;
            }
            throw androidx.datastore.preferences.protobuf.AbstractC2041a.AbstractC0418a.j(abstractC2062wR);
        }

        @Override // androidx.datastore.preferences.protobuf.O.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public androidx.datastore.preferences.protobuf.AbstractC2062w R() {
            if (!this.f22224D.B()) {
                return this.f22224D;
            }
            this.f22224D.C();
            return this.f22224D;
        }

        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public androidx.datastore.preferences.protobuf.AbstractC2062w.a clone() {
            androidx.datastore.preferences.protobuf.AbstractC2062w.a aVarC = a().c();
            aVarC.f22224D = R();
            return aVarC;
        }

        protected final void n() {
            if (this.f22224D.B()) {
                return;
            }
            p();
        }

        protected void p() {
            androidx.datastore.preferences.protobuf.AbstractC2062w abstractC2062wT = t();
            r(abstractC2062wT, this.f22224D);
            this.f22224D = abstractC2062wT;
        }

        @Override // androidx.datastore.preferences.protobuf.P
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public androidx.datastore.preferences.protobuf.AbstractC2062w a() {
            return this.f22223C;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w$b */
    protected static class b extends androidx.datastore.preferences.protobuf.AbstractC2042b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.datastore.preferences.protobuf.AbstractC2062w f22225b;

        public b(androidx.datastore.preferences.protobuf.AbstractC2062w abstractC2062w) {
            this.f22225b = abstractC2062w;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w$c */
    public static class c extends androidx.datastore.preferences.protobuf.AbstractC2053m {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static final boolean A(androidx.datastore.preferences.protobuf.AbstractC2062w abstractC2062w, boolean z6) {
        byte bByteValue = ((java.lang.Byte) abstractC2062w.p(androidx.datastore.preferences.protobuf.AbstractC2062w.d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = androidx.datastore.preferences.protobuf.a0.a().d(abstractC2062w).d(abstractC2062w);
        if (z6) {
            abstractC2062w.q(androidx.datastore.preferences.protobuf.AbstractC2062w.d.SET_MEMOIZED_IS_INITIALIZED, zD ? abstractC2062w : null);
        }
        return zD;
    }

    protected static androidx.datastore.preferences.protobuf.AbstractC2064y.b E(androidx.datastore.preferences.protobuf.AbstractC2064y.b bVar) {
        int size = bVar.size();
        return bVar.u(size == 0 ? 10 : size * 2);
    }

    protected static java.lang.Object G(androidx.datastore.preferences.protobuf.O o6, java.lang.String str, java.lang.Object[] objArr) {
        return new androidx.datastore.preferences.protobuf.c0(o6, str, objArr);
    }

    protected static androidx.datastore.preferences.protobuf.AbstractC2062w I(androidx.datastore.preferences.protobuf.AbstractC2062w abstractC2062w, java.io.InputStream inputStream) {
        return j(J(abstractC2062w, androidx.datastore.preferences.protobuf.AbstractC2048h.f(inputStream), androidx.datastore.preferences.protobuf.C2055o.b()));
    }

    static androidx.datastore.preferences.protobuf.AbstractC2062w J(androidx.datastore.preferences.protobuf.AbstractC2062w abstractC2062w, androidx.datastore.preferences.protobuf.AbstractC2048h abstractC2048h, androidx.datastore.preferences.protobuf.C2055o c2055o) throws androidx.datastore.preferences.protobuf.C2065z {
        androidx.datastore.preferences.protobuf.AbstractC2062w abstractC2062wH = abstractC2062w.H();
        try {
            androidx.datastore.preferences.protobuf.e0 e0VarD = androidx.datastore.preferences.protobuf.a0.a().d(abstractC2062wH);
            e0VarD.b(abstractC2062wH, androidx.datastore.preferences.protobuf.C2049i.Q(abstractC2048h), c2055o);
            e0VarD.c(abstractC2062wH);
            return abstractC2062wH;
        } catch (androidx.datastore.preferences.protobuf.k0 e6) {
            throw e6.a().k(abstractC2062wH);
        } catch (androidx.datastore.preferences.protobuf.C2065z e10) {
            e = e10;
            if (e.a()) {
                e = new androidx.datastore.preferences.protobuf.C2065z(e);
            }
            throw e.k(abstractC2062wH);
        } catch (java.io.IOException e11) {
            if (e11.getCause() instanceof androidx.datastore.preferences.protobuf.C2065z) {
                throw ((androidx.datastore.preferences.protobuf.C2065z) e11.getCause());
            }
            throw new androidx.datastore.preferences.protobuf.C2065z(e11).k(abstractC2062wH);
        } catch (java.lang.RuntimeException e12) {
            if (e12.getCause() instanceof androidx.datastore.preferences.protobuf.C2065z) {
                throw ((androidx.datastore.preferences.protobuf.C2065z) e12.getCause());
            }
            throw e12;
        }
    }

    protected static void K(java.lang.Class cls, androidx.datastore.preferences.protobuf.AbstractC2062w abstractC2062w) {
        abstractC2062w.D();
        defaultInstanceMap.put(cls, abstractC2062w);
    }

    private static androidx.datastore.preferences.protobuf.AbstractC2062w j(androidx.datastore.preferences.protobuf.AbstractC2062w abstractC2062w) throws androidx.datastore.preferences.protobuf.C2065z {
        if (abstractC2062w == null || abstractC2062w.z()) {
            return abstractC2062w;
        }
        throw abstractC2062w.g().a().k(abstractC2062w);
    }

    private int n(androidx.datastore.preferences.protobuf.e0 e0Var) {
        return e0Var == null ? androidx.datastore.preferences.protobuf.a0.a().d(this).g(this) : e0Var.g(this);
    }

    protected static androidx.datastore.preferences.protobuf.AbstractC2064y.b s() {
        return androidx.datastore.preferences.protobuf.b0.f();
    }

    static androidx.datastore.preferences.protobuf.AbstractC2062w t(java.lang.Class cls) {
        androidx.datastore.preferences.protobuf.AbstractC2062w abstractC2062wA = defaultInstanceMap.get(cls);
        if (abstractC2062wA == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2062wA = defaultInstanceMap.get(cls);
            } catch (java.lang.ClassNotFoundException e6) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (abstractC2062wA == null) {
            abstractC2062wA = ((androidx.datastore.preferences.protobuf.AbstractC2062w) androidx.datastore.preferences.protobuf.p0.k(cls)).a();
            if (abstractC2062wA == null) {
                throw new java.lang.IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC2062wA);
        }
        return abstractC2062wA;
    }

    static java.lang.Object y(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (java.lang.IllegalAccessException e6) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e6);
        } catch (java.lang.reflect.InvocationTargetException e10) {
            java.lang.Throwable cause = e10.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    boolean B() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    protected void C() {
        androidx.datastore.preferences.protobuf.a0.a().d(this).c(this);
        D();
    }

    void D() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final androidx.datastore.preferences.protobuf.AbstractC2062w.a c() {
        return (androidx.datastore.preferences.protobuf.AbstractC2062w.a) p(androidx.datastore.preferences.protobuf.AbstractC2062w.d.NEW_BUILDER);
    }

    androidx.datastore.preferences.protobuf.AbstractC2062w H() {
        return (androidx.datastore.preferences.protobuf.AbstractC2062w) p(androidx.datastore.preferences.protobuf.AbstractC2062w.d.NEW_MUTABLE_INSTANCE);
    }

    void L(int i6) {
        this.memoizedHashCode = i6;
    }

    void M(int i6) {
        if (i6 >= 0) {
            this.memoizedSerializedSize = (i6 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + i6);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public int b() {
        return f(null);
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public void d(androidx.datastore.preferences.protobuf.AbstractC2050j abstractC2050j) {
        androidx.datastore.preferences.protobuf.a0.a().d(this).e(this, androidx.datastore.preferences.protobuf.C2051k.P(abstractC2050j));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return androidx.datastore.preferences.protobuf.a0.a().d(this).f(this, (androidx.datastore.preferences.protobuf.AbstractC2062w) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2041a
    int f(androidx.datastore.preferences.protobuf.e0 e0Var) {
        if (!B()) {
            if (w() != Integer.MAX_VALUE) {
                return w();
            }
            int iN = n(e0Var);
            M(iN);
            return iN;
        }
        int iN2 = n(e0Var);
        if (iN2 >= 0) {
            return iN2;
        }
        throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + iN2);
    }

    public int hashCode() {
        if (B()) {
            return m();
        }
        if (x()) {
            L(m());
        }
        return v();
    }

    java.lang.Object i() {
        return p(androidx.datastore.preferences.protobuf.AbstractC2062w.d.BUILD_MESSAGE_INFO);
    }

    void k() {
        this.memoizedHashCode = 0;
    }

    void l() {
        M(Integer.MAX_VALUE);
    }

    int m() {
        return androidx.datastore.preferences.protobuf.a0.a().d(this).i(this);
    }

    protected final androidx.datastore.preferences.protobuf.AbstractC2062w.a o() {
        return (androidx.datastore.preferences.protobuf.AbstractC2062w.a) p(androidx.datastore.preferences.protobuf.AbstractC2062w.d.NEW_BUILDER);
    }

    protected java.lang.Object p(androidx.datastore.preferences.protobuf.AbstractC2062w.d dVar) {
        return r(dVar, null, null);
    }

    protected java.lang.Object q(androidx.datastore.preferences.protobuf.AbstractC2062w.d dVar, java.lang.Object obj) {
        return r(dVar, obj, null);
    }

    protected abstract java.lang.Object r(androidx.datastore.preferences.protobuf.AbstractC2062w.d dVar, java.lang.Object obj, java.lang.Object obj2);

    public java.lang.String toString() {
        return androidx.datastore.preferences.protobuf.Q.f(this, super.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.P
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final androidx.datastore.preferences.protobuf.AbstractC2062w a() {
        return (androidx.datastore.preferences.protobuf.AbstractC2062w) p(androidx.datastore.preferences.protobuf.AbstractC2062w.d.GET_DEFAULT_INSTANCE);
    }

    int v() {
        return this.memoizedHashCode;
    }

    int w() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    boolean x() {
        return v() == 0;
    }

    public final boolean z() {
        return A(this, true);
    }
}
