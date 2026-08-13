package p109k9;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements p109k9.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f49862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p109k9.o f49863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f49864c;

    private static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k9.t.a.C0628a f49865c = new k9.t.a.C0628a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p109k9.InterfaceC6916b f49866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.Object f49867b;

        /* JADX INFO: renamed from: k9.t$a$a, reason: collision with other inner class name */
        public static final class C0628a {
            private C0628a() {
            }

            public /* synthetic */ C0628a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final k9.t.a a(p109k9.n nVar) {
                p247y7.AbstractC7350t.f(nVar, "field");
                java.lang.Object objA = nVar.a();
                if (objA != null) {
                    return new k9.t.a(nVar.b(), objA, null);
                }
                throw new java.lang.IllegalArgumentException(("The field '" + nVar.getName() + "' does not define a default value").toString());
            }
        }

        private a(p109k9.InterfaceC6916b interfaceC6916b, java.lang.Object obj) {
            this.f49866a = interfaceC6916b;
            this.f49867b = obj;
        }

        public /* synthetic */ a(p109k9.InterfaceC6916b interfaceC6916b, java.lang.Object obj, p247y7.AbstractC7342k abstractC7342k) {
            this(interfaceC6916b, obj);
        }
    }

    /* synthetic */ class b extends p247y7.C7348q implements p237x7.l {
        b(java.lang.Object obj) {
            super(1, obj, p109k9.v.class, "test", "test(Ljava/lang/Object;)Z", 0);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(((p109k9.v) this.f57287D).test(obj));
        }
    }

    /* synthetic */ class c extends p247y7.C7348q implements p237x7.l {
        c(java.lang.Object obj) {
            super(1, obj, p109k9.C.class, "test", "test(Ljava/lang/Object;)Z", 0);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(((p109k9.C) this.f57287D).test(obj));
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {
        d() {
            super(1);
        }

        public final void a(java.lang.Object obj) {
            for (k9.t.a aVar : p109k9.t.this.f49864c) {
                aVar.f49866a.c(obj, aVar.f49867b);
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(obj);
            return p087i7.M.f46721a;
        }
    }

    public t(java.lang.String str, p109k9.o oVar) {
        p247y7.AbstractC7350t.f(str, "onZero");
        p247y7.AbstractC7350t.f(oVar, "format");
        this.f49862a = str;
        this.f49863b = oVar;
        java.util.List listB = p109k9.p.b(oVar);
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listB, 10));
        java.util.Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(((p109k9.l) it.next()).c());
        }
        java.util.List listB0 = p097j7.AbstractC6879v.b0(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(listB0, 10));
        java.util.Iterator it2 = listB0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(k9.t.a.f49865c.a((p109k9.n) it2.next()));
        }
        this.f49864c = arrayList2;
    }

    @Override // p109k9.o
    public p119l9.e a() {
        p119l9.e eVarA = this.f49863b.a();
        java.util.List<k9.t.a> list = this.f49864c;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        for (k9.t.a aVar : list) {
            arrayList.add(new p109k9.g(aVar.f49867b, new p109k9.u(aVar.f49866a)));
        }
        p109k9.v vVarA = p109k9.w.a(arrayList);
        return vVarA instanceof p109k9.C ? new p119l9.c(this.f49862a) : new p119l9.b(p097j7.AbstractC6879v.p(p087i7.B.a(new k9.t.b(vVarA), new p119l9.c(this.f49862a)), p087i7.B.a(new k9.t.c(p109k9.C.f49827a), eVarA)));
    }

    @Override // p109k9.o
    public p129m9.q b() {
        return new p129m9.q(p097j7.AbstractC6879v.m(), p097j7.AbstractC6879v.p(this.f49863b.b(), p129m9.n.b(p097j7.AbstractC6879v.p(new p109k9.j(this.f49862a).b(), new p129m9.q(this.f49864c.isEmpty() ? p097j7.AbstractC6879v.m() : p097j7.AbstractC6879v.e(new p129m9.v(new k9.t.d())), p097j7.AbstractC6879v.m())))));
    }

    public final p109k9.o d() {
        return this.f49863b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p109k9.t) {
            p109k9.t tVar = (p109k9.t) obj;
            if (p247y7.AbstractC7350t.b(this.f49862a, tVar.f49862a) && p247y7.AbstractC7350t.b(this.f49863b, tVar.f49863b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f49862a.hashCode() * 31) + this.f49863b.hashCode();
    }

    public java.lang.String toString() {
        return "Optional(" + this.f49862a + ", " + this.f49863b + ')';
    }
}
