package T;

/* JADX INFO: renamed from: T.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1650i {
    public static final T.AbstractC1647f a(java.util.Locale locale) {
        return android.os.Build.VERSION.SDK_INT >= 26 ? new T.C1648g(locale) : new T.q(locale);
    }

    public static final java.lang.String b(long j6, java.lang.String str, java.util.Locale locale, java.util.Map map) {
        java.lang.String str2 = "S:" + str + locale.toLanguageTag();
        java.lang.Object bestDateTimePattern = map.get(str2);
        if (bestDateTimePattern == null) {
            bestDateTimePattern = android.text.format.DateFormat.getBestDateTimePattern(locale, str);
            map.put(str2, bestDateTimePattern);
        }
        java.lang.String string = bestDateTimePattern.toString();
        return android.os.Build.VERSION.SDK_INT >= 26 ? T.C1648g.f12816e.a(j6, string, locale, map) : T.q.f12854e.a(j6, string, locale, map);
    }
}
