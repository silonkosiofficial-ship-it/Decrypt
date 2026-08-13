.class public final Lt2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt2/a$b;
    }
.end annotation


# static fields
.field public static final i:Lt2/a$b;

.field private static final j:Lh2/L$b$b;


# instance fields
.field private final a:[Ljava/lang/String;

.field private final b:Lt2/b;

.field private final c:Lx7/q;

.field private final d:Lo2/n;

.field private final e:Lo2/u;

.field private final f:LV8/c;

.field private final g:LV8/a;

.field private h:LW8/z0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt2/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt2/a$b;-><init>(Ly7/k;)V

    sput-object v0, Lt2/a;->i:Lt2/a$b;

    new-instance v0, Lh2/L$b$b;

    invoke-direct {v0}, Lh2/L$b$b;-><init>()V

    sput-object v0, Lt2/a;->j:Lh2/L$b$b;

    return-void
.end method

.method public constructor <init>([Ljava/lang/String;Lt2/b;Lx7/q;)V
    .locals 1

    const-string v0, "tables"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pagingSource"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "convertRows"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt2/a;->a:[Ljava/lang/String;

    iput-object p2, p0, Lt2/a;->b:Lt2/b;

    iput-object p3, p0, Lt2/a;->c:Lx7/q;

    invoke-virtual {p2}, Lt2/b;->j()Lo2/n;

    move-result-object p1

    iput-object p1, p0, Lt2/a;->d:Lo2/n;

    invoke-virtual {p2}, Lt2/b;->l()Lo2/u;

    move-result-object p1

    iput-object p1, p0, Lt2/a;->e:Lo2/u;

    const/4 p1, -0x1

    invoke-static {p1}, LV8/b;->c(I)LV8/c;

    move-result-object p1

    iput-object p1, p0, Lt2/a;->f:LV8/c;

    const/4 p1, 0x0

    invoke-static {p1}, LV8/b;->a(Z)LV8/a;

    move-result-object p1

    iput-object p1, p0, Lt2/a;->g:LV8/a;

    new-instance p1, Lt2/a$a;

    invoke-direct {p1, p0}, Lt2/a$a;-><init>(Lt2/a;)V

    invoke-virtual {p2, p1}, Lh2/L;->g(Lx7/a;)V

    return-void
.end method

.method public static final synthetic a(Lt2/a;)Lx7/q;
    .locals 0

    iget-object p0, p0, Lt2/a;->c:Lx7/q;

    return-object p0
.end method

.method public static final synthetic b(Lt2/a;)Lo2/n;
    .locals 0

    iget-object p0, p0, Lt2/a;->d:Lo2/n;

    return-object p0
.end method

.method public static final synthetic c(Lt2/a;)LW8/z0;
    .locals 0

    iget-object p0, p0, Lt2/a;->h:LW8/z0;

    return-object p0
.end method

.method public static final synthetic d(Lt2/a;)Lt2/b;
    .locals 0

    iget-object p0, p0, Lt2/a;->b:Lt2/b;

    return-object p0
.end method

.method public static final synthetic e(Lt2/a;)Lo2/u;
    .locals 0

    iget-object p0, p0, Lt2/a;->e:Lo2/u;

    return-object p0
.end method

.method public static final synthetic f(Lt2/a;)[Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lt2/a;->a:[Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic g(Lt2/a;Lh2/L$a;ILm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lt2/a;->k(Lh2/L$a;ILm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final i(Lh2/L$a;Lm7/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lt2/a;->d:Lo2/n;

    new-instance v1, Lt2/a$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lt2/a$c;-><init>(Lt2/a;Lh2/L$a;Lm7/e;)V

    invoke-static {v0, v1, p2}, Lo2/o;->a(Lo2/n;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final k(Lh2/L$a;ILm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p3, Lt2/a$f;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lt2/a$f;

    iget v1, v0, Lt2/a$f;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lt2/a$f;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Lt2/a$f;

    invoke-direct {v0, p0, p3}, Lt2/a$f;-><init>(Lt2/a;Lm7/e;)V

    :goto_0
    iget-object p3, v0, Lt2/a$f;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lt2/a$f;->J:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lt2/a$f;->G:Ljava/lang/Object;

    check-cast p1, Lh2/L$b;

    iget-object p2, v0, Lt2/a$f;->F:Ljava/lang/Object;

    check-cast p2, Lt2/a;

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lt2/a$f;->F:Ljava/lang/Object;

    check-cast p1, Lt2/a;

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p2, p1

    goto :goto_1

    :cond_3
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p3, p0, Lt2/a;->e:Lo2/u;

    iget-object v2, p0, Lt2/a;->c:Lx7/q;

    iput-object p0, v0, Lt2/a$f;->F:Ljava/lang/Object;

    iput v4, v0, Lt2/a$f;->J:I

    invoke-static {p1, p3, p2, v2, v0}, Lu2/a;->d(Lh2/L$a;Lo2/u;ILx7/q;Lm7/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    move-object p2, p0

    :goto_1
    move-object p1, p3

    check-cast p1, Lh2/L$b;

    iget-object p3, p2, Lt2/a;->d:Lo2/n;

    invoke-virtual {p3}, Lo2/n;->q()LW8/N;

    move-result-object p3

    invoke-interface {p3}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object p3

    new-instance v2, Lt2/a$g;

    const/4 v4, 0x0

    invoke-direct {v2, p2, v4}, Lt2/a$g;-><init>(Lt2/a;Lm7/e;)V

    iput-object p2, v0, Lt2/a$f;->F:Ljava/lang/Object;

    iput-object p1, v0, Lt2/a$f;->G:Ljava/lang/Object;

    iput v3, v0, Lt2/a$f;->J:I

    invoke-static {p3, v2, v0}, LW8/g;->g(Lm7/i;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    iget-object p2, p2, Lt2/a;->b:Lt2/b;

    invoke-virtual {p2}, Lh2/L;->a()Z

    move-result p2

    if-eqz p2, :cond_6

    sget-object p1, Lt2/a;->j:Lh2/L$b$b;

    const-string p2, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Invalid<kotlin.Int, Value of androidx.room.paging.CommonLimitOffsetImpl>"

    invoke-static {p1, p2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_6
    return-object p1
.end method


# virtual methods
.method public final h()LV8/c;
    .locals 1

    iget-object v0, p0, Lt2/a;->f:LV8/c;

    return-object v0
.end method

.method public final j(Lh2/L$a;Lm7/e;)Ljava/lang/Object;
    .locals 11

    .prologue
    instance-of v0, p2, Lt2/a$d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lt2/a$d;

    iget v1, v0, Lt2/a$d;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lt2/a$d;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lt2/a$d;

    invoke-direct {v0, p0, p2}, Lt2/a$d;-><init>(Lt2/a;Lm7/e;)V

    :goto_0
    iget-object p2, v0, Lt2/a$d;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lt2/a$d;->H:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :try_start_1
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_3
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lt2/a;->g:LV8/a;

    const/4 v2, 0x0

    invoke-virtual {p2, v2, v4}, LV8/a;->a(ZZ)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p2, p0, Lt2/a;->d:Lo2/n;

    invoke-virtual {p2}, Lo2/n;->q()LW8/N;

    move-result-object v5

    new-instance v8, Lt2/a$e;

    const/4 p2, 0x0

    invoke-direct {v8, p0, p2}, Lt2/a$e;-><init>(Lt2/a;Lm7/e;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    move-result-object p2

    iput-object p2, p0, Lt2/a;->h:LW8/z0;

    :cond_4
    iget-object p2, p0, Lt2/a;->f:LV8/c;

    invoke-virtual {p2}, LV8/c;->c()I

    move-result p2

    const/4 v2, -0x1

    if-ne p2, v2, :cond_6

    :try_start_2
    iput v4, v0, Lt2/a$d;->H:I

    invoke-direct {p0, p1, v0}, Lt2/a;->i(Lh2/L$a;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    :goto_1
    check-cast p2, Lh2/L$b;

    goto :goto_3

    :cond_6
    iput v3, v0, Lt2/a$d;->H:I

    invoke-direct {p0, p1, p2, v0}, Lt2/a;->k(Lh2/L$a;ILm7/e;)Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    if-ne p2, v1, :cond_5

    return-object v1

    :goto_2
    new-instance p2, Lh2/L$b$a;

    invoke-direct {p2, p1}, Lh2/L$b$a;-><init>(Ljava/lang/Throwable;)V

    :goto_3
    return-object p2
.end method
