package V;

/* JADX INFO: renamed from: V.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1712f1 implements V.InterfaceC1723j0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final V.C1712f1 f14855C = new V.C1712f1();

    /* JADX INFO: renamed from: V.f1$a */
    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f14856G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.l f14857H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.l lVar, p127m7.e eVar) {
            super(2, eVar);
            this.f14857H = lVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f14856G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                this.f14856G = 1;
                if (W8.Y.a(16L, this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return this.f14857H.l(p147o7.b.d(java.lang.System.nanoTime()));
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((V.C1712f1.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new V.C1712f1.a(this.f14857H, eVar);
        }
    }

    private C1712f1() {
    }

    @Override // p127m7.i
    public java.lang.Object D(java.lang.Object obj, p237x7.p pVar) {
        return V.InterfaceC1723j0.a.a(this, obj, pVar);
    }

    @Override // V.InterfaceC1723j0
    public java.lang.Object R(p237x7.l lVar, p127m7.e eVar) {
        return W8.AbstractC1784g.g(W8.C1779d0.c(), new V.C1712f1.a(lVar, null), eVar);
    }

    @Override // m7.i.b
    public /* synthetic */ m7.i.c getKey() {
        return V.AbstractC1720i0.a(this);
    }

    @Override // m7.i.b, p127m7.i
    public m7.i.b i(m7.i.c cVar) {
        return V.InterfaceC1723j0.a.b(this, cVar);
    }

    @Override // p127m7.i
    public p127m7.i o0(p127m7.i iVar) {
        return V.InterfaceC1723j0.a.d(this, iVar);
    }

    @Override // p127m7.i
    public p127m7.i y0(m7.i.c cVar) {
        return V.InterfaceC1723j0.a.c(this, cVar);
    }
}
