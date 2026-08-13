package p073h2;

/* JADX INFO: renamed from: h2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6627d {

    /* JADX INFO: renamed from: h2.d$a */
    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f46129G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f46130H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ W8.InterfaceC1822z0 f46131I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.p f46132J;

        /* JADX INFO: renamed from: h2.d$a$a, reason: collision with other inner class name */
        static final class C0545a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p073h2.T f46133D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0545a(p073h2.T t6) {
                super(1);
                this.f46133D = t6;
            }

            public final void a(java.lang.Throwable th) {
                Y8.C.a.a(this.f46133D, null, 1, null);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((java.lang.Throwable) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(W8.InterfaceC1822z0 interfaceC1822z0, p237x7.p pVar, p127m7.e eVar) {
            super(2, eVar);
            this.f46131I = interfaceC1822z0;
            this.f46132J = pVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f46129G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p073h2.T t6 = (p073h2.T) this.f46130H;
                this.f46131I.e1(new p073h2.AbstractC6627d.a.C0545a(t6));
                p237x7.p pVar = this.f46132J;
                this.f46129G = 1;
                if (pVar.u(t6, this) == objG) {
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
        public final java.lang.Object u(p073h2.T t6, p127m7.e eVar) {
            return ((p073h2.AbstractC6627d.a) x(t6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            p073h2.AbstractC6627d.a aVar = new p073h2.AbstractC6627d.a(this.f46131I, this.f46132J, eVar);
            aVar.f46130H = obj;
            return aVar;
        }
    }

    public static final Z8.InterfaceC1869f a(W8.InterfaceC1822z0 interfaceC1822z0, p237x7.p pVar) {
        p247y7.AbstractC7350t.f(interfaceC1822z0, "controller");
        p247y7.AbstractC7350t.f(pVar, "block");
        return p073h2.S.a(new p073h2.AbstractC6627d.a(interfaceC1822z0, pVar, null));
    }
}
