package V;

/* JADX INFO: loaded from: classes.dex */
final class H implements V.InterfaceC1723j0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final V.H f14666C = new V.H();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final android.view.Choreographer f14667D = (android.view.Choreographer) W8.AbstractC1784g.e(W8.C1779d0.c().z1(), new V.H.a(null));

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f14668G;

        a(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f14668G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            return android.view.Choreographer.getInstance();
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((V.H.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new V.H.a(eVar);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ android.view.Choreographer.FrameCallback f14669D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(android.view.Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f14669D = frameCallback;
        }

        public final void a(java.lang.Throwable th) {
            V.H.f14667D.removeFrameCallback(this.f14669D);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((java.lang.Throwable) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class c implements android.view.Choreographer.FrameCallback {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ W8.InterfaceC1794l f14670C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f14671D;

        c(W8.InterfaceC1794l interfaceC1794l, p237x7.l lVar) {
            this.f14670C = interfaceC1794l;
            this.f14671D = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j6) {
            java.lang.Object objB;
            W8.InterfaceC1794l interfaceC1794l = this.f14670C;
            V.H h6 = V.H.f14666C;
            p237x7.l lVar = this.f14671D;
            try {
                i7.w.a aVar = p087i7.w.f46751D;
                objB = p087i7.w.b(lVar.l(java.lang.Long.valueOf(j6)));
            } catch (java.lang.Throwable th) {
                i7.w.a aVar2 = p087i7.w.f46751D;
                objB = p087i7.w.b(p087i7.x.a(th));
            }
            interfaceC1794l.t(objB);
        }
    }

    private H() {
    }

    @Override // p127m7.i
    public java.lang.Object D(java.lang.Object obj, p237x7.p pVar) {
        return V.InterfaceC1723j0.a.a(this, obj, pVar);
    }

    @Override // V.InterfaceC1723j0
    public java.lang.Object R(p237x7.l lVar, p127m7.e eVar) {
        W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(eVar), 1);
        c1798n.E();
        V.H.c cVar = new V.H.c(c1798n, lVar);
        f14667D.postFrameCallback(cVar);
        c1798n.G(new V.H.b(cVar));
        java.lang.Object objX = c1798n.x();
        if (objX == p137n7.b.g()) {
            p147o7.h.c(eVar);
        }
        return objX;
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
