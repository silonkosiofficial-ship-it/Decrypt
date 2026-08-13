package T;

/* JADX INFO: loaded from: classes.dex */
public final class q extends T.AbstractC1647f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final T.q.a f12854e = new T.q.a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f12855f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.TimeZone f12856g = j$.util.DesugarTimeZone.getTimeZone("UTC");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f12858d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        private final java.text.SimpleDateFormat b(java.lang.String str, java.util.Locale locale, java.util.Map map) {
            java.lang.String str2 = str + locale.toLanguageTag();
            java.lang.Object obj = map.get(str2);
            java.lang.Object obj2 = obj;
            if (obj == null) {
                java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str, locale);
                simpleDateFormat.setTimeZone(T.q.f12854e.c());
                map.put(str2, simpleDateFormat);
                obj2 = simpleDateFormat;
            }
            return (java.text.SimpleDateFormat) obj2;
        }

        public final java.lang.String a(long j6, java.lang.String str, java.util.Locale locale, java.util.Map map) {
            java.text.SimpleDateFormat simpleDateFormatB = b(str, locale, map);
            java.util.Calendar calendar = java.util.Calendar.getInstance(c());
            calendar.setTimeInMillis(j6);
            return simpleDateFormatB.format(java.lang.Long.valueOf(calendar.getTimeInMillis()));
        }

        public final java.util.TimeZone c() {
            return T.q.f12856g;
        }
    }

    public q(java.util.Locale locale) {
        super(locale);
        this.f12857c = n(java.util.Calendar.getInstance(locale).getFirstDayOfWeek());
        java.util.List listC = p097j7.AbstractC6879v.c();
        java.lang.String[] weekdays = new java.text.DateFormatSymbols(locale).getWeekdays();
        java.lang.String[] shortWeekdays = new java.text.DateFormatSymbols(locale).getShortWeekdays();
        java.util.List listV = p097j7.AbstractC6872n.V(weekdays, 2);
        int size = listV.size();
        for (int i6 = 0; i6 < size; i6++) {
            listC.add(new p087i7.u((java.lang.String) listV.get(i6), shortWeekdays[i6 + 2]));
        }
        listC.add(new p087i7.u(weekdays[1], shortWeekdays[1]));
        this.f12858d = p097j7.AbstractC6879v.a(listC);
    }

    private final int n(int i6) {
        int i10 = (i6 + 6) % 7;
        if (i10 == 0) {
            return 7;
        }
        return i10;
    }

    private final T.j o(java.util.Calendar calendar) {
        int iN = n(calendar.get(7)) - d();
        if (iN < 0) {
            iN += 7;
        }
        return new T.j(calendar.get(1), calendar.get(2) + 1, calendar.getActualMaximum(5), iN, calendar.getTimeInMillis());
    }

    private final java.util.Calendar p(T.j jVar) {
        java.util.Calendar calendar = java.util.Calendar.getInstance(f12856g);
        calendar.setTimeInMillis(jVar.d());
        return calendar;
    }

    @Override // T.AbstractC1647f
    public java.lang.String a(long j6, java.lang.String str, java.util.Locale locale) {
        return f12854e.a(j6, str, locale, e());
    }

    @Override // T.AbstractC1647f
    public T.C1646e b(long j6) {
        java.util.Calendar calendar = java.util.Calendar.getInstance(f12856g);
        calendar.setTimeInMillis(j6);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new T.C1646e(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
    }

    @Override // T.AbstractC1647f
    public T.k c(java.util.Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(3, locale);
        p247y7.AbstractC7350t.d(dateInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        return T.AbstractC1649h.a(((java.text.SimpleDateFormat) dateInstance).toPattern());
    }

    @Override // T.AbstractC1647f
    public int d() {
        return this.f12857c;
    }

    @Override // T.AbstractC1647f
    public T.j f(int i6, int i10) {
        java.util.Calendar calendar = java.util.Calendar.getInstance(f12856g);
        calendar.clear();
        calendar.set(1, i6);
        calendar.set(2, i10 - 1);
        calendar.set(5, 1);
        return o(calendar);
    }

    @Override // T.AbstractC1647f
    public T.j g(long j6) {
        java.util.Calendar calendar = java.util.Calendar.getInstance(f12856g);
        calendar.setTimeInMillis(j6);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return o(calendar);
    }

    @Override // T.AbstractC1647f
    public T.j h(T.C1646e c1646e) {
        return f(c1646e.m(), c1646e.g());
    }

    @Override // T.AbstractC1647f
    public T.C1646e i() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new T.C1646e(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis() + ((long) (calendar.get(15) + calendar.get(16))));
    }

    @Override // T.AbstractC1647f
    public java.util.List j() {
        return this.f12858d;
    }

    @Override // T.AbstractC1647f
    public T.C1646e k(java.lang.String str, java.lang.String str2) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str2);
        java.util.TimeZone timeZone = f12856g;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            java.util.Date date = simpleDateFormat.parse(str);
            if (date == null) {
                return null;
            }
            java.util.Calendar calendar = java.util.Calendar.getInstance(timeZone);
            calendar.setTime(date);
            return new T.C1646e(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
        } catch (java.text.ParseException unused) {
            return null;
        }
    }

    @Override // T.AbstractC1647f
    public T.j l(T.j jVar, int i6) {
        if (i6 <= 0) {
            return jVar;
        }
        java.util.Calendar calendarP = p(jVar);
        calendarP.add(2, i6);
        return o(calendarP);
    }

    public java.lang.String toString() {
        return "LegacyCalendarModel";
    }
}
