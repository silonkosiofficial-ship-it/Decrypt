.class public Lk5/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final g:Ljava/util/Map;

.field static final h:Ljava/lang/String;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lk5/H;

.field private final c:Lk5/a;

.field private final d:Lt5/d;

.field private final e:Ls5/j;

.field private final f:Lh5/j;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lk5/y;->g:Ljava/util/Map;

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "armeabi"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "armeabi-v7a"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "arm64-v8a"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "x86"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "x86_64"

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "19.3.0"

    aput-object v3, v2, v1

    const-string v1, "Crashlytics Android SDK/%s"

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lk5/y;->h:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lk5/H;Lk5/a;Lt5/d;Ls5/j;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lh5/j;->a:Lh5/j;

    iput-object v0, p0, Lk5/y;->f:Lh5/j;

    iput-object p1, p0, Lk5/y;->a:Landroid/content/Context;

    iput-object p2, p0, Lk5/y;->b:Lk5/H;

    iput-object p3, p0, Lk5/y;->c:Lk5/a;

    iput-object p4, p0, Lk5/y;->d:Lt5/d;

    iput-object p5, p0, Lk5/y;->e:Ls5/j;

    return-void
.end method

.method private A(Ln5/F$a;)Ln5/F$e$d$a$c;
    .locals 3

    iget-object v0, p0, Lk5/y;->f:Lh5/j;

    invoke-virtual {p1}, Ln5/F$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ln5/F$a;->d()I

    move-result v2

    invoke-virtual {p1}, Ln5/F$a;->c()I

    move-result p1

    invoke-virtual {v0, v1, v2, p1}, Lh5/j;->a(Ljava/lang/String;II)Ln5/F$e$d$a$c;

    move-result-object p1

    return-object p1
.end method

.method private a(Ln5/F$a;)Ln5/F$a;
    .locals 5

    .prologue
    iget-object v0, p0, Lk5/y;->e:Ls5/j;

    invoke-interface {v0}, Ls5/j;->b()Ls5/d;

    move-result-object v0

    iget-object v0, v0, Ls5/d;->b:Ls5/d$a;

    iget-boolean v0, v0, Ls5/d$a;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lk5/y;->c:Lk5/a;

    iget-object v0, v0, Lk5/a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lk5/y;->c:Lk5/a;

    iget-object v1, v1, Lk5/a;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk5/f;

    invoke-static {}, Ln5/F$a$a;->a()Ln5/F$a$a$a;

    move-result-object v3

    invoke-virtual {v2}, Lk5/f;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln5/F$a$a$a;->d(Ljava/lang/String;)Ln5/F$a$a$a;

    move-result-object v3

    invoke-virtual {v2}, Lk5/f;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln5/F$a$a$a;->b(Ljava/lang/String;)Ln5/F$a$a$a;

    move-result-object v3

    invoke-virtual {v2}, Lk5/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ln5/F$a$a$a;->c(Ljava/lang/String;)Ln5/F$a$a$a;

    move-result-object v2

    invoke-virtual {v2}, Ln5/F$a$a$a;->a()Ln5/F$a$a;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-static {}, Ln5/F$a;->a()Ln5/F$a$b;

    move-result-object v1

    invoke-virtual {p1}, Ln5/F$a;->c()I

    move-result v2

    invoke-virtual {v1, v2}, Ln5/F$a$b;->c(I)Ln5/F$a$b;

    move-result-object v1

    invoke-virtual {p1}, Ln5/F$a;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln5/F$a$b;->e(Ljava/lang/String;)Ln5/F$a$b;

    move-result-object v1

    invoke-virtual {p1}, Ln5/F$a;->g()I

    move-result v2

    invoke-virtual {v1, v2}, Ln5/F$a$b;->g(I)Ln5/F$a$b;

    move-result-object v1

    invoke-virtual {p1}, Ln5/F$a;->i()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ln5/F$a$b;->i(J)Ln5/F$a$b;

    move-result-object v1

    invoke-virtual {p1}, Ln5/F$a;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Ln5/F$a$b;->d(I)Ln5/F$a$b;

    move-result-object v1

    invoke-virtual {p1}, Ln5/F$a;->f()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ln5/F$a$b;->f(J)Ln5/F$a$b;

    move-result-object v1

    invoke-virtual {p1}, Ln5/F$a;->h()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ln5/F$a$b;->h(J)Ln5/F$a$b;

    move-result-object v1

    invoke-virtual {p1}, Ln5/F$a;->j()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ln5/F$a$b;->j(Ljava/lang/String;)Ln5/F$a$b;

    move-result-object p1

    invoke-virtual {p1, v0}, Ln5/F$a$b;->b(Ljava/util/List;)Ln5/F$a$b;

    move-result-object p1

    invoke-virtual {p1}, Ln5/F$a$b;->a()Ln5/F$a;

    move-result-object p1

    return-object p1
