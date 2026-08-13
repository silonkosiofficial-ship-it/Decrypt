package j$.time.format;

/* JADX INFO: loaded from: classes4.dex */
final class i implements j$.time.format.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f47836b;

    public /* synthetic */ i(int i6, java.lang.Object obj) {
        this.f47835a = i6;
        this.f47836b = obj;
    }

    private static void a(java.lang.StringBuilder sb, int i6) {
        sb.append((char) ((i6 / 10) + 48));
        sb.append((char) ((i6 % 10) + 48));
    }

    static int b(java.lang.CharSequence charSequence, int i6) {
        char cCharAt = charSequence.charAt(i6);
        if (cCharAt < '0' || cCharAt > '9') {
            return -1;
        }
        return cCharAt - '0';
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    @Override // j$.time.format.f
    public final boolean n(j$.time.format.x xVar, java.lang.StringBuilder sb) {
        switch (this.f47835a) {
            case 0:
                java.lang.Long lE = xVar.e(j$.time.temporal.a.OFFSET_SECONDS);
                if (lE == null) {
                    return false;
                }
                sb.append("GMT");
                int iF = j$.com.android.tools.r8.a.f(lE.longValue());
                if (iF != 0) {
                    int iAbs = java.lang.Math.abs((iF / 3600) % 100);
                    int iAbs2 = java.lang.Math.abs((iF / 60) % 60);
                    int iAbs3 = java.lang.Math.abs(iF % 60);
                    sb.append(iF < 0 ? "-" : "+");
                    if (((j$.time.format.TextStyle) this.f47836b) == j$.time.format.TextStyle.FULL) {
                        a(sb, iAbs);
                        sb.append(':');
                        a(sb, iAbs2);
                        if (iAbs3 != 0) {
                            sb.append(':');
                            a(sb, iAbs3);
                        }
                    } else {
                        if (iAbs >= 10) {
                            sb.append((char) ((iAbs / 10) + 48));
                        }
                        sb.append((char) ((iAbs % 10) + 48));
                        if (iAbs2 != 0 || iAbs3 != 0) {
                            sb.append(':');
                            a(sb, iAbs2);
                            if (iAbs3 != 0) {
                                sb.append(':');
                                a(sb, iAbs3);
                            }
                        }
                    }
                }
                return true;
            default:
                sb.append((java.lang.String) this.f47836b);
                return true;
        }
    }

    @Override // j$.time.format.f
    public final int p(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i6) {
        int i10;
        int iB;
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f47835a) {
            case 0:
                int length = charSequence.length();
                if (vVar.s(charSequence, i6, "GMT", 0, 3)) {
                    int i15 = i6 + 3;
                    if (i15 != length) {
                        char cCharAt = charSequence.charAt(i15);
                        if (cCharAt != '+') {
                            i10 = cCharAt == '-' ? -1 : 1;
                        }
                        int i16 = i6 + 4;
                        int i17 = 0;
                        if (((j$.time.format.TextStyle) this.f47836b) == j$.time.format.TextStyle.FULL) {
                            int iB2 = b(charSequence, i16);
                            int i18 = i6 + 6;
                            int iB3 = b(charSequence, i6 + 5);
                            if (iB2 >= 0 && iB3 >= 0) {
                                int i19 = i6 + 7;
                                if (charSequence.charAt(i18) == ':') {
                                    iB = (iB2 * 10) + iB3;
                                    int iB4 = b(charSequence, i19);
                                    i14 = i6 + 9;
                                    int iB5 = b(charSequence, i6 + 8);
                                    if (iB4 >= 0 && iB5 >= 0) {
                                        i13 = (iB4 * 10) + iB5;
                                        int i20 = i6 + 11;
                                        if (i20 < length && charSequence.charAt(i14) == ':') {
                                            int iB6 = b(charSequence, i6 + 10);
                                            int iB7 = b(charSequence, i20);
                                            if (iB6 >= 0 && iB7 >= 0) {
                                                i17 = (iB6 * 10) + iB7;
                                                i14 = i6 + 12;
                                            }
                                        }
                                        i11 = i17;
                                        i12 = i14;
                                    }
                                }
                            }
                        } else {
                            int i21 = i6 + 5;
                            iB = b(charSequence, i16);
                            if (iB >= 0) {
                                if (i21 < length) {
                                    int iB8 = b(charSequence, i21);
                                    if (iB8 >= 0) {
                                        iB = (iB * 10) + iB8;
                                        i21 = i6 + 6;
                                    }
                                    int i22 = i21 + 2;
                                    if (i22 < length && charSequence.charAt(i21) == ':' && i22 < length && charSequence.charAt(i21) == ':') {
                                        int iB9 = b(charSequence, i21 + 1);
                                        int iB10 = b(charSequence, i22);
                                        if (iB9 >= 0 && iB10 >= 0) {
                                            i13 = (iB9 * 10) + iB10;
                                            int i23 = i21 + 3;
                                            int i24 = i21 + 5;
                                            if (i24 < length && charSequence.charAt(i23) == ':') {
                                                int iB11 = b(charSequence, i21 + 4);
                                                int iB12 = b(charSequence, i24);
                                                if (iB11 >= 0 && iB12 >= 0) {
                                                    i17 = (iB11 * 10) + iB12;
                                                    i14 = i21 + 6;
                                                    i11 = i17;
                                                    i12 = i14;
                                                }
                                            }
                                            i12 = i23;
                                            i11 = 0;
                                        }
                                        return vVar.o(j$.time.temporal.a.OFFSET_SECONDS, ((((long) i17) * 60) + (((long) iB) * 3600) + ((long) i11)) * ((long) i10), i6, i12);
                                    }
                                }
                                i11 = 0;
                                i12 = i21;
                                return vVar.o(j$.time.temporal.a.OFFSET_SECONDS, ((((long) i17) * 60) + (((long) iB) * 3600) + ((long) i11)) * ((long) i10), i6, i12);
                            }
                        }
                        i17 = i13;
                        return vVar.o(j$.time.temporal.a.OFFSET_SECONDS, ((((long) i17) * 60) + (((long) iB) * 3600) + ((long) i11)) * ((long) i10), i6, i12);
                    }
                    return vVar.o(j$.time.temporal.a.OFFSET_SECONDS, 0L, i6, i15);
                }
                return ~i6;
            default:
                if (i6 > charSequence.length() || i6 < 0) {
                    throw new java.lang.IndexOutOfBoundsException();
                }
                java.lang.String str = (java.lang.String) this.f47836b;
                return !vVar.s(charSequence, i6, str, 0, str.length()) ? ~i6 : str.length() + i6;
        }
    }

    public final java.lang.String toString() {
        switch (this.f47835a) {
            case 0:
                return "LocalizedOffset(" + ((j$.time.format.TextStyle) this.f47836b) + ")";
            default:
                return "'" + ((java.lang.String) this.f47836b).replace("'", "''") + "'";
        }
    }
}
