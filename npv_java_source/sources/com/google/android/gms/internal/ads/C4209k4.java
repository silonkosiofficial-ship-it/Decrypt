package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4209k4 implements com.google.android.gms.internal.ads.InterfaceC4869q4 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4869q4
    public final int a(com.google.android.gms.internal.ads.D d6) {
        java.lang.String str = d6.f26574o;
        if (str != null) {
            switch (str) {
                case "text/x-ssa":
                case "text/vtt":
                    return 1;
                case "application/x-mp4-vtt":
                    return 2;
                case "application/x-subrip":
                    return 1;
                case "application/x-quicktime-tx3g":
                case "application/pgs":
                case "application/dvbsubs":
                    return 2;
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new java.lang.IllegalArgumentException("Unsupported MIME type: ".concat(java.lang.String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4869q4
    public final boolean b(com.google.android.gms.internal.ads.D d6) {
        java.lang.String str = d6.f26574o;
        return j$.util.Objects.equals(str, "text/x-ssa") || j$.util.Objects.equals(str, "text/vtt") || j$.util.Objects.equals(str, "application/x-mp4-vtt") || j$.util.Objects.equals(str, "application/x-subrip") || j$.util.Objects.equals(str, "application/x-quicktime-tx3g") || j$.util.Objects.equals(str, "application/pgs") || j$.util.Objects.equals(str, "application/dvbsubs") || j$.util.Objects.equals(str, "application/ttml+xml");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4869q4
    public final com.google.android.gms.internal.ads.InterfaceC5088s4 c(com.google.android.gms.internal.ads.D d6) {
        java.lang.String str = d6.f26574o;
        if (str != null) {
            switch (str) {
                case "text/x-ssa":
                    return new com.google.android.gms.internal.ads.I4(d6.f26577r);
                case "text/vtt":
                    return new com.google.android.gms.internal.ads.C4211k5();
                case "application/x-mp4-vtt":
                    return new com.google.android.gms.internal.ads.Z4();
                case "application/x-subrip":
                    return new com.google.android.gms.internal.ads.M4();
                case "application/x-quicktime-tx3g":
                    return new com.google.android.gms.internal.ads.Y4(d6.f26577r);
                case "application/pgs":
                    return new com.google.android.gms.internal.ads.G4();
                case "application/dvbsubs":
                    return new com.google.android.gms.internal.ads.E4(d6.f26577r);
                case "application/ttml+xml":
                    return new com.google.android.gms.internal.ads.T4();
            }
        }
        throw new java.lang.IllegalArgumentException("Unsupported MIME type: ".concat(java.lang.String.valueOf(str)));
    }
}
