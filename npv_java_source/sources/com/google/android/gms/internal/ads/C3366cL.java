package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3366cL {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f34483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3690fI0 f34484b = new com.google.android.gms.internal.ads.C3690fI0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f34486d;

    public C3366cL(java.lang.Object obj) {
        this.f34483a = obj;
    }

    public final void a(int i6, com.google.android.gms.internal.ads.InterfaceC3145aK interfaceC3145aK) {
        if (this.f34486d) {
            return;
        }
        if (i6 != -1) {
            this.f34484b.a(i6);
        }
        this.f34485c = true;
        interfaceC3145aK.b(this.f34483a);
    }

    public final void b(com.google.android.gms.internal.ads.BK bk) {
        if (this.f34486d || !this.f34485c) {
            return;
        }
        com.google.android.gms.internal.ads.C3692fJ0 c3692fJ0B = this.f34484b.b();
        this.f34484b = new com.google.android.gms.internal.ads.C3690fI0();
        this.f34485c = false;
        bk.a(this.f34483a, c3692fJ0B);
    }

    public final void c(com.google.android.gms.internal.ads.BK bk) {
        this.f34486d = true;
        if (this.f34485c) {
            this.f34485c = false;
            bk.a(this.f34483a, this.f34484b.b());
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.google.android.gms.internal.ads.C3366cL.class != obj.getClass()) {
            return false;
        }
        return this.f34483a.equals(((com.google.android.gms.internal.ads.C3366cL) obj).f34483a);
    }

    public final int hashCode() {
        return this.f34483a.hashCode();
    }
}
