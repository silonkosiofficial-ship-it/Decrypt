package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HN {
    public static void a(android.media.MediaFormat mediaFormat, java.lang.String str, int i6) {
        if (i6 != -1) {
            mediaFormat.setInteger(str, i6);
        }
    }

    public static void b(android.media.MediaFormat mediaFormat, java.util.List list) {
        for (int i6 = 0; i6 < list.size(); i6++) {
            mediaFormat.setByteBuffer("csd-" + i6, java.nio.ByteBuffer.wrap((byte[]) list.get(i6)));
        }
    }
}
