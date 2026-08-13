package p012b1;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p012b1.i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b1.l.b f24081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f24082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f24083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.ArrayList f24084j;

    private static final class a extends androidx.compose.ui.platform.H0 implements D0.U {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p012b1.f f24085c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p237x7.l f24086d;

        /* JADX INFO: renamed from: b1.l$a$a, reason: collision with other inner class name */
        public static final class C0458a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p012b1.f f24087D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p237x7.l f24088E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0458a(p012b1.f fVar, p237x7.l lVar) {
                super(1);
                this.f24087D = fVar;
                this.f24088E = lVar;
            }

            public final void a(androidx.compose.ui.platform.G0 g6) {
                throw null;
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                androidx.appcompat.app.D.a(obj);
                a(null);
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p012b1.f fVar, p237x7.l lVar) {
            super(androidx.compose.ui.platform.E0.b() ? new b1.l.a.C0458a(fVar, lVar) : androidx.compose.ui.platform.E0.a());
            p247y7.AbstractC7350t.f(fVar, "ref");
            p247y7.AbstractC7350t.f(lVar, "constrainBlock");
            this.f24085c = fVar;
            this.f24086d = lVar;
        }

        @Override // androidx.compose.ui.d
        public /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar) {
            return p071h0.f.a(this, dVar);
        }

        @Override // androidx.compose.ui.d
        public /* synthetic */ java.lang.Object c(java.lang.Object obj, p237x7.p pVar) {
            return p071h0.g.b(this, obj, pVar);
        }

        @Override // androidx.compose.ui.d
        public /* synthetic */ boolean d(p237x7.l lVar) {
            return p071h0.g.a(this, lVar);
        }

        public boolean equals(java.lang.Object obj) {
            p237x7.l lVar = this.f24086d;
            b1.l.a aVar = obj instanceof b1.l.a ? (b1.l.a) obj : null;
            return p247y7.AbstractC7350t.b(lVar, aVar != null ? aVar.f24086d : null);
        }

        @Override // D0.U
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public p012b1.k G(Y0.e eVar, java.lang.Object obj) {
            p247y7.AbstractC7350t.f(eVar, "<this>");
            return new p012b1.k(this.f24085c, this.f24086d);
        }

        public int hashCode() {
            return this.f24086d.hashCode();
        }
    }

    public final class b {
        public b() {
        }

        public final p012b1.f a() {
            return p012b1.l.this.f();
        }

        public final p012b1.f b() {
            return p012b1.l.this.f();
        }

        public final p012b1.f c() {
            return p012b1.l.this.f();
        }
    }

    public l() {
        super(null);
        this.f24083i = this.f24082h;
        this.f24084j = new java.util.ArrayList();
    }

    @Override // p012b1.i
    public void d() {
        super.d();
        this.f24083i = this.f24082h;
    }

    public final androidx.compose.ui.d e(androidx.compose.ui.d dVar, p012b1.f fVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "<this>");
        p247y7.AbstractC7350t.f(fVar, "ref");
        p247y7.AbstractC7350t.f(lVar, "constrainBlock");
        if (this.f24080f) {
            lVar.l(new p012b1.e(fVar.a(), b(fVar)));
        }
        return dVar.b(new b1.l.a(fVar, lVar));
    }

    public final p012b1.f f() {
        java.util.ArrayList arrayList = this.f24084j;
        int i6 = this.f24083i;
        this.f24083i = i6 + 1;
        p012b1.f fVar = (p012b1.f) p097j7.AbstractC6879v.l0(arrayList, i6);
        if (fVar != null) {
            return fVar;
        }
        p012b1.f fVar2 = new p012b1.f(java.lang.Integer.valueOf(this.f24083i));
        this.f24084j.add(fVar2);
        return fVar2;
    }

    public final b1.l.b g() {
        b1.l.b bVar = this.f24081g;
        if (bVar != null) {
            return bVar;
        }
        b1.l.b bVar2 = new b1.l.b();
        this.f24081g = bVar2;
        return bVar2;
    }
}
