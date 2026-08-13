.class public final Lcom/google/android/gms/internal/ads/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/t0;


# static fields
.field private static final p:[I

.field private static final q:[I

.field private static final r:[B

.field private static final s:[B


# instance fields
.field private final a:[B

.field private final b:Lcom/google/android/gms/internal/ads/a1;

.field private c:Z

.field private d:J

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:J

.field private j:Lcom/google/android/gms/internal/ads/w0;

.field private k:Lcom/google/android/gms/internal/ads/a1;

.field private l:Lcom/google/android/gms/internal/ads/a1;

.field private m:Lcom/google/android/gms/internal/ads/T0;

.field private n:J

.field private o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/16 v0, 0x10

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sput-object v1, Lcom/google/android/gms/internal/ads/i1;->p:[I

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/google/android/gms/internal/ads/i1;->q:[I

    sget v0, Lcom/google/android/gms/internal/ads/EW;->a:I

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "#!AMR\n"

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/ads/i1;->r:[B

    const-string v1, "#!AMR-WB\n"

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/i1;->s:[B

    return-void

    nop

    :array_0
    .array-data 4
        0xd
        0xe
        0x10
        0x12
        0x14
        0x15
        0x1b
        0x20
        0x6
        0x7
        0x6
        0x6
        0x1
        0x1
        0x1
        0x1
    .end array-data

    :array_1
    .array-data 4
        0x12
        0x18
        0x21
        0x25
        0x29
        0x2f
        0x33
        0x3b
        0x3d
        0x6
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
    .end array-data
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/i1;->a:[B

    const/4 p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/i1;->g:I

    new-instance p1, Lcom/google/android/gms/internal/ads/o0;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/o0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/i1;->b:Lcom/google/android/gms/internal/ads/a1;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/i1;->l:Lcom/google/android/gms/internal/ads/a1;

    return-void
.end method

.method private final a(Lcom/google/android/gms/internal/ads/u0;)I
    .locals 11

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/i1;->f:I

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_7

    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->j()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/i1;->a:[B

    invoke-interface {p1, v0, v3, v2}, Lcom/google/android/gms/internal/ads/u0;->N([BII)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/i1;->a:[B

    aget-byte v0, v0, v3

    and-int/lit16 v4, v0, 0x83

    const/4 v5, 0x0

    if-gtz v4, :cond_6

    shr-int/lit8 v0, v0, 0x3

    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/i1;->c:Z

    and-int/lit8 v0, v0, 0xf

    if-eqz v4, :cond_0

    const/16 v6, 0xa

    if-lt v0, v6, :cond_1

    const/16 v6, 0xd

    if-le v0, v6, :cond_0

    goto :goto_0

    :cond_0
    if-nez v4, :cond_4

    const/16 v6, 0xc

    if-lt v0, v6, :cond_1

    const/16 v6, 0xe

    if-gt v0, v6, :cond_1

    goto :goto_2

    :cond_1
    :goto_0
    if-eqz v4, :cond_2

    sget-object v4, Lcom/google/android/gms/internal/ads/i1;->q:[I

    aget v0, v4, v0

    goto :goto_1

    :cond_2
    sget-object v4, Lcom/google/android/gms/internal/ads/i1;->p:[I

    aget v0, v4, v0

    :goto_1
    iput v0, p0, Lcom/google/android/gms/internal/ads/i1;->e:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iput v0, p0, Lcom/google/android/gms/internal/ads/i1;->f:I

    iget v4, p0, Lcom/google/android/gms/internal/ads/i1;->g:I

    if-ne v4, v1, :cond_3

    iput v0, p0, Lcom/google/android/gms/internal/ads/i1;->g:I

    move v4, v0

    :cond_3
    if-ne v4, v0, :cond_7

    iget v4, p0, Lcom/google/android/gms/internal/ads/i1;->h:I

    add-int/2addr v4, v2

    iput v4, p0, Lcom/google/android/gms/internal/ads/i1;->h:I

    goto :goto_3

    :cond_4
    :goto_2
    :try_start_1
    const-string p1, "WB"

    const-string v3, "NB"

    if-eq v2, v4, :cond_5

    move-object p1, v3

    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Illegal AMR "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " frame type "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Lcom/google/android/gms/internal/ads/of;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/of;

    move-result-object p1

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid padding bits for frame header "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Lcom/google/android/gms/internal/ads/of;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/of;

    move-result-object p1

    throw p1
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return v1

    :cond_7
    :goto_3
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/i1;->l:Lcom/google/android/gms/internal/ads/a1;

    invoke-interface {v4, p1, v0, v2}, Lcom/google/android/gms/internal/ads/a1;->e(Lcom/google/android/gms/internal/ads/qB0;IZ)I

    move-result p1

    if-ne p1, v1, :cond_8

    return v1

    :cond_8
    iget v0, p0, Lcom/google/android/gms/internal/ads/i1;->f:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/google/android/gms/internal/ads/i1;->f:I

    if-lez v0, :cond_9

    return v3

    :cond_9
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/i1;->l:Lcom/google/android/gms/internal/ads/a1;

    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/i1;->d:J

    iget v8, p0, Lcom/google/android/gms/internal/ads/i1;->e:I

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v7, 0x1

    invoke-interface/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/a1;->b(JIIILcom/google/android/gms/internal/ads/Z0;)V

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/i1;->d:J

    const-wide/16 v4, 0x4e20

    add-long/2addr v0, v4

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/i1;->d:J

    return v3
.end method

.method private static b(Lcom/google/android/gms/internal/ads/u0;[B)Z
    .locals 3

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/u0;->j()V

    array-length v0, p1

    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-interface {p0, v1, v2, v0}, Lcom/google/android/gms/internal/ads/u0;->N([BII)V

    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    return p0
.end method

.method private final d(Lcom/google/android/gms/internal/ads/u0;)Z
    .locals 4

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/i1;->r:[B

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/i1;->b(Lcom/google/android/gms/internal/ads/u0;[B)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/i1;->c:Z

    array-length v0, v0

    :goto_0
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/u0;->I(I)V

    return v3

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/i1;->s:[B

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/i1;->b(Lcom/google/android/gms/internal/ads/u0;[B)Z

    move-result v1

    if-eqz v1, :cond_1

    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/i1;->c:Z

    array-length v0, v0

    goto :goto_0

    :cond_1
    return v2
.end method


# virtual methods
.method public final synthetic c()Lcom/google/android/gms/internal/ads/t0;
    .locals 0

    return-object p0
.end method

.method public final e(JJ)V
    .locals 1

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/i1;->d:J

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/i1;->e:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/i1;->f:I

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/i1;->n:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/i1;->i:J

    return-void
.end method

.method public final synthetic f()Ljava/util/List;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v0

    return-object v0
.end method

.method public final i(Lcom/google/android/gms/internal/ads/u0;Lcom/google/android/gms/internal/ads/Q0;)I
    .locals 7

    .prologue
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/i1;->k:Lcom/google/android/gms/internal/ads/a1;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    sget p2, Lcom/google/android/gms/internal/ads/EW;->a:I

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-nez p2, :cond_1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/i1;->d(Lcom/google/android/gms/internal/ads/u0;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Could not find AMR header."

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/of;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/of;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/i1;->o:Z

    if-nez p2, :cond_5

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/i1;->o:Z

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/i1;->c:Z

    if-eq p2, v0, :cond_2

    const-string v1, "audio/3gpp"

    goto :goto_1

    :cond_2
    const-string v1, "audio/amr-wb"

    :goto_1
    if-eq p2, v0, :cond_3

    const/16 v4, 0x1f40

    goto :goto_2

    :cond_3
    const/16 v4, 0x3e80

    :goto_2
    if-eqz v0, :cond_4

    sget-object v0, Lcom/google/android/gms/internal/ads/i1;->q:[I

    const/16 v5, 0x8

    aget v0, v0, v5

    goto :goto_3

    :cond_4
    sget-object v0, Lcom/google/android/gms/internal/ads/i1;->p:[I

    const/4 v5, 0x7

    aget v0, v0, v5

    :goto_3
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/i1;->l:Lcom/google/android/gms/internal/ads/a1;

    new-instance v6, Lcom/google/android/gms/internal/ads/oK0;

    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/oK0;-><init>()V

    invoke-virtual {v6, v1}, Lcom/google/android/gms/internal/ads/oK0;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/ads/oK0;->r(I)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v6, p2}, Lcom/google/android/gms/internal/ads/oK0;->r0(I)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/ads/oK0;->C(I)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object p2

    invoke-interface {v5, p2}, Lcom/google/android/gms/internal/ads/a1;->c(Lcom/google/android/gms/internal/ads/D;)V

    :cond_5
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/i1;->a(Lcom/google/android/gms/internal/ads/u0;)I

    move-result p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/i1;->m:Lcom/google/android/gms/internal/ads/T0;

    if-eqz p2, :cond_6

    goto :goto_4

    :cond_6
    new-instance p2, Lcom/google/android/gms/internal/ads/S0;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {p2, v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/S0;-><init>(JJ)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/i1;->m:Lcom/google/android/gms/internal/ads/T0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/i1;->j:Lcom/google/android/gms/internal/ads/w0;

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/ads/w0;->R(Lcom/google/android/gms/internal/ads/T0;)V

    :goto_4
    const/4 p2, -0x1

    if-ne p1, p2, :cond_7

    return p2

    :cond_7
    const/4 p1, 0x0

    return p1
.end method

.method public final j(Lcom/google/android/gms/internal/ads/u0;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/i1;->d(Lcom/google/android/gms/internal/ads/u0;)Z

    move-result p1

    return p1
.end method

.method public final k(Lcom/google/android/gms/internal/ads/w0;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/i1;->j:Lcom/google/android/gms/internal/ads/w0;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/w0;->S(II)Lcom/google/android/gms/internal/ads/a1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/i1;->k:Lcom/google/android/gms/internal/ads/a1;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/i1;->l:Lcom/google/android/gms/internal/ads/a1;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/w0;->Q()V

    return-void
.end method
