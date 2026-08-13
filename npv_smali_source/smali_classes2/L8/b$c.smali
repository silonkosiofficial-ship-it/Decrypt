.class public final LL8/b$c;
.super LF8/f0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL8/b;->f(LF8/i0;)LF8/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LF8/f0;-><init>()V

    return-void
.end method


# virtual methods
.method public k(LF8/e0;)LF8/i0;
    .locals 2

    .prologue
    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ls8/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ls8/b;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_1

    return-object v1

    :cond_1
    invoke-interface {p1}, Ls8/b;->a()LF8/i0;

    move-result-object v0

    invoke-interface {v0}, LF8/i0;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, LF8/k0;

    sget-object v1, LF8/u0;->I:LF8/u0;

    invoke-interface {p1}, Ls8/b;->a()LF8/i0;

    move-result-object p1

    invoke-interface {p1}, LF8/i0;->getType()LF8/E;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    return-object v0

    :cond_2
    invoke-interface {p1}, Ls8/b;->a()LF8/i0;

    move-result-object p1

    return-object p1
.end method
