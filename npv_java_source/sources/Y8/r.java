package Y8;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class r {

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f16562G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f16563H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ Y8.C f16564I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f16565J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Y8.C c6, java.lang.Object obj, p127m7.e eVar) {
            super(2, eVar);
            this.f16564I = c6;
            this.f16565J = obj;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objB;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f16562G;
            try {
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    Y8.C c6 = this.f16564I;
                    java.lang.Object obj2 = this.f16565J;
                    i7.w.a aVar = p087i7.w.f46751D;
                    this.f16562G = 1;
                    if (c6.h(obj2, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                objB = p087i7.w.b(p087i7.M.f46721a);
            } catch (java.lang.Throwable th) {
                i7.w.a aVar2 = p087i7.w.f46751D;
                objB = p087i7.w.b(p087i7.x.a(th));
            }
            return Y8.n.b(p087i7.w.h(objB) ? Y8.n.f16556b.c(p087i7.M.f46721a) : Y8.n.f16556b.a(p087i7.w.e(objB)));
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((Y8.r.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            Y8.r.a aVar = new Y8.r.a(this.f16564I, this.f16565J, eVar);
            aVar.f16563H = obj;
            return aVar;
        }
    }

    public static final java.lang.Object a(Y8.C c6, java.lang.Object obj) {
        java.lang.Object objJ = c6.j(obj);
        if (objJ instanceof Y8.n.c) {
            return ((Y8.n) W8.AbstractC1786h.b(null, new Y8.r.a(c6, obj, null), 1, null)).l();
        }
        return Y8.n.f16556b.c(p087i7.M.f46721a);
    }
}
