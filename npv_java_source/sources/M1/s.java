package M1;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p059f9.a f6950a = p059f9.g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W8.InterfaceC1813v f6951b = W8.AbstractC1817x.b(null, 1, null);

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f6952F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f6953G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f6954H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f6956J;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f6954H = obj;
            this.f6956J |= Integer.MIN_VALUE;
            return M1.s.this.c(this);
        }
    }

    public final java.lang.Object a(p127m7.e eVar) {
        java.lang.Object objD1 = this.f6951b.d1(eVar);
        return objD1 == p137n7.b.g() ? objD1 : p087i7.M.f46721a;
    }

    protected abstract java.lang.Object b(p127m7.e eVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(p127m7.e eVar) throws java.lang.Throwable {
        M1.s.a aVar;
        p059f9.a aVar2;
        M1.s sVar;
        p059f9.a aVar3;
        java.lang.Throwable th;
        M1.s sVar2;
        if (eVar instanceof M1.s.a) {
            aVar = (M1.s.a) eVar;
            int i6 = aVar.f6956J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f6956J = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new M1.s.a(eVar);
            }
        } else {
            aVar = new M1.s.a(eVar);
        }
        java.lang.Object obj = aVar.f6954H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f6956J;
        try {
            if (i10 == 0) {
                p087i7.x.b(obj);
                if (this.f6951b.f1()) {
                    return p087i7.M.f46721a;
                }
                aVar2 = this.f6950a;
                aVar.f6952F = this;
                aVar.f6953G = aVar2;
                aVar.f6956J = 1;
                if (aVar2.c(null, aVar) == objG) {
                    return objG;
                }
                sVar = this;
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar3 = (p059f9.a) aVar.f6953G;
                    sVar2 = (M1.s) aVar.f6952F;
                    try {
                        p087i7.x.b(obj);
                        W8.InterfaceC1813v interfaceC1813v = sVar2.f6951b;
                        p087i7.M m6 = p087i7.M.f46721a;
                        interfaceC1813v.R0(m6);
                        aVar3.d(null);
                        return m6;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        aVar3.d(null);
                        throw th;
                    }
                }
                p059f9.a aVar4 = (p059f9.a) aVar.f6953G;
                sVar = (M1.s) aVar.f6952F;
                p087i7.x.b(obj);
                aVar2 = aVar4;
            }
            if (sVar.f6951b.f1()) {
                p087i7.M m10 = p087i7.M.f46721a;
                aVar2.d(null);
                return m10;
            }
            aVar.f6952F = sVar;
            aVar.f6953G = aVar2;
            aVar.f6956J = 2;
            if (sVar.b(aVar) == objG) {
                return objG;
            }
            aVar3 = aVar2;
            sVar2 = sVar;
            W8.InterfaceC1813v interfaceC1813v2 = sVar2.f6951b;
            p087i7.M m11 = p087i7.M.f46721a;
            interfaceC1813v2.R0(m11);
            aVar3.d(null);
            return m11;
        } catch (java.lang.Throwable th3) {
            aVar3 = aVar2;
            th = th3;
            aVar3.d(null);
            throw th;
        }
    }
}
