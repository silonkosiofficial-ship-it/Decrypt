.class public final enum LZ8/G;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:LZ8/G;

.field public static final enum D:LZ8/G;

.field public static final enum E:LZ8/G;

.field private static final synthetic F:[LZ8/G;

.field private static final synthetic G:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LZ8/G;

    const-string v1, "START"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LZ8/G;-><init>(Ljava/lang/String;I)V

    sput-object v0, LZ8/G;->C:LZ8/G;

    new-instance v0, LZ8/G;

    const-string v1, "STOP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LZ8/G;-><init>(Ljava/lang/String;I)V

    sput-object v0, LZ8/G;->D:LZ8/G;

    new-instance v0, LZ8/G;

    const-string v1, "STOP_AND_RESET_REPLAY_CACHE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LZ8/G;-><init>(Ljava/lang/String;I)V

    sput-object v0, LZ8/G;->E:LZ8/G;

    invoke-static {}, LZ8/G;->e()[LZ8/G;

    move-result-object v0

    sput-object v0, LZ8/G;->F:[LZ8/G;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, LZ8/G;->G:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LZ8/G;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LZ8/G;

    sget-object v1, LZ8/G;->C:LZ8/G;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LZ8/G;->D:LZ8/G;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LZ8/G;->E:LZ8/G;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LZ8/G;
    .locals 1

    const-class v0, LZ8/G;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LZ8/G;

    return-object p0
.end method

.method public static values()[LZ8/G;
    .locals 1

    sget-object v0, LZ8/G;->F:[LZ8/G;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LZ8/G;

    return-object v0
.end method
