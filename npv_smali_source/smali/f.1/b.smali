.class public final Lf/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lf/b;

.field private static final b:LV/O0;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf/b;

    invoke-direct {v0}, Lf/b;-><init>()V

    sput-object v0, Lf/b;->a:Lf/b;

    sget-object v0, Lf/b$a;->D:Lf/b$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, LV/y;->d(LV/u1;Lx7/a;ILjava/lang/Object;)LV/O0;

    move-result-object v0

    sput-object v0, Lf/b;->b:LV/O0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)Le/A;
    .locals 1

    .prologue
    const p2, -0x7b43639d

    invoke-interface {p1, p2}, LV/n;->f(I)V

    sget-object p2, Lf/b;->b:LV/O0;

    invoke-interface {p1, p2}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Le/A;

    const v0, 0x64249efd

    invoke-interface {p1, v0}, LV/n;->f(I)V

    if-nez p2, :cond_0

    invoke-static {}, Landroidx/compose/ui/platform/T;->i()LV/O0;

    move-result-object p2

    invoke-interface {p1, p2}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    invoke-static {p2}, Le/D;->a(Landroid/view/View;)Le/A;

    move-result-object p2

    :cond_0
    invoke-interface {p1}, LV/n;->P()V

    if-nez p2, :cond_3

    invoke-static {}, Landroidx/compose/ui/platform/T;->g()LV/O0;

    move-result-object p2

    invoke-interface {p1, p2}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    :goto_0
    instance-of v0, p2, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_2

    instance-of v0, p2, Le/A;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p2, Landroid/content/ContextWrapper;

    invoke-virtual {p2}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p2

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_1
    check-cast p2, Le/A;

    :cond_3
    invoke-interface {p1}, LV/n;->P()V

    return-object p2
.end method
