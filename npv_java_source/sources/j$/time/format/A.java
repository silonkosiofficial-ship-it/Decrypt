package j$.time.format;

/* JADX INFO: loaded from: classes4.dex */
class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j$.util.concurrent.ConcurrentHashMap f47779a = new j$.util.concurrent.ConcurrentHashMap(16, 0.75f, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.Comparator f47780b = new j$.time.format.y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j$.time.format.A f47781c = new j$.time.format.A();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f47782d = 0;

    private static java.lang.Object b(j$.time.temporal.s sVar, java.util.Locale locale) {
        java.lang.Object zVar;
        java.util.AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new java.util.AbstractMap.SimpleImmutableEntry(sVar, locale);
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = f47779a;
        V v6 = concurrentHashMap.get(simpleImmutableEntry);
        if (v6 != 0) {
            return v6;
        }
        java.util.HashMap map = new java.util.HashMap();
        if (sVar == j$.time.temporal.a.ERA) {
            java.text.DateFormatSymbols dateFormatSymbols = java.text.DateFormatSymbols.getInstance(locale);
            java.util.HashMap map2 = new java.util.HashMap();
            java.util.HashMap map3 = new java.util.HashMap();
            java.lang.String[] eras = dateFormatSymbols.getEras();
            for (int i6 = 0; i6 < eras.length; i6++) {
                if (!eras[i6].isEmpty()) {
                    long j6 = i6;
                    map2.put(java.lang.Long.valueOf(j6), eras[i6]);
                    java.lang.Long lValueOf = java.lang.Long.valueOf(j6);
                    java.lang.String str = eras[i6];
                    map3.put(lValueOf, str.substring(0, java.lang.Character.charCount(str.codePointAt(0))));
                }
            }
            if (!map2.isEmpty()) {
                map.put(j$.time.format.TextStyle.FULL, map2);
                map.put(j$.time.format.TextStyle.SHORT, map2);
                map.put(j$.time.format.TextStyle.NARROW, map3);
            }
            zVar = new j$.time.format.z(map);
        } else if (sVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            j$.com.android.tools.r8.a.p(map, java.text.DateFormatSymbols.getInstance(locale), locale);
            zVar = new j$.time.format.z(map);
        } else if (sVar == j$.time.temporal.a.DAY_OF_WEEK) {
            j$.com.android.tools.r8.a.o(map, java.text.DateFormatSymbols.getInstance(locale), locale);
            zVar = new j$.time.format.z(map);
        } else if (sVar == j$.time.temporal.a.AMPM_OF_DAY) {
            java.text.DateFormatSymbols dateFormatSymbols2 = java.text.DateFormatSymbols.getInstance(locale);
            java.util.HashMap map4 = new java.util.HashMap();
            java.util.HashMap map5 = new java.util.HashMap();
            java.lang.String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
            for (int i10 = 0; i10 < amPmStrings.length; i10++) {
                if (!amPmStrings[i10].isEmpty()) {
                    long j10 = i10;
                    map4.put(java.lang.Long.valueOf(j10), amPmStrings[i10]);
                    java.lang.Long lValueOf2 = java.lang.Long.valueOf(j10);
                    java.lang.String str2 = amPmStrings[i10];
                    map5.put(lValueOf2, str2.substring(0, java.lang.Character.charCount(str2.codePointAt(0))));
                }
            }
            if (!map4.isEmpty()) {
                map.put(j$.time.format.TextStyle.FULL, map4);
                map.put(j$.time.format.TextStyle.SHORT, map4);
                map.put(j$.time.format.TextStyle.NARROW, map5);
            }
            zVar = new j$.time.format.z(map);
        } else {
            zVar = "";
        }
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, zVar);
        return concurrentHashMap.get(simpleImmutableEntry);
    }

    static j$.time.format.A c() {
        return f47781c;
    }

    public java.lang.String d(j$.time.chrono.Chronology chronology, j$.time.temporal.s sVar, long j6, j$.time.format.TextStyle textStyle, java.util.Locale locale) {
        if (chronology == j$.time.chrono.q.f47758e || !(sVar instanceof j$.time.temporal.a)) {
            return e(sVar, j6, textStyle, locale);
        }
        return null;
    }

    public java.lang.String e(j$.time.temporal.s sVar, long j6, j$.time.format.TextStyle textStyle, java.util.Locale locale) {
        java.lang.Object objB = b(sVar, locale);
        if (objB instanceof j$.time.format.z) {
            return ((j$.time.format.z) objB).a(j6, textStyle);
        }
        return null;
    }

    public java.util.Iterator f(j$.time.chrono.Chronology chronology, j$.time.temporal.s sVar, j$.time.format.TextStyle textStyle, java.util.Locale locale) {
        if (chronology == j$.time.chrono.q.f47758e || !(sVar instanceof j$.time.temporal.a)) {
            return g(sVar, textStyle, locale);
        }
        return null;
    }

    public java.util.Iterator g(j$.time.temporal.s sVar, j$.time.format.TextStyle textStyle, java.util.Locale locale) {
        java.lang.Object objB = b(sVar, locale);
        if (objB instanceof j$.time.format.z) {
            return ((j$.time.format.z) objB).b(textStyle);
        }
        return null;
    }
}
