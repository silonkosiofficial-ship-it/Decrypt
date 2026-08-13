package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sun.misc.Unsafe f22083a = D();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.Class f22084b = androidx.datastore.preferences.protobuf.AbstractC2044d.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f22085c = o(java.lang.Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f22086d = o(java.lang.Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final androidx.datastore.preferences.protobuf.p0.e f22087e = B();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f22088f = T();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f22089g = S();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final long f22090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f22091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f22092j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f22093k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f22094l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f22095m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f22096n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f22097o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f22098p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f22099q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f22100r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f22101s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f22102t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f22103u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f22104v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final boolean f22105w;

    class a implements java.security.PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public sun.misc.Unsafe run() throws java.lang.IllegalAccessException {
            for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                java.lang.Object obj = field.get(null);
                if (sun.misc.Unsafe.class.isInstance(obj)) {
                    return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends androidx.datastore.preferences.protobuf.p0.e {
        b(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(java.lang.Object obj, long j6) {
            return androidx.datastore.preferences.protobuf.p0.f22105w ? androidx.datastore.preferences.protobuf.p0.s(obj, j6) : androidx.datastore.preferences.protobuf.p0.t(obj, j6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public byte d(java.lang.Object obj, long j6) {
            return androidx.datastore.preferences.protobuf.p0.f22105w ? androidx.datastore.preferences.protobuf.p0.v(obj, j6) : androidx.datastore.preferences.protobuf.p0.w(obj, j6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double e(java.lang.Object obj, long j6) {
            return java.lang.Double.longBitsToDouble(h(obj, j6));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float f(java.lang.Object obj, long j6) {
            return java.lang.Float.intBitsToFloat(g(obj, j6));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(java.lang.Object obj, long j6, boolean z6) {
            if (androidx.datastore.preferences.protobuf.p0.f22105w) {
                androidx.datastore.preferences.protobuf.p0.I(obj, j6, z6);
            } else {
                androidx.datastore.preferences.protobuf.p0.J(obj, j6, z6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(java.lang.Object obj, long j6, byte b6) {
            if (androidx.datastore.preferences.protobuf.p0.f22105w) {
                androidx.datastore.preferences.protobuf.p0.L(obj, j6, b6);
            } else {
                androidx.datastore.preferences.protobuf.p0.M(obj, j6, b6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(java.lang.Object obj, long j6, double d6) {
            p(obj, j6, java.lang.Double.doubleToLongBits(d6));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void n(java.lang.Object obj, long j6, float f6) {
            o(obj, j6, java.lang.Float.floatToIntBits(f6));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean s() {
            return false;
        }
    }

    private static final class c extends androidx.datastore.preferences.protobuf.p0.e {
        c(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(java.lang.Object obj, long j6) {
            return androidx.datastore.preferences.protobuf.p0.f22105w ? androidx.datastore.preferences.protobuf.p0.s(obj, j6) : androidx.datastore.preferences.protobuf.p0.t(obj, j6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public byte d(java.lang.Object obj, long j6) {
            return androidx.datastore.preferences.protobuf.p0.f22105w ? androidx.datastore.preferences.protobuf.p0.v(obj, j6) : androidx.datastore.preferences.protobuf.p0.w(obj, j6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double e(java.lang.Object obj, long j6) {
            return java.lang.Double.longBitsToDouble(h(obj, j6));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float f(java.lang.Object obj, long j6) {
            return java.lang.Float.intBitsToFloat(g(obj, j6));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(java.lang.Object obj, long j6, boolean z6) {
            if (androidx.datastore.preferences.protobuf.p0.f22105w) {
                androidx.datastore.preferences.protobuf.p0.I(obj, j6, z6);
            } else {
                androidx.datastore.preferences.protobuf.p0.J(obj, j6, z6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(java.lang.Object obj, long j6, byte b6) {
            if (androidx.datastore.preferences.protobuf.p0.f22105w) {
                androidx.datastore.preferences.protobuf.p0.L(obj, j6, b6);
            } else {
                androidx.datastore.preferences.protobuf.p0.M(obj, j6, b6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(java.lang.Object obj, long j6, double d6) {
            p(obj, j6, java.lang.Double.doubleToLongBits(d6));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void n(java.lang.Object obj, long j6, float f6) {
            o(obj, j6, java.lang.Float.floatToIntBits(f6));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean s() {
            return false;
        }
    }

    private static final class d extends androidx.datastore.preferences.protobuf.p0.e {
        d(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(java.lang.Object obj, long j6) {
            return this.f22106a.getBoolean(obj, j6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public byte d(java.lang.Object obj, long j6) {
            return this.f22106a.getByte(obj, j6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double e(java.lang.Object obj, long j6) {
            return this.f22106a.getDouble(obj, j6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float f(java.lang.Object obj, long j6) {
            return this.f22106a.getFloat(obj, j6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(java.lang.Object obj, long j6, boolean z6) {
            this.f22106a.putBoolean(obj, j6, z6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(java.lang.Object obj, long j6, byte b6) {
            this.f22106a.putByte(obj, j6, b6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(java.lang.Object obj, long j6, double d6) {
            this.f22106a.putDouble(obj, j6, d6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void n(java.lang.Object obj, long j6, float f6) {
            this.f22106a.putFloat(obj, j6, f6);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                java.lang.Class<?> cls = this.f22106a.getClass();
                java.lang.Class<?> cls2 = java.lang.Long.TYPE;
                cls.getMethod("getByte", java.lang.Object.class, cls2);
                cls.getMethod("putByte", java.lang.Object.class, cls2, java.lang.Byte.TYPE);
                cls.getMethod("getBoolean", java.lang.Object.class, cls2);
                cls.getMethod("putBoolean", java.lang.Object.class, cls2, java.lang.Boolean.TYPE);
                cls.getMethod("getFloat", java.lang.Object.class, cls2);
                cls.getMethod("putFloat", java.lang.Object.class, cls2, java.lang.Float.TYPE);
                cls.getMethod("getDouble", java.lang.Object.class, cls2);
                cls.getMethod("putDouble", java.lang.Object.class, cls2, java.lang.Double.TYPE);
                return true;
            } catch (java.lang.Throwable th) {
                androidx.datastore.preferences.protobuf.p0.G(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean s() {
            if (!super.s()) {
                return false;
            }
            try {
                java.lang.Class<?> cls = this.f22106a.getClass();
                java.lang.Class<?> cls2 = java.lang.Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, java.lang.Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, java.lang.Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", java.lang.Object.class, cls2, java.lang.Object.class, cls2, cls2);
                return true;
            } catch (java.lang.Throwable th) {
                androidx.datastore.preferences.protobuf.p0.G(th);
                return false;
            }
        }
    }

    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        sun.misc.Unsafe f22106a;

        e(sun.misc.Unsafe unsafe) {
            this.f22106a = unsafe;
        }

        public final int a(java.lang.Class cls) {
            return this.f22106a.arrayBaseOffset(cls);
        }

        public final int b(java.lang.Class cls) {
            return this.f22106a.arrayIndexScale(cls);
        }

        public abstract boolean c(java.lang.Object obj, long j6);

        public abstract byte d(java.lang.Object obj, long j6);

        public abstract double e(java.lang.Object obj, long j6);

        public abstract float f(java.lang.Object obj, long j6);

        public final int g(java.lang.Object obj, long j6) {
            return this.f22106a.getInt(obj, j6);
        }

        public final long h(java.lang.Object obj, long j6) {
            return this.f22106a.getLong(obj, j6);
        }

        public final java.lang.Object i(java.lang.Object obj, long j6) {
            return this.f22106a.getObject(obj, j6);
        }

        public final long j(java.lang.reflect.Field field) {
            return this.f22106a.objectFieldOffset(field);
        }

        public abstract void k(java.lang.Object obj, long j6, boolean z6);

        public abstract void l(java.lang.Object obj, long j6, byte b6);

        public abstract void m(java.lang.Object obj, long j6, double d6);

        public abstract void n(java.lang.Object obj, long j6, float f6);

        public final void o(java.lang.Object obj, long j6, int i6) {
            this.f22106a.putInt(obj, j6, i6);
        }

        public final void p(java.lang.Object obj, long j6, long j10) {
            this.f22106a.putLong(obj, j6, j10);
        }

        public final void q(java.lang.Object obj, long j6, java.lang.Object obj2) {
            this.f22106a.putObject(obj, j6, obj2);
        }

        public boolean r() {
            sun.misc.Unsafe unsafe = this.f22106a;
            if (unsafe == null) {
                return false;
            }
            try {
                java.lang.Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("arrayBaseOffset", java.lang.Class.class);
                cls.getMethod("arrayIndexScale", java.lang.Class.class);
                java.lang.Class<?> cls2 = java.lang.Long.TYPE;
                cls.getMethod("getInt", java.lang.Object.class, cls2);
                cls.getMethod("putInt", java.lang.Object.class, cls2, java.lang.Integer.TYPE);
                cls.getMethod("getLong", java.lang.Object.class, cls2);
                cls.getMethod("putLong", java.lang.Object.class, cls2, cls2);
                cls.getMethod("getObject", java.lang.Object.class, cls2);
                cls.getMethod("putObject", java.lang.Object.class, cls2, java.lang.Object.class);
                return true;
            } catch (java.lang.Throwable th) {
                androidx.datastore.preferences.protobuf.p0.G(th);
                return false;
            }
        }

        public boolean s() {
            sun.misc.Unsafe unsafe = this.f22106a;
            if (unsafe == null) {
                return false;
            }
            try {
                java.lang.Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
                return androidx.datastore.preferences.protobuf.p0.n() != null;
            } catch (java.lang.Throwable th) {
                androidx.datastore.preferences.protobuf.p0.G(th);
                return false;
            }
        }
    }

    static {
        long jL = l(byte[].class);
        f22090h = jL;
        f22091i = l(boolean[].class);
        f22092j = m(boolean[].class);
        f22093k = l(int[].class);
        f22094l = m(int[].class);
        f22095m = l(long[].class);
        f22096n = m(long[].class);
        f22097o = l(float[].class);
        f22098p = m(float[].class);
        f22099q = l(double[].class);
        f22100r = m(double[].class);
        f22101s = l(java.lang.Object[].class);
        f22102t = m(java.lang.Object[].class);
        f22103u = q(n());
        f22104v = (int) (jL & 7);
        f22105w = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    static long A(java.lang.Object obj, long j6) {
        return f22087e.h(obj, j6);
    }

    private static androidx.datastore.preferences.protobuf.p0.e B() {
        sun.misc.Unsafe unsafe = f22083a;
        if (unsafe == null) {
            return null;
        }
        if (!androidx.datastore.preferences.protobuf.AbstractC2044d.c()) {
            return new androidx.datastore.preferences.protobuf.p0.d(unsafe);
        }
        if (f22085c) {
            return new androidx.datastore.preferences.protobuf.p0.c(unsafe);
        }
        if (f22086d) {
            return new androidx.datastore.preferences.protobuf.p0.b(unsafe);
        }
        return null;
    }

    static java.lang.Object C(java.lang.Object obj, long j6) {
        return f22087e.i(obj, j6);
    }

    static sun.misc.Unsafe D() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new androidx.datastore.preferences.protobuf.p0.a());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static boolean E() {
        return f22089g;
    }

    static boolean F() {
        return f22088f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(java.lang.Throwable th) {
        java.util.logging.Logger.getLogger(androidx.datastore.preferences.protobuf.p0.class.getName()).log(java.util.logging.Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    static void H(java.lang.Object obj, long j6, boolean z6) {
        f22087e.k(obj, j6, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(java.lang.Object obj, long j6, boolean z6) {
        L(obj, j6, z6 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(java.lang.Object obj, long j6, boolean z6) {
        M(obj, j6, z6 ? (byte) 1 : (byte) 0);
    }

    static void K(byte[] bArr, long j6, byte b6) {
        f22087e.l(bArr, f22090h + j6, b6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void L(java.lang.Object obj, long j6, byte b6) {
        long j10 = (-4) & j6;
        int iZ = z(obj, j10);
        int i6 = ((~((int) j6)) & 3) << 3;
        P(obj, j10, ((255 & b6) << i6) | (iZ & (~(255 << i6))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void M(java.lang.Object obj, long j6, byte b6) {
        long j10 = (-4) & j6;
        int i6 = (((int) j6) & 3) << 3;
        P(obj, j10, ((255 & b6) << i6) | (z(obj, j10) & (~(255 << i6))));
    }

    static void N(java.lang.Object obj, long j6, double d6) {
        f22087e.m(obj, j6, d6);
    }

    static void O(java.lang.Object obj, long j6, float f6) {
        f22087e.n(obj, j6, f6);
    }

    static void P(java.lang.Object obj, long j6, int i6) {
        f22087e.o(obj, j6, i6);
    }

    static void Q(java.lang.Object obj, long j6, long j10) {
        f22087e.p(obj, j6, j10);
    }

    static void R(java.lang.Object obj, long j6, java.lang.Object obj2) {
        f22087e.q(obj, j6, obj2);
    }

    private static boolean S() {
        androidx.datastore.preferences.protobuf.p0.e eVar = f22087e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    private static boolean T() {
        androidx.datastore.preferences.protobuf.p0.e eVar = f22087e;
        if (eVar == null) {
            return false;
        }
        return eVar.s();
    }

    static java.lang.Object k(java.lang.Class cls) {
        try {
            return f22083a.allocateInstance(cls);
        } catch (java.lang.InstantiationException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }

    private static int l(java.lang.Class cls) {
        if (f22089g) {
            return f22087e.a(cls);
        }
        return -1;
    }

    private static int m(java.lang.Class cls) {
        if (f22089g) {
            return f22087e.b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Field n() {
        java.lang.reflect.Field fieldP;
        if (androidx.datastore.preferences.protobuf.AbstractC2044d.c() && (fieldP = p(java.nio.Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldP;
        }
        java.lang.reflect.Field fieldP2 = p(java.nio.Buffer.class, "address");
        if (fieldP2 == null || fieldP2.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return fieldP2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean o(java.lang.Class cls) {
        if (!androidx.datastore.preferences.protobuf.AbstractC2044d.c()) {
            return false;
        }
        try {
            java.lang.Class cls2 = f22084b;
            java.lang.Class cls3 = java.lang.Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, java.lang.Long.TYPE, cls3);
            java.lang.Class cls4 = java.lang.Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, java.lang.Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    private static java.lang.reflect.Field p(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static long q(java.lang.reflect.Field field) {
        androidx.datastore.preferences.protobuf.p0.e eVar;
        if (field == null || (eVar = f22087e) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    static boolean r(java.lang.Object obj, long j6) {
        return f22087e.c(obj, j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean s(java.lang.Object obj, long j6) {
        return v(obj, j6) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(java.lang.Object obj, long j6) {
        return w(obj, j6) != 0;
    }

    static byte u(byte[] bArr, long j6) {
        return f22087e.d(bArr, f22090h + j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte v(java.lang.Object obj, long j6) {
        return (byte) ((z(obj, (-4) & j6) >>> ((int) (((~j6) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte w(java.lang.Object obj, long j6) {
        return (byte) ((z(obj, (-4) & j6) >>> ((int) ((j6 & 3) << 3))) & 255);
    }

    static double x(java.lang.Object obj, long j6) {
        return f22087e.e(obj, j6);
    }

    static float y(java.lang.Object obj, long j6) {
        return f22087e.f(obj, j6);
    }

    static int z(java.lang.Object obj, long j6) {
        return f22087e.g(obj, j6);
    }
}
