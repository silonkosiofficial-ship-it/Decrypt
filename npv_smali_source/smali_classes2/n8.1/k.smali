.class final enum Ln8/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:Ln8/k;

.field public static final enum D:Ln8/k;

.field public static final enum E:Ln8/k;

.field private static final synthetic F:[Ln8/k;

.field private static final synthetic G:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln8/k;

    const-string v1, "BEGINNING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln8/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln8/k;->C:Ln8/k;

    new-instance v0, Ln8/k;

    const-string v1, "MIDDLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln8/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln8/k;->D:Ln8/k;

    new-instance v0, Ln8/k;

    const-string v1, "AFTER_DOT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ln8/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln8/k;->E:Ln8/k;

    invoke-static {}, Ln8/k;->e()[Ln8/k;

    move-result-object v0

    sput-object v0, Ln8/k;->F:[Ln8/k;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Ln8/k;->G:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Ln8/k;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ln8/k;

    sget-object v1, Ln8/k;->C:Ln8/k;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ln8/k;->D:Ln8/k;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ln8/k;->E:Ln8/k;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln8/k;
    .locals 1

    const-class v0, Ln8/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln8/k;

    return-object p0
.end method

.method public static values()[Ln8/k;
    .locals 1

    sget-object v0, Ln8/k;->F:[Ln8/k;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln8/k;

    return-object v0
.end method
