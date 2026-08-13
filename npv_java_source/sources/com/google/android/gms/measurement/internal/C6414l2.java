package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6414l2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static com.google.android.gms.measurement.internal.C6414l2 f42500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j$.time.Duration f42501e = j$.time.Duration.ofMinutes(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.S2 f42502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q3.InterfaceC1482v f42503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicLong f42504c = new java.util.concurrent.atomic.AtomicLong(-1);

    private C6414l2(android.content.Context context, com.google.android.gms.measurement.internal.S2 s6) {
        this.f42503b = Q3.AbstractC1481u.b(context, Q3.C1483w.a().b("measurement:api").a());
        this.f42502a = s6;
    }

    static com.google.android.gms.measurement.internal.C6414l2 a(com.google.android.gms.measurement.internal.S2 s6) {
        if (f42500d == null) {
            f42500d = new com.google.android.gms.measurement.internal.C6414l2(s6.a(), s6);
        }
        return f42500d;
    }

    public final synchronized void b(int i6, int i10, long j6, long j10, int i11) {
        final long jC = this.f42502a.b().c();
        if (this.f42504c.get() != -1 && jC - this.f42504c.get() <= f42501e.toMillis()) {
            return;
        }
        this.f42503b.b(new Q3.C1480t(0, java.util.Arrays.asList(new Q3.C1474m(36301, i10, 0, j6, j10, null, null, 0, i11)))).e(new p115l4.InterfaceC6926g() { // from class: com.google.android.gms.measurement.internal.k2
            @Override // p115l4.InterfaceC6926g
            public final void d(java.lang.Exception exc) {
                this.f42484a.c(jC, exc);
            }
        });
    }

    final /* synthetic */ void c(long j6, java.lang.Exception exc) {
        this.f42504c.set(j6);
    }
}
