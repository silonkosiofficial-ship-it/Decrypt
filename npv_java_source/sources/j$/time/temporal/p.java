package j$.time.temporal;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements j$.time.temporal.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47957b;

    public /* synthetic */ p(int i6, int i10) {
        this.f47956a = i10;
        this.f47957b = i6;
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m y(j$.time.temporal.m mVar) {
        switch (this.f47956a) {
            case 0:
                int iN = mVar.n(j$.time.temporal.a.DAY_OF_WEEK);
                int i6 = this.f47957b;
                if (iN == i6) {
                    return mVar;
                }
                int i10 = iN - i6;
                return mVar.d(i10 >= 0 ? 7 - i10 : -i10, j$.time.temporal.b.DAYS);
            default:
                int iN2 = mVar.n(j$.time.temporal.a.DAY_OF_WEEK);
                int i11 = this.f47957b;
                if (iN2 == i11) {
                    return mVar;
                }
                int i12 = i11 - iN2;
                return mVar.f(i12 >= 0 ? 7 - i12 : -i12, j$.time.temporal.b.DAYS);
        }
    }
}
