package p168q8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n {
    public static final java.lang.String a(p138n8.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "<this>");
        java.util.List listH = dVar.h();
        p247y7.AbstractC7350t.e(listH, "pathSegments(...)");
        return c(listH);
    }

    public static final java.lang.String b(p138n8.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "<this>");
        if (!e(fVar)) {
            java.lang.String strG = fVar.g();
            p247y7.AbstractC7350t.e(strG, "asString(...)");
            return strG;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strG2 = fVar.g();
        p247y7.AbstractC7350t.e(strG2, "asString(...)");
        sb.append('`' + strG2);
        sb.append('`');
        return sb.toString();
    }

    public static final java.lang.String c(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "pathSegments");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p138n8.f fVar = (p138n8.f) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(b(fVar));
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    public static final java.lang.String d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        p247y7.AbstractC7350t.f(str, "lowerRendered");
        p247y7.AbstractC7350t.f(str2, "lowerPrefix");
        p247y7.AbstractC7350t.f(str3, "upperRendered");
        p247y7.AbstractC7350t.f(str4, "upperPrefix");
        p247y7.AbstractC7350t.f(str5, "foldedPrefix");
        if (S8.r.V(str, str2, false, 2, null) && S8.r.V(str3, str4, false, 2, null)) {
            java.lang.String strSubstring = str.substring(str2.length());
            p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
            java.lang.String strSubstring2 = str3.substring(str4.length());
            p247y7.AbstractC7350t.e(strSubstring2, "substring(...)");
            java.lang.String str6 = str5 + strSubstring;
            if (p247y7.AbstractC7350t.b(strSubstring, strSubstring2)) {
                return str6;
            }
            if (f(strSubstring, strSubstring2)) {
                return str6 + '!';
            }
        }
        return null;
    }

    private static final boolean e(p138n8.f fVar) {
        java.lang.String strG = fVar.g();
        p247y7.AbstractC7350t.e(strG, "asString(...)");
        if (!p168q8.i.f53264a.contains(strG)) {
            for (int i6 = 0; i6 < strG.length(); i6++) {
                char cCharAt = strG.charAt(i6);
                if (java.lang.Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            if (strG.length() != 0 && java.lang.Character.isJavaIdentifierStart(strG.codePointAt(0))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x003e  */
    /* JADX WARN: Instruction removed from duplicated block: B:8:0x003e, please report this as an issue */
    public static final boolean f(java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "lower");
        p247y7.AbstractC7350t.f(str2, "upper");
        if (!p247y7.AbstractC7350t.b(str, S8.r.R(str2, "?", "", false, 4, null))) {
            if (S8.r.J(str2, "?", false, 2, null)) {
                if (!p247y7.AbstractC7350t.b(str + '?', str2)) {
                    if (p247y7.AbstractC7350t.b('(' + str + ")?", str2)) {
                        return false;
                    }
                }
            } else {
                if (p247y7.AbstractC7350t.b('(' + str + ")?", str2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
