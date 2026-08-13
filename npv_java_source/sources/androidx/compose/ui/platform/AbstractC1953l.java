package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1953l {
    public static final M0.C1332d a(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof android.text.Spanned)) {
            return new M0.C1332d(charSequence.toString(), null, null, 6, null);
        }
        android.text.Spanned spanned = (android.text.Spanned) charSequence;
        int i6 = 0;
        android.text.Annotation[] annotationArr = (android.text.Annotation[]) spanned.getSpans(0, charSequence.length(), android.text.Annotation.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iE0 = p097j7.AbstractC6872n.e0(annotationArr);
        if (iE0 >= 0) {
            while (true) {
                android.text.Annotation annotation = annotationArr[i6];
                if (p247y7.AbstractC7350t.b(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new M0.C1332d.c(new androidx.compose.ui.platform.C1969q0(annotation.getValue()).k(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i6 == iE0) {
                    break;
                }
                i6++;
            }
        }
        return new M0.C1332d(charSequence.toString(), arrayList, null, 4, null);
    }

    public static final java.lang.CharSequence b(M0.C1332d c1332d) {
        if (c1332d.g().isEmpty()) {
            return c1332d.i();
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(c1332d.i());
        androidx.compose.ui.platform.C1985x0 c1985x0 = new androidx.compose.ui.platform.C1985x0();
        java.util.List listG = c1332d.g();
        int size = listG.size();
        for (int i6 = 0; i6 < size; i6++) {
            M0.C1332d.c cVar = (M0.C1332d.c) listG.get(i6);
            M0.C c6 = (M0.C) cVar.a();
            int iB = cVar.b();
            int iC = cVar.c();
            c1985x0.q();
            c1985x0.d(c6);
            spannableString.setSpan(new android.text.Annotation("androidx.compose.text.SpanStyle", c1985x0.p()), iB, iC, 33);
        }
        return spannableString;
    }
}
