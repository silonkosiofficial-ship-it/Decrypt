package S0;

/* JADX INFO: renamed from: S0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1602j {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(char c6, char c10) {
        return java.lang.Character.isHighSurrogate(c6) && java.lang.Character.isLowSurrogate(c10);
    }
}
