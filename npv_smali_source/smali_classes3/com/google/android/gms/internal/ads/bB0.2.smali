.class final Lcom/google/android/gms/internal/ads/bB0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/gms/internal/ads/JH0;

.field public final b:Ljava/lang/Object;

.field public final c:[Lcom/google/android/gms/internal/ads/EI0;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Lcom/google/android/gms/internal/ads/cB0;

.field public h:Z

.field private final i:[Z

.field private final j:[Lcom/google/android/gms/internal/ads/DB0;

.field private final k:Lcom/google/android/gms/internal/ads/PJ0;

.field private final l:Lcom/google/android/gms/internal/ads/rB0;

.field private m:Lcom/google/android/gms/internal/ads/bB0;

.field private n:Lcom/google/android/gms/internal/ads/PI0;

.field private o:Lcom/google/android/gms/internal/ads/QJ0;

.field private p:J


# direct methods
.method public constructor <init>([Lcom/google/android/gms/internal/ads/DB0;JLcom/google/android/gms/internal/ads/PJ0;Lcom/google/android/gms/internal/ads/YJ0;Lcom/google/android/gms/internal/ads/rB0;Lcom/google/android/gms/internal/ads/cB0;Lcom/google/android/gms/internal/ads/QJ0;J)V
    .locals 0

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bB0;->j:[Lcom/google/android/gms/internal/ads/DB0;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/bB0;->p:J

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/bB0;->k:Lcom/google/android/gms/internal/ads/PJ0;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/bB0;->l:Lcom/google/android/gms/internal/ads/rB0;

    iget-object p1, p7, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bB0;->b:Ljava/lang/Object;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    sget-object p2, Lcom/google/android/gms/internal/ads/PI0;->d:Lcom/google/android/gms/internal/ads/PI0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bB0;->n:Lcom/google/android/gms/internal/ads/PI0;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/bB0;->o:Lcom/google/android/gms/internal/ads/QJ0;

    const/4 p2, 0x2

    new-array p3, p2, [Lcom/google/android/gms/internal/ads/EI0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/bB0;->c:[Lcom/google/android/gms/internal/ads/EI0;

    new-array p2, p2, [Z

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bB0;->i:[Z

    iget-wide p2, p7, Lcom/google/android/gms/internal/ads/cB0;->b:J

    iget-wide p9, p7, Lcom/google/android/gms/internal/ads/cB0;->d:J

    invoke-virtual {p6, p1, p5, p2, p3}, Lcom/google/android/gms/internal/ads/rB0;->o(Lcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/YJ0;J)Lcom/google/android/gms/internal/ads/JH0;

    move-result-object p5

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p9, p1

    if-eqz p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/oH0;

    const/4 p6, 0x1

    const-wide/16 p7, 0x0

    move-object p4, p1

    invoke-direct/range {p4 .. p10}, Lcom/google/android/gms/internal/ads/oH0;-><init>(Lcom/google/android/gms/internal/ads/JH0;ZJJ)V

    move-object p5, p1

    :cond_0
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    return-void
.end method

.method private final u()V
    .locals 3

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/bB0;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bB0;->o:Lcom/google/android/gms/internal/ads/QJ0;

    iget v2, v1, Lcom/google/android/gms/internal/ads/QJ0;->a:I

    if-ge v0, v2, :cond_0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/QJ0;->b(I)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bB0;->o:Lcom/google/android/gms/internal/ads/QJ0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/QJ0;->c:[Lcom/google/android/gms/internal/ads/IJ0;

    aget-object v1, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final v()V
    .locals 3

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/bB0;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bB0;->o:Lcom/google/android/gms/internal/ads/QJ0;

    iget v2, v1, Lcom/google/android/gms/internal/ads/QJ0;->a:I

    if-ge v0, v2, :cond_0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/QJ0;->b(I)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bB0;->o:Lcom/google/android/gms/internal/ads/QJ0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/QJ0;->c:[Lcom/google/android/gms/internal/ads/IJ0;

    aget-object v1, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final w()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bB0;->m:Lcom/google/android/gms/internal/ads/bB0;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/QJ0;JZ)J
    .locals 6

    const/4 p4, 0x2

    new-array v5, p4, [Z

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/bB0;->b(Lcom/google/android/gms/internal/ads/QJ0;JZ[Z)J

    move-result-wide p1

    return-wide p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/QJ0;JZ[Z)J
    .locals 14

    .prologue
    move-object v0, p0

    move-object v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    iget v4, v1, Lcom/google/android/gms/internal/ads/QJ0;->a:I

    const/4 v5, 0x1

    if-ge v3, v4, :cond_1

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/bB0;->i:[Z

    if-nez p4, :cond_0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/bB0;->o:Lcom/google/android/gms/internal/ads/QJ0;

    invoke-virtual {p1, v6, v3}, Lcom/google/android/gms/internal/ads/QJ0;->a(Lcom/google/android/gms/internal/ads/QJ0;I)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    move v5, v2

    :goto_1
    aput-boolean v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_2
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/bB0;->j:[Lcom/google/android/gms/internal/ads/DB0;

    const/4 v6, 0x2

    if-ge v3, v6, :cond_2

    aget-object v4, v4, v3

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/DB0;->b()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/bB0;->u()V

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/bB0;->o:Lcom/google/android/gms/internal/ads/QJ0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/bB0;->v()V

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/QJ0;->c:[Lcom/google/android/gms/internal/ads/IJ0;

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/bB0;->i:[Z

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/bB0;->c:[Lcom/google/android/gms/internal/ads/EI0;

    move-object/from16 v11, p5

    move-wide/from16 v12, p2

    invoke-interface/range {v7 .. v13}, Lcom/google/android/gms/internal/ads/JH0;->o([Lcom/google/android/gms/internal/ads/IJ0;[Z[Lcom/google/android/gms/internal/ads/EI0;[ZJ)J

    move-result-wide v3

    move v7, v2

    :goto_3
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/bB0;->j:[Lcom/google/android/gms/internal/ads/DB0;

    if-ge v7, v6, :cond_3

    aget-object v8, v8, v7

    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/DB0;->b()I

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_3
    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/bB0;->f:Z

    move v7, v2

    :goto_4
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/bB0;->c:[Lcom/google/android/gms/internal/ads/EI0;

    if-ge v7, v6, :cond_6

    aget-object v8, v8, v7

    if-eqz v8, :cond_4

    invoke-virtual {p1, v7}, Lcom/google/android/gms/internal/ads/QJ0;->b(I)Z

    move-result v8

    invoke-static {v8}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/bB0;->j:[Lcom/google/android/gms/internal/ads/DB0;

    aget-object v8, v8, v7

    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/DB0;->b()I

    iput-boolean v5, v0, Lcom/google/android/gms/internal/ads/bB0;->f:Z

    goto :goto_6

    :cond_4
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/QJ0;->c:[Lcom/google/android/gms/internal/ads/IJ0;

    aget-object v8, v8, v7

    if-nez v8, :cond_5

    move v8, v5

    goto :goto_5

    :cond_5
    move v8, v2

    :goto_5
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    :goto_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_6
    return-wide v3
.end method

.method public final c()J
    .locals 5

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/cB0;->b:J

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/bB0;->f:Z

    const-wide/high16 v1, -0x8000000000000000L

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/JH0;->b()J

    move-result-wide v3

    goto :goto_0

    :cond_1
    move-wide v3, v1

    :goto_0
    cmp-long v0, v3, v1

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/cB0;->e:J

    return-wide v0

    :cond_2
    return-wide v3
.end method

.method public final d()J
    .locals 2

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/JH0;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public final e()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/bB0;->p:J

    return-wide v0
.end method

.method public final f()J
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/cB0;->b:J

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/bB0;->p:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final g()Lcom/google/android/gms/internal/ads/bB0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bB0;->m:Lcom/google/android/gms/internal/ads/bB0;

    return-object v0
.end method

.method public final h()Lcom/google/android/gms/internal/ads/PI0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bB0;->n:Lcom/google/android/gms/internal/ads/PI0;

    return-object v0
.end method

.method public final i()Lcom/google/android/gms/internal/ads/QJ0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bB0;->o:Lcom/google/android/gms/internal/ads/QJ0;

    return-object v0
.end method

.method public final j(FLcom/google/android/gms/internal/ads/qm;Z)Lcom/google/android/gms/internal/ads/QJ0;
    .locals 2

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/bB0;->n:Lcom/google/android/gms/internal/ads/PI0;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object p3, p3, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bB0;->k:Lcom/google/android/gms/internal/ads/PJ0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bB0;->j:[Lcom/google/android/gms/internal/ads/DB0;

    invoke-virtual {v0, v1, p1, p3, p2}, Lcom/google/android/gms/internal/ads/PJ0;->f([Lcom/google/android/gms/internal/ads/DB0;Lcom/google/android/gms/internal/ads/PI0;Lcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/qm;)Lcom/google/android/gms/internal/ads/QJ0;

    move-result-object p1

    const/4 p2, 0x0

    move p3, p2

    :goto_0
    iget v0, p1, Lcom/google/android/gms/internal/ads/QJ0;->a:I

    if-ge p3, v0, :cond_3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/QJ0;->b(I)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/QJ0;->c:[Lcom/google/android/gms/internal/ads/IJ0;

    aget-object v0, v0, p3

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bB0;->j:[Lcom/google/android/gms/internal/ads/DB0;

    aget-object v0, v0, p3

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/DB0;->b()I

    :cond_0
    move v1, p2

    :cond_1
    :goto_1
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    goto :goto_2

    :cond_2
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/QJ0;->c:[Lcom/google/android/gms/internal/ads/IJ0;

    aget-object v0, v0, p3

    if-nez v0, :cond_0

    goto :goto_1

    :goto_2
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_3
    iget-object p3, p1, Lcom/google/android/gms/internal/ads/QJ0;->c:[Lcom/google/android/gms/internal/ads/IJ0;

    array-length v0, p3

    :goto_3
    if-ge p2, v0, :cond_4

    aget-object v1, p3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_3

    :cond_4
    return-object p1
.end method

.method public final k(Lcom/google/android/gms/internal/ads/ZA0;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/bB0;->w()Z

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/JH0;->d(Lcom/google/android/gms/internal/ads/ZA0;)Z

    return-void
.end method

.method public final l(FLcom/google/android/gms/internal/ads/qm;Z)V
    .locals 4

    .prologue
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/JH0;->g()Lcom/google/android/gms/internal/ads/PI0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/bB0;->n:Lcom/google/android/gms/internal/ads/PI0;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/bB0;->j(FLcom/google/android/gms/internal/ads/qm;Z)Lcom/google/android/gms/internal/ads/QJ0;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-wide v0, p2, Lcom/google/android/gms/internal/ads/cB0;->b:J

    iget-wide p2, p2, Lcom/google/android/gms/internal/ads/cB0;->e:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p2, v2

    if-eqz v2, :cond_0

    cmp-long v2, v0, p2

    if-ltz v2, :cond_0

    const-wide/16 v0, -0x1

    add-long/2addr p2, v0

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/google/android/gms/internal/ads/bB0;->a(Lcom/google/android/gms/internal/ads/QJ0;JZ)J

    move-result-wide p1

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/bB0;->p:J

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-wide v2, p3, Lcom/google/android/gms/internal/ads/cB0;->b:J

    sub-long/2addr v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/bB0;->p:J

    invoke-virtual {p3, p1, p2}, Lcom/google/android/gms/internal/ads/cB0;->b(J)Lcom/google/android/gms/internal/ads/cB0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    return-void
.end method

.method public final m(Lcom/google/android/gms/internal/ads/IH0;J)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/bB0;->d:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/JH0;->p(Lcom/google/android/gms/internal/ads/IH0;J)V

    return-void
.end method

.method public final n(J)V
    .locals 3

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/bB0;->w()Z

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/bB0;->p:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/JH0;->a(J)V

    :cond_0
    return-void
.end method

.method public final o()V
    .locals 3

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/bB0;->u()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    :try_start_0
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/oH0;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bB0;->l:Lcom/google/android/gms/internal/ads/rB0;

    if-eqz v1, :cond_0

    :try_start_1
    check-cast v0, Lcom/google/android/gms/internal/ads/oH0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/oH0;->C:Lcom/google/android/gms/internal/ads/JH0;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/rB0;->i(Lcom/google/android/gms/internal/ads/JH0;)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/rB0;->i(Lcom/google/android/gms/internal/ads/JH0;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :goto_0
    const-string v1, "MediaPeriodHolder"

    const-string v2, "Period release failed."

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/eM;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final p(Lcom/google/android/gms/internal/ads/bB0;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bB0;->m:Lcom/google/android/gms/internal/ads/bB0;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/bB0;->u()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bB0;->m:Lcom/google/android/gms/internal/ads/bB0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/bB0;->v()V

    return-void
.end method

.method public final q(J)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/bB0;->p:J

    return-void
.end method

.method public final r()V
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    instance-of v1, v0, Lcom/google/android/gms/internal/ads/oH0;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/cB0;->d:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v3

    if-nez v3, :cond_0

    const-wide/high16 v1, -0x8000000000000000L

    :cond_0
    check-cast v0, Lcom/google/android/gms/internal/ads/oH0;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Lcom/google/android/gms/internal/ads/oH0;->m(JJ)V

    :cond_1
    return-void
.end method

.method public final s()Z
    .locals 7

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/bB0;->f:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/JH0;->b()J

    move-result-wide v3

    const-wide/high16 v5, -0x8000000000000000L

    cmp-long v0, v3, v5

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    move v1, v2

    :cond_2
    :goto_0
    return v1
.end method

.method public final t()Z
    .locals 7

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/bB0;->e:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/bB0;->s()Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/bB0;->c()J

    move-result-wide v3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/cB0;->b:J

    sub-long/2addr v3, v5

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v3, v5

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    move v1, v2

    :cond_2
    :goto_0
    return v1
.end method
