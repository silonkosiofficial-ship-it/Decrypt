.class final LR/h$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR/h;->f(Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:LR/h;


# direct methods
.method constructor <init>(LR/h;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LR/h$b;->I:LR/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, LR/h$b;->G:I

    if-nez v0, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LR/h$b;->H:Ljava/lang/Object;

    check-cast p1, LW8/N;

    new-instance v3, LR/h$b$a;

    iget-object v0, p0, LR/h$b;->I:LR/h;

    const/4 v6, 0x0

    invoke-direct {v3, v0, v6}, LR/h$b$a;-><init>(LR/h;Lm7/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    new-instance v3, LR/h$b$b;

    iget-object v0, p0, LR/h$b;->I:LR/h;

    invoke-direct {v3, v0, v6}, LR/h$b$b;-><init>(LR/h;Lm7/e;)V

    move-object v0, p1

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    new-instance v3, LR/h$b$c;

    iget-object v0, p0, LR/h$b;->I:LR/h;

    invoke-direct {v3, v0, v6}, LR/h$b$c;-><init>(LR/h;Lm7/e;)V

    move-object v0, p1

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LR/h$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LR/h$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LR/h$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LR/h$b;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, LR/h$b;

    iget-object v1, p0, LR/h$b;->I:LR/h;

    invoke-direct {v0, v1, p2}, LR/h$b;-><init>(LR/h;Lm7/e;)V

    iput-object p1, v0, LR/h$b;->H:Ljava/lang/Object;

    return-object v0
.end method
