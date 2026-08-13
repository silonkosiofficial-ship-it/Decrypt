.class final Landroidx/compose/ui/platform/V$c;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/V;->b(Landroidx/compose/ui/platform/Q0;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:I

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:Landroidx/compose/ui/platform/V;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/V;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/V$c;->J:Landroidx/compose/ui/platform/V;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/ui/platform/V$c;->H:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/V$c;->G:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/platform/V;

    iget-object v0, p0, Landroidx/compose/ui/platform/V$c;->I:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/platform/C0;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/V$c;->I:Ljava/lang/Object;

    check-cast p1, Landroidx/compose/ui/platform/C0;

    iget-object v1, p0, Landroidx/compose/ui/platform/V$c;->J:Landroidx/compose/ui/platform/V;

    iput-object p1, p0, Landroidx/compose/ui/platform/V$c;->I:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/compose/ui/platform/V$c;->G:Ljava/lang/Object;

    iput v2, p0, Landroidx/compose/ui/platform/V$c;->H:I

    new-instance v3, LW8/n;

    invoke-static {p0}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v4

    invoke-direct {v3, v4, v2}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {v3}, LW8/n;->E()V

    invoke-static {v1}, Landroidx/compose/ui/platform/V;->d(Landroidx/compose/ui/platform/V;)LS0/X;

    move-result-object v2

    invoke-virtual {v2}, LS0/X;->e()V

    new-instance v2, Landroidx/compose/ui/platform/V$c$a;

    invoke-direct {v2, p1, v1}, Landroidx/compose/ui/platform/V$c$a;-><init>(Landroidx/compose/ui/platform/C0;Landroidx/compose/ui/platform/V;)V

    invoke-interface {v3, v2}, LW8/l;->G(Lx7/l;)V

    invoke-virtual {v3}, LW8/n;->x()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_2

    invoke-static {p0}, Lo7/h;->c(Lm7/e;)V

    :cond_2
    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public final H(Landroidx/compose/ui/platform/C0;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/V$c;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/platform/V$c;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Landroidx/compose/ui/platform/V$c;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/platform/C0;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/V$c;->H(Landroidx/compose/ui/platform/C0;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, Landroidx/compose/ui/platform/V$c;

    iget-object v1, p0, Landroidx/compose/ui/platform/V$c;->J:Landroidx/compose/ui/platform/V;

    invoke-direct {v0, v1, p2}, Landroidx/compose/ui/platform/V$c;-><init>(Landroidx/compose/ui/platform/V;Lm7/e;)V

    iput-object p1, v0, Landroidx/compose/ui/platform/V$c;->I:Ljava/lang/Object;

    return-object v0
.end method
