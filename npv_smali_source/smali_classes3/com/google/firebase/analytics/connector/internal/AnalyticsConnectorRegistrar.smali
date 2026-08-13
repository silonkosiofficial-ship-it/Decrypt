.class public Lcom/google/firebase/analytics/connector/internal/AnalyticsConnectorRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic lambda$getComponents$0(Le5/e;)LT4/a;
    .locals 3

    const-class v0, LQ4/f;

    invoke-interface {p0, v0}, Le5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQ4/f;

    const-class v1, Landroid/content/Context;

    invoke-interface {p0, v1}, Le5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, LD5/d;

    invoke-interface {p0, v2}, Le5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LD5/d;

    invoke-static {v0, v1, p0}, LT4/b;->g(LQ4/f;Landroid/content/Context;LD5/d;)LT4/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le5/c;",
            ">;"
        }
    .end annotation

    const-class v0, LT4/a;

    invoke-static {v0}, Le5/c;->e(Ljava/lang/Class;)Le5/c$b;

    move-result-object v0

    const-class v1, LQ4/f;

    invoke-static {v1}, Le5/r;->j(Ljava/lang/Class;)Le5/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-static {v1}, Le5/r;->j(Ljava/lang/Class;)Le5/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    const-class v1, LD5/d;

    invoke-static {v1}, Le5/r;->j(Ljava/lang/Class;)Le5/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    new-instance v1, Lcom/google/firebase/analytics/connector/internal/b;

    invoke-direct {v1}, Lcom/google/firebase/analytics/connector/internal/b;-><init>()V

    invoke-virtual {v0, v1}, Le5/c$b;->f(Le5/h;)Le5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Le5/c$b;->e()Le5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Le5/c$b;->d()Le5/c;

    move-result-object v0

    const-string v1, "fire-analytics"

    const-string v2, "22.1.2"

    invoke-static {v1, v2}, LM5/h;->b(Ljava/lang/String;Ljava/lang/String;)Le5/c;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Le5/c;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
