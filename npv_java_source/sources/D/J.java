package D;

/* JADX INFO: loaded from: classes.dex */
public final class J implements androidx.compose.foundation.lazy.layout.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p170r.N f1608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object[] f1609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1610d;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f1611D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f1612E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p170r.H f1613F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ D.J f1614G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i6, int i10, p170r.H h6, D.J j6) {
            super(1);
            this.f1611D = i6;
            this.f1612E = i10;
            this.f1613F = h6;
            this.f1614G = j6;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0039  */
        public final void a(D.InterfaceC0867d.a aVar) {
            java.lang.Object objA;
            p237x7.l key = ((D.AbstractC0878o.a) aVar.c()).getKey();
            int iMax = java.lang.Math.max(this.f1611D, aVar.b());
            int iMin = java.lang.Math.min(this.f1612E, (aVar.b() + aVar.a()) - 1);
            if (iMax > iMin) {
                return;
            }
            while (true) {
                if (key == null) {
                    objA = D.H.a(iMax);
                } else {
                    objA = key.l(java.lang.Integer.valueOf(iMax - aVar.b()));
                    if (objA == null) {
                        objA = D.H.a(iMax);
                    }
                }
                this.f1613F.s(objA, iMax);
                this.f1614G.f1609c[iMax - this.f1614G.f1610d] = objA;
                if (iMax == iMin) {
                    return;
                } else {
                    iMax++;
                }
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D.InterfaceC0867d.a) obj);
            return p087i7.M.f46721a;
        }
    }

    public J(E7.i iVar, D.AbstractC0878o abstractC0878o) {
        D.InterfaceC0867d interfaceC0867dF = abstractC0878o.f();
        int iF = iVar.f();
        if (iF < 0) {
            throw new java.lang.IllegalStateException("negative nearestRange.first".toString());
        }
        int iMin = java.lang.Math.min(iVar.g(), interfaceC0867dF.a() - 1);
        if (iMin < iF) {
            this.f1608b = p170r.O.a();
            this.f1609c = new java.lang.Object[0];
            this.f1610d = 0;
        } else {
            int i6 = (iMin - iF) + 1;
            this.f1609c = new java.lang.Object[i6];
            this.f1610d = iF;
            p170r.H h6 = new p170r.H(i6);
            interfaceC0867dF.b(iF, iMin, new D.J.a(iF, iMin, h6, this));
            this.f1608b = h6;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public java.lang.Object b(int i6) {
        java.lang.Object[] objArr = this.f1609c;
        int i10 = i6 - this.f1610d;
        if (i10 < 0 || i10 > p097j7.AbstractC6872n.e0(objArr)) {
            return null;
        }
        return objArr[i10];
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public int d(java.lang.Object obj) {
        p170r.N n6 = this.f1608b;
        int iB = n6.b(obj);
        if (iB >= 0) {
            return n6.f53318c[iB];
        }
        return -1;
    }
}
