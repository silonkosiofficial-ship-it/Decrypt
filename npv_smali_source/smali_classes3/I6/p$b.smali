.class final LI6/p$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI6/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Z


# direct methods
.method constructor <init>(ZLm7/e;)V
    .locals 0

    iput-boolean p1, p0, LI6/p$b;->I:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method

.method public static synthetic H(Z)Z
    .locals 0

    invoke-static {p0}, LI6/p$b;->K(Z)Z

    move-result p0

    return p0
.end method

.method private static final K(Z)Z
    .locals 0

    return p0
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, LI6/p$b;->G:I

    if-nez v0, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI6/p$b;->H:Ljava/lang/Object;

    check-cast p1, LO6/d;

    invoke-virtual {p1}, LO6/d;->d()LW6/b;

    move-result-object p1

    invoke-static {}, LI6/p;->j()LW6/a;

    move-result-object v0

    iget-boolean v1, p0, LI6/p$b;->I:Z

    new-instance v2, LI6/q;

    invoke-direct {v2, v1}, LI6/q;-><init>(Z)V

    invoke-interface {p1, v0, v2}, LW6/b;->g(LW6/a;Lx7/a;)Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final I(LO6/d;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LI6/p$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LI6/p$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LI6/p$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO6/d;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LI6/p$b;->I(LO6/d;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, LI6/p$b;

    iget-boolean v1, p0, LI6/p$b;->I:Z

    invoke-direct {v0, v1, p2}, LI6/p$b;-><init>(ZLm7/e;)V

    iput-object p1, v0, LI6/p$b;->H:Ljava/lang/Object;

    return-object v0
.end method
