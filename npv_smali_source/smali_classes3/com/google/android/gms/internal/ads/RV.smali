.class final Lcom/google/android/gms/internal/ads/RV;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/google/android/gms/internal/ads/U60;

.field final synthetic c:Lcom/google/android/gms/internal/ads/R60;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/google/android/gms/internal/ads/Fa0;

.field final synthetic f:Lcom/google/android/gms/internal/ads/e70;

.field final synthetic g:Lcom/google/android/gms/internal/ads/TV;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/TV;JLcom/google/android/gms/internal/ads/U60;Lcom/google/android/gms/internal/ads/R60;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Fa0;Lcom/google/android/gms/internal/ads/e70;)V
    .locals 0

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/RV;->a:J

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/RV;->b:Lcom/google/android/gms/internal/ads/U60;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/RV;->c:Lcom/google/android/gms/internal/ads/R60;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/RV;->d:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/RV;->e:Lcom/google/android/gms/internal/ads/Fa0;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/RV;->f:Lcom/google/android/gms/internal/ads/e70;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/RV;->g:Lcom/google/android/gms/internal/ads/TV;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 16

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/RV;->g:Lcom/google/android/gms/internal/ads/TV;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/TV;->e(Lcom/google/android/gms/internal/ads/TV;)LV3/f;

    move-result-object v2

    invoke-interface {v2}, LV3/f;->c()J

    move-result-wide v2

    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/RV;->a:J

    sub-long/2addr v2, v4

    instance-of v4, v0, Ljava/util/concurrent/TimeoutException;

    const/4 v5, 0x3

    const/4 v6, 0x0

    if-eqz v4, :cond_0

    const/4 v4, 0x2

    :goto_0
    move-object v13, v6

    goto :goto_2

    :cond_0
    instance-of v4, v0, Lcom/google/android/gms/internal/ads/AV;

    if-eqz v4, :cond_1

    move v4, v5

    goto :goto_0

    :cond_1
    instance-of v4, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v4, :cond_2

    const/4 v4, 0x4

    goto :goto_0

    :cond_2
    instance-of v4, v0, Lcom/google/android/gms/internal/ads/u70;

    if-eqz v4, :cond_3

    const/4 v4, 0x5

    goto :goto_0

    :cond_3
    instance-of v4, v0, Lcom/google/android/gms/internal/ads/oQ;

    const/4 v7, 0x6

    if-eqz v4, :cond_5

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/P70;->a(Ljava/lang/Throwable;)Ls3/W0;

    move-result-object v4

    iget v4, v4, Ls3/W0;->C:I

    if-ne v4, v5, :cond_4

    const/4 v7, 0x1

    :cond_4
    sget-object v4, Lcom/google/android/gms/internal/ads/Af;->K1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v8

    invoke-virtual {v8, v4}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_5

    instance-of v4, v0, Lcom/google/android/gms/internal/ads/aU;

    if-eqz v4, :cond_5

    move-object v4, v0

    check-cast v4, Lcom/google/android/gms/internal/ads/aU;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/aU;->b()Ls3/W0;

    move-result-object v4

    if-eqz v4, :cond_5

    iget v4, v4, Ls3/W0;->C:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object v13, v4

    :goto_1
    move v4, v7

    goto :goto_2

    :cond_5
    move-object v13, v6

    goto :goto_1

    :goto_2
    iget-object v14, v1, Lcom/google/android/gms/internal/ads/RV;->g:Lcom/google/android/gms/internal/ads/TV;

    monitor-enter v14

    :try_start_0
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/RV;->g:Lcom/google/android/gms/internal/ads/TV;

    invoke-static {v7}, Lcom/google/android/gms/internal/ads/TV;->n(Lcom/google/android/gms/internal/ads/TV;)Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-static {v7}, Lcom/google/android/gms/internal/ads/TV;->c(Lcom/google/android/gms/internal/ads/TV;)Lcom/google/android/gms/internal/ads/VV;

    move-result-object v7

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/RV;->b:Lcom/google/android/gms/internal/ads/U60;

    iget-object v9, v1, Lcom/google/android/gms/internal/ads/RV;->c:Lcom/google/android/gms/internal/ads/R60;

    instance-of v10, v0, Lcom/google/android/gms/internal/ads/aU;

    if-eqz v10, :cond_6

    move-object v6, v0

    check-cast v6, Lcom/google/android/gms/internal/ads/aU;

    :cond_6
    move-object v10, v6

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :goto_3
    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move v9, v4

    move-wide v11, v2

    invoke-virtual/range {v6 .. v12}, Lcom/google/android/gms/internal/ads/VV;->a(Lcom/google/android/gms/internal/ads/U60;Lcom/google/android/gms/internal/ads/R60;ILcom/google/android/gms/internal/ads/aU;J)V

    :cond_7
    sget-object v6, Lcom/google/android/gms/internal/ads/Af;->k8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v7

    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_8

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/RV;->g:Lcom/google/android/gms/internal/ads/TV;

    invoke-static {v6}, Lcom/google/android/gms/internal/ads/TV;->d(Lcom/google/android/gms/internal/ads/TV;)Lcom/google/android/gms/internal/ads/La0;

    move-result-object v6

    iget-object v7, v1, Lcom/google/android/gms/internal/ads/RV;->e:Lcom/google/android/gms/internal/ads/Fa0;

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/RV;->f:Lcom/google/android/gms/internal/ads/e70;

    iget-object v9, v1, Lcom/google/android/gms/internal/ads/RV;->c:Lcom/google/android/gms/internal/ads/R60;

    iget-object v10, v9, Lcom/google/android/gms/internal/ads/R60;->n:Ljava/util/List;

    invoke-virtual {v7, v8, v9, v10}, Lcom/google/android/gms/internal/ads/Fa0;->c(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/RV;->c:Lcom/google/android/gms/internal/ads/R60;

    iget-object v8, v8, Lcom/google/android/gms/internal/ads/R60;->x0:Lw3/w;

    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/internal/ads/La0;->e(Ljava/util/List;Lw3/w;)V

    :cond_8
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/RV;->g:Lcom/google/android/gms/internal/ads/TV;

    invoke-static {v6}, Lcom/google/android/gms/internal/ads/TV;->o(Lcom/google/android/gms/internal/ads/TV;)Z

    move-result v7

    if-eqz v7, :cond_9

    monitor-exit v14

    return-void

    :cond_9
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/TV;->h(Lcom/google/android/gms/internal/ads/TV;)Ljava/util/LinkedHashMap;

    move-result-object v15

    iget-object v12, v1, Lcom/google/android/gms/internal/ads/RV;->c:Lcom/google/android/gms/internal/ads/R60;

    new-instance v10, Lcom/google/android/gms/internal/ads/SV;

    iget-object v7, v1, Lcom/google/android/gms/internal/ads/RV;->d:Ljava/lang/String;

    iget-object v8, v12, Lcom/google/android/gms/internal/ads/R60;->f0:Ljava/lang/String;

    move-object v6, v10

    move v9, v4

    move-object v4, v10

    move-wide v10, v2

    move-object v5, v12

    move-object v12, v13

    invoke-direct/range {v6 .. v12}, Lcom/google/android/gms/internal/ads/SV;-><init>(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/Integer;)V

    invoke-virtual {v15, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/P70;->a(Ljava/lang/Throwable;)Ls3/W0;

    move-result-object v0

    iget v4, v0, Ls3/W0;->C:I

    const/4 v5, 0x3

    if-eq v4, v5, :cond_a

    if-nez v4, :cond_b

    :cond_a
    iget-object v4, v0, Ls3/W0;->F:Ls3/W0;

    if-eqz v4, :cond_b

    iget-object v4, v4, Ls3/W0;->E:Ljava/lang/String;

    const-string v5, "com.google.android.gms.ads"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    new-instance v4, Lcom/google/android/gms/internal/ads/aU;

    iget-object v0, v0, Ls3/W0;->F:Ls3/W0;

    const/16 v5, 0xd

    invoke-direct {v4, v5, v0}, Lcom/google/android/gms/internal/ads/aU;-><init>(ILs3/W0;)V

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/P70;->a(Ljava/lang/Throwable;)Ls3/W0;

    move-result-object v0

    :cond_b
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/RV;->g:Lcom/google/android/gms/internal/ads/TV;

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/TV;->b(Lcom/google/android/gms/internal/ads/TV;)Lcom/google/android/gms/internal/ads/bU;

    move-result-object v4

    iget-object v5, v1, Lcom/google/android/gms/internal/ads/RV;->c:Lcom/google/android/gms/internal/ads/R60;

    invoke-virtual {v4, v5, v2, v3, v0}, Lcom/google/android/gms/internal/ads/bU;->f(Lcom/google/android/gms/internal/ads/R60;JLs3/W0;)V

    monitor-exit v14

    return-void

    :goto_4
    monitor-exit v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 12

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/RV;->g:Lcom/google/android/gms/internal/ads/TV;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/TV;->e(Lcom/google/android/gms/internal/ads/TV;)LV3/f;

    move-result-object p1

    invoke-interface {p1}, LV3/f;->c()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/RV;->a:J

    sub-long/2addr v0, v2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/RV;->g:Lcom/google/android/gms/internal/ads/TV;

    monitor-enter p1

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/RV;->g:Lcom/google/android/gms/internal/ads/TV;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/TV;->n(Lcom/google/android/gms/internal/ads/TV;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/TV;->c(Lcom/google/android/gms/internal/ads/TV;)Lcom/google/android/gms/internal/ads/VV;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/RV;->b:Lcom/google/android/gms/internal/ads/U60;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/RV;->c:Lcom/google/android/gms/internal/ads/R60;

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-wide v9, v0

    invoke-virtual/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/VV;->a(Lcom/google/android/gms/internal/ads/U60;Lcom/google/android/gms/internal/ads/R60;ILcom/google/android/gms/internal/ads/aU;J)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/RV;->g:Lcom/google/android/gms/internal/ads/TV;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/TV;->o(Lcom/google/android/gms/internal/ads/TV;)Z

    move-result v3

    if-eqz v3, :cond_1

    monitor-exit p1

    return-void

    :cond_1
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/RV;->c:Lcom/google/android/gms/internal/ads/R60;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/TV;->p(Lcom/google/android/gms/internal/ads/TV;Lcom/google/android/gms/internal/ads/R60;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/RV;->g:Lcom/google/android/gms/internal/ads/TV;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/TV;->h(Lcom/google/android/gms/internal/ads/TV;)Ljava/util/LinkedHashMap;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/RV;->c:Lcom/google/android/gms/internal/ads/R60;

    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/SV;

    iput-wide v0, v2, Lcom/google/android/gms/internal/ads/SV;->d:J

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/RV;->g:Lcom/google/android/gms/internal/ads/TV;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/TV;->h(Lcom/google/android/gms/internal/ads/TV;)Ljava/util/LinkedHashMap;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/RV;->c:Lcom/google/android/gms/internal/ads/R60;

    new-instance v11, Lcom/google/android/gms/internal/ads/SV;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/RV;->d:Ljava/lang/String;

    iget-object v6, v3, Lcom/google/android/gms/internal/ads/R60;->f0:Ljava/lang/String;

    const/4 v7, 0x0

    const/4 v10, 0x0

    move-object v4, v11

    move-wide v8, v0

    invoke-direct/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/SV;-><init>(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/Integer;)V

    invoke-virtual {v2, v3, v11}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/RV;->g:Lcom/google/android/gms/internal/ads/TV;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/TV;->b(Lcom/google/android/gms/internal/ads/TV;)Lcom/google/android/gms/internal/ads/bU;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/RV;->c:Lcom/google/android/gms/internal/ads/R60;

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v0, v1, v4}, Lcom/google/android/gms/internal/ads/bU;->g(Lcom/google/android/gms/internal/ads/R60;JLs3/W0;)V

    monitor-exit p1

    return-void

    :goto_2
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
