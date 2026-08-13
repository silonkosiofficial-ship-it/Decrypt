package P3;

/* JADX INFO: loaded from: classes.dex */
final class D implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.internal.LifecycleCallback f8303C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ java.lang.String f8304D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ P3.E f8305E;

    D(P3.E e6, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback, java.lang.String str) {
        this.f8305E = e6;
        this.f8303C = lifecycleCallback;
        this.f8304D = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Bundle bundle;
        P3.E e6 = this.f8305E;
        if (e6.f8308G0 > 0) {
            com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback = this.f8303C;
            if (e6.f8309H0 != null) {
                bundle = e6.f8309H0.getBundle(this.f8304D);
            } else {
                bundle = null;
            }
            lifecycleCallback.f(bundle);
        }
        if (this.f8305E.f8308G0 >= 2) {
            this.f8303C.j();
        }
        if (this.f8305E.f8308G0 >= 3) {
            this.f8303C.h();
        }
        if (this.f8305E.f8308G0 >= 4) {
            this.f8303C.k();
        }
        if (this.f8305E.f8308G0 >= 5) {
            this.f8303C.g();
        }
    }
}
