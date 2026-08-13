.class public final enum LP7/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:LP7/m;

.field public static final enum D:LP7/m;

.field public static final enum E:LP7/m;

.field private static final synthetic F:[LP7/m;

.field private static final synthetic G:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LP7/m;

    const-string v1, "RUNTIME"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LP7/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, LP7/m;->C:LP7/m;

    new-instance v0, LP7/m;

    const-string v1, "BINARY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LP7/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, LP7/m;->D:LP7/m;

    new-instance v0, LP7/m;

    const-string v1, "SOURCE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LP7/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, LP7/m;->E:LP7/m;

    invoke-static {}, LP7/m;->e()[LP7/m;

    move-result-object v0

    sput-object v0, LP7/m;->F:[LP7/m;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, LP7/m;->G:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LP7/m;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LP7/m;

    sget-object v1, LP7/m;->C:LP7/m;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LP7/m;->D:LP7/m;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LP7/m;->E:LP7/m;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LP7/m;
    .locals 1

    const-class v0, LP7/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LP7/m;

    return-object p0
.end method

.method public static values()[LP7/m;
    .locals 1

    sget-object v0, LP7/m;->F:[LP7/m;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LP7/m;

    return-object v0
.end method
