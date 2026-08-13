package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3557e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f34887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Set f34888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.PriorityBlockingQueue f34889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.PriorityBlockingQueue f34890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.N6 f34891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.W6 f34892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.X6[] f34893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.android.gms.internal.ads.P6 f34894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.List f34895i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.List f34896j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.U6 f34897k;

    public C3557e7(com.google.android.gms.internal.ads.N6 n6, com.google.android.gms.internal.ads.W6 w6, int i6) {
        com.google.android.gms.internal.ads.U6 u6 = new com.google.android.gms.internal.ads.U6(new android.os.Handler(android.os.Looper.getMainLooper()));
        this.f34887a = new java.util.concurrent.atomic.AtomicInteger();
        this.f34888b = new java.util.HashSet();
        this.f34889c = new java.util.concurrent.PriorityBlockingQueue();
        this.f34890d = new java.util.concurrent.PriorityBlockingQueue();
        this.f34895i = new java.util.ArrayList();
        this.f34896j = new java.util.ArrayList();
        this.f34891e = n6;
        this.f34892f = w6;
        this.f34893g = new com.google.android.gms.internal.ads.X6[4];
        this.f34897k = u6;
    }

    public final com.google.android.gms.internal.ads.AbstractC3448d7 a(com.google.android.gms.internal.ads.AbstractC3448d7 abstractC3448d7) {
        abstractC3448d7.n(this);
        synchronized (this.f34888b) {
            this.f34888b.add(abstractC3448d7);
        }
        abstractC3448d7.o(this.f34887a.incrementAndGet());
        abstractC3448d7.v("add-to-queue");
        c(abstractC3448d7, 0);
        this.f34889c.add(abstractC3448d7);
        return abstractC3448d7;
    }

    final void b(com.google.android.gms.internal.ads.AbstractC3448d7 abstractC3448d7) {
        synchronized (this.f34888b) {
            this.f34888b.remove(abstractC3448d7);
        }
        synchronized (this.f34895i) {
            java.util.Iterator it = this.f34895i.iterator();
            if (it.hasNext()) {
                androidx.appcompat.app.D.a(it.next());
                throw null;
            }
        }
        c(abstractC3448d7, 5);
    }

    final void c(com.google.android.gms.internal.ads.AbstractC3448d7 abstractC3448d7, int i6) {
        synchronized (this.f34896j) {
            try {
                java.util.Iterator it = this.f34896j.iterator();
                if (it.hasNext()) {
                    androidx.appcompat.app.D.a(it.next());
                    throw null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        com.google.android.gms.internal.ads.P6 p6 = this.f34894h;
        if (p6 != null) {
            p6.b();
        }
        com.google.android.gms.internal.ads.X6[] x6Arr = this.f34893g;
        for (int i6 = 0; i6 < 4; i6++) {
            com.google.android.gms.internal.ads.X6 x6 = x6Arr[i6];
            if (x6 != null) {
                x6.a();
            }
        }
        com.google.android.gms.internal.ads.P6 p10 = new com.google.android.gms.internal.ads.P6(this.f34889c, this.f34890d, this.f34891e, this.f34897k);
        this.f34894h = p10;
        p10.start();
        for (int i10 = 0; i10 < 4; i10++) {
            com.google.android.gms.internal.ads.X6 x10 = new com.google.android.gms.internal.ads.X6(this.f34890d, this.f34892f, this.f34891e, this.f34897k);
            this.f34893g[i10] = x10;
            x10.start();
        }
    }
}
