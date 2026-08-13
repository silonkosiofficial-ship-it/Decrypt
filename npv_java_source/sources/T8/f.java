package T8;

/* JADX INFO: loaded from: classes2.dex */
abstract class f extends T8.e {
    public static final T8.d d(char c6, boolean z6) {
        if (!z6) {
            if (c6 == 'D') {
                return T8.d.DAYS;
            }
            throw new java.lang.IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c6);
        }
        if (c6 == 'H') {
            return T8.d.HOURS;
        }
        if (c6 == 'M') {
            return T8.d.MINUTES;
        }
        if (c6 == 'S') {
            return T8.d.SECONDS;
        }
        throw new java.lang.IllegalArgumentException("Invalid duration ISO time unit: " + c6);
    }

    public static final T8.d e(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "shortName");
        int iHashCode = str.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && str.equals("us")) {
                                    return T8.d.MICROSECONDS;
                                }
                            } else if (str.equals("ns")) {
                                return T8.d.NANOSECONDS;
                            }
                        } else if (str.equals("ms")) {
                            return T8.d.MILLISECONDS;
                        }
                    } else if (str.equals("s")) {
                        return T8.d.SECONDS;
                    }
                } else if (str.equals("m")) {
                    return T8.d.MINUTES;
                }
            } else if (str.equals("h")) {
                return T8.d.HOURS;
            }
        } else if (str.equals("d")) {
            return T8.d.DAYS;
        }
        throw new java.lang.IllegalArgumentException("Unknown duration unit short name: " + str);
    }
}
