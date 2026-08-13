.class final LS/X;
.super LF0/m;
.source "SourceFile"

# interfaces
.implements LF0/h;
.implements LF0/i0;


# instance fields
.field private final R:Lz/j;

.field private final S:Z

.field private final T:F

.field private final U:Lo0/B0;

.field private V:LF0/j;


# direct methods
.method private constructor <init>(Lz/j;ZFLo0/B0;)V
    .locals 0

    invoke-direct {p0}, LF0/m;-><init>()V

    iput-object p1, p0, LS/X;->R:Lz/j;

    iput-boolean p2, p0, LS/X;->S:Z

    iput p3, p0, LS/X;->T:F

    iput-object p4, p0, LS/X;->U:Lo0/B0;

    return-void
.end method

.method public synthetic constructor <init>(Lz/j;ZFLo0/B0;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LS/X;-><init>(Lz/j;ZFLo0/B0;)V

    return-void
.end method

.method public static final synthetic Z1(LS/X;)V
    .locals 0

    invoke-direct {p0}, LS/X;->d2()V

    return-void
.end method

.method public static final synthetic a2(LS/X;)Lo0/B0;
    .locals 0

    iget-object p0, p0, LS/X;->U:Lo0/B0;

    return-object p0
.end method

.method public static final synthetic b2(LS/X;)LF0/j;
    .locals 0

    iget-object p0, p0, LS/X;->V:LF0/j;

    return-object p0
.end method

.method public static final synthetic c2(LS/X;)V
    .locals 0

    invoke-direct {p0}, LS/X;->e2()V

    return-void
.end method

.method private final d2()V
    .locals 5

    new-instance v0, LS/X$a;

    invoke-direct {v0, p0}, LS/X$a;-><init>(LS/X;)V

    new-instance v1, LS/X$b;

    invoke-direct {v1, p0}, LS/X$b;-><init>(LS/X;)V

    iget-object v2, p0, LS/X;->R:Lz/j;

    iget-boolean v3, p0, LS/X;->S:Z

    iget v4, p0, LS/X;->T:F

    invoke-static {v2, v3, v4, v0, v1}, LR/p;->c(Lz/j;ZFLo0/B0;Lx7/a;)LF0/j;

    move-result-object v0

    invoke-virtual {p0, v0}, LF0/m;->T1(LF0/j;)LF0/j;

    move-result-object v0

    iput-object v0, p0, LS/X;->V:LF0/j;

    return-void
.end method

.method private final e2()V
    .locals 1

    .prologue
    iget-object v0, p0, LS/X;->V:LF0/j;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, LF0/m;->W1(LF0/j;)V

    :cond_0
    return-void
.end method

.method private final f2()V
    .locals 1

    new-instance v0, LS/X$c;

    invoke-direct {v0, p0}, LS/X$c;-><init>(LS/X;)V

    invoke-static {p0, v0}, LF0/j0;->a(Landroidx/compose/ui/d$c;Lx7/a;)V

    return-void
.end method


# virtual methods
.method public D1()V
    .locals 0

    invoke-direct {p0}, LS/X;->f2()V

    return-void
.end method

.method public L0()V
    .locals 0

    invoke-direct {p0}, LS/X;->f2()V

    return-void
.end method
