.class public final LL7/i$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL7/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LL7/i$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LO7/G;)LF8/E;
    .locals 4

    .prologue
    const-string v0, "module"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LL7/j$a;->u0:Ln8/b;

    invoke-static {p1, v0}, LO7/x;->a(LO7/G;Ln8/b;)LO7/e;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object v0, LF8/a0;->D:LF8/a0$a;

    invoke-virtual {v0}, LF8/a0$a;->i()LF8/a0;

    move-result-object v0

    new-instance v1, LF8/T;

    invoke-interface {p1}, LO7/h;->p()LF8/e0;

    move-result-object v2

    invoke-interface {v2}, LF8/e0;->x()Ljava/util/List;

    move-result-object v2

    const-string v3, "getParameters(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lj7/v;->G0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "single(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LO7/f0;

    invoke-direct {v1, v2}, LF8/T;-><init>(LO7/f0;)V

    invoke-static {v1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, p1, v1}, LF8/F;->g(LF8/a0;LO7/e;Ljava/util/List;)LF8/M;

    move-result-object p1

    return-object p1
.end method
