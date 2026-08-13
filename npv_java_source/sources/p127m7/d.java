package p127m7;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements p127m7.i, java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p127m7.i f51194C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final m7.i.b f51195D;

    public d(p127m7.i iVar, m7.i.b bVar) {
        p247y7.AbstractC7350t.f(iVar, "left");
        p247y7.AbstractC7350t.f(bVar, "element");
        this.f51194C = iVar;
        this.f51195D = bVar;
    }

    private final boolean b(m7.i.b bVar) {
        return p247y7.AbstractC7350t.b(i(bVar.getKey()), bVar);
    }

    private final boolean c(p127m7.d dVar) {
        while (b(dVar.f51195D)) {
            p127m7.i iVar = dVar.f51194C;
            if (!(iVar instanceof p127m7.d)) {
                p247y7.AbstractC7350t.d(iVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return b((m7.i.b) iVar);
            }
            dVar = (p127m7.d) iVar;
        }
        return false;
    }

    private final int d() {
        int i6 = 2;
        p127m7.d dVar = this;
        while (true) {
            p127m7.i iVar = dVar.f51194C;
            dVar = iVar instanceof p127m7.d ? (p127m7.d) iVar : null;
            if (dVar == null) {
                return i6;
            }
            i6++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String e(java.lang.String str, m7.i.b bVar) {
        p247y7.AbstractC7350t.f(str, "acc");
        p247y7.AbstractC7350t.f(bVar, "element");
        if (str.length() == 0) {
            return bVar.toString();
        }
        return str + ", " + bVar;
    }

    @Override // p127m7.i
    public java.lang.Object D(java.lang.Object obj, p237x7.p pVar) {
        p247y7.AbstractC7350t.f(pVar, "operation");
        return pVar.u(this.f51194C.D(obj, pVar), this.f51195D);
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof p127m7.d) {
                p127m7.d dVar = (p127m7.d) obj;
                if (dVar.d() != d() || !dVar.c(this)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f51194C.hashCode() + this.f51195D.hashCode();
    }

    @Override // p127m7.i
    public m7.i.b i(m7.i.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "key");
        p127m7.d dVar = this;
        while (true) {
            m7.i.b bVarI = dVar.f51195D.i(cVar);
            if (bVarI != null) {
                return bVarI;
            }
            p127m7.i iVar = dVar.f51194C;
            if (!(iVar instanceof p127m7.d)) {
                return iVar.i(cVar);
            }
            dVar = (p127m7.d) iVar;
        }
    }

    @Override // p127m7.i
    public p127m7.i o0(p127m7.i iVar) {
        return m7.i.a.b(this, iVar);
    }

    public java.lang.String toString() {
        return '[' + ((java.lang.String) D("", new p237x7.p() { // from class: m7.c
            @Override // p237x7.p
            public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                return p127m7.d.e((java.lang.String) obj, (m7.i.b) obj2);
            }
        })) + ']';
    }

    @Override // p127m7.i
    public p127m7.i y0(m7.i.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "key");
        if (this.f51195D.i(cVar) != null) {
            return this.f51194C;
        }
        p127m7.i iVarY0 = this.f51194C.y0(cVar);
        if (iVarY0 == this.f51194C) {
            return this;
        }
        return iVarY0 == p127m7.j.f51198C ? this.f51195D : new p127m7.d(iVarY0, this.f51195D);
    }
}
