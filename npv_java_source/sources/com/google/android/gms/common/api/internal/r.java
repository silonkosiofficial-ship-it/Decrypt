package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class r implements p115l4.InterfaceC6925f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.api.internal.C2148c f24949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P3.C1446b f24951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f24952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f24953e;

    r(com.google.android.gms.common.api.internal.C2148c c2148c, int i6, P3.C1446b c1446b, long j6, long j10, java.lang.String str, java.lang.String str2) {
        this.f24949a = c2148c;
        this.f24950b = i6;
        this.f24951c = c1446b;
        this.f24952d = j6;
        this.f24953e = j10;
    }

    static com.google.android.gms.common.api.internal.r b(com.google.android.gms.common.api.internal.C2148c c2148c, int i6, P3.C1446b c1446b) {
        boolean zW;
        if (!c2148c.e()) {
            return null;
        }
        Q3.r rVarA = Q3.C1478q.b().a();
        if (rVarA == null) {
            zW = true;
        } else {
            if (!rVarA.s()) {
                return null;
            }
            zW = rVarA.w();
            com.google.android.gms.common.api.internal.n nVarT = c2148c.t(c1446b);
            if (nVarT != null) {
                if (!(nVarT.s() instanceof Q3.AbstractC1464c)) {
                    return null;
                }
                Q3.AbstractC1464c abstractC1464c = (Q3.AbstractC1464c) nVarT.s();
                if (abstractC1464c.J() && !abstractC1464c.e()) {
                    Q3.C1466e c1466eC = c(nVarT, abstractC1464c, i6);
                    if (c1466eC == null) {
                        return null;
                    }
                    nVarT.D();
                    zW = c1466eC.C();
                }
            }
        }
        return new com.google.android.gms.common.api.internal.r(c2148c, i6, c1446b, zW ? java.lang.System.currentTimeMillis() : 0L, zW ? android.os.SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static Q3.C1466e c(com.google.android.gms.common.api.internal.n nVar, Q3.AbstractC1464c abstractC1464c, int i6) {
        int[] iArrF;
        int[] iArrS;
        Q3.C1466e c1466eH = abstractC1464c.H();
        if (c1466eH == null || !c1466eH.w() || ((iArrF = c1466eH.f()) != null ? !V3.b.a(iArrF, i6) : !((iArrS = c1466eH.s()) == null || !V3.b.a(iArrS, i6))) || nVar.q() >= c1466eH.e()) {
            return null;
        }
        return c1466eH;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009a A[PHI: r9
  0x009a: PHI (r9v3 int) = (r9v0 int), (r9v2 int) binds: [B:38:0x0098, B:44:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p115l4.InterfaceC6925f
    public final void a(p115l4.AbstractC6931l abstractC6931l) {
        com.google.android.gms.common.api.internal.n nVarT;
        int iC;
        int i6;
        int i10;
        int iE;
        long j6;
        long j10;
        int iElapsedRealtime;
        if (this.f24949a.e()) {
            Q3.r rVarA = Q3.C1478q.b().a();
            if ((rVarA == null || rVarA.s()) && (nVarT = this.f24949a.t(this.f24951c)) != null && (nVarT.s() instanceof Q3.AbstractC1464c)) {
                Q3.AbstractC1464c abstractC1464c = (Q3.AbstractC1464c) nVarT.s();
                int i11 = 0;
                boolean zW = this.f24952d > 0;
                int iZ = abstractC1464c.z();
                int iF = 100;
                if (rVarA != null) {
                    zW &= rVarA.w();
                    int iE2 = rVarA.e();
                    int iF2 = rVarA.f();
                    iC = rVarA.C();
                    if (abstractC1464c.J() && !abstractC1464c.e()) {
                        Q3.C1466e c1466eC = c(nVarT, abstractC1464c, this.f24950b);
                        if (c1466eC == null) {
                            return;
                        }
                        boolean z6 = c1466eC.C() && this.f24952d > 0;
                        iF2 = c1466eC.e();
                        zW = z6;
                    }
                    i10 = iE2;
                    i6 = iF2;
                } else {
                    iC = 0;
                    i6 = 100;
                    i10 = 5000;
                }
                com.google.android.gms.common.api.internal.C2148c c2148c = this.f24949a;
                if (abstractC6931l.o()) {
                    iE = 0;
                } else if (abstractC6931l.m()) {
                    i11 = iF;
                    iE = -1;
                } else {
                    java.lang.Exception excK = abstractC6931l.k();
                    if (excK instanceof O3.b) {
                        com.google.android.gms.common.api.Status statusA = ((O3.b) excK).a();
                        iF = statusA.f();
                        N3.C1389b c1389bE = statusA.e();
                        if (c1389bE == null) {
                            i11 = iF;
                            iE = -1;
                        } else {
                            iE = c1389bE.e();
                            i11 = iF;
                        }
                    } else {
                        i11 = 101;
                        iE = -1;
                    }
                }
                if (zW) {
                    long j11 = this.f24952d;
                    long j12 = this.f24953e;
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    iElapsedRealtime = (int) (android.os.SystemClock.elapsedRealtime() - j12);
                    j10 = jCurrentTimeMillis;
                    j6 = j11;
                } else {
                    j6 = 0;
                    j10 = 0;
                    iElapsedRealtime = -1;
                }
                c2148c.C(new Q3.C1474m(this.f24950b, i11, iE, j6, j10, null, null, iZ, iElapsedRealtime), iC, i10, i6);
            }
        }
    }
}
