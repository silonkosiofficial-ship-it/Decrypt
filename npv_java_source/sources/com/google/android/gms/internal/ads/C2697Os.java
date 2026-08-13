package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Os, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2697Os {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.C2697Os f30582d = new com.google.android.gms.internal.ads.C2697Os(0, 0, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f30585c;

    static {
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(3, 36);
    }

    public C2697Os(int i6, int i10, float f6) {
        this.f30583a = i6;
        this.f30584b = i10;
        this.f30585c = f6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.C2697Os) {
            com.google.android.gms.internal.ads.C2697Os c2697Os = (com.google.android.gms.internal.ads.C2697Os) obj;
            if (this.f30583a == c2697Os.f30583a && this.f30584b == c2697Os.f30584b && this.f30585c == c2697Os.f30585c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f30583a + 217) * 31) + this.f30584b) * 31) + java.lang.Float.floatToRawIntBits(this.f30585c);
    }
}
