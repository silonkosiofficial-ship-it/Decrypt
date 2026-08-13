.class public LT4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT4/a;


# static fields
.field private static volatile c:LT4/a;


# instance fields
.field private final a:Lh4/a;

.field final b:Ljava/util/Map;


# direct methods
.method private constructor <init>(Lh4/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LT4/b;->a:Lh4/a;

    new-instance p1, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, LT4/b;->b:Ljava/util/Map;

    return-void
.end method

.method public static g(LQ4/f;Landroid/content/Context;LD5/d;)LT4/a;
    .locals 5

    .prologue
    invoke-static {p0}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, LT4/b;->c:LT4/a;

    if-nez v0, :cond_2

    const-class v0, LT4/b;

    monitor-enter v0

    :try_start_0
    sget-object v1, LT4/b;->c:LT4/a;

    if-nez v1, :cond_1

    new-instance v1, Landroid/os/Bundle;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Landroid/os/Bundle;-><init>(I)V

    invoke-virtual {p0}, LQ4/f;->u()Z

    move-result v2

    if-eqz v2, :cond_0

    const-class v2, LQ4/b;

    new-instance v3, LT4/c;

    invoke-direct {v3}, LT4/c;-><init>()V

    new-instance v4, LT4/d;

    invoke-direct {v4}, LT4/d;-><init>()V

    invoke-interface {p2, v2, v3, v4}, LD5/d;->a(Ljava/lang/Class;Ljava/util/concurrent/Executor;LD5/b;)V

    const-string p2, "dataCollectionDefaultEnabled"

    invoke-virtual {p0}, LQ4/f;->t()Z

    move-result p0

    invoke-virtual {v1, p2, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    new-instance p0, LT4/b;

    const/4 p2, 0x0

    invoke-static {p1, p2, p2, p2, v1}, Lcom/google/android/gms/internal/measurement/e1;->g(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/google/android/gms/internal/measurement/e1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/e1;->w()Lh4/a;

    move-result-object p1

    invoke-direct {p0, p1}, LT4/b;-><init>(Lh4/a;)V

    sput-object p0, LT4/b;->c:LT4/a;

    :cond_1
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_2
    :goto_2
    sget-object p0, LT4/b;->c:LT4/a;

    return-object p0
.end method

.method static synthetic h(LD5/a;)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method private final i(Ljava/lang/String;)Z
    .locals 1

    .prologue
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LT4/b;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LT4/b;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public a(Ljava/lang/String;LT4/a$b;)LT4/a$a;
    .locals 3

    .prologue
    invoke-static {p2}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/firebase/analytics/connector/internal/a;->j(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-direct {p0, p1}, LT4/b;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    iget-object v0, p0, LT4/b;->a:Lh4/a;

    const-string v2, "fiam"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Lcom/google/firebase/analytics/connector/internal/d;

    invoke-direct {v2, v0, p2}, Lcom/google/firebase/analytics/connector/internal/d;-><init>(Lh4/a;LT4/a$b;)V

    goto :goto_0

    :cond_2
    const-string v2, "clx"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v2, Lcom/google/firebase/analytics/connector/internal/f;

    invoke-direct {v2, v0, p2}, Lcom/google/firebase/analytics/connector/internal/f;-><init>(Lh4/a;LT4/a$b;)V

    goto :goto_0

    :cond_3
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_4

    iget-object p2, p0, LT4/b;->b:Ljava/util/Map;

    invoke-interface {p2, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, LT4/b$a;

    invoke-direct {p2, p0, p1}, LT4/b$a;-><init>(LT4/b;Ljava/lang/String;)V

    return-object p2

    :cond_4
    return-object v1
.end method

.method public b(Z)Ljava/util/Map;
    .locals 2

    iget-object v0, p0, LT4/b;->a:Lh4/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, p1}, Lh4/a;->m(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public c(LT4/a$c;)V
    .locals 1

    .prologue
    invoke-static {p1}, Lcom/google/firebase/analytics/connector/internal/a;->g(LT4/a$c;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LT4/b;->a:Lh4/a;

    invoke-static {p1}, Lcom/google/firebase/analytics/connector/internal/a;->b(LT4/a$c;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Lh4/a;->r(Landroid/os/Bundle;)V

    return-void
.end method

.method public clearConditionalUserProperty(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    if-eqz p2, :cond_0

    invoke-static {p2, p3}, Lcom/google/firebase/analytics/connector/internal/a;->e(Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LT4/b;->a:Lh4/a;

    invoke-virtual {v0, p1, p2, p3}, Lh4/a;->b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    if-nez p3, :cond_0

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    :cond_0
    invoke-static {p1}, Lcom/google/firebase/analytics/connector/internal/a;->j(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-static {p2, p3}, Lcom/google/firebase/analytics/connector/internal/a;->e(Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    invoke-static {p1, p2, p3}, Lcom/google/firebase/analytics/connector/internal/a;->h(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result v0

    if-nez v0, :cond_3

    return-void

    :cond_3
    invoke-static {p1, p2, p3}, Lcom/google/firebase/analytics/connector/internal/a;->d(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v0, p0, LT4/b;->a:Lh4/a;

    invoke-virtual {v0, p1, p2, p3}, Lh4/a;->n(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public e(Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, LT4/b;->a:Lh4/a;

    invoke-virtual {v0, p1}, Lh4/a;->l(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LT4/b;->a:Lh4/a;

    invoke-virtual {v1, p1, p2}, Lh4/a;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Bundle;

    invoke-static {p2}, Lcom/google/firebase/analytics/connector/internal/a;->a(Landroid/os/Bundle;)LT4/a$c;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method
