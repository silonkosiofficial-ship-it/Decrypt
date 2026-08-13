package E7;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends p097j7.O {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f2262C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f2263D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f2264E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f2265F;

    public h(int i6, int i10, int i11) {
        this.f2262C = i11;
        this.f2263D = i10;
        boolean z6 = false;
        if (i11 <= 0 ? i6 >= i10 : i6 <= i10) {
            z6 = true;
        }
        this.f2264E = z6;
        this.f2265F = z6 ? i6 : i10;
    }

    @Override // p097j7.O
    public int b() {
        int i6 = this.f2265F;
        if (i6 != this.f2263D) {
            this.f2265F = this.f2262C + i6;
        } else {
            if (!this.f2264E) {
                throw new java.util.NoSuchElementException();
            }
            this.f2264E = false;
        }
        return i6;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2264E;
    }
}
