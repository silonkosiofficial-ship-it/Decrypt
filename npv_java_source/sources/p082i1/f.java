package p082i1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p082i1.b implements java.lang.Iterable, p256z7.a {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final i1.f.b f46649N = new i1.f.b(null);

    private static final class a implements java.util.Iterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private p082i1.f f46650C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f46651D;

        public a(p082i1.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "mObject");
            this.f46650C = fVar;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p082i1.d next() {
            java.lang.Object obj = this.f46650C.Z().get(this.f46651D);
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey");
            p082i1.d dVar = (p082i1.d) obj;
            this.f46651D++;
            return dVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f46651D < this.f46650C.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p082i1.f fVar) {
        super(fVar);
        p247y7.AbstractC7350t.f(fVar, "clObject");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(char[] cArr) {
        super(cArr);
        p247y7.AbstractC7350t.f(cArr, "content");
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new i1.f.a(this);
    }

    @Override // p082i1.c
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public p082i1.f d() {
        return new p082i1.f(this);
    }
}
