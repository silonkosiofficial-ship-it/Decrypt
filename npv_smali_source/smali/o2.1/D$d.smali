.class final Lo2/D$d;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo2/D;->j([Ljava/lang/String;[IZ)LZ8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lo2/D;

.field final synthetic J:[I

.field final synthetic K:Z

.field final synthetic L:[Ljava/lang/String;


# direct methods
.method constructor <init>(Lo2/D;[IZ[Ljava/lang/String;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lo2/D$d;->I:Lo2/D;

    iput-object p2, p0, Lo2/D$d;->J:[I

    iput-boolean p3, p0, Lo2/D$d;->K:Z

    iput-object p4, p0, Lo2/D$d;->L:[Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lo2/D$d;->G:I

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-eq v1, v3, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    iget-object v1, p0, Lo2/D$d;->H:Ljava/lang/Object;

    check-cast v1, LZ8/g;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lo2/D$d;->H:Ljava/lang/Object;

    check-cast v1, LZ8/g;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lo2/D$d;->H:Ljava/lang/Object;

    check-cast p1, LZ8/g;

    iget-object v1, p0, Lo2/D$d;->I:Lo2/D;

    invoke-static {v1}, Lo2/D;->c(Lo2/D;)Lo2/i;

    move-result-object v1

    iget-object v6, p0, Lo2/D$d;->J:[I

    invoke-virtual {v1, v6}, Lo2/i;->c([I)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lo2/D$d;->I:Lo2/D;

    invoke-static {v1}, Lo2/D;->b(Lo2/D;)Lo2/n;

    move-result-object v1

    iput-object p1, p0, Lo2/D$d;->H:Ljava/lang/Object;

    iput v5, p0, Lo2/D$d;->G:I

    const/4 v5, 0x0

    invoke-static {v1, v5, p0}, Lw2/b;->c(Lo2/n;ZLm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v10, v1

    move-object v1, p1

    move-object p1, v10

    :goto_0
    check-cast p1, Lm7/i;

    new-instance v5, Lo2/D$d$a;

    iget-object v6, p0, Lo2/D$d;->I:Lo2/D;

    invoke-direct {v5, v6, v2}, Lo2/D$d$a;-><init>(Lo2/D;Lm7/e;)V

    iput-object v1, p0, Lo2/D$d;->H:Ljava/lang/Object;

    iput v4, p0, Lo2/D$d;->G:I

    invoke-static {p1, v5, p0}, LW8/g;->g(Lm7/i;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    move-object v7, v1

    goto :goto_2

    :cond_6
    move-object v7, p1

    :goto_2
    :try_start_1
    new-instance v5, Ly7/O;

    invoke-direct {v5}, Ly7/O;-><init>()V

    iget-object p1, p0, Lo2/D$d;->I:Lo2/D;

    invoke-static {p1}, Lo2/D;->d(Lo2/D;)Lo2/j;

    move-result-object p1

    new-instance v1, Lo2/D$d$b;

    iget-boolean v6, p0, Lo2/D$d;->K:Z

    iget-object v8, p0, Lo2/D$d;->L:[Ljava/lang/String;

    iget-object v9, p0, Lo2/D$d;->J:[I

    move-object v4, v1

    invoke-direct/range {v4 .. v9}, Lo2/D$d$b;-><init>(Ly7/O;ZLZ8/g;[Ljava/lang/String;[I)V

    iput-object v2, p0, Lo2/D$d;->H:Ljava/lang/Object;

    iput v3, p0, Lo2/D$d;->G:I

    invoke-virtual {p1, v1, p0}, Lo2/j;->a(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_3
    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    iget-object v0, p0, Lo2/D$d;->I:Lo2/D;

    invoke-static {v0}, Lo2/D;->c(Lo2/D;)Lo2/i;

    move-result-object v0

    iget-object v1, p0, Lo2/D$d;->J:[I

    invoke-virtual {v0, v1}, Lo2/i;->d([I)Z

    throw p1
.end method

.method public final H(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lo2/D$d;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lo2/D$d;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lo2/D$d;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ8/g;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lo2/D$d;->H(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 7

    new-instance v6, Lo2/D$d;

    iget-object v1, p0, Lo2/D$d;->I:Lo2/D;

    iget-object v2, p0, Lo2/D$d;->J:[I

    iget-boolean v3, p0, Lo2/D$d;->K:Z

    iget-object v4, p0, Lo2/D$d;->L:[Ljava/lang/String;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lo2/D$d;-><init>(Lo2/D;[IZ[Ljava/lang/String;Lm7/e;)V

    iput-object p1, v6, Lo2/D$d;->H:Ljava/lang/Object;

    return-object v6
.end method
