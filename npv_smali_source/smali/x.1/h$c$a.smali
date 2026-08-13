.class final Lx/h$c$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/h$c;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lx/I;

.field final synthetic J:Lx/h;

.field final synthetic K:Lx/f;

.field final synthetic L:LW8/z0;


# direct methods
.method constructor <init>(Lx/I;Lx/h;Lx/f;LW8/z0;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lx/h$c$a;->I:Lx/I;

    iput-object p2, p0, Lx/h$c$a;->J:Lx/h;

    iput-object p3, p0, Lx/h$c$a;->K:Lx/f;

    iput-object p4, p0, Lx/h$c$a;->L:LW8/z0;

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

    iget v1, p0, Lx/h$c$a;->G:I

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

    iget-object p1, p0, Lx/h$c$a;->H:Ljava/lang/Object;

    check-cast p1, Lx/r;

    iget-object v1, p0, Lx/h$c$a;->I:Lx/I;

    iget-object v3, p0, Lx/h$c$a;->J:Lx/h;

    iget-object v4, p0, Lx/h$c$a;->K:Lx/f;

    invoke-static {v3, v4}, Lx/h;->T1(Lx/h;Lx/f;)F

    move-result v3

    invoke-virtual {v1, v3}, Lx/I;->j(F)V

    iget-object v1, p0, Lx/h$c$a;->I:Lx/I;

    new-instance v3, Lx/h$c$a$a;

    iget-object v4, p0, Lx/h$c$a;->J:Lx/h;

    iget-object v5, p0, Lx/h$c$a;->L:LW8/z0;

    invoke-direct {v3, v4, v1, v5, p1}, Lx/h$c$a$a;-><init>(Lx/h;Lx/I;LW8/z0;Lx/r;)V

    new-instance p1, Lx/h$c$a$b;

    iget-object v4, p0, Lx/h$c$a;->J:Lx/h;

    iget-object v5, p0, Lx/h$c$a;->I:Lx/I;

    iget-object v6, p0, Lx/h$c$a;->K:Lx/f;

    invoke-direct {p1, v4, v5, v6}, Lx/h$c$a$b;-><init>(Lx/h;Lx/I;Lx/f;)V

    iput v2, p0, Lx/h$c$a;->G:I

    invoke-virtual {v1, v3, p1, p0}, Lx/I;->h(Lx7/l;Lx7/a;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(Lx/r;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx/h$c$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lx/h$c$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lx/h$c$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx/r;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lx/h$c$a;->H(Lx/r;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 7

    new-instance v6, Lx/h$c$a;

    iget-object v1, p0, Lx/h$c$a;->I:Lx/I;

    iget-object v2, p0, Lx/h$c$a;->J:Lx/h;

    iget-object v3, p0, Lx/h$c$a;->K:Lx/f;

    iget-object v4, p0, Lx/h$c$a;->L:LW8/z0;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lx/h$c$a;-><init>(Lx/I;Lx/h;Lx/f;LW8/z0;Lm7/e;)V

    iput-object p1, v6, Lx/h$c$a;->H:Ljava/lang/Object;

    return-object v6
.end method
