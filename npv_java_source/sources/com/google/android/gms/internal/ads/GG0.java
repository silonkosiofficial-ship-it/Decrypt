package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class GG0 {
    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    public static int a(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i6, int i10, double d6) {
        java.util.List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int iC = c(supportedPerformancePoints, com.google.android.gms.internal.ads.CG0.a(i6, i10, (int) d6));
        boolean z6 = true;
        if (iC == 1 && com.google.android.gms.internal.ads.HG0.f28001a == null) {
            if (com.google.android.gms.internal.ads.EW.f27061a >= 35) {
                z6 = false;
            } else {
                int iB = b(false);
                int iB2 = b(true);
                if (iB != 0 && (iB2 != 0 ? !(iB != 2 || iB2 != 2) : iB == 2)) {
                    z6 = false;
                }
            }
            com.google.android.gms.internal.ads.HG0.f28001a = java.lang.Boolean.valueOf(z6);
            if (com.google.android.gms.internal.ads.HG0.f28001a.booleanValue()) {
                return 0;
            }
        }
        return iC;
    }

    private static int b(boolean z6) {
        java.util.List supportedPerformancePoints;
        try {
            com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
            c4682oK0.B("video/avc");
            com.google.android.gms.internal.ads.D dH = c4682oK0.H();
            if (dH.f26574o != null) {
                java.util.List listE = com.google.android.gms.internal.ads.AbstractC3688fH0.e(com.google.android.gms.internal.ads.PG0.f30680a, dH, z6, false);
                for (int i6 = 0; i6 < listE.size(); i6++) {
                    if (((com.google.android.gms.internal.ads.AG0) listE.get(i6)).f25097d != null && ((com.google.android.gms.internal.ads.AG0) listE.get(i6)).f25097d.getVideoCapabilities() != null && (supportedPerformancePoints = ((com.google.android.gms.internal.ads.AG0) listE.get(i6)).f25097d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        com.google.android.gms.internal.ads.DG0.a();
                        return c(supportedPerformancePoints, com.google.android.gms.internal.ads.CG0.a(1280, 720, 60));
                    }
                }
            }
        } catch (com.google.android.gms.internal.ads.UG0 unused) {
        }
        return 0;
    }

    private static int c(java.util.List list, android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (com.google.android.gms.internal.ads.EG0.a(list.get(i6)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
