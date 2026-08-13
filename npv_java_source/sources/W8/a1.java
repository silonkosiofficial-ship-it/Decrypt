package W8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a1 {

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        long f15483F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f15484G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f15485H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f15486I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f15487J;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f15486I = obj;
            this.f15487J |= Integer.MIN_VALUE;
            return W8.a1.e(0L, null, this);
        }
    }

    public static final W8.Y0 a(long j6, W8.X x6, W8.InterfaceC1822z0 interfaceC1822z0) {
        return new W8.Y0("Timed out waiting for " + j6 + " ms", interfaceC1822z0);
    }

    private static final java.lang.Object b(W8.Z0 z6, p237x7.p pVar) {
        W8.C0.j(z6, W8.Y.b(z6.f24391F.getContext()).m1(z6.f15480G, z6, z6.getContext()));
        return p029c9.b.c(z6, z6, pVar);
    }

    public static final java.lang.Object c(long j6, p237x7.p pVar, p127m7.e eVar) {
        if (j6 <= 0) {
            throw new W8.Y0("Timed out immediately");
        }
        java.lang.Object objB = b(new W8.Z0(j6, eVar), pVar);
        if (objB == p137n7.b.g()) {
            p147o7.h.c(eVar);
        }
        return objB;
    }

    public static final java.lang.Object d(long j6, p237x7.p pVar, p127m7.e eVar) {
        return c(W8.Y.c(j6), pVar, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object e(long j6, p237x7.p pVar, p127m7.e eVar) {
        W8.a1.a aVar;
        p247y7.O o6;
        if (eVar instanceof W8.a1.a) {
            aVar = (W8.a1.a) eVar;
            int i6 = aVar.f15487J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f15487J = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new W8.a1.a(eVar);
            }
        } else {
            aVar = new W8.a1.a(eVar);
        }
        java.lang.Object obj = aVar.f15486I;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f15487J;
        if (i10 == 0) {
            p087i7.x.b(obj);
            if (j6 <= 0) {
                return null;
            }
            p247y7.O o10 = new p247y7.O();
            try {
                aVar.f15484G = pVar;
                aVar.f15485H = o10;
                aVar.f15483F = j6;
                aVar.f15487J = 1;
                W8.Z0 z6 = new W8.Z0(j6, aVar);
                o10.f57254C = z6;
                java.lang.Object objB = b(z6, pVar);
                if (objB == p137n7.b.g()) {
                    p147o7.h.c(aVar);
                }
                return objB == objG ? objG : objB;
            } catch (W8.Y0 e6) {
                e = e6;
                o6 = o10;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o6 = (p247y7.O) aVar.f15485H;
            try {
                p087i7.x.b(obj);
                return obj;
            } catch (W8.Y0 e10) {
                e = e10;
            }
        }
        if (e.f15478C == o6.f57254C) {
            return null;
        }
        throw e;
    }

    public static final java.lang.Object f(long j6, p237x7.p pVar, p127m7.e eVar) {
        return e(W8.Y.c(j6), pVar, eVar);
    }
}
