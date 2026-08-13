.class public final LW1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW1/c$a;,
        LW1/c$b;,
        LW1/c$c;
    }
.end annotation


# static fields
.field public static final a:LW1/c;

.field private static b:LW1/c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LW1/c;

    invoke-direct {v0}, LW1/c;-><init>()V

    sput-object v0, LW1/c;->a:LW1/c;

    sget-object v0, LW1/c$c;->d:LW1/c$c;

    sput-object v0, LW1/c;->b:LW1/c$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;LW1/g;)V
    .locals 0

    invoke-static {p0, p1}, LW1/c;->d(Ljava/lang/String;LW1/g;)V

    return-void
.end method

.method private final b(Landroidx/fragment/app/f;)LW1/c$c;
    .locals 2

    .prologue
    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroidx/fragment/app/f;->a0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/fragment/app/f;->H()Landroidx/fragment/app/n;

    move-result-object v0

    const-string v1, "declaringFragment.parentFragmentManager"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/n;->x0()LW1/c$c;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/n;->x0()LW1/c$c;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/f;->G()Landroidx/fragment/app/f;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object p1, LW1/c;->b:LW1/c$c;

    return-object p1
.end method

.method private final c(LW1/c$c;LW1/g;)V
    .locals 4

    .prologue
    invoke-virtual {p2}, LW1/g;->a()Landroidx/fragment/app/f;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LW1/c$c;->a()Ljava/util/Set;

    move-result-object v2

    sget-object v3, LW1/c$a;->C:LW1/c$a;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Policy violation in "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "FragmentStrictMode"

    nop

    :cond_0
    invoke-virtual {p1}, LW1/c$c;->b()LW1/c$b;

    invoke-virtual {p1}, LW1/c$c;->a()Ljava/util/Set;

    move-result-object p1

    sget-object v2, LW1/c$a;->D:LW1/c$a;

    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, LW1/b;

    invoke-direct {p1, v1, p2}, LW1/b;-><init>(Ljava/lang/String;LW1/g;)V

    invoke-direct {p0, v0, p1}, LW1/c;->j(Landroidx/fragment/app/f;Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method private static final d(Ljava/lang/String;LW1/g;)V
    .locals 2

    const-string v0, "$violation"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Policy violation with PENALTY_DEATH in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "FragmentStrictMode"

    nop

    throw p1
.end method

.method private final e(LW1/g;)V
    .locals 2

    .prologue
    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StrictMode violation in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LW1/g;->a()Landroidx/fragment/app/f;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    nop

    :cond_0
    return-void
.end method

.method public static final f(Landroidx/fragment/app/f;Ljava/lang/String;)V
    .locals 4

    .prologue
    const-string v0, "fragment"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previousFragmentId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LW1/a;

    invoke-direct {v0, p0, p1}, LW1/a;-><init>(Landroidx/fragment/app/f;Ljava/lang/String;)V

    sget-object p1, LW1/c;->a:LW1/c;

    invoke-direct {p1, v0}, LW1/c;->e(LW1/g;)V

    invoke-direct {p1, p0}, LW1/c;->b(Landroidx/fragment/app/f;)LW1/c$c;

    move-result-object v1

    invoke-virtual {v1}, LW1/c$c;->a()Ljava/util/Set;

    move-result-object v2

    sget-object v3, LW1/c$a;->E:LW1/c$a;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {p1, v1, p0, v2}, LW1/c;->k(LW1/c$c;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-direct {p1, v1, v0}, LW1/c;->c(LW1/c$c;LW1/g;)V

    :cond_0
    return-void
.end method

.method public static final g(Landroidx/fragment/app/f;Landroid/view/ViewGroup;)V
    .locals 4

    .prologue
    const-string v0, "fragment"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LW1/d;

    invoke-direct {v0, p0, p1}, LW1/d;-><init>(Landroidx/fragment/app/f;Landroid/view/ViewGroup;)V

    sget-object p1, LW1/c;->a:LW1/c;

    invoke-direct {p1, v0}, LW1/c;->e(LW1/g;)V

    invoke-direct {p1, p0}, LW1/c;->b(Landroidx/fragment/app/f;)LW1/c$c;

    move-result-object v1

    invoke-virtual {v1}, LW1/c$c;->a()Ljava/util/Set;

    move-result-object v2

    sget-object v3, LW1/c$a;->F:LW1/c$a;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {p1, v1, p0, v2}, LW1/c;->k(LW1/c$c;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-direct {p1, v1, v0}, LW1/c;->c(LW1/c$c;LW1/g;)V

    :cond_0
    return-void
.end method

.method public static final h(Landroidx/fragment/app/f;)V
    .locals 5

    .prologue
    const-string v0, "fragment"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LW1/e;

    invoke-direct {v0, p0}, LW1/e;-><init>(Landroidx/fragment/app/f;)V

    sget-object v1, LW1/c;->a:LW1/c;

    invoke-direct {v1, v0}, LW1/c;->e(LW1/g;)V

    invoke-direct {v1, p0}, LW1/c;->b(Landroidx/fragment/app/f;)LW1/c$c;

    move-result-object v2

    invoke-virtual {v2}, LW1/c$c;->a()Ljava/util/Set;

    move-result-object v3

    sget-object v4, LW1/c$a;->I:LW1/c$a;

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-direct {v1, v2, p0, v3}, LW1/c;->k(LW1/c$c;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-direct {v1, v2, v0}, LW1/c;->c(LW1/c$c;LW1/g;)V

    :cond_0
    return-void
.end method

.method public static final i(Landroidx/fragment/app/f;Landroid/view/ViewGroup;)V
    .locals 4

    .prologue
    const-string v0, "fragment"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LW1/h;

    invoke-direct {v0, p0, p1}, LW1/h;-><init>(Landroidx/fragment/app/f;Landroid/view/ViewGroup;)V

    sget-object p1, LW1/c;->a:LW1/c;

    invoke-direct {p1, v0}, LW1/c;->e(LW1/g;)V

    invoke-direct {p1, p0}, LW1/c;->b(Landroidx/fragment/app/f;)LW1/c$c;

    move-result-object v1

    invoke-virtual {v1}, LW1/c$c;->a()Ljava/util/Set;

    move-result-object v2

    sget-object v3, LW1/c$a;->J:LW1/c$a;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {p1, v1, p0, v2}, LW1/c;->k(LW1/c$c;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-direct {p1, v1, v0}, LW1/c;->c(LW1/c$c;LW1/g;)V

    :cond_0
    return-void
.end method

.method private final j(Landroidx/fragment/app/f;Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    invoke-virtual {p1}, Landroidx/fragment/app/f;->a0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/fragment/app/f;->H()Landroidx/fragment/app/n;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/n;->r0()Landroidx/fragment/app/k;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/k;->r()Landroid/os/Handler;

    move-result-object p1

    const-string v0, "fragment.parentFragmentManager.host.handler"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_1
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method

.method private final k(LW1/c$c;Ljava/lang/Class;Ljava/lang/Class;)Z
    .locals 2

    .prologue
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, LW1/c$c;->c()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    const/4 p2, 0x1

    if-nez p1, :cond_0

    return p2

    :cond_0
    invoke-virtual {p3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, LW1/g;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {p3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v0, v1}, Lj7/v;->Z(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-interface {p1, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, p2

    return p1
.end method
