package p007a7;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends p007a7.e {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.List f17088D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p127m7.e f17089E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private java.lang.Object f17090F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p127m7.e[] f17091G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f17092H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f17093I;

    public static final class a implements p127m7.e, p147o7.e {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private int f17094C = Integer.MIN_VALUE;

        a() {
        }

        private final p127m7.e a() {
            if (this.f17094C == Integer.MIN_VALUE) {
                this.f17094C = p007a7.o.this.f17092H;
            }
            if (this.f17094C < 0) {
                this.f17094C = Integer.MIN_VALUE;
                return null;
            }
            try {
                p127m7.e[] eVarArr = p007a7.o.this.f17091G;
                int i6 = this.f17094C;
                p127m7.e eVar = eVarArr[i6];
                if (eVar == null) {
                    return p007a7.n.f17087C;
                }
                this.f17094C = i6 - 1;
                return eVar;
            } catch (java.lang.Throwable unused) {
                return p007a7.n.f17087C;
            }
        }

        @Override // p147o7.e
        public p147o7.e e() {
            p127m7.e eVarA = a();
            if (eVarA instanceof p147o7.e) {
                return (p147o7.e) eVarA;
            }
            return null;
        }

        @Override // p127m7.e
        public p127m7.i getContext() {
            p127m7.e eVar = p007a7.o.this.f17091G[p007a7.o.this.f17092H];
            if (eVar != this && eVar != null) {
                return eVar.getContext();
            }
            int i6 = p007a7.o.this.f17092H - 1;
            while (i6 >= 0) {
                int i10 = i6 - 1;
                p127m7.e eVar2 = p007a7.o.this.f17091G[i6];
                if (eVar2 != this && eVar2 != null) {
                    return eVar2.getContext();
                }
                i6 = i10;
            }
            throw new java.lang.IllegalStateException("Not started".toString());
        }

        @Override // p127m7.e
        public void t(java.lang.Object obj) {
            if (!p087i7.w.g(obj)) {
                p007a7.o.this.l(false);
                return;
            }
            p007a7.o oVar = p007a7.o.this;
            java.lang.Throwable thE = p087i7.w.e(obj);
            p247y7.AbstractC7350t.c(thE);
            oVar.m(p087i7.w.b(p087i7.x.a(thE)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.Object obj, java.lang.Object obj2, java.util.List list) {
        super(obj2);
        p247y7.AbstractC7350t.f(obj, "initial");
        p247y7.AbstractC7350t.f(obj2, "context");
        p247y7.AbstractC7350t.f(list, "blocks");
        this.f17088D = list;
        this.f17089E = new a7.o.a();
        this.f17090F = obj;
        this.f17091G = new p127m7.e[list.size()];
        this.f17092H = -1;
    }

    private final void k() {
        int i6 = this.f17092H;
        if (i6 < 0) {
            throw new java.lang.IllegalStateException("No more continuations to resume");
        }
        p127m7.e[] eVarArr = this.f17091G;
        this.f17092H = i6 - 1;
        eVarArr[i6] = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l(boolean z6) {
        int i6;
        java.lang.Object objC;
        do {
            i6 = this.f17093I;
            if (i6 != this.f17088D.size()) {
                this.f17093I = i6 + 1;
                try {
                } catch (java.lang.Throwable th) {
                    i7.w.a aVar = p087i7.w.f46751D;
                    objC = p087i7.x.a(th);
                }
            } else {
                if (z6) {
                    return true;
                }
                i7.w.a aVar2 = p087i7.w.f46751D;
                objC = c();
            }
            m(p087i7.w.b(objC));
            return false;
        } while (p007a7.h.a((p237x7.q) this.f17088D.get(i6), this, c(), this.f17089E) != p137n7.b.g());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(java.lang.Object obj) {
        int i6 = this.f17092H;
        if (i6 < 0) {
            throw new java.lang.IllegalStateException("No more continuations to resume".toString());
        }
        p127m7.e eVar = this.f17091G[i6];
        p247y7.AbstractC7350t.c(eVar);
        p127m7.e[] eVarArr = this.f17091G;
        int i10 = this.f17092H;
        this.f17092H = i10 - 1;
        eVarArr[i10] = null;
        if (p087i7.w.g(obj)) {
            java.lang.Throwable thE = p087i7.w.e(obj);
            p247y7.AbstractC7350t.c(thE);
            obj = p087i7.w.b(p087i7.x.a(p007a7.l.a(thE, eVar)));
        }
        eVar.t(obj);
    }

    @Override // p007a7.e
    public java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
        this.f17093I = 0;
        if (this.f17088D.size() == 0) {
            return obj;
        }
        n(obj);
        if (this.f17092H < 0) {
            return d(eVar);
        }
        throw new java.lang.IllegalStateException("Already started");
    }

    @Override // p007a7.e
    public java.lang.Object c() {
        return this.f17090F;
    }

    @Override // p007a7.e
    public java.lang.Object d(p127m7.e eVar) {
        java.lang.Object objG;
        if (this.f17093I == this.f17088D.size()) {
            objG = c();
        } else {
            j(p137n7.b.d(eVar));
            if (l(true)) {
                k();
                objG = c();
            } else {
                objG = p137n7.b.g();
            }
        }
        if (objG == p137n7.b.g()) {
            p147o7.h.c(eVar);
        }
        return objG;
    }

    @Override // p007a7.e
    public java.lang.Object e(java.lang.Object obj, p127m7.e eVar) {
        n(obj);
        return d(eVar);
    }

    @Override // W8.N
    public p127m7.i getCoroutineContext() {
        return this.f17089E.getContext();
    }

    public final void j(p127m7.e eVar) {
        p247y7.AbstractC7350t.f(eVar, "continuation");
        p127m7.e[] eVarArr = this.f17091G;
        int i6 = this.f17092H + 1;
        this.f17092H = i6;
        eVarArr[i6] = eVar;
    }

    public void n(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "<set-?>");
        this.f17090F = obj;
    }
}
