.class public final enum LD0/p;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:LD0/p;

.field public static final enum D:LD0/p;

.field private static final synthetic E:[LD0/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LD0/p;

    const-string v1, "Min"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LD0/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, LD0/p;->C:LD0/p;

    new-instance v0, LD0/p;

    const-string v1, "Max"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LD0/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, LD0/p;->D:LD0/p;

    invoke-static {}, LD0/p;->e()[LD0/p;

    move-result-object v0

    sput-object v0, LD0/p;->E:[LD0/p;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LD0/p;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LD0/p;

    sget-object v1, LD0/p;->C:LD0/p;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LD0/p;->D:LD0/p;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LD0/p;
    .locals 1

    const-class v0, LD0/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LD0/p;

    return-object p0
.end method

.method public static values()[LD0/p;
    .locals 1

    sget-object v0, LD0/p;->E:[LD0/p;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LD0/p;

    return-object v0
.end method
