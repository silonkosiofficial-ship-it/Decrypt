package androidx.compose.animation;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.animation.j.a f18807a = new androidx.compose.animation.j.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.compose.animation.j f18808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final androidx.compose.animation.j f18809c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final androidx.compose.animation.j a() {
            return androidx.compose.animation.j.f18808b;
        }
    }

    static {
        p247y7.AbstractC7342k abstractC7342k = null;
        p190t.o oVar = null;
        p190t.y yVar = null;
        p190t.i iVar = null;
        p190t.v vVar = null;
        java.util.Map map = null;
        f18808b = new androidx.compose.animation.k(new p190t.C(oVar, yVar, iVar, vVar, false, map, 63, abstractC7342k));
        f18809c = new androidx.compose.animation.k(new p190t.C(oVar, yVar, iVar, vVar, true, map, 47, abstractC7342k));
    }

    private j() {
    }

    public /* synthetic */ j(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public abstract p190t.C b();

    public final androidx.compose.animation.j c(androidx.compose.animation.j jVar) {
        p190t.o oVarC = jVar.b().c();
        if (oVarC == null) {
            oVarC = b().c();
        }
        p190t.o oVar = oVarC;
        p190t.y yVarF = jVar.b().f();
        if (yVarF == null) {
            yVarF = b().f();
        }
        p190t.y yVar = yVarF;
        p190t.i iVarA = jVar.b().a();
        if (iVarA == null) {
            iVarA = b().a();
        }
        p190t.i iVar = iVarA;
        p190t.v vVarE = jVar.b().e();
        if (vVarE == null) {
            vVarE = b().e();
        }
        return new androidx.compose.animation.k(new p190t.C(oVar, yVar, iVar, vVarE, jVar.b().d() || b().d(), p097j7.S.n(b().b(), jVar.b().b())));
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof androidx.compose.animation.j) && p247y7.AbstractC7350t.b(((androidx.compose.animation.j) obj).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public java.lang.String toString() {
        if (p247y7.AbstractC7350t.b(this, f18808b)) {
            return "ExitTransition.None";
        }
        if (p247y7.AbstractC7350t.b(this, f18809c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        p190t.C cB = b();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExitTransition: \nFade - ");
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(cB.d());
        return sb.toString();
    }
}
