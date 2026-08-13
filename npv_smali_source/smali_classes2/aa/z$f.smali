.class final Laa/z$f;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/z;->h(Laa/y;[Ljava/lang/Object;LV/n;I)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Laa/y;

.field final synthetic J:Ljava/util/List;

.field final synthetic K:Laa/r;


# direct methods
.method constructor <init>(Laa/y;Ljava/util/List;Laa/r;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Laa/z$f;->I:Laa/y;

    iput-object p2, p0, Laa/z$f;->J:Ljava/util/List;

    iput-object p3, p0, Laa/z$f;->K:Laa/r;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Laa/z$f;->G:I

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

    iget-object p1, p0, Laa/z$f;->H:Ljava/lang/Object;

    check-cast p1, Laa/n;

    iget-object v1, p0, Laa/z$f;->I:Laa/y;

    iget-object v3, p0, Laa/z$f;->J:Ljava/util/List;

    iget-object v4, p0, Laa/z$f;->K:Laa/r;

    iput v2, p0, Laa/z$f;->G:I

    invoke-static {v1, v3, v4, p1, p0}, Laa/z;->b(Laa/y;Ljava/util/List;Laa/r;Laa/n;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    return-object p1
.end method

.method public final H(Laa/n;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Laa/z$f;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Laa/z$f;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Laa/z$f;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Laa/n;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Laa/z$f;->H(Laa/n;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 4

    new-instance v0, Laa/z$f;

    iget-object v1, p0, Laa/z$f;->I:Laa/y;

    iget-object v2, p0, Laa/z$f;->J:Ljava/util/List;

    iget-object v3, p0, Laa/z$f;->K:Laa/r;

    invoke-direct {v0, v1, v2, v3, p2}, Laa/z$f;-><init>(Laa/y;Ljava/util/List;Laa/r;Lm7/e;)V

    iput-object p1, v0, Laa/z$f;->H:Ljava/lang/Object;

    return-object v0
.end method
