package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ek0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2320Ek0 extends com.google.android.gms.internal.ads.AbstractC2283Dk0 {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final P4.d f27101J;

    C2320Ek0(P4.d dVar) {
        dVar.getClass();
        this.f27101J = dVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3183ak0, java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return this.f27101J.cancel(z6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3183ak0, P4.d
    public final void e(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.f27101J.e(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3183ak0, java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.f27101J.get();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3183ak0, java.util.concurrent.Future
    public final java.lang.Object get(long j6, java.util.concurrent.TimeUnit timeUnit) {
        return this.f27101J.get(j6, timeUnit);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3183ak0, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f27101J.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3183ak0, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f27101J.isDone();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3183ak0
    public final java.lang.String toString() {
        return this.f27101J.toString();
    }
}
