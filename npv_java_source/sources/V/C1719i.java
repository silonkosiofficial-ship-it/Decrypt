package V;

/* JADX INFO: renamed from: V.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1719i implements V.InterfaceC1723j0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p237x7.a f14883C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.lang.Throwable f14885E;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.Object f14884D = new java.lang.Object();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private java.util.List f14886F = new java.util.ArrayList();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private java.util.List f14887G = new java.util.ArrayList();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final V.C1716h f14888H = new V.C1716h(0);

    /* JADX INFO: renamed from: V.i$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p237x7.l f14889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p127m7.e f14890b;

        public a(p237x7.l lVar, p127m7.e eVar) {
            this.f14889a = lVar;
            this.f14890b = eVar;
        }

        public final p127m7.e a() {
            return this.f14890b;
        }

        public final void b(long j6) {
            java.lang.Object objB;
            p127m7.e eVar = this.f14890b;
            try {
                i7.w.a aVar = p087i7.w.f46751D;
                objB = p087i7.w.b(this.f14889a.l(java.lang.Long.valueOf(j6)));
            } catch (java.lang.Throwable th) {
                i7.w.a aVar2 = p087i7.w.f46751D;
                objB = p087i7.w.b(p087i7.x.a(th));
            }
            eVar.t(objB);
        }
    }

    /* JADX INFO: renamed from: V.i$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ V.C1719i.a f14892E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(V.C1719i.a aVar) {
            super(1);
            this.f14892E = aVar;
        }

        public final void a(java.lang.Throwable th) {
            java.lang.Object obj = V.C1719i.this.f14884D;
            V.C1719i c1719i = V.C1719i.this;
            V.C1719i.a aVar = this.f14892E;
            synchronized (obj) {
                try {
                    c1719i.f14886F.remove(aVar);
                    if (c1719i.f14886F.isEmpty()) {
                        c1719i.f14888H.set(0);
                    }
                    p087i7.M m6 = p087i7.M.f46721a;
                } catch (java.lang.Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((java.lang.Throwable) obj);
            return p087i7.M.f46721a;
        }
    }

    public C1719i(p237x7.a aVar) {
        this.f14883C = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(java.lang.Throwable th) {
        synchronized (this.f14884D) {
            try {
                if (this.f14885E != null) {
                    return;
                }
                this.f14885E = th;
                java.util.List list = this.f14886F;
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    p127m7.e eVarA = ((V.C1719i.a) list.get(i6)).a();
                    i7.w.a aVar = p087i7.w.f46751D;
                    eVarA.t(p087i7.w.b(p087i7.x.a(th)));
                }
                this.f14886F.clear();
                this.f14888H.set(0);
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p127m7.i
    public java.lang.Object D(java.lang.Object obj, p237x7.p pVar) {
        return V.InterfaceC1723j0.a.a(this, obj, pVar);
    }

    @Override // V.InterfaceC1723j0
    public java.lang.Object R(p237x7.l lVar, p127m7.e eVar) {
        W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(eVar), 1);
        c1798n.E();
        V.C1719i.a aVar = new V.C1719i.a(lVar, c1798n);
        synchronized (this.f14884D) {
            java.lang.Throwable th = this.f14885E;
            if (th != null) {
                i7.w.a aVar2 = p087i7.w.f46751D;
                c1798n.t(p087i7.w.b(p087i7.x.a(th)));
            } else {
                boolean z6 = !this.f14886F.isEmpty();
                this.f14886F.add(aVar);
                if (!z6) {
                    this.f14888H.set(1);
                }
                boolean z10 = true ^ z6;
                c1798n.G(new V.C1719i.b(aVar));
                if (z10 && this.f14883C != null) {
                    try {
                        this.f14883C.b();
                    } catch (java.lang.Throwable th2) {
                        j(th2);
                    }
                }
            }
        }
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

    public final boolean k() {
        return this.f14888H.get() != 0;
    }

    public final void l(long j6) {
        synchronized (this.f14884D) {
            try {
                java.util.List list = this.f14886F;
                this.f14886F = this.f14887G;
                this.f14887G = list;
                this.f14888H.set(0);
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((V.C1719i.a) list.get(i6)).b(j6);
                }
                list.clear();
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
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
