.class final Lt2/a$c$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt2/a$c;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Lt2/a;

.field final synthetic I:Lh2/L$a;


# direct methods
.method constructor <init>(Lt2/a;Lh2/L$a;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lt2/a$c$a;->H:Lt2/a;

    iput-object p2, p0, Lt2/a$c$a;->I:Lh2/L$a;

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

    iget v1, p0, Lt2/a$c$a;->G:I

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
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lt2/a$c$a;->H:Lt2/a;

    invoke-static {p1}, Lt2/a;->e(Lt2/a;)Lo2/u;

    move-result-object p1

    iget-object v1, p0, Lt2/a$c$a;->H:Lt2/a;

    invoke-static {v1}, Lt2/a;->b(Lt2/a;)Lo2/n;

    move-result-object v1

    iput v3, p0, Lt2/a$c$a;->G:I

    invoke-static {p1, v1, p0}, Lu2/a;->e(Lo2/u;Lo2/n;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v1, p0, Lt2/a$c$a;->H:Lt2/a;

    invoke-virtual {v1}, Lt2/a;->h()LV8/c;

    move-result-object v1

    invoke-virtual {v1, p1}, LV8/c;->e(I)V

    iget-object v1, p0, Lt2/a$c$a;->I:Lh2/L$a;

    iget-object v3, p0, Lt2/a$c$a;->H:Lt2/a;

    invoke-static {v3}, Lt2/a;->e(Lt2/a;)Lo2/u;

    move-result-object v3

    iget-object v4, p0, Lt2/a$c$a;->H:Lt2/a;

    invoke-static {v4}, Lt2/a;->a(Lt2/a;)Lx7/q;

    move-result-object v4

    iput v2, p0, Lt2/a$c$a;->G:I

    invoke-static {v1, v3, p1, v4, p0}, Lu2/a;->d(Lh2/L$a;Lo2/u;ILx7/q;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    return-object p1
.end method

.method public final H(Lo2/A;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lt2/a$c$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lt2/a$c$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lt2/a$c$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo2/A;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lt2/a$c$a;->H(Lo2/A;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance p1, Lt2/a$c$a;

    iget-object v0, p0, Lt2/a$c$a;->H:Lt2/a;

    iget-object v1, p0, Lt2/a$c$a;->I:Lh2/L$a;

    invoke-direct {p1, v0, v1, p2}, Lt2/a$c$a;-><init>(Lt2/a;Lh2/L$a;Lm7/e;)V

    return-object p1
.end method
