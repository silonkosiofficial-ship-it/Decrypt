package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3463dE0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.C3463dE0 f34670d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC3947hi0 f34673c;

    static {
        com.google.android.gms.internal.ads.C3463dE0 c3463dE0;
        if (com.google.android.gms.internal.ads.EW.f27061a >= 33) {
            com.google.android.gms.internal.ads.C3837gi0 c3837gi0 = new com.google.android.gms.internal.ads.C3837gi0();
            for (int i6 = 1; i6 <= 10; i6++) {
                c3837gi0.g(java.lang.Integer.valueOf(com.google.android.gms.internal.ads.EW.A(i6)));
            }
            c3463dE0 = new com.google.android.gms.internal.ads.C3463dE0(2, c3837gi0.j());
        } else {
            c3463dE0 = new com.google.android.gms.internal.ads.C3463dE0(2, 10);
        }
        f34670d = c3463dE0;
    }

    public C3463dE0(int i6, int i10) {
        this.f34671a = i6;
        this.f34672b = i10;
        this.f34673c = null;
    }

    public C3463dE0(int i6, java.util.Set set) {
        this.f34671a = i6;
        com.google.android.gms.internal.ads.AbstractC3947hi0 abstractC3947hi0M = com.google.android.gms.internal.ads.AbstractC3947hi0.M(set);
        this.f34673c = abstractC3947hi0M;
        com.google.android.gms.internal.ads.AbstractC4167jj0 abstractC4167jj0N = abstractC3947hi0M.n();
        int iMax = 0;
        while (abstractC4167jj0N.hasNext()) {
            iMax = java.lang.Math.max(iMax, java.lang.Integer.bitCount(((java.lang.Integer) abstractC4167jj0N.next()).intValue()));
        }
        this.f34672b = iMax;
    }

    public final int a(int i6, com.google.android.gms.internal.ads.C5459vS c5459vS) {
        if (this.f34673c != null) {
            return this.f34672b;
        }
        if (com.google.android.gms.internal.ads.EW.f27061a < 29) {
            java.lang.Integer num = (java.lang.Integer) com.google.android.gms.internal.ads.C4450mE0.f37301e.getOrDefault(java.lang.Integer.valueOf(this.f34671a), 0);
            num.getClass();
            return num.intValue();
        }
        int i10 = this.f34671a;
        for (int i11 = 10; i11 > 0; i11--) {
            int iA = com.google.android.gms.internal.ads.EW.A(i11);
            if (iA != 0 && android.media.AudioTrack.isDirectPlaybackSupported(new android.media.AudioFormat.Builder().setEncoding(i10).setSampleRate(i6).setChannelMask(iA).build(), c5459vS.a().f36750a)) {
                return i11;
            }
        }
        return 0;
    }

    public final boolean b(int i6) {
        if (this.f34673c == null) {
            return i6 <= this.f34672b;
        }
        int iA = com.google.android.gms.internal.ads.EW.A(i6);
        if (iA == 0) {
            return false;
        }
        return this.f34673c.contains(java.lang.Integer.valueOf(iA));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.C3463dE0)) {
            return false;
        }
        com.google.android.gms.internal.ads.C3463dE0 c3463dE0 = (com.google.android.gms.internal.ads.C3463dE0) obj;
        return this.f34671a == c3463dE0.f34671a && this.f34672b == c3463dE0.f34672b && j$.util.Objects.equals(this.f34673c, c3463dE0.f34673c);
    }

    public final int hashCode() {
        com.google.android.gms.internal.ads.AbstractC3947hi0 abstractC3947hi0 = this.f34673c;
        return (((this.f34671a * 31) + this.f34672b) * 31) + (abstractC3947hi0 == null ? 0 : abstractC3947hi0.hashCode());
    }

    public final java.lang.String toString() {
        return "AudioProfile[format=" + this.f34671a + ", maxChannelCount=" + this.f34672b + ", channelMasks=" + java.lang.String.valueOf(this.f34673c) + "]";
    }
}
