.class public final enum LD8/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:LD8/e;

.field public static final enum D:LD8/e;

.field public static final enum E:LD8/e;

.field private static final synthetic F:[LD8/e;

.field private static final synthetic G:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LD8/e;

    const-string v1, "STABLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LD8/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LD8/e;->C:LD8/e;

    new-instance v0, LD8/e;

    const-string v1, "FIR_UNSTABLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LD8/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LD8/e;->D:LD8/e;

    new-instance v0, LD8/e;

    const-string v1, "IR_UNSTABLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LD8/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LD8/e;->E:LD8/e;

    invoke-static {}, LD8/e;->e()[LD8/e;

    move-result-object v0

    sput-object v0, LD8/e;->F:[LD8/e;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, LD8/e;->G:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LD8/e;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LD8/e;

    sget-object v1, LD8/e;->C:LD8/e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LD8/e;->D:LD8/e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LD8/e;->E:LD8/e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LD8/e;
    .locals 1

    const-class v0, LD8/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LD8/e;

    return-object p0
.end method

.method public static values()[LD8/e;
    .locals 1

    sget-object v0, LD8/e;->F:[LD8/e;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LD8/e;

    return-object v0
.end method
