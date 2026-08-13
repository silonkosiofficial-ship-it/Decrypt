package O0;

/* JADX INFO: loaded from: classes.dex */
public final class j implements O0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.CharSequence f7953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O0.i f7954b;

    public j(java.lang.CharSequence charSequence, O0.i iVar) {
        this.f7953a = charSequence;
        this.f7954b = iVar;
    }

    @Override // O0.f
    public int a(int i6) {
        do {
            i6 = this.f7954b.n(i6);
            if (i6 == -1 || i6 == this.f7953a.length()) {
                return -1;
            }
        } while (java.lang.Character.isWhitespace(this.f7953a.charAt(i6)));
        return i6;
    }

    @Override // O0.f
    public int b(int i6) {
        do {
            i6 = this.f7954b.o(i6);
            if (i6 == -1 || i6 == 0) {
                return -1;
            }
        } while (java.lang.Character.isWhitespace(this.f7953a.charAt(i6 - 1)));
        return i6;
    }

    @Override // O0.f
    public int c(int i6) {
        do {
            i6 = this.f7954b.o(i6);
            if (i6 == -1) {
                return -1;
            }
        } while (java.lang.Character.isWhitespace(this.f7953a.charAt(i6)));
        return i6;
    }

    @Override // O0.f
    public int d(int i6) {
        do {
            i6 = this.f7954b.n(i6);
            if (i6 == -1) {
                return -1;
            }
        } while (java.lang.Character.isWhitespace(this.f7953a.charAt(i6 - 1)));
        return i6;
    }
}
