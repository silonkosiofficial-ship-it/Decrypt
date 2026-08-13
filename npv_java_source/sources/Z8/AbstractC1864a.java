package Z8;

/* JADX INFO: renamed from: Z8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1864a implements Z8.InterfaceC1869f {

    /* JADX INFO: renamed from: Z8.a$a, reason: collision with other inner class name */
    static final class C0315a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f16807F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f16808G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f16810I;

        C0315a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f16808G = obj;
            this.f16810I |= Integer.MIN_VALUE;
            return Z8.AbstractC1864a.this.b(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // Z8.InterfaceC1869f
    public final java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) throws java.lang.Throwable {
        Z8.AbstractC1864a.C0315a c0315a;
        java.lang.Throwable th;
        p009a9.v vVar;
        if (eVar instanceof Z8.AbstractC1864a.C0315a) {
            c0315a = (Z8.AbstractC1864a.C0315a) eVar;
            int i6 = c0315a.f16810I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0315a.f16810I = i6 - Integer.MIN_VALUE;
            } else {
                c0315a = new Z8.AbstractC1864a.C0315a(eVar);
            }
        } else {
            c0315a = new Z8.AbstractC1864a.C0315a(eVar);
        }
        java.lang.Object obj = c0315a.f16808G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = c0315a.f16810I;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = (p009a9.v) c0315a.f16807F;
            try {
                p087i7.x.b(obj);
                vVar.D();
                return p087i7.M.f46721a;
            } catch (java.lang.Throwable th2) {
                th = th2;
                vVar.D();
                throw th;
            }
        }
        p087i7.x.b(obj);
        p009a9.v vVar2 = new p009a9.v(interfaceC1870g, c0315a.getContext());
        try {
            c0315a.f16807F = vVar2;
            c0315a.f16810I = 1;
            if (e(vVar2, c0315a) == objG) {
                return objG;
            }
            vVar = vVar2;
            vVar.D();
            return p087i7.M.f46721a;
        } catch (java.lang.Throwable th3) {
            th = th3;
            vVar = vVar2;
            vVar.D();
            throw th;
        }
    }

    public abstract java.lang.Object e(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar);
}
