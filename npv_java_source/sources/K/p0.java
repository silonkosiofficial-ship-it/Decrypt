package K;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.l f5886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K.l0 f5887b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f5891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f5892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f5893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f5894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private S0.V f5895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private M0.K f5896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private S0.L f5897l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private p131n0.i f5898m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private p131n0.i f5899n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f5888c = new java.lang.Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final android.view.inputmethod.CursorAnchorInfo.Builder f5900o = new android.view.inputmethod.CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final float[] f5901p = p141o0.J1.c(null, 1, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final android.graphics.Matrix f5902q = new android.graphics.Matrix();

    public p0(p237x7.l lVar, K.l0 l0Var) {
        this.f5886a = lVar;
        this.f5887b = l0Var;
    }

    private final void c() {
        if (!this.f5887b.f() || this.f5895j == null || this.f5897l == null || this.f5896k == null || this.f5898m == null || this.f5899n == null) {
            return;
        }
        p141o0.J1.h(this.f5901p);
        this.f5886a.l(p141o0.J1.a(this.f5901p));
        float[] fArr = this.f5901p;
        p131n0.i iVar = this.f5899n;
        p247y7.AbstractC7350t.c(iVar);
        float f6 = -iVar.i();
        p131n0.i iVar2 = this.f5899n;
        p247y7.AbstractC7350t.c(iVar2);
        p141o0.J1.p(fArr, f6, -iVar2.l(), 0.0f);
        p141o0.S.a(this.f5902q, this.f5901p);
        K.l0 l0Var = this.f5887b;
        android.view.inputmethod.CursorAnchorInfo.Builder builder = this.f5900o;
        S0.V v6 = this.f5895j;
        p247y7.AbstractC7350t.c(v6);
        S0.L l6 = this.f5897l;
        p247y7.AbstractC7350t.c(l6);
        M0.K k6 = this.f5896k;
        p247y7.AbstractC7350t.c(k6);
        android.graphics.Matrix matrix = this.f5902q;
        p131n0.i iVar3 = this.f5898m;
        p247y7.AbstractC7350t.c(iVar3);
        p131n0.i iVar4 = this.f5899n;
        p247y7.AbstractC7350t.c(iVar4);
        l0Var.j(K.o0.b(builder, v6, l6, k6, matrix, iVar3, iVar4, this.f5891f, this.f5892g, this.f5893h, this.f5894i));
        this.f5890e = false;
    }

    public final void a() {
        synchronized (this.f5888c) {
            this.f5895j = null;
            this.f5897l = null;
            this.f5896k = null;
            this.f5898m = null;
            this.f5899n = null;
            p087i7.M m6 = p087i7.M.f46721a;
        }
    }

    public final void b(boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        synchronized (this.f5888c) {
            try {
                this.f5891f = z11;
                this.f5892g = z12;
                this.f5893h = z13;
                this.f5894i = z14;
                if (z6) {
                    this.f5890e = true;
                    if (this.f5895j != null) {
                        c();
                    }
                }
                this.f5889d = z10;
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void d(S0.V v6, S0.L l6, M0.K k6, p131n0.i iVar, p131n0.i iVar2) {
        synchronized (this.f5888c) {
            try {
                this.f5895j = v6;
                this.f5897l = l6;
                this.f5896k = k6;
                this.f5898m = iVar;
                this.f5899n = iVar2;
                if (this.f5890e || this.f5889d) {
                    c();
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
