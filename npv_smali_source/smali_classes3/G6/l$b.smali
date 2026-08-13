.class final LG6/l$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG6/l;->o(LX9/f;Lm7/i;LO6/e;)Lio/ktor/utils/io/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:Ljava/lang/Object;

.field K:Ljava/lang/Object;

.field L:I

.field private synthetic M:Ljava/lang/Object;

.field final synthetic N:LX9/f;

.field final synthetic O:Lm7/i;

.field final synthetic P:LO6/e;


# direct methods
.method constructor <init>(LX9/f;Lm7/i;LO6/e;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LG6/l$b;->N:LX9/f;

    iput-object p2, p0, LG6/l$b;->O:Lm7/i;

    iput-object p3, p0, LG6/l$b;->P:LO6/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method

.method public static synthetic H(Ly7/M;LX9/f;LO6/e;Lm7/i;Ljava/nio/ByteBuffer;)Li7/M;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LG6/l$b;->K(Ly7/M;LX9/f;LO6/e;Lm7/i;Ljava/nio/ByteBuffer;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method private static final K(Ly7/M;LX9/f;LO6/e;Lm7/i;Ljava/nio/ByteBuffer;)Li7/M;
    .locals 0

    .prologue
    :try_start_0
    invoke-interface {p1, p4}, Ljava/nio/channels/ReadableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput p1, p0, Ly7/M;->C:I

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    sget-object p1, Li7/w;->D:Li7/w$a;

    invoke-static {p3}, LW8/C0;->m(Lm7/i;)LW8/z0;

    move-result-object p1

    invoke-interface {p1}, LW8/z0;->e0()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    sget-object p3, Li7/w;->D:Li7/w$a;

    invoke-static {p1}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Li7/w;->g(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    check-cast p1, Ljava/util/concurrent/CancellationException;

    if-eqz p1, :cond_1

    move-object p0, p1

    :cond_1
    invoke-static {p0, p2}, LG6/l;->e(Ljava/lang/Throwable;LO6/e;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .prologue
    move-object/from16 v7, p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, v7, LG6/l$b;->L:I

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v9, :cond_2

    if-ne v1, v8, :cond_1

    iget-object v1, v7, LG6/l$b;->K:Ljava/lang/Object;

    check-cast v1, Ly7/M;

    iget-object v2, v7, LG6/l$b;->J:Ljava/lang/Object;

    check-cast v2, LX9/f;

    iget-object v3, v7, LG6/l$b;->I:Ljava/lang/Object;

    check-cast v3, LO6/e;

    iget-object v4, v7, LG6/l$b;->H:Ljava/lang/Object;

    check-cast v4, Lm7/i;

    iget-object v5, v7, LG6/l$b;->G:Ljava/lang/Object;

    check-cast v5, Ljava/io/Closeable;

    iget-object v6, v7, LG6/l$b;->M:Ljava/lang/Object;

    check-cast v6, Lio/ktor/utils/io/t;

    :try_start_0
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    move-object v13, v1

    move-object v14, v2

    move-object v12, v3

    move-object v11, v4

    move-object v15, v5

    move-object v10, v6

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    goto/16 :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v1, v7, LG6/l$b;->K:Ljava/lang/Object;

    check-cast v1, Ly7/M;

    iget-object v2, v7, LG6/l$b;->J:Ljava/lang/Object;

    check-cast v2, LX9/f;

    iget-object v3, v7, LG6/l$b;->I:Ljava/lang/Object;

    check-cast v3, LO6/e;

    iget-object v4, v7, LG6/l$b;->H:Ljava/lang/Object;

    check-cast v4, Lm7/i;

    iget-object v5, v7, LG6/l$b;->G:Ljava/lang/Object;

    check-cast v5, Ljava/io/Closeable;

    iget-object v6, v7, LG6/l$b;->M:Ljava/lang/Object;

    check-cast v6, Lio/ktor/utils/io/t;

    :try_start_1
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_3
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object v1, v7, LG6/l$b;->M:Ljava/lang/Object;

    check-cast v1, Lio/ktor/utils/io/t;

    iget-object v5, v7, LG6/l$b;->N:LX9/f;

    iget-object v2, v7, LG6/l$b;->O:Lm7/i;

    iget-object v3, v7, LG6/l$b;->P:LO6/e;

    :try_start_2
    new-instance v4, Ly7/M;

    invoke-direct {v4}, Ly7/M;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v10, v1

    move-object v11, v2

    move-object v12, v3

    move-object v13, v4

    move-object v14, v5

    move-object v15, v14

    :goto_0
    :try_start_3
    invoke-interface {v14}, Ljava/nio/channels/Channel;->isOpen()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v11}, LW8/C0;->p(Lm7/i;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget v1, v13, Ly7/M;->C:I

    if-ltz v1, :cond_5

    invoke-virtual {v10}, Lio/ktor/utils/io/t;->a()Lio/ktor/utils/io/g;

    move-result-object v1

    new-instance v3, LG6/m;

    invoke-direct {v3, v13, v14, v12, v11}, LG6/m;-><init>(Ly7/M;LX9/f;LO6/e;Lm7/i;)V

    iput-object v10, v7, LG6/l$b;->M:Ljava/lang/Object;

    iput-object v15, v7, LG6/l$b;->G:Ljava/lang/Object;

    iput-object v11, v7, LG6/l$b;->H:Ljava/lang/Object;

    iput-object v12, v7, LG6/l$b;->I:Ljava/lang/Object;

    iput-object v14, v7, LG6/l$b;->J:Ljava/lang/Object;

    iput-object v13, v7, LG6/l$b;->K:Ljava/lang/Object;

    iput v9, v7, LG6/l$b;->L:I

    const/4 v2, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object/from16 v4, p0

    invoke-static/range {v1 .. v6}, Lio/ktor/utils/io/l;->b(Lio/ktor/utils/io/g;ILx7/l;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne v1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v6, v10

    move-object v4, v11

    move-object v3, v12

    move-object v1, v13

    move-object v2, v14

    move-object v5, v15

    :goto_1
    :try_start_4
    invoke-virtual {v6}, Lio/ktor/utils/io/t;->a()Lio/ktor/utils/io/g;

    move-result-object v10

    iput-object v6, v7, LG6/l$b;->M:Ljava/lang/Object;

    iput-object v5, v7, LG6/l$b;->G:Ljava/lang/Object;

    iput-object v4, v7, LG6/l$b;->H:Ljava/lang/Object;

    iput-object v3, v7, LG6/l$b;->I:Ljava/lang/Object;

    iput-object v2, v7, LG6/l$b;->J:Ljava/lang/Object;

    iput-object v1, v7, LG6/l$b;->K:Ljava/lang/Object;

    iput v8, v7, LG6/l$b;->L:I

    invoke-interface {v10, v7}, Lio/ktor/utils/io/g;->g(Lm7/e;)Ljava/lang/Object;

    move-result-object v10
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-ne v10, v0, :cond_0

    return-object v0

    :catchall_1
    move-exception v0

    move-object v1, v0

    move-object v5, v15

    goto :goto_3

    :cond_5
    :try_start_5
    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-eqz v15, :cond_6

    :try_start_6
    invoke-interface {v15}, Ljava/io/Closeable;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    goto :goto_5

    :cond_6
    :goto_2
    const/4 v0, 0x0

    goto :goto_5

    :goto_3
    if-eqz v5, :cond_7

    :try_start_7
    invoke-interface {v5}, Ljava/io/Closeable;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v0

    move-object v2, v0

    invoke-static {v1, v2}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_7
    :goto_4
    move-object v0, v1

    :goto_5
    if-nez v0, :cond_8

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0

    :cond_8
    throw v0
.end method

.method public final I(Lio/ktor/utils/io/t;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LG6/l$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LG6/l$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LG6/l$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/ktor/utils/io/t;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LG6/l$b;->I(Lio/ktor/utils/io/t;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 4

    new-instance v0, LG6/l$b;

    iget-object v1, p0, LG6/l$b;->N:LX9/f;

    iget-object v2, p0, LG6/l$b;->O:Lm7/i;

    iget-object v3, p0, LG6/l$b;->P:LO6/e;

    invoke-direct {v0, v1, v2, v3, p2}, LG6/l$b;-><init>(LX9/f;Lm7/i;LO6/e;Lm7/e;)V

    iput-object p1, v0, LG6/l$b;->M:Ljava/lang/Object;

    return-object v0
.end method
