package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class S9 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final android.os.ConditionVariable f31584c = new android.os.ConditionVariable();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static volatile com.google.android.gms.internal.ads.C3075Zd0 f31585d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile java.util.Random f31586e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2262Da f31587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected volatile java.lang.Boolean f31588b;

    public S9(com.google.android.gms.internal.ads.C2262Da c2262Da) {
        this.f31587a = c2262Da;
        c2262Da.k().execute(new com.google.android.gms.internal.ads.R9(this));
    }

    public static final int d() {
        try {
            return j$.util.concurrent.ThreadLocalRandom.current().nextInt();
        } catch (java.lang.RuntimeException unused) {
            if (f31586e == null) {
                synchronized (com.google.android.gms.internal.ads.S9.class) {
                    try {
                        if (f31586e == null) {
                            f31586e = new java.util.Random();
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
            return f31586e.nextInt();
        }
    }

    public final void c(int i6, int i10, long j6, java.lang.String str, java.lang.Exception exc) {
        try {
            f31584c.block();
            if (!this.f31588b.booleanValue() || f31585d == null) {
                return;
            }
            com.google.android.gms.internal.ads.Z7 z7B0 = com.google.android.gms.internal.ads.C3450d8.b0();
            z7B0.z(this.f31587a.f26724a.getPackageName());
            z7B0.E(j6);
            if (str != null) {
                z7B0.A(str);
            }
            if (exc != null) {
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                exc.printStackTrace(new java.io.PrintWriter(stringWriter));
                z7B0.F(stringWriter.toString());
                z7B0.C(exc.getClass().getName());
            }
            com.google.android.gms.internal.ads.C3003Xd0 c3003Xd0A = f31585d.a(((com.google.android.gms.internal.ads.C3450d8) z7B0.u()).l());
            c3003Xd0A.a(i6);
            if (i10 != -1) {
                c3003Xd0A.b(i10);
            }
            c3003Xd0A.c();
        } catch (java.lang.Exception unused) {
        }
    }
}
