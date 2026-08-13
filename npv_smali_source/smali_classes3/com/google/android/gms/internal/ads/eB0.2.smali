.class final Lcom/google/android/gms/internal/ads/eB0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/pl;

.field private final b:Lcom/google/android/gms/internal/ads/Ql;

.field private final c:Lcom/google/android/gms/internal/ads/KB0;

.field private final d:Lcom/google/android/gms/internal/ads/xI;

.field private e:J

.field private f:I

.field private g:Z

.field private h:Lcom/google/android/gms/internal/ads/aA0;

.field private i:Lcom/google/android/gms/internal/ads/bB0;

.field private j:Lcom/google/android/gms/internal/ads/bB0;

.field private k:Lcom/google/android/gms/internal/ads/bB0;

.field private l:Lcom/google/android/gms/internal/ads/bB0;

.field private m:I

.field private n:Ljava/lang/Object;

.field private o:J

.field private p:Ljava/util/List;

.field private final q:Lcom/google/android/gms/internal/ads/JA0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/KB0;Lcom/google/android/gms/internal/ads/xI;Lcom/google/android/gms/internal/ads/JA0;Lcom/google/android/gms/internal/ads/aA0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/eB0;->c:Lcom/google/android/gms/internal/ads/KB0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/eB0;->d:Lcom/google/android/gms/internal/ads/xI;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/eB0;->q:Lcom/google/android/gms/internal/ads/JA0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/eB0;->h:Lcom/google/android/gms/internal/ads/aA0;

    new-instance p1, Lcom/google/android/gms/internal/ads/pl;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/pl;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    new-instance p1, Lcom/google/android/gms/internal/ads/Ql;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/Ql;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/eB0;->b:Lcom/google/android/gms/internal/ads/Ql;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/eB0;->p:Ljava/util/List;

    return-void
.end method

