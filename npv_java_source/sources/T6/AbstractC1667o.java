package T6;

/* JADX INFO: renamed from: T6.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1667o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Set f13188a = p097j7.Z.g('(', ')', '<', '>', '@', ',', ';', ':', '\\', '\"', '/', '[', ']', '?', '=', '{', '}', ' ', '\t', '\n', '\r');

    public static final java.lang.String b(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        return d(str) ? e(str) : str;
    }

    private static final boolean c(java.lang.String str) {
        if (str.length() < 2 || S8.r.y1(str) != '\"' || S8.r.z1(str) != '\"') {
            return false;
        }
        int i6 = 1;
        do {
            int iO0 = S8.r.o0(str, '\"', i6, false, 4, null);
            if (iO0 == S8.r.j0(str)) {
                break;
            }
            int i10 = 0;
            for (int i11 = iO0 - 1; str.charAt(i11) == '\\'; i11--) {
                i10++;
            }
            if (i10 % 2 == 0) {
                return false;
            }
            i6 = iO0 + 1;
        } while (i6 < str.length());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(java.lang.String str) {
        if (str.length() == 0) {
            return true;
        }
        if (c(str)) {
            return false;
        }
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            if (f13188a.contains(java.lang.Character.valueOf(str.charAt(i6)))) {
                return true;
            }
        }
        return false;
    }

    public static final java.lang.String e(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        f(str, sb);
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    private static final void f(java.lang.String str, java.lang.StringBuilder sb) {
        java.lang.String str2;
        sb.append("\"");
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt = str.charAt(i6);
            if (cCharAt == '\t') {
                str2 = "\\t";
            } else if (cCharAt == '\n') {
                str2 = "\\n";
            } else if (cCharAt == '\r') {
                str2 = "\\r";
            } else if (cCharAt != '\"') {
                if (cCharAt != '\\') {
                    sb.append(cCharAt);
                } else {
                    str2 = "\\\\";
                }
            } else {
                str2 = "\\\"";
            }
            sb.append(str2);
        }
        sb.append("\"");
    }
}
