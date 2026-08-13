package p071h0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final W8.InterfaceC1822z0 f45857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.Object f45858b;

        public a(W8.InterfaceC1822z0 interfaceC1822z0, java.lang.Object obj) {
            this.f45857a = interfaceC1822z0;
            this.f45858b = obj;
        }

        public final W8.InterfaceC1822z0 a() {
            return this.f45857a;
        }

        public final java.lang.Object b() {
            return this.f45858b;
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f45859G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f45860H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.l f45861I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ java.util.concurrent.atomic.AtomicReference f45862J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p237x7.p f45863K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p237x7.l lVar, java.util.concurrent.atomic.AtomicReference atomicReference, p237x7.p pVar, p127m7.e eVar) {
            super(2, eVar);
            this.f45861I = lVar;
            this.f45862J = atomicReference;
            this.f45863K = pVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) throws java.lang.Throwable {
            h0.o.a aVar;
            W8.InterfaceC1822z0 interfaceC1822z0A;
            h0.o.a aVar2;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f45859G;
            try {
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    W8.N n6 = (W8.N) this.f45860H;
                    aVar = new h0.o.a(W8.C0.m(n6.getCoroutineContext()), this.f45861I.l(n6));
                    h0.o.a aVar3 = (h0.o.a) this.f45862J.getAndSet(aVar);
                    if (aVar3 != null && (interfaceC1822z0A = aVar3.a()) != null) {
                        this.f45860H = aVar;
                        this.f45859G = 1;
                        if (W8.C0.g(interfaceC1822z0A, this) == objG) {
                            return objG;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (h0.o.a) this.f45860H;
                        try {
                            p087i7.x.b(obj);
                            p200u.AbstractC7162c0.a(this.f45862J, aVar2, null);
                            return obj;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            p200u.AbstractC7162c0.a(this.f45862J, aVar2, null);
                            throw th;
                        }
                    }
                    aVar = (h0.o.a) this.f45860H;
                    p087i7.x.b(obj);
                }
                p237x7.p pVar = this.f45863K;
                java.lang.Object objB = aVar.b();
                this.f45860H = aVar;
                this.f45859G = 2;
                obj = pVar.u(objB, this);
                if (obj == objG) {
                    return objG;
                }
                aVar2 = aVar;
                p200u.AbstractC7162c0.a(this.f45862J, aVar2, null);
                return obj;
            } catch (java.lang.Throwable th2) {
                th = th2;
                aVar2 = aVar;
                p200u.AbstractC7162c0.a(this.f45862J, aVar2, null);
                throw th;
            }
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((h0.o.b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            h0.o.b bVar = new h0.o.b(this.f45861I, this.f45862J, this.f45863K, eVar);
            bVar.f45860H = obj;
            return bVar;
        }
    }

    public static java.util.concurrent.atomic.AtomicReference a() {
        return b(new java.util.concurrent.atomic.AtomicReference(null));
    }

    private static java.util.concurrent.atomic.AtomicReference b(java.util.concurrent.atomic.AtomicReference atomicReference) {
        return atomicReference;
    }

    public static final java.lang.Object c(java.util.concurrent.atomic.AtomicReference atomicReference) {
        h0.o.a aVar = (h0.o.a) atomicReference.get();
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public static final java.lang.Object d(java.util.concurrent.atomic.AtomicReference atomicReference, p237x7.l lVar, p237x7.p pVar, p127m7.e eVar) {
        return W8.O.f(new h0.o.b(lVar, atomicReference, pVar, null), eVar);
    }
}
