package p019b9;

/* JADX INFO: loaded from: classes2.dex */
final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p127m7.i f24345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object[] f24346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W8.V0[] f24347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f24348d;

    public Q(p127m7.i iVar, int i6) {
        this.f24345a = iVar;
        this.f24346b = new java.lang.Object[i6];
        this.f24347c = new W8.V0[i6];
    }

    public final void a(W8.V0 v6, java.lang.Object obj) {
        java.lang.Object[] objArr = this.f24346b;
        int i6 = this.f24348d;
        objArr[i6] = obj;
        W8.V0[] v0Arr = this.f24347c;
        this.f24348d = i6 + 1;
        p247y7.AbstractC7350t.d(v6, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        v0Arr[i6] = v6;
    }

    public final void b(p127m7.i iVar) {
        int length = this.f24347c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i6 = length - 1;
            W8.V0 v6 = this.f24347c[length];
            p247y7.AbstractC7350t.c(v6);
            v6.c1(iVar, this.f24346b[length]);
            if (i6 < 0) {
                return;
            } else {
                length = i6;
            }
        }
    }
}
