.class public final Lt8/p;
.super Lt8/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt8/p$a;,
        Lt8/p$b;
    }
.end annotation


# static fields
.field public static final b:Lt8/p$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt8/p$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt8/p$a;-><init>(Ly7/k;)V

    sput-object v0, Lt8/p;->b:Lt8/p$a;

    return-void
.end method

.method public constructor <init>(Ln8/b;I)V
    .locals 1

    const-string v0, "classId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lt8/f;

    invoke-direct {v0, p1, p2}, Lt8/f;-><init>(Ln8/b;I)V

    invoke-direct {p0, v0}, Lt8/p;-><init>(Lt8/f;)V

    return-void
.end method

.method public constructor <init>(Lt8/f;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lt8/p$b$b;

    invoke-direct {v0, p1}, Lt8/p$b$b;-><init>(Lt8/f;)V

    invoke-direct {p0, v0}, Lt8/p;-><init>(Lt8/p$b;)V

    return-void
.end method

.method public constructor <init>(Lt8/p$b;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lt8/g;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(LO7/G;)LF8/E;
    .locals 3

    const-string v0, "module"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LF8/a0;->D:LF8/a0$a;

    invoke-virtual {v0}, LF8/a0$a;->i()LF8/a0;

    move-result-object v0

    invoke-interface {p1}, LO7/G;->t()LL7/g;

    move-result-object v1

    invoke-virtual {v1}, LL7/g;->E()LO7/e;

    move-result-object v1

    const-string v2, "getKClass(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LF8/k0;

    invoke-virtual {p0, p1}, Lt8/p;->c(LO7/G;)LF8/E;

    move-result-object p1

    invoke-direct {v2, p1}, LF8/k0;-><init>(LF8/E;)V

    invoke-static {v2}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {v0, v1, p1}, LF8/F;->g(LF8/a0;LO7/e;Ljava/util/List;)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public final c(LO7/G;)LF8/E;
    .locals 5

    .prologue
    const-string v0, "module"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt8/p$b;

    instance-of v1, v0, Lt8/p$b$a;

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt8/p$b$a;

    invoke-virtual {p1}, Lt8/p$b$a;->a()LF8/E;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, v0, Lt8/p$b$b;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt8/p$b$b;

    invoke-virtual {v0}, Lt8/p$b$b;->c()Lt8/f;

    move-result-object v0

    invoke-virtual {v0}, Lt8/f;->a()Ln8/b;

    move-result-object v1

    invoke-virtual {v0}, Lt8/f;->b()I

    move-result v0

    invoke-static {p1, v1}, LO7/x;->a(LO7/G;Ln8/b;)LO7/e;

    move-result-object v2

    if-nez v2, :cond_1

    sget-object p1, LH8/j;->J:LH8/j;

    invoke-virtual {v1}, Ln8/b;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, LH8/k;->d(LH8/j;[Ljava/lang/String;)LH8/h;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-interface {v2}, LO7/e;->w()LF8/M;

    move-result-object v1

    const-string v2, "getDefaultType(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LK8/a;->y(LF8/E;)LF8/E;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-interface {p1}, LO7/G;->t()LL7/g;

    move-result-object v3

    sget-object v4, LF8/u0;->G:LF8/u0;

    invoke-virtual {v3, v4, v1}, LL7/g;->l(LF8/u0;LF8/E;)LF8/M;

    move-result-object v1

    const-string v3, "getArrayType(...)"

    invoke-static {v1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v1

    :cond_3
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1
.end method
