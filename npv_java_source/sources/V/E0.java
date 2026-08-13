package V;

/* JADX INFO: loaded from: classes.dex */
public final class E0 implements V.InterfaceC1723j0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final V.InterfaceC1723j0 f14644C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final V.C1705d0 f14645D = new V.C1705d0();

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f14646F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f14647G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f14648H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f14650J;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f14648H = obj;
            this.f14650J |= Integer.MIN_VALUE;
            return V.E0.this.R(null, this);
        }
    }

    public E0(V.InterfaceC1723j0 interfaceC1723j0) {
        this.f14644C = interfaceC1723j0;
    }

    @Override // p127m7.i
    public java.lang.Object D(java.lang.Object obj, p237x7.p pVar) {
        return V.InterfaceC1723j0.a.a(this, obj, pVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // V.InterfaceC1723j0
    public java.lang.Object R(p237x7.l lVar, p127m7.e eVar) {
        V.E0.a aVar;
        V.E0 e6;
        if (eVar instanceof V.E0.a) {
            aVar = (V.E0.a) eVar;
            int i6 = aVar.f14650J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f14650J = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new V.E0.a(eVar);
            }
        } else {
            aVar = new V.E0.a(eVar);
        }
        java.lang.Object objR = aVar.f14648H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f14650J;
        if (i10 != 0) {
            if (i10 == 1) {
                lVar = (p237x7.l) aVar.f14647G;
                e6 = (V.E0) aVar.f14646F;
                p087i7.x.b(objR);
            } else {
                if (i10 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(objR);
            }
        }
        p087i7.x.b(objR);
        V.C1705d0 c1705d0 = this.f14645D;
        aVar.f14646F = this;
        aVar.f14647G = lVar;
        aVar.f14650J = 1;
        if (c1705d0.c(aVar) == objG) {
            return objG;
        }
        e6 = this;
        V.InterfaceC1723j0 interfaceC1723j0 = e6.f14644C;
        aVar.f14646F = null;
        aVar.f14647G = null;
        aVar.f14650J = 2;
        objR = interfaceC1723j0.R(lVar, aVar);
        return objR == objG ? objG : objR;
    }

    public final void a() {
        this.f14645D.d();
    }

    public final void b() {
        this.f14645D.f();
    }

    @Override // m7.i.b
    public /* synthetic */ m7.i.c getKey() {
        return V.AbstractC1720i0.a(this);
    }

    @Override // m7.i.b, p127m7.i
    public m7.i.b i(m7.i.c cVar) {
        return V.InterfaceC1723j0.a.b(this, cVar);
    }

    @Override // p127m7.i
    public p127m7.i o0(p127m7.i iVar) {
        return V.InterfaceC1723j0.a.d(this, iVar);
    }

    @Override // p127m7.i
    public p127m7.i y0(m7.i.c cVar) {
        return V.InterfaceC1723j0.a.c(this, cVar);
    }
}
