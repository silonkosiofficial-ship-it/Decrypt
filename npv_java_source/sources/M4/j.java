package M4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static java.lang.String a(java.lang.String str, java.lang.Object... objArr) {
        int iIndexOf;
        java.lang.String strValueOf = java.lang.String.valueOf(str);
        int i6 = 0;
        if (objArr == null) {
            objArr = new java.lang.Object[]{"(Object[])null"};
        } else {
            for (int i10 = 0; i10 < objArr.length; i10++) {
                objArr[i10] = b(objArr[i10]);
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i11 = 0;
        while (i6 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i11)) != -1) {
            sb.append((java.lang.CharSequence) strValueOf, i11, iIndexOf);
            sb.append(objArr[i6]);
            i11 = iIndexOf + 2;
            i6++;
        }
        sb.append((java.lang.CharSequence) strValueOf, i11, strValueOf.length());
        if (i6 < objArr.length) {
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

    private static java.lang.String b(java.lang.Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (java.lang.Exception e6) {
            java.lang.String name = obj.getClass().getName();
            java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
            java.lang.StringBuilder sb = new java.lang.StringBuilder(name.length() + 1 + java.lang.String.valueOf(hexString).length());
            sb.append(name);
            sb.append('@');
            sb.append(hexString);
            java.lang.String string = sb.toString();
            java.util.logging.Logger logger = java.util.logging.Logger.getLogger("com.google.common.base.Strings");
            java.util.logging.Level level = java.util.logging.Level.WARNING;
            java.lang.String strValueOf = java.lang.String.valueOf(string);
            logger.log(level, strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new java.lang.String("Exception during lenientFormat for "), (java.lang.Throwable) e6);
            java.lang.String name2 = e6.getClass().getName();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(string).length() + 9 + name2.length());
            sb2.append("<");
            sb2.append(string);
            sb2.append(" threw ");
            sb2.append(name2);
            sb2.append(">");
            return sb2.toString();
        }
    }
}