.end method

.method private b()Ln5/F$b;
    .locals 2

    invoke-static {}, Ln5/F;->b()Ln5/F$b;

    move-result-object v0

    const-string v1, "19.3.0"

    invoke-virtual {v0, v1}, Ln5/F$b;->l(Ljava/lang/String;)Ln5/F$b;

    move-result-object v0

    iget-object v1, p0, Lk5/y;->c:Lk5/a;

    iget-object v1, v1, Lk5/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ln5/F$b;->h(Ljava/lang/String;)Ln5/F$b;

    move-result-object v0

    iget-object v1, p0, Lk5/y;->b:Lk5/H;

    invoke-virtual {v1}, Lk5/H;->a()Lk5/I$a;

    move-result-object v1

    invoke-virtual {v1}, Lk5/I$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln5/F$b;->i(Ljava/lang/String;)Ln5/F$b;

    move-result-object v0

    iget-object v1, p0, Lk5/y;->b:Lk5/H;

    invoke-virtual {v1}, Lk5/H;->a()Lk5/I$a;

    move-result-object v1

    invoke-virtual {v1}, Lk5/I$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln5/F$b;->g(Ljava/lang/String;)Ln5/F$b;

    move-result-object v0

    iget-object v1, p0, Lk5/y;->b:Lk5/H;

    invoke-virtual {v1}, Lk5/H;->a()Lk5/I$a;

    move-result-object v1

    invoke-virtual {v1}, Lk5/I$a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln5/F$b;->f(Ljava/lang/String;)Ln5/F$b;

    move-result-object v0

    iget-object v1, p0, Lk5/y;->c:Lk5/a;

    iget-object v1, v1, Lk5/a;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ln5/F$b;->d(Ljava/lang/String;)Ln5/F$b;

    move-result-object v0

    iget-object v1, p0, Lk5/y;->c:Lk5/a;

    iget-object v1, v1, Lk5/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ln5/F$b;->e(Ljava/lang/String;)Ln5/F$b;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ln5/F$b;->k(I)Ln5/F$b;

    move-result-object v0

    return-object v0
.end method

.method private static f(J)J
    .locals 3

    .prologue
    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    move-wide p0, v0

    :goto_0
    return-wide p0
.end method

.method private static g()I
    .locals 4

    .prologue
    sget-object v0, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x7

    if-eqz v1, :cond_0

    return v2

    :cond_0
    sget-object v1, Lk5/y;->g:Ljava/util/Map;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method private h()Ln5/F$e$d$a$b$a;
    .locals 3

    invoke-static {}, Ln5/F$e$d$a$b$a;->a()Ln5/F$e$d$a$b$a$a;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ln5/F$e$d$a$b$a$a;->b(J)Ln5/F$e$d$a$b$a$a;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Ln5/F$e$d$a$b$a$a;->d(J)Ln5/F$e$d$a$b$a$a;

    move-result-object v0

    iget-object v1, p0, Lk5/y;->c:Lk5/a;

    iget-object v1, v1, Lk5/a;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ln5/F$e$d$a$b$a$a;->c(Ljava/lang/String;)Ln5/F$e$d$a$b$a$a;

    move-result-object v0

    iget-object v1, p0, Lk5/y;->c:Lk5/a;

    iget-object v1, v1, Lk5/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ln5/F$e$d$a$b$a$a;->e(Ljava/lang/String;)Ln5/F$e$d$a$b$a$a;

    move-result-object v0

    invoke-virtual {v0}, Ln5/F$e$d$a$b$a$a;->a()Ln5/F$e$d$a$b$a;

    move-result-object v0

    return-object v0
.end method

