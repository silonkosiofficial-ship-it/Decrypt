package p251z0;

/* JADX INFO: renamed from: z0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7385v extends androidx.compose.ui.d.c implements F0.E0, F0.v0, F0.InterfaceC0921h {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final java.lang.String f57599P = "androidx.compose.ui.input.pointer.PointerHoverIcon";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private p251z0.InterfaceC7386w f57600Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f57601R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f57602S;

    /* JADX INFO: renamed from: z0.v$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p247y7.O f57603D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p247y7.O o6) {
            super(1);
            this.f57603D = o6;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(p251z0.C7385v c7385v) {
            if ((this.f57603D.f57254C == null && c7385v.f57602S) || (this.f57603D.f57254C != null && c7385v.b2() && c7385v.f57602S)) {
                this.f57603D.f57254C = c7385v;
            }
            return java.lang.Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: z0.v$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p247y7.K f57604D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p247y7.K k6) {
            super(1);
            this.f57604D = k6;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F0.D0 l(p251z0.C7385v c7385v) {
            if (!c7385v.f57602S) {
                return F0.D0.ContinueTraversal;
            }
            this.f57604D.f57250C = false;
            return F0.D0.CancelTraversal;
        }
    }

    /* JADX INFO: renamed from: z0.v$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p247y7.O f57605D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p247y7.O o6) {
            super(1);
            this.f57605D = o6;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F0.D0 l(p251z0.C7385v c7385v) {
            F0.D0 d6 = F0.D0.ContinueTraversal;
            if (!c7385v.f57602S) {
                return d6;
            }
            this.f57605D.f57254C = c7385v;
            return c7385v.b2() ? F0.D0.SkipSubtreeAndContinueTraversal : d6;
        }
    }

    /* JADX INFO: renamed from: z0.v$d */
    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p247y7.O f57606D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p247y7.O o6) {
            super(1);
            this.f57606D = o6;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(p251z0.C7385v c7385v) {
            if (c7385v.b2() && c7385v.f57602S) {
                this.f57606D.f57254C = c7385v;
            }
            return java.lang.Boolean.TRUE;
        }
    }

    public C7385v(p251z0.InterfaceC7386w interfaceC7386w, boolean z6) {
        this.f57600Q = interfaceC7386w;
        this.f57601R = z6;
    }

    private final void U1() {
        p251z0.y yVarC2 = c2();
        if (yVarC2 != null) {
            yVarC2.a(null);
        }
    }

    private final void V1() {
        p251z0.InterfaceC7386w interfaceC7386w;
        p251z0.C7385v c7385vA2 = a2();
        if (c7385vA2 == null || (interfaceC7386w = c7385vA2.f57600Q) == null) {
            interfaceC7386w = this.f57600Q;
        }
        p251z0.y yVarC2 = c2();
        if (yVarC2 != null) {
            yVarC2.a(interfaceC7386w);
        }
    }

    private final void W1() {
        p087i7.M m6;
        p247y7.O o6 = new p247y7.O();
        F0.F0.d(this, new p251z0.C7385v.a(o6));
        p251z0.C7385v c7385v = (p251z0.C7385v) o6.f57254C;
        if (c7385v != null) {
            c7385v.V1();
            m6 = p087i7.M.f46721a;
        } else {
            m6 = null;
        }
        if (m6 == null) {
            U1();
        }
    }

    private final void X1() {
        p251z0.C7385v c7385vZ1;
        if (this.f57602S) {
            if (this.f57601R || (c7385vZ1 = Z1()) == null) {
                c7385vZ1 = this;
            }
            c7385vZ1.V1();
        }
    }

    private final void Y1() {
        p247y7.K k6 = new p247y7.K();
        k6.f57250C = true;
        if (!this.f57601R) {
            F0.F0.f(this, new p251z0.C7385v.b(k6));
        }
        if (k6.f57250C) {
            V1();
        }
    }

    private final p251z0.C7385v Z1() {
        p247y7.O o6 = new p247y7.O();
        F0.F0.f(this, new p251z0.C7385v.c(o6));
        return (p251z0.C7385v) o6.f57254C;
    }

    private final p251z0.C7385v a2() {
        p247y7.O o6 = new p247y7.O();
        F0.F0.d(this, new p251z0.C7385v.d(o6));
        return (p251z0.C7385v) o6.f57254C;
    }

    private final p251z0.y c2() {
        return (p251z0.y) F0.AbstractC0923i.a(this, androidx.compose.ui.platform.AbstractC1966p0.l());
    }

    private final void e2() {
        this.f57602S = true;
        Y1();
    }

    private final void f2() {
        if (this.f57602S) {
            this.f57602S = false;
            if (A1()) {
                W1();
            }
        }
    }

    @Override // androidx.compose.ui.d.c
    public void E1() {
        f2();
        super.E1();
    }

    @Override // F0.v0
    public /* synthetic */ boolean Y0() {
        return F0.u0.d(this);
    }

    public final boolean b2() {
        return this.f57601R;
    }

    @Override // F0.E0
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public java.lang.String K() {
        return this.f57599P;
    }

    @Override // F0.v0
    public /* synthetic */ void f1() {
        F0.u0.c(this);
    }

    @Override // F0.v0
    public void g0() {
        f2();
    }

    public final void g2(p251z0.InterfaceC7386w interfaceC7386w) {
        if (p247y7.AbstractC7350t.b(this.f57600Q, interfaceC7386w)) {
            return;
        }
        this.f57600Q = interfaceC7386w;
        if (this.f57602S) {
            Y1();
        }
    }

    public final void h2(boolean z6) {
        if (this.f57601R != z6) {
            this.f57601R = z6;
            if (z6) {
                if (this.f57602S) {
                    V1();
                }
            } else if (this.f57602S) {
                X1();
            }
        }
    }

    @Override // F0.v0
    public /* synthetic */ boolean n0() {
        return F0.u0.a(this);
    }

    @Override // F0.v0
    public /* synthetic */ void t0() {
        F0.u0.b(this);
    }

    @Override // F0.v0
    public void w0(p251z0.C7380p c7380p, p251z0.r rVar, long j6) {
        if (rVar == p251z0.r.Main) {
            int iF = c7380p.f();
            p251z0.AbstractC7383t.a aVar = p251z0.AbstractC7383t.f57591a;
            if (p251z0.AbstractC7383t.i(iF, aVar.a())) {
                e2();
            } else if (p251z0.AbstractC7383t.i(c7380p.f(), aVar.b())) {
                f2();
            }
        }
    }
}
