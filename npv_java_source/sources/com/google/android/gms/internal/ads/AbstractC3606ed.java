package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3606ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.ArrayList f35015a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.regex.Pattern f35016b = java.util.regex.Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f35017c = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    public static int a(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.C2266Dc c2266DcC;
        switch (str) {
            case "audio/mpeg":
                return 9;
            case "audio/mp4a-latm":
                if (str2 == null || (c2266DcC = c(str2)) == null) {
                    return 0;
                }
                return c2266DcC.a();
            case "audio/ac3":
                return 5;
            case "audio/eac3":
                return 6;
            case "audio/eac3-joc":
                return 18;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts":
                return 7;
            case "audio/vnd.dts.hd":
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/true-hd":
                return 14;
            case "audio/opus":
                return 20;
            default:
                return 0;
        }
    }

    public static int b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return -1;
        }
        if (g(str)) {
            return 1;
        }
        if (i(str)) {
            return 2;
        }
        if ("text".equals(j(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if (h(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        java.util.ArrayList arrayList = f35015a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        androidx.appcompat.app.D.a(arrayList.get(0));
        throw null;
    }

    static com.google.android.gms.internal.ads.C2266Dc c(java.lang.String str) {
        java.util.regex.Matcher matcher = f35016b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        java.lang.String strGroup = matcher.group(1);
        strGroup.getClass();
        java.lang.String strGroup2 = matcher.group(2);
        try {
            return new com.google.android.gms.internal.ads.C2266Dc(java.lang.Integer.parseInt(strGroup, 16), strGroup2 != null ? java.lang.Integer.parseInt(strGroup2) : 0);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static java.lang.String d(int i6) {
        if (i6 == 32) {
            return "video/mp4v-es";
        }
        if (i6 == 33) {
            return "video/avc";
        }
        if (i6 == 35) {
            return "video/hevc";
        }
        if (i6 == 64) {
            return "audio/mp4a-latm";
        }
        if (i6 == 163) {
            return "video/wvc1";
        }
        if (i6 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i6 == 221) {
            return "audio/vorbis";
        }
        if (i6 == 165) {
            return "audio/ac3";
        }
        if (i6 == 166) {
            return "audio/eac3";
        }
        switch (i6) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i6) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    public static java.lang.String e(java.lang.String str) {
        byte b6;
        if (str == null) {
            return null;
        }
        java.lang.String strA = com.google.android.gms.internal.ads.AbstractC3723fg0.a(str);
        switch (strA) {
            case "audio/x-flac":
                b6 = 0;
                break;
            case "application/x-mpegurl":
                b6 = 3;
                break;
            case "audio/x-wav":
                b6 = 2;
                break;
            case "audio/mpeg-l1":
                b6 = 4;
                break;
            case "audio/mpeg-l2":
                b6 = 5;
                break;
            case "audio/mp3":
                b6 = 1;
                break;
            default:
                b6 = -1;
                break;
        }
        if (b6 == 0) {
            return "audio/flac";
        }
        if (b6 == 1) {
            return "audio/mpeg";
        }
        if (b6 == 2) {
            return "audio/wav";
        }
        if (b6 == 3) {
            return "application/x-mpegURL";
        }
        if (b6 != 4) {
            return b6 != 5 ? strA : "audio/mpeg-L2";
        }
        return "audio/mpeg-L1";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    public static boolean f(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.C2266Dc c2266DcC;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mpeg":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/raw":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
            case "audio/flac":
            case "audio/ac3":
            case "audio/eac3":
            case "audio/eac3-joc":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (c2266DcC = c(str2)) == null || (iA = c2266DcC.a()) == 0 || iA == 16) ? false : true;
            default:
                return false;
        }
    }

    public static boolean g(java.lang.String str) {
        return "audio".equals(j(str));
    }

    public static boolean h(java.lang.String str) {
        return "image".equals(j(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean i(java.lang.String str) {
        return "video".equals(j(str));
    }

    private static java.lang.String j(java.lang.String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }
}
