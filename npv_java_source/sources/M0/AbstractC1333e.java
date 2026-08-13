package M0;

/* JADX INFO: renamed from: M0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1333e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final M0.C1332d f6705a = new M0.C1332d("", null, null, 6, null);

    public static final boolean f(int i6, int i10, int i11, int i12) {
        if (i6 > i11 || i12 > i10) {
            return false;
        }
        if (i10 == i12) {
            if ((i11 == i12) != (i6 == i10)) {
                return false;
            }
        }
        return true;
    }

    public static final M0.C1332d g() {
        return f6705a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List h(java.util.List list, int i6, int i10) {
        if (i6 > i10) {
            throw new java.lang.IllegalArgumentException(("start (" + i6 + ") should be less than or equal to end (" + i10 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            java.lang.Object obj = list.get(i11);
            M0.C1332d.c cVar = (M0.C1332d.c) obj;
            if (l(i6, i10, cVar.f(), cVar.d())) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            M0.C1332d.c cVar2 = (M0.C1332d.c) arrayList.get(i12);
            arrayList2.add(new M0.C1332d.c(cVar2.e(), java.lang.Math.max(i6, cVar2.f()) - i6, java.lang.Math.min(i10, cVar2.d()) - i6, cVar2.g()));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List i(M0.C1332d c1332d, int i6, int i10) {
        java.util.List listB;
        if (i6 == i10 || (listB = c1332d.b()) == null) {
            return null;
        }
        if (i6 == 0 && i10 >= c1332d.i().length()) {
            return listB;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(listB.size());
        int size = listB.size();
        for (int i11 = 0; i11 < size; i11++) {
            java.lang.Object obj = listB.get(i11);
            M0.C1332d.c cVar = (M0.C1332d.c) obj;
            if (l(i6, i10, cVar.f(), cVar.d())) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            M0.C1332d.c cVar2 = (M0.C1332d.c) arrayList.get(i12);
            arrayList2.add(new M0.C1332d.c(cVar2.e(), E7.j.k(cVar2.f(), i6, i10) - i6, E7.j.k(cVar2.d(), i6, i10) - i6, cVar2.g()));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List j(M0.C1332d c1332d, int i6, int i10) {
        java.util.List listF;
        if (i6 == i10 || (listF = c1332d.f()) == null) {
            return null;
        }
        if (i6 == 0 && i10 >= c1332d.i().length()) {
            return listF;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(listF.size());
        int size = listF.size();
        for (int i11 = 0; i11 < size; i11++) {
            java.lang.Object obj = listF.get(i11);
            M0.C1332d.c cVar = (M0.C1332d.c) obj;
            if (l(i6, i10, cVar.f(), cVar.d())) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            M0.C1332d.c cVar2 = (M0.C1332d.c) arrayList.get(i12);
            arrayList2.add(new M0.C1332d.c(cVar2.e(), E7.j.k(cVar2.f(), i6, i10) - i6, E7.j.k(cVar2.d(), i6, i10) - i6));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List k(M0.C1332d c1332d, int i6, int i10) {
        java.util.List listH;
        if (i6 == i10 || (listH = c1332d.h()) == null) {
            return null;
        }
        if (i6 == 0 && i10 >= c1332d.i().length()) {
            return listH;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(listH.size());
        int size = listH.size();
        for (int i11 = 0; i11 < size; i11++) {
            java.lang.Object obj = listH.get(i11);
            M0.C1332d.c cVar = (M0.C1332d.c) obj;
            if (l(i6, i10, cVar.f(), cVar.d())) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            M0.C1332d.c cVar2 = (M0.C1332d.c) arrayList.get(i12);
            arrayList2.add(new M0.C1332d.c(cVar2.e(), E7.j.k(cVar2.f(), i6, i10) - i6, E7.j.k(cVar2.d(), i6, i10) - i6));
        }
        return arrayList2;
    }

    public static final boolean l(int i6, int i10, int i11, int i12) {
        return java.lang.Math.max(i6, i11) < java.lang.Math.min(i10, i12) || f(i6, i10, i11, i12) || f(i11, i12, i6, i10);
    }

    public static final java.util.List m(M0.C1332d c1332d, M0.v vVar) {
        int length = c1332d.i().length();
        java.util.List listF = c1332d.f();
        if (listF == null) {
            listF = p097j7.AbstractC6879v.m();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = listF.size();
        int i6 = 0;
        int i10 = 0;
        while (i6 < size) {
            M0.C1332d.c cVar = (M0.C1332d.c) listF.get(i6);
            M0.v vVar2 = (M0.v) cVar.a();
            int iB = cVar.b();
            int iC = cVar.c();
            if (iB != i10) {
                arrayList.add(new M0.C1332d.c(vVar, i10, iB));
            }
            arrayList.add(new M0.C1332d.c(vVar.l(vVar2), iB, iC));
            i6++;
            i10 = iC;
        }
        if (i10 != length) {
            arrayList.add(new M0.C1332d.c(vVar, i10, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new M0.C1332d.c(vVar, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M0.C1332d n(M0.C1332d c1332d, int i6, int i10) {
        java.lang.String strSubstring;
        if (i6 != i10) {
            strSubstring = c1332d.i().substring(i6, i10);
            p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "";
        }
        return new M0.C1332d(strSubstring, k(c1332d, i6, i10), null, null, 12, null);
    }
}
