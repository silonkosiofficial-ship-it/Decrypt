.class final Lf0/n$b;
.super Lo7/k;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf0/n;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:I

.field G:I

.field H:I

.field private synthetic I:Ljava/lang/Object;

.field final synthetic J:Lf0/n;


# direct methods
.method constructor <init>(Lf0/n;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lf0/n$b;->J:Lf0/n;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/k;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .prologue
    move-object/from16 v0, p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lf0/n$b;->H:I

    const/4 v3, 0x0

    const-wide/16 v4, 0x1

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/16 v8, 0x40

    const-wide/16 v10, 0x0

    const/4 v12, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v12, :cond_2

    if-eq v2, v7, :cond_1

    if-ne v2, v6, :cond_0

    iget v2, v0, Lf0/n$b;->F:I

    iget-object v7, v0, Lf0/n$b;->I:Ljava/lang/Object;

    check-cast v7, LR8/j;

    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget v2, v0, Lf0/n$b;->F:I

    iget-object v13, v0, Lf0/n$b;->I:Ljava/lang/Object;

    check-cast v13, LR8/j;

    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    iget v2, v0, Lf0/n$b;->G:I

    iget v13, v0, Lf0/n$b;->F:I

    iget-object v14, v0, Lf0/n$b;->E:Ljava/lang/Object;

    check-cast v14, [I

    iget-object v15, v0, Lf0/n$b;->I:Ljava/lang/Object;

    check-cast v15, LR8/j;

    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object v2, v0, Lf0/n$b;->I:Ljava/lang/Object;

    check-cast v2, LR8/j;

    iget-object v13, v0, Lf0/n$b;->J:Lf0/n;

    invoke-static {v13}, Lf0/n;->d(Lf0/n;)[I

    move-result-object v13

    if-eqz v13, :cond_6

    array-length v14, v13

    move-object v15, v2

    move v2, v14

    move-object v14, v13

    const/4 v13, 0x0

    :goto_0
    if-ge v13, v2, :cond_5

    aget v16, v14, v13

    invoke-static/range {v16 .. v16}, Lo7/b;->c(I)Ljava/lang/Integer;

    move-result-object v9

    iput-object v15, v0, Lf0/n$b;->I:Ljava/lang/Object;

    iput-object v14, v0, Lf0/n$b;->E:Ljava/lang/Object;

    iput v13, v0, Lf0/n$b;->F:I

    iput v2, v0, Lf0/n$b;->G:I

    iput v12, v0, Lf0/n$b;->H:I

    invoke-virtual {v15, v9, v0}, LR8/j;->b(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    add-int/2addr v13, v12

    goto :goto_0

    :cond_5
    move-object v2, v15

    :cond_6
    iget-object v9, v0, Lf0/n$b;->J:Lf0/n;

    invoke-static {v9}, Lf0/n;->g(Lf0/n;)J

    move-result-wide v13

    cmp-long v9, v13, v10

    if-eqz v9, :cond_9

    move-object v13, v2

    const/4 v2, 0x0

    :goto_2
    if-ge v2, v8, :cond_8

    iget-object v9, v0, Lf0/n$b;->J:Lf0/n;

    invoke-static {v9}, Lf0/n;->g(Lf0/n;)J

    move-result-wide v14

    shl-long v17, v4, v2

    and-long v14, v14, v17

    cmp-long v9, v14, v10

    if-eqz v9, :cond_7

    iget-object v9, v0, Lf0/n$b;->J:Lf0/n;

    invoke-static {v9}, Lf0/n;->f(Lf0/n;)I

    move-result v9

    add-int/2addr v9, v2

    invoke-static {v9}, Lo7/b;->c(I)Ljava/lang/Integer;

    move-result-object v9

    iput-object v13, v0, Lf0/n$b;->I:Ljava/lang/Object;

    iput-object v3, v0, Lf0/n$b;->E:Ljava/lang/Object;

    iput v2, v0, Lf0/n$b;->F:I

    iput v7, v0, Lf0/n$b;->H:I

    invoke-virtual {v13, v9, v0}, LR8/j;->b(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v1, :cond_7

    return-object v1

    :cond_7
    :goto_3
    add-int/2addr v2, v12

    goto :goto_2

    :cond_8
    move-object v2, v13

    :cond_9
    iget-object v7, v0, Lf0/n$b;->J:Lf0/n;

    invoke-static {v7}, Lf0/n;->o(Lf0/n;)J

    move-result-wide v13

    cmp-long v7, v13, v10

    if-eqz v7, :cond_c

    move-object v7, v2

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v8, :cond_c

    iget-object v2, v0, Lf0/n$b;->J:Lf0/n;

    invoke-static {v2}, Lf0/n;->o(Lf0/n;)J

    move-result-wide v13

    shl-long v15, v4, v9

    and-long/2addr v13, v15

    cmp-long v2, v13, v10

    if-eqz v2, :cond_b

    add-int/lit8 v2, v9, 0x40

    iget-object v13, v0, Lf0/n$b;->J:Lf0/n;

    invoke-static {v13}, Lf0/n;->f(Lf0/n;)I

    move-result v13

    add-int/2addr v2, v13

    invoke-static {v2}, Lo7/b;->c(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v7, v0, Lf0/n$b;->I:Ljava/lang/Object;

    iput-object v3, v0, Lf0/n$b;->E:Ljava/lang/Object;

    iput v9, v0, Lf0/n$b;->F:I

    iput v6, v0, Lf0/n$b;->H:I

    invoke-virtual {v7, v2, v0}, LR8/j;->b(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_a

    return-object v1

    :cond_a
    move v2, v9

    :goto_5
    move v9, v2

    :cond_b
    add-int/2addr v9, v12

    goto :goto_4

    :cond_c
    sget-object v1, Li7/M;->a:Li7/M;

    return-object v1
.end method

.method public final E(LR8/j;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lf0/n$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lf0/n$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lf0/n$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LR8/j;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lf0/n$b;->E(LR8/j;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, Lf0/n$b;

    iget-object v1, p0, Lf0/n$b;->J:Lf0/n;

    invoke-direct {v0, v1, p2}, Lf0/n$b;-><init>(Lf0/n;Lm7/e;)V

    iput-object p1, v0, Lf0/n$b;->I:Ljava/lang/Object;

    return-object v0
.end method
