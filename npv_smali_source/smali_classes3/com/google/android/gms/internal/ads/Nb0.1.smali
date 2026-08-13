.class public final Lcom/google/android/gms/internal/ads/Nb0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Pb0;

.field private final b:Landroid/webkit/WebView;

.field private c:Lcom/google/android/gms/internal/ads/Oc0;

.field private final d:Ljava/util/HashMap;

.field private final e:Lcom/google/android/gms/internal/ads/ac0;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/Pb0;Landroid/webkit/WebView;Z)V
    .locals 1

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Nb0;->d:Ljava/util/HashMap;

    new-instance v0, Lcom/google/android/gms/internal/ads/ac0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ac0;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Nb0;->e:Lcom/google/android/gms/internal/ads/ac0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/xc0;->a()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Nb0;->a:Lcom/google/android/gms/internal/ads/Pb0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Nb0;->b:Landroid/webkit/WebView;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Nb0;->a()Landroid/view/View;

    move-result-object p1

    if-ne p1, p2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/ads/Bb0;

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/Bb0;->d(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/Oc0;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/Oc0;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Nb0;->c:Lcom/google/android/gms/internal/ads/Oc0;

    :goto_1
    const-string p1, "WEB_MESSAGE_LISTENER"

    invoke-static {p1}, LG2/f;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Nb0;->h()V

    new-instance p1, Lcom/google/android/gms/internal/ads/Lb0;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/Lb0;-><init>(Lcom/google/android/gms/internal/ads/Nb0;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Nb0;->b:Landroid/webkit/WebView;

    new-instance p3, Ljava/util/HashSet;

    const-string v0, "*"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p3, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const-string v0, "omidJsSessionService"

    invoke-static {p2, v0, p3, p1}, LG2/e;->a(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Set;LG2/e$a;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "The JavaScriptSessionService cannot be supported in this WebView version."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static b(Lcom/google/android/gms/internal/ads/Pb0;Landroid/webkit/WebView;Z)Lcom/google/android/gms/internal/ads/Nb0;
    .locals 1

    new-instance p2, Lcom/google/android/gms/internal/ads/Nb0;

    const/4 v0, 0x1

    invoke-direct {p2, p0, p1, v0}, Lcom/google/android/gms/internal/ads/Nb0;-><init>(Lcom/google/android/gms/internal/ads/Pb0;Landroid/webkit/WebView;Z)V

    return-object p2
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/Nb0;Ljava/lang/String;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Nb0;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Bb0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Bb0;->c()V

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Nb0;->d:Ljava/util/HashMap;

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method static bridge synthetic d(Lcom/google/android/gms/internal/ads/Nb0;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Nb0;->h()V

    return-void
.end method

.method static bridge synthetic e(Lcom/google/android/gms/internal/ads/Nb0;Ljava/lang/String;)V
    .locals 5

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/ads/Fb0;

    sget-object v1, Lcom/google/android/gms/internal/ads/Gb0;->D:Lcom/google/android/gms/internal/ads/Gb0;

    sget-object v2, Lcom/google/android/gms/internal/ads/Jb0;->D:Lcom/google/android/gms/internal/ads/Jb0;

    sget-object v3, Lcom/google/android/gms/internal/ads/Ob0;->E:Lcom/google/android/gms/internal/ads/Ob0;

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v3, v4}, Lcom/google/android/gms/internal/ads/Cb0;->a(Lcom/google/android/gms/internal/ads/Gb0;Lcom/google/android/gms/internal/ads/Jb0;Lcom/google/android/gms/internal/ads/Ob0;Lcom/google/android/gms/internal/ads/Ob0;Z)Lcom/google/android/gms/internal/ads/Cb0;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Nb0;->a:Lcom/google/android/gms/internal/ads/Pb0;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Nb0;->b:Landroid/webkit/WebView;

    const/4 v4, 0x0

    invoke-static {v2, v3, v4, v4}, Lcom/google/android/gms/internal/ads/Db0;->b(Lcom/google/android/gms/internal/ads/Pb0;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Db0;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/Fb0;-><init>(Lcom/google/android/gms/internal/ads/Cb0;Lcom/google/android/gms/internal/ads/Db0;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Nb0;->d:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Nb0;->a()Landroid/view/View;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Bb0;->d(Landroid/view/View;)V

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Nb0;->e:Lcom/google/android/gms/internal/ads/ac0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ac0;->a()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/Zb0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Zb0;->b()Lcom/google/android/gms/internal/ads/Oc0;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Zb0;->a()Lcom/google/android/gms/internal/ads/Ib0;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Zb0;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/Bb0;->b(Landroid/view/View;Lcom/google/android/gms/internal/ads/Ib0;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Bb0;->e()V

    return-void
.end method

.method private final h()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Nb0;->b:Landroid/webkit/WebView;

    const-string v1, "omidJsSessionService"

    invoke-static {v0, v1}, LG2/e;->i(Landroid/webkit/WebView;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method final a()Landroid/view/View;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Nb0;->c:Lcom/google/android/gms/internal/ads/Oc0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final f(Landroid/view/View;Lcom/google/android/gms/internal/ads/Ib0;Ljava/lang/String;)V
    .locals 2

    .prologue
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/Nb0;->d:Ljava/util/HashMap;

    invoke-virtual {p3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const-string v1, "Ad overlay"

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Bb0;

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/Bb0;->b(Landroid/view/View;Lcom/google/android/gms/internal/ads/Ib0;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/Nb0;->e:Lcom/google/android/gms/internal/ads/ac0;

    invoke-virtual {p3, p1, p2, v1}, Lcom/google/android/gms/internal/ads/ac0;->b(Landroid/view/View;Lcom/google/android/gms/internal/ads/Ib0;Ljava/lang/String;)V

    return-void
.end method

.method public final g(Lcom/google/android/gms/internal/ads/iu;)V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Nb0;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/Bb0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Bb0;->c()V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/Kb0;

    invoke-direct {v1, p0, p1, v0}, Lcom/google/android/gms/internal/ads/Kb0;-><init>(Lcom/google/android/gms/internal/ads/Nb0;Lcom/google/android/gms/internal/ads/iu;Ljava/util/Timer;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method
