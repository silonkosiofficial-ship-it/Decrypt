.class public final LU5/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU5/g$b;
    }
.end annotation


# static fields
.field private static final c:LU5/g$b;

.field private static final d:LQ1/f$a;

.field private static final e:LQ1/f$a;

.field private static final f:LQ1/f$a;

.field private static final g:LQ1/f$a;

.field private static final h:LQ1/f$a;


# instance fields
.field private final a:LM1/h;

.field private b:LU5/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LU5/g$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU5/g$b;-><init>(Ly7/k;)V

    sput-object v0, LU5/g;->c:LU5/g$b;

    const-string v0, "firebase_sessions_enabled"

    invoke-static {v0}, LQ1/h;->a(Ljava/lang/String;)LQ1/f$a;

    move-result-object v0

    sput-object v0, LU5/g;->d:LQ1/f$a;

    const-string v0, "firebase_sessions_sampling_rate"

    invoke-static {v0}, LQ1/h;->c(Ljava/lang/String;)LQ1/f$a;

    move-result-object v0

    sput-object v0, LU5/g;->e:LQ1/f$a;

    const-string v0, "firebase_sessions_restart_timeout"

    invoke-static {v0}, LQ1/h;->e(Ljava/lang/String;)LQ1/f$a;

    move-result-object v0

    sput-object v0, LU5/g;->f:LQ1/f$a;

    const-string v0, "firebase_sessions_cache_duration"

    invoke-static {v0}, LQ1/h;->e(Ljava/lang/String;)LQ1/f$a;

    move-result-object v0

    sput-object v0, LU5/g;->g:LQ1/f$a;

    const-string v0, "firebase_sessions_cache_updated_time"

    invoke-static {v0}, LQ1/h;->f(Ljava/lang/String;)LQ1/f$a;

    move-result-object v0

    sput-object v0, LU5/g;->h:LQ1/f$a;

    return-void
.end method

.method public constructor <init>(LM1/h;)V
    .locals 2

    const-string v0, "dataStore"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU5/g;->a:LM1/h;

    new-instance p1, LU5/g$a;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, LU5/g$a;-><init>(LU5/g;Lm7/e;)V

    const/4 v1, 0x1

    invoke-static {v0, p1, v1, v0}, LW8/g;->f(Lm7/i;Lx7/p;ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic a(LU5/g;)LM1/h;
    .locals 0

    iget-object p0, p0, LU5/g;->a:LM1/h;

    return-object p0
.end method

.method public static final synthetic b(LU5/g;LQ1/f$a;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LU5/g;->h(LQ1/f$a;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LU5/g;LQ1/f;)V
    .locals 0

    invoke-direct {p0, p1}, LU5/g;->l(LQ1/f;)V

    return-void
.end method

.method private final h(LQ1/f$a;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p3, LU5/g$c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LU5/g$c;

    iget v1, v0, LU5/g$c;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LU5/g$c;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, LU5/g$c;

    invoke-direct {v0, p0, p3}, LU5/g$c;-><init>(LU5/g;Lm7/e;)V

    :goto_0
    iget-object p3, v0, LU5/g$c;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LU5/g$c;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p3, p0, LU5/g;->a:LM1/h;

    new-instance v2, LU5/g$d;

    const/4 v4, 0x0

    invoke-direct {v2, p2, p1, p0, v4}, LU5/g$d;-><init>(Ljava/lang/Object;LQ1/f$a;LU5/g;Lm7/e;)V

    iput v3, v0, LU5/g$c;->H:I

    invoke-static {p3, v2, v0}, LQ1/i;->a(LM1/h;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Failed to update cache config value: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "SettingsCache"

    nop

    :cond_3
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method private final l(LQ1/f;)V
    .locals 7

    new-instance v6, LU5/e;

    sget-object v0, LU5/g;->d:LQ1/f$a;

    invoke-virtual {p1, v0}, LQ1/f;->b(LQ1/f$a;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Boolean;

    sget-object v0, LU5/g;->e:LQ1/f$a;

    invoke-virtual {p1, v0}, LQ1/f;->b(LQ1/f$a;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Double;

    sget-object v0, LU5/g;->f:LQ1/f$a;

    invoke-virtual {p1, v0}, LQ1/f;->b(LQ1/f$a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Integer;

    sget-object v0, LU5/g;->g:LQ1/f$a;

    invoke-virtual {p1, v0}, LQ1/f;->b(LQ1/f$a;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    sget-object v0, LU5/g;->h:LQ1/f$a;

    invoke-virtual {p1, v0}, LQ1/f;->b(LQ1/f$a;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ljava/lang/Long;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LU5/e;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V

    iput-object v6, p0, LU5/g;->b:LU5/e;

    return-void
.end method


# virtual methods
.method public final d()Z
    .locals 6

    .prologue
    iget-object v0, p0, LU5/g;->b:LU5/e;

    const/4 v1, 0x0

    const-string v2, "sessionConfigs"

    if-nez v0, :cond_0

    invoke-static {v2}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, LU5/e;->b()Ljava/lang/Long;

    move-result-object v0

    iget-object v3, p0, LU5/g;->b:LU5/e;

    if-nez v3, :cond_1

    invoke-static {v2}, Ly7/t;->p(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    invoke-virtual {v1}, LU5/e;->a()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v2, v4

    const/16 v0, 0x3e8

    int-to-long v4, v0

    div-long/2addr v2, v4

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    cmp-long v0, v2, v0

    if-gez v0, :cond_2

    const/4 v0, 0x0

    return v0

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public final e()Ljava/lang/Integer;
    .locals 1

    .prologue
    iget-object v0, p0, LU5/g;->b:LU5/e;

    if-nez v0, :cond_0

    const-string v0, "sessionConfigs"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, LU5/e;->d()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/lang/Double;
    .locals 1

    .prologue
    iget-object v0, p0, LU5/g;->b:LU5/e;

    if-nez v0, :cond_0

    const-string v0, "sessionConfigs"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, LU5/e;->e()Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public final g()Ljava/lang/Boolean;
    .locals 1

    .prologue
    iget-object v0, p0, LU5/g;->b:LU5/e;

    if-nez v0, :cond_0

    const-string v0, "sessionConfigs"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, LU5/e;->c()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final i(Ljava/lang/Double;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    sget-object v0, LU5/g;->e:LQ1/f$a;

    invoke-direct {p0, v0, p1, p2}, LU5/g;->h(LQ1/f$a;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final j(Ljava/lang/Integer;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    sget-object v0, LU5/g;->g:LQ1/f$a;

    invoke-direct {p0, v0, p1, p2}, LU5/g;->h(LQ1/f$a;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final k(Ljava/lang/Long;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    sget-object v0, LU5/g;->h:LQ1/f$a;

    invoke-direct {p0, v0, p1, p2}, LU5/g;->h(LQ1/f$a;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final m(Ljava/lang/Integer;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    sget-object v0, LU5/g;->f:LQ1/f$a;

    invoke-direct {p0, v0, p1, p2}, LU5/g;->h(LQ1/f$a;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final n(Ljava/lang/Boolean;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    sget-object v0, LU5/g;->d:LQ1/f$a;

    invoke-direct {p0, v0, p1, p2}, LU5/g;->h(LQ1/f$a;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
