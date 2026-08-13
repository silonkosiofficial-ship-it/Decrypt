.class public final Lcom/google/android/gms/internal/ads/K5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/y5;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/sR;

.field private final b:Lcom/google/android/gms/internal/ads/M0;

.field private final c:Ljava/lang/String;

.field private final d:I

.field private e:Lcom/google/android/gms/internal/ads/a1;

.field private f:Ljava/lang/String;

.field private g:I

.field private h:I

.field private i:Z

.field private j:Z

.field private k:J

.field private l:I

.field private m:J


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/K5;->g:I

    new-instance v1, Lcom/google/android/gms/internal/ads/sR;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/K5;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v1

    const/4 v2, -0x1

    aput-byte v2, v1, v0

    new-instance v0, Lcom/google/android/gms/internal/ads/M0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/M0;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/K5;->b:Lcom/google/android/gms/internal/ads/M0;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/K5;->m:J

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/K5;->c:Ljava/lang/String;

    iput p2, p0, Lcom/google/android/gms/internal/ads/K5;->d:I

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 0

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/ads/sR;)V
    .locals 11

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/K5;->e:Lcom/google/android/gms/internal/ads/a1;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v0

    if-lez v0, :cond_a

    iget v0, p0, Lcom/google/android/gms/internal/ads/K5;->g:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_5

    if-eq v0, v2, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/K5;->l:I

    iget v4, p0, Lcom/google/android/gms/internal/ads/K5;->h:I

    sub-int/2addr v1, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/K5;->e:Lcom/google/android/gms/internal/ads/a1;

    invoke-interface {v1, p1, v0}, Lcom/google/android/gms/internal/ads/a1;->a(Lcom/google/android/gms/internal/ads/sR;I)V

    iget v1, p0, Lcom/google/android/gms/internal/ads/K5;->h:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/google/android/gms/internal/ads/K5;->h:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/K5;->l:I

    if-lt v1, v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/K5;->m:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v4

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/K5;->e:Lcom/google/android/gms/internal/ads/a1;

    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/K5;->m:J

    iget v8, p0, Lcom/google/android/gms/internal/ads/K5;->l:I

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v7, 0x1

    invoke-interface/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/a1;->b(JIIILcom/google/android/gms/internal/ads/Z0;)V

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/K5;->m:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/K5;->k:J

    add-long/2addr v0, v4

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/K5;->m:J

    iput v3, p0, Lcom/google/android/gms/internal/ads/K5;->h:I

    iput v3, p0, Lcom/google/android/gms/internal/ads/K5;->g:I

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v0

    iget v4, p0, Lcom/google/android/gms/internal/ads/K5;->h:I

    const/4 v5, 0x4

    rsub-int/lit8 v4, v4, 0x4

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/K5;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v4

    iget v6, p0, Lcom/google/android/gms/internal/ads/K5;->h:I

    invoke-virtual {p1, v4, v6, v0}, Lcom/google/android/gms/internal/ads/sR;->h([BII)V

    iget v4, p0, Lcom/google/android/gms/internal/ads/K5;->h:I

    add-int/2addr v4, v0

    iput v4, p0, Lcom/google/android/gms/internal/ads/K5;->h:I

    if-lt v4, v5, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/K5;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/K5;->b:Lcom/google/android/gms/internal/ads/M0;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/K5;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/M0;->a(I)Z

    move-result v0

    if-nez v0, :cond_3

    iput v3, p0, Lcom/google/android/gms/internal/ads/K5;->h:I

    :goto_2
    iput v2, p0, Lcom/google/android/gms/internal/ads/K5;->g:I

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/K5;->b:Lcom/google/android/gms/internal/ads/M0;

    iget v4, v0, Lcom/google/android/gms/internal/ads/M0;->c:I

    iput v4, p0, Lcom/google/android/gms/internal/ads/K5;->l:I

    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/K5;->i:Z

    if-nez v4, :cond_4

    iget v4, v0, Lcom/google/android/gms/internal/ads/M0;->g:I

    int-to-long v6, v4

    iget v0, v0, Lcom/google/android/gms/internal/ads/M0;->d:I

    const-wide/32 v8, 0xf4240

    mul-long/2addr v6, v8

    int-to-long v8, v0

    div-long/2addr v6, v8

    iput-wide v6, p0, Lcom/google/android/gms/internal/ads/K5;->k:J

    new-instance v0, Lcom/google/android/gms/internal/ads/oK0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/oK0;-><init>()V

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/K5;->f:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/oK0;->m(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/K5;->b:Lcom/google/android/gms/internal/ads/M0;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/M0;->b:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/oK0;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    const/16 v4, 0x1000

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/oK0;->r(I)Lcom/google/android/gms/internal/ads/oK0;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/K5;->b:Lcom/google/android/gms/internal/ads/M0;

    iget v4, v4, Lcom/google/android/gms/internal/ads/M0;->e:I

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/oK0;->r0(I)Lcom/google/android/gms/internal/ads/oK0;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/K5;->b:Lcom/google/android/gms/internal/ads/M0;

    iget v4, v4, Lcom/google/android/gms/internal/ads/M0;->d:I

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/oK0;->C(I)Lcom/google/android/gms/internal/ads/oK0;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/K5;->c:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/oK0;->q(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    iget v4, p0, Lcom/google/android/gms/internal/ads/K5;->d:I

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/oK0;->y(I)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object v0

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/K5;->e:Lcom/google/android/gms/internal/ads/a1;

    invoke-interface {v4, v0}, Lcom/google/android/gms/internal/ads/a1;->c(Lcom/google/android/gms/internal/ads/D;)V

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/K5;->i:Z

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/K5;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/K5;->e:Lcom/google/android/gms/internal/ads/a1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/K5;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-interface {v0, v2, v5}, Lcom/google/android/gms/internal/ads/a1;->a(Lcom/google/android/gms/internal/ads/sR;I)V

    iput v1, p0, Lcom/google/android/gms/internal/ads/K5;->g:I

    goto/16 :goto_0

    :cond_5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->t()I

    move-result v4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->u()I

    move-result v5

    :goto_3
    if-ge v4, v5, :cond_9

    add-int/lit8 v6, v4, 0x1

    aget-byte v7, v0, v4

    and-int/lit16 v8, v7, 0xff

    const/16 v9, 0xff

    if-ne v8, v9, :cond_6

    move v8, v2

    goto :goto_4

    :cond_6
    move v8, v3

    :goto_4
    iget-boolean v9, p0, Lcom/google/android/gms/internal/ads/K5;->j:Z

    if-eqz v9, :cond_7

    and-int/lit16 v7, v7, 0xe0

    const/16 v9, 0xe0

    if-ne v7, v9, :cond_7

    move v7, v2

    goto :goto_5

    :cond_7
    move v7, v3

    :goto_5
    iput-boolean v8, p0, Lcom/google/android/gms/internal/ads/K5;->j:Z

    if-eqz v7, :cond_8

    invoke-virtual {p1, v6}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/K5;->j:Z

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/K5;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v3

    aget-byte v0, v0, v4

    aput-byte v0, v3, v2

    iput v1, p0, Lcom/google/android/gms/internal/ads/K5;->h:I

    goto/16 :goto_2

    :cond_8
    move v4, v6

    goto :goto_3

    :cond_9
    invoke-virtual {p1, v5}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    goto/16 :goto_0

    :cond_a
    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/ads/w0;Lcom/google/android/gms/internal/ads/n6;)V
    .locals 1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/n6;->c()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/n6;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/K5;->f:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/n6;->a()I

    move-result p2

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lcom/google/android/gms/internal/ads/w0;->S(II)Lcom/google/android/gms/internal/ads/a1;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/K5;->e:Lcom/google/android/gms/internal/ads/a1;

    return-void
.end method

.method public final d()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/K5;->g:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/K5;->h:I

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/K5;->j:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/K5;->m:J

    return-void
.end method

.method public final e(JI)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/K5;->m:J

    return-void
.end method
