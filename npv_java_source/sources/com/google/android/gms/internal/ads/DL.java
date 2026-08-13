package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class DL {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4447mD f26671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5666xI f26672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BK f26673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.CopyOnWriteArraySet f26674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.ArrayDeque f26675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.ArrayDeque f26676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.Object f26677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f26678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f26679i;

    public DL(android.os.Looper looper, com.google.android.gms.internal.ads.InterfaceC4447mD interfaceC4447mD, com.google.android.gms.internal.ads.BK bk) {
        this(new java.util.concurrent.CopyOnWriteArraySet(), looper, interfaceC4447mD, bk, true);
    }

    private DL(java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet, android.os.Looper looper, com.google.android.gms.internal.ads.InterfaceC4447mD interfaceC4447mD, com.google.android.gms.internal.ads.BK bk, boolean z6) {
        this.f26671a = interfaceC4447mD;
        this.f26674d = copyOnWriteArraySet;
        this.f26673c = bk;
        this.f26677g = new java.lang.Object();
        this.f26675e = new java.util.ArrayDeque();
        this.f26676f = new java.util.ArrayDeque();
        this.f26672b = interfaceC4447mD.d(looper, new android.os.Handler.Callback() { // from class: com.google.android.gms.internal.ads.YI
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                com.google.android.gms.internal.ads.DL.g(this.f33331C, message);
                return true;
            }
        });
        this.f26679i = z6;
    }

    public static /* synthetic */ boolean g(com.google.android.gms.internal.ads.DL dl, android.os.Message message) {
        java.util.Iterator it = dl.f26674d.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.C3366cL) it.next()).b(dl.f26673c);
            if (dl.f26672b.D(1)) {
                break;
            }
        }
        return true;
    }

    private final void h() {
        if (this.f26679i) {
            com.google.android.gms.internal.ads.LC.f(java.lang.Thread.currentThread() == this.f26672b.a().getThread());
        }
    }

    public final com.google.android.gms.internal.ads.DL a(android.os.Looper looper, com.google.android.gms.internal.ads.BK bk) {
        return new com.google.android.gms.internal.ads.DL(this.f26674d, looper, this.f26671a, bk, this.f26679i);
    }

    public final void b(java.lang.Object obj) {
        synchronized (this.f26677g) {
            try {
                if (this.f26678h) {
                    return;
                }
                this.f26674d.add(new com.google.android.gms.internal.ads.C3366cL(obj));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        h();
        if (this.f26676f.isEmpty()) {
            return;
        }
        if (!this.f26672b.D(1)) {
            com.google.android.gms.internal.ads.InterfaceC5666xI interfaceC5666xI = this.f26672b;
            interfaceC5666xI.p(interfaceC5666xI.B(1));
        }
        boolean z6 = !this.f26675e.isEmpty();
        this.f26675e.addAll(this.f26676f);
        this.f26676f.clear();
        if (z6) {
            return;
        }
        while (!this.f26675e.isEmpty()) {
            ((java.lang.Runnable) this.f26675e.peekFirst()).run();
            this.f26675e.removeFirst();
        }
    }

    public final void d(final int i6, final com.google.android.gms.internal.ads.InterfaceC3145aK interfaceC3145aK) {
        h();
        final java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet(this.f26674d);
        this.f26676f.add(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zJ
            @Override // java.lang.Runnable
            public final void run() {
                java.util.Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.ads.InterfaceC3145aK interfaceC3145aK2 = interfaceC3145aK;
                    ((com.google.android.gms.internal.ads.C3366cL) it.next()).a(i6, interfaceC3145aK2);
                }
            }
        });
    }

    public final void e() {
        h();
        synchronized (this.f26677g) {
            this.f26678h = true;
        }
        java.util.Iterator it = this.f26674d.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.C3366cL) it.next()).c(this.f26673c);
        }
        this.f26674d.clear();
    }

    public final void f(java.lang.Object obj) {
        h();
        for (com.google.android.gms.internal.ads.C3366cL c3366cL : this.f26674d) {
            if (c3366cL.f34483a.equals(obj)) {
                c3366cL.c(this.f26673c);
                this.f26674d.remove(c3366cL);
            }
        }
    }
}
