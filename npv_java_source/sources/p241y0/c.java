package p241y0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p241y0.d f57125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p237x7.a f57126b = new y0.c.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private W8.N f57127c;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W8.N b() {
            return p241y0.c.this.h();
        }
    }

    static final class b extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        /* synthetic */ java.lang.Object f57129F;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f57131H;

        b(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f57129F = obj;
            this.f57131H |= Integer.MIN_VALUE;
            return p241y0.c.this.a(0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: y0.c$c, reason: collision with other inner class name */
    static final class C0754c extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        /* synthetic */ java.lang.Object f57132F;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f57134H;

        C0754c(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f57132F = obj;
            this.f57134H |= Integer.MIN_VALUE;
            return p241y0.c.this.c(0L, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final java.lang.Object a(long j6, long j10, p127m7.e eVar) {
        y0.c.b bVar;
        long jA;
        if (eVar instanceof y0.c.b) {
            bVar = (y0.c.b) eVar;
            int i6 = bVar.f57131H;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.f57131H = i6 - Integer.MIN_VALUE;
            } else {
                bVar = new y0.c.b(eVar);
            }
        } else {
            bVar = new y0.c.b(eVar);
        }
        y0.c.b bVar2 = bVar;
        java.lang.Object objJ = bVar2.f57129F;
        java.lang.Object objG = p137n7.b.g();
        int i10 = bVar2.f57131H;
        if (i10 == 0) {
            p087i7.x.b(objJ);
            p241y0.b bVarG = g();
            if (bVarG != null) {
                bVar2.f57131H = 1;
                objJ = bVarG.J(j6, j10, bVar2);
                if (objJ == objG) {
                    return objG;
                }
            } else {
                jA = Y0.A.f16198b.a();
            }
            return Y0.A.b(jA);
        }
        if (i10 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p087i7.x.b(objJ);
        jA = ((Y0.A) objJ).o();
        return Y0.A.b(jA);
    }

    public final long b(long j6, long j10, int i6) {
        p241y0.b bVarG = g();
        return bVarG != null ? bVarG.e1(j6, j10, i6) : p131n0.g.f51312b.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(long j6, p127m7.e eVar) {
        p241y0.c.C0754c c0754c;
        long jA;
        if (eVar instanceof p241y0.c.C0754c) {
            c0754c = (p241y0.c.C0754c) eVar;
            int i6 = c0754c.f57134H;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0754c.f57134H = i6 - Integer.MIN_VALUE;
            } else {
                c0754c = new p241y0.c.C0754c(eVar);
            }
        } else {
            c0754c = new p241y0.c.C0754c(eVar);
        }
        java.lang.Object objH1 = c0754c.f57132F;
        java.lang.Object objG = p137n7.b.g();
        int i10 = c0754c.f57134H;
        if (i10 == 0) {
            p087i7.x.b(objH1);
            p241y0.b bVarG = g();
            if (bVarG != null) {
                c0754c.f57134H = 1;
                objH1 = bVarG.h1(j6, c0754c);
                if (objH1 == objG) {
                    return objG;
                }
            } else {
                jA = Y0.A.f16198b.a();
            }
            return Y0.A.b(jA);
        }
        if (i10 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p087i7.x.b(objH1);
        jA = ((Y0.A) objH1).o();
        return Y0.A.b(jA);
    }

    public final long d(long j6, int i6) {
        p241y0.b bVarG = g();
        return bVarG != null ? bVarG.u0(j6, i6) : p131n0.g.f51312b.c();
    }

    public final W8.N e() {
        W8.N n6 = (W8.N) this.f57126b.b();
        if (n6 != null) {
            return n6;
        }
        throw new java.lang.IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final p241y0.d f() {
        return this.f57125a;
    }

    public final p241y0.b g() {
        p241y0.d dVar = this.f57125a;
        if (dVar != null) {
            return dVar.W1();
        }
        return null;
    }

    public final W8.N h() {
        return this.f57127c;
    }

    public final void i(p237x7.a aVar) {
        this.f57126b = aVar;
    }

    public final void j(p241y0.d dVar) {
        this.f57125a = dVar;
    }

    public final void k(W8.N n6) {
        this.f57127c = n6;
    }
}
