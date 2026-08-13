package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5864z7 {
    public static long a(java.lang.String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (java.text.ParseException e6) {
            if ("0".equals(str) || "-1".equals(str)) {
                com.google.android.gms.internal.ads.AbstractC4545n7.d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            com.google.android.gms.internal.ads.AbstractC4545n7.c(e6, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static com.google.android.gms.internal.ads.M6 b(com.google.android.gms.internal.ads.Z6 z6) {
        boolean z10;
        long j6;
        long j10;
        long j11;
        long j12;
        long j13;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Map map = z6.f33502c;
        if (map == null) {
            return null;
        }
        java.lang.String str = (java.lang.String) map.get("Date");
        long jA = str != null ? a(str) : 0L;
        java.lang.String str2 = (java.lang.String) map.get("Cache-Control");
        int i6 = 0;
        if (str2 != null) {
            java.lang.String[] strArrSplit = str2.split(",", 0);
            z10 = false;
            j6 = 0;
            j10 = 0;
            while (i6 < strArrSplit.length) {
                java.lang.String strTrim = strArrSplit[i6].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j10 = java.lang.Long.parseLong(strTrim.substring(8));
                    } catch (java.lang.Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j6 = java.lang.Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z10 = true;
                }
                i6++;
            }
            i6 = 1;
        } else {
            z10 = false;
            j6 = 0;
            j10 = 0;
        }
        java.lang.String str3 = (java.lang.String) map.get("Expires");
        long jA2 = str3 != null ? a(str3) : 0L;
        java.lang.String str4 = (java.lang.String) map.get("Last-Modified");
        long jA3 = str4 != null ? a(str4) : 0L;
        java.lang.String str5 = (java.lang.String) map.get("ETag");
        if (i6 != 0) {
            j12 = jCurrentTimeMillis + (j10 * 1000);
            if (z10) {
                j13 = j12;
            } else {
                java.lang.Long.signum(j6);
                j13 = (j6 * 1000) + j12;
            }
            j11 = j13;
        } else {
            j11 = 0;
            if (jA <= 0 || jA2 < jA) {
                j12 = 0;
            } else {
                j12 = jCurrentTimeMillis + (jA2 - jA);
                j11 = j12;
            }
        }
        com.google.android.gms.internal.ads.M6 m6 = new com.google.android.gms.internal.ads.M6();
        m6.f29656a = z6.f33501b;
        m6.f29657b = str5;
        m6.f29661f = j12;
        m6.f29660e = j11;
        m6.f29658c = jA;
        m6.f29659d = jA3;
        m6.f29662g = map;
        m6.f29663h = z6.f33503d;
        return m6;
    }

    static java.lang.String c(long j6) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new java.util.Date(j6));
    }

    private static java.text.SimpleDateFormat d(java.lang.String str) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str, java.util.Locale.US);
        simpleDateFormat.setTimeZone(j$.util.DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
