.class final LI6/d$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


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

.field synthetic I:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lm7/e;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, LI6/d$a;->G:I

    if-nez v0, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI6/d$a;->H:Ljava/lang/Object;

    check-cast p1, LO6/d;

    iget-object v0, p0, LI6/d$a;->I:Ljava/lang/Object;

    check-cast v0, LU6/b;

    invoke-virtual {p1}, LO6/d;->d()LW6/b;

    move-result-object p1

    invoke-static {}, LI6/d;->d()LW6/a;

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

.method public final H(LO6/d;LU6/b;Lm7/e;)Ljava/lang/Object;
    .locals 1

    new-instance v0, LI6/d$a;

    invoke-direct {v0, p3}, LI6/d$a;-><init>(Lm7/e;)V

    iput-object p1, v0, LI6/d$a;->H:Ljava/lang/Object;

    iput-object p2, v0, LI6/d$a;->I:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, LI6/d$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO6/d;

    check-cast p2, LU6/b;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, LI6/d$a;->H(LO6/d;LU6/b;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
