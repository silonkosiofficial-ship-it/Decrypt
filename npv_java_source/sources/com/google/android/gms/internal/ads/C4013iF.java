package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4013iF implements com.google.android.gms.internal.ads.InterfaceC3571eE {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f36242C = ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25653p1)).intValue();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f36243D = ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Jc)).intValue();

    @Override // com.google.android.gms.internal.ads.InterfaceC3571eE
    public final void B(com.google.android.gms.internal.ads.C2730Po c2730Po) {
    }

    public final synchronized int a() {
        return this.f36242C;
    }

    public final synchronized int b() {
        return this.f36243D;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3571eE
    public final synchronized void w0(com.google.android.gms.internal.ads.C3558e70 c3558e70) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25663q1)).booleanValue()) {
            try {
                com.google.android.gms.internal.ads.U60 u60 = c3558e70.f34899b.f34448b;
                this.f36242C = u60.f32115c;
                this.f36243D = u60.f32116d;
            } catch (java.lang.NullPointerException unused) {
            }
        }
    }
}
