.class final LK/n0$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/n0;->z0(Lx7/p;)LW8/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LK/n0;

.field final synthetic I:Lx7/p;


# direct methods
.method constructor <init>(LK/n0;Lx7/p;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LK/n0$a;->H:LK/n0;

    iput-object p2, p0, LK/n0$a;->I:Lx7/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LK/n0$a;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LK/n0$a;->H:LK/n0;

    iget-object v1, p0, LK/n0$a;->I:Lx7/p;

    iput v2, p0, LK/n0$a;->G:I

    invoke-static {p1, v1, p0}, Landroidx/compose/ui/platform/S0;->b(Landroidx/compose/ui/platform/R0;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LK/n0$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LK/n0$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LK/n0$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LK/n0$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance p1, LK/n0$a;

    iget-object v0, p0, LK/n0$a;->H:LK/n0;

    iget-object v1, p0, LK/n0$a;->I:Lx7/p;

    invoke-direct {p1, v0, v1, p2}, LK/n0$a;-><init>(LK/n0;Lx7/p;Lm7/e;)V

    return-object p1
.end method
