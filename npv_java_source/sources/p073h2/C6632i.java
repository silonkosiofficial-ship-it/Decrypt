package p073h2;

/* JADX INFO: renamed from: h2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C6632i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p073h2.C6633j f46153a = new p073h2.C6633j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p059f9.a f46154b = p059f9.g.b(false, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46155c = -1;

    /* JADX INFO: renamed from: h2.i$a */
    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f46156F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f46157G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f46158H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f46160J;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f46158H = obj;
            this.f46160J |= Integer.MIN_VALUE;
            return p073h2.C6632i.this.b(this);
        }
    }

    /* JADX INFO: renamed from: h2.i$b */
    static final class b extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f46161F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f46162G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f46163H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f46164I;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        int f46166K;

        b(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f46164I = obj;
            this.f46166K |= Integer.MIN_VALUE;
            return p073h2.C6632i.this.c(null, this);
        }
    }

    public final p073h2.AbstractC6646x.b a() {
        p073h2.AbstractC6646x abstractC6646x = (p073h2.AbstractC6646x) p097j7.AbstractC6879v.k0(this.f46153a.b());
        if (abstractC6646x == null || !(abstractC6646x instanceof p073h2.AbstractC6646x.b)) {
            return null;
        }
        p073h2.AbstractC6646x.b bVar = (p073h2.AbstractC6646x.b) abstractC6646x;
        if (bVar.f() == p073h2.EnumC6642t.REFRESH) {
            return bVar;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(p127m7.e eVar) {
        p073h2.C6632i.a aVar;
        p073h2.C6632i c6632i;
        p059f9.a aVar2;
        if (eVar instanceof p073h2.C6632i.a) {
            aVar = (p073h2.C6632i.a) eVar;
            int i6 = aVar.f46160J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f46160J = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new p073h2.C6632i.a(eVar);
            }
        } else {
            aVar = new p073h2.C6632i.a(eVar);
        }
        java.lang.Object obj = aVar.f46158H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f46160J;
        if (i10 == 0) {
            p087i7.x.b(obj);
            p059f9.a aVar3 = this.f46154b;
            aVar.f46156F = this;
            aVar.f46157G = aVar3;
            aVar.f46160J = 1;
            if (aVar3.c(null, aVar) == objG) {
                return objG;
            }
            c6632i = this;
            aVar2 = aVar3;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (p059f9.a) aVar.f46157G;
            c6632i = (p073h2.C6632i) aVar.f46156F;
            p087i7.x.b(obj);
        }
        try {
            java.util.List listB = c6632i.f46153a.b();
            int size = (c6632i.f46155c - listB.size()) + 1;
            java.util.List list = listB;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            int i11 = 0;
            for (java.lang.Object obj2 : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    p097j7.AbstractC6879v.w();
                }
                arrayList.add(new p097j7.L(i11 + size, (p073h2.AbstractC6646x) obj2));
                i11 = i12;
            }
            return arrayList;
        } finally {
            aVar2.d(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(p097j7.L l6, p127m7.e eVar) {
        p073h2.C6632i.b bVar;
        p059f9.a aVar;
        p073h2.C6632i c6632i;
        if (eVar instanceof p073h2.C6632i.b) {
            bVar = (p073h2.C6632i.b) eVar;
            int i6 = bVar.f46166K;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.f46166K = i6 - Integer.MIN_VALUE;
            } else {
                bVar = new p073h2.C6632i.b(eVar);
            }
        } else {
            bVar = new p073h2.C6632i.b(eVar);
        }
        java.lang.Object obj = bVar.f46164I;
        java.lang.Object objG = p137n7.b.g();
        int i10 = bVar.f46166K;
        if (i10 == 0) {
            p087i7.x.b(obj);
            aVar = this.f46154b;
            bVar.f46161F = this;
            bVar.f46162G = l6;
            bVar.f46163H = aVar;
            bVar.f46166K = 1;
            if (aVar.c(null, bVar) == objG) {
                return objG;
            }
            c6632i = this;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p059f9.a aVar2 = (p059f9.a) bVar.f46163H;
            p097j7.L l10 = (p097j7.L) bVar.f46162G;
            c6632i = (p073h2.C6632i) bVar.f46161F;
            p087i7.x.b(obj);
            aVar = aVar2;
            l6 = l10;
        }
        try {
            c6632i.f46155c = l6.c();
            c6632i.f46153a.a((p073h2.AbstractC6646x) l6.d());
            p087i7.M m6 = p087i7.M.f46721a;
            return p087i7.M.f46721a;
        } finally {
            aVar.d(null);
        }
    }
}
