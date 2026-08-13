.class final LH/O$a$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/O$a;->a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:LW8/N;

.field final synthetic J:LV/w0;

.field final synthetic K:Lz/l;

.field final synthetic L:LV/G1;


# direct methods
.method constructor <init>(LW8/N;LV/w0;Lz/l;LV/G1;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LH/O$a$b;->I:LW8/N;

    iput-object p2, p0, LH/O$a$b;->J:LV/w0;

    iput-object p3, p0, LH/O$a$b;->K:Lz/l;

    iput-object p4, p0, LH/O$a$b;->L:LV/G1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LH/O$a$b;->G:I

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

    iget-object p1, p0, LH/O$a$b;->H:Ljava/lang/Object;

    check-cast p1, Lz0/K;

    new-instance v1, LH/O$a$b$a;

    iget-object v3, p0, LH/O$a$b;->I:LW8/N;

    iget-object v4, p0, LH/O$a$b;->J:LV/w0;

    iget-object v5, p0, LH/O$a$b;->K:Lz/l;

    const/4 v6, 0x0

    invoke-direct {v1, v3, v4, v5, v6}, LH/O$a$b$a;-><init>(LW8/N;LV/w0;Lz/l;Lm7/e;)V

    new-instance v3, LH/O$a$b$b;

    iget-object v4, p0, LH/O$a$b;->L:LV/G1;

    invoke-direct {v3, v4}, LH/O$a$b$b;-><init>(LV/G1;)V

    iput v2, p0, LH/O$a$b;->G:I

    invoke-static {p1, v1, v3, p0}, Lx/D;->h(Lz0/K;Lx7/q;Lx7/l;Lm7/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LH/O$a$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LH/O$a$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LH/O$a$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/K;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LH/O$a$b;->H(Lz0/K;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 7

    new-instance v6, LH/O$a$b;

    iget-object v1, p0, LH/O$a$b;->I:LW8/N;

    iget-object v2, p0, LH/O$a$b;->J:LV/w0;

    iget-object v3, p0, LH/O$a$b;->K:Lz/l;

    iget-object v4, p0, LH/O$a$b;->L:LV/G1;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LH/O$a$b;-><init>(LW8/N;LV/w0;Lz/l;LV/G1;Lm7/e;)V

    iput-object p1, v6, LH/O$a$b;->H:Ljava/lang/Object;

    return-object v6
.end method
