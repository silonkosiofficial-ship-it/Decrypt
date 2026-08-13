.class public final enum LN/t;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:LN/t;

.field public static final enum D:LN/t;

.field public static final enum E:LN/t;

.field private static final synthetic F:[LN/t;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LN/t;

    const-string v1, "Left"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LN/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, LN/t;->C:LN/t;

    new-instance v0, LN/t;

    const-string v1, "Middle"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LN/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, LN/t;->D:LN/t;

    new-instance v0, LN/t;

    const-string v1, "Right"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LN/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, LN/t;->E:LN/t;

    invoke-static {}, LN/t;->e()[LN/t;

    move-result-object v0

    sput-object v0, LN/t;->F:[LN/t;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LN/t;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LN/t;

    sget-object v1, LN/t;->C:LN/t;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LN/t;->D:LN/t;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LN/t;->E:LN/t;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LN/t;
    .locals 1

    const-class v0, LN/t;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LN/t;

    return-object p0
.end method

.method public static values()[LN/t;
    .locals 1

    sget-object v0, LN/t;->F:[LN/t;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LN/t;

    return-object v0
.end method
