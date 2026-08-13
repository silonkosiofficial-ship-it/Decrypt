package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c2.a.b f22766a = new androidx.lifecycle.L.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c2.a.b f22767b = new androidx.lifecycle.L.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c2.a.b f22768c = new androidx.lifecycle.L.a();

    public static final class a implements c2.a.b {
        a() {
        }
    }

    public static final class b implements c2.a.b {
        b() {
        }
    }

    public static final class c implements c2.a.b {
        c() {
        }
    }

    public static final class d implements androidx.lifecycle.V.c {
        d() {
        }

        @Override // androidx.lifecycle.V.c
        public /* synthetic */ androidx.lifecycle.T a(java.lang.Class cls) {
            return androidx.lifecycle.W.b(this, cls);
        }

        @Override // androidx.lifecycle.V.c
        public /* synthetic */ androidx.lifecycle.T b(F7.c cVar, p023c2.a aVar) {
            return androidx.lifecycle.W.a(this, cVar, aVar);
        }

        @Override // androidx.lifecycle.V.c
        public androidx.lifecycle.T c(java.lang.Class cls, p023c2.a aVar) {
            p247y7.AbstractC7350t.f(cls, "modelClass");
            p247y7.AbstractC7350t.f(aVar, "extras");
            return new androidx.lifecycle.N();
        }
    }

    public static final androidx.lifecycle.I a(p023c2.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "<this>");
        p233x2.f fVar = (p233x2.f) aVar.a(f22766a);
        if (fVar == null) {
            throw new java.lang.IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        androidx.lifecycle.Y y6 = (androidx.lifecycle.Y) aVar.a(f22767b);
        if (y6 == null) {
            throw new java.lang.IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        android.os.Bundle bundle = (android.os.Bundle) aVar.a(f22768c);
        java.lang.String str = (java.lang.String) aVar.a(androidx.lifecycle.V.d.f22799c);
        if (str != null) {
            return b(fVar, y6, str, bundle);
        }
        throw new java.lang.IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    private static final androidx.lifecycle.I b(p233x2.f fVar, androidx.lifecycle.Y y6, java.lang.String str, android.os.Bundle bundle) {
        androidx.lifecycle.M mD = d(fVar);
        androidx.lifecycle.N nE = e(y6);
        androidx.lifecycle.I i6 = (androidx.lifecycle.I) nE.h().get(str);
        if (i6 != null) {
            return i6;
        }
        androidx.lifecycle.I iA = androidx.lifecycle.I.f22755f.a(mD.b(str), bundle);
        nE.h().put(str, iA);
        return iA;
    }

    public static final void c(p233x2.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "<this>");
        androidx.lifecycle.AbstractC2079k.b bVarB = fVar.u().b();
        if (bVarB != androidx.lifecycle.AbstractC2079k.b.INITIALIZED && bVarB != androidx.lifecycle.AbstractC2079k.b.CREATED) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (fVar.p().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            androidx.lifecycle.M m6 = new androidx.lifecycle.M(fVar.p(), (androidx.lifecycle.Y) fVar);
            fVar.p().h("androidx.lifecycle.internal.SavedStateHandlesProvider", m6);
            fVar.u().a(new androidx.lifecycle.J(m6));
        }
    }

    public static final androidx.lifecycle.M d(p233x2.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "<this>");
        x2.d.c cVarC = fVar.p().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        androidx.lifecycle.M m6 = cVarC instanceof androidx.lifecycle.M ? (androidx.lifecycle.M) cVarC : null;
        if (m6 != null) {
            return m6;
        }
        throw new java.lang.IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final androidx.lifecycle.N e(androidx.lifecycle.Y y6) {
        p247y7.AbstractC7350t.f(y6, "<this>");
        return (androidx.lifecycle.N) new androidx.lifecycle.V(y6, new androidx.lifecycle.L.d()).d("androidx.lifecycle.internal.SavedStateHandlesVM", androidx.lifecycle.N.class);
    }
}
