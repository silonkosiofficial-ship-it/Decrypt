package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class JI0 extends com.google.android.gms.internal.ads.AbstractC4942qm {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.lang.Object f28659g = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f28660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f28661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f28662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Q7 f28663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.N4 f28664f;

    static {
        com.google.android.gms.internal.ads.I1 i6 = new com.google.android.gms.internal.ads.I1();
        i6.a("SinglePeriodTimeline");
        i6.b(android.net.Uri.EMPTY);
        i6.c();
    }

    public JI0(long j6, long j10, long j11, long j12, long j13, long j14, long j15, boolean z6, boolean z10, boolean z11, java.lang.Object obj, com.google.android.gms.internal.ads.Q7 q10, com.google.android.gms.internal.ads.N4 n6) {
        this.f28660b = j12;
        this.f28661c = j13;
        this.f28662d = z6;
        q10.getClass();
        this.f28663e = q10;
        this.f28664f = n6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4942qm
    public final int a(java.lang.Object obj) {
        return f28659g.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4942qm
    public final int b() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4942qm
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4942qm
    public final com.google.android.gms.internal.ads.C4830pl d(int i6, com.google.android.gms.internal.ads.C4830pl c4830pl, boolean z6) {
        com.google.android.gms.internal.ads.LC.a(i6, 0, 1);
        c4830pl.i(null, z6 ? f28659g : null, 0, this.f28660b, 0L, com.google.android.gms.internal.ads.C2229Cc.f26255e, false);
        return c4830pl;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4942qm
    public final com.google.android.gms.internal.ads.C2764Ql e(int i6, com.google.android.gms.internal.ads.C2764Ql c2764Ql, long j6) {
        com.google.android.gms.internal.ads.LC.a(i6, 0, 1);
        java.lang.Object obj = com.google.android.gms.internal.ads.C2764Ql.f31037o;
        com.google.android.gms.internal.ads.Q7 q10 = this.f28663e;
        long j10 = this.f28661c;
        c2764Ql.a(obj, q10, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f28662d, false, this.f28664f, 0L, j10, 0, 0, 0L);
        return c2764Ql;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4942qm
    public final java.lang.Object f(int i6) {
        com.google.android.gms.internal.ads.LC.a(i6, 0, 1);
        return f28659g;
    }
}
