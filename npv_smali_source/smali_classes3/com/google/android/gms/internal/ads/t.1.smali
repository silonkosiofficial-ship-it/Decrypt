.class final Lcom/google/android/gms/internal/ads/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/n;

.field private final b:Lcom/google/android/gms/internal/ads/l;

.field private final c:Lcom/google/android/gms/internal/ads/AU;

.field private final d:Lcom/google/android/gms/internal/ads/AU;

.field private final e:Lcom/google/android/gms/internal/ads/gN;

.field private f:Lcom/google/android/gms/internal/ads/Os;

.field private g:Lcom/google/android/gms/internal/ads/Os;

.field private h:J

.field private i:J

.field private final j:Lcom/google/android/gms/internal/ads/PK0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/PK0;Lcom/google/android/gms/internal/ads/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/t;->j:Lcom/google/android/gms/internal/ads/PK0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/t;->a:Lcom/google/android/gms/internal/ads/n;

    new-instance p1, Lcom/google/android/gms/internal/ads/l;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/l;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/t;->b:Lcom/google/android/gms/internal/ads/l;

    new-instance p1, Lcom/google/android/gms/internal/ads/AU;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/AU;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/t;->c:Lcom/google/android/gms/internal/ads/AU;

    new-instance p1, Lcom/google/android/gms/internal/ads/AU;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/AU;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/t;->d:Lcom/google/android/gms/internal/ads/AU;

    new-instance p1, Lcom/google/android/gms/internal/ads/gN;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/gN;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/t;->e:Lcom/google/android/gms/internal/ads/gN;

    sget-object p1, Lcom/google/android/gms/internal/ads/Os;->d:Lcom/google/android/gms/internal/ads/Os;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/t;->g:Lcom/google/android/gms/internal/ads/Os;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/t;->i:J

    return-void
.end method

.method private static e(Lcom/google/android/gms/internal/ads/AU;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/AU;->a()I

    move-result v0

    const/4 v1, 0x1

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->d(Z)V

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/AU;->a()I

    move-result v0

    if-le v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/AU;->b()Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/AU;->b()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t;->e:Lcom/google/android/gms/internal/ads/gN;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gN;->c()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/t;->i:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t;->d:Lcom/google/android/gms/internal/ads/AU;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/AU;->a()I

    move-result v1

    if-lez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/t;->e(Lcom/google/android/gms/internal/ads/AU;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/t;->d:Lcom/google/android/gms/internal/ads/AU;

    const-wide/16 v2, 0x0

    invoke-virtual {v1, v2, v3, v0}, Lcom/google/android/gms/internal/ads/AU;->d(JLjava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t;->f:Lcom/google/android/gms/internal/ads/Os;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t;->c:Lcom/google/android/gms/internal/ads/AU;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/AU;->a()I

    move-result v1

    if-lez v1, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/t;->e(Lcom/google/android/gms/internal/ads/AU;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Os;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/t;->f:Lcom/google/android/gms/internal/ads/Os;

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t;->c:Lcom/google/android/gms/internal/ads/AU;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/AU;->e()V

    return-void
.end method

.method public final b(II)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/Os;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/Os;-><init>(IIF)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/t;->f:Lcom/google/android/gms/internal/ads/Os;

    return-void
.end method

.method public final c(JJ)V
    .locals 16

    .prologue
    move-object/from16 v0, p0

    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/t;->e:Lcom/google/android/gms/internal/ads/gN;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/gN;->d()Z

    move-result v2

    if-nez v2, :cond_7

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/t;->d:Lcom/google/android/gms/internal/ads/AU;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/gN;->a()J

    move-result-wide v14

    invoke-virtual {v2, v14, v15}, Lcom/google/android/gms/internal/ads/AU;->c(J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/t;->h:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/t;->h:J

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/t;->a:Lcom/google/android/gms/internal/ads/n;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/n;->f()V

    :cond_0
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/t;->a:Lcom/google/android/gms/internal/ads/n;

    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/t;->h:J

    const/4 v12, 0x0

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/t;->b:Lcom/google/android/gms/internal/ads/l;

    move-wide v4, v14

    move-wide/from16 v6, p1

    move-wide/from16 v8, p3

    invoke-virtual/range {v3 .. v13}, Lcom/google/android/gms/internal/ads/n;->a(JJJJZLcom/google/android/gms/internal/ads/l;)I

    move-result v1

    if-eqz v1, :cond_3

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_1

    goto/16 :goto_5

    :cond_1
    iput-wide v14, v0, Lcom/google/android/gms/internal/ads/t;->i:J

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/t;->e:Lcom/google/android/gms/internal/ads/gN;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/gN;->b()J

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/t;->j:Lcom/google/android/gms/internal/ads/PK0;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/PK0;->b:Lcom/google/android/gms/internal/ads/j;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/j;->j(Lcom/google/android/gms/internal/ads/j;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/e;

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/PK0;->b:Lcom/google/android/gms/internal/ads/j;

    invoke-interface {v3, v4}, Lcom/google/android/gms/internal/ads/e;->d(Lcom/google/android/gms/internal/ads/j;)V

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    throw v1

    :cond_3
    iput-wide v14, v0, Lcom/google/android/gms/internal/ads/t;->i:J

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/t;->e:Lcom/google/android/gms/internal/ads/gN;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/gN;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/t;->c:Lcom/google/android/gms/internal/ads/AU;

    invoke-virtual {v2, v6, v7}, Lcom/google/android/gms/internal/ads/AU;->c(J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/Os;

    if-nez v2, :cond_4

    goto :goto_2

    :cond_4
    sget-object v3, Lcom/google/android/gms/internal/ads/Os;->d:Lcom/google/android/gms/internal/ads/Os;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/Os;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/t;->g:Lcom/google/android/gms/internal/ads/Os;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/Os;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/t;->g:Lcom/google/android/gms/internal/ads/Os;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/t;->j:Lcom/google/android/gms/internal/ads/PK0;

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/PK0;->a(Lcom/google/android/gms/internal/ads/Os;)V

    :cond_5
    :goto_2
    if-nez v1, :cond_6

    const-wide/16 v1, -0x1

    :goto_3
    move-wide v4, v1

    goto :goto_4

    :cond_6
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/t;->b:Lcom/google/android/gms/internal/ads/l;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/l;->d()J

    move-result-wide v1

    goto :goto_3

    :goto_4
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/t;->j:Lcom/google/android/gms/internal/ads/PK0;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/t;->a:Lcom/google/android/gms/internal/ads/n;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/n;->p()Z

    move-result v8

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/internal/ads/PK0;->b(JJZ)V

    goto/16 :goto_0

    :cond_7
    :goto_5
    return-void
.end method

.method public final d(J)Z
    .locals 4

    .prologue
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/t;->i:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    cmp-long p1, v0, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
