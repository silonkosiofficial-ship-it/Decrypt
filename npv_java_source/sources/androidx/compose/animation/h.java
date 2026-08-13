package androidx.compose.animation;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.animation.h.a f18804a = new androidx.compose.animation.h.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.compose.animation.h f18805b = new androidx.compose.animation.i(new p190t.C(null, null, null, null, false, null, 63, null));

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final androidx.compose.animation.h a() {
            return androidx.compose.animation.h.f18805b;
        }
    }

    private h() {
    }

    public /* synthetic */ h(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public abstract p190t.C b();

    public final androidx.compose.animation.h c(androidx.compose.animation.h hVar) {
        p190t.o oVarC = hVar.b().c();
        if (oVarC == null) {
            oVarC = b().c();
        }
        p190t.o oVar = oVarC;
        p190t.y yVarF = hVar.b().f();
        if (yVarF == null) {
            yVarF = b().f();
        }
        p190t.y yVar = yVarF;
        p190t.i iVarA = hVar.b().a();
        if (iVarA == null) {
            iVarA = b().a();
        }
        p190t.i iVar = iVarA;
        p190t.v vVarE = hVar.b().e();
        if (vVarE == null) {
            vVarE = b().e();
        }
        return new androidx.compose.animation.i(new p190t.C(oVar, yVar, iVar, vVarE, false, p097j7.S.n(b().b(), hVar.b().b()), 16, null));
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof androidx.compose.animation.h) && p247y7.AbstractC7350t.b(((androidx.compose.animation.h) obj).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public java.lang.String toString() {
        if (p247y7.AbstractC7350t.b(this, f18805b)) {
            return "EnterTransition.None";
        }
        p190t.C cB = b();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EnterTransition: \nFade - ");
        p190t.o oVarC = cB.c();
        sb.append(oVarC != null ? oVarC.toString() : null);
        sb.append(",\nSlide - ");
        p190t.y yVarF = cB.f();
        sb.append(yVarF != null ? yVarF.toString() : null);
        sb.append(",\nShrink - ");
        p190t.i iVarA = cB.a();
        sb.append(iVarA != null ? iVarA.toString() : null);
        sb.append(",\nScale - ");
        p190t.v vVarE = cB.e();
        sb.append(vVarE != null ? vVarE.toString() : null);
        return sb.toString();
    }
}
