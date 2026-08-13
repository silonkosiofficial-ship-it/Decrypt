package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class K1 extends com.google.android.gms.internal.play_billing.AbstractRunnableC6308v1 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.concurrent.Callable f41428E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.play_billing.L1 f41429F;

    K1(com.google.android.gms.internal.play_billing.L1 l6, java.util.concurrent.Callable callable) {
        this.f41429F = l6;
        callable.getClass();
        this.f41428E = callable;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractRunnableC6308v1
    final java.lang.Object a() {
        return this.f41428E.call();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractRunnableC6308v1
    final java.lang.String b() {
        return this.f41428E.toString();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractRunnableC6308v1
    final void c(java.lang.Throwable th) {
        this.f41429F.p(th);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractRunnableC6308v1
    final void d(java.lang.Object obj) {
        this.f41429F.o(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractRunnableC6308v1
    final boolean f() {
        return this.f41429F.isDone();
    }
}
