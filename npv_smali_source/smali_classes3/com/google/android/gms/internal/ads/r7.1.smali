.class public Lcom/google/android/gms/internal/ads/r7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/W6;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/q7;

.field protected final b:Lcom/google/android/gms/internal/ads/t7;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/q7;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/t7;

    const/16 v1, 0x1000

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/t7;-><init>(I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/r7;->a:Lcom/google/android/gms/internal/ads/q7;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/r7;->b:Lcom/google/android/gms/internal/ads/t7;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/ads/d7;)Lcom/google/android/gms/internal/ads/Z6;
    .locals 20

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const/4 v5, 0x0

    const-string v6, "Error occurred when closing InputStream"

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v7

    :goto_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/d7;->i()Lcom/google/android/gms/internal/ads/M6;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto/16 :goto_e

    :cond_0
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/M6;->b:Ljava/lang/String;

    if-eqz v11, :cond_1

    const-string v12, "If-None-Match"

    invoke-interface {v10, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-wide v11, v0, Lcom/google/android/gms/internal/ads/M6;->d:J

    const-wide/16 v13, 0x0

    cmp-long v0, v11, v13

    if-lez v0, :cond_2

    const-string v0, "If-Modified-Since"

    invoke-static {v11, v12}, Lcom/google/android/gms/internal/ads/z7;->c(J)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v10, v0, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    move-object v0, v10

    :goto_1
    iget-object v10, v1, Lcom/google/android/gms/internal/ads/r7;->a:Lcom/google/android/gms/internal/ads/q7;

    invoke-virtual {v10, v2, v0}, Lcom/google/android/gms/internal/ads/q7;->a(Lcom/google/android/gms/internal/ads/d7;Ljava/util/Map;)Lcom/google/android/gms/internal/ads/A7;

    move-result-object v10
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/A7;->b()I

    move-result v12

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/A7;->d()Ljava/util/List;

    move-result-object v0

    const/16 v11, 0x130

    if-ne v12, v11, :cond_9

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v11

    sub-long v17, v11, v7

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/d7;->i()Lcom/google/android/gms/internal/ads/M6;

    move-result-object v11

    if-nez v11, :cond_3

    new-instance v11, Lcom/google/android/gms/internal/ads/Z6;

    const/4 v15, 0x0

    const/16 v16, 0x1

    const/16 v14, 0x130

    move-object v13, v11

    move-object/from16 v19, v0

    invoke-direct/range {v13 .. v19}, Lcom/google/android/gms/internal/ads/Z6;-><init>(I[BZJLjava/util/List;)V

    goto/16 :goto_5

    :catch_1
    move-exception v0

    goto/16 :goto_d

    :cond_3
    new-instance v12, Ljava/util/TreeSet;

    sget-object v13, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-direct {v12, v13}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_4

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_4

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/google/android/gms/internal/ads/V6;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/V6;->a()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v12, v14}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v0, v11, Lcom/google/android/gms/internal/ads/M6;->h:Ljava/util/List;

    if-eqz v0, :cond_6

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, v11, Lcom/google/android/gms/internal/ads/M6;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/google/android/gms/internal/ads/V6;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/V6;->a()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v12, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_5

    invoke-interface {v15, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    iget-object v0, v11, Lcom/google/android/gms/internal/ads/M6;->g:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, v11, Lcom/google/android/gms/internal/ads/M6;->g:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Map$Entry;

    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    invoke-interface {v12, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_7

    new-instance v14, Lcom/google/android/gms/internal/ads/V6;

    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v9, v16

    check-cast v9, Ljava/lang/String;

    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-direct {v14, v9, v13}, Lcom/google/android/gms/internal/ads/V6;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v15, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    new-instance v0, Lcom/google/android/gms/internal/ads/Z6;

    iget-object v9, v11, Lcom/google/android/gms/internal/ads/M6;->a:[B

    const/16 v16, 0x1

    const/16 v14, 0x130

    move-object v13, v0

    move-object v11, v15

    move-object v15, v9

    move-object/from16 v19, v11

    invoke-direct/range {v13 .. v19}, Lcom/google/android/gms/internal/ads/Z6;-><init>(I[BZJLjava/util/List;)V

    move-object v11, v0

    :goto_5
    return-object v11

    :cond_9
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/A7;->c()Ljava/io/InputStream;

    move-result-object v9

    if-eqz v9, :cond_b

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/A7;->a()I

    move-result v11

    iget-object v13, v1, Lcom/google/android/gms/internal/ads/r7;->b:Lcom/google/android/gms/internal/ads/t7;

    new-instance v14, Lcom/google/android/gms/internal/ads/G7;

    invoke-direct {v14, v13, v11}, Lcom/google/android/gms/internal/ads/G7;-><init>(Lcom/google/android/gms/internal/ads/t7;I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    const/16 v11, 0x400

    :try_start_2
    invoke-virtual {v13, v11}, Lcom/google/android/gms/internal/ads/t7;->b(I)[B

    move-result-object v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_6
    :try_start_3
    invoke-virtual {v9, v11}, Ljava/io/InputStream;->read([B)I

    move-result v15

    const/4 v3, -0x1

    if-eq v15, v3, :cond_a

    invoke-virtual {v14, v11, v5, v15}, Lcom/google/android/gms/internal/ads/G7;->write([BII)V

    goto :goto_6

    :catchall_0
    move-exception v0

    goto :goto_8

    :cond_a
    invoke-virtual {v14}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_7

    :catch_2
    :try_start_5
    new-array v9, v5, [Ljava/lang/Object;

    invoke-static {v6, v9}, Lcom/google/android/gms/internal/ads/n7;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_7
    invoke-virtual {v13, v11}, Lcom/google/android/gms/internal/ads/t7;->a([B)V

    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/G7;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_a

    :catchall_1
    move-exception v0

    const/4 v11, 0x0

    :goto_8
    :try_start_6
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_9

    :catch_3
    :try_start_7
    new-array v3, v5, [Ljava/lang/Object;

    invoke-static {v6, v3}, Lcom/google/android/gms/internal/ads/n7;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_9
    invoke-virtual {v13, v11}, Lcom/google/android/gms/internal/ads/t7;->a([B)V

    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/G7;->close()V

    throw v0

    :cond_b
    new-array v3, v5, [B
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1

    :goto_a
    :try_start_8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v13

    sub-long/2addr v13, v7

    sget-boolean v9, Lcom/google/android/gms/internal/ads/n7;->b:Z

    if-nez v9, :cond_c

    const-wide/16 v15, 0xbb8

    cmp-long v9, v13, v15

    if-lez v9, :cond_e

    :cond_c
    const-string v9, "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]"

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    if-eqz v3, :cond_d

    array-length v13, v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    goto :goto_b

    :catch_4
    move-exception v0

    goto :goto_c

    :cond_d
    const-string v13, "null"

    :goto_b
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/d7;->H()Lcom/google/android/gms/internal/ads/R6;

    move-result-object v15

    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/R6;->a()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const/4 v4, 0x5

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v2, v4, v5

    const/16 v16, 0x1

    aput-object v11, v4, v16

    const/4 v11, 0x2

    aput-object v13, v4, v11

    const/4 v11, 0x3

    aput-object v14, v4, v11

    const/4 v11, 0x4

    aput-object v15, v4, v11

    invoke-static {v9, v4}, Lcom/google/android/gms/internal/ads/n7;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_e
    const/16 v4, 0xc8

    if-lt v12, v4, :cond_f

    const/16 v4, 0x12b

    if-gt v12, v4, :cond_f

    new-instance v4, Lcom/google/android/gms/internal/ads/Z6;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v13

    sub-long v15, v13, v7

    const/4 v14, 0x0

    move-object v11, v4

    move-object v13, v3

    move-object/from16 v17, v0

    invoke-direct/range {v11 .. v17}, Lcom/google/android/gms/internal/ads/Z6;-><init>(I[BZJLjava/util/List;)V

    return-object v4

    :cond_f
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4

    :goto_c
    move-object v11, v3

    goto :goto_f

    :goto_d
    const/4 v11, 0x0

    goto :goto_f

    :goto_e
    const/4 v10, 0x0

    goto :goto_d

    :goto_f
    instance-of v3, v0, Ljava/net/SocketTimeoutException;

    if-eqz v3, :cond_10

    new-instance v0, Lcom/google/android/gms/internal/ads/E7;

    new-instance v3, Lcom/google/android/gms/internal/ads/j7;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/j7;-><init>()V

    const-string v4, "socket"

    const/4 v9, 0x0

    invoke-direct {v0, v4, v3, v9}, Lcom/google/android/gms/internal/ads/E7;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/k7;Lcom/google/android/gms/internal/ads/F7;)V

    :goto_10
    move-object v3, v0

    goto/16 :goto_12

    :cond_10
    instance-of v3, v0, Ljava/net/MalformedURLException;

    if-nez v3, :cond_16

    if-eqz v10, :cond_15

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/A7;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/d7;->t()Ljava/lang/String;

    move-result-object v4

    const/4 v9, 0x2

    new-array v12, v9, [Ljava/lang/Object;

    aput-object v3, v12, v5

    const/4 v3, 0x1

    aput-object v4, v12, v3

    const-string v3, "Unexpected response code %d for %s"

    invoke-static {v3, v12}, Lcom/google/android/gms/internal/ads/n7;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v11, :cond_14

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/A7;->d()Ljava/util/List;

    move-result-object v15

    new-instance v3, Lcom/google/android/gms/internal/ads/Z6;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v9

    sub-long v13, v9, v7

    const/4 v12, 0x0

    move-object v9, v3

    move v10, v0

    invoke-direct/range {v9 .. v15}, Lcom/google/android/gms/internal/ads/Z6;-><init>(I[BZJLjava/util/List;)V

    const/16 v4, 0x191

    if-eq v0, v4, :cond_13

    const/16 v4, 0x193

    if-ne v0, v4, :cond_11

    goto :goto_11

    :cond_11
    const/16 v2, 0x190

    if-lt v0, v2, :cond_12

    const/16 v2, 0x1f3

    if-gt v0, v2, :cond_12

    new-instance v0, Lcom/google/android/gms/internal/ads/Q6;

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/ads/Q6;-><init>(Lcom/google/android/gms/internal/ads/Z6;)V

    throw v0

    :cond_12
    new-instance v0, Lcom/google/android/gms/internal/ads/i7;

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/ads/i7;-><init>(Lcom/google/android/gms/internal/ads/Z6;)V

    throw v0

    :cond_13
    :goto_11
    new-instance v0, Lcom/google/android/gms/internal/ads/E7;

    new-instance v4, Lcom/google/android/gms/internal/ads/L6;

    invoke-direct {v4, v3}, Lcom/google/android/gms/internal/ads/L6;-><init>(Lcom/google/android/gms/internal/ads/Z6;)V

    const-string v3, "auth"

    const/4 v9, 0x0

    invoke-direct {v0, v3, v4, v9}, Lcom/google/android/gms/internal/ads/E7;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/k7;Lcom/google/android/gms/internal/ads/F7;)V

    goto :goto_10

    :cond_14
    const/4 v9, 0x0

    new-instance v0, Lcom/google/android/gms/internal/ads/E7;

    new-instance v3, Lcom/google/android/gms/internal/ads/Y6;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/Y6;-><init>()V

    const-string v4, "network"

    invoke-direct {v0, v4, v3, v9}, Lcom/google/android/gms/internal/ads/E7;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/k7;Lcom/google/android/gms/internal/ads/F7;)V

    goto :goto_10

    :goto_12
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/d7;->H()Lcom/google/android/gms/internal/ads/R6;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/d7;->e()I

    move-result v4

    :try_start_9
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/E7;->a(Lcom/google/android/gms/internal/ads/E7;)Lcom/google/android/gms/internal/ads/k7;

    move-result-object v9

    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/ads/R6;->c(Lcom/google/android/gms/internal/ads/k7;)V
    :try_end_9
    .catch Lcom/google/android/gms/internal/ads/k7; {:try_start_9 .. :try_end_9} :catch_5

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/E7;->b(Lcom/google/android/gms/internal/ads/E7;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    new-array v9, v4, [Ljava/lang/Object;

    aput-object v0, v9, v5

    const/4 v4, 0x1

    aput-object v3, v9, v4

    const-string v0, "%s-retry [timeout=%s]"

    invoke-static {v0, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/d7;->v(Ljava/lang/String;)V

    goto/16 :goto_0

    :catch_5
    move-exception v0

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/E7;->b(Lcom/google/android/gms/internal/ads/E7;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v3, v6, v5

    const/4 v3, 0x1

    aput-object v4, v6, v3

    const-string v3, "%s-timeout-giveup [timeout=%s]"

    invoke-static {v3, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/d7;->v(Ljava/lang/String;)V

    throw v0

    :cond_15
    new-instance v2, Lcom/google/android/gms/internal/ads/a7;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/a7;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :cond_16
    new-instance v3, Ljava/lang/RuntimeException;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/d7;->t()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "Bad URL "

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3
.end method
