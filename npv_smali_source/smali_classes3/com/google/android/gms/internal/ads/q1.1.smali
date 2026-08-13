.class final Lcom/google/android/gms/internal/ads/q1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected final a:Lcom/google/android/gms/internal/ads/a1;

.field private final b:I

.field private final c:I

.field private final d:J

.field private final e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:J

.field private l:[J

.field private m:[I


# direct methods
.method public constructor <init>(IIJILcom/google/android/gms/internal/ads/a1;)V
    .locals 2

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-eq p2, v0, :cond_0

    move p2, v1

    :cond_0
    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/q1;->d:J

    iput p5, p0, Lcom/google/android/gms/internal/ads/q1;->e:I

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/q1;->a:Lcom/google/android/gms/internal/ads/a1;

    if-ne p2, v1, :cond_1

    const/high16 p3, 0x63640000

    goto :goto_0

    :cond_1
    const/high16 p3, 0x62770000

    :goto_0
    invoke-static {p1, p3}, Lcom/google/android/gms/internal/ads/q1;->h(II)I

    move-result p3

    iput p3, p0, Lcom/google/android/gms/internal/ads/q1;->b:I

    if-ne p2, v1, :cond_2

    const/high16 p2, 0x62640000

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/q1;->h(II)I

    move-result p1

    goto :goto_1

    :cond_2
    const/4 p1, -0x1

    :goto_1
    iput p1, p0, Lcom/google/android/gms/internal/ads/q1;->c:I

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/q1;->k:J

    const/16 p1, 0x200

    new-array p2, p1, [J

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/q1;->l:[J

    new-array p1, p1, [I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/q1;->m:[I

    return-void
.end method

.method private static h(II)I
    .locals 1

    div-int/lit8 v0, p0, 0xa

    rem-int/lit8 p0, p0, 0xa

    add-int/lit8 p0, p0, 0x30

    shl-int/lit8 p0, p0, 0x8

    add-int/lit8 v0, v0, 0x30

    or-int/2addr p0, v0

    or-int/2addr p0, p1

    return p0
.end method

.method private final i(I)J
    .locals 5

    iget v0, p0, Lcom/google/android/gms/internal/ads/q1;->e:I

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/q1;->d:J

    int-to-long v3, p1

    mul-long/2addr v1, v3

    int-to-long v3, v0

    div-long/2addr v1, v3

    return-wide v1
.end method

.method private final j(I)Lcom/google/android/gms/internal/ads/U0;
    .locals 6

    new-instance v0, Lcom/google/android/gms/internal/ads/U0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/q1;->m:[I

    aget v1, v1, p1

    int-to-long v1, v1

    const/4 v3, 0x1

    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/ads/q1;->i(I)J

    move-result-wide v3

    mul-long/2addr v1, v3

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/q1;->l:[J

    aget-wide v4, v3, p1

    invoke-direct {v0, v1, v2, v4, v5}, Lcom/google/android/gms/internal/ads/U0;-><init>(JJ)V

    return-object v0
.end method


# virtual methods
.method public final a(J)Lcom/google/android/gms/internal/ads/R0;
    .locals 4

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/q1;->j:I

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/q1;->i(I)J

    move-result-wide v1

    div-long/2addr p1, v1

    long-to-int p1, p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/q1;->m:[I

    invoke-static {p2, p1, v0, v0}, Lcom/google/android/gms/internal/ads/EW;->u([IIZZ)I

    move-result p2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/q1;->m:[I

    aget v1, v1, p2

    if-ne v1, p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/R0;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/q1;->j(I)Lcom/google/android/gms/internal/ads/U0;

    move-result-object p2

    invoke-direct {p1, p2, p2}, Lcom/google/android/gms/internal/ads/R0;-><init>(Lcom/google/android/gms/internal/ads/U0;Lcom/google/android/gms/internal/ads/U0;)V

    return-object p1

    :cond_0
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/q1;->j(I)Lcom/google/android/gms/internal/ads/U0;

    move-result-object p1

    add-int/2addr p2, v0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/q1;->l:[J

    array-length v0, v0

    if-ge p2, v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/R0;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/q1;->j(I)Lcom/google/android/gms/internal/ads/U0;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/R0;-><init>(Lcom/google/android/gms/internal/ads/U0;Lcom/google/android/gms/internal/ads/U0;)V

    return-object v0

    :cond_1
    new-instance p2, Lcom/google/android/gms/internal/ads/R0;

    invoke-direct {p2, p1, p1}, Lcom/google/android/gms/internal/ads/R0;-><init>(Lcom/google/android/gms/internal/ads/U0;Lcom/google/android/gms/internal/ads/U0;)V

    return-object p2

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/ads/R0;

    new-instance p2, Lcom/google/android/gms/internal/ads/U0;

    const-wide/16 v0, 0x0

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/q1;->k:J

    invoke-direct {p2, v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/U0;-><init>(JJ)V

    invoke-direct {p1, p2, p2}, Lcom/google/android/gms/internal/ads/R0;-><init>(Lcom/google/android/gms/internal/ads/U0;Lcom/google/android/gms/internal/ads/U0;)V

    return-object p1
.end method

.method public final b(JZ)V
    .locals 4

    .prologue
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/q1;->k:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/q1;->k:J

    :cond_0
    if-eqz p3, :cond_2

    iget p3, p0, Lcom/google/android/gms/internal/ads/q1;->j:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/q1;->m:[I

    array-length v0, v0

    if-ne p3, v0, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/q1;->l:[J

    array-length v0, p3

    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    invoke-static {p3, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/q1;->l:[J

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/q1;->m:[I

    array-length v0, p3

    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    invoke-static {p3, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/q1;->m:[I

    :cond_1
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/q1;->l:[J

    iget v0, p0, Lcom/google/android/gms/internal/ads/q1;->j:I

    aput-wide p1, p3, v0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/q1;->m:[I

    iget p2, p0, Lcom/google/android/gms/internal/ads/q1;->i:I

    aput p2, p1, v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/q1;->j:I

    :cond_2
    iget p1, p0, Lcom/google/android/gms/internal/ads/q1;->i:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/q1;->i:I

    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/q1;->l:[J

    iget v1, p0, Lcom/google/android/gms/internal/ads/q1;->j:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/q1;->l:[J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/q1;->m:[I

    iget v1, p0, Lcom/google/android/gms/internal/ads/q1;->j:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/q1;->m:[I

    return-void
.end method

.method public final d(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/q1;->f:I

    iput p1, p0, Lcom/google/android/gms/internal/ads/q1;->g:I

    return-void
.end method

.method public final e(J)V
    .locals 2

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/q1;->j:I

    if-nez v0, :cond_0

    const/4 p1, 0x0

    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/q1;->h:I

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/q1;->l:[J

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1, v1}, Lcom/google/android/gms/internal/ads/EW;->v([JJZZ)I

    move-result p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/q1;->m:[I

    aget p1, p2, p1

    goto :goto_0
.end method

.method public final f(I)Z
    .locals 1

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/q1;->b:I

    if-eq v0, p1, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/ads/q1;->c:I

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final g(Lcom/google/android/gms/internal/ads/u0;)Z
    .locals 10

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/q1;->g:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/q1;->a:Lcom/google/android/gms/internal/ads/a1;

    const/4 v2, 0x0

    invoke-interface {v1, p1, v0, v2}, Lcom/google/android/gms/internal/ads/a1;->e(Lcom/google/android/gms/internal/ads/qB0;IZ)I

    move-result p1

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/google/android/gms/internal/ads/q1;->g:I

    const/4 p1, 0x1

    if-nez v0, :cond_0

    move v0, p1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_3

    iget v1, p0, Lcom/google/android/gms/internal/ads/q1;->f:I

    if-lez v1, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/q1;->a:Lcom/google/android/gms/internal/ads/a1;

    iget v1, p0, Lcom/google/android/gms/internal/ads/q1;->h:I

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/q1;->i(I)J

    move-result-wide v4

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/q1;->m:[I

    iget v6, p0, Lcom/google/android/gms/internal/ads/q1;->h:I

    invoke-static {v1, v6}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v1

    if-ltz v1, :cond_1

    move v6, p1

    goto :goto_1

    :cond_1
    move v6, v2

    :goto_1
    iget v7, p0, Lcom/google/android/gms/internal/ads/q1;->f:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-interface/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/a1;->b(JIIILcom/google/android/gms/internal/ads/Z0;)V

    :cond_2
    iget v1, p0, Lcom/google/android/gms/internal/ads/q1;->h:I

    add-int/2addr v1, p1

    iput v1, p0, Lcom/google/android/gms/internal/ads/q1;->h:I

    :cond_3
    return v0
.end method
