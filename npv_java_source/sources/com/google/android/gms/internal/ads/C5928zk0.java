package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5928zk0 extends com.google.android.gms.internal.ads.AbstractC4499mk0 {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC5818yk0 f40368R;

    C5928zk0(com.google.android.gms.internal.ads.AbstractC3011Xh0 abstractC3011Xh0, boolean z6, java.util.concurrent.Executor executor, java.util.concurrent.Callable callable) {
        super(abstractC3011Xh0, z6, false);
        this.f40368R = new com.google.android.gms.internal.ads.C5708xk0(this, callable, executor);
        T();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4499mk0
    final void R(int i6, java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4499mk0
    final void S() {
        com.google.android.gms.internal.ads.AbstractC5818yk0 abstractC5818yk0 = this.f40368R;
        if (abstractC5818yk0 != null) {
            abstractC5818yk0.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4499mk0
    final void W(int i6) {
        super.W(i6);
        if (i6 == 1) {
            this.f40368R = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3183ak0
    protected final void t() {
        com.google.android.gms.internal.ads.AbstractC5818yk0 abstractC5818yk0 = this.f40368R;
        if (abstractC5818yk0 != null) {
            abstractC5818yk0.g();
        }
    }
}
