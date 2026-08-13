package S8;

/* JADX INFO: renamed from: S8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1632e implements R8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.CharSequence f12630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p237x7.p f12633d;

    /* JADX INFO: renamed from: S8.e$a */
    public static final class a implements java.util.Iterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private int f12634C = -1;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f12635D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private int f12636E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private E7.i f12637F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private int f12638G;

        a() {
            int iK = E7.j.k(S8.C1632e.this.f12631b, 0, S8.C1632e.this.f12630a.length());
            this.f12635D = iK;
            this.f12636E = iK;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0031 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:19:0x0094  */
        /* JADX WARN: Code duplicated, block: B:9:0x0023  */
        private final void b() {
            p087i7.u uVar;
            E7.i iVar;
            if (this.f12636E < 0) {
                this.f12634C = 0;
                this.f12637F = null;
                return;
            }
            int i6 = -1;
            if (S8.C1632e.this.f12632c > 0) {
                int i10 = this.f12638G + 1;
                this.f12638G = i10;
                if (i10 >= S8.C1632e.this.f12632c) {
                    iVar = new E7.i(this.f12635D, S8.r.j0(S8.C1632e.this.f12630a));
                    this.f12637F = iVar;
                } else if (this.f12636E > S8.C1632e.this.f12630a.length() && (uVar = (p087i7.u) S8.C1632e.this.f12633d.u(S8.C1632e.this.f12630a, java.lang.Integer.valueOf(this.f12636E))) != null) {
                    int iIntValue = ((java.lang.Number) uVar.a()).intValue();
                    int iIntValue2 = ((java.lang.Number) uVar.b()).intValue();
                    this.f12637F = E7.j.q(this.f12635D, iIntValue);
                    int i11 = iIntValue + iIntValue2;
                    this.f12635D = i11;
                    i6 = i11 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    iVar = new E7.i(this.f12635D, S8.r.j0(S8.C1632e.this.f12630a));
                    this.f12637F = iVar;
                }
            } else {
                if (this.f12636E > S8.C1632e.this.f12630a.length()) {
                    iVar = new E7.i(this.f12635D, S8.r.j0(S8.C1632e.this.f12630a));
                } else {
                    int iIntValue3 = ((java.lang.Number) uVar.a()).intValue();
                    int iIntValue4 = ((java.lang.Number) uVar.b()).intValue();
                    this.f12637F = E7.j.q(this.f12635D, iIntValue3);
                    int i12 = iIntValue3 + iIntValue4;
                    this.f12635D = i12;
                    i6 = i12 + (iIntValue4 == 0 ? 1 : 0);
                }
                this.f12637F = iVar;
            }
            this.f12636E = i6;
            this.f12634C = 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public E7.i next() {
            if (this.f12634C == -1) {
                b();
            }
            if (this.f12634C == 0) {
                throw new java.util.NoSuchElementException();
            }
            E7.i iVar = this.f12637F;
            p247y7.AbstractC7350t.d(iVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f12637F = null;
            this.f12634C = -1;
            return iVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12634C == -1) {
                b();
            }
            return this.f12634C == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1632e(java.lang.CharSequence charSequence, int i6, int i10, p237x7.p pVar) {
        p247y7.AbstractC7350t.f(charSequence, "input");
        p247y7.AbstractC7350t.f(pVar, "getNextMatch");
        this.f12630a = charSequence;
        this.f12631b = i6;
        this.f12632c = i10;
        this.f12633d = pVar;
    }

    @Override // R8.h
    public java.util.Iterator iterator() {
        return new S8.C1632e.a();
    }
}
