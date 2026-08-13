package H;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {
    public static final boolean a(android.view.KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !java.lang.Character.isISOControl(keyEvent.getUnicodeChar());
    }
}
