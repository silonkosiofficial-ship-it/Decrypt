package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5189t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4530n f38833a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2697Os f38838f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f38840h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.PK0 f38842j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4310l f38834b = new com.google.android.gms.internal.ads.C4310l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AU f38835c = new com.google.android.gms.internal.ads.AU(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AU f38836d = new com.google.android.gms.internal.ads.AU(10);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3807gN f38837e = new com.google.android.gms.internal.ads.C3807gN(16);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2697Os f38839g = com.google.android.gms.internal.ads.C2697Os.f30582d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f38841i = -9223372036854775807L;

    public C5189t(com.google.android.gms.internal.ads.PK0 pk0, com.google.android.gms.internal.ads.C4530n c4530n) {
        this.f38842j = pk0;
        this.f38833a = c4530n;
    }

    private static java.lang.Object e(com.google.android.gms.internal.ads.AU au) {
        com.google.android.gms.internal.ads.LC.d(au.a() > 0);
        while (au.a() > 1) {
            au.b();
        }
        java.lang.Object objB = au.b();
        objB.getClass();
        return objB;
    }

    public final void a() {
        this.f38837e.c();
        this.f38841i = -9223372036854775807L;
        com.google.android.gms.internal.ads.AU au = this.f38836d;
        if (au.a() > 0) {
            java.lang.Long l6 = (java.lang.Long) e(au);
            l6.longValue();
            this.f38836d.d(0L, l6);
        }
        if (this.f38838f != null) {
            this.f38835c.e();
            return;
        }
        com.google.android.gms.internal.ads.AU au2 = this.f38835c;
        if (au2.a() > 0) {
            this.f38838f = (com.google.android.gms.internal.ads.C2697Os) e(au2);
        }
    }

    public final void b(int i6, int i10) {
        this.f38838f = new com.google.android.gms.internal.ads.C2697Os(i6, i10, 1.0f);
    }

    public final void c(long j6, long j10) {
        while (true) {
            com.google.android.gms.internal.ads.C3807gN c3807gN = this.f38837e;
            if (c3807gN.d()) {
                return;
            }
            com.google.android.gms.internal.ads.AU au = this.f38836d;
            long jA = c3807gN.a();
            java.lang.Long l6 = (java.lang.Long) au.c(jA);
            if (l6 != null && l6.longValue() != this.f38840h) {
                this.f38840h = l6.longValue();
                this.f38833a.f();
            }
            int iA = this.f38833a.a(jA, j6, j10, this.f38840h, false, this.f38834b);
            if (iA != 0 && iA != 1) {
                if (iA == 2 || iA == 3 || iA == 4) {
                    this.f38841i = jA;
                    this.f38837e.b();
                    com.google.android.gms.internal.ads.PK0 pk0 = this.f38842j;
                    java.util.Iterator it = pk0.f30694b.f36525i.iterator();
                    while (it.hasNext()) {
                        ((com.google.android.gms.internal.ads.InterfaceC3542e) it.next()).d(pk0.f30694b);
                    }
                    com.google.android.gms.internal.ads.LC.b(null);
                    throw null;
                }
                return;
            }
            this.f38841i = jA;
            long jLongValue = java.lang.Long.valueOf(this.f38837e.b()).longValue();
            com.google.android.gms.internal.ads.C2697Os c2697Os = (com.google.android.gms.internal.ads.C2697Os) this.f38835c.c(jLongValue);
            if (c2697Os != null && !c2697Os.equals(com.google.android.gms.internal.ads.C2697Os.f30582d) && !c2697Os.equals(this.f38839g)) {
                this.f38839g = c2697Os;
                this.f38842j.a(c2697Os);
            }
            this.f38842j.b(iA == 0 ? -1L : this.f38834b.d(), jLongValue, this.f38833a.p());
        }
    }

    public final boolean d(long j6) {
        long j10 = this.f38841i;
        return j10 != -9223372036854775807L && j10 >= j6;
    }
}
