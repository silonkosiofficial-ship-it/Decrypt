package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class Y0 extends com.google.android.gms.internal.play_billing.P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final sun.misc.Unsafe f41499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long f41500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long f41501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final long f41502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final long f41503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final long f41504f;

    class a implements java.security.PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ java.lang.Object run() throws java.lang.IllegalAccessException {
            for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                java.lang.Object obj = field.get(null);
                if (sun.misc.Unsafe.class.isInstance(obj)) {
                    return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
                }
            }
            throw new java.lang.NoSuchFieldError("the Unsafe");
        }
    }

    static {
        sun.misc.Unsafe unsafe;
        try {
            try {
                unsafe = sun.misc.Unsafe.getUnsafe();
            } catch (java.security.PrivilegedActionException e6) {
                throw new java.lang.RuntimeException("Could not initialize intrinsics", e6.getCause());
            }
        } catch (java.lang.SecurityException unused) {
            unsafe = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.play_billing.Y0.a());
        }
        try {
            f41501c = unsafe.objectFieldOffset(com.google.android.gms.internal.play_billing.AbstractC6183a1.class.getDeclaredField("E"));
            f41500b = unsafe.objectFieldOffset(com.google.android.gms.internal.play_billing.AbstractC6183a1.class.getDeclaredField("D"));
            f41502d = unsafe.objectFieldOffset(com.google.android.gms.internal.play_billing.AbstractC6183a1.class.getDeclaredField("C"));
            f41503e = unsafe.objectFieldOffset(com.google.android.gms.internal.play_billing.Z0.class.getDeclaredField("a"));
            f41504f = unsafe.objectFieldOffset(com.google.android.gms.internal.play_billing.Z0.class.getDeclaredField("b"));
            f41499a = unsafe;
        } catch (java.lang.NoSuchFieldException e10) {
            throw new java.lang.RuntimeException(e10);
        }
    }

    /* synthetic */ Y0(com.google.android.gms.internal.play_billing.AbstractC6207e1 abstractC6207e1) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.P0
    final com.google.android.gms.internal.play_billing.S0 a(com.google.android.gms.internal.play_billing.AbstractC6183a1 abstractC6183a1, com.google.android.gms.internal.play_billing.S0 s6) {
        com.google.android.gms.internal.play_billing.S0 s10;
        do {
            s10 = abstractC6183a1.f41514D;
            if (s6 == s10) {
                break;
            }
        } while (!e(abstractC6183a1, s10, s6));
        return s10;
    }

    @Override // com.google.android.gms.internal.play_billing.P0
    final com.google.android.gms.internal.play_billing.Z0 b(com.google.android.gms.internal.play_billing.AbstractC6183a1 abstractC6183a1, com.google.android.gms.internal.play_billing.Z0 z6) {
        com.google.android.gms.internal.play_billing.Z0 z10;
        do {
            z10 = abstractC6183a1.f41515E;
            if (z6 == z10) {
                break;
            }
        } while (!g(abstractC6183a1, z10, z6));
        return z10;
    }

    @Override // com.google.android.gms.internal.play_billing.P0
    final void c(com.google.android.gms.internal.play_billing.Z0 z6, com.google.android.gms.internal.play_billing.Z0 z10) {
        f41499a.putObject(z6, f41504f, z10);
    }

    @Override // com.google.android.gms.internal.play_billing.P0
    final void d(com.google.android.gms.internal.play_billing.Z0 z6, java.lang.Thread thread) {
        f41499a.putObject(z6, f41503e, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.P0
    final boolean e(com.google.android.gms.internal.play_billing.AbstractC6183a1 abstractC6183a1, com.google.android.gms.internal.play_billing.S0 s6, com.google.android.gms.internal.play_billing.S0 s10) {
        return com.google.android.gms.internal.play_billing.AbstractC6201d1.a(f41499a, abstractC6183a1, f41500b, s6, s10);
    }

    @Override // com.google.android.gms.internal.play_billing.P0
    final boolean f(com.google.android.gms.internal.play_billing.AbstractC6183a1 abstractC6183a1, java.lang.Object obj, java.lang.Object obj2) {
        return com.google.android.gms.internal.play_billing.AbstractC6201d1.a(f41499a, abstractC6183a1, f41502d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.P0
    final boolean g(com.google.android.gms.internal.play_billing.AbstractC6183a1 abstractC6183a1, com.google.android.gms.internal.play_billing.Z0 z6, com.google.android.gms.internal.play_billing.Z0 z10) {
        return com.google.android.gms.internal.play_billing.AbstractC6201d1.a(f41499a, abstractC6183a1, f41501c, z6, z10);
    }
}
