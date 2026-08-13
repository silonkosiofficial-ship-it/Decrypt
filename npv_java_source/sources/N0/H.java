package N0;

/* JADX INFO: loaded from: classes.dex */
public final class H implements java.text.CharacterIterator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.CharSequence f7521C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f7522D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f7523E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f7524F;

    public H(java.lang.CharSequence charSequence, int i6, int i10) {
        this.f7521C = charSequence;
        this.f7522D = i6;
        this.f7523E = i10;
        this.f7524F = i6;
    }

    @Override // java.text.CharacterIterator
    public java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            throw new java.lang.InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i6 = this.f7524F;
        if (i6 == this.f7523E) {
            return (char) 65535;
        }
        return this.f7521C.charAt(i6);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.f7524F = this.f7522D;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f7522D;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f7523E;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.f7524F;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i6 = this.f7522D;
        int i10 = this.f7523E;
        if (i6 == i10) {
            this.f7524F = i10;
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f7524F = i11;
        return this.f7521C.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i6 = this.f7524F + 1;
        this.f7524F = i6;
        int i10 = this.f7523E;
        if (i6 < i10) {
            return this.f7521C.charAt(i6);
        }
        this.f7524F = i10;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i6 = this.f7524F;
        if (i6 <= this.f7522D) {
            return (char) 65535;
        }
        int i10 = i6 - 1;
        this.f7524F = i10;
        return this.f7521C.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i6) {
        int i10 = this.f7522D;
        if (i6 > this.f7523E || i10 > i6) {
            throw new java.lang.IllegalArgumentException("invalid position");
        }
        this.f7524F = i6;
        return current();
    }
}
