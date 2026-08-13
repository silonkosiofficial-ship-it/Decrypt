package N4;

/* JADX INFO: renamed from: N4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC1407g {
    static void a(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            java.lang.String strValueOf = java.lang.String.valueOf(obj2);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(strValueOf);
            throw new java.lang.NullPointerException(sb.toString());
        }
        if (obj2 != null) {
            return;
        }
        java.lang.String strValueOf2 = java.lang.String.valueOf(obj);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(strValueOf2.length() + 26);
        sb2.append("null value in entry: ");
        sb2.append(strValueOf2);
        sb2.append("=null");
        throw new java.lang.NullPointerException(sb2.toString());
    }

    static int b(int i6, java.lang.String str) {
        if (i6 >= 0) {
            return i6;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i6);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    static void c(boolean z6) {
        M4.h.o(z6, "no calls to next() since the last call to remove()");
    }
}
