package G6;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends W9.b implements W8.N {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p127m7.i f3105C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final W9.a f3106D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final W8.InterfaceC1813v f3107E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Y8.j f3108F;

    public n(H9.x xVar, H9.z zVar, p127m7.i iVar) {
        p247y7.AbstractC7350t.f(xVar, "engine");
        p247y7.AbstractC7350t.f(zVar, "engineRequest");
        p247y7.AbstractC7350t.f(iVar, "coroutineContext");
        this.f3105C = iVar;
        this.f3106D = W9.d.b(xVar).a(zVar, this);
        this.f3107E = W8.AbstractC1817x.b(null, 1, null);
        this.f3108F = Y8.m.b(8, null, null, 6, null);
    }

    private final M6.b f(H9.B b6) {
        M6.b bVar;
        T6.C1660h c1660hB;
        if (b6 != null) {
            int iO = b6.o();
            T6.C.a aVar = T6.C.f12998E;
            if (iO != aVar.A().m0()) {
                bVar = new M6.b(null, null, "Expected status code " + aVar.A().m0() + " but was " + b6.o(), 3, null);
            } else {
                H9.t tVarH = b6.H();
                T6.C1673v c1673v = T6.C1673v.f13241a;
                java.lang.String strD = tVarH.d(c1673v.h());
                T6.C1660h c1660hH = (strD == null || (c1660hB = T6.C1660h.f13129f.b(strD)) == null) ? null : c1660hB.h();
                T6.C1660h.d dVar = T6.C1660h.d.f13165a;
                if (!p247y7.AbstractC7350t.b(c1660hH, dVar.a())) {
                    bVar = new M6.b(null, null, "Content type must be " + dVar.a() + " but was " + b6.H().d(c1673v.h()), 3, null);
                }
            }
            return bVar;
        }
        return g();
    }

    private static final M6.b g() {
        return new M6.b(null, null, "Unexpected error occurred in OkHttpSSESession", 3, null);
    }

    @Override // W9.b
    public void a(W9.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "eventSource");
        Y8.C.a.a(this.f3108F, null, 1, null);
        this.f3106D.cancel();
    }

    @Override // W9.b
    public void b(W9.a aVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        p247y7.AbstractC7350t.f(aVar, "eventSource");
        p247y7.AbstractC7350t.f(str3, "data");
        Y8.q.b(this.f3108F, new V6.a(str3, str2, str, null, null, 24, null));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:22:0x0073  */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x0053, please report this as an issue */
    @Override // W9.b
    public void c(W9.a aVar, java.lang.Throwable th, H9.B b6) {
        M6.b bVarF;
        H9.t tVarH;
        p247y7.AbstractC7350t.f(aVar, "eventSource");
        java.lang.Integer numValueOf = b6 != null ? java.lang.Integer.valueOf(b6.o()) : null;
        java.lang.String strD = (b6 == null || (tVarH = b6.H()) == null) ? null : tVarH.d(T6.C1673v.f13241a.h());
        if (b6 != null) {
            int iM0 = T6.C.f12998E.A().m0();
            if (numValueOf != null && numValueOf.intValue() == iM0 && p247y7.AbstractC7350t.b(strD, T6.C1660h.d.f13165a.a().toString())) {
                if (th != null) {
                    bVarF = new M6.b(null, th, "Exception during OkHttpSSESession: " + th.getMessage(), 1, null);
                } else {
                    bVarF = f(b6);
                }
                this.f3107E.g(bVarF);
            } else {
                this.f3107E.R0(b6);
            }
        } else {
            if (th != null) {
                bVarF = new M6.b(null, th, "Exception during OkHttpSSESession: " + th.getMessage(), 1, null);
            } else {
                bVarF = f(b6);
            }
            this.f3107E.g(bVarF);
        }
        Y8.C.a.a(this.f3108F, null, 1, null);
        this.f3106D.cancel();
    }

    @Override // W9.b
    public void d(W9.a aVar, H9.B b6) {
        p247y7.AbstractC7350t.f(aVar, "eventSource");
        p247y7.AbstractC7350t.f(b6, "response");
        this.f3107E.R0(b6);
    }

    public final W8.InterfaceC1813v e() {
        return this.f3107E;
    }

    @Override // W8.N
    public p127m7.i getCoroutineContext() {
        return this.f3105C;
    }
}
