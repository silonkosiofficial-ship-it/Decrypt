.class public final enum Lf5/l;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final enum C:Lf5/l;

.field private static final D:Landroid/os/Handler;

.field private static final synthetic E:[Lf5/l;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf5/l;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf5/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf5/l;->C:Lf5/l;

    invoke-static {}, Lf5/l;->e()[Lf5/l;

    move-result-object v0

    sput-object v0, Lf5/l;->E:[Lf5/l;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lf5/l;->D:Landroid/os/Handler;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic e()[Lf5/l;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lf5/l;

    sget-object v1, Lf5/l;->C:Lf5/l;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf5/l;
    .locals 1

    const-class v0, Lf5/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf5/l;

    return-object p0
.end method

.method public static values()[Lf5/l;
    .locals 1

    sget-object v0, Lf5/l;->E:[Lf5/l;

    invoke-virtual {v0}, [Lf5/l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf5/l;

    return-object v0
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lf5/l;->D:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
