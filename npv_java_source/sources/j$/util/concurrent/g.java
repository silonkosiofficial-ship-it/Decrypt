package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
final class g extends j$.util.concurrent.l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final j$.util.concurrent.l[] f48076e;

    g(j$.util.concurrent.l[] lVarArr) {
        super(-1, null, null);
        this.f48076e = lVarArr;
    }

    @Override // j$.util.concurrent.l
    final j$.util.concurrent.l a(int i6, java.lang.Object obj) {
        int length;
        j$.util.concurrent.l lVarK;
        java.lang.Object obj2;
        j$.util.concurrent.l[] lVarArr = this.f48076e;
        loop0: while (obj != null && lVarArr != null && (length = lVarArr.length) != 0 && (lVarK = j$.util.concurrent.ConcurrentHashMap.k(lVarArr, (length - 1) & i6)) != null) {
            do {
                int i10 = lVarK.f48083a;
                if (i10 == i6 && ((obj2 = lVarK.f48084b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return lVarK;
                }
                if (i10 >= 0) {
                    lVarK = lVarK.f48086d;
                } else {
                    if (!(lVarK instanceof j$.util.concurrent.g)) {
                        return lVarK.a(i6, obj);
                    }
                    lVarArr = ((j$.util.concurrent.g) lVarK).f48076e;
                }
            } while (lVarK != null);
        }
        return null;
    }
}