.method private i()Ljava/util/List;
    .locals 1

    invoke-direct {p0}, Lk5/y;->h()Ln5/F$e$d$a$b$a;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private j(ILn5/F$a;)Ln5/F$e$d$a;
    .locals 2

    .prologue
    invoke-virtual {p2}, Ln5/F$a;->c()I

    move-result v0

    const/16 v1, 0x64

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {}, Ln5/F$e$d$a;->a()Ln5/F$e$d$a$a;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, Ln5/F$e$d$a$a;->c(Ljava/lang/Boolean;)Ln5/F$e$d$a$a;

    move-result-object v0

    invoke-direct {p0, p2}, Lk5/y;->A(Ln5/F$a;)Ln5/F$e$d$a$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln5/F$e$d$a$a;->d(Ln5/F$e$d$a$c;)Ln5/F$e$d$a$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Ln5/F$e$d$a$a;->h(I)Ln5/F$e$d$a$a;

    move-result-object p1

    invoke-direct {p0, p2}, Lk5/y;->o(Ln5/F$a;)Ln5/F$e$d$a$b;

    move-result-object p2

    invoke-virtual {p1, p2}, Ln5/F$e$d$a$a;->f(Ln5/F$e$d$a$b;)Ln5/F$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1}, Ln5/F$e$d$a$a;->a()Ln5/F$e$d$a;

    move-result-object p1

    return-object p1
.end method

.method private k(ILt5/e;Ljava/lang/Thread;IIZ)Ln5/F$e$d$a;
    .locals 6

    .prologue
    iget-object v0, p0, Lk5/y;->f:Lh5/j;

    iget-object v1, p0, Lk5/y;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lh5/j;->e(Landroid/content/Context;)Ln5/F$e$d$a$c;

    move-result-object v0

    invoke-virtual {v0}, Ln5/F$e$d$a$c;->b()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v0}, Ln5/F$e$d$a$c;->b()I

    move-result v1

    const/16 v2, 0x64

    if-eq v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-static {}, Ln5/F$e$d$a;->a()Ln5/F$e$d$a$a;

    move-result-object v2

    invoke-virtual {v2, v1}, Ln5/F$e$d$a$a;->c(Ljava/lang/Boolean;)Ln5/F$e$d$a$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Ln5/F$e$d$a$a;->d(Ln5/F$e$d$a$c;)Ln5/F$e$d$a$a;

    move-result-object v0

    iget-object v1, p0, Lk5/y;->f:Lh5/j;

    iget-object v2, p0, Lk5/y;->a:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lh5/j;->d(Landroid/content/Context;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln5/F$e$d$a$a;->b(Ljava/util/List;)Ln5/F$e$d$a$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Ln5/F$e$d$a$a;->h(I)Ln5/F$e$d$a$a;

    move-result-object p1

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    move v4, p5

    move v5, p6

    invoke-direct/range {v0 .. v5}, Lk5/y;->p(Lt5/e;Ljava/lang/Thread;IIZ)Ln5/F$e$d$a$b;

    move-result-object p2

    invoke-virtual {p1, p2}, Ln5/F$e$d$a$a;->f(Ln5/F$e$d$a$b;)Ln5/F$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1}, Ln5/F$e$d$a$a;->a()Ln5/F$e$d$a;

    move-result-object p1

    return-object p1
.end method

