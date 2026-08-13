.class final Landroidx/compose/foundation/relocation/f$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/relocation/f;->j1(LD0/t;Lx7/a;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Landroidx/compose/foundation/relocation/f;

.field final synthetic J:LD0/t;

.field final synthetic K:Lx7/a;

.field final synthetic L:Lx7/a;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/relocation/f;LD0/t;Lx7/a;Lx7/a;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/relocation/f$b;->I:Landroidx/compose/foundation/relocation/f;

    iput-object p2, p0, Landroidx/compose/foundation/relocation/f$b;->J:LD0/t;

    iput-object p3, p0, Landroidx/compose/foundation/relocation/f$b;->K:Lx7/a;

    iput-object p4, p0, Landroidx/compose/foundation/relocation/f$b;->L:Lx7/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, Landroidx/compose/foundation/relocation/f$b;->G:I

    if-nez v0, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/foundation/relocation/f$b;->H:Ljava/lang/Object;

    check-cast p1, LW8/N;

    new-instance v3, Landroidx/compose/foundation/relocation/f$b$a;

    iget-object v0, p0, Landroidx/compose/foundation/relocation/f$b;->I:Landroidx/compose/foundation/relocation/f;

    iget-object v1, p0, Landroidx/compose/foundation/relocation/f$b;->J:LD0/t;

    iget-object v2, p0, Landroidx/compose/foundation/relocation/f$b;->K:Lx7/a;

    const/4 v6, 0x0

    invoke-direct {v3, v0, v1, v2, v6}, Landroidx/compose/foundation/relocation/f$b$a;-><init>(Landroidx/compose/foundation/relocation/f;LD0/t;Lx7/a;Lm7/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    new-instance v3, Landroidx/compose/foundation/relocation/f$b$b;

    iget-object v0, p0, Landroidx/compose/foundation/relocation/f$b;->I:Landroidx/compose/foundation/relocation/f;

    iget-object v1, p0, Landroidx/compose/foundation/relocation/f$b;->L:Lx7/a;

    invoke-direct {v3, v0, v1, v6}, Landroidx/compose/foundation/relocation/f$b$b;-><init>(Landroidx/compose/foundation/relocation/f;Lx7/a;Lm7/e;)V

    const/4 v1, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/relocation/f$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/relocation/f$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/relocation/f$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/relocation/f$b;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 7

    new-instance v6, Landroidx/compose/foundation/relocation/f$b;

    iget-object v1, p0, Landroidx/compose/foundation/relocation/f$b;->I:Landroidx/compose/foundation/relocation/f;

    iget-object v2, p0, Landroidx/compose/foundation/relocation/f$b;->J:LD0/t;

    iget-object v3, p0, Landroidx/compose/foundation/relocation/f$b;->K:Lx7/a;

    iget-object v4, p0, Landroidx/compose/foundation/relocation/f$b;->L:Lx7/a;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/relocation/f$b;-><init>(Landroidx/compose/foundation/relocation/f;LD0/t;Lx7/a;Lx7/a;Lm7/e;)V

    iput-object p1, v6, Landroidx/compose/foundation/relocation/f$b;->H:Ljava/lang/Object;

    return-object v6
.end method
