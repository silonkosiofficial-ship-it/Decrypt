package S8;

/* JADX INFO: renamed from: S8.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1636i implements java.util.Iterator, p256z7.a {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final S8.C1636i.a f12670H = new S8.C1636i.a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.CharSequence f12671C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f12672D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f12673E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f12674F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f12675G;

    /* JADX INFO: renamed from: S8.i$a */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public C1636i(java.lang.CharSequence charSequence) {
        p247y7.AbstractC7350t.f(charSequence, "string");
        this.f12671C = charSequence;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.lang.String next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.f12672D = 0;
        int i6 = this.f12674F;
        int i10 = this.f12673E;
        this.f12673E = this.f12675G + i6;
        return this.f12671C.subSequence(i10, i6).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i6;
        int i10;
        int i11 = this.f12672D;
        if (i11 != 0) {
            return i11 == 1;
        }
        if (this.f12675G < 0) {
            this.f12672D = 2;
            return false;
        }
        int length = this.f12671C.length();
        int length2 = this.f12671C.length();
        for (int i12 = this.f12673E; i12 < length2; i12++) {
            char cCharAt = this.f12671C.charAt(i12);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i6 = (cCharAt == '\r' && (i10 = i12 + 1) < this.f12671C.length() && this.f12671C.charAt(i10) == '\n') ? 2 : 1;
                length = i12;
                this.f12672D = 1;
                this.f12675G = i6;
                this.f12674F = length;
                return true;
            }
        }
        i6 = -1;
        this.f12672D = 1;
        this.f12675G = i6;
        this.f12674F = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
