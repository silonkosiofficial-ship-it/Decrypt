package M0;

/* JADX INFO: renamed from: M0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1340l {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List b(java.util.List list, int i6, int i10) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            java.lang.Object obj = list.get(i11);
            M0.C1332d.c cVar = (M0.C1332d.c) obj;
            if (M0.AbstractC1333e.l(i6, i10, cVar.f(), cVar.d())) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            M0.C1332d.c cVar2 = (M0.C1332d.c) arrayList.get(i12);
            if (i6 > cVar2.f() || cVar2.d() > i10) {
                throw new java.lang.IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
            }
            arrayList2.add(new M0.C1332d.c(cVar2.e(), cVar2.f() - i6, cVar2.d() - i6));
        }
        return arrayList2;
    }
}
