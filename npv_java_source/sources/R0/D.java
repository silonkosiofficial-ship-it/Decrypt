package R0;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {
    public static final R0.z a() {
        return android.os.Build.VERSION.SDK_INT >= 28 ? new R0.B() : new R0.C();
    }

    public static final java.lang.String b(java.lang.String str, R0.q qVar) {
        java.lang.StringBuilder sb;
        java.lang.String str2;
        int iQ = qVar.q() / 100;
        if (iQ >= 0 && iQ < 2) {
            sb = new java.lang.StringBuilder();
            sb.append(str);
            str2 = "-thin";
        } else if (2 <= iQ && iQ < 4) {
            sb = new java.lang.StringBuilder();
            sb.append(str);
            str2 = "-light";
        } else {
            if (iQ == 4) {
                return str;
            }
            if (iQ == 5) {
                sb = new java.lang.StringBuilder();
                sb.append(str);
                str2 = "-medium";
            } else {
                if ((6 <= iQ && iQ < 8) || 8 > iQ || iQ >= 11) {
                    return str;
                }
                sb = new java.lang.StringBuilder();
                sb.append(str);
                str2 = "-black";
            }
        }
        sb.append(str2);
        return sb.toString();
    }
}
