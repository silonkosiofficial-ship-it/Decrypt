package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class Sw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sun.misc.Unsafe f31808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.Class f31809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f31810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Rw0 f31811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f31812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f31813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f31814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f31815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final boolean f31816i;

    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    static {
        boolean z6;
        boolean z10;
        com.google.android.gms.internal.ads.Rw0 rw0;
        sun.misc.Unsafe unsafeQ = q();
        f31808a = unsafeQ;
        int i6 = com.google.android.gms.internal.ads.Ru0.f31388a;
        f31809b = libcore.io.Memory.class;
        java.lang.Class<?> cls = java.lang.Long.TYPE;
        boolean zG = G(cls);
        f31810c = zG;
        boolean zG2 = G(java.lang.Integer.TYPE);
        com.google.android.gms.internal.ads.Rw0 pw0 = null;
        if (unsafeQ != null) {
            if (zG) {
                pw0 = new com.google.android.gms.internal.ads.Qw0(unsafeQ);
            } else if (zG2) {
                pw0 = new com.google.android.gms.internal.ads.Pw0(unsafeQ);
            }
        }
        f31811d = pw0;
        if (pw0 == null) {
            z6 = false;
        } else {
            try {
                java.lang.Class<?> cls2 = pw0.f31500a.getClass();
                cls2.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls2.getMethod("getLong", java.lang.Object.class, cls);
                if (e() == null) {
                    z6 = false;
                } else {
                    z6 = true;
                }
            } catch (java.lang.Throwable th) {
                r(th);
            }
        }
        f31812e = z6;
        com.google.android.gms.internal.ads.Rw0 rw1 = f31811d;
        if (rw1 == null) {
            z10 = false;
        } else {
            try {
                java.lang.Class<?> cls3 = rw1.f31500a.getClass();
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
                r(th2);
                z10 = false;
            }
        }
        f31813f = z10;
        f31814g = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(java.lang.Object[].class);
        d(java.lang.Object[].class);
        java.lang.reflect.Field fieldE = e();
        long jObjectFieldOffset = -1;
        if (fieldE != null && (rw0 = f31811d) != null) {
            jObjectFieldOffset = rw0.f31500a.objectFieldOffset(fieldE);
        }
        f31815h = jObjectFieldOffset;
        f31816i = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    static void A(java.lang.Object obj, long j6, float f6) {
        f31811d.h(obj, j6, f6);
    }

    static void B(java.lang.Object obj, long j6, int i6) {
        f31811d.f31500a.putInt(obj, j6, i6);
    }

    static void C(java.lang.Object obj, long j6, long j10) {
        f31811d.f31500a.putLong(obj, j6, j10);
    }

    static void D(java.lang.Object obj, long j6, java.lang.Object obj2) {
        f31811d.f31500a.putObject(obj, j6, obj2);
    }

    static /* bridge */ /* synthetic */ boolean E(java.lang.Object obj, long j6) {
        return ((byte) ((f31811d.f31500a.getInt(obj, (-4) & j6) >>> ((int) (((~j6) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean F(java.lang.Object obj, long j6) {
        return ((byte) ((f31811d.f31500a.getInt(obj, (-4) & j6) >>> ((int) ((j6 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean G(java.lang.Class cls) {
        int i6 = com.google.android.gms.internal.ads.Ru0.f31388a;
        try {
            java.lang.Class cls2 = f31809b;
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

    static boolean H(java.lang.Object obj, long j6) {
        return f31811d.i(obj, j6);
    }

    static boolean a() {
        return f31813f;
    }

    static boolean b() {
        return f31812e;
    }

    private static int c(java.lang.Class cls) {
        if (f31813f) {
            return f31811d.f31500a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int d(java.lang.Class cls) {
        if (f31813f) {
            return f31811d.f31500a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static java.lang.reflect.Field e() {
        int i6 = com.google.android.gms.internal.ads.Ru0.f31388a;
        java.lang.reflect.Field fieldF = f(java.nio.Buffer.class, "effectiveDirectAddress");
        if (fieldF != null) {
            return fieldF;
        }
        java.lang.reflect.Field fieldF2 = f(java.nio.Buffer.class, "address");
        if (fieldF2 == null || fieldF2.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return fieldF2;
    }

    private static java.lang.reflect.Field f(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(java.lang.Object obj, long j6, byte b6) {
        com.google.android.gms.internal.ads.Rw0 rw0 = f31811d;
        long j10 = (-4) & j6;
        int i6 = rw0.f31500a.getInt(obj, j10);
        int i10 = ((~((int) j6)) & 3) << 3;
        rw0.f31500a.putInt(obj, j10, ((255 & b6) << i10) | (i6 & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(java.lang.Object obj, long j6, byte b6) {
        com.google.android.gms.internal.ads.Rw0 rw0 = f31811d;
        long j10 = (-4) & j6;
        int i6 = (((int) j6) & 3) << 3;
        rw0.f31500a.putInt(obj, j10, ((255 & b6) << i6) | (rw0.f31500a.getInt(obj, j10) & (~(255 << i6))));
    }

    static byte i(long j6) {
        return f31811d.a(j6);
    }

    static double j(java.lang.Object obj, long j6) {
        return f31811d.b(obj, j6);
    }

    static float k(java.lang.Object obj, long j6) {
        return f31811d.c(obj, j6);
    }

    static int l(java.lang.Object obj, long j6) {
        return f31811d.f31500a.getInt(obj, j6);
    }

    static long m(java.nio.ByteBuffer byteBuffer) {
        com.google.android.gms.internal.ads.Rw0 rw0 = f31811d;
        return rw0.f31500a.getLong(byteBuffer, f31815h);
    }

    static long n(java.lang.Object obj, long j6) {
        return f31811d.f31500a.getLong(obj, j6);
    }

    static java.lang.Object o(java.lang.Class cls) {
        try {
            return f31808a.allocateInstance(cls);
        } catch (java.lang.InstantiationException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }

    static java.lang.Object p(java.lang.Object obj, long j6) {
        return f31811d.f31500a.getObject(obj, j6);
    }

    static sun.misc.Unsafe q() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.ads.Ow0());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void r(java.lang.Throwable th) {
        java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.Sw0.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void w(long j6, byte[] bArr, long j10, long j11) {
        f31811d.d(j6, bArr, j10, j11);
    }

    static void x(java.lang.Object obj, long j6, boolean z6) {
        f31811d.e(obj, j6, z6);
    }

    static void y(byte[] bArr, long j6, byte b6) {
        f31811d.f(bArr, f31814g + j6, b6);
    }

    static void z(java.lang.Object obj, long j6, double d6) {
        f31811d.g(obj, j6, d6);
    }
}
