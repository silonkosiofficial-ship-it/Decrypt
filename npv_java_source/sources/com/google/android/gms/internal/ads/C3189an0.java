package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.an0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3189an0 extends com.google.android.gms.internal.ads.AbstractC3406cm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Ym0 f34146b;

    /* synthetic */ C3189an0(int i6, com.google.android.gms.internal.ads.Ym0 ym0, com.google.android.gms.internal.ads.Zm0 zm0) {
        this.f34145a = i6;
        this.f34146b = ym0;
    }

    public static com.google.android.gms.internal.ads.Xm0 c() {
        return new com.google.android.gms.internal.ads.Xm0(null);
    }

    @Override // com.google.android.gms.internal.ads.Sl0
    public final boolean a() {
        return this.f34146b != com.google.android.gms.internal.ads.Ym0.f33406d;
    }

    public final int b() {
        return this.f34145a;
    }

    public final com.google.android.gms.internal.ads.Ym0 d() {
        return this.f34146b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.C3189an0)) {
            return false;
        }
        com.google.android.gms.internal.ads.C3189an0 c3189an0 = (com.google.android.gms.internal.ads.C3189an0) obj;
        return c3189an0.f34145a == this.f34145a && c3189an0.f34146b == this.f34146b;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(com.google.android.gms.internal.ads.C3189an0.class, java.lang.Integer.valueOf(this.f34145a), this.f34146b);
    }

    public final java.lang.String toString() {
        return "AesGcmSiv Parameters (variant: " + java.lang.String.valueOf(this.f34146b) + ", " + this.f34145a + "-byte key)";
    }
}
