.class public final enum Lo2/i$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo2/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum C:Lo2/i$a;

.field public static final enum D:Lo2/i$a;

.field public static final enum E:Lo2/i$a;

.field private static final synthetic F:[Lo2/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo2/i$a;

    const-string v1, "NO_OP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo2/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo2/i$a;->C:Lo2/i$a;

    new-instance v0, Lo2/i$a;

    const-string v1, "ADD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo2/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo2/i$a;->D:Lo2/i$a;

    new-instance v0, Lo2/i$a;

    const-string v1, "REMOVE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo2/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo2/i$a;->E:Lo2/i$a;

    invoke-static {}, Lo2/i$a;->e()[Lo2/i$a;

    move-result-object v0

    sput-object v0, Lo2/i$a;->F:[Lo2/i$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lo2/i$a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lo2/i$a;

    sget-object v1, Lo2/i$a;->C:Lo2/i$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo2/i$a;->D:Lo2/i$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo2/i$a;->E:Lo2/i$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo2/i$a;
    .locals 1

    const-class v0, Lo2/i$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo2/i$a;

    return-object p0
.end method

.method public static values()[Lo2/i$a;
    .locals 1

    sget-object v0, Lo2/i$a;->F:[Lo2/i$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo2/i$a;

    return-object v0
.end method
