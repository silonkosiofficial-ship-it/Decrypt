package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4249kR implements Q3.AbstractC1464c.a, Q3.AbstractC1464c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.google.android.gms.internal.ads.C4512mr f36962a = new com.google.android.gms.internal.ads.C4512mr();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final java.lang.Object f36963b = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f36964c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f36965d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected com.google.android.gms.internal.ads.C2730Po f36966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected com.google.android.gms.internal.ads.C5275to f36967f;

    static void b(android.content.Context context, P4.d dVar, java.util.concurrent.Executor executor) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5369ug.f39203j.e()).booleanValue() || ((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5369ug.f39201h.e()).booleanValue()) {
            com.google.android.gms.internal.ads.AbstractC2652Nk0.r(dVar, new com.google.android.gms.internal.ads.C3921hR(context), executor);
        }
    }

    protected final void a() {
        synchronized (this.f36963b) {
            try {
                this.f36965d = true;
                if (this.f36967f.j() || this.f36967f.e()) {
                    this.f36967f.h();
                }
                android.os.Binder.flushPendingCommands();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void q0(N3.C1389b c1389b) {
        p224w3.p.b("Disconnected from remote ad request service.");
        this.f36962a.d(new com.google.android.gms.internal.ads.AR(1));
    }

    @Override // Q3.AbstractC1464c.a
    public final void y0(int i6) {
        p224w3.p.b("Cannot connect to remote service, fallback to local instance.");
    }
}
