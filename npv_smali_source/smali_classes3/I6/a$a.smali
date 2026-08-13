.class final LI6/a$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI6/a;->b(LC6/c;Lx7/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:Lx7/p;


# direct methods
.method constructor <init>(Lx7/p;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LI6/a$a;->J:Lx7/p;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI6/a$a;->G:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LI6/a$a;->H:Ljava/lang/Object;

    check-cast v1, La7/e;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI6/a$a;->H:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, La7/e;

    iget-object p1, p0, LI6/a$a;->I:Ljava/lang/Object;

    check-cast p1, LQ6/c;

    iget-object v4, p0, LI6/a$a;->J:Lx7/p;

    iput-object v1, p0, LI6/a$a;->H:Ljava/lang/Object;

    iput v3, p0, LI6/a$a;->G:I

    invoke-interface {v4, p1, p0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, LQ6/c;

    if-eqz p1, :cond_4

    const/4 v3, 0x0

    iput-object v3, p0, LI6/a$a;->H:Ljava/lang/Object;

    iput v2, p0, LI6/a$a;->G:I

    invoke-virtual {v1, p1, p0}, La7/e;->e(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(La7/e;LQ6/c;Lm7/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LI6/a$a;

    iget-object v1, p0, LI6/a$a;->J:Lx7/p;

    invoke-direct {v0, v1, p3}, LI6/a$a;-><init>(Lx7/p;Lm7/e;)V

    iput-object p1, v0, LI6/a$a;->H:Ljava/lang/Object;

    iput-object p2, v0, LI6/a$a;->I:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, LI6/a$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La7/e;

    check-cast p2, LQ6/c;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, LI6/a$a;->H(La7/e;LQ6/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
