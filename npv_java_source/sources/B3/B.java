package B3;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2363Fq f525c;

    /* synthetic */ B(B3.C0819z c0819z, B3.A a6) {
        this.f523a = c0819z.f762a;
        this.f524b = c0819z.f763b;
        this.f525c = c0819z.f764c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    public final com.google.android.gms.internal.ads.EnumC5473vd a() {
        byte b6;
        switch (this.f523a) {
            case "NATIVE":
                b6 = 2;
                break;
            case "INTERSTITIAL":
                b6 = 1;
                break;
            case "REWARDED":
                b6 = 3;
                break;
            case "BANNER":
                b6 = 0;
                break;
            default:
                b6 = -1;
                break;
        }
        if (b6 == 0) {
            return com.google.android.gms.internal.ads.EnumC5473vd.BANNER;
        }
        if (b6 == 1) {
            return com.google.android.gms.internal.ads.EnumC5473vd.INTERSTITIAL;
        }
        if (b6 != 2) {
            return b6 != 3 ? com.google.android.gms.internal.ads.EnumC5473vd.AD_INITIATER_UNSPECIFIED : com.google.android.gms.internal.ads.EnumC5473vd.REWARD_BASED_VIDEO_AD;
        }
        return com.google.android.gms.internal.ads.EnumC5473vd.AD_LOADER;
    }

    final com.google.android.gms.internal.ads.C2363Fq b() {
        return this.f525c;
    }

    public final java.lang.String c() {
        return this.f523a.toLowerCase(java.util.Locale.ROOT);
    }

    final java.lang.String d() {
        return this.f524b;
    }

    public final java.util.Set e() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(this.f523a.toLowerCase(java.util.Locale.ROOT));
        return hashSet;
    }
}
