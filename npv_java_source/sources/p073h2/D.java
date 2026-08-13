package p073h2;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z8.InterfaceC1869f f45905a;

    static final class a extends p147o7.l implements p237x7.l {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f45906G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.a f45907H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.a aVar, p127m7.e eVar) {
            super(1, eVar);
            this.f45907H = aVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f45906G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            return this.f45907H.b();
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object l(p127m7.e eVar) {
            return ((h2.D.a) y(eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e y(p127m7.e eVar) {
            return new h2.D.a(this.f45907H, eVar);
        }
    }

    public D(p073h2.E e6, java.lang.Object obj, p073h2.O o6, p237x7.a aVar) {
        p247y7.AbstractC7350t.f(e6, "config");
        p247y7.AbstractC7350t.f(aVar, "pagingSourceFactory");
        this.f45905a = new p073h2.C6647y(new h2.D.a(aVar, null), obj, e6, o6).i();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public D(p073h2.E e6, java.lang.Object obj, p237x7.a aVar) {
        this(e6, obj, null, aVar);
        p247y7.AbstractC7350t.f(e6, "config");
        p247y7.AbstractC7350t.f(aVar, "pagingSourceFactory");
    }

    public /* synthetic */ D(p073h2.E e6, java.lang.Object obj, p237x7.a aVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(e6, (i6 & 2) != 0 ? null : obj, aVar);
    }

    public final Z8.InterfaceC1869f a() {
        return this.f45905a;
    }
}
