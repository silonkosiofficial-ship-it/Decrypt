.class final LB9/d$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB9/d;->c(Lx7/p;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LB9/f;

.field final synthetic I:LV/G1;


# direct methods
.method constructor <init>(LB9/f;LV/G1;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LB9/d$b;->H:LB9/f;

    iput-object p2, p0, LB9/d$b;->I:LV/G1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, LB9/d$b;->G:I

    if-nez v0, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LB9/d$b;->H:LB9/f;

    invoke-virtual {p1}, LB9/f;->j()Le/w;

    move-result-object p1

    iget-object v0, p0, LB9/d$b;->I:LV/G1;

    invoke-static {v0}, LB9/d;->g(LV/G1;)Z

    move-result v0

    invoke-virtual {p1, v0}, Le/w;->j(Z)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LB9/d$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LB9/d$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LB9/d$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LB9/d$b;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance p1, LB9/d$b;

    iget-object v0, p0, LB9/d$b;->H:LB9/f;

    iget-object v1, p0, LB9/d$b;->I:LV/G1;

    invoke-direct {p1, v0, v1, p2}, LB9/d$b;-><init>(LB9/f;LV/G1;Lm7/e;)V

    return-object p1
.end method
