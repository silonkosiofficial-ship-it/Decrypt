.class public final enum Landroidx/compose/ui/window/t;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:Landroidx/compose/ui/window/t;

.field public static final enum D:Landroidx/compose/ui/window/t;

.field public static final enum E:Landroidx/compose/ui/window/t;

.field private static final synthetic F:[Landroidx/compose/ui/window/t;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/compose/ui/window/t;

    const-string v1, "Inherit"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/compose/ui/window/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/compose/ui/window/t;->C:Landroidx/compose/ui/window/t;

    new-instance v0, Landroidx/compose/ui/window/t;

    const-string v1, "SecureOn"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/compose/ui/window/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/compose/ui/window/t;->D:Landroidx/compose/ui/window/t;

    new-instance v0, Landroidx/compose/ui/window/t;

    const-string v1, "SecureOff"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/compose/ui/window/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/compose/ui/window/t;->E:Landroidx/compose/ui/window/t;

    invoke-static {}, Landroidx/compose/ui/window/t;->e()[Landroidx/compose/ui/window/t;

    move-result-object v0

    sput-object v0, Landroidx/compose/ui/window/t;->F:[Landroidx/compose/ui/window/t;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Landroidx/compose/ui/window/t;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Landroidx/compose/ui/window/t;

    sget-object v1, Landroidx/compose/ui/window/t;->C:Landroidx/compose/ui/window/t;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Landroidx/compose/ui/window/t;->D:Landroidx/compose/ui/window/t;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Landroidx/compose/ui/window/t;->E:Landroidx/compose/ui/window/t;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/compose/ui/window/t;
    .locals 1

    const-class v0, Landroidx/compose/ui/window/t;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/window/t;

    return-object p0
.end method

.method public static values()[Landroidx/compose/ui/window/t;
    .locals 1

    sget-object v0, Landroidx/compose/ui/window/t;->F:[Landroidx/compose/ui/window/t;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/compose/ui/window/t;

    return-object v0
.end method
