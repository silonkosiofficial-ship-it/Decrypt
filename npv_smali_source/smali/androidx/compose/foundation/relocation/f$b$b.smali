.class final Landroidx/compose/foundation/relocation/f$b$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/relocation/f$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Landroidx/compose/foundation/relocation/f;

.field final synthetic I:Lx7/a;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/relocation/f;Lx7/a;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/relocation/f$b$b;->H:Landroidx/compose/foundation/relocation/f;

    iput-object p2, p0, Landroidx/compose/foundation/relocation/f$b$b;->I:Lx7/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/relocation/f$b$b;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/foundation/relocation/f$b$b;->H:Landroidx/compose/foundation/relocation/f;

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->A1()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroidx/compose/foundation/relocation/f$b$b;->H:Landroidx/compose/foundation/relocation/f;

    invoke-static {p1}, Landroidx/compose/foundation/relocation/b;->c(LF0/j;)LE/a;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v1, p0, Landroidx/compose/foundation/relocation/f$b$b;->H:Landroidx/compose/foundation/relocation/f;

    invoke-static {v1}, LF0/k;->k(LF0/j;)LD0/t;

    move-result-object v1

    iget-object v3, p0, Landroidx/compose/foundation/relocation/f$b$b;->I:Lx7/a;

    iput v2, p0, Landroidx/compose/foundation/relocation/f$b$b;->G:I

    invoke-interface {p1, v1, v3, p0}, LE/a;->j1(LD0/t;Lx7/a;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/relocation/f$b$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/relocation/f$b$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/relocation/f$b$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/relocation/f$b$b;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance p1, Landroidx/compose/foundation/relocation/f$b$b;

    iget-object v0, p0, Landroidx/compose/foundation/relocation/f$b$b;->H:Landroidx/compose/foundation/relocation/f;

    iget-object v1, p0, Landroidx/compose/foundation/relocation/f$b$b;->I:Lx7/a;

    invoke-direct {p1, v0, v1, p2}, Landroidx/compose/foundation/relocation/f$b$b;-><init>(Landroidx/compose/foundation/relocation/f;Lx7/a;Lm7/e;)V

    return-object p1
.end method
