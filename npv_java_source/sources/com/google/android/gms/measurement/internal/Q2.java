package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class Q2 extends java.util.concurrent.FutureTask implements java.lang.Comparable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final long f42098C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final boolean f42099D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f42100E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.P2 f42101F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q2(com.google.android.gms.measurement.internal.P2 p6, java.lang.Runnable runnable, boolean z6, java.lang.String str) {
        super(com.google.android.gms.internal.measurement.M0.a().r(runnable), null);
        this.f42101F = p6;
        Q3.AbstractC1477p.l(str);
        long andIncrement = com.google.android.gms.measurement.internal.P2.f42080l.getAndIncrement();
        this.f42098C = andIncrement;
        this.f42100E = str;
        this.f42099D = z6;
        if (andIncrement == Long.MAX_VALUE) {
            p6.j().G().a("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q2(com.google.android.gms.measurement.internal.P2 p6, java.util.concurrent.Callable callable, boolean z6, java.lang.String str) {
        super(com.google.android.gms.internal.measurement.M0.a().a(callable));
        this.f42101F = p6;
        Q3.AbstractC1477p.l(str);
        long andIncrement = com.google.android.gms.measurement.internal.P2.f42080l.getAndIncrement();
        this.f42098C = andIncrement;
        this.f42100E = str;
        this.f42099D = z6;
        if (andIncrement == Long.MAX_VALUE) {
            p6.j().G().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        com.google.android.gms.measurement.internal.Q2 q6 = (com.google.android.gms.measurement.internal.Q2) obj;
        boolean z6 = this.f42099D;
        if (z6 != q6.f42099D) {
            return z6 ? -1 : 1;
        }
        long j6 = this.f42098C;
        long j10 = q6.f42098C;
        if (j6 < j10) {
            return -1;
        }
        if (j6 > j10) {
            return 1;
        }
        this.f42101F.j().I().b("Two tasks share the same index. index", java.lang.Long.valueOf(this.f42098C));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(java.lang.Throwable th) {
        this.f42101F.j().G().b(this.f42100E, th);
        super.setException(th);
    }
}
