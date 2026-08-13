.class final Lx/C$f;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/C;->v(Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lx/C;

.field final synthetic J:Lx7/p;


# direct methods
.method constructor <init>(Lx/C;Lx7/p;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lx/C$f;->I:Lx/C;

    iput-object p2, p0, Lx/C$f;->J:Lx7/p;

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

    iget v1, p0, Lx/C$f;->G:I

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

    iget-object p1, p0, Lx/C$f;->H:Ljava/lang/Object;

    check-cast p1, Lx/w;

    iget-object v1, p0, Lx/C$f;->I:Lx/C;

    invoke-static {v1, p1}, Lx/C;->k(Lx/C;Lx/w;)V

    iget-object p1, p0, Lx/C$f;->J:Lx7/p;

    iget-object v1, p0, Lx/C$f;->I:Lx/C;

    invoke-static {v1}, Lx/C;->d(Lx/C;)Lx/C$c;

    move-result-object v1

    iput v2, p0, Lx/C$f;->G:I

    invoke-interface {p1, v1, p0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(Lx/w;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx/C$f;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lx/C$f;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lx/C$f;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx/w;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lx/C$f;->H(Lx/w;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, Lx/C$f;

    iget-object v1, p0, Lx/C$f;->I:Lx/C;

    iget-object v2, p0, Lx/C$f;->J:Lx7/p;

    invoke-direct {v0, v1, v2, p2}, Lx/C$f;-><init>(Lx/C;Lx7/p;Lm7/e;)V

    iput-object p1, v0, Lx/C$f;->H:Ljava/lang/Object;

    return-object v0
.end method
