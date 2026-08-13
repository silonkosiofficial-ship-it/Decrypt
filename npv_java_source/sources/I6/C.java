package I6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final fa.d f5095a = Z6.a.a("io.ktor.client.plugins.HttpRequestLifecycle");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final J6.b f5096b = J6.i.c("RequestLifecycle", new p237x7.l() { // from class: I6.z
        @Override // p237x7.l
        public final java.lang.Object l(java.lang.Object obj) {
            return I6.C.d((J6.d) obj);
        }
    });

    static final class a extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5097G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5098H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5099I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ J6.d f5100J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(J6.d dVar, p127m7.e eVar) {
            super(3, eVar);
            this.f5100J = dVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            W8.InterfaceC1819y interfaceC1819y;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f5097G;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC1819y = (W8.InterfaceC1819y) this.f5098H;
                try {
                    p087i7.x.b(obj);
                    interfaceC1819y.K0();
                    return p087i7.M.f46721a;
                } catch (java.lang.Throwable th) {
                    th = th;
                    try {
                        interfaceC1819y.g(th);
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        interfaceC1819y.K0();
                        throw th2;
                    }
                }
            }
            p087i7.x.b(obj);
            O6.d dVar = (O6.d) this.f5098H;
            p237x7.l lVar = (p237x7.l) this.f5099I;
            W8.InterfaceC1819y interfaceC1819yA = W8.U0.a(dVar.h());
            m7.i.b bVarI = this.f5100J.b().getCoroutineContext().i(W8.InterfaceC1822z0.f15544h);
            p247y7.AbstractC7350t.c(bVarI);
            I6.C.f(interfaceC1819yA, (W8.InterfaceC1822z0) bVarI);
            try {
                dVar.o(interfaceC1819yA);
                this.f5098H = interfaceC1819yA;
                this.f5097G = 1;
                if (lVar.l(this) == objG) {
                    return objG;
                }
                interfaceC1819y = interfaceC1819yA;
                interfaceC1819y.K0();
                return p087i7.M.f46721a;
            } catch (java.lang.Throwable th3) {
                th = th3;
                interfaceC1819y = interfaceC1819yA;
                interfaceC1819y.g(th);
                throw th;
            }
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(O6.d dVar, p237x7.l lVar, p127m7.e eVar) {
            I6.C.a aVar = new I6.C.a(this.f5100J, eVar);
            aVar.f5098H = dVar;
            aVar.f5099I = lVar;
            return aVar.B(p087i7.M.f46721a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M d(J6.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "$this$createClientPlugin");
        dVar.f(I6.U.f5160a, new I6.C.a(dVar, null));
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final W8.InterfaceC1819y interfaceC1819y, W8.InterfaceC1822z0 interfaceC1822z0) {
        final W8.InterfaceC1783f0 interfaceC1783f0E1 = interfaceC1822z0.e1(new p237x7.l() { // from class: I6.A
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return I6.C.g(interfaceC1819y, (java.lang.Throwable) obj);
            }
        });
        interfaceC1819y.e1(new p237x7.l() { // from class: I6.B
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return I6.C.h(interfaceC1783f0E1, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M g(W8.InterfaceC1819y interfaceC1819y, java.lang.Throwable th) {
        if (th != null) {
            f5095a.g("Cancelling request because engine Job failed with error: " + th);
            W8.C0.c(interfaceC1819y, "Engine failed", th);
        } else {
            f5095a.g("Cancelling request because engine Job completed");
            interfaceC1819y.K0();
        }
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M h(W8.InterfaceC1783f0 interfaceC1783f0, java.lang.Throwable th) {
        interfaceC1783f0.e();
        return p087i7.M.f46721a;
    }

    public static final J6.b i() {
        return f5096b;
    }
}
