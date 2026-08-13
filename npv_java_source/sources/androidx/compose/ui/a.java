package androidx.compose.ui;

/* JADX INFO: loaded from: classes.dex */
public final class a implements androidx.compose.ui.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.compose.ui.d f19580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.compose.ui.d f19581c;

    /* JADX INFO: renamed from: androidx.compose.ui.a$a, reason: collision with other inner class name */
    static final class C0375a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.a.C0375a f19582D = new androidx.compose.ui.a.C0375a();

        C0375a() {
            super(2);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.String u(java.lang.String str, androidx.compose.ui.d.b bVar) {
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public a(androidx.compose.ui.d dVar, androidx.compose.ui.d dVar2) {
        this.f19580b = dVar;
        this.f19581c = dVar2;
    }

    @Override // androidx.compose.ui.d
    public /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar) {
        return p071h0.f.a(this, dVar);
    }

    @Override // androidx.compose.ui.d
    public java.lang.Object c(java.lang.Object obj, p237x7.p pVar) {
        return this.f19581c.c(this.f19580b.c(obj, pVar), pVar);
    }

    @Override // androidx.compose.ui.d
    public boolean d(p237x7.l lVar) {
        return this.f19580b.d(lVar) && this.f19581c.d(lVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof androidx.compose.ui.a) {
            androidx.compose.ui.a aVar = (androidx.compose.ui.a) obj;
            if (p247y7.AbstractC7350t.b(this.f19580b, aVar.f19580b) && p247y7.AbstractC7350t.b(this.f19581c, aVar.f19581c)) {
                return true;
            }
        }
        return false;
    }

    public final androidx.compose.ui.d g() {
        return this.f19581c;
    }

    public int hashCode() {
        return this.f19580b.hashCode() + (this.f19581c.hashCode() * 31);
    }

    public final androidx.compose.ui.d j() {
        return this.f19580b;
    }

    public java.lang.String toString() {
        return '[' + ((java.lang.String) c("", androidx.compose.ui.a.C0375a.f19582D)) + ']';
    }
}
