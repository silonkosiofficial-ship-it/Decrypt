.class final enum Lz0/L$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz0/L;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field public static final enum C:Lz0/L$a;

.field public static final enum D:Lz0/L$a;

.field public static final enum E:Lz0/L$a;

.field private static final synthetic F:[Lz0/L$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz0/L$a;

    const-string v1, "Unknown"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lz0/L$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz0/L$a;->C:Lz0/L$a;

    new-instance v0, Lz0/L$a;

    const-string v1, "Dispatching"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lz0/L$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz0/L$a;->D:Lz0/L$a;

    new-instance v0, Lz0/L$a;

    const-string v1, "NotDispatching"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lz0/L$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz0/L$a;->E:Lz0/L$a;

    invoke-static {}, Lz0/L$a;->e()[Lz0/L$a;

    move-result-object v0

    sput-object v0, Lz0/L$a;->F:[Lz0/L$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lz0/L$a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lz0/L$a;

    sget-object v1, Lz0/L$a;->C:Lz0/L$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lz0/L$a;->D:Lz0/L$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lz0/L$a;->E:Lz0/L$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lz0/L$a;
    .locals 1

    const-class v0, Lz0/L$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lz0/L$a;

    return-object p0
.end method

.method public static values()[Lz0/L$a;
    .locals 1

    sget-object v0, Lz0/L$a;->F:[Lz0/L$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz0/L$a;

    return-object v0
.end method
