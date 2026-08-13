.class public abstract LR7/N;
.super LR7/M;
.source "SourceFile"


# instance fields
.field private final H:Z

.field protected I:LE8/j;

.field protected J:Lx7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LO7/m;LP7/g;Ln8/f;LF8/E;ZLO7/a0;)V
    .locals 6

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LR7/N;->M(I)V

    :cond_0
    if-nez p2, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, LR7/N;->M(I)V

    :cond_1
    if-nez p3, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, LR7/N;->M(I)V

    :cond_2
    if-nez p6, :cond_3

    const/4 v0, 0x3

    invoke-static {v0}, LR7/N;->M(I)V

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, LR7/M;-><init>(LO7/m;LP7/g;Ln8/f;LF8/E;LO7/a0;)V

    iput-boolean p5, p0, LR7/N;->H:Z

    return-void
.end method

.method private static synthetic M(I)V
    .locals 7

    .prologue
    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-eq p0, v4, :cond_3

    if-eq p0, v5, :cond_2

    if-eq p0, v0, :cond_1

    if-eq p0, v3, :cond_0

    if-eq p0, v2, :cond_0

    const-string v0, "containingDeclaration"

    aput-object v0, v1, v6

    goto :goto_0

    :cond_0
    const-string v0, "compileTimeInitializerFactory"

    aput-object v0, v1, v6

    goto :goto_0

    :cond_1
    const-string v0, "source"

    aput-object v0, v1, v6

    goto :goto_0

    :cond_2
    const-string v0, "name"

    aput-object v0, v1, v6

    goto :goto_0

    :cond_3
    const-string v0, "annotations"

    aput-object v0, v1, v6

    :goto_0
    const-string v0, "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl"

    aput-object v0, v1, v4

    if-eq p0, v3, :cond_5

    if-eq p0, v2, :cond_4

    const-string p0, "<init>"

    aput-object p0, v1, v5

    goto :goto_1

    :cond_4
    const-string p0, "setCompileTimeInitializer"

    aput-object p0, v1, v5

    goto :goto_1

    :cond_5
    const-string p0, "setCompileTimeInitializerFactory"

    aput-object p0, v1, v5

    :goto_1
    const-string p0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public T0(LE8/j;Lx7/a;)V
    .locals 1

    .prologue
    if-nez p2, :cond_0

    const/4 v0, 0x5

    invoke-static {v0}, LR7/N;->M(I)V

    :cond_0
    iput-object p2, p0, LR7/N;->J:Lx7/a;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LE8/j;

    :goto_0
    iput-object p1, p0, LR7/N;->I:LE8/j;

    return-void
.end method

.method public U0(Lx7/a;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x4

    invoke-static {v0}, LR7/N;->M(I)V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, LR7/N;->T0(LE8/j;Lx7/a;)V

    return-void
.end method

.method public d0()Lt8/g;
    .locals 1

    .prologue
    iget-object v0, p0, LR7/N;->I:LE8/j;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt8/g;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public t0()Z
    .locals 1

    iget-boolean v0, p0, LR7/N;->H:Z

    return v0
.end method
