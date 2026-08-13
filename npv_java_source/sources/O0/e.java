package O0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends O0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.CharSequence f7945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.text.BreakIterator f7946b;

    public e(java.lang.CharSequence charSequence) {
        this.f7945a = charSequence;
        java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f7946b = characterInstance;
    }

    @Override // O0.b
    public int e(int i6) {
        return this.f7946b.following(i6);
    }

    @Override // O0.b
    public int f(int i6) {
        return this.f7946b.preceding(i6);
    }
}
