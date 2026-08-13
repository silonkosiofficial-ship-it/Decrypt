package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4930qg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.C4930qg f38295d = new com.google.android.gms.internal.ads.C4930qg(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f38296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f38297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38298c;

    static {
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
    }

    public C4930qg(float f6, float f10) {
        com.google.android.gms.internal.ads.LC.d(f6 > 0.0f);
        com.google.android.gms.internal.ads.LC.d(f10 > 0.0f);
        this.f38296a = f6;
        this.f38297b = f10;
        this.f38298c = java.lang.Math.round(f6 * 1000.0f);
    }

    public final long a(long j6) {
        return j6 * ((long) this.f38298c);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C4930qg.class == obj.getClass()) {
            com.google.android.gms.internal.ads.C4930qg c4930qg = (com.google.android.gms.internal.ads.C4930qg) obj;
            if (this.f38296a == c4930qg.f38296a && this.f38297b == c4930qg.f38297b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((java.lang.Float.floatToRawIntBits(this.f38296a) + 527) * 31) + java.lang.Float.floatToRawIntBits(this.f38297b);
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", java.lang.Float.valueOf(this.f38296a), java.lang.Float.valueOf(this.f38297b));
    }
}
