.class final Laa/f$e;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/f;->h(Laa/d;LV/n;I)Lo0/E1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Laa/d;

.field final synthetic J:Laa/n;

.field final synthetic K:Laa/r;


# direct methods
.method constructor <init>(Laa/d;Laa/n;Laa/r;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Laa/f$e;->I:Laa/d;

    iput-object p2, p0, Laa/f$e;->J:Laa/n;

    iput-object p3, p0, Laa/f$e;->K:Laa/r;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Laa/f$e;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Laa/f$e;->H:Ljava/lang/Object;

    check-cast p1, Laa/n;

    iget-object v1, p0, Laa/f$e;->I:Laa/d;

    invoke-static {v1, p1}, Laa/o;->f(Laa/m;Laa/n;)Laa/q;

    move-result-object p1

    invoke-virtual {p1}, Laa/q;->c()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Laa/k;

    instance-of v5, v5, Laa/c;

    if-eqz v5, :cond_2

    goto :goto_0

    :cond_3
    move-object v3, v4

    :goto_0
    instance-of v1, v3, Laa/c;

    if-eqz v1, :cond_4

    move-object v4, v3

    check-cast v4, Laa/c;

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {v4}, Laa/c;->g()I

    move-result v1

    goto :goto_1

    :cond_5
    sget-object v1, Laa/c;->F:Laa/c;

    invoke-virtual {v1}, Laa/c;->g()I

    move-result v1

    :goto_1
    iget-object v3, p0, Laa/f$e;->J:Laa/n;

    invoke-virtual {v3}, Laa/n;->a()Laa/c;

    move-result-object v3

    invoke-virtual {v3}, Laa/c;->g()I

    move-result v3

    invoke-virtual {p1}, Laa/q;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "-"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "dpi"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Laa/f$e;->K:Laa/r;

    new-instance v6, Laa/f$e$a;

    invoke-direct {v6, v1, v3}, Laa/f$e$a;-><init>(II)V

    iput v2, p0, Laa/f$e;->G:I

    invoke-static {p1, v4, v5, v6, p0}, Laa/f;->d(Ljava/lang/String;Ljava/lang/String;Laa/r;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_2
    const-string v0, "null cannot be cast to non-null type org.jetbrains.compose.resources.ImageCache.Bitmap"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Laa/e$a;

    invoke-virtual {p1}, Laa/e$a;->a()Lo0/E1;

    move-result-object p1

    return-object p1
.end method

.method public final H(Laa/n;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Laa/f$e;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Laa/f$e;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Laa/f$e;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Laa/n;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Laa/f$e;->H(Laa/n;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 4

    new-instance v0, Laa/f$e;

    iget-object v1, p0, Laa/f$e;->I:Laa/d;

    iget-object v2, p0, Laa/f$e;->J:Laa/n;

    iget-object v3, p0, Laa/f$e;->K:Laa/r;

    invoke-direct {v0, v1, v2, v3, p2}, Laa/f$e;-><init>(Laa/d;Laa/n;Laa/r;Lm7/e;)V

    iput-object p1, v0, Laa/f$e;->H:Ljava/lang/Object;

    return-object v0
.end method
