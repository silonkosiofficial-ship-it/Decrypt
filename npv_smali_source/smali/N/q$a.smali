.class public final LN/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LN/q$a;

.field private static final b:LN/q;

.field private static final c:LN/q;

.field private static final d:LN/q;

.field private static final e:LN/q;

.field private static final f:LN/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/q$a;

    invoke-direct {v0}, LN/q$a;-><init>()V

    sput-object v0, LN/q$a;->a:LN/q$a;

    new-instance v0, LN/l;

    invoke-direct {v0}, LN/l;-><init>()V

    sput-object v0, LN/q$a;->b:LN/q;

    new-instance v0, LN/m;

    invoke-direct {v0}, LN/m;-><init>()V

    sput-object v0, LN/q$a;->c:LN/q;

    new-instance v0, LN/n;

    invoke-direct {v0}, LN/n;-><init>()V

    sput-object v0, LN/q$a;->d:LN/q;

    new-instance v0, LN/o;

    invoke-direct {v0}, LN/o;-><init>()V

    sput-object v0, LN/q$a;->e:LN/q;

    new-instance v0, LN/p;

    invoke-direct {v0}, LN/p;-><init>()V

    sput-object v0, LN/q$a;->f:LN/q;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LN/w;)LN/k;
    .locals 0

    invoke-static {p0}, LN/q$a;->j(LN/w;)LN/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LN/w;)LN/k;
    .locals 0

    invoke-static {p0}, LN/q$a;->i(LN/w;)LN/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LN/w;)LN/k;
    .locals 0

    invoke-static {p0}, LN/q$a;->g(LN/w;)LN/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LN/w;)LN/k;
    .locals 0

    invoke-static {p0}, LN/q$a;->h(LN/w;)LN/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LN/w;)LN/k;
    .locals 0

    invoke-static {p0}, LN/q$a;->f(LN/w;)LN/k;

    move-result-object p0

    return-object p0
.end method

.method private static final f(LN/w;)LN/k;
    .locals 1

    sget-object v0, LN/q$a;->b:LN/q;

    invoke-interface {v0, p0}, LN/q;->a(LN/w;)LN/k;

    move-result-object v0

    invoke-static {v0, p0}, LN/r;->h(LN/k;LN/w;)LN/k;

    move-result-object p0

    return-object p0
.end method

.method private static final g(LN/w;)LN/k;
    .locals 5

    .prologue
    invoke-interface {p0}, LN/w;->d()LN/k;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, LN/q$a;->d:LN/q;

    invoke-interface {v0, p0}, LN/q;->a(LN/w;)LN/k;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, LN/w;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, LN/k;->e()LN/k$a;

    move-result-object v1

    invoke-interface {p0}, LN/w;->k()LN/j;

    move-result-object v2

    invoke-static {p0, v2, v1}, LN/r;->c(LN/w;LN/j;LN/k$a;)LN/k$a;

    move-result-object v2

    invoke-virtual {v0}, LN/k;->c()LN/k$a;

    move-result-object v3

    move-object v4, v3

    move-object v3, v2

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LN/k;->c()LN/k$a;

    move-result-object v1

    invoke-interface {p0}, LN/w;->h()LN/j;

    move-result-object v2

    invoke-static {p0, v2, v1}, LN/r;->c(LN/w;LN/j;LN/k$a;)LN/k$a;

    move-result-object v2

    invoke-virtual {v0}, LN/k;->e()LN/k$a;

    move-result-object v3

    move-object v4, v2

    :goto_0
    invoke-static {v2, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_3

    :cond_2
    invoke-interface {p0}, LN/w;->i()LN/e;

    move-result-object v0

    sget-object v1, LN/e;->C:LN/e;

    if-eq v0, v1, :cond_4

    invoke-interface {p0}, LN/w;->i()LN/e;

    move-result-object v0

    sget-object v1, LN/e;->E:LN/e;

    if-ne v0, v1, :cond_3

    invoke-virtual {v3}, LN/k$a;->c()I

    move-result v0

    invoke-virtual {v4}, LN/k$a;->c()I

    move-result v1

    if-le v0, v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v0, 0x1

    :goto_2
    new-instance v1, LN/k;

    invoke-direct {v1, v3, v4, v0}, LN/k;-><init>(LN/k$a;LN/k$a;Z)V

    invoke-static {v1, p0}, LN/r;->h(LN/k;LN/w;)LN/k;

    move-result-object v0

    :goto_3
    return-object v0
.end method

.method private static final h(LN/w;)LN/k;
    .locals 4

    .prologue
    new-instance v0, LN/k;

    invoke-interface {p0}, LN/w;->k()LN/j;

    move-result-object v1

    invoke-interface {p0}, LN/w;->k()LN/j;

    move-result-object v2

    invoke-virtual {v2}, LN/j;->g()I

    move-result v2

    invoke-virtual {v1, v2}, LN/j;->a(I)LN/k$a;

    move-result-object v1

    invoke-interface {p0}, LN/w;->h()LN/j;

    move-result-object v2

    invoke-interface {p0}, LN/w;->h()LN/j;

    move-result-object v3

    invoke-virtual {v3}, LN/j;->e()I

    move-result v3

    invoke-virtual {v2, v3}, LN/j;->a(I)LN/k$a;

    move-result-object v2

    invoke-interface {p0}, LN/w;->i()LN/e;

    move-result-object p0

    sget-object v3, LN/e;->C:LN/e;

    if-ne p0, v3, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-direct {v0, v1, v2, p0}, LN/k;-><init>(LN/k$a;LN/k$a;Z)V

    return-object v0
.end method

.method private static final i(LN/w;)LN/k;
    .locals 1

    sget-object v0, LN/q$a$a;->a:LN/q$a$a;

    invoke-static {p0, v0}, LN/r;->a(LN/w;LN/c;)LN/k;

    move-result-object p0

    return-object p0
.end method

.method private static final j(LN/w;)LN/k;
    .locals 1

    sget-object v0, LN/q$a$b;->a:LN/q$a$b;

    invoke-static {p0, v0}, LN/r;->a(LN/w;LN/c;)LN/k;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final k()LN/q;
    .locals 1

    sget-object v0, LN/q$a;->f:LN/q;

    return-object v0
.end method

.method public final l()LN/q;
    .locals 1

    sget-object v0, LN/q$a;->b:LN/q;

    return-object v0
.end method

.method public final m()LN/q;
    .locals 1

    sget-object v0, LN/q$a;->e:LN/q;

    return-object v0
.end method

.method public final n()LN/q;
    .locals 1

    sget-object v0, LN/q$a;->d:LN/q;

    return-object v0
.end method
