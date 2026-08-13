package androidx.compose.foundation;

/* JADX INFO: loaded from: classes.dex */
final class l extends androidx.compose.ui.d.c implements F0.z0 {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private androidx.compose.foundation.m f19170P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f19171Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private p230x.p f19172R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f19173S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f19174T;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Float b() {
            return java.lang.Float.valueOf(androidx.compose.foundation.l.this.T1().l());
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Float b() {
            return java.lang.Float.valueOf(androidx.compose.foundation.l.this.T1().k());
        }
    }

    public l(androidx.compose.foundation.m mVar, boolean z6, p230x.p pVar, boolean z10, boolean z11) {
        this.f19170P = mVar;
        this.f19171Q = z6;
        this.f19172R = pVar;
        this.f19173S = z10;
        this.f19174T = z11;
    }

    @Override // F0.z0
    public void M0(K0.w wVar) {
        K0.u.k0(wVar, true);
        K0.i iVar = new K0.i(new androidx.compose.foundation.l.a(), new androidx.compose.foundation.l.b(), this.f19171Q);
        if (this.f19174T) {
            K0.u.m0(wVar, iVar);
        } else {
            K0.u.T(wVar, iVar);
        }
    }

    public final androidx.compose.foundation.m T1() {
        return this.f19170P;
    }

    public final void U1(p230x.p pVar) {
        this.f19172R = pVar;
    }

    public final void V1(boolean z6) {
        this.f19171Q = z6;
    }

    public final void W1(boolean z6) {
        this.f19173S = z6;
    }

    public final void X1(androidx.compose.foundation.m mVar) {
        this.f19170P = mVar;
    }

    public final void Y1(boolean z6) {
        this.f19174T = z6;
    }

    @Override // F0.z0
    public /* synthetic */ boolean h0() {
        return F0.y0.a(this);
    }

    @Override // F0.z0
    public /* synthetic */ boolean k1() {
        return F0.y0.b(this);
    }
}
