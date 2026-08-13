.class public abstract LV2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:J

.field private static final b:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/16 v5, 0x10

    const/4 v6, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x3e99999a    # 0.3f

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lo0/A0;->e(FFFFLp0/c;ILjava/lang/Object;)J

    move-result-wide v0

    sput-wide v0, LV2/e;->a:J

    sget-object v0, LV2/e$a;->D:LV2/e$a;

    sput-object v0, LV2/e;->b:Lx7/l;

    return-void
.end method

.method public static final synthetic a()J
    .locals 2

    sget-wide v0, LV2/e;->a:J

    return-wide v0
.end method

.method public static final synthetic b()Lx7/l;
    .locals 1

    sget-object v0, LV2/e;->b:Lx7/l;

    return-object v0
.end method

.method private static final c(LV/n;I)Landroid/view/Window;
    .locals 3

    .prologue
    const v0, 0x3c2868d5

    invoke-interface {p0, v0}, LV/n;->f(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.google.accompanist.systemuicontroller.findWindow (SystemUiController.kt:208)"

    invoke-static {v0, p1, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/T;->i()LV/O0;

    move-result-object p1

    invoke-interface {p0, p1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of v0, p1, Landroidx/compose/ui/window/j;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Landroidx/compose/ui/window/j;

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_2

    invoke-interface {p1}, Landroidx/compose/ui/window/j;->a()Landroid/view/Window;

    move-result-object v1

    :cond_2
    if-nez v1, :cond_3

    invoke-static {}, Landroidx/compose/ui/platform/T;->i()LV/O0;

    move-result-object p1

    invoke-interface {p0, p1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "getContext(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LV2/e;->d(Landroid/content/Context;)Landroid/view/Window;

    move-result-object v1

    :cond_3
    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LV/q;->P()V

    :cond_4
    invoke-interface {p0}, LV/n;->P()V

    return-object v1
.end method

.method private static final d(Landroid/content/Context;)Landroid/view/Window;
    .locals 1

    .prologue
    :goto_0
    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/app/Activity;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    goto :goto_1

    :cond_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "getBaseContext(...)"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_1
    return-object p0
.end method

.method public static final e(Landroid/view/Window;LV/n;II)LV2/d;
    .locals 2

    .prologue
    const v0, -0x2aa96a8d

    invoke-interface {p1, v0}, LV/n;->f(I)V

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p0, 0x0

    invoke-static {p1, p0}, LV2/e;->c(LV/n;I)Landroid/view/Window;

    move-result-object p0

    :cond_0
    invoke-static {}, LV/q;->H()Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p3, -0x1

    const-string v1, "com.google.accompanist.systemuicontroller.rememberSystemUiController (SystemUiController.kt:201)"

    invoke-static {v0, p2, p3, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_1
    invoke-static {}, Landroidx/compose/ui/platform/T;->i()LV/O0;

    move-result-object p2

    invoke-interface {p1, p2}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    const p3, -0x3e472f0b

    invoke-interface {p1, p3}, LV/n;->f(I)V

    invoke-interface {p1, p2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p1, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p3, v0

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_2

    sget-object p3, LV/n;->a:LV/n$a;

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_3

    :cond_2
    new-instance v0, LV2/b;

    invoke-direct {v0, p2, p0}, LV2/b;-><init>(Landroid/view/View;Landroid/view/Window;)V

    invoke-interface {p1, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v0, LV2/b;

    invoke-interface {p1}, LV/n;->P()V

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {}, LV/q;->P()V

    :cond_4
    invoke-interface {p1}, LV/n;->P()V

    return-object v0
.end method
