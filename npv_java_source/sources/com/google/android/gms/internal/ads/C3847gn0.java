package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3847gn0 extends com.google.android.gms.internal.ads.AbstractC3406cm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3737fn0 f35686a;

    private C3847gn0(com.google.android.gms.internal.ads.C3737fn0 c3737fn0) {
        this.f35686a = c3737fn0;
    }

    public static com.google.android.gms.internal.ads.C3847gn0 c(com.google.android.gms.internal.ads.C3737fn0 c3737fn0) {
        return new com.google.android.gms.internal.ads.C3847gn0(c3737fn0);
    }

    @Override // com.google.android.gms.internal.ads.Sl0
    public final boolean a() {
        return this.f35686a != com.google.android.gms.internal.ads.C3737fn0.f35428d;
    }

    public final com.google.android.gms.internal.ads.C3737fn0 b() {
        return this.f35686a;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.android.gms.internal.ads.C3847gn0) && ((com.google.android.gms.internal.ads.C3847gn0) obj).f35686a == this.f35686a;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(com.google.android.gms.internal.ads.C3847gn0.class, this.f35686a);
    }

    public final java.lang.String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f35686a.toString() + ")";
    }
}
