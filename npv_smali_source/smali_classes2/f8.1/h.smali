.class public final enum Lf8/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:Lf8/h;

.field public static final enum D:Lf8/h;

.field public static final enum E:Lf8/h;

.field private static final synthetic F:[Lf8/h;

.field private static final synthetic G:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf8/h;

    const-string v1, "FORCE_FLEXIBILITY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf8/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf8/h;->C:Lf8/h;

    new-instance v0, Lf8/h;

    const-string v1, "NULLABLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lf8/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf8/h;->D:Lf8/h;

    new-instance v0, Lf8/h;

    const-string v1, "NOT_NULL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lf8/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf8/h;->E:Lf8/h;

    invoke-static {}, Lf8/h;->e()[Lf8/h;

    move-result-object v0

    sput-object v0, Lf8/h;->F:[Lf8/h;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Lf8/h;->G:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lf8/h;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lf8/h;

    sget-object v1, Lf8/h;->C:Lf8/h;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lf8/h;->D:Lf8/h;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lf8/h;->E:Lf8/h;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf8/h;
    .locals 1

    const-class v0, Lf8/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf8/h;

    return-object p0
.end method

.method public static values()[Lf8/h;
    .locals 1

    sget-object v0, Lf8/h;->F:[Lf8/h;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf8/h;

    return-object v0
.end method
