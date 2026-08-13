.class public final enum Lh2/t;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:Lh2/t;

.field public static final enum D:Lh2/t;

.field public static final enum E:Lh2/t;

.field private static final synthetic F:[Lh2/t;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lh2/t;

    const-string v1, "REFRESH"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lh2/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh2/t;->C:Lh2/t;

    new-instance v0, Lh2/t;

    const-string v1, "PREPEND"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lh2/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh2/t;->D:Lh2/t;

    new-instance v0, Lh2/t;

    const-string v1, "APPEND"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lh2/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh2/t;->E:Lh2/t;

    invoke-static {}, Lh2/t;->e()[Lh2/t;

    move-result-object v0

    sput-object v0, Lh2/t;->F:[Lh2/t;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lh2/t;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lh2/t;

    sget-object v1, Lh2/t;->C:Lh2/t;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lh2/t;->D:Lh2/t;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lh2/t;->E:Lh2/t;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lh2/t;
    .locals 1

    const-class v0, Lh2/t;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lh2/t;

    return-object p0
.end method

.method public static values()[Lh2/t;
    .locals 1

    sget-object v0, Lh2/t;->F:[Lh2/t;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh2/t;

    return-object v0
.end method
