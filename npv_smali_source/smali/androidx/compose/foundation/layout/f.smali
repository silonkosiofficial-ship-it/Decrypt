.class public final Landroidx/compose/foundation/layout/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA/e;


# static fields
.field public static final a:Landroidx/compose/foundation/layout/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/f;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/f;-><init>()V

    sput-object v0, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;
    .locals 4

    .prologue
    new-instance v0, Landroidx/compose/foundation/layout/BoxChildDataElement;

    sget-object v1, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v1}, Lh0/c$a;->e()Lh0/c;

    move-result-object v1

    invoke-static {}, Landroidx/compose/ui/platform/E0;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Landroidx/compose/foundation/layout/f$a;

    invoke-direct {v2}, Landroidx/compose/foundation/layout/f$a;-><init>()V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/E0;->a()Lx7/l;

    move-result-object v2

    :goto_0
    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2}, Landroidx/compose/foundation/layout/BoxChildDataElement;-><init>(Lh0/c;ZLx7/l;)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method
