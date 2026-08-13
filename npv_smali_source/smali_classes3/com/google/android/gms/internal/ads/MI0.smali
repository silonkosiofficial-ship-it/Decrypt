.class final Lcom/google/android/gms/internal/ads/MI0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/JH0;
.implements Lcom/google/android/gms/internal/ads/IH0;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/JH0;

.field private final D:J

.field private E:Lcom/google/android/gms/internal/ads/IH0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/JH0;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/MI0;->C:Lcom/google/android/gms/internal/ads/JH0;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/MI0;->D:J

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 3

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/MI0;->D:J

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/MI0;->C:Lcom/google/android/gms/internal/ads/JH0;

    sub-long/2addr p1, v0

    invoke-interface {v2, p1, p2}, Lcom/google/android/gms/internal/ads/JH0;->a(J)V

    return-void
.end method

.method public final b()J
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/MI0;->C:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/JH0;->b()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-wide v2

    :cond_0
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/MI0;->D:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final c()J
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/MI0;->C:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/JH0;->c()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-wide v2

    :cond_0
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/MI0;->D:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final d(Lcom/google/android/gms/internal/ads/ZA0;)Z
    .locals 4

    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/ZA0;->a:J

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/MI0;->D:J

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ZA0;->a()Lcom/google/android/gms/internal/ads/XA0;

    move-result-object p1

    sub-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/XA0;->e(J)Lcom/google/android/gms/internal/ads/XA0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/XA0;->g()Lcom/google/android/gms/internal/ads/ZA0;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/MI0;->C:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/JH0;->d(Lcom/google/android/gms/internal/ads/ZA0;)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic e(Lcom/google/android/gms/internal/ads/HI0;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/JH0;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/MI0;->E:Lcom/google/android/gms/internal/ads/IH0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/ads/FI0;->e(Lcom/google/android/gms/internal/ads/HI0;)V

    return-void
.end method

.method public final f()J
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/MI0;->C:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/JH0;->f()J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-wide v2

    :cond_0
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/MI0;->D:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final g()Lcom/google/android/gms/internal/ads/PI0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/MI0;->C:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/JH0;->g()Lcom/google/android/gms/internal/ads/PI0;

    move-result-object v0

    return-object v0
.end method

.method public final h(J)J
    .locals 3

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/MI0;->D:J

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/MI0;->C:Lcom/google/android/gms/internal/ads/JH0;

    sub-long/2addr p1, v0

    invoke-interface {v2, p1, p2}, Lcom/google/android/gms/internal/ads/JH0;->h(J)J

    move-result-wide p1

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public final i(JLcom/google/android/gms/internal/ads/GB0;)J
    .locals 3

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/MI0;->D:J

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/MI0;->C:Lcom/google/android/gms/internal/ads/JH0;

    sub-long/2addr p1, v0

    invoke-interface {v2, p1, p2, p3}, Lcom/google/android/gms/internal/ads/JH0;->i(JLcom/google/android/gms/internal/ads/GB0;)J

    move-result-wide p1

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public final j(JZ)V
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/MI0;->D:J

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/MI0;->C:Lcom/google/android/gms/internal/ads/JH0;

    sub-long/2addr p1, v0

    const/4 v0, 0x0

    invoke-interface {p3, p1, p2, v0}, Lcom/google/android/gms/internal/ads/JH0;->j(JZ)V

    return-void
.end method

.method public final k()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/MI0;->C:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/JH0;->k()V

    return-void
.end method

.method public final l(Lcom/google/android/gms/internal/ads/JH0;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/MI0;->E:Lcom/google/android/gms/internal/ads/IH0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/ads/IH0;->l(Lcom/google/android/gms/internal/ads/JH0;)V

    return-void
.end method

.method public final m()Lcom/google/android/gms/internal/ads/JH0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/MI0;->C:Lcom/google/android/gms/internal/ads/JH0;

    return-object v0
.end method

.method public final o([Lcom/google/android/gms/internal/ads/IJ0;[Z[Lcom/google/android/gms/internal/ads/EI0;[ZJ)J
    .locals 12

    .prologue
    move-object v0, p0

    move-object v1, p3

    array-length v2, v1

    new-array v2, v2, [Lcom/google/android/gms/internal/ads/EI0;

    const/4 v10, 0x0

    move v3, v10

    :goto_0
    array-length v4, v1

    const/4 v11, 0x0

    if-ge v3, v4, :cond_1

    aget-object v4, v1, v3

    check-cast v4, Lcom/google/android/gms/internal/ads/LI0;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/LI0;->c()Lcom/google/android/gms/internal/ads/EI0;

    move-result-object v11

    :cond_0
    aput-object v11, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/MI0;->C:Lcom/google/android/gms/internal/ads/JH0;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/MI0;->D:J

    sub-long v8, p5, v4

    move-object v4, p1

    move-object v5, p2

    move-object v6, v2

    move-object/from16 v7, p4

    invoke-interface/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/JH0;->o([Lcom/google/android/gms/internal/ads/IJ0;[Z[Lcom/google/android/gms/internal/ads/EI0;[ZJ)J

    move-result-wide v3

    :goto_1
    array-length v5, v1

    if-ge v10, v5, :cond_5

    aget-object v5, v2, v10

    if-nez v5, :cond_2

    aput-object v11, v1, v10

    goto :goto_2

    :cond_2
    aget-object v6, v1, v10

    if-eqz v6, :cond_3

    check-cast v6, Lcom/google/android/gms/internal/ads/LI0;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/LI0;->c()Lcom/google/android/gms/internal/ads/EI0;

    move-result-object v6

    if-eq v6, v5, :cond_4

    :cond_3
    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/MI0;->D:J

    new-instance v8, Lcom/google/android/gms/internal/ads/LI0;

    invoke-direct {v8, v5, v6, v7}, Lcom/google/android/gms/internal/ads/LI0;-><init>(Lcom/google/android/gms/internal/ads/EI0;J)V

    aput-object v8, v1, v10

    :cond_4
    :goto_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_5
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/MI0;->D:J

    add-long/2addr v3, v1

    return-wide v3
.end method

.method public final p(Lcom/google/android/gms/internal/ads/IH0;J)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/MI0;->E:Lcom/google/android/gms/internal/ads/IH0;

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/MI0;->D:J

    sub-long/2addr p2, v0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/MI0;->C:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {p1, p0, p2, p3}, Lcom/google/android/gms/internal/ads/JH0;->p(Lcom/google/android/gms/internal/ads/IH0;J)V

    return-void
.end method

.method public final q()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/MI0;->C:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/JH0;->q()Z

    move-result v0

    return v0
.end method
