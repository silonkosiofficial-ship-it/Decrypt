.class final Lcom/google/android/gms/internal/ads/A3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/gms/internal/ads/a1;

.field public final b:Lcom/google/android/gms/internal/ads/P3;

.field public final c:Lcom/google/android/gms/internal/ads/sR;

.field public d:Lcom/google/android/gms/internal/ads/Q3;

.field public e:Lcom/google/android/gms/internal/ads/w3;

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field private final j:Lcom/google/android/gms/internal/ads/sR;

.field private final k:Lcom/google/android/gms/internal/ads/sR;

.field private l:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/a1;Lcom/google/android/gms/internal/ads/Q3;Lcom/google/android/gms/internal/ads/w3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/A3;->a:Lcom/google/android/gms/internal/ads/a1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/A3;->d:Lcom/google/android/gms/internal/ads/Q3;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/A3;->e:Lcom/google/android/gms/internal/ads/w3;

    new-instance p1, Lcom/google/android/gms/internal/ads/P3;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/P3;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    new-instance p1, Lcom/google/android/gms/internal/ads/sR;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/sR;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/A3;->c:Lcom/google/android/gms/internal/ads/sR;

    new-instance p1, Lcom/google/android/gms/internal/ads/sR;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/A3;->j:Lcom/google/android/gms/internal/ads/sR;

    new-instance p1, Lcom/google/android/gms/internal/ads/sR;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/sR;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/A3;->k:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/ads/A3;->h(Lcom/google/android/gms/internal/ads/Q3;Lcom/google/android/gms/internal/ads/w3;)V

    return-void
.end method

