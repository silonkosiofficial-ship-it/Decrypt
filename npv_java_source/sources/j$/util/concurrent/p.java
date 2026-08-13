package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    j$.util.concurrent.l[] f48091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    j$.util.concurrent.l f48092b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    j$.util.concurrent.o f48093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    j$.util.concurrent.o f48094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f48095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f48096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f48097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f48098h;

    p(j$.util.concurrent.l[] lVarArr, int i6, int i10, int i11) {
        this.f48091a = lVarArr;
        this.f48098h = i6;
        this.f48095e = i10;
        this.f48096f = i10;
        this.f48097g = i11;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c A[LOOP:1: B:34:0x005f->B:38:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0082 A[EDGE_INSN: B:70:0x0082->B:39:0x0082 BREAK  A[LOOP:1: B:34:0x005f->B:38:0x006c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0082 A[EDGE_INSN: B:71:0x0082->B:39:0x0082 BREAK  A[LOOP:1: B:34:0x005f->B:38:0x006c], SYNTHETIC] */
    final j$.util.concurrent.l a() {
        j$.util.concurrent.l[] lVarArr;
        int length;
        int i6;
        j$.util.concurrent.o oVar;
        int i10;
        int i11;
        int i12;
        int i13;
        j$.util.concurrent.l lVar = this.f48092b;
        if (lVar != null) {
            lVar = lVar.f48086d;
        }
        while (lVar == null) {
            if (this.f48096f >= this.f48097g || (lVarArr = this.f48091a) == null || (length = lVarArr.length) <= (i6 = this.f48095e) || i6 < 0) {
                this.f48092b = null;
                return null;
            }
            j$.util.concurrent.l lVarK = j$.util.concurrent.ConcurrentHashMap.k(lVarArr, i6);
            if (lVarK == null || lVarK.f48083a >= 0) {
                lVar = lVarK;
                if (this.f48093c != null) {
                    while (true) {
                        oVar = this.f48093c;
                        if (oVar != null) {
                            break;
                        }
                        int i14 = this.f48095e;
                        i11 = oVar.f48087a;
                        i12 = i14 + i11;
                        this.f48095e = i12;
                        if (i12 >= length) {
                            break;
                        }
                        this.f48095e = oVar.f48088b;
                        this.f48091a = oVar.f48089c;
                        oVar.f48089c = null;
                        j$.util.concurrent.o oVar2 = oVar.f48090d;
                        oVar.f48090d = this.f48094d;
                        this.f48093c = oVar2;
                        this.f48094d = oVar;
                        length = i11;
                    }
                    if (oVar == null) {
                        i10 = this.f48095e + this.f48098h;
                        this.f48095e = i10;
                        if (i10 >= length) {
                            int i15 = this.f48096f + 1;
                            this.f48096f = i15;
                            this.f48095e = i15;
                        }
                    }
                } else {
                    i13 = i6 + this.f48098h;
                    this.f48095e = i13;
                    if (i13 >= length) {
                        int i16 = this.f48096f + 1;
                        this.f48096f = i16;
                        this.f48095e = i16;
                    }
                }
            } else if (lVarK instanceof j$.util.concurrent.g) {
                this.f48091a = ((j$.util.concurrent.g) lVarK).f48076e;
                j$.util.concurrent.o oVar3 = this.f48094d;
                if (oVar3 != null) {
                    this.f48094d = oVar3.f48090d;
                } else {
                    oVar3 = new j$.util.concurrent.o();
                }
                oVar3.f48089c = lVarArr;
                oVar3.f48087a = length;
                oVar3.f48088b = i6;
                oVar3.f48090d = this.f48093c;
                this.f48093c = oVar3;
                lVar = null;
            } else {
                lVar = lVarK instanceof j$.util.concurrent.q ? ((j$.util.concurrent.q) lVarK).f48102f : null;
                if (this.f48093c != null) {
                    while (true) {
                        oVar = this.f48093c;
                        if (oVar != null) {
                            break;
                            break;
                        }
                        int i17 = this.f48095e;
                        i11 = oVar.f48087a;
                        i12 = i17 + i11;
                        this.f48095e = i12;
                        if (i12 >= length) {
                            break;
                            break;
                        }
                        this.f48095e = oVar.f48088b;
                        this.f48091a = oVar.f48089c;
                        oVar.f48089c = null;
                        j$.util.concurrent.o oVar4 = oVar.f48090d;
                        oVar.f48090d = this.f48094d;
                        this.f48093c = oVar4;
                        this.f48094d = oVar;
                        length = i11;
                    }
                    if (oVar == null) {
                        i10 = this.f48095e + this.f48098h;
                        this.f48095e = i10;
                        if (i10 >= length) {
                            int i18 = this.f48096f + 1;
                            this.f48096f = i18;
                            this.f48095e = i18;
                        }
                    }
                } else {
                    i13 = i6 + this.f48098h;
                    this.f48095e = i13;
                    if (i13 >= length) {
                        int i19 = this.f48096f + 1;
                        this.f48096f = i19;
                        this.f48095e = i19;
                    }
                }
            }
        }
        this.f48092b = lVar;
        return lVar;
    }
}
