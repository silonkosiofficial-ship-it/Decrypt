package p051f0;

/* JADX INFO: renamed from: f0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6540b {
    private static final void a(java.lang.Appendable appendable, java.lang.Object obj, p237x7.l lVar) throws java.io.IOException {
        java.lang.CharSequence charSequenceValueOf;
        if (lVar == null) {
            if (!(obj == null ? true : obj instanceof java.lang.CharSequence)) {
                if (obj instanceof java.lang.Character) {
                    appendable.append(((java.lang.Character) obj).charValue());
                    return;
                }
                charSequenceValueOf = java.lang.String.valueOf(obj);
            }
            appendable.append(charSequenceValueOf);
        }
        obj = lVar.l(obj);
        charSequenceValueOf = (java.lang.CharSequence) obj;
        appendable.append(charSequenceValueOf);
    }

    private static final java.lang.Appendable b(java.util.List list, java.lang.Appendable appendable, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, p237x7.l lVar) throws java.io.IOException {
        appendable.append(charSequence2);
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            java.lang.Object obj = list.get(i11);
            i10++;
            if (i10 > 1) {
                appendable.append(charSequence);
            }
            if (i6 >= 0 && i10 > i6) {
                break;
            }
            a(appendable, obj, lVar);
        }
        if (i6 >= 0 && i10 > i6) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final java.lang.String c(java.util.List list, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, p237x7.l lVar) {
        return ((java.lang.StringBuilder) b(list, new java.lang.StringBuilder(), charSequence, charSequence2, charSequence3, i6, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ java.lang.String d(java.util.List list, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, p237x7.l lVar, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            charSequence = ", ";
        }
        java.lang.CharSequence charSequence5 = (i10 & 2) != 0 ? "" : charSequence2;
        java.lang.CharSequence charSequence6 = (i10 & 4) == 0 ? charSequence3 : "";
        if ((i10 & 8) != 0) {
            i6 = -1;
        }
        int i11 = i6;
        if ((i10 & 16) != 0) {
            charSequence4 = "...";
        }
        java.lang.CharSequence charSequence7 = charSequence4;
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        return c(list, charSequence, charSequence5, charSequence6, i11, charSequence7, lVar);
    }

    public static final java.util.Set e(java.util.List list) {
        java.util.HashSet hashSet = new java.util.HashSet(list.size());
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            hashSet.add(list.get(i6));
        }
        return hashSet;
    }
}
