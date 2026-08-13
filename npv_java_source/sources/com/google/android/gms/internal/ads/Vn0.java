package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Vn0 extends com.google.android.gms.internal.ads.AbstractC3406cm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Un0 f32570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32571b;

    private Vn0(com.google.android.gms.internal.ads.Un0 un0, int i6) {
        this.f32570a = un0;
        this.f32571b = i6;
    }

    public static com.google.android.gms.internal.ads.Vn0 d(com.google.android.gms.internal.ads.Un0 un0, int i6) throws java.security.GeneralSecurityException {
        if (i6 < 8 || i6 > 12) {
            throw new java.security.GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new com.google.android.gms.internal.ads.Vn0(un0, i6);
    }

    @Override // com.google.android.gms.internal.ads.Sl0
    public final boolean a() {
        return this.f32570a != com.google.android.gms.internal.ads.Un0.f32265c;
    }

    public final int b() {
        return this.f32571b;
    }

    public final com.google.android.gms.internal.ads.Un0 c() {
        return this.f32570a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.Vn0)) {
            return false;
        }
        com.google.android.gms.internal.ads.Vn0 vn0 = (com.google.android.gms.internal.ads.Vn0) obj;
        return vn0.f32570a == this.f32570a && vn0.f32571b == this.f32571b;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(com.google.android.gms.internal.ads.Vn0.class, this.f32570a, java.lang.Integer.valueOf(this.f32571b));
    }

    public final java.lang.String toString() {
        return "X-AES-GCM Parameters (variant: " + this.f32570a.toString() + "salt_size_bytes: " + this.f32571b + ")";
    }
}
