package p230x;

/* JADX INFO: renamed from: x.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7284d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f56445b = X.b.f15549F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X.b f56446a = new X.b(new p230x.C7288h.a[16], 0);

    /* JADX INFO: renamed from: x.d$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p230x.C7288h.a f56448E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p230x.C7288h.a aVar) {
            super(1);
            this.f56448E = aVar;
        }

        public final void a(java.lang.Throwable th) {
            p230x.C7284d.this.f56446a.A(this.f56448E);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((java.lang.Throwable) obj);
            return p087i7.M.f46721a;
        }
    }

    public final void b(java.lang.Throwable th) {
        X.b bVar = this.f56446a;
        int iT = bVar.t();
        W8.InterfaceC1794l[] interfaceC1794lArr = new W8.InterfaceC1794l[iT];
        for (int i6 = 0; i6 < iT; i6++) {
            interfaceC1794lArr[i6] = ((p230x.C7288h.a) bVar.s()[i6]).a();
        }
        for (int i10 = 0; i10 < iT; i10++) {
            interfaceC1794lArr[i10].k(th);
        }
        if (!this.f56446a.w()) {
            throw new java.lang.IllegalStateException("uncancelled requests present".toString());
        }
    }

    public final boolean c(p230x.C7288h.a aVar) {
        p131n0.i iVar = (p131n0.i) aVar.b().b();
        if (iVar == null) {
            W8.InterfaceC1794l interfaceC1794lA = aVar.a();
            i7.w.a aVar2 = p087i7.w.f46751D;
            interfaceC1794lA.t(p087i7.w.b(p087i7.M.f46721a));
            return false;
        }
        aVar.a().G(new p230x.C7284d.a(aVar));
        E7.i iVar2 = new E7.i(0, this.f56446a.t() - 1);
        int iF = iVar2.f();
        int iG = iVar2.g();
        if (iF <= iG) {
            while (true) {
                p131n0.i iVar3 = (p131n0.i) ((p230x.C7288h.a) this.f56446a.s()[iG]).b().b();
                if (iVar3 != null) {
                    p131n0.i iVarP = iVar.p(iVar3);
                    if (!p247y7.AbstractC7350t.b(iVarP, iVar)) {
                        if (!p247y7.AbstractC7350t.b(iVarP, iVar3)) {
                            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                            int iT = this.f56446a.t() - 1;
                            if (iT <= iG) {
                                while (true) {
                                    ((p230x.C7288h.a) this.f56446a.s()[iG]).a().k(cancellationException);
                                    if (iT == iG) {
                                        break;
                                    }
                                    iT++;
                                }
                            }
                        }
                    } else {
                        this.f56446a.a(iG + 1, aVar);
                        return true;
                    }
                }
                if (iG != iF) {
                    iG--;
                }
            }
        }
        this.f56446a.a(0, aVar);
        return true;
    }

    public final void d() {
        E7.i iVar = new E7.i(0, this.f56446a.t() - 1);
        int iF = iVar.f();
        int iG = iVar.g();
        if (iF <= iG) {
            while (true) {
                ((p230x.C7288h.a) this.f56446a.s()[iF]).a().t(p087i7.w.b(p087i7.M.f46721a));
                if (iF == iG) {
                    break;
                } else {
                    iF++;
                }
            }
        }
        this.f56446a.j();
    }
}
