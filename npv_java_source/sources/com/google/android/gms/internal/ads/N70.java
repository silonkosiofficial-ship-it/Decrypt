package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class N70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Deque f30180a = new java.util.concurrent.LinkedBlockingDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Callable f30181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f30182c;

    public N70(java.util.concurrent.Callable callable, com.google.android.gms.internal.ads.Yk0 yk0) {
        this.f30181b = callable;
        this.f30182c = yk0;
    }

    public final synchronized P4.d a() {
        c(1);
        return (P4.d) this.f30180a.poll();
    }

    public final synchronized void b(P4.d dVar) {
        this.f30180a.addFirst(dVar);
    }

    public final synchronized void c(int i6) {
        int size = i6 - this.f30180a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f30180a.add(this.f30182c.H0(this.f30181b));
        }
    }
}
