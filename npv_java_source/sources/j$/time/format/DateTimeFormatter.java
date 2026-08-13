package j$.time.format;

/* JADX INFO: loaded from: classes4.dex */
public final class DateTimeFormatter {
    public static final j$.time.format.DateTimeFormatter ISO_LOCAL_DATE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j$.time.format.DateTimeFormatter f47793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j$.time.format.DateTimeFormatter f47794i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j$.time.format.DateTimeFormatter f47795j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.time.format.C6707e f47796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Locale f47797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j$.time.format.DecimalStyle f47798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j$.time.format.C f47799d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j$.time.chrono.Chronology f47801f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.Set f47800e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j$.time.ZoneId f47802g = null;

    static {
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder = new j$.time.format.DateTimeFormatterBuilder();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        j$.time.format.D d6 = j$.time.format.D.EXCEEDS_PAD;
        dateTimeFormatterBuilder.n(aVar, 4, 10, d6);
        dateTimeFormatterBuilder.e('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        dateTimeFormatterBuilder.m(aVar2, 2);
        dateTimeFormatterBuilder.e('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        dateTimeFormatterBuilder.m(aVar3, 2);
        j$.time.format.C c6 = j$.time.format.C.STRICT;
        j$.time.chrono.q qVar = j$.time.chrono.q.f47758e;
        j$.time.format.DateTimeFormatter dateTimeFormatterU = dateTimeFormatterBuilder.u(c6, qVar);
        ISO_LOCAL_DATE = dateTimeFormatterU;
        j$.time.format.DateTimeFormatterBuilder caseInsensitive = new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive.a(dateTimeFormatterU);
        caseInsensitive.appendOffsetId().u(c6, qVar);
        j$.time.format.DateTimeFormatterBuilder caseInsensitive2 = new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive2.a(dateTimeFormatterU);
        caseInsensitive2.q();
        caseInsensitive2.appendOffsetId().u(c6, qVar);
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new j$.time.format.DateTimeFormatterBuilder();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        dateTimeFormatterBuilder2.m(aVar4, 2);
        dateTimeFormatterBuilder2.e(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder2.m(aVar5, 2);
        dateTimeFormatterBuilder2.q();
        dateTimeFormatterBuilder2.e(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder2.m(aVar6, 2);
        dateTimeFormatterBuilder2.q();
        dateTimeFormatterBuilder2.b(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true);
        j$.time.format.DateTimeFormatter dateTimeFormatterU2 = dateTimeFormatterBuilder2.u(c6, null);
        f47793h = dateTimeFormatterU2;
        j$.time.format.DateTimeFormatterBuilder caseInsensitive3 = new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive3.a(dateTimeFormatterU2);
        caseInsensitive3.appendOffsetId().u(c6, null);
        j$.time.format.DateTimeFormatterBuilder caseInsensitive4 = new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive4.a(dateTimeFormatterU2);
        caseInsensitive4.q();
        caseInsensitive4.appendOffsetId().u(c6, null);
        j$.time.format.DateTimeFormatterBuilder caseInsensitive5 = new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive5.a(dateTimeFormatterU);
        caseInsensitive5.e('T');
        caseInsensitive5.a(dateTimeFormatterU2);
        j$.time.format.DateTimeFormatter dateTimeFormatterU3 = caseInsensitive5.u(c6, qVar);
        f47794i = dateTimeFormatterU3;
        j$.time.format.DateTimeFormatterBuilder caseInsensitive6 = new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive6.a(dateTimeFormatterU3);
        caseInsensitive6.s();
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffsetId = caseInsensitive6.appendOffsetId();
        dateTimeFormatterBuilderAppendOffsetId.t();
        j$.time.format.DateTimeFormatter dateTimeFormatterU4 = dateTimeFormatterBuilderAppendOffsetId.u(c6, qVar);
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new j$.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.a(dateTimeFormatterU4);
        dateTimeFormatterBuilder3.q();
        dateTimeFormatterBuilder3.e('[');
        dateTimeFormatterBuilder3.r();
        dateTimeFormatterBuilder3.o();
        dateTimeFormatterBuilder3.e(']');
        dateTimeFormatterBuilder3.u(c6, qVar);
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new j$.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder4.a(dateTimeFormatterU3);
        dateTimeFormatterBuilder4.q();
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffsetId2 = dateTimeFormatterBuilder4.appendOffsetId();
        dateTimeFormatterBuilderAppendOffsetId2.q();
        dateTimeFormatterBuilderAppendOffsetId2.e('[');
        dateTimeFormatterBuilderAppendOffsetId2.r();
        dateTimeFormatterBuilderAppendOffsetId2.o();
        dateTimeFormatterBuilderAppendOffsetId2.e(']');
        dateTimeFormatterBuilderAppendOffsetId2.u(c6, qVar);
        j$.time.format.DateTimeFormatterBuilder caseInsensitive7 = new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive7.n(aVar, 4, 10, d6);
        caseInsensitive7.e('-');
        caseInsensitive7.m(j$.time.temporal.a.DAY_OF_YEAR, 3);
        caseInsensitive7.q();
        caseInsensitive7.appendOffsetId().u(c6, qVar);
        j$.time.format.DateTimeFormatterBuilder caseInsensitive8 = new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive8.n(j$.time.temporal.j.f47942c, 4, 10, d6);
        caseInsensitive8.f("-W");
        caseInsensitive8.m(j$.time.temporal.j.f47941b, 2);
        caseInsensitive8.e('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        caseInsensitive8.m(aVar7, 1);
        caseInsensitive8.q();
        caseInsensitive8.appendOffsetId().u(c6, qVar);
        j$.time.format.DateTimeFormatterBuilder caseInsensitive9 = new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive9.c();
        f47795j = caseInsensitive9.u(c6, null);
        j$.time.format.DateTimeFormatterBuilder caseInsensitive10 = new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive10.m(aVar, 4);
        caseInsensitive10.m(aVar2, 2);
        caseInsensitive10.m(aVar3, 2);
        caseInsensitive10.q();
        caseInsensitive10.s();
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffset = caseInsensitive10.appendOffset("+HHMMss", "Z");
        dateTimeFormatterBuilderAppendOffset.t();
        dateTimeFormatterBuilderAppendOffset.u(c6, qVar);
        java.util.HashMap map = new java.util.HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        j$.time.format.DateTimeFormatterBuilder caseInsensitive11 = new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive11.s();
        caseInsensitive11.q();
        caseInsensitive11.j(aVar7, map);
        caseInsensitive11.f(", ");
        caseInsensitive11.p();
        caseInsensitive11.n(aVar3, 1, 2, j$.time.format.D.NOT_NEGATIVE);
        caseInsensitive11.e(' ');
        caseInsensitive11.j(aVar2, map2);
        caseInsensitive11.e(' ');
        caseInsensitive11.m(aVar, 4);
        caseInsensitive11.e(' ');
        caseInsensitive11.m(aVar4, 2);
        caseInsensitive11.e(':');
        caseInsensitive11.m(aVar5, 2);
        caseInsensitive11.q();
        caseInsensitive11.e(':');
        caseInsensitive11.m(aVar6, 2);
        caseInsensitive11.p();
        caseInsensitive11.e(' ');
        caseInsensitive11.appendOffset("+HHMM", "GMT").u(j$.time.format.C.SMART, qVar);
    }

    DateTimeFormatter(j$.time.format.C6707e c6707e, java.util.Locale locale, j$.time.format.DecimalStyle decimalStyle, j$.time.format.C c6, j$.time.chrono.Chronology chronology) {
        this.f47796a = (j$.time.format.C6707e) j$.util.Objects.requireNonNull(c6707e, "printerParser");
        this.f47797b = (java.util.Locale) j$.util.Objects.requireNonNull(locale, "locale");
        this.f47798c = (j$.time.format.DecimalStyle) j$.util.Objects.requireNonNull(decimalStyle, "decimalStyle");
        this.f47799d = (j$.time.format.C) j$.util.Objects.requireNonNull(c6, "resolverStyle");
        this.f47801f = chronology;
    }

    private j$.time.temporal.TemporalAccessor f(java.lang.CharSequence charSequence) {
        java.lang.String string;
        java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
        j$.util.Objects.requireNonNull(charSequence, "text");
        j$.util.Objects.requireNonNull(parsePosition, "position");
        j$.time.format.v vVar = new j$.time.format.v(this);
        int iP = this.f47796a.p(vVar, charSequence, parsePosition.getIndex());
        if (iP < 0) {
            parsePosition.setErrorIndex(~iP);
            vVar = null;
        } else {
            parsePosition.setIndex(iP);
        }
        if (vVar != null && parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
            return vVar.t(this.f47799d, this.f47800e);
        }
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            java.lang.String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new j$.time.format.DateTimeParseException(str, charSequence);
        }
        java.lang.String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new j$.time.format.DateTimeParseException(str2, charSequence);
    }

    public static j$.time.format.DateTimeFormatter ofPattern(java.lang.String str) {
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder = new j$.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.h(str);
        return dateTimeFormatterBuilder.toFormatter();
    }

    public static j$.time.format.DateTimeFormatter ofPattern(java.lang.String str, java.util.Locale locale) {
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder = new j$.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.h(str);
        return dateTimeFormatterBuilder.v(locale);
    }

    public final java.lang.String a(j$.time.temporal.TemporalAccessor temporalAccessor) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        j$.util.Objects.requireNonNull(temporalAccessor, "temporal");
        j$.util.Objects.requireNonNull(sb, "appendable");
        try {
            this.f47796a.n(new j$.time.format.x(temporalAccessor, this), sb);
            return sb.toString();
        } catch (java.io.IOException e6) {
            throw new j$.time.DateTimeException(e6.getMessage(), e6);
        }
    }

    public final j$.time.chrono.Chronology b() {
        return this.f47801f;
    }

    public final j$.time.format.DecimalStyle c() {
        return this.f47798c;
    }

    public final java.util.Locale d() {
        return this.f47797b;
    }

    public final j$.time.ZoneId e() {
        return this.f47802g;
    }

    final j$.time.format.C6707e g() {
        return this.f47796a.a();
    }

    public <T> T parse(java.lang.CharSequence charSequence, j$.time.temporal.TemporalQuery<T> temporalQuery) {
        java.lang.String string;
        j$.util.Objects.requireNonNull(charSequence, "text");
        j$.util.Objects.requireNonNull(temporalQuery, "query");
        try {
            return (T) ((j$.time.format.B) f(charSequence)).x(temporalQuery);
        } catch (j$.time.format.DateTimeParseException e6) {
            throw e6;
        } catch (java.lang.RuntimeException e10) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            j$.time.format.DateTimeParseException dateTimeParseException = new j$.time.format.DateTimeParseException("Text '" + string + "' could not be parsed: " + e10.getMessage(), e10);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    public final java.lang.String toString() {
        java.lang.String string = this.f47796a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }

    public j$.time.format.DateTimeFormatter withDecimalStyle(j$.time.format.DecimalStyle decimalStyle) {
        if (this.f47798c.equals(decimalStyle)) {
            return this;
        }
        return new j$.time.format.DateTimeFormatter(this.f47796a, this.f47797b, decimalStyle, this.f47799d, this.f47801f);
    }
}
