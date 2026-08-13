package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class SF0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.LH0 f31656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.CopyOnWriteArrayList f31657c;

    public SF0() {
        this(new java.util.concurrent.CopyOnWriteArrayList(), 0, null);
    }

    private SF0(java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList, int i6, com.google.android.gms.internal.ads.LH0 lh0) {
        this.f31657c = copyOnWriteArrayList;
        this.f31655a = 0;
        this.f31656b = lh0;
    }

    public final com.google.android.gms.internal.ads.SF0 a(int i6, com.google.android.gms.internal.ads.LH0 lh0) {
        return new com.google.android.gms.internal.ads.SF0(this.f31657c, 0, lh0);
    }

    public final void b(android.os.Handler handler, com.google.android.gms.internal.ads.TF0 tf0) {
        this.f31657c.add(new com.google.android.gms.internal.ads.QF0(handler, tf0));
    }

    public final void c(com.google.android.gms.internal.ads.TF0 tf0) {
        for (com.google.android.gms.internal.ads.QF0 qf0 : this.f31657c) {
            if (qf0.f30952a == tf0) {
                this.f31657c.remove(qf0);
            }
        }
    }
}
