package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public class C4 extends java.io.IOException {
    public C4(java.lang.String str) {
        super(str);
    }

    static com.google.android.gms.internal.measurement.F4 a() {
        return new com.google.android.gms.internal.measurement.F4("Protocol message tag had invalid wire type.");
    }

    static com.google.android.gms.internal.measurement.C4 b() {
        return new com.google.android.gms.internal.measurement.C4("Protocol message contained an invalid tag (zero).");
    }

    static com.google.android.gms.internal.measurement.C4 c() {
        return new com.google.android.gms.internal.measurement.C4("Protocol message had invalid UTF-8.");
    }

    static com.google.android.gms.internal.measurement.C4 d() {
        return new com.google.android.gms.internal.measurement.C4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static com.google.android.gms.internal.measurement.C4 e() {
        return new com.google.android.gms.internal.measurement.C4("Failed to parse the message.");
    }

    static com.google.android.gms.internal.measurement.C4 f() {
        return new com.google.android.gms.internal.measurement.C4("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static com.google.android.gms.internal.measurement.C4 g() {
        return new com.google.android.gms.internal.measurement.C4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
