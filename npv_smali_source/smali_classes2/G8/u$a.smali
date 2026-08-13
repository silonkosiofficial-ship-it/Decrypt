.class abstract enum LG8/u$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG8/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG8/u$a$a;,
        LG8/u$a$b;,
        LG8/u$a$c;,
        LG8/u$a$d;
    }
.end annotation


# static fields
.field public static final enum C:LG8/u$a;

.field public static final enum D:LG8/u$a;

.field public static final enum E:LG8/u$a;

.field public static final enum F:LG8/u$a;

.field private static final synthetic G:[LG8/u$a;

.field private static final synthetic H:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LG8/u$a$c;

    const-string v1, "START"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LG8/u$a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LG8/u$a;->C:LG8/u$a;

    new-instance v0, LG8/u$a$a;

    const-string v1, "ACCEPT_NULL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LG8/u$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LG8/u$a;->D:LG8/u$a;

    new-instance v0, LG8/u$a$d;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LG8/u$a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LG8/u$a;->E:LG8/u$a;

    new-instance v0, LG8/u$a$b;

    const-string v1, "NOT_NULL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LG8/u$a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LG8/u$a;->F:LG8/u$a;

    invoke-static {}, LG8/u$a;->e()[LG8/u$a;

    move-result-object v0

    sput-object v0, LG8/u$a;->G:[LG8/u$a;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, LG8/u$a;->H:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LG8/u$a;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LG8/u$a;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LG8/u$a;

    sget-object v1, LG8/u$a;->C:LG8/u$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LG8/u$a;->D:LG8/u$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LG8/u$a;->E:LG8/u$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LG8/u$a;->F:LG8/u$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LG8/u$a;
    .locals 1

    const-class v0, LG8/u$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LG8/u$a;

    return-object p0
.end method

.method public static values()[LG8/u$a;
    .locals 1

    sget-object v0, LG8/u$a;->G:[LG8/u$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LG8/u$a;

    return-object v0
.end method


# virtual methods
.method public abstract g(LF8/t0;)LG8/u$a;
.end method

.method protected final i(LF8/t0;)LG8/u$a;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LF8/E;->X0()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LG8/u$a;->D:LG8/u$a;

    goto :goto_0

    :cond_0
    instance-of v0, p1, LF8/o;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, LF8/o;

    invoke-virtual {v0}, LF8/o;->i1()LF8/M;

    :cond_1
    sget-object v0, LG8/n;->a:LG8/n;

    invoke-virtual {v0, p1}, LG8/n;->a(LF8/t0;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, LG8/u$a;->F:LG8/u$a;

    goto :goto_0

    :cond_2
    sget-object p1, LG8/u$a;->E:LG8/u$a;

    :goto_0
    return-object p1
.end method
