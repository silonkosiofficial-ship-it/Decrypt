package S;

/* JADX INFO: renamed from: S.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1561o {
    public static final java.util.Locale a(V.InterfaceC1734n interfaceC1734n, int i6) {
        java.util.Locale localeD;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1612326743, i6, -1, "androidx.compose.material3.defaultLocale (CalendarLocale.android.kt:30)");
        }
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            interfaceC1734n.T(-1190822718);
            localeD = S.AbstractC1560n0.f11477a.a(interfaceC1734n, 6);
        } else {
            interfaceC1734n.T(100135232);
            localeD = androidx.core.os.f.a((android.content.res.Configuration) interfaceC1734n.n(androidx.compose.ui.platform.T.f())).d(0);
            if (localeD == null) {
                localeD = java.util.Locale.getDefault();
            }
        }
        interfaceC1734n.J();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return localeD;
    }
}
