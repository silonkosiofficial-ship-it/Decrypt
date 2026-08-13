.class abstract synthetic Lw2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lz2/d;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr2/a;

    invoke-direct {v0, p0}, Lr2/a;-><init>(Lz2/d;)V

    invoke-static {v0}, Lw2/b;->a(Ly2/b;)V

    return-void
.end method

.method public static final b(Lo2/n;ZLm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-virtual {p0}, Lo2/n;->C()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Lm7/e;->getContext()Lm7/i;

    move-result-object p2

    sget-object v0, Lo2/x;->C:Lo2/x$a;

    invoke-interface {p2, v0}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p2

    invoke-static {p2}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lo2/n;->z()Lm7/i;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lo2/n;->t()Lm7/i;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lo2/n;->q()LW8/N;

    move-result-object p0

    invoke-interface {p0}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final c(Lo2/n;ZZLx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 16

    .prologue
    move-object/from16 v6, p0

    move/from16 v7, p1

    move/from16 v1, p2

    move-object/from16 v0, p4

    instance-of v2, v0, Lw2/d$b;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lw2/d$b;

    iget v3, v2, Lw2/d$b;->K:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lw2/d$b;->K:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lw2/d$b;

    invoke-direct {v2, v0}, Lw2/d$b;-><init>(Lm7/e;)V

    goto :goto_0

    :goto_1
    iget-object v0, v8, Lw2/d$b;->J:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v9

    iget v2, v8, Lw2/d$b;->K:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v10, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v10, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-boolean v1, v8, Lw2/d$b;->I:Z

    iget-boolean v2, v8, Lw2/d$b;->H:Z

    iget-object v4, v8, Lw2/d$b;->G:Ljava/lang/Object;

    check-cast v4, Lx7/l;

    iget-object v5, v8, Lw2/d$b;->F:Ljava/lang/Object;

    check-cast v5, Lo2/n;

    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    move v14, v1

    move v13, v2

    move-object v15, v4

    move-object v12, v5

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_4

    :cond_4
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lo2/n;->C()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual/range {p0 .. p0}, Lo2/n;->K()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual/range {p0 .. p0}, Lo2/n;->D()Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v11, Lw2/d$c;

    const/4 v4, 0x0

    move-object v0, v11

    move/from16 v1, p2

    move/from16 v2, p1

    move-object/from16 v3, p0

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v5}, Lw2/d$c;-><init>(ZZLo2/n;Lm7/e;Lx7/l;)V

    iput v10, v8, Lw2/d$b;->K:I

    invoke-virtual {v6, v7, v11, v8}, Lo2/n;->O(ZLx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_7

    return-object v9

    :cond_5
    iput-object v6, v8, Lw2/d$b;->F:Ljava/lang/Object;

    move-object/from16 v0, p3

    iput-object v0, v8, Lw2/d$b;->G:Ljava/lang/Object;

    iput-boolean v7, v8, Lw2/d$b;->H:Z

    iput-boolean v1, v8, Lw2/d$b;->I:Z

    iput v4, v8, Lw2/d$b;->K:I

    invoke-static {v6, v1, v8}, Lw2/b;->c(Lo2/n;ZLm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v9, :cond_6

    return-object v9

    :cond_6
    move-object v15, v0

    move v14, v1

    move-object v0, v2

    move-object v12, v6

    move v13, v7

    :goto_3
    check-cast v0, Lm7/i;

    new-instance v1, Lw2/d$a;

    const/4 v11, 0x0

    move-object v10, v1

    invoke-direct/range {v10 .. v15}, Lw2/d$a;-><init>(Lm7/e;Lo2/n;ZZLx7/l;)V

    const/4 v2, 0x0

    iput-object v2, v8, Lw2/d$b;->F:Ljava/lang/Object;

    iput-object v2, v8, Lw2/d$b;->G:Ljava/lang/Object;

    iput v3, v8, Lw2/d$b;->K:I

    invoke-static {v0, v1, v8}, LW8/g;->g(Lm7/i;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_7

    return-object v9

    :cond_7
    :goto_4
    return-object v0
.end method

.method public static final d(Lo2/n;Lz2/g;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    .locals 1

    .prologue
    const-string v0, "db"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sqLiteQuery"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p3}, Lo2/n;->M(Lz2/g;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p0

    if-eqz p2, :cond_1

    instance-of p1, p0, Landroid/database/AbstractWindowedCursor;

    if-eqz p1, :cond_1

    move-object p1, p0

    check-cast p1, Landroid/database/AbstractWindowedCursor;

    invoke-virtual {p1}, Landroid/database/AbstractCursor;->getCount()I

    move-result p2

    invoke-virtual {p1}, Landroid/database/AbstractWindowedCursor;->hasWindow()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Landroid/database/AbstractWindowedCursor;->getWindow()Landroid/database/CursorWindow;

    move-result-object p1

    invoke-virtual {p1}, Landroid/database/CursorWindow;->getNumRows()I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    if-ge p1, p2, :cond_1

    invoke-static {p0}, Lw2/a;->a(Landroid/database/Cursor;)Landroid/database/Cursor;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static final e(Ljava/io/File;)I
    .locals 8

    .prologue
    const-string v0, "databaseFile"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {v0}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object p0

    const/4 v0, 0x4

    :try_start_0
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    const-wide/16 v4, 0x4

    const/4 v6, 0x1

    const-wide/16 v2, 0x3c

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Ljava/nio/channels/FileChannel;->tryLock(JJZ)Ljava/nio/channels/FileLock;

    const-wide/16 v1, 0x3c

    invoke-virtual {p0, v1, v2}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    invoke-virtual {p0, v7}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v1

    if-ne v1, v0, :cond_0

    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    invoke-static {p0, v1}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Bad database header, unable to read 4 bytes at offset 60"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {p0, v0}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method
