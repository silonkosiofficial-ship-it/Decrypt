package K;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K.v0 f5923a = new K.v0();

    private v0() {
    }

    public final void a(android.view.inputmethod.EditorInfo editorInfo, T0.h hVar) {
        android.os.LocaleList localeListA;
        if (p247y7.AbstractC7350t.b(hVar, T0.h.f12889E.b())) {
            localeListA = null;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(hVar, 10));
            java.util.Iterator<E> it = hVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((T0.g) it.next()).b());
            }
            java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
            localeListA = K.t0.a((java.util.Locale[]) java.util.Arrays.copyOf(localeArr, localeArr.length));
        }
        editorInfo.hintLocales = localeListA;
    }
}
