package p009a9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends p009a9.e {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected final Z8.InterfaceC1869f f17171F;

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f17172G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f17173H;

        a(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f17172G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                Z8.InterfaceC1870g interfaceC1870g = (Z8.InterfaceC1870g) this.f17173H;
                p009a9.g gVar = p009a9.g.this;
                this.f17172G = 1;
                if (gVar.t(interfaceC1870g, this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            return ((a9.g.a) x(interfaceC1870g, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            a9.g.a aVar = p009a9.g.this.new a(eVar);
            aVar.f17173H = obj;
            return aVar;
        }
    }

    public g(Z8.InterfaceC1869f interfaceC1869f, p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d) {
        super(iVar, i6, enumC1863d);
        this.f17171F = interfaceC1869f;
    }

    static /* synthetic */ java.lang.Object q(p009a9.g gVar, Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
        if (gVar.f17162D == -3) {
            p127m7.i context = eVar.getContext();
            p127m7.i iVarK = W8.H.k(context, gVar.f17161C);
            if (p247y7.AbstractC7350t.b(iVarK, context)) {
                java.lang.Object objT = gVar.t(interfaceC1870g, eVar);
                return objT == p137n7.b.g() ? objT : p087i7.M.f46721a;
            }
            m7.f.b bVar = p127m7.f.f51196A;
            if (p247y7.AbstractC7350t.b(iVarK.i(bVar), context.i(bVar))) {
                java.lang.Object objS = gVar.s(interfaceC1870g, iVarK, eVar);
                return objS == p137n7.b.g() ? objS : p087i7.M.f46721a;
            }
        }
        java.lang.Object objB = super.b(interfaceC1870g, eVar);
        return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
    }

    static /* synthetic */ java.lang.Object r(p009a9.g gVar, Y8.z zVar, p127m7.e eVar) {
        java.lang.Object objT = gVar.t(new p009a9.z(zVar), eVar);
        return objT == p137n7.b.g() ? objT : p087i7.M.f46721a;
    }

    private final java.lang.Object s(Z8.InterfaceC1870g interfaceC1870g, p127m7.i iVar, p127m7.e eVar) {
        return p009a9.f.c(iVar, p009a9.f.d(interfaceC1870g, eVar.getContext()), null, new a9.g.a(null), eVar, 4, null);
    }

    @Override // p009a9.e, Z8.InterfaceC1869f
    public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
        return q(this, interfaceC1870g, eVar);
    }

    @Override // p009a9.e
    protected java.lang.Object h(Y8.z zVar, p127m7.e eVar) {
        return r(this, zVar, eVar);
    }

    protected abstract java.lang.Object t(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar);

    @Override // p009a9.e
    public java.lang.String toString() {
        return this.f17171F + " -> " + super.toString();
    }
}
