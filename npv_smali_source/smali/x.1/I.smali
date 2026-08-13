.class public final Lx/I;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx/I$a;
    }
.end annotation


# static fields
.field private static final f:Lx/I$a;

.field public static final g:I

.field private static final h:Lu/n;


# instance fields
.field private final a:Lu/B0;

.field private b:J

.field private c:Lu/n;

.field private d:Z

.field private e:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx/I$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx/I$a;-><init>(Ly7/k;)V

    sput-object v0, Lx/I;->f:Lx/I$a;

    const/16 v0, 0x8

    sput v0, Lx/I;->g:I

    new-instance v0, Lu/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu/n;-><init>(F)V

    sput-object v0, Lx/I;->h:Lu/n;

    return-void
.end method

.method public constructor <init>(Lu/j;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ly7/m;->a:Ly7/m;

    invoke-static {v0}, Lu/z0;->i(Ly7/m;)Lu/x0;

    move-result-object v0

    invoke-interface {p1, v0}, Lu/j;->a(Lu/x0;)Lu/B0;

    move-result-object p1

    iput-object p1, p0, Lx/I;->a:Lu/B0;

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lx/I;->b:J

    sget-object p1, Lx/I;->h:Lu/n;

    iput-object p1, p0, Lx/I;->c:Lu/n;

    return-void
.end method

.method public static final synthetic a()Lx/I$a;
    .locals 1

    sget-object v0, Lx/I;->f:Lx/I$a;

    return-object v0
.end method

.method public static final synthetic b(Lx/I;)J
    .locals 2

    iget-wide v0, p0, Lx/I;->b:J

    return-wide v0
.end method

.method public static final synthetic c(Lx/I;)Lu/n;
    .locals 0

    iget-object p0, p0, Lx/I;->c:Lu/n;

    return-object p0
.end method

.method public static final synthetic d(Lx/I;)Lu/B0;
    .locals 0

    iget-object p0, p0, Lx/I;->a:Lu/B0;

    return-object p0
.end method

.method public static final synthetic e()Lu/n;
    .locals 1

    sget-object v0, Lx/I;->h:Lu/n;

    return-object v0
.end method

.method public static final synthetic f(Lx/I;J)V
    .locals 0

    iput-wide p1, p0, Lx/I;->b:J

    return-void
.end method

.method public static final synthetic g(Lx/I;Lu/n;)V
    .locals 0

    iput-object p1, p0, Lx/I;->c:Lu/n;

    return-void
.end method


# virtual methods
.method public final h(Lx7/l;Lx7/a;Lm7/e;)Ljava/lang/Object;
    .locals 12

    .prologue
    instance-of v0, p3, Lx/I$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lx/I$b;

    iget v1, v0, Lx/I$b;->L:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx/I$b;->L:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx/I$b;

    invoke-direct {v0, p0, p3}, Lx/I$b;-><init>(Lx/I;Lm7/e;)V

    :goto_0
    iget-object p3, v0, Lx/I$b;->J:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lx/I$b;->L:I

    const/4 v3, 0x0

    const-wide/high16 v4, -0x8000000000000000L

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v8, :cond_2

    if-ne v2, v7, :cond_1

    iget-object p1, v0, Lx/I$b;->G:Ljava/lang/Object;

    check-cast p1, Lx7/a;

    iget-object p2, v0, Lx/I$b;->F:Ljava/lang/Object;

    check-cast p2, Lx/I;

    :try_start_0
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lx/I$b;->I:F

    iget-object p2, v0, Lx/I$b;->H:Ljava/lang/Object;

    check-cast p2, Lx7/a;

    iget-object v2, v0, Lx/I$b;->G:Ljava/lang/Object;

    check-cast v2, Lx7/l;

    iget-object v9, v0, Lx/I$b;->F:Ljava/lang/Object;

    check-cast v9, Lx/I;

    :try_start_1
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object p3, v9

    move-object v11, v0

    move-object v0, p2

    move-object p2, v2

    move-object v2, v11

    goto :goto_2

    :catchall_1
    move-exception p1

    move-object p2, v9

    goto/16 :goto_6

    :cond_3
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    iget-boolean p3, p0, Lx/I;->d:Z

    xor-int/2addr p3, v8

    if-eqz p3, :cond_a

    invoke-interface {v0}, Lm7/e;->getContext()Lm7/i;

    move-result-object p3

    sget-object v2, Lh0/k;->y:Lh0/k$b;

    invoke-interface {p3, v2}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p3

    check-cast p3, Lh0/k;

    if-eqz p3, :cond_4

    invoke-interface {p3}, Lh0/k;->n0()F

    move-result p3

    goto :goto_1

    :cond_4
    const/high16 p3, 0x3f800000    # 1.0f

    :goto_1
    iput-boolean v8, p0, Lx/I;->d:Z

    move-object v2, v0

    move-object v0, p2

    move-object p2, p1

    move p1, p3

    move-object p3, p0

    :cond_5
    :try_start_2
    sget-object v9, Lx/I;->f:Lx/I$a;

    iget v10, p3, Lx/I;->e:F

    invoke-virtual {v9, v10}, Lx/I$a;->b(F)Z

    move-result v9

    if-nez v9, :cond_7

    new-instance v9, Lx/I$c;

    invoke-direct {v9, p3, p1, p2}, Lx/I$c;-><init>(Lx/I;FLx7/l;)V

    iput-object p3, v2, Lx/I$b;->F:Ljava/lang/Object;

    iput-object p2, v2, Lx/I$b;->G:Ljava/lang/Object;

    iput-object v0, v2, Lx/I$b;->H:Ljava/lang/Object;

    iput p1, v2, Lx/I$b;->I:F

    iput v8, v2, Lx/I$b;->L:I

    invoke-static {v9, v2}, LV/l0;->c(Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v1, :cond_6

    return-object v1

    :cond_6
    :goto_2
    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    cmpg-float v9, p1, v6

    if-nez v9, :cond_5

    :cond_7
    move-object p1, v0

    move-object v11, p3

    move-object p3, p2

    move-object p2, v11

    goto :goto_3

    :catchall_2
    move-exception p1

    move-object p2, p3

    goto :goto_6

    :goto_3
    :try_start_3
    iget v0, p2, Lx/I;->e:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v6

    if-nez v0, :cond_8

    goto :goto_5

    :cond_8
    new-instance v0, Lx/I$d;

    invoke-direct {v0, p2, p3}, Lx/I$d;-><init>(Lx/I;Lx7/l;)V

    iput-object p2, v2, Lx/I$b;->F:Ljava/lang/Object;

    iput-object p1, v2, Lx/I$b;->G:Ljava/lang/Object;

    const/4 p3, 0x0

    iput-object p3, v2, Lx/I$b;->H:Ljava/lang/Object;

    iput v7, v2, Lx/I$b;->L:I

    invoke-static {v0, v2}, LV/l0;->c(Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_9

    return-object v1

    :cond_9
    :goto_4
    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_5
    iput-wide v4, p2, Lx/I;->b:J

    sget-object p1, Lx/I;->h:Lu/n;

    iput-object p1, p2, Lx/I;->c:Lu/n;

    iput-boolean v3, p2, Lx/I;->d:Z

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :goto_6
    iput-wide v4, p2, Lx/I;->b:J

    sget-object p3, Lx/I;->h:Lu/n;

    iput-object p3, p2, Lx/I;->c:Lu/n;

    iput-boolean v3, p2, Lx/I;->d:Z

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "animateToZero called while previous animation is running"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i()F
    .locals 1

    iget v0, p0, Lx/I;->e:F

    return v0
.end method

.method public final j(F)V
    .locals 0

    iput p1, p0, Lx/I;->e:F

    return-void
.end method
