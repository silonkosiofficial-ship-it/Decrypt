.class public final enum LI7/n$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI7/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401c
    name = "c"
.end annotation


# static fields
.field public static final enum C:LI7/n$c;

.field public static final enum D:LI7/n$c;

.field private static final synthetic E:[LI7/n$c;

.field private static final synthetic F:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LI7/n$c;

    const-string v1, "DECLARED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LI7/n$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LI7/n$c;->C:LI7/n$c;

    new-instance v0, LI7/n$c;

    const-string v1, "INHERITED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LI7/n$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LI7/n$c;->D:LI7/n$c;

    invoke-static {}, LI7/n$c;->e()[LI7/n$c;

    move-result-object v0

    sput-object v0, LI7/n$c;->E:[LI7/n$c;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, LI7/n$c;->F:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LI7/n$c;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LI7/n$c;

    sget-object v1, LI7/n$c;->C:LI7/n$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LI7/n$c;->D:LI7/n$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LI7/n$c;
    .locals 1

    const-class v0, LI7/n$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LI7/n$c;

    return-object p0
.end method

.method public static values()[LI7/n$c;
    .locals 1

    sget-object v0, LI7/n$c;->E:[LI7/n$c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LI7/n$c;

    return-object v0
.end method


# virtual methods
.method public final g(LO7/b;)Z
    .locals 3

    .prologue
    const-string v0, "member"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/b;->j()LO7/b$a;

    move-result-object p1

    invoke-virtual {p1}, LO7/b$a;->e()Z

    move-result p1

    sget-object v0, LI7/n$c;->C:LI7/n$c;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p0, v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-ne p1, v0, :cond_1

    move v1, v2

    :cond_1
    return v1
.end method
