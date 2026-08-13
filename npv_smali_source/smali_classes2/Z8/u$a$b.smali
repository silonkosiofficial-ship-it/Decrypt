.class final LZ8/u$a$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ8/u$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ8/u$a$b$a;
    }
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:LZ8/f;

.field final synthetic J:LZ8/x;

.field final synthetic K:Ljava/lang/Object;


# direct methods
.method constructor <init>(LZ8/f;LZ8/x;Ljava/lang/Object;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LZ8/u$a$b;->I:LZ8/f;

    iput-object p2, p0, LZ8/u$a$b;->J:LZ8/x;

    iput-object p3, p0, LZ8/u$a$b;->K:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LZ8/u$a$b;->G:I

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

    iget-object p1, p0, LZ8/u$a$b;->H:Ljava/lang/Object;

    check-cast p1, LZ8/G;

    sget-object v1, LZ8/u$a$b$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    if-eq p1, v2, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_5

    const/4 v0, 0x3

    if-ne p1, v0, :cond_3

    iget-object p1, p0, LZ8/u$a$b;->K:Ljava/lang/Object;

    sget-object v0, LZ8/E;->a:Lb9/D;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, LZ8/u$a$b;->J:LZ8/x;

    invoke-interface {p1}, LZ8/x;->m()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, LZ8/u$a$b;->J:LZ8/x;

    invoke-interface {v0, p1}, LZ8/x;->n(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    goto :goto_0

    :cond_3
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_4
    iget-object p1, p0, LZ8/u$a$b;->I:LZ8/f;

    iget-object v1, p0, LZ8/u$a$b;->J:LZ8/x;

    iput v2, p0, LZ8/u$a$b;->G:I

    invoke-interface {p1, v1, p0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LZ8/G;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LZ8/u$a$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LZ8/u$a$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LZ8/u$a$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ8/G;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LZ8/u$a$b;->H(LZ8/G;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 4

    new-instance v0, LZ8/u$a$b;

    iget-object v1, p0, LZ8/u$a$b;->I:LZ8/f;

    iget-object v2, p0, LZ8/u$a$b;->J:LZ8/x;

    iget-object v3, p0, LZ8/u$a$b;->K:Ljava/lang/Object;

    invoke-direct {v0, v1, v2, v3, p2}, LZ8/u$a$b;-><init>(LZ8/f;LZ8/x;Ljava/lang/Object;Lm7/e;)V

    iput-object p1, v0, LZ8/u$a$b;->H:Ljava/lang/Object;

    return-object v0
.end method