.method static bridge synthetic g(Lcom/google/android/gms/internal/ads/A3;Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/A3;->l:Z

    return-void
.end method

.method static bridge synthetic j(Lcom/google/android/gms/internal/ads/A3;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/internal/ads/A3;->l:Z

    return p0
.end method


# virtual methods
.method public final a()I
    .locals 2

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/A3;->l:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/A3;->d:Lcom/google/android/gms/internal/ads/Q3;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Q3;->g:[I

    iget v1, p0, Lcom/google/android/gms/internal/ads/A3;->f:I

    aget v0, v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/P3;->j:[Z

    iget v1, p0, Lcom/google/android/gms/internal/ads/A3;->f:I

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/A3;->f()Lcom/google/android/gms/internal/ads/O3;

    move-result-object v1

    if-eqz v1, :cond_2

    const/high16 v1, 0x40000000    # 2.0f

    or-int/2addr v0, v1

    :cond_2
    return v0
.end method

.method public final b()I
    .locals 2

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/A3;->l:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/A3;->d:Lcom/google/android/gms/internal/ads/Q3;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Q3;->d:[I

    iget v1, p0, Lcom/google/android/gms/internal/ads/A3;->f:I

    aget v0, v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/P3;->h:[I

    iget v1, p0, Lcom/google/android/gms/internal/ads/A3;->f:I

    aget v0, v0, v1

    :goto_0
    return v0
.end method

.method public final c(II)I
    .locals 10

    .prologue
    const/16 v0, 0x8

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/A3;->f()Lcom/google/android/gms/internal/ads/O3;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    iget v3, v1, Lcom/google/android/gms/internal/ads/O3;->d:I

    if-eqz v3, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/P3;->n:Lcom/google/android/gms/internal/ads/sR;

    goto :goto_0

    :cond_1
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/O3;->e:[B

    sget v3, Lcom/google/android/gms/internal/ads/EW;->a:I

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/A3;->k:Lcom/google/android/gms/internal/ads/sR;

    array-length v4, v1

    invoke-virtual {v3, v1, v4}, Lcom/google/android/gms/internal/ads/sR;->j([BI)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/A3;->k:Lcom/google/android/gms/internal/ads/sR;

    move v3, v4

    :goto_0
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    iget v5, p0, Lcom/google/android/gms/internal/ads/A3;->f:I

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/P3;->b(I)Z

    move-result v4

    const/4 v5, 0x1

    if-nez v4, :cond_2

    if-eqz p2, :cond_3

    :cond_2
    move v6, v5

    goto :goto_1

    :cond_3
    move v6, v2

    :goto_1
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/A3;->j:Lcom/google/android/gms/internal/ads/sR;

    if-eq v5, v6, :cond_4

    move v8, v2

    goto :goto_2

    :cond_4
    const/16 v8, 0x80

    :goto_2
    or-int/2addr v8, v3

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v9

    int-to-byte v8, v8

    aput-byte v8, v9, v2

    invoke-virtual {v7, v2}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/A3;->a:Lcom/google/android/gms/internal/ads/a1;

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/A3;->j:Lcom/google/android/gms/internal/ads/sR;

    invoke-interface {v7, v8, v5, v5}, Lcom/google/android/gms/internal/ads/a1;->g(Lcom/google/android/gms/internal/ads/sR;II)V

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/A3;->a:Lcom/google/android/gms/internal/ads/a1;

    invoke-interface {v7, v1, v3, v5}, Lcom/google/android/gms/internal/ads/a1;->g(Lcom/google/android/gms/internal/ads/sR;II)V

    if-nez v6, :cond_5

    add-int/2addr v3, v5

    return v3

    :cond_5
    const/4 v1, 0x6

    const/4 v6, 0x3

    const/4 v7, 0x2

    if-nez v4, :cond_6

    int-to-byte p2, p2

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/A3;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/ads/sR;->i(I)V

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/A3;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v8

    aput-byte v2, v8, v2

    aput-byte v5, v8, v5

    aput-byte v2, v8, v7

    aput-byte p2, v8, v6

    shr-int/lit8 p2, p1, 0x18

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    const/4 v2, 0x4

    aput-byte p2, v8, v2

    shr-int/lit8 p2, p1, 0x10

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    const/4 v2, 0x5

    aput-byte p2, v8, v2

    shr-int/lit8 p2, p1, 0x8

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    aput-byte p2, v8, v1

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    const/4 p2, 0x7

    aput-byte p1, v8, p2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/A3;->a:Lcom/google/android/gms/internal/ads/a1;

    invoke-interface {p1, v4, v0, v5}, Lcom/google/android/gms/internal/ads/a1;->g(Lcom/google/android/gms/internal/ads/sR;II)V

    add-int/lit8 v3, v3, 0x9

    return v3

    :cond_6
    add-int/2addr v3, v5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/P3;->n:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->G()I

    move-result v4

    const/4 v8, -0x2

    invoke-virtual {p1, v8}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    mul-int/2addr v4, v1

    add-int/2addr v4, v7

    if-eqz p2, :cond_7

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/A3;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/ads/sR;->i(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/A3;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v1

    invoke-virtual {p1, v1, v2, v4}, Lcom/google/android/gms/internal/ads/sR;->h([BII)V

    aget-byte p1, v1, v7

    and-int/lit16 p1, p1, 0xff

    shl-int/2addr p1, v0

    aget-byte v2, v1, v6

    and-int/lit16 v2, v2, 0xff

    or-int/2addr p1, v2

    add-int/2addr p1, p2

    shr-int/lit8 p2, p1, 0x8

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    aput-byte p2, v1, v7

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v1, v6

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/A3;->c:Lcom/google/android/gms/internal/ads/sR;

    :cond_7
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/A3;->a:Lcom/google/android/gms/internal/ads/a1;

    invoke-interface {p2, p1, v4, v5}, Lcom/google/android/gms/internal/ads/a1;->g(Lcom/google/android/gms/internal/ads/sR;II)V

    add-int/2addr v3, v4

    return v3
.end method

.method public final d()J
    .locals 3

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/A3;->l:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/A3;->d:Lcom/google/android/gms/internal/ads/Q3;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Q3;->c:[J

    iget v1, p0, Lcom/google/android/gms/internal/ads/A3;->f:I

    aget-wide v1, v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/P3;->f:[J

    iget v1, p0, Lcom/google/android/gms/internal/ads/A3;->h:I

    aget-wide v1, v0, v1

    :goto_0
    return-wide v1
.end method

.method public final e()J
    .locals 3

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/A3;->l:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/A3;->d:Lcom/google/android/gms/internal/ads/Q3;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Q3;->f:[J

    iget v1, p0, Lcom/google/android/gms/internal/ads/A3;->f:I

    aget-wide v1, v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    iget v1, p0, Lcom/google/android/gms/internal/ads/A3;->f:I

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/P3;->i:[J

    aget-wide v1, v0, v1

    :goto_0
    return-wide v1
.end method

.method public final f()Lcom/google/android/gms/internal/ads/O3;
    .locals 4

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/A3;->l:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/P3;->a:Lcom/google/android/gms/internal/ads/w3;

    sget v3, Lcom/google/android/gms/internal/ads/EW;->a:I

    iget v2, v2, Lcom/google/android/gms/internal/ads/w3;->a:I

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/P3;->m:Lcom/google/android/gms/internal/ads/O3;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/A3;->d:Lcom/google/android/gms/internal/ads/Q3;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Q3;->a:Lcom/google/android/gms/internal/ads/N3;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/N3;->b(I)Lcom/google/android/gms/internal/ads/O3;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/O3;->a:Z

    if-eqz v2, :cond_2

    return-object v0

    :cond_2
    return-object v1
.end method

.method public final h(Lcom/google/android/gms/internal/ads/Q3;Lcom/google/android/gms/internal/ads/w3;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/A3;->d:Lcom/google/android/gms/internal/ads/Q3;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/A3;->e:Lcom/google/android/gms/internal/ads/w3;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/Q3;->a:Lcom/google/android/gms/internal/ads/N3;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/N3;->g:Lcom/google/android/gms/internal/ads/D;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/A3;->a:Lcom/google/android/gms/internal/ads/a1;

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/a1;->c(Lcom/google/android/gms/internal/ads/D;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/A3;->i()V

    return-void
.end method

.method public final i()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    const/4 v1, 0x0

    iput v1, v0, Lcom/google/android/gms/internal/ads/P3;->d:I

    const-wide/16 v2, 0x0

    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/P3;->p:J

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/P3;->q:Z

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/P3;->k:Z

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/P3;->o:Z

    const/4 v2, 0x0

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/P3;->m:Lcom/google/android/gms/internal/ads/O3;

    iput v1, p0, Lcom/google/android/gms/internal/ads/A3;->f:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/A3;->h:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/A3;->g:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/A3;->i:I

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/A3;->l:Z

    return-void
.end method

.method public final k()Z
    .locals 5

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/A3;->f:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/A3;->f:I

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/A3;->l:Z

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return v2

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/A3;->g:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/A3;->g:I

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/A3;->b:Lcom/google/android/gms/internal/ads/P3;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/P3;->g:[I

    iget v4, p0, Lcom/google/android/gms/internal/ads/A3;->h:I

    aget v3, v3, v4

    if-ne v0, v3, :cond_1

    add-int/2addr v4, v1

    iput v4, p0, Lcom/google/android/gms/internal/ads/A3;->h:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/A3;->g:I

    return v2

    :cond_1
    return v1
.end method
