package U0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void a(M0.C1338j c1338j, p141o0.InterfaceC6993q0 interfaceC6993q0, p141o0.AbstractC6984n0 abstractC6984n0, float f6, p141o0.c2 c2Var, X0.k kVar, p161q0.h hVar, int i6) {
        interfaceC6993q0.m();
        if (c1338j.w().size() <= 1 || (abstractC6984n0 instanceof p141o0.f2)) {
            b(c1338j, interfaceC6993q0, abstractC6984n0, f6, c2Var, kVar, hVar, i6);
        } else if (abstractC6984n0 instanceof p141o0.a2) {
            java.util.List listW = c1338j.w();
            int size = listW.size();
            float fMax = 0.0f;
            float height = 0.0f;
            for (int i10 = 0; i10 < size; i10++) {
                M0.C1345q c1345q = (M0.C1345q) listW.get(i10);
                height += c1345q.e().getHeight();
                fMax = java.lang.Math.max(fMax, c1345q.e().getWidth());
            }
            android.graphics.Shader shaderB = ((p141o0.a2) abstractC6984n0).b(p131n0.n.a(fMax, height));
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            shaderB.getLocalMatrix(matrix);
            java.util.List listW2 = c1338j.w();
            int size2 = listW2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                M0.C1345q c1345q2 = (M0.C1345q) listW2.get(i11);
                c1345q2.e().n(interfaceC6993q0, p141o0.AbstractC6987o0.a(shaderB), f6, c2Var, kVar, hVar, i6);
                interfaceC6993q0.d(0.0f, c1345q2.e().getHeight());
                matrix.setTranslate(0.0f, -c1345q2.e().getHeight());
                shaderB.setLocalMatrix(matrix);
            }
        }
        interfaceC6993q0.s();
    }

    private static final void b(M0.C1338j c1338j, p141o0.InterfaceC6993q0 interfaceC6993q0, p141o0.AbstractC6984n0 abstractC6984n0, float f6, p141o0.c2 c2Var, X0.k kVar, p161q0.h hVar, int i6) {
        java.util.List listW = c1338j.w();
        int size = listW.size();
        for (int i10 = 0; i10 < size; i10++) {
            M0.C1345q c1345q = (M0.C1345q) listW.get(i10);
            c1345q.e().n(interfaceC6993q0, abstractC6984n0, f6, c2Var, kVar, hVar, i6);
            interfaceC6993q0.d(0.0f, c1345q.e().getHeight());
        }
    }
}