.method static C(JJ)Z
    .locals 2

    .prologue
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p0, v0

    if-eqz v0, :cond_1

    cmp-long p0, p0, p2

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private final K(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;I)J
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/pl;->g(I)J

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/pl;->g:Lcom/google/android/gms/internal/ads/Cc;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/Cc;->a(I)Lcom/google/android/gms/internal/ads/a;

    move-result-object p1

    iget-wide p1, p1, Lcom/google/android/gms/internal/ads/a;->g:J

    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method private final a(Ljava/lang/Object;)J
    .locals 3

    .prologue
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/eB0;->p:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/eB0;->p:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/bB0;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/bB0;->b:Ljava/lang/Object;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/LH0;->d:J

    return-wide v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method private final b(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/bB0;J)Lcom/google/android/gms/internal/ads/cB0;
    .locals 17

    .prologue
    move-object/from16 v9, p0

    move-object/from16 v8, p1

    move-object/from16 v10, p2

    iget-object v11, v10, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/bB0;->e()J

    move-result-wide v0

    iget-wide v2, v11, Lcom/google/android/gms/internal/ads/cB0;->e:J

    add-long/2addr v0, v2

    iget-boolean v2, v11, Lcom/google/android/gms/internal/ads/cB0;->g:Z

    sub-long v6, v0, p3

    const/4 v12, -0x1

    if-eqz v2, :cond_6

    iget-object v0, v11, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/ads/qm;->a(Ljava/lang/Object;)I

    move-result v1

    iget v3, v9, Lcom/google/android/gms/internal/ads/eB0;->f:I

    iget-boolean v2, v9, Lcom/google/android/gms/internal/ads/eB0;->g:Z

    iget-object v0, v9, Lcom/google/android/gms/internal/ads/eB0;->b:Lcom/google/android/gms/internal/ads/Ql;

    iget-object v4, v9, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    move-object v5, v0

    move-object/from16 v0, p1

    move/from16 v16, v2

    move-object v2, v4

    move v4, v3

    move-object v3, v5

    const-wide/16 v13, 0x0

    move/from16 v5, v16

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/qm;->i(ILcom/google/android/gms/internal/ads/pl;Lcom/google/android/gms/internal/ads/Ql;IZ)I

    move-result v0

    if-ne v0, v12, :cond_0

    :goto_0
    const/4 v13, 0x0

    goto/16 :goto_5

    :cond_0
    iget-object v1, v9, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    const/4 v2, 0x1

    invoke-virtual {v8, v0, v1, v2}, Lcom/google/android/gms/internal/ads/qm;->d(ILcom/google/android/gms/internal/ads/pl;Z)Lcom/google/android/gms/internal/ads/pl;

    move-result-object v1

    iget v3, v1, Lcom/google/android/gms/internal/ads/pl;->c:I

    iget-object v1, v9, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/pl;->b:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-wide v4, v2, Lcom/google/android/gms/internal/ads/LH0;->d:J

    iget-object v2, v9, Lcom/google/android/gms/internal/ads/eB0;->b:Lcom/google/android/gms/internal/ads/Ql;

    invoke-virtual {v8, v3, v2, v13, v14}, Lcom/google/android/gms/internal/ads/qm;->e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;

    move-result-object v2

    iget v2, v2, Lcom/google/android/gms/internal/ads/Ql;->m:I

    if-ne v2, v0, :cond_4

    iget-object v1, v9, Lcom/google/android/gms/internal/ads/eB0;->b:Lcom/google/android/gms/internal/ads/Ql;

    iget-object v2, v9, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    invoke-static {v13, v14, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/qm;->m(Lcom/google/android/gms/internal/ads/Ql;Lcom/google/android/gms/internal/ads/pl;IJJ)Landroid/util/Pair;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/bB0;->b:Ljava/lang/Object;

    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/LH0;->d:J

    :cond_2
    :goto_1
    move-wide v15, v2

    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_2

    :cond_3
    invoke-direct {v9, v1}, Lcom/google/android/gms/internal/ads/eB0;->a(Ljava/lang/Object;)J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_2

    iget-wide v4, v9, Lcom/google/android/gms/internal/ads/eB0;->e:J

    const-wide/16 v6, 0x1

    add-long/2addr v6, v4

    iput-wide v6, v9, Lcom/google/android/gms/internal/ads/eB0;->e:J

    goto :goto_1

    :cond_4
    move-wide v15, v13

    :goto_2
    iget-object v6, v9, Lcom/google/android/gms/internal/ads/eB0;->b:Lcom/google/android/gms/internal/ads/Ql;

    iget-object v7, v9, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    move-object/from16 v0, p1

    move-wide v2, v15

    invoke-static/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/eB0;->f(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;JJLcom/google/android/gms/internal/ads/Ql;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/LH0;

    move-result-object v2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v13, v0

    if-eqz v3, :cond_5

    iget-wide v3, v11, Lcom/google/android/gms/internal/ads/cB0;->c:J

    cmp-long v0, v3, v0

    if-eqz v0, :cond_5

    iget-object v0, v11, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget-object v1, v9, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v8, v0, v1}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pl;->b()I

    iget-object v0, v9, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/pl;->g:Lcom/google/android/gms/internal/ads/Cc;

    iget v0, v0, Lcom/google/android/gms/internal/ads/Cc;->c:I

    :cond_5
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v3, v13

    move-wide v5, v15

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/eB0;->c(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;JJ)Lcom/google/android/gms/internal/ads/cB0;

    move-result-object v13

    goto/16 :goto_5

    :cond_6
    const-wide/16 v13, 0x0

    iget-object v10, v11, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v0, v10, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget-object v1, v9, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v8, v0, v1}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/LH0;->b()Z

    move-result v0

    if-eqz v0, :cond_b

    iget v3, v10, Lcom/google/android/gms/internal/ads/LH0;->b:I

    iget-object v0, v9, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/pl;->a(I)I

    move-result v0

    if-ne v0, v12, :cond_7

    goto/16 :goto_0

    :cond_7
    iget-object v0, v9, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    iget v1, v10, Lcom/google/android/gms/internal/ads/LH0;->c:I

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/pl;->g:Lcom/google/android/gms/internal/ads/Cc;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/Cc;->a(I)Lcom/google/android/gms/internal/ads/a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/a;->a(I)I

    move-result v4

    if-gez v4, :cond_8

    iget-object v2, v10, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget-wide v5, v11, Lcom/google/android/gms/internal/ads/cB0;->c:J

    :goto_3
    iget-wide v10, v10, Lcom/google/android/gms/internal/ads/LH0;->d:J

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v7, v10

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/ads/eB0;->d(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;IIJJ)Lcom/google/android/gms/internal/ads/cB0;

    move-result-object v13

    goto/16 :goto_5

    :cond_8
    iget-wide v0, v11, Lcom/google/android/gms/internal/ads/cB0;->c:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-nez v2, :cond_a

    iget-object v1, v9, Lcom/google/android/gms/internal/ads/eB0;->b:Lcom/google/android/gms/internal/ads/Ql;

    iget-object v2, v9, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    iget v3, v2, Lcom/google/android/gms/internal/ads/pl;->c:I

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    invoke-static {v13, v14, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/qm;->m(Lcom/google/android/gms/internal/ads/Ql;Lcom/google/android/gms/internal/ads/pl;IJJ)Landroid/util/Pair;

    move-result-object v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :cond_a
    iget-object v2, v10, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget v3, v10, Lcom/google/android/gms/internal/ads/LH0;->b:I

    invoke-direct {v9, v8, v2, v3}, Lcom/google/android/gms/internal/ads/eB0;->K(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;I)J

    iget-object v2, v10, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    invoke-static {v13, v14, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    iget-wide v5, v11, Lcom/google/android/gms/internal/ads/cB0;->c:J

    iget-wide v10, v10, Lcom/google/android/gms/internal/ads/LH0;->d:J

    :goto_4
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v7, v10

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/ads/eB0;->e(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;JJJ)Lcom/google/android/gms/internal/ads/cB0;

    move-result-object v13

    goto :goto_5

    :cond_b
    iget v0, v10, Lcom/google/android/gms/internal/ads/LH0;->e:I

    if-eq v0, v12, :cond_c

    iget-object v1, v9, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/pl;->j(I)Z

    :cond_c
    iget-object v0, v9, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    iget v1, v10, Lcom/google/android/gms/internal/ads/LH0;->e:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/pl;->e(I)I

    move-result v4

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/pl;->k(I)Z

    iget-object v0, v9, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    iget v1, v10, Lcom/google/android/gms/internal/ads/LH0;->e:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/pl;->a(I)I

    move-result v0

    if-eq v4, v0, :cond_d

    iget-object v2, v10, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget v3, v10, Lcom/google/android/gms/internal/ads/LH0;->e:I

    iget-wide v5, v11, Lcom/google/android/gms/internal/ads/cB0;->e:J

    goto :goto_3

    :cond_d
    iget-object v0, v10, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget v1, v10, Lcom/google/android/gms/internal/ads/LH0;->e:I

    invoke-direct {v9, v8, v0, v1}, Lcom/google/android/gms/internal/ads/eB0;->K(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;I)J

    iget-object v2, v10, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget-wide v5, v11, Lcom/google/android/gms/internal/ads/cB0;->e:J

    iget-wide v10, v10, Lcom/google/android/gms/internal/ads/LH0;->d:J

    const-wide/16 v3, 0x0

    goto :goto_4

    :goto_5
    return-object v13
.end method

.method private final c(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;JJ)Lcom/google/android/gms/internal/ads/cB0;
    .locals 12

    .prologue
    move-object v0, p2

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    move-object v11, p0

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    move-object v3, p1

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/LH0;->b()Z

    move-result v1

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    if-eqz v1, :cond_0

    iget v5, v0, Lcom/google/android/gms/internal/ads/LH0;->b:I

    iget v6, v0, Lcom/google/android/gms/internal/ads/LH0;->c:I

    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/LH0;->d:J

    move-object v2, p0

    move-object v3, p1

    move-wide v7, p3

    invoke-direct/range {v2 .. v10}, Lcom/google/android/gms/internal/ads/eB0;->d(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;IIJJ)Lcom/google/android/gms/internal/ads/cB0;

    move-result-object v0

    return-object v0

    :cond_0
    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/LH0;->d:J

    move-object v2, p0

    move-object v3, p1

    move-wide/from16 v5, p5

    move-wide v7, p3

    invoke-direct/range {v2 .. v10}, Lcom/google/android/gms/internal/ads/eB0;->e(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;JJJ)Lcom/google/android/gms/internal/ads/cB0;

    move-result-object v0

    return-object v0
.end method

.method private final d(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;IIJJ)Lcom/google/android/gms/internal/ads/cB0;
    .locals 18

    .prologue
    move-object/from16 v0, p0

    new-instance v7, Lcom/google/android/gms/internal/ads/LH0;

    move-object v1, v7

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-wide/from16 v5, p7

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/LH0;-><init>(Ljava/lang/Object;IIJ)V

    iget-object v1, v7, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget v2, v7, Lcom/google/android/gms/internal/ads/LH0;->b:I

    iget v3, v7, Lcom/google/android/gms/internal/ads/LH0;->c:I

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    move-object/from16 v5, p1

    invoke-virtual {v5, v1, v4}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/pl;->f(II)J

    move-result-wide v9

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    move/from16 v2, p3

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/pl;->e(I)I

    move-result v1

    move/from16 v2, p4

    if-ne v2, v1, :cond_0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/pl;->h()J

    :cond_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    iget v2, v7, Lcom/google/android/gms/internal/ads/LH0;->b:I

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/pl;->k(I)Z

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v9, v1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_1

    cmp-long v1, v9, v2

    if-gtz v1, :cond_1

    const-wide/16 v4, -0x1

    add-long/2addr v4, v9

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    move-wide v3, v1

    goto :goto_0

    :cond_1
    move-wide v3, v2

    :goto_0
    new-instance v15, Lcom/google/android/gms/internal/ads/cB0;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v1, v15

    move-object v2, v7

    move-wide/from16 v5, p5

    move-wide v7, v11

    move/from16 v11, v16

    move/from16 v12, v17

    invoke-direct/range {v1 .. v14}, Lcom/google/android/gms/internal/ads/cB0;-><init>(Lcom/google/android/gms/internal/ads/LH0;JJJJZZZZ)V

    return-object v15
.end method

.method private final e(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;JJJ)Lcom/google/android/gms/internal/ads/cB0;
    .locals 22

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-wide/from16 v3, p3

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v1, v2, v5}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v5, v3, v4}, Lcom/google/android/gms/internal/ads/pl;->c(J)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_0

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v7, v5}, Lcom/google/android/gms/internal/ads/pl;->j(I)Z

    :cond_0
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    if-ne v5, v6, :cond_1

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/pl;->b()I

    goto :goto_0

    :cond_1
    invoke-virtual {v7, v5}, Lcom/google/android/gms/internal/ads/pl;->k(I)Z

    :goto_0
    new-instance v9, Lcom/google/android/gms/internal/ads/LH0;

    move-wide/from16 v7, p7

    invoke-direct {v9, v2, v7, v8, v5}, Lcom/google/android/gms/internal/ads/LH0;-><init>(Ljava/lang/Object;JI)V

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/eB0;->k(Lcom/google/android/gms/internal/ads/LH0;)Z

    move-result v2

    invoke-direct {v0, v1, v9}, Lcom/google/android/gms/internal/ads/eB0;->i(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;)Z

    move-result v20

    invoke-direct {v0, v1, v9, v2}, Lcom/google/android/gms/internal/ads/eB0;->h(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;Z)Z

    move-result v21

    if-eq v5, v6, :cond_2

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/ads/pl;->k(I)Z

    :cond_2
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v10, 0x0

    if-eq v5, v6, :cond_3

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/ads/pl;->g(I)J

    move-wide v5, v10

    goto :goto_1

    :cond_3
    move-wide v5, v7

    :goto_1
    cmp-long v1, v5, v7

    if-eqz v1, :cond_4

    move-wide v14, v10

    move-wide/from16 v16, v14

    goto :goto_2

    :cond_4
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    iget-wide v12, v1, Lcom/google/android/gms/internal/ads/pl;->d:J

    move-wide v14, v5

    move-wide/from16 v16, v12

    :goto_2
    cmp-long v1, v16, v7

    if-eqz v1, :cond_5

    cmp-long v1, v3, v16

    if-ltz v1, :cond_5

    const-wide/16 v3, -0x1

    add-long v3, v16, v3

    invoke-static {v10, v11, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    :cond_5
    move-wide v10, v3

    new-instance v1, Lcom/google/android/gms/internal/ads/cB0;

    const/16 v18, 0x0

    move-object v8, v1

    move-wide/from16 v12, p5

    move/from16 v19, v2

    invoke-direct/range {v8 .. v21}, Lcom/google/android/gms/internal/ads/cB0;-><init>(Lcom/google/android/gms/internal/ads/LH0;JJJJZZZZ)V

    return-object v1
.end method

.method private static f(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;JJLcom/google/android/gms/internal/ads/Ql;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/LH0;
    .locals 9

    .prologue
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object/from16 v4, p7

    invoke-virtual {p0, p1, v4}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    iget v5, v4, Lcom/google/android/gms/internal/ads/pl;->c:I

    const-wide/16 v6, 0x0

    move-object v8, p6

    invoke-virtual {p0, v5, p6, v6, v7}, Lcom/google/android/gms/internal/ads/qm;->e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/qm;->a(Ljava/lang/Object;)I

    invoke-virtual/range {p7 .. p7}, Lcom/google/android/gms/internal/ads/pl;->b()I

    invoke-virtual {p0, p1, v4}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v4, p2, p3}, Lcom/google/android/gms/internal/ads/pl;->d(J)I

    move-result v5

    const/4 v0, -0x1

    if-ne v5, v0, :cond_0

    invoke-virtual {v4, p2, p3}, Lcom/google/android/gms/internal/ads/pl;->c(J)I

    move-result v0

    new-instance v2, Lcom/google/android/gms/internal/ads/LH0;

    move-wide v6, p4

    invoke-direct {v2, p1, p4, p5, v0}, Lcom/google/android/gms/internal/ads/LH0;-><init>(Ljava/lang/Object;JI)V

    return-object v2

    :cond_0
    move-wide v6, p4

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/pl;->e(I)I

    move-result v3

    new-instance v8, Lcom/google/android/gms/internal/ads/LH0;

    move-object v0, v8

    move-object v1, p1

    move v2, v5

    move-wide v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/LH0;-><init>(Ljava/lang/Object;IIJ)V

    return-object v8
.end method

.method private final g()V
    .locals 4

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/ads/Zh0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Zh0;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/eB0;->i:Lcom/google/android/gms/internal/ads/bB0;

    :goto_0
    if-eqz v1, :cond_0

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/Zh0;->g(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/Zh0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/eB0;->j:Lcom/google/android/gms/internal/ads/bB0;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/eB0;->d:Lcom/google/android/gms/internal/ads/xI;

    new-instance v3, Lcom/google/android/gms/internal/ads/dB0;

    invoke-direct {v3, p0, v0, v1}, Lcom/google/android/gms/internal/ads/dB0;-><init>(Lcom/google/android/gms/internal/ads/eB0;Lcom/google/android/gms/internal/ads/Zh0;Lcom/google/android/gms/internal/ads/LH0;)V

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/xI;->n(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private final h(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;Z)Z
    .locals 7

    .prologue
    iget-object p2, p2, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/qm;->a(Ljava/lang/Object;)I

    move-result v1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    const/4 v6, 0x0

    invoke-virtual {p1, v1, p2, v6}, Lcom/google/android/gms/internal/ads/qm;->d(ILcom/google/android/gms/internal/ads/pl;Z)Lcom/google/android/gms/internal/ads/pl;

    move-result-object p2

    iget p2, p2, Lcom/google/android/gms/internal/ads/pl;->c:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->b:Lcom/google/android/gms/internal/ads/Ql;

    const-wide/16 v2, 0x0

    invoke-virtual {p1, p2, v0, v2, v3}, Lcom/google/android/gms/internal/ads/qm;->e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;

    move-result-object p2

    iget-boolean p2, p2, Lcom/google/android/gms/internal/ads/Ql;->h:Z

    if-nez p2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/eB0;->b:Lcom/google/android/gms/internal/ads/Ql;

    iget v4, p0, Lcom/google/android/gms/internal/ads/eB0;->f:I

    iget-boolean v5, p0, Lcom/google/android/gms/internal/ads/eB0;->g:Z

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/qm;->i(ILcom/google/android/gms/internal/ads/pl;Lcom/google/android/gms/internal/ads/Ql;IZ)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v6
.end method

.method private final i(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;)Z
    .locals 5

    .prologue
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/eB0;->k(Lcom/google/android/gms/internal/ads/LH0;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/internal/ads/pl;->c:I

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/qm;->a(Ljava/lang/Object;)I

    move-result p2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/eB0;->b:Lcom/google/android/gms/internal/ads/Ql;

    const-wide/16 v3, 0x0

    invoke-virtual {p1, v0, v2, v3, v4}, Lcom/google/android/gms/internal/ads/qm;->e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;

    move-result-object p1

    iget p1, p1, Lcom/google/android/gms/internal/ads/Ql;->n:I

    if-ne p1, p2, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method private final j(Lcom/google/android/gms/internal/ads/qm;)Z
    .locals 8

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->i:Lcom/google/android/gms/internal/ads/bB0;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/bB0;->b:Ljava/lang/Object;

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ads/qm;->a(Ljava/lang/Object;)I

    move-result v2

    move v3, v2

    :goto_0
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/eB0;->b:Lcom/google/android/gms/internal/ads/Ql;

    iget v6, p0, Lcom/google/android/gms/internal/ads/eB0;->f:I

    iget-boolean v7, p0, Lcom/google/android/gms/internal/ads/eB0;->g:Z

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/qm;->i(ILcom/google/android/gms/internal/ads/pl;Lcom/google/android/gms/internal/ads/Ql;IZ)I

    move-result v3

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/cB0;->g:Z

    if-nez v2, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    const/4 v4, -0x1

    if-eq v3, v4, :cond_4

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    iget-object v4, v2, Lcom/google/android/gms/internal/ads/bB0;->b:Ljava/lang/Object;

    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/ads/qm;->a(Ljava/lang/Object;)I

    move-result v4

    if-eq v4, v3, :cond_3

    goto :goto_2

    :cond_3
    move-object v0, v2

    goto :goto_0

    :cond_4
    :goto_2
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/eB0;->F(Lcom/google/android/gms/internal/ads/bB0;)Z

    move-result v2

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    invoke-virtual {p0, p1, v3}, Lcom/google/android/gms/internal/ads/eB0;->u(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/cB0;)Lcom/google/android/gms/internal/ads/cB0;

    move-result-object p1

    iput-object p1, v0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    if-nez v2, :cond_5

    return v1

    :cond_5
    const/4 p1, 0x0

    return p1
.end method

.method private static final k(Lcom/google/android/gms/internal/ads/LH0;)Z
    .locals 1

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/LH0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget p0, p0, Lcom/google/android/gms/internal/ads/LH0;->e:I

    const/4 v0, -0x1

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final A()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/eB0;->p:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/eB0;->p:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/bB0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/bB0;->o()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->p:Ljava/util/List;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->l:Lcom/google/android/gms/internal/ads/bB0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/eB0;->y()V

    :cond_1
    return-void
.end method

.method public final B(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/aA0;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/eB0;->h:Lcom/google/android/gms/internal/ads/aA0;

    iget-wide p1, p2, Lcom/google/android/gms/internal/ads/aA0;->a:J

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/eB0;->A()V

    return-void
.end method

.method public final D(Lcom/google/android/gms/internal/ads/JH0;)Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->k:Lcom/google/android/gms/internal/ads/bB0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final E(Lcom/google/android/gms/internal/ads/JH0;)Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->l:Lcom/google/android/gms/internal/ads/bB0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final F(Lcom/google/android/gms/internal/ads/bB0;)Z
    .locals 2

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->k:Lcom/google/android/gms/internal/ads/bB0;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/eB0;->k:Lcom/google/android/gms/internal/ads/bB0;

    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->j:Lcom/google/android/gms/internal/ads/bB0;

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->i:Lcom/google/android/gms/internal/ads/bB0;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->j:Lcom/google/android/gms/internal/ads/bB0;

    const/4 v0, 0x1

    move v1, v0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/bB0;->o()V

    iget v0, p0, Lcom/google/android/gms/internal/ads/eB0;->m:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/eB0;->m:I

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/eB0;->k:Lcom/google/android/gms/internal/ads/bB0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/bB0;->p(Lcom/google/android/gms/internal/ads/bB0;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/eB0;->g()V

    return v1
.end method

.method public final G()Z
    .locals 8

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->k:Lcom/google/android/gms/internal/ads/bB0;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/cB0;->i:Z

    const/4 v3, 0x0

    if-nez v2, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->k:Lcom/google/android/gms/internal/ads/bB0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/cB0;->e:J

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v4, v6

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/ads/eB0;->m:I

    const/16 v2, 0x64

    if-ge v0, v2, :cond_0

    goto :goto_0

    :cond_0
    return v3

    :cond_1
    move v1, v3

    :cond_2
    :goto_0
    return v1
.end method

.method public final H(Lcom/google/android/gms/internal/ads/qm;JJ)Z
    .locals 15

    .prologue
    move-object v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/eB0;->i:Lcom/google/android/gms/internal/ads/bB0;

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-eqz v2, :cond_a

    iget-object v5, v2, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    const/4 v6, 0x0

    if-nez v3, :cond_0

    invoke-virtual {p0, v1, v5}, Lcom/google/android/gms/internal/ads/eB0;->u(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/cB0;)Lcom/google/android/gms/internal/ads/cB0;

    move-result-object v3

    move-wide/from16 v7, p2

    goto :goto_1

    :cond_0
    move-wide/from16 v7, p2

    invoke-direct {p0, v1, v3, v7, v8}, Lcom/google/android/gms/internal/ads/eB0;->b(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/bB0;J)Lcom/google/android/gms/internal/ads/cB0;

    move-result-object v9

    if-nez v9, :cond_2

    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/ads/eB0;->F(Lcom/google/android/gms/internal/ads/bB0;)Z

    move-result v1

    if-nez v1, :cond_1

    return v4

    :cond_1
    return v6

    :cond_2
    iget-wide v10, v5, Lcom/google/android/gms/internal/ads/cB0;->b:J

    iget-wide v12, v9, Lcom/google/android/gms/internal/ads/cB0;->b:J

    cmp-long v10, v10, v12

    if-nez v10, :cond_8

    iget-object v10, v5, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v11, v9, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    invoke-virtual {v10, v11}, Lcom/google/android/gms/internal/ads/LH0;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    move-object v3, v9

    :goto_1
    iget-wide v9, v5, Lcom/google/android/gms/internal/ads/cB0;->c:J

    invoke-virtual {v3, v9, v10}, Lcom/google/android/gms/internal/ads/cB0;->a(J)Lcom/google/android/gms/internal/ads/cB0;

    move-result-object v9

    iput-object v9, v2, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-wide v9, v5, Lcom/google/android/gms/internal/ads/cB0;->e:J

    iget-wide v11, v3, Lcom/google/android/gms/internal/ads/cB0;->e:J

    invoke-static {v9, v10, v11, v12}, Lcom/google/android/gms/internal/ads/eB0;->C(JJ)Z

    move-result v5

    if-nez v5, :cond_7

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/bB0;->r()V

    iget-wide v7, v3, Lcom/google/android/gms/internal/ads/cB0;->e:J

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v7, v9

    if-nez v1, :cond_3

    const-wide v7, 0x7fffffffffffffffL

    goto :goto_2

    :cond_3
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/bB0;->e()J

    move-result-wide v9

    add-long/2addr v7, v9

    :goto_2
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/eB0;->j:Lcom/google/android/gms/internal/ads/bB0;

    if-ne v2, v1, :cond_5

    iget-object v1, v2, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/ads/cB0;->f:Z

    const-wide/high16 v9, -0x8000000000000000L

    cmp-long v1, p4, v9

    if-eqz v1, :cond_4

    cmp-long v1, p4, v7

    if-ltz v1, :cond_5

    :cond_4
    move v1, v4

    goto :goto_3

    :cond_5
    move v1, v6

    :goto_3
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/eB0;->F(Lcom/google/android/gms/internal/ads/bB0;)Z

    move-result v2

    if-nez v2, :cond_6

    if-nez v1, :cond_6

    return v4

    :cond_6
    return v6

    :cond_7
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v3

    move-object v14, v3

    move-object v3, v2

    move-object v2, v14

    goto/16 :goto_0

    :cond_8
    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/ads/eB0;->F(Lcom/google/android/gms/internal/ads/bB0;)Z

    move-result v1

    if-nez v1, :cond_9

    return v4

    :cond_9
    return v6

    :cond_a
    return v4
.end method

.method public final I(Lcom/google/android/gms/internal/ads/qm;I)Z
    .locals 0

    iput p2, p0, Lcom/google/android/gms/internal/ads/eB0;->f:I

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/eB0;->j(Lcom/google/android/gms/internal/ads/qm;)Z

    move-result p1

    return p1
.end method

.method public final J(Lcom/google/android/gms/internal/ads/qm;Z)Z
    .locals 0

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/eB0;->g:Z

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/eB0;->j(Lcom/google/android/gms/internal/ads/qm;)Z

    move-result p1

    return p1
.end method

.method public final l()Lcom/google/android/gms/internal/ads/bB0;
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->i:Lcom/google/android/gms/internal/ads/bB0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/eB0;->j:Lcom/google/android/gms/internal/ads/bB0;

    if-ne v0, v2, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/eB0;->j:Lcom/google/android/gms/internal/ads/bB0;

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->o()V

    iget v0, p0, Lcom/google/android/gms/internal/ads/eB0;->m:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/eB0;->m:I

    if-nez v0, :cond_2

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/eB0;->k:Lcom/google/android/gms/internal/ads/bB0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->i:Lcom/google/android/gms/internal/ads/bB0;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/bB0;->b:Ljava/lang/Object;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/eB0;->n:Ljava/lang/Object;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/LH0;->d:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/eB0;->o:J

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->i:Lcom/google/android/gms/internal/ads/bB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->i:Lcom/google/android/gms/internal/ads/bB0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/eB0;->g()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->i:Lcom/google/android/gms/internal/ads/bB0;

    return-object v0
.end method

.method public final m()Lcom/google/android/gms/internal/ads/bB0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->j:Lcom/google/android/gms/internal/ads/bB0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->j:Lcom/google/android/gms/internal/ads/bB0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/eB0;->g()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->j:Lcom/google/android/gms/internal/ads/bB0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final n(Lcom/google/android/gms/internal/ads/cB0;)Lcom/google/android/gms/internal/ads/bB0;
    .locals 9

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->k:Lcom/google/android/gms/internal/ads/bB0;

    if-nez v0, :cond_0

    const-wide v0, 0xe8d4a51000L

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->e()J

    move-result-wide v1

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/cB0;->e:J

    add-long/2addr v1, v3

    iget-wide v3, p1, Lcom/google/android/gms/internal/ads/cB0;->b:J

    sub-long v0, v1, v3

    :goto_0
    const/4 v2, 0x0

    :goto_1
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/eB0;->p:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    if-ge v2, v3, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/eB0;->p:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/bB0;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-wide v5, v3, Lcom/google/android/gms/internal/ads/cB0;->e:J

    iget-wide v7, p1, Lcom/google/android/gms/internal/ads/cB0;->e:J

    invoke-static {v5, v6, v7, v8}, Lcom/google/android/gms/internal/ads/eB0;->C(JJ)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-wide v5, v3, Lcom/google/android/gms/internal/ads/cB0;->b:J

    iget-wide v7, p1, Lcom/google/android/gms/internal/ads/cB0;->b:J

    cmp-long v5, v5, v7

    if-nez v5, :cond_1

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v5, p1, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/LH0;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/eB0;->p:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/bB0;

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    move-object v2, v4

    :goto_2
    if-nez v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/eB0;->q:Lcom/google/android/gms/internal/ads/JA0;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/JA0;->a:Lcom/google/android/gms/internal/ads/SA0;

    invoke-static {v2, p1, v0, v1}, Lcom/google/android/gms/internal/ads/SA0;->Y(Lcom/google/android/gms/internal/ads/SA0;Lcom/google/android/gms/internal/ads/cB0;J)Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v2

    goto :goto_3

    :cond_3
    iput-object p1, v2, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/bB0;->q(J)V

    :goto_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/eB0;->k:Lcom/google/android/gms/internal/ads/bB0;

    if-eqz p1, :cond_4

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ads/bB0;->p(Lcom/google/android/gms/internal/ads/bB0;)V

    goto :goto_4

    :cond_4
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/eB0;->i:Lcom/google/android/gms/internal/ads/bB0;

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/eB0;->j:Lcom/google/android/gms/internal/ads/bB0;

    :goto_4
    iput-object v4, p0, Lcom/google/android/gms/internal/ads/eB0;->n:Ljava/lang/Object;

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/eB0;->k:Lcom/google/android/gms/internal/ads/bB0;

    iget p1, p0, Lcom/google/android/gms/internal/ads/eB0;->m:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/eB0;->m:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/eB0;->g()V

    return-object v2
.end method

.method public final o()Lcom/google/android/gms/internal/ads/bB0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->k:Lcom/google/android/gms/internal/ads/bB0;

    return-object v0
.end method

.method public final p()Lcom/google/android/gms/internal/ads/bB0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->i:Lcom/google/android/gms/internal/ads/bB0;

    return-object v0
.end method

.method public final q(Lcom/google/android/gms/internal/ads/JH0;)Lcom/google/android/gms/internal/ads/bB0;
    .locals 3

    .prologue
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/eB0;->p:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/eB0;->p:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/bB0;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/bB0;->a:Lcom/google/android/gms/internal/ads/JH0;

    if-ne v2, p1, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final r()Lcom/google/android/gms/internal/ads/bB0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->l:Lcom/google/android/gms/internal/ads/bB0;

    return-object v0
.end method

.method public final s()Lcom/google/android/gms/internal/ads/bB0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->j:Lcom/google/android/gms/internal/ads/bB0;

    return-object v0
.end method

.method public final t(JLcom/google/android/gms/internal/ads/sB0;)Lcom/google/android/gms/internal/ads/cB0;
    .locals 8

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->k:Lcom/google/android/gms/internal/ads/bB0;

    if-nez v0, :cond_0

    iget-object v2, p3, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    iget-object v3, p3, Lcom/google/android/gms/internal/ads/sB0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget-wide v4, p3, Lcom/google/android/gms/internal/ads/sB0;->c:J

    iget-wide v6, p3, Lcom/google/android/gms/internal/ads/sB0;->s:J

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/eB0;->c(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;JJ)Lcom/google/android/gms/internal/ads/cB0;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p3, p3, Lcom/google/android/gms/internal/ads/sB0;->a:Lcom/google/android/gms/internal/ads/qm;

    invoke-direct {p0, p3, v0, p1, p2}, Lcom/google/android/gms/internal/ads/eB0;->b(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/bB0;J)Lcom/google/android/gms/internal/ads/cB0;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final u(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/cB0;)Lcom/google/android/gms/internal/ads/cB0;
    .locals 18

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v2, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/eB0;->k(Lcom/google/android/gms/internal/ads/LH0;)Z

    move-result v12

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/ads/eB0;->i(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;)Z

    move-result v13

    invoke-direct {v0, v1, v3, v12}, Lcom/google/android/gms/internal/ads/eB0;->h(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/LH0;Z)Z

    move-result v14

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/LH0;->b()Z

    move-result v1

    const/4 v4, -0x1

    const-wide/16 v5, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v1, :cond_0

    iget v1, v3, Lcom/google/android/gms/internal/ads/LH0;->e:I

    if-ne v1, v4, :cond_1

    :cond_0
    move-wide v9, v7

    goto :goto_0

    :cond_1
    iget-object v9, v0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v9, v1}, Lcom/google/android/gms/internal/ads/pl;->g(I)J

    move-wide v9, v5

    :goto_0
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/LH0;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    iget v5, v3, Lcom/google/android/gms/internal/ads/LH0;->b:I

    iget v6, v3, Lcom/google/android/gms/internal/ads/LH0;->c:I

    invoke-virtual {v1, v5, v6}, Lcom/google/android/gms/internal/ads/pl;->f(II)J

    move-result-wide v5

    :goto_1
    move-wide v7, v9

    move-wide v9, v5

    goto :goto_2

    :cond_2
    cmp-long v1, v9, v7

    if-eqz v1, :cond_3

    move-wide v7, v5

    move-wide v9, v7

    goto :goto_2

    :cond_3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    iget-wide v5, v1, Lcom/google/android/gms/internal/ads/pl;->d:J

    goto :goto_1

    :goto_2
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/LH0;->b()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    iget v4, v3, Lcom/google/android/gms/internal/ads/LH0;->b:I

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/ads/pl;->k(I)Z

    goto :goto_3

    :cond_4
    iget v1, v3, Lcom/google/android/gms/internal/ads/LH0;->e:I

    if-eq v1, v4, :cond_5

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/ads/pl;->k(I)Z

    :cond_5
    :goto_3
    new-instance v15, Lcom/google/android/gms/internal/ads/cB0;

    iget-wide v4, v2, Lcom/google/android/gms/internal/ads/cB0;->b:J

    iget-wide v1, v2, Lcom/google/android/gms/internal/ads/cB0;->c:J

    const/4 v11, 0x0

    move-wide/from16 v16, v1

    move-object v1, v15

    move-object v2, v3

    move-wide v3, v4

    move-wide/from16 v5, v16

    invoke-direct/range {v1 .. v14}, Lcom/google/android/gms/internal/ads/cB0;-><init>(Lcom/google/android/gms/internal/ads/LH0;JJJJZZZZ)V

    return-object v15
.end method

.method public final v(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;J)Lcom/google/android/gms/internal/ads/LH0;
    .locals 10

    .prologue
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {p1, p2, v2}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    move-result-object v2

    iget v2, v2, Lcom/google/android/gms/internal/ads/pl;->c:I

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/eB0;->n:Ljava/lang/Object;

    const/4 v4, 0x0

    const/4 v5, -0x1

    if-eqz v3, :cond_1

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/qm;->a(Ljava/lang/Object;)I

    move-result v3

    if-eq v3, v5, :cond_1

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {p1, v3, v6, v4}, Lcom/google/android/gms/internal/ads/qm;->d(ILcom/google/android/gms/internal/ads/pl;Z)Lcom/google/android/gms/internal/ads/pl;

    move-result-object v3

    iget v3, v3, Lcom/google/android/gms/internal/ads/pl;->c:I

    if-ne v3, v2, :cond_1

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/eB0;->o:J

    :cond_0
    :goto_0
    move-wide v6, v2

    goto :goto_4

    :cond_1
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/eB0;->i:Lcom/google/android/gms/internal/ads/bB0;

    :goto_1
    if-eqz v3, :cond_3

    iget-object v6, v3, Lcom/google/android/gms/internal/ads/bB0;->b:Ljava/lang/Object;

    invoke-virtual {v6, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    :goto_2
    iget-object v2, v3, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-wide v2, v2, Lcom/google/android/gms/internal/ads/LH0;->d:J

    goto :goto_0

    :cond_2
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v3

    goto :goto_1

    :cond_3
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/eB0;->i:Lcom/google/android/gms/internal/ads/bB0;

    :goto_3
    if-eqz v3, :cond_5

    iget-object v6, v3, Lcom/google/android/gms/internal/ads/bB0;->b:Ljava/lang/Object;

    invoke-virtual {p1, v6}, Lcom/google/android/gms/internal/ads/qm;->a(Ljava/lang/Object;)I

    move-result v6

    if-eq v6, v5, :cond_4

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {p1, v6, v7, v4}, Lcom/google/android/gms/internal/ads/qm;->d(ILcom/google/android/gms/internal/ads/pl;Z)Lcom/google/android/gms/internal/ads/pl;

    move-result-object v6

    iget v6, v6, Lcom/google/android/gms/internal/ads/pl;->c:I

    if-ne v6, v2, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v3

    goto :goto_3

    :cond_5
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/eB0;->a(Ljava/lang/Object;)J

    move-result-wide v2

    const-wide/16 v6, -0x1

    cmp-long v4, v2, v6

    if-eqz v4, :cond_6

    goto :goto_0

    :cond_6
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/eB0;->e:J

    const-wide/16 v6, 0x1

    add-long/2addr v6, v2

    iput-wide v6, p0, Lcom/google/android/gms/internal/ads/eB0;->e:J

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/eB0;->i:Lcom/google/android/gms/internal/ads/bB0;

    if-nez v4, :cond_0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/eB0;->n:Ljava/lang/Object;

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/eB0;->o:J

    goto :goto_0

    :goto_4
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {p1, p2, v2}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/eB0;->b:Lcom/google/android/gms/internal/ads/Ql;

    iget v2, v2, Lcom/google/android/gms/internal/ads/pl;->c:I

    const-wide/16 v8, 0x0

    invoke-virtual {p1, v2, v3, v8, v9}, Lcom/google/android/gms/internal/ads/qm;->e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/qm;->a(Ljava/lang/Object;)I

    move-result v2

    move-object v1, p2

    :goto_5
    iget-object v8, p0, Lcom/google/android/gms/internal/ads/eB0;->b:Lcom/google/android/gms/internal/ads/Ql;

    iget v3, v8, Lcom/google/android/gms/internal/ads/Ql;->m:I

    if-lt v2, v3, :cond_8

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    const/4 v4, 0x1

    invoke-virtual {p1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/qm;->d(ILcom/google/android/gms/internal/ads/pl;Z)Lcom/google/android/gms/internal/ads/pl;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/pl;->b()I

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    iget-wide v8, v3, Lcom/google/android/gms/internal/ads/pl;->d:J

    invoke-virtual {v3, v8, v9}, Lcom/google/android/gms/internal/ads/pl;->d(J)I

    move-result v3

    if-eq v3, v5, :cond_7

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/pl;->b:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_7
    add-int/lit8 v2, v2, -0x1

    goto :goto_5

    :cond_8
    iget-object v9, p0, Lcom/google/android/gms/internal/ads/eB0;->a:Lcom/google/android/gms/internal/ads/pl;

    move-object v0, p1

    move-wide v2, p3

    move-wide v4, v6

    move-object v6, v8

    move-object v7, v9

    invoke-static/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/eB0;->f(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;JJLcom/google/android/gms/internal/ads/Ql;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/LH0;

    move-result-object v0

    return-object v0
.end method

.method public final w()V
    .locals 3

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/eB0;->m:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->i:Lcom/google/android/gms/internal/ads/bB0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/bB0;->b:Ljava/lang/Object;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/eB0;->n:Ljava/lang/Object;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/bB0;->g:Lcom/google/android/gms/internal/ads/cB0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/cB0;->a:Lcom/google/android/gms/internal/ads/LH0;

    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/LH0;->d:J

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/eB0;->o:J

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->o()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->g()Lcom/google/android/gms/internal/ads/bB0;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->i:Lcom/google/android/gms/internal/ads/bB0;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->k:Lcom/google/android/gms/internal/ads/bB0;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->j:Lcom/google/android/gms/internal/ads/bB0;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/eB0;->m:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/eB0;->g()V

    return-void
.end method

.method final synthetic x(Lcom/google/android/gms/internal/ads/Zh0;Lcom/google/android/gms/internal/ads/LH0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->c:Lcom/google/android/gms/internal/ads/KB0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Zh0;->j()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/KB0;->n(Ljava/util/List;Lcom/google/android/gms/internal/ads/LH0;)V

    return-void
.end method

.method public final y()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->l:Lcom/google/android/gms/internal/ads/bB0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bB0;->t()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->l:Lcom/google/android/gms/internal/ads/bB0;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/eB0;->p:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/eB0;->p:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/bB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/bB0;->t()Z

    move-result v2

    if-nez v2, :cond_1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/eB0;->l:Lcom/google/android/gms/internal/ads/bB0;

    return-void

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final z(J)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB0;->k:Lcom/google/android/gms/internal/ads/bB0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/bB0;->n(J)V

    :cond_0
    return-void
.end method
