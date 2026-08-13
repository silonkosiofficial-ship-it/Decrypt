package p055f4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class B0 {
    public static java.lang.String a(java.lang.String str, java.lang.Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        java.lang.String string;
        int i6 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            java.lang.Object obj = objArr[i10];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (java.lang.Exception e6) {
                    java.lang.String str2 = obj.getClass().getName() + "@" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
                    java.util.logging.Logger.getLogger("com.google.common.base.Strings").logp(java.util.logging.Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (java.lang.Throwable) e6);
                    string = "<" + str2 + " threw " + e6.getClass().getName() + ">";
                }
            }
            objArr[i10] = string;
            i10++;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + (length * 16));
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i6 >= length2 || (iIndexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb.append((java.lang.CharSequence) str, i11, iIndexOf);
            sb.append(objArr[i6]);
            i11 = iIndexOf + 2;
            i6++;
        }
        sb.append((java.lang.CharSequence) str, i11, str.length());
        if (i6 < length2) {
            sb.append(" [");
            sb.append(objArr[i6]);
            for (int i12 = i6 + 1; i12 < objArr.length; i12++) {
                sb.append(", ");
                sb.append(objArr[i12]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
