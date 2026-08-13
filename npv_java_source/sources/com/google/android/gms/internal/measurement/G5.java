package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
abstract class G5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sun.misc.Unsafe f40512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.Class f40513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f40514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f40515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.G5.b f40516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f40517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f40518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f40519h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final boolean f40520i;

    private static final class a extends com.google.android.gms.internal.measurement.G5.b {
        a(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.G5.b
        public final double a(java.lang.Object obj, long j6) {
            return java.lang.Double.longBitsToDouble(m(obj, j6));
        }

        @Override // com.google.android.gms.internal.measurement.G5.b
        public final void b(java.lang.Object obj, long j6, byte b6) {
            if (com.google.android.gms.internal.measurement.G5.f40520i) {
                com.google.android.gms.internal.measurement.G5.u(obj, j6, b6);
            } else {
                com.google.android.gms.internal.measurement.G5.y(obj, j6, b6);
            }
        }

        @Override // com.google.android.gms.internal.measurement.G5.b
        public final void c(java.lang.Object obj, long j6, double d6) {
            f(obj, j6, java.lang.Double.doubleToLongBits(d6));
        }

        @Override // com.google.android.gms.internal.measurement.G5.b
        public final void d(java.lang.Object obj, long j6, float f6) {
            e(obj, j6, java.lang.Float.floatToIntBits(f6));
        }

        @Override // com.google.android.gms.internal.measurement.G5.b
        public final void g(java.lang.Object obj, long j6, boolean z6) {
            if (com.google.android.gms.internal.measurement.G5.f40520i) {
                com.google.android.gms.internal.measurement.G5.k(obj, j6, z6);
            } else {
                com.google.android.gms.internal.measurement.G5.r(obj, j6, z6);
            }
        }

        @Override // com.google.android.gms.internal.measurement.G5.b
        public final float i(java.lang.Object obj, long j6) {
            return java.lang.Float.intBitsToFloat(l(obj, j6));
        }

        @Override // com.google.android.gms.internal.measurement.G5.b
        public final boolean k(java.lang.Object obj, long j6) {
            return com.google.android.gms.internal.measurement.G5.f40520i ? com.google.android.gms.internal.measurement.G5.D(obj, j6) : com.google.android.gms.internal.measurement.G5.E(obj, j6);
        }
    }

    private static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        sun.misc.Unsafe f40521a;

        b(sun.misc.Unsafe unsafe) {
            this.f40521a = unsafe;
        }

        public abstract double a(java.lang.Object obj, long j6);

        public abstract void b(java.lang.Object obj, long j6, byte b6);

        public abstract void c(java.lang.Object obj, long j6, double d6);

        public abstract void d(java.lang.Object obj, long j6, float f6);

        public final void e(java.lang.Object obj, long j6, int i6) {
            this.f40521a.putInt(obj, j6, i6);
        }

        public final void f(java.lang.Object obj, long j6, long j10) {
            this.f40521a.putLong(obj, j6, j10);
        }

        public abstract void g(java.lang.Object obj, long j6, boolean z6);

        public final boolean h() {
            sun.misc.Unsafe unsafe = this.f40521a;
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
                com.google.android.gms.internal.measurement.G5.l(th);
                return false;
            }
        }

        public abstract float i(java.lang.Object obj, long j6);

        public final boolean j() {
            sun.misc.Unsafe unsafe = this.f40521a;
            if (unsafe == null) {
                return false;
            }
            try {
                java.lang.Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
                return com.google.android.gms.internal.measurement.G5.C() != null;
            } catch (java.lang.Throwable th) {
                com.google.android.gms.internal.measurement.G5.l(th);
                return false;
            }
        }

        public abstract boolean k(java.lang.Object obj, long j6);

        public final int l(java.lang.Object obj, long j6) {
            return this.f40521a.getInt(obj, j6);
        }

        public final long m(java.lang.Object obj, long j6) {
            return this.f40521a.getLong(obj, j6);
        }
    }

    private static final class c extends com.google.android.gms.internal.measurement.G5.b {
        c(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.G5.b
        public final double a(java.lang.Object obj, long j6) {
            return java.lang.Double.longBitsToDouble(m(obj, j6));
        }

        @Override // com.google.android.gms.internal.measurement.G5.b
        public final void b(java.lang.Object obj, long j6, byte b6) {
            if (com.google.android.gms.internal.measurement.G5.f40520i) {
                com.google.android.gms.internal.measurement.G5.u(obj, j6, b6);
            } else {
                com.google.android.gms.internal.measurement.G5.y(obj, j6, b6);
            }
        }

        @Override // com.google.android.gms.internal.measurement.G5.b
        public final void c(java.lang.Object obj, long j6, double d6) {
            f(obj, j6, java.lang.Double.doubleToLongBits(d6));
        }

        @Override // com.google.android.gms.internal.measurement.G5.b
        public final void d(java.lang.Object obj, long j6, float f6) {
            e(obj, j6, java.lang.Float.floatToIntBits(f6));
        }

        @Override // com.google.android.gms.internal.measurement.G5.b
        public final void g(java.lang.Object obj, long j6, boolean z6) {
            if (com.google.android.gms.internal.measurement.G5.f40520i) {
                com.google.android.gms.internal.measurement.G5.k(obj, j6, z6);
            } else {
                com.google.android.gms.internal.measurement.G5.r(obj, j6, z6);
            }
        }

        @Override // com.google.android.gms.internal.measurement.G5.b
        public final float i(java.lang.Object obj, long j6) {
            return java.lang.Float.intBitsToFloat(l(obj, j6));
        }

        @Override // com.google.android.gms.internal.measurement.G5.b
        public final boolean k(java.lang.Object obj, long j6) {
            return com.google.android.gms.internal.measurement.G5.f40520i ? com.google.android.gms.internal.measurement.G5.D(obj, j6) : com.google.android.gms.internal.measurement.G5.E(obj, j6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002e  */
    static {
        com.google.android.gms.internal.measurement.G5.b aVar;
        sun.misc.Unsafe unsafeP = p();
        f40512a = unsafeP;
        f40513b = com.google.android.gms.internal.measurement.I3.a();
        boolean zA = A(java.lang.Long.TYPE);
        f40514c = zA;
        boolean zA2 = A(java.lang.Integer.TYPE);
        f40515d = zA2;
        if (unsafeP == null) {
            aVar = null;
        } else if (zA) {
            aVar = new com.google.android.gms.internal.measurement.G5.c(unsafeP);
        } else if (zA2) {
            aVar = new com.google.android.gms.internal.measurement.G5.a(unsafeP);
        } else {
            aVar = null;
        }
        f40516e = aVar;
        f40517f = aVar == null ? false : aVar.j();
        f40518g = aVar == null ? false : aVar.h();
        f40519h = o(byte[].class);
        o(boolean[].class);
        s(boolean[].class);
        o(int[].class);
        s(int[].class);
        o(long[].class);
        s(long[].class);
        o(float[].class);
        s(float[].class);
        o(double[].class);
        s(double[].class);
        o(java.lang.Object[].class);
        s(java.lang.Object[].class);
        java.lang.reflect.Field fieldC = C();
        if (fieldC != null && aVar != null) {
            aVar.f40521a.objectFieldOffset(fieldC);
        }
        f40520i = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean A(java.lang.Class cls) {
        try {
            java.lang.Class cls2 = f40513b;
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

    static java.lang.Object B(java.lang.Object obj, long j6) {
        return f40516e.f40521a.getObject(obj, j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Field C() {
        java.lang.reflect.Field fieldD = d(java.nio.Buffer.class, "effectiveDirectAddress");
        if (fieldD != null) {
            return fieldD;
        }
        java.lang.reflect.Field fieldD2 = d(java.nio.Buffer.class, "address");
        if (fieldD2 == null || fieldD2.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return fieldD2;
    }

    static /* synthetic */ boolean D(java.lang.Object obj, long j6) {
        return ((byte) (t(obj, (-4) & j6) >>> ((int) (((~j6) & 3) << 3)))) != 0;
    }

    static /* synthetic */ boolean E(java.lang.Object obj, long j6) {
        return ((byte) (t(obj, (-4) & j6) >>> ((int) ((j6 & 3) << 3)))) != 0;
    }

    static boolean F(java.lang.Object obj, long j6) {
        return f40516e.k(obj, j6);
    }

    static double a(java.lang.Object obj, long j6) {
        return f40516e.a(obj, j6);
    }

    static java.lang.Object b(java.lang.Class cls) {
        try {
            return f40512a.allocateInstance(cls);
        } catch (java.lang.InstantiationException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }

    private static java.lang.reflect.Field d(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static void f(java.lang.Object obj, long j6, double d6) {
        f40516e.c(obj, j6, d6);
    }

    static void g(java.lang.Object obj, long j6, float f6) {
        f40516e.d(obj, j6, f6);
    }

    static void h(java.lang.Object obj, long j6, int i6) {
        f40516e.e(obj, j6, i6);
    }

    static void i(java.lang.Object obj, long j6, long j10) {
        f40516e.f(obj, j6, j10);
    }

    static void j(java.lang.Object obj, long j6, java.lang.Object obj2) {
        f40516e.f40521a.putObject(obj, j6, obj2);
    }

    static /* synthetic */ void k(java.lang.Object obj, long j6, boolean z6) {
        u(obj, j6, z6 ? (byte) 1 : (byte) 0);
    }

    static /* synthetic */ void l(java.lang.Throwable th) {
        java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.G5.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + java.lang.String.valueOf(th));
    }

    static void m(byte[] bArr, long j6, byte b6) {
        f40516e.b(bArr, f40519h + j6, b6);
    }

    static float n(java.lang.Object obj, long j6) {
        return f40516e.i(obj, j6);
    }

    private static int o(java.lang.Class cls) {
        if (f40518g) {
            return f40516e.f40521a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static sun.misc.Unsafe p() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.measurement.I5());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void r(java.lang.Object obj, long j6, boolean z6) {
        y(obj, j6, z6 ? (byte) 1 : (byte) 0);
    }

    private static int s(java.lang.Class cls) {
        if (f40518g) {
            return f40516e.f40521a.arrayIndexScale(cls);
        }
        return -1;
    }

    static int t(java.lang.Object obj, long j6) {
        return f40516e.l(obj, j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(java.lang.Object obj, long j6, byte b6) {
        long j10 = (-4) & j6;
        int iT = t(obj, j10);
        int i6 = ((~((int) j6)) & 3) << 3;
        h(obj, j10, ((255 & b6) << i6) | (iT & (~(255 << i6))));
    }

    static void v(java.lang.Object obj, long j6, boolean z6) {
        f40516e.g(obj, j6, z6);
    }

    static boolean w() {
        return f40518g;
    }

    static long x(java.lang.Object obj, long j6) {
        return f40516e.m(obj, j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(java.lang.Object obj, long j6, byte b6) {
        long j10 = (-4) & j6;
        int i6 = (((int) j6) & 3) << 3;
        h(obj, j10, ((255 & b6) << i6) | (t(obj, j10) & (~(255 << i6))));
    }

    static boolean z() {
        return f40517f;
    }
}
