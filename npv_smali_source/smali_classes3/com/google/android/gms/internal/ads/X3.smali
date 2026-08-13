.class public final Lcom/google/android/gms/internal/ads/X3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/t0;


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/w0;

.field private b:Lcom/google/android/gms/internal/ads/f4;

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Lcom/google/android/gms/internal/ads/u0;)Z
    .locals 8

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/ads/Z3;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Z3;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/Z3;->b(Lcom/google/android/gms/internal/ads/u0;Z)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    iget v2, v0, Lcom/google/android/gms/internal/ads/Z3;->a:I

    const/4 v4, 0x2

    and-int/2addr v2, v4

    if-eq v2, v4, :cond_0

    goto :goto_2

    :cond_0
    iget v0, v0, Lcom/google/android/gms/internal/ads/Z3;->e:I

    const/16 v2, 0x8

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-instance v2, Lcom/google/android/gms/internal/ads/sR;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v4

    invoke-interface {p1, v4, v3, v0}, Lcom/google/android/gms/internal/ads/u0;->N([BII)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result p1

    const/4 v0, 0x5

    if-lt p1, v0, :cond_1

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->C()I

    move-result p1

    const/16 v0, 0x7f

    if-ne p1, v0, :cond_1

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->K()J

    move-result-wide v4

    const-wide/32 v6, 0x464c4143

    cmp-long p1, v4, v6

    if-nez p1, :cond_1

    new-instance p1, Lcom/google/android/gms/internal/ads/W3;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/W3;-><init>()V

    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/X3;->b:Lcom/google/android/gms/internal/ads/f4;

    goto :goto_1

    :cond_1
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    :try_start_0
    invoke-static {v1, v2, v1}, Lcom/google/android/gms/internal/ads/g1;->d(ILcom/google/android/gms/internal/ads/sR;Z)Z

    move-result p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/of; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_2

    new-instance p1, Lcom/google/android/gms/internal/ads/h4;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/h4;-><init>()V

    goto :goto_0

    :catch_0
    :cond_2
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/b4;->j(Lcom/google/android/gms/internal/ads/sR;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lcom/google/android/gms/internal/ads/b4;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/b4;-><init>()V

    goto :goto_0

    :goto_1
    return v1

    :cond_3
    :goto_2
    return v3
.end method


# virtual methods
.method public final synthetic c()Lcom/google/android/gms/internal/ads/t0;
    .locals 0

    return-object p0
.end method

.method public final e(JJ)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/X3;->b:Lcom/google/android/gms/internal/ads/f4;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/f4;->i(JJ)V

    :cond_0
    return-void
.end method

.method public final synthetic f()Ljava/util/List;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v0

    return-object v0
.end method

.method public final i(Lcom/google/android/gms/internal/ads/u0;Lcom/google/android/gms/internal/ads/Q0;)I
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/X3;->a:Lcom/google/android/gms/internal/ads/w0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/X3;->b:Lcom/google/android/gms/internal/ads/f4;

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/X3;->a(Lcom/google/android/gms/internal/ads/u0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->j()V

    goto :goto_0

    :cond_0
    const-string p1, "Failed to determine bitstream type"

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/of;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/of;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/X3;->c:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/X3;->a:Lcom/google/android/gms/internal/ads/w0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/w0;->S(II)Lcom/google/android/gms/internal/ads/a1;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/X3;->a:Lcom/google/android/gms/internal/ads/w0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/w0;->Q()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/X3;->b:Lcom/google/android/gms/internal/ads/f4;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/X3;->a:Lcom/google/android/gms/internal/ads/w0;

    invoke-virtual {v1, v3, v0}, Lcom/google/android/gms/internal/ads/f4;->g(Lcom/google/android/gms/internal/ads/w0;Lcom/google/android/gms/internal/ads/a1;)V

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/X3;->c:Z

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/X3;->b:Lcom/google/android/gms/internal/ads/f4;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/f4;->d(Lcom/google/android/gms/internal/ads/u0;Lcom/google/android/gms/internal/ads/Q0;)I

    move-result p1

    return p1
.end method

.method public final j(Lcom/google/android/gms/internal/ads/u0;)Z
    .locals 0

    .prologue
    :try_start_0
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/X3;->a(Lcom/google/android/gms/internal/ads/u0;)Z

    move-result p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/of; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public final k(Lcom/google/android/gms/internal/ads/w0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/X3;->a:Lcom/google/android/gms/internal/ads/w0;

    return-void
.end method
