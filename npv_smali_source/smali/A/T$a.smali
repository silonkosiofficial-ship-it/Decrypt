.class public final LA/T$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA/T;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LA/T$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LA/T$a;Landroidx/core/view/y0;ILjava/lang/String;)LA/a;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LA/T$a;->e(Landroidx/core/view/y0;ILjava/lang/String;)LA/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LA/T$a;Landroidx/core/view/y0;ILjava/lang/String;)LA/Q;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LA/T$a;->f(Landroidx/core/view/y0;ILjava/lang/String;)LA/Q;

    move-result-object p0

    return-object p0
.end method

.method private final d(Landroid/view/View;)LA/T;
    .locals 4

    .prologue
    invoke-static {}, LA/T;->a()Ljava/util/WeakHashMap;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-static {}, LA/T;->a()Ljava/util/WeakHashMap;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, LA/T;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p1, v3}, LA/T;-><init>(Landroidx/core/view/y0;Landroid/view/View;Ly7/k;)V

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    check-cast v2, LA/T;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v2

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method private final e(Landroidx/core/view/y0;ILjava/lang/String;)LA/a;
    .locals 1

    .prologue
    new-instance v0, LA/a;

    invoke-direct {v0, p2, p3}, LA/a;-><init>(ILjava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1, p2}, LA/a;->h(Landroidx/core/view/y0;I)V

    :cond_0
    return-object v0
.end method

.method private final f(Landroidx/core/view/y0;ILjava/lang/String;)LA/Q;
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Landroidx/core/view/y0;->g(I)Landroidx/core/graphics/f;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    sget-object p1, Landroidx/core/graphics/f;->e:Landroidx/core/graphics/f;

    :cond_1
    invoke-static {p1, p3}, LA/X;->a(Landroidx/core/graphics/f;Ljava/lang/String;)LA/Q;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final c(LV/n;I)LA/T;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)"

    const v2, -0x5173c916

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/T;->i()LV/O0;

    move-result-object p2

    invoke-interface {p1, p2}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    invoke-direct {p0, p2}, LA/T$a;->d(Landroid/view/View;)LA/T;

    move-result-object v0

    invoke-interface {p1, v0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p1, p2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_2

    :cond_1
    new-instance v2, LA/T$a$a;

    invoke-direct {v2, v0, p2}, LA/T$a$a;-><init>(LA/T;Landroid/view/View;)V

    invoke-interface {p1, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lx7/l;

    const/4 p2, 0x0

    invoke-static {v0, v2, p1, p2}, LV/Q;->b(Ljava/lang/Object;Lx7/l;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    return-object v0
.end method
