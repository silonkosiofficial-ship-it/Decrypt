package B8;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B8.i.b f870c = new B8.i.b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.Set f871d = p097j7.Z.c(p138n8.b.m(L7.j.a.f6371d.l()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B8.k f872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f873b;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p138n8.b f874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final B8.C0826g f875b;

        public a(p138n8.b bVar, B8.C0826g c0826g) {
            p247y7.AbstractC7350t.f(bVar, "classId");
            this.f874a = bVar;
            this.f875b = c0826g;
        }

        public final B8.C0826g a() {
            return this.f875b;
        }

        public final p138n8.b b() {
            return this.f874a;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof B8.i.a) && p247y7.AbstractC7350t.b(this.f874a, ((B8.i.a) obj).f874a);
        }

        public int hashCode() {
            return this.f874a.hashCode();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final java.util.Set a() {
            return B8.i.f871d;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {
        c() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O7.InterfaceC1424e l(B8.i.a aVar) {
            p247y7.AbstractC7350t.f(aVar, "key");
            return B8.i.this.c(aVar);
        }
    }

    public i(B8.k kVar) {
        p247y7.AbstractC7350t.f(kVar, "components");
        this.f872a = kVar;
        this.f873b = kVar.u().h(new B8.i.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final O7.InterfaceC1424e c(B8.i.a aVar) {
        java.lang.Object next;
        B8.m mVarA;
        O7.K k6;
        p138n8.f fVarJ;
        p138n8.b bVarB = aVar.b();
        java.util.Iterator it = this.f872a.l().iterator();
        while (it.hasNext()) {
            O7.InterfaceC1424e interfaceC1424eC = ((Q7.b) it.next()).c(bVarB);
            if (interfaceC1424eC != null) {
                return interfaceC1424eC;
            }
        }
        if (f871d.contains(bVarB)) {
            return null;
        }
        B8.C0826g c0826gA = aVar.a();
        if (c0826gA == null && (c0826gA = this.f872a.e().a(bVarB)) == null) {
            return null;
        }
        p108k8.c cVarA = c0826gA.a();
        p088i8.c cVarB = c0826gA.b();
        p108k8.a aVarC = c0826gA.c();
        O7.a0 a0VarD = c0826gA.d();
        p138n8.b bVarG = bVarB.g();
        if (bVarG != null) {
            O7.InterfaceC1424e interfaceC1424eE = e(this, bVarG, null, 2, null);
            D8.d dVar = interfaceC1424eE instanceof D8.d ? (D8.d) interfaceC1424eE : null;
            if (dVar == null) {
                return null;
            }
            p138n8.f fVarJ2 = bVarB.j();
            p247y7.AbstractC7350t.e(fVarJ2, "getShortClassName(...)");
            if (!dVar.p1(fVarJ2)) {
                return null;
            }
            mVarA = dVar.i1();
        } else {
            O7.L lS = this.f872a.s();
            p138n8.c cVarH = bVarB.h();
            p247y7.AbstractC7350t.e(cVarH, "getPackageFqName(...)");
            java.util.Iterator it2 = O7.N.c(lS, cVarH).iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                k6 = (O7.K) next;
                if (!(k6 instanceof B8.o)) {
                    break;
                }
                fVarJ = bVarB.j();
                p247y7.AbstractC7350t.e(fVarJ, "getShortClassName(...)");
            } while (!((B8.o) k6).T0(fVarJ));
            O7.K k10 = (O7.K) next;
            if (k10 == null) {
                return null;
            }
            B8.k kVar = this.f872a;
            p088i8.t tVarI1 = cVarB.i1();
            p247y7.AbstractC7350t.e(tVarI1, "getTypeTable(...)");
            p108k8.g gVar = new p108k8.g(tVarI1);
            k8.h.a aVar2 = p108k8.h.f49817b;
            p088i8.w wVarK1 = cVarB.k1();
            p247y7.AbstractC7350t.e(wVarK1, "getVersionRequirementTable(...)");
            mVarA = kVar.a(k10, cVarA, gVar, aVar2.a(wVarK1), aVarC, null);
        }
        return new D8.d(mVarA, cVarB, cVarA, aVarC, a0VarD);
    }

    public static /* synthetic */ O7.InterfaceC1424e e(B8.i iVar, p138n8.b bVar, B8.C0826g c0826g, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            c0826g = null;
        }
        return iVar.d(bVar, c0826g);
    }

    public final O7.InterfaceC1424e d(p138n8.b bVar, B8.C0826g c0826g) {
        p247y7.AbstractC7350t.f(bVar, "classId");
        return (O7.InterfaceC1424e) this.f873b.l(new B8.i.a(bVar, c0826g));
    }
}
