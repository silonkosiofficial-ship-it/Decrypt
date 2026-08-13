.class final Lcom/google/android/gms/internal/ads/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/L;
.implements Lcom/google/android/gms/internal/ads/e;


# instance fields
.field private final a:I

.field private final b:Ljava/util/ArrayList;

.field private final c:Lcom/google/android/gms/internal/ads/l;

.field private d:Lcom/google/android/gms/internal/ads/D;

.field private e:J

.field private f:J

.field private g:J

.field private h:J

.field private i:Z

.field private j:J

.field private k:Z

.field private l:Z

.field private m:J

.field private n:Lcom/google/android/gms/internal/ads/I;

.field private o:Ljava/util/concurrent/Executor;

.field final synthetic p:Lcom/google/android/gms/internal/ads/j;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/j;Landroid/content/Context;)V
    .locals 0

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/d;->p:Lcom/google/android/gms/internal/ads/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/EW;->k(Landroid/content/Context;)Z

    move-result p1

    const/4 p2, 0x1

    if-eq p2, p1, :cond_0

    const/4 p2, 0x5

    :cond_0
    iput p2, p0, Lcom/google/android/gms/internal/ads/d;->a:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/d;->b:Ljava/util/ArrayList;

    new-instance p1, Lcom/google/android/gms/internal/ads/l;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/l;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/d;->c:Lcom/google/android/gms/internal/ads/l;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/d;->j:J

    sget-object p1, Lcom/google/android/gms/internal/ads/I;->a:Lcom/google/android/gms/internal/ads/I;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/d;->n:Lcom/google/android/gms/internal/ads/I;

    invoke-static {}, Lcom/google/android/gms/internal/ads/j;->k()Ljava/util/concurrent/Executor;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/d;->o:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private final h()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->d:Lcom/google/android/gms/internal/ads/D;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->b:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->d:Lcom/google/android/gms/internal/ads/D;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/D;->b()Lcom/google/android/gms/internal/ads/oK0;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/D;->C:Lcom/google/android/gms/internal/ads/PA0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/j;->b(Lcom/google/android/gms/internal/ads/PA0;)Lcom/google/android/gms/internal/ads/PA0;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/oK0;->b(Lcom/google/android/gms/internal/ads/PA0;)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0
.end method


