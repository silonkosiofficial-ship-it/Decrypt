package j$.time.format;

/* JADX INFO: loaded from: classes4.dex */
final class k implements j$.time.format.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final java.lang.String[] f47843d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final j$.time.format.k f47844e = new j$.time.format.k("+HH:MM:ss", "Z");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final j$.time.format.k f47845f = new j$.time.format.k("+HH:MM:ss", "0");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f47846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f47848c;

    k(java.lang.String str, java.lang.String str2) {
        j$.util.Objects.requireNonNull(str, "pattern");
        j$.util.Objects.requireNonNull(str2, "noOffsetText");
        int i6 = 0;
        while (true) {
            java.lang.String[] strArr = f47843d;
            if (i6 >= strArr.length) {
                throw new java.lang.IllegalArgumentException("Invalid zone offset pattern: " + str);
            }
            if (strArr[i6].equals(str)) {
                this.f47847b = i6;
                this.f47848c = i6 % 11;
                this.f47846a = str2;
                return;
            }
            i6++;
        }
    }

    private static void a(boolean z6, int i6, java.lang.StringBuilder sb) {
        sb.append(z6 ? ":" : "");
        sb.append((char) ((i6 / 10) + 48));
        sb.append((char) ((i6 % 10) + 48));
    }

    private static boolean b(java.lang.CharSequence charSequence, boolean z6, int i6, int[] iArr) {
        int i10 = iArr[0];
        if (i10 < 0) {
            return true;
        }
        if (z6 && i6 != 1) {
            int i11 = i10 + 1;
            if (i11 > charSequence.length() || charSequence.charAt(i10) != ':') {
                return false;
            }
            i10 = i11;
        }
        int i12 = i10 + 2;
        if (i12 > charSequence.length()) {
            return false;
        }
        int i13 = i10 + 1;
        char cCharAt = charSequence.charAt(i10);
        char cCharAt2 = charSequence.charAt(i13);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            int i14 = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
            if (i14 >= 0 && i14 <= 59) {
                iArr[i6] = i14;
                iArr[0] = i12;
                return true;
            }
        }
        return false;
    }

    private static void c(java.lang.CharSequence charSequence, boolean z6, int[] iArr) {
        if (!z6) {
            e(charSequence, 1, 2, iArr);
        } else {
            if (b(charSequence, false, 1, iArr)) {
                return;
            }
            iArr[0] = ~iArr[0];
        }
    }

    private static void d(java.lang.CharSequence charSequence, boolean z6, boolean z10, int[] iArr) {
        if (b(charSequence, z6, 2, iArr) || !z10) {
            return;
        }
        iArr[0] = ~iArr[0];
    }

    private static void e(java.lang.CharSequence charSequence, int i6, int i10, int[] iArr) {
        int i11;
        char cCharAt;
        int i12 = iArr[0];
        char[] cArr = new char[i10];
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10 && (i11 = i12 + 1) <= charSequence.length() && (cCharAt = charSequence.charAt(i12)) >= '0' && cCharAt <= '9') {
            cArr[i13] = cCharAt;
            i14++;
            i13++;
            i12 = i11;
        }
        if (i14 < i6) {
            iArr[0] = ~iArr[0];
            return;
        }
        switch (i14) {
            case 1:
                iArr[1] = cArr[0] - '0';
                break;
            case 2:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                break;
            case 3:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                break;
            case 4:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                break;
            case 5:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                iArr[3] = (cArr[4] - '0') + ((cArr[3] - '0') * 10);
                break;
            case 6:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                iArr[3] = (cArr[5] - '0') + ((cArr[4] - '0') * 10);
                break;
        }
        iArr[0] = i12;
    }

    @Override // j$.time.format.f
    public final boolean n(j$.time.format.x xVar, java.lang.StringBuilder sb) {
        java.lang.Long lE = xVar.e(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z6 = false;
        if (lE == null) {
            return false;
        }
        int iF = j$.com.android.tools.r8.a.f(lE.longValue());
        java.lang.String str = this.f47846a;
        if (iF == 0) {
            sb.append(str);
        } else {
            int iAbs = java.lang.Math.abs((iF / 3600) % 100);
            int iAbs2 = java.lang.Math.abs((iF / 60) % 60);
            int iAbs3 = java.lang.Math.abs(iF % 60);
            int length = sb.length();
            sb.append(iF < 0 ? "-" : "+");
            if (this.f47847b >= 11 && iAbs < 10) {
                sb.append((char) (iAbs + 48));
            } else {
                a(false, iAbs, sb);
            }
            int i6 = this.f47848c;
            if ((i6 >= 3 && i6 <= 8) || ((i6 >= 9 && iAbs3 > 0) || (i6 >= 1 && iAbs2 > 0))) {
                a(i6 > 0 && i6 % 2 == 0, iAbs2, sb);
                iAbs += iAbs2;
                if (i6 == 7 || i6 == 8 || (i6 >= 5 && iAbs3 > 0)) {
                    if (i6 > 0 && i6 % 2 == 0) {
                        z6 = true;
                    }
                    a(z6, iAbs3, sb);
                    iAbs += iAbs3;
                }
            }
            if (iAbs == 0) {
                sb.setLength(length);
                sb.append(str);
            }
        }
        return true;
    }

    @Override // j$.time.format.f
    public final int p(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i6) {
        int i10;
        int i11;
        int i12;
        int i13;
        int length = charSequence.length();
        int length2 = this.f47846a.length();
        if (length2 != 0) {
            if (i6 == length) {
                return ~i6;
            }
            if (vVar.s(charSequence, i6, this.f47846a, 0, length2)) {
                return vVar.o(j$.time.temporal.a.OFFSET_SECONDS, 0L, i6, i6 + length2);
            }
        } else if (i6 == length) {
            return vVar.o(j$.time.temporal.a.OFFSET_SECONDS, 0L, i6, i6);
        }
        char cCharAt = charSequence.charAt(i6);
        if (cCharAt == '+' || cCharAt == '-') {
            int i14 = cCharAt == '-' ? -1 : 1;
            int i15 = this.f47848c;
            boolean z6 = i15 > 0 && i15 % 2 == 0;
            int i16 = this.f47847b;
            boolean z10 = i16 < 11;
            int[] iArr = new int[4];
            iArr[0] = i6 + 1;
            if (!vVar.l()) {
                if (z10) {
                    if (z6 || (i16 == 0 && length > (i13 = i6 + 3) && charSequence.charAt(i13) == ':')) {
                        i16 = 10;
                        z6 = true;
                    } else {
                        i16 = 9;
                    }
                } else if (z6 || (i16 == 11 && length > (i12 = i6 + 3) && (charSequence.charAt(i6 + 2) == ':' || charSequence.charAt(i12) == ':'))) {
                    i16 = 21;
                    z6 = true;
                } else {
                    i16 = 20;
                }
            }
            switch (i16) {
                case 0:
                case 11:
                    c(charSequence, z10, iArr);
                    break;
                case 1:
                case 2:
                case 13:
                    c(charSequence, z10, iArr);
                    d(charSequence, z6, false, iArr);
                    break;
                case 3:
                case 4:
                case 15:
                    c(charSequence, z10, iArr);
                    d(charSequence, z6, true, iArr);
                    break;
                case 5:
                case 6:
                case 17:
                    c(charSequence, z10, iArr);
                    d(charSequence, z6, true, iArr);
                    b(charSequence, z6, 3, iArr);
                    break;
                case 7:
                case 8:
                case 19:
                    c(charSequence, z10, iArr);
                    d(charSequence, z6, true, iArr);
                    if (!b(charSequence, z6, 3, iArr)) {
                        iArr[0] = ~iArr[0];
                    }
                    break;
                case 9:
                case 10:
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                    c(charSequence, z10, iArr);
                    if (b(charSequence, z6, 2, iArr)) {
                        b(charSequence, z6, 3, iArr);
                    }
                    break;
                case 12:
                    e(charSequence, 1, 4, iArr);
                    break;
                case 14:
                    e(charSequence, 3, 4, iArr);
                    break;
                case 16:
                    e(charSequence, 3, 6, iArr);
                    break;
                case 18:
                    e(charSequence, 5, 6, iArr);
                    break;
                case 20:
                    e(charSequence, 1, 6, iArr);
                    break;
            }
            int i17 = iArr[0];
            if (i17 > 0) {
                int i18 = iArr[1];
                if (i18 > 23 || (i10 = iArr[2]) > 59 || (i11 = iArr[3]) > 59) {
                    throw new j$.time.DateTimeException("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                }
                return vVar.o(j$.time.temporal.a.OFFSET_SECONDS, ((((long) i10) * 60) + (((long) i18) * 3600) + ((long) i11)) * ((long) i14), i6, i17);
            }
        }
        return length2 == 0 ? vVar.o(j$.time.temporal.a.OFFSET_SECONDS, 0L, i6, i6) : ~i6;
    }

    public final java.lang.String toString() {
        java.lang.String strReplace = this.f47846a.replace("'", "''");
        return "Offset(" + f47843d[this.f47847b] + ",'" + strReplace + "')";
    }
}
