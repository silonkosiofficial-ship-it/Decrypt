package V0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    private static final void a(android.text.Spannable spannable, M0.x xVar, int i6, int i10, Y0.e eVar) {
        java.lang.Object[] spans = spannable.getSpans(i6, i10, androidx.emoji2.text.j.class);
        for (java.lang.Object obj : spans) {
            spannable.removeSpan((androidx.emoji2.text.j) obj);
        }
        throw null;
    }

    public static final void b(android.text.Spannable spannable, java.util.List list, Y0.e eVar) {
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            M0.C1332d.c cVar = (M0.C1332d.c) list.get(i6);
            androidx.appcompat.app.D.a(cVar.a());
            a(spannable, null, cVar.b(), cVar.c(), eVar);
        }
    }
}
