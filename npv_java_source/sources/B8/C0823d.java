package B8;

/* JADX INFO: renamed from: B8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0823d implements B8.InterfaceC0822c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A8.a f860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B8.C0824e f861b;

    /* JADX INFO: renamed from: B8.d$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f862a;

        static {
            int[] iArr = new int[B8.EnumC0821b.values().length];
            try {
                iArr[B8.EnumC0821b.PROPERTY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[B8.EnumC0821b.PROPERTY_GETTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[B8.EnumC0821b.PROPERTY_SETTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f862a = iArr;
        }
    }

    public C0823d(O7.G g6, O7.J j6, A8.a aVar) {
        p247y7.AbstractC7350t.f(g6, "module");
        p247y7.AbstractC7350t.f(j6, "notFoundClasses");
        p247y7.AbstractC7350t.f(aVar, "protocol");
        this.f860a = aVar;
        this.f861b = new B8.C0824e(g6, j6);
    }

    @Override // B8.InterfaceC0825f
    public java.util.List a(p088i8.s sVar, p108k8.c cVar) {
        p247y7.AbstractC7350t.f(sVar, "proto");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        java.util.List listM = (java.util.List) sVar.u(this.f860a.p());
        if (listM == null) {
            listM = p097j7.AbstractC6879v.m();
        }
        java.util.List list = listM;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f861b.a((p088i8.b) it.next(), cVar));
        }
        return arrayList;
    }

    @Override // B8.InterfaceC0825f
    public java.util.List b(B8.A a6, p158p8.p pVar, B8.EnumC0821b enumC0821b, int i6, p088i8.u uVar) {
        p247y7.AbstractC7350t.f(a6, "container");
        p247y7.AbstractC7350t.f(pVar, "callableProto");
        p247y7.AbstractC7350t.f(enumC0821b, "kind");
        p247y7.AbstractC7350t.f(uVar, "proto");
        java.util.List listM = (java.util.List) uVar.u(this.f860a.h());
        if (listM == null) {
            listM = p097j7.AbstractC6879v.m();
        }
        java.util.List list = listM;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f861b.a((p088i8.b) it.next(), a6.b()));
        }
        return arrayList;
    }

    @Override // B8.InterfaceC0825f
    public java.util.List c(B8.A a6, p088i8.g gVar) {
        p247y7.AbstractC7350t.f(a6, "container");
        p247y7.AbstractC7350t.f(gVar, "proto");
        java.util.List listM = (java.util.List) gVar.u(this.f860a.d());
        if (listM == null) {
            listM = p097j7.AbstractC6879v.m();
        }
        java.util.List list = listM;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f861b.a((p088i8.b) it.next(), a6.b()));
        }
        return arrayList;
    }

    @Override // B8.InterfaceC0825f
    public java.util.List d(B8.A a6, p088i8.n nVar) {
        p247y7.AbstractC7350t.f(a6, "container");
        p247y7.AbstractC7350t.f(nVar, "proto");
        p8.i.f fVarJ = this.f860a.j();
        java.util.List listM = fVarJ != null ? (java.util.List) nVar.u(fVarJ) : null;
        if (listM == null) {
            listM = p097j7.AbstractC6879v.m();
        }
        java.util.List list = listM;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f861b.a((p088i8.b) it.next(), a6.b()));
        }
        return arrayList;
    }

    @Override // B8.InterfaceC0825f
    public java.util.List f(B8.A a6, p088i8.n nVar) {
        p247y7.AbstractC7350t.f(a6, "container");
        p247y7.AbstractC7350t.f(nVar, "proto");
        p8.i.f fVarK = this.f860a.k();
        java.util.List listM = fVarK != null ? (java.util.List) nVar.u(fVarK) : null;
        if (listM == null) {
            listM = p097j7.AbstractC6879v.m();
        }
        java.util.List list = listM;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f861b.a((p088i8.b) it.next(), a6.b()));
        }
        return arrayList;
    }

    @Override // B8.InterfaceC0825f
    public java.util.List g(p088i8.q qVar, p108k8.c cVar) {
        p247y7.AbstractC7350t.f(qVar, "proto");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        java.util.List listM = (java.util.List) qVar.u(this.f860a.o());
        if (listM == null) {
            listM = p097j7.AbstractC6879v.m();
        }
        java.util.List list = listM;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f861b.a((p088i8.b) it.next(), cVar));
        }
        return arrayList;
    }

    @Override // B8.InterfaceC0825f
    public java.util.List h(B8.A.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "container");
        java.util.List listM = (java.util.List) aVar.f().u(this.f860a.a());
        if (listM == null) {
            listM = p097j7.AbstractC6879v.m();
        }
        java.util.List list = listM;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f861b.a((p088i8.b) it.next(), aVar.b()));
        }
        return arrayList;
    }

    @Override // B8.InterfaceC0825f
    public java.util.List i(B8.A a6, p158p8.p pVar, B8.EnumC0821b enumC0821b) {
        p8.i.d dVar;
        p8.i.f fVarI;
        p247y7.AbstractC7350t.f(a6, "container");
        p247y7.AbstractC7350t.f(pVar, "proto");
        p247y7.AbstractC7350t.f(enumC0821b, "kind");
        if (pVar instanceof p088i8.d) {
            dVar = (p088i8.d) pVar;
            fVarI = this.f860a.c();
        } else if (pVar instanceof p088i8.i) {
            dVar = (p088i8.i) pVar;
            fVarI = this.f860a.f();
        } else {
            if (!(pVar instanceof p088i8.n)) {
                throw new java.lang.IllegalStateException(("Unknown message: " + pVar).toString());
            }
            int i6 = B8.C0823d.a.f862a[enumC0821b.ordinal()];
            if (i6 == 1) {
                dVar = (p088i8.n) pVar;
                fVarI = this.f860a.i();
            } else if (i6 == 2) {
                dVar = (p088i8.n) pVar;
                fVarI = this.f860a.m();
            } else {
                if (i6 != 3) {
                    throw new java.lang.IllegalStateException("Unsupported callable kind with property proto".toString());
                }
                dVar = (p088i8.n) pVar;
                fVarI = this.f860a.n();
            }
        }
        java.util.List listM = (java.util.List) dVar.u(fVarI);
        if (listM == null) {
            listM = p097j7.AbstractC6879v.m();
        }
        java.util.List list = listM;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f861b.a((p088i8.b) it.next(), a6.b()));
        }
        return arrayList;
    }

    @Override // B8.InterfaceC0825f
    public java.util.List j(B8.A a6, p158p8.p pVar, B8.EnumC0821b enumC0821b) {
        p8.i.f fVarL;
        p8.i.d dVar;
        p247y7.AbstractC7350t.f(a6, "container");
        p247y7.AbstractC7350t.f(pVar, "proto");
        p247y7.AbstractC7350t.f(enumC0821b, "kind");
        java.util.List listM = null;
        if (pVar instanceof p088i8.i) {
            fVarL = this.f860a.g();
            if (fVarL != null) {
                dVar = (p088i8.i) pVar;
                listM = (java.util.List) dVar.u(fVarL);
            }
        } else {
            if (!(pVar instanceof p088i8.n)) {
                throw new java.lang.IllegalStateException(("Unknown message: " + pVar).toString());
            }
            int i6 = B8.C0823d.a.f862a[enumC0821b.ordinal()];
            if (i6 != 1 && i6 != 2 && i6 != 3) {
                throw new java.lang.IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + enumC0821b).toString());
            }
            fVarL = this.f860a.l();
            if (fVarL != null) {
                dVar = (p088i8.n) pVar;
                listM = (java.util.List) dVar.u(fVarL);
            }
        }
        if (listM == null) {
            listM = p097j7.AbstractC6879v.m();
        }
        java.util.List list = listM;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f861b.a((p088i8.b) it.next(), a6.b()));
        }
        return arrayList;
    }

    @Override // B8.InterfaceC0822c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public p198t8.g k(B8.A a6, p088i8.n nVar, F8.E e6) {
        p247y7.AbstractC7350t.f(a6, "container");
        p247y7.AbstractC7350t.f(nVar, "proto");
        p247y7.AbstractC7350t.f(e6, "expectedType");
        return null;
    }

    @Override // B8.InterfaceC0822c
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public p198t8.g e(B8.A a6, p088i8.n nVar, F8.E e6) {
        p247y7.AbstractC7350t.f(a6, "container");
        p247y7.AbstractC7350t.f(nVar, "proto");
        p247y7.AbstractC7350t.f(e6, "expectedType");
        p088i8.b.C0568b.c cVar = (p088i8.b.C0568b.c) p108k8.e.a(nVar, this.f860a.b());
        if (cVar == null) {
            return null;
        }
        return this.f861b.f(e6, cVar, a6.b());
    }
}
