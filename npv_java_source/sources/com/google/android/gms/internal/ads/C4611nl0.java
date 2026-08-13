package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4611nl0 extends com.google.android.gms.internal.ads.Vk0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5158sk0 f37645E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.RunnableFutureC4831pl0 f37646F;

    C4611nl0(com.google.android.gms.internal.ads.RunnableFutureC4831pl0 runnableFutureC4831pl0, com.google.android.gms.internal.ads.InterfaceC5158sk0 interfaceC5158sk0) {
        this.f37646F = runnableFutureC4831pl0;
        this.f37645E = interfaceC5158sk0;
    }

    @Override // com.google.android.gms.internal.ads.Vk0
    final /* bridge */ /* synthetic */ java.lang.Object a() {
        com.google.android.gms.internal.ads.InterfaceC5158sk0 interfaceC5158sk0 = this.f37645E;
        P4.d dVarA = interfaceC5158sk0.a();
        com.google.android.gms.internal.ads.AbstractC2164Ag0.d(dVarA, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC5158sk0);
        return dVarA;
    }

    @Override // com.google.android.gms.internal.ads.Vk0
    final java.lang.String b() {
        return this.f37645E.toString();
    }

    @Override // com.google.android.gms.internal.ads.Vk0
    final void d(java.lang.Throwable th) {
        this.f37646F.h(th);
    }

    @Override // com.google.android.gms.internal.ads.Vk0
    final /* synthetic */ void e(java.lang.Object obj) {
        this.f37646F.v((P4.d) obj);
    }

    @Override // com.google.android.gms.internal.ads.Vk0
    final boolean f() {
        return this.f37646F.isDone();
    }
}