# virtual methods
.method public final A(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->p:Lcom/google/android/gms/internal/ads/j;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/j;->g(Lcom/google/android/gms/internal/ads/j;)Lcom/google/android/gms/internal/ads/L;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/L;->A(I)V

    return-void
.end method

.method public final F0(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->p:Lcom/google/android/gms/internal/ads/j;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/j;->g(Lcom/google/android/gms/internal/ads/j;)Lcom/google/android/gms/internal/ads/L;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/L;->F0(Z)V

    return-void
.end method

.method public final G0(Z)Z
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/d;->p:Lcom/google/android/gms/internal/ads/j;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/j;->u(Lcom/google/android/gms/internal/ads/j;Z)Z

    move-result p1

    return p1
.end method

.method public final H0(Z)V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/d;->k:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/d;->j:J

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/d;->p:Lcom/google/android/gms/internal/ads/j;

    invoke-static {v2, p1}, Lcom/google/android/gms/internal/ads/j;->l(Lcom/google/android/gms/internal/ads/j;Z)V

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/d;->m:J

    return-void
.end method

.method public final I0(ILcom/google/android/gms/internal/ads/D;)V
    .locals 5

    .prologue
    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/d;->d:Lcom/google/android/gms/internal/ads/D;

    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/d;->k:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v2, 0x1

    if-nez p2, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/d;->h()V

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/d;->k:Z

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/d;->l:Z

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/d;->m:J

    return-void

    :cond_0
    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/d;->j:J

    cmp-long p2, v3, v0

    if-eqz p2, :cond_1

    move p1, v2

    :cond_1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/d;->l:Z

    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/d;->j:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/d;->m:J

    return-void
.end method

.method public final J0(JJJJ)V
    .locals 5

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/d;->i:Z

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/d;->f:J

    cmp-long v1, v1, p3

    const/4 v2, 0x1

    if-nez v1, :cond_1

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/d;->g:J

    cmp-long v1, v3, p5

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    or-int/2addr v0, v2

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/d;->i:Z

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/d;->e:J

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/d;->f:J

    iput-wide p5, p0, Lcom/google/android/gms/internal/ads/d;->g:J

    iput-wide p7, p0, Lcom/google/android/gms/internal/ads/d;->h:J

    return-void
.end method

.method public final K0(Lcom/google/android/gms/internal/ads/k;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->p:Lcom/google/android/gms/internal/ads/j;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/j;->o(Lcom/google/android/gms/internal/ads/j;Lcom/google/android/gms/internal/ads/k;)V

    return-void
.end method

.method public final L0(Landroid/view/Surface;Lcom/google/android/gms/internal/ads/UR;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->p:Lcom/google/android/gms/internal/ads/j;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/j;->s(Landroid/view/Surface;Lcom/google/android/gms/internal/ads/UR;)V

    return-void
.end method

.method public final M0(Lcom/google/android/gms/internal/ads/D;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->p:Lcom/google/android/gms/internal/ads/j;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/j;->c(Lcom/google/android/gms/internal/ads/j;Lcom/google/android/gms/internal/ads/D;)Lcom/google/android/gms/internal/ads/Mr;

    return-void
.end method

.method public final N0(JJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->p:Lcom/google/android/gms/internal/ads/j;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/j;->m(Lcom/google/android/gms/internal/ads/j;JJ)V

    return-void
.end method

.method public final O0(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->p:Lcom/google/android/gms/internal/ads/j;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/j;->g(Lcom/google/android/gms/internal/ads/j;)Lcom/google/android/gms/internal/ads/L;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/L;->O0(Z)V

    return-void
.end method

.method public final P0(Ljava/util/List;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/d;->b:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->p:Lcom/google/android/gms/internal/ads/j;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/j;->i(Lcom/google/android/gms/internal/ads/j;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/d;->h()V

    return-void
.end method

.method public final Q0(JZJJLcom/google/android/gms/internal/ads/J;)Z
    .locals 15

    .prologue
    move-object v1, p0

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    iget-wide v2, v1, Lcom/google/android/gms/internal/ads/d;->g:J

    sub-long v2, p1, v2

    :try_start_0
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/d;->p:Lcom/google/android/gms/internal/ads/j;

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/j;->f(Lcom/google/android/gms/internal/ads/j;)Lcom/google/android/gms/internal/ads/n;

    move-result-object v4

    iget-wide v11, v1, Lcom/google/android/gms/internal/ads/d;->e:J

    iget-object v14, v1, Lcom/google/android/gms/internal/ads/d;->c:Lcom/google/android/gms/internal/ads/l;

    move-wide v5, v2

    move-wide/from16 v7, p4

    move-wide/from16 v9, p6

    move/from16 v13, p3

    invoke-virtual/range {v4 .. v14}, Lcom/google/android/gms/internal/ads/n;->a(JJJJZLcom/google/android/gms/internal/ads/l;)I

    move-result v4
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/Qz0; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v5, 0x4

    if-ne v4, v5, :cond_0

    goto :goto_1

    :cond_0
    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/d;->h:J

    cmp-long v2, v2, v4

    if-gez v2, :cond_2

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    move-object/from16 v0, p8

    check-cast v0, Lcom/google/android/gms/internal/ads/BK0;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/BK0;->d:Lcom/google/android/gms/internal/ads/HK0;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/BK0;->a:Lcom/google/android/gms/internal/ads/xG0;

    iget v4, v0, Lcom/google/android/gms/internal/ads/BK0;->b:I

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/BK0;->c:J

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/google/android/gms/internal/ads/HK0;->c1(Lcom/google/android/gms/internal/ads/xG0;IJ)V

    const/4 v0, 0x1

    return v0

    :cond_2
    :goto_0
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/d;->p:Lcom/google/android/gms/internal/ads/j;

    move-wide/from16 v3, p4

    move-wide/from16 v5, p6

    invoke-static {v2, v3, v4, v5, v6}, Lcom/google/android/gms/internal/ads/j;->m(Lcom/google/android/gms/internal/ads/j;JJ)V

    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/d;->l:Z

    if-eqz v2, :cond_4

    iget-wide v2, v1, Lcom/google/android/gms/internal/ads/d;->m:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    if-eqz v6, :cond_3

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/d;->p:Lcom/google/android/gms/internal/ads/j;

    invoke-static {v6, v2, v3}, Lcom/google/android/gms/internal/ads/j;->t(Lcom/google/android/gms/internal/ads/j;J)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    return v0

    :cond_3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/d;->h()V

    iput-boolean v0, v1, Lcom/google/android/gms/internal/ads/d;->l:Z

    iput-wide v4, v1, Lcom/google/android/gms/internal/ads/d;->m:J

    :cond_4
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0

    :catch_0
    move-exception v0

    new-instance v2, Lcom/google/android/gms/internal/ads/K;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/d;->d:Lcom/google/android/gms/internal/ads/D;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v2, v0, v3}, Lcom/google/android/gms/internal/ads/K;-><init>(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/D;)V

    throw v2
.end method

.method public final R0(Lcom/google/android/gms/internal/ads/I;Ljava/util/concurrent/Executor;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/d;->n:Lcom/google/android/gms/internal/ads/I;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/d;->o:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public final a()Landroid/view/Surface;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->p:Lcom/google/android/gms/internal/ads/j;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/j;->p()V

    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->p:Lcom/google/android/gms/internal/ads/j;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/j;->g(Lcom/google/android/gms/internal/ads/j;)Lcom/google/android/gms/internal/ads/L;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/L;->c()V

    return-void
.end method

.method public final d(Lcom/google/android/gms/internal/ads/j;)V
    .locals 2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/d;->n:Lcom/google/android/gms/internal/ads/I;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->o:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/internal/ads/c;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/c;-><init>(Lcom/google/android/gms/internal/ads/d;Lcom/google/android/gms/internal/ads/I;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/ads/j;)V
    .locals 2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/d;->n:Lcom/google/android/gms/internal/ads/I;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->o:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/internal/ads/RK0;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/RK0;-><init>(Lcom/google/android/gms/internal/ads/d;Lcom/google/android/gms/internal/ads/I;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final f(Lcom/google/android/gms/internal/ads/j;Lcom/google/android/gms/internal/ads/Os;)V
    .locals 2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/d;->n:Lcom/google/android/gms/internal/ads/I;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->o:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/internal/ads/QK0;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/QK0;-><init>(Lcom/google/android/gms/internal/ads/d;Lcom/google/android/gms/internal/ads/I;Lcom/google/android/gms/internal/ads/Os;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final g()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->p:Lcom/google/android/gms/internal/ads/j;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/j;->g(Lcom/google/android/gms/internal/ads/j;)Lcom/google/android/gms/internal/ads/L;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/L;->g()V

    return-void
.end method

.method public final j()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->p:Lcom/google/android/gms/internal/ads/j;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/j;->g(Lcom/google/android/gms/internal/ads/j;)Lcom/google/android/gms/internal/ads/L;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/L;->j()V

    return-void
.end method

.method public final k()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->p:Lcom/google/android/gms/internal/ads/j;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/j;->g(Lcom/google/android/gms/internal/ads/j;)Lcom/google/android/gms/internal/ads/L;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/L;->k()V

    return-void
.end method

.method public final l()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->p:Lcom/google/android/gms/internal/ads/j;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/j;->r()V

    return-void
.end method

.method public final v()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final w0(F)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d;->p:Lcom/google/android/gms/internal/ads/j;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/j;->n(Lcom/google/android/gms/internal/ads/j;F)V

    return-void
.end method

.method public final z()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
