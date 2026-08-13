package j$.com.android.tools.r8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    public static j$.util.function.b a(final java.util.function.DoubleConsumer doubleConsumer, final java.util.function.DoubleConsumer doubleConsumer2) {
        j$.util.Objects.requireNonNull(doubleConsumer2);
        return new java.util.function.DoubleConsumer() { // from class: j$.util.function.b
            @Override // java.util.function.DoubleConsumer
            public final void accept(double d6) {
                doubleConsumer.accept(d6);
                doubleConsumer2.accept(d6);
            }

            public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer3) {
                return j$.com.android.tools.r8.a.a(this, doubleConsumer3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.e] */
    public static j$.util.function.e b(final java.util.function.IntConsumer intConsumer, final java.util.function.IntConsumer intConsumer2) {
        j$.util.Objects.requireNonNull(intConsumer2);
        return new java.util.function.IntConsumer() { // from class: j$.util.function.e
            @Override // java.util.function.IntConsumer
            public final void accept(int i6) {
                intConsumer.accept(i6);
                intConsumer2.accept(i6);
            }

            public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer3) {
                return j$.com.android.tools.r8.a.b(this, intConsumer3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.f] */
    public static j$.util.function.f c(final java.util.function.LongConsumer longConsumer, final java.util.function.LongConsumer longConsumer2) {
        j$.util.Objects.requireNonNull(longConsumer2);
        return new java.util.function.LongConsumer() { // from class: j$.util.function.f
            @Override // java.util.function.LongConsumer
            public final void accept(long j6) {
                longConsumer.accept(j6);
                longConsumer2.accept(j6);
            }

            public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer3) {
                return j$.com.android.tools.r8.a.c(this, longConsumer3);
            }
        };
    }

    private static java.lang.String d(long j6, java.lang.String str, java.util.Locale locale) {
        java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone("UTC");
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j6, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    private static java.lang.String e(long j6, java.lang.String str, java.util.Locale locale) {
        java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone("UTC");
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j6, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static /* synthetic */ int f(long j6) {
        int i6 = (int) j6;
        if (j6 == i6) {
            return i6;
        }
        throw new java.lang.ArithmeticException();
    }

    public static /* synthetic */ long g(long j6, long j10) {
        long j11 = j6 + j10;
        if (((j10 ^ j6) < 0) || ((j6 ^ j11) >= 0)) {
            return j11;
        }
        throw new java.lang.ArithmeticException();
    }

    public static /* synthetic */ java.util.AbstractMap.SimpleImmutableEntry h(java.lang.String str, java.lang.String str2) {
        return new java.util.AbstractMap.SimpleImmutableEntry(j$.util.Objects.requireNonNull(str), j$.util.Objects.requireNonNull(str2));
    }

    public static /* synthetic */ java.util.List i(java.lang.Object[] objArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            arrayList.add(j$.util.Objects.requireNonNull(obj));
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ boolean j(sun.misc.Unsafe unsafe, java.lang.Object obj, long j6, java.lang.Object obj2) {
        while (!unsafe.compareAndSwapObject(obj, j6, (java.lang.Object) null, obj2)) {
            if (unsafe.getObject(obj, j6) != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ long k(long j6, long j10) {
        long j11 = j6 % j10;
        if (j11 == 0) {
            return 0L;
        }
        return (((j6 ^ j10) >> 63) | 1) > 0 ? j11 : j11 + j10;
    }

    public static /* synthetic */ long l(long j6, long j10) {
        long j11 = j6 / j10;
        return (j6 - (j10 * j11) != 0 && (((j6 ^ j10) >> 63) | 1) < 0) ? j11 - 1 : j11;
    }

    public static /* synthetic */ long m(long j6, long j10) {
        int iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(~j10) + java.lang.Long.numberOfLeadingZeros(j10) + java.lang.Long.numberOfLeadingZeros(~j6) + java.lang.Long.numberOfLeadingZeros(j6);
        if (iNumberOfLeadingZeros > 65) {
            return j6 * j10;
        }
        if (iNumberOfLeadingZeros >= 64) {
            if ((j10 != Long.MIN_VALUE) | (j6 >= 0)) {
                long j11 = j6 * j10;
                if (j6 == 0 || j11 / j6 == j10) {
                    return j11;
                }
            }
        }
        throw new java.lang.ArithmeticException();
    }

    public static /* synthetic */ long n(long j6, long j10) {
        long j11 = j6 - j10;
        if (((j10 ^ j6) >= 0) || ((j6 ^ j11) >= 0)) {
            return j11;
        }
        throw new java.lang.ArithmeticException();
    }

    public static void o(java.util.HashMap map, java.text.DateFormatSymbols dateFormatSymbols, java.util.Locale locale) {
        int length = dateFormatSymbols.getWeekdays().length;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        boolean z6 = locale == java.util.Locale.SIMPLIFIED_CHINESE || locale == java.util.Locale.TRADITIONAL_CHINESE;
        for (long j6 = 1; j6 <= length; j6++) {
            java.lang.String strD = d(j6, "cccc", locale);
            linkedHashMap.put(java.lang.Long.valueOf(j6), strD);
            linkedHashMap2.put(java.lang.Long.valueOf(j6), z6 ? new java.lang.StringBuilder().appendCodePoint(strD.codePointBefore(strD.length())).toString() : strD.substring(0, java.lang.Character.charCount(strD.codePointAt(0))));
            linkedHashMap3.put(java.lang.Long.valueOf(j6), d(j6, "ccc", locale));
        }
        if (length > 0) {
            map.put(j$.time.format.TextStyle.FULL_STANDALONE, linkedHashMap);
            map.put(j$.time.format.TextStyle.NARROW_STANDALONE, linkedHashMap2);
            map.put(j$.time.format.TextStyle.SHORT_STANDALONE, linkedHashMap3);
            map.put(j$.time.format.TextStyle.FULL, linkedHashMap);
            map.put(j$.time.format.TextStyle.NARROW, linkedHashMap2);
            map.put(j$.time.format.TextStyle.SHORT, linkedHashMap3);
        }
    }

    public static void p(java.util.HashMap map, java.text.DateFormatSymbols dateFormatSymbols, java.util.Locale locale) {
        int length = dateFormatSymbols.getMonths().length;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        for (long j6 = 1; j6 <= length; j6++) {
            java.lang.String strE = e(j6, "LLLL", locale);
            linkedHashMap.put(java.lang.Long.valueOf(j6), strE);
            linkedHashMap2.put(java.lang.Long.valueOf(j6), strE.substring(0, java.lang.Character.charCount(strE.codePointAt(0))));
            linkedHashMap3.put(java.lang.Long.valueOf(j6), e(j6, "LLL", locale));
        }
        if (length > 0) {
            map.put(j$.time.format.TextStyle.FULL_STANDALONE, linkedHashMap);
            map.put(j$.time.format.TextStyle.NARROW_STANDALONE, linkedHashMap2);
            map.put(j$.time.format.TextStyle.SHORT_STANDALONE, linkedHashMap3);
            map.put(j$.time.format.TextStyle.FULL, linkedHashMap);
            map.put(j$.time.format.TextStyle.NARROW, linkedHashMap2);
            map.put(j$.time.format.TextStyle.SHORT, linkedHashMap3);
        }
    }
}
