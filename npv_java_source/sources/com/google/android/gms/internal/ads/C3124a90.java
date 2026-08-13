package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3124a90 implements P4.d {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f34018C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f34019D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final P4.d f34020E;

    public C3124a90(java.lang.Object obj, java.lang.String str, P4.d dVar) {
        this.f34018C = obj;
        this.f34019D = str;
        this.f34020E = dVar;
    }

    public final java.lang.Object a() {
        return this.f34018C;
    }

    public final java.lang.String b() {
        return this.f34019D;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return this.f34020E.cancel(z6);
    }

    @Override // P4.d
    public final void e(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.f34020E.e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.f34020E.get();
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j6, java.util.concurrent.TimeUnit timeUnit) {
        return this.f34020E.get(j6, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f34020E.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f34020E.isDone();
    }

    public final java.lang.String toString() {
        return this.f34019D + "@" + java.lang.System.identityHashCode(this);
    }
}
