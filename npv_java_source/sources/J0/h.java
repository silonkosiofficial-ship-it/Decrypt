package J0;

/* JADX INFO: loaded from: classes.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.p f5590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f5591c;

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f5592F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5593G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f5595I;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f5593G = obj;
            this.f5595I |= Integer.MIN_VALUE;
            return J0.h.this.e(0.0f, this);
        }
    }

    public h(int i6, p237x7.p pVar) {
        this.f5589a = i6;
        this.f5590b = pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(float f6, p127m7.e eVar) {
        J0.h.a aVar;
        J0.h hVar;
        if (eVar instanceof J0.h.a) {
            aVar = (J0.h.a) eVar;
            int i6 = aVar.f5595I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f5595I = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new J0.h.a(eVar);
            }
        } else {
            aVar = new J0.h.a(eVar);
        }
        java.lang.Object objU = aVar.f5593G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f5595I;
        if (i10 == 0) {
            p087i7.x.b(objU);
            p237x7.p pVar = this.f5590b;
            java.lang.Float fB = p147o7.b.b(f6);
            aVar.f5592F = this;
            aVar.f5595I = 1;
            objU = pVar.u(fB, aVar);
            if (objU == objG) {
                return objG;
            }
            hVar = this;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (J0.h) aVar.f5592F;
            p087i7.x.b(objU);
        }
        hVar.f5591c += ((java.lang.Number) objU).floatValue();
        return p087i7.M.f46721a;
    }

    public final float b() {
        return this.f5591c;
    }

    public final int c(int i6) {
        return E7.j.k(i6 - A7.a.d(this.f5591c), 0, this.f5589a);
    }

    public final void d() {
        this.f5591c = 0.0f;
    }

    public final java.lang.Object f(int i6, int i10, p127m7.e eVar) {
        if (i6 > i10) {
            throw new java.lang.IllegalArgumentException(("Expected min=" + i6 + " ≤ max=" + i10).toString());
        }
        int i11 = i10 - i6;
        int i12 = this.f5589a;
        if (i11 > i12) {
            throw new java.lang.IllegalArgumentException(("Expected range (" + i11 + ") to be ≤ viewportSize=" + this.f5589a).toString());
        }
        float f6 = i6;
        float f10 = this.f5591c;
        if (f6 >= f10 && i10 <= i12 + f10) {
            return p087i7.M.f46721a;
        }
        if (f6 >= f10) {
            i6 = i10 - i12;
        }
        java.lang.Object objG = g(i6, eVar);
        return objG == p137n7.b.g() ? objG : p087i7.M.f46721a;
    }

    public final java.lang.Object g(float f6, p127m7.e eVar) {
        java.lang.Object objE = e(f6 - this.f5591c, eVar);
        return objE == p137n7.b.g() ? objE : p087i7.M.f46721a;
    }
}
