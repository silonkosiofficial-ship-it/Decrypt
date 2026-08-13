package I7;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends I7.AbstractC1278n {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.lang.Class f5480F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f5481G;

    private final class a extends I7.AbstractC1278n.b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final /* synthetic */ F7.k[] f5482j = {p247y7.P.j(new p247y7.G(p247y7.P.b(I7.t.a.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), p247y7.P.j(new p247y7.G(p247y7.P.b(I7.t.a.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), p247y7.P.j(new p247y7.G(p247y7.P.b(I7.t.a.class), "members", "getMembers()Ljava/util/Collection;"))};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final I7.F.a f5483d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final I7.F.a f5484e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final p087i7.InterfaceC6668n f5485f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final p087i7.InterfaceC6668n f5486g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final I7.F.a f5487h;

        /* JADX INFO: renamed from: I7.t$a$a, reason: collision with other inner class name */
        static final class C0129a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ I7.t f5489D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0129a(I7.t tVar) {
                super(0);
                this.f5489D = tVar;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final T7.f b() {
                return T7.f.f13299c.a(this.f5489D.e());
            }
        }

        static final class b extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ I7.t f5490D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ I7.t.a f5491E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(I7.t tVar, I7.t.a aVar) {
                super(0);
                this.f5490D = tVar;
                this.f5491E = aVar;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.util.Collection b() {
                return this.f5490D.u(this.f5491E.f(), I7.AbstractC1278n.c.DECLARED);
            }
        }

        static final class c extends p247y7.AbstractC7352v implements p237x7.a {
            c() {
                super(0);
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p087i7.A b() {
                p078h8.a aVarB;
                T7.f fVarC = I7.t.a.this.c();
                if (fVarC == null || (aVarB = fVarC.b()) == null) {
                    return null;
                }
                java.lang.String[] strArrA = aVarB.a();
                java.lang.String[] strArrG = aVarB.g();
                if (strArrA == null || strArrG == null) {
                    return null;
                }
                p087i7.u uVarM = p128m8.i.m(strArrA, strArrG);
                return new p087i7.A((p128m8.f) uVarM.a(), (p088i8.l) uVarM.b(), aVarB.d());
            }
        }

        static final class d extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ I7.t f5494E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(I7.t tVar) {
                super(0);
                this.f5494E = tVar;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Class b() {
                p078h8.a aVarB;
                T7.f fVarC = I7.t.a.this.c();
                java.lang.String strE = (fVarC == null || (aVarB = fVarC.b()) == null) ? null : aVarB.e();
                if (strE == null || strE.length() <= 0) {
                    return null;
                }
                return this.f5494E.e().getClassLoader().loadClass(S8.r.Q(strE, '/', '.', false, 4, null));
            }
        }

        static final class e extends p247y7.AbstractC7352v implements p237x7.a {
            e() {
                super(0);
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p248y8.h b() {
                T7.f fVarC = I7.t.a.this.c();
                return fVarC != null ? I7.t.a.this.a().c().a(fVarC) : y8.h.b.f57356b;
            }
        }

        public a() {
            super();
            this.f5483d = I7.F.c(new I7.t.a.C0129a(I7.t.this));
            this.f5484e = I7.F.c(new I7.t.a.e());
            p087i7.r rVar = p087i7.r.PUBLICATION;
            this.f5485f = p087i7.AbstractC6669o.a(rVar, new I7.t.a.d(I7.t.this));
            this.f5486g = p087i7.AbstractC6669o.a(rVar, new I7.t.a.c());
            this.f5487h = I7.F.c(new I7.t.a.b(I7.t.this, this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final T7.f c() {
            return (T7.f) this.f5483d.e(this, f5482j[0]);
        }

        public final p087i7.A d() {
            return (p087i7.A) this.f5486g.getValue();
        }

        public final java.lang.Class e() {
            return (java.lang.Class) this.f5485f.getValue();
        }

        public final p248y8.h f() {
            java.lang.Object objE = this.f5484e.e(this, f5482j[1]);
            p247y7.AbstractC7350t.e(objE, "getValue(...)");
            return (p248y8.h) objE;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I7.t.a b() {
            return I7.t.this.new a();
        }
    }

    /* synthetic */ class c extends p247y7.AbstractC7347p implements p237x7.p {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final I7.t.c f5497L = new I7.t.c();

        c() {
            super(2);
        }

        @Override // p247y7.AbstractC7337f, F7.b
        public final java.lang.String getName() {
            return "loadProperty";
        }

        @Override // p247y7.AbstractC7337f
        public final F7.e k() {
            return p247y7.P.b(B8.x.class);
        }

        @Override // p247y7.AbstractC7337f
        public final java.lang.String n() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final O7.U u(B8.x xVar, p088i8.n nVar) {
            p247y7.AbstractC7350t.f(xVar, "p0");
            p247y7.AbstractC7350t.f(nVar, "p1");
            return xVar.l(nVar);
        }
    }

    public t(java.lang.Class cls) {
        p247y7.AbstractC7350t.f(cls, "jClass");
        this.f5480F = cls;
        this.f5481G = p087i7.AbstractC6669o.a(p087i7.r.PUBLICATION, new I7.t.b());
    }

    private final p248y8.h D() {
        return ((I7.t.a) this.f5481G.getValue()).f();
    }

    @Override // p247y7.InterfaceC7339h
    public java.lang.Class e() {
        return this.f5480F;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof I7.t) && p247y7.AbstractC7350t.b(e(), ((I7.t) obj).e());
    }

    public int hashCode() {
        return e().hashCode();
    }

    @Override // I7.AbstractC1278n
    public java.util.Collection q() {
        return p097j7.AbstractC6879v.m();
    }

    @Override // I7.AbstractC1278n
    public java.util.Collection r(p138n8.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        return D().b(fVar, W7.d.FROM_REFLECTION);
    }

    @Override // I7.AbstractC1278n
    public O7.U t(int i6) {
        p087i7.A aD = ((I7.t.a) this.f5481G.getValue()).d();
        if (aD == null) {
            return null;
        }
        p128m8.f fVar = (p128m8.f) aD.a();
        p088i8.l lVar = (p088i8.l) aD.b();
        p128m8.e eVar = (p128m8.e) aD.c();
        p8.i.f fVar2 = p118l8.a.f50085n;
        p247y7.AbstractC7350t.e(fVar2, "packageLocalVariable");
        p088i8.n nVar = (p088i8.n) p108k8.e.b(lVar, fVar2, i6);
        if (nVar == null) {
            return null;
        }
        java.lang.Class clsE = e();
        p088i8.t tVarV = lVar.V();
        p247y7.AbstractC7350t.e(tVarV, "getTypeTable(...)");
        return (O7.U) I7.M.h(clsE, nVar, fVar, new p108k8.g(tVarV), eVar, I7.t.c.f5497L);
    }

    public java.lang.String toString() {
        return "file class " + U7.d.a(e()).b();
    }

    @Override // I7.AbstractC1278n
    protected java.lang.Class v() {
        java.lang.Class clsE = ((I7.t.a) this.f5481G.getValue()).e();
        return clsE == null ? e() : clsE;
    }

    @Override // I7.AbstractC1278n
    public java.util.Collection w(p138n8.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        return D().c(fVar, W7.d.FROM_REFLECTION);
    }
}
