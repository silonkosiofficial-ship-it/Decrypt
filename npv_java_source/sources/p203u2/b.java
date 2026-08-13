package p203u2;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class b {

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        int f55459F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f55460G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f55461H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f55462I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f55463J;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f55462I = obj;
            this.f55463J |= Integer.MIN_VALUE;
            return p203u2.a.d(null, null, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: u2.b$b, reason: collision with other inner class name */
    static final class C0725b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f55464G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f55465H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ java.lang.String f55466I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p143o2.u f55467J;

        /* JADX INFO: renamed from: u2.b$b$a */
        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p143o2.u f55468D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p143o2.u uVar) {
                super(1);
                this.f55468D = uVar;
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Integer l(p243y2.e eVar) {
                p247y7.AbstractC7350t.f(eVar, "stmt");
                this.f55468D.a().l(eVar);
                return java.lang.Integer.valueOf(eVar.p() ? eVar.getInt(0) : 0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0725b(java.lang.String str, p143o2.u uVar, p127m7.e eVar) {
            super(2, eVar);
            this.f55466I = str;
            this.f55467J = uVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f55464G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p143o2.B b6 = (p143o2.B) this.f55465H;
                java.lang.String str = this.f55466I;
                p203u2.b.C0725b.a aVar = new p203u2.b.C0725b.a(this.f55467J);
                this.f55464G = 1;
                obj = b6.b(str, aVar, this);
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
        public final java.lang.Object u(p143o2.B b6, p127m7.e eVar) {
            return ((p203u2.b.C0725b) x(b6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            p203u2.b.C0725b c0725b = new p203u2.b.C0725b(this.f55466I, this.f55467J, eVar);
            c0725b.f55465H = obj;
            return c0725b;
        }
    }

    public static final java.lang.Integer a(p073h2.M m6) {
        p247y7.AbstractC7350t.f(m6, "<this>");
        java.lang.Integer numA = m6.a();
        if (numA != null) {
            return java.lang.Integer.valueOf(java.lang.Math.max(0, numA.intValue() - (m6.b().f45912d / 2)));
        }
        return null;
    }

    public static final int b(h2.L.a aVar, int i6) {
        p247y7.AbstractC7350t.f(aVar, "params");
        return (!(aVar instanceof h2.L.a.c) || i6 >= aVar.b()) ? aVar.b() : i6;
    }

    public static final int c(h2.L.a aVar, int i6, int i10) {
        p247y7.AbstractC7350t.f(aVar, "params");
        if (aVar instanceof h2.L.a.c) {
            if (i6 < aVar.b()) {
                return 0;
            }
            return i6 - aVar.b();
        }
        if (aVar instanceof h2.L.a.C0531a) {
            return i6;
        }
        if (aVar instanceof h2.L.a.d) {
            return i6 >= i10 ? java.lang.Math.max(0, i10 - aVar.b()) : i6;
        }
        throw new p087i7.s();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object d(h2.L.a aVar, p143o2.u uVar, int i6, p237x7.q qVar, p127m7.e eVar) {
        u2.b.a aVar2;
        int i10;
        int i11;
        if (eVar instanceof u2.b.a) {
            aVar2 = (u2.b.a) eVar;
            int i12 = aVar2.f55463J;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar2.f55463J = i12 - Integer.MIN_VALUE;
            } else {
                aVar2 = new u2.b.a(eVar);
            }
        } else {
            aVar2 = new u2.b.a(eVar);
        }
        java.lang.Object objJ = aVar2.f55462I;
        java.lang.Object objG = p137n7.b.g();
        int i13 = aVar2.f55463J;
        if (i13 == 0) {
            p087i7.x.b(objJ);
            java.lang.Integer num = (java.lang.Integer) aVar.a();
            int iIntValue = num != null ? num.intValue() : 0;
            int iB = p203u2.a.b(aVar, iIntValue);
            int iC = p203u2.a.c(aVar, iIntValue, i6);
            int i14 = iB + iC > i6 ? i6 - iC : iB;
            java.lang.Object uVar2 = new p143o2.u("SELECT * FROM ( " + uVar.b() + " ) LIMIT " + iB + " OFFSET " + iC, uVar.a());
            java.lang.Object objC = p147o7.b.c(i14);
            aVar2.f55459F = i6;
            aVar2.f55460G = iB;
            aVar2.f55461H = iC;
            aVar2.f55463J = 1;
            objJ = qVar.j(uVar2, objC, aVar2);
            if (objJ == objG) {
                return objG;
            }
            i10 = iC;
            i11 = iB;
        } else {
            if (i13 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i15 = aVar2.f55461H;
            i11 = aVar2.f55460G;
            i6 = aVar2.f55459F;
            p087i7.x.b(objJ);
            i10 = i15;
        }
        java.util.List list = (java.util.List) objJ;
        int size = list.size() + i10;
        return new h2.L.b.c(list, (i10 <= 0 || list.isEmpty()) ? null : p147o7.b.c(i10), (list.isEmpty() || list.size() < i11 || size >= i6) ? null : p147o7.b.c(size), i10, java.lang.Math.max(0, i6 - size));
    }

    public static final java.lang.Object e(p143o2.u uVar, p143o2.n nVar, p127m7.e eVar) {
        return p143o2.o.a(nVar, new p203u2.b.C0725b("SELECT COUNT(*) FROM ( " + uVar.b() + " )", uVar, null), eVar);
    }
}
