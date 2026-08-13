.class public final enum LS/W0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:LS/W0;

.field public static final enum D:LS/W0;

.field public static final enum E:LS/W0;

.field private static final synthetic F:[LS/W0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LS/W0;

    const-string v1, "Short"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LS/W0;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS/W0;->C:LS/W0;

    new-instance v0, LS/W0;

    const-string v1, "Long"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LS/W0;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS/W0;->D:LS/W0;

    new-instance v0, LS/W0;

    const-string v1, "Indefinite"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LS/W0;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS/W0;->E:LS/W0;

    invoke-static {}, LS/W0;->e()[LS/W0;

    move-result-object v0

    sput-object v0, LS/W0;->F:[LS/W0;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LS/W0;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LS/W0;

    sget-object v1, LS/W0;->C:LS/W0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LS/W0;->D:LS/W0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LS/W0;->E:LS/W0;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LS/W0;
    .locals 1

    const-class v0, LS/W0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LS/W0;

    return-object p0
.end method

.method public static values()[LS/W0;
    .locals 1

    sget-object v0, LS/W0;->F:[LS/W0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LS/W0;

    return-object v0
.end method
