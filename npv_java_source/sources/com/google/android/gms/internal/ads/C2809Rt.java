package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2809Rt {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.C2809Rt f31383e = new com.google.android.gms.internal.ads.C2809Rt(-1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31387d;

    public C2809Rt(int i6, int i10, int i11) {
        this.f31384a = i6;
        this.f31385b = i10;
        this.f31386c = i11;
        this.f31387d = com.google.android.gms.internal.ads.EW.j(i11) ? com.google.android.gms.internal.ads.EW.C(i11) * i10 : -1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.C2809Rt)) {
            return false;
        }
        com.google.android.gms.internal.ads.C2809Rt c2809Rt = (com.google.android.gms.internal.ads.C2809Rt) obj;
        return this.f31384a == c2809Rt.f31384a && this.f31385b == c2809Rt.f31385b && this.f31386c == c2809Rt.f31386c;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.f31384a), java.lang.Integer.valueOf(this.f31385b), java.lang.Integer.valueOf(this.f31386c)});
    }

    public final java.lang.String toString() {
        return "AudioFormat[sampleRate=" + this.f31384a + ", channelCount=" + this.f31385b + ", encoding=" + this.f31386c + "]";
    }
}
