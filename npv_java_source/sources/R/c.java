package R;

/* JADX INFO: loaded from: classes.dex */
public final class c extends R.q {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final p170r.K f9167a0;

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f9168G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ R.h f9169H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ R.c f9170I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ z.n.b f9171J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(R.h hVar, R.c cVar, z.n.b bVar, p127m7.e eVar) {
            super(2, eVar);
            this.f9169H = hVar;
            this.f9170I = cVar;
            this.f9171J = bVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f9168G;
            try {
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    R.h hVar = this.f9169H;
                    this.f9168G = 1;
                    if (hVar.d(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                this.f9170I.f9167a0.p(this.f9171J);
                F0.AbstractC0933t.a(this.f9170I);
                return p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                this.f9170I.f9167a0.p(this.f9171J);
                F0.AbstractC0933t.a(this.f9170I);
                throw th;
            }
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((R.c.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new R.c.a(this.f9169H, this.f9170I, this.f9171J, eVar);
        }
    }

    private c(p250z.j jVar, boolean z6, float f6, p141o0.B0 b6, p237x7.a aVar) {
        super(jVar, z6, f6, b6, aVar, null);
        this.f9167a0 = new p170r.K(0, 1, null);
    }

    public /* synthetic */ c(p250z.j jVar, boolean z6, float f6, p141o0.B0 b6, p237x7.a aVar, p247y7.AbstractC7342k abstractC7342k) {
        this(jVar, z6, f6, b6, aVar);
    }

    @Override // androidx.compose.ui.d.c
    public void E1() {
        this.f9167a0.i();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x004e A[LOOP:0: B:5:0x0013->B:15:0x004e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0051 A[EDGE_INSN: B:23:0x0051->B:16:0x0051 BREAK  A[LOOP:0: B:5:0x0013->B:15:0x004e], SYNTHETIC] */
    @Override // R.q
    public void Y1(z.n.b bVar, long j6, float f6) {
        p170r.K k6 = this.f9167a0;
        java.lang.Object[] objArr = k6.f53334b;
        java.lang.Object[] objArr2 = k6.f53335c;
        long[] jArr = k6.f53333a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j10 = jArr[i6];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i6 != length) {
                        break;
                        break;
                    }
                    i6++;
                } else {
                    int i10 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128) {
                            int i12 = (i6 << 3) + i11;
                            ((R.h) objArr2[i12]).h();
                        }
                        j10 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    } else if (i6 != length) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
        }
        R.h hVar = new R.h(a2() ? p131n0.g.d(bVar.a()) : null, f6, a2(), null);
        this.f9167a0.s(bVar, hVar);
        W8.AbstractC1788i.d(t1(), null, null, new R.c.a(hVar, this, bVar, null), 3, null);
        F0.AbstractC0933t.a(this);
    }

    @Override // R.q
    public void Z1(p161q0.g gVar) {
        float f6;
        float fD = ((R.g) b2().b()).d();
        if (fD == 0.0f) {
            return;
        }
        p170r.K k6 = this.f9167a0;
        java.lang.Object[] objArr = k6.f53334b;
        java.lang.Object[] objArr2 = k6.f53335c;
        long[] jArr = k6.f53333a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j6 = jArr[i6];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8;
                int i11 = 8 - ((~(i6 - length)) >>> 31);
                long j10 = j6;
                int i12 = 0;
                while (i12 < i11) {
                    if ((j10 & 255) < 128) {
                        int i13 = (i6 << 3) + i12;
                        ((R.h) objArr2[i13]).e(gVar, p141o0.C7016y0.m(c2(), fD, 0.0f, 0.0f, 0.0f, 14, null));
                    }
                    j10 >>= i10;
                    i12++;
                    i10 = i10;
                    fD = fD;
                    i11 = i11;
                }
                f6 = fD;
                if (i11 != i10) {
                    return;
                }
            } else {
                f6 = fD;
            }
            if (i6 == length) {
                return;
            }
            i6++;
            fD = f6;
        }
    }

    @Override // R.q
    public void f2(z.n.b bVar) {
        R.h hVar = (R.h) this.f9167a0.c(bVar);
        if (hVar != null) {
            hVar.h();
        }
    }
}
