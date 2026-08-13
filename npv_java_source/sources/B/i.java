package B;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final B.t a(java.util.List list, B.u uVar, java.util.List list2, int i6, int i10, int i11) {
        int index = ((B.t) p097j7.AbstractC6879v.i0(list)).getIndex();
        int size = list2.size();
        int iIntValue = -1;
        int iIntValue2 = -1;
        int i12 = 0;
        while (i12 < size && ((java.lang.Number) list2.get(i12)).intValue() <= index) {
            iIntValue2 = ((java.lang.Number) list2.get(i12)).intValue();
            i12++;
            iIntValue = ((java.lang.Number) ((i12 < 0 || i12 > p097j7.AbstractC6879v.o(list2)) ? -1 : list2.get(i12))).intValue();
        }
        int size2 = list.size();
        int iC = Integer.MIN_VALUE;
        int iC2 = Integer.MIN_VALUE;
        int i13 = -1;
        for (int i14 = 0; i14 < size2; i14++) {
            B.t tVar = (B.t) list.get(i14);
            if (tVar.getIndex() == iIntValue2) {
                iC = tVar.c();
                i13 = i14;
            } else if (tVar.getIndex() == iIntValue) {
                iC2 = tVar.c();
            }
        }
        if (iIntValue2 == -1) {
            return null;
        }
        B.t tVarE = B.u.e(uVar, iIntValue2, 0L, 2, null);
        tVarE.d(true);
        int iMin = -i6;
        if (iC != Integer.MIN_VALUE) {
            iMin = java.lang.Math.max(iMin, iC);
        }
        if (iC2 != Integer.MIN_VALUE) {
            iMin = java.lang.Math.min(iMin, iC2 - tVarE.a());
        }
        tVarE.s(iMin, i10, i11);
        if (i13 != -1) {
            list.set(i13, tVarE);
        } else {
            list.add(0, tVarE);
        }
        return tVarE;
    }
}
