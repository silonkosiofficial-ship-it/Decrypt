package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3495dc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f34758b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f34757a = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f34759c = new java.util.LinkedList();

    public final void a(com.google.android.gms.internal.ads.C3385cc c3385cc) {
        synchronized (this.f34757a) {
            try {
                if (this.f34759c.size() >= 10) {
                    p224w3.p.b("Queue is full, current size = " + this.f34759c.size());
                    this.f34759c.remove(0);
                }
                int i6 = this.f34758b;
                this.f34758b = i6 + 1;
                c3385cc.g(i6);
                c3385cc.k();
                this.f34759c.add(c3385cc);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(com.google.android.gms.internal.ads.C3385cc c3385cc) {
        synchronized (this.f34757a) {
            try {
                java.util.Iterator it = this.f34759c.iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.ads.C3385cc c3385cc2 = (com.google.android.gms.internal.ads.C3385cc) it.next();
                    if (p174r3.v.s().j().b0()) {
                        if (!p174r3.v.s().j().P() && !c3385cc.equals(c3385cc2) && c3385cc2.d().equals(c3385cc.d())) {
                            it.remove();
                            return true;
                        }
                    } else if (!c3385cc.equals(c3385cc2) && c3385cc2.c().equals(c3385cc.c())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(com.google.android.gms.internal.ads.C3385cc c3385cc) {
        synchronized (this.f34757a) {
            try {
                return this.f34759c.contains(c3385cc);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
