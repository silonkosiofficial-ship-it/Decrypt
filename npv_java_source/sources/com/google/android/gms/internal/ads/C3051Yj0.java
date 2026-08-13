package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3051Yj0 extends com.google.android.gms.internal.ads.AbstractC2724Pj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final sun.misc.Unsafe f33396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long f33397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long f33398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final long f33399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final long f33400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final long f33401f;

    /* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yj0$a */
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
            unsafe = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.ads.C3051Yj0.a());
        }
        try {
            f33398c = unsafe.objectFieldOffset(com.google.android.gms.internal.ads.AbstractC3183ak0.class.getDeclaredField("E"));
            f33397b = unsafe.objectFieldOffset(com.google.android.gms.internal.ads.AbstractC3183ak0.class.getDeclaredField("D"));
            f33399d = unsafe.objectFieldOffset(com.google.android.gms.internal.ads.AbstractC3183ak0.class.getDeclaredField("C"));
            f33400e = unsafe.objectFieldOffset(com.google.android.gms.internal.ads.C3087Zj0.class.getDeclaredField("a"));
            f33401f = unsafe.objectFieldOffset(com.google.android.gms.internal.ads.C3087Zj0.class.getDeclaredField("b"));
            f33396a = unsafe;
        } catch (java.lang.NoSuchFieldException e10) {
            throw new java.lang.RuntimeException(e10);
        }
    }

    /* synthetic */ C3051Yj0(com.google.android.gms.internal.ads.AbstractC3731fk0 abstractC3731fk0) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2724Pj0
    final com.google.android.gms.internal.ads.C2835Sj0 a(com.google.android.gms.internal.ads.AbstractC3183ak0 abstractC3183ak0, com.google.android.gms.internal.ads.C2835Sj0 c2835Sj0) {
        com.google.android.gms.internal.ads.C2835Sj0 c2835Sj1;
        do {
            c2835Sj1 = abstractC3183ak0.f34137D;
            if (c2835Sj0 == c2835Sj1) {
                break;
            }
        } while (!e(abstractC3183ak0, c2835Sj1, c2835Sj0));
        return c2835Sj1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2724Pj0
    final com.google.android.gms.internal.ads.C3087Zj0 b(com.google.android.gms.internal.ads.AbstractC3183ak0 abstractC3183ak0, com.google.android.gms.internal.ads.C3087Zj0 c3087Zj0) {
        com.google.android.gms.internal.ads.C3087Zj0 c3087Zj1;
        do {
            c3087Zj1 = abstractC3183ak0.f34138E;
            if (c3087Zj0 == c3087Zj1) {
                break;
            }
        } while (!g(abstractC3183ak0, c3087Zj1, c3087Zj0));
        return c3087Zj1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2724Pj0
    final void c(com.google.android.gms.internal.ads.C3087Zj0 c3087Zj0, com.google.android.gms.internal.ads.C3087Zj0 c3087Zj1) {
        f33396a.putObject(c3087Zj0, f33401f, c3087Zj1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2724Pj0
    final void d(com.google.android.gms.internal.ads.C3087Zj0 c3087Zj0, java.lang.Thread thread) {
        f33396a.putObject(c3087Zj0, f33400e, thread);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2724Pj0
    final boolean e(com.google.android.gms.internal.ads.AbstractC3183ak0 abstractC3183ak0, com.google.android.gms.internal.ads.C2835Sj0 c2835Sj0, com.google.android.gms.internal.ads.C2835Sj0 c2835Sj1) {
        return com.google.android.gms.internal.ads.AbstractC3512dk0.a(f33396a, abstractC3183ak0, f33397b, c2835Sj0, c2835Sj1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2724Pj0
    final boolean f(com.google.android.gms.internal.ads.AbstractC3183ak0 abstractC3183ak0, java.lang.Object obj, java.lang.Object obj2) {
        return com.google.android.gms.internal.ads.AbstractC3512dk0.a(f33396a, abstractC3183ak0, f33399d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2724Pj0
    final boolean g(com.google.android.gms.internal.ads.AbstractC3183ak0 abstractC3183ak0, com.google.android.gms.internal.ads.C3087Zj0 c3087Zj0, com.google.android.gms.internal.ads.C3087Zj0 c3087Zj1) {
        return com.google.android.gms.internal.ads.AbstractC3512dk0.a(f33396a, abstractC3183ak0, f33398c, c3087Zj0, c3087Zj1);
    }
}
