package p007a7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W6.InterfaceC1768b f17075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f17076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p007a7.i f17079e;
    private volatile /* synthetic */ java.lang.Object interceptors$delegate;

    public d(p007a7.i... iVarArr) {
        p247y7.AbstractC7350t.f(iVarArr, "phases");
        this.f17075a = W6.AbstractC1770d.a(true);
        this.f17076b = p097j7.AbstractC6879v.s(java.util.Arrays.copyOf(iVarArr, iVarArr.length));
        this.interceptors$delegate = null;
    }

    private final java.util.List b() {
        int iO;
        int i6 = this.f17077c;
        if (i6 == 0) {
            m(p097j7.AbstractC6879v.m());
            return p097j7.AbstractC6879v.m();
        }
        java.util.List list = this.f17076b;
        int i10 = 0;
        if (i6 == 1 && (iO = p097j7.AbstractC6879v.o(list)) >= 0) {
            int i11 = 0;
            while (true) {
                java.lang.Object obj = list.get(i11);
                p007a7.c cVar = obj instanceof p007a7.c ? (p007a7.c) obj : null;
                if (cVar != null && !cVar.h()) {
                    java.util.List listI = cVar.i();
                    p(cVar);
                    return listI;
                }
                if (i11 == iO) {
                    break;
                }
                i11++;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iO2 = p097j7.AbstractC6879v.o(list);
        if (iO2 >= 0) {
            while (true) {
                java.lang.Object obj2 = list.get(i10);
                p007a7.c cVar2 = obj2 instanceof p007a7.c ? (p007a7.c) obj2 : null;
                if (cVar2 != null) {
                    cVar2.b(arrayList);
                }
                if (i10 == iO2) {
                    break;
                }
                i10++;
            }
        }
        m(arrayList);
        return arrayList;
    }

    private final p007a7.e c(java.lang.Object obj, java.lang.Object obj2, p127m7.i iVar) {
        return p007a7.f.a(obj, q(), obj2, iVar, g());
    }

    private final p007a7.c e(p007a7.i iVar) {
        java.util.List list = this.f17076b;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.Object obj = list.get(i6);
            if (obj == iVar) {
                p007a7.c cVar = new p007a7.c(iVar, a7.j.c.f17085a);
                list.set(i6, cVar);
                return cVar;
            }
            if (obj instanceof p007a7.c) {
                p007a7.c cVar2 = (p007a7.c) obj;
                if (cVar2.e() == iVar) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    private final int f(p007a7.i iVar) {
        java.util.List list = this.f17076b;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.Object obj = list.get(i6);
            if (obj == iVar || ((obj instanceof p007a7.c) && ((p007a7.c) obj).e() == iVar)) {
                return i6;
            }
        }
        return -1;
    }

    private final java.util.List h() {
        return (java.util.List) this.interceptors$delegate;
    }

    private final boolean i(p007a7.i iVar) {
        java.util.List list = this.f17076b;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.Object obj = list.get(i6);
            if (obj == iVar) {
                return true;
            }
            if ((obj instanceof p007a7.c) && ((p007a7.c) obj).e() == iVar) {
                return true;
            }
        }
        return false;
    }

    private final void m(java.util.List list) {
        o(list);
        this.f17078d = false;
        this.f17079e = null;
    }

    private final void n() {
        o(null);
        this.f17078d = false;
        this.f17079e = null;
    }

    private final void o(java.util.List list) {
        this.interceptors$delegate = list;
    }

    private final void p(p007a7.c cVar) {
        o(cVar.i());
        this.f17078d = false;
        this.f17079e = cVar.e();
    }

    private final java.util.List q() {
        if (h() == null) {
            b();
        }
        this.f17078d = true;
        java.util.List listH = h();
        p247y7.AbstractC7350t.c(listH);
        return listH;
    }

    private final boolean r(p007a7.i iVar, p237x7.q qVar) {
        java.util.List listH = h();
        if (this.f17076b.isEmpty() || listH == null || this.f17078d || !p247y7.W.n(listH)) {
            return false;
        }
        if (p247y7.AbstractC7350t.b(this.f17079e, iVar)) {
            listH.add(qVar);
            return true;
        }
        if (!p247y7.AbstractC7350t.b(iVar, p097j7.AbstractC6879v.t0(this.f17076b)) && f(iVar) != p097j7.AbstractC6879v.o(this.f17076b)) {
            return false;
        }
        p007a7.c cVarE = e(iVar);
        p247y7.AbstractC7350t.c(cVarE);
        cVarE.a(qVar);
        listH.add(qVar);
        return true;
    }

    public void a() {
    }

    public final java.lang.Object d(java.lang.Object obj, java.lang.Object obj2, p127m7.e eVar) {
        return c(obj, obj2, eVar.getContext()).a(obj2, eVar);
    }

    public abstract boolean g();

    public final void j(p007a7.i iVar, p007a7.i iVar2) throws p007a7.b {
        p007a7.j jVarF;
        p007a7.i iVarA;
        p247y7.AbstractC7350t.f(iVar, "reference");
        p247y7.AbstractC7350t.f(iVar2, "phase");
        if (i(iVar2)) {
            return;
        }
        int iF = f(iVar);
        if (iF == -1) {
            throw new p007a7.b("Phase " + iVar + " was not registered for this pipeline");
        }
        int i6 = iF + 1;
        int iO = p097j7.AbstractC6879v.o(this.f17076b);
        if (i6 <= iO) {
            while (true) {
                java.lang.Object obj = this.f17076b.get(i6);
                p007a7.c cVar = obj instanceof p007a7.c ? (p007a7.c) obj : null;
                if (cVar != null && (jVarF = cVar.f()) != null) {
                    a7.j.a aVar = jVarF instanceof a7.j.a ? (a7.j.a) jVarF : null;
                    if (aVar != null && (iVarA = aVar.a()) != null && p247y7.AbstractC7350t.b(iVarA, iVar)) {
                        iF = i6;
                    }
                    if (i6 == iO) {
                        break;
                    } else {
                        i6++;
                    }
                } else {
                    break;
                }
            }
        }
        this.f17076b.add(iF + 1, new p007a7.c(iVar2, new a7.j.a(iVar)));
    }

    public final void k(p007a7.i iVar, p007a7.i iVar2) throws p007a7.b {
        p247y7.AbstractC7350t.f(iVar, "reference");
        p247y7.AbstractC7350t.f(iVar2, "phase");
        if (i(iVar2)) {
            return;
        }
        int iF = f(iVar);
        if (iF != -1) {
            this.f17076b.add(iF, new p007a7.c(iVar2, new a7.j.b(iVar)));
            return;
        }
        throw new p007a7.b("Phase " + iVar + " was not registered for this pipeline");
    }

    public final void l(p007a7.i iVar, p237x7.q qVar) {
        p247y7.AbstractC7350t.f(iVar, "phase");
        p247y7.AbstractC7350t.f(qVar, "block");
        p007a7.c cVarE = e(iVar);
        if (cVarE == null) {
            throw new p007a7.b("Phase " + iVar + " was not registered for this pipeline");
        }
        if (r(iVar, qVar)) {
            this.f17077c++;
            return;
        }
        cVarE.a(qVar);
        this.f17077c++;
        n();
        a();
    }

    public java.lang.String toString() {
        return super.toString();
    }
}
