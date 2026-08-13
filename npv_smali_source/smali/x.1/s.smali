.class public final enum Lx/s;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:Lx/s;

.field public static final enum D:Lx/s;

.field private static final synthetic E:[Lx/s;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lx/s;

    const-string v1, "Vertical"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lx/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx/s;->C:Lx/s;

    new-instance v0, Lx/s;

    const-string v1, "Horizontal"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lx/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx/s;->D:Lx/s;

    invoke-static {}, Lx/s;->e()[Lx/s;

    move-result-object v0

    sput-object v0, Lx/s;->E:[Lx/s;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lx/s;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lx/s;

    sget-object v1, Lx/s;->C:Lx/s;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lx/s;->D:Lx/s;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lx/s;
    .locals 1

    const-class v0, Lx/s;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lx/s;

    return-object p0
.end method

.method public static values()[Lx/s;
    .locals 1

    sget-object v0, Lx/s;->E:[Lx/s;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx/s;

    return-object v0
.end method
