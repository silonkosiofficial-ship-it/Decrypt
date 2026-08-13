.class public final enum Le1/i$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le1/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum C:Le1/i$b;

.field public static final enum D:Le1/i$b;

.field public static final enum E:Le1/i$b;

.field public static final enum F:Le1/i$b;

.field public static final enum G:Le1/i$b;

.field private static final synthetic H:[Le1/i$b;

.field private static final synthetic I:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Le1/i$b;

    const-string v1, "UNRESTRICTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Le1/i$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le1/i$b;->C:Le1/i$b;

    new-instance v0, Le1/i$b;

    const-string v1, "CONSTANT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Le1/i$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le1/i$b;->D:Le1/i$b;

    new-instance v0, Le1/i$b;

    const-string v1, "SLACK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Le1/i$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le1/i$b;->E:Le1/i$b;

    new-instance v0, Le1/i$b;

    const-string v1, "ERROR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Le1/i$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le1/i$b;->F:Le1/i$b;

    new-instance v0, Le1/i$b;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Le1/i$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le1/i$b;->G:Le1/i$b;

    invoke-static {}, Le1/i$b;->e()[Le1/i$b;

    move-result-object v0

    sput-object v0, Le1/i$b;->H:[Le1/i$b;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Le1/i$b;->I:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Le1/i$b;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Le1/i$b;

    sget-object v1, Le1/i$b;->C:Le1/i$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Le1/i$b;->D:Le1/i$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Le1/i$b;->E:Le1/i$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Le1/i$b;->F:Le1/i$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Le1/i$b;->G:Le1/i$b;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Le1/i$b;
    .locals 1

    const-class v0, Le1/i$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le1/i$b;

    return-object p0
.end method

.method public static values()[Le1/i$b;
    .locals 1

    sget-object v0, Le1/i$b;->H:[Le1/i$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le1/i$b;

    return-object v0
.end method
