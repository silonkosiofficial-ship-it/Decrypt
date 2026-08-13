.class public final enum LN/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:LN/e;

.field public static final enum D:LN/e;

.field public static final enum E:LN/e;

.field private static final synthetic F:[LN/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LN/e;

    const-string v1, "CROSSED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LN/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LN/e;->C:LN/e;

    new-instance v0, LN/e;

    const-string v1, "NOT_CROSSED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LN/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LN/e;->D:LN/e;

    new-instance v0, LN/e;

    const-string v1, "COLLAPSED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LN/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LN/e;->E:LN/e;

    invoke-static {}, LN/e;->e()[LN/e;

    move-result-object v0

    sput-object v0, LN/e;->F:[LN/e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LN/e;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LN/e;

    sget-object v1, LN/e;->C:LN/e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LN/e;->D:LN/e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LN/e;->E:LN/e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LN/e;
    .locals 1

    const-class v0, LN/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LN/e;

    return-object p0
.end method

.method public static values()[LN/e;
    .locals 1

    sget-object v0, LN/e;->F:[LN/e;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LN/e;

    return-object v0
.end method
