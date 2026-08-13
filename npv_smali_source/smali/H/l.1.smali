.class public final enum LH/l;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:LH/l;

.field public static final enum D:LH/l;

.field public static final enum E:LH/l;

.field private static final synthetic F:[LH/l;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LH/l;

    const-string v1, "None"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LH/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, LH/l;->C:LH/l;

    new-instance v0, LH/l;

    const-string v1, "Selection"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LH/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, LH/l;->D:LH/l;

    new-instance v0, LH/l;

    const-string v1, "Cursor"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LH/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, LH/l;->E:LH/l;

    invoke-static {}, LH/l;->e()[LH/l;

    move-result-object v0

    sput-object v0, LH/l;->F:[LH/l;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LH/l;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LH/l;

    sget-object v1, LH/l;->C:LH/l;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LH/l;->D:LH/l;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LH/l;->E:LH/l;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LH/l;
    .locals 1

    const-class v0, LH/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LH/l;

    return-object p0
.end method

.method public static values()[LH/l;
    .locals 1

    sget-object v0, LH/l;->F:[LH/l;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LH/l;

    return-object v0
.end method
