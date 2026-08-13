package H;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {
    public static final int a(java.lang.String str, int i6) {
        androidx.emoji2.text.f fVarC = c();
        java.lang.Integer num = null;
        if (fVarC != null) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(fVarC.d(str, i6));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i6);
    }

    public static final int b(java.lang.String str, int i6) {
        androidx.emoji2.text.f fVarC = c();
        java.lang.Integer num = null;
        if (fVarC != null) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(fVarC.f(str, java.lang.Math.max(0, i6 - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i6);
    }

    private static final androidx.emoji2.text.f c() {
        if (!androidx.emoji2.text.f.k()) {
            return null;
        }
        androidx.emoji2.text.f fVarC = androidx.emoji2.text.f.c();
        if (fVarC.g() == 1) {
            return fVarC;
        }
        return null;
    }
}
