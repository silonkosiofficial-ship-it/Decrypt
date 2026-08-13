package R9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(java.util.logging.LogRecord logRecord) {
        int iIntValue = logRecord.getLevel().intValue();
        java.util.logging.Level level = java.util.logging.Level.INFO;
        if (iIntValue > level.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
    }
}
