package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class E80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5647x80 f26914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P4.d f26915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26916c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26917d = false;

    public E80(final com.google.android.gms.internal.ads.InterfaceC3232b80 interfaceC3232b80, final com.google.android.gms.internal.ads.InterfaceC5537w80 interfaceC5537w80, final com.google.android.gms.internal.ads.InterfaceC5647x80 interfaceC5647x80) {
        this.f26914a = interfaceC5647x80;
        this.f26915b = com.google.android.gms.internal.ads.AbstractC2652Nk0.f(com.google.android.gms.internal.ads.AbstractC2652Nk0.n(interfaceC5537w80.a(interfaceC5647x80), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.C80
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f26152a.b(interfaceC5537w80, interfaceC3232b80, interfaceC5647x80, (com.google.android.gms.internal.ads.C4328l80) obj);
            }
        }, interfaceC5647x80.b()), java.lang.Exception.class, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.D80
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f26622a.c(interfaceC5537w80, (java.lang.Exception) obj);
            }
        }, interfaceC5647x80.b());
    }

    public final synchronized P4.d a(com.google.android.gms.internal.ads.InterfaceC5647x80 interfaceC5647x80) {
        if (!this.f26917d && !this.f26916c && this.f26914a.a() != null && interfaceC5647x80.a() != null && this.f26914a.a().equals(interfaceC5647x80.a())) {
            this.f26916c = true;
            return this.f26915b;
        }
        return null;
    }

    final /* synthetic */ P4.d b(com.google.android.gms.internal.ads.InterfaceC5537w80 interfaceC5537w80, com.google.android.gms.internal.ads.InterfaceC3232b80 interfaceC3232b80, com.google.android.gms.internal.ads.InterfaceC5647x80 interfaceC5647x80, com.google.android.gms.internal.ads.C4328l80 c4328l80) {
        synchronized (this) {
            try {
                this.f26917d = true;
                interfaceC5537w80.b(c4328l80);
                if (this.f26916c) {
                    return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.C5427v80(c4328l80, interfaceC5647x80));
                }
                interfaceC3232b80.e(interfaceC5647x80.a(), c4328l80);
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ P4.d c(com.google.android.gms.internal.ads.InterfaceC5537w80 interfaceC5537w80, java.lang.Exception exc) {
        synchronized (this) {
            this.f26917d = true;
            throw exc;
        }
    }

    public final synchronized void d(com.google.android.gms.internal.ads.InterfaceC2505Jk0 interfaceC2505Jk0) {
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(com.google.android.gms.internal.ads.AbstractC2652Nk0.n(this.f26915b, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.B80
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.i();
            }
        }, this.f26914a.b()), interfaceC2505Jk0, this.f26914a.b());
    }
}
