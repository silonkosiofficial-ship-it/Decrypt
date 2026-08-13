package V;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final V.B1 f15053a = new V.B1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final V.B1 f15054b = new V.B1();

    public static final X.b b() {
        V.B1 b6 = f15054b;
        X.b bVar = (X.b) b6.a();
        if (bVar != null) {
            return bVar;
        }
        X.b bVar2 = new X.b(new V.K[0], 0);
        b6.b(bVar2);
        return bVar2;
    }

    public static final V.G1 c(V.u1 u1Var, p237x7.a aVar) {
        return new V.I(aVar, u1Var);
    }

    public static final V.G1 d(p237x7.a aVar) {
        return new V.I(aVar, null);
    }
}
