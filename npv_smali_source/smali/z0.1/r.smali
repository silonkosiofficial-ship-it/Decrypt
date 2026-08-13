.class public final enum Lz0/r;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:Lz0/r;

.field public static final enum D:Lz0/r;

.field public static final enum E:Lz0/r;

.field private static final synthetic F:[Lz0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz0/r;

    const-string v1, "Initial"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lz0/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz0/r;->C:Lz0/r;

    new-instance v0, Lz0/r;

    const-string v1, "Main"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lz0/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz0/r;->D:Lz0/r;

    new-instance v0, Lz0/r;

    const-string v1, "Final"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lz0/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz0/r;->E:Lz0/r;

    invoke-static {}, Lz0/r;->e()[Lz0/r;

    move-result-object v0

    sput-object v0, Lz0/r;->F:[Lz0/r;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lz0/r;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lz0/r;

    sget-object v1, Lz0/r;->C:Lz0/r;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lz0/r;->D:Lz0/r;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lz0/r;->E:Lz0/r;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lz0/r;
    .locals 1

    const-class v0, Lz0/r;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lz0/r;

    return-object p0
.end method

.method public static values()[Lz0/r;
    .locals 1

    sget-object v0, Lz0/r;->F:[Lz0/r;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz0/r;

    return-object v0
.end method
