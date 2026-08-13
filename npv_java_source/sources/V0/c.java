package V0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V0.c f15097a = new V0.c();

    private c() {
    }

    public final java.lang.Object a(T0.h hVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(hVar, 10));
        java.util.Iterator<E> it = hVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((T0.g) it.next()).b());
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        return V0.a.a(K.t0.a((java.util.Locale[]) java.util.Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(U0.g gVar, T0.h hVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(hVar, 10));
        java.util.Iterator<E> it = hVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((T0.g) it.next()).b());
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        gVar.setTextLocales(K.t0.a((java.util.Locale[]) java.util.Arrays.copyOf(localeArr, localeArr.length)));
    }
}
