.class public final enum Lc8/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:Lc8/c;

.field public static final enum D:Lc8/c;

.field public static final enum E:Lc8/c;

.field private static final synthetic F:[Lc8/c;

.field private static final synthetic G:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lc8/c;

    const-string v1, "INFLEXIBLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc8/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc8/c;->C:Lc8/c;

    new-instance v0, Lc8/c;

    const-string v1, "FLEXIBLE_UPPER_BOUND"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lc8/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc8/c;->D:Lc8/c;

    new-instance v0, Lc8/c;

    const-string v1, "FLEXIBLE_LOWER_BOUND"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lc8/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc8/c;->E:Lc8/c;

    invoke-static {}, Lc8/c;->e()[Lc8/c;

    move-result-object v0

    sput-object v0, Lc8/c;->F:[Lc8/c;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Lc8/c;->G:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lc8/c;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lc8/c;

    sget-object v1, Lc8/c;->C:Lc8/c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lc8/c;->D:Lc8/c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lc8/c;->E:Lc8/c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lc8/c;
    .locals 1

    const-class v0, Lc8/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc8/c;

    return-object p0
.end method

.method public static values()[Lc8/c;
    .locals 1

    sget-object v0, Lc8/c;->F:[Lc8/c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc8/c;

    return-object v0
.end method
