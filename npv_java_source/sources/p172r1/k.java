package p172r1;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean[] f53794a = new boolean[3];

    static void a(p172r1.f fVar, p162q1.d dVar, p172r1.e eVar) {
        eVar.f53683j = -1;
        eVar.f53685k = -1;
        r1.e.b bVar = fVar.f53651M[0];
        r1.e.b bVar2 = r1.e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f53651M[0] == r1.e.b.MATCH_PARENT) {
            int i6 = eVar.f53640B.f53624e;
            int iP = fVar.P() - eVar.f53642D.f53624e;
            p172r1.d dVar2 = eVar.f53640B;
            dVar2.f53626g = dVar.q(dVar2);
            p172r1.d dVar3 = eVar.f53642D;
            dVar3.f53626g = dVar.q(dVar3);
            dVar.f(eVar.f53640B.f53626g, i6);
            dVar.f(eVar.f53642D.f53626g, iP);
            eVar.f53683j = 2;
            eVar.k0(i6, iP);
        }
        if (fVar.f53651M[1] == bVar2 || eVar.f53651M[1] != r1.e.b.MATCH_PARENT) {
            return;
        }
        int i10 = eVar.f53641C.f53624e;
        int iV = fVar.v() - eVar.f53643E.f53624e;
        p172r1.d dVar4 = eVar.f53641C;
        dVar4.f53626g = dVar.q(dVar4);
        p172r1.d dVar5 = eVar.f53643E;
        dVar5.f53626g = dVar.q(dVar5);
        dVar.f(eVar.f53641C.f53626g, i10);
        dVar.f(eVar.f53643E.f53626g, iV);
        if (eVar.f53663Y > 0 || eVar.O() == 8) {
            p172r1.d dVar6 = eVar.f53644F;
            dVar6.f53626g = dVar.q(dVar6);
            dVar.f(eVar.f53644F.f53626g, eVar.f53663Y + i10);
        }
        eVar.f53685k = 2;
        eVar.z0(i10, iV);
    }

    public static final boolean b(int i6, int i10) {
        return (i6 & i10) == i10;
    }
}
