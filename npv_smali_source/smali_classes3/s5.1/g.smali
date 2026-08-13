.class public Ls5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls5/j;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ls5/k;

.field private final c:Ls5/h;

.field private final d:Lk5/B;

.field private final e:Ls5/a;

.field private final f:Ls5/l;

.field private final g:Lk5/C;

.field private final h:Ljava/util/concurrent/atomic/AtomicReference;

.field private final i:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method constructor <init>(Landroid/content/Context;Ls5/k;Lk5/B;Ls5/h;Ls5/a;Ls5/l;Lk5/C;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ls5/g;->h:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v2, Ll4/m;

    invoke-direct {v2}, Ll4/m;-><init>()V

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Ls5/g;->i:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p1, p0, Ls5/g;->a:Landroid/content/Context;

    iput-object p2, p0, Ls5/g;->b:Ls5/k;

    iput-object p3, p0, Ls5/g;->d:Lk5/B;

    iput-object p4, p0, Ls5/g;->c:Ls5/h;

    iput-object p5, p0, Ls5/g;->e:Ls5/a;

    iput-object p6, p0, Ls5/g;->f:Ls5/l;

    iput-object p7, p0, Ls5/g;->g:Lk5/C;

    invoke-static {p3}, Ls5/b;->b(Lk5/B;)Ls5/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic c(Ls5/g;)Ls5/h;
    .locals 0

    iget-object p0, p0, Ls5/g;->c:Ls5/h;

    return-object p0
.end method

.method static synthetic d(Ls5/g;)Ls5/a;
    .locals 0

    iget-object p0, p0, Ls5/g;->e:Ls5/a;

    return-object p0
.end method

.method static synthetic e(Ls5/g;Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls5/g;->q(Lorg/json/JSONObject;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic f(Ls5/g;)Ls5/k;
    .locals 0

    iget-object p0, p0, Ls5/g;->b:Ls5/k;

    return-object p0
.end method

.method static synthetic g(Ls5/g;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Ls5/g;->r(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static synthetic h(Ls5/g;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, Ls5/g;->h:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method static synthetic i(Ls5/g;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, Ls5/g;->i:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method static synthetic j(Ls5/g;)Ls5/l;
    .locals 0

    iget-object p0, p0, Ls5/g;->f:Ls5/l;

    return-object p0
.end method

.method public static l(Landroid/content/Context;Ljava/lang/String;Lk5/H;Lp5/b;Ljava/lang/String;Ljava/lang/String;Lq5/g;Lk5/C;)Ls5/g;
    .locals 15

    move-object/from16 v1, p1

    invoke-virtual/range {p2 .. p2}, Lk5/H;->g()Ljava/lang/String;

    move-result-object v0

    new-instance v10, Lk5/a0;

    invoke-direct {v10}, Lk5/a0;-><init>()V

    new-instance v11, Ls5/h;

    invoke-direct {v11, v10}, Ls5/h;-><init>(Lk5/B;)V

    new-instance v12, Ls5/a;

    move-object/from16 v2, p6

    invoke-direct {v12, v2}, Ls5/a;-><init>(Lq5/g;)V

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v13, Ls5/c;

    move-object/from16 v3, p3

    invoke-direct {v13, v2, v3}, Ls5/c;-><init>(Ljava/lang/String;Lp5/b;)V

    invoke-virtual/range {p2 .. p2}, Lk5/H;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Lk5/H;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lk5/H;->j()Ljava/lang/String;

    move-result-object v4

    invoke-static {p0}, Lk5/i;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v8, p4

    move-object/from16 v7, p5

    filled-new-array {v5, v1, v7, v8}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lk5/i;->h([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0}, Lk5/D;->g(Ljava/lang/String;)Lk5/D;

    move-result-object v0

    invoke-virtual {v0}, Lk5/D;->i()I

    move-result v9

    new-instance v14, Ls5/k;

    move-object v0, v14

    move-object/from16 v5, p2

    invoke-direct/range {v0 .. v9}, Ls5/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lk5/I;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    new-instance v0, Ls5/g;

    move-object v1, v0

    move-object v2, p0

    move-object v3, v14

    move-object v4, v10

    move-object v5, v11

    move-object v6, v12

    move-object v7, v13

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Ls5/g;-><init>(Landroid/content/Context;Ls5/k;Lk5/B;Ls5/h;Ls5/a;Ls5/l;Lk5/C;)V

    return-object v0
.end method

.method private m(Ls5/e;)Ls5/d;
    .locals 5

    .prologue
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Ls5/e;->D:Ls5/e;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Ls5/g;->e:Ls5/a;

    invoke-virtual {v1}, Ls5/a;->b()Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v2, p0, Ls5/g;->c:Ls5/h;

    invoke-virtual {v2, v1}, Ls5/h;->b(Lorg/json/JSONObject;)Ls5/d;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v3, "Loaded cached settings: "

    invoke-direct {p0, v1, v3}, Ls5/g;->q(Lorg/json/JSONObject;Ljava/lang/String;)V

    iget-object v1, p0, Ls5/g;->d:Lk5/B;

    invoke-interface {v1}, Lk5/B;->a()J

    move-result-wide v3

    sget-object v1, Ls5/e;->E:Ls5/e;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v2, v3, v4}, Ls5/d;->a(J)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string v1, "Cached settings have expired."

    invoke-virtual {p1, v1}, Lh5/g;->i(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    :try_start_1
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string v0, "Returning cached settings."

    invoke-virtual {p1, v0}, Lh5/g;->i(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v0, v2

    goto :goto_2

    :catch_1
    move-exception p1

    move-object v0, v2

    goto :goto_1

    :cond_2
    :try_start_2
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string v1, "Failed to parse cached settings data."

    invoke-virtual {p1, v1, v0}, Lh5/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_3
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string v1, "No cached settings data found."

    invoke-virtual {p1, v1}, Lh5/g;->b(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :goto_1
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v1

    const-string v2, "Failed to get cached settings"

    invoke-virtual {v1, v2, p1}, Lh5/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    return-object v0
.end method

.method private n()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Ls5/g;->a:Landroid/content/Context;

    invoke-static {v0}, Lk5/i;->q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "existing_instance_identifier"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private q(Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lh5/g;->b(Ljava/lang/String;)V

    return-void
.end method

.method private r(Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Ls5/g;->a:Landroid/content/Context;

    invoke-static {v0}, Lk5/i;->q(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "existing_instance_identifier"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public a()Ll4/l;
    .locals 1

    iget-object v0, p0, Ls5/g;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll4/m;

    invoke-virtual {v0}, Ll4/m;->a()Ll4/l;

    move-result-object v0

    return-object v0
.end method

.method public b()Ls5/d;
    .locals 1

    iget-object v0, p0, Ls5/g;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls5/d;

    return-object v0
.end method

.method k()Z
    .locals 2

    invoke-direct {p0}, Ls5/g;->n()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ls5/g;->b:Ls5/k;

    iget-object v1, v1, Ls5/k;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public o(Ll5/f;)Ll4/l;
    .locals 1

    sget-object v0, Ls5/e;->C:Ls5/e;

    invoke-virtual {p0, v0, p1}, Ls5/g;->p(Ls5/e;Ll5/f;)Ll4/l;

    move-result-object p1

    return-object p1
.end method

.method public p(Ls5/e;Ll5/f;)Ll4/l;
    .locals 2

    .prologue
    invoke-virtual {p0}, Ls5/g;->k()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Ls5/g;->m(Ls5/e;)Ls5/d;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls5/g;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object p2, p0, Ls5/g;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll4/m;

    invoke-virtual {p2, p1}, Ll4/m;->e(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    invoke-static {p1}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Ls5/e;->E:Ls5/e;

    invoke-direct {p0, p1}, Ls5/g;->m(Ls5/e;)Ls5/d;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Ls5/g;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v0, p0, Ls5/g;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll4/m;

    invoke-virtual {v0, p1}, Ll4/m;->e(Ljava/lang/Object;)Z

    :cond_1
    iget-object p1, p0, Ls5/g;->g:Lk5/C;

    invoke-virtual {p1}, Lk5/C;->i()Ll4/l;

    move-result-object p1

    iget-object v0, p2, Ll5/f;->a:Ll5/e;

    new-instance v1, Ls5/g$a;

    invoke-direct {v1, p0, p2}, Ls5/g$a;-><init>(Ls5/g;Ll5/f;)V

    invoke-virtual {p1, v0, v1}, Ll4/l;->p(Ljava/util/concurrent/Executor;Ll4/k;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
