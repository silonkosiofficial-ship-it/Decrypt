package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class CY implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.gms.internal.ads.C4546n70 f26243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26244b;

    public CY(com.google.android.gms.internal.ads.C4546n70 c4546n70, long j6) {
        this.f26243a = c4546n70;
        this.f26244b = j6;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35302b;
        com.google.android.gms.internal.ads.C4546n70 c4546n70 = this.f26243a;
        bundle.putString("slotname", c4546n70.f37513f);
        p184s3.X1 x6 = c4546n70.f37511d;
        if (x6.f54157H) {
            bundle.putBoolean("test_request", true);
        }
        int i6 = x6.f54158I;
        com.google.android.gms.internal.ads.B70.e(bundle, "tag_for_child_directed_treatment", i6, i6 != -1);
        if (x6.f54152C >= 8) {
            int i10 = x6.f54171V;
            com.google.android.gms.internal.ads.B70.e(bundle, "tag_for_under_age_of_consent", i10, i10 != -1);
        }
        com.google.android.gms.internal.ads.B70.c(bundle, "url", x6.f54163N);
        com.google.android.gms.internal.ads.B70.d(bundle, "neighboring_content_urls", x6.f54173X);
        android.os.Bundle bundle2 = (android.os.Bundle) x6.f54154E.clone();
        java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList(((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25688s7)).split(",", -1)));
        for (java.lang.String str : x6.f54154E.keySet()) {
            if (!hashSet.contains(str)) {
                bundle2.remove(str);
            }
        }
        com.google.android.gms.internal.ads.B70.b(bundle, "extras", bundle2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0063  */
    /* JADX WARN: Code duplicated, block: B:14:0x0065  */
    /* JADX WARN: Code duplicated, block: B:17:0x0076  */
    /* JADX WARN: Code duplicated, block: B:18:0x0078  */
    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Code duplicated, block: B:22:0x008b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0095  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:43:0x0137  */
    /* JADX WARN: Code duplicated, block: B:44:0x0139  */
    /* JADX WARN: Code duplicated, block: B:47:0x0145  */
    /* JADX WARN: Code duplicated, block: B:50:0x014a  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        boolean z6;
        int i6;
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        android.location.Location location;
        boolean z14;
        java.lang.String str;
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35301a;
        p184s3.X1 x6 = this.f26243a.f37511d;
        bundle.putInt("http_timeout_millis", x6.f54174Y);
        bundle.putString("slotname", this.f26243a.f37513f);
        int i11 = this.f26243a.f37522o.f33505a;
        if (i11 == 0) {
            throw null;
        }
        int i12 = i11 - 1;
        if (i12 != 1) {
            str = i12 == 2 ? "is_rewarded_interstitial" : "is_new_rewarded";
            bundle.putLong("start_signals_timestamp", this.f26244b);
            com.google.android.gms.internal.ads.B70.g(bundle, "is_sdk_preload", true, x6.f());
            java.lang.String str2 = new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.US).format(new java.util.Date(x6.f54153D));
            if (x6.f54153D != -1) {
                z6 = true;
            } else {
                z6 = false;
            }
            com.google.android.gms.internal.ads.B70.f(bundle, "cust_age", str2, z6);
            com.google.android.gms.internal.ads.B70.b(bundle, "extras", x6.f54154E);
            i6 = x6.f54155F;
            if (i6 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            com.google.android.gms.internal.ads.B70.e(bundle, "cust_gender", i6, z10);
            com.google.android.gms.internal.ads.B70.d(bundle, "kw", x6.f54156G);
            i10 = x6.f54158I;
            if (i10 != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            com.google.android.gms.internal.ads.B70.e(bundle, "tag_for_child_directed_treatment", i10, z11);
            if (x6.f54157H) {
                bundle.putBoolean("test_request", true);
            }
            bundle.putInt("ppt_p13n", x6.f54176a0);
            if (x6.f54152C >= 2 || !x6.f54159J) {
                z12 = false;
            } else {
                z12 = true;
            }
            com.google.android.gms.internal.ads.B70.e(bundle, "d_imp_hdr", 1, z12);
            java.lang.String str3 = x6.f54160K;
            if (x6.f54152C >= 2 || android.text.TextUtils.isEmpty(str3)) {
                z13 = false;
            } else {
                z13 = true;
            }
            com.google.android.gms.internal.ads.B70.f(bundle, "ppid", str3, z13);
            location = x6.f54162M;
            if (location != null) {
                float accuracy = location.getAccuracy() * 1000.0f;
                long time = location.getTime() * 1000;
                double latitude = location.getLatitude() * 1.0E7d;
                double longitude = 1.0E7d * location.getLongitude();
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putFloat("radius", accuracy);
                bundle2.putLong("lat", (long) latitude);
                bundle2.putLong("long", (long) longitude);
                bundle2.putLong("time", time);
                bundle.putBundle("uule", bundle2);
            }
            com.google.android.gms.internal.ads.B70.c(bundle, "url", x6.f54163N);
            com.google.android.gms.internal.ads.B70.d(bundle, "neighboring_content_urls", x6.f54173X);
            com.google.android.gms.internal.ads.B70.b(bundle, "custom_targeting", x6.f54165P);
            com.google.android.gms.internal.ads.B70.d(bundle, "category_exclusions", x6.f54166Q);
            com.google.android.gms.internal.ads.B70.c(bundle, "request_agent", x6.f54167R);
            com.google.android.gms.internal.ads.B70.c(bundle, "request_pkg", x6.f54168S);
            boolean z15 = x6.f54169T;
            if (x6.f54152C >= 7) {
                z14 = true;
            } else {
                z14 = false;
            }
            com.google.android.gms.internal.ads.B70.g(bundle, "is_designed_for_families", z15, z14);
            if (x6.f54152C >= 8) {
                int i13 = x6.f54171V;
                com.google.android.gms.internal.ads.B70.e(bundle, "tag_for_under_age_of_consent", i13, i13 != -1);
                com.google.android.gms.internal.ads.B70.c(bundle, "max_ad_content_rating", x6.f54172W);
            }
        }
        bundle.putBoolean(str, true);
        bundle.putLong("start_signals_timestamp", this.f26244b);
        com.google.android.gms.internal.ads.B70.g(bundle, "is_sdk_preload", true, x6.f());
        java.lang.String str4 = new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.US).format(new java.util.Date(x6.f54153D));
        if (x6.f54153D != -1) {
            z6 = true;
        } else {
            z6 = false;
        }
        com.google.android.gms.internal.ads.B70.f(bundle, "cust_age", str4, z6);
        com.google.android.gms.internal.ads.B70.b(bundle, "extras", x6.f54154E);
        i6 = x6.f54155F;
        if (i6 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.google.android.gms.internal.ads.B70.e(bundle, "cust_gender", i6, z10);
        com.google.android.gms.internal.ads.B70.d(bundle, "kw", x6.f54156G);
        i10 = x6.f54158I;
        if (i10 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        com.google.android.gms.internal.ads.B70.e(bundle, "tag_for_child_directed_treatment", i10, z11);
        if (x6.f54157H) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", x6.f54176a0);
        if (x6.f54152C >= 2) {
            z12 = false;
        } else {
            z12 = false;
        }
        com.google.android.gms.internal.ads.B70.e(bundle, "d_imp_hdr", 1, z12);
        java.lang.String str5 = x6.f54160K;
        if (x6.f54152C >= 2) {
            z13 = false;
        } else {
            z13 = false;
        }
        com.google.android.gms.internal.ads.B70.f(bundle, "ppid", str5, z13);
        location = x6.f54162M;
        if (location != null) {
            float accuracy2 = location.getAccuracy() * 1000.0f;
            long time2 = location.getTime() * 1000;
            double latitude2 = location.getLatitude() * 1.0E7d;
            double longitude2 = 1.0E7d * location.getLongitude();
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putFloat("radius", accuracy2);
            bundle3.putLong("lat", (long) latitude2);
            bundle3.putLong("long", (long) longitude2);
            bundle3.putLong("time", time2);
            bundle.putBundle("uule", bundle3);
        }
        com.google.android.gms.internal.ads.B70.c(bundle, "url", x6.f54163N);
        com.google.android.gms.internal.ads.B70.d(bundle, "neighboring_content_urls", x6.f54173X);
        com.google.android.gms.internal.ads.B70.b(bundle, "custom_targeting", x6.f54165P);
        com.google.android.gms.internal.ads.B70.d(bundle, "category_exclusions", x6.f54166Q);
        com.google.android.gms.internal.ads.B70.c(bundle, "request_agent", x6.f54167R);
        com.google.android.gms.internal.ads.B70.c(bundle, "request_pkg", x6.f54168S);
        boolean z16 = x6.f54169T;
        if (x6.f54152C >= 7) {
            z14 = true;
        } else {
            z14 = false;
        }
        com.google.android.gms.internal.ads.B70.g(bundle, "is_designed_for_families", z16, z14);
        if (x6.f54152C >= 8) {
            int i14 = x6.f54171V;
            com.google.android.gms.internal.ads.B70.e(bundle, "tag_for_under_age_of_consent", i14, i14 != -1);
            com.google.android.gms.internal.ads.B70.c(bundle, "max_ad_content_rating", x6.f54172W);
        }
    }
}
