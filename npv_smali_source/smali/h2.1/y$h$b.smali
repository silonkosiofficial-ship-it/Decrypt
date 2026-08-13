.class public final Lh2/y$h$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/y$h;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:LZ8/f;

.field final synthetic J:LZ8/f;

.field final synthetic K:Lh2/w;


# direct methods
.method public constructor <init>(LZ8/f;LZ8/f;Lm7/e;Lh2/w;)V
    .locals 0

    iput-object p1, p0, Lh2/y$h$b;->I:LZ8/f;

    iput-object p2, p0, Lh2/y$h$b;->J:LZ8/f;

    iput-object p4, p0, Lh2/y$h$b;->K:Lh2/w;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .prologue
    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v4

    iget v5, v0, Lh2/y$h$b;->G:I

    if-eqz v5, :cond_1

    if-ne v5, v3, :cond_0

    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object v5, v0, Lh2/y$h$b;->H:Ljava/lang/Object;

    check-cast v5, Lh2/T;

    new-instance v13, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v13, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    new-instance v14, Lh2/Y;

    new-instance v6, Lh2/y$h$b$a;

    iget-object v7, v0, Lh2/y$h$b;->K:Lh2/w;

    const/4 v8, 0x0

    invoke-direct {v6, v5, v8, v7}, Lh2/y$h$b$a;-><init>(Lh2/T;Lm7/e;Lh2/w;)V

    invoke-direct {v14, v6}, Lh2/Y;-><init>(Lx7/r;)V

    invoke-static {v8, v3, v8}, LW8/C0;->b(LW8/z0;ILjava/lang/Object;)LW8/y;

    move-result-object v15

    iget-object v6, v0, Lh2/y$h$b;->I:LZ8/f;

    iget-object v7, v0, Lh2/y$h$b;->J:LZ8/f;

    new-array v12, v2, [LZ8/f;

    aput-object v6, v12, v1

    aput-object v7, v12, v3

    move v11, v1

    :goto_0
    if-ge v1, v2, :cond_2

    aget-object v7, v12, v1

    add-int/lit8 v16, v11, 0x1

    new-instance v17, Lh2/y$h$b$b;

    const/16 v18, 0x0

    move-object/from16 v6, v17

    move-object v8, v13

    move-object v9, v5

    move-object v10, v14

    move-object/from16 v19, v12

    move-object/from16 v12, v18

    invoke-direct/range {v6 .. v12}, Lh2/y$h$b$b;-><init>(LZ8/f;Ljava/util/concurrent/atomic/AtomicInteger;Lh2/T;Lh2/Y;ILm7/e;)V

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v8, 0x0

    move-object v6, v5

    move-object v7, v15

    move-object/from16 v9, v17

    invoke-static/range {v6 .. v11}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    add-int/2addr v1, v3

    move/from16 v11, v16

    move-object/from16 v12, v19

    goto :goto_0

    :cond_2
    new-instance v1, Lh2/y$h$b$c;

    invoke-direct {v1, v15}, Lh2/y$h$b$c;-><init>(LW8/y;)V

    iput v3, v0, Lh2/y$h$b;->G:I

    invoke-interface {v5, v1, v0}, Lh2/T;->m1(Lx7/a;Lm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_3

    return-object v4

    :cond_3
    :goto_1
    sget-object v1, Li7/M;->a:Li7/M;

    return-object v1
.end method

.method public final H(Lh2/T;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lh2/y$h$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lh2/y$h$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lh2/y$h$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh2/T;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lh2/y$h$b;->H(Lh2/T;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 4

    new-instance v0, Lh2/y$h$b;

    iget-object v1, p0, Lh2/y$h$b;->I:LZ8/f;

    iget-object v2, p0, Lh2/y$h$b;->J:LZ8/f;

    iget-object v3, p0, Lh2/y$h$b;->K:Lh2/w;

    invoke-direct {v0, v1, v2, p2, v3}, Lh2/y$h$b;-><init>(LZ8/f;LZ8/f;Lm7/e;Lh2/w;)V

    iput-object p1, v0, Lh2/y$h$b;->H:Ljava/lang/Object;

    return-object v0
.end method
