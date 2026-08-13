.class public final Lcom/google/android/gms/internal/ads/TV;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LV3/f;

.field private final b:Lcom/google/android/gms/internal/ads/VV;

.field private final c:Lcom/google/android/gms/internal/ads/La0;

.field private final d:Ljava/util/LinkedHashMap;

.field private final e:Z

.field private final f:Lcom/google/android/gms/internal/ads/bU;

.field private g:Z

.field private h:J

.field private i:J


# direct methods
.method public constructor <init>(LV3/f;Lcom/google/android/gms/internal/ads/VV;Lcom/google/android/gms/internal/ads/bU;Lcom/google/android/gms/internal/ads/La0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/TV;->d:Ljava/util/LinkedHashMap;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/TV;->a:LV3/f;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/TV;->b:Lcom/google/android/gms/internal/ads/VV;

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->G6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/TV;->e:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/TV;->f:Lcom/google/android/gms/internal/ads/bU;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/TV;->c:Lcom/google/android/gms/internal/ads/La0;

    return-void
.end method

.method static bridge synthetic b(Lcom/google/android/gms/internal/ads/TV;)Lcom/google/android/gms/internal/ads/bU;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/TV;->f:Lcom/google/android/gms/internal/ads/bU;

    return-object p0
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/TV;)Lcom/google/android/gms/internal/ads/VV;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/TV;->b:Lcom/google/android/gms/internal/ads/VV;

    return-object p0
.end method

.method static bridge synthetic d(Lcom/google/android/gms/internal/ads/TV;)Lcom/google/android/gms/internal/ads/La0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/TV;->c:Lcom/google/android/gms/internal/ads/La0;

    return-object p0
.end method

.method static bridge synthetic e(Lcom/google/android/gms/internal/ads/TV;)LV3/f;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/TV;->a:LV3/f;

    return-object p0
.end method

.method static bridge synthetic h(Lcom/google/android/gms/internal/ads/TV;)Ljava/util/LinkedHashMap;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/TV;->d:Ljava/util/LinkedHashMap;

    return-object p0
.end method

.method static bridge synthetic n(Lcom/google/android/gms/internal/ads/TV;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/internal/ads/TV;->e:Z

    return p0
.end method

.method static bridge synthetic o(Lcom/google/android/gms/internal/ads/TV;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/internal/ads/TV;->g:Z

    return p0
.end method

.method static bridge synthetic p(Lcom/google/android/gms/internal/ads/TV;Lcom/google/android/gms/internal/ads/R60;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/TV;->q(Lcom/google/android/gms/internal/ads/R60;)Z

    move-result p0

    return p0
.end method

.method private final declared-synchronized q(Lcom/google/android/gms/internal/ads/R60;)Z
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/TV;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/SV;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    if-nez p1, :cond_0

    monitor-exit p0

    return v0

    :cond_0
    :try_start_1
    iget p1, p1, Lcom/google/android/gms/internal/ads/SV;->c:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/16 v1, 0x8

    monitor-exit p0

    if-ne p1, v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method


# virtual methods
.method public final declared-synchronized a()J
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/TV;->h:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method final declared-synchronized f(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;LP4/d;Lcom/google/android/gms/internal/ads/Fa0;)LP4/d;
    .locals 19

    .prologue
    move-object/from16 v10, p0

    move-object/from16 v0, p2

    move-object/from16 v11, p3

    monitor-enter p0

    move-object/from16 v9, p1

    :try_start_0
    iget-object v1, v9, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v5, v1, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    iget-object v1, v10, Lcom/google/android/gms/internal/ads/TV;->a:LV3/f;

    invoke-interface {v1}, LV3/f;->c()J

    move-result-wide v3

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/R60;->w:Ljava/lang/String;

    if-eqz v7, :cond_0

    iget-object v1, v10, Lcom/google/android/gms/internal/ads/TV;->d:Ljava/util/LinkedHashMap;

    new-instance v2, Lcom/google/android/gms/internal/ads/SV;

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/R60;->f0:Ljava/lang/String;

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v15, 0x9

    move-object v12, v2

    move-object v13, v7

    invoke-direct/range {v12 .. v18}, Lcom/google/android/gms/internal/ads/SV;-><init>(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/Integer;)V

    invoke-virtual {v1, v0, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v12, Lcom/google/android/gms/internal/ads/RV;

    move-object v1, v12

    move-object/from16 v2, p0

    move-object/from16 v6, p2

    move-object/from16 v8, p4

    move-object/from16 v9, p1

    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/internal/ads/RV;-><init>(Lcom/google/android/gms/internal/ads/TV;JLcom/google/android/gms/internal/ads/U60;Lcom/google/android/gms/internal/ads/R60;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Fa0;Lcom/google/android/gms/internal/ads/e70;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {v11, v12, v0}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-object v11

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized g()Ljava/lang/String;
    .locals 5

    .prologue
    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/TV;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/SV;

    iget v3, v2, Lcom/google/android/gms/internal/ads/SV;->c:I

    const v4, 0x7fffffff

    if-eq v3, v4, :cond_0

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/SV;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    const-string v1, "_"

    invoke-static {v1, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized i(Lcom/google/android/gms/internal/ads/R60;)V
    .locals 4

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/TV;->a:LV3/f;

    invoke-interface {v0}, LV3/f;->c()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/TV;->i:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/TV;->h:J

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/TV;->f:Lcom/google/android/gms/internal/ads/bU;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/bU;->e(Lcom/google/android/gms/internal/ads/R60;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/TV;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized j()V
    .locals 4

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/TV;->a:LV3/f;

    invoke-interface {v0}, LV3/f;->c()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/TV;->i:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/TV;->h:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized k(Ljava/util/List;)V
    .locals 10

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/TV;->a:LV3/f;

    invoke-interface {v0}, LV3/f;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/TV;->i:J

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/R60;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/R60;->w:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/TV;->d:Ljava/util/LinkedHashMap;

    new-instance v9, Lcom/google/android/gms/internal/ads/SV;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/R60;->w:Ljava/lang/String;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/R60;->f0:Ljava/lang/String;

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const v5, 0x7fffffff

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/SV;-><init>(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/Integer;)V

    invoke-virtual {v1, v0, v9}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized l()V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/TV;->a:LV3/f;

    invoke-interface {v0}, LV3/f;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/TV;->i:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized m(Lcom/google/android/gms/internal/ads/R60;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/TV;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/SV;

    if-eqz p1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/TV;->g:Z

    if-nez v0, :cond_0

    const/16 v0, 0x8

    iput v0, p1, Lcom/google/android/gms/internal/ads/SV;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
