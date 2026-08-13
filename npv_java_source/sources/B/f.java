package B;

/* JADX INFO: loaded from: classes.dex */
public final class f implements D.InterfaceC0871h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B.D f372a;

    public f(B.D d6) {
        this.f372a = d6;
    }

    private final int h(B.q qVar) {
        java.util.List listJ = qVar.j();
        int size = listJ.size();
        int iA = 0;
        for (int i6 = 0; i6 < size; i6++) {
            iA += ((B.l) listJ.get(i6)).a();
        }
        return (iA / listJ.size()) + qVar.h();
    }

    @Override // D.InterfaceC0871h
    public int a() {
        return this.f372a.w().d();
    }

    @Override // D.InterfaceC0871h
    public int b() {
        B.l lVar = (B.l) p097j7.AbstractC6879v.v0(this.f372a.w().j());
        if (lVar != null) {
            return lVar.getIndex();
        }
        return 0;
    }

    @Override // D.InterfaceC0871h
    public void c(p230x.w wVar, int i6, int i10) {
        this.f372a.N(i6, i10, true);
    }

    @Override // D.InterfaceC0871h
    public int d() {
        return this.f372a.s();
    }

    @Override // D.InterfaceC0871h
    public java.lang.Object e(p237x7.p pVar, p127m7.e eVar) {
        java.lang.Object objC = p230x.z.c(this.f372a, null, pVar, eVar, 1, null);
        return objC == p137n7.b.g() ? objC : p087i7.M.f46721a;
    }

    @Override // D.InterfaceC0871h
    public float f(int i6) {
        java.lang.Object obj;
        B.q qVarW = this.f372a.w();
        if (qVarW.j().isEmpty()) {
            return 0.0f;
        }
        java.util.List listJ = qVarW.j();
        int size = listJ.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = listJ.get(i10);
            if (((B.l) obj).getIndex() == i6) {
                break;
            }
            i10++;
        }
        B.l lVar = (B.l) obj;
        return lVar == null ? (h(qVarW) * (i6 - g())) - d() : lVar.c();
    }

    @Override // D.InterfaceC0871h
    public int g() {
        return this.f372a.r();
    }
}
