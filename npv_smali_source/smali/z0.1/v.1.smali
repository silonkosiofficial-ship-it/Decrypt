.class public final Lz0/v;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/E0;
.implements LF0/v0;
.implements LF0/h;


# instance fields
.field private final P:Ljava/lang/String;

.field private Q:Lz0/w;

.field private R:Z

.field private S:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lz0/w;Z)V
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    const-string v0, "androidx.compose.ui.input.pointer.PointerHoverIcon"

    iput-object v0, p0, Lz0/v;->P:Ljava/lang/String;

    iput-object p1, p0, Lz0/v;->Q:Lz0/w;

    iput-boolean p2, p0, Lz0/v;->R:Z

    return-void
.end method

.method public static final synthetic T1(Lz0/v;)Z
    .locals 0

    iget-boolean p0, p0, Lz0/v;->S:Z

    return p0
.end method

.method private final U1()V
    .locals 2

    .prologue
    invoke-direct {p0}, Lz0/v;->c2()Lz0/y;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lz0/y;->a(Lz0/w;)V

    :cond_0
    return-void
.end method

.method private final V1()V
    .locals 2

    .prologue
    invoke-direct {p0}, Lz0/v;->a2()Lz0/v;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lz0/v;->Q:Lz0/w;

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lz0/v;->Q:Lz0/w;

    :cond_1
    invoke-direct {p0}, Lz0/v;->c2()Lz0/y;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v1, v0}, Lz0/y;->a(Lz0/w;)V

    :cond_2
    return-void
.end method

.method private final W1()V
    .locals 2

    .prologue
    new-instance v0, Ly7/O;

    invoke-direct {v0}, Ly7/O;-><init>()V

    new-instance v1, Lz0/v$a;

    invoke-direct {v1, v0}, Lz0/v$a;-><init>(Ly7/O;)V

    invoke-static {p0, v1}, LF0/F0;->d(LF0/E0;Lx7/l;)V

    iget-object v0, v0, Ly7/O;->C:Ljava/lang/Object;

    check-cast v0, Lz0/v;

    if-eqz v0, :cond_0

    invoke-direct {v0}, Lz0/v;->V1()V

    sget-object v0, Li7/M;->a:Li7/M;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-direct {p0}, Lz0/v;->U1()V

    :cond_1
    return-void
.end method

.method private final X1()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lz0/v;->S:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lz0/v;->R:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Lz0/v;->Z1()Lz0/v;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, p0

    :goto_0
    invoke-direct {v0}, Lz0/v;->V1()V

    return-void
.end method

.method private final Y1()V
    .locals 2

    .prologue
    new-instance v0, Ly7/K;

    invoke-direct {v0}, Ly7/K;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Ly7/K;->C:Z

    iget-boolean v1, p0, Lz0/v;->R:Z

    if-nez v1, :cond_0

    new-instance v1, Lz0/v$b;

    invoke-direct {v1, v0}, Lz0/v$b;-><init>(Ly7/K;)V

    invoke-static {p0, v1}, LF0/F0;->f(LF0/E0;Lx7/l;)V

    :cond_0
    iget-boolean v0, v0, Ly7/K;->C:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lz0/v;->V1()V

    :cond_1
    return-void
.end method

.method private final Z1()Lz0/v;
    .locals 2

    new-instance v0, Ly7/O;

    invoke-direct {v0}, Ly7/O;-><init>()V

    new-instance v1, Lz0/v$c;

    invoke-direct {v1, v0}, Lz0/v$c;-><init>(Ly7/O;)V

    invoke-static {p0, v1}, LF0/F0;->f(LF0/E0;Lx7/l;)V

    iget-object v0, v0, Ly7/O;->C:Ljava/lang/Object;

    check-cast v0, Lz0/v;

    return-object v0
.end method

.method private final a2()Lz0/v;
    .locals 2

    new-instance v0, Ly7/O;

    invoke-direct {v0}, Ly7/O;-><init>()V

    new-instance v1, Lz0/v$d;

    invoke-direct {v1, v0}, Lz0/v$d;-><init>(Ly7/O;)V

    invoke-static {p0, v1}, LF0/F0;->d(LF0/E0;Lx7/l;)V

    iget-object v0, v0, Ly7/O;->C:Ljava/lang/Object;

    check-cast v0, Lz0/v;

    return-object v0
.end method

.method private final c2()Lz0/y;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/platform/p0;->l()LV/O0;

    move-result-object v0

    invoke-static {p0, v0}, LF0/i;->a(LF0/h;LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz0/y;

    return-object v0
.end method

.method private final e2()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz0/v;->S:Z

    invoke-direct {p0}, Lz0/v;->Y1()V

    return-void
.end method

.method private final f2()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lz0/v;->S:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz0/v;->S:Z

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lz0/v;->W1()V

    :cond_0
    return-void
.end method


# virtual methods
.method public E1()V
    .locals 0

    invoke-direct {p0}, Lz0/v;->f2()V

    invoke-super {p0}, Landroidx/compose/ui/d$c;->E1()V

    return-void
.end method

.method public bridge synthetic K()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lz0/v;->d2()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public synthetic Y0()Z
    .locals 1

    invoke-static {p0}, LF0/u0;->d(LF0/v0;)Z

    move-result v0

    return v0
.end method

.method public final b2()Z
    .locals 1

    iget-boolean v0, p0, Lz0/v;->R:Z

    return v0
.end method

.method public d2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lz0/v;->P:Ljava/lang/String;

    return-object v0
.end method

.method public synthetic f1()V
    .locals 0

    invoke-static {p0}, LF0/u0;->c(LF0/v0;)V

    return-void
.end method

.method public g0()V
    .locals 0

    invoke-direct {p0}, Lz0/v;->f2()V

    return-void
.end method

.method public final g2(Lz0/w;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lz0/v;->Q:Lz0/w;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lz0/v;->Q:Lz0/w;

    iget-boolean p1, p0, Lz0/v;->S:Z

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lz0/v;->Y1()V

    :cond_0
    return-void
.end method

.method public final h2(Z)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lz0/v;->R:Z

    if-eq v0, p1, :cond_1

    iput-boolean p1, p0, Lz0/v;->R:Z

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lz0/v;->S:Z

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lz0/v;->V1()V

    goto :goto_0

    :cond_0
    iget-boolean p1, p0, Lz0/v;->S:Z

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lz0/v;->X1()V

    :cond_1
    :goto_0
    return-void
.end method

.method public synthetic n0()Z
    .locals 1

    invoke-static {p0}, LF0/u0;->a(LF0/v0;)Z

    move-result v0

    return v0
.end method

.method public synthetic t0()V
    .locals 0

    invoke-static {p0}, LF0/u0;->b(LF0/v0;)V

    return-void
.end method

.method public w0(Lz0/p;Lz0/r;J)V
    .locals 0

    .prologue
    sget-object p3, Lz0/r;->D:Lz0/r;

    if-ne p2, p3, :cond_1

    invoke-virtual {p1}, Lz0/p;->f()I

    move-result p2

    sget-object p3, Lz0/t;->a:Lz0/t$a;

    invoke-virtual {p3}, Lz0/t$a;->a()I

    move-result p4

    invoke-static {p2, p4}, Lz0/t;->i(II)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-direct {p0}, Lz0/v;->e2()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lz0/p;->f()I

    move-result p1

    invoke-virtual {p3}, Lz0/t$a;->b()I

    move-result p2

    invoke-static {p1, p2}, Lz0/t;->i(II)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lz0/v;->f2()V

    :cond_1
    :goto_0
    return-void
.end method
