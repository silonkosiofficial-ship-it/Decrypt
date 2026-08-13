package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    static class a {
        static android.os.LocaleList a(android.content.res.Configuration configuration) {
            return configuration.getLocales();
        }

        static void b(android.content.res.Configuration configuration, androidx.core.os.i iVar) {
            configuration.setLocales((android.os.LocaleList) iVar.i());
        }
    }

    public static androidx.core.os.i a(android.content.res.Configuration configuration) {
        return android.os.Build.VERSION.SDK_INT >= 24 ? androidx.core.os.i.j(androidx.core.os.f.a.a(configuration)) : androidx.core.os.i.a(configuration.locale);
    }
}
