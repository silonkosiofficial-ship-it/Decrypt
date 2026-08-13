package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public enum H7 {
    DEBUG(3),
    ERROR(6),
    INFO(4),
    VERBOSE(2),
    WARN(5);

    H7(int i6) {
    }

    public static com.google.android.gms.internal.measurement.H7 e(int i6) {
        if (i6 == 2) {
            return VERBOSE;
        }
        if (i6 == 3) {
            return DEBUG;
        }
        if (i6 != 5) {
            return i6 != 6 ? INFO : ERROR;
        }
        return WARN;
    }
}
