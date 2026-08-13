.class public final enum Lq8/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:Lq8/k;

.field public static final enum D:Lq8/k;

.field public static final enum E:Lq8/k;

.field private static final synthetic F:[Lq8/k;

.field private static final synthetic G:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq8/k;

    const-string v1, "ALL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lq8/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq8/k;->C:Lq8/k;

    new-instance v0, Lq8/k;

    const-string v1, "ONLY_NON_SYNTHESIZED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lq8/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq8/k;->D:Lq8/k;

    new-instance v0, Lq8/k;

    const-string v1, "NONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lq8/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq8/k;->E:Lq8/k;

    invoke-static {}, Lq8/k;->e()[Lq8/k;

    move-result-object v0

    sput-object v0, Lq8/k;->F:[Lq8/k;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Lq8/k;->G:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lq8/k;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lq8/k;

    sget-object v1, Lq8/k;->C:Lq8/k;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lq8/k;->D:Lq8/k;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lq8/k;->E:Lq8/k;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lq8/k;
    .locals 1

    const-class v0, Lq8/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq8/k;

    return-object p0
.end method

.method public static values()[Lq8/k;
    .locals 1

    sget-object v0, Lq8/k;->F:[Lq8/k;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq8/k;

    return-object v0
.end method
