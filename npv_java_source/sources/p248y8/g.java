package p248y8;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends p248y8.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E8.i f57350b;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.a f57351D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.a aVar) {
            super(0);
            this.f57351D = aVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p248y8.h b() {
            p248y8.h hVar = (p248y8.h) this.f57351D.b();
            return hVar instanceof p248y8.a ? ((p248y8.a) hVar).h() : hVar;
        }
    }

    public g(E8.n nVar, p237x7.a aVar) {
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(aVar, "getScope");
        this.f57350b = nVar.d(new y8.g.a(aVar));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ g(E8.n nVar, p237x7.a aVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        if ((i6 & 1) != 0) {
            nVar = E8.f.f2273e;
            p247y7.AbstractC7350t.e(nVar, "NO_LOCKS");
        }
        this(nVar, aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(p237x7.a aVar) {
        this(null, aVar, 1, 0 == true ? 1 : 0);
        p247y7.AbstractC7350t.f(aVar, "getScope");
    }

    @Override // p248y8.a
    protected p248y8.h i() {
        return (p248y8.h) this.f57350b.b();
    }
}
