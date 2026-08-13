.class public final enum LT8/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum D:LT8/d;

.field public static final enum E:LT8/d;

.field public static final enum F:LT8/d;

.field public static final enum G:LT8/d;

.field public static final enum H:LT8/d;

.field public static final enum I:LT8/d;

.field public static final enum J:LT8/d;

.field private static final synthetic K:[LT8/d;

.field private static final synthetic L:Lp7/a;


# instance fields
.field private final C:Ljava/util/concurrent/TimeUnit;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LT8/d;

    const/4 v1, 0x0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v3, "NANOSECONDS"

    invoke-direct {v0, v3, v1, v2}, LT8/d;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v0, LT8/d;->D:LT8/d;

    new-instance v0, LT8/d;

    const/4 v1, 0x1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v3, "MICROSECONDS"

    invoke-direct {v0, v3, v1, v2}, LT8/d;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v0, LT8/d;->E:LT8/d;

    new-instance v0, LT8/d;

    const/4 v1, 0x2

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v3, "MILLISECONDS"

    invoke-direct {v0, v3, v1, v2}, LT8/d;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v0, LT8/d;->F:LT8/d;

    new-instance v0, LT8/d;

    const/4 v1, 0x3

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v3, "SECONDS"

    invoke-direct {v0, v3, v1, v2}, LT8/d;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v0, LT8/d;->G:LT8/d;

    new-instance v0, LT8/d;

    const/4 v1, 0x4

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-string v3, "MINUTES"

    invoke-direct {v0, v3, v1, v2}, LT8/d;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v0, LT8/d;->H:LT8/d;

    new-instance v0, LT8/d;

    const/4 v1, 0x5

    sget-object v2, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-string v3, "HOURS"

    invoke-direct {v0, v3, v1, v2}, LT8/d;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v0, LT8/d;->I:LT8/d;

    new-instance v0, LT8/d;

    const/4 v1, 0x6

    sget-object v2, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-string v3, "DAYS"

    invoke-direct {v0, v3, v1, v2}, LT8/d;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v0, LT8/d;->J:LT8/d;

    invoke-static {}, LT8/d;->e()[LT8/d;

    move-result-object v0

    sput-object v0, LT8/d;->K:[LT8/d;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, LT8/d;->L:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LT8/d;->C:Ljava/util/concurrent/TimeUnit;

    return-void
.end method

.method private static final synthetic e()[LT8/d;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [LT8/d;

    sget-object v1, LT8/d;->D:LT8/d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LT8/d;->E:LT8/d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LT8/d;->F:LT8/d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LT8/d;->G:LT8/d;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, LT8/d;->H:LT8/d;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, LT8/d;->I:LT8/d;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, LT8/d;->J:LT8/d;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LT8/d;
    .locals 1

    const-class v0, LT8/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LT8/d;

    return-object p0
.end method

.method public static values()[LT8/d;
    .locals 1

    sget-object v0, LT8/d;->K:[LT8/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LT8/d;

    return-object v0
.end method


# virtual methods
.method public final g()Ljava/util/concurrent/TimeUnit;
    .locals 1

    iget-object v0, p0, LT8/d;->C:Ljava/util/concurrent/TimeUnit;

    return-object v0
.end method
