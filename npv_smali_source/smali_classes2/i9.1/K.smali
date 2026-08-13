.class public final enum Li9/K;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:Li9/K;

.field public static final enum D:Li9/K;

.field public static final enum E:Li9/K;

.field private static final synthetic F:[Li9/K;

.field private static final synthetic G:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Li9/K;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Li9/K;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li9/K;->C:Li9/K;

    new-instance v0, Li9/K;

    const-string v1, "ZERO"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Li9/K;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li9/K;->D:Li9/K;

    new-instance v0, Li9/K;

    const-string v1, "SPACE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Li9/K;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li9/K;->E:Li9/K;

    invoke-static {}, Li9/K;->e()[Li9/K;

    move-result-object v0

    sput-object v0, Li9/K;->F:[Li9/K;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Li9/K;->G:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Li9/K;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Li9/K;

    sget-object v1, Li9/K;->C:Li9/K;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Li9/K;->D:Li9/K;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Li9/K;->E:Li9/K;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Li9/K;
    .locals 1

    const-class v0, Li9/K;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li9/K;

    return-object p0
.end method

.method public static values()[Li9/K;
    .locals 1

    sget-object v0, Li9/K;->F:[Li9/K;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li9/K;

    return-object v0
.end method
