.class final LM1/j$g$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM1/j$g;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:LM1/v;


# direct methods
.method constructor <init>(LM1/v;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LM1/j$g$b;->I:LM1/v;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, LM1/j$g$b;->G:I

    if-nez v0, :cond_1

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LM1/j$g$b;->H:Ljava/lang/Object;

    check-cast p1, LM1/v;

    instance-of v0, p1, LM1/e;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LM1/v;->a()I

    move-result p1

    iget-object v0, p0, LM1/j$g$b;->I:LM1/v;

    invoke-virtual {v0}, LM1/v;->a()I

    move-result v0

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(LM1/v;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LM1/j$g$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LM1/j$g$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LM1/j$g$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LM1/v;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LM1/j$g$b;->H(LM1/v;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, LM1/j$g$b;

    iget-object v1, p0, LM1/j$g$b;->I:LM1/v;

    invoke-direct {v0, v1, p2}, LM1/j$g$b;-><init>(LM1/v;Lm7/e;)V

    iput-object p1, v0, LM1/j$g$b;->H:Ljava/lang/Object;

    return-object v0
.end method