.method private l(I)Ln5/F$e$d$c;
    .locals 8

    .prologue
    iget-object v0, p0, Lk5/y;->a:Landroid/content/Context;

    invoke-static {v0}, Lk5/e;->a(Landroid/content/Context;)Lk5/e;

    move-result-object v0

    invoke-virtual {v0}, Lk5/e;->b()Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Float;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Lk5/e;->c()I

    move-result v0

    iget-object v2, p0, Lk5/y;->a:Landroid/content/Context;

    invoke-static {v2}, Lk5/i;->n(Landroid/content/Context;)Z

    move-result v2

    iget-object v3, p0, Lk5/y;->a:Landroid/content/Context;

    invoke-static {v3}, Lk5/i;->b(Landroid/content/Context;)J

    move-result-wide v3

    iget-object v5, p0, Lk5/y;->a:Landroid/content/Context;

    invoke-static {v5}, Lk5/i;->a(Landroid/content/Context;)J

    move-result-wide v5

    sub-long/2addr v3, v5

    invoke-static {v3, v4}, Lk5/y;->f(J)J

    move-result-wide v3

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lk5/i;->c(Ljava/lang/String;)J

    move-result-wide v5

    invoke-static {}, Ln5/F$e$d$c;->a()Ln5/F$e$d$c$a;

    move-result-object v7

    invoke-virtual {v7, v1}, Ln5/F$e$d$c$a;->b(Ljava/lang/Double;)Ln5/F$e$d$c$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Ln5/F$e$d$c$a;->c(I)Ln5/F$e$d$c$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Ln5/F$e$d$c$a;->f(Z)Ln5/F$e$d$c$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Ln5/F$e$d$c$a;->e(I)Ln5/F$e$d$c$a;

    move-result-object p1

    invoke-virtual {p1, v3, v4}, Ln5/F$e$d$c$a;->g(J)Ln5/F$e$d$c$a;

    move-result-object p1

    invoke-virtual {p1, v5, v6}, Ln5/F$e$d$c$a;->d(J)Ln5/F$e$d$c$a;

    move-result-object p1

    invoke-virtual {p1}, Ln5/F$e$d$c$a;->a()Ln5/F$e$d$c;

    move-result-object p1

    return-object p1
.end method

.method private m(Lt5/e;II)Ln5/F$e$d$a$b$c;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lk5/y;->n(Lt5/e;III)Ln5/F$e$d$a$b$c;

    move-result-object p1

    return-object p1
.end method

