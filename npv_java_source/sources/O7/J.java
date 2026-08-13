package O7;

/* JADX INFO: loaded from: classes2.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E8.n f8117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O7.G f8118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E8.g f8119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E8.g f8120d;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p138n8.b f8121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.util.List f8122b;

        public a(p138n8.b bVar, java.util.List list) {
            p247y7.AbstractC7350t.f(bVar, "classId");
            p247y7.AbstractC7350t.f(list, "typeParametersCount");
            this.f8121a = bVar;
            this.f8122b = list;
        }

        public final p138n8.b a() {
            return this.f8121a;
        }

        public final java.util.List b() {
            return this.f8122b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof O7.J.a)) {
                return false;
            }
            O7.J.a aVar = (O7.J.a) obj;
            return p247y7.AbstractC7350t.b(this.f8121a, aVar.f8121a) && p247y7.AbstractC7350t.b(this.f8122b, aVar.f8122b);
        }

        public int hashCode() {
            return (this.f8121a.hashCode() * 31) + this.f8122b.hashCode();
        }

        public java.lang.String toString() {
            return "ClassRequest(classId=" + this.f8121a + ", typeParametersCount=" + this.f8122b + ')';
        }
    }

    public static final class b extends R7.AbstractC1501g {

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private final boolean f8123K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private final java.util.List f8124L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private final F8.C0950k f8125M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(E8.n nVar, O7.InterfaceC1432m interfaceC1432m, p138n8.f fVar, boolean z6, int i6) {
            super(nVar, interfaceC1432m, fVar, O7.a0.f8143a, false);
            p247y7.AbstractC7350t.f(nVar, "storageManager");
            p247y7.AbstractC7350t.f(interfaceC1432m, "container");
            p247y7.AbstractC7350t.f(fVar, "name");
            this.f8123K = z6;
            E7.i iVarQ = E7.j.q(0, i6);
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(iVarQ, 10));
            java.util.Iterator it = iVarQ.iterator();
            while (it.hasNext()) {
                int iB = ((p097j7.O) it).b();
                P7.g gVarB = P7.g.f8385d.b();
                F8.u0 u0Var = F8.u0.INVARIANT;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append('T');
                sb.append(iB);
                arrayList.add(R7.K.a1(this, gVarB, false, u0Var, p138n8.f.o(sb.toString()), iB, nVar));
            }
            this.f8124L = arrayList;
            this.f8125M = new F8.C0950k(this, O7.g0.d(this), p097j7.Z.c(p218v8.c.p(this).t().i()), nVar);
        }

        @Override // O7.InterfaceC1424e, O7.InterfaceC1428i
        public java.util.List A() {
            return this.f8124L;
        }

        @Override // R7.AbstractC1501g, O7.C
        public boolean C() {
            return false;
        }

        @Override // O7.InterfaceC1424e
        public boolean E() {
            return false;
        }

        @Override // O7.InterfaceC1424e
        public boolean I() {
            return false;
        }

        @Override // O7.InterfaceC1424e
        public O7.h0 I0() {
            return null;
        }

        @Override // O7.C
        public boolean N0() {
            return false;
        }

        @Override // O7.InterfaceC1424e
        public java.util.Collection O() {
            return p097j7.AbstractC6879v.m();
        }

        @Override // O7.InterfaceC1424e
        public boolean P() {
            return false;
        }

        @Override // O7.C
        public boolean R() {
            return false;
        }

        @Override // O7.InterfaceC1424e
        public boolean R0() {
            return false;
        }

        @Override // O7.InterfaceC1428i
        public boolean S() {
            return this.f8123K;
        }

        @Override // O7.InterfaceC1424e
        /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
        public y8.h.b Y() {
            return y8.h.b.f57356b;
        }

        @Override // O7.InterfaceC1427h
        /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
        public F8.C0950k p() {
            return this.f8125M;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // R7.t
        /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
        public y8.h.b Q(G8.g gVar) {
            p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
            return y8.h.b.f57356b;
        }

        @Override // O7.InterfaceC1424e
        public O7.InterfaceC1423d X() {
            return null;
        }

        @Override // O7.InterfaceC1424e
        public O7.InterfaceC1424e a0() {
            return null;
        }

        @Override // O7.InterfaceC1424e, O7.InterfaceC1436q, O7.C
        public O7.AbstractC1439u h() {
            O7.AbstractC1439u abstractC1439u = O7.AbstractC1438t.f8186e;
            p247y7.AbstractC7350t.e(abstractC1439u, "PUBLIC");
            return abstractC1439u;
        }

        @Override // O7.InterfaceC1424e
        public O7.EnumC1425f j() {
            return O7.EnumC1425f.CLASS;
        }

        @Override // P7.a
        public P7.g k() {
            return P7.g.f8385d.b();
        }

        @Override // O7.InterfaceC1424e
        public boolean m() {
            return false;
        }

        @Override // O7.InterfaceC1424e, O7.C
        public O7.D q() {
            return O7.D.FINAL;
        }

        @Override // O7.InterfaceC1424e
        public java.util.Collection r() {
            return p097j7.Z.d();
        }

        public java.lang.String toString() {
            return "class " + getName() + " (not found)";
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {
        c() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O7.InterfaceC1424e l(O7.J.a aVar) {
            O7.InterfaceC1432m interfaceC1432mD;
            p247y7.AbstractC7350t.f(aVar, "<name for destructuring parameter 0>");
            p138n8.b bVarA = aVar.a();
            java.util.List listB = aVar.b();
            if (bVarA.k()) {
                throw new java.lang.UnsupportedOperationException("Unresolved local class: " + bVarA);
            }
            p138n8.b bVarG = bVarA.g();
            if (bVarG == null || (interfaceC1432mD = O7.J.this.d(bVarG, p097j7.AbstractC6879v.c0(listB, 1))) == null) {
                E8.g gVar = O7.J.this.f8119c;
                p138n8.c cVarH = bVarA.h();
                p247y7.AbstractC7350t.e(cVarH, "getPackageFqName(...)");
                interfaceC1432mD = (O7.InterfaceC1426g) gVar.l(cVarH);
            }
            O7.InterfaceC1432m interfaceC1432m = interfaceC1432mD;
            boolean zL = bVarA.l();
            E8.n nVar = O7.J.this.f8117a;
            p138n8.f fVarJ = bVarA.j();
            p247y7.AbstractC7350t.e(fVarJ, "getShortClassName(...)");
            java.lang.Integer num = (java.lang.Integer) p097j7.AbstractC6879v.k0(listB);
            return new O7.J.b(nVar, interfaceC1432m, fVarJ, zL, num != null ? num.intValue() : 0);
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {
        d() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O7.K l(p138n8.c cVar) {
            p247y7.AbstractC7350t.f(cVar, "fqName");
            return new R7.C1507m(O7.J.this.f8118b, cVar);
        }
    }

    public J(E8.n nVar, O7.G g6) {
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(g6, "module");
        this.f8117a = nVar;
        this.f8118b = g6;
        this.f8119c = nVar.b(new O7.J.d());
        this.f8120d = nVar.b(new O7.J.c());
    }

    public final O7.InterfaceC1424e d(p138n8.b bVar, java.util.List list) {
        p247y7.AbstractC7350t.f(bVar, "classId");
        p247y7.AbstractC7350t.f(list, "typeParametersCount");
        return (O7.InterfaceC1424e) this.f8120d.l(new O7.J.a(bVar, list));
    }
}
