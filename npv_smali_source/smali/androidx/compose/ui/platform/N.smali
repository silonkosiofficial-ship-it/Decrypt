.class final Landroidx/compose/ui/platform/N;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/compose/ui/platform/N;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/N;

    invoke-direct {v0}, Landroidx/compose/ui/platform/N;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/N;->a:Landroidx/compose/ui/platform/N;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Lz0/w;)V
    .locals 1

    .prologue
    instance-of v0, p2, Lz0/a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast p2, Lz0/a;

    invoke-virtual {p2}, Lz0/a;->a()I

    move-result p2

    invoke-static {v0, p2}, Landroidx/compose/ui/platform/K;->a(Landroid/content/Context;I)Landroid/view/PointerIcon;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const/16 v0, 0x3e8

    invoke-static {p2, v0}, Landroidx/compose/ui/platform/K;->a(Landroid/content/Context;I)Landroid/view/PointerIcon;

    move-result-object p2

    :goto_0
    invoke-static {p1}, Landroidx/compose/ui/platform/L;->a(Landroid/view/View;)Landroid/view/PointerIcon;

    move-result-object v0

    invoke-static {v0, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1, p2}, Landroidx/compose/ui/platform/M;->a(Landroid/view/View;Landroid/view/PointerIcon;)V

    :cond_1
    return-void
.end method
