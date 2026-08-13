package B;

/* JADX INFO: loaded from: classes.dex */
public final class k extends D.AbstractC0878o implements B.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D.I f378a = new D.I();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.List f379b;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f380D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(java.lang.Object obj) {
            super(1);
            this.f380D = obj;
        }

        public final java.lang.Object a(int i6) {
            return this.f380D;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Number) obj).intValue());
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f381D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(java.lang.Object obj) {
            super(1);
            this.f381D = obj;
        }

        public final java.lang.Object a(int i6) {
            return this.f381D;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Number) obj).intValue());
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.r {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.q f382D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p237x7.q qVar) {
            super(4);
            this.f382D = qVar;
        }

        public final void a(B.InterfaceC0793d interfaceC0793d, int i6, V.InterfaceC1734n interfaceC1734n, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= interfaceC1734n.S(interfaceC0793d) ? 4 : 2;
            }
            if ((i10 & 131) == 130 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1010194746, i10, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:58)");
            }
            this.f382D.j(interfaceC0793d, interfaceC1734n, java.lang.Integer.valueOf(i10 & 14));
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }

        @Override // p237x7.r
        public /* bridge */ /* synthetic */ java.lang.Object o(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            a((B.InterfaceC0793d) obj, ((java.lang.Number) obj2).intValue(), (V.InterfaceC1734n) obj3, ((java.lang.Number) obj4).intValue());
            return p087i7.M.f46721a;
        }
    }

    public k(p237x7.l lVar) {
        lVar.l(this);
    }

    @Override // B.A
    public void b(java.lang.Object obj, java.lang.Object obj2, p237x7.q qVar) {
        java.util.List arrayList = this.f379b;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.f379b = arrayList;
        }
        arrayList.add(java.lang.Integer.valueOf(f().a()));
        c(obj, obj2, qVar);
    }

    @Override // B.A
    public void c(java.lang.Object obj, java.lang.Object obj2, p237x7.q qVar) {
        f().c(1, new B.j(obj != null ? new B.k.a(obj) : null, new B.k.b(obj2), p031d0.c.c(-1010194746, true, new B.k.c(qVar))));
    }

    @Override // B.A
    public void d(int i6, p237x7.l lVar, p237x7.l lVar2, p237x7.r rVar) {
        f().c(i6, new B.j(lVar, lVar2, rVar));
    }

    public final java.util.List i() {
        java.util.List list = this.f379b;
        return list == null ? p097j7.AbstractC6879v.m() : list;
    }

    @Override // D.AbstractC0878o
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public D.I f() {
        return this.f378a;
    }
}
