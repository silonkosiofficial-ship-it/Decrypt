.class public final enum Lo2/B$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo2/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum C:Lo2/B$a;

.field public static final enum D:Lo2/B$a;

.field public static final enum E:Lo2/B$a;

.field private static final synthetic F:[Lo2/B$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo2/B$a;

    const-string v1, "DEFERRED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo2/B$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo2/B$a;->C:Lo2/B$a;

    new-instance v0, Lo2/B$a;

    const-string v1, "IMMEDIATE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo2/B$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo2/B$a;->D:Lo2/B$a;

    new-instance v0, Lo2/B$a;

    const-string v1, "EXCLUSIVE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo2/B$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo2/B$a;->E:Lo2/B$a;

    invoke-static {}, Lo2/B$a;->e()[Lo2/B$a;

    move-result-object v0

    sput-object v0, Lo2/B$a;->F:[Lo2/B$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lo2/B$a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lo2/B$a;

    sget-object v1, Lo2/B$a;->C:Lo2/B$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo2/B$a;->D:Lo2/B$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo2/B$a;->E:Lo2/B$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo2/B$a;
    .locals 1

    const-class v0, Lo2/B$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo2/B$a;

    return-object p0
.end method

.method public static values()[Lo2/B$a;
    .locals 1

    sget-object v0, Lo2/B$a;->F:[Lo2/B$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo2/B$a;

    return-object v0
.end method
