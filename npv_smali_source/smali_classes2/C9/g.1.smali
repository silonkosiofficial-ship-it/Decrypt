.class public final LC9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/r;
.implements Landroidx/lifecycle/Y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC9/g$a;
    }
.end annotation


# instance fields
.field private final C:Ljava/lang/String;

.field private D:LD9/c;

.field private final E:Ljava/lang/String;

.field private final F:Ljava/util/Map;

.field private final G:LC9/Q;

.field private final H:LC9/G;

.field private I:LC9/P;

.field private J:Z

.field private final K:Li7/n;

.field private final L:Li7/n;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LD9/c;Ljava/lang/String;Ljava/util/Map;LC9/Q;LC9/G;)V
    .locals 1

    const-string v0, "stateId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "routeInternal"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pathMap"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "provider"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC9/g;->C:Ljava/lang/String;

    iput-object p2, p0, LC9/g;->D:LD9/c;

    iput-object p3, p0, LC9/g;->E:Ljava/lang/String;

    iput-object p4, p0, LC9/g;->F:Ljava/util/Map;

    iput-object p5, p0, LC9/g;->G:LC9/Q;

    iput-object p6, p0, LC9/g;->H:LC9/G;

    new-instance p1, LC9/e;

    invoke-direct {p1, p0}, LC9/e;-><init>(LC9/g;)V

    invoke-static {p1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LC9/g;->K:Li7/n;

    invoke-direct {p0}, LC9/g;->g()Landroidx/lifecycle/t;

    move-result-object p1

    sget-object p2, Landroidx/lifecycle/k$a;->ON_CREATE:Landroidx/lifecycle/k$a;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    new-instance p1, LC9/f;

    invoke-direct {p1, p0}, LC9/f;-><init>(LC9/g;)V

    invoke-static {p1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LC9/g;->L:Li7/n;

    return-void
.end method

.method public static synthetic a(LC9/g;)Landroidx/lifecycle/t;
    .locals 0

    invoke-static {p0}, LC9/g;->t(LC9/g;)Landroidx/lifecycle/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LC9/g;)Landroidx/lifecycle/X;
    .locals 0

    invoke-static {p0}, LC9/g;->y(LC9/g;)Landroidx/lifecycle/X;

    move-result-object p0

    return-object p0
.end method

.method private final g()Landroidx/lifecycle/t;
    .locals 1

    iget-object v0, p0, LC9/g;->K:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/t;

    return-object v0
.end method

.method private static final t(LC9/g;)Landroidx/lifecycle/t;
    .locals 1

    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0, p0}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    return-object v0
.end method

.method private static final y(LC9/g;)Landroidx/lifecycle/X;
    .locals 1

    iget-object v0, p0, LC9/g;->G:LC9/Q;

    iget-object p0, p0, LC9/g;->C:Ljava/lang/String;

    invoke-interface {v0, p0}, LC9/Q;->b(Ljava/lang/String;)Landroidx/lifecycle/X;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final d()V
    .locals 2

    invoke-direct {p0}, LC9/g;->g()Landroidx/lifecycle/t;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$a;->ON_RESUME:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method public final e()V
    .locals 2

    .prologue
    invoke-direct {p0}, LC9/g;->g()Landroidx/lifecycle/t;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/t;->b()Landroidx/lifecycle/k$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$b;->F:Landroidx/lifecycle/k$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k$b;->g(Landroidx/lifecycle/k$b;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LC9/g;->J:Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LC9/g;->f()V

    :goto_0
    return-void
.end method

.method public final f()V
    .locals 2

    .prologue
    invoke-direct {p0}, LC9/g;->g()Landroidx/lifecycle/t;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$a;->ON_DESTROY:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    iget-object v0, p0, LC9/g;->G:LC9/Q;

    iget-object v1, p0, LC9/g;->C:Ljava/lang/String;

    invoke-interface {v0, v1}, LC9/Q;->a(Ljava/lang/String;)V

    iget-object v0, p0, LC9/g;->I:LC9/P;

    if-eqz v0, :cond_0

    iget-object v1, p0, LC9/g;->C:Ljava/lang/String;

    invoke-interface {v0, v1}, LC9/P;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final h()LE9/a;
    .locals 1

    .prologue
    invoke-virtual {p0}, LC9/g;->k()LD9/c;

    move-result-object v0

    invoke-static {v0}, LD9/b;->c(LD9/c;)LD9/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LD9/d;->d()LE9/a;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LC9/g;->E:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LC9/g;->F:Ljava/util/Map;

    return-object v0
.end method

.method public final k()LD9/c;
    .locals 1

    iget-object v0, p0, LC9/g;->D:LD9/c;

    return-object v0
.end method

.method public final l()LD9/c;
    .locals 1

    iget-object v0, p0, LC9/g;->D:LD9/c;

    return-object v0
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LC9/g;->C:Ljava/lang/String;

    return-object v0
.end method

.method public n()Landroidx/lifecycle/X;
    .locals 1

    iget-object v0, p0, LC9/g;->L:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/X;

    return-object v0
.end method

.method public final o()LC9/O;
    .locals 1

    .prologue
    invoke-virtual {p0}, LC9/g;->k()LD9/c;

    move-result-object v0

    invoke-static {v0}, LD9/b;->c(LD9/c;)LD9/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LD9/d;->e()LC9/O;

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final q()LC9/P;
    .locals 1

    iget-object v0, p0, LC9/g;->I:LC9/P;

    return-object v0
.end method

.method public final r(Ljava/lang/String;)Z
    .locals 1

    .prologue
    const-string v0, "route"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LC9/g;->k()LD9/c;

    move-result-object v0

    invoke-interface {v0}, LD9/c;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, LC9/g;->k()LD9/c;

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    return p1
.end method

.method public final s()V
    .locals 2

    .prologue
    invoke-direct {p0}, LC9/g;->g()Landroidx/lifecycle/t;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$a;->ON_STOP:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    iget-boolean v0, p0, LC9/g;->J:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LC9/g;->e()V

    :cond_0
    return-void
.end method

.method public u()Landroidx/lifecycle/k;
    .locals 1

    invoke-direct {p0}, LC9/g;->g()Landroidx/lifecycle/t;

    move-result-object v0

    return-object v0
.end method

.method public final v(Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 1

    .prologue
    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LC9/g$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p1, p1, v0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, LC9/g;->e()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LC9/g;->g()Landroidx/lifecycle/t;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    :goto_0
    return-void
.end method

.method public final w(LD9/c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LC9/g;->D:LD9/c;

    return-void
.end method

.method public final x(LC9/P;)V
    .locals 0

    iput-object p1, p0, LC9/g;->I:LC9/P;

    return-void
.end method
