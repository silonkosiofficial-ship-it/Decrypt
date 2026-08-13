.class public final LS/Y0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS/Y0$a;,
        LS/Y0$b;
    }
.end annotation


# instance fields
.field private final a:Lf9/a;

.field private final b:LV/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lf9/g;->b(ZILjava/lang/Object;)Lf9/a;

    move-result-object v0

    iput-object v0, p0, LS/Y0;->a:Lf9/a;

    const/4 v0, 0x2

    invoke-static {v2, v2, v0, v2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    iput-object v0, p0, LS/Y0;->b:LV/w0;

    return-void
.end method

.method public static final synthetic a(LS/Y0;LS/U0;)V
    .locals 0

    invoke-direct {p0, p1}, LS/Y0;->c(LS/U0;)V

    return-void
.end method

.method private final c(LS/U0;)V
    .locals 1

    iget-object v0, p0, LS/Y0;->b:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(LS/Y0;Ljava/lang/String;Ljava/lang/String;ZLS/W0;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const/4 p3, 0x0

    :cond_1
    move v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    if-nez v2, :cond_2

    sget-object p2, LS/W0;->C:LS/W0;

    :goto_0
    move-object p4, p2

    goto :goto_1

    :cond_2
    sget-object p2, LS/W0;->E:LS/W0;

    goto :goto_0

    :cond_3
    :goto_1
    move-object v4, p4

    move-object v0, p0

    move-object v1, p1

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, LS/Y0;->e(Ljava/lang/String;Ljava/lang/String;ZLS/W0;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b()LS/U0;
    .locals 1

    iget-object v0, p0, LS/Y0;->b:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LS/U0;

    return-object v0
.end method

.method public final d(LS/b1;Lm7/e;)Ljava/lang/Object;
    .locals 8

    .prologue
    instance-of v0, p2, LS/Y0$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LS/Y0$c;

    iget v1, v0, LS/Y0$c;->L:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LS/Y0$c;->L:I

    goto :goto_0

    :cond_0
    new-instance v0, LS/Y0$c;

    invoke-direct {v0, p0, p2}, LS/Y0$c;-><init>(LS/Y0;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LS/Y0$c;->J:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LS/Y0$c;->L:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LS/Y0$c;->I:Ljava/lang/Object;

    check-cast p1, LS/Y0$c;

    iget-object p1, v0, LS/Y0$c;->H:Ljava/lang/Object;

    check-cast p1, Lf9/a;

    iget-object v1, v0, LS/Y0$c;->G:Ljava/lang/Object;

    check-cast v1, LS/b1;

    iget-object v0, v0, LS/Y0$c;->F:Ljava/lang/Object;

    check-cast v0, LS/Y0;

    :try_start_0
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p2

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, LS/Y0$c;->H:Ljava/lang/Object;

    check-cast p1, Lf9/a;

    iget-object v2, v0, LS/Y0$c;->G:Ljava/lang/Object;

    check-cast v2, LS/b1;

    iget-object v6, v0, LS/Y0$c;->F:Ljava/lang/Object;

    check-cast v6, LS/Y0;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p2, p1

    move-object p1, v2

    goto :goto_1

    :cond_3
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LS/Y0;->a:Lf9/a;

    iput-object p0, v0, LS/Y0$c;->F:Ljava/lang/Object;

    iput-object p1, v0, LS/Y0$c;->G:Ljava/lang/Object;

    iput-object p2, v0, LS/Y0$c;->H:Ljava/lang/Object;

    iput v4, v0, LS/Y0$c;->L:I

    invoke-interface {p2, v5, v0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v6, p0

    :goto_1
    :try_start_1
    iput-object v6, v0, LS/Y0$c;->F:Ljava/lang/Object;

    iput-object p1, v0, LS/Y0$c;->G:Ljava/lang/Object;

    iput-object p2, v0, LS/Y0$c;->H:Ljava/lang/Object;

    iput-object v0, v0, LS/Y0$c;->I:Ljava/lang/Object;

    iput v3, v0, LS/Y0$c;->L:I

    new-instance v2, LW8/n;

    invoke-static {v0}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v3

    invoke-direct {v2, v3, v4}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {v2}, LW8/n;->E()V

    new-instance v3, LS/Y0$a;

    invoke-direct {v3, p1, v2}, LS/Y0$a;-><init>(LS/b1;LW8/l;)V

    invoke-static {v6, v3}, LS/Y0;->a(LS/Y0;LS/U0;)V

    invoke-virtual {v2}, LW8/n;->x()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v2

    if-ne p1, v2, :cond_5

    invoke-static {v0}, Lo7/h;->c(Lm7/e;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    move-object v0, v6

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    goto :goto_4

    :cond_5
    :goto_2
    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    move-object v0, v6

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_3
    :try_start_2
    invoke-direct {v0, v5}, LS/Y0;->c(LS/U0;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-interface {p1, v5}, Lf9/a;->d(Ljava/lang/Object;)V

    return-object p2

    :catchall_2
    move-exception p2

    goto :goto_5

    :goto_4
    :try_start_3
    invoke-direct {v0, v5}, LS/Y0;->c(LS/U0;)V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_5
    invoke-interface {p1, v5}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p2
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;ZLS/W0;Lm7/e;)Ljava/lang/Object;
    .locals 1

    new-instance v0, LS/Y0$b;

    invoke-direct {v0, p1, p2, p3, p4}, LS/Y0$b;-><init>(Ljava/lang/String;Ljava/lang/String;ZLS/W0;)V

    invoke-virtual {p0, v0, p5}, LS/Y0;->d(LS/b1;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
