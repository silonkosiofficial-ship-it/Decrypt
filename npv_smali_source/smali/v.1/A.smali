.class final Lv/A;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/h;
.implements LF0/i0;


# instance fields
.field private P:LD0/V$a;

.field private Q:Z

.field private final R:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    return-void
.end method

.method private final T1()LD0/V;
    .locals 2

    new-instance v0, Ly7/O;

    invoke-direct {v0}, Ly7/O;-><init>()V

    new-instance v1, Lv/A$a;

    invoke-direct {v1, v0, p0}, Lv/A$a;-><init>(Ly7/O;Lv/A;)V

    invoke-static {p0, v1}, LF0/j0;->a(Landroidx/compose/ui/d$c;Lx7/a;)V

    iget-object v0, v0, Ly7/O;->C:Ljava/lang/Object;

    check-cast v0, LD0/V;

    return-object v0
.end method


# virtual methods
.method public F1()V
    .locals 1

    .prologue
    iget-object v0, p0, Lv/A;->P:LD0/V$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LD0/V$a;->a()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lv/A;->P:LD0/V$a;

    return-void
.end method

.method public L0()V
    .locals 2

    .prologue
    invoke-direct {p0}, Lv/A;->T1()LD0/V;

    move-result-object v0

    iget-boolean v1, p0, Lv/A;->Q:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lv/A;->P:LD0/V$a;

    if-eqz v1, :cond_0

    invoke-interface {v1}, LD0/V$a;->a()V

    :cond_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, LD0/V;->b()LD0/V$a;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lv/A;->P:LD0/V$a;

    :cond_2
    return-void
.end method

.method public final U1(Z)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lv/A;->T1()LD0/V;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, LD0/V;->b()LD0/V$a;

    move-result-object v0

    :cond_0
    :goto_0
    iput-object v0, p0, Lv/A;->P:LD0/V$a;

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lv/A;->P:LD0/V$a;

    if-eqz v1, :cond_0

    invoke-interface {v1}, LD0/V$a;->a()V

    goto :goto_0

    :goto_1
    iput-boolean p1, p0, Lv/A;->Q:Z

    return-void
.end method

.method public y1()Z
    .locals 1

    iget-boolean v0, p0, Lv/A;->R:Z

    return v0
.end method
