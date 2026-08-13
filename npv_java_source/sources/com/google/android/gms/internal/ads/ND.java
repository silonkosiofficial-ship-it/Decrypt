package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ND {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f30199a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.String[] f30200b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.regex.Pattern f30201c = java.util.regex.Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f30202d = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:59:0x0105  */
    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v22 int, still in use, count: 1, list:
  (r3v22 int) from 0x0060: IF  (r3v22 int) != (1567 int)  -> B:20:0x0062 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v22 int, still in use, count: 1, list:
  (r3v22 int) from 0x0060: IF  (r3v22 int) != (1567 int)  -> B:20:0x0062 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static android.util.Pair a(com.google.android.gms.internal.ads.D d6) {
        int i6;
        int i10;
        java.lang.StringBuilder sb;
        java.lang.String str;
        java.lang.StringBuilder sb2;
        java.lang.String str2;
        java.lang.String strConcat;
        int i11;
        java.lang.String strValueOf;
        java.lang.String str3;
        int i12;
        int i13;
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.String str4 = d6.f26570k;
        if (str4 != null) {
            java.lang.String[] strArrSplit = str4.split("\\.");
            int i14 = 3;
            int i15 = 2;
            int i16 = 1;
            if (!"video/dolby-vision".equals(d6.f26574o)) {
                switch (strArrSplit[0]) {
                    case "s263":
                        java.lang.String str5 = d6.f26570k;
                        android.util.Pair pair = new android.util.Pair(1, 1);
                        if (strArrSplit.length >= 3) {
                            try {
                                return new android.util.Pair(java.lang.Integer.valueOf(java.lang.Integer.parseInt(strArrSplit[1])), java.lang.Integer.valueOf(java.lang.Integer.parseInt(strArrSplit[2])));
                            } catch (java.lang.NumberFormatException unused) {
                            }
                        }
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(java.lang.String.valueOf(str5)));
                        return pair;
                    case "avc1":
                    case "avc2":
                        java.lang.String str6 = d6.f26570k;
                        int length = strArrSplit.length;
                        if (length >= 2) {
                            try {
                                if (strArrSplit[1].length() == 6) {
                                    i6 = java.lang.Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                                    i10 = java.lang.Integer.parseInt(strArrSplit[1].substring(4), 16);
                                } else if (length < 3) {
                                    com.google.android.gms.internal.ads.AbstractC3586eM.f("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str6);
                                } else {
                                    i6 = java.lang.Integer.parseInt(strArrSplit[1]);
                                    i10 = java.lang.Integer.parseInt(strArrSplit[2]);
                                }
                                if (i6 == 66) {
                                    i15 = 1;
                                } else if (i6 != 77) {
                                    if (i6 == 88) {
                                        i15 = 4;
                                    } else if (i6 == 100) {
                                        i15 = 8;
                                    } else if (i6 == 110) {
                                        i15 = 16;
                                    } else if (i6 != 122) {
                                        i15 = i6 != 244 ? -1 : 64;
                                    } else {
                                        i15 = 32;
                                    }
                                }
                                if (i15 == -1) {
                                    sb2 = new java.lang.StringBuilder();
                                    str2 = "Unknown AVC profile: ";
                                    sb2.append(str2);
                                    sb2.append(i6);
                                    strConcat = sb2.toString();
                                    com.google.android.gms.internal.ads.AbstractC3586eM.f("CodecSpecificDataUtil", strConcat);
                                } else {
                                    switch (i10) {
                                        case 10:
                                            break;
                                        case 11:
                                            i16 = 4;
                                            break;
                                        case 12:
                                            i16 = 8;
                                            break;
                                        case 13:
                                            i16 = 16;
                                            break;
                                        default:
                                            switch (i10) {
                                                case 20:
                                                    i16 = 32;
                                                    break;
                                                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                                                    i16 = 64;
                                                    break;
                                                case 22:
                                                    i16 = 128;
                                                    break;
                                                default:
                                                    switch (i10) {
                                                        case 30:
                                                            i16 = 256;
                                                            break;
                                                        case 31:
                                                            i16 = 512;
                                                            break;
                                                        case 32:
                                                            i16 = 1024;
                                                            break;
                                                        default:
                                                            switch (i10) {
                                                                case 40:
                                                                    i16 = 2048;
                                                                    break;
                                                                case 41:
                                                                    i16 = 4096;
                                                                    break;
                                                                case 42:
                                                                    i16 = 8192;
                                                                    break;
                                                                default:
                                                                    switch (i10) {
                                                                        case 50:
                                                                            i16 = 16384;
                                                                            break;
                                                                        case 51:
                                                                            i16 = 32768;
                                                                            break;
                                                                        case 52:
                                                                            i16 = 65536;
                                                                            break;
                                                                        default:
                                                                            i16 = -1;
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    if (i16 != -1) {
                                        return new android.util.Pair(java.lang.Integer.valueOf(i15), java.lang.Integer.valueOf(i16));
                                    }
                                    sb = new java.lang.StringBuilder();
                                    str = "Unknown AVC level: ";
                                    sb.append(str);
                                    sb.append(i10);
                                    strConcat = sb.toString();
                                    com.google.android.gms.internal.ads.AbstractC3586eM.f("CodecSpecificDataUtil", strConcat);
                                }
                            } catch (java.lang.NumberFormatException unused2) {
                                strConcat = "Ignoring malformed AVC codec string: ".concat(java.lang.String.valueOf(str6));
                            }
                            break;
                        }
                        strConcat = "Ignoring malformed AVC codec string: ".concat(java.lang.String.valueOf(str6));
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("CodecSpecificDataUtil", strConcat);
                        break;
                    case "vp09":
                        java.lang.String str7 = d6.f26570k;
                        if (strArrSplit.length >= 3) {
                            try {
                                i6 = java.lang.Integer.parseInt(strArrSplit[1]);
                                i10 = java.lang.Integer.parseInt(strArrSplit[2]);
                                if (i6 == 0) {
                                    i11 = 1;
                                } else if (i6 == 1) {
                                    i11 = 2;
                                } else if (i6 != 2) {
                                    i11 = i6 != 3 ? -1 : 8;
                                } else {
                                    i11 = 4;
                                }
                                if (i11 == -1) {
                                    sb2 = new java.lang.StringBuilder();
                                    str2 = "Unknown VP9 profile: ";
                                    sb2.append(str2);
                                    sb2.append(i6);
                                    strConcat = sb2.toString();
                                    com.google.android.gms.internal.ads.AbstractC3586eM.f("CodecSpecificDataUtil", strConcat);
                                } else {
                                    if (i10 != 10) {
                                        if (i10 == 11) {
                                            i16 = 2;
                                        } else if (i10 == 20) {
                                            i16 = 4;
                                        } else if (i10 == 21) {
                                            i16 = 8;
                                        } else if (i10 == 30) {
                                            i16 = 16;
                                        } else if (i10 == 31) {
                                            i16 = 32;
                                        } else if (i10 == 40) {
                                            i16 = 64;
                                        } else if (i10 == 41) {
                                            i16 = 128;
                                        } else if (i10 == 50) {
                                            i16 = 256;
                                        } else if (i10 != 51) {
                                            switch (i10) {
                                                case 60:
                                                    i16 = 2048;
                                                    break;
                                                case 61:
                                                    i16 = 4096;
                                                    break;
                                                case 62:
                                                    i16 = 8192;
                                                    break;
                                                default:
                                                    i16 = -1;
                                                    break;
                                            }
                                        } else {
                                            i16 = 512;
                                        }
                                    }
                                    if (i16 != -1) {
                                        return new android.util.Pair(java.lang.Integer.valueOf(i11), java.lang.Integer.valueOf(i16));
                                    }
                                    sb = new java.lang.StringBuilder();
                                    str = "Unknown VP9 level: ";
                                    sb.append(str);
                                    sb.append(i10);
                                    strConcat = sb.toString();
                                    com.google.android.gms.internal.ads.AbstractC3586eM.f("CodecSpecificDataUtil", strConcat);
                                }
                            } catch (java.lang.NumberFormatException unused3) {
                                strValueOf = java.lang.String.valueOf(str7);
                                str3 = "Ignoring malformed VP9 codec string: ";
                                strConcat = str3.concat(strValueOf);
                            }
                            break;
                        }
                        strValueOf = java.lang.String.valueOf(str7);
                        str3 = "Ignoring malformed VP9 codec string: ";
                        break;
                    case "hev1":
                    case "hvc1":
                        return b(d6.f26570k, strArrSplit, d6.f26550C);
                    case "av01":
                        java.lang.String str8 = d6.f26570k;
                        com.google.android.gms.internal.ads.PA0 pa0 = d6.f26550C;
                        if (strArrSplit.length >= 4) {
                            try {
                                int i17 = java.lang.Integer.parseInt(strArrSplit[1]);
                                i6 = java.lang.Integer.parseInt(strArrSplit[2].substring(0, 2));
                                int i18 = java.lang.Integer.parseInt(strArrSplit[3]);
                                if (i17 != 0) {
                                    sb2 = new java.lang.StringBuilder();
                                    sb2.append("Unknown AV1 profile: ");
                                    sb2.append(i17);
                                } else {
                                    if (i18 == 8) {
                                        i12 = 1;
                                    } else if (i18 != 10) {
                                        sb2 = new java.lang.StringBuilder();
                                        sb2.append("Unknown AV1 bit depth: ");
                                        sb2.append(i18);
                                    } else {
                                        i12 = (pa0 == null || !(pa0.f30665d != null || (i13 = pa0.f30664c) == 7 || i13 == 6)) ? 2 : 4096;
                                    }
                                    switch (i6) {
                                        case 0:
                                            break;
                                        case 1:
                                            i16 = 2;
                                            break;
                                        case 2:
                                            i16 = 4;
                                            break;
                                        case 3:
                                            i16 = 8;
                                            break;
                                        case 4:
                                            i16 = 16;
                                            break;
                                        case 5:
                                            i16 = 32;
                                            break;
                                        case 6:
                                            i16 = 64;
                                            break;
                                        case 7:
                                            i16 = 128;
                                            break;
                                        case 8:
                                            i16 = 256;
                                            break;
                                        case 9:
                                            i16 = 512;
                                            break;
                                        case 10:
                                            i16 = 1024;
                                            break;
                                        case 11:
                                            i16 = 2048;
                                            break;
                                        case 12:
                                            i16 = 4096;
                                            break;
                                        case 13:
                                            i16 = 8192;
                                            break;
                                        case 14:
                                            i16 = 16384;
                                            break;
                                        case 15:
                                            i16 = 32768;
                                            break;
                                        case 16:
                                            i16 = 65536;
                                            break;
                                        case 17:
                                            i16 = 131072;
                                            break;
                                        case 18:
                                            i16 = 262144;
                                            break;
                                        case 19:
                                            i16 = 524288;
                                            break;
                                        case 20:
                                            i16 = 1048576;
                                            break;
                                        case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                                            i16 = 2097152;
                                            break;
                                        case 22:
                                            i16 = 4194304;
                                            break;
                                        case 23:
                                            i16 = 8388608;
                                            break;
                                        default:
                                            i16 = -1;
                                            break;
                                    }
                                    if (i16 != -1) {
                                        return new android.util.Pair(java.lang.Integer.valueOf(i12), java.lang.Integer.valueOf(i16));
                                    }
                                    sb2 = new java.lang.StringBuilder();
                                    str2 = "Unknown AV1 level: ";
                                    sb2.append(str2);
                                    sb2.append(i6);
                                }
                                strConcat = sb2.toString();
                            } catch (java.lang.NumberFormatException unused4) {
                                strValueOf = java.lang.String.valueOf(str8);
                                str3 = "Ignoring malformed AV1 codec string: ";
                                strConcat = str3.concat(strValueOf);
                            }
                            com.google.android.gms.internal.ads.AbstractC3586eM.f("CodecSpecificDataUtil", strConcat);
                            break;
                        }
                        strValueOf = java.lang.String.valueOf(str8);
                        str3 = "Ignoring malformed AV1 codec string: ";
                        break;
                    case "mp4a":
                        java.lang.String str9 = d6.f26570k;
                        if (strArrSplit.length == 3) {
                            try {
                                if ("audio/mp4a-latm".equals(com.google.android.gms.internal.ads.AbstractC3606ed.d(java.lang.Integer.parseInt(strArrSplit[1], 16)))) {
                                    int i19 = java.lang.Integer.parseInt(strArrSplit[2]);
                                    if (i19 == 17) {
                                        i14 = 17;
                                    } else if (i19 == 20) {
                                        i14 = 20;
                                    } else if (i19 == 23) {
                                        i14 = 23;
                                    } else if (i19 == 29) {
                                        i14 = 29;
                                    } else if (i19 == 39) {
                                        i14 = 39;
                                    } else if (i19 != 42) {
                                        switch (i19) {
                                            case 1:
                                                i14 = 1;
                                                break;
                                            case 2:
                                                i14 = 2;
                                                break;
                                            case 3:
                                                break;
                                            case 4:
                                                i14 = 4;
                                                break;
                                            case 5:
                                                i14 = 5;
                                                break;
                                            case 6:
                                                i14 = 6;
                                                break;
                                            default:
                                                i14 = -1;
                                                break;
                                        }
                                    } else {
                                        i14 = 42;
                                    }
                                    if (i14 != -1) {
                                        return new android.util.Pair(java.lang.Integer.valueOf(i14), 0);
                                    }
                                }
                            } catch (java.lang.NumberFormatException unused5) {
                                strValueOf = java.lang.String.valueOf(str9);
                                str3 = "Ignoring malformed MP4A codec string: ";
                                strConcat = str3.concat(strValueOf);
                                com.google.android.gms.internal.ads.AbstractC3586eM.f("CodecSpecificDataUtil", strConcat);
                            }
                            break;
                        }
                        strValueOf = java.lang.String.valueOf(str9);
                        str3 = "Ignoring malformed MP4A codec string: ";
                        break;
                }
            } else {
                java.lang.String str10 = d6.f26570k;
                if (strArrSplit.length < 3) {
                    strValueOf = java.lang.String.valueOf(str10);
                    str3 = "Ignoring malformed Dolby Vision codec string: ";
                } else {
                    java.util.regex.Matcher matcher = f30201c.matcher(strArrSplit[1]);
                    if (matcher.matches()) {
                        java.lang.String strGroup = matcher.group(1);
                        if (strGroup != null) {
                            if (strGroup.hashCode() != 1567) {
                                switch (strGroup) {
                                    case "00":
                                        num = 1;
                                        break;
                                    case "01":
                                        num = 2;
                                        break;
                                    case "02":
                                        num = 4;
                                        break;
                                    case "03":
                                        num = 8;
                                        break;
                                    case "04":
                                        num = 16;
                                        break;
                                    case "05":
                                        num = 32;
                                        break;
                                    case "06":
                                        num = 64;
                                        break;
                                    case "07":
                                        num = 128;
                                        break;
                                    case "08":
                                        num = 256;
                                        break;
                                    case "09":
                                        num = 512;
                                        break;
                                    default:
                                        num = null;
                                        break;
                                }
                            } else if (strGroup.equals("10")) {
                                num = 1024;
                            } else {
                                num = null;
                            }
                        } else {
                            num = null;
                        }
                        if (num == null) {
                            strValueOf = java.lang.String.valueOf(strGroup);
                            str3 = "Unknown Dolby Vision profile string: ";
                        } else {
                            java.lang.String str11 = strArrSplit[2];
                            if (str11 != null) {
                                str11.hashCode();
                                switch (str11) {
                                    case "01":
                                        num2 = 1;
                                        break;
                                    case "02":
                                        num2 = 2;
                                        break;
                                    case "03":
                                        num2 = 4;
                                        break;
                                    case "04":
                                        num2 = 8;
                                        break;
                                    case "05":
                                        num2 = 16;
                                        break;
                                    case "06":
                                        num2 = 32;
                                        break;
                                    case "07":
                                        num2 = 64;
                                        break;
                                    case "08":
                                        num2 = 128;
                                        break;
                                    case "09":
                                        num2 = 256;
                                        break;
                                    default:
                                        switch (str11) {
                                            case 1567:
                                                if (!str11.equals("10")) {
                                                    num2 = null;
                                                } else {
                                                    num2 = 512;
                                                }
                                                break;
                                            case 1568:
                                                if (!str11.equals("11")) {
                                                    num2 = null;
                                                } else {
                                                    num2 = 1024;
                                                }
                                                break;
                                            case 1569:
                                                if (!str11.equals("12")) {
                                                    num2 = null;
                                                } else {
                                                    num2 = 2048;
                                                }
                                                break;
                                            case 1570:
                                                if (!str11.equals("13")) {
                                                    num2 = null;
                                                } else {
                                                    num2 = 4096;
                                                }
                                                break;
                                            default:
                                                num2 = null;
                                                break;
                                        }
                                }
                            } else {
                                num2 = null;
                            }
                            if (num2 != null) {
                                return new android.util.Pair(num, num2);
                            }
                            strValueOf = java.lang.String.valueOf(str11);
                            str3 = "Unknown Dolby Vision level string: ";
                        }
                    } else {
                        strValueOf = java.lang.String.valueOf(str10);
                        str3 = "Ignoring malformed Dolby Vision codec string: ";
                    }
                }
            }
            strConcat = str3.concat(strValueOf);
            com.google.android.gms.internal.ads.AbstractC3586eM.f("CodecSpecificDataUtil", strConcat);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x018b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    public static android.util.Pair b(java.lang.String str, java.lang.String[] strArr, com.google.android.gms.internal.ads.PA0 pa0) {
        java.lang.String strValueOf;
        java.lang.String str2;
        int i6;
        java.lang.String strConcat;
        java.lang.Integer numValueOf;
        int i10;
        if (strArr.length < 4) {
            strConcat = "Ignoring malformed HEVC codec string: ".concat(java.lang.String.valueOf(str));
        } else {
            java.util.regex.Matcher matcher = f30201c.matcher(strArr[1]);
            if (matcher.matches()) {
                java.lang.String strGroup = matcher.group(1);
                if ("1".equals(strGroup)) {
                    i6 = 1;
                } else if ("2".equals(strGroup)) {
                    i6 = (pa0 == null || pa0.f30664c != 6) ? 2 : 4096;
                } else {
                    if ("6".equals(strGroup)) {
                        i6 = 6;
                    } else {
                        strValueOf = java.lang.String.valueOf(strGroup);
                        str2 = "Unknown HEVC profile string: ";
                    }
                    strConcat = str2.concat(strValueOf);
                }
                java.lang.String str3 = strArr[3];
                if (str3 != null) {
                    switch (str3) {
                        case "L30":
                            numValueOf = 1;
                            break;
                        case "L60":
                            numValueOf = 4;
                            break;
                        case "L63":
                            numValueOf = 16;
                            break;
                        case "L90":
                            i10 = 64;
                            numValueOf = java.lang.Integer.valueOf(i10);
                            break;
                        case "L93":
                            i10 = 256;
                            numValueOf = java.lang.Integer.valueOf(i10);
                            break;
                        case "L120":
                            i10 = 1024;
                            numValueOf = java.lang.Integer.valueOf(i10);
                            break;
                        case "L123":
                            numValueOf = 4096;
                            break;
                        case "L150":
                            i10 = 16384;
                            numValueOf = java.lang.Integer.valueOf(i10);
                            break;
                        case "L153":
                            i10 = 65536;
                            numValueOf = java.lang.Integer.valueOf(i10);
                            break;
                        case "L156":
                            i10 = 262144;
                            numValueOf = java.lang.Integer.valueOf(i10);
                            break;
                        case "L180":
                            i10 = 1048576;
                            numValueOf = java.lang.Integer.valueOf(i10);
                            break;
                        case "L183":
                            i10 = 4194304;
                            numValueOf = java.lang.Integer.valueOf(i10);
                            break;
                        case "L186":
                            i10 = 16777216;
                            numValueOf = java.lang.Integer.valueOf(i10);
                            break;
                        case "H30":
                            numValueOf = 2;
                            break;
                        case "H60":
                            numValueOf = 8;
                            break;
                        case "H63":
                            i10 = 32;
                            numValueOf = java.lang.Integer.valueOf(i10);
                            break;
                        case "H90":
                            i10 = 128;
                            numValueOf = java.lang.Integer.valueOf(i10);
                            break;
                        case "H93":
                            i10 = 512;
                            numValueOf = java.lang.Integer.valueOf(i10);
                            break;
                        case "H120":
                            i10 = 2048;
                            numValueOf = java.lang.Integer.valueOf(i10);
                            break;
                        case "H123":
                            i10 = 8192;
                            numValueOf = java.lang.Integer.valueOf(i10);
                            break;
                        case "H150":
                            i10 = 32768;
                            numValueOf = java.lang.Integer.valueOf(i10);
                            break;
                        case "H153":
                            i10 = 131072;
                            numValueOf = java.lang.Integer.valueOf(i10);
                            break;
                        case "H156":
                            i10 = 524288;
                            numValueOf = java.lang.Integer.valueOf(i10);
                            break;
                        case "H180":
                            i10 = 2097152;
                            numValueOf = java.lang.Integer.valueOf(i10);
                            break;
                        case "H183":
                            i10 = 8388608;
                            numValueOf = java.lang.Integer.valueOf(i10);
                            break;
                        case "H186":
                            i10 = 33554432;
                            numValueOf = java.lang.Integer.valueOf(i10);
                            break;
                        default:
                            numValueOf = null;
                            break;
                    }
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    return new android.util.Pair(java.lang.Integer.valueOf(i6), numValueOf);
                }
                strValueOf = java.lang.String.valueOf(str3);
                str2 = "Unknown HEVC level string: ";
                strConcat = str2.concat(strValueOf);
            } else {
                strConcat = "Ignoring malformed HEVC codec string: ".concat(java.lang.String.valueOf(str));
            }
        }
        com.google.android.gms.internal.ads.AbstractC3586eM.f("CodecSpecificDataUtil", strConcat);
        return null;
    }

    public static java.lang.String c(int i6, int i10, int i11) {
        return java.lang.String.format("avc1.%02X%02X%02X", java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(i11));
    }

    public static java.lang.String d(int i6, boolean z6, int i10, int i11, int[] iArr, int i12) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.format(java.util.Locale.US, "hvc1.%s%d.%X.%c%d", f30200b[i6], java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(i11), java.lang.Character.valueOf(true != z6 ? 'L' : 'H'), java.lang.Integer.valueOf(i12)));
        int i13 = 6;
        while (i13 > 0) {
            int i14 = i13 - 1;
            if (iArr[i14] != 0) {
                break;
            }
            i13 = i14;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            sb.append(java.lang.String.format(".%02X", java.lang.Integer.valueOf(iArr[i15])));
        }
        return sb.toString();
    }

    public static byte[] e(byte[] bArr, int i6, int i10) {
        byte[] bArr2 = new byte[i10 + 4];
        java.lang.System.arraycopy(f30199a, 0, bArr2, 0, 4);
        java.lang.System.arraycopy(bArr, i6, bArr2, 4, i10);
        return bArr2;
    }
}
