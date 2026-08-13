package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class FormatStyle {
    public static final j$.time.format.FormatStyle FULL;
    public static final j$.time.format.FormatStyle LONG;
    public static final j$.time.format.FormatStyle MEDIUM;
    public static final j$.time.format.FormatStyle SHORT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ j$.time.format.FormatStyle[] f47826a;

    static {
        j$.time.format.FormatStyle formatStyle = new j$.time.format.FormatStyle("FULL", 0);
        FULL = formatStyle;
        j$.time.format.FormatStyle formatStyle2 = new j$.time.format.FormatStyle("LONG", 1);
        LONG = formatStyle2;
        j$.time.format.FormatStyle formatStyle3 = new j$.time.format.FormatStyle("MEDIUM", 2);
        MEDIUM = formatStyle3;
        j$.time.format.FormatStyle formatStyle4 = new j$.time.format.FormatStyle("SHORT", 3);
        SHORT = formatStyle4;
        f47826a = new j$.time.format.FormatStyle[]{formatStyle, formatStyle2, formatStyle3, formatStyle4};
    }

    public static j$.time.format.FormatStyle valueOf(java.lang.String str) {
        return (j$.time.format.FormatStyle) java.lang.Enum.valueOf(j$.time.format.FormatStyle.class, str);
    }

    public static j$.time.format.FormatStyle[] values() {
        return (j$.time.format.FormatStyle[]) f47826a.clone();
    }
}
