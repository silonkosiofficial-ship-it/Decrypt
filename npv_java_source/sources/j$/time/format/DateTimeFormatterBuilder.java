package j$.time.format;

/* JADX INFO: loaded from: classes4.dex */
public final class DateTimeFormatterBuilder {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final j$.time.format.C6703a f47803h = new j$.time.format.C6703a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final java.util.HashMap f47804i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f47805j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j$.time.format.DateTimeFormatterBuilder f47806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j$.time.format.DateTimeFormatterBuilder f47807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.ArrayList f47808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f47809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f47810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private char f47811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f47812g;

    static {
        java.util.HashMap map = new java.util.HashMap();
        f47804i = map;
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.s sVar = j$.time.temporal.j.f47940a;
        map.put('Q', sVar);
        map.put('q', sVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.l.f47948a);
    }

    public DateTimeFormatterBuilder() {
        this.f47806a = this;
        this.f47808c = new java.util.ArrayList();
        this.f47812g = -1;
        this.f47807b = null;
        this.f47809d = false;
    }

    private DateTimeFormatterBuilder(j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.f47806a = this;
        this.f47808c = new java.util.ArrayList();
        this.f47812g = -1;
        this.f47807b = dateTimeFormatterBuilder;
        this.f47809d = true;
    }

    private int d(j$.time.format.f fVar) {
        j$.util.Objects.requireNonNull(fVar, "pp");
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f47806a;
        int i6 = dateTimeFormatterBuilder.f47810e;
        if (i6 > 0) {
            if (fVar != null) {
                fVar = new j$.time.format.l(fVar, i6, dateTimeFormatterBuilder.f47811f);
            }
            dateTimeFormatterBuilder.f47810e = 0;
            dateTimeFormatterBuilder.f47811f = (char) 0;
        }
        dateTimeFormatterBuilder.f47808c.add(fVar);
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.f47806a;
        dateTimeFormatterBuilder2.f47812g = -1;
        return dateTimeFormatterBuilder2.f47808c.size() - 1;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0080  */
    public static java.lang.String getLocalizedDateTimePattern(j$.time.format.FormatStyle formatStyle, j$.time.format.FormatStyle formatStyle2, j$.time.chrono.Chronology chronology, java.util.Locale locale) {
        java.text.DateFormat timeInstance;
        j$.util.Objects.requireNonNull(locale, "locale");
        j$.util.Objects.requireNonNull(chronology, "chrono");
        if (formatStyle == null && formatStyle2 == null) {
            throw new java.lang.IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
        }
        if (formatStyle2 == null) {
            timeInstance = java.text.DateFormat.getDateInstance(formatStyle.ordinal(), locale);
        } else {
            timeInstance = formatStyle == null ? java.text.DateFormat.getTimeInstance(formatStyle2.ordinal(), locale) : java.text.DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
        }
        if (!(timeInstance instanceof java.text.SimpleDateFormat)) {
            throw new java.lang.UnsupportedOperationException("Can't determine pattern from " + timeInstance);
        }
        java.lang.String pattern = ((java.text.SimpleDateFormat) timeInstance).toPattern();
        if (pattern == null) {
            return null;
        }
        int i6 = 0;
        boolean z6 = pattern.indexOf(66) != -1;
        boolean z10 = pattern.indexOf(98) != -1;
        if (!z6 && !z10) {
            return pattern;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(pattern.length());
        char c6 = ' ';
        while (i6 < pattern.length()) {
            char cCharAt = pattern.charAt(i6);
            if (cCharAt != ' ') {
                if (cCharAt != 'B' && cCharAt != 'b') {
                    sb.append(cCharAt);
                }
            } else if (i6 == 0 || (c6 != 'B' && c6 != 'b')) {
                sb.append(cCharAt);
            }
            i6++;
            c6 = cCharAt;
        }
        int length = sb.length() - 1;
        if (length >= 0 && sb.charAt(length) == ' ') {
            sb.deleteCharAt(length);
        }
        return sb.toString();
    }

    private void k(j$.time.format.j jVar) {
        j$.time.format.j jVarE;
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f47806a;
        int i6 = dateTimeFormatterBuilder.f47812g;
        if (i6 < 0) {
            dateTimeFormatterBuilder.f47812g = d(jVar);
            return;
        }
        j$.time.format.j jVar2 = (j$.time.format.j) dateTimeFormatterBuilder.f47808c.get(i6);
        int i10 = jVar.f47839b;
        int i11 = jVar.f47840c;
        if (i10 == i11 && jVar.f47841d == j$.time.format.D.NOT_NEGATIVE) {
            jVarE = jVar2.f(i11);
            d(jVar.e());
            this.f47806a.f47812g = i6;
        } else {
            jVarE = jVar2.e();
            this.f47806a.f47812g = d(jVar);
        }
        this.f47806a.f47808c.set(i6, jVarE);
    }

    private j$.time.format.DateTimeFormatter w(java.util.Locale locale, j$.time.format.C c6, j$.time.chrono.Chronology chronology) {
        j$.util.Objects.requireNonNull(locale, "locale");
        while (this.f47806a.f47807b != null) {
            p();
        }
        return new j$.time.format.DateTimeFormatter(new j$.time.format.C6707e((java.util.List) this.f47808c, false), locale, j$.time.format.DecimalStyle.f47813e, c6, chronology);
    }

    public final void a(j$.time.format.DateTimeFormatter dateTimeFormatter) {
        j$.util.Objects.requireNonNull(dateTimeFormatter, "formatter");
        d(dateTimeFormatter.g());
    }

    public j$.time.format.DateTimeFormatterBuilder appendOffset(java.lang.String str, java.lang.String str2) {
        d(new j$.time.format.k(str, str2));
        return this;
    }

    public j$.time.format.DateTimeFormatterBuilder appendOffsetId() {
        d(j$.time.format.k.f47844e);
        return this;
    }

    public final void b(j$.time.temporal.s sVar, int i6, int i10, boolean z6) {
        if (i6 != i10 || z6) {
            d(new j$.time.format.g(sVar, i6, i10, z6));
        } else {
            k(new j$.time.format.g(sVar, i6, i10, z6));
        }
    }

    public final void c() {
        d(new j$.time.format.h());
    }

    public final void e(char c6) {
        d(new j$.time.format.C6706d(c6));
    }

    public final void f(java.lang.String str) {
        j$.util.Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        d(str.length() == 1 ? new j$.time.format.C6706d(str.charAt(0)) : new j$.time.format.i(1, str));
    }

    public final void g(j$.time.format.TextStyle textStyle) {
        j$.util.Objects.requireNonNull(textStyle, "style");
        if (textStyle != j$.time.format.TextStyle.FULL && textStyle != j$.time.format.TextStyle.SHORT) {
            throw new java.lang.IllegalArgumentException("Style must be either full or short");
        }
        d(new j$.time.format.i(0, textStyle));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x0175  */
    /* JADX WARN: Code duplicated, block: B:112:0x019c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x019f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:255:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:257:0x0408  */
    /* JADX WARN: Code duplicated, block: B:258:0x040c  */
    /* JADX WARN: Code duplicated, block: B:290:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x0417 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0135  */
    /* JADX WARN: Code duplicated, block: B:93:0x013d  */
    public final void h(java.lang.String str) {
        java.lang.String strSubstring;
        int i6;
        j$.time.format.s sVar;
        java.lang.String str2;
        java.lang.String str3;
        j$.time.format.TextStyle textStyle;
        j$.time.format.f uVar;
        j$.time.format.D d6;
        boolean z6;
        j$.time.format.TextStyle textStyle2;
        j$.time.format.j sVar2;
        int i10;
        int i11;
        j$.util.Objects.requireNonNull(str, "pattern");
        int i12 = 0;
        while (i12 < str.length()) {
            char cCharAt = str.charAt(i12);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i13 = i12 + 1;
                while (i13 < str.length() && str.charAt(i13) == cCharAt) {
                    i13++;
                }
                int i14 = i13 - i12;
                if (cCharAt == 'p') {
                    if (i13 >= str.length() || (((cCharAt = str.charAt(i13)) < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                        i10 = i13;
                        i11 = i14;
                        i14 = 0;
                    } else {
                        i10 = i13 + 1;
                        while (i10 < str.length() && str.charAt(i10) == cCharAt) {
                            i10++;
                        }
                        i11 = i10 - i13;
                    }
                    if (i14 == 0) {
                        throw new java.lang.IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    if (i14 < 1) {
                        throw new java.lang.IllegalArgumentException("The pad width must be at least one but was " + i14);
                    }
                    j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f47806a;
                    dateTimeFormatterBuilder.f47810e = i14;
                    dateTimeFormatterBuilder.f47811f = ' ';
                    dateTimeFormatterBuilder.f47812g = -1;
                    i14 = i11;
                    i6 = i10;
                } else {
                    i6 = i13;
                }
                j$.time.temporal.s sVar3 = (j$.time.temporal.s) f47804i.get(java.lang.Character.valueOf(cCharAt));
                if (sVar3 != null) {
                    if (cCharAt == 'A') {
                        d6 = j$.time.format.D.NOT_NEGATIVE;
                        n(sVar3, i14, 19, d6);
                    } else {
                        if (cCharAt == 'Q') {
                            z6 = false;
                        } else if (cCharAt != 'S') {
                            if (cCharAt != 'a') {
                                if (cCharAt == 'k') {
                                    if (i14 == 1) {
                                        l(sVar3);
                                    } else {
                                        if (i14 == 2) {
                                            throw new java.lang.IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                        }
                                        m(sVar3, i14);
                                    }
                                } else if (cCharAt == 'q') {
                                    z6 = true;
                                } else if (cCharAt == 's') {
                                    if (i14 == 1) {
                                        l(sVar3);
                                    } else {
                                        if (i14 == 2) {
                                            throw new java.lang.IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                        }
                                        m(sVar3, i14);
                                    }
                                } else if (cCharAt == 'u' || cCharAt == 'y') {
                                    if (i14 == 2) {
                                        j$.time.LocalDate localDate = j$.time.format.p.f47862i;
                                        j$.util.Objects.requireNonNull(sVar3, "field");
                                        j$.util.Objects.requireNonNull(localDate, "baseDate");
                                        k(new j$.time.format.p(sVar3));
                                    } else {
                                        if (i14 < 4) {
                                            d6 = j$.time.format.D.NORMAL;
                                        } else {
                                            d6 = j$.time.format.D.EXCEEDS_PAD;
                                        }
                                        n(sVar3, i14, 19, d6);
                                    }
                                } else if (cCharAt == 'g') {
                                    d6 = j$.time.format.D.NORMAL;
                                    n(sVar3, i14, 19, d6);
                                } else if (cCharAt != 'h' && cCharAt != 'm') {
                                    if (cCharAt != 'n') {
                                        switch (cCharAt) {
                                            case 'D':
                                                if (i14 == 1) {
                                                    l(sVar3);
                                                } else {
                                                    if (i14 != 2 && i14 != 3) {
                                                        throw new java.lang.IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                    }
                                                    n(sVar3, i14, 3, j$.time.format.D.NOT_NEGATIVE);
                                                }
                                                break;
                                            case 'E':
                                                z6 = false;
                                                break;
                                            case 'F':
                                                if (i14 != 1) {
                                                    throw new java.lang.IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                }
                                                l(sVar3);
                                                break;
                                            case 'G':
                                                if (i14 != 1 && i14 != 2 && i14 != 3) {
                                                    if (i14 == 4) {
                                                        textStyle2 = j$.time.format.TextStyle.FULL;
                                                    } else if (i14 != 5) {
                                                        throw new java.lang.IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                    }
                                                }
                                                i(sVar3, textStyle2);
                                                break;
                                            default:
                                                switch (cCharAt) {
                                                    case 'K':
                                                        break;
                                                    case 'L':
                                                        z6 = true;
                                                        break;
                                                    case 'M':
                                                        z6 = false;
                                                        break;
                                                    case 'N':
                                                        break;
                                                    default:
                                                        switch (cCharAt) {
                                                            case 'c':
                                                                if (i14 == 1) {
                                                                    sVar2 = new j$.time.format.s(cCharAt, i14, i14, i14, 0);
                                                                } else {
                                                                    if (i14 == 2) {
                                                                        throw new java.lang.IllegalArgumentException("Invalid pattern \"cc\"");
                                                                    }
                                                                    z6 = true;
                                                                }
                                                                k(sVar2);
                                                                break;
                                                            case 'd':
                                                                break;
                                                            case 'e':
                                                                z6 = false;
                                                                break;
                                                            default:
                                                                if (i14 != 1) {
                                                                    m(sVar3, i14);
                                                                } else {
                                                                    l(sVar3);
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                            case 'H':
                                                if (i14 == 1) {
                                                    l(sVar3);
                                                } else {
                                                    if (i14 == 2) {
                                                        throw new java.lang.IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                    }
                                                    m(sVar3, i14);
                                                }
                                                break;
                                        }
                                    }
                                    d6 = j$.time.format.D.NOT_NEGATIVE;
                                    n(sVar3, i14, 19, d6);
                                } else if (i14 == 1) {
                                    l(sVar3);
                                } else {
                                    if (i14 == 2) {
                                        throw new java.lang.IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                    }
                                    m(sVar3, i14);
                                }
                            } else if (i14 != 1) {
                                throw new java.lang.IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            textStyle2 = j$.time.format.TextStyle.SHORT;
                            i(sVar3, textStyle2);
                        } else {
                            b(j$.time.temporal.a.NANO_OF_SECOND, i14, i14, false);
                        }
                        if (i14 != 1 && i14 != 2) {
                            if (i14 != 3) {
                                if (i14 != 4) {
                                    if (i14 != 5) {
                                        throw new java.lang.IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                    }
                                    textStyle2 = z6 ? j$.time.format.TextStyle.NARROW_STANDALONE : j$.time.format.TextStyle.NARROW;
                                } else if (z6) {
                                    textStyle2 = j$.time.format.TextStyle.FULL_STANDALONE;
                                } else {
                                    textStyle2 = j$.time.format.TextStyle.FULL;
                                }
                            } else if (z6) {
                                textStyle2 = j$.time.format.TextStyle.SHORT_STANDALONE;
                            }
                            i(sVar3, textStyle2);
                        } else if (cCharAt == 'e') {
                            sVar2 = new j$.time.format.s(cCharAt, i14, i14, i14, 0);
                            k(sVar2);
                        } else if (cCharAt != 'E') {
                            if (i14 == 1) {
                                l(sVar3);
                            } else {
                                m(sVar3, 2);
                            }
                        }
                        textStyle2 = j$.time.format.TextStyle.SHORT;
                        i(sVar3, textStyle2);
                    }
                } else if (cCharAt == 'z') {
                    if (i14 > 4) {
                        throw new java.lang.IllegalArgumentException("Too many pattern letters: " + cCharAt);
                    }
                    d(i14 == 4 ? new j$.time.format.u(j$.time.format.TextStyle.FULL, false) : new j$.time.format.u(j$.time.format.TextStyle.SHORT, false));
                } else if (cCharAt == 'V') {
                    if (i14 != 2) {
                        throw new java.lang.IllegalArgumentException("Pattern letter count must be 2: " + cCharAt);
                    }
                    d(new j$.time.format.t(j$.time.temporal.n.l(), "ZoneId()"));
                } else if (cCharAt == 'v') {
                    if (i14 == 1) {
                        uVar = new j$.time.format.u(j$.time.format.TextStyle.SHORT, true);
                    } else {
                        if (i14 != 4) {
                            throw new java.lang.IllegalArgumentException("Wrong number of  pattern letters: " + cCharAt);
                        }
                        uVar = new j$.time.format.u(j$.time.format.TextStyle.FULL, true);
                    }
                    d(uVar);
                } else {
                    java.lang.String str4 = "+0000";
                    if (cCharAt == 'Z') {
                        if (i14 < 4) {
                            str2 = "+HHMM";
                            appendOffset(str2, str4);
                        } else {
                            if (i14 != 4) {
                                if (i14 != 5) {
                                    throw new java.lang.IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                }
                                str3 = "+HH:MM:ss";
                                appendOffset(str3, "Z");
                            }
                            textStyle = j$.time.format.TextStyle.FULL;
                            g(textStyle);
                        }
                    } else if (cCharAt == 'O') {
                        if (i14 == 1) {
                            textStyle = j$.time.format.TextStyle.SHORT;
                        } else {
                            if (i14 != 4) {
                                throw new java.lang.IllegalArgumentException("Pattern letter count must be 1 or 4: " + cCharAt);
                            }
                            textStyle = j$.time.format.TextStyle.FULL;
                        }
                        g(textStyle);
                    } else if (cCharAt == 'X') {
                        if (i14 > 5) {
                            throw new java.lang.IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        str3 = j$.time.format.k.f47843d[i14 + (i14 == 1 ? 0 : 1)];
                        appendOffset(str3, "Z");
                    } else if (cCharAt != 'x') {
                        if (cCharAt == 'W') {
                            if (i14 > 1) {
                                throw new java.lang.IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            sVar = new j$.time.format.s(cCharAt, i14, i14, i14, 0);
                        } else if (cCharAt == 'w') {
                            if (i14 > 2) {
                                throw new java.lang.IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            sVar = new j$.time.format.s(cCharAt, i14, i14, 2, 0);
                        } else {
                            if (cCharAt != 'Y') {
                                throw new java.lang.IllegalArgumentException("Unknown pattern letter: " + cCharAt);
                            }
                            sVar = i14 == 2 ? new j$.time.format.s(cCharAt, i14, i14, 2, 0) : new j$.time.format.s(cCharAt, i14, i14, 19, 0);
                        }
                        k(sVar);
                    } else {
                        if (i14 > 5) {
                            throw new java.lang.IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        if (i14 == 1) {
                            str4 = "+00";
                        } else if (i14 % 2 != 0) {
                            str4 = "+00:00";
                        }
                        str2 = j$.time.format.k.f47843d[i14 + (i14 == 1 ? 0 : 1)];
                        appendOffset(str2, str4);
                    }
                }
                i12 = (-1) + i6;
            } else if (cCharAt == '\'') {
                int i15 = i12 + 1;
                int i16 = i15;
                while (i16 < str.length()) {
                    if (str.charAt(i16) == '\'') {
                        int i17 = i16 + 1;
                        if (i17 < str.length() && str.charAt(i17) == '\'') {
                            i16 = i17;
                        } else {
                            if (i16 < str.length()) {
                                throw new java.lang.IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                            }
                            strSubstring = str.substring(i15, i16);
                            if (strSubstring.isEmpty()) {
                                e('\'');
                            } else {
                                f(strSubstring.replace("''", "'"));
                            }
                            i12 = i16;
                        }
                    }
                    i16++;
                }
                if (i16 < str.length()) {
                    throw new java.lang.IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                }
                strSubstring = str.substring(i15, i16);
                if (strSubstring.isEmpty()) {
                    e('\'');
                } else {
                    f(strSubstring.replace("''", "'"));
                }
                i12 = i16;
            } else if (cCharAt == '[') {
                q();
            } else if (cCharAt == ']') {
                if (this.f47806a.f47807b == null) {
                    throw new java.lang.IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                p();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new java.lang.IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + "'");
                }
                e(cCharAt);
            }
            i12++;
        }
    }

    public final void i(j$.time.temporal.s sVar, j$.time.format.TextStyle textStyle) {
        j$.util.Objects.requireNonNull(sVar, "field");
        j$.util.Objects.requireNonNull(textStyle, "textStyle");
        d(new j$.time.format.r(sVar, textStyle, j$.time.format.A.c()));
    }

    public final void j(j$.time.temporal.s sVar, java.util.HashMap map) {
        j$.util.Objects.requireNonNull(sVar, "field");
        j$.util.Objects.requireNonNull(map, "textLookup");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map);
        j$.time.format.TextStyle textStyle = j$.time.format.TextStyle.FULL;
        d(new j$.time.format.r(sVar, textStyle, new j$.time.format.C6704b(new j$.time.format.z(java.util.Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    public final void l(j$.time.temporal.s sVar) {
        j$.util.Objects.requireNonNull(sVar, "field");
        k(new j$.time.format.j(sVar, 1, 19, j$.time.format.D.NORMAL));
    }

    public final void m(j$.time.temporal.s sVar, int i6) {
        j$.util.Objects.requireNonNull(sVar, "field");
        if (i6 >= 1 && i6 <= 19) {
            k(new j$.time.format.j(sVar, i6, i6, j$.time.format.D.NOT_NEGATIVE));
        } else {
            throw new java.lang.IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i6);
        }
    }

    public final void n(j$.time.temporal.s sVar, int i6, int i10, j$.time.format.D d6) {
        if (i6 == i10 && d6 == j$.time.format.D.NOT_NEGATIVE) {
            m(sVar, i10);
            return;
        }
        j$.util.Objects.requireNonNull(sVar, "field");
        j$.util.Objects.requireNonNull(d6, "signStyle");
        if (i6 < 1 || i6 > 19) {
            throw new java.lang.IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i6);
        }
        if (i10 < 1 || i10 > 19) {
            throw new java.lang.IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i10);
        }
        if (i10 >= i6) {
            k(new j$.time.format.j(sVar, i6, i10, d6));
            return;
        }
        throw new java.lang.IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i10 + " < " + i6);
    }

    public final void o() {
        d(new j$.time.format.t(f47803h, "ZoneRegionId()"));
    }

    public final void p() {
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f47806a;
        if (dateTimeFormatterBuilder.f47807b == null) {
            throw new java.lang.IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (dateTimeFormatterBuilder.f47808c.size() <= 0) {
            this.f47806a = this.f47806a.f47807b;
            return;
        }
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.f47806a;
        j$.time.format.C6707e c6707e = new j$.time.format.C6707e(dateTimeFormatterBuilder2.f47808c, dateTimeFormatterBuilder2.f47809d);
        this.f47806a = this.f47806a.f47807b;
        d(c6707e);
    }

    public j$.time.format.DateTimeFormatterBuilder parseCaseInsensitive() {
        d(j$.time.format.q.INSENSITIVE);
        return this;
    }

    public final void q() {
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f47806a;
        dateTimeFormatterBuilder.f47812g = -1;
        this.f47806a = new j$.time.format.DateTimeFormatterBuilder(dateTimeFormatterBuilder);
    }

    public final void r() {
        d(j$.time.format.q.SENSITIVE);
    }

    public final void s() {
        d(j$.time.format.q.LENIENT);
    }

    public final void t() {
        d(j$.time.format.q.STRICT);
    }

    public j$.time.format.DateTimeFormatter toFormatter() {
        return v(java.util.Locale.getDefault());
    }

    final j$.time.format.DateTimeFormatter u(j$.time.format.C c6, j$.time.chrono.Chronology chronology) {
        return w(java.util.Locale.getDefault(), c6, chronology);
    }

    public final j$.time.format.DateTimeFormatter v(java.util.Locale locale) {
        return w(locale, j$.time.format.C.SMART, null);
    }
}
