package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class AG0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f25094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f25095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f25096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.media.MediaCodecInfo.CodecCapabilities f25097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f25100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f25101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f25102i;

    AG0(java.lang.String str, java.lang.String str2, java.lang.String str3, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        str.getClass();
        this.f25094a = str;
        this.f25095b = str2;
        this.f25096c = str3;
        this.f25097d = codecCapabilities;
        this.f25100g = z6;
        this.f25098e = z12;
        this.f25099f = z14;
        this.f25101h = z15;
        this.f25102i = com.google.android.gms.internal.ads.AbstractC3606ed.i(str2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    public static com.google.android.gms.internal.ads.AG0 c(java.lang.String str, java.lang.String str2, java.lang.String str3, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        if (codecCapabilities == null || !codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z14 = false;
        } else {
            if (com.google.android.gms.internal.ads.EW.f27061a <= 22) {
                java.lang.String str4 = com.google.android.gms.internal.ads.EW.f27064d;
                if (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                    z14 = false;
                }
            }
            z14 = true;
        }
        return new com.google.android.gms.internal.ads.AG0(str, str2, str3, codecCapabilities, z6, z10, z11, z14, codecCapabilities != null && codecCapabilities.isFeatureSupported("tunneled-playback"), z13 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback")), com.google.android.gms.internal.ads.EW.f27061a >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface"));
    }

    private static android.graphics.Point i(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i6, int i10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i11 = com.google.android.gms.internal.ads.EW.f27061a;
        return new android.graphics.Point((((i6 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i10 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void j(java.lang.String str) {
        com.google.android.gms.internal.ads.AbstractC3586eM.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f25094a + ", " + this.f25095b + "] [" + com.google.android.gms.internal.ads.EW.f27065e + "]");
    }

    private static boolean k(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i6, int i10, double d6) {
        android.graphics.Point pointI = i(videoCapabilities, i6, i10);
        int i11 = pointI.x;
        int i12 = pointI.y;
        return (d6 == -1.0d || d6 < 1.0d) ? videoCapabilities.isSizeSupported(i11, i12) : videoCapabilities.areSizeAndRateSupported(i11, i12, java.lang.Math.floor(d6));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:74:0x010c  */
    private final boolean l(com.google.android.gms.internal.ads.D d6, boolean z6) {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrH;
        int i6;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities;
        int iIntValue;
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i10 = com.google.android.gms.internal.ads.AbstractC3688fH0.f35314b;
        android.util.Pair pairA = com.google.android.gms.internal.ads.ND.a(d6);
        java.lang.String str = d6.f26574o;
        if (str != null && str.equals("video/mv-hevc") && this.f25096c.equals("video/hevc")) {
            java.lang.String strG = com.google.android.gms.internal.ads.AbstractC4371lb0.g(d6.f26577r);
            if (strG == null) {
                pairA = null;
            } else {
                java.lang.String strTrim = strG.trim();
                int i11 = com.google.android.gms.internal.ads.EW.f27061a;
                pairA = com.google.android.gms.internal.ads.ND.b(strG, strTrim.split("\\.", -1), d6.f26550C);
            }
        }
        if (pairA != null) {
            int iIntValue2 = ((java.lang.Integer) pairA.first).intValue();
            int iIntValue3 = ((java.lang.Integer) pairA.second).intValue();
            int i12 = 8;
            if ("video/dolby-vision".equals(d6.f26574o)) {
                if ("video/avc".equals(this.f25095b)) {
                    iIntValue2 = 8;
                } else if ("video/hevc".equals(this.f25095b)) {
                    iIntValue2 = 2;
                }
                iIntValue3 = 0;
            }
            if (this.f25102i) {
                codecProfileLevelArrH = h();
                if (com.google.android.gms.internal.ads.EW.f27061a <= 23 && "video/x-vnd.on2.vp9".equals(this.f25095b) && codecProfileLevelArrH.length == 0) {
                    codecCapabilities = this.f25097d;
                    if (codecCapabilities != null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = ((java.lang.Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    }
                    if (iIntValue >= 180000000) {
                        i12 = 1024;
                    } else if (iIntValue >= 120000000) {
                        i12 = 512;
                    } else if (iIntValue >= 60000000) {
                        i12 = 256;
                    } else if (iIntValue >= 30000000) {
                        i12 = 128;
                    } else if (iIntValue >= 18000000) {
                        i12 = 64;
                    } else if (iIntValue >= 12000000) {
                        i12 = 32;
                    } else if (iIntValue >= 7200000) {
                        i12 = 16;
                    } else if (iIntValue < 3600000) {
                        if (iIntValue >= 1800000) {
                            i12 = 4;
                        } else if (iIntValue >= 800000) {
                            i12 = 2;
                        } else {
                            i12 = 1;
                        }
                    }
                    android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = new android.media.MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i12;
                    codecProfileLevelArrH = new android.media.MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArrH) {
                    if (codecProfileLevel2.profile != iIntValue2 && (codecProfileLevel2.level >= iIntValue3 || !z6)) {
                        if ("video/hevc".equals(this.f25095b) && iIntValue2 == 2) {
                            java.lang.String str2 = com.google.android.gms.internal.ads.EW.f27062b;
                            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                            }
                        }
                    }
                }
                j("codec.profileLevel, " + d6.f26570k + ", " + this.f25096c);
                return false;
            }
            if (iIntValue2 == 42) {
                iIntValue2 = 42;
                codecProfileLevelArrH = h();
                if (com.google.android.gms.internal.ads.EW.f27061a <= 23) {
                    codecCapabilities = this.f25097d;
                    if (codecCapabilities != null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue >= 180000000) {
                        i12 = 1024;
                    } else if (iIntValue >= 120000000) {
                        i12 = 512;
                    } else if (iIntValue >= 60000000) {
                        i12 = 256;
                    } else if (iIntValue >= 30000000) {
                        i12 = 128;
                    } else if (iIntValue >= 18000000) {
                        i12 = 64;
                    } else if (iIntValue >= 12000000) {
                        i12 = 32;
                    } else if (iIntValue >= 7200000) {
                        i12 = 16;
                    } else if (iIntValue < 3600000) {
                        if (iIntValue >= 1800000) {
                            i12 = 4;
                        } else if (iIntValue >= 800000) {
                            i12 = 2;
                        } else {
                            i12 = 1;
                        }
                    }
                    android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel3 = new android.media.MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel3.profile = 1;
                    codecProfileLevel3.level = i12;
                    codecProfileLevelArrH = new android.media.MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel3};
                }
                while (i6 < r5) {
                    if (codecProfileLevel2.profile != iIntValue2) {
                    }
                }
                j("codec.profileLevel, " + d6.f26570k + ", " + this.f25096c);
                return false;
            }
        }
        return true;
    }

    private final boolean m(com.google.android.gms.internal.ads.D d6) {
        return this.f25095b.equals(d6.f26574o) || this.f25095b.equals(com.google.android.gms.internal.ads.AbstractC3688fH0.b(d6));
    }

    public final android.graphics.Point a(int i6, int i10) {
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.f25097d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return i(videoCapabilities, i6, i10);
    }

    public final com.google.android.gms.internal.ads.Hz0 b(com.google.android.gms.internal.ads.D d6, com.google.android.gms.internal.ads.D d10) {
        int i6 = true != j$.util.Objects.equals(d6.f26574o, d10.f26574o) ? 8 : 0;
        if (this.f25102i) {
            if (d6.f26584y != d10.f26584y) {
                i6 |= 1024;
            }
            if (!this.f25098e && (d6.f26581v != d10.f26581v || d6.f26582w != d10.f26582w)) {
                i6 |= 512;
            }
            if ((!com.google.android.gms.internal.ads.PA0.g(d6.f26550C) || !com.google.android.gms.internal.ads.PA0.g(d10.f26550C)) && !j$.util.Objects.equals(d6.f26550C, d10.f26550C)) {
                i6 |= 2048;
            }
            java.lang.String str = this.f25094a;
            if (com.google.android.gms.internal.ads.EW.f27064d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !d6.d(d10)) {
                i6 |= 2;
            }
            if (i6 == 0) {
                return new com.google.android.gms.internal.ads.Hz0(this.f25094a, d6, d10, true == d6.d(d10) ? 3 : 2, 0);
            }
        } else {
            if (d6.f26551D != d10.f26551D) {
                i6 |= 4096;
            }
            if (d6.f26552E != d10.f26552E) {
                i6 |= 8192;
            }
            if (d6.f26553F != d10.f26553F) {
                i6 |= 16384;
            }
            if (i6 == 0 && "audio/mp4a-latm".equals(this.f25095b)) {
                int i10 = com.google.android.gms.internal.ads.AbstractC3688fH0.f35314b;
                android.util.Pair pairA = com.google.android.gms.internal.ads.ND.a(d6);
                android.util.Pair pairA2 = com.google.android.gms.internal.ads.ND.a(d10);
                if (pairA != null && pairA2 != null) {
                    int iIntValue = ((java.lang.Integer) pairA.first).intValue();
                    int iIntValue2 = ((java.lang.Integer) pairA2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new com.google.android.gms.internal.ads.Hz0(this.f25094a, d6, d10, 3, 0);
                    }
                }
            }
            if (!d6.d(d10)) {
                i6 |= 32;
            }
            if ("audio/opus".equals(this.f25095b)) {
                i6 |= 2;
            }
            if (i6 == 0) {
                return new com.google.android.gms.internal.ads.Hz0(this.f25094a, d6, d10, 1, 0);
            }
        }
        return new com.google.android.gms.internal.ads.Hz0(this.f25094a, d6, d10, 0, i6);
    }

    public final boolean d(com.google.android.gms.internal.ads.D d6) {
        return m(d6) && l(d6, false);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:76:0x011d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0130 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x0131  */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x011d, please report this as an issue */
    public final boolean e(com.google.android.gms.internal.ads.D d6) {
        int i6;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities;
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities;
        java.lang.String str;
        java.lang.String str2;
        int maxInputChannelCount;
        java.lang.String str3;
        int i10;
        int i11;
        if (!m(d6) || !l(d6, true)) {
            return false;
        }
        if (this.f25102i) {
            int i12 = d6.f26581v;
            if (i12 <= 0 || (i11 = d6.f26582w) <= 0) {
                return true;
            }
            return g(i12, i11, d6.f26583x);
        }
        int i13 = d6.f26552E;
        if (i13 == -1) {
            i6 = d6.f26551D;
            if (i6 != -1) {
                return true;
            }
            codecCapabilities = this.f25097d;
            if (codecCapabilities == null) {
                str3 = "channelCount.caps";
            } else {
                audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    str3 = "channelCount.aCaps";
                } else {
                    str = this.f25094a;
                    str2 = this.f25095b;
                    maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((com.google.android.gms.internal.ads.EW.f27061a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                        if ("audio/ac3".equals(str2)) {
                            i10 = 6;
                        } else if ("audio/eac3".equals(str2)) {
                            i10 = 16;
                        } else {
                            i10 = 30;
                        }
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i10 + "]");
                        maxInputChannelCount = i10;
                    }
                    if (maxInputChannelCount < i6) {
                        return true;
                    }
                    str3 = "channelCount.support, " + i6;
                }
            }
        } else {
            android.media.MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f25097d;
            if (codecCapabilities2 == null) {
                str3 = "sampleRate.caps";
            } else {
                android.media.MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    str3 = "sampleRate.aCaps";
                } else if (audioCapabilities2.isSampleRateSupported(i13)) {
                    i6 = d6.f26551D;
                    if (i6 != -1) {
                        return true;
                    }
                    codecCapabilities = this.f25097d;
                    if (codecCapabilities == null) {
                        str3 = "channelCount.caps";
                    } else {
                        audioCapabilities = codecCapabilities.getAudioCapabilities();
                        if (audioCapabilities == null) {
                            str3 = "channelCount.aCaps";
                        } else {
                            str = this.f25094a;
                            str2 = this.f25095b;
                            maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                            if (maxInputChannelCount <= 1) {
                                if ("audio/ac3".equals(str2)) {
                                    i10 = 6;
                                } else if ("audio/eac3".equals(str2)) {
                                    i10 = 16;
                                } else {
                                    i10 = 30;
                                }
                                com.google.android.gms.internal.ads.AbstractC3586eM.f("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i10 + "]");
                                maxInputChannelCount = i10;
                            }
                            if (maxInputChannelCount < i6) {
                                return true;
                            }
                            str3 = "channelCount.support, " + i6;
                        }
                    }
                } else {
                    str3 = "sampleRate.support, " + i13;
                }
            }
        }
        j(str3);
        return false;
    }

    public final boolean f(com.google.android.gms.internal.ads.D d6) {
        if (this.f25102i) {
            return this.f25098e;
        }
        int i6 = com.google.android.gms.internal.ads.AbstractC3688fH0.f35314b;
        android.util.Pair pairA = com.google.android.gms.internal.ads.ND.a(d6);
        return pairA != null && ((java.lang.Integer) pairA.first).intValue() == 42;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    public final boolean g(int i6, int i10, double d6) {
        java.lang.StringBuilder sb;
        java.lang.String str;
        java.lang.String string;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.f25097d;
        if (codecCapabilities == null) {
            string = "sizeAndRate.caps";
        } else {
            android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities != null) {
                if (com.google.android.gms.internal.ads.EW.f27061a >= 29) {
                    int iA = com.google.android.gms.internal.ads.HG0.a(videoCapabilities, i6, i10, d6);
                    if (iA != 2) {
                        if (iA == 1) {
                            sb = new java.lang.StringBuilder();
                            str = "sizeAndRate.cover, ";
                        } else if (!k(videoCapabilities, i6, i10, d6)) {
                            if (i6 < i10) {
                            }
                            sb = new java.lang.StringBuilder();
                            str = "sizeAndRate.support, ";
                        }
                        sb.append(str);
                        sb.append(i6);
                        sb.append("x");
                        sb.append(i10);
                        sb.append("@");
                        sb.append(d6);
                        string = sb.toString();
                    }
                    return true;
                }
                if (!k(videoCapabilities, i6, i10, d6)) {
                    if (i6 < i10 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f25094a) && "mcv5a".equals(com.google.android.gms.internal.ads.EW.f27062b)) || !k(videoCapabilities, i10, i6, d6))) {
                        sb = new java.lang.StringBuilder();
                        str = "sizeAndRate.support, ";
                        sb.append(str);
                        sb.append(i6);
                        sb.append("x");
                        sb.append(i10);
                        sb.append("@");
                        sb.append(d6);
                        string = sb.toString();
                    } else {
                        com.google.android.gms.internal.ads.AbstractC3586eM.b("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i6 + "x" + i10 + "@" + d6) + "] [" + this.f25094a + ", " + this.f25095b + "] [" + com.google.android.gms.internal.ads.EW.f27065e + "]");
                    }
                }
                return true;
            }
            string = "sizeAndRate.vCaps";
        }
        j(string);
        return false;
    }

    public final android.media.MediaCodecInfo.CodecProfileLevel[] h() {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.f25097d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new android.media.MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final java.lang.String toString() {
        return this.f25094a;
    }
}
