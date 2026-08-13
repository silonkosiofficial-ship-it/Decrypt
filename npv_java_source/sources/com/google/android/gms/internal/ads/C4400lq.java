package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4400lq implements com.google.android.gms.internal.ads.InterfaceC2633Nb {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f37236C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.Object f37237D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f37238E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f37239F;

    public C4400lq(android.content.Context context, java.lang.String str) {
        this.f37236C = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f37238E = str;
        this.f37239F = false;
        this.f37237D = new java.lang.Object();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2633Nb
    public final void L(com.google.android.gms.internal.ads.C2596Mb c2596Mb) {
        b(c2596Mb.f29800j);
    }

    public final java.lang.String a() {
        return this.f37238E;
    }

    public final void b(boolean z6) {
        if (p174r3.v.r().p(this.f37236C)) {
            synchronized (this.f37237D) {
                try {
                    if (this.f37239F == z6) {
                        return;
                    }
                    this.f37239F = z6;
                    if (android.text.TextUtils.isEmpty(this.f37238E)) {
                        return;
                    }
                    if (this.f37239F) {
                        p174r3.v.r().f(this.f37236C, this.f37238E);
                    } else {
                        p174r3.v.r().g(this.f37236C, this.f37238E);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }
}
