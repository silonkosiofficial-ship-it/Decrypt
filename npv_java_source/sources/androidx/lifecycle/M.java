package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class M implements x2.d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p233x2.d f22769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.os.Bundle f22771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f22772d;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.Y f22773D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.lifecycle.Y y6) {
            super(0);
            this.f22773D = y6;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.N b() {
            return androidx.lifecycle.L.e(this.f22773D);
        }
    }

    public M(p233x2.d dVar, androidx.lifecycle.Y y6) {
        p247y7.AbstractC7350t.f(dVar, "savedStateRegistry");
        p247y7.AbstractC7350t.f(y6, "viewModelStoreOwner");
        this.f22769a = dVar;
        this.f22772d = p087i7.AbstractC6669o.b(new androidx.lifecycle.M.a(y6));
    }

    private final androidx.lifecycle.N c() {
        return (androidx.lifecycle.N) this.f22772d.getValue();
    }

    @Override // x2.d.c
    public android.os.Bundle a() {
        android.os.Bundle bundle = new android.os.Bundle();
        android.os.Bundle bundle2 = this.f22771c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (java.util.Map.Entry entry : c().h().entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            android.os.Bundle bundleA = ((androidx.lifecycle.I) entry.getValue()).c().a();
            if (!p247y7.AbstractC7350t.b(bundleA, android.os.Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f22770b = false;
        return bundle;
    }

    public final android.os.Bundle b(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "key");
        d();
        android.os.Bundle bundle = this.f22771c;
        android.os.Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        android.os.Bundle bundle3 = this.f22771c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        android.os.Bundle bundle4 = this.f22771c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f22771c = null;
        }
        return bundle2;
    }

    public final void d() {
        if (this.f22770b) {
            return;
        }
        android.os.Bundle bundleB = this.f22769a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        android.os.Bundle bundle = new android.os.Bundle();
        android.os.Bundle bundle2 = this.f22771c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleB != null) {
            bundle.putAll(bundleB);
        }
        this.f22771c = bundle;
        this.f22770b = true;
        c();
    }
}
