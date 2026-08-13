.class final enum LS/l0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:LS/l0;

.field public static final enum D:LS/l0;

.field private static final synthetic E:[LS/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LS/l0;

    const-string v1, "Selector"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LS/l0;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS/l0;->C:LS/l0;

    new-instance v0, LS/l0;

    const-string v1, "InnerCircle"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LS/l0;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS/l0;->D:LS/l0;

    invoke-static {}, LS/l0;->e()[LS/l0;

    move-result-object v0

    sput-object v0, LS/l0;->E:[LS/l0;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LS/l0;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LS/l0;

    sget-object v1, LS/l0;->C:LS/l0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LS/l0;->D:LS/l0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LS/l0;
    .locals 1

    const-class v0, LS/l0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LS/l0;

    return-object p0
.end method

.method public static values()[LS/l0;
    .locals 1

    sget-object v0, LS/l0;->E:[LS/l0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LS/l0;

    return-object v0
.end method
