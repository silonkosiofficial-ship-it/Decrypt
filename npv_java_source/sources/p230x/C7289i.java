package p230x;

/* JADX INFO: renamed from: x.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7289i implements p230x.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.l f56491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p230x.m f56492b = new p230x.C7289i.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p210v.N f56493c = new p210v.N();

    /* JADX INFO: renamed from: x.i$a */
    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f56494G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p210v.L f56496I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.p f56497J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p210v.L l6, p237x7.p pVar, p127m7.e eVar) {
            super(2, eVar);
            this.f56496I = l6;
            this.f56497J = pVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f56494G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p210v.N n6 = p230x.C7289i.this.f56493c;
                p230x.m mVar = p230x.C7289i.this.f56492b;
                p210v.L l6 = this.f56496I;
                p237x7.p pVar = this.f56497J;
                this.f56494G = 1;
                if (n6.e(mVar, l6, pVar, this) == objG) {
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
            return ((p230x.C7289i.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return p230x.C7289i.this.new a(this.f56496I, this.f56497J, eVar);
        }
    }

    /* JADX INFO: renamed from: x.i$b */
    public static final class b implements p230x.m {
        b() {
        }

        @Override // p230x.m
        public void a(float f6) {
            p230x.C7289i.this.d().l(java.lang.Float.valueOf(f6));
        }
    }

    public C7289i(p237x7.l lVar) {
        this.f56491a = lVar;
    }

    @Override // p230x.o
    public java.lang.Object a(p210v.L l6, p237x7.p pVar, p127m7.e eVar) {
        java.lang.Object objF = W8.O.f(new p230x.C7289i.a(l6, pVar, null), eVar);
        return objF == p137n7.b.g() ? objF : p087i7.M.f46721a;
    }

    public final p237x7.l d() {
        return this.f56491a;
    }
}
