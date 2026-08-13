.class public abstract enum Lq8/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq8/m$a;,
        Lq8/m$b;
    }
.end annotation


# static fields
.field public static final enum C:Lq8/m;

.field public static final enum D:Lq8/m;

.field private static final synthetic E:[Lq8/m;

.field private static final synthetic F:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq8/m$b;

    const-string v1, "PLAIN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lq8/m$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq8/m;->C:Lq8/m;

    new-instance v0, Lq8/m$a;

    const-string v1, "HTML"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lq8/m$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq8/m;->D:Lq8/m;

    invoke-static {}, Lq8/m;->e()[Lq8/m;

    move-result-object v0

    sput-object v0, Lq8/m;->E:[Lq8/m;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Lq8/m;->F:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lq8/m;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lq8/m;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lq8/m;

    sget-object v1, Lq8/m;->C:Lq8/m;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lq8/m;->D:Lq8/m;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lq8/m;
    .locals 1

    const-class v0, Lq8/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq8/m;

    return-object p0
.end method

.method public static values()[Lq8/m;
    .locals 1

    sget-object v0, Lq8/m;->E:[Lq8/m;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq8/m;

    return-object v0
.end method


# virtual methods
.method public abstract g(Ljava/lang/String;)Ljava/lang/String;
.end method
