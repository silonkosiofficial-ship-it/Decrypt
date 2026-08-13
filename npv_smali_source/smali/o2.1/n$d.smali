.class public final enum Lo2/n$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo2/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation


# static fields
.field public static final enum C:Lo2/n$d;

.field public static final enum D:Lo2/n$d;

.field public static final enum E:Lo2/n$d;

.field private static final synthetic F:[Lo2/n$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo2/n$d;

    const-string v1, "AUTOMATIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo2/n$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo2/n$d;->C:Lo2/n$d;

    new-instance v0, Lo2/n$d;

    const-string v1, "TRUNCATE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo2/n$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo2/n$d;->D:Lo2/n$d;

    new-instance v0, Lo2/n$d;

    const-string v1, "WRITE_AHEAD_LOGGING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo2/n$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo2/n$d;->E:Lo2/n$d;

    invoke-static {}, Lo2/n$d;->e()[Lo2/n$d;

    move-result-object v0

    sput-object v0, Lo2/n$d;->F:[Lo2/n$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lo2/n$d;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lo2/n$d;

    sget-object v1, Lo2/n$d;->C:Lo2/n$d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo2/n$d;->D:Lo2/n$d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo2/n$d;->E:Lo2/n$d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo2/n$d;
    .locals 1

    const-class v0, Lo2/n$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo2/n$d;

    return-object p0
.end method

.method public static values()[Lo2/n$d;
    .locals 1

    sget-object v0, Lo2/n$d;->F:[Lo2/n$d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo2/n$d;

    return-object v0
.end method


# virtual methods
.method public final g(Landroid/content/Context;)Lo2/n$d;
    .locals 1

    .prologue
    const-string v0, "context"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lo2/n$d;->C:Lo2/n$d;

    if-eq p0, v0, :cond_0

    return-object p0

    :cond_0
    const-string v0, "activity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/app/ActivityManager;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/app/ActivityManager;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    move-result p1

    if-nez p1, :cond_2

    sget-object p1, Lo2/n$d;->E:Lo2/n$d;

    return-object p1

    :cond_2
    sget-object p1, Lo2/n$d;->D:Lo2/n$d;

    return-object p1
.end method
