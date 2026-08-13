package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
abstract class G3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sun.misc.Unsafe f41402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.Class f41403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f41404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.play_billing.F3 f41405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f41406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f41407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f41408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final boolean f41409h;

    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    static {
        boolean z6;
        boolean z10;
        com.google.android.gms.internal.play_billing.F3 f6;
        sun.misc.Unsafe unsafeL = l();
        f41402a = unsafeL;
        int i6 = com.google.android.gms.internal.play_billing.AbstractC6190b2.f41519a;
        f41403b = libcore.io.Memory.class;
        java.lang.Class<?> cls = java.lang.Long.TYPE;
        boolean zA = A(cls);
        f41404c = zA;
        boolean zA2 = A(java.lang.Integer.TYPE);
        com.google.android.gms.internal.play_billing.F3 d6 = null;
        if (unsafeL != null) {
            if (zA) {
                d6 = new com.google.android.gms.internal.play_billing.E3(unsafeL);
            } else if (zA2) {
                d6 = new com.google.android.gms.internal.play_billing.D3(unsafeL);
            }
        }
        f41405d = d6;
        if (d6 == null) {
            z6 = false;
        } else {
            try {
                java.lang.Class<?> cls2 = d6.f41396a.getClass();
                cls2.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls2.getMethod("getLong", java.lang.Object.class, cls);
                if (b() == null) {
                    z6 = false;
                } else {
                    z6 = true;
                }
            } catch (java.lang.Throwable th) {
                m(th);
            }
        }
        f41406e = z6;
        com.google.android.gms.internal.play_billing.F3 f10 = f41405d;
        if (f10 == null) {
            z10 = false;
        } else {
            try {
                java.lang.Class<?> cls3 = f10.f41396a.getClass();
                cls3.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls3.getMethod("arrayBaseOffset", java.lang.Class.class);
                cls3.getMethod("arrayIndexScale", java.lang.Class.class);
                java.lang.Class<?> cls4 = java.lang.Long.TYPE;
                cls3.getMethod("getInt", java.lang.Object.class, cls4);
                cls3.getMethod("putInt", java.lang.Object.class, cls4, java.lang.Integer.TYPE);
                cls3.getMethod("getLong", java.lang.Object.class, cls4);
                cls3.getMethod("putLong", java.lang.Object.class, cls4, cls4);
                cls3.getMethod("getObject", java.lang.Object.class, cls4);
                cls3.getMethod("putObject", java.lang.Object.class, cls4, java.lang.Object.class);
                z10 = true;
            } catch (java.lang.Throwable th2) {
                m(th2);
                z10 = false;
            }
        }
        f41407f = z10;
        f41408g = E(byte[].class);
        E(boolean[].class);
        a(boolean[].class);
        E(int[].class);
        a(int[].class);
        E(long[].class);
        a(long[].class);
        E(float[].class);
        a(float[].class);
        E(double[].class);
        a(double[].class);
        E(java.lang.Object[].class);
        a(java.lang.Object[].class);
        java.lang.reflect.Field fieldB = b();
        if (fieldB != null && (f6 = f41405d) != null) {
            f6.f41396a.objectFieldOffset(fieldB);
        }
        f41409h = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean A(java.lang.Class cls) {
        int i6 = com.google.android.gms.internal.play_billing.AbstractC6190b2.f41519a;
        try {
            java.lang.Class cls2 = f41403b;
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

    static boolean B(java.lang.Object obj, long j6) {
        return f41405d.g(obj, j6);
    }

    static boolean C() {
        return f41407f;
    }

    static boolean D() {
        return f41406e;
    }

    private static int E(java.lang.Class cls) {
        if (f41407f) {
            return f41405d.f41396a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(java.lang.Class cls) {
        if (f41407f) {
            return f41405d.f41396a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static java.lang.reflect.Field b() {
        int i6 = com.google.android.gms.internal.play_billing.AbstractC6190b2.f41519a;
        java.lang.reflect.Field fieldC = c(java.nio.Buffer.class, "effectiveDirectAddress");
        if (fieldC != null) {
            return fieldC;
        }
        java.lang.reflect.Field fieldC2 = c(java.nio.Buffer.class, "address");
        if (fieldC2 == null || fieldC2.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return fieldC2;
    }

    private static java.lang.reflect.Field c(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(java.lang.Object obj, long j6, byte b6) {
        com.google.android.gms.internal.play_billing.F3 f6 = f41405d;
        long j10 = (-4) & j6;
        int i6 = f6.f41396a.getInt(obj, j10);
        int i10 = ((~((int) j6)) & 3) << 3;
        f6.f41396a.putInt(obj, j10, ((255 & b6) << i10) | (i6 & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(java.lang.Object obj, long j6, byte b6) {
        com.google.android.gms.internal.play_billing.F3 f6 = f41405d;
        long j10 = (-4) & j6;
        int i6 = (((int) j6) & 3) << 3;
        f6.f41396a.putInt(obj, j10, ((255 & b6) << i6) | (f6.f41396a.getInt(obj, j10) & (~(255 << i6))));
    }

    static double f(java.lang.Object obj, long j6) {
        return f41405d.a(obj, j6);
    }

    static float g(java.lang.Object obj, long j6) {
        return f41405d.b(obj, j6);
    }

    static int h(java.lang.Object obj, long j6) {
        return f41405d.f41396a.getInt(obj, j6);
    }

    static long i(java.lang.Object obj, long j6) {
        return f41405d.f41396a.getLong(obj, j6);
    }

    static java.lang.Object j(java.lang.Class cls) {
        try {
            return f41402a.allocateInstance(cls);
        } catch (java.lang.InstantiationException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }

    static java.lang.Object k(java.lang.Object obj, long j6) {
        return f41405d.f41396a.getObject(obj, j6);
    }

    static sun.misc.Unsafe l() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.play_billing.C3());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(java.lang.Throwable th) {
        java.util.logging.Logger.getLogger(com.google.android.gms.internal.play_billing.G3.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void r(java.lang.Object obj, long j6, boolean z6) {
        f41405d.c(obj, j6, z6);
    }

    static void s(byte[] bArr, long j6, byte b6) {
        f41405d.d(bArr, f41408g + j6, b6);
    }

    static void t(java.lang.Object obj, long j6, double d6) {
        f41405d.e(obj, j6, d6);
    }

    static void u(java.lang.Object obj, long j6, float f6) {
        f41405d.f(obj, j6, f6);
    }

    static void v(java.lang.Object obj, long j6, int i6) {
        f41405d.f41396a.putInt(obj, j6, i6);
    }

    static void w(java.lang.Object obj, long j6, long j10) {
        f41405d.f41396a.putLong(obj, j6, j10);
    }

    static void x(java.lang.Object obj, long j6, java.lang.Object obj2) {
        f41405d.f41396a.putObject(obj, j6, obj2);
    }

    static /* bridge */ /* synthetic */ boolean y(java.lang.Object obj, long j6) {
        return ((byte) ((f41405d.f41396a.getInt(obj, (-4) & j6) >>> ((int) (((~j6) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean z(java.lang.Object obj, long j6) {
        return ((byte) ((f41405d.f41396a.getInt(obj, (-4) & j6) >>> ((int) ((j6 & 3) << 3))) & 255)) != 0;
    }
}
