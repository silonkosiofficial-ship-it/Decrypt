package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6466t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile android.os.Handler f42628d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.InterfaceC6505y3 f42629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Runnable f42630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f42631c;

    AbstractC6466t(com.google.android.gms.measurement.internal.InterfaceC6505y3 interfaceC6505y3) {
        Q3.AbstractC1477p.l(interfaceC6505y3);
        this.f42629a = interfaceC6505y3;
        this.f42630b = new com.google.android.gms.measurement.internal.RunnableC6487w(this, interfaceC6505y3);
    }

    private final android.os.Handler f() {
        android.os.Handler handler;
        if (f42628d != null) {
            return f42628d;
        }
        synchronized (com.google.android.gms.measurement.internal.AbstractC6466t.class) {
            try {
                if (f42628d == null) {
                    f42628d = new com.google.android.gms.internal.measurement.N0(this.f42629a.a().getMainLooper());
                }
                handler = f42628d;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    final void a() {
        this.f42631c = 0L;
        f().removeCallbacks(this.f42630b);
    }

    public final void b(long j6) {
        a();
        if (j6 >= 0) {
            this.f42631c = this.f42629a.b().a();
            if (f().postDelayed(this.f42630b, j6)) {
                return;
            }
            this.f42629a.j().G().b("Failed to schedule delayed post. time", java.lang.Long.valueOf(j6));
        }
    }

    public abstract void d();

    public final boolean e() {
        return this.f42631c != 0;
    }
}
