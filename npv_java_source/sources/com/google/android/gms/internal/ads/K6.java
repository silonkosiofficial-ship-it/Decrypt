package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class K6 {
    public static long a(java.nio.ByteBuffer byteBuffer) {
        g(byteBuffer);
        return e(byteBuffer, byteBuffer.position() + 16);
    }

    public static long b(java.nio.ByteBuffer byteBuffer) {
        g(byteBuffer);
        return e(byteBuffer, byteBuffer.position() + 12);
    }

    static android.util.Pair c(java.io.RandomAccessFile randomAccessFile) throws java.io.IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        android.util.Pair pairF = f(randomAccessFile, 0);
        return pairF != null ? pairF : f(randomAccessFile, 65535);
    }

    public static void d(java.nio.ByteBuffer byteBuffer, long j6) {
        g(byteBuffer);
        int iPosition = byteBuffer.position() + 16;
        if (j6 >= 0 && j6 <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + iPosition, (int) j6);
            return;
        }
        throw new java.lang.IllegalArgumentException("uint32 value of out range: " + j6);
    }

    private static long e(java.nio.ByteBuffer byteBuffer, int i6) {
        return ((long) byteBuffer.getInt(i6)) & 4294967295L;
    }

    private static android.util.Pair f(java.io.RandomAccessFile randomAccessFile, int i6) throws java.io.IOException {
        int i10;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(((int) java.lang.Math.min(i6, (-22) + length)) + 22);
        byteBufferAllocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        g(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity >= 22) {
            int i11 = iCapacity - 22;
            int iMin = java.lang.Math.min(i11, 65535);
            int i12 = 0;
            while (true) {
                if (i12 >= iMin) {
                    i10 = -1;
                    break;
                }
                i10 = i11 - i12;
                if (byteBufferAllocate.getInt(i10) == 101010256 && ((char) byteBufferAllocate.getShort(i10 + 20)) == i12) {
                    break;
                }
                i12++;
            }
        } else {
            i10 = -1;
            break;
        }
        if (i10 == -1) {
            return null;
        }
        byteBufferAllocate.position(i10);
        java.nio.ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return android.util.Pair.create(byteBufferSlice, java.lang.Long.valueOf(jCapacity + ((long) i10)));
    }

    private static void g(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.order() != java.nio.ByteOrder.LITTLE_ENDIAN) {
            throw new java.lang.IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
