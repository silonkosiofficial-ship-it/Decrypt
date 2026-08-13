.class public final enum Lq8/l;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:Lq8/l;

.field public static final enum D:Lq8/l;

.field public static final enum E:Lq8/l;

.field private static final synthetic F:[Lq8/l;

.field private static final synthetic G:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq8/l;

    const-string v1, "PRETTY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lq8/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq8/l;->C:Lq8/l;

    new-instance v0, Lq8/l;

    const-string v1, "DEBUG"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lq8/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq8/l;->D:Lq8/l;

    new-instance v0, Lq8/l;

    const-string v1, "NONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lq8/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq8/l;->E:Lq8/l;

    invoke-static {}, Lq8/l;->e()[Lq8/l;

    move-result-object v0

    sput-object v0, Lq8/l;->F:[Lq8/l;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Lq8/l;->G:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lq8/l;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lq8/l;

    sget-object v1, Lq8/l;->C:Lq8/l;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lq8/l;->D:Lq8/l;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lq8/l;->E:Lq8/l;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lq8/l;
    .locals 1

    const-class v0, Lq8/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq8/l;

    return-object p0
.end method

.method public static values()[Lq8/l;
    .locals 1

    sget-object v0, Lq8/l;->F:[Lq8/l;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq8/l;

    return-object v0
.end method
