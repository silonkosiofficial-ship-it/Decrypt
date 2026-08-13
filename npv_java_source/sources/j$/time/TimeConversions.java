package j$.time;

/* JADX INFO: loaded from: classes4.dex */
public class TimeConversions {
    public static j$.time.Duration convert(java.time.Duration duration) {
        if (duration == null) {
            return null;
        }
        return j$.time.Duration.y(duration.getSeconds(), duration.getNano());
    }

    public static java.time.Duration convert(j$.time.Duration duration) {
        if (duration == null) {
            return null;
        }
        return java.time.Duration.ofSeconds(duration.u(), duration.q());
    }
}
