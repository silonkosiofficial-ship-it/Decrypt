package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5341uK0 implements com.google.android.gms.internal.ads.InterfaceExecutorC5451vK0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ java.util.concurrent.Executor f39144C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5000rF f39145D;

    C5341uK0(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.InterfaceC5000rF interfaceC5000rF) {
        this.f39144C = executor;
        this.f39145D = interfaceC5000rF;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceExecutorC5451vK0
    public final void a() {
        this.f39145D.b(this.f39144C);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.f39144C.execute(runnable);
    }
}
