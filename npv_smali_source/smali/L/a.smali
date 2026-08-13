.class public final enum LL/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:LL/a;

.field public static final enum D:LL/a;

.field public static final enum E:LL/a;

.field private static final synthetic F:[LL/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LL/a;

    const-string v1, "MergeIfPossible"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LL/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LL/a;->C:LL/a;

    new-instance v0, LL/a;

    const-string v1, "ClearHistory"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LL/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LL/a;->D:LL/a;

    new-instance v0, LL/a;

    const-string v1, "NeverMerge"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LL/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LL/a;->E:LL/a;

    invoke-static {}, LL/a;->e()[LL/a;

    move-result-object v0

    sput-object v0, LL/a;->F:[LL/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LL/a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LL/a;

    sget-object v1, LL/a;->C:LL/a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LL/a;->D:LL/a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LL/a;->E:LL/a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LL/a;
    .locals 1

    const-class v0, LL/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LL/a;

    return-object p0
.end method

.method public static values()[LL/a;
    .locals 1

    sget-object v0, LL/a;->F:[LL/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LL/a;

    return-object v0
.end method
