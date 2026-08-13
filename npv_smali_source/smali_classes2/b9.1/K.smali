.class public abstract Lb9/K;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb9/D;

.field private static final b:Lx7/p;

.field private static final c:Lx7/p;

.field private static final d:Lx7/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb9/D;

    const-string v1, "NO_THREAD_ELEMENTS"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, Lb9/K;->a:Lb9/D;

    new-instance v0, Lb9/H;

    invoke-direct {v0}, Lb9/H;-><init>()V

    sput-object v0, Lb9/K;->b:Lx7/p;

    new-instance v0, Lb9/I;

    invoke-direct {v0}, Lb9/I;-><init>()V

    sput-object v0, Lb9/K;->c:Lx7/p;

    new-instance v0, Lb9/J;

    invoke-direct {v0}, Lb9/J;-><init>()V

    sput-object v0, Lb9/K;->d:Lx7/p;

    return-void
.end method

.method public static synthetic a(LW8/V0;Lm7/i$b;)LW8/V0;
    .locals 0

    invoke-static {p0, p1}, Lb9/K;->e(LW8/V0;Lm7/i$b;)LW8/V0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;Lm7/i$b;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lb9/K;->d(Ljava/lang/Object;Lm7/i$b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lb9/Q;Lm7/i$b;)Lb9/Q;
    .locals 0

    invoke-static {p0, p1}, Lb9/K;->h(Lb9/Q;Lm7/i$b;)Lb9/Q;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ljava/lang/Object;Lm7/i$b;)Ljava/lang/Object;
    .locals 1

    .prologue
    instance-of v0, p1, LW8/V0;

    if-eqz v0, :cond_3

    instance-of v0, p0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const/4 v0, 0x1

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    goto :goto_1

    :cond_1
    move p0, v0

    :goto_1
    if-nez p0, :cond_2

    goto :goto_2

    :cond_2
    add-int/2addr p0, v0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_2
    return-object p1

    :cond_3
    return-object p0
.end method

.method private static final e(LW8/V0;Lm7/i$b;)LW8/V0;
    .locals 0

    .prologue
    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    instance-of p0, p1, LW8/V0;

    if-eqz p0, :cond_1

    check-cast p1, LW8/V0;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public static final f(Lm7/i;Ljava/lang/Object;)V
    .locals 2

    .prologue
    sget-object v0, Lb9/K;->a:Lb9/D;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lb9/Q;

    if-eqz v0, :cond_1

    check-cast p1, Lb9/Q;

    invoke-virtual {p1, p0}, Lb9/Q;->b(Lm7/i;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    sget-object v1, Lb9/K;->c:Lx7/p;

    invoke-interface {p0, v0, v1}, Lm7/i;->D(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LW8/V0;

    invoke-interface {v0, p0, p1}, LW8/V0;->c1(Lm7/i;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static final g(Lm7/i;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Lb9/K;->b:Lx7/p;

    invoke-interface {p0, v0, v1}, Lm7/i;->D(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object p0
.end method

.method private static final h(Lb9/Q;Lm7/i$b;)Lb9/Q;
    .locals 1

    .prologue
    instance-of v0, p1, LW8/V0;

    if-eqz v0, :cond_0

    check-cast p1, LW8/V0;

    iget-object v0, p0, Lb9/Q;->a:Lm7/i;

    invoke-interface {p1, v0}, LW8/V0;->P0(Lm7/i;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lb9/Q;->a(LW8/V0;Ljava/lang/Object;)V

    :cond_0
    return-object p0
.end method

.method public static final i(Lm7/i;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    invoke-static {p0}, Lb9/K;->g(Lm7/i;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ne p1, v0, :cond_1

    sget-object p0, Lb9/K;->a:Lb9/D;

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    new-instance v0, Lb9/Q;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, p0, p1}, Lb9/Q;-><init>(Lm7/i;I)V

    sget-object p1, Lb9/K;->d:Lx7/p;

    invoke-interface {p0, v0, p1}, Lm7/i;->D(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_2
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LW8/V0;

    invoke-interface {p1, p0}, LW8/V0;->P0(Lm7/i;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    return-object p0
.end method
