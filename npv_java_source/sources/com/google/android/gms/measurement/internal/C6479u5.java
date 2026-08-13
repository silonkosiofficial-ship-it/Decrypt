package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.u5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6479u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f42656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f42657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.AbstractC6466t f42658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.measurement.internal.C6445p5 f42659d;

    public C6479u5(com.google.android.gms.measurement.internal.C6445p5 c6445p5) {
        this.f42659d = c6445p5;
        this.f42658c = new com.google.android.gms.measurement.internal.C6500x5(this, c6445p5.f42679a);
        long jC = c6445p5.b().c();
        this.f42656a = jC;
        this.f42657b = jC;
    }

    static /* synthetic */ void c(com.google.android.gms.measurement.internal.C6479u5 c6479u5) {
        c6479u5.f42659d.n();
        c6479u5.d(false, false, c6479u5.f42659d.b().c());
        c6479u5.f42659d.o().v(c6479u5.f42659d.b().c());
    }

    final long a(long j6) {
        long j10 = j6 - this.f42657b;
        this.f42657b = j6;
        return j10;
    }

    final void b() {
        this.f42658c.a();
        this.f42656a = this.f42659d.d().t(com.google.android.gms.measurement.internal.G.f41870c1) ? this.f42659d.b().c() : 0L;
        this.f42657b = this.f42656a;
    }

    public final boolean d(boolean z6, boolean z10, long j6) {
        this.f42659d.n();
        this.f42659d.v();
        if (this.f42659d.f42679a.p()) {
            this.f42659d.h().f42739r.b(this.f42659d.b().a());
        }
        long jA = j6 - this.f42656a;
        if (!z6 && jA < 1000) {
            this.f42659d.j().K().b("Screen exposed for less than 1000 ms. Event not sent. time", java.lang.Long.valueOf(jA));
            return false;
        }
        if (!z10) {
            jA = a(j6);
        }
        this.f42659d.j().K().b("Recording user engagement, ms", java.lang.Long.valueOf(jA));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("_et", jA);
        com.google.android.gms.measurement.internal.d6.X(this.f42659d.s().C(!this.f42659d.d().V()), bundle, true);
        if (!z10) {
            this.f42659d.r().b1("auto", "_e", bundle);
        }
        this.f42656a = j6;
        this.f42658c.a();
        this.f42658c.b(((java.lang.Long) com.google.android.gms.measurement.internal.G.f41872d0.a(null)).longValue());
        return true;
    }

    final void e(long j6) {
        this.f42658c.a();
    }

    final void f(long j6) {
        this.f42659d.n();
        this.f42658c.a();
        this.f42656a = j6;
        this.f42657b = j6;
    }
}
