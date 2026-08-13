package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EW {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f27061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.String f27062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.String f27063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.lang.String f27064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.lang.String f27065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f27066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.regex.Pattern f27067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static java.util.HashMap f27068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final java.lang.String[] f27069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final java.lang.String[] f27070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f27071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f27072l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f27073m;

    static {
        int i6 = android.os.Build.VERSION.SDK_INT;
        f27061a = i6;
        java.lang.String str = android.os.Build.DEVICE;
        f27062b = str;
        java.lang.String str2 = android.os.Build.MANUFACTURER;
        f27063c = str2;
        java.lang.String str3 = android.os.Build.MODEL;
        f27064d = str3;
        f27065e = str + ", " + str3 + ", " + str2 + ", " + i6;
        f27066f = new byte[0];
        f27067g = java.util.regex.Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f27069i = new java.lang.String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f27070j = new java.lang.String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f27071k = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f27072l = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f27073m = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[RETURN] */
    public static int A(int i6) {
        switch (i6) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (f27061a >= 32) {
                    return 737532;
                }
                return 6396;
            case 12:
                return 743676;
        }
    }

    public static int B(java.nio.ByteBuffer byteBuffer, int i6) {
        int i10 = byteBuffer.getInt(i6);
        return byteBuffer.order() == java.nio.ByteOrder.BIG_ENDIAN ? i10 : java.lang.Integer.reverseBytes(i10);
    }

    public static int C(int i6) {
        if (i6 != 2) {
            if (i6 == 3) {
                return 1;
            }
            if (i6 != 4) {
                if (i6 != 21) {
                    if (i6 != 22) {
                        if (i6 != 268435456) {
                            if (i6 != 1342177280) {
                                if (i6 != 1610612736) {
                                    throw new java.lang.IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int D(int i6) {
        if (i6 == 2 || i6 == 4) {
            return 6005;
        }
        if (i6 == 10) {
            return 6004;
        }
        if (i6 == 7) {
            return 6005;
        }
        if (i6 == 8) {
            return 6003;
        }
        switch (i6) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 22:
                return 6004;
            default:
                switch (i6) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int E(java.lang.String str) {
        java.lang.String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        java.lang.String str2 = strArrSplit[length - 1];
        boolean z6 = length >= 3 && "neg".equals(strArrSplit[length + (-2)]);
        try {
            if (str2 == null) {
                throw null;
            }
            int i6 = java.lang.Integer.parseInt(str2);
            return z6 ? -i6 : i6;
        } catch (java.lang.NumberFormatException unused) {
            return 0;
        }
    }

    public static int F(int i6) {
        if (i6 == 8) {
            return 3;
        }
        if (i6 == 16) {
            return 2;
        }
        if (i6 != 24) {
            return i6 != 32 ? 0 : 22;
        }
        return 21;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    public static int G(android.net.Uri uri) {
        byte b6;
        int i6;
        java.lang.String scheme = uri.getScheme();
        if (scheme != null && com.google.android.gms.internal.ads.AbstractC3723fg0.c("rtsp", scheme)) {
            return 3;
        }
        java.lang.String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            switch (com.google.android.gms.internal.ads.AbstractC3723fg0.a(lastPathSegment.substring(iLastIndexOf + 1))) {
                case "ism":
                    b6 = 2;
                    break;
                case "mpd":
                    b6 = 0;
                    break;
                case "isml":
                    b6 = 3;
                    break;
                case "m3u8":
                    b6 = 1;
                    break;
                default:
                    b6 = -1;
                    break;
            }
            if (b6 == 0) {
                i6 = 0;
            } else if (b6 != 1) {
                i6 = (b6 == 2 || b6 == 3) ? 1 : 4;
            } else {
                i6 = 2;
            }
            if (i6 != 4) {
                return i6;
            }
        }
        java.util.regex.Pattern pattern = f27067g;
        java.lang.String path = uri.getPath();
        path.getClass();
        java.util.regex.Matcher matcher = pattern.matcher(path);
        if (!matcher.matches()) {
            return 4;
        }
        java.lang.String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (strGroup.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static long H(long j6, int i6) {
        return M(j6, i6, 1000000L, java.math.RoundingMode.UP);
    }

    public static long I(long j6, float f6) {
        return f6 == 1.0f ? j6 : java.lang.Math.round(j6 * ((double) f6));
    }

    public static long J(long j6, float f6) {
        return f6 == 1.0f ? j6 : java.lang.Math.round(j6 / ((double) f6));
    }

    public static long K(long j6) {
        return (j6 == -9223372036854775807L || j6 == Long.MIN_VALUE) ? j6 : j6 * 1000;
    }

    public static long L(long j6, int i6) {
        return M(j6, 1000000L, i6, java.math.RoundingMode.DOWN);
    }

    public static long M(long j6, long j10, long j11, java.math.RoundingMode roundingMode) {
        if (j6 == 0 || j10 == 0) {
            return 0L;
        }
        if (j11 >= j10 && j11 % j10 == 0) {
            return com.google.android.gms.internal.ads.AbstractC2281Dj0.b(j6, com.google.android.gms.internal.ads.AbstractC2281Dj0.b(j11, j10, java.math.RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j11 < j10 && j10 % j11 == 0) {
            return com.google.android.gms.internal.ads.AbstractC2281Dj0.d(j6, com.google.android.gms.internal.ads.AbstractC2281Dj0.b(j10, j11, java.math.RoundingMode.UNNECESSARY));
        }
        if (j11 < j6 || j11 % j6 != 0) {
            return (j11 >= j6 || j6 % j11 != 0) ? p(j6, j10, j11, roundingMode) : com.google.android.gms.internal.ads.AbstractC2281Dj0.d(j10, com.google.android.gms.internal.ads.AbstractC2281Dj0.b(j6, j11, java.math.RoundingMode.UNNECESSARY));
        }
        return com.google.android.gms.internal.ads.AbstractC2281Dj0.b(j10, com.google.android.gms.internal.ads.AbstractC2281Dj0.b(j11, j6, java.math.RoundingMode.UNNECESSARY), roundingMode);
    }

    public static long N(long j6) {
        return (j6 == -9223372036854775807L || j6 == Long.MIN_VALUE) ? j6 : j6 / 1000;
    }

    public static android.graphics.Point O(android.content.Context context) {
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
        android.view.Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && m(context)) {
            java.lang.String strQ = q(f27061a < 28 ? "sys.display-size" : "vendor.display-size");
            if (!android.text.TextUtils.isEmpty(strQ)) {
                try {
                    java.lang.String[] strArrSplit = strQ.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i6 = java.lang.Integer.parseInt(strArrSplit[0]);
                        int i10 = java.lang.Integer.parseInt(strArrSplit[1]);
                        if (i6 > 0 && i10 > 0) {
                            return new android.graphics.Point(i6, i10);
                        }
                    }
                } catch (java.lang.NumberFormatException unused) {
                }
                com.google.android.gms.internal.ads.AbstractC3586eM.c("Util", "Invalid display size: ".concat(java.lang.String.valueOf(strQ)));
            }
            if ("Sony".equals(f27063c) && f27064d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new android.graphics.Point(3840, 2160);
            }
        }
        android.graphics.Point point = new android.graphics.Point();
        if (f27061a < 23) {
            display.getRealSize(point);
            return point;
        }
        android.view.Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static android.media.AudioFormat P(int i6, int i10, int i11) {
        return new android.media.AudioFormat.Builder().setSampleRate(i6).setChannelMask(i10).setEncoding(i11).build();
    }

    public static android.os.Handler Q(android.os.Handler.Callback callback) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        com.google.android.gms.internal.ads.LC.b(looperMyLooper);
        return new android.os.Handler(looperMyLooper, null);
    }

    public static android.os.Looper R() {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : android.os.Looper.getMainLooper();
    }

    public static com.google.android.gms.internal.ads.D a(int i6, int i10, int i11) {
        com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
        c4682oK0.B("audio/raw");
        c4682oK0.r0(i10);
        c4682oK0.C(i11);
        c4682oK0.u(i6);
        return c4682oK0.H();
    }

    public static java.lang.String b(byte[] bArr) {
        return new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
    }

    public static java.lang.String c(byte[] bArr, int i6, int i10) {
        return new java.lang.String(bArr, i6, i10, java.nio.charset.StandardCharsets.UTF_8);
    }

    public static java.lang.String d(int i6) {
        switch (i6) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static java.lang.String e(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        java.lang.String strA = com.google.android.gms.internal.ads.AbstractC3723fg0.a(str);
        int i6 = 0;
        java.lang.String str2 = strA.split("-", 2)[0];
        if (f27068h == null) {
            f27068h = r();
        }
        java.lang.String str3 = (java.lang.String) f27068h.get(str2);
        if (str3 != null) {
            strA = str3.concat(java.lang.String.valueOf(strA.substring(str2.length())));
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strA;
        }
        while (true) {
            java.lang.String[] strArr = f27070j;
            int length = strArr.length;
            if (i6 >= 18) {
                return strA;
            }
            if (strA.startsWith(strArr[i6])) {
                return java.lang.String.valueOf(strArr[i6 + 1]).concat(java.lang.String.valueOf(strA.substring(strArr[i6].length())));
            }
            i6 += 2;
        }
    }

    public static void f(long[] jArr, long j6, long j10) {
        java.math.RoundingMode roundingMode = java.math.RoundingMode.DOWN;
        int i6 = 0;
        if (j10 >= 1000000 && j10 % 1000000 == 0) {
            long jB = com.google.android.gms.internal.ads.AbstractC2281Dj0.b(j10, 1000000L, java.math.RoundingMode.UNNECESSARY);
            while (i6 < jArr.length) {
                jArr[i6] = com.google.android.gms.internal.ads.AbstractC2281Dj0.b(jArr[i6], jB, roundingMode);
                i6++;
            }
            return;
        }
        if (j10 < 1000000 && 1000000 % j10 == 0) {
            long jB2 = com.google.android.gms.internal.ads.AbstractC2281Dj0.b(1000000L, j10, java.math.RoundingMode.UNNECESSARY);
            while (i6 < jArr.length) {
                jArr[i6] = com.google.android.gms.internal.ads.AbstractC2281Dj0.d(jArr[i6], jB2);
                i6++;
            }
            return;
        }
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long j11 = jArr[i10];
            if (j11 != 0) {
                if (j10 >= j11 && j10 % j11 == 0) {
                    jArr[i10] = com.google.android.gms.internal.ads.AbstractC2281Dj0.b(1000000L, com.google.android.gms.internal.ads.AbstractC2281Dj0.b(j10, j11, java.math.RoundingMode.UNNECESSARY), roundingMode);
                } else if (j10 >= j11 || j11 % j10 != 0) {
                    jArr[i10] = p(j11, 1000000L, j10, roundingMode);
                } else {
                    jArr[i10] = com.google.android.gms.internal.ads.AbstractC2281Dj0.d(1000000L, com.google.android.gms.internal.ads.AbstractC2281Dj0.b(j11, j10, java.math.RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    public static boolean g(android.util.SparseArray sparseArray, int i6) {
        return sparseArray.indexOfKey(i6) >= 0;
    }

    public static boolean h(com.google.android.gms.internal.ads.C5128sR c5128sR, com.google.android.gms.internal.ads.C5128sR c5128sR2, java.util.zip.Inflater inflater) {
        boolean z6 = false;
        if (c5128sR.r() <= 0) {
            return false;
        }
        if (c5128sR2.s() < c5128sR.r()) {
            int iR = c5128sR.r();
            c5128sR2.f(iR + iR);
        }
        if (inflater == null) {
            inflater = new java.util.zip.Inflater();
        }
        inflater.setInput(c5128sR.n(), c5128sR.t(), c5128sR.r());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(c5128sR2.n(), iInflate, c5128sR2.s() - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                        break;
                    }
                    if (iInflate == c5128sR2.s()) {
                        int iS = c5128sR2.s();
                        c5128sR2.f(iS + iS);
                    }
                } else {
                    c5128sR2.k(iInflate);
                    z6 = true;
                    break;
                }
            } catch (java.util.zip.DataFormatException unused) {
            } catch (java.lang.Throwable th) {
                inflater.reset();
                throw th;
            }
        }
        inflater.reset();
        return z6;
    }

    public static boolean i(android.content.Context context) {
        return f27061a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean j(int i6) {
        return i6 == 3 || i6 == 2 || i6 == 268435456 || i6 == 21 || i6 == 1342177280 || i6 == 22 || i6 == 1610612736 || i6 == 4;
    }

    public static boolean k(android.content.Context context) {
        int i6 = f27061a;
        if (i6 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i6 == 30) {
            java.lang.String str = f27064d;
            if (com.google.android.gms.internal.ads.AbstractC3723fg0.c(str, "moto g(20)") || com.google.android.gms.internal.ads.AbstractC3723fg0.c(str, "rmx3231")) {
                return true;
            }
        }
        return i6 == 34 && com.google.android.gms.internal.ads.AbstractC3723fg0.c(f27064d, "sm-x200");
    }

    public static boolean l(int i6) {
        return i6 == 10 || i6 == 13;
    }

    public static boolean m(android.content.Context context) {
        android.app.UiModeManager uiModeManager = (android.app.UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static java.lang.Object[] n(java.lang.Object[] objArr, int i6) {
        com.google.android.gms.internal.ads.LC.d(i6 <= objArr.length);
        return java.util.Arrays.copyOf(objArr, i6);
    }

    private static int o(int i6, int i10) {
        return (char) (f27072l[i6 ^ (i10 >> 12)] ^ ((char) (i10 << 4)));
    }

    private static long p(long j6, long j10, long j11, java.math.RoundingMode roundingMode) {
        long jD = com.google.android.gms.internal.ads.AbstractC2281Dj0.d(j6, j10);
        if (jD != Long.MAX_VALUE && jD != Long.MIN_VALUE) {
            return com.google.android.gms.internal.ads.AbstractC2281Dj0.b(jD, j11, roundingMode);
        }
        long jC = com.google.android.gms.internal.ads.AbstractC2281Dj0.c(java.lang.Math.abs(j10), java.lang.Math.abs(j11));
        java.math.RoundingMode roundingMode2 = java.math.RoundingMode.UNNECESSARY;
        long jB = com.google.android.gms.internal.ads.AbstractC2281Dj0.b(j10, jC, roundingMode2);
        long jB2 = com.google.android.gms.internal.ads.AbstractC2281Dj0.b(j11, jC, roundingMode2);
        long jC2 = com.google.android.gms.internal.ads.AbstractC2281Dj0.c(java.lang.Math.abs(j6), java.lang.Math.abs(jB2));
        long jB3 = com.google.android.gms.internal.ads.AbstractC2281Dj0.b(j6, jC2, roundingMode2);
        long jB4 = com.google.android.gms.internal.ads.AbstractC2281Dj0.b(jB2, jC2, roundingMode2);
        long jD2 = com.google.android.gms.internal.ads.AbstractC2281Dj0.d(jB3, jB);
        if (jD2 != Long.MAX_VALUE && jD2 != Long.MIN_VALUE) {
            return com.google.android.gms.internal.ads.AbstractC2281Dj0.b(jD2, jB4, roundingMode);
        }
        double d6 = jB3 * (jB / jB4);
        if (d6 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d6 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return com.google.android.gms.internal.ads.AbstractC5816yj0.b(d6, roundingMode);
    }

    private static java.lang.String q(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return (java.lang.String) cls.getMethod("get", java.lang.String.class).invoke(cls, str);
        } catch (java.lang.Exception e6) {
            com.google.android.gms.internal.ads.AbstractC3586eM.d("Util", "Failed to read system property ".concat(str), e6);
            return null;
        }
    }

    private static java.util.HashMap r() {
        java.lang.String[] iSOLanguages = java.util.Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = f27069i.length;
        java.util.HashMap map = new java.util.HashMap(length + 88);
        int i6 = 0;
        for (java.lang.String str : iSOLanguages) {
            try {
                java.lang.String iSO3Language = new java.util.Locale(str).getISO3Language();
                if (!android.text.TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (java.util.MissingResourceException unused) {
            }
        }
        while (true) {
            java.lang.String[] strArr = f27069i;
            int length3 = strArr.length;
            if (i6 >= 88) {
                return map;
            }
            map.put(strArr[i6], strArr[i6 + 1]);
            i6 += 2;
        }
    }

    public static int s(long[] jArr, long j6, boolean z6, boolean z10) {
        int i6;
        int iBinarySearch = java.util.Arrays.binarySearch(jArr, j6);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i6 = iBinarySearch + 1;
            if (i6 >= jArr.length || jArr[i6] != j6) {
                break;
            }
            iBinarySearch = i6;
        }
        return !z6 ? i6 : iBinarySearch;
    }

    public static int t(com.google.android.gms.internal.ads.FM fm, long j6, boolean z6, boolean z10) {
        int iA = fm.a() - 1;
        int i6 = 0;
        while (i6 <= iA) {
            int i10 = (i6 + iA) >>> 1;
            if (fm.b(i10) < j6) {
                i6 = i10 + 1;
            } else {
                iA = i10 - 1;
            }
        }
        int i11 = iA + 1;
        if (i11 < fm.a() && fm.b(i11) == j6) {
            return i11;
        }
        if (iA == -1) {
            return 0;
        }
        return iA;
    }

    public static int u(int[] iArr, int i6, boolean z6, boolean z10) {
        int i10;
        int i11;
        int iBinarySearch = java.util.Arrays.binarySearch(iArr, i6);
        if (iBinarySearch < 0) {
            i11 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i10 = iBinarySearch - 1;
                if (i10 < 0 || iArr[i10] != i6) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = z6 ? iBinarySearch : i10;
        }
        return z10 ? java.lang.Math.max(0, i11) : i11;
    }

    public static int v(long[] jArr, long j6, boolean z6, boolean z10) {
        int i6;
        int iBinarySearch = java.util.Arrays.binarySearch(jArr, j6);
        if (iBinarySearch < 0) {
            i6 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i10 = iBinarySearch - 1;
                if (i10 < 0 || jArr[i10] != j6) {
                    break;
                }
                iBinarySearch = i10;
            }
            i6 = iBinarySearch;
        }
        return z10 ? java.lang.Math.max(0, i6) : i6;
    }

    public static int w(byte[] bArr, int i6, int i10, int i11) {
        int iO = 65535;
        for (int i12 = 0; i12 < i10; i12++) {
            byte b6 = bArr[i12];
            iO = o(b6 & 15, o((b6 & 255) >> 4, iO));
        }
        return iO;
    }

    public static int x(byte[] bArr, int i6, int i10, int i11) {
        while (i6 < i10) {
            i11 = f27071k[(i11 >>> 24) ^ (bArr[i6] & 255)] ^ (i11 << 8);
            i6++;
        }
        return i11;
    }

    public static int y(byte[] bArr, int i6, int i10, int i11) {
        int i12 = 0;
        while (i6 < i10) {
            i12 = f27073m[i12 ^ (bArr[i6] & 255)];
            i6++;
        }
        return i12;
    }

    public static int z(int i6) {
        if (i6 == 20) {
            return 30;
        }
        if (i6 == 22) {
            return 31;
        }
        if (i6 == 30) {
            return 34;
        }
        switch (i6) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i6) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }
}
