.class public abstract Landroidx/compose/foundation/FocusableKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Landroidx/compose/ui/platform/D0;

.field private static final b:Landroidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    new-instance v0, Landroidx/compose/ui/platform/D0;

    invoke-static {}, Landroidx/compose/ui/platform/E0;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Landroidx/compose/foundation/FocusableKt$a;

    invoke-direct {v1}, Landroidx/compose/foundation/FocusableKt$a;-><init>()V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/E0;->a()Lx7/l;

    move-result-object v1

    :goto_0
    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/D0;-><init>(Lx7/l;)V

    sput-object v0, Landroidx/compose/foundation/FocusableKt;->a:Landroidx/compose/ui/platform/D0;

    new-instance v0, Landroidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1;

    invoke-direct {v0}, Landroidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1;-><init>()V

    sput-object v0, Landroidx/compose/foundation/FocusableKt;->b:Landroidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1;

    return-void
.end method

.method public static final a(Landroidx/compose/ui/d;ZLz/l;)Landroidx/compose/ui/d;
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    new-instance p1, Landroidx/compose/foundation/FocusableElement;

    invoke-direct {p1, p2}, Landroidx/compose/foundation/FocusableElement;-><init>(Lz/l;)V

    goto :goto_0

    :cond_0
    sget-object p1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    :goto_0
    invoke-interface {p0, p1}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/d;ZLz/l;ILjava/lang/Object;)Landroidx/compose/ui/d;
    .locals 0

    .prologue
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/FocusableKt;->a(Landroidx/compose/ui/d;ZLz/l;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method
