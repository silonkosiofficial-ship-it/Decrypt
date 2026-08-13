.class public final enum LV/a0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:LV/a0;

.field public static final enum D:LV/a0;

.field public static final enum E:LV/a0;

.field public static final enum F:LV/a0;

.field private static final synthetic G:[LV/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LV/a0;

    const-string v1, "IGNORED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LV/a0;-><init>(Ljava/lang/String;I)V

    sput-object v0, LV/a0;->C:LV/a0;

    new-instance v0, LV/a0;

    const-string v1, "SCHEDULED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LV/a0;-><init>(Ljava/lang/String;I)V

    sput-object v0, LV/a0;->D:LV/a0;

    new-instance v0, LV/a0;

    const-string v1, "DEFERRED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LV/a0;-><init>(Ljava/lang/String;I)V

    sput-object v0, LV/a0;->E:LV/a0;

    new-instance v0, LV/a0;

    const-string v1, "IMMINENT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LV/a0;-><init>(Ljava/lang/String;I)V

    sput-object v0, LV/a0;->F:LV/a0;

    invoke-static {}, LV/a0;->e()[LV/a0;

    move-result-object v0

    sput-object v0, LV/a0;->G:[LV/a0;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LV/a0;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LV/a0;

    sget-object v1, LV/a0;->C:LV/a0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LV/a0;->D:LV/a0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LV/a0;->E:LV/a0;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LV/a0;->F:LV/a0;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LV/a0;
    .locals 1

    const-class v0, LV/a0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LV/a0;

    return-object p0
.end method

.method public static values()[LV/a0;
    .locals 1

    sget-object v0, LV/a0;->G:[LV/a0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LV/a0;

    return-object v0
.end method
