package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ff0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3721ff0 extends com.google.android.gms.internal.ads.AbstractC2495Jf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.IBinder f35379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f35380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f35381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f35382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f35383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f35384f;

    /* synthetic */ C3721ff0(android.os.IBinder iBinder, java.lang.String str, int i6, float f6, int i10, int i11, java.lang.String str2, int i12, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.google.android.gms.internal.ads.AbstractC3611ef0 abstractC3611ef0) {
        this.f35379a = iBinder;
        this.f35380b = str;
        this.f35381c = i6;
        this.f35382d = f6;
        this.f35383e = i12;
        this.f35384f = str4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2495Jf0
    public final float a() {
        return this.f35382d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2495Jf0
    public final int b() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2495Jf0
    public final int c() {
        return this.f35381c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2495Jf0
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2495Jf0
    public final int e() {
        return this.f35383e;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.AbstractC2495Jf0) {
            com.google.android.gms.internal.ads.AbstractC2495Jf0 abstractC2495Jf0 = (com.google.android.gms.internal.ads.AbstractC2495Jf0) obj;
            if (this.f35379a.equals(abstractC2495Jf0.f()) && ((str = this.f35380b) != null ? str.equals(abstractC2495Jf0.h()) : abstractC2495Jf0.h() == null) && this.f35381c == abstractC2495Jf0.c() && java.lang.Float.floatToIntBits(this.f35382d) == java.lang.Float.floatToIntBits(abstractC2495Jf0.a())) {
                abstractC2495Jf0.b();
                abstractC2495Jf0.d();
                abstractC2495Jf0.j();
                if (this.f35383e == abstractC2495Jf0.e()) {
                    abstractC2495Jf0.i();
                    java.lang.String str2 = this.f35384f;
                    if (str2 != null ? str2.equals(abstractC2495Jf0.g()) : abstractC2495Jf0.g() == null) {
                        abstractC2495Jf0.k();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2495Jf0
    public final android.os.IBinder f() {
        return this.f35379a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2495Jf0
    public final java.lang.String g() {
        return this.f35384f;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2495Jf0
    public final java.lang.String h() {
        return this.f35380b;
    }

    public final int hashCode() {
        int iHashCode = this.f35379a.hashCode() ^ 1000003;
        java.lang.String str = this.f35380b;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f35381c) * 1000003) ^ java.lang.Float.floatToIntBits(this.f35382d);
        int i6 = this.f35383e;
        java.lang.String str2 = this.f35384f;
        return ((((iHashCode2 * 1525764945) ^ i6) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2495Jf0
    public final java.lang.String i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2495Jf0
    public final java.lang.String j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2495Jf0
    public final java.lang.String k() {
        return null;
    }

    public final java.lang.String toString() {
        return "OverlayDisplayShowRequest{windowToken=" + this.f35379a.toString() + ", appId=" + this.f35380b + ", layoutGravity=" + this.f35381c + ", layoutVerticalMargin=" + this.f35382d + ", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=" + this.f35383e + ", deeplinkUrl=null, adFieldEnifd=" + this.f35384f + ", thirdPartyAuthCallerId=null}";
    }
}
