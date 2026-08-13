package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2489Jc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.BlockingQueue f28726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.ThreadPoolExecutor f28727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.ArrayDeque f28728c = new java.util.ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractAsyncTaskC2452Ic0 f28729d = null;

    public C2489Jc0() {
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue();
        this.f28726a = linkedBlockingQueue;
        this.f28727b = new java.util.concurrent.ThreadPoolExecutor(1, 1, 1L, java.util.concurrent.TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void c() {
        com.google.android.gms.internal.ads.AbstractAsyncTaskC2452Ic0 abstractAsyncTaskC2452Ic0 = (com.google.android.gms.internal.ads.AbstractAsyncTaskC2452Ic0) this.f28728c.poll();
        this.f28729d = abstractAsyncTaskC2452Ic0;
        if (abstractAsyncTaskC2452Ic0 != null) {
            abstractAsyncTaskC2452Ic0.executeOnExecutor(this.f28727b, new java.lang.Object[0]);
        }
    }

    public final void a(com.google.android.gms.internal.ads.AbstractAsyncTaskC2452Ic0 abstractAsyncTaskC2452Ic0) {
        this.f28729d = null;
        c();
    }

    public final void b(com.google.android.gms.internal.ads.AbstractAsyncTaskC2452Ic0 abstractAsyncTaskC2452Ic0) {
        abstractAsyncTaskC2452Ic0.b(this);
        this.f28728c.add(abstractAsyncTaskC2452Ic0);
        if (this.f28729d == null) {
            c();
        }
    }
}
