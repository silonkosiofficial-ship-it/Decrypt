package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ol0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4721ol0 extends com.google.android.gms.internal.ads.Vk0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.concurrent.Callable f37859E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.RunnableFutureC4831pl0 f37860F;

    C4721ol0(com.google.android.gms.internal.ads.RunnableFutureC4831pl0 runnableFutureC4831pl0, java.util.concurrent.Callable callable) {
        this.f37860F = runnableFutureC4831pl0;
        callable.getClass();
        this.f37859E = callable;
    }

    @Override // com.google.android.gms.internal.ads.Vk0
    final java.lang.Object a() {
        return this.f37859E.call();
    }

    @Override // com.google.android.gms.internal.ads.Vk0
    final java.lang.String b() {
        return this.f37859E.toString();
    }

    @Override // com.google.android.gms.internal.ads.Vk0
    final void d(java.lang.Throwable th) {
        this.f37860F.h(th);
    }

    @Override // com.google.android.gms.internal.ads.Vk0
    final void e(java.lang.Object obj) {
        this.f37860F.f(obj);
    }

    @Override // com.google.android.gms.internal.ads.Vk0
    final boolean f() {
        return this.f37860F.isDone();
    }
}
