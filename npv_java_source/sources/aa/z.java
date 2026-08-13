package aa;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z {

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        /* synthetic */ java.lang.Object f17342F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f17343G;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f17342F = obj;
            this.f17343G |= Integer.MIN_VALUE;
            return aa.z.e(null, null, null, this);
        }
    }

    static final class b extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f17344F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f17345G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f17346H;

        b(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f17345G = obj;
            this.f17346H |= Integer.MIN_VALUE;
            return aa.z.f(null, null, null, null, this);
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final aa.z.c f17347D = new aa.z.c();

        c() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.String b() {
            return "";
        }
    }

    static final class d extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f17348G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f17349H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ aa.y f17350I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ aa.r f17351J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(aa.y yVar, aa.r rVar, p127m7.e eVar) {
            super(2, eVar);
            this.f17350I = yVar;
            this.f17351J = rVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f17348G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                aa.n nVar = (aa.n) this.f17349H;
                aa.y yVar = this.f17350I;
                aa.r rVar = this.f17351J;
                this.f17348G = 1;
                obj = aa.z.e(yVar, rVar, nVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return obj;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(aa.n nVar, p127m7.e eVar) {
            return ((aa.z.d) x(nVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            aa.z.d dVar = new aa.z.d(this.f17350I, this.f17351J, eVar);
            dVar.f17349H = obj;
            return dVar;
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final aa.z.e f17352D = new aa.z.e();

        e() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.String b() {
            return "";
        }
    }

    static final class f extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f17353G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f17354H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ aa.y f17355I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ java.util.List f17356J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ aa.r f17357K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(aa.y yVar, java.util.List list, aa.r rVar, p127m7.e eVar) {
            super(2, eVar);
            this.f17355I = yVar;
            this.f17356J = list;
            this.f17357K = rVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f17353G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                aa.n nVar = (aa.n) this.f17354H;
                aa.y yVar = this.f17355I;
                java.util.List list = this.f17356J;
                aa.r rVar = this.f17357K;
                this.f17353G = 1;
                obj = aa.z.f(yVar, list, rVar, nVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return obj;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(aa.n nVar, p127m7.e eVar) {
            return ((aa.z.f) x(nVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            aa.z.f fVar = new aa.z.f(this.f17355I, this.f17356J, this.f17357K, eVar);
            fVar.f17354H = obj;
            return fVar;
        }
    }

    public static final java.lang.Object c(aa.y yVar, p127m7.e eVar) {
        return e(yVar, aa.s.a(), aa.o.g(), eVar);
    }

    public static final java.lang.Object d(aa.y yVar, java.lang.Object[] objArr, p127m7.e eVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            arrayList.add(obj.toString());
        }
        return f(yVar, arrayList, aa.s.a(), aa.o.g(), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object e(aa.y yVar, aa.r rVar, aa.n nVar, p127m7.e eVar) {
        aa.z.a aVar;
        if (eVar instanceof aa.z.a) {
            aVar = (aa.z.a) eVar;
            int i6 = aVar.f17343G;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f17343G = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new aa.z.a(eVar);
            }
        } else {
            aVar = new aa.z.a(eVar);
        }
        java.lang.Object objG = aVar.f17342F;
        java.lang.Object objG2 = p137n7.b.g();
        int i10 = aVar.f17343G;
        if (i10 == 0) {
            p087i7.x.b(objG);
            aa.q qVarF = aa.o.f(yVar, nVar);
            aVar.f17343G = 1;
            objG = aa.A.g(qVarF, rVar, aVar);
            if (objG == objG2) {
                return objG2;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(objG);
        }
        p247y7.AbstractC7350t.d(objG, "null cannot be cast to non-null type org.jetbrains.compose.resources.StringItem.Value");
        return ((aa.x) objG).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object f(aa.y yVar, java.util.List list, aa.r rVar, aa.n nVar, p127m7.e eVar) {
        aa.z.b bVar;
        if (eVar instanceof aa.z.b) {
            bVar = (aa.z.b) eVar;
            int i6 = bVar.f17346H;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.f17346H = i6 - Integer.MIN_VALUE;
            } else {
                bVar = new aa.z.b(eVar);
            }
        } else {
            bVar = new aa.z.b(eVar);
        }
        java.lang.Object objE = bVar.f17345G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = bVar.f17346H;
        if (i10 == 0) {
            p087i7.x.b(objE);
            bVar.f17344F = list;
            bVar.f17346H = 1;
            objE = e(yVar, rVar, nVar, bVar);
            if (objE == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) bVar.f17344F;
            p087i7.x.b(objE);
        }
        return aa.A.h((java.lang.String) objE, list);
    }

    public static final java.lang.String g(aa.y yVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        p247y7.AbstractC7350t.f(yVar, "resource");
        interfaceC1734n.T(-1520244580);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1520244580, i6, -1, "org.jetbrains.compose.resources.stringResource (StringResources.kt:24)");
        }
        java.lang.String strI = i(aa.u.c(yVar, aa.z.c.f17347D, new aa.z.d(yVar, aa.t.a(aa.s.b(), interfaceC1734n, 6), null), interfaceC1734n, (i6 & 14) | 560));
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        interfaceC1734n.J();
        return strI;
    }

    public static final java.lang.String h(aa.y yVar, java.lang.Object[] objArr, V.InterfaceC1734n interfaceC1734n, int i6) {
        p247y7.AbstractC7350t.f(yVar, "resource");
        p247y7.AbstractC7350t.f(objArr, "formatArgs");
        interfaceC1734n.T(-217376913);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-217376913, i6, -1, "org.jetbrains.compose.resources.stringResource (StringResources.kt:76)");
        }
        aa.r rVarA = aa.t.a(aa.s.b(), interfaceC1734n, 6);
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            arrayList.add(obj.toString());
        }
        java.lang.String strJ = j(aa.u.b(yVar, arrayList, aa.z.e.f17352D, new aa.z.f(yVar, arrayList, rVarA, null), interfaceC1734n, (i6 & 14) | 4544));
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        interfaceC1734n.J();
        return strJ;
    }

    private static final java.lang.String i(V.G1 g6) {
        return (java.lang.String) g6.getValue();
    }

    private static final java.lang.String j(V.G1 g6) {
        return (java.lang.String) g6.getValue();
    }
}
