package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2931Vd0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.HashMap f32536g = new java.util.HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f32537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2967Wd0 f32538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2929Vc0 f32539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2747Qc0 f32540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2491Jd0 f32541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.Object f32542f = new java.lang.Object();

    public C2931Vd0(android.content.Context context, com.google.android.gms.internal.ads.InterfaceC2967Wd0 interfaceC2967Wd0, com.google.android.gms.internal.ads.C2929Vc0 c2929Vc0, com.google.android.gms.internal.ads.C2747Qc0 c2747Qc0) {
        this.f32537a = context;
        this.f32538b = interfaceC2967Wd0;
        this.f32539c = c2929Vc0;
        this.f32540d = c2747Qc0;
    }

    private final synchronized java.lang.Class d(com.google.android.gms.internal.ads.C2528Kd0 c2528Kd0) {
        try {
            java.lang.String strK0 = c2528Kd0.a().k0();
            java.util.HashMap map = f32536g;
            java.lang.Class cls = (java.lang.Class) map.get(strK0);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.f32540d.a(c2528Kd0.c())) {
                    throw new com.google.android.gms.internal.ads.C2895Ud0(2026, "VM did not pass signature verification");
                }
                try {
                    java.io.File fileB = c2528Kd0.b();
                    if (!fileB.exists()) {
                        fileB.mkdirs();
                    }
                    java.lang.Class<?> clsLoadClass = new dalvik.system.DexClassLoader(c2528Kd0.c().getAbsolutePath(), fileB.getAbsolutePath(), null, this.f32537a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strK0, clsLoadClass);
                    return clsLoadClass;
                } catch (java.lang.ClassNotFoundException e6) {
                    e = e6;
                    throw new com.google.android.gms.internal.ads.C2895Ud0(2008, e);
                } catch (java.lang.IllegalArgumentException e10) {
                    e = e10;
                    throw new com.google.android.gms.internal.ads.C2895Ud0(2008, e);
                } catch (java.lang.SecurityException e11) {
                    e = e11;
                    throw new com.google.android.gms.internal.ads.C2895Ud0(2008, e);
                }
            } catch (java.security.GeneralSecurityException e12) {
                throw new com.google.android.gms.internal.ads.C2895Ud0(2026, e12);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final com.google.android.gms.internal.ads.InterfaceC3037Yc0 a() {
        com.google.android.gms.internal.ads.C2491Jd0 c2491Jd0;
        synchronized (this.f32542f) {
            c2491Jd0 = this.f32541e;
        }
        return c2491Jd0;
    }

    public final com.google.android.gms.internal.ads.C2528Kd0 b() {
        synchronized (this.f32542f) {
            try {
                com.google.android.gms.internal.ads.C2491Jd0 c2491Jd0 = this.f32541e;
                if (c2491Jd0 == null) {
                    return null;
                }
                return c2491Jd0.f();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(com.google.android.gms.internal.ads.C2528Kd0 c2528Kd0) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            try {
                com.google.android.gms.internal.ads.C2491Jd0 c2491Jd0 = new com.google.android.gms.internal.ads.C2491Jd0(d(c2528Kd0).getDeclaredConstructor(android.content.Context.class, java.lang.String.class, byte[].class, java.lang.Object.class, android.os.Bundle.class, java.lang.Integer.TYPE).newInstance(this.f32537a, "msa-r", c2528Kd0.e(), null, new android.os.Bundle(), 2), c2528Kd0, this.f32538b, this.f32539c);
                if (!c2491Jd0.h()) {
                    throw new com.google.android.gms.internal.ads.C2895Ud0(4000, "init failed");
                }
                int iE = c2491Jd0.e();
                if (iE != 0) {
                    throw new com.google.android.gms.internal.ads.C2895Ud0(4001, "ci: " + iE);
                }
                synchronized (this.f32542f) {
                    com.google.android.gms.internal.ads.C2491Jd0 c2491Jd1 = this.f32541e;
                    if (c2491Jd1 != null) {
                        try {
                            c2491Jd1.g();
                        } catch (com.google.android.gms.internal.ads.C2895Ud0 e6) {
                            this.f32539c.c(e6.a(), -1L, e6);
                        }
                        this.f32541e = c2491Jd0;
                    } else {
                        this.f32541e = c2491Jd0;
                    }
                    throw th;
                }
                this.f32539c.d(3000, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (java.lang.Exception e10) {
                throw new com.google.android.gms.internal.ads.C2895Ud0(2004, e10);
            }
        } catch (com.google.android.gms.internal.ads.C2895Ud0 e11) {
            this.f32539c.c(e11.a(), java.lang.System.currentTimeMillis() - jCurrentTimeMillis, e11);
            return false;
        } catch (java.lang.Exception e12) {
            this.f32539c.c(4010, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, e12);
            return false;
        }
    }
}
