package p055f4;

/* JADX INFO: renamed from: f4.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6579s0 {
    public static p055f4.C6576q0 a(android.content.Context context, java.lang.String str) {
        java.lang.String strConcat;
        java.lang.String str2;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.lang.String[] strArrSplit = str.split("/", -1);
        int length = strArrSplit.length;
        if (length == 1) {
            java.lang.String strValueOf = java.lang.String.valueOf(context.getPackageName());
            str2 = strArrSplit[0];
            strConcat = strValueOf.concat("_preferences");
        } else {
            if (length != 2) {
                return null;
            }
            strConcat = strArrSplit[0];
            str2 = strArrSplit[1];
        }
        if (android.text.TextUtils.isEmpty(strConcat) || android.text.TextUtils.isEmpty(str2)) {
            return null;
        }
        return new p055f4.C6576q0(strConcat, str2);
    }

    public static void b(android.content.Context context, java.util.Set set) {
        p055f4.C6577r0 c6577r0 = new p055f4.C6577r0(context);
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            p055f4.C6576q0 c6576q0A = a(context, str);
            if (c6576q0A == null) {
                "clearKeys: unable to process key: ".concat(java.lang.String.valueOf(str));
            } else {
                c6577r0.d(c6576q0A.f45231a).remove(c6576q0A.f45232b);
            }
        }
        c6577r0.b();
    }
}
