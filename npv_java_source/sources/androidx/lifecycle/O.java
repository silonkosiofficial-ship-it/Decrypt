package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class O extends androidx.lifecycle.V.e implements androidx.lifecycle.V.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.app.Application f22775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.V.c f22776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.os.Bundle f22777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.lifecycle.AbstractC2079k f22778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p233x2.d f22779e;

    public O(android.app.Application application, p233x2.f fVar, android.os.Bundle bundle) {
        p247y7.AbstractC7350t.f(fVar, "owner");
        this.f22779e = fVar.p();
        this.f22778d = fVar.u();
        this.f22777c = bundle;
        this.f22775a = application;
        this.f22776b = application != null ? androidx.lifecycle.V.a.f22793e.a(application) : new androidx.lifecycle.V.a();
    }

    @Override // androidx.lifecycle.V.c
    public androidx.lifecycle.T a(java.lang.Class cls) {
        p247y7.AbstractC7350t.f(cls, "modelClass");
        java.lang.String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return e(canonicalName, cls);
        }
        throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.V.c
    public /* synthetic */ androidx.lifecycle.T b(F7.c cVar, p023c2.a aVar) {
        return androidx.lifecycle.W.a(this, cVar, aVar);
    }

    @Override // androidx.lifecycle.V.c
    public androidx.lifecycle.T c(java.lang.Class cls, p023c2.a aVar) {
        p247y7.AbstractC7350t.f(cls, "modelClass");
        p247y7.AbstractC7350t.f(aVar, "extras");
        java.lang.String str = (java.lang.String) aVar.a(androidx.lifecycle.V.d.f22799c);
        if (str == null) {
            throw new java.lang.IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (aVar.a(androidx.lifecycle.L.f22766a) == null || aVar.a(androidx.lifecycle.L.f22767b) == null) {
            if (this.f22778d != null) {
                return e(str, cls);
            }
            throw new java.lang.IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        android.app.Application application = (android.app.Application) aVar.a(androidx.lifecycle.V.a.f22795g);
        boolean zIsAssignableFrom = androidx.lifecycle.AbstractC2069a.class.isAssignableFrom(cls);
        java.lang.reflect.Constructor constructorC = androidx.lifecycle.P.c(cls, (!zIsAssignableFrom || application == null) ? androidx.lifecycle.P.f22781b : androidx.lifecycle.P.f22780a);
        if (constructorC == null) {
            return this.f22776b.c(cls, aVar);
        }
        return (!zIsAssignableFrom || application == null) ? androidx.lifecycle.P.d(cls, constructorC, androidx.lifecycle.L.a(aVar)) : androidx.lifecycle.P.d(cls, constructorC, application, androidx.lifecycle.L.a(aVar));
    }

    @Override // androidx.lifecycle.V.e
    public void d(androidx.lifecycle.T t6) {
        p247y7.AbstractC7350t.f(t6, "viewModel");
        if (this.f22778d != null) {
            p233x2.d dVar = this.f22779e;
            p247y7.AbstractC7350t.c(dVar);
            androidx.lifecycle.AbstractC2079k abstractC2079k = this.f22778d;
            p247y7.AbstractC7350t.c(abstractC2079k);
            androidx.lifecycle.C2078j.a(t6, dVar, abstractC2079k);
        }
    }

    public final androidx.lifecycle.T e(java.lang.String str, java.lang.Class cls) {
        androidx.lifecycle.T tD;
        android.app.Application application;
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(cls, "modelClass");
        androidx.lifecycle.AbstractC2079k abstractC2079k = this.f22778d;
        if (abstractC2079k == null) {
            throw new java.lang.UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = androidx.lifecycle.AbstractC2069a.class.isAssignableFrom(cls);
        java.lang.reflect.Constructor constructorC = androidx.lifecycle.P.c(cls, (!zIsAssignableFrom || this.f22775a == null) ? androidx.lifecycle.P.f22781b : androidx.lifecycle.P.f22780a);
        if (constructorC == null) {
            return this.f22775a != null ? this.f22776b.a(cls) : androidx.lifecycle.V.d.f22797a.a().a(cls);
        }
        p233x2.d dVar = this.f22779e;
        p247y7.AbstractC7350t.c(dVar);
        androidx.lifecycle.K kB = androidx.lifecycle.C2078j.b(dVar, abstractC2079k, str, this.f22777c);
        if (!zIsAssignableFrom || (application = this.f22775a) == null) {
            tD = androidx.lifecycle.P.d(cls, constructorC, kB.r());
        } else {
            p247y7.AbstractC7350t.c(application);
            tD = androidx.lifecycle.P.d(cls, constructorC, application, kB.r());
        }
        tD.d("androidx.lifecycle.savedstate.vm.tag", kB);
        return tD;
    }
}