.method private n(Lt5/e;III)Ln5/F$e$d$a$b$c;
    .locals 5

    .prologue
    iget-object v0, p1, Lt5/e;->b:Ljava/lang/String;

    iget-object v1, p1, Lt5/e;->a:Ljava/lang/String;

    iget-object v2, p1, Lt5/e;->c:[Ljava/lang/StackTraceElement;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-array v2, v3, [Ljava/lang/StackTraceElement;

    :goto_0
    iget-object p1, p1, Lt5/e;->d:Lt5/e;

    if-lt p4, p3, :cond_1

    move-object v4, p1

    :goto_1
    if-eqz v4, :cond_1

    iget-object v4, v4, Lt5/e;->d:Lt5/e;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-static {}, Ln5/F$e$d$a$b$c;->a()Ln5/F$e$d$a$b$c$a;

    move-result-object v4

    invoke-virtual {v4, v0}, Ln5/F$e$d$a$b$c$a;->f(Ljava/lang/String;)Ln5/F$e$d$a$b$c$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Ln5/F$e$d$a$b$c$a;->e(Ljava/lang/String;)Ln5/F$e$d$a$b$c$a;

    move-result-object v0

    invoke-direct {p0, v2, p2}, Lk5/y;->r([Ljava/lang/StackTraceElement;I)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln5/F$e$d$a$b$c$a;->c(Ljava/util/List;)Ln5/F$e$d$a$b$c$a;

    move-result-object v0

    invoke-virtual {v0, v3}, Ln5/F$e$d$a$b$c$a;->d(I)Ln5/F$e$d$a$b$c$a;

    move-result-object v0

    if-eqz p1, :cond_2

    if-nez v3, :cond_2

    add-int/lit8 p4, p4, 0x1

    invoke-direct {p0, p1, p2, p3, p4}, Lk5/y;->n(Lt5/e;III)Ln5/F$e$d$a$b$c;

    move-result-object p1

    invoke-virtual {v0, p1}, Ln5/F$e$d$a$b$c$a;->b(Ln5/F$e$d$a$b$c;)Ln5/F$e$d$a$b$c$a;

    :cond_2
    invoke-virtual {v0}, Ln5/F$e$d$a$b$c$a;->a()Ln5/F$e$d$a$b$c;

    move-result-object p1

    return-object p1
.end method

.method private o(Ln5/F$a;)Ln5/F$e$d$a$b;
    .locals 1

    invoke-static {}, Ln5/F$e$d$a$b;->a()Ln5/F$e$d$a$b$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ln5/F$e$d$a$b$b;->b(Ln5/F$a;)Ln5/F$e$d$a$b$b;

    move-result-object p1

    invoke-direct {p0}, Lk5/y;->w()Ln5/F$e$d$a$b$d;

    move-result-object v0

    invoke-virtual {p1, v0}, Ln5/F$e$d$a$b$b;->e(Ln5/F$e$d$a$b$d;)Ln5/F$e$d$a$b$b;

    move-result-object p1

    invoke-direct {p0}, Lk5/y;->i()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ln5/F$e$d$a$b$b;->c(Ljava/util/List;)Ln5/F$e$d$a$b$b;

    move-result-object p1

    invoke-virtual {p1}, Ln5/F$e$d$a$b$b;->a()Ln5/F$e$d$a$b;

    move-result-object p1

    return-object p1
.end method

.method private p(Lt5/e;Ljava/lang/Thread;IIZ)Ln5/F$e$d$a$b;
    .locals 1

    invoke-static {}, Ln5/F$e$d$a$b;->a()Ln5/F$e$d$a$b$b;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, p5}, Lk5/y;->z(Lt5/e;Ljava/lang/Thread;IZ)Ljava/util/List;

    move-result-object p2

    invoke-virtual {v0, p2}, Ln5/F$e$d$a$b$b;->f(Ljava/util/List;)Ln5/F$e$d$a$b$b;

    move-result-object p2

    invoke-direct {p0, p1, p3, p4}, Lk5/y;->m(Lt5/e;II)Ln5/F$e$d$a$b$c;

    move-result-object p1

    invoke-virtual {p2, p1}, Ln5/F$e$d$a$b$b;->d(Ln5/F$e$d$a$b$c;)Ln5/F$e$d$a$b$b;

    move-result-object p1

    invoke-direct {p0}, Lk5/y;->w()Ln5/F$e$d$a$b$d;

    move-result-object p2

    invoke-virtual {p1, p2}, Ln5/F$e$d$a$b$b;->e(Ln5/F$e$d$a$b$d;)Ln5/F$e$d$a$b$b;

    move-result-object p1

    invoke-direct {p0}, Lk5/y;->i()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Ln5/F$e$d$a$b$b;->c(Ljava/util/List;)Ln5/F$e$d$a$b$b;

    move-result-object p1

    invoke-virtual {p1}, Ln5/F$e$d$a$b$b;->a()Ln5/F$e$d$a$b;

    move-result-object p1

    return-object p1
.end method

.method private q(Ljava/lang/StackTraceElement;Ln5/F$e$d$a$b$e$b$a;)Ln5/F$e$d$a$b$e$b;
    .locals 7

    .prologue
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v0

    int-to-long v3, v0

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    goto :goto_0

    :cond_0
    move-wide v3, v1

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "."

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v6

    if-lez v6, :cond_1

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result p1

    int-to-long v1, p1

    :cond_1
    invoke-virtual {p2, v3, v4}, Ln5/F$e$d$a$b$e$b$a;->e(J)Ln5/F$e$d$a$b$e$b$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Ln5/F$e$d$a$b$e$b$a;->f(Ljava/lang/String;)Ln5/F$e$d$a$b$e$b$a;

    move-result-object p1

    invoke-virtual {p1, v5}, Ln5/F$e$d$a$b$e$b$a;->b(Ljava/lang/String;)Ln5/F$e$d$a$b$e$b$a;

    move-result-object p1

    invoke-virtual {p1, v1, v2}, Ln5/F$e$d$a$b$e$b$a;->d(J)Ln5/F$e$d$a$b$e$b$a;

    move-result-object p1

    invoke-virtual {p1}, Ln5/F$e$d$a$b$e$b$a;->a()Ln5/F$e$d$a$b$e$b;

    move-result-object p1

    return-object p1
.end method

.method private r([Ljava/lang/StackTraceElement;I)Ljava/util/List;
    .locals 5

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    invoke-static {}, Ln5/F$e$d$a$b$e$b;->a()Ln5/F$e$d$a$b$e$b$a;

    move-result-object v4

    invoke-virtual {v4, p2}, Ln5/F$e$d$a$b$e$b$a;->c(I)Ln5/F$e$d$a$b$e$b$a;

    move-result-object v4

    invoke-direct {p0, v3, v4}, Lk5/y;->q(Ljava/lang/StackTraceElement;Ln5/F$e$d$a$b$e$b$a;)Ln5/F$e$d$a$b$e$b;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private s()Ln5/F$e$a;
    .locals 2

    invoke-static {}, Ln5/F$e$a;->a()Ln5/F$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lk5/y;->b:Lk5/H;

    invoke-virtual {v1}, Lk5/H;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln5/F$e$a$a;->e(Ljava/lang/String;)Ln5/F$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lk5/y;->c:Lk5/a;

    iget-object v1, v1, Lk5/a;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ln5/F$e$a$a;->g(Ljava/lang/String;)Ln5/F$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lk5/y;->c:Lk5/a;

    iget-object v1, v1, Lk5/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ln5/F$e$a$a;->d(Ljava/lang/String;)Ln5/F$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lk5/y;->b:Lk5/H;

    invoke-virtual {v1}, Lk5/H;->a()Lk5/I$a;

    move-result-object v1

    invoke-virtual {v1}, Lk5/I$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln5/F$e$a$a;->f(Ljava/lang/String;)Ln5/F$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lk5/y;->c:Lk5/a;

    iget-object v1, v1, Lk5/a;->h:Lh5/f;

    invoke-virtual {v1}, Lh5/f;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln5/F$e$a$a;->b(Ljava/lang/String;)Ln5/F$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lk5/y;->c:Lk5/a;

    iget-object v1, v1, Lk5/a;->h:Lh5/f;

    invoke-virtual {v1}, Lh5/f;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln5/F$e$a$a;->c(Ljava/lang/String;)Ln5/F$e$a$a;

    move-result-object v0

    invoke-virtual {v0}, Ln5/F$e$a$a;->a()Ln5/F$e$a;

    move-result-object v0

    return-object v0
.end method

.method private t(Ljava/lang/String;J)Ln5/F$e;
    .locals 1

    invoke-static {}, Ln5/F$e;->a()Ln5/F$e$b;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Ln5/F$e$b;->m(J)Ln5/F$e$b;

    move-result-object p2

    invoke-virtual {p2, p1}, Ln5/F$e$b;->j(Ljava/lang/String;)Ln5/F$e$b;

    move-result-object p1

    sget-object p2, Lk5/y;->h:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ln5/F$e$b;->h(Ljava/lang/String;)Ln5/F$e$b;

    move-result-object p1

    invoke-direct {p0}, Lk5/y;->s()Ln5/F$e$a;

    move-result-object p2

    invoke-virtual {p1, p2}, Ln5/F$e$b;->b(Ln5/F$e$a;)Ln5/F$e$b;

    move-result-object p1

    invoke-direct {p0}, Lk5/y;->v()Ln5/F$e$e;

    move-result-object p2

    invoke-virtual {p1, p2}, Ln5/F$e$b;->l(Ln5/F$e$e;)Ln5/F$e$b;

    move-result-object p1

    invoke-direct {p0}, Lk5/y;->u()Ln5/F$e$c;

    move-result-object p2

    invoke-virtual {p1, p2}, Ln5/F$e$b;->e(Ln5/F$e$c;)Ln5/F$e$b;

    move-result-object p1

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Ln5/F$e$b;->i(I)Ln5/F$e$b;

    move-result-object p1

    invoke-virtual {p1}, Ln5/F$e$b;->a()Ln5/F$e;

    move-result-object p1

    return-object p1
.end method

.method private u()Ln5/F$e$c;
    .locals 11

    new-instance v0, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lk5/y;->g()I

    move-result v1

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v2

    iget-object v3, p0, Lk5/y;->a:Landroid/content/Context;

    invoke-static {v3}, Lk5/i;->b(Landroid/content/Context;)J

    move-result-wide v3

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCount()I

    move-result v5

    int-to-long v5, v5

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v7, v0

    mul-long/2addr v5, v7

    invoke-static {}, Lk5/i;->w()Z

    move-result v0

    invoke-static {}, Lk5/i;->l()I

    move-result v7

    sget-object v8, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v9, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-static {}, Ln5/F$e$c;->a()Ln5/F$e$c$a;

    move-result-object v10

    invoke-virtual {v10, v1}, Ln5/F$e$c$a;->b(I)Ln5/F$e$c$a;

    move-result-object v1

    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v1, v10}, Ln5/F$e$c$a;->f(Ljava/lang/String;)Ln5/F$e$c$a;

    move-result-object v1

    invoke-virtual {v1, v2}, Ln5/F$e$c$a;->c(I)Ln5/F$e$c$a;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ln5/F$e$c$a;->h(J)Ln5/F$e$c$a;

    move-result-object v1

    invoke-virtual {v1, v5, v6}, Ln5/F$e$c$a;->d(J)Ln5/F$e$c$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Ln5/F$e$c$a;->i(Z)Ln5/F$e$c$a;

    move-result-object v0

    invoke-virtual {v0, v7}, Ln5/F$e$c$a;->j(I)Ln5/F$e$c$a;

    move-result-object v0

    invoke-virtual {v0, v8}, Ln5/F$e$c$a;->e(Ljava/lang/String;)Ln5/F$e$c$a;

    move-result-object v0

    invoke-virtual {v0, v9}, Ln5/F$e$c$a;->g(Ljava/lang/String;)Ln5/F$e$c$a;

    move-result-object v0

    invoke-virtual {v0}, Ln5/F$e$c$a;->a()Ln5/F$e$c;

    move-result-object v0

    return-object v0
.end method

.method private v()Ln5/F$e$e;
    .locals 2

    invoke-static {}, Ln5/F$e$e;->a()Ln5/F$e$e$a;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ln5/F$e$e$a;->d(I)Ln5/F$e$e$a;

    move-result-object v0

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ln5/F$e$e$a;->e(Ljava/lang/String;)Ln5/F$e$e$a;

    move-result-object v0

    sget-object v1, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ln5/F$e$e$a;->b(Ljava/lang/String;)Ln5/F$e$e$a;

    move-result-object v0

    invoke-static {}, Lk5/i;->x()Z

    move-result v1

    invoke-virtual {v0, v1}, Ln5/F$e$e$a;->c(Z)Ln5/F$e$e$a;

    move-result-object v0

    invoke-virtual {v0}, Ln5/F$e$e$a;->a()Ln5/F$e$e;

    move-result-object v0

    return-object v0
.end method

.method private w()Ln5/F$e$d$a$b$d;
    .locals 3

    invoke-static {}, Ln5/F$e$d$a$b$d;->a()Ln5/F$e$d$a$b$d$a;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ln5/F$e$d$a$b$d$a;->d(Ljava/lang/String;)Ln5/F$e$d$a$b$d$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Ln5/F$e$d$a$b$d$a;->c(Ljava/lang/String;)Ln5/F$e$d$a$b$d$a;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ln5/F$e$d$a$b$d$a;->b(J)Ln5/F$e$d$a$b$d$a;

    move-result-object v0

    invoke-virtual {v0}, Ln5/F$e$d$a$b$d$a;->a()Ln5/F$e$d$a$b$d;

    move-result-object v0

    return-object v0
.end method

.method private x(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;)Ln5/F$e$d$a$b$e;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lk5/y;->y(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;I)Ln5/F$e$d$a$b$e;

    move-result-object p1

    return-object p1
.end method

.method private y(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;I)Ln5/F$e$d$a$b$e;
    .locals 1

    invoke-static {}, Ln5/F$e$d$a$b$e;->a()Ln5/F$e$d$a$b$e$a;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ln5/F$e$d$a$b$e$a;->d(Ljava/lang/String;)Ln5/F$e$d$a$b$e$a;

    move-result-object p1

    invoke-virtual {p1, p3}, Ln5/F$e$d$a$b$e$a;->c(I)Ln5/F$e$d$a$b$e$a;

    move-result-object p1

    invoke-direct {p0, p2, p3}, Lk5/y;->r([Ljava/lang/StackTraceElement;I)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Ln5/F$e$d$a$b$e$a;->b(Ljava/util/List;)Ln5/F$e$d$a$b$e$a;

    move-result-object p1

    invoke-virtual {p1}, Ln5/F$e$d$a$b$e$a;->a()Ln5/F$e$d$a$b$e;

    move-result-object p1

    return-object p1
.end method

.method private z(Lt5/e;Ljava/lang/Thread;IZ)Ljava/util/List;
    .locals 2

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object p1, p1, Lt5/e;->c:[Ljava/lang/StackTraceElement;

    invoke-direct {p0, p2, p1, p3}, Lk5/y;->y(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;I)Ln5/F$e$d$a$b$e;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p4, :cond_1

    invoke-static {}, Ljava/lang/Thread;->getAllStackTraces()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Thread;

    invoke-virtual {p4, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lk5/y;->d:Lt5/d;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ljava/lang/StackTraceElement;

    invoke-interface {v1, p3}, Lt5/d;->a([Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;

    move-result-object p3

    invoke-direct {p0, p4, p3}, Lk5/y;->x(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;)Ln5/F$e$d$a$b$e;

    move-result-object p3

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public c(Ln5/F$a;)Ln5/F$e$d;
    .locals 4

    iget-object v0, p0, Lk5/y;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    invoke-static {}, Ln5/F$e$d;->a()Ln5/F$e$d$b;

    move-result-object v1

    const-string v2, "anr"

    invoke-virtual {v1, v2}, Ln5/F$e$d$b;->g(Ljava/lang/String;)Ln5/F$e$d$b;

    move-result-object v1

    invoke-virtual {p1}, Ln5/F$a;->i()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ln5/F$e$d$b;->f(J)Ln5/F$e$d$b;

    move-result-object v1

    invoke-direct {p0, p1}, Lk5/y;->a(Ln5/F$a;)Ln5/F$a;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lk5/y;->j(ILn5/F$a;)Ln5/F$e$d$a;

    move-result-object p1

    invoke-virtual {v1, p1}, Ln5/F$e$d$b;->b(Ln5/F$e$d$a;)Ln5/F$e$d$b;

    move-result-object p1

    invoke-direct {p0, v0}, Lk5/y;->l(I)Ln5/F$e$d$c;

    move-result-object v0

    invoke-virtual {p1, v0}, Ln5/F$e$d$b;->c(Ln5/F$e$d$c;)Ln5/F$e$d$b;

    move-result-object p1

    invoke-virtual {p1}, Ln5/F$e$d$b;->a()Ln5/F$e$d;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;JIIZ)Ln5/F$e$d;
    .locals 10

    move-object v7, p0

    iget-object v0, v7, Lk5/y;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v8, v0, Landroid/content/res/Configuration;->orientation:I

    iget-object v0, v7, Lk5/y;->d:Lt5/d;

    move-object v1, p1

    invoke-static {p1, v0}, Lt5/e;->a(Ljava/lang/Throwable;Lt5/d;)Lt5/e;

    move-result-object v2

    invoke-static {}, Ln5/F$e$d;->a()Ln5/F$e$d$b;

    move-result-object v0

    move-object v1, p3

    invoke-virtual {v0, p3}, Ln5/F$e$d$b;->g(Ljava/lang/String;)Ln5/F$e$d$b;

    move-result-object v0

    move-wide v3, p4

    invoke-virtual {v0, p4, p5}, Ln5/F$e$d$b;->f(J)Ln5/F$e$d$b;

    move-result-object v9

    move-object v0, p0

    move v1, v8

    move-object v3, p2

    move/from16 v4, p6

    move/from16 v5, p7

    move/from16 v6, p8

    invoke-direct/range {v0 .. v6}, Lk5/y;->k(ILt5/e;Ljava/lang/Thread;IIZ)Ln5/F$e$d$a;

    move-result-object v0

    invoke-virtual {v9, v0}, Ln5/F$e$d$b;->b(Ln5/F$e$d$a;)Ln5/F$e$d$b;

    move-result-object v0

    invoke-direct {p0, v8}, Lk5/y;->l(I)Ln5/F$e$d$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln5/F$e$d$b;->c(Ln5/F$e$d$c;)Ln5/F$e$d$b;

    move-result-object v0

    invoke-virtual {v0}, Ln5/F$e$d$b;->a()Ln5/F$e$d;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;J)Ln5/F;
    .locals 1

    invoke-direct {p0}, Lk5/y;->b()Ln5/F$b;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3}, Lk5/y;->t(Ljava/lang/String;J)Ln5/F$e;

    move-result-object p1

    invoke-virtual {v0, p1}, Ln5/F$b;->m(Ln5/F$e;)Ln5/F$b;

    move-result-object p1

    invoke-virtual {p1}, Ln5/F$b;->a()Ln5/F;

    move-result-object p1

    return-object p1
.end method
