package N0;

/* JADX INFO: renamed from: N0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1368f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N0.C1368f f7552a = new N0.C1368f();

    private C1368f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(p237x7.p pVar, android.graphics.RectF rectF, android.graphics.RectF rectF2) {
        return ((java.lang.Boolean) pVar.u(rectF, rectF2)).booleanValue();
    }

    public final int[] c(N0.l0 l0Var, android.graphics.RectF rectF, int i6, final p237x7.p pVar) {
        android.text.SegmentFinder segmentFinderA;
        if (i6 == 1) {
            segmentFinderA = O0.a.f7941a.a(new O0.j(l0Var.G(), l0Var.I()));
        } else {
            N0.AbstractC1364b.a();
            segmentFinderA = N0.AbstractC1365c.a(N0.AbstractC1363a.a(l0Var.G(), l0Var.H()));
        }
        return l0Var.i().getRangeForRect(rectF, segmentFinderA, new android.text.Layout.TextInclusionStrategy() { // from class: N0.e
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(android.graphics.RectF rectF2, android.graphics.RectF rectF3) {
                return N0.C1368f.b(pVar, rectF2, rectF3);
            }
        });
    }
}
