.class public final LU5/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU5/f$b;
    }
.end annotation


# static fields
.field public static final c:LU5/f$b;

.field private static final d:LB7/c;


# instance fields
.field private final a:LU5/h;

.field private final b:LU5/h;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, LU5/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU5/f$b;-><init>(Ly7/k;)V

    sput-object v0, LU5/f;->c:LU5/f$b;

    sget-object v0, LS5/w;->a:LS5/w;

    invoke-virtual {v0}, LS5/w;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v2, LN1/b;

    sget-object v0, LU5/f$a;->D:LU5/f$a;

    invoke-direct {v2, v0}, LN1/b;-><init>(Lx7/l;)V

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LP1/a;->b(Ljava/lang/String;LN1/b;Lx7/l;LW8/N;ILjava/lang/Object;)LB7/c;

    move-result-object v0

    sput-object v0, LU5/f;->d:LB7/c;

    return-void
.end method

.method public constructor <init>(LQ4/f;Lm7/i;Lm7/i;LG5/e;)V
    .locals 7

    const-string v0, "firebaseApp"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "blockingDispatcher"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundDispatcher"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firebaseInstallationsApi"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LQ4/f;->k()Landroid/content/Context;

    move-result-object v2

    const-string v0, "firebaseApp.applicationContext"

    invoke-static {v2, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LS5/A;->a:LS5/A;

    invoke-virtual {v0, p1}, LS5/A;->b(LQ4/f;)LS5/b;

    move-result-object v6

    move-object v1, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, LU5/f;-><init>(Landroid/content/Context;Lm7/i;Lm7/i;LG5/e;LS5/b;)V

    return-void
.end method

.method public constructor <init>(LU5/h;LU5/h;)V
    .locals 1

    const-string v0, "localOverrideSettings"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remoteSettings"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU5/f;->a:LU5/h;

    iput-object p2, p0, LU5/f;->b:LU5/h;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lm7/i;Lm7/i;LG5/e;LS5/b;)V
    .locals 9

    new-instance v0, LU5/b;

    invoke-direct {v0, p1}, LU5/b;-><init>(Landroid/content/Context;)V

    new-instance v7, LU5/c;

    new-instance v8, LU5/d;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, v8

    move-object v2, p5

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, LU5/d;-><init>(LS5/b;Lm7/i;Ljava/lang/String;ILy7/k;)V

    sget-object p2, LU5/f;->c:LU5/f$b;

    invoke-static {p2, p1}, LU5/f$b;->a(LU5/f$b;Landroid/content/Context;)LM1/h;

    move-result-object v6

    move-object v1, v7

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, v8

    invoke-direct/range {v1 .. v6}, LU5/c;-><init>(Lm7/i;LG5/e;LS5/b;LU5/a;LM1/h;)V

    invoke-direct {p0, v0, v7}, LU5/f;-><init>(LU5/h;LU5/h;)V

    return-void
.end method

.method public static final synthetic a()LB7/c;
    .locals 1

    sget-object v0, LU5/f;->d:LB7/c;

    return-object v0
.end method

.method private final e(D)Z
    .locals 4

    .prologue
    const-wide/16 v0, 0x0

    cmpg-double v0, v0, p1

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpg-double p1, p1, v2

    if-gtz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method private final f(J)Z
    .locals 1

    .prologue
    invoke-static {p1, p2}, LT8/a;->N(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, LT8/a;->I(J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public final b()D
    .locals 3

    .prologue
    iget-object v0, p0, LU5/f;->a:LU5/h;

    invoke-interface {v0}, LU5/h;->d()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-direct {p0, v0, v1}, LU5/f;->e(D)Z

    move-result v2

    if-eqz v2, :cond_0

    return-wide v0

    :cond_0
    iget-object v0, p0, LU5/f;->b:LU5/h;

    invoke-interface {v0}, LU5/h;->d()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-direct {p0, v0, v1}, LU5/f;->e(D)Z

    move-result v2

    if-eqz v2, :cond_1

    return-wide v0

    :cond_1
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    return-wide v0
.end method

.method public final c()J
    .locals 3

    .prologue
    iget-object v0, p0, LU5/f;->a:LU5/h;

    invoke-interface {v0}, LU5/h;->c()LT8/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LT8/a;->T()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, LU5/f;->f(J)Z

    move-result v2

    if-eqz v2, :cond_0

    return-wide v0

    :cond_0
    iget-object v0, p0, LU5/f;->b:LU5/h;

    invoke-interface {v0}, LU5/h;->c()LT8/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LT8/a;->T()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, LU5/f;->f(J)Z

    move-result v2

    if-eqz v2, :cond_1

    return-wide v0

    :cond_1
    sget-object v0, LT8/a;->D:LT8/a$a;

    const/16 v0, 0x1e

    sget-object v1, LT8/d;->H:LT8/d;

    invoke-static {v0, v1}, LT8/c;->s(ILT8/d;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    iget-object v0, p0, LU5/f;->a:LU5/h;

    invoke-interface {v0}, LU5/h;->a()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, LU5/f;->b:LU5/h;

    invoke-interface {v0}, LU5/h;->a()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public final g(Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p1, LU5/f$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LU5/f$c;

    iget v1, v0, LU5/f$c;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LU5/f$c;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, LU5/f$c;

    invoke-direct {v0, p0, p1}, LU5/f$c;-><init>(LU5/f;Lm7/e;)V

    :goto_0
    iget-object p1, v0, LU5/f$c;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LU5/f$c;->I:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, LU5/f$c;->F:Ljava/lang/Object;

    check-cast v2, LU5/f;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LU5/f;->a:LU5/h;

    iput-object p0, v0, LU5/f$c;->F:Ljava/lang/Object;

    iput v4, v0, LU5/f$c;->I:I

    invoke-interface {p1, v0}, LU5/h;->b(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    iget-object p1, v2, LU5/f;->b:LU5/h;

    const/4 v2, 0x0

    iput-object v2, v0, LU5/f$c;->F:Ljava/lang/Object;

    iput v3, v0, LU5/f$c;->I:I

    invoke-interface {p1, v0}, LU5/h;->b(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
