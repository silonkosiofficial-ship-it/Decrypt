.class final Landroidx/compose/ui/window/b$e;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/b;->a(Landroidx/compose/ui/window/r;Lx7/a;Landroidx/compose/ui/window/s;Lx7/p;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Landroidx/compose/ui/window/l;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/l;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/b$e;->I:Landroidx/compose/ui/window/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/ui/window/b$e;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Landroidx/compose/ui/window/b$e;->H:Ljava/lang/Object;

    check-cast v1, LW8/N;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/ui/window/b$e;->H:Ljava/lang/Object;

    check-cast p1, LW8/N;

    move-object v1, p1

    :goto_0
    invoke-static {v1}, LW8/O;->h(LW8/N;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Landroidx/compose/ui/window/b$e$a;->D:Landroidx/compose/ui/window/b$e$a;

    iput-object v1, p0, Landroidx/compose/ui/window/b$e;->H:Ljava/lang/Object;

    iput v2, p0, Landroidx/compose/ui/window/b$e;->G:I

    invoke-static {p1, p0}, Landroidx/compose/ui/platform/B0;->a(Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_1
    iget-object p1, p0, Landroidx/compose/ui/window/b$e;->I:Landroidx/compose/ui/window/l;

    invoke-virtual {p1}, Landroidx/compose/ui/window/l;->q()V

    goto :goto_0

    :cond_3
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/window/b$e;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/window/b$e;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Landroidx/compose/ui/window/b$e;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/window/b$e;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, Landroidx/compose/ui/window/b$e;

    iget-object v1, p0, Landroidx/compose/ui/window/b$e;->I:Landroidx/compose/ui/window/l;

    invoke-direct {v0, v1, p2}, Landroidx/compose/ui/window/b$e;-><init>(Landroidx/compose/ui/window/l;Lm7/e;)V

    iput-object p1, v0, Landroidx/compose/ui/window/b$e;->H:Ljava/lang/Object;

    return-object v0
.end method
