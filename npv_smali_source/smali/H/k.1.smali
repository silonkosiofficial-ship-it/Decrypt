.class public final enum LH/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:LH/k;

.field public static final enum D:LH/k;

.field public static final enum E:LH/k;

.field private static final synthetic F:[LH/k;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LH/k;

    const-string v1, "Cursor"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LH/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, LH/k;->C:LH/k;

    new-instance v0, LH/k;

    const-string v1, "SelectionStart"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LH/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, LH/k;->D:LH/k;

    new-instance v0, LH/k;

    const-string v1, "SelectionEnd"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LH/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, LH/k;->E:LH/k;

    invoke-static {}, LH/k;->e()[LH/k;

    move-result-object v0

    sput-object v0, LH/k;->F:[LH/k;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LH/k;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LH/k;

    sget-object v1, LH/k;->C:LH/k;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LH/k;->D:LH/k;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LH/k;->E:LH/k;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LH/k;
    .locals 1

    const-class v0, LH/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LH/k;

    return-object p0
.end method

.method public static values()[LH/k;
    .locals 1

    sget-object v0, LH/k;->F:[LH/k;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LH/k;

    return-object v0
.end method
