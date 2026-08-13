package p198t8;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends p198t8.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t8.p.a f54652b = new t8.p.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p198t8.g a(F8.E e6) {
            p247y7.AbstractC7350t.f(e6, "argumentType");
            if (F8.G.a(e6)) {
                return null;
            }
            F8.E type = e6;
            int i6 = 0;
            while (L7.g.c0(type)) {
                type = ((F8.i0) p097j7.AbstractC6879v.G0(type.U0())).getType();
                p247y7.AbstractC7350t.e(type, "getType(...)");
                i6++;
            }
            O7.InterfaceC1427h interfaceC1427hW = type.W0().w();
            if (interfaceC1427hW instanceof O7.InterfaceC1424e) {
                p138n8.b bVarK = p218v8.c.k(interfaceC1427hW);
                return bVarK == null ? new p198t8.p(new t8.p.b.a(e6)) : new p198t8.p(bVarK, i6);
            }
            if (!(interfaceC1427hW instanceof O7.f0)) {
                return null;
            }
            p138n8.b bVarM = p138n8.b.m(L7.j.a.f6367b.l());
            p247y7.AbstractC7350t.e(bVarM, "topLevel(...)");
            return new p198t8.p(bVarM, 0);
        }
    }

    public static abstract class b {

        public static final class a extends t8.p.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final F8.E f54653a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(F8.E e6) {
                super(null);
                p247y7.AbstractC7350t.f(e6, "type");
                this.f54653a = e6;
            }

            public final F8.E a() {
                return this.f54653a;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof t8.p.b.a) && p247y7.AbstractC7350t.b(this.f54653a, ((t8.p.b.a) obj).f54653a);
            }

            public int hashCode() {
                return this.f54653a.hashCode();
            }

            public java.lang.String toString() {
                return "LocalClass(type=" + this.f54653a + ')';
            }
        }

        /* JADX INFO: renamed from: t8.p$b$b, reason: collision with other inner class name */
        public static final class C0714b extends t8.p.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final p198t8.f f54654a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0714b(p198t8.f fVar) {
                super(null);
                p247y7.AbstractC7350t.f(fVar, "value");
                this.f54654a = fVar;
            }

            public final int a() {
                return this.f54654a.c();
            }

            public final p138n8.b b() {
                return this.f54654a.d();
            }

            public final p198t8.f c() {
                return this.f54654a;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof t8.p.b.C0714b) && p247y7.AbstractC7350t.b(this.f54654a, ((t8.p.b.C0714b) obj).f54654a);
            }

            public int hashCode() {
                return this.f54654a.hashCode();
            }

            public java.lang.String toString() {
                return "NormalClass(value=" + this.f54654a + ')';
            }
        }

        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(p138n8.b bVar, int i6) {
        this(new p198t8.f(bVar, i6));
        p247y7.AbstractC7350t.f(bVar, "classId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(p198t8.f fVar) {
        this(new t8.p.b.C0714b(fVar));
        p247y7.AbstractC7350t.f(fVar, "value");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t8.p.b bVar) {
        super(bVar);
        p247y7.AbstractC7350t.f(bVar, "value");
    }

    @Override // p198t8.g
    public F8.E a(O7.G g6) {
        p247y7.AbstractC7350t.f(g6, "module");
        F8.a0 a0VarI = F8.a0.f2872D.i();
        O7.InterfaceC1424e interfaceC1424eE = g6.t().E();
        p247y7.AbstractC7350t.e(interfaceC1424eE, "getKClass(...)");
        return F8.F.g(a0VarI, interfaceC1424eE, p097j7.AbstractC6879v.e(new F8.k0(c(g6))));
    }

    public final F8.E c(O7.G g6) {
        p247y7.AbstractC7350t.f(g6, "module");
        t8.p.b bVar = (t8.p.b) b();
        if (bVar instanceof t8.p.b.a) {
            return ((t8.p.b.a) b()).a();
        }
        if (!(bVar instanceof t8.p.b.C0714b)) {
            throw new p087i7.s();
        }
        p198t8.f fVarC = ((t8.p.b.C0714b) b()).c();
        p138n8.b bVarA = fVarC.a();
        int iB = fVarC.b();
        O7.InterfaceC1424e interfaceC1424eA = O7.AbstractC1442x.a(g6, bVarA);
        if (interfaceC1424eA == null) {
            H8.j jVar = H8.j.f4454J;
            java.lang.String string = bVarA.toString();
            p247y7.AbstractC7350t.e(string, "toString(...)");
            return H8.k.d(jVar, string, java.lang.String.valueOf(iB));
        }
        F8.M mW = interfaceC1424eA.w();
        p247y7.AbstractC7350t.e(mW, "getDefaultType(...)");
        F8.E eY = K8.a.y(mW);
        for (int i6 = 0; i6 < iB; i6++) {
            eY = g6.t().l(F8.u0.INVARIANT, eY);
            p247y7.AbstractC7350t.e(eY, "getArrayType(...)");
        }
        return eY;
    }
}
