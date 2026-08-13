package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.co0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3410co0 extends com.google.android.gms.internal.ads.AbstractC3406cm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3301bo0 f34565a;

    private C3410co0(com.google.android.gms.internal.ads.C3301bo0 c3301bo0) {
        this.f34565a = c3301bo0;
    }

    public static com.google.android.gms.internal.ads.C3410co0 c(com.google.android.gms.internal.ads.C3301bo0 c3301bo0) {
        return new com.google.android.gms.internal.ads.C3410co0(c3301bo0);
    }

    @Override // com.google.android.gms.internal.ads.Sl0
    public final boolean a() {
        return this.f34565a != com.google.android.gms.internal.ads.C3301bo0.f34378d;
    }

    public final com.google.android.gms.internal.ads.C3301bo0 b() {
        return this.f34565a;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.android.gms.internal.ads.C3410co0) && ((com.google.android.gms.internal.ads.C3410co0) obj).f34565a == this.f34565a;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(com.google.android.gms.internal.ads.C3410co0.class, this.f34565a);
    }

    public final java.lang.String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f34565a.toString() + ")";
    }
}
