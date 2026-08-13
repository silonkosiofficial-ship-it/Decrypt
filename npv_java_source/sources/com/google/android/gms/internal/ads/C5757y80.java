package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5757y80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3232b80 f39995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5537w80 f39996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.X70 f39997c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.ads.E80 f39999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f40000f = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.ArrayDeque f39998d = new java.util.ArrayDeque();

    public C5757y80(com.google.android.gms.internal.ads.InterfaceC3232b80 interfaceC3232b80, com.google.android.gms.internal.ads.X70 x70, com.google.android.gms.internal.ads.InterfaceC5537w80 interfaceC5537w80) {
        this.f39995a = interfaceC3232b80;
        this.f39997c = x70;
        this.f39996b = interfaceC5537w80;
        x70.b(new com.google.android.gms.internal.ads.C5207t80(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void h() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.e6)).booleanValue() && !p174r3.v.s().j().i().h()) {
            this.f39998d.clear();
            return;
        }
        if (i()) {
            while (!this.f39998d.isEmpty()) {
                com.google.android.gms.internal.ads.InterfaceC5647x80 interfaceC5647x80 = (com.google.android.gms.internal.ads.InterfaceC5647x80) this.f39998d.pollFirst();
                if (interfaceC5647x80 == null || (interfaceC5647x80.a() != null && this.f39995a.b(interfaceC5647x80.a()))) {
                    com.google.android.gms.internal.ads.E80 e80 = new com.google.android.gms.internal.ads.E80(this.f39995a, this.f39996b, interfaceC5647x80);
                    this.f39999e = e80;
                    e80.d(new com.google.android.gms.internal.ads.C5317u80(this, interfaceC5647x80));
                    return;
                }
            }
        }
    }

    private final synchronized boolean i() {
        return this.f39999e == null;
    }

    public final synchronized P4.d a(com.google.android.gms.internal.ads.InterfaceC5647x80 interfaceC5647x80) {
        this.f40000f = 2;
        if (i()) {
            return null;
        }
        return this.f39999e.a(interfaceC5647x80);
    }

    public final synchronized void e(com.google.android.gms.internal.ads.InterfaceC5647x80 interfaceC5647x80) {
        this.f39998d.add(interfaceC5647x80);
    }

    final /* synthetic */ void f() {
        synchronized (this) {
            this.f40000f = 1;
            h();
        }
    }
}
