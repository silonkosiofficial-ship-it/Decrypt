package aa;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {
    public static final aa.n a() {
        java.util.Locale locale = java.util.Locale.getDefault();
        android.content.res.Configuration configuration = android.content.res.Resources.getSystem().getConfiguration();
        boolean z6 = (configuration.uiMode & 48) == 32;
        int i6 = configuration.densityDpi;
        java.lang.String language = locale.getLanguage();
        p247y7.AbstractC7350t.e(language, "getLanguage(...)");
        aa.i iVar = new aa.i(language);
        java.lang.String country = locale.getCountry();
        p247y7.AbstractC7350t.e(country, "getCountry(...)");
        return new aa.n(iVar, new aa.l(country), aa.C.f17241C.a(z6), aa.EnumC1889c.f17259D.b(i6));
    }
}
