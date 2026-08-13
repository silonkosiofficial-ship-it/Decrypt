.class final LS5/x$g;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS5/x;->b(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LS5/x;

.field final synthetic I:Ljava/lang/String;


# direct methods
.method constructor <init>(LS5/x;Ljava/lang/String;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LS5/x$g;->H:LS5/x;

    iput-object p2, p0, LS5/x$g;->I:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LS5/x$g;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    :try_start_1
    invoke-static {}, LS5/x;->c()LS5/x$c;

    move-result-object p1

    iget-object v1, p0, LS5/x$g;->H:LS5/x;

    invoke-static {v1}, LS5/x;->d(LS5/x;)Landroid/content/Context;

    move-result-object v1

    invoke-static {p1, v1}, LS5/x$c;->a(LS5/x$c;Landroid/content/Context;)LM1/h;

    move-result-object p1

    new-instance v1, LS5/x$g$a;

    iget-object v3, p0, LS5/x$g;->I:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, LS5/x$g$a;-><init>(Ljava/lang/String;Lm7/e;)V

    iput v2, p0, LS5/x$g;->G:I

    invoke-static {p1, v1, p0}, LQ1/i;->a(LM1/h;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v0, :cond_2

    return-object v0

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to update session Id: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FirebaseSessionsRepo"

    nop

    :cond_2
    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LS5/x$g;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LS5/x$g;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LS5/x$g;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LS5/x$g;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance p1, LS5/x$g;

    iget-object v0, p0, LS5/x$g;->H:LS5/x;

    iget-object v1, p0, LS5/x$g;->I:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, LS5/x$g;-><init>(LS5/x;Ljava/lang/String;Lm7/e;)V

    return-object p1
.end method
