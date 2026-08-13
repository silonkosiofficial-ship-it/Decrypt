package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public abstract class S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final V.O0 f19972a = V.AbstractC1756y.f(androidx.compose.ui.platform.S0.a.f19973D);

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.platform.S0.a f19973D = new androidx.compose.ui.platform.S0.a();

        a() {
            super(0);
        }

        public final androidx.compose.ui.platform.AbstractC1954l0 a() {
            return null;
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return null;
        }
    }

    static final class b extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        /* synthetic */ java.lang.Object f19974F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f19975G;

        b(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f19974F = obj;
            this.f19975G |= Integer.MIN_VALUE;
            return androidx.compose.ui.platform.S0.b(null, null, this);
        }
    }

    static final class c extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        /* synthetic */ java.lang.Object f19976F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f19977G;

        c(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f19976F = obj;
            this.f19977G |= Integer.MIN_VALUE;
            return androidx.compose.ui.platform.S0.c(null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object b(androidx.compose.ui.platform.R0 r6, p237x7.p pVar, p127m7.e eVar) {
        androidx.compose.ui.platform.S0.b bVar;
        if (eVar instanceof androidx.compose.ui.platform.S0.b) {
            bVar = (androidx.compose.ui.platform.S0.b) eVar;
            int i6 = bVar.f19975G;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.f19975G = i6 - Integer.MIN_VALUE;
            } else {
                bVar = new androidx.compose.ui.platform.S0.b(eVar);
            }
        } else {
            bVar = new androidx.compose.ui.platform.S0.b(eVar);
        }
        java.lang.Object obj = bVar.f19974F;
        java.lang.Object objG = p137n7.b.g();
        int i10 = bVar.f19975G;
        if (i10 == 0) {
            p087i7.x.b(obj);
            if (!r6.E0().A1()) {
                throw new java.lang.IllegalArgumentException("establishTextInputSession called from an unattached node".toString());
            }
            F0.o0 o0VarN = F0.AbstractC0925k.n(r6);
            androidx.appcompat.app.D.a(F0.AbstractC0925k.m(r6).J().b(f19972a));
            bVar.f19975G = 1;
            if (c(o0VarN, null, pVar, bVar) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
        }
        throw new p087i7.C6665k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object c(F0.o0 o0Var, androidx.compose.ui.platform.AbstractC1954l0 abstractC1954l0, p237x7.p pVar, p127m7.e eVar) {
        androidx.compose.ui.platform.S0.c cVar;
        if (eVar instanceof androidx.compose.ui.platform.S0.c) {
            cVar = (androidx.compose.ui.platform.S0.c) eVar;
            int i6 = cVar.f19977G;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cVar.f19977G = i6 - Integer.MIN_VALUE;
            } else {
                cVar = new androidx.compose.ui.platform.S0.c(eVar);
            }
        } else {
            cVar = new androidx.compose.ui.platform.S0.c(eVar);
        }
        java.lang.Object obj = cVar.f19976F;
        java.lang.Object objG = p137n7.b.g();
        int i10 = cVar.f19977G;
        if (i10 == 0) {
            p087i7.x.b(obj);
            cVar.f19977G = 1;
            if (o0Var.u(pVar, cVar) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
                throw new p087i7.C6665k();
            }
            p087i7.x.b(obj);
        }
        throw new p087i7.C6665k();
    }
}
