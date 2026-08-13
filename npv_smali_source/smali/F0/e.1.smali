.class final LF0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/focus/j;


# static fields
.field public static final a:LF0/e;

.field private static b:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF0/e;

    invoke-direct {v0}, LF0/e;-><init>()V

    sput-object v0, LF0/e;->a:LF0/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .prologue
    sget-object v0, LF0/e;->b:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, LF0/e;->b:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic d()Landroidx/compose/ui/focus/n;
    .locals 1

    invoke-static {p0}, Landroidx/compose/ui/focus/i;->i(Landroidx/compose/ui/focus/j;)Landroidx/compose/ui/focus/n;

    move-result-object v0

    return-object v0
.end method

.method public synthetic f()Landroidx/compose/ui/focus/n;
    .locals 1

    invoke-static {p0}, Landroidx/compose/ui/focus/i;->e(Landroidx/compose/ui/focus/j;)Landroidx/compose/ui/focus/n;

    move-result-object v0

    return-object v0
.end method

.method public synthetic o()Landroidx/compose/ui/focus/n;
    .locals 1

    invoke-static {p0}, Landroidx/compose/ui/focus/i;->h(Landroidx/compose/ui/focus/j;)Landroidx/compose/ui/focus/n;

    move-result-object v0

    return-object v0
.end method

.method public p()Z
    .locals 1

    .prologue
    sget-object v0, LF0/e;->b:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const-string v0, "canFocus is read before it is written"

    invoke-static {v0}, LC0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method public synthetic q()Landroidx/compose/ui/focus/n;
    .locals 1

    invoke-static {p0}, Landroidx/compose/ui/focus/i;->g(Landroidx/compose/ui/focus/j;)Landroidx/compose/ui/focus/n;

    move-result-object v0

    return-object v0
.end method

.method public synthetic r(Lx7/l;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/ui/focus/i;->k(Landroidx/compose/ui/focus/j;Lx7/l;)V

    return-void
.end method

.method public synthetic s()Landroidx/compose/ui/focus/n;
    .locals 1

    invoke-static {p0}, Landroidx/compose/ui/focus/i;->j(Landroidx/compose/ui/focus/j;)Landroidx/compose/ui/focus/n;

    move-result-object v0

    return-object v0
.end method

.method public synthetic t()Landroidx/compose/ui/focus/n;
    .locals 1

    invoke-static {p0}, Landroidx/compose/ui/focus/i;->f(Landroidx/compose/ui/focus/j;)Landroidx/compose/ui/focus/n;

    move-result-object v0

    return-object v0
.end method

.method public synthetic u()Lx7/l;
    .locals 1

    invoke-static {p0}, Landroidx/compose/ui/focus/i;->d(Landroidx/compose/ui/focus/j;)Lx7/l;

    move-result-object v0

    return-object v0
.end method

.method public synthetic v(Lx7/l;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/ui/focus/i;->l(Landroidx/compose/ui/focus/j;Lx7/l;)V

    return-void
.end method

.method public synthetic w()Landroidx/compose/ui/focus/n;
    .locals 1

    invoke-static {p0}, Landroidx/compose/ui/focus/i;->b(Landroidx/compose/ui/focus/j;)Landroidx/compose/ui/focus/n;

    move-result-object v0

    return-object v0
.end method

.method public synthetic x()Landroidx/compose/ui/focus/n;
    .locals 1

    invoke-static {p0}, Landroidx/compose/ui/focus/i;->a(Landroidx/compose/ui/focus/j;)Landroidx/compose/ui/focus/n;

    move-result-object v0

    return-object v0
.end method

.method public y(Z)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    sput-object p1, LF0/e;->b:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic z()Lx7/l;
    .locals 1

    invoke-static {p0}, Landroidx/compose/ui/focus/i;->c(Landroidx/compose/ui/focus/j;)Lx7/l;

    move-result-object v0

    return-object v0
.end method
