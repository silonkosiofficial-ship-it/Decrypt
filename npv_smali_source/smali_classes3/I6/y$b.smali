.class final LI6/y$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI6/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:Z

.field final synthetic K:Z

.field final synthetic L:LJ6/d;


# direct methods
.method constructor <init>(ZZLJ6/d;Lm7/e;)V
    .locals 0

    iput-boolean p1, p0, LI6/y$b;->J:Z

    iput-boolean p2, p0, LI6/y$b;->K:Z

    iput-object p3, p0, LI6/y$b;->L:LJ6/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI6/y$b;->G:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LI6/y$b;->I:Ljava/lang/Object;

    check-cast v1, LO6/d;

    iget-object v3, p0, LI6/y$b;->H:Ljava/lang/Object;

    check-cast v3, LJ6/k$a;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object v4, v1

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI6/y$b;->H:Ljava/lang/Object;

    check-cast p1, LJ6/k$a;

    iget-object v1, p0, LI6/y$b;->I:Ljava/lang/Object;

    check-cast v1, LO6/d;

    iput-object p1, p0, LI6/y$b;->H:Ljava/lang/Object;

    iput-object v1, p0, LI6/y$b;->I:Ljava/lang/Object;

    iput v3, p0, LI6/y$b;->G:I

    invoke-virtual {p1, v1, p0}, LJ6/k$a;->a(LO6/d;Lm7/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    return-object v0

    :cond_3
    move-object v4, v1

    move-object v9, v3

    move-object v3, p1

    move-object p1, v9

    :goto_0
    move-object v5, p1

    check-cast v5, LD6/b;

    iget-boolean p1, p0, LI6/y$b;->J:Z

    if-eqz p1, :cond_4

    invoke-static {}, LI6/y;->e()Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v5}, LD6/b;->d()LO6/b;

    move-result-object v1

    invoke-interface {v1}, LO6/b;->u0()LT6/A;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return-object v5

    :cond_4
    iget-boolean v6, p0, LI6/y$b;->K:Z

    iget-object p1, p0, LI6/y$b;->L:LJ6/d;

    invoke-virtual {p1}, LJ6/d;->b()LC6/c;

    move-result-object v7

    const/4 p1, 0x0

    iput-object p1, p0, LI6/y$b;->H:Ljava/lang/Object;

    iput-object p1, p0, LI6/y$b;->I:Ljava/lang/Object;

    iput v2, p0, LI6/y$b;->G:I

    move-object v8, p0

    invoke-static/range {v3 .. v8}, LI6/y;->d(LJ6/k$a;LO6/d;LD6/b;ZLC6/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    return-object p1
.end method

.method public final H(LJ6/k$a;LO6/d;Lm7/e;)Ljava/lang/Object;
    .locals 4

    new-instance v0, LI6/y$b;

    iget-boolean v1, p0, LI6/y$b;->J:Z

    iget-boolean v2, p0, LI6/y$b;->K:Z

    iget-object v3, p0, LI6/y$b;->L:LJ6/d;

    invoke-direct {v0, v1, v2, v3, p3}, LI6/y$b;-><init>(ZZLJ6/d;Lm7/e;)V

    iput-object p1, v0, LI6/y$b;->H:Ljava/lang/Object;

    iput-object p2, v0, LI6/y$b;->I:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, LI6/y$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ6/k$a;

    check-cast p2, LO6/d;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, LI6/y$b;->H(LJ6/k$a;LO6/d;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
