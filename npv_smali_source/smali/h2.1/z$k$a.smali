.class final Lh2/z$k$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/z$k;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lh2/z;


# direct methods
.method constructor <init>(Lh2/z;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lh2/z$k$a;->I:Lh2/z;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, Lh2/z$k$a;->G:I

    if-nez v0, :cond_2

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lh2/z$k$a;->H:Ljava/lang/Object;

    check-cast p1, Lh2/Z;

    invoke-virtual {p1}, Lh2/Z;->d()I

    move-result v0

    mul-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lh2/z$k$a;->I:Lh2/z;

    invoke-static {v1}, Lh2/z;->d(Lh2/z;)Lh2/E;

    move-result-object v1

    iget v1, v1, Lh2/E;->f:I

    if-gt v0, v1, :cond_1

    invoke-virtual {p1}, Lh2/Z;->c()I

    move-result p1

    mul-int/lit8 p1, p1, -0x1

    iget-object v0, p0, Lh2/z$k$a;->I:Lh2/z;

    invoke-static {v0}, Lh2/z;->d(Lh2/z;)Lh2/E;

    move-result-object v0

    iget v0, v0, Lh2/E;->f:I

    if-le p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(Lh2/Z;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lh2/z$k$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lh2/z$k$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lh2/z$k$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh2/Z;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lh2/z$k$a;->H(Lh2/Z;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, Lh2/z$k$a;

    iget-object v1, p0, Lh2/z$k$a;->I:Lh2/z;

    invoke-direct {v0, v1, p2}, Lh2/z$k$a;-><init>(Lh2/z;Lm7/e;)V

    iput-object p1, v0, Lh2/z$k$a;->H:Ljava/lang/Object;

    return-object v0
.end method
