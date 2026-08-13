.class public final LP6/m;
.super LU6/b$d;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LT6/h;

.field private final c:[B

.field private final d:[B

.field private final e:I

.field private final f:I

.field private final g:Ljava/util/List;

.field private h:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;LT6/h;)V
    .locals 23

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "parts"

    invoke-static {v1, v4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "boundary"

    invoke-static {v2, v4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "contentType"

    invoke-static {v3, v4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, LU6/b$d;-><init>()V

    iput-object v2, v0, LP6/m;->a:Ljava/lang/String;

    iput-object v3, v0, LP6/m;->b:LT6/h;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "--"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\r\n"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static {v3, v5, v6, v5}, Ld7/e;->d(Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)[B

    move-result-object v3

    iput-object v3, v0, LP6/m;->c:[B

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "--\r\n"

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v5, v6, v5}, Ld7/e;->d(Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)[B

    move-result-object v2

    iput-object v2, v0, LP6/m;->d:[B

    array-length v2, v2

    iput v2, v0, LP6/m;->e:I

    invoke-static {}, LP6/b;->c()[B

    move-result-object v2

    array-length v2, v2

    mul-int/lit8 v2, v2, 0x2

    array-length v3, v3

    add-int/2addr v2, v3

    iput v2, v0, LP6/m;->f:I

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LU6/e;

    invoke-static {}, Ld7/c;->a()Lo9/p;

    move-result-object v4

    invoke-virtual {v3}, LU6/e;->e()LT6/p;

    move-result-object v6

    invoke-interface {v6}, LW6/y;->a()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const-string v7, ": "

    if-eqz v6, :cond_0

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v14, v6

    check-cast v14, Ljava/lang/Iterable;

    const/16 v21, 0x3e

    const/16 v22, 0x0

    const-string v15, "; "

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v14 .. v22}, Lj7/v;->r0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v6, v4

    invoke-static/range {v6 .. v12}, Ld7/e;->f(Lo9/p;Ljava/lang/CharSequence;IILjava/nio/charset/Charset;ILjava/lang/Object;)V

    invoke-static {}, LP6/b;->c()[B

    move-result-object v7

    const/4 v10, 0x6

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Ld7/c;->e(Lo9/p;[BIIILjava/lang/Object;)V

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, LU6/e;->e()LT6/p;

    move-result-object v6

    sget-object v8, LT6/v;->a:LT6/v;

    invoke-virtual {v8}, LT6/v;->g()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v6, v9}, LW6/y;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_2

    :cond_1
    move-object v6, v5

    :goto_2
    instance-of v9, v3, LU6/e$a;

    if-eqz v9, :cond_3

    invoke-static {v4}, Ld7/c;->b(Lo9/p;)Lo9/q;

    move-result-object v4

    invoke-static {v4}, Lo9/r;->a(Lo9/q;)[B

    move-result-object v4

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iget v8, v0, LP6/m;->f:I

    int-to-long v8, v8

    add-long/2addr v6, v8

    array-length v8, v4

    int-to-long v8, v8

    add-long/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_3

    :cond_2
    move-object v6, v5

    :goto_3
    new-instance v7, LP6/n$b;

    check-cast v3, LU6/e$a;

    invoke-virtual {v3}, LU6/e$a;->f()Lx7/a;

    move-result-object v3

    invoke-direct {v7, v4, v3, v6}, LP6/n$b;-><init>([BLx7/a;Ljava/lang/Long;)V

    goto :goto_4

    :cond_3
    instance-of v9, v3, LU6/e$b;

    if-eqz v9, :cond_5

    new-instance v9, Lo9/a;

    invoke-direct {v9}, Lo9/a;-><init>()V

    check-cast v3, LU6/e$b;

    invoke-virtual {v3}, LU6/e$b;->f()Ljava/lang/String;

    move-result-object v11

    const/16 v15, 0xe

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v10, v9

    invoke-static/range {v10 .. v16}, Ld7/e;->f(Lo9/p;Ljava/lang/CharSequence;IILjava/nio/charset/Charset;ILjava/lang/Object;)V

    invoke-static {v9}, Lo9/r;->a(Lo9/q;)[B

    move-result-object v3

    new-instance v13, LP6/l;

    invoke-direct {v13, v3}, LP6/l;-><init>([B)V

    if-nez v6, :cond_4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8}, LT6/v;->g()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v7, v3

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v6, v4

    invoke-static/range {v6 .. v12}, Ld7/e;->f(Lo9/p;Ljava/lang/CharSequence;IILjava/nio/charset/Charset;ILjava/lang/Object;)V

    invoke-static {}, LP6/b;->c()[B

    move-result-object v7

    const/4 v10, 0x6

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Ld7/c;->e(Lo9/p;[BIIILjava/lang/Object;)V

    :cond_4
    invoke-static {v4}, Ld7/c;->b(Lo9/p;)Lo9/q;

    move-result-object v4

    invoke-static {v4}, Lo9/r;->a(Lo9/q;)[B

    move-result-object v4

    array-length v3, v3

    iget v6, v0, LP6/m;->f:I

    add-int/2addr v3, v6

    array-length v6, v4

    add-int/2addr v3, v6

    new-instance v7, LP6/n$b;

    int-to-long v8, v3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-direct {v7, v4, v13, v3}, LP6/n$b;-><init>([BLx7/a;Ljava/lang/Long;)V

    :goto_4
    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_5
    new-instance v1, Li7/s;

    invoke-direct {v1}, Li7/s;-><init>()V

    throw v1

    :cond_6
    iput-object v2, v0, LP6/m;->g:Ljava/util/List;

    const-wide/16 v3, 0x0

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LP6/n;

    invoke-virtual {v3}, LP6/n;->b()Ljava/lang/Long;

    move-result-object v3

    if-nez v3, :cond_7

    goto :goto_6

    :cond_7
    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    add-long/2addr v6, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_5

    :cond_8
    move-object v1, v5

    goto :goto_5

    :cond_9
    move-object v5, v1

    :goto_6
    if-eqz v5, :cond_a

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget v3, v0, LP6/m;->e:I

    int-to-long v3, v3

    add-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    :cond_a
    iput-object v5, v0, LP6/m;->h:Ljava/lang/Long;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/String;LT6/h;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    invoke-static {}, LP6/b;->b()Ljava/lang/String;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    sget-object p3, LT6/h$c;->a:LT6/h$c;

    invoke-virtual {p3}, LT6/h$c;->a()LT6/h;

    move-result-object p3

    const-string p4, "boundary"

    invoke-virtual {p3, p4, p2}, LT6/h;->g(Ljava/lang/String;Ljava/lang/String;)LT6/h;

    move-result-object p3

    :cond_1
    invoke-direct {p0, p1, p2, p3}, LP6/m;-><init>(Ljava/util/List;Ljava/lang/String;LT6/h;)V

    return-void
.end method

.method public static synthetic e([B)Lo9/q;
    .locals 0

    invoke-static {p0}, LP6/m;->f([B)Lo9/q;

    move-result-object p0

    return-object p0
.end method

.method private static final f([B)Lo9/q;
    .locals 7

    new-instance v6, Lo9/a;

    invoke-direct {v6}, Lo9/a;-><init>()V

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Ld7/c;->e(Lo9/p;[BIIILjava/lang/Object;)V

    return-object v6
.end method


# virtual methods
.method public a()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, LP6/m;->h:Ljava/lang/Long;

    return-object v0
.end method

.method public b()LT6/h;
    .locals 1

    iget-object v0, p0, LP6/m;->b:LT6/h;

    return-object v0
.end method

.method public d(Lio/ktor/utils/io/g;Lm7/e;)Ljava/lang/Object;
    .locals 23

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, LP6/m$a;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, LP6/m$a;

    iget v3, v2, LP6/m$a;->L:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, LP6/m$a;->L:I

    goto :goto_0

    :cond_0
    new-instance v2, LP6/m$a;

    invoke-direct {v2, v1, v0}, LP6/m$a;-><init>(LP6/m;Lm7/e;)V

    :goto_0
    iget-object v0, v2, LP6/m$a;->J:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, LP6/m$a;->L:I

    const/4 v5, 0x0

    packed-switch v4, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v2, v2, LP6/m$a;->F:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Throwable;

    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_1
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_2
    iget-object v4, v2, LP6/m$a;->F:Ljava/lang/Object;

    check-cast v4, Lio/ktor/utils/io/g;

    :try_start_0
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_9

    :catchall_0
    move-exception v0

    move-object/from16 v22, v4

    move-object v4, v2

    move-object/from16 v2, v22

    goto/16 :goto_a

    :pswitch_3
    iget-object v4, v2, LP6/m$a;->H:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v6, v2, LP6/m$a;->G:Ljava/lang/Object;

    check-cast v6, Lio/ktor/utils/io/g;

    iget-object v7, v2, LP6/m$a;->F:Ljava/lang/Object;

    check-cast v7, LP6/m;

    :try_start_1
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v0, v4

    move-object v13, v7

    move-object v4, v2

    move-object v2, v6

    goto/16 :goto_1

    :catchall_1
    move-exception v0

    move-object v4, v2

    move-object v2, v6

    goto/16 :goto_a

    :pswitch_4
    iget-object v4, v2, LP6/m$a;->H:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v6, v2, LP6/m$a;->G:Ljava/lang/Object;

    check-cast v6, Lio/ktor/utils/io/g;

    iget-object v7, v2, LP6/m$a;->F:Ljava/lang/Object;

    check-cast v7, LP6/m;

    :try_start_2
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto/16 :goto_7

    :pswitch_5
    iget-object v4, v2, LP6/m$a;->I:Ljava/lang/Object;

    check-cast v4, Ljava/lang/AutoCloseable;

    iget-object v6, v2, LP6/m$a;->H:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, v2, LP6/m$a;->G:Ljava/lang/Object;

    check-cast v7, Lio/ktor/utils/io/g;

    iget-object v8, v2, LP6/m$a;->F:Ljava/lang/Object;

    check-cast v8, LP6/m;

    :try_start_3
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-object/from16 v22, v4

    move-object v4, v2

    move-object v2, v7

    move-object v7, v8

    move-object/from16 v8, v22

    goto/16 :goto_5

    :catchall_2
    move-exception v0

    move-object v6, v0

    move-object v8, v4

    move-object v4, v2

    move-object v2, v7

    goto/16 :goto_6

    :pswitch_6
    iget-object v4, v2, LP6/m$a;->I:Ljava/lang/Object;

    check-cast v4, LP6/n;

    iget-object v6, v2, LP6/m$a;->H:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, v2, LP6/m$a;->G:Ljava/lang/Object;

    check-cast v7, Lio/ktor/utils/io/g;

    iget-object v8, v2, LP6/m$a;->F:Ljava/lang/Object;

    check-cast v8, LP6/m;

    :try_start_4
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    move-object v14, v4

    move-object v4, v2

    move-object v2, v7

    :cond_1
    move-object v7, v8

    goto/16 :goto_4

    :catchall_3
    move-exception v0

    move-object v4, v2

    move-object v2, v7

    goto/16 :goto_a

    :pswitch_7
    iget-object v4, v2, LP6/m$a;->I:Ljava/lang/Object;

    check-cast v4, LP6/n;

    iget-object v6, v2, LP6/m$a;->H:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, v2, LP6/m$a;->G:Ljava/lang/Object;

    check-cast v7, Lio/ktor/utils/io/g;

    iget-object v8, v2, LP6/m$a;->F:Ljava/lang/Object;

    check-cast v8, LP6/m;

    :try_start_5
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    move-object v14, v4

    move-object v4, v2

    move-object v2, v7

    goto/16 :goto_3

    :pswitch_8
    iget-object v4, v2, LP6/m$a;->I:Ljava/lang/Object;

    check-cast v4, LP6/n;

    iget-object v6, v2, LP6/m$a;->H:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, v2, LP6/m$a;->G:Ljava/lang/Object;

    check-cast v7, Lio/ktor/utils/io/g;

    iget-object v8, v2, LP6/m$a;->F:Ljava/lang/Object;

    check-cast v8, LP6/m;

    :try_start_6
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    move-object v14, v4

    move-object v4, v2

    move-object v2, v7

    goto :goto_2

    :pswitch_9
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    :try_start_7
    iget-object v0, v1, LP6/m;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    move-object v13, v1

    move-object v4, v2

    move-object/from16 v2, p1

    :goto_1
    :try_start_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v14, v6

    check-cast v14, LP6/n;

    iget-object v7, v13, LP6/m;->c:[B

    iput-object v13, v4, LP6/m$a;->F:Ljava/lang/Object;

    iput-object v2, v4, LP6/m$a;->G:Ljava/lang/Object;

    iput-object v0, v4, LP6/m$a;->H:Ljava/lang/Object;

    iput-object v14, v4, LP6/m$a;->I:Ljava/lang/Object;

    const/4 v6, 0x1

    iput v6, v4, LP6/m$a;->L:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object v6, v2

    move-object v10, v4

    invoke-static/range {v6 .. v12}, Lio/ktor/utils/io/k;->i(Lio/ktor/utils/io/g;[BIILm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_2

    return-object v3

    :cond_2
    move-object v6, v0

    move-object v8, v13

    :goto_2
    invoke-virtual {v14}, LP6/n;->a()[B

    move-result-object v16

    iput-object v8, v4, LP6/m$a;->F:Ljava/lang/Object;

    iput-object v2, v4, LP6/m$a;->G:Ljava/lang/Object;

    iput-object v6, v4, LP6/m$a;->H:Ljava/lang/Object;

    iput-object v14, v4, LP6/m$a;->I:Ljava/lang/Object;

    const/4 v0, 0x2

    iput v0, v4, LP6/m$a;->L:I

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x6

    const/16 v21, 0x0

    move-object v15, v2

    move-object/from16 v19, v4

    invoke-static/range {v15 .. v21}, Lio/ktor/utils/io/k;->i(Lio/ktor/utils/io/g;[BIILm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_3

    return-object v3

    :cond_3
    :goto_3
    invoke-static {}, LP6/b;->c()[B

    move-result-object v16

    iput-object v8, v4, LP6/m$a;->F:Ljava/lang/Object;

    iput-object v2, v4, LP6/m$a;->G:Ljava/lang/Object;

    iput-object v6, v4, LP6/m$a;->H:Ljava/lang/Object;

    iput-object v14, v4, LP6/m$a;->I:Ljava/lang/Object;

    const/4 v0, 0x3

    iput v0, v4, LP6/m$a;->L:I

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x6

    const/16 v21, 0x0

    move-object v15, v2

    move-object/from16 v19, v4

    invoke-static/range {v15 .. v21}, Lio/ktor/utils/io/k;->i(Lio/ktor/utils/io/g;[BIILm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_1

    return-object v3

    :goto_4
    instance-of v0, v14, LP6/n$b;

    if-eqz v0, :cond_5

    check-cast v14, LP6/n$b;

    invoke-virtual {v14}, LP6/n$b;->c()Lx7/a;

    move-result-object v0

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/AutoCloseable;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :try_start_9
    move-object v0, v8

    check-cast v0, Lo9/q;

    iput-object v7, v4, LP6/m$a;->F:Ljava/lang/Object;

    iput-object v2, v4, LP6/m$a;->G:Ljava/lang/Object;

    iput-object v6, v4, LP6/m$a;->H:Ljava/lang/Object;

    iput-object v8, v4, LP6/m$a;->I:Ljava/lang/Object;

    const/4 v9, 0x4

    iput v9, v4, LP6/m$a;->L:I

    invoke-static {v0, v2, v4}, LP6/b;->a(Lo9/q;Lio/ktor/utils/io/g;Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_4

    return-object v3

    :cond_4
    :goto_5
    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    :try_start_a
    invoke-static {v8, v5}, Lv7/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    goto :goto_8

    :catchall_4
    move-exception v0

    goto/16 :goto_a

    :catchall_5
    move-exception v0

    move-object v6, v0

    :goto_6
    :try_start_b
    throw v6
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    :catchall_6
    move-exception v0

    move-object v7, v0

    :try_start_c
    invoke-static {v8, v6}, Lv7/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v7

    :cond_5
    instance-of v0, v14, LP6/n$a;

    if-eqz v0, :cond_8

    check-cast v14, LP6/n$a;

    invoke-virtual {v14}, LP6/n$a;->c()Lx7/a;

    move-result-object v0

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/ktor/utils/io/d;

    iput-object v7, v4, LP6/m$a;->F:Ljava/lang/Object;

    iput-object v2, v4, LP6/m$a;->G:Ljava/lang/Object;

    iput-object v6, v4, LP6/m$a;->H:Ljava/lang/Object;

    iput-object v5, v4, LP6/m$a;->I:Ljava/lang/Object;

    const/4 v8, 0x5

    iput v8, v4, LP6/m$a;->L:I

    invoke-static {v0, v2, v4}, Lio/ktor/utils/io/f;->b(Lio/ktor/utils/io/d;Lio/ktor/utils/io/g;Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_6

    return-object v3

    :cond_6
    move-object/from16 v22, v6

    move-object v6, v2

    move-object v2, v4

    move-object/from16 v4, v22

    :goto_7
    move-object/from16 v22, v4

    move-object v4, v2

    move-object v2, v6

    move-object/from16 v6, v22

    :goto_8
    invoke-static {}, LP6/b;->c()[B

    move-result-object v9

    iput-object v7, v4, LP6/m$a;->F:Ljava/lang/Object;

    iput-object v2, v4, LP6/m$a;->G:Ljava/lang/Object;

    iput-object v6, v4, LP6/m$a;->H:Ljava/lang/Object;

    iput-object v5, v4, LP6/m$a;->I:Ljava/lang/Object;

    const/4 v0, 0x6

    iput v0, v4, LP6/m$a;->L:I

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x6

    const/4 v14, 0x0

    move-object v8, v2

    move-object v12, v4

    invoke-static/range {v8 .. v14}, Lio/ktor/utils/io/k;->i(Lio/ktor/utils/io/g;[BIILm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_7

    return-object v3

    :cond_7
    move-object v0, v6

    move-object v13, v7

    goto/16 :goto_1

    :cond_8
    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0

    :cond_9
    iget-object v7, v13, LP6/m;->d:[B

    iput-object v2, v4, LP6/m$a;->F:Ljava/lang/Object;

    iput-object v5, v4, LP6/m$a;->G:Ljava/lang/Object;

    iput-object v5, v4, LP6/m$a;->H:Ljava/lang/Object;

    const/4 v0, 0x7

    iput v0, v4, LP6/m$a;->L:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object v6, v2

    move-object v10, v4

    invoke-static/range {v6 .. v12}, Lio/ktor/utils/io/k;->i(Lio/ktor/utils/io/g;[BIILm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    if-ne v0, v3, :cond_a

    return-object v3

    :cond_a
    move-object/from16 v22, v4

    move-object v4, v2

    move-object/from16 v2, v22

    :goto_9
    iput-object v5, v2, LP6/m$a;->F:Ljava/lang/Object;

    const/16 v0, 0x8

    iput v0, v2, LP6/m$a;->L:I

    invoke-interface {v4, v2}, Lio/ktor/utils/io/g;->e(Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_b

    return-object v3

    :catchall_7
    move-exception v0

    move-object v4, v2

    move-object/from16 v2, p1

    :goto_a
    :try_start_d
    invoke-static {v2, v0}, Lio/ktor/utils/io/k;->c(Lio/ktor/utils/io/g;Ljava/lang/Throwable;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    iput-object v5, v4, LP6/m$a;->F:Ljava/lang/Object;

    iput-object v5, v4, LP6/m$a;->G:Ljava/lang/Object;

    iput-object v5, v4, LP6/m$a;->H:Ljava/lang/Object;

    iput-object v5, v4, LP6/m$a;->I:Ljava/lang/Object;

    const/16 v0, 0x9

    iput v0, v4, LP6/m$a;->L:I

    invoke-interface {v2, v4}, Lio/ktor/utils/io/g;->e(Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_b

    return-object v3

    :cond_b
    :goto_b
    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0

    :catchall_8
    move-exception v0

    move-object v6, v0

    iput-object v6, v4, LP6/m$a;->F:Ljava/lang/Object;

    iput-object v5, v4, LP6/m$a;->G:Ljava/lang/Object;

    iput-object v5, v4, LP6/m$a;->H:Ljava/lang/Object;

    iput-object v5, v4, LP6/m$a;->I:Ljava/lang/Object;

    const/16 v0, 0xa

    iput v0, v4, LP6/m$a;->L:I

    invoke-interface {v2, v4}, Lio/ktor/utils/io/g;->e(Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_c

    return-object v3

    :cond_c
    move-object v2, v6

    :goto_c
    throw v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
