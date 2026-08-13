.class public final Lh2/z$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/z;->q(LZ8/f;Lh2/t;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:Lh2/z;

.field final synthetic K:Lh2/t;

.field L:Ljava/lang/Object;

.field M:I


# direct methods
.method public constructor <init>(Lm7/e;Lh2/z;Lh2/t;)V
    .locals 0

    iput-object p2, p0, Lh2/z$b;->J:Lh2/z;

    iput-object p3, p0, Lh2/z$b;->K:Lh2/t;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lh2/z$b;->G:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, Lh2/z$b;->M:I

    iget-object v5, p0, Lh2/z$b;->L:Ljava/lang/Object;

    check-cast v5, Lf9/a;

    iget-object v6, p0, Lh2/z$b;->I:Ljava/lang/Object;

    check-cast v6, Lh2/B$a;

    iget-object v7, p0, Lh2/z$b;->H:Ljava/lang/Object;

    check-cast v7, LZ8/g;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lh2/z$b;->H:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, LZ8/g;

    iget-object p1, p0, Lh2/z$b;->I:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object p1, p0, Lh2/z$b;->J:Lh2/z;

    invoke-static {p1}, Lh2/z;->k(Lh2/z;)Lh2/B$a;

    move-result-object v6

    invoke-static {v6}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object v5

    iput-object v7, p0, Lh2/z$b;->H:Ljava/lang/Object;

    iput-object v6, p0, Lh2/z$b;->I:Ljava/lang/Object;

    iput-object v5, p0, Lh2/z$b;->L:Ljava/lang/Object;

    iput v1, p0, Lh2/z$b;->M:I

    iput v3, p0, Lh2/z$b;->G:I

    invoke-interface {v5, v4, p0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    :try_start_0
    invoke-static {v6}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object p1

    invoke-virtual {p1}, Lh2/B;->p()Lh2/w;

    move-result-object v6

    iget-object v8, p0, Lh2/z$b;->K:Lh2/t;

    invoke-virtual {v6, v8}, Lh2/w;->a(Lh2/t;)Lh2/r;

    move-result-object v6

    sget-object v8, Lh2/r$c;->b:Lh2/r$c$a;

    invoke-virtual {v8}, Lh2/r$c$a;->a()Lh2/r$c;

    move-result-object v9

    invoke-static {v6, v9}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const/4 v9, 0x0

    if-eqz v6, :cond_4

    new-array p1, v9, [Lh2/l;

    invoke-static {p1}, LZ8/h;->A([Ljava/lang/Object;)LZ8/f;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v5, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_4
    :try_start_1
    invoke-virtual {p1}, Lh2/B;->p()Lh2/w;

    move-result-object v6

    iget-object v10, p0, Lh2/z$b;->K:Lh2/t;

    invoke-virtual {v6, v10}, Lh2/w;->a(Lh2/t;)Lh2/r;

    move-result-object v6

    instance-of v6, v6, Lh2/r$a;

    if-nez v6, :cond_5

    invoke-virtual {p1}, Lh2/B;->p()Lh2/w;

    move-result-object p1

    iget-object v6, p0, Lh2/z$b;->K:Lh2/t;

    invoke-virtual {v8}, Lh2/r$c$a;->b()Lh2/r$c;

    move-result-object v8

    invoke-virtual {p1, v6, v8}, Lh2/w;->c(Lh2/t;Lh2/r;)V

    :cond_5
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v5, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    iget-object p1, p0, Lh2/z$b;->J:Lh2/z;

    invoke-static {p1}, Lh2/z;->e(Lh2/z;)Lh2/m;

    move-result-object p1

    iget-object v5, p0, Lh2/z$b;->K:Lh2/t;

    invoke-virtual {p1, v5}, Lh2/m;->c(Lh2/t;)LZ8/f;

    move-result-object p1

    if-nez v1, :cond_6

    move v3, v9

    :cond_6
    invoke-static {p1, v3}, LZ8/h;->o(LZ8/f;I)LZ8/f;

    move-result-object p1

    new-instance v3, Lh2/z$e;

    invoke-direct {v3, p1, v1}, Lh2/z$e;-><init>(LZ8/f;I)V

    move-object p1, v3

    :goto_1
    iput-object v4, p0, Lh2/z$b;->H:Ljava/lang/Object;

    iput-object v4, p0, Lh2/z$b;->I:Ljava/lang/Object;

    iput-object v4, p0, Lh2/z$b;->L:Ljava/lang/Object;

    iput v2, p0, Lh2/z$b;->G:I

    invoke-static {v7, p1, p0}, LZ8/h;->r(LZ8/g;LZ8/f;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :goto_3
    invoke-interface {v5, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1
.end method

.method public final H(LZ8/g;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lh2/z$b;

    iget-object v1, p0, Lh2/z$b;->J:Lh2/z;

    iget-object v2, p0, Lh2/z$b;->K:Lh2/t;

    invoke-direct {v0, p3, v1, v2}, Lh2/z$b;-><init>(Lm7/e;Lh2/z;Lh2/t;)V

    iput-object p1, v0, Lh2/z$b;->H:Ljava/lang/Object;

    iput-object p2, v0, Lh2/z$b;->I:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, Lh2/z$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ8/g;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, Lh2/z$b;->H(LZ8/g;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
