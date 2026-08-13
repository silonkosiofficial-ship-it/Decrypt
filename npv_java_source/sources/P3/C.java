package P3;

/* JADX INFO: loaded from: classes.dex */
public final class C extends android.app.Fragment implements P3.InterfaceC1449e {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final java.util.WeakHashMap f8299F = new java.util.WeakHashMap();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.Map f8300C = j$.util.DesugarCollections.synchronizedMap(new p170r.C7026a());

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f8301D = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private android.os.Bundle f8302E;

    public static P3.C f(android.app.Activity activity) {
        P3.C c6;
        java.util.WeakHashMap weakHashMap = f8299F;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (c6 = (P3.C) weakReference.get()) != null) {
            return c6;
        }
        try {
            P3.C c10 = (P3.C) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (c10 == null || c10.isRemoving()) {
                c10 = new P3.C();
                activity.getFragmentManager().beginTransaction().add(c10, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new java.lang.ref.WeakReference(c10));
            return c10;
        } catch (java.lang.ClassCastException e6) {
            throw new java.lang.IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e6);
        }
    }

    @Override // P3.InterfaceC1449e
    public final void a(java.lang.String str, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback) {
        if (this.f8300C.containsKey(str)) {
            throw new java.lang.IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f8300C.put(str, lifecycleCallback);
        if (this.f8301D > 0) {
            new p045e4.e(android.os.Looper.getMainLooper()).post(new P3.B(this, lifecycleCallback, str));
        }
    }

    @Override // P3.InterfaceC1449e
    public final com.google.android.gms.common.api.internal.LifecycleCallback c(java.lang.String str, java.lang.Class cls) {
        return (com.google.android.gms.common.api.internal.LifecycleCallback) cls.cast(this.f8300C.get(str));
    }

    @Override // P3.InterfaceC1449e
    public final android.app.Activity d() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        java.util.Iterator it = this.f8300C.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i6, int i10, android.content.Intent intent) {
        super.onActivityResult(i6, i10, intent);
        java.util.Iterator it = this.f8300C.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).e(i6, i10, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f8301D = 1;
        this.f8302E = bundle;
        for (java.util.Map.Entry entry : this.f8300C.entrySet()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((java.lang.String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f8301D = 5;
        java.util.Iterator it = this.f8300C.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f8301D = 3;
        java.util.Iterator it = this.f8300C.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (java.util.Map.Entry entry : this.f8300C.entrySet()) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            ((com.google.android.gms.common.api.internal.LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((java.lang.String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f8301D = 2;
        java.util.Iterator it = this.f8300C.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f8301D = 4;
        java.util.Iterator it = this.f8300C.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).k();
        }
    }
}
