package B3;

/* JADX INFO: renamed from: B3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0797c {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    public static com.google.android.gms.internal.ads.V90 a(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        java.lang.String string = bundle.getString("query_info_type");
        if (android.text.TextUtils.isEmpty(string)) {
            return com.google.android.gms.internal.ads.V90.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        switch (string) {
            case "requester_type_0":
                return com.google.android.gms.internal.ads.V90.SCAR_REQUEST_TYPE_ADMOB;
            case "requester_type_1":
                return com.google.android.gms.internal.ads.V90.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
            case "requester_type_2":
                return com.google.android.gms.internal.ads.V90.SCAR_REQUEST_TYPE_GBID;
            case "requester_type_3":
                return com.google.android.gms.internal.ads.V90.SCAR_REQUEST_TYPE_GOLDENEYE;
            case "requester_type_4":
                return com.google.android.gms.internal.ads.V90.SCAR_REQUEST_TYPE_YAVIN;
            case "requester_type_5":
                return com.google.android.gms.internal.ads.V90.SCAR_REQUEST_TYPE_UNITY;
            case "requester_type_6":
                return com.google.android.gms.internal.ads.V90.SCAR_REQUEST_TYPE_PAW;
            case "requester_type_7":
                return com.google.android.gms.internal.ads.V90.SCAR_REQUEST_TYPE_GUILDER;
            case "requester_type_8":
                return com.google.android.gms.internal.ads.V90.SCAR_REQUEST_TYPE_GAM_S2S;
            default:
                return com.google.android.gms.internal.ads.V90.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    public static java.lang.String b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str) {
            case "requester_type_0":
                return "0";
            case "requester_type_1":
                return "1";
            case "requester_type_2":
                return "2";
            case "requester_type_3":
                return "3";
            case "requester_type_4":
                return "4";
            case "requester_type_5":
                return "5";
            case "requester_type_6":
                return "6";
            case "requester_type_7":
                return "7";
            case "requester_type_8":
                return "8";
            default:
                return str;
        }
    }

    public static java.lang.String c(p184s3.X1 x6) {
        android.os.Bundle bundle;
        return (x6 == null || (bundle = x6.f54154E) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    public static void d(final com.google.android.gms.internal.ads.C4246kO c4246kO, com.google.android.gms.internal.ads.YN yn, final java.lang.String str, final android.util.Pair... pairArr) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25345M6)).booleanValue()) {
            final com.google.android.gms.internal.ads.YN yn2 = null;
            com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.execute(new java.lang.Runnable(yn2, str, pairArr) { // from class: B3.w0

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f747D;

                /* JADX INFO: renamed from: E, reason: collision with root package name */
                public final /* synthetic */ android.util.Pair[] f748E;

                {
                    this.f747D = str;
                    this.f748E = pairArr;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    B3.AbstractC0797c.e(this.f746C, null, this.f747D, this.f748E);
                }
            });
        }
    }

    static void e(com.google.android.gms.internal.ads.C4246kO c4246kO, com.google.android.gms.internal.ads.YN yn, java.lang.String str, android.util.Pair... pairArr) {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMapC = c4246kO.c();
        g(concurrentHashMapC, "action", str);
        for (android.util.Pair pair : pairArr) {
            g(concurrentHashMapC, (java.lang.String) pair.first, (java.lang.String) pair.second);
        }
        c4246kO.g(concurrentHashMapC);
    }

    public static int f(com.google.android.gms.internal.ads.C4546n70 c4546n70) {
        if (c4546n70.f37525r) {
            return 2;
        }
        p184s3.X1 x6 = c4546n70.f37511d;
        p184s3.X x10 = x6.f54170U;
        if (x10 == null && x6.f54175Z == null) {
            return 1;
        }
        if (x10 == null || x6.f54175Z == null) {
            return x10 != null ? 3 : 4;
        }
        return 5;
    }

    private static void g(java.util.Map map, java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
