.class public Lcom/google/firebase/remoteconfig/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final n:[B


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LQ4/f;

.field private final c:LR4/c;

.field private final d:Ljava/util/concurrent/Executor;

.field private final e:Lcom/google/firebase/remoteconfig/internal/f;

.field private final f:Lcom/google/firebase/remoteconfig/internal/f;

.field private final g:Lcom/google/firebase/remoteconfig/internal/f;

.field private final h:Lcom/google/firebase/remoteconfig/internal/m;

.field private final i:Lcom/google/firebase/remoteconfig/internal/o;

.field private final j:Lcom/google/firebase/remoteconfig/internal/p;

.field private final k:LG5/e;

.field private final l:Lcom/google/firebase/remoteconfig/internal/q;

.field private final m:LO5/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/google/firebase/remoteconfig/a;->n:[B

    return-void
.end method

.method constructor <init>(Landroid/content/Context;LQ4/f;LG5/e;LR4/c;Ljava/util/concurrent/Executor;Lcom/google/firebase/remoteconfig/internal/f;Lcom/google/firebase/remoteconfig/internal/f;Lcom/google/firebase/remoteconfig/internal/f;Lcom/google/firebase/remoteconfig/internal/m;Lcom/google/firebase/remoteconfig/internal/o;Lcom/google/firebase/remoteconfig/internal/p;Lcom/google/firebase/remoteconfig/internal/q;LO5/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/a;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/firebase/remoteconfig/a;->b:LQ4/f;

    iput-object p3, p0, Lcom/google/firebase/remoteconfig/a;->k:LG5/e;

    iput-object p4, p0, Lcom/google/firebase/remoteconfig/a;->c:LR4/c;

    iput-object p5, p0, Lcom/google/firebase/remoteconfig/a;->d:Ljava/util/concurrent/Executor;

    iput-object p6, p0, Lcom/google/firebase/remoteconfig/a;->e:Lcom/google/firebase/remoteconfig/internal/f;

    iput-object p7, p0, Lcom/google/firebase/remoteconfig/a;->f:Lcom/google/firebase/remoteconfig/internal/f;

    iput-object p8, p0, Lcom/google/firebase/remoteconfig/a;->g:Lcom/google/firebase/remoteconfig/internal/f;

    iput-object p9, p0, Lcom/google/firebase/remoteconfig/a;->h:Lcom/google/firebase/remoteconfig/internal/m;

    iput-object p10, p0, Lcom/google/firebase/remoteconfig/a;->i:Lcom/google/firebase/remoteconfig/internal/o;

    iput-object p11, p0, Lcom/google/firebase/remoteconfig/a;->j:Lcom/google/firebase/remoteconfig/internal/p;

    iput-object p12, p0, Lcom/google/firebase/remoteconfig/a;->l:Lcom/google/firebase/remoteconfig/internal/q;

    iput-object p13, p0, Lcom/google/firebase/remoteconfig/a;->m:LO5/e;

    return-void
.end method

.method static B(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 7

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static synthetic a(Lcom/google/firebase/remoteconfig/a;LN5/n;)Ljava/lang/Void;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/remoteconfig/a;->t(LN5/n;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/google/firebase/remoteconfig/a;Ll4/l;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/remoteconfig/a;->v(Ll4/l;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Lcom/google/firebase/remoteconfig/internal/g;)Ll4/l;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/remoteconfig/a;->u(Lcom/google/firebase/remoteconfig/internal/g;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/google/firebase/remoteconfig/internal/m$a;)Ll4/l;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/remoteconfig/a;->r(Lcom/google/firebase/remoteconfig/internal/m$a;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/google/firebase/remoteconfig/a;Ljava/lang/Void;)Ll4/l;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/remoteconfig/a;->s(Ljava/lang/Void;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/google/firebase/remoteconfig/a;Ll4/l;Ll4/l;Ll4/l;)Ll4/l;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/firebase/remoteconfig/a;->q(Ll4/l;Ll4/l;Ll4/l;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method public static k()Lcom/google/firebase/remoteconfig/a;
    .locals 1

    invoke-static {}, LQ4/f;->l()LQ4/f;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/remoteconfig/a;->l(LQ4/f;)Lcom/google/firebase/remoteconfig/a;

    move-result-object v0

    return-object v0
.end method

.method public static l(LQ4/f;)Lcom/google/firebase/remoteconfig/a;
    .locals 1

    const-class v0, Lcom/google/firebase/remoteconfig/c;

    invoke-virtual {p0, v0}, LQ4/f;->j(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/remoteconfig/c;

    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/c;->g()Lcom/google/firebase/remoteconfig/a;

    move-result-object p0

    return-object p0
.end method

.method private static p(Lcom/google/firebase/remoteconfig/internal/g;Lcom/google/firebase/remoteconfig/internal/g;)Z
    .locals 0

    .prologue
    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/g;->h()Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p1}, Lcom/google/firebase/remoteconfig/internal/g;->h()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/Date;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private synthetic q(Ll4/l;Ll4/l;Ll4/l;)Ll4/l;
    .locals 0

    .prologue
    invoke-virtual {p1}, Ll4/l;->o()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-virtual {p1}, Ll4/l;->l()Ljava/lang/Object;

    move-result-object p3

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ll4/l;->l()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/remoteconfig/internal/g;

    invoke-virtual {p2}, Ll4/l;->o()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-virtual {p2}, Ll4/l;->l()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/firebase/remoteconfig/internal/g;

    invoke-static {p1, p2}, Lcom/google/firebase/remoteconfig/a;->p(Lcom/google/firebase/remoteconfig/internal/g;Lcom/google/firebase/remoteconfig/internal/g;)Z

    move-result p2

    if-nez p2, :cond_1

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p2, p0, Lcom/google/firebase/remoteconfig/a;->f:Lcom/google/firebase/remoteconfig/internal/f;

    invoke-virtual {p2, p1}, Lcom/google/firebase/remoteconfig/internal/f;->k(Lcom/google/firebase/remoteconfig/internal/g;)Ll4/l;

    move-result-object p1

    iget-object p2, p0, Lcom/google/firebase/remoteconfig/a;->d:Ljava/util/concurrent/Executor;

    new-instance p3, LN5/i;

    invoke-direct {p3, p0}, LN5/i;-><init>(Lcom/google/firebase/remoteconfig/a;)V

    invoke-virtual {p1, p2, p3}, Ll4/l;->h(Ljava/util/concurrent/Executor;Ll4/c;)Ll4/l;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic r(Lcom/google/firebase/remoteconfig/internal/m$a;)Ll4/l;
    .locals 0

    const/4 p0, 0x0

    invoke-static {p0}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method private synthetic s(Ljava/lang/Void;)Ll4/l;
    .locals 0

    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/a;->g()Ll4/l;

    move-result-object p1

    return-object p1
.end method

.method private synthetic t(LN5/n;)Ljava/lang/Void;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/a;->j:Lcom/google/firebase/remoteconfig/internal/p;

    invoke-virtual {v0, p1}, Lcom/google/firebase/remoteconfig/internal/p;->k(LN5/n;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private static synthetic u(Lcom/google/firebase/remoteconfig/internal/g;)Ll4/l;
    .locals 0

    const/4 p0, 0x0

    invoke-static {p0}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method private v(Ll4/l;)Z
    .locals 1

    .prologue
    invoke-virtual {p1}, Ll4/l;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/a;->e:Lcom/google/firebase/remoteconfig/internal/f;

    invoke-virtual {v0}, Lcom/google/firebase/remoteconfig/internal/f;->d()V

    invoke-virtual {p1}, Ll4/l;->l()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/remoteconfig/internal/g;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/firebase/remoteconfig/internal/g;->e()Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/firebase/remoteconfig/a;->C(Lorg/json/JSONArray;)V

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/a;->m:LO5/e;

    invoke-virtual {v0, p1}, LO5/e;->g(Lcom/google/firebase/remoteconfig/internal/g;)V

    goto :goto_0

    :cond_0
    const-string p1, "FirebaseRemoteConfig"

    const-string v0, "Activated configs written to disk are null."

    nop

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private z(Ljava/util/Map;)Ll4/l;
    .locals 2

    .prologue
    :try_start_0
    invoke-static {}, Lcom/google/firebase/remoteconfig/internal/g;->l()Lcom/google/firebase/remoteconfig/internal/g$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/firebase/remoteconfig/internal/g$b;->b(Ljava/util/Map;)Lcom/google/firebase/remoteconfig/internal/g$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/remoteconfig/internal/g$b;->a()Lcom/google/firebase/remoteconfig/internal/g;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/a;->g:Lcom/google/firebase/remoteconfig/internal/f;

    invoke-virtual {v0, p1}, Lcom/google/firebase/remoteconfig/internal/f;->k(Lcom/google/firebase/remoteconfig/internal/g;)Ll4/l;

    move-result-object p1

    invoke-static {}, Lf5/j;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, LN5/d;

    invoke-direct {v1}, LN5/d;-><init>()V

    invoke-virtual {p1, v0, v1}, Ll4/l;->p(Ljava/util/concurrent/Executor;Ll4/k;)Ll4/l;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    const-string v0, "FirebaseRemoteConfig"

    const-string v1, "The provided defaults map could not be processed."

    nop

    const/4 p1, 0x0

    invoke-static {p1}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method A()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/a;->f:Lcom/google/firebase/remoteconfig/internal/f;

    invoke-virtual {v0}, Lcom/google/firebase/remoteconfig/internal/f;->e()Ll4/l;

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/a;->g:Lcom/google/firebase/remoteconfig/internal/f;

    invoke-virtual {v0}, Lcom/google/firebase/remoteconfig/internal/f;->e()Ll4/l;

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/a;->e:Lcom/google/firebase/remoteconfig/internal/f;

    invoke-virtual {v0}, Lcom/google/firebase/remoteconfig/internal/f;->e()Ll4/l;

    return-void
.end method

.method C(Lorg/json/JSONArray;)V
    .locals 2

    .prologue
    const-string v0, "FirebaseRemoteConfig"

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/a;->c:LR4/c;

    if-nez v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/google/firebase/remoteconfig/a;->B(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/a;->c:LR4/c;

    invoke-virtual {v1, p1}, LR4/c;->m(Ljava/util/List;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch LR4/a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    const-string v1, "Could not update ABT experiments."

    nop

    goto :goto_2

    :goto_1
    const-string v1, "Could not parse ABT experiments from the JSON response."

    nop

    :goto_2
    return-void
.end method

.method public g()Ll4/l;
    .locals 5

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/a;->e:Lcom/google/firebase/remoteconfig/internal/f;

    invoke-virtual {v0}, Lcom/google/firebase/remoteconfig/internal/f;->e()Ll4/l;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/a;->f:Lcom/google/firebase/remoteconfig/internal/f;

    invoke-virtual {v1}, Lcom/google/firebase/remoteconfig/internal/f;->e()Ll4/l;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ll4/l;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    invoke-static {v2}, Ll4/o;->j([Ll4/l;)Ll4/l;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/remoteconfig/a;->d:Ljava/util/concurrent/Executor;

    new-instance v4, LN5/g;

    invoke-direct {v4, p0, v0, v1}, LN5/g;-><init>(Lcom/google/firebase/remoteconfig/a;Ll4/l;Ll4/l;)V

    invoke-virtual {v2, v3, v4}, Ll4/l;->i(Ljava/util/concurrent/Executor;Ll4/c;)Ll4/l;

    move-result-object v0

    return-object v0
.end method

.method public h()Ll4/l;
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/a;->h:Lcom/google/firebase/remoteconfig/internal/m;

    invoke-virtual {v0}, Lcom/google/firebase/remoteconfig/internal/m;->i()Ll4/l;

    move-result-object v0

    invoke-static {}, Lf5/j;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, LN5/h;

    invoke-direct {v2}, LN5/h;-><init>()V

    invoke-virtual {v0, v1, v2}, Ll4/l;->p(Ljava/util/concurrent/Executor;Ll4/k;)Ll4/l;

    move-result-object v0

    return-object v0
.end method

.method public i()Ll4/l;
    .locals 3

    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/a;->h()Ll4/l;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/a;->d:Ljava/util/concurrent/Executor;

    new-instance v2, LN5/f;

    invoke-direct {v2, p0}, LN5/f;-><init>(Lcom/google/firebase/remoteconfig/a;)V

    invoke-virtual {v0, v1, v2}, Ll4/l;->p(Ljava/util/concurrent/Executor;Ll4/k;)Ll4/l;

    move-result-object v0

    return-object v0
.end method

.method public j(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/a;->i:Lcom/google/firebase/remoteconfig/internal/o;

    invoke-virtual {v0, p1}, Lcom/google/firebase/remoteconfig/internal/o;->d(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public m(Ljava/lang/String;)J
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/a;->i:Lcom/google/firebase/remoteconfig/internal/o;

    invoke-virtual {v0, p1}, Lcom/google/firebase/remoteconfig/internal/o;->f(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method n()LO5/e;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/a;->m:LO5/e;

    return-object v0
.end method

.method public o(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/a;->i:Lcom/google/firebase/remoteconfig/internal/o;

    invoke-virtual {v0, p1}, Lcom/google/firebase/remoteconfig/internal/o;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public w(LN5/n;)Ll4/l;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/a;->d:Ljava/util/concurrent/Executor;

    new-instance v1, LN5/e;

    invoke-direct {v1, p0, p1}, LN5/e;-><init>(Lcom/google/firebase/remoteconfig/a;LN5/n;)V

    invoke-static {v0, v1}, Ll4/o;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Ll4/l;

    move-result-object p1

    return-object p1
.end method

.method x(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/a;->l:Lcom/google/firebase/remoteconfig/internal/q;

    invoke-virtual {v0, p1}, Lcom/google/firebase/remoteconfig/internal/q;->b(Z)V

    return-void
.end method

.method public y(Ljava/util/Map;)Ll4/l;
    .locals 4

    .prologue
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, [B

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/String;

    check-cast v2, [B

    invoke-direct {v3, v2}, Ljava/lang/String;-><init>([B)V

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-direct {p0, v0}, Lcom/google/firebase/remoteconfig/a;->z(Ljava/util/Map;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
