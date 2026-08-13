package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2078j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.lifecycle.C2078j f22817a = new androidx.lifecycle.C2078j();

    /* JADX INFO: renamed from: androidx.lifecycle.j$a */
    public static final class a implements x2.d.a {
        @Override // x2.d.a
        public void a(p233x2.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "owner");
            if (!(fVar instanceof androidx.lifecycle.Y)) {
                throw new java.lang.IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            androidx.lifecycle.X xN = ((androidx.lifecycle.Y) fVar).n();
            p233x2.d dVarP = fVar.p();
            java.util.Iterator it = xN.c().iterator();
            while (it.hasNext()) {
                androidx.lifecycle.T tB = xN.b((java.lang.String) it.next());
                p247y7.AbstractC7350t.c(tB);
                androidx.lifecycle.C2078j.a(tB, dVarP, fVar.u());
            }
            if (!xN.c().isEmpty()) {
                dVarP.i(androidx.lifecycle.C2078j.a.class);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.j$b */
    public static final class b implements androidx.lifecycle.InterfaceC2083o {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.AbstractC2079k f22818C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p233x2.d f22819D;

        b(androidx.lifecycle.AbstractC2079k abstractC2079k, p233x2.d dVar) {
            this.f22818C = abstractC2079k;
            this.f22819D = dVar;
        }

        @Override // androidx.lifecycle.InterfaceC2083o
        public void i(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
            p247y7.AbstractC7350t.f(rVar, "source");
            p247y7.AbstractC7350t.f(aVar, "event");
            if (aVar == androidx.lifecycle.AbstractC2079k.a.ON_START) {
                this.f22818C.d(this);
                this.f22819D.i(androidx.lifecycle.C2078j.a.class);
            }
        }
    }

    private C2078j() {
    }

    public static final void a(androidx.lifecycle.T t6, p233x2.d dVar, androidx.lifecycle.AbstractC2079k abstractC2079k) {
        p247y7.AbstractC7350t.f(t6, "viewModel");
        p247y7.AbstractC7350t.f(dVar, "registry");
        p247y7.AbstractC7350t.f(abstractC2079k, "lifecycle");
        androidx.lifecycle.K k6 = (androidx.lifecycle.K) t6.f("androidx.lifecycle.savedstate.vm.tag");
        if (k6 == null || k6.s()) {
            return;
        }
        k6.a(dVar, abstractC2079k);
        f22817a.c(dVar, abstractC2079k);
    }

    public static final androidx.lifecycle.K b(p233x2.d dVar, androidx.lifecycle.AbstractC2079k abstractC2079k, java.lang.String str, android.os.Bundle bundle) {
        p247y7.AbstractC7350t.f(dVar, "registry");
        p247y7.AbstractC7350t.f(abstractC2079k, "lifecycle");
        p247y7.AbstractC7350t.c(str);
        androidx.lifecycle.K k6 = new androidx.lifecycle.K(str, androidx.lifecycle.I.f22755f.a(dVar.b(str), bundle));
        k6.a(dVar, abstractC2079k);
        f22817a.c(dVar, abstractC2079k);
        return k6;
    }

    private final void c(p233x2.d dVar, androidx.lifecycle.AbstractC2079k abstractC2079k) {
        androidx.lifecycle.AbstractC2079k.b bVarB = abstractC2079k.b();
        if (bVarB == androidx.lifecycle.AbstractC2079k.b.INITIALIZED || bVarB.g(androidx.lifecycle.AbstractC2079k.b.STARTED)) {
            dVar.i(androidx.lifecycle.C2078j.a.class);
        } else {
            abstractC2079k.a(new androidx.lifecycle.C2078j.b(abstractC2079k, dVar));
        }
    }
}
