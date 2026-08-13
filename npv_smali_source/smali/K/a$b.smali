.class final LK/a$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/a;->q(Lx7/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lx7/l;

.field final synthetic J:LK/a;

.field final synthetic K:LK/q0$a;


# direct methods
.method constructor <init>(Lx7/l;LK/a;LK/q0$a;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LK/a$b;->I:Lx7/l;

    iput-object p2, p0, LK/a$b;->J:LK/a;

    iput-object p3, p0, LK/a$b;->K:LK/q0$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LK/a$b;->G:I

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

    iget-object p1, p0, LK/a$b;->H:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Landroidx/compose/ui/platform/T0;

    new-instance p1, LK/a$b$a;

    iget-object v5, p0, LK/a$b;->I:Lx7/l;

    iget-object v6, p0, LK/a$b;->J:LK/a;

    iget-object v7, p0, LK/a$b;->K:LK/q0$a;

    const/4 v8, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, LK/a$b$a;-><init>(Landroidx/compose/ui/platform/T0;Lx7/l;LK/a;LK/q0$a;Lm7/e;)V

    iput v2, p0, LK/a$b;->G:I

    invoke-static {p1, p0}, LW8/O;->f(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public final H(Landroidx/compose/ui/platform/T0;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LK/a$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LK/a$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LK/a$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/platform/T0;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LK/a$b;->H(Landroidx/compose/ui/platform/T0;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 4

    new-instance v0, LK/a$b;

    iget-object v1, p0, LK/a$b;->I:Lx7/l;

    iget-object v2, p0, LK/a$b;->J:LK/a;

    iget-object v3, p0, LK/a$b;->K:LK/q0$a;

    invoke-direct {v0, v1, v2, v3, p2}, LK/a$b;-><init>(Lx7/l;LK/a;LK/q0$a;Lm7/e;)V

    iput-object p1, v0, LK/a$b;->H:Ljava/lang/Object;

    return-object v0
.end method
