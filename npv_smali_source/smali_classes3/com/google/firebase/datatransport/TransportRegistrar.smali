.class public Lcom/google/firebase/datatransport/TransportRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "fire-transport"

    sput-object v0, Lcom/google/firebase/datatransport/TransportRegistrar;->LIBRARY_NAME:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Le5/e;)LW2/i;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$2(Le5/e;)LW2/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Le5/e;)LW2/i;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$1(Le5/e;)LW2/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Le5/e;)LW2/i;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$0(Le5/e;)LW2/i;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Le5/e;)LW2/i;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Le5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, LY2/u;->f(Landroid/content/Context;)V

    invoke-static {}, LY2/u;->c()LY2/u;

    move-result-object p0

    sget-object v0, Lcom/google/android/datatransport/cct/a;->h:Lcom/google/android/datatransport/cct/a;

    invoke-virtual {p0, v0}, LY2/u;->g(LY2/f;)LW2/i;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$1(Le5/e;)LW2/i;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Le5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, LY2/u;->f(Landroid/content/Context;)V

    invoke-static {}, LY2/u;->c()LY2/u;

    move-result-object p0

    sget-object v0, Lcom/google/android/datatransport/cct/a;->h:Lcom/google/android/datatransport/cct/a;

    invoke-virtual {p0, v0}, LY2/u;->g(LY2/f;)LW2/i;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$2(Le5/e;)LW2/i;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Le5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, LY2/u;->f(Landroid/content/Context;)V

    invoke-static {}, LY2/u;->c()LY2/u;

    move-result-object p0

    sget-object v0, Lcom/google/android/datatransport/cct/a;->g:Lcom/google/android/datatransport/cct/a;

    invoke-virtual {p0, v0}, LY2/u;->g(LY2/f;)LW2/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le5/c;",
            ">;"
        }
    .end annotation

    const-class v0, LW2/i;

    invoke-static {v0}, Le5/c;->e(Ljava/lang/Class;)Le5/c$b;

    move-result-object v1

    const-string v2, "fire-transport"

    invoke-virtual {v1, v2}, Le5/c$b;->h(Ljava/lang/String;)Le5/c$b;

    move-result-object v1

    const-class v3, Landroid/content/Context;

    invoke-static {v3}, Le5/r;->j(Ljava/lang/Class;)Le5/r;

    move-result-object v4

    invoke-virtual {v1, v4}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v1

    new-instance v4, Lx5/c;

    invoke-direct {v4}, Lx5/c;-><init>()V

    invoke-virtual {v1, v4}, Le5/c$b;->f(Le5/h;)Le5/c$b;

    move-result-object v1

    invoke-virtual {v1}, Le5/c$b;->d()Le5/c;

    move-result-object v1

    const-class v4, Lx5/a;

    invoke-static {v4, v0}, Le5/F;->a(Ljava/lang/Class;Ljava/lang/Class;)Le5/F;

    move-result-object v4

    invoke-static {v4}, Le5/c;->c(Le5/F;)Le5/c$b;

    move-result-object v4

    invoke-static {v3}, Le5/r;->j(Ljava/lang/Class;)Le5/r;

    move-result-object v5

    invoke-virtual {v4, v5}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v4

    new-instance v5, Lx5/d;

    invoke-direct {v5}, Lx5/d;-><init>()V

    invoke-virtual {v4, v5}, Le5/c$b;->f(Le5/h;)Le5/c$b;

    move-result-object v4

    invoke-virtual {v4}, Le5/c$b;->d()Le5/c;

    move-result-object v4

    const-class v5, Lx5/b;

    invoke-static {v5, v0}, Le5/F;->a(Ljava/lang/Class;Ljava/lang/Class;)Le5/F;

    move-result-object v0

    invoke-static {v0}, Le5/c;->c(Le5/F;)Le5/c$b;

    move-result-object v0

    invoke-static {v3}, Le5/r;->j(Ljava/lang/Class;)Le5/r;

    move-result-object v3

    invoke-virtual {v0, v3}, Le5/c$b;->b(Le5/r;)Le5/c$b;

    move-result-object v0

    new-instance v3, Lx5/e;

    invoke-direct {v3}, Lx5/e;-><init>()V

    invoke-virtual {v0, v3}, Le5/c$b;->f(Le5/h;)Le5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Le5/c$b;->d()Le5/c;

    move-result-object v0

    const-string v3, "19.0.0"

    invoke-static {v2, v3}, LM5/h;->b(Ljava/lang/String;Ljava/lang/String;)Le5/c;

    move-result-object v2

    const/4 v3, 0x4

    new-array v3, v3, [Le5/c;

    const/4 v5, 0x0

    aput-object v1, v3, v5

    const/4 v1, 0x1

    aput-object v4, v3, v1

    const/4 v1, 0x2

    aput-object v0, v3, v1

    const/4 v0, 0x3

    aput-object v2, v3, v0

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
