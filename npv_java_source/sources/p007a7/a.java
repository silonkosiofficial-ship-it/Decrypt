package p007a7;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends p007a7.e {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.List f17061D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p127m7.i f17062E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private java.lang.Object f17063F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f17064G;

    /* JADX INFO: renamed from: a7.a$a, reason: collision with other inner class name */
    static final class C0326a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f17065F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f17066G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f17068I;

        C0326a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f17066G = obj;
            this.f17068I |= Integer.MIN_VALUE;
            return p007a7.a.this.h(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.Object obj, java.util.List list, java.lang.Object obj2, p127m7.i iVar) {
        super(obj);
        p247y7.AbstractC7350t.f(obj, "context");
        p247y7.AbstractC7350t.f(list, "interceptors");
        p247y7.AbstractC7350t.f(obj2, "subject");
        p247y7.AbstractC7350t.f(iVar, "coroutineContext");
        this.f17061D = list;
        this.f17062E = iVar;
        this.f17063F = obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(p127m7.e eVar) {
        p007a7.a.C0326a c0326a;
        p007a7.a aVar;
        p237x7.q qVar;
        java.lang.Object objC;
        if (eVar instanceof p007a7.a.C0326a) {
            c0326a = (p007a7.a.C0326a) eVar;
            int i6 = c0326a.f17068I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0326a.f17068I = i6 - Integer.MIN_VALUE;
            } else {
                c0326a = new p007a7.a.C0326a(eVar);
            }
        } else {
            c0326a = new p007a7.a.C0326a(eVar);
        }
        java.lang.Object obj = c0326a.f17066G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = c0326a.f17068I;
        if (i10 == 0) {
            p087i7.x.b(obj);
            aVar = this;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (p007a7.a) c0326a.f17065F;
            p087i7.x.b(obj);
        }
        do {
            int i11 = aVar.f17064G;
            if (i11 != -1) {
                java.util.List list = aVar.f17061D;
                if (i11 >= list.size()) {
                    aVar.g();
                } else {
                    qVar = (p237x7.q) list.get(i11);
                    aVar.f17064G = i11 + 1;
                    objC = aVar.c();
                    c0326a.f17065F = aVar;
                    c0326a.f17068I = 1;
                }
            }
            return aVar.c();
        } while (qVar.j(aVar, objC, c0326a) != objG);
        return objG;
    }

    @Override // p007a7.e
    public java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
        this.f17064G = 0;
        i(obj);
        return d(eVar);
    }

    @Override // p007a7.e
    public java.lang.Object c() {
        return this.f17063F;
    }

    @Override // p007a7.e
    public java.lang.Object d(p127m7.e eVar) {
        int i6 = this.f17064G;
        if (i6 < 0) {
            return c();
        }
        if (i6 < this.f17061D.size()) {
            return h(eVar);
        }
        g();
        return c();
    }

    @Override // p007a7.e
    public java.lang.Object e(java.lang.Object obj, p127m7.e eVar) {
        i(obj);
        return d(eVar);
    }

    public void g() {
        this.f17064G = -1;
    }

    @Override // W8.N
    public p127m7.i getCoroutineContext() {
        return this.f17062E;
    }

    public void i(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "<set-?>");
        this.f17063F = obj;
    }
}
