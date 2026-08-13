package D0;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends F0.J.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D0.b0 f1819b = new D0.b0();

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final D0.b0.a f1820D = new D0.b0.a();

        a() {
            super(1);
        }

        public final void a(D0.X.a aVar) {
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X f1821D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(D0.X x6) {
            super(1);
            this.f1821D = x6;
        }

        public final void a(D0.X.a aVar) {
            D0.X.a.p(aVar, this.f1821D, 0, 0, 0.0f, null, 12, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.util.List f1822D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(java.util.List list) {
            super(1);
            this.f1822D = list;
        }

        public final void a(D0.X.a aVar) {
            java.util.List list = this.f1822D;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                D0.X.a.p(aVar, (D0.X) list.get(i6), 0, 0, 0.0f, null, 12, null);
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    private b0() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // D0.I
    public D0.K b(D0.M m6, java.util.List list, long j6) {
        int i6;
        int iH;
        p237x7.l bVar;
        if (list.isEmpty()) {
            i6 = Y0.C1859b.n(j6);
            iH = Y0.C1859b.m(j6);
            bVar = D0.b0.a.f1820D;
        } else {
            if (list.size() != 1) {
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(((D0.G) list.get(i10)).U(j6));
                }
                int size2 = arrayList.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i11 = 0; i11 < size2; i11++) {
                    D0.X x6 = (D0.X) arrayList.get(i11);
                    iMax = java.lang.Math.max(x6.I0(), iMax);
                    iMax2 = java.lang.Math.max(x6.w0(), iMax2);
                }
                return D0.L.b(m6, Y0.c.i(j6, iMax), Y0.c.h(j6, iMax2), null, new D0.b0.c(arrayList), 4, null);
            }
            D0.X xU = ((D0.G) list.get(0)).U(j6);
            i6 = Y0.c.i(j6, xU.I0());
            iH = Y0.c.h(j6, xU.w0());
            bVar = new D0.b0.b(xU);
        }
        return D0.L.b(m6, i6, iH, null, bVar, 4, null);
    }
}
