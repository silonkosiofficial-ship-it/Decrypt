package S8;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s {
    public static java.lang.Appendable a(java.lang.Appendable appendable, java.lang.CharSequence... charSequenceArr) throws java.io.IOException {
        p247y7.AbstractC7350t.f(appendable, "<this>");
        p247y7.AbstractC7350t.f(charSequenceArr, "value");
        for (java.lang.CharSequence charSequence : charSequenceArr) {
            appendable.append(charSequence);
        }
        return appendable;
    }

    public static void b(java.lang.Appendable appendable, java.lang.Object obj, p237x7.l lVar) throws java.io.IOException {
        java.lang.CharSequence string;
        p247y7.AbstractC7350t.f(appendable, "<this>");
        if (lVar == null) {
            if (!(obj == null ? true : obj instanceof java.lang.CharSequence)) {
                if (obj instanceof java.lang.Character) {
                    appendable.append(((java.lang.Character) obj).charValue());
                    return;
                }
                string = obj.toString();
            }
            appendable.append(string);
        }
        obj = lVar.l(obj);
        string = (java.lang.CharSequence) obj;
        appendable.append(string);
    }
}
