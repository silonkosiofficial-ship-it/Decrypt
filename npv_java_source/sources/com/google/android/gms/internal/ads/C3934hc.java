package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3934hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f36095a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3714fc f36096b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36097c = false;

    public final android.app.Activity a() {
        synchronized (this.f36095a) {
            try {
                com.google.android.gms.internal.ads.C3714fc c3714fc = this.f36096b;
                if (c3714fc == null) {
                    return null;
                }
                return c3714fc.a();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final android.content.Context b() {
        synchronized (this.f36095a) {
            try {
                com.google.android.gms.internal.ads.C3714fc c3714fc = this.f36096b;
                if (c3714fc == null) {
                    return null;
                }
                return c3714fc.b();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void c(com.google.android.gms.internal.ads.InterfaceC3824gc interfaceC3824gc) {
        synchronized (this.f36095a) {
            try {
                if (this.f36096b == null) {
                    this.f36096b = new com.google.android.gms.internal.ads.C3714fc();
                }
                this.f36096b.f(interfaceC3824gc);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void d(android.content.Context context) {
        synchronized (this.f36095a) {
            try {
                if (!this.f36097c) {
                    android.content.Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
                    if (application == null) {
                        p224w3.p.g("Can not cast Context to Application");
                        return;
                    }
                    if (this.f36096b == null) {
                        this.f36096b = new com.google.android.gms.internal.ads.C3714fc();
                    }
                    this.f36096b.g(application, context);
                    this.f36097c = true;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void e(com.google.android.gms.internal.ads.InterfaceC3824gc interfaceC3824gc) {
        synchronized (this.f36095a) {
            try {
                com.google.android.gms.internal.ads.C3714fc c3714fc = this.f36096b;
                if (c3714fc == null) {
                    return;
                }
                c3714fc.h(interfaceC3824gc);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
