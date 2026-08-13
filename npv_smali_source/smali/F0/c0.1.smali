.class public abstract LF0/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LF0/c0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LF0/c0$a;

    invoke-direct {v0}, LF0/c0$a;-><init>()V

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroidx/compose/ui/d$c;->J1(I)V

    sput-object v0, LF0/c0;->a:LF0/c0$a;

    return-void
.end method

.method public static final synthetic a(Landroidx/compose/ui/d;LX/b;)LX/b;
    .locals 0

    invoke-static {p0, p1}, LF0/c0;->e(Landroidx/compose/ui/d;LX/b;)LX/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()LF0/c0$a;
    .locals 1

    sget-object v0, LF0/c0;->a:LF0/c0$a;

    return-object v0
.end method

.method public static final synthetic c(LF0/W;Landroidx/compose/ui/d$c;)V
    .locals 0

    invoke-static {p0, p1}, LF0/c0;->f(LF0/W;Landroidx/compose/ui/d$c;)V

    return-void
.end method

.method public static final d(Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$b;)I
    .locals 1

    .prologue
    invoke-static {p0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x2

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lh0/b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final e(Landroidx/compose/ui/d;LX/b;)LX/b;
    .locals 3

    .prologue
    invoke-virtual {p1}, LX/b;->t()I

    move-result v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, LE7/j;->d(II)I

    move-result v0

    new-instance v1, LX/b;

    new-array v0, v0, [Landroidx/compose/ui/d;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, LX/b;-><init>([Ljava/lang/Object;I)V

    invoke-virtual {v1, p0}, LX/b;->d(Ljava/lang/Object;)Z

    const/4 p0, 0x0

    :goto_0
    invoke-virtual {v1}, LX/b;->x()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v1}, LX/b;->t()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, LX/b;->D(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/d;

    instance-of v2, v0, Landroidx/compose/ui/a;

    if-eqz v2, :cond_0

    check-cast v0, Landroidx/compose/ui/a;

    invoke-virtual {v0}, Landroidx/compose/ui/a;->g()Landroidx/compose/ui/d;

    move-result-object v2

    invoke-virtual {v1, v2}, LX/b;->d(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Landroidx/compose/ui/a;->j()Landroidx/compose/ui/d;

    move-result-object v0

    invoke-virtual {v1, v0}, LX/b;->d(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v2, v0, Landroidx/compose/ui/d$b;

    if-eqz v2, :cond_1

    invoke-virtual {p1, v0}, LX/b;->d(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    if-nez p0, :cond_2

    new-instance p0, LF0/c0$b;

    invoke-direct {p0, p1}, LF0/c0$b;-><init>(LX/b;)V

    :cond_2
    move-object v2, p0

    invoke-interface {v0, p0}, Landroidx/compose/ui/d;->d(Lx7/l;)Z

    move-object p0, v2

    goto :goto_0

    :cond_3
    return-object p1
.end method

.method private static final f(LF0/W;Landroidx/compose/ui/d$c;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LF0/W;->j(Landroidx/compose/ui/d$c;)V

    return-void
.end method
