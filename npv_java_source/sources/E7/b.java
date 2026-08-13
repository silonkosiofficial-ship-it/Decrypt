package E7;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends p097j7.AbstractC6878u {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f2250C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f2251D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f2252E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f2253F;

    public b(char c6, char c10, int i6) {
        this.f2250C = i6;
        this.f2251D = c10;
        boolean z6 = false;
        if (i6 <= 0 ? p247y7.AbstractC7350t.g(c6, c10) >= 0 : p247y7.AbstractC7350t.g(c6, c10) <= 0) {
            z6 = true;
        }
        this.f2252E = z6;
        this.f2253F = z6 ? c6 : c10;
    }

    @Override // p097j7.AbstractC6878u
    public char b() {
        int i6 = this.f2253F;
        if (i6 != this.f2251D) {
            this.f2253F = this.f2250C + i6;
        } else {
            if (!this.f2252E) {
                throw new java.util.NoSuchElementException();
            }
            this.f2252E = false;
        }
        return (char) i6;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2252E;
    }
}
