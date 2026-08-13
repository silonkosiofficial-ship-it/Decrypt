package p009a9;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends p009a9.e {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.lang.Iterable f17194F;

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f17195G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f17196H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p009a9.z f17197I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Z8.InterfaceC1869f interfaceC1869f, p009a9.z zVar, p127m7.e eVar) {
            super(2, eVar);
            this.f17196H = interfaceC1869f;
            this.f17197I = zVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f17195G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                Z8.InterfaceC1869f interfaceC1869f = this.f17196H;
                p009a9.z zVar = this.f17197I;
                this.f17195G = 1;
                if (interfaceC1869f.b(zVar, this) == objG) {
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
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((a9.j.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new a9.j.a(this.f17196H, this.f17197I, eVar);
        }
    }

    public j(java.lang.Iterable iterable, p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d) {
        super(iVar, i6, enumC1863d);
        this.f17194F = iterable;
    }

    public /* synthetic */ j(java.lang.Iterable iterable, p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this(iterable, (i10 & 2) != 0 ? p127m7.j.f51198C : iVar, (i10 & 4) != 0 ? -2 : i6, (i10 & 8) != 0 ? Y8.EnumC1863d.SUSPEND : enumC1863d);
    }

    @Override // p009a9.e
    protected java.lang.Object h(Y8.z zVar, p127m7.e eVar) {
        p009a9.z zVar2 = new p009a9.z(zVar);
        java.util.Iterator it = this.f17194F.iterator();
        while (it.hasNext()) {
            W8.AbstractC1788i.d(zVar, null, null, new a9.j.a((Z8.InterfaceC1869f) it.next(), zVar2, null), 3, null);
        }
        return p087i7.M.f46721a;
    }

    @Override // p009a9.e
    protected p009a9.e i(p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d) {
        return new p009a9.j(this.f17194F, iVar, i6, enumC1863d);
    }

    @Override // p009a9.e
    public Y8.B o(W8.N n6) {
        return Y8.x.c(n6, this.f17161C, this.f17162D, k());
    }
}
