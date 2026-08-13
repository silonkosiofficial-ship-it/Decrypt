package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Zp0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Zp0 f33658b = (com.google.android.gms.internal.ads.Zp0) com.google.android.gms.internal.ads.Jq0.a(new com.google.android.gms.internal.ads.Iq0() { // from class: com.google.android.gms.internal.ads.Xp0
        @Override // com.google.android.gms.internal.ads.Iq0
        public final java.lang.Object a() {
            com.google.android.gms.internal.ads.Zp0 zp0 = new com.google.android.gms.internal.ads.Zp0();
            zp0.g(new com.google.android.gms.internal.ads.C5168sp0(com.google.android.gms.internal.ads.C5828yp0.class, com.google.android.gms.internal.ads.C5720xq0.class, new com.google.android.gms.internal.ads.InterfaceC5278tp0() { // from class: com.google.android.gms.internal.ads.Yp0
                @Override // com.google.android.gms.internal.ads.InterfaceC5278tp0
                public final com.google.android.gms.internal.ads.Cq0 a(com.google.android.gms.internal.ads.El0 el0, com.google.android.gms.internal.ads.Wl0 wl0) {
                    return ((com.google.android.gms.internal.ads.C5828yp0) el0).a(wl0);
                }
            }));
            return zp0;
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f33659a = new java.util.concurrent.atomic.AtomicReference(new com.google.android.gms.internal.ads.Hq0(new com.google.android.gms.internal.ads.Dq0(), null));

    public static com.google.android.gms.internal.ads.Zp0 c() {
        return f33658b;
    }

    public final com.google.android.gms.internal.ads.El0 a(com.google.android.gms.internal.ads.Cq0 cq0, com.google.android.gms.internal.ads.Wl0 wl0) {
        return ((com.google.android.gms.internal.ads.Hq0) this.f33659a.get()).a(cq0, wl0);
    }

    public final com.google.android.gms.internal.ads.Sl0 b(com.google.android.gms.internal.ads.Cq0 cq0) {
        return ((com.google.android.gms.internal.ads.Hq0) this.f33659a.get()).b(cq0);
    }

    public final com.google.android.gms.internal.ads.Cq0 d(com.google.android.gms.internal.ads.El0 el0, java.lang.Class cls, com.google.android.gms.internal.ads.Wl0 wl0) {
        return ((com.google.android.gms.internal.ads.Hq0) this.f33659a.get()).c(el0, cls, wl0);
    }

    public final com.google.android.gms.internal.ads.Cq0 e(com.google.android.gms.internal.ads.Sl0 sl0, java.lang.Class cls) {
        return ((com.google.android.gms.internal.ads.Hq0) this.f33659a.get()).d(sl0, cls);
    }

    public final synchronized void f(com.google.android.gms.internal.ads.AbstractC5058rp0 abstractC5058rp0) {
        com.google.android.gms.internal.ads.Dq0 dq0 = new com.google.android.gms.internal.ads.Dq0((com.google.android.gms.internal.ads.Hq0) this.f33659a.get());
        dq0.a(abstractC5058rp0);
        this.f33659a.set(new com.google.android.gms.internal.ads.Hq0(dq0, null));
    }

    public final synchronized void g(com.google.android.gms.internal.ads.AbstractC5498vp0 abstractC5498vp0) {
        com.google.android.gms.internal.ads.Dq0 dq0 = new com.google.android.gms.internal.ads.Dq0((com.google.android.gms.internal.ads.Hq0) this.f33659a.get());
        dq0.b(abstractC5498vp0);
        this.f33659a.set(new com.google.android.gms.internal.ads.Hq0(dq0, null));
    }

    public final synchronized void h(com.google.android.gms.internal.ads.AbstractC3633eq0 abstractC3633eq0) {
        com.google.android.gms.internal.ads.Dq0 dq0 = new com.google.android.gms.internal.ads.Dq0((com.google.android.gms.internal.ads.Hq0) this.f33659a.get());
        dq0.c(abstractC3633eq0);
        this.f33659a.set(new com.google.android.gms.internal.ads.Hq0(dq0, null));
    }

    public final synchronized void i(com.google.android.gms.internal.ads.AbstractC4072iq0 abstractC4072iq0) {
        com.google.android.gms.internal.ads.Dq0 dq0 = new com.google.android.gms.internal.ads.Dq0((com.google.android.gms.internal.ads.Hq0) this.f33659a.get());
        dq0.d(abstractC4072iq0);
        this.f33659a.set(new com.google.android.gms.internal.ads.Hq0(dq0, null));
    }

    public final boolean j(com.google.android.gms.internal.ads.Cq0 cq0) {
        return ((com.google.android.gms.internal.ads.Hq0) this.f33659a.get()).i(cq0);
    }

    public final boolean k(com.google.android.gms.internal.ads.Cq0 cq0) {
        return ((com.google.android.gms.internal.ads.Hq0) this.f33659a.get()).j(cq0);
    }
}
