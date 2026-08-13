package p079h9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p087i7.InterfaceC6668n f46574a = p087i7.AbstractC6669o.b(h9.t.c.f46579D);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p087i7.InterfaceC6668n f46575b = p087i7.AbstractC6669o.b(h9.t.b.f46578D);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p087i7.InterfaceC6668n f46576c = p087i7.AbstractC6669o.b(h9.t.a.f46577D);

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final h9.t.a f46577D = new h9.t.a();

        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j$.time.format.DateTimeFormatter b() {
            return new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final h9.t.b f46578D = new h9.t.b();

        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j$.time.format.DateTimeFormatter b() {
            return new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final h9.t.c f46579D = new h9.t.c();

        c() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j$.time.format.DateTimeFormatter b() {
            return new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
        }
    }

    public static final p079h9.r a(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        p079h9.r rVar;
        try {
            if (num != null) {
                j$.time.ZoneOffset zoneOffsetOfHoursMinutesSeconds = j$.time.ZoneOffset.ofHoursMinutesSeconds(num.intValue(), num2 != null ? num2.intValue() : 0, num3 != null ? num3.intValue() : 0);
                p247y7.AbstractC7350t.e(zoneOffsetOfHoursMinutesSeconds, "ofHoursMinutesSeconds(...)");
                rVar = new p079h9.r(zoneOffsetOfHoursMinutesSeconds);
            } else if (num2 != null) {
                j$.time.ZoneOffset zoneOffsetOfHoursMinutesSeconds2 = j$.time.ZoneOffset.ofHoursMinutesSeconds(num2.intValue() / 60, num2.intValue() % 60, num3 != null ? num3.intValue() : 0);
                p247y7.AbstractC7350t.e(zoneOffsetOfHoursMinutesSeconds2, "ofHoursMinutesSeconds(...)");
                rVar = new p079h9.r(zoneOffsetOfHoursMinutesSeconds2);
            } else {
                j$.time.ZoneOffset zoneOffsetOfTotalSeconds = j$.time.ZoneOffset.ofTotalSeconds(num3 != null ? num3.intValue() : 0);
                p247y7.AbstractC7350t.e(zoneOffsetOfTotalSeconds, "ofTotalSeconds(...)");
                rVar = new p079h9.r(zoneOffsetOfTotalSeconds);
            }
            return rVar;
        } catch (j$.time.DateTimeException e6) {
            throw new java.lang.IllegalArgumentException(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j$.time.format.DateTimeFormatter f() {
        return (j$.time.format.DateTimeFormatter) f46576c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j$.time.format.DateTimeFormatter g() {
        return (j$.time.format.DateTimeFormatter) f46575b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j$.time.format.DateTimeFormatter h() {
        return (j$.time.format.DateTimeFormatter) f46574a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h9.r i(java.lang.CharSequence charSequence, j$.time.format.DateTimeFormatter dateTimeFormatter) {
        try {
            return new p079h9.r((j$.time.ZoneOffset) dateTimeFormatter.parse(charSequence, new j$.time.temporal.TemporalQuery() { // from class: h9.s
                @Override // j$.time.temporal.TemporalQuery
                public final java.lang.Object queryFrom(j$.time.temporal.TemporalAccessor temporalAccessor) {
                    return j$.time.ZoneOffset.from(temporalAccessor);
                }
            }));
        } catch (j$.time.DateTimeException e6) {
            throw new p079h9.c(e6);
        }
    }
}
