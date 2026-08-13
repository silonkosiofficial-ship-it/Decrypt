.class abstract Landroidx/fragment/app/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Landroidx/fragment/app/x;

.field static final b:Landroidx/fragment/app/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/fragment/app/w;

    invoke-direct {v0}, Landroidx/fragment/app/w;-><init>()V

    sput-object v0, Landroidx/fragment/app/v;->a:Landroidx/fragment/app/x;

    invoke-static {}, Landroidx/fragment/app/v;->b()Landroidx/fragment/app/x;

    move-result-object v0

    sput-object v0, Landroidx/fragment/app/v;->b:Landroidx/fragment/app/x;

    return-void
.end method

.method static a(Landroidx/fragment/app/f;Landroidx/fragment/app/f;ZLr/a;Z)V
    .locals 0

    .prologue
    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroidx/fragment/app/f;->x()Landroidx/core/app/r;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/f;->x()Landroidx/core/app/r;

    :goto_0
    return-void
.end method

.method private static b()Landroidx/fragment/app/x;
    .locals 2

    .prologue
    const/4 v0, 0x0

    :try_start_0
    const-class v1, Landroidx/transition/e;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/x;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    return-object v0
.end method

.method static c(Lr/a;Lr/a;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Lr/Y;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    invoke-virtual {p0, v0}, Lr/Y;->k(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Lr/a;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Lr/Y;->h(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method static d(Ljava/util/ArrayList;I)V
    .locals 2

    .prologue
    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method
