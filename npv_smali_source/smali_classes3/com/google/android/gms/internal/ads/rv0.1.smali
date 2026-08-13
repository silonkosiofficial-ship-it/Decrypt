.class public abstract Lcom/google/android/gms/internal/ads/rv0;
.super Lcom/google/android/gms/internal/ads/Wu0;
.source "SourceFile"


# static fields
.field private static final b:Ljava/util/logging/Logger;

.field private static final c:Z


# instance fields
.field a:Lcom/google/android/gms/internal/ads/sv0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/rv0;->b:Ljava/util/logging/Logger;

    invoke-static {}, Lcom/google/android/gms/internal/ads/Sw0;->a()Z

    move-result v0

    sput-boolean v0, Lcom/google/android/gms/internal/ads/rv0;->c:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/qv0;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Wu0;-><init>()V

    return-void
.end method

.method static B(ILcom/google/android/gms/internal/ads/mw0;Lcom/google/android/gms/internal/ads/Ew0;)I
    .locals 0

    shl-int/lit8 p0, p0, 0x3

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/rv0;->e(I)I

    move-result p0

    add-int/2addr p0, p0

    check-cast p1, Lcom/google/android/gms/internal/ads/Ou0;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/Ou0;->f(Lcom/google/android/gms/internal/ads/Ew0;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method static b(Lcom/google/android/gms/internal/ads/mw0;Lcom/google/android/gms/internal/ads/Ew0;)I
    .locals 0

    check-cast p0, Lcom/google/android/gms/internal/ads/Ou0;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/Ou0;->f(Lcom/google/android/gms/internal/ads/Ew0;)I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/rv0;->e(I)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method static c(I)I
    .locals 1

    .prologue
    const/16 v0, 0x1000

    if-le p0, v0, :cond_0

    return v0

    :cond_0
    return p0
.end method

.method public static d(Ljava/lang/String;)I
    .locals 1

    .prologue
    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Xw0;->e(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/Ww0; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Tv0;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    array-length p0, p0

    :goto_0
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/rv0;->e(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method

.method public static e(I)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p0

    mul-int/lit8 p0, p0, 0x9

    rsub-int p0, p0, 0x160

    ushr-int/lit8 p0, p0, 0x6

    return p0
.end method

.method public static f(J)I
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result p0

    mul-int/lit8 p0, p0, 0x9

    rsub-int p0, p0, 0x280

    ushr-int/lit8 p0, p0, 0x6

    return p0
.end method

.method static bridge synthetic i()Z
    .locals 1

    sget-boolean v0, Lcom/google/android/gms/internal/ads/rv0;->c:Z

    return v0
.end method


# virtual methods
.method public abstract A(J)V
.end method

.method public abstract a([BII)V
.end method

.method public final g()V
    .locals 2

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/rv0;->n()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method final h(Ljava/lang/String;Lcom/google/android/gms/internal/ads/Ww0;)V
    .locals 6

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/rv0;->b:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v3, "inefficientWriteStringNoTag"

    const-string v4, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"

    const-string v2, "com.google.protobuf.CodedOutputStream"

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p2, Lcom/google/android/gms/internal/ads/Tv0;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    :try_start_0
    array-length p2, p1

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lcom/google/android/gms/internal/ads/rv0;->a([BII)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lcom/google/android/gms/internal/ads/ov0;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/ov0;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public abstract j()V
.end method

.method public abstract k(B)V
.end method

.method public abstract l(IZ)V
.end method

.method public abstract m(ILcom/google/android/gms/internal/ads/fv0;)V
.end method

.method public abstract n()I
.end method

.method public abstract o(II)V
.end method

.method public abstract p(I)V
.end method

.method public abstract q(IJ)V
.end method

.method public abstract r(J)V
.end method

.method public abstract s(II)V
.end method

.method public abstract t(I)V
.end method

.method abstract u(ILcom/google/android/gms/internal/ads/mw0;Lcom/google/android/gms/internal/ads/Ew0;)V
.end method

.method public abstract v(ILjava/lang/String;)V
.end method

.method public abstract w(II)V
.end method

.method public abstract x(II)V
.end method

.method public abstract y(I)V
.end method

.method public abstract z(IJ)V
.end method
