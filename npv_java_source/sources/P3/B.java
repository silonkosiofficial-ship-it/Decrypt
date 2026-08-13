package P3;

/* JADX INFO: loaded from: classes.dex */
final class B implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.internal.LifecycleCallback f8296C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ java.lang.String f8297D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ P3.C f8298E;

    B(P3.C c6, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback, java.lang.String str) {
        this.f8298E = c6;
        this.f8296C = lifecycleCallback;
        this.f8297D = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Bundle bundle;
        P3.C c6 = this.f8298E;
        if (c6.f8301D > 0) {
            com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback = this.f8296C;
            if (c6.f8302E != null) {
                bundle = c6.f8302E.getBundle(this.f8297D);
            } else {
                bundle = null;
            }
            lifecycleCallback.f(bundle);
        }
        if (this.f8298E.f8301D >= 2) {
            this.f8296C.j();
        }
        if (this.f8298E.f8301D >= 3) {
            this.f8296C.h();
        }
        if (this.f8298E.f8301D >= 4) {
            this.f8296C.k();
        }
        if (this.f8298E.f8301D >= 5) {
            this.f8296C.g();
        }
    }
}
