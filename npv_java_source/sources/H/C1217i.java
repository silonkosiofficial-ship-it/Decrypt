package H;

/* JADX INFO: renamed from: H.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1217i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Integer f4091a;

    public final java.lang.Integer a(android.view.KeyEvent keyEvent) {
        int iC = p231x0.d.c(keyEvent);
        if ((Integer.MIN_VALUE & iC) != 0) {
            this.f4091a = java.lang.Integer.valueOf(iC & Integer.MAX_VALUE);
            return null;
        }
        java.lang.Integer num = this.f4091a;
        if (num == null) {
            return java.lang.Integer.valueOf(iC);
        }
        this.f4091a = null;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(android.view.KeyCharacterMap.getDeadChar(num.intValue(), iC));
        java.lang.Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
        return num2 == null ? java.lang.Integer.valueOf(iC) : num2;
    }
}
