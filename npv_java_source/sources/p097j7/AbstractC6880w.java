package p097j7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: j7.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6880w {
    public static java.util.List a(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "builder");
        return ((p107k7.b) list).Q();
    }

    public static final java.lang.Object[] b(java.lang.Object[] objArr, boolean z6) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        if (z6 && p247y7.AbstractC7350t.b(objArr.getClass(), java.lang.Object[].class)) {
            return objArr;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length, java.lang.Object[].class);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static java.util.List c() {
        return new p107k7.b(0, 1, null);
    }

    public static java.util.List d(int i6) {
        return new p107k7.b(i6);
    }

    public static java.util.List e(java.lang.Object obj) {
        java.util.List listSingletonList = java.util.Collections.singletonList(obj);
        p247y7.AbstractC7350t.e(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static java.lang.Object[] f(int i6, java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "array");
        if (i6 < objArr.length) {
            objArr[i6] = null;
        }
        return objArr;
    }
}
