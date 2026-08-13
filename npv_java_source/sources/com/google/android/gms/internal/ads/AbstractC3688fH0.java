package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3688fH0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.HashMap f35313a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f35314b = 0;

    public static com.google.android.gms.internal.ads.AG0 a() {
        java.util.List listD = d("audio/raw", false, false);
        if (listD.isEmpty()) {
            return null;
        }
        return (com.google.android.gms.internal.ads.AG0) listD.get(0);
    }

    public static java.lang.String b(com.google.android.gms.internal.ads.D d6) {
        android.util.Pair pairA;
        if ("audio/eac3-joc".equals(d6.f26574o)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(d6.f26574o) && (pairA = com.google.android.gms.internal.ads.ND.a(d6)) != null) {
            int iIntValue = ((java.lang.Integer) pairA.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(d6.f26574o)) {
            return "video/hevc";
        }
        return null;
    }

    public static java.util.List c(com.google.android.gms.internal.ads.PG0 pg0, com.google.android.gms.internal.ads.D d6, boolean z6, boolean z10) {
        java.lang.String strB = b(d6);
        return strB == null ? com.google.android.gms.internal.ads.AbstractC3398ci0.O() : pg0.a(strB, z6, z10);
    }

    public static synchronized java.util.List d(java.lang.String str, boolean z6, boolean z10) {
        try {
            com.google.android.gms.internal.ads.TG0 tg0 = new com.google.android.gms.internal.ads.TG0(str, z6, z10);
            java.util.HashMap map = f35313a;
            java.util.List list = (java.util.List) map.get(tg0);
            if (list != null) {
                return list;
            }
            java.util.ArrayList arrayListG = g(tg0, new com.google.android.gms.internal.ads.XG0(z6, z10));
            if (z6 && arrayListG.isEmpty() && com.google.android.gms.internal.ads.EW.f27061a <= 23) {
                arrayListG = g(tg0, new com.google.android.gms.internal.ads.WG0(null));
                if (!arrayListG.isEmpty()) {
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((com.google.android.gms.internal.ads.AG0) arrayListG.get(0)).f25094a);
                }
            }
            if ("audio/raw".equals(str)) {
                if (com.google.android.gms.internal.ads.EW.f27061a < 26 && com.google.android.gms.internal.ads.EW.f27062b.equals("R9") && arrayListG.size() == 1 && ((com.google.android.gms.internal.ads.AG0) arrayListG.get(0)).f25094a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListG.add(com.google.android.gms.internal.ads.AG0.c("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                h(arrayListG, new com.google.android.gms.internal.ads.YG0() { // from class: com.google.android.gms.internal.ads.RG0
                    @Override // com.google.android.gms.internal.ads.YG0
                    public final int b(java.lang.Object obj) {
                        int i6 = com.google.android.gms.internal.ads.AbstractC3688fH0.f35314b;
                        java.lang.String str2 = ((com.google.android.gms.internal.ads.AG0) obj).f25094a;
                        if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                            return 1;
                        }
                        return (com.google.android.gms.internal.ads.EW.f27061a >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (com.google.android.gms.internal.ads.EW.f27061a < 32 && arrayListG.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((com.google.android.gms.internal.ads.AG0) arrayListG.get(0)).f25094a)) {
                arrayListG.add((com.google.android.gms.internal.ads.AG0) arrayListG.remove(0));
            }
            com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0M = com.google.android.gms.internal.ads.AbstractC3398ci0.M(arrayListG);
            map.put(tg0, abstractC3398ci0M);
            return abstractC3398ci0M;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public static java.util.List e(com.google.android.gms.internal.ads.PG0 pg0, com.google.android.gms.internal.ads.D d6, boolean z6, boolean z10) {
        java.util.List listA = pg0.a(d6.f26574o, z6, z10);
        java.util.List listC = c(pg0, d6, z6, z10);
        com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0 = new com.google.android.gms.internal.ads.C3083Zh0();
        c3083Zh0.i(listA);
        c3083Zh0.i(listC);
        return c3083Zh0.j();
    }

    public static java.util.List f(java.util.List list, final com.google.android.gms.internal.ads.D d6) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        h(arrayList, new com.google.android.gms.internal.ads.YG0() { // from class: com.google.android.gms.internal.ads.SG0
            @Override // com.google.android.gms.internal.ads.YG0
            public final int b(java.lang.Object obj) {
                int i6 = com.google.android.gms.internal.ads.AbstractC3688fH0.f35314b;
                return ((com.google.android.gms.internal.ads.AG0) obj).d(d6) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017d A[Catch: Exception -> 0x0182, TryCatch #5 {Exception -> 0x0182, blocks: (B:87:0x014b, B:93:0x0162, B:99:0x0177, B:101:0x017d, B:108:0x0196, B:110:0x019e, B:120:0x01ca, B:111:0x01a3, B:113:0x01b3, B:115:0x01bb, B:104:0x018b), top: B:166:0x014b }] */
    /* JADX WARN: Code duplicated, block: B:104:0x018b A[Catch: Exception -> 0x0182, TryCatch #5 {Exception -> 0x0182, blocks: (B:87:0x014b, B:93:0x0162, B:99:0x0177, B:101:0x017d, B:108:0x0196, B:110:0x019e, B:120:0x01ca, B:111:0x01a3, B:113:0x01b3, B:115:0x01bb, B:104:0x018b), top: B:166:0x014b }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0191  */
    /* JADX WARN: Code duplicated, block: B:107:0x0194  */
    /* JADX WARN: Code duplicated, block: B:110:0x019e A[Catch: Exception -> 0x0182, TryCatch #5 {Exception -> 0x0182, blocks: (B:87:0x014b, B:93:0x0162, B:99:0x0177, B:101:0x017d, B:108:0x0196, B:110:0x019e, B:120:0x01ca, B:111:0x01a3, B:113:0x01b3, B:115:0x01bb, B:104:0x018b), top: B:166:0x014b }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01a3 A[Catch: Exception -> 0x0182, TryCatch #5 {Exception -> 0x0182, blocks: (B:87:0x014b, B:93:0x0162, B:99:0x0177, B:101:0x017d, B:108:0x0196, B:110:0x019e, B:120:0x01ca, B:111:0x01a3, B:113:0x01b3, B:115:0x01bb, B:104:0x018b), top: B:166:0x014b }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01b3 A[Catch: Exception -> 0x0182, TryCatch #5 {Exception -> 0x0182, blocks: (B:87:0x014b, B:93:0x0162, B:99:0x0177, B:101:0x017d, B:108:0x0196, B:110:0x019e, B:120:0x01ca, B:111:0x01a3, B:113:0x01b3, B:115:0x01bb, B:104:0x018b), top: B:166:0x014b }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ca A[Catch: Exception -> 0x0182, TRY_LEAVE, TryCatch #5 {Exception -> 0x0182, blocks: (B:87:0x014b, B:93:0x0162, B:99:0x0177, B:101:0x017d, B:108:0x0196, B:110:0x019e, B:120:0x01ca, B:111:0x01a3, B:113:0x01b3, B:115:0x01bb, B:104:0x018b), top: B:166:0x014b }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:133:0x0207 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x0239 A[Catch: Exception -> 0x0034, TRY_ENTER, TryCatch #4 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:144:0x0231, B:147:0x0239, B:149:0x023f, B:150:0x0259, B:151:0x027a, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e8, B:61:0x00f0, B:66:0x00fe, B:68:0x0106, B:71:0x0111, B:73:0x0119, B:76:0x0124, B:78:0x012c, B:81:0x0137, B:83:0x013f), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x01d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0259 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x027b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf A[Catch: Exception -> 0x0034, TryCatch #4 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:144:0x0231, B:147:0x0239, B:149:0x023f, B:150:0x0259, B:151:0x027a, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e8, B:61:0x00f0, B:66:0x00fe, B:68:0x0106, B:71:0x0111, B:73:0x0119, B:76:0x0124, B:78:0x012c, B:81:0x0137, B:83:0x013f), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8 A[Catch: Exception -> 0x0034, TryCatch #4 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:144:0x0231, B:147:0x0239, B:149:0x023f, B:150:0x0259, B:151:0x027a, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e8, B:61:0x00f0, B:66:0x00fe, B:68:0x0106, B:71:0x0111, B:73:0x0119, B:76:0x0124, B:78:0x012c, B:81:0x0137, B:83:0x013f), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d2 A[Catch: Exception -> 0x0034, LOOP:1: B:49:0x00c6->B:53:0x00d2, LOOP_END, TryCatch #4 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:144:0x0231, B:147:0x0239, B:149:0x023f, B:150:0x0259, B:151:0x027a, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e8, B:61:0x00f0, B:66:0x00fe, B:68:0x0106, B:71:0x0111, B:73:0x0119, B:76:0x0124, B:78:0x012c, B:81:0x0137, B:83:0x013f), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00dd A[Catch: Exception -> 0x0034, TryCatch #4 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:144:0x0231, B:147:0x0239, B:149:0x023f, B:150:0x0259, B:151:0x027a, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e8, B:61:0x00f0, B:66:0x00fe, B:68:0x0106, B:71:0x0111, B:73:0x0119, B:76:0x0124, B:78:0x012c, B:81:0x0137, B:83:0x013f), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e5 A[EDGE_INSN: B:58:0x00e5->B:86:0x0149 BREAK  A[LOOP:1: B:49:0x00c6->B:53:0x00d2]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e8 A[Catch: Exception -> 0x0034, TryCatch #4 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:144:0x0231, B:147:0x0239, B:149:0x023f, B:150:0x0259, B:151:0x027a, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e8, B:61:0x00f0, B:66:0x00fe, B:68:0x0106, B:71:0x0111, B:73:0x0119, B:76:0x0124, B:78:0x012c, B:81:0x0137, B:83:0x013f), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f0 A[Catch: Exception -> 0x0034, TryCatch #4 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:144:0x0231, B:147:0x0239, B:149:0x023f, B:150:0x0259, B:151:0x027a, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e8, B:61:0x00f0, B:66:0x00fe, B:68:0x0106, B:71:0x0111, B:73:0x0119, B:76:0x0124, B:78:0x012c, B:81:0x0137, B:83:0x013f), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00f9 A[EDGE_INSN: B:64:0x00f9->B:86:0x0149 BREAK  A[LOOP:1: B:49:0x00c6->B:53:0x00d2]] */
    /* JADX WARN: Code duplicated, block: B:66:0x00fe A[Catch: Exception -> 0x0034, TryCatch #4 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:144:0x0231, B:147:0x0239, B:149:0x023f, B:150:0x0259, B:151:0x027a, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e8, B:61:0x00f0, B:66:0x00fe, B:68:0x0106, B:71:0x0111, B:73:0x0119, B:76:0x0124, B:78:0x012c, B:81:0x0137, B:83:0x013f), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0106 A[Catch: Exception -> 0x0034, TryCatch #4 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:144:0x0231, B:147:0x0239, B:149:0x023f, B:150:0x0259, B:151:0x027a, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e8, B:61:0x00f0, B:66:0x00fe, B:68:0x0106, B:71:0x0111, B:73:0x0119, B:76:0x0124, B:78:0x012c, B:81:0x0137, B:83:0x013f), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x010e A[EDGE_INSN: B:70:0x010e->B:86:0x0149 BREAK  A[LOOP:1: B:49:0x00c6->B:53:0x00d2]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0111 A[Catch: Exception -> 0x0034, TryCatch #4 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:144:0x0231, B:147:0x0239, B:149:0x023f, B:150:0x0259, B:151:0x027a, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e8, B:61:0x00f0, B:66:0x00fe, B:68:0x0106, B:71:0x0111, B:73:0x0119, B:76:0x0124, B:78:0x012c, B:81:0x0137, B:83:0x013f), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0119 A[Catch: Exception -> 0x0034, TryCatch #4 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:144:0x0231, B:147:0x0239, B:149:0x023f, B:150:0x0259, B:151:0x027a, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e8, B:61:0x00f0, B:66:0x00fe, B:68:0x0106, B:71:0x0111, B:73:0x0119, B:76:0x0124, B:78:0x012c, B:81:0x0137, B:83:0x013f), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0124 A[Catch: Exception -> 0x0034, TryCatch #4 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:144:0x0231, B:147:0x0239, B:149:0x023f, B:150:0x0259, B:151:0x027a, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e8, B:61:0x00f0, B:66:0x00fe, B:68:0x0106, B:71:0x0111, B:73:0x0119, B:76:0x0124, B:78:0x012c, B:81:0x0137, B:83:0x013f), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x012c A[Catch: Exception -> 0x0034, TryCatch #4 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:144:0x0231, B:147:0x0239, B:149:0x023f, B:150:0x0259, B:151:0x027a, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e8, B:61:0x00f0, B:66:0x00fe, B:68:0x0106, B:71:0x0111, B:73:0x0119, B:76:0x0124, B:78:0x012c, B:81:0x0137, B:83:0x013f), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0137 A[Catch: Exception -> 0x0034, TryCatch #4 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:144:0x0231, B:147:0x0239, B:149:0x023f, B:150:0x0259, B:151:0x027a, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e8, B:61:0x00f0, B:66:0x00fe, B:68:0x0106, B:71:0x0111, B:73:0x0119, B:76:0x0124, B:78:0x012c, B:81:0x0137, B:83:0x013f), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x013f A[Catch: Exception -> 0x0034, TryCatch #4 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:144:0x0231, B:147:0x0239, B:149:0x023f, B:150:0x0259, B:151:0x027a, B:53:0x00d2, B:54:0x00d5, B:56:0x00dd, B:59:0x00e8, B:61:0x00f0, B:66:0x00fe, B:68:0x0106, B:71:0x0111, B:73:0x0119, B:76:0x0124, B:78:0x012c, B:81:0x0137, B:83:0x013f), top: B:164:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x015d  */
    /* JADX WARN: Code duplicated, block: B:91:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0160  */
    /* JADX WARN: Code duplicated, block: B:93:0x0162 A[Catch: Exception -> 0x0182, TryCatch #5 {Exception -> 0x0182, blocks: (B:87:0x014b, B:93:0x0162, B:99:0x0177, B:101:0x017d, B:108:0x0196, B:110:0x019e, B:120:0x01ca, B:111:0x01a3, B:113:0x01b3, B:115:0x01bb, B:104:0x018b), top: B:166:0x014b }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0172  */
    /* JADX WARN: Code duplicated, block: B:97:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0175  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    private static java.util.ArrayList g(com.google.android.gms.internal.ads.TG0 tg0, com.google.android.gms.internal.ads.VG0 vg0) throws com.google.android.gms.internal.ads.UG0 {
        java.lang.String[] supportedTypes;
        int length;
        int i6;
        java.lang.String str;
        java.lang.String str2;
        int i10;
        int i11;
        java.lang.String str3;
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean zB;
        boolean zC;
        boolean zB2;
        boolean zC2;
        int i12;
        boolean zIsHardwareAccelerated;
        boolean zI;
        java.lang.String strA;
        boolean zIsVendor;
        java.lang.String str4;
        com.google.android.gms.internal.ads.TG0 tg1 = tg0;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String str5 = tg1.f31912a;
            boolean zD = vg0.d();
            int i13 = 0;
            for (int iA = vg0.a(); i13 < iA; iA = i11) {
                android.media.MediaCodecInfo mediaCodecInfoB = vg0.B(i13);
                int i14 = com.google.android.gms.internal.ads.EW.f27061a;
                if (i14 < 29 || !mediaCodecInfoB.isAlias()) {
                    java.lang.String name = mediaCodecInfoB.getName();
                    if (mediaCodecInfoB.isEncoder() || (!zD && name.endsWith(".secure"))) {
                        i10 = i13;
                        i11 = iA;
                        str3 = str5;
                    } else if (i14 < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && "samsung".equals(com.google.android.gms.internal.ads.EW.f27063c))) {
                        java.lang.String str6 = com.google.android.gms.internal.ads.EW.f27062b;
                        if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                            i10 = i13;
                            i11 = iA;
                            str3 = str5;
                        } else if (i14 > 23) {
                            supportedTypes = mediaCodecInfoB.getSupportedTypes();
                            length = supportedTypes.length;
                            i6 = 0;
                            while (true) {
                                if (i6 >= length) {
                                    if (!str5.equals("video/dolby-vision")) {
                                        if (!str5.equals("video/mv-hevc")) {
                                            if (!str5.equals("audio/alac")) {
                                                if (!str5.equals("audio/flac")) {
                                                    if (!str5.equals("audio/ac3")) {
                                                        str = null;
                                                        break;
                                                    }
                                                    str = null;
                                                    break;
                                                }
                                                if (!str5.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str5.equals("audio/flac")) {
                                                if (!str5.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str5.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!"c2.qti.mvhevc.decoder".equals(name)) {
                                            str = null;
                                            break;
                                        }
                                        str = "video/x-mvhevc";
                                        break;
                                    }
                                    if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        if ("OMX.RTK.video.decoder".equals(name)) {
                                        }
                                        str = "video/dv_hevc";
                                        break;
                                    }
                                    str = "video/hevcdv";
                                    break;
                                }
                                str = supportedTypes[i6];
                                if (str.equalsIgnoreCase(str5)) {
                                    break;
                                    break;
                                }
                                i6++;
                            }
                            if (str != null) {
                                capabilitiesForType = mediaCodecInfoB.getCapabilitiesForType(str);
                                zB = vg0.b("tunneled-playback", str, capabilitiesForType);
                                zC = vg0.c("tunneled-playback", str, capabilitiesForType);
                                if (tg1.f31914c) {
                                    if (zB) {
                                        zB2 = vg0.b("secure-playback", str, capabilitiesForType);
                                        zC2 = vg0.c("secure-playback", str, capabilitiesForType);
                                        if (tg1.f31913b) {
                                            if (zB2) {
                                                zB2 = true;
                                                i12 = com.google.android.gms.internal.ads.EW.f27061a;
                                                if (i12 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoB.isHardwareAccelerated();
                                                } else if (i(mediaCodecInfoB, str5)) {
                                                    zIsHardwareAccelerated = false;
                                                } else {
                                                    zIsHardwareAccelerated = true;
                                                }
                                                zI = i(mediaCodecInfoB, str5);
                                                if (i12 >= 29) {
                                                    zIsVendor = mediaCodecInfoB.isVendor();
                                                } else {
                                                    strA = com.google.android.gms.internal.ads.AbstractC3723fg0.a(mediaCodecInfoB.getName());
                                                    if (strA.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (zD) {
                                                    if (!zD) {
                                                        if (!tg1.f31913b) {
                                                            str4 = name;
                                                            i10 = i13;
                                                            i11 = iA;
                                                            str3 = str5;
                                                            arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                        }
                                                    }
                                                    str4 = name;
                                                    i10 = i13;
                                                    i11 = iA;
                                                    str3 = str5;
                                                    if (zD) {
                                                        continue;
                                                    }
                                                } else {
                                                    if (!zD) {
                                                        if (!tg1.f31913b) {
                                                            str4 = name;
                                                            i10 = i13;
                                                            i11 = iA;
                                                            str3 = str5;
                                                            arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                        }
                                                    }
                                                    str4 = name;
                                                    i10 = i13;
                                                    i11 = iA;
                                                    str3 = str5;
                                                    if (zD) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        } else if (!zC2) {
                                            i12 = com.google.android.gms.internal.ads.EW.f27061a;
                                            if (i12 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoB.isHardwareAccelerated();
                                            } else if (i(mediaCodecInfoB, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zI = i(mediaCodecInfoB, str5);
                                            if (i12 >= 29) {
                                                zIsVendor = mediaCodecInfoB.isVendor();
                                            } else {
                                                strA = com.google.android.gms.internal.ads.AbstractC3723fg0.a(mediaCodecInfoB.getName());
                                                if (strA.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zD) {
                                                if (!zD) {
                                                    if (!tg1.f31913b) {
                                                        str4 = name;
                                                        i10 = i13;
                                                        i11 = iA;
                                                        str3 = str5;
                                                        arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i10 = i13;
                                                i11 = iA;
                                                str3 = str5;
                                                if (zD) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zD) {
                                                    if (!tg1.f31913b) {
                                                        str4 = name;
                                                        i10 = i13;
                                                        i11 = iA;
                                                        str3 = str5;
                                                        arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i10 = i13;
                                                i11 = iA;
                                                str3 = str5;
                                                if (zD) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (!zC) {
                                    zB2 = vg0.b("secure-playback", str, capabilitiesForType);
                                    zC2 = vg0.c("secure-playback", str, capabilitiesForType);
                                    if (tg1.f31913b) {
                                        if (!zC2) {
                                            i12 = com.google.android.gms.internal.ads.EW.f27061a;
                                            if (i12 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoB.isHardwareAccelerated();
                                            } else if (i(mediaCodecInfoB, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zI = i(mediaCodecInfoB, str5);
                                            if (i12 >= 29) {
                                                zIsVendor = mediaCodecInfoB.isVendor();
                                            } else {
                                                strA = com.google.android.gms.internal.ads.AbstractC3723fg0.a(mediaCodecInfoB.getName());
                                                if (strA.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zD) {
                                                if (!zD) {
                                                    if (!tg1.f31913b) {
                                                        str4 = name;
                                                        i10 = i13;
                                                        i11 = iA;
                                                        str3 = str5;
                                                        arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i10 = i13;
                                                i11 = iA;
                                                str3 = str5;
                                                if (zD) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zD) {
                                                    if (!tg1.f31913b) {
                                                        str4 = name;
                                                        i10 = i13;
                                                        i11 = iA;
                                                        str3 = str5;
                                                        arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i10 = i13;
                                                i11 = iA;
                                                str3 = str5;
                                                if (zD) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else if (zB2) {
                                        zB2 = true;
                                        i12 = com.google.android.gms.internal.ads.EW.f27061a;
                                        if (i12 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoB.isHardwareAccelerated();
                                        } else if (i(mediaCodecInfoB, str5)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        zI = i(mediaCodecInfoB, str5);
                                        if (i12 >= 29) {
                                            zIsVendor = mediaCodecInfoB.isVendor();
                                        } else {
                                            strA = com.google.android.gms.internal.ads.AbstractC3723fg0.a(mediaCodecInfoB.getName());
                                            if (strA.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zD) {
                                            if (!zD) {
                                                if (!tg1.f31913b) {
                                                    str4 = name;
                                                    i10 = i13;
                                                    i11 = iA;
                                                    str3 = str5;
                                                    arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                }
                                            }
                                            str4 = name;
                                            i10 = i13;
                                            i11 = iA;
                                            str3 = str5;
                                            if (zD) {
                                                continue;
                                            }
                                        } else {
                                            if (!zD) {
                                                if (!tg1.f31913b) {
                                                    str4 = name;
                                                    i10 = i13;
                                                    i11 = iA;
                                                    str3 = str5;
                                                    arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                }
                                            }
                                            str4 = name;
                                            i10 = i13;
                                            i11 = iA;
                                            str3 = str5;
                                            if (zD) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i10 = i13;
                                i11 = iA;
                                str3 = str5;
                            } else {
                                i10 = i13;
                                i11 = iA;
                                str3 = str5;
                            }
                        } else {
                            supportedTypes = mediaCodecInfoB.getSupportedTypes();
                            length = supportedTypes.length;
                            i6 = 0;
                            while (true) {
                                if (i6 >= length) {
                                    if (!str5.equals("video/dolby-vision")) {
                                        if (!str5.equals("video/mv-hevc")) {
                                            if (!str5.equals("audio/alac")) {
                                                if (!str5.equals("audio/flac")) {
                                                    if (!str5.equals("audio/ac3")) {
                                                        str = null;
                                                        break;
                                                    }
                                                    str = null;
                                                    break;
                                                }
                                                if (!str5.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str5.equals("audio/flac")) {
                                                if (!str5.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str5.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!"c2.qti.mvhevc.decoder".equals(name)) {
                                            str = null;
                                            break;
                                        }
                                        str = "video/x-mvhevc";
                                        break;
                                    }
                                    if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        if ("OMX.RTK.video.decoder".equals(name)) {
                                        }
                                        str = "video/dv_hevc";
                                        break;
                                    }
                                    str = "video/hevcdv";
                                    break;
                                }
                                str = supportedTypes[i6];
                                if (str.equalsIgnoreCase(str5)) {
                                    break;
                                    break;
                                }
                                i6++;
                            }
                            if (str != null) {
                                capabilitiesForType = mediaCodecInfoB.getCapabilitiesForType(str);
                                zB = vg0.b("tunneled-playback", str, capabilitiesForType);
                                zC = vg0.c("tunneled-playback", str, capabilitiesForType);
                                if (tg1.f31914c) {
                                    if (!zC) {
                                        zB2 = vg0.b("secure-playback", str, capabilitiesForType);
                                        zC2 = vg0.c("secure-playback", str, capabilitiesForType);
                                        if (tg1.f31913b) {
                                            if (!zC2) {
                                                i12 = com.google.android.gms.internal.ads.EW.f27061a;
                                                if (i12 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoB.isHardwareAccelerated();
                                                } else if (i(mediaCodecInfoB, str5)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zI = i(mediaCodecInfoB, str5);
                                                if (i12 >= 29) {
                                                    zIsVendor = mediaCodecInfoB.isVendor();
                                                } else {
                                                    strA = com.google.android.gms.internal.ads.AbstractC3723fg0.a(mediaCodecInfoB.getName());
                                                    if (strA.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (zD) {
                                                    if (!zD) {
                                                        if (!tg1.f31913b) {
                                                            str4 = name;
                                                            i10 = i13;
                                                            i11 = iA;
                                                            str3 = str5;
                                                            arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                        }
                                                    }
                                                    str4 = name;
                                                    i10 = i13;
                                                    i11 = iA;
                                                    str3 = str5;
                                                    if (zD) {
                                                        continue;
                                                    }
                                                } else {
                                                    if (!zD) {
                                                        if (!tg1.f31913b) {
                                                            str4 = name;
                                                            i10 = i13;
                                                            i11 = iA;
                                                            str3 = str5;
                                                            arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                        }
                                                    }
                                                    str4 = name;
                                                    i10 = i13;
                                                    i11 = iA;
                                                    str3 = str5;
                                                    if (zD) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        } else if (zB2) {
                                            zB2 = true;
                                            i12 = com.google.android.gms.internal.ads.EW.f27061a;
                                            if (i12 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoB.isHardwareAccelerated();
                                            } else if (i(mediaCodecInfoB, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zI = i(mediaCodecInfoB, str5);
                                            if (i12 >= 29) {
                                                zIsVendor = mediaCodecInfoB.isVendor();
                                            } else {
                                                strA = com.google.android.gms.internal.ads.AbstractC3723fg0.a(mediaCodecInfoB.getName());
                                                if (strA.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zD) {
                                                if (!zD) {
                                                    if (!tg1.f31913b) {
                                                        str4 = name;
                                                        i10 = i13;
                                                        i11 = iA;
                                                        str3 = str5;
                                                        arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i10 = i13;
                                                i11 = iA;
                                                str3 = str5;
                                                if (zD) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zD) {
                                                    if (!tg1.f31913b) {
                                                        str4 = name;
                                                        i10 = i13;
                                                        i11 = iA;
                                                        str3 = str5;
                                                        arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i10 = i13;
                                                i11 = iA;
                                                str3 = str5;
                                                if (zD) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (zB) {
                                    zB2 = vg0.b("secure-playback", str, capabilitiesForType);
                                    zC2 = vg0.c("secure-playback", str, capabilitiesForType);
                                    if (tg1.f31913b) {
                                        if (!zC2) {
                                            i12 = com.google.android.gms.internal.ads.EW.f27061a;
                                            if (i12 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoB.isHardwareAccelerated();
                                            } else if (i(mediaCodecInfoB, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zI = i(mediaCodecInfoB, str5);
                                            if (i12 >= 29) {
                                                zIsVendor = mediaCodecInfoB.isVendor();
                                            } else {
                                                strA = com.google.android.gms.internal.ads.AbstractC3723fg0.a(mediaCodecInfoB.getName());
                                                if (strA.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zD) {
                                                if (!zD) {
                                                    if (!tg1.f31913b) {
                                                        str4 = name;
                                                        i10 = i13;
                                                        i11 = iA;
                                                        str3 = str5;
                                                        arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i10 = i13;
                                                i11 = iA;
                                                str3 = str5;
                                                if (zD) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zD) {
                                                    if (!tg1.f31913b) {
                                                        str4 = name;
                                                        i10 = i13;
                                                        i11 = iA;
                                                        str3 = str5;
                                                        arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i10 = i13;
                                                i11 = iA;
                                                str3 = str5;
                                                if (zD) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else if (zB2) {
                                        zB2 = true;
                                        i12 = com.google.android.gms.internal.ads.EW.f27061a;
                                        if (i12 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoB.isHardwareAccelerated();
                                        } else if (i(mediaCodecInfoB, str5)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        zI = i(mediaCodecInfoB, str5);
                                        if (i12 >= 29) {
                                            zIsVendor = mediaCodecInfoB.isVendor();
                                        } else {
                                            strA = com.google.android.gms.internal.ads.AbstractC3723fg0.a(mediaCodecInfoB.getName());
                                            if (strA.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zD) {
                                            if (!zD) {
                                                if (!tg1.f31913b) {
                                                    str4 = name;
                                                    i10 = i13;
                                                    i11 = iA;
                                                    str3 = str5;
                                                    arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                }
                                            }
                                            str4 = name;
                                            i10 = i13;
                                            i11 = iA;
                                            str3 = str5;
                                            if (zD) {
                                                continue;
                                            }
                                        } else {
                                            if (!zD) {
                                                if (!tg1.f31913b) {
                                                    str4 = name;
                                                    i10 = i13;
                                                    i11 = iA;
                                                    str3 = str5;
                                                    arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                }
                                            }
                                            str4 = name;
                                            i10 = i13;
                                            i11 = iA;
                                            str3 = str5;
                                            if (zD) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i10 = i13;
                                i11 = iA;
                                str3 = str5;
                            } else {
                                i10 = i13;
                                i11 = iA;
                                str3 = str5;
                            }
                        }
                    } else if (i14 > 23 && "audio/eac3-joc".equals(str5) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name)) {
                        i10 = i13;
                        i11 = iA;
                        str3 = str5;
                    } else {
                        supportedTypes = mediaCodecInfoB.getSupportedTypes();
                        length = supportedTypes.length;
                        i6 = 0;
                        while (true) {
                            if (i6 >= length) {
                                if (!str5.equals("video/dolby-vision")) {
                                    if (!str5.equals("video/mv-hevc")) {
                                        if (!str5.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                            str = "audio/x-lg-alac";
                                            break;
                                        }
                                        if (!str5.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                            str = "audio/x-lg-flac";
                                            break;
                                        }
                                        if (!str5.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                            str = "audio/lg-ac3";
                                            break;
                                        }
                                        str = null;
                                        break;
                                    }
                                    if (!"c2.qti.mvhevc.decoder".equals(name)) {
                                        str = null;
                                        break;
                                    }
                                    str = "video/x-mvhevc";
                                    break;
                                }
                                if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    if ("OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str = null;
                                        break;
                                    }
                                    str = "video/dv_hevc";
                                    break;
                                }
                                str = "video/hevcdv";
                                break;
                            }
                            str = supportedTypes[i6];
                            if (str.equalsIgnoreCase(str5)) {
                                break;
                            }
                            i6++;
                        }
                        if (str != null) {
                            try {
                                capabilitiesForType = mediaCodecInfoB.getCapabilitiesForType(str);
                                zB = vg0.b("tunneled-playback", str, capabilitiesForType);
                                zC = vg0.c("tunneled-playback", str, capabilitiesForType);
                                if (tg1.f31914c) {
                                    if (!zC) {
                                        zB2 = vg0.b("secure-playback", str, capabilitiesForType);
                                        zC2 = vg0.c("secure-playback", str, capabilitiesForType);
                                        if (tg1.f31913b) {
                                            if (!zC2) {
                                                i12 = com.google.android.gms.internal.ads.EW.f27061a;
                                                if (i12 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoB.isHardwareAccelerated();
                                                } else if (i(mediaCodecInfoB, str5)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zI = i(mediaCodecInfoB, str5);
                                                if (i12 >= 29) {
                                                    zIsVendor = mediaCodecInfoB.isVendor();
                                                } else {
                                                    strA = com.google.android.gms.internal.ads.AbstractC3723fg0.a(mediaCodecInfoB.getName());
                                                    if (strA.startsWith("omx.google.") || strA.startsWith("c2.android.") || strA.startsWith("c2.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = true;
                                                    }
                                                }
                                                if (zD || tg1.f31913b != zB2) {
                                                    if (!zD) {
                                                        try {
                                                            if (!tg1.f31913b) {
                                                                str4 = name;
                                                                i10 = i13;
                                                                i11 = iA;
                                                                str3 = str5;
                                                                try {
                                                                    arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                                } catch (java.lang.Exception e6) {
                                                                    e = e6;
                                                                    str2 = str4;
                                                                    if (com.google.android.gms.internal.ads.EW.f27061a <= 23 || arrayList.isEmpty()) {
                                                                        com.google.android.gms.internal.ads.AbstractC3586eM.c("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                                        throw e;
                                                                    }
                                                                    com.google.android.gms.internal.ads.AbstractC3586eM.c("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                                }
                                                            }
                                                        } catch (java.lang.Exception e10) {
                                                            e = e10;
                                                            str4 = name;
                                                            i10 = i13;
                                                            i11 = iA;
                                                            str3 = str5;
                                                            str2 = str4;
                                                            if (com.google.android.gms.internal.ads.EW.f27061a <= 23) {
                                                            }
                                                            com.google.android.gms.internal.ads.AbstractC3586eM.c("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                            throw e;
                                                        }
                                                    }
                                                    str4 = name;
                                                    i10 = i13;
                                                    i11 = iA;
                                                    str3 = str5;
                                                    if (zD && zB2) {
                                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                        try {
                                                            sb.append(str4);
                                                            sb.append(".secure");
                                                            str2 = str4;
                                                            try {
                                                                arrayList.add(com.google.android.gms.internal.ads.AG0.c(sb.toString(), str3, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, true));
                                                                break;
                                                            } catch (java.lang.Exception e11) {
                                                                e = e11;
                                                                if (com.google.android.gms.internal.ads.EW.f27061a <= 23) {
                                                                }
                                                                com.google.android.gms.internal.ads.AbstractC3586eM.c("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                                throw e;
                                                            }
                                                        } catch (java.lang.Exception e12) {
                                                            e = e12;
                                                            str2 = str4;
                                                        }
                                                    }
                                                } else {
                                                    str4 = name;
                                                    i10 = i13;
                                                    i11 = iA;
                                                    str3 = str5;
                                                    arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                }
                                            }
                                        } else if (zB2) {
                                            zB2 = true;
                                            i12 = com.google.android.gms.internal.ads.EW.f27061a;
                                            if (i12 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoB.isHardwareAccelerated();
                                            } else if (i(mediaCodecInfoB, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zI = i(mediaCodecInfoB, str5);
                                            if (i12 >= 29) {
                                                zIsVendor = mediaCodecInfoB.isVendor();
                                            } else {
                                                strA = com.google.android.gms.internal.ads.AbstractC3723fg0.a(mediaCodecInfoB.getName());
                                                if (strA.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zD) {
                                                if (!zD) {
                                                    if (!tg1.f31913b) {
                                                        str4 = name;
                                                        i10 = i13;
                                                        i11 = iA;
                                                        str3 = str5;
                                                        arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i10 = i13;
                                                i11 = iA;
                                                str3 = str5;
                                                if (zD) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zD) {
                                                    if (!tg1.f31913b) {
                                                        str4 = name;
                                                        i10 = i13;
                                                        i11 = iA;
                                                        str3 = str5;
                                                        arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i10 = i13;
                                                i11 = iA;
                                                str3 = str5;
                                                if (zD) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (zB) {
                                    zB2 = vg0.b("secure-playback", str, capabilitiesForType);
                                    zC2 = vg0.c("secure-playback", str, capabilitiesForType);
                                    if (tg1.f31913b) {
                                        if (!zC2) {
                                            i12 = com.google.android.gms.internal.ads.EW.f27061a;
                                            if (i12 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoB.isHardwareAccelerated();
                                            } else if (i(mediaCodecInfoB, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zI = i(mediaCodecInfoB, str5);
                                            if (i12 >= 29) {
                                                zIsVendor = mediaCodecInfoB.isVendor();
                                            } else {
                                                strA = com.google.android.gms.internal.ads.AbstractC3723fg0.a(mediaCodecInfoB.getName());
                                                if (strA.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zD) {
                                                if (!zD) {
                                                    if (!tg1.f31913b) {
                                                        str4 = name;
                                                        i10 = i13;
                                                        i11 = iA;
                                                        str3 = str5;
                                                        arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i10 = i13;
                                                i11 = iA;
                                                str3 = str5;
                                                if (zD) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zD) {
                                                    if (!tg1.f31913b) {
                                                        str4 = name;
                                                        i10 = i13;
                                                        i11 = iA;
                                                        str3 = str5;
                                                        arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i10 = i13;
                                                i11 = iA;
                                                str3 = str5;
                                                if (zD) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else if (zB2) {
                                        zB2 = true;
                                        i12 = com.google.android.gms.internal.ads.EW.f27061a;
                                        if (i12 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoB.isHardwareAccelerated();
                                        } else if (i(mediaCodecInfoB, str5)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        zI = i(mediaCodecInfoB, str5);
                                        if (i12 >= 29) {
                                            zIsVendor = mediaCodecInfoB.isVendor();
                                        } else {
                                            strA = com.google.android.gms.internal.ads.AbstractC3723fg0.a(mediaCodecInfoB.getName());
                                            if (strA.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zD) {
                                            if (!zD) {
                                                if (!tg1.f31913b) {
                                                    str4 = name;
                                                    i10 = i13;
                                                    i11 = iA;
                                                    str3 = str5;
                                                    arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                }
                                            }
                                            str4 = name;
                                            i10 = i13;
                                            i11 = iA;
                                            str3 = str5;
                                            if (zD) {
                                                continue;
                                            }
                                        } else {
                                            if (!zD) {
                                                if (!tg1.f31913b) {
                                                    str4 = name;
                                                    i10 = i13;
                                                    i11 = iA;
                                                    str3 = str5;
                                                    arrayList.add(com.google.android.gms.internal.ads.AG0.c(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false, false));
                                                }
                                            }
                                            str4 = name;
                                            i10 = i13;
                                            i11 = iA;
                                            str3 = str5;
                                            if (zD) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i10 = i13;
                                i11 = iA;
                                str3 = str5;
                            } catch (java.lang.Exception e13) {
                                e = e13;
                                str2 = name;
                                i10 = i13;
                                i11 = iA;
                                str3 = str5;
                            }
                        } else {
                            i10 = i13;
                            i11 = iA;
                            str3 = str5;
                        }
                    }
                } else {
                    i10 = i13;
                    i11 = iA;
                    str3 = str5;
                }
                i13 = i10 + 1;
                tg1 = tg0;
                str5 = str3;
            }
            return arrayList;
        } catch (java.lang.Exception e14) {
            throw new com.google.android.gms.internal.ads.UG0(e14, null);
        }
    }

    private static void h(java.util.List list, final com.google.android.gms.internal.ads.YG0 yg0) {
        java.util.Collections.sort(list, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.QG0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int i6 = com.google.android.gms.internal.ads.AbstractC3688fH0.f35314b;
                com.google.android.gms.internal.ads.YG0 yg1 = yg0;
                return yg1.b(obj2) - yg1.b(obj);
            }
        });
    }

    private static boolean i(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        if (com.google.android.gms.internal.ads.EW.f27061a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (com.google.android.gms.internal.ads.AbstractC3606ed.g(str)) {
            return true;
        }
        java.lang.String strA = com.google.android.gms.internal.ads.AbstractC3723fg0.a(mediaCodecInfo.getName());
        if (strA.startsWith("arc.")) {
            return false;
        }
        if (strA.startsWith("omx.google.") || strA.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strA.startsWith("omx.sec.") && strA.contains(".sw.")) || strA.equals("omx.qcom.video.decoder.hevcswvdec") || strA.startsWith("c2.android.") || strA.startsWith("c2.google.")) {
            return true;
        }
        return (strA.startsWith("omx.") || strA.startsWith("c2.")) ? false : true;
    }
}
