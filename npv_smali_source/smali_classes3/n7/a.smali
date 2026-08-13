.class public final enum Ln7/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:Ln7/a;

.field public static final enum D:Ln7/a;

.field public static final enum E:Ln7/a;

.field private static final synthetic F:[Ln7/a;

.field private static final synthetic G:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln7/a;

    const-string v1, "COROUTINE_SUSPENDED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln7/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln7/a;->C:Ln7/a;

    new-instance v0, Ln7/a;

    const-string v1, "UNDECIDED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln7/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln7/a;->D:Ln7/a;

    new-instance v0, Ln7/a;

    const-string v1, "RESUMED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ln7/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln7/a;->E:Ln7/a;

    invoke-static {}, Ln7/a;->e()[Ln7/a;

    move-result-object v0

    sput-object v0, Ln7/a;->F:[Ln7/a;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Ln7/a;->G:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Ln7/a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ln7/a;

    sget-object v1, Ln7/a;->C:Ln7/a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ln7/a;->D:Ln7/a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ln7/a;->E:Ln7/a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln7/a;
    .locals 1

    const-class v0, Ln7/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln7/a;

    return-object p0
.end method

.method public static values()[Ln7/a;
    .locals 1

    sget-object v0, Ln7/a;->F:[Ln7/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln7/a;

    return-object v0
.end method
