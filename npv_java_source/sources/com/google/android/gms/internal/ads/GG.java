package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class GG extends com.google.android.gms.internal.ads.BF implements com.google.android.gms.internal.ads.InterfaceC2633Nb {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.Map f27761D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final android.content.Context f27762E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R60 f27763F;

    public GG(android.content.Context context, java.util.Set set, com.google.android.gms.internal.ads.R60 r60) {
        super(set);
        this.f27761D = new java.util.WeakHashMap(1);
        this.f27762E = context;
        this.f27763F = r60;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2633Nb
    public final synchronized void L(final com.google.android.gms.internal.ads.C2596Mb c2596Mb) {
        p1(new com.google.android.gms.internal.ads.AF() { // from class: com.google.android.gms.internal.ads.FG
            @Override // com.google.android.gms.internal.ads.AF
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.InterfaceC2633Nb) obj).L(c2596Mb);
            }
        });
    }

    public final synchronized void q1(android.view.View view) {
        try {
            com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2670Ob viewOnAttachStateChangeListenerC2670Ob = (com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2670Ob) this.f27761D.get(view);
            if (viewOnAttachStateChangeListenerC2670Ob == null) {
                com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2670Ob viewOnAttachStateChangeListenerC2670Ob2 = new com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2670Ob(this.f27762E, view);
                viewOnAttachStateChangeListenerC2670Ob2.c(this);
                this.f27761D.put(view, viewOnAttachStateChangeListenerC2670Ob2);
                viewOnAttachStateChangeListenerC2670Ob = viewOnAttachStateChangeListenerC2670Ob2;
            }
            if (this.f27763F.f31157X) {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25733x1)).booleanValue()) {
                    viewOnAttachStateChangeListenerC2670Ob.g(((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25723w1)).longValue());
                    return;
                }
            }
            viewOnAttachStateChangeListenerC2670Ob.f();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void r1(android.view.View view) {
        if (this.f27761D.containsKey(view)) {
            ((com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2670Ob) this.f27761D.get(view)).e(this);
            this.f27761D.remove(view);
        }
    }
}
