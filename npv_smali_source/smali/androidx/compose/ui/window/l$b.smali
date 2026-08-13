.class final Landroidx/compose/ui/window/l$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/window/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Landroidx/compose/ui/window/l$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/window/l$b;

    invoke-direct {v0}, Landroidx/compose/ui/window/l$b;-><init>()V

    sput-object v0, Landroidx/compose/ui/window/l$b;->D:Landroidx/compose/ui/window/l$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/window/l;)V
    .locals 1

    .prologue
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/compose/ui/window/l;->y()V

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/window/l;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/l$b;->a(Landroidx/compose/ui/window/l;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
