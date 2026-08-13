.class public final enum Lf8/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:Lf8/f;

.field public static final enum D:Lf8/f;

.field private static final synthetic E:[Lf8/f;

.field private static final synthetic F:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf8/f;

    const-string v1, "READ_ONLY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf8/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf8/f;->C:Lf8/f;

    new-instance v0, Lf8/f;

    const-string v1, "MUTABLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lf8/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf8/f;->D:Lf8/f;

    invoke-static {}, Lf8/f;->e()[Lf8/f;

    move-result-object v0

    sput-object v0, Lf8/f;->E:[Lf8/f;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Lf8/f;->F:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lf8/f;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lf8/f;

    sget-object v1, Lf8/f;->C:Lf8/f;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lf8/f;->D:Lf8/f;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf8/f;
    .locals 1

    const-class v0, Lf8/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf8/f;

    return-object p0
.end method

.method public static values()[Lf8/f;
    .locals 1

    sget-object v0, Lf8/f;->E:[Lf8/f;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf8/f;

    return-object v0
.end method
