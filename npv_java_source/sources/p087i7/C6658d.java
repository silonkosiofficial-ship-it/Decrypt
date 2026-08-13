package p087i7;

/* JADX INFO: renamed from: i7.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6658d extends p087i7.AbstractC6657c implements p127m7.e {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private p237x7.q f46726C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.Object f46727D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private p127m7.e f46728E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private java.lang.Object f46729F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6658d(p237x7.q qVar, java.lang.Object obj) {
        super(null);
        p247y7.AbstractC7350t.f(qVar, "block");
        this.f46726C = qVar;
        this.f46727D = obj;
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f46728E = this;
        this.f46729F = p087i7.AbstractC6656b.f46725a;
    }

    @Override // p087i7.AbstractC6657c
    public java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
        p247y7.AbstractC7350t.d(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f46728E = eVar;
        this.f46727D = obj;
        java.lang.Object objG = p137n7.b.g();
        if (objG == p137n7.b.g()) {
            p147o7.h.c(eVar);
        }
        return objG;
    }

    public final java.lang.Object b() {
        java.lang.Object objA;
        while (true) {
            java.lang.Object objB = this.f46729F;
            p127m7.e eVar = this.f46728E;
            if (eVar == null) {
                p087i7.x.b(objB);
                return objB;
            }
            if (p087i7.w.d(p087i7.AbstractC6656b.f46725a, objB)) {
                try {
                    p237x7.q qVar = this.f46726C;
                    java.lang.Object obj = this.f46727D;
                    objA = !(qVar instanceof p147o7.a) ? p137n7.b.f(qVar, this, obj, eVar) : ((p237x7.q) p247y7.W.f(qVar, 3)).j(this, obj, eVar);
                    if (objA != p137n7.b.g()) {
                        objB = p087i7.w.b(objA);
                    }
                } catch (java.lang.Throwable th) {
                    i7.w.a aVar = p087i7.w.f46751D;
                    objA = p087i7.x.a(th);
                }
            } else {
                this.f46729F = p087i7.AbstractC6656b.f46725a;
            }
            eVar.t(objB);
        }
    }

    @Override // p127m7.e
    public p127m7.i getContext() {
        return p127m7.j.f51198C;
    }

    @Override // p127m7.e
    public void t(java.lang.Object obj) {
        this.f46728E = null;
        this.f46729F = obj;
    }
}
