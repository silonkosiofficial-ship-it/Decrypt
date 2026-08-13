package D;

/* JADX INFO: renamed from: D.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0865b implements D0.S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p127m7.e f1631c;

    /* JADX INFO: renamed from: D.b$a */
    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f1632F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f1633G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f1634H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f1636J;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f1634H = obj;
            this.f1636J |= Integer.MIN_VALUE;
            return D.C0865b.this.g(this);
        }
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(p127m7.e eVar) throws java.lang.Throwable {
        D.C0865b.a aVar;
        p127m7.e eVar2;
        if (eVar instanceof D.C0865b.a) {
            aVar = (D.C0865b.a) eVar;
            int i6 = aVar.f1636J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f1636J = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new D.C0865b.a(eVar);
            }
        } else {
            aVar = new D.C0865b.a(eVar);
        }
        java.lang.Object obj = aVar.f1634H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f1636J;
        if (i10 == 0) {
            p087i7.x.b(obj);
            if (!this.f1630b) {
                p127m7.e eVar3 = this.f1631c;
                aVar.f1632F = this;
                aVar.f1633G = eVar3;
                aVar.f1636J = 1;
                p127m7.k kVar = new p127m7.k(p137n7.b.d(aVar));
                this.f1631c = kVar;
                java.lang.Object objA = kVar.a();
                if (objA == p137n7.b.g()) {
                    p147o7.h.c(aVar);
                }
                if (objA == objG) {
                    return objG;
                }
                eVar2 = eVar3;
            }
            return p087i7.M.f46721a;
        }
        if (i10 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        eVar2 = (p127m7.e) aVar.f1633G;
        p087i7.x.b(obj);
        if (eVar2 != null) {
            i7.w.a aVar2 = p087i7.w.f46751D;
            eVar2.t(p087i7.w.b(p087i7.M.f46721a));
        }
        return p087i7.M.f46721a;
    }

    @Override // D0.S
    public void s(D0.InterfaceC0900t interfaceC0900t) {
        if (this.f1630b) {
            return;
        }
        this.f1630b = true;
        p127m7.e eVar = this.f1631c;
        if (eVar != null) {
            i7.w.a aVar = p087i7.w.f46751D;
            eVar.t(p087i7.w.b(p087i7.M.f46721a));
        }
        this.f1631c = null;
    }
}
