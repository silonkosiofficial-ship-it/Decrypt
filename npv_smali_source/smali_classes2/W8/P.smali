.class public final enum LW8/P;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW8/P$a;
    }
.end annotation


# static fields
.field public static final enum C:LW8/P;

.field public static final enum D:LW8/P;

.field public static final enum E:LW8/P;

.field public static final enum F:LW8/P;

.field private static final synthetic G:[LW8/P;

.field private static final synthetic H:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LW8/P;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LW8/P;-><init>(Ljava/lang/String;I)V

    sput-object v0, LW8/P;->C:LW8/P;

    new-instance v0, LW8/P;

    const-string v1, "LAZY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LW8/P;-><init>(Ljava/lang/String;I)V

    sput-object v0, LW8/P;->D:LW8/P;

    new-instance v0, LW8/P;

    const-string v1, "ATOMIC"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LW8/P;-><init>(Ljava/lang/String;I)V

    sput-object v0, LW8/P;->E:LW8/P;

    new-instance v0, LW8/P;

    const-string v1, "UNDISPATCHED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LW8/P;-><init>(Ljava/lang/String;I)V

    sput-object v0, LW8/P;->F:LW8/P;

    invoke-static {}, LW8/P;->e()[LW8/P;

    move-result-object v0

    sput-object v0, LW8/P;->G:[LW8/P;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, LW8/P;->H:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LW8/P;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LW8/P;

    sget-object v1, LW8/P;->C:LW8/P;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LW8/P;->D:LW8/P;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LW8/P;->E:LW8/P;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LW8/P;->F:LW8/P;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LW8/P;
    .locals 1

    const-class v0, LW8/P;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LW8/P;

    return-object p0
.end method

.method public static values()[LW8/P;
    .locals 1

    sget-object v0, LW8/P;->G:[LW8/P;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LW8/P;

    return-object v0
.end method


# virtual methods
.method public final g(Lx7/p;Ljava/lang/Object;Lm7/e;)V
    .locals 2

    .prologue
    sget-object v0, LW8/P$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 p1, 0x4

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_1
    invoke-static {p1, p2, p3}, Lc9/b;->a(Lx7/p;Ljava/lang/Object;Lm7/e;)V

    goto :goto_0

    :cond_2
    invoke-static {p1, p2, p3}, Lm7/g;->b(Lx7/p;Ljava/lang/Object;Lm7/e;)V

    goto :goto_0

    :cond_3
    invoke-static {p1, p2, p3}, Lc9/a;->d(Lx7/p;Ljava/lang/Object;Lm7/e;)V

    :goto_0
    return-void
.end method

.method public final i()Z
    .locals 1

    .prologue
    sget-object v0, LW8/P;->D:LW8/P;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
