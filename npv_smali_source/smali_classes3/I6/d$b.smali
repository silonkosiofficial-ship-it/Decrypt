.class final LI6/d$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI6/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lm7/e;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, LI6/d$b;->G:I

    if-nez v0, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI6/d$b;->H:Ljava/lang/Object;

    check-cast p1, LQ6/c;

    invoke-virtual {p1}, LQ6/c;->H0()LD6/b;

    move-result-object p1

    invoke-virtual {p1}, LD6/b;->d()LO6/b;

    move-result-object p1

    invoke-interface {p1}, LO6/b;->x0()LW6/b;

    move-result-object p1

    invoke-static {}, LI6/d;->c()LW6/a;

    move-result-object v0

    invoke-interface {p1, v0}, LW6/b;->c(LW6/a;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(LQ6/c;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LI6/d$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LI6/d$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LI6/d$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LQ6/c;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LI6/d$b;->H(LQ6/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 1

    new-instance v0, LI6/d$b;

    invoke-direct {v0, p2}, LI6/d$b;-><init>(Lm7/e;)V

    iput-object p1, v0, LI6/d$b;->H:Ljava/lang/Object;

    return-object v0
.end method
