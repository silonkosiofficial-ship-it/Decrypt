package p101k0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends androidx.compose.ui.d.c implements F0.E0, p101k0.d {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final k0.e.a f49346T = new k0.e.a(null);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int f49347U = 8;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final p237x7.l f49348P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final java.lang.Object f49349Q = k0.e.a.C0619a.f49352a;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private p101k0.d f49350R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private p101k0.g f49351S;

    public static final class a {

        /* JADX INFO: renamed from: k0.e$a$a, reason: collision with other inner class name */
        private static final class C0619a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final k0.e.a.C0619a f49352a = new k0.e.a.C0619a();

            private C0619a() {
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p101k0.b f49353D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p101k0.e f49354E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p247y7.K f49355F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p101k0.b bVar, p101k0.e eVar, p247y7.K k6) {
            super(1);
            this.f49353D = bVar;
            this.f49354E = eVar;
            this.f49355F = k6;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F0.D0 l(p101k0.e eVar) {
            if (!eVar.A1()) {
                return F0.D0.SkipSubtreeAndContinueTraversal;
            }
            if (!(eVar.f49351S == null)) {
                C0.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
            }
            eVar.f49351S = (p101k0.g) eVar.f49348P.l(this.f49353D);
            boolean z6 = eVar.f49351S != null;
            if (z6) {
                F0.AbstractC0925k.n(this.f49354E).getDragAndDropManager().a(eVar);
            }
            p247y7.K k6 = this.f49355F;
            k6.f57250C = k6.f57250C || z6;
            return F0.D0.ContinueTraversal;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p101k0.b f49356D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p101k0.b bVar) {
            super(1);
            this.f49356D = bVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F0.D0 l(p101k0.e eVar) {
            if (!eVar.E0().A1()) {
                return F0.D0.SkipSubtreeAndContinueTraversal;
            }
            p101k0.g gVar = eVar.f49351S;
            if (gVar != null) {
                gVar.c0(this.f49356D);
            }
            eVar.f49351S = null;
            eVar.f49350R = null;
            return F0.D0.ContinueTraversal;
        }
    }

    public static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p247y7.O f49357D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p101k0.e f49358E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p101k0.b f49359F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(p247y7.O o6, p101k0.e eVar, p101k0.b bVar) {
            super(1);
            this.f49357D = o6;
            this.f49358E = eVar;
            this.f49359F = bVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F0.D0 l(F0.E0 e6) {
            p101k0.e eVar = (p101k0.e) e6;
            if (!F0.AbstractC0925k.n(this.f49358E).getDragAndDropManager().b(eVar) || !p101k0.f.d(eVar, p101k0.i.a(this.f49359F))) {
                return F0.D0.ContinueTraversal;
            }
            this.f49357D.f57254C = e6;
            return F0.D0.CancelTraversal;
        }
    }

    public e(p237x7.l lVar) {
        this.f49348P = lVar;
    }

    @Override // androidx.compose.ui.d.c
    public void E1() {
        this.f49351S = null;
        this.f49350R = null;
    }

    @Override // F0.E0
    public java.lang.Object K() {
        return this.f49349Q;
    }

    @Override // p101k0.g
    public void S(p101k0.b bVar) {
        p101k0.g gVar = this.f49351S;
        if (gVar == null && (gVar = this.f49350R) == null) {
            return;
        }
        gVar.S(bVar);
    }

    public boolean T1(p101k0.b bVar) {
        p247y7.K k6 = new p247y7.K();
        p101k0.f.f(this, new k0.e.b(bVar, this, k6));
        return k6.f57250C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k0.d] */
    /* JADX WARN: Type inference failed for: r0v2, types: [k0.g] */
    /* JADX WARN: Type inference failed for: r0v3, types: [k0.g] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, k0.d, k0.g] */
    @Override // p101k0.g
    public void U(p101k0.b bVar) {
        F0.E0 e6;
        ?? r6;
        ?? r10 = this.f49350R;
        if (r10 == 0 || !p101k0.f.d(r10, p101k0.i.a(bVar))) {
            if (E0().A1()) {
                p247y7.O o6 = new p247y7.O();
                F0.F0.f(this, new k0.e.d(o6, this, bVar));
                e6 = (F0.E0) o6.f57254C;
            } else {
                e6 = null;
            }
            r6 = (p101k0.d) e6;
        } else {
            r6 = r10;
        }
        if (r6 == 0 || r10 != 0) {
            if (r6 == 0 && r10 != 0) {
                p101k0.g gVar = this.f49351S;
                if (gVar != null) {
                    p101k0.f.e(gVar, bVar);
                }
            } else if (!p247y7.AbstractC7350t.b(r6, r10)) {
                if (r6 != 0) {
                    p101k0.f.e(r6, bVar);
                }
                if (r10 != 0) {
                }
            } else if (r6 != 0) {
                r6.U(bVar);
            } else {
                p101k0.g gVar2 = this.f49351S;
                if (gVar2 != null) {
                    gVar2.U(bVar);
                }
            }
            r10.a1(bVar);
        } else {
            p101k0.f.e(r6, bVar);
            r10 = this.f49351S;
            if (r10 != 0) {
                r10.a1(bVar);
            }
        }
        this.f49350R = r6;
    }

    @Override // p101k0.g
    public void a1(p101k0.b bVar) {
        p101k0.g gVar = this.f49351S;
        if (gVar != null) {
            gVar.a1(bVar);
        }
        p101k0.d dVar = this.f49350R;
        if (dVar != null) {
            dVar.a1(bVar);
        }
        this.f49350R = null;
    }

    @Override // p101k0.g
    public void c0(p101k0.b bVar) {
        p101k0.f.f(this, new k0.e.c(bVar));
    }

    @Override // p101k0.g
    public boolean n1(p101k0.b bVar) {
        p101k0.g gVar = this.f49350R;
        if (gVar == null && (gVar = this.f49351S) == null) {
            return false;
        }
        return gVar.n1(bVar);
    }

    @Override // p101k0.g
    public void x0(p101k0.b bVar) {
        p101k0.g gVar = this.f49351S;
        if (gVar == null && (gVar = this.f49350R) == null) {
            return;
        }
        gVar.x0(bVar);
    }
}
