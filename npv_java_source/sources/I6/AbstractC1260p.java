package I6;

/* JADX INFO: renamed from: I6.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1260p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final fa.d f5230a = Z6.a.a("io.ktor.client.plugins.HttpCallValidator");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final J6.b f5231b = J6.i.b("HttpResponseValidator", I6.AbstractC1260p.a.f5233L, new p237x7.l() { // from class: I6.o
        @Override // p237x7.l
        public final java.lang.Object l(java.lang.Object obj) {
            return I6.AbstractC1260p.b((J6.d) obj);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final W6.C1767a f5232c;

    /* JADX INFO: renamed from: I6.p$a */
    /* synthetic */ class a extends p247y7.C7348q implements p237x7.a {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final I6.AbstractC1260p.a f5233L = new I6.AbstractC1260p.a();

        a() {
            super(0, I6.C1258n.class, "<init>", "<init>()V", 0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final I6.C1258n b() {
            return new I6.C1258n();
        }
    }

    /* JADX INFO: renamed from: I6.p$b */
    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5234G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5235H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ boolean f5236I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z6, p127m7.e eVar) {
            super(2, eVar);
            this.f5236I = z6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean K(boolean z6) {
            return z6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f5234G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            W6.InterfaceC1768b interfaceC1768bD = ((O6.d) this.f5235H).d();
            W6.C1767a c1767aJ = I6.AbstractC1260p.j();
            final boolean z6 = this.f5236I;
            interfaceC1768bD.g(c1767aJ, new p237x7.a() { // from class: I6.q
                @Override // p237x7.a
                public final java.lang.Object b() {
                    return java.lang.Boolean.valueOf(I6.AbstractC1260p.b.K(z6));
                }
            });
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(O6.d dVar, p127m7.e eVar) {
            return ((I6.AbstractC1260p.b) x(dVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            I6.AbstractC1260p.b bVar = new I6.AbstractC1260p.b(this.f5236I, eVar);
            bVar.f5235H = obj;
            return bVar;
        }
    }

    /* JADX INFO: renamed from: I6.p$c */
    static final class c extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5237G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f5238H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5239I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ java.util.List f5240J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(java.util.List list, p127m7.e eVar) {
            super(3, eVar);
            this.f5240J = list;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f5237G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                J6.k.a aVar = (J6.k.a) this.f5238H;
                O6.d dVar = (O6.d) this.f5239I;
                this.f5238H = null;
                this.f5237G = 1;
                obj = aVar.a(dVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    if (i6 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    D6.b bVar = (D6.b) this.f5238H;
                    p087i7.x.b(obj);
                    return bVar;
                }
                p087i7.x.b(obj);
            }
            D6.b bVar2 = (D6.b) obj;
            java.util.List list = this.f5240J;
            Q6.c cVarE = bVar2.e();
            this.f5238H = bVar2;
            this.f5237G = 2;
            return I6.AbstractC1260p.d(list, cVarE, this) == objG ? objG : bVar2;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(J6.k.a aVar, O6.d dVar, p127m7.e eVar) {
            I6.AbstractC1260p.c cVar = new I6.AbstractC1260p.c(this.f5240J, eVar);
            cVar.f5238H = aVar;
            cVar.f5239I = dVar;
            return cVar.B(p087i7.M.f46721a);
        }
    }

    /* JADX INFO: renamed from: I6.p$d */
    static final class d extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5241G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5242H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5243I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ java.util.List f5244J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(java.util.List list, p127m7.e eVar) {
            super(3, eVar);
            this.f5244J = list;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f5241G;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Throwable th = (java.lang.Throwable) this.f5242H;
                p087i7.x.b(obj);
                return th;
            }
            p087i7.x.b(obj);
            O6.b bVar = (O6.b) this.f5242H;
            java.lang.Throwable thA = R6.c.a((java.lang.Throwable) this.f5243I);
            java.util.List list = this.f5244J;
            this.f5242H = thA;
            this.f5241G = 1;
            return I6.AbstractC1260p.c(list, thA, bVar, this) == objG ? objG : thA;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(O6.b bVar, java.lang.Throwable th, p127m7.e eVar) {
            I6.AbstractC1260p.d dVar = new I6.AbstractC1260p.d(this.f5244J, eVar);
            dVar.f5242H = bVar;
            dVar.f5243I = th;
            return dVar.B(p087i7.M.f46721a);
        }
    }

    /* JADX INFO: renamed from: I6.p$e */
    static final class e extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5245G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5246H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5247I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ java.util.List f5248J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(java.util.List list, p127m7.e eVar) {
            super(3, eVar);
            this.f5248J = list;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f5245G;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Throwable th = (java.lang.Throwable) this.f5246H;
                p087i7.x.b(obj);
                return th;
            }
            p087i7.x.b(obj);
            O6.b bVar = (O6.b) this.f5246H;
            java.lang.Throwable thA = R6.c.a((java.lang.Throwable) this.f5247I);
            java.util.List list = this.f5248J;
            this.f5246H = thA;
            this.f5245G = 1;
            return I6.AbstractC1260p.c(list, thA, bVar, this) == objG ? objG : thA;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(O6.b bVar, java.lang.Throwable th, p127m7.e eVar) {
            I6.AbstractC1260p.e eVar2 = new I6.AbstractC1260p.e(this.f5248J, eVar);
            eVar2.f5246H = bVar;
            eVar2.f5247I = th;
            return eVar2.B(p087i7.M.f46721a);
        }
    }

    /* JADX INFO: renamed from: I6.p$f */
    static final class f extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f5249F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f5250G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f5251H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5252I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f5253J;

        f(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f5252I = obj;
            this.f5253J |= Integer.MIN_VALUE;
            return I6.AbstractC1260p.c(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: I6.p$g */
    static final class g extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f5254F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f5255G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5256H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f5257I;

        g(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f5256H = obj;
            this.f5257I |= Integer.MIN_VALUE;
            return I6.AbstractC1260p.d(null, null, this);
        }
    }

    /* JADX INFO: renamed from: I6.p$h */
    public static final class h implements O6.b {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final T6.A f5258C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final T6.g0 f5259D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final W6.InterfaceC1768b f5260E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private final T6.InterfaceC1668p f5261F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ O6.d f5262G;

        h(O6.d dVar) {
            this.f5262G = dVar;
            this.f5258C = dVar.i();
            this.f5259D = dVar.j().b();
            this.f5260E = dVar.d();
            this.f5261F = dVar.a().q();
        }

        @Override // O6.b
        public D6.b H0() {
            throw new java.lang.IllegalStateException("Call is not initialized".toString());
        }

        @Override // T6.InterfaceC1675x
        public T6.InterfaceC1668p a() {
            return this.f5261F;
        }

        @Override // O6.b, W8.N
        public p127m7.i getCoroutineContext() {
            return O6.b.a.a(this);
        }

        @Override // O6.b
        public T6.g0 r() {
            return this.f5259D;
        }

        @Override // O6.b
        public T6.A u0() {
            return this.f5258C;
        }

        @Override // O6.b
        public W6.InterfaceC1768b x0() {
            return this.f5260E;
        }
    }

    static {
        F7.o oVarP;
        F7.c cVarB = p247y7.P.b(java.lang.Boolean.class);
        try {
            oVarP = p247y7.P.p(java.lang.Boolean.TYPE);
        } catch (java.lang.Throwable unused) {
            oVarP = null;
        }
        f5232c = new W6.C1767a("ExpectSuccessAttributeKey", new p017b7.a(cVarB, oVarP));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M b(J6.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "$this$createClientPlugin");
        java.util.List listE0 = p097j7.AbstractC6879v.E0(((I6.C1258n) dVar.e()).c());
        java.util.List listE1 = p097j7.AbstractC6879v.E0(((I6.C1258n) dVar.e()).b());
        dVar.f(J6.l.f5750a, new I6.AbstractC1260p.b(((I6.C1258n) dVar.e()).a(), null));
        dVar.f(J6.k.f5742a, new I6.AbstractC1260p.c(listE0, null));
        dVar.f(I6.N.f5153a, new I6.AbstractC1260p.d(listE1, null));
        dVar.f(I6.K.f5143a, new I6.AbstractC1260p.e(listE1, null));
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object c(java.util.List list, java.lang.Throwable th, O6.b bVar, p127m7.e eVar) {
        I6.AbstractC1260p.f fVar;
        java.util.Iterator it;
        if (eVar instanceof I6.AbstractC1260p.f) {
            fVar = (I6.AbstractC1260p.f) eVar;
            int i6 = fVar.f5253J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                fVar.f5253J = i6 - Integer.MIN_VALUE;
            } else {
                fVar = new I6.AbstractC1260p.f(eVar);
            }
        } else {
            fVar = new I6.AbstractC1260p.f(eVar);
        }
        java.lang.Object obj = fVar.f5252I;
        p137n7.b.g();
        int i10 = fVar.f5253J;
        if (i10 == 0) {
            p087i7.x.b(obj);
            f5230a.g("Processing exception " + th + " for request " + bVar.r());
            it = list.iterator();
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) fVar.f5251H;
            p087i7.x.b(obj);
        }
        if (!it.hasNext()) {
            return p087i7.M.f46721a;
        }
        androidx.appcompat.app.D.a(it.next());
        throw new p087i7.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object d(java.util.List list, Q6.c cVar, p127m7.e eVar) {
        I6.AbstractC1260p.g gVar;
        java.util.Iterator it;
        if (eVar instanceof I6.AbstractC1260p.g) {
            gVar = (I6.AbstractC1260p.g) eVar;
            int i6 = gVar.f5257I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                gVar.f5257I = i6 - Integer.MIN_VALUE;
            } else {
                gVar = new I6.AbstractC1260p.g(eVar);
            }
        } else {
            gVar = new I6.AbstractC1260p.g(eVar);
        }
        java.lang.Object obj = gVar.f5256H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = gVar.f5257I;
        if (i10 == 0) {
            p087i7.x.b(obj);
            f5230a.g("Validating response for request " + cVar.H0().d().r());
            it = list.iterator();
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) gVar.f5255G;
            cVar = (Q6.c) gVar.f5254F;
            p087i7.x.b(obj);
        }
        while (it.hasNext()) {
            p237x7.p pVar = (p237x7.p) it.next();
            gVar.f5254F = cVar;
            gVar.f5255G = it;
            gVar.f5257I = 1;
            if (pVar.u(cVar, gVar) == objG) {
                return objG;
            }
        }
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O6.b e(O6.d dVar) {
        return new I6.AbstractC1260p.h(dVar);
    }

    public static final void f(C6.j jVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(jVar, "<this>");
        p247y7.AbstractC7350t.f(lVar, "block");
        jVar.o(f5231b, lVar);
    }

    public static final W6.C1767a j() {
        return f5232c;
    }

    public static final J6.b k() {
        return f5231b;
    }
}
