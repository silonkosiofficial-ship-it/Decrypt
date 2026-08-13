.class final Landroidx/compose/foundation/gestures/b$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/b;->l2()Lz0/W;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Landroidx/compose/foundation/gestures/b;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/b;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b$b;->I:Landroidx/compose/foundation/gestures/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/gestures/b$b;->G:I

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

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$b;->H:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lz0/K;

    new-instance p1, LA0/d;

    invoke-direct {p1}, LA0/d;-><init>()V

    new-instance v6, Landroidx/compose/foundation/gestures/b$b$e;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b;->I:Landroidx/compose/foundation/gestures/b;

    invoke-direct {v6, v1, p1}, Landroidx/compose/foundation/gestures/b$b$e;-><init>(Landroidx/compose/foundation/gestures/b;LA0/d;)V

    new-instance v7, Landroidx/compose/foundation/gestures/b$b$d;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b;->I:Landroidx/compose/foundation/gestures/b;

    invoke-direct {v7, p1, v1}, Landroidx/compose/foundation/gestures/b$b$d;-><init>(LA0/d;Landroidx/compose/foundation/gestures/b;)V

    new-instance v8, Landroidx/compose/foundation/gestures/b$b$c;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b;->I:Landroidx/compose/foundation/gestures/b;

    invoke-direct {v8, v1}, Landroidx/compose/foundation/gestures/b$b$c;-><init>(Landroidx/compose/foundation/gestures/b;)V

    new-instance v9, Landroidx/compose/foundation/gestures/b$b$f;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b;->I:Landroidx/compose/foundation/gestures/b;

    invoke-direct {v9, v1}, Landroidx/compose/foundation/gestures/b$b$f;-><init>(Landroidx/compose/foundation/gestures/b;)V

    new-instance v10, Landroidx/compose/foundation/gestures/b$b$b;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b;->I:Landroidx/compose/foundation/gestures/b;

    invoke-direct {v10, p1, v1}, Landroidx/compose/foundation/gestures/b$b$b;-><init>(LA0/d;Landroidx/compose/foundation/gestures/b;)V

    new-instance p1, Landroidx/compose/foundation/gestures/b$b$a;

    iget-object v4, p0, Landroidx/compose/foundation/gestures/b$b;->I:Landroidx/compose/foundation/gestures/b;

    const/4 v11, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v11}, Landroidx/compose/foundation/gestures/b$b$a;-><init>(Landroidx/compose/foundation/gestures/b;Lz0/K;Lx7/q;Lx7/l;Lx7/a;Lx7/a;Lx7/p;Lm7/e;)V

    iput v2, p0, Landroidx/compose/foundation/gestures/b$b;->G:I

    invoke-static {p1, p0}, LW8/O;->f(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(Lz0/K;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/b$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/b$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/b$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/K;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/b$b;->H(Lz0/K;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, Landroidx/compose/foundation/gestures/b$b;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b;->I:Landroidx/compose/foundation/gestures/b;

    invoke-direct {v0, v1, p2}, Landroidx/compose/foundation/gestures/b$b;-><init>(Landroidx/compose/foundation/gestures/b;Lm7/e;)V

    iput-object p1, v0, Landroidx/compose/foundation/gestures/b$b;->H:Ljava/lang/Object;

    return-object v0
.end method
