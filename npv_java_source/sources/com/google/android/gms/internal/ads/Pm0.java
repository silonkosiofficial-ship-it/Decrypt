package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Pm0 extends com.google.android.gms.internal.ads.AbstractC3406cm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30783b = 12;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30784c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Nm0 f30785d;

    /* synthetic */ Pm0(int i6, int i10, int i11, com.google.android.gms.internal.ads.Nm0 nm0, com.google.android.gms.internal.ads.Om0 om0) {
        this.f30782a = i6;
        this.f30785d = nm0;
    }

    public static com.google.android.gms.internal.ads.Mm0 c() {
        return new com.google.android.gms.internal.ads.Mm0(null);
    }

    @Override // com.google.android.gms.internal.ads.Sl0
    public final boolean a() {
        return this.f30785d != com.google.android.gms.internal.ads.Nm0.f30374d;
    }

    public final int b() {
        return this.f30782a;
    }

    public final com.google.android.gms.internal.ads.Nm0 d() {
        return this.f30785d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.Pm0)) {
            return false;
        }
        com.google.android.gms.internal.ads.Pm0 pm0 = (com.google.android.gms.internal.ads.Pm0) obj;
        return pm0.f30782a == this.f30782a && pm0.f30785d == this.f30785d;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(com.google.android.gms.internal.ads.Pm0.class, java.lang.Integer.valueOf(this.f30782a), 12, 16, this.f30785d);
    }

    public final java.lang.String toString() {
        return "AesGcm Parameters (variant: " + java.lang.String.valueOf(this.f30785d) + ", 12-byte IV, 16-byte tag, and " + this.f30782a + "-byte key)";
    }
}
