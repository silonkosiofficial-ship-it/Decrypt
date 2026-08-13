package H;

/* JADX INFO: loaded from: classes.dex */
final class b0 implements S0.L {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S0.L f3861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3863d;

    public b0(S0.L l6, int i6, int i10) {
        this.f3861b = l6;
        this.f3862c = i6;
        this.f3863d = i10;
    }

    @Override // S0.L
    public int a(int i6) {
        int iA = this.f3861b.a(i6);
        if (i6 >= 0 && i6 <= this.f3863d) {
            H.c0.h(iA, this.f3862c, i6);
        }
        return iA;
    }

    @Override // S0.L
    public int b(int i6) {
        int iB = this.f3861b.b(i6);
        if (i6 >= 0 && i6 <= this.f3862c) {
            H.c0.g(iB, this.f3863d, i6);
        }
        return iB;
    }
}
