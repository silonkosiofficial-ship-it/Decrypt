package T;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static final java.lang.String a(int i6, V.InterfaceC1734n interfaceC1734n, int i10) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-907677715, i10, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:30)");
        }
        interfaceC1734n.n(androidx.compose.ui.platform.T.f());
        java.lang.String string = ((android.content.Context) interfaceC1734n.n(androidx.compose.ui.platform.T.g())).getResources().getString(i6);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return string;
    }

    public static final java.lang.String b(int i6, java.lang.Object[] objArr, V.InterfaceC1734n interfaceC1734n, int i10) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1427268608, i10, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:38)");
        }
        java.lang.String strA = a(i6, interfaceC1734n, i10 & 14);
        java.util.Locale localeD = androidx.core.os.f.a((android.content.res.Configuration) interfaceC1734n.n(androidx.compose.ui.platform.T.f())).d(0);
        if (localeD == null) {
            localeD = java.util.Locale.getDefault();
        }
        p247y7.V v6 = p247y7.V.f57259a;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        java.lang.String str = java.lang.String.format(localeD, strA, java.util.Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        p247y7.AbstractC7350t.e(str, "format(locale, format, *args)");
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return str;
    }
}
