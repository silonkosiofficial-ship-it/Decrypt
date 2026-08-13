package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Wq0 extends com.google.android.gms.internal.ads.AbstractC4953qr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Uq0 f32813c;

    /* synthetic */ Wq0(int i6, int i10, com.google.android.gms.internal.ads.Uq0 uq0, com.google.android.gms.internal.ads.Vq0 vq0) {
        this.f32811a = i6;
        this.f32812b = i10;
        this.f32813c = uq0;
    }

    public static com.google.android.gms.internal.ads.Tq0 e() {
        return new com.google.android.gms.internal.ads.Tq0(null);
    }

    @Override // com.google.android.gms.internal.ads.Sl0
    public final boolean a() {
        return this.f32813c != com.google.android.gms.internal.ads.Uq0.f32291e;
    }

    public final int b() {
        return this.f32812b;
    }

    public final int c() {
        return this.f32811a;
    }

    public final int d() {
        com.google.android.gms.internal.ads.Uq0 uq0 = this.f32813c;
        if (uq0 == com.google.android.gms.internal.ads.Uq0.f32291e) {
            return this.f32812b;
        }
        if (uq0 == com.google.android.gms.internal.ads.Uq0.f32288b || uq0 == com.google.android.gms.internal.ads.Uq0.f32289c || uq0 == com.google.android.gms.internal.ads.Uq0.f32290d) {
            return this.f32812b + 5;
        }
        throw new java.lang.IllegalStateException("Unknown variant");
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.Wq0)) {
            return false;
        }
        com.google.android.gms.internal.ads.Wq0 wq0 = (com.google.android.gms.internal.ads.Wq0) obj;
        return wq0.f32811a == this.f32811a && wq0.d() == d() && wq0.f32813c == this.f32813c;
    }

    public final com.google.android.gms.internal.ads.Uq0 f() {
        return this.f32813c;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(com.google.android.gms.internal.ads.Wq0.class, java.lang.Integer.valueOf(this.f32811a), java.lang.Integer.valueOf(this.f32812b), this.f32813c);
    }

    public final java.lang.String toString() {
        return "AES-CMAC Parameters (variant: " + java.lang.String.valueOf(this.f32813c) + ", " + this.f32812b + "-byte tags, and " + this.f32811a + "-byte key)";
    }
}
