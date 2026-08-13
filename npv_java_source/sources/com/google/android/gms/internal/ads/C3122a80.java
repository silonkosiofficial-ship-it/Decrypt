package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3122a80 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f34015c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.LinkedList f34013a = new java.util.LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.A80 f34016d = new com.google.android.gms.internal.ads.A80();

    public C3122a80(int i6, int i10) {
        this.f34014b = i6;
        this.f34015c = i10;
    }

    private final void i() {
        while (!this.f34013a.isEmpty()) {
            if (p174r3.v.c().a() - ((com.google.android.gms.internal.ads.C4328l80) this.f34013a.getFirst()).f37096d < this.f34015c) {
                return;
            }
            this.f34016d.g();
            this.f34013a.remove();
        }
    }

    public final int a() {
        return this.f34016d.a();
    }

    public final int b() {
        i();
        return this.f34013a.size();
    }

    public final long c() {
        return this.f34016d.b();
    }

    public final long d() {
        return this.f34016d.c();
    }

    public final com.google.android.gms.internal.ads.C4328l80 e() {
        this.f34016d.f();
        i();
        if (this.f34013a.isEmpty()) {
            return null;
        }
        com.google.android.gms.internal.ads.C4328l80 c4328l80 = (com.google.android.gms.internal.ads.C4328l80) this.f34013a.remove();
        if (c4328l80 != null) {
            this.f34016d.h();
        }
        return c4328l80;
    }

    public final com.google.android.gms.internal.ads.C5867z80 f() {
        return this.f34016d.d();
    }

    public final java.lang.String g() {
        return this.f34016d.e();
    }

    public final boolean h(com.google.android.gms.internal.ads.C4328l80 c4328l80) {
        this.f34016d.f();
        i();
        if (this.f34013a.size() == this.f34014b) {
            return false;
        }
        this.f34013a.add(c4328l80);
        return true;
    }
}
