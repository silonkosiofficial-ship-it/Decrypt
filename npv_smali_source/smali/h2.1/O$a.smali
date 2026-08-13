.class public final enum Lh2/O$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh2/O;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum C:Lh2/O$a;

.field public static final enum D:Lh2/O$a;

.field private static final synthetic E:[Lh2/O$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lh2/O$a;

    const-string v1, "LAUNCH_INITIAL_REFRESH"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lh2/O$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh2/O$a;->C:Lh2/O$a;

    new-instance v0, Lh2/O$a;

    const-string v1, "SKIP_INITIAL_REFRESH"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lh2/O$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh2/O$a;->D:Lh2/O$a;

    invoke-static {}, Lh2/O$a;->e()[Lh2/O$a;

    move-result-object v0

    sput-object v0, Lh2/O$a;->E:[Lh2/O$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lh2/O$a;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lh2/O$a;

    sget-object v1, Lh2/O$a;->C:Lh2/O$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lh2/O$a;->D:Lh2/O$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lh2/O$a;
    .locals 1

    const-class v0, Lh2/O$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lh2/O$a;

    return-object p0
.end method

.method public static values()[Lh2/O$a;
    .locals 1

    sget-object v0, Lh2/O$a;->E:[Lh2/O$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh2/O$a;

    return-object v0
.end method
