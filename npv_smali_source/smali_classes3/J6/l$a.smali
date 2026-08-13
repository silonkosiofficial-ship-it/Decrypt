.class final LJ6/l$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ6/l;->b(LC6/c;Lx7/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lx7/p;


# direct methods
.method constructor <init>(Lx7/p;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LJ6/l$a;->I:Lx7/p;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LJ6/l$a;->G:I

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

    iget-object p1, p0, LJ6/l$a;->H:Ljava/lang/Object;

    check-cast p1, La7/e;

    iget-object v1, p0, LJ6/l$a;->I:Lx7/p;

    invoke-virtual {p1}, La7/e;->b()Ljava/lang/Object;

    move-result-object p1

    iput v2, p0, LJ6/l$a;->G:I

    invoke-interface {v1, p1, p0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(La7/e;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 1

    new-instance p2, LJ6/l$a;

    iget-object v0, p0, LJ6/l$a;->I:Lx7/p;

    invoke-direct {p2, v0, p3}, LJ6/l$a;-><init>(Lx7/p;Lm7/e;)V

    iput-object p1, p2, LJ6/l$a;->H:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {p2, p1}, LJ6/l$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La7/e;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, LJ6/l$a;->H(La7/e;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
