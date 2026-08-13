.class public final enum LX7/G;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX7/G$a;
    }
.end annotation


# static fields
.field public static final D:LX7/G$a;

.field public static final enum E:LX7/G;

.field public static final enum F:LX7/G;

.field public static final enum G:LX7/G;

.field private static final synthetic H:[LX7/G;

.field private static final synthetic I:Lp7/a;


# instance fields
.field private final C:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LX7/G;

    const/4 v1, 0x0

    const-string v2, "ignore"

    const-string v3, "IGNORE"

    invoke-direct {v0, v3, v1, v2}, LX7/G;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LX7/G;->E:LX7/G;

    new-instance v0, LX7/G;

    const/4 v1, 0x1

    const-string v2, "warn"

    const-string v3, "WARN"

    invoke-direct {v0, v3, v1, v2}, LX7/G;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LX7/G;->F:LX7/G;

    new-instance v0, LX7/G;

    const/4 v1, 0x2

    const-string v2, "strict"

    const-string v3, "STRICT"

    invoke-direct {v0, v3, v1, v2}, LX7/G;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LX7/G;->G:LX7/G;

    invoke-static {}, LX7/G;->e()[LX7/G;

    move-result-object v0

    sput-object v0, LX7/G;->H:[LX7/G;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, LX7/G;->I:Lp7/a;

    new-instance v0, LX7/G$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX7/G$a;-><init>(Ly7/k;)V

    sput-object v0, LX7/G;->D:LX7/G$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LX7/G;->C:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic e()[LX7/G;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LX7/G;

    sget-object v1, LX7/G;->E:LX7/G;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LX7/G;->F:LX7/G;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LX7/G;->G:LX7/G;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LX7/G;
    .locals 1

    const-class v0, LX7/G;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LX7/G;

    return-object p0
.end method

.method public static values()[LX7/G;
    .locals 1

    sget-object v0, LX7/G;->H:[LX7/G;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LX7/G;

    return-object v0
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LX7/G;->C:Ljava/lang/String;

    return-object v0
.end method

.method public final i()Z
    .locals 1

    .prologue
    sget-object v0, LX7/G;->E:LX7/G;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final m()Z
    .locals 1

    .prologue
    sget-object v0, LX7/G;->F:LX7/G;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
