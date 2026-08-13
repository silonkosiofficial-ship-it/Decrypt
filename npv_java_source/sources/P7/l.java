package P7;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements P7.g {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final P7.g f8398C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final boolean f8399D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p237x7.l f8400E;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(P7.g gVar, p237x7.l lVar) {
        this(gVar, false, lVar);
        p247y7.AbstractC7350t.f(gVar, "delegate");
        p247y7.AbstractC7350t.f(lVar, "fqNameFilter");
    }

    public l(P7.g gVar, boolean z6, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(gVar, "delegate");
        p247y7.AbstractC7350t.f(lVar, "fqNameFilter");
        this.f8398C = gVar;
        this.f8399D = z6;
        this.f8400E = lVar;
    }

    private final boolean d(P7.c cVar) {
        p138n8.c cVarE = cVar.e();
        return cVarE != null && ((java.lang.Boolean) this.f8400E.l(cVarE)).booleanValue();
    }

    @Override // P7.g
    public boolean H(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        if (((java.lang.Boolean) this.f8400E.l(cVar)).booleanValue()) {
            return this.f8398C.H(cVar);
        }
        return false;
    }

    @Override // P7.g
    public boolean isEmpty() {
        boolean z6;
        P7.g gVar = this.f8398C;
        if (!(gVar instanceof java.util.Collection) || !((java.util.Collection) gVar).isEmpty()) {
            java.util.Iterator it = gVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z6 = false;
                    break;
                }
                if (d((P7.c) it.next())) {
                    z6 = true;
                    break;
                }
            }
        } else {
            z6 = false;
            break;
        }
        if (this.f8399D) {
            return !z6;
        }
        return z6;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        P7.g gVar = this.f8398C;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : gVar) {
            if (d((P7.c) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // P7.g
    public P7.c j(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        if (((java.lang.Boolean) this.f8400E.l(cVar)).booleanValue()) {
            return this.f8398C.j(cVar);
        }
        return null;
    }
}
