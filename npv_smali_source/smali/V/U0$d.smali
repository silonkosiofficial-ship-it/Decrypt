.class public final enum LV/U0$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV/U0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation


# static fields
.field public static final enum C:LV/U0$d;

.field public static final enum D:LV/U0$d;

.field public static final enum E:LV/U0$d;

.field public static final enum F:LV/U0$d;

.field public static final enum G:LV/U0$d;

.field public static final enum H:LV/U0$d;

.field private static final synthetic I:[LV/U0$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LV/U0$d;

    const-string v1, "ShutDown"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LV/U0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LV/U0$d;->C:LV/U0$d;

    new-instance v0, LV/U0$d;

    const-string v1, "ShuttingDown"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LV/U0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LV/U0$d;->D:LV/U0$d;

    new-instance v0, LV/U0$d;

    const-string v1, "Inactive"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LV/U0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LV/U0$d;->E:LV/U0$d;

    new-instance v0, LV/U0$d;

    const-string v1, "InactivePendingWork"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LV/U0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LV/U0$d;->F:LV/U0$d;

    new-instance v0, LV/U0$d;

    const-string v1, "Idle"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LV/U0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LV/U0$d;->G:LV/U0$d;

    new-instance v0, LV/U0$d;

    const-string v1, "PendingWork"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LV/U0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LV/U0$d;->H:LV/U0$d;

    invoke-static {}, LV/U0$d;->e()[LV/U0$d;

    move-result-object v0

    sput-object v0, LV/U0$d;->I:[LV/U0$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LV/U0$d;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [LV/U0$d;

    sget-object v1, LV/U0$d;->C:LV/U0$d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LV/U0$d;->D:LV/U0$d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LV/U0$d;->E:LV/U0$d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LV/U0$d;->F:LV/U0$d;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, LV/U0$d;->G:LV/U0$d;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, LV/U0$d;->H:LV/U0$d;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LV/U0$d;
    .locals 1

    const-class v0, LV/U0$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LV/U0$d;

    return-object p0
.end method

.method public static values()[LV/U0$d;
    .locals 1

    sget-object v0, LV/U0$d;->I:[LV/U0$d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LV/U0$d;

    return-object v0
.end method
