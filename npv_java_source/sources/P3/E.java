package P3;

/* JADX INFO: loaded from: classes.dex */
public final class E extends androidx.fragment.app.f implements P3.InterfaceC1449e {

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private static final java.util.WeakHashMap f8306I0 = new java.util.WeakHashMap();

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private final java.util.Map f8307F0 = j$.util.DesugarCollections.synchronizedMap(new p170r.C7026a());

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private int f8308G0 = 0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private android.os.Bundle f8309H0;

    public static P3.E F1(androidx.fragment.app.g gVar) {
        P3.E e6;
        java.util.WeakHashMap weakHashMap = f8306I0;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) weakHashMap.get(gVar);
        if (weakReference != null && (e6 = (P3.E) weakReference.get()) != null) {
            return e6;
        }
        try {
            P3.E e10 = (P3.E) gVar.e0().f0("SupportLifecycleFragmentImpl");
            if (e10 == null || e10.f0()) {
                e10 = new P3.E();
                gVar.e0().m().d(e10, "SupportLifecycleFragmentImpl").g();
            }
            weakHashMap.put(gVar, new java.lang.ref.WeakReference(e10));
            return e10;
        } catch (java.lang.ClassCastException e11) {
            throw new java.lang.IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e11);
        }
    }

    @Override // androidx.fragment.app.f
    public final void J0() {
        super.J0();
        this.f8308G0 = 3;
        java.util.Iterator it = this.f8307F0.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).h();
        }
    }

    @Override // androidx.fragment.app.f
    public final void K0(android.os.Bundle bundle) {
        super.K0(bundle);
        if (bundle == null) {
            return;
        }
        for (java.util.Map.Entry entry : this.f8307F0.entrySet()) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            ((com.google.android.gms.common.api.internal.LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((java.lang.String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.f
    public final void L0() {
        super.L0();
        this.f8308G0 = 2;
        java.util.Iterator it = this.f8307F0.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).j();
        }
    }

    @Override // androidx.fragment.app.f
    public final void M0() {
        super.M0();
        this.f8308G0 = 4;
        java.util.Iterator it = this.f8307F0.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).k();
        }
    }

    @Override // P3.InterfaceC1449e
    public final void a(java.lang.String str, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback) {
        if (this.f8307F0.containsKey(str)) {
            throw new java.lang.IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f8307F0.put(str, lifecycleCallback);
        if (this.f8308G0 > 0) {
            new p045e4.e(android.os.Looper.getMainLooper()).post(new P3.D(this, lifecycleCallback, str));
        }
    }

    @Override // P3.InterfaceC1449e
    public final com.google.android.gms.common.api.internal.LifecycleCallback c(java.lang.String str, java.lang.Class cls) {
        return (com.google.android.gms.common.api.internal.LifecycleCallback) cls.cast(this.f8307F0.get(str));
    }

    @Override // P3.InterfaceC1449e
    public final /* synthetic */ android.app.Activity d() {
        return l();
    }

    @Override // androidx.fragment.app.f
    public final void g(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        java.util.Iterator it = this.f8307F0.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.f
    public final void j0(int i6, int i10, android.content.Intent intent) {
        super.j0(i6, i10, intent);
        java.util.Iterator it = this.f8307F0.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).e(i6, i10, intent);
        }
    }

    @Override // androidx.fragment.app.f
    public final void o0(android.os.Bundle bundle) {
        super.o0(bundle);
        this.f8308G0 = 1;
        this.f8309H0 = bundle;
        for (java.util.Map.Entry entry : this.f8307F0.entrySet()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((java.lang.String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.f
    public final void t0() {
        super.t0();
        this.f8308G0 = 5;
        java.util.Iterator it = this.f8307F0.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).g();
        }
    }
}
