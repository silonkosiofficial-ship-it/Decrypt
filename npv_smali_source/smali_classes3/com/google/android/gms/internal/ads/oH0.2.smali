.class public final Lcom/google/android/gms/internal/ads/oH0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/JH0;
.implements Lcom/google/android/gms/internal/ads/IH0;


# instance fields
.field public final C:Lcom/google/android/gms/internal/ads/JH0;

.field private D:Lcom/google/android/gms/internal/ads/IH0;

.field private E:[Lcom/google/android/gms/internal/ads/nH0;

.field private F:J

.field G:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/JH0;ZJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/oH0;->C:Lcom/google/android/gms/internal/ads/JH0;

    const/4 p1, 0x0

    new-array p1, p1, [Lcom/google/android/gms/internal/ads/nH0;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/oH0;->E:[Lcom/google/android/gms/internal/ads/nH0;

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/oH0;->F:J

    iput-wide p5, p0, Lcom/google/android/gms/internal/ads/oH0;->G:J

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oH0;->C:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/JH0;->a(J)V

    return-void
.end method

.method public final b()J
    .locals 7

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oH0;->C:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/JH0;->b()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/oH0;->G:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_0

    cmp-long v4, v0, v4

    if-ltz v4, :cond_0

    goto :goto_0

    :cond_0
    return-wide v0

    :cond_1
    :goto_0
    return-wide v2
.end method

.method public final c()J
    .locals 7

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oH0;->C:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/JH0;->c()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/oH0;->G:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_0

    cmp-long v4, v0, v4

    if-ltz v4, :cond_0

    goto :goto_0

    :cond_0
    return-wide v0

    :cond_1
    :goto_0
    return-wide v2
.end method

.method public final d(Lcom/google/android/gms/internal/ads/ZA0;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oH0;->C:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/JH0;->d(Lcom/google/android/gms/internal/ads/ZA0;)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic e(Lcom/google/android/gms/internal/ads/HI0;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/JH0;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/oH0;->D:Lcom/google/android/gms/internal/ads/IH0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/ads/FI0;->e(Lcom/google/android/gms/internal/ads/HI0;)V

    return-void
.end method

.method public final f()J
    .locals 9

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/oH0;->n()Z

    move-result v0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_1

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/oH0;->F:J

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/oH0;->F:J

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/oH0;->f()J

    move-result-wide v5

    cmp-long v0, v5, v1

    if-eqz v0, :cond_0

    return-wide v5

    :cond_0
    return-wide v3

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oH0;->C:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/JH0;->f()J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-nez v0, :cond_2

    return-wide v1

    :cond_2
    const-wide/16 v0, 0x0

    cmp-long v0, v3, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ltz v0, :cond_3

    move v0, v2

    goto :goto_0

    :cond_3
    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/oH0;->G:J

    const-wide/high16 v7, -0x8000000000000000L

    cmp-long v0, v5, v7

    if-eqz v0, :cond_4

    cmp-long v0, v3, v5

    if-gtz v0, :cond_5

    :cond_4
    move v1, v2

    :cond_5
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    return-wide v3
.end method

.method public final g()Lcom/google/android/gms/internal/ads/PI0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oH0;->C:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/JH0;->g()Lcom/google/android/gms/internal/ads/PI0;

    move-result-object v0

    return-object v0
.end method

.method public final h(J)J
    .locals 7

    .prologue
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/oH0;->F:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oH0;->E:[Lcom/google/android/gms/internal/ads/nH0;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/nH0;->c()V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oH0;->C:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/JH0;->h(J)J

    move-result-wide v0

    cmp-long p1, v0, p1

    const/4 p2, 0x1

    if-eqz p1, :cond_2

    const-wide/16 v3, 0x0

    cmp-long p1, v0, v3

    if-ltz p1, :cond_3

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/oH0;->G:J

    const-wide/high16 v5, -0x8000000000000000L

    cmp-long p1, v3, v5

    if-eqz p1, :cond_2

    cmp-long p1, v0, v3

    if-gtz p1, :cond_3

    :cond_2
    move v2, p2

    :cond_3
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    return-wide v0
.end method

.method public final i(JLcom/google/android/gms/internal/ads/GB0;)J
    .locals 10

    .prologue
    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-eqz v2, :cond_3

    iget-wide v2, p3, Lcom/google/android/gms/internal/ads/GB0;->a:J

    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iget-wide v4, p3, Lcom/google/android/gms/internal/ads/GB0;->b:J

    iget-wide v6, p0, Lcom/google/android/gms/internal/ads/oH0;->G:J

    const-wide/high16 v8, -0x8000000000000000L

    cmp-long v8, v6, v8

    if-nez v8, :cond_0

    const-wide v6, 0x7fffffffffffffffL

    goto :goto_0

    :cond_0
    sub-long/2addr v6, p1

    :goto_0
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iget-wide v4, p3, Lcom/google/android/gms/internal/ads/GB0;->a:J

    cmp-long v4, v2, v4

    if-nez v4, :cond_1

    iget-wide v4, p3, Lcom/google/android/gms/internal/ads/GB0;->b:J

    cmp-long v4, v0, v4

    if-eqz v4, :cond_2

    :cond_1
    new-instance p3, Lcom/google/android/gms/internal/ads/GB0;

    invoke-direct {p3, v2, v3, v0, v1}, Lcom/google/android/gms/internal/ads/GB0;-><init>(JJ)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oH0;->C:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/JH0;->i(JLcom/google/android/gms/internal/ads/GB0;)J

    move-result-wide p1

    return-wide p1

    :cond_3
    return-wide v0
.end method

.method public final j(JZ)V
    .locals 1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/oH0;->C:Lcom/google/android/gms/internal/ads/JH0;

    const/4 v0, 0x0

    invoke-interface {p3, p1, p2, v0}, Lcom/google/android/gms/internal/ads/JH0;->j(JZ)V

    return-void
.end method

.method public final k()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oH0;->C:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/JH0;->k()V

    return-void
.end method

.method public final l(Lcom/google/android/gms/internal/ads/JH0;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/oH0;->D:Lcom/google/android/gms/internal/ads/IH0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/ads/IH0;->l(Lcom/google/android/gms/internal/ads/JH0;)V

    return-void
.end method

.method public final m(JJ)V
    .locals 0

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/oH0;->G:J

    return-void
.end method

.method final n()Z
    .locals 4

    .prologue
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/oH0;->F:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final o([Lcom/google/android/gms/internal/ads/IJ0;[Z[Lcom/google/android/gms/internal/ads/EI0;[ZJ)J
    .locals 14

    .prologue
    move-object v0, p0

    move-object/from16 v1, p3

    array-length v2, v1

    new-array v3, v2, [Lcom/google/android/gms/internal/ads/nH0;

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/oH0;->E:[Lcom/google/android/gms/internal/ads/nH0;

    new-array v2, v2, [Lcom/google/android/gms/internal/ads/EI0;

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    array-length v5, v1

    const/4 v11, 0x0

    if-ge v4, v5, :cond_1

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/oH0;->E:[Lcom/google/android/gms/internal/ads/nH0;

    aget-object v6, v1, v4

    check-cast v6, Lcom/google/android/gms/internal/ads/nH0;

    aput-object v6, v5, v4

    if-eqz v6, :cond_0

    iget-object v11, v6, Lcom/google/android/gms/internal/ads/nH0;->a:Lcom/google/android/gms/internal/ads/EI0;

    :cond_0
    aput-object v11, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/oH0;->C:Lcom/google/android/gms/internal/ads/JH0;

    move-object v5, p1

    move-object/from16 v6, p2

    move-object v7, v2

    move-object/from16 v8, p4

    move-wide/from16 v9, p5

    invoke-interface/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/JH0;->o([Lcom/google/android/gms/internal/ads/IJ0;[Z[Lcom/google/android/gms/internal/ads/EI0;[ZJ)J

    move-result-wide v4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/oH0;->n()Z

    move-result v6

    const-wide/16 v7, 0x0

    if-eqz v6, :cond_2

    cmp-long v6, p5, v7

    if-nez v6, :cond_2

    move-wide v9, v7

    goto :goto_1

    :cond_2
    move-wide/from16 v9, p5

    :goto_1
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v12, v0, Lcom/google/android/gms/internal/ads/oH0;->F:J

    cmp-long v6, v4, v9

    const/4 v9, 0x1

    if-eqz v6, :cond_4

    cmp-long v6, v4, v7

    if-ltz v6, :cond_3

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/oH0;->G:J

    const-wide/high16 v12, -0x8000000000000000L

    cmp-long v8, v6, v12

    if-eqz v8, :cond_4

    cmp-long v6, v4, v6

    if-gtz v6, :cond_3

    goto :goto_2

    :cond_3
    move v9, v3

    :cond_4
    :goto_2
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    :goto_3
    array-length v6, v1

    if-ge v3, v6, :cond_8

    aget-object v6, v2, v3

    if-nez v6, :cond_5

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/oH0;->E:[Lcom/google/android/gms/internal/ads/nH0;

    aput-object v11, v6, v3

    goto :goto_4

    :cond_5
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/oH0;->E:[Lcom/google/android/gms/internal/ads/nH0;

    aget-object v8, v7, v3

    if-eqz v8, :cond_6

    iget-object v8, v8, Lcom/google/android/gms/internal/ads/nH0;->a:Lcom/google/android/gms/internal/ads/EI0;

    if-eq v8, v6, :cond_7

    :cond_6
    new-instance v8, Lcom/google/android/gms/internal/ads/nH0;

    invoke-direct {v8, p0, v6}, Lcom/google/android/gms/internal/ads/nH0;-><init>(Lcom/google/android/gms/internal/ads/oH0;Lcom/google/android/gms/internal/ads/EI0;)V

    aput-object v8, v7, v3

    :cond_7
    :goto_4
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/oH0;->E:[Lcom/google/android/gms/internal/ads/nH0;

    aget-object v6, v6, v3

    aput-object v6, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_8
    return-wide v4
.end method

.method public final p(Lcom/google/android/gms/internal/ads/IH0;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/oH0;->D:Lcom/google/android/gms/internal/ads/IH0;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/oH0;->C:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {p1, p0, p2, p3}, Lcom/google/android/gms/internal/ads/JH0;->p(Lcom/google/android/gms/internal/ads/IH0;J)V

    return-void
.end method

.method public final q()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oH0;->C:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/JH0;->q()Z

    move-result v0

    return v0
.end method
